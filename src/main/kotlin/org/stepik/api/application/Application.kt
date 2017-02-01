package org.stepik.api.application

import org.apache.http.conn.ssl.SSLConnectionSocketFactory
import org.apache.http.impl.client.HttpClients
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.web.client.RestTemplate
import org.stepik.api.client.StepikCoursesList
import java.security.cert.X509Certificate




/**
 * @author alavrenko
 * Created: 01/02/2017
 */
open class Application {

    companion object {

        @Throws(Exception::class)
        @JvmStatic fun main(args: Array<String>) {
            println("starting application...")
            // TODO this part only for experiments
            val acceptingTrustStrategy = { chain: Array<X509Certificate>, authType: String -> true }

            val sslContext = org.apache.http.ssl.SSLContexts.custom()
                    .loadTrustMaterial(null, acceptingTrustStrategy)
                    .build()

            val csf = SSLConnectionSocketFactory(sslContext)

            val httpClient = HttpClients.custom()
                    .setSSLSocketFactory(csf)
                    .build()

            val requestFactory = HttpComponentsClientHttpRequestFactory()

            requestFactory.httpClient = httpClient
            // TODO this part only for experiments

            val restTemplate = RestTemplate(requestFactory)
            val courses = restTemplate.getForEntity("https://stepik.org/api/courses", StepikCoursesList::class.java)
            println(courses)
        }
    }
}
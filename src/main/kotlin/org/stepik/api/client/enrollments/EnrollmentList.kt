package org.stepik.api.client.enrollments

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * @author alavrenko
 * Created: 01/02/2017
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class EnrollmentList(var enrollments: List<Enrollment>)
package org.stepik.api.client

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * @author alavrenko
 * Created: 01/02/2017
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class StepikCourse(var id: Long, var title: String)
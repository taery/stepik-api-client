package org.stepik.api.client.sections

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * @author alavrenko
 * Created: 01/02/2017
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class Section(var id: Long)
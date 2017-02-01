package org.stepik.api.client.attempts

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * @author alavrenko
 * Created: 01/02/2017
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class AttemptList(var attempts: List<Attempt>)
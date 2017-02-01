package org.stepik.api.client.submissions

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * @author alavrenko
 * Created: 01/02/2017
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class SubmissionList(var submissions: List<Submission>)
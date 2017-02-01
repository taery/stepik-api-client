package org.stepik.api.client.lessons

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * @author alavrenko
 * Created: 01/02/2017
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class LessonList(var lessons: List<Lesson>)
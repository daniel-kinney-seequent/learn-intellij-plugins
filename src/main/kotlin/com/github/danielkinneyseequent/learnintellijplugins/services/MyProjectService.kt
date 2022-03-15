package com.github.danielkinneyseequent.learnintellijplugins.services

import com.intellij.openapi.project.Project
import com.github.danielkinneyseequent.learnintellijplugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

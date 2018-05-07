package com.carlos.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class BlogPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        def showDevicesTask = project.tasks.create("showDevices") << {
            def adbExe = project.android.getAdbExe().toString()
            println "${adbExe} devices".execute().text
        }
        showDevicesTask.group = "blogplugin"
        showDevicesTask.description = "Runs adb devices command"
    }
}
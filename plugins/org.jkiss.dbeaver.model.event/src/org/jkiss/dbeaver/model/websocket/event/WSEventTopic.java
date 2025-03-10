/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2023 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.model.websocket.event;

//TODO: implement event registry and describe possible events in plugin.xml
public enum WSEventTopic {
    SERVER_CONFIG("cb_config"),
    WORKSPACE_CONFIG("cb_workspace_configuration"),
    SESSION_LOG("cb_session_log"),
    DB_OUTPUT_LOG("cb_database_output_log"),
    SESSION("cb_session"),
    DATASOURCE("cb_datasource"),
    DATASOURCE_FOLDER("cb_datasource_folder"),
    USER_SECRET("cb_user_secret"),
    RM_SCRIPTS("cb_scripts"),
    PROJECTS("cb_projects"),
    OBJECT_PERMISSIONS("cb_object_permissions"),
    SUBJECT_PERMISSIONS("cb_subject_permissions");

    private final String topicId;

    WSEventTopic(String topicId) {
        this.topicId = topicId;
    }

    public String getTopicId() {
        return topicId;
    }
}

/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.workbench.ht.client.editors.taskslist;

import java.util.Arrays;
import java.util.List;
import javax.enterprise.context.Dependent;

import org.jboss.errai.ui.shared.api.annotations.Templated;
import static org.jbpm.workbench.ht.model.TaskDataSetConstants.*;

@Dependent
@Templated(value = "/org/jbpm/workbench/common/client/list/AbstractMultiGridView.html", stylesheet = "/org/jbpm/workbench/common/client/resources/css/kie-manage.less")
public class TaskListViewImpl extends AbstractTaskListView<TaskListPresenter> {

    @Override
    public List<String> getInitColumns() {
        return Arrays.asList(COLUMN_NAME,
                             COLUMN_PROCESS_ID,
                             COLUMN_STATUS,
                             COLUMN_CREATED_ON,
                             COL_ID_ACTIONS);
    }
}
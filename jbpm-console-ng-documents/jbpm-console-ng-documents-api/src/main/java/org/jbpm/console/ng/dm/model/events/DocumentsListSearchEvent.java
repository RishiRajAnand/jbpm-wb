/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
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

package org.jbpm.console.ng.dm.model.events;

import org.jboss.errai.common.client.api.annotations.Portable;
import org.jbpm.console.ng.dm.model.CMSContentSummary;

@Portable
public class DocumentsListSearchEvent {

    private CMSContentSummary summary;

    public DocumentsListSearchEvent() {
    }

    public DocumentsListSearchEvent(CMSContentSummary summary) {
        this.summary = summary;
    }

    public CMSContentSummary getSummary() {
        return summary;
    }

    public void setSummary(CMSContentSummary summary) {
        this.summary = summary;
    }
}

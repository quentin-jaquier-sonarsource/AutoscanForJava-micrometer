/**
 * Copyright 2017 VMware, Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micrometer.jersey2.server;

import org.glassfish.jersey.server.monitoring.RequestEvent;

import io.micrometer.core.instrument.Tag;

/**
 * Provides {@link Tag Tags} for Jersey request metrics.
 * 
 * @author Michael Weirauch
 * @deprecated use {@link io.micrometer.core.instrument.binder.jersey.server.JerseyTagsProvider} in micrometer-core instead.
 */
@Deprecated
public interface JerseyTagsProvider {

    /**
     * Provides tags to be associated with metrics for the given {@code event}.
     *
     * @param event
     *            the request event
     * @return tags to associate with metrics recorded for the request
     */
    Iterable<Tag> httpRequestTags(RequestEvent event);

    /**
     * Provides tags to be associated with the
     * {@link io.micrometer.core.instrument.LongTaskTimer} which instruments the
     * given long-running {@code event}.
     *
     * @param event
     *            the request event
     * @return tags to associate with metrics recorded for the request
     */
    Iterable<Tag> httpLongRequestTags(RequestEvent event);

}

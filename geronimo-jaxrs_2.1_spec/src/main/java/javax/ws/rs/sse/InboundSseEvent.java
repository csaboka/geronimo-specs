/*
 * #%L
 * Apache Geronimo JAX-RS Spec 2.0
 * %%
 * Copyright (C) 2003 - 2014 The Apache Software Foundation
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package javax.ws.rs.sse;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

public interface InboundSseEvent extends SseEvent {

    boolean isEmpty();

    String readData();

    <T> T readData(Class<T> type);

    <T> T readData(GenericType<T> type);

    <T> T readData(Class<T> messageType, MediaType mediaType);

    <T> T readData(GenericType<T> type, MediaType mediaType);

}

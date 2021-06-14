/*
 * Copyright 2006-2021 Prowide
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
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;

/**
 * Interface to plug in code that serializes MX message objects to XML string
 *
 * @since 7.6
 */
public interface MxWrite {

    /**
     * @deprecated use {@link #message(String, AbstractMX, Class[], String, boolean, EscapeHandler)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2022)
    String message(String namespace, AbstractMX obj, Class[] classes, final String prefix, boolean includeXMLDeclaration);

    /**
     * Converts obj into a xml string
     *
     * @param namespace             the namespace for the target message
     * @param obj                   the object containing the message to be serialized
     * @param classes               array of all classes used or referenced by message class
     * @param prefix                optional prefix for ns ("Doc" by default)
     * @param includeXMLDeclaration true to include the xml declaration (true by default)
     * @param escapeHandler specific escape handler to use when serializing the elements content or null to use the default
     * @return the message content serialized to XML
     * @since 9.1.7
     */
    default String message(String namespace, AbstractMX obj, Class[] classes, final String prefix, boolean includeXMLDeclaration, EscapeHandler escapeHandler) {
        return message(namespace, obj, classes, prefix, includeXMLDeclaration, null);
    }

}

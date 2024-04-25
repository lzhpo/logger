/*
 * Copyright lzhpo
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
package com.lzhpo.logger;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.intellij.lang.annotations.Language;

/**
 * @author lzhpo
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class LoggerConstant {

    public static final String SpEL = "SpEL";

    @Language(LoggerConstant.SpEL)
    public static final String EMPTY = "";

    @Language(LoggerConstant.SpEL)
    public static final String BOOLEAN_TRUE = "true";

    @Language(LoggerConstant.SpEL)
    public static final String BOOLEAN_FALSE = "false";

    public static final String VARIABLE_RESULT = "result";

    public static final String VARIABLE_ARG_A = "a";

    public static final String VARIABLE_ARG_P = "p";

    public static final String FUNCTION_DIFF = "DIFF";

    public static final String DIFF_MESSAGE_DELIMITER = ", ";

    // spotless:off
    public static final String DIFF_MESSAGE_TEMPLATE = "[{filedName}] has been updated from [{oldValue}] to [{newValue}]";
    // spotless:on
}

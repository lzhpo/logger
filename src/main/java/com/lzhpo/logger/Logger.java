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

import java.lang.annotation.*;

/**
 * @author lzhpo
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Logger {

    /**
     * The logger condition.
     *
     * @return condition
     */
    String condition() default LoggerConstant.BOOLEAN_TRUE;

    /**
     * The logger message, support SpringEL expression and function.
     *
     * @return message
     */
    String message();

    /**
     * The operator id.
     *
     * @return operatorId
     */
    String operatorId() default LoggerConstant.EMPTY;

    /**
     * The business id.
     *
     * @return bizId
     */
    String bizId() default LoggerConstant.EMPTY;

    /**
     * The logger category.
     *
     * @return category
     */
    String category() default LoggerConstant.EMPTY;

    /**
     * The logger tag.
     *
     * @return tag
     */
    String tag() default LoggerConstant.EMPTY;

    /**
     * The logger additional information.
     *
     * @return additional
     */
    String additional() default LoggerConstant.EMPTY;
}
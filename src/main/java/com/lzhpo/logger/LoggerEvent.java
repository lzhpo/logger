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

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

import java.util.Date;
import java.util.List;

/**
 * @author lzhpo
 */
@Setter
@Getter
@ToString
public class LoggerEvent extends ApplicationEvent {

    /**
     * The log id.
     */
    private String logId;

    /**
     * The log message.
     */
    private String message;

    /**
     * The operator id.
     */
    private String operatorId;

    /**
     * The log business id.
     */
    private String bizId;

    /**
     * The log category.
     */
    private String category;

    /**
     * The log tag.
     */
    private String tag;

    /**
     * The log additional information.
     */
    private String additional;

    /**
     * The log create time.
     */
    private Date createTime;

    /**
     * Create this log take time (unit: milliseconds).
     */
    private Long takeTime;

    /**
     * The business execute result.
     */
    private Object result;

    /**
     * Whether success for evaluate all condition expression.
     */
    private Boolean success;

    /**
     * The errors when evaluate condition expression.
     */
    private List<String> errors;

    public LoggerEvent(Object source) {
        super(source);
    }
}
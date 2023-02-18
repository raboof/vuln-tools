/*
 *  Copyright 2022-2023 Jeremy Long
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.github.jeremylong.vulnz.cli.commands;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;

public abstract class AbstractJsonCommand extends TimedCommand {
    /**
     * Reference to the logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(AbstractJsonCommand.class);

    @CommandLine.Option(names = {"--prettyPrint"}, description = "Pretty print the JSON output")
    private boolean prettyPrint = false;

    protected boolean isPrettyPrint() {
        return prettyPrint;
    }

}
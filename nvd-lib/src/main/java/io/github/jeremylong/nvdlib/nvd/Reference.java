/*
 *  Copyright 2023 Jeremy Long
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
package io.github.jeremylong.nvdlib.nvd;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"url", "source", "tags"})
public class Reference {

    /**
     * (Required)
     */
    @JsonProperty("url")
    private String url;
    @JsonProperty("source")
    private String source;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<>();

    /**
     * (Required)
     *
     * @return url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * @return source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * @return tags
     */
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Reference{" + "url='" + url + '\'' + ", source='" + source + '\'' + ", tags=" + tags + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Reference reference = (Reference) o;
        return Objects.equals(url, reference.url) && Objects.equals(source, reference.source)
                && Objects.equals(tags, reference.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, source, tags);
    }
}
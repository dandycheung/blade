/**
 * Copyright (c) 2015, biezhi 王爵 (hellokaton@gmail.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hellokaton.blade.mvc.ui;

import java.util.HashMap;
import java.util.Map;

/**
 * ModelAndView, Using templates and data
 *
 * @author <a href="mailto:hellokaton@gmail.com" target="_blank">hellokaton</a>
 * @since 1.5
 */
public class ModelAndView {

    /**
     * Data object, the object is placed in the attribute httprequest
     */
    private Map<String, Object> model = new HashMap<>(8);

    /**
     * View Page
     */
    private String view;

    public ModelAndView() {
    }

    /**
     * Create an empty view
     *
     * @param view view page
     */
    public ModelAndView(String view) {
        super();
        this.model = new HashMap<>();
        this.view = view;
    }

    /**
     * Create a model view object with data
     *
     * @param model model data
     * @param view  view page
     */
    public ModelAndView(Map<String, Object> model, String view) {
        super();
        this.model = model;
        this.view = view;
    }

    /**
     * Add data to model
     *
     * @param key   key
     * @param value value
     */
    public void add(String key, Object value) {
        this.model.put(key, value);
    }

    /**
     * Remove model data
     *
     * @param key key
     */
    public void remove(String key) {
        this.model.remove(key);
    }

    /**
     * @return Return view page
     */
    public String getView() {
        return view;
    }

    /**
     * Setting view page
     *
     * @param view view page
     */
    public void setView(String view) {
        this.view = view;
    }

    /**
     * @return Return model map
     */
    public Map<String, Object> getModel() {
        return model;
    }

    /**
     * Setting model
     *
     * @param model Storage data map
     */
    public void setModel(Map<String, Object> model) {
        this.model = model;
    }

    /**
     * Add attributes to model
     *
     * @param attributes current request attributes
     */
    public void addAll(Map<String, Object> attributes) {
        this.model.putAll(attributes);
    }

    @Override
    public String toString() {
        return "view = " + view + ", model = " + model;
    }

}
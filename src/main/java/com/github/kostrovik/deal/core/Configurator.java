package com.github.kostrovik.deal.core;

import com.github.kostrovik.configurator.core.ModuleConfigurator;

import java.util.Map;

/**
 * project: glc-mtx-deal
 * author:  kostrovik
 * date:    09/07/2018
 * github:  https://github.com/kostrovik/glc-mtx-deal
 */
public class Configurator extends ModuleConfigurator {
    private static final String defaultConfigFilePath = "deal/configurations/module_config.properties";

    public Map<String, String> getViews() {
        Map<String, Object> config = getConfig();

        return (Map<String, String>) config.get("views");
    }

    public Map<String, Object> getModuleMenu() {
        Map<String, Object> config = getConfig();

        return (Map<String, Object>) config.get("menu");
    }

    protected String getDefaultConfigFilePath() {
        return defaultConfigFilePath;
    }
}

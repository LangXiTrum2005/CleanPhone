package com.unity3d.services.core.lifecycle;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.properties.ClientProperties;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class CachedLifecycle {
    private static LifecycleCache _listener;

    public static LifecycleCache getLifecycleListener() {
        return _listener;
    }

    public static void register() {
        if (ClientProperties.getApplication() == null || getLifecycleListener() != null) {
            return;
        }
        setLifecycleListener(new LifecycleCache(new ConfigurationReader()));
        ClientProperties.getApplication().registerActivityLifecycleCallbacks(getLifecycleListener());
    }

    public static void setLifecycleListener(LifecycleCache lifecycleCache) {
        _listener = lifecycleCache;
    }

    public static void unregister() {
        if (ClientProperties.getApplication() == null || getLifecycleListener() == null) {
            return;
        }
        ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(getLifecycleListener());
        setLifecycleListener(null);
    }
}

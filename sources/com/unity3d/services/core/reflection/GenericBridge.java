package com.unity3d.services.core.reflection;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class GenericBridge {
    private final String _className;
    private final Map<String, Class<?>[]> _functionAndParameters;
    private final Map<String, Method> _methodMap;
    private boolean _methodMapBuilt;
    private final boolean enableLogging;

    public GenericBridge(Map<String, Class<?>[]> map) {
        this(map, true);
    }

    private void buildMethodMap() {
        boolean z10 = true;
        for (Map.Entry<String, Class<?>[]> entry : getFunctionMap().entrySet()) {
            Class<?>[] value = entry.getValue();
            try {
                Method reflectiveMethod = getReflectiveMethod(classForName(), entry.getKey(), value);
                if (reflectiveMethod != null) {
                    this._methodMap.put(entry.getKey(), reflectiveMethod);
                }
            } catch (Exception unused) {
                if (this.enableLogging) {
                    DeviceLog.debug("ERROR: Could not find %s class with method %s and parameters : %s", this._className, entry.getKey(), value);
                }
                z10 = false;
            }
        }
        this._methodMapBuilt = z10;
    }

    private Method getMethod(String str) {
        return this._methodMap.get(str);
    }

    private Method getReflectiveMethod(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (Exception e10) {
            if (this.enableLogging) {
                DeviceLog.debug("ERROR: Could not find method %s in %s", str, cls.getName() + " " + e10.getLocalizedMessage());
            }
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.GMA, b.E, new Object[0]);
            return null;
        }
    }

    public <T> T callNonVoidMethod(String str, Object obj, Object... objArr) {
        Method method = getMethod(str);
        if (method == null) {
            if (this.enableLogging) {
                DeviceLog.debug("ERROR: Could not find method %s", str);
            }
            return null;
        }
        try {
            return (T) method.invoke(obj, objArr);
        } catch (Exception e10) {
            if (this.enableLogging) {
                DeviceLog.debug("ERROR: Could not invoke method %s : %s", str, e10.getLocalizedMessage());
            }
            return null;
        }
    }

    public void callVoidMethod(String str, Object obj, Object... objArr) {
        Method method = getMethod(str);
        if (method == null) {
            DeviceLog.debug("ERROR: Could not find method %s", str);
            return;
        }
        try {
            method.invoke(obj, objArr);
        } catch (Exception e10) {
            DeviceLog.debug("ERROR: Could not invoke method %s : %s", str, e10.getLocalizedMessage());
        }
    }

    public Class<?> classForName() {
        try {
            return Class.forName(this._className);
        } catch (ClassNotFoundException e10) {
            if (!this.enableLogging) {
                return null;
            }
            DeviceLog.debug("ERROR: Could not find Class %s %s", this._className, e10.getLocalizedMessage());
            return null;
        }
    }

    public boolean exists() {
        if (classForName() == null) {
            if (this.enableLogging) {
                DeviceLog.debug("ERROR: Could not find class %s", this._className);
            }
            return false;
        }
        if (!this._methodMapBuilt) {
            buildMethodMap();
        }
        return this._methodMap.size() == getFunctionMap().size();
    }

    public abstract String getClassName();

    public Map<String, Class<?>[]> getFunctionMap() {
        return this._functionAndParameters;
    }

    public GenericBridge(Map<String, Class<?>[]> map, boolean z10) {
        this._methodMapBuilt = false;
        this.enableLogging = z10;
        this._className = getClassName();
        this._functionAndParameters = map;
        this._methodMap = new HashMap();
        buildMethodMap();
    }
}

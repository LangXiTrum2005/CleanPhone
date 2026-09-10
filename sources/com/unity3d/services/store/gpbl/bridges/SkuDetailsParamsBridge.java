package com.unity3d.services.store.gpbl.bridges;

import com.android.billingclient.api.SkuDetailsParams;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class SkuDetailsParamsBridge extends GenericBridge {
    private static final String newBuilderMethodName = "newBuilder";
    private static final Map<String, Class<?>[]> staticMethods = new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.1
        {
            put("newBuilder", new Class[0]);
        }
    };
    private final Object _skuDetailsParamsInternalInstance;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class BuilderBridge extends GenericBridge {
        private static final String buildMethodName = "build";
        private static final String setSkusListMethodName = "setSkusList";
        private static final String setTypeMethodName = "setType";
        private Object _skuDetailsParamsBuilderInternalInstance;

        public BuilderBridge(Object obj) {
            super(new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.BuilderBridge.1
                {
                    put("build", new Class[0]);
                    put(BuilderBridge.setSkusListMethodName, new Class[]{List.class});
                    put(BuilderBridge.setTypeMethodName, new Class[]{String.class});
                }
            });
            this._skuDetailsParamsBuilderInternalInstance = obj;
        }

        public SkuDetailsParamsBridge build() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
            return new SkuDetailsParamsBridge(callNonVoidMethod("build", this._skuDetailsParamsBuilderInternalInstance, new Object[0]));
        }

        @Override // com.unity3d.services.core.reflection.GenericBridge
        public String getClassName() {
            return "com.android.billingclient.api.SkuDetailsParams$Builder";
        }

        public BuilderBridge setSkuList(List<String> list) {
            this._skuDetailsParamsBuilderInternalInstance = callNonVoidMethod(setSkusListMethodName, this._skuDetailsParamsBuilderInternalInstance, list);
            return this;
        }

        public BuilderBridge setType(String str) {
            this._skuDetailsParamsBuilderInternalInstance = callNonVoidMethod(setTypeMethodName, this._skuDetailsParamsBuilderInternalInstance, str);
            return this;
        }
    }

    public SkuDetailsParamsBridge(Object obj) {
        super(new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.2
            {
                put("newBuilder", new Class[0]);
            }
        });
        this._skuDetailsParamsInternalInstance = obj;
    }

    public static Object callNonVoidStaticMethod(String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return getClassForBridge().getMethod(str, staticMethods.get(str)).invoke(null, objArr);
    }

    public static Class<?> getClassForBridge() throws ClassNotFoundException {
        return SkuDetailsParams.class;
    }

    public static BuilderBridge newBuilder() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return new BuilderBridge(callNonVoidStaticMethod("newBuilder", new Object[0]));
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.SkuDetailsParams";
    }

    public Object getInternalInstance() {
        return this._skuDetailsParamsInternalInstance;
    }
}

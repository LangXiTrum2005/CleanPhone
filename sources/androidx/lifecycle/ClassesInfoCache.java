package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class ClassesInfoCache {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ClassesInfoCache f5219c = new ClassesInfoCache();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5220a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5221b = new HashMap();

    @Deprecated
    public static class CallbackInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f5222a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f5223b;

        public CallbackInfo(HashMap map) {
            this.f5223b = map;
            for (Map.Entry entry : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List arrayList = (List) this.f5222a.get(event);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f5222a.put(event, arrayList);
                }
                arrayList.add((MethodReference) entry.getKey());
            }
        }

        public static void a(List list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, LifecycleObserver lifecycleObserver) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    MethodReference methodReference = (MethodReference) list.get(size);
                    methodReference.getClass();
                    try {
                        int i2 = methodReference.f5224a;
                        Method method = methodReference.f5225b;
                        if (i2 == 0) {
                            method.invoke(lifecycleObserver, new Object[0]);
                        } else if (i2 == 1) {
                            method.invoke(lifecycleObserver, lifecycleOwner);
                        } else if (i2 == 2) {
                            method.invoke(lifecycleObserver, lifecycleOwner, event);
                        }
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to call observer method", e3.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    public static final class MethodReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f5225b;

        public MethodReference(Method method, int i2) {
            this.f5224a = i2;
            this.f5225b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodReference)) {
                return false;
            }
            MethodReference methodReference = (MethodReference) obj;
            return this.f5224a == methodReference.f5224a && this.f5225b.getName().equals(methodReference.f5225b.getName());
        }

        public final int hashCode() {
            return this.f5225b.getName().hashCode() + (this.f5224a * 31);
        }
    }

    public static void b(HashMap map, MethodReference methodReference, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) map.get(methodReference);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(methodReference, event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + methodReference.f5225b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }

    public final CallbackInfo a(Class cls, Method[] methodArr) {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f5220a;
        if (superclass != null) {
            CallbackInfo callbackInfoA = (CallbackInfo) map2.get(superclass);
            if (callbackInfoA == null) {
                callbackInfoA = a(superclass, null);
            }
            map.putAll(callbackInfoA.f5223b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            CallbackInfo callbackInfoA2 = (CallbackInfo) map2.get(cls2);
            if (callbackInfoA2 == null) {
                callbackInfoA2 = a(cls2, null);
            }
            for (Map.Entry entry : callbackInfoA2.f5223b.entrySet()) {
                b(map, (MethodReference) entry.getKey(), (Lifecycle.Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                Lifecycle.Event eventValue = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (eventValue != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new MethodReference(method, i2), eventValue, cls);
                z2 = true;
            }
        }
        CallbackInfo callbackInfo = new CallbackInfo(map);
        map2.put(cls, callbackInfo);
        this.f5221b.put(cls, Boolean.valueOf(z2));
        return callbackInfo;
    }
}

package androidx.p001lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ClassesInfoCache.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class dern {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static dern f10463dern = new dern();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<Class<?>, attabal> f10464attabal = new HashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<Class<?>, Boolean> f10465saneness = new HashMap();

    /* JADX INFO: compiled from: ClassesInfoCache.java */
    @Deprecated
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Map<Lifecycle.Event, List<saneness>> f10466attabal = new HashMap();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Map<saneness, Lifecycle.Event> f10467saneness;

        public attabal(Map<saneness, Lifecycle.Event> map) {
            this.f10467saneness = map;
            for (Map.Entry<saneness, Lifecycle.Event> entry : map.entrySet()) {
                Lifecycle.Event value = entry.getValue();
                List<saneness> arrayList = this.f10466attabal.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f10466attabal.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        public static void saneness(List<saneness> list, arytenoidectomy arytenoidectomyVar, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).attabal(arytenoidectomyVar, event, obj);
                }
            }
        }

        public void attabal(arytenoidectomy arytenoidectomyVar, Lifecycle.Event event, Object obj) {
            saneness(this.f10466attabal.get(event), arytenoidectomyVar, event, obj);
            saneness(this.f10466attabal.get(Lifecycle.Event.ON_ANY), arytenoidectomyVar, event, obj);
        }
    }

    /* JADX INFO: compiled from: ClassesInfoCache.java */
    @Deprecated
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f10468attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Method f10469saneness;

        public saneness(int i, Method method) {
            this.f10468attabal = i;
            this.f10469saneness = method;
            method.setAccessible(true);
        }

        public void attabal(arytenoidectomy arytenoidectomyVar, Lifecycle.Event event, Object obj) {
            try {
                int i = this.f10468attabal;
                if (i == 0) {
                    this.f10469saneness.invoke(obj, null);
                } else if (i == 1) {
                    this.f10469saneness.invoke(obj, arytenoidectomyVar);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.f10469saneness.invoke(obj, arytenoidectomyVar, event);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof saneness)) {
                return false;
            }
            saneness sanenessVar = (saneness) obj;
            return this.f10468attabal == sanenessVar.f10468attabal && this.f10469saneness.getName().equals(sanenessVar.f10469saneness.getName());
        }

        public int hashCode() {
            return (this.f10468attabal * 31) + this.f10469saneness.getName().hashCode();
        }
    }

    public final attabal attabal(Class<?> cls, Method[] methodArr) {
        int i;
        attabal attabalVarDern;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (attabalVarDern = dern(superclass)) != null) {
            map.putAll(attabalVarDern.f10467saneness);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<saneness, Lifecycle.Event> entry : dern(cls2).f10467saneness.entrySet()) {
                marial(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = saneness(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            cuirassed cuirassedVar = (cuirassed) method.getAnnotation(cuirassed.class);
            if (cuirassedVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!arytenoidectomy.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                Lifecycle.Event eventValue = cuirassedVar.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (eventValue != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                marial(map, new saneness(i, method), eventValue, cls);
                z = true;
            }
        }
        attabal attabalVar = new attabal(map);
        this.f10464attabal.put(cls, attabalVar);
        this.f10465saneness.put(cls, Boolean.valueOf(z));
        return attabalVar;
    }

    public attabal dern(Class<?> cls) {
        attabal attabalVar = this.f10464attabal.get(cls);
        return attabalVar != null ? attabalVar : attabal(cls, null);
    }

    public final void marial(Map<saneness, Lifecycle.Event> map, saneness sanenessVar, Lifecycle.Event event, Class<?> cls) {
        Lifecycle.Event event2 = map.get(sanenessVar);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(sanenessVar, event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + sanenessVar.f10469saneness.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }

    public final Method[] saneness(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    public boolean wireman(Class<?> cls) {
        Boolean bool = this.f10465saneness.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrSaneness = saneness(cls);
        for (Method method : methodArrSaneness) {
            if (((cuirassed) method.getAnnotation(cuirassed.class)) != null) {
                attabal(cls, methodArrSaneness);
                return true;
            }
        }
        this.f10465saneness.put(cls, Boolean.FALSE);
        return false;
    }
}

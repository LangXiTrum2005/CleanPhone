package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class SubscriberMethodFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, List<SubscriberMethod>> f33209a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f33210b = new ConcurrentHashMap();

    public static void clearSkipMethodNameVerifications() {
        f33210b.clear();
    }

    public List<SubscriberMethod> a(Class<?> cls, String str) {
        List<SubscriberMethod> list;
        ThreadMode threadMode;
        String str2 = cls.getName() + '.' + str;
        Map<String, List<SubscriberMethod>> map = f33209a;
        synchronized (map) {
            list = map.get(str2);
        }
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                break;
            }
            for (Method method : superclass.getDeclaredMethods()) {
                String name2 = method.getName();
                if (name2.startsWith(str)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        String strSubstring = name2.substring(str.length());
                        if (strSubstring.length() == 0) {
                            threadMode = ThreadMode.PostThread;
                        } else if (strSubstring.equals("MainThread")) {
                            threadMode = ThreadMode.MainThread;
                        } else if (strSubstring.equals("BackgroundThread")) {
                            threadMode = ThreadMode.BackgroundThread;
                        } else if (strSubstring.equals("Async")) {
                            threadMode = ThreadMode.Async;
                        } else if (!f33210b.containsKey(superclass)) {
                            throw new EventBusException("Illegal onEvent method, check for typos: " + method);
                        }
                        Class<?> cls2 = parameterTypes[0];
                        sb2.setLength(0);
                        sb2.append(name2);
                        sb2.append('>');
                        sb2.append(cls2.getName());
                        if (hashSet.add(sb2.toString())) {
                            arrayList.add(new SubscriberMethod(method, threadMode, cls2));
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Map<String, List<SubscriberMethod>> map2 = f33209a;
            synchronized (map2) {
                map2.put(str2, arrayList);
            }
            return arrayList;
        }
        throw new EventBusException("Subscriber " + cls + " has no methods called " + str);
    }

    public static void a() {
        f33209a.clear();
    }

    public static void a(Class<?> cls) {
        if (f33209a.isEmpty()) {
            f33210b.put(cls, cls);
            return;
        }
        throw new IllegalStateException("This method must be called before registering anything");
    }
}

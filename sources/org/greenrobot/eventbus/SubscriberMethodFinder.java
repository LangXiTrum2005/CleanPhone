package org.greenrobot.eventbus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.meta.SubscriberInfo;

/* JADX INFO: loaded from: classes7.dex */
class SubscriberMethodFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f45267a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FindState[] f45268b = new FindState[4];

    public static class FindState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f45269a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f45270b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap f45271c = new HashMap();
        public final StringBuilder d = new StringBuilder(128);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Class f45272e;
        public boolean f;
        public SubscriberInfo g;

        public final boolean a(Method method, Class cls) {
            StringBuilder sb = this.d;
            sb.setLength(0);
            sb.append(method.getName());
            sb.append('>');
            sb.append(cls.getName());
            String string = sb.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            HashMap map = this.f45271c;
            Class cls2 = (Class) map.put(string, declaringClass);
            if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
                return true;
            }
            map.put(string, cls2);
            return false;
        }
    }
}

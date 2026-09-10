package com.google.gson.internal;

import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ReflectionAccessFilterHelper {

    public static abstract class AccessChecker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccessChecker f21236a;

        /* JADX INFO: renamed from: com.google.gson.internal.ReflectionAccessFilterHelper$AccessChecker$2, reason: invalid class name */
        public class AnonymousClass2 extends AccessChecker {
            @Override // com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                return true;
            }
        }

        static {
            AccessChecker anonymousClass2;
            if (JavaVersion.f21231a >= 9) {
                try {
                    final Method declaredMethod = AccessibleObject.class.getDeclaredMethod("canAccess", Object.class);
                    anonymousClass2 = new AccessChecker() { // from class: com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker.1
                        @Override // com.google.gson.internal.ReflectionAccessFilterHelper.AccessChecker
                        public final boolean a(Object obj, AccessibleObject accessibleObject) {
                            try {
                                return ((Boolean) declaredMethod.invoke(accessibleObject, obj)).booleanValue();
                            } catch (Exception e2) {
                                throw new RuntimeException("Failed invoking canAccess", e2);
                            }
                        }
                    };
                } catch (NoSuchMethodException unused) {
                    anonymousClass2 = null;
                }
            } else {
                anonymousClass2 = null;
            }
            if (anonymousClass2 == null) {
                anonymousClass2 = new AnonymousClass2();
            }
            f21236a = anonymousClass2;
        }

        public abstract boolean a(Object obj, AccessibleObject accessibleObject);
    }

    public static boolean a(Object obj, AccessibleObject accessibleObject) {
        return AccessChecker.f21236a.a(obj, accessibleObject);
    }

    public static ReflectionAccessFilter.FilterResult b(Class cls, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReflectionAccessFilter.FilterResult filterResultA = ((ReflectionAccessFilter) it.next()).a(cls);
            if (filterResultA != ReflectionAccessFilter.FilterResult.f21204Y) {
                return filterResultA;
            }
        }
        return ReflectionAccessFilter.FilterResult.X;
    }
}

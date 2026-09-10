package com.startapp.sdk.internal;

import android.content.Context;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f40785c;
    public final Class[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object[] f40786e;
    public final String[] f;
    public transient SoftReference g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient ConcurrentHashMap f40787h = new ConcurrentHashMap();

    public a3(String str, String str2, String[] strArr, Class[] clsArr, Object[] objArr, String[] strArr2) {
        this.f40783a = str;
        this.f40784b = str2;
        this.f40785c = strArr;
        this.d = clsArr;
        this.f40786e = objArr;
        this.f = strArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public final JSONArray a(Context context, int[] iArr, Integer num) {
        Iterator y2Var;
        Comparator d6Var;
        try {
            c3 c3VarA = a(context);
            Object objInvoke = c3VarA.f40851b.invoke(c3VarA.f40850a, this.f40786e);
            if (objInvoke == null) {
                y2Var = z2.f41756a;
            } else if (objInvoke instanceof Collection) {
                y2Var = ((Collection) objInvoke).iterator();
            } else {
                y2Var = objInvoke.getClass().isArray() ? new y2(Array.getLength(objInvoke), objInvoke) : Collections.singleton(objInvoke).iterator();
            }
            ?? arrayList = new ArrayList();
            while (true) {
                d6Var = null;
                if (!y2Var.hasNext()) {
                    break;
                }
                Object next = y2Var.next();
                if (next != null) {
                    JSONObject jSONObject = new JSONObject();
                    Class<?> cls = next.getClass();
                    SoftReference softReference = (SoftReference) this.f40787h.get(cls.getName());
                    Map mapA = softReference != null ? (Map) softReference.get() : null;
                    if (mapA == null) {
                        mapA = a(cls, this.f);
                        this.f40787h.put(cls.getName(), new SoftReference(mapA));
                    }
                    if (mapA.isEmpty()) {
                        try {
                            jSONObject.put("", next.toString());
                        } catch (Throwable unused) {
                        }
                    } else {
                        for (Map.Entry entry : mapA.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            try {
                                if (value instanceof Field) {
                                    jSONObject.put(str, a(((Field) value).get(next)));
                                } else if (value instanceof Method) {
                                    jSONObject.put(str, a(((Method) value).invoke(next, new Object[0])));
                                } else {
                                    boolean z2 = value instanceof Throwable;
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                    arrayList.add(jSONObject);
                }
            }
            if (iArr != null && iArr.length > 0) {
                int length = this.f.length;
                for (int i2 : iArr) {
                    if (i2 != 0 && Math.abs(i2) <= length) {
                        Comparator abVar = new ab(this.f[Math.abs(i2) - 1]);
                        if (i2 < 0) {
                            abVar = Collections.reverseOrder(abVar);
                        }
                        d6Var = d6Var == null ? abVar : new d6(d6Var, abVar);
                    }
                }
                if (d6Var != null) {
                    Collections.sort(arrayList, d6Var);
                }
            }
            if (num != null && num.intValue() > 0) {
                arrayList = arrayList.subList(0, Math.min(num.intValue(), arrayList.size()));
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((JSONObject) it.next());
            }
            return jSONArray;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(String.valueOf(5), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(String.valueOf(5), e3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a3.class == obj.getClass()) {
            a3 a3Var = (a3) obj;
            if (vi.a((Object) this.f40783a, (Object) a3Var.f40783a) && vi.a((Object) this.f40784b, (Object) a3Var.f40784b) && Arrays.equals(this.f40785c, a3Var.f40785c) && Arrays.equals(this.f40786e, a3Var.f40786e) && Arrays.equals(this.f, a3Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f40783a, this.f40784b, this.f40785c, this.f40786e, this.f};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public static Object a(Object obj) {
        if (obj instanceof Short) {
            return Integer.valueOf(((Short) obj).intValue());
        }
        if ((obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof Double) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public final c3 a(Context context) {
        Object objInvoke;
        SoftReference softReference = this.g;
        c3 c3Var = softReference != null ? (c3) softReference.get() : null;
        if (c3Var != null) {
            return c3Var;
        }
        Object systemService = context.getSystemService(this.f40783a);
        if (systemService == null) {
            try {
                Object obj = a(Context.class, new String[]{this.f40783a}).get(this.f40783a);
                if (obj instanceof Method) {
                    objInvoke = ((Method) obj).invoke(context, new Object[0]);
                } else if (obj instanceof Field) {
                    objInvoke = ((Field) obj).get(context);
                } else {
                    boolean z2 = obj instanceof Throwable;
                }
                systemService = objInvoke;
            } catch (Throwable unused) {
            }
        }
        if (systemService != null) {
            try {
                Method methodA = a(systemService.getClass(), this.f40784b, this.d);
                if (!methodA.isAccessible()) {
                    try {
                        methodA.setAccessible(true);
                    } catch (SecurityException e2) {
                        throw new RuntimeException(String.valueOf(4), e2);
                    }
                }
                c3 c3Var2 = new c3(systemService, methodA);
                this.g = new SoftReference(c3Var2);
                return c3Var2;
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(String.valueOf(3), e3);
            }
        }
        throw new RuntimeException(String.valueOf(1));
    }

    public static Method a(Class cls, String str, Class[] clsArr) throws NoSuchMethodException {
        NoSuchMethodException noSuchMethodException = null;
        while (cls != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e2) {
                if (noSuchMethodException == null) {
                    noSuchMethodException = e2;
                }
                cls = cls.getSuperclass();
            }
        }
        throw noSuchMethodException;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[Catch: NoSuchMethodException -> 0x0070, NoSuchMethodException | SecurityException -> 0x0094, TryCatch #1 {NoSuchMethodException -> 0x0070, blocks: (B:22:0x004c, B:24:0x0069, B:25:0x006c), top: B:37:0x004c, outer: #3 }] */
    public static LinkedHashMap a(Class cls, String[] strArr) {
        Object e2;
        String str;
        Method methodA;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : strArr) {
            NoSuchFieldException noSuchFieldException = null;
            Class superclass = cls;
            while (true) {
                if (superclass != null) {
                    try {
                        try {
                            Field declaredField = superclass.getDeclaredField(str2);
                            try {
                                if (!declaredField.isAccessible()) {
                                    declaredField.setAccessible(true);
                                }
                                linkedHashMap.put(str2, declaredField);
                                break;
                            } catch (NoSuchFieldException e3) {
                                e2 = e3;
                                str = Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
                                try {
                                    methodA = a(cls, "get" + str, new Class[0]);
                                    if (!methodA.isAccessible()) {
                                        methodA.setAccessible(true);
                                    }
                                    linkedHashMap.put(str2, methodA);
                                } catch (NoSuchMethodException | SecurityException unused) {
                                    linkedHashMap.put(str2, e2);
                                }
                            }
                        } catch (SecurityException e4) {
                            e2 = e4;
                            str = Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
                            methodA = a(cls, "get" + str, new Class[0]);
                            if (!methodA.isAccessible()) {
                                methodA.setAccessible(true);
                            }
                            linkedHashMap.put(str2, methodA);
                        }
                    } catch (NoSuchFieldException e5) {
                        if (noSuchFieldException == null) {
                            noSuchFieldException = e5;
                        }
                        superclass = superclass.getSuperclass();
                    }
                } else {
                    throw noSuchFieldException;
                }
                e2 = e3;
                str = Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
                try {
                    methodA = a(cls, "get" + str, new Class[0]);
                    if (!methodA.isAccessible()) {
                        methodA.setAccessible(true);
                    }
                    linkedHashMap.put(str2, methodA);
                } catch (NoSuchMethodException unused2) {
                    Method methodA2 = a(cls, "is" + str, new Class[0]);
                    if (!methodA2.isAccessible()) {
                        methodA2.setAccessible(true);
                    }
                    linkedHashMap.put(str2, methodA2);
                }
            }
        }
        return linkedHashMap;
    }
}

package com.google.android.gms.internal.auth;

import com.ironsource.X3;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f22799a;

    static {
        char[] cArr = new char[80];
        f22799a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        b(sb2, i10);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(go.k.Z(new h0(((String) obj).getBytes(p0.f22890a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof h0) {
            sb2.append(": \"");
            sb2.append(go.k.Z((h0) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof m0) {
            sb2.append(" {");
            c((m0) obj, sb2, i10 + 2);
            sb2.append("\n");
            b(sb2, i10);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        a(sb2, i12, X3.i.W, entry.getKey());
        a(sb2, i12, X3.i.X, entry.getValue());
        sb2.append("\n");
        b(sb2, i10);
        sb2.append("}");
    }

    public static void b(StringBuilder sb2, int i10) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f22799a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0204  */
    public static void c(m0 m0Var, StringBuilder sb2, int i10) {
        int i11;
        int i12;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = m0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i12 = i11;
            } else {
                i12 = i11;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), m0.c(method2, m0Var, new Object[0]));
                }
                i11 = i12;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), m0.c(method, m0Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objC = m0.c(method4, m0Var, new Object[0]);
                    if (method5 == null) {
                        if (objC instanceof Boolean) {
                            if (((Boolean) objC).booleanValue()) {
                                a(sb2, i10, strSubstring, objC);
                            }
                        } else if (objC instanceof Integer) {
                            if (((Integer) objC).intValue() != 0) {
                                a(sb2, i10, strSubstring, objC);
                            }
                        } else if (objC instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objC).floatValue()) != 0) {
                                a(sb2, i10, strSubstring, objC);
                            }
                        } else if (!(objC instanceof Double)) {
                            if (objC instanceof String) {
                                zEquals = objC.equals("");
                            } else if (objC instanceof h0) {
                                zEquals = objC.equals(h0.f22838c);
                            } else if (objC instanceof c0) {
                                if (objC != ((m0) ((m0) ((c0) objC)).h(6))) {
                                    a(sb2, i10, strSubstring, objC);
                                }
                            } else if (!(objC instanceof Enum) || ((Enum) objC).ordinal() != 0) {
                                a(sb2, i10, strSubstring, objC);
                            }
                            if (!zEquals) {
                                a(sb2, i10, strSubstring, objC);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objC).doubleValue()) != 0) {
                            a(sb2, i10, strSubstring, objC);
                        }
                    } else if (((Boolean) m0.c(method5, m0Var, new Object[0])).booleanValue()) {
                        a(sb2, i10, strSubstring, objC);
                    }
                }
            }
            i11 = i12;
        }
        o1 o1Var = m0Var.zzc;
        if (o1Var != null) {
            for (int i14 = 0; i14 < o1Var.f22884a; i14++) {
                a(sb2, i10, String.valueOf(o1Var.f22885b[i14] >>> 3), o1Var.f22886c[i14]);
            }
        }
    }
}

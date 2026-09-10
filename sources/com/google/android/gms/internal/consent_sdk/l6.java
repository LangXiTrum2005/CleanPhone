package com.google.android.gms.internal.consent_sdk;

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
public abstract class l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f23075a;

    static {
        char[] cArr = new char[80];
        f23075a = cArr;
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
            n5 n5Var = n5.f23112c;
            sb2.append(d0.b(new n5(((String) obj).getBytes(a6.f22937a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof n5) {
            sb2.append(": \"");
            sb2.append(d0.b((n5) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof w5) {
            sb2.append(" {");
            c((w5) obj, sb2, i10 + 2);
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
        int i12 = i10 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
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
            sb2.append(f23075a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ff  */
    public static void c(w5 w5Var, StringBuilder sb2, int i10) {
        int i11;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = w5Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
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
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), w5.i(method2, w5Var, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), w5.i(method, w5Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objI = w5.i(method4, w5Var, new Object[0]);
                    if (method5 == null) {
                        if (objI instanceof Boolean) {
                            if (((Boolean) objI).booleanValue()) {
                                a(sb2, i10, strSubstring, objI);
                            }
                        } else if (objI instanceof Integer) {
                            if (((Integer) objI).intValue() != 0) {
                                a(sb2, i10, strSubstring, objI);
                            }
                        } else if (objI instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objI).floatValue()) != 0) {
                                a(sb2, i10, strSubstring, objI);
                            }
                        } else if (!(objI instanceof Double)) {
                            if (objI instanceof String) {
                                zEquals = objI.equals("");
                            } else if (objI instanceof n5) {
                                zEquals = objI.equals(n5.f23112c);
                            } else if (objI instanceof i5) {
                                if (objI != ((w5) ((w5) ((i5) objI)).f(6))) {
                                    a(sb2, i10, strSubstring, objI);
                                }
                            } else if (!(objI instanceof Enum) || ((Enum) objI).ordinal() != 0) {
                                a(sb2, i10, strSubstring, objI);
                            }
                            if (!zEquals) {
                                a(sb2, i10, strSubstring, objI);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objI).doubleValue()) != 0) {
                            a(sb2, i10, strSubstring, objI);
                        }
                    } else if (((Boolean) w5.i(method5, w5Var, new Object[0])).booleanValue()) {
                        a(sb2, i10, strSubstring, objI);
                    }
                }
            }
            i11 = 3;
        }
    }
}

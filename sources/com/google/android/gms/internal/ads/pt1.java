package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f18815a;

    static {
        char[] cArr = new char[80];
        f18815a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i10, String str, Object obj) {
        String strReplace;
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
        c(sb2, i10);
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
        if (!(obj instanceof String)) {
            if (obj instanceof cs1) {
                sb2.append(": \"");
                sb2.append(jc1.d(((cs1) obj).h()));
                sb2.append('\"');
                return;
            }
            if (obj instanceof ss1) {
                sb2.append(" {");
                b((ss1) obj, sb2, i10 + 2);
                sb2.append("\n");
                c(sb2, i10);
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
            c(sb2, i10);
            sb2.append("}");
            return;
        }
        sb2.append(": \"");
        String strReplace2 = (String) obj;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (int i13 = 0; i13 < strReplace2.length(); i13++) {
            char cCharAt2 = strReplace2.charAt(i13);
            if (cCharAt2 < ' ' || cCharAt2 > '~') {
                strReplace = jc1.d(strReplace2.getBytes(StandardCharsets.UTF_8));
                sb2.append(strReplace);
                sb2.append('\"');
            } else {
                if (cCharAt2 == '\"') {
                    z12 = true;
                } else if (cCharAt2 == '\'') {
                    z11 = true;
                } else if (cCharAt2 == '\\') {
                    z10 = true;
                }
            }
        }
        if (z10) {
            strReplace2 = strReplace2.replace("\\", "\\\\");
        }
        strReplace = z11 ? strReplace2.replace("'", "\\'") : strReplace2;
        if (z12) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        sb2.append(strReplace);
        sb2.append('\"');
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    public static void b(ss1 ss1Var, StringBuilder sb2, int i10) {
        int i11;
        int i12;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = ss1Var.getClass().getDeclaredMethods();
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
                    a(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), ss1.j(method2, ss1Var, new Object[0]));
                }
                i11 = i12;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), ss1.j(method, ss1Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objJ = ss1.j(method4, ss1Var, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) ss1.j(method5, ss1Var, new Object[0])).booleanValue();
                    } else if (objJ instanceof Boolean) {
                        if (((Boolean) objJ).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objJ instanceof Integer) {
                        if (((Integer) objJ).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objJ instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objJ).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objJ instanceof Double)) {
                        if (objJ instanceof String) {
                            zEquals = objJ.equals("");
                        } else if (objJ instanceof cs1) {
                            zEquals = objJ.equals(cs1.f13248b);
                        } else if (!(objJ instanceof rr1) ? !((objJ instanceof Enum) && ((Enum) objJ).ordinal() == 0) : objJ != ((ss1) ((ss1) ((rr1) objJ)).v(6, null))) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objJ).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        a(sb2, i10, strSubstring, objJ);
                    }
                }
            }
            i11 = i12;
        }
        iu1 iu1Var = ss1Var.zzt;
        if (iu1Var != null) {
            for (int i14 = 0; i14 < iu1Var.f15849a; i14++) {
                a(sb2, i10, String.valueOf(iu1Var.f15850b[i14] >>> 3), iu1Var.f15851c[i14]);
            }
        }
    }

    public static void c(StringBuilder sb2, int i10) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f18815a, 0, i11);
            i10 -= i11;
        }
    }
}

package com.google.crypto.tink.shaded.protobuf;

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
/* JADX INFO: loaded from: classes3.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f24614a;

    static {
        char[] cArr = new char[80];
        f24614a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i10) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f24614a, 0, i11);
            i10 -= i11;
        }
    }

    public static void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(sb2, i10);
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
            h hVar = i.f24569b;
            sb2.append(j1.f.s(new h(((String) obj).getBytes(b0.f24539a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof i) {
            sb2.append(": \"");
            sb2.append(j1.f.s((i) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof x) {
            sb2.append(" {");
            c((x) obj, sb2, i10 + 2);
            sb2.append("\n");
            a(sb2, i10);
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
        b(sb2, i12, X3.i.W, entry.getKey());
        b(sb2, i12, X3.i.X, entry.getValue());
        sb2.append("\n");
        a(sb2, i10);
        sb2.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:108:0x020d  */
    /* JADX WARN: Code duplicated, block: B:127:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0166  */
    /* JADX WARN: Code duplicated, block: B:66:0x0178  */
    /* JADX WARN: Code duplicated, block: B:68:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x018f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0193  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /* JADX WARN: Code duplicated, block: B:76:0x019e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01de  */
    public static void c(x xVar, StringBuilder sb2, int i10) {
        int i11;
        int i12;
        Method method;
        Method method2;
        Object objM;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = xVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method5 = declaredMethods[i13];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (Method) entry.getValue()) == null) {
                i12 = i11;
            } else {
                i12 = i11;
                if (method4.getReturnType().equals(List.class)) {
                    b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), x.m(method4, xVar, new Object[0]));
                }
                i11 = i12;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), x.m(method3, xVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objM = x.m(method, xVar, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objM instanceof Boolean) {
                                    zEquals = !((Boolean) objM).booleanValue();
                                } else if (objM instanceof Integer) {
                                    if (((Integer) objM).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objM).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objM).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM instanceof String) {
                                    zEquals = objM.equals("");
                                } else if (objM instanceof i) {
                                    zEquals = objM.equals(i.f24569b);
                                } else if ((objM instanceof a) ? !((objM instanceof Enum) && ((Enum) objM).ordinal() == 0) : objM != ((a) objM).getDefaultInstanceForType()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) x.m(method2, xVar, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb2, i10, strSubstring, objM);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objM = x.m(method, xVar, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objM instanceof Boolean) {
                                zEquals = !((Boolean) objM).booleanValue();
                            } else if (objM instanceof Integer) {
                                if (((Integer) objM).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objM).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objM).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM instanceof String) {
                                zEquals = objM.equals("");
                            } else if (objM instanceof i) {
                                zEquals = objM.equals(i.f24569b);
                            } else if (objM instanceof a) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) x.m(method2, xVar, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb2, i10, strSubstring, objM);
                        }
                    }
                }
            }
            i11 = i12;
        }
        c1 c1Var = xVar.unknownFields;
        if (c1Var != null) {
            for (int i14 = 0; i14 < c1Var.f24544a; i14++) {
                b(sb2, i10, String.valueOf(c1Var.f24545b[i14] >>> 3), c1Var.f24546c[i14]);
            }
        }
    }
}

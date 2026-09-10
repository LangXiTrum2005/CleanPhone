package ads_mobile_sdk;

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
import saneness.pedagogism;
import saneness.transpositive;

/* JADX INFO: loaded from: classes.dex */
public abstract class if1 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = i;
        while (true) {
            int i3 = 80;
            if (i2 <= 0) {
                break;
            }
            char[] cArr = a;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(cArr, 0, i3);
            i2 -= i3;
        }
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i4 = 1; i4 < str.length(); i4++) {
                char cCharAt = str.charAt(i4);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(pedagogism.saneness((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof kn) {
            sb.append(": \"");
            sb.append(pedagogism.dern(((kn) obj).c()));
            sb.append('\"');
            return;
        }
        if (obj instanceof xm0) {
            sb.append(" {");
            a((xm0) obj, sb, i + 2);
            sb.append("\n");
            while (i > 0) {
                char[] cArr2 = a;
                int i5 = i > 80 ? 80 : i;
                sb.append(cArr2, 0, i5);
                i -= i5;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i6 = i + 2;
        a(sb, i6, X3.i.W, entry.getKey());
        a(sb, i6, "value", entry.getValue());
        sb.append("\n");
        while (i > 0) {
            char[] cArr3 = a;
            int i7 = i > 80 ? 80 : i;
            sb.append(cArr3, 0, i7);
            i -= i7;
        }
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0216  */
    /* JADX WARN: Code duplicated, block: B:106:0x0224  */
    /* JADX WARN: Code duplicated, block: B:123:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x0191  */
    /* JADX WARN: Code duplicated, block: B:68:0x0199  */
    /* JADX WARN: Code duplicated, block: B:70:0x019d  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01de  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:99:0x0207  */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0174, please report this as an issue */
    public static void a(transpositive transpositiveVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        Method method;
        Method method2;
        Object objA;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = transpositiveVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method5 = declaredMethods[i4];
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
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method4.getReturnType().equals(List.class)) {
                    a(sb, i, strSubstring.substring(0, strSubstring.length() - 4), xm0.a(method4, transpositiveVar, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                a(sb, i, strSubstring.substring(0, strSubstring.length() - 3), xm0.a(method3, transpositiveVar, new Object[0]));
            } else {
                if (hashSet.contains("set" + strSubstring)) {
                    if (strSubstring.endsWith("Bytes")) {
                        if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                            method = (Method) entry.getValue();
                            method2 = (Method) map.get("has" + strSubstring);
                            if (method != null) {
                                objA = xm0.a(method, transpositiveVar, new Object[0]);
                                if (method2 == null) {
                                    if (objA instanceof Boolean) {
                                        zEquals = !((Boolean) objA).booleanValue();
                                    } else if (objA instanceof Integer) {
                                        if (((Integer) objA).intValue() == 0) {
                                            a(sb, i, strSubstring, objA);
                                        }
                                    } else if (objA instanceof Float) {
                                        if (Float.floatToRawIntBits(((Float) objA).floatValue()) == 0) {
                                            a(sb, i, strSubstring, objA);
                                        }
                                    } else if (objA instanceof Double) {
                                        if (Double.doubleToRawLongBits(((Double) objA).doubleValue()) == 0) {
                                            a(sb, i, strSubstring, objA);
                                        }
                                    } else if (objA instanceof String) {
                                        zEquals = objA.equals("");
                                    } else if (objA instanceof kn) {
                                        zEquals = objA.equals(kn.b);
                                    } else if (objA instanceof transpositive) {
                                        if (objA == ((xm0) ((transpositive) objA)).i()) {
                                            a(sb, i, strSubstring, objA);
                                        }
                                    } else if ((objA instanceof Enum) || ((Enum) objA).ordinal() != 0) {
                                        a(sb, i, strSubstring, objA);
                                    }
                                    if (!zEquals) {
                                        a(sb, i, strSubstring, objA);
                                    }
                                } else if (((Boolean) xm0.a(method2, transpositiveVar, new Object[0])).booleanValue()) {
                                    a(sb, i, strSubstring, objA);
                                }
                            }
                        }
                    } else {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has" + strSubstring);
                        if (method != null) {
                            objA = xm0.a(method, transpositiveVar, new Object[0]);
                            if (method2 == null) {
                                if (objA instanceof Boolean) {
                                    zEquals = !((Boolean) objA).booleanValue();
                                } else if (objA instanceof Integer) {
                                    if (((Integer) objA).intValue() == 0) {
                                        a(sb, i, strSubstring, objA);
                                    }
                                } else if (objA instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objA).floatValue()) == 0) {
                                        a(sb, i, strSubstring, objA);
                                    }
                                } else if (objA instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objA).doubleValue()) == 0) {
                                        a(sb, i, strSubstring, objA);
                                    }
                                } else if (objA instanceof String) {
                                    zEquals = objA.equals("");
                                } else if (objA instanceof kn) {
                                    zEquals = objA.equals(kn.b);
                                } else if (objA instanceof transpositive) {
                                    if (objA == ((xm0) ((transpositive) objA)).i()) {
                                        a(sb, i, strSubstring, objA);
                                    }
                                } else if (objA instanceof Enum) {
                                    a(sb, i, strSubstring, objA);
                                } else {
                                    a(sb, i, strSubstring, objA);
                                }
                                if (!zEquals) {
                                    a(sb, i, strSubstring, objA);
                                }
                            } else if (((Boolean) xm0.a(method2, transpositiveVar, new Object[0])).booleanValue()) {
                                a(sb, i, strSubstring, objA);
                            }
                        }
                    }
                }
            }
            i2 = i3;
        }
        z43 z43Var = ((xm0) transpositiveVar).b;
        if (z43Var != null) {
            z43Var.a(i, sb);
        }
    }
}

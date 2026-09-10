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

/* JADX INFO: compiled from: MessageLiteToString.java */
/* JADX INFO: loaded from: classes3.dex */
public final class starveling {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final char[] f22310attabal;

    static {
        char[] cArr = new char[80];
        f22310attabal = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void attabal(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = f22310attabal;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    public static String beachfront(privatdozent privatdozentVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        marial(privatdozentVar, sb, 0);
        return sb.toString();
    }

    public static String dern(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x0191  */
    /* JADX WARN: Code duplicated, block: B:68:0x0199  */
    /* JADX WARN: Code duplicated, block: B:70:0x019f  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:97:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0174, please report this as an issue */
    public static void marial(privatdozent privatdozentVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        Method method;
        Method method2;
        Object objRotuma;
        boolean zBooleanValue;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = privatdozentVar.getClass().getDeclaredMethods();
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
                    wireman(sb, i, strSubstring.substring(0, strSubstring.length() - 4), GeneratedMessageLite.rotuma(method4, privatdozentVar, new Object[0]));
                }
                i2 = i3;
            }
            if (!strSubstring.endsWith("Map") || strSubstring.equals("Map") || (method3 = (Method) entry.getValue()) == null || !method3.getReturnType().equals(Map.class) || method3.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method3.getModifiers())) {
                if (hashSet.contains("set" + strSubstring)) {
                    if (strSubstring.endsWith("Bytes")) {
                        if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                            method = (Method) entry.getValue();
                            method2 = (Method) map.get("has" + strSubstring);
                            if (method != null) {
                                objRotuma = GeneratedMessageLite.rotuma(method, privatdozentVar, new Object[0]);
                                if (method2 == null) {
                                    zBooleanValue = ((Boolean) GeneratedMessageLite.rotuma(method2, privatdozentVar, new Object[0])).booleanValue();
                                } else if (saneness(objRotuma)) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = true;
                                }
                                if (zBooleanValue) {
                                    wireman(sb, i, strSubstring, objRotuma);
                                }
                            }
                        }
                    } else {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has" + strSubstring);
                        if (method != null) {
                            objRotuma = GeneratedMessageLite.rotuma(method, privatdozentVar, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = ((Boolean) GeneratedMessageLite.rotuma(method2, privatdozentVar, new Object[0])).booleanValue();
                            } else if (saneness(objRotuma)) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = false;
                            }
                            if (zBooleanValue) {
                                wireman(sb, i, strSubstring, objRotuma);
                            }
                        }
                    }
                }
            } else {
                wireman(sb, i, strSubstring.substring(0, strSubstring.length() - 3), GeneratedMessageLite.rotuma(method3, privatdozentVar, new Object[0]));
            }
            i2 = i3;
        }
        if (privatdozentVar instanceof GeneratedMessageLite.dern) {
            Iterator<Map.Entry<T, Object>> itMolybdenite = ((GeneratedMessageLite.dern) privatdozentVar).extensions.molybdenite();
            while (itMolybdenite.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itMolybdenite.next();
                wireman(sb, i, X3.j.d + ((GeneratedMessageLite.wireman) entry2.getKey()).getNumber() + X3.j.e, entry2.getValue());
            }
        }
        nosophobia nosophobiaVar = ((GeneratedMessageLite) privatdozentVar).unknownFields;
        if (nosophobiaVar != null) {
            nosophobiaVar.impassible(sb, i);
        }
    }

    public static boolean saneness(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        }
        if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof ByteString) {
            return obj.equals(ByteString.EMPTY);
        }
        if (obj instanceof privatdozent) {
            return obj == ((privatdozent) obj).getDefaultInstanceForType();
        }
        return (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    public static void wireman(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                wireman(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                wireman(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        attabal(i, sb);
        sb.append(dern(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(coffeecake.dern((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(coffeecake.attabal((ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            marial((GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            attabal(i, sb);
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
        int i2 = i + 2;
        wireman(sb, i2, X3.i.W, entry.getKey());
        wireman(sb, i2, "value", entry.getValue());
        sb.append("\n");
        attabal(i, sb);
        sb.append("}");
    }
}

package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pb0;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.protobuf.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2137q0 {
    private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER;
    private static final String LIST_SUFFIX = "List";
    private static final String MAP_SUFFIX = "Map";

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        Arrays.fill(cArr, ' ');
    }

    private C2137q0() {
    }

    private static void indent(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = INDENT_BUFFER;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    private static boolean isDefaultValue(Object obj) {
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
        if (obj instanceof MessageLite) {
            return obj == ((MessageLite) obj).getDefaultInstanceForType();
        }
        return (obj instanceof java.lang.Enum) && ((java.lang.Enum) obj).ordinal() == 0;
    }

    private static String pascalCaseToSnakeCase(String str) {
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

    public static void printField(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                printField(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                printField(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        indent(i, sb);
        sb.append(pascalCaseToSnakeCase(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(Pb0.escapeText((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(Pb0.escapeBytes((ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            reflectivePrintWithIndent((GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            indent(i, sb);
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
        printField(sb, i2, "key", entry.getKey());
        printField(sb, i2, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
        sb.append("\n");
        indent(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0162  */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    /* JADX WARN: Code duplicated, block: B:67:0x017c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0183  */
    /* JADX WARN: Code duplicated, block: B:72:0x0191  */
    /* JADX WARN: Code duplicated, block: B:95:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00e7 A[SYNTHETIC] */
    private static void reflectivePrintWithIndent(MessageLite messageLite, StringBuilder sb, int i) {
        int i2;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        Object objInvokeOrDie;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        java.lang.reflect.Method[] declaredMethods = messageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            java.lang.reflect.Method method5 = declaredMethods[i3];
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
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith(LIST_SUFFIX) && !strSubstring.endsWith(BUILDER_LIST_SUFFIX) && !strSubstring.equals(LIST_SUFFIX) && (method4 = (java.lang.reflect.Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                printField(sb, i, strSubstring.substring(0, strSubstring.length() - 4), GeneratedMessageLite.invokeOrDie(method4, messageLite, new Object[0]));
            } else if (strSubstring.endsWith(MAP_SUFFIX) && !strSubstring.equals(MAP_SUFFIX) && (method3 = (java.lang.reflect.Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                printField(sb, i, strSubstring.substring(0, strSubstring.length() - 3), GeneratedMessageLite.invokeOrDie(method3, messageLite, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith(BYTES_SUFFIX)) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (java.lang.reflect.Method) entry.getValue();
                        method2 = (java.lang.reflect.Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objInvokeOrDie = GeneratedMessageLite.invokeOrDie(method, messageLite, new Object[0]);
                            if (method2 == null) {
                                if (!isDefaultValue(objInvokeOrDie)) {
                                    printField(sb, i, strSubstring, objInvokeOrDie);
                                }
                            } else if (((Boolean) GeneratedMessageLite.invokeOrDie(method2, messageLite, new Object[0])).booleanValue()) {
                                printField(sb, i, strSubstring, objInvokeOrDie);
                            }
                        }
                    }
                } else {
                    method = (java.lang.reflect.Method) entry.getValue();
                    method2 = (java.lang.reflect.Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objInvokeOrDie = GeneratedMessageLite.invokeOrDie(method, messageLite, new Object[0]);
                        if (method2 == null) {
                            if (!isDefaultValue(objInvokeOrDie)) {
                                printField(sb, i, strSubstring, objInvokeOrDie);
                            }
                        } else if (((Boolean) GeneratedMessageLite.invokeOrDie(method2, messageLite, new Object[0])).booleanValue()) {
                            printField(sb, i, strSubstring, objInvokeOrDie);
                        }
                    }
                }
            }
            i2 = 3;
        }
        if (messageLite instanceof GeneratedMessageLite.ExtendableMessage) {
            for (Map.Entry<FieldSet$FieldDescriptorLite<Object>, Object> entry2 : ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions) {
                printField(sb, i, "[" + ((C2107b0) entry2.getKey()).getNumber() + "]", entry2.getValue());
            }
        }
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) messageLite).unknownFields;
        if (unknownFieldSetLite != null) {
            unknownFieldSetLite.printWithIndent(sb, i);
        }
    }

    public static String toString(MessageLite messageLite, String str) {
        StringBuilder sbQ = DM.q("# ", str);
        reflectivePrintWithIndent(messageLite, sbQ, 0);
        return sbQ.toString();
    }
}

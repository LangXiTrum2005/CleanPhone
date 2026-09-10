package androidx.datastore.preferences.protobuf;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
final class MessageLiteToString {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f4883a;

    static {
        char[] cArr = new char[80];
        f4883a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i3 = 80;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(f4883a, 0, i3);
            i2 -= i3;
        }
    }

    public static void b(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i2, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i3 = 1; i3 < str.length(); i3++) {
                char cCharAt = str.charAt(i3);
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
            ByteString byteString = ByteString.f4747Y;
            sb.append(TextFormatEscaper.a(new ByteString.LiteralByteString(((String) obj).getBytes(Internal.f4857a))));
            sb.append(AbstractJsonLexerKt.STRING);
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(TextFormatEscaper.a((ByteString) obj));
            sb.append(AbstractJsonLexerKt.STRING);
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            c((GeneratedMessageLite) obj, sb, i2 + 2);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            a(i2, sb);
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
        int i4 = i2 + 2;
        b(sb, i4, "key", entry.getKey());
        b(sb, i4, "value", entry.getValue());
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        a(i2, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:132:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0157  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x0184  */
    /* JADX WARN: Code duplicated, block: B:74:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:78:0x0195  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cf  */
    public static void c(GeneratedMessageLite generatedMessageLite, StringBuilder sb, int i2) {
        int i3;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        Object objK;
        boolean zBooleanValue;
        boolean zEquals;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        java.lang.reflect.Method[] declaredMethods = generatedMessageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i3 = 3;
            if (i4 >= length) {
                break;
            }
            java.lang.reflect.Method method5 = declaredMethods[i4];
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
            String strSubstring = ((String) entry.getKey()).substring(i3);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (java.lang.reflect.Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                b(sb, i2, android.support.v4.media.a.f(4, 0, strSubstring), GeneratedMessageLite.k(method4, generatedMessageLite, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (java.lang.reflect.Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb, i2, android.support.v4.media.a.f(3, 0, strSubstring), GeneratedMessageLite.k(method3, generatedMessageLite, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (java.lang.reflect.Method) entry.getValue();
                        method2 = (java.lang.reflect.Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objK = GeneratedMessageLite.k(method, generatedMessageLite, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objK instanceof Boolean) {
                                    zEquals = !((Boolean) objK).booleanValue();
                                } else if (objK instanceof Integer) {
                                    if (((Integer) objK).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objK instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objK).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objK instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objK).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objK instanceof String) {
                                    zEquals = objK.equals("");
                                } else if (objK instanceof ByteString) {
                                    zEquals = objK.equals(ByteString.f4747Y);
                                } else if ((objK instanceof MessageLite) ? !((objK instanceof java.lang.Enum) && ((java.lang.Enum) objK).ordinal() == 0) : objK != ((MessageLite) objK).b()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) GeneratedMessageLite.k(method2, generatedMessageLite, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb, i2, strSubstring, objK);
                            }
                        }
                    }
                } else {
                    method = (java.lang.reflect.Method) entry.getValue();
                    method2 = (java.lang.reflect.Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objK = GeneratedMessageLite.k(method, generatedMessageLite, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objK instanceof Boolean) {
                                zEquals = !((Boolean) objK).booleanValue();
                            } else if (objK instanceof Integer) {
                                if (((Integer) objK).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objK instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objK).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objK instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objK).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objK instanceof String) {
                                zEquals = objK.equals("");
                            } else if (objK instanceof ByteString) {
                                zEquals = objK.equals(ByteString.f4747Y);
                            } else if (objK instanceof MessageLite) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) GeneratedMessageLite.k(method2, generatedMessageLite, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb, i2, strSubstring, objK);
                        }
                    }
                }
            }
            i3 = 3;
        }
        if (generatedMessageLite instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator itI = ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.i();
            while (itI.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itI.next();
                ((GeneratedMessageLite.ExtensionDescriptor) entry2.getKey()).getClass();
                b(sb, i2, "[1001]", entry2.getValue());
            }
        }
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != null) {
            for (int i5 = 0; i5 < unknownFieldSetLite.f4932a; i5++) {
                b(sb, i2, String.valueOf(unknownFieldSetLite.f4933b[i5] >>> 3), unknownFieldSetLite.f4934c[i5]);
            }
        }
    }
}

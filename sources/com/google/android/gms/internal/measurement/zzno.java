package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzno {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zznm zznmVar, String str) {
        StringBuilder sbX = a.x("# ", str);
        zzc(zznmVar, sbX, 0);
        return sbX.toString();
    }

    public static void zzb(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzd(i2, sb);
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
            zzlh zzlhVar = zzlh.zzb;
            sb.append(zzog.zza(new zzlg(((String) obj).getBytes(zzmp.zza))));
            sb.append(AbstractJsonLexerKt.STRING);
            return;
        }
        if (obj instanceof zzlh) {
            sb.append(": \"");
            sb.append(zzog.zza((zzlh) obj));
            sb.append(AbstractJsonLexerKt.STRING);
            return;
        }
        if (obj instanceof zzmf) {
            sb.append(" {");
            zzc((zzmf) obj, sb, i2 + 2);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            zzd(i2, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i4 = i2 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i4, "key", entry.getKey());
        zzb(sb, i4, "value", entry.getValue());
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        zzd(i2, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    private static void zzc(zznm zznmVar, StringBuilder sb, int i2) {
        int i3;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zznmVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i3 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
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
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i3);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i2, strSubstring.substring(0, strSubstring.length() - 4), zzmf.zzcr(method2, zznmVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i2, strSubstring.substring(0, strSubstring.length() - 3), zzmf.zzcr(method, zznmVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzcr = zzmf.zzcr(method4, zznmVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzcr instanceof Boolean) {
                            if (((Boolean) objZzcr).booleanValue()) {
                                zzb(sb, i2, strSubstring, objZzcr);
                            }
                        } else if (objZzcr instanceof Integer) {
                            if (((Integer) objZzcr).intValue() != 0) {
                                zzb(sb, i2, strSubstring, objZzcr);
                            }
                        } else if (objZzcr instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzcr).floatValue()) != 0) {
                                zzb(sb, i2, strSubstring, objZzcr);
                            }
                        } else if (!(objZzcr instanceof Double)) {
                            if (objZzcr instanceof String) {
                                zEquals = objZzcr.equals("");
                            } else if (objZzcr instanceof zzlh) {
                                zEquals = objZzcr.equals(zzlh.zzb);
                            } else if (objZzcr instanceof zznm) {
                                if (objZzcr != ((zznm) objZzcr).zzcE()) {
                                    zzb(sb, i2, strSubstring, objZzcr);
                                }
                            } else if (!(objZzcr instanceof Enum) || ((Enum) objZzcr).ordinal() != 0) {
                                zzb(sb, i2, strSubstring, objZzcr);
                            }
                            if (!zEquals) {
                                zzb(sb, i2, strSubstring, objZzcr);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzcr).doubleValue()) != 0) {
                            zzb(sb, i2, strSubstring, objZzcr);
                        }
                    } else if (((Boolean) zzmf.zzcr(method5, zznmVar, new Object[0])).booleanValue()) {
                        zzb(sb, i2, strSubstring, objZzcr);
                    }
                }
            }
            i3 = 3;
        }
        if (zznmVar instanceof zzmc) {
            Iterator itZzc = ((zzmc) zznmVar).zzb.zzc();
            if (itZzc.hasNext()) {
                throw null;
            }
        }
        zzoj zzojVar = ((zzmf) zznmVar).zzc;
        if (zzojVar != null) {
            zzojVar.zzj(sb, i2);
        }
    }

    private static void zzd(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i3 = 80;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(zza, 0, i3);
            i2 -= i3;
        }
    }
}

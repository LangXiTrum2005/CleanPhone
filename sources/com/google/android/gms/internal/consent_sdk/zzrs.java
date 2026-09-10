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

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzrs {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzrq zzrqVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzrqVar, sb, 0);
        return sb.toString();
    }

    public static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
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
            zzpm zzpmVar = zzpm.zzb;
            sb.append(zzsk.zza(new zzpk(((String) obj).getBytes(zzqs.zza))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzpm) {
            sb.append(": \"");
            sb.append(zzsk.zza((zzpm) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzqm) {
            sb.append(" {");
            zzd((zzqm) obj, sb, i + 2);
            sb.append("\n");
            zzc(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i3, X3.i.W, entry.getKey());
        zzb(sb, i3, "value", entry.getValue());
        sb.append("\n");
        zzc(i, sb);
        sb.append("}");
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    private static void zzd(zzrq zzrqVar, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzrqVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
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
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 4), zzqm.zzv(method2, zzrqVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 3), zzqm.zzv(method, zzrqVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzv = zzqm.zzv(method4, zzrqVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzv instanceof Boolean) {
                            if (((Boolean) objZzv).booleanValue()) {
                                zzb(sb, i, strSubstring, objZzv);
                            }
                        } else if (objZzv instanceof Integer) {
                            if (((Integer) objZzv).intValue() != 0) {
                                zzb(sb, i, strSubstring, objZzv);
                            }
                        } else if (objZzv instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzv).floatValue()) != 0) {
                                zzb(sb, i, strSubstring, objZzv);
                            }
                        } else if (!(objZzv instanceof Double)) {
                            if (objZzv instanceof String) {
                                zEquals = objZzv.equals("");
                            } else if (objZzv instanceof zzpm) {
                                zEquals = objZzv.equals(zzpm.zzb);
                            } else if (objZzv instanceof zzrq) {
                                if (objZzv != ((zzrq) objZzv).zzl()) {
                                    zzb(sb, i, strSubstring, objZzv);
                                }
                            } else if (!(objZzv instanceof Enum) || ((Enum) objZzv).ordinal() != 0) {
                                zzb(sb, i, strSubstring, objZzv);
                            }
                            if (!zEquals) {
                                zzb(sb, i, strSubstring, objZzv);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzv).doubleValue()) != 0) {
                            zzb(sb, i, strSubstring, objZzv);
                        }
                    } else if (((Boolean) zzqm.zzv(method5, zzrqVar, new Object[0])).booleanValue()) {
                        zzb(sb, i, strSubstring, objZzv);
                    }
                }
            }
            i2 = 3;
        }
        if (zzrqVar instanceof zzqk) {
            Iterator itZzf = ((zzqk) zzrqVar).zzb.zzf();
            if (itZzf.hasNext()) {
                throw null;
            }
        }
        zzsq zzsqVar = ((zzqm) zzrqVar).zzc;
        if (zzsqVar != null) {
            zzsqVar.zzg(sb, i);
        }
    }
}

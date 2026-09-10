package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i9.c f23522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i9.c f23523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i9.c f23524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i9.c[] f23525d;

    static {
        i9.c cVar = new i9.c(1L, -1, "commit_to_configuration_v2_api", true);
        f23522a = cVar;
        i9.c cVar2 = new i9.c(1L, -1, "get_serving_version_api", true);
        i9.c cVar3 = new i9.c(1L, -1, "get_experiment_tokens_api", true);
        i9.c cVar4 = new i9.c(2L, -1, "register_flag_update_listener_api", true);
        f23523b = cVar4;
        i9.c cVar5 = new i9.c(1L, -1, "sync_after_api", true);
        i9.c cVar6 = new i9.c(1L, -1, "sync_after_for_application_api", true);
        i9.c cVar7 = new i9.c(1L, -1, "set_app_wide_properties_api", true);
        i9.c cVar8 = new i9.c(1L, -1, "set_runtime_properties_api", true);
        i9.c cVar9 = new i9.c(1L, -1, "get_storage_info_api", true);
        f23524c = cVar9;
        f23525d = new i9.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9};
    }

    public static b6 b(Object obj) {
        if (obj == null) {
            return b6.T8;
        }
        if (obj instanceof String) {
            return new e6((String) obj);
        }
        if (obj instanceof Double) {
            return new o3((Double) obj);
        }
        if (obj instanceof Long) {
            return new o3(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new o3(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new c2((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            m1 m1Var = new m1();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m1Var.s(m1Var.q(), b(it.next()));
            }
            return m1Var;
        }
        y5 y5Var = new y5();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            b6 b6VarB = b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                y5Var.b((String) string, b6VarB);
            }
        }
        return y5Var;
    }

    public static String c(String str) {
        if (str.length() > 23) {
            int i10 = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i10 = length;
                    break;
                }
            }
            str = str.substring(i10 + 1);
        }
        String strConcat = "".concat(String.valueOf(str));
        return strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    public static String d(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length);
        for (byte b10 : bArr) {
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                        } else {
                            sb2.append((char) b10);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static void e(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static int f(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static b6 g(qa qaVar) {
        if (qaVar == null) {
            return b6.S8;
        }
        int iC = qaVar.C() - 1;
        if (iC == 1) {
            return qaVar.w() ? new e6(qaVar.x()) : b6.Z8;
        }
        if (iC == 2) {
            return qaVar.A() ? new o3(Double.valueOf(qaVar.B())) : new o3(null);
        }
        if (iC == 3) {
            return qaVar.y() ? new c2(Boolean.valueOf(qaVar.z())) : new c2(null);
        }
        if (iC != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listU = qaVar.u();
        ArrayList arrayList = new ArrayList();
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            arrayList.add(g((qa) it.next()));
        }
        return new c6(arrayList, qaVar.v());
    }

    public abstract int a();

    public abstract mh h(int i10);

    public abstract Object i(int i10);

    public abstract Object j(mh mhVar);
}

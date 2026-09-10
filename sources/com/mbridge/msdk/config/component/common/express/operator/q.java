package com.mbridge.msdk.config.component.common.express.operator;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f31932a;

    public q(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f31932a = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd A[Catch: Exception -> 0x016b, TRY_LEAVE, TryCatch #0 {Exception -> 0x016b, blocks: (B:36:0x0085, B:37:0x0095, B:52:0x00dd, B:39:0x0099, B:41:0x009f, B:42:0x00a9, B:44:0x00af, B:45:0x00b9, B:47:0x00bf, B:48:0x00c9, B:50:0x00cf, B:51:0x00d9), top: B:79:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x015b  */
    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        String strValueOf;
        int iIntValue;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("879"))) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Object objValueOf = "";
        String string = list.get(0) != null ? list.get(0).toString() : "";
        if (list.size() >= 2) {
            Object obj2 = list.get(1);
            if (obj2 instanceof Integer) {
                iIntValue = ((Integer) obj2).intValue();
            } else if (obj2 != null) {
                try {
                    iIntValue = Integer.parseInt(obj2.toString());
                } catch (NumberFormatException unused) {
                    iIntValue = 1;
                }
            } else {
                iIntValue = 1;
            }
            if (list.size() == 3) {
                Object obj3 = list.get(2);
                if (obj3 instanceof String) {
                    strValueOf = String.valueOf(obj3);
                } else {
                    strValueOf = "STRING";
                }
            } else {
                strValueOf = "STRING";
            }
        } else {
            strValueOf = "STRING";
            iIntValue = 1;
        }
        if (TextUtils.isEmpty(string)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (iIntValue != 1) {
            switch (strValueOf.hashCode()) {
                case -1838656495:
                    strValueOf.equals("STRING");
                    objValueOf = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, "");
                    break;
                case 72655:
                    if (!strValueOf.equals("INT")) {
                        objValueOf = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, "");
                    } else {
                        objValueOf = Integer.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, 0));
                    }
                    break;
                case 2342524:
                    if (!strValueOf.equals("LONG")) {
                        objValueOf = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, "");
                    } else {
                        objValueOf = Long.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, 0L));
                    }
                    break;
                case 66988604:
                    if (!strValueOf.equals("FLOAT")) {
                        objValueOf = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, "");
                    } else {
                        objValueOf = Float.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    }
                    break;
                case 782694408:
                    if (!strValueOf.equals("BOOLEAN")) {
                        objValueOf = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, "");
                    } else {
                        objValueOf = Boolean.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, false));
                    }
                    break;
                default:
                    objValueOf = com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, "");
                    break;
            }
        } else {
            try {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.mbridge.msdk.foundation.controller.c.n().d());
                switch (strValueOf.hashCode()) {
                    case -1838656495:
                        strValueOf.equals("STRING");
                        objValueOf = defaultSharedPreferences.getString(string, "");
                        break;
                    case 72655:
                        if (!strValueOf.equals("INT")) {
                            objValueOf = defaultSharedPreferences.getString(string, "");
                        } else {
                            objValueOf = Integer.valueOf(defaultSharedPreferences.getInt(string, 0));
                        }
                        break;
                    case 2342524:
                        if (!strValueOf.equals("LONG")) {
                            objValueOf = defaultSharedPreferences.getString(string, "");
                        } else {
                            objValueOf = Long.valueOf(defaultSharedPreferences.getLong(string, 0L));
                        }
                        break;
                    case 66988604:
                        if (!strValueOf.equals("FLOAT")) {
                            objValueOf = defaultSharedPreferences.getString(string, "");
                        } else {
                            objValueOf = Float.valueOf(defaultSharedPreferences.getFloat(string, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        }
                        break;
                    case 782694408:
                        if (!strValueOf.equals("BOOLEAN")) {
                            objValueOf = defaultSharedPreferences.getString(string, "");
                        } else {
                            objValueOf = Boolean.valueOf(defaultSharedPreferences.getBoolean(string, false));
                        }
                        break;
                    default:
                        objValueOf = defaultSharedPreferences.getString(string, "");
                        break;
                }
            } catch (Exception unused2) {
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objValueOf);
    }
}

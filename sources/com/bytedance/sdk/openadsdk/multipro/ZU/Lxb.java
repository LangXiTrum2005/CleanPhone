package com.bytedance.sdk.openadsdk.multipro.ZU;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.lc.Lxb.lc;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public static HashSet<String> Lxb = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.1
        {
            add("app_id");
            add("global_coppa");
            add("tt_gdpr");
            add("global_ccpa");
            add("keywords");
            add("extra_data");
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    private static lc LD() {
        try {
            if (Lxb()) {
                return com.bytedance.sdk.openadsdk.multipro.Lxb.Lxb.Lxb(kqm.Lxb());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean Lxb() {
        if (kqm.Lxb() != null) {
            return true;
        }
        sLN.LD("The context of SPHelper is null, please initialize sdk in main process");
        return false;
    }

    private static String ZU() {
        return DM.m(new StringBuilder(), com.bytedance.sdk.openadsdk.multipro.ZU.LD, "/t_sp/");
    }

    private static Context lk() {
        return kqm.Lxb();
    }

    private static String LD(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "?sp_file_name=".concat(String.valueOf(str));
    }

    public static synchronized void Lxb(String str, String str2, Boolean bool) {
        if (Lxb()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                    LD.Lxb(lk(), str, str2, bool);
                    return;
                }
                lc lcVarLD = LD();
                if (lcVarLD != null) {
                    Uri uri = Uri.parse(ZU() + "boolean/" + str2 + LD(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, bool);
                    lcVarLD.Lxb(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static String LD(String str, String str2, String str3) {
        if (!Lxb()) {
            return str3;
        }
        try {
            if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                return Lxb(lk(), str, str2, str3);
            }
            lc lcVarLD = LD();
            if (lcVarLD != null) {
                String strLxb = lcVarLD.Lxb(Uri.parse(ZU() + "string/" + str2 + LD(str)));
                if (strLxb != null && !strLxb.equals("null")) {
                    return strLxb;
                }
            }
            return str3;
        } catch (Throwable unused) {
        }
    }

    public static void LD(String str, String str2) {
        if (Lxb()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                    LD.LD(lk(), str, str2);
                    return;
                }
                lc lcVarLD = LD();
                if (lcVarLD != null) {
                    lcVarLD.Lxb(Uri.parse(ZU() + "long/" + str2 + LD(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void Lxb(String str, String str2, String str3) {
        if (Lxb()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                    LD.Lxb(lk(), str, str2, str3);
                    return;
                }
                lc lcVarLD = LD();
                if (lcVarLD != null) {
                    Uri uri = Uri.parse(ZU() + "string/" + str2 + LD(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str3);
                    lcVarLD.Lxb(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void Lxb(String str, String str2, Integer num) {
        if (Lxb()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                    LD.Lxb(lk(), str, str2, num);
                    return;
                }
                lc lcVarLD = LD();
                if (lcVarLD != null) {
                    Uri uri = Uri.parse(ZU() + "int/" + str2 + LD(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, num);
                    lcVarLD.Lxb(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void Lxb(String str, String str2, Long l) {
        if (Lxb()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                    LD.Lxb(lk(), str, str2, l);
                    return;
                }
                lc lcVarLD = LD();
                if (lcVarLD != null) {
                    Uri uri = Uri.parse(ZU() + "long/" + str2 + LD(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, l);
                    lcVarLD.Lxb(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void Lxb(String str, String str2, Float f) {
        if (Lxb()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                    LD.Lxb(lk(), str, str2, f);
                    return;
                }
                lc lcVarLD = LD();
                if (lcVarLD != null) {
                    Uri uri = Uri.parse(ZU() + "float/" + str2 + LD(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, f);
                    lcVarLD.Lxb(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static String Lxb(Context context, String str, String str2, String str3) {
        String strLxb = Lxb(str, str2);
        if (QAg.ebl(strLxb)) {
            return com.bytedance.sdk.component.LD.Lxb(context, strLxb).Lxb(str2, str3);
        }
        SharedPreferences sharedPreferencesLxb = LD.Lxb(context, strLxb);
        return sharedPreferencesLxb == null ? str3 : sharedPreferencesLxb.getString(str2, str3);
    }

    public static String Lxb(String str, String str2) {
        return Lxb.contains(str2) ? "pag_sp_bad_par" : str;
    }

    public static int Lxb(String str, String str2, int i) {
        if (!Lxb()) {
            return i;
        }
        try {
            if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                return Lxb(lk(), str, str2, i);
            }
            lc lcVarLD = LD();
            if (lcVarLD != null) {
                String strLxb = lcVarLD.Lxb(Uri.parse(ZU() + "int/" + str2 + LD(str)));
                if (strLxb != null && !strLxb.equals("null")) {
                    return Integer.parseInt(strLxb);
                }
            }
            return i;
        } catch (Throwable unused) {
        }
    }

    public static int Lxb(Context context, String str, String str2, int i) {
        String strLxb = Lxb(str, str2);
        if (QAg.ebl(strLxb)) {
            return com.bytedance.sdk.component.LD.Lxb(context, strLxb).Lxb(str2, i);
        }
        SharedPreferences sharedPreferencesLxb = LD.Lxb(context, strLxb);
        return sharedPreferencesLxb == null ? i : sharedPreferencesLxb.getInt(str2, i);
    }

    public static float Lxb(Context context, String str, String str2, float f) {
        String strLxb = Lxb(str, str2);
        if (QAg.ebl(strLxb)) {
            return com.bytedance.sdk.component.LD.Lxb(context, strLxb).Lxb(str2, f);
        }
        SharedPreferences sharedPreferencesLxb = LD.Lxb(context, strLxb);
        return sharedPreferencesLxb == null ? f : sharedPreferencesLxb.getFloat(str2, f);
    }

    public static boolean Lxb(String str, String str2, boolean z) {
        if (!Lxb()) {
            return z;
        }
        try {
            if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                return Lxb(lk(), str, str2, z);
            }
            lc lcVarLD = LD();
            if (lcVarLD != null) {
                String strLxb = lcVarLD.Lxb(Uri.parse(ZU() + "boolean/" + str2 + LD(str)));
                if (strLxb != null && !strLxb.equals("null")) {
                    return Boolean.parseBoolean(strLxb);
                }
            }
            return z;
        } catch (Throwable unused) {
        }
    }

    public static boolean Lxb(Context context, String str, String str2, boolean z) {
        String strLxb = Lxb(str, str2);
        if (QAg.ebl(strLxb)) {
            return com.bytedance.sdk.component.LD.Lxb(context, strLxb).Lxb(str2, z);
        }
        SharedPreferences sharedPreferencesLxb = LD.Lxb(context, strLxb);
        return sharedPreferencesLxb == null ? z : sharedPreferencesLxb.getBoolean(str2, z);
    }

    public static long Lxb(String str, String str2, long j) {
        if (!Lxb()) {
            return j;
        }
        try {
            if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                return Lxb(lk(), str, str2, j);
            }
            lc lcVarLD = LD();
            if (lcVarLD != null) {
                String strLxb = lcVarLD.Lxb(Uri.parse(ZU() + "long/" + str2 + LD(str)));
                if (strLxb != null && !strLxb.equals("null")) {
                    return Long.parseLong(strLxb);
                }
            }
            return j;
        } catch (Throwable unused) {
        }
    }

    public static long Lxb(Context context, String str, String str2, long j) {
        String strLxb = Lxb(str, str2);
        if (QAg.ebl(strLxb)) {
            return com.bytedance.sdk.component.LD.Lxb(context, strLxb).Lxb(str2, j);
        }
        SharedPreferences sharedPreferencesLxb = LD.Lxb(context, strLxb);
        return sharedPreferencesLxb == null ? j : sharedPreferencesLxb.getLong(str2, j);
    }

    public static void Lxb(String str) {
        if (Lxb()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                    LD.LD(lk(), str);
                    return;
                }
                lc lcVarLD = LD();
                if (lcVarLD != null) {
                    lcVarLD.Lxb(Uri.parse(ZU() + "clean" + LD(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}

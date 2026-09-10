package com.bytedance.sdk.openadsdk.multipro.mml;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.bytedance.sdk.component.mo.qdl.mo;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.core.yt;
import java.util.HashSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    public static HashSet<String> qdl = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.multipro.mml.qdl.1
        {
            add("app_id");
            add("tt_gdpr");
            add("extra_data");
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    private static Context lnr() {
        return yt.qdl();
    }

    private static String mml() {
        return a.r(new StringBuilder(), com.bytedance.sdk.openadsdk.multipro.mml.ud, "/t_sp/");
    }

    public static boolean qdl() {
        return yt.qdl() != null;
    }

    private static mo ud() {
        try {
            if (qdl()) {
                return com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(yt.qdl());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static synchronized void qdl(String str, String str2, Boolean bool) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    ud.qdl(lnr(), str, str2, bool);
                    return;
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    Uri uri = Uri.parse(mml() + "boolean/" + str2 + ud(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", bool);
                    moVarUd.qdl(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static String ud(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "?sp_file_name=".concat(String.valueOf(str));
    }

    public static String ud(String str, String str2, String str3) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    return qdl(lnr(), str, str2, str3);
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    String strQdl = moVarUd.qdl(Uri.parse(mml() + "string/" + str2 + ud(str)));
                    if (strQdl != null && !strQdl.equals(AbstractJsonLexerKt.NULL)) {
                        return strQdl;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return str3;
    }

    public static void ud(String str, String str2) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    ud.ud(lnr(), str, str2);
                    return;
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    moVarUd.qdl(Uri.parse(mml() + "long/" + str2 + ud(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void qdl(String str, String str2, String str3) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    ud.qdl(lnr(), str, str2, str3);
                    return;
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    Uri uri = Uri.parse(mml() + "string/" + str2 + ud(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", str3);
                    moVarUd.qdl(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void qdl(String str, String str2, Integer num) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    ud.qdl(lnr(), str, str2, num);
                    return;
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    Uri uri = Uri.parse(mml() + "int/" + str2 + ud(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", num);
                    moVarUd.qdl(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void qdl(String str, String str2, Long l2) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    ud.qdl(lnr(), str, str2, l2);
                    return;
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    Uri uri = Uri.parse(mml() + "long/" + str2 + ud(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", l2);
                    moVarUd.qdl(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static String qdl(Context context, String str, String str2, String str3) {
        String strQdl = qdl(str, str2);
        if (tvp.wd(strQdl)) {
            return com.bytedance.sdk.component.qdl.qdl(context, strQdl).qdl(str2, str3);
        }
        SharedPreferences sharedPreferencesQdl = ud.qdl(context, strQdl);
        return sharedPreferencesQdl == null ? str3 : sharedPreferencesQdl.getString(str2, str3);
    }

    public static String qdl(String str, String str2) {
        return qdl.contains(str2) ? "pag_sp_bad_par" : str;
    }

    public static int qdl(String str, String str2, int i2) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    return qdl(lnr(), str, str2, i2);
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    String strQdl = moVarUd.qdl(Uri.parse(mml() + "int/" + str2 + ud(str)));
                    if (strQdl != null && !strQdl.equals(AbstractJsonLexerKt.NULL)) {
                        return Integer.parseInt(strQdl);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return i2;
    }

    public static int qdl(Context context, String str, String str2, int i2) {
        String strQdl = qdl(str, str2);
        if (tvp.wd(strQdl)) {
            return com.bytedance.sdk.component.qdl.qdl(context, strQdl).qdl(str2, i2);
        }
        SharedPreferences sharedPreferencesQdl = ud.qdl(context, strQdl);
        return sharedPreferencesQdl == null ? i2 : sharedPreferencesQdl.getInt(str2, i2);
    }

    public static float qdl(Context context, String str, String str2, float f) {
        String strQdl = qdl(str, str2);
        if (tvp.wd(strQdl)) {
            return com.bytedance.sdk.component.qdl.qdl(context, strQdl).qdl(str2, f);
        }
        SharedPreferences sharedPreferencesQdl = ud.qdl(context, strQdl);
        return sharedPreferencesQdl == null ? f : sharedPreferencesQdl.getFloat(str2, f);
    }

    public static boolean qdl(String str, String str2, boolean z2) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    return qdl(lnr(), str, str2, z2);
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    String strQdl = moVarUd.qdl(Uri.parse(mml() + "boolean/" + str2 + ud(str)));
                    if (strQdl != null && !strQdl.equals(AbstractJsonLexerKt.NULL)) {
                        return Boolean.parseBoolean(strQdl);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return z2;
    }

    public static boolean qdl(Context context, String str, String str2, boolean z2) {
        String strQdl = qdl(str, str2);
        if (tvp.wd(strQdl)) {
            return com.bytedance.sdk.component.qdl.qdl(context, strQdl).qdl(str2, z2);
        }
        SharedPreferences sharedPreferencesQdl = ud.qdl(context, strQdl);
        return sharedPreferencesQdl == null ? z2 : sharedPreferencesQdl.getBoolean(str2, z2);
    }

    public static long qdl(String str, String str2, long j) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    return qdl(lnr(), str, str2, j);
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    String strQdl = moVarUd.qdl(Uri.parse(mml() + "long/" + str2 + ud(str)));
                    if (strQdl != null && !strQdl.equals(AbstractJsonLexerKt.NULL)) {
                        return Long.parseLong(strQdl);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return j;
    }

    public static long qdl(Context context, String str, String str2, long j) {
        String strQdl = qdl(str, str2);
        if (tvp.wd(strQdl)) {
            return com.bytedance.sdk.component.qdl.qdl(context, strQdl).qdl(str2, j);
        }
        SharedPreferences sharedPreferencesQdl = ud.qdl(context, strQdl);
        return sharedPreferencesQdl == null ? j : sharedPreferencesQdl.getLong(str2, j);
    }

    public static void qdl(String str) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    ud.ud(lnr(), str);
                    return;
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    moVarUd.qdl(Uri.parse(mml() + "clean" + ud(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}

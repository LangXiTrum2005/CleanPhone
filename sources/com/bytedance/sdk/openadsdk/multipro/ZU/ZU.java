package com.bytedance.sdk.openadsdk.multipro.ZU;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.kqm;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    private static String LD(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    private static boolean Lxb() {
        return kqm.Lxb() == null;
    }

    public static void Lxb(String str, String str2, Boolean bool) {
        if (Lxb()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb.Lxb(LD(str), str2, bool);
        } else {
            Lxb(LD(str), str2, bool);
        }
    }

    public static String LD(String str, String str2, String str3) {
        if (Lxb()) {
            return str3;
        }
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            return Lxb.LD(LD(str), str2, str3);
        }
        return Lxb.Lxb(kqm.Lxb(), LD(str), str2, str3);
    }

    public static void Lxb(String str, String str2, Long l) {
        if (Lxb()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb.Lxb(LD(str), str2, l);
        } else {
            Lxb(LD(str), str2, l);
        }
    }

    public static void Lxb(String str, String str2, String str3) {
        if (Lxb()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb.Lxb(LD(str), str2, str3);
        } else {
            Lxb(LD(str), str2, str3);
        }
    }

    public static void Lxb(String str, String str2, Integer num) {
        if (Lxb()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb.Lxb(LD(str), str2, num);
        } else {
            Lxb(LD(str), str2, num);
        }
    }

    public static int Lxb(String str, String str2, int i) {
        if (Lxb()) {
            return i;
        }
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            return Lxb.Lxb(LD(str), str2, i);
        }
        return Lxb.Lxb(kqm.Lxb(), LD(str), str2, i);
    }

    public static boolean Lxb(String str, String str2, boolean z) {
        if (Lxb()) {
            return z;
        }
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            return Lxb.Lxb(LD(str), str2, z);
        }
        return Lxb.Lxb(kqm.Lxb(), LD(str), str2, z);
    }

    public static long Lxb(String str, String str2, long j) {
        if (Lxb()) {
            return j;
        }
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            return Lxb.Lxb(LD(str), str2, j);
        }
        return Lxb.Lxb(kqm.Lxb(), LD(str), str2, j);
    }

    public static void Lxb(String str, String str2) {
        if (Lxb()) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                Lxb.LD(LD(str), str2);
            } else {
                LD.LD(kqm.Lxb(), LD(str), str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void Lxb(String str) {
        if (Lxb()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            Lxb.Lxb(LD(str));
        } else {
            LD.LD(kqm.Lxb(), LD(str));
        }
    }

    private static <T> void Lxb(String str, String str2, T t) {
        String strLxb = Lxb.Lxb(str, str2);
        if (QAg.ebl(strLxb)) {
            com.bytedance.sdk.component.LD.lk lkVarLD = com.bytedance.sdk.component.LD.Lxb(kqm.Lxb(), LD(strLxb)).LD();
            LD.Lxb(lkVarLD, str2, (Object) t);
            lkVarLD.apply();
        } else {
            SharedPreferences sharedPreferencesLxb = LD.Lxb(kqm.Lxb(), LD(strLxb));
            if (sharedPreferencesLxb == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesLxb.edit();
            LD.Lxb(editorEdit, str2, t);
            editorEdit.apply();
        }
    }
}

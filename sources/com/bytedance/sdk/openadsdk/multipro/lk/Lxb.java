package com.bytedance.sdk.openadsdk.multipro.lk;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.lc.Lxb.lc;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.multipro.ZU;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements com.bytedance.sdk.openadsdk.multipro.Lxb {
    private static String JXs() {
        return DM.m(new StringBuilder(), ZU.LD, "/t_frequent/");
    }

    public static boolean LD() {
        if (kqm.Lxb() == null) {
            return false;
        }
        try {
            lc lcVarZU = ZU();
            if (lcVarZU != null) {
                return "true".equals(lcVarZU.Lxb(Uri.parse(JXs() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static lc ZU() {
        try {
            if (kqm.Lxb() != null) {
                return com.bytedance.sdk.openadsdk.multipro.Lxb.Lxb.Lxb(kqm.Lxb());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String lk() {
        if (kqm.Lxb() == null) {
            return null;
        }
        try {
            lc lcVarZU = ZU();
            if (lcVarZU != null) {
                return lcVarZU.Lxb(Uri.parse(JXs() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public int Lxb(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public int Lxb(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public Cursor Lxb(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public Uri Lxb(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    public static boolean Lxb(String str) {
        if (kqm.Lxb() == null) {
            return false;
        }
        try {
            lc lcVarZU = ZU();
            if (lcVarZU != null) {
                return "true".equals(lcVarZU.Lxb(Uri.parse(JXs() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    @NonNull
    public String Lxb() {
        return "t_frequent";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Lxb
    public String Lxb(@NonNull Uri uri) {
        Objects.toString(uri);
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.ebl.Lxb.Lxb().Lxb(uri.getQueryParameter("rit")) ? "true" : "false";
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.ebl.Lxb.Lxb().LD() ? "true" : "false";
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.ebl.Lxb.Lxb().lk();
        }
        return null;
    }
}

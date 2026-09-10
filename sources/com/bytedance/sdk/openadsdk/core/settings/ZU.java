package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    private static volatile String LD = "";
    private static volatile String Lxb = "";
    private static volatile int ZU;
    private static String lk;

    public static String ZU() {
        if (TextUtils.isEmpty(lk)) {
            lk = kqm.Lxb().getPackageManager().getInstallerPackageName(nJ.JXs());
        }
        if (lk == null) {
            lk = "";
        }
        return lk;
    }

    public static String lk() {
        if (ZU != 0) {
            return LD;
        }
        Lxb();
        return LD;
    }

    public static String LD() {
        if (ZU != 0) {
            return Lxb;
        }
        Lxb();
        return Lxb;
    }

    public static void Lxb() {
        try {
            AppSet.getClient(kqm.Lxb()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                @Keep
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = ZU.Lxb = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = ZU.LD = appSetIdInfo.getId();
                    int unused3 = ZU.ZU = 1;
                }
            });
        } catch (Throwable unused) {
            ZU = 2;
        }
    }
}

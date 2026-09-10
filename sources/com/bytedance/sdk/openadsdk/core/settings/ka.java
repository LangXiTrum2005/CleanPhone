package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    private static String ik = null;
    private static volatile int ka = 0;
    private static volatile String lr = "";
    private static volatile String ri = "";

    public static String ik() {
        if (ka != 0) {
            return lr;
        }
        ri();
        return lr;
    }

    public static String ka() {
        if (TextUtils.isEmpty(ik)) {
            ik = nr.ri().getPackageManager().getInstallerPackageName(ig.di());
        }
        if (ik == null) {
            ik = "";
        }
        return ik;
    }

    public static String lr() {
        if (ka != 0) {
            return ri;
        }
        ri();
        return ri;
    }

    public static void ri() {
        try {
            AppSet.getClient(nr.ri()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = ka.ri = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = ka.lr = appSetIdInfo.getId();
                    int unused3 = ka.ka = 1;
                }
            });
        } catch (Throwable unused) {
            ka = 2;
        }
    }
}

package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.measurement.f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i0 {
    public static boolean a(int i10) {
        return (i10 == -1 || ((-16777216) & i10) == 0 || (i10 & 16711680) == 0) ? false : true;
    }

    public static int a(Context context, String str, String str2) {
        String packageName = "";
        try {
            try {
                packageName = com.mbridge.msdk.foundation.controller.c.n().i();
            } catch (Exception unused) {
                q0.b("ResourceUtil", "MBSDKContext.getInstance() is null resName:" + str);
            }
            if (a1.a(packageName) && context != null) {
                packageName = context.getPackageName();
            }
            if (a1.a(packageName) || context == null) {
                return -1;
            }
            return context.getResources().getIdentifier(str, str2, packageName);
        } catch (Exception unused2) {
            f2.s("Resource not found resName:", str, "ResourceUtil");
            return -1;
        }
    }

    public static Resources a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e10) {
                f2.q(e10, new StringBuilder("Resource error:"), "ResourceUtil");
            }
        }
        return null;
    }
}

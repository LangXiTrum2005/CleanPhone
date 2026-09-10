package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class jl {
    public static void qdl() {
        Context contextQdl = com.bytedance.sdk.openadsdk.core.yt.qdl();
        if (contextQdl != null && com.bytedance.sdk.component.utils.bjy.mml()) {
            String packageName = contextQdl.getPackageName();
            int i2 = contextQdl.getApplicationInfo().targetSdkVersion;
            try {
                String[] strArr = contextQdl.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr == null || strArr.length <= 0) {
                    return;
                }
                List<String> listUd = ud();
                for (String str : strArr) {
                    if (str != null) {
                        listUd.remove(str);
                    }
                }
                if (listUd.isEmpty()) {
                    return;
                }
                for (String str2 : listUd) {
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static List<String> ud() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }
}

package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class nr {
    private static List<String> lr() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }

    public static void ri() {
        Context contextRi = com.bytedance.sdk.openadsdk.core.nr.ri();
        if (contextRi != null && com.bytedance.sdk.component.utils.vr.ik()) {
            String packageName = contextRi.getPackageName();
            int i = contextRi.getApplicationInfo().targetSdkVersion;
            try {
                String[] strArr = contextRi.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr == null || strArr.length <= 0) {
                    return;
                }
                List<String> listLr = lr();
                for (String str : strArr) {
                    if (str != null) {
                        listLr.remove(str);
                    }
                }
                if (listLr.isEmpty()) {
                    return;
                }
                for (String str2 : listLr) {
                }
            } catch (Throwable unused) {
            }
        }
    }
}

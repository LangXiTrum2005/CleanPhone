package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VVE {
    private static List<String> LD() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0091 A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:35:0x0089, B:38:0x0091), top: B:46:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x0091, please report this as an issue */
    public static void Lxb() {
        int i;
        Context contextLxb = com.bytedance.sdk.openadsdk.core.kqm.Lxb();
        if (contextLxb != null && com.bytedance.sdk.component.utils.sLN.ZU()) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAdSdk-InitChecker", "The pangolin sdk access, the environment is debug, the initial configuration detection starts");
            String packageName = contextLxb.getPackageName();
            int i2 = contextLxb.getApplicationInfo().targetSdkVersion;
            boolean z = true;
            try {
                String[] strArr = contextLxb.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr == null || strArr.length <= 0) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAdSdk-InitChecker", "The uses-permission configuration in AndroidManifest.xml is missing, please refer to the access documentation");
                } else {
                    List<String> listLD = LD();
                    for (String str : strArr) {
                        if (str != null) {
                            listLD.remove(str);
                        }
                    }
                    if (listLD.isEmpty()) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("TTAdSdk-InitChecker", "AndroidManifest.xml permissions configuration is normal");
                    } else {
                        Iterator<String> it = listLD.iterator();
                        while (it.hasNext()) {
                            try {
                                com.bytedance.sdk.component.utils.sLN.Lxb("TTAdSdk-InitChecker", "    May be missing permissions：" + it.next() + "，Please refer to the access documentation");
                                z = false;
                            } catch (Throwable th) {
                                th = th;
                                z = false;
                                com.bytedance.sdk.component.utils.sLN.Lxb("TTAdSdk-InitChecker", "The usage-permission configuration error in AndroidManifest.xml, please refer to the access documentation", th);
                                i = Build.VERSION.SDK_INT;
                                if (i >= 23) {
                                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAdSdk-InitChecker", "No adaptation required for dynamic permissions：target=" + i2 + "&phone=" + i + ", require=23");
                                } else {
                                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAdSdk-InitChecker", "No adaptation required for dynamic permissions：target=" + i2 + "&phone=" + i + ", require=23");
                                }
                                if (!z) {
                                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAdSdk-InitChecker", "You have not configured permission, please refer to the access documentation, otherwise it will affect the conversion");
                                }
                                com.bytedance.sdk.component.utils.sLN.Lxb("TTAdSdk-InitChecker", "End of pangolin sdk initial configuration test");
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                i = Build.VERSION.SDK_INT;
                if (i >= 23 || i2 < 23) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAdSdk-InitChecker", "No adaptation required for dynamic permissions：target=" + i2 + "&phone=" + i + ", require=23");
                }
            } catch (Throwable th3) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAdSdk-InitChecker", "The dynamic permission is abnormal. Please check and read the access document in detail： ", th3);
            }
            if (!z) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAdSdk-InitChecker", "You have not configured permission, please refer to the access documentation, otherwise it will affect the conversion");
            }
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAdSdk-InitChecker", "End of pangolin sdk initial configuration test");
        }
    }
}

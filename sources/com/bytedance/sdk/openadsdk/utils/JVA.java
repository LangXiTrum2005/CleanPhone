package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ro0;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class JVA {
    private static String Lxb;

    public static String Lxb() {
        if (TextUtils.isEmpty(Lxb)) {
            StringBuilder sb = new StringBuilder();
            sb.append(Ro0.f3682a.getCacheDir());
            Lxb = DM.m(sb, File.separator, "proxy_cache");
        }
        return Lxb;
    }

    public static void Lxb(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}

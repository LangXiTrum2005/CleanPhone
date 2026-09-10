package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.kqm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    public static String Lxb = "com.bytedance.openadsdk";
    public static String LD = DM.m(new StringBuilder("content://"), Lxb, ".TTMultiProvider");

    static {
        Lxb();
    }

    public static void Lxb() {
        if (kqm.Lxb() != null) {
            Lxb = kqm.Lxb().getPackageName();
            LD = DM.m(new StringBuilder("content://"), Lxb, ".TTMultiProvider");
        }
    }
}

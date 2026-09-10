package com.umeng.commonsdk.debug;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
public class UMLogUtils {
    public static String makeUrl(String str) {
        return DM.B("https://developer.umeng.com/docs/66632/detail/", str, "?um_channel=sdk");
    }
}

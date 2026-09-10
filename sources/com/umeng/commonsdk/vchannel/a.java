package com.umeng.commonsdk.vchannel;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f2705a = "https://pslog.umeng.com";
    public static String b = "https://pslog.umeng.com/";
    public static String c = "explog";
    public static final String d = "analytics";
    public static final String e = "ekv";
    public static final String f = "id";
    public static final String g = "ts";
    public static final String h = "ds";
    public static final String i = "pn";
    public static String j = "";

    static {
        String strH = AbstractC5044xl.h("SUB", System.currentTimeMillis());
        StringBuilder sbO = DM.o(strH);
        sbO.append(String.format("%0" + (32 - strH.length()) + DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, 0));
        j = sbO.toString();
    }
}

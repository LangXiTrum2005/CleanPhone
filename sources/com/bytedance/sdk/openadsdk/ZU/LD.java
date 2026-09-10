package com.bytedance.sdk.openadsdk.ZU;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public static final String Lxb = com.bytedance.sdk.openadsdk.ZU.lk.Lxb.InterfaceC0082Lxb.Lxb;
    public static final String LD = com.bytedance.sdk.openadsdk.ZU.lk.Lxb.InterfaceC0082Lxb.LD;
    public static final String lk = com.bytedance.sdk.openadsdk.ZU.lk.Lxb.InterfaceC0082Lxb.lk;
    public static final String ZU = com.bytedance.sdk.openadsdk.ZU.lk.Lxb.InterfaceC0082Lxb.ZU;
    public static final String JXs = com.bytedance.sdk.openadsdk.ZU.lk.Lxb.InterfaceC0082Lxb.JXs;
    public static final String lc = com.bytedance.sdk.openadsdk.ZU.lk.Lxb.InterfaceC0082Lxb.lc;
    public static final Set<String> ebl = new HashSet(Arrays.asList(CampaignEx.JSON_NATIVE_VIDEO_CLICK, "show", "insight_log"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ZU.LD$LD, reason: collision with other inner class name */
    public static class C0078LD {
        public static int LD = 2;
        public static int Lxb = 1;
        public static int lk = 100;
    }

    public static class Lxb {
        public static String LD = "openAdLandPageLinks";
        public static String Lxb = "openDetailPage";
        public static String ZU = "saLandingPageLinks";
        public static String lk = "direct";
    }

    public static boolean Lxb(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}

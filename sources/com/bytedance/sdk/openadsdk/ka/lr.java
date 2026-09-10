package com.bytedance.sdk.openadsdk.ka;

import com.ironsource.C3700q2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public static final String ri = com.bytedance.sdk.openadsdk.ka.ik.ri.InterfaceC0264ri.ri;
    public static final String lr = com.bytedance.sdk.openadsdk.ka.ik.ri.InterfaceC0264ri.lr;
    public static final String ik = com.bytedance.sdk.openadsdk.ka.ik.ri.InterfaceC0264ri.ik;
    public static final String ka = com.bytedance.sdk.openadsdk.ka.ik.ri.InterfaceC0264ri.ka;
    public static final String fi = com.bytedance.sdk.openadsdk.ka.ik.ri.InterfaceC0264ri.fi;
    public static final String di = com.bytedance.sdk.openadsdk.ka.ik.ri.InterfaceC0264ri.di;
    public static final Set<String> xha = new HashSet(Arrays.asList("click", C3700q2.v, "insight_log"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.lr$lr, reason: collision with other inner class name */
    public static class C0265lr {
        public static int ik = 100;
        public static int lr = 2;
        public static int ri = 1;
    }

    public static class ri {
        public static String ik = "direct";
        public static String ka = "saLandingPageLinks";
        public static String lr = "openAdLandPageLinks";
        public static String ri = "openDetailPage";
    }

    public static boolean ri(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}

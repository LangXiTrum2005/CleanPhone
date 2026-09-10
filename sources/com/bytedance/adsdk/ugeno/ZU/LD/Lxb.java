package com.bytedance.adsdk.ugeno.ZU.LD;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lxb {
    public static final HashSet<String> Lxb = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", "muteVideo", "preventEvent"));
    protected String JXs;
    protected com.bytedance.adsdk.ugeno.ZU.LD.Lxb LD;
    protected String ZU;
    protected String ebl;
    protected Map<String, String> lc;
    protected com.bytedance.adsdk.ugeno.LD.lk lk;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ZU.LD.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0035Lxb {
        public static Lxb Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar, String str, com.bytedance.adsdk.ugeno.ZU.LD.Lxb lxb) {
            if (lxb == null) {
                return null;
            }
            String strLD = lxb.LD();
            if (Lxb.Lxb.contains(strLD)) {
                return new lk(lkVar, str, lxb);
            }
            strLD.getClass();
            if (strLD.equals("update")) {
                return new ZU(lkVar, str, lxb);
            }
            if (strLD.equals("emit")) {
                return new LD(lkVar, str, lxb);
            }
            return null;
        }
    }

    public Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar, String str, com.bytedance.adsdk.ugeno.ZU.LD.Lxb lxb) {
        this.lk = lkVar;
        this.LD = lxb;
        this.ebl = str;
        LD();
    }

    private void LD() {
        com.bytedance.adsdk.ugeno.ZU.LD.Lxb lxb = this.LD;
        if (lxb == null) {
            return;
        }
        this.ZU = lxb.Lxb();
        this.JXs = this.LD.LD();
        this.lc = this.LD.lk();
    }

    public abstract void Lxb();
}

package com.bytedance.adsdk.ugeno.mml.ud;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.mml.mo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class qdl {
    public static final HashSet<String> qdl = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", "muteVideo", "preventEvent"));
    protected String jpc;
    protected com.bytedance.adsdk.ugeno.ud.lnr lnr;
    protected String mml;
    protected Map<String, String> mo;
    protected String mzz;
    protected mo.qdl ud;
    protected String wd;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.mml.ud.qdl$qdl, reason: collision with other inner class name */
    public static class C0064qdl {
        public static qdl qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, mo.qdl qdlVar) {
            if (qdlVar == null) {
                return null;
            }
            com.bytedance.adsdk.ugeno.mml.ud udVarQdl = com.bytedance.adsdk.ugeno.mml.mml.qdl(qdlVar.ud());
            if (udVarQdl == null) {
                return new lnr(lnrVar, str, qdlVar);
            }
            qdl qdlVarQdl = udVarQdl.qdl(lnrVar, str, qdlVar);
            return qdlVarQdl == null ? new lnr(lnrVar, str, qdlVar) : qdlVarQdl;
        }
    }

    public qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, mo.qdl qdlVar) {
        this.lnr = lnrVar;
        this.ud = qdlVar;
        this.wd = str;
        mzz();
    }

    private void mzz() {
        mo.qdl qdlVar = this.ud;
        if (qdlVar == null) {
            return;
        }
        this.mml = qdlVar.qdl();
        this.mzz = this.ud.ud();
        Map<String, String> mapLnr = this.ud.lnr();
        this.mo = mapLnr;
        if (mapLnr == null || mapLnr.isEmpty() || !this.mo.containsKey("emitCustomEvent")) {
            return;
        }
        this.jpc = this.mo.get("emitCustomEvent");
    }

    public void lnr() {
        if (mml()) {
            mo.qdl qdlVar = new mo.qdl();
            qdlVar.qdl("custom");
            qdlVar.ud("emit");
            HashMap map = new HashMap();
            map.put("name", this.jpc);
            qdlVar.qdl(map);
            new ud(this.lnr, this.mzz, qdlVar).qdl();
        }
    }

    public boolean mml() {
        return !TextUtils.isEmpty(this.jpc);
    }

    public abstract void qdl();

    public void ud() {
        lnr();
    }
}

package com.bytedance.adsdk.ugeno.ka.lr;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ka.di;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri {
    public static final HashSet<String> ri = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", "muteVideo", "preventEvent"));
    protected Map<String, String> di;
    protected String fi;
    protected com.bytedance.adsdk.ugeno.lr.ik ik;
    protected String ka;
    protected di.ri lr;
    protected String mj;
    protected String xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.lr.ri$ri, reason: collision with other inner class name */
    public static class C0192ri {
        public static ri ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, di.ri riVar) {
            if (riVar == null) {
                return null;
            }
            String strLr = riVar.lr();
            riVar.ri();
            com.bytedance.adsdk.ugeno.ka.lr lrVarRi = com.bytedance.adsdk.ugeno.ka.ka.ri(strLr);
            if (lrVarRi == null && (TextUtils.isEmpty(riVar.ri()) || !TextUtils.equals(riVar.ri(), "global"))) {
                lrVarRi = com.bytedance.adsdk.ugeno.ka.ka.ri(riVar.fi());
            }
            if (lrVarRi == null) {
                return new ik(ikVar, str, riVar);
            }
            ri riVarRi = lrVarRi.ri(ikVar, str, riVar);
            return riVarRi == null ? new ik(ikVar, str, riVar) : riVarRi;
        }
    }

    public ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, di.ri riVar) {
        this.ik = ikVar;
        this.lr = riVar;
        this.xha = str;
        fi();
    }

    private void fi() {
        di.ri riVar = this.lr;
        if (riVar == null) {
            return;
        }
        this.ka = riVar.ri();
        this.fi = this.lr.lr();
        Map<String, String> mapIk = this.lr.ik();
        this.di = mapIk;
        if (mapIk == null || mapIk.isEmpty() || !this.di.containsKey("emitCustomEvent")) {
            return;
        }
        this.mj = this.di.get("emitCustomEvent");
    }

    public void ik() {
        if (ka()) {
            di.ri riVar = new di.ri();
            riVar.ri("custom");
            riVar.lr("emit");
            HashMap map = new HashMap();
            map.put("name", this.mj);
            riVar.ri(map);
            new lr(this.ik, this.fi, riVar).ri();
        }
    }

    public boolean ka() {
        return !TextUtils.isEmpty(this.mj);
    }

    public void lr() {
        ik();
    }

    public abstract void ri();
}

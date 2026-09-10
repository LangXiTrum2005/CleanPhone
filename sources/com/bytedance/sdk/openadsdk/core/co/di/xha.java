package com.bytedance.sdk.openadsdk.core.co.di;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.co;
import com.bytedance.adsdk.ugeno.core.sf;
import com.bytedance.adsdk.ugeno.core.slm;
import com.bytedance.adsdk.ugeno.core.vr;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.model.oh;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.ironsource.C3700q2;
import java.util.HashMap;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends ka {
    private float dw;
    private com.bytedance.adsdk.ugeno.lr.ik fr;
    private float hcw;
    private com.bytedance.adsdk.ugeno.lr.ik igq;
    private boolean oh;
    private boolean ory;
    private com.bytedance.adsdk.ugeno.lr.ik su;
    private float xd;
    private com.bytedance.sdk.openadsdk.core.widget.fi zf;

    public xha(Context context, wjv wjvVar, boolean z, ri riVar, ViewGroup viewGroup) {
        super(context, wjvVar, z, riVar, viewGroup);
        this.ory = false;
        this.oh = true;
        if (TextUtils.equals(this.uq, "fullscreen_interstitial_ad")) {
            this.dw = this.fi.mhp();
        } else if (TextUtils.equals(this.uq, "rewarded_video")) {
            this.dw = this.fi.plm();
        }
    }

    private void aw() {
        sf sfVar = new sf();
        HashMap map = new HashMap();
        map.put("image_info", this.di.sf());
        map.put("cache_dir", this.di.bgr());
        sfVar.ri(map);
        sfVar.ri(this.lr);
        sfVar.ri(this.ka);
        sfVar.lr(this.ay);
        this.ri.ri("ad", sfVar);
    }

    private int bgr() {
        aw();
        try {
            this.ri.ri(this.ay, this.ik);
            if (this.ik != null) {
                vr();
                co();
            }
            if (this instanceof com.bytedance.sdk.openadsdk.core.co.di.ri.di) {
                return 0;
            }
            this.di.oh().lr();
            this.di.oh().ik();
            return 0;
        } catch (NoClassDefFoundError unused) {
            return Opcodes.F2L;
        } catch (UnsatisfiedLinkError unused2) {
            return Opcodes.F2I;
        } catch (Throwable unused3) {
            return Opcodes.F2D;
        }
    }

    private void co() {
        com.bytedance.adsdk.ugeno.lr.ik ikVar = this.fr;
        if (ikVar != null) {
            ikVar.ik(8);
        }
        com.bytedance.adsdk.ugeno.lr.ik ikVar2 = this.su;
        if (ikVar2 != null) {
            ikVar2.ik(8);
        }
    }

    private void ik(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.lr.ik ikVar = this.su;
        if (ikVar != null && (ikVar instanceof com.bytedance.sdk.openadsdk.core.co.lr.di)) {
            int i2 = 0;
            if (!z && !z2) {
                i2 = 8;
            }
            ikVar.ik(i2);
        }
    }

    private boolean slm() {
        wjv wjvVar = this.fi;
        return wjvVar != null && wjvVar.akr() == 1;
    }

    private void vr() {
        com.bytedance.adsdk.ugeno.lr.ik<View> ikVar = this.ik;
        if (ikVar == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.lr.ik<T> ikVarDi = ikVar.di("RVCountdown");
        this.fr = ikVarDi;
        if (ikVarDi == 0) {
            this.fr = this.ik.di("FVCountdown");
        }
        if (this.fr == null) {
            this.fr = this.ik.di("AOCountdown");
        }
        com.bytedance.adsdk.ugeno.lr.ik<T> ikVarDi2 = this.ik.di("RVSkipView");
        this.su = ikVarDi2;
        if (ikVarDi2 == 0) {
            this.su = this.ik.di("FVSkipView");
        }
        if (this.su == null) {
            this.su = this.ik.di("AOSkipView");
        }
    }

    public int jbs() {
        aw();
        this.ri.ri((vr) this);
        this.ri.ri((slm) this);
        if (slm()) {
            this.ri.ri(new ik());
        }
        oh ohVarZv = this.fi.zv();
        if (ohVarZv == null) {
            try {
                if (com.bytedance.sdk.openadsdk.core.co.di.ri.di.ri(this.uq)) {
                    this.ik = this.ri.ri(this.ka, this.ay, ri(ohVarZv));
                } else {
                    this.ik = this.ri.ri(this.ka, this.ay, (JSONObject) null);
                }
            } catch (NoClassDefFoundError unused) {
                return Opcodes.F2L;
            } catch (UnsatisfiedLinkError unused2) {
                return Opcodes.F2I;
            } catch (Throwable unused3) {
                return Opcodes.F2D;
            }
        } else {
            this.ik = this.ri.ri(this.ka, this.ay, ri(ohVarZv));
        }
        if (this.ik != null) {
            vr();
            this.igq = this.ik.di("ProgressBar");
            co();
        }
        if (this instanceof com.bytedance.sdk.openadsdk.core.co.di.ri.di) {
            return 0;
        }
        this.di.oh().lr();
        this.di.oh().ik();
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.di.ka
    public int ka() {
        if (!this.di.xd()) {
            return jbs();
        }
        ac.ri("UGenRender", "renderWidget: only update data");
        return bgr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.di.ka
    public JSONObject lr() {
        return this.di.ik();
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.di.ka
    public com.bytedance.adsdk.ugeno.lr.ik mj() {
        com.bytedance.adsdk.ugeno.lr.ik<View> ikVar = this.ik;
        if (ikVar == null) {
            return null;
        }
        return ikVar.di("VideoV3");
    }

    public void qt() {
        co coVar = this.ri;
        if (coVar != null) {
            coVar.ri(this.ik, "videoFail", new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.di.ka
    public JSONObject ri() {
        JSONObject jSONObjectIk = this.di.ik();
        if (jSONObjectIk != null) {
            return jSONObjectIk.optJSONObject("xTemplate");
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.di.ka, com.bytedance.sdk.component.adexpress.dynamic.ka
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        co coVar;
        if (this.ik == null) {
            return;
        }
        boolean z2 = i == 1;
        if (TextUtils.equals(this.uq, "open_ad") && (coVar = this.ri) != null) {
            coVar.ri(this.ik, "countdown", charSequence);
        }
        lr(charSequence, z2, i2, z);
        ri(charSequence, z2, i2, z);
        ik(charSequence, z2, i2, z);
    }

    public void sf() {
        co coVar = this.ri;
        if (coVar != null) {
            coVar.ri(this.ik, C3700q2.v, new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.di.ka
    public com.bytedance.adsdk.ugeno.lr.ik xha() {
        com.bytedance.adsdk.ugeno.lr.ik<View> ikVar = this.ik;
        if (ikVar == null) {
            return null;
        }
        return ikVar.di("Playable");
    }

    private void lr(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.lr.ik ikVar = this.igq;
        if (ikVar != null && (ikVar instanceof com.bytedance.sdk.openadsdk.core.co.lr.ka.ik)) {
            try {
                int i2 = Integer.parseInt((String) charSequence);
                if (this.oh) {
                    this.hcw = i;
                    this.oh = false;
                }
                float f = (float) (((double) this.xd) + ((0.5d / ((double) this.hcw)) * 100.0d));
                this.xd = f;
                this.ri.ri(this.ik, "ProgressBar://progress", Float.valueOf(f), Float.valueOf(this.dw));
                if (!z2 && i2 > 0 && !z) {
                    ((com.bytedance.sdk.openadsdk.core.co.lr.ka.ik) this.igq).xha(500);
                    ((com.bytedance.sdk.openadsdk.core.co.lr.ka.ik) this.igq).ri((int) this.xd);
                    return;
                }
                ((com.bytedance.sdk.openadsdk.core.co.lr.ka.ik) this.igq).ik(8);
            } catch (Throwable th) {
                ac.ik("UGenRender", th.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.di.ka
    public void ri(com.bytedance.sdk.openadsdk.core.widget.fi fiVar) {
        this.zf = fiVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.openadsdk.core.co.di.ka, com.bytedance.adsdk.ugeno.core.vr
    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, com.bytedance.adsdk.ugeno.ka.di.ri riVar) {
        if (this.mj == null || riVar == null) {
            return;
        }
        String strLr = riVar.lr();
        strLr.getClass();
        int i = 7;
        int i2 = 6;
        int i3 = -1;
        switch (strLr) {
            case "sendLogExtra":
                new mj().ri("sendLogExtra", this.fi, this.uq, riVar.ik());
                break;
            case "sendAdExtra":
                new mj().ri("sendAdExtra", this.fi, this.uq, riVar.ik());
                break;
            case "openPrivacy":
                this.mj.ri(ikVar.sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.ri().ka(this.bgr).ik(this.vr).lr(this.slm).ri(this.bu).lr(this.nr).ri(this.tan).ik(i3).ri(this.wjv).ri(true).ri(ikVar.dzy()).lr(false).ri());
                break;
            case "pauseVideo":
            case "videoControl":
                i = 4;
                this.mj.ri(ikVar.sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.ri().ka(this.bgr).ik(this.vr).lr(this.slm).ri(this.bu).lr(this.nr).ri(this.tan).ik(i3).ri(this.wjv).ri(true).ri(ikVar.dzy()).lr(false).ri());
                break;
            case "skip":
                i = i2;
                this.mj.ri(ikVar.sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.ri().ka(this.bgr).ik(this.vr).lr(this.slm).ri(this.bu).lr(this.nr).ri(this.tan).ik(i3).ri(this.wjv).ri(true).ri(ikVar.dzy()).lr(false).ri());
                break;
            case "openPlayable":
                com.bytedance.sdk.openadsdk.core.jbs.vr vrVar = this.jbs;
                if (vrVar != null) {
                    vrVar.lr((JSONObject) null);
                    break;
                }
                break;
            case "convert":
                i = 2;
                this.mj.ri(ikVar.sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.ri().ka(this.bgr).ik(this.vr).lr(this.slm).ri(this.bu).lr(this.nr).ri(this.tan).ik(i3).ri(this.wjv).ri(true).ri(ikVar.dzy()).lr(false).ri());
                break;
            case "muteVideo":
                i = 5;
                this.mj.ri(ikVar.sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.ri().ka(this.bgr).ik(this.vr).lr(this.slm).ri(this.bu).lr(this.nr).ri(this.tan).ik(i3).ri(this.wjv).ri(true).ri(ikVar.dzy()).lr(false).ri());
                break;
            case "openLinks":
                new di().ri(ri(ikVar.sf()), this.lr instanceof Activity, this.fi, this.uq, riVar.ik(), this.zf);
                break;
            case "speedVideoOrTimer":
                ac.lr("UGenRender", "onUGenEvent: " + riVar.ik());
                i2 = 13;
                if (riVar.ik() != null && !riVar.ik().isEmpty()) {
                    try {
                        i3 = Integer.parseInt(riVar.ik().get("switch"));
                    } catch (Throwable th) {
                        ac.ik("UGenRender", th);
                    }
                    break;
                }
                i = i2;
                this.mj.ri(ikVar.sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.ri().ka(this.bgr).ik(this.vr).lr(this.slm).ri(this.bu).lr(this.nr).ri(this.tan).ik(i3).ri(this.wjv).ri(true).ri(ikVar.dzy()).lr(false).ri());
                break;
            case "dislike":
                i = 3;
                this.mj.ri(ikVar.sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.ri().ka(this.bgr).ik(this.vr).lr(this.slm).ri(this.bu).lr(this.nr).ri(this.tan).ik(i3).ri(this.wjv).ri(true).ri(ikVar.dzy()).lr(false).ri());
                break;
            default:
                i = 0;
                this.mj.ri(ikVar.sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.ri().ka(this.bgr).ik(this.vr).lr(this.slm).ri(this.bu).lr(this.nr).ri(this.tan).ik(i3).ri(this.wjv).ri(true).ri(ikVar.dzy()).lr(false).ri());
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.di.ka, com.bytedance.sdk.component.adexpress.dynamic.ka
    public void setSoundMute(boolean z) {
    }

    private void ri(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2;
        com.bytedance.adsdk.ugeno.lr.ik ikVar = this.fr;
        if (ikVar != null && (ikVar instanceof com.bytedance.sdk.openadsdk.core.co.lr.lr)) {
            try {
                i2 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                ac.ik("UGenRender", "parse duration exception", charSequence);
                i2 = 0;
            }
            if (!z2 && i2 > 0 && !this.ory) {
                this.fr.ik(0);
                if (!z && this.di.ri() && com.bytedance.sdk.component.adexpress.ka.di.lr(this.di.ka())) {
                    ((com.bytedance.sdk.openadsdk.core.co.lr.lr) this.fr).aw(String.valueOf(i));
                    return;
                } else if (!"open_ad".equals(this.di.ka()) && this.di.ri()) {
                    this.ory = true;
                    this.fr.ik(8);
                    return;
                } else {
                    ((com.bytedance.sdk.openadsdk.core.co.lr.lr) this.fr).aw(String.valueOf(charSequence));
                    return;
                }
            }
            this.fr.ik(8);
        }
    }

    private Context ri(View view) {
        Activity activityRi = view != null ? com.bytedance.sdk.component.utils.lr.ri(view) : null;
        return activityRi == null ? this.lr : activityRi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.di.ka
    public void ri(long j, long j2) {
        super.ri(j, j2);
        co coVar = this.ri;
        if (coVar != null) {
            coVar.ri(this.ik, "videoProgress", Long.valueOf(j), Long.valueOf(j2));
        }
    }

    public JSONObject ri(oh ohVar) {
        if (ohVar != null) {
            return ohVar.fi();
        }
        return null;
    }
}

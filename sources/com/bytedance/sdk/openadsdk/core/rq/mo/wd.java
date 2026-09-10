package com.bytedance.sdk.openadsdk.core.rq.mo;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.bjy;
import com.bytedance.adsdk.ugeno.core.fs;
import com.bytedance.adsdk.ugeno.core.jtx;
import com.bytedance.adsdk.ugeno.core.rq;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.model.ekw;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class wd extends mml {
    private com.bytedance.adsdk.ugeno.ud.lnr bqt;
    private boolean ekw;
    private float hkc;
    private float kdv;
    private com.bytedance.sdk.openadsdk.core.widget.mzz koa;
    private boolean rc;
    private com.bytedance.adsdk.ugeno.ud.lnr uw;
    private float vu;
    private com.bytedance.adsdk.ugeno.ud.lnr xmv;

    public wd(Context context, ljh ljhVar, boolean z2, qdl qdlVar, ViewGroup viewGroup) {
        super(context, ljhVar, z2, qdlVar, viewGroup);
        this.rc = false;
        this.ekw = true;
        if (TextUtils.equals(this.oth, "fullscreen_interstitial_ad")) {
            this.vu = this.mzz.ws();
        } else if (TextUtils.equals(this.oth, "rewarded_video")) {
            this.vu = this.mzz.qg();
        }
    }

    private boolean bjy() {
        ljh ljhVar = this.mzz;
        return ljhVar != null && ljhVar.iw() == 1;
    }

    private void exu() {
        rq rqVar = new rq();
        HashMap map = new HashMap();
        map.put("image_info", this.mo.rq());
        map.put("cache_dir", this.mo.rdp());
        rqVar.qdl(map);
        rqVar.qdl(this.ud);
        rqVar.qdl(this.mml);
        rqVar.ud(this.bch);
        this.qdl.qdl("ad", rqVar);
    }

    private void fs() {
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.uw;
        if (lnrVar != null) {
            lnrVar.lnr(8);
        }
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar2 = this.xmv;
        if (lnrVar2 != null) {
            lnrVar2.lnr(8);
        }
    }

    private void lnr(CharSequence charSequence, boolean z2, int i2, boolean z3) {
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.xmv;
        if (lnrVar != null && (lnrVar instanceof com.bytedance.sdk.openadsdk.core.rq.ud.mo)) {
            int i3 = 0;
            if (!z2 && !z3) {
                i3 = 8;
            }
            lnrVar.lnr(i3);
        }
    }

    private int rdp() {
        exu();
        try {
            this.qdl.qdl(this.bch, this.lnr);
            if (this.lnr != null) {
                if (TextUtils.equals(this.oth, "rewarded_video")) {
                    this.uw = this.lnr.mo("RVCountdown");
                    this.xmv = this.lnr.mo("RVSkipView");
                } else {
                    this.uw = this.lnr.mo("FVCountdown");
                    this.xmv = this.lnr.mo("FVSkipView");
                }
                fs();
            }
            if (this instanceof com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml) {
                return 0;
            }
            this.mo.ekw().ud();
            this.mo.ekw().lnr();
            return 0;
        } catch (NoClassDefFoundError unused) {
            return 140;
        } catch (UnsatisfiedLinkError unused2) {
            return 139;
        } catch (Throwable unused3) {
            return 141;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml
    public com.bytedance.adsdk.ugeno.ud.lnr jpc() {
        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = this.lnr;
        if (lnrVar == null) {
            return null;
        }
        return lnrVar.mo("VideoV3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml
    public int mml() {
        if (!this.mo.hkc()) {
            return tvp();
        }
        aaj.qdl("UGenRender", "renderWidget: only update data");
        return rdp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml
    public JSONObject qdl() {
        JSONObject jSONObjectLnr = this.mo.lnr();
        if (jSONObjectLnr != null) {
            return jSONObjectLnr.optJSONObject("xTemplate");
        }
        return null;
    }

    public void rq() {
        fs fsVar = this.qdl;
        if (fsVar != null) {
            fsVar.qdl(this.lnr, "show", new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml, com.bytedance.sdk.component.adexpress.dynamic.mml
    public void setSoundMute(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml, com.bytedance.sdk.component.adexpress.dynamic.mml
    public void setTime(CharSequence charSequence, int i2, int i3, boolean z2) {
        if (this.lnr == null) {
            return;
        }
        boolean z3 = i2 == 1;
        ud(charSequence, z3, i3, z2);
        qdl(charSequence, z3, i3, z2);
        lnr(charSequence, z3, i3, z2);
    }

    public void to() {
        fs fsVar = this.qdl;
        if (fsVar != null) {
            fsVar.qdl(this.lnr, "videoFail", new Object[0]);
        }
    }

    public int tvp() {
        exu();
        this.qdl.qdl((bjy) this);
        this.qdl.qdl((jtx) this);
        if (bjy()) {
            this.qdl.qdl(new lnr());
        }
        ekw ekwVarKr = this.mzz.kr();
        if (ekwVarKr == null) {
            try {
                if (com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml.qdl(this.oth)) {
                    this.lnr = this.qdl.qdl(this.mml, this.bch, qdl(ekwVarKr));
                } else {
                    this.lnr = this.qdl.qdl(this.mml, this.bch, (JSONObject) null);
                }
            } catch (NoClassDefFoundError unused) {
                return 140;
            } catch (UnsatisfiedLinkError unused2) {
                return 139;
            } catch (Throwable unused3) {
                return 141;
            }
        } else {
            this.lnr = this.qdl.qdl(this.mml, this.bch, qdl(ekwVarKr));
        }
        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = this.lnr;
        if (lnrVar != null) {
            com.bytedance.adsdk.ugeno.ud.lnr<T> lnrVarMo = lnrVar.mo("RVCountdown");
            this.uw = lnrVarMo;
            if (lnrVarMo == 0) {
                this.uw = this.lnr.mo("FVCountdown");
            }
            com.bytedance.adsdk.ugeno.ud.lnr<T> lnrVarMo2 = this.lnr.mo("RVSkipView");
            this.xmv = lnrVarMo2;
            if (lnrVarMo2 == 0) {
                this.xmv = this.lnr.mo("FVSkipView");
            }
            this.bqt = this.lnr.mo("ProgressBar");
            fs();
        }
        if (this instanceof com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml) {
            return 0;
        }
        this.mo.ekw().ud();
        this.mo.ekw().lnr();
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml
    public JSONObject ud() {
        return this.mo.lnr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml
    public com.bytedance.adsdk.ugeno.ud.lnr wd() {
        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = this.lnr;
        if (lnrVar == null) {
            return null;
        }
        return lnrVar.mo("Playable");
    }

    private void ud(CharSequence charSequence, boolean z2, int i2, boolean z3) {
        int i3;
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.bqt;
        if (lnrVar != null && (lnrVar instanceof com.bytedance.sdk.openadsdk.core.rq.ud.lnr.lnr)) {
            try {
                i3 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                aaj.lnr("UGenRender", "parse duration exception", charSequence);
                i3 = 0;
            }
            if (z3 || i3 <= 0 || z2) {
                ((com.bytedance.sdk.openadsdk.core.rq.ud.lnr.lnr) this.bqt).lnr(8);
                return;
            }
            if (this.ekw) {
                this.kdv = i2;
                this.ekw = false;
            }
            float f = (float) (((0.5d / ((double) this.kdv)) * 100.0d) + ((double) this.hkc));
            this.hkc = f;
            this.qdl.ud(this.lnr, "ProgressBar://progress", Float.valueOf(f), Float.valueOf(this.vu));
            ((com.bytedance.sdk.openadsdk.core.rq.ud.lnr.lnr) this.bqt).wd(500);
            ((com.bytedance.sdk.openadsdk.core.rq.ud.lnr.lnr) this.bqt).qdl((int) this.hkc);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml
    public void qdl(com.bytedance.sdk.openadsdk.core.widget.mzz mzzVar) {
        this.koa = mzzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml, com.bytedance.adsdk.ugeno.core.bjy
    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, com.bytedance.adsdk.ugeno.mml.mo.qdl qdlVar) {
        int i2 = 7;
        int i3 = 4;
        int i4 = -1;
        if (this.jpc == null || qdlVar == null) {
            return;
        }
        String strUd = qdlVar.ud();
        strUd.getClass();
        switch (strUd) {
            case "sendLogExtra":
                new jpc().qdl("sendLogExtra", this.mzz, this.oth, qdlVar.lnr());
                break;
            case "sendAdExtra":
                new jpc().qdl("sendAdExtra", this.mzz, this.oth, qdlVar.lnr());
                break;
            case "openPrivacy":
                this.jpc.qdl(lnrVar.rq(), i2, new com.bytedance.sdk.openadsdk.core.model.jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i4).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
            case "pauseVideo":
            case "videoControl":
                i2 = i3;
                this.jpc.qdl(lnrVar.rq(), i2, new com.bytedance.sdk.openadsdk.core.model.jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i4).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
            case "skip":
                i2 = 6;
                this.jpc.qdl(lnrVar.rq(), i2, new com.bytedance.sdk.openadsdk.core.model.jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i4).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
            case "openPlayable":
                com.bytedance.sdk.openadsdk.core.tvp.bjy bjyVar = this.tvp;
                if (bjyVar != null) {
                    bjyVar.ud((JSONObject) null);
                    break;
                }
                break;
            case "convert":
                i2 = 2;
                this.jpc.qdl(lnrVar.rq(), i2, new com.bytedance.sdk.openadsdk.core.model.jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i4).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
            case "muteVideo":
                i2 = 5;
                this.jpc.qdl(lnrVar.rq(), i2, new com.bytedance.sdk.openadsdk.core.model.jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i4).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
            case "openLinks":
                new mo().qdl(qdl(lnrVar.rq()), this.ud instanceof Activity, this.mzz, this.oth, qdlVar.lnr(), this.koa);
                break;
            case "speedVideoOrTimer":
                aaj.ud("UGenRender", "onUGenEvent: " + qdlVar.lnr());
                i3 = 13;
                if (qdlVar.lnr() != null && !qdlVar.lnr().isEmpty()) {
                    try {
                        i4 = Integer.parseInt(qdlVar.lnr().get("switch"));
                    } catch (Throwable th) {
                        aaj.lnr("UGenRender", th);
                    }
                    break;
                }
                i2 = i3;
                this.jpc.qdl(lnrVar.rq(), i2, new com.bytedance.sdk.openadsdk.core.model.jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i4).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
            case "dislike":
                i2 = 3;
                this.jpc.qdl(lnrVar.rq(), i2, new com.bytedance.sdk.openadsdk.core.model.jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i4).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
            default:
                i2 = 0;
                this.jpc.qdl(lnrVar.rq(), i2, new com.bytedance.sdk.openadsdk.core.model.jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).lnr(i4).qdl(this.ljh).qdl(true).qdl(lnrVar.hzv()).ud(false).qdl());
                break;
        }
    }

    private void qdl(CharSequence charSequence, boolean z2, int i2, boolean z3) {
        int i3;
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.uw;
        if (lnrVar != null && (lnrVar instanceof com.bytedance.sdk.openadsdk.core.rq.ud.ud)) {
            try {
                i3 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                aaj.lnr("UGenRender", "parse duration exception", charSequence);
                i3 = 0;
            }
            if (!z3 && i3 > 0 && !this.rc) {
                this.uw.lnr(0);
                if (!z2 && this.mo.qdl() && com.bytedance.sdk.component.adexpress.mml.mo.ud(this.mo.mml())) {
                    ((com.bytedance.sdk.openadsdk.core.rq.ud.ud) this.uw).rdp(String.valueOf(i2));
                    return;
                } else if (!"open_ad".equals(this.mo.mml()) && this.mo.qdl()) {
                    this.rc = true;
                    this.uw.lnr(8);
                    return;
                } else {
                    ((com.bytedance.sdk.openadsdk.core.rq.ud.ud) this.uw).rdp(String.valueOf(charSequence));
                    return;
                }
            }
            this.uw.lnr(8);
        }
    }

    private Context qdl(View view) {
        Activity activityQdl = view != null ? com.bytedance.sdk.component.utils.ud.qdl(view) : null;
        return activityQdl == null ? this.ud : activityQdl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.mo.mml
    public void qdl(long j, long j2) {
        super.qdl(j, j2);
        fs fsVar = this.qdl;
        if (fsVar != null) {
            fsVar.qdl(this.lnr, "videoProgress", Long.valueOf(j), Long.valueOf(j2));
        }
    }

    public JSONObject qdl(ekw ekwVar) {
        if (ekwVar != null) {
            return ekwVar.mzz();
        }
        return null;
    }
}

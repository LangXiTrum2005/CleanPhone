package com.bytedance.sdk.openadsdk.core.rq.mo;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.bjy;
import com.bytedance.adsdk.ugeno.core.exu;
import com.bytedance.adsdk.ugeno.core.fs;
import com.bytedance.adsdk.ugeno.core.jtx;
import com.bytedance.sdk.component.adexpress.ud.rdp;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.settings.rq;
import com.bytedance.sdk.openadsdk.core.tvp.aaj;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.smartdigimkt.o1.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mml implements bjy, jtx, com.bytedance.sdk.component.adexpress.dynamic.mml, com.bytedance.sdk.component.adexpress.ud.mml<View> {
    private static long bqt = 0;
    protected static int jyq = 24;
    private static float kdv;
    private static float koa;
    private static float rc;
    private static float vu;
    protected JSONObject bch;
    protected float bjy;
    private mzz ekw;
    protected long exc;
    protected com.bytedance.adsdk.ugeno.ud.lnr exu;
    protected com.bytedance.adsdk.ugeno.ud.lnr fs;
    private aaj hkc;
    protected long jl;
    protected com.bytedance.sdk.component.adexpress.ud.jpc jpc;
    protected float jtx;
    protected com.bytedance.adsdk.ugeno.ud.lnr<View> lnr;
    protected JSONObject mml;
    protected qdl mo;
    protected ljh mzz;
    protected String oth;
    protected fs qdl;
    protected float rdp;
    protected rdp to;
    protected com.bytedance.sdk.openadsdk.core.tvp.bjy tvp;
    protected Context ud;
    private com.bytedance.sdk.component.adexpress.ud.wd uw;
    protected FrameLayout wd;
    private boolean xmv;
    protected float yt;
    protected boolean aaj = true;
    public SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> ljh = new SparseArray<>();
    private String hzv = "";
    private final com.bytedance.sdk.component.jpc.jpc fco = new com.bytedance.sdk.component.jpc.jpc("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.rq.mo.mml.1
        @Override // java.lang.Runnable
        public void run() {
            mml mmlVar = mml.this;
            mmlVar.mml = mmlVar.qdl();
            if (mml.this.hkc != null) {
                mml mmlVar2 = mml.this;
                mmlVar2.hzv = mmlVar2.hkc.getUgenTemplateErrorReason();
            } else {
                mml.this.hzv = "expressView is null";
            }
            com.bytedance.sdk.openadsdk.core.rdp.lnr().post(mml.this.mrf);
        }
    };
    private final Runnable mrf = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rq.mo.mml.2
        @Override // java.lang.Runnable
        public void run() {
            if (mml.this.uw != null) {
                mml mmlVar = mml.this;
                mmlVar.ud(mmlVar.uw);
            }
        }
    };
    private boolean gy = false;
    protected AtomicBoolean rq = new AtomicBoolean(false);

    static {
        if (yt.qdl() != null) {
            jyq = yt.ud();
        }
    }

    public mml(Context context, ljh ljhVar, boolean z2, qdl qdlVar, ViewGroup viewGroup) {
        this.ud = context;
        this.xmv = z2;
        this.qdl = new fs(context);
        this.mzz = ljhVar;
        this.mo = qdlVar;
        this.wd = new FrameLayout(context);
        if (viewGroup instanceof aaj) {
            this.hkc = (aaj) viewGroup;
        }
        this.oth = qdlVar.mml();
        JSONObject jSONObjectUd = ud();
        this.bch = jSONObjectUd;
        this.ekw = new mzz(this.ud, this.mzz, this.oth, jSONObjectUd);
    }

    private void tvp() {
        com.bytedance.adsdk.ugeno.ud.lnr<T> lnrVarMzz;
        if (this.lnr == null) {
            return;
        }
        if (this.mzz.ks() && (lnrVarMzz = this.lnr.mzz("tvskip")) != 0) {
            lnrVarMzz.lnr(8);
        }
        com.bytedance.adsdk.ugeno.ud.lnr<T> lnrVarMzz2 = this.lnr.mzz("skip");
        if (lnrVarMzz2 != 0 && (lnrVarMzz2 instanceof com.bytedance.adsdk.ugeno.tvp.mml.lnr)) {
            if (!rq.lnr().rdp(String.valueOf(this.mzz.fz())) || this.mzz.taz() == 5 || this.mzz.taz() == 6 || this.mzz.ok() == 3) {
                ((com.bytedance.adsdk.ugeno.tvp.mml.lnr) lnrVarMzz2).bjy("local://tt_close_btn");
                lnrVarMzz2.ud();
            }
        }
    }

    public com.bytedance.adsdk.ugeno.ud.lnr jpc() {
        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = this.lnr;
        if (lnrVar == null) {
            return null;
        }
        return lnrVar.mzz("video");
    }

    public int mml() {
        this.qdl.qdl((bjy) this);
        this.qdl.qdl((jtx) this);
        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVarQdl = this.qdl.qdl(this.mml);
        this.lnr = lnrVarQdl;
        mzz mzzVar = this.ekw;
        if (mzzVar != null && lnrVarQdl != null) {
            mzzVar.qdl(lnrVarQdl);
        }
        if (!(this instanceof com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml)) {
            this.mo.ekw().ud();
            this.mo.ekw().lnr();
        }
        this.qdl.ud(this.bch);
        return 0;
    }

    public com.bytedance.adsdk.ugeno.ud.lnr mo() {
        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = this.lnr;
        if (lnrVar == null) {
            return null;
        }
        return lnrVar.mo("PlayableComponent");
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.mml
    public View mzz() {
        return this.wd;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mml
    public void onvideoComplate() {
    }

    public void qdl(long j, long j2) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mml
    public void setSoundMute(boolean z2) {
        com.bytedance.adsdk.ugeno.ud.lnr<T> lnrVarMzz;
        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = this.lnr;
        if (lnrVar == null || (lnrVarMzz = lnrVar.mzz("mute")) == 0) {
            return;
        }
        if (z2) {
            ((com.bytedance.adsdk.ugeno.tvp.mml.lnr) lnrVarMzz).bjy("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.tvp.mml.lnr) lnrVarMzz).bjy("local://tt_reward_full_unmute");
        }
        lnrVarMzz.ud();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mml
    public void setTime(CharSequence charSequence, int i2, int i3, boolean z2) {
        if (this.lnr == null) {
            return;
        }
        boolean z3 = i2 == 1;
        qdl(charSequence, z3, i3, z2);
        ud(charSequence, z3, i3, z2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mml
    public void setTimeUpdate(int i2) {
    }

    public com.bytedance.adsdk.ugeno.ud.lnr wd() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(com.bytedance.sdk.component.adexpress.ud.wd wdVar) {
        if (this instanceof com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml) {
            this.mo.mzz().mo();
        } else {
            this.mo.ekw().qdl();
        }
        if (this.mml == null) {
            wdVar.qdl(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen template is null real reason is " + this.hzv);
            return;
        }
        if (this.bch == null) {
            wdVar.qdl(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen data is null");
            return;
        }
        int iMml = mml();
        if (this.qdl.qdl()) {
            List<String> listUd = this.qdl.ud();
            if (listUd == null) {
                wdVar.qdl(138, "unknow widget");
                return;
            }
            wdVar.qdl(138, "unknow widget;" + listUd.toString());
            return;
        }
        if (iMml != 0) {
            wdVar.qdl(iMml, "ugen render fail");
            return;
        }
        if (this.lnr == null) {
            wdVar.qdl(138, "ugen render error");
            return;
        }
        ud udVar = new ud();
        this.to = udVar;
        udVar.qdl(true);
        this.to.qdl(lnr());
        setSoundMute(this.xmv);
        tvp();
        com.bytedance.adsdk.ugeno.ud.lnr lnrVarJpc = jpc();
        this.fs = lnrVarJpc;
        if (lnrVarJpc != null && (lnrVarJpc instanceof com.bytedance.sdk.openadsdk.core.rq.ud.mzz.ud)) {
            ((ud) this.to).qdl((FrameLayout) ((com.bytedance.sdk.openadsdk.core.rq.ud.mzz.ud) lnrVarJpc).mml());
        }
        mzz mzzVar = this.ekw;
        if (mzzVar != null) {
            mzzVar.qdl();
        }
        com.bytedance.adsdk.ugeno.ud.lnr lnrVarMo = mo();
        this.exu = lnrVarMo;
        if (lnrVarMo != null && (lnrVarMo instanceof com.bytedance.adsdk.ugeno.tvp.ud.ud)) {
            ((ud) this.to).ud((FrameLayout) lnrVarMo.rq());
        }
        if (vu.lnr(this.mzz)) {
            com.bytedance.adsdk.ugeno.ud.lnr lnrVarWd = wd();
            if (lnrVarWd instanceof com.bytedance.sdk.openadsdk.core.rq.ud.ud.ud) {
                ((ud) this.to).lnr(((com.bytedance.sdk.openadsdk.core.rq.ud.ud.ud) lnrVarWd).mml());
            }
        }
        int iFco = this.lnr.fco();
        int iMrf = this.lnr.mrf();
        this.wd.removeAllViews();
        this.wd.addView(this.lnr.rq(), new FrameLayout.LayoutParams(iFco, iMrf));
        float fVu = this.mo.vu();
        float fRc = this.mo.rc();
        float fUd = ax.ud(this.ud, fVu);
        float fUd2 = ax.ud(this.ud, fRc);
        if (lnr() != 7) {
            this.wd.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else if (fRc <= 0.0f) {
            this.wd.setLayoutParams(new FrameLayout.LayoutParams((int) fUd, -2));
        } else {
            this.wd.setLayoutParams(new FrameLayout.LayoutParams((int) fUd, (int) fUd2));
        }
        if (fRc <= 0.0f || fVu <= 0.0f) {
            this.wd.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int iLnr = ax.lnr(this.ud, this.wd.getMeasuredWidth());
            int iLnr2 = ax.lnr(this.ud, this.wd.getMeasuredHeight());
            this.to.qdl(iLnr);
            this.to.ud(iLnr2);
        } else {
            this.to.qdl(fVu);
            this.to.ud(fRc);
        }
        if (this.rq.get()) {
            wdVar.qdl(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "ugen render timeout");
        } else {
            this.qdl.qdl(this.lnr, "renderDidFinish", new Object[0]);
            wdVar.qdl(this.wd, this.to);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.mml
    public int lnr() {
        return this.mzz.ra();
    }

    @Override // com.bytedance.adsdk.ugeno.core.bjy
    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, com.bytedance.adsdk.ugeno.mml.mo.qdl qdlVar) {
    }

    public void qdl(ljh ljhVar, boolean z2, qdl qdlVar, ViewGroup viewGroup) {
        this.mzz = ljhVar;
        this.mo = qdlVar;
        this.oth = qdlVar.mml();
        this.bch = ud();
        if (viewGroup instanceof aaj) {
            this.hkc = (aaj) viewGroup;
        }
        this.xmv = z2;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.mml
    public void qdl(com.bytedance.sdk.component.adexpress.ud.wd wdVar) {
        this.uw = wdVar;
        fco.ud(this.fco);
    }

    public JSONObject qdl() {
        return this.mo.lnr();
    }

    public void qdl(boolean z2) {
        this.rq.set(z2);
    }

    public void qdl(com.bytedance.sdk.component.adexpress.ud.jpc jpcVar) {
        this.jpc = jpcVar;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.tvp.bjy bjyVar) {
        this.tvp = bjyVar;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.widget.mzz mzzVar) {
        mzz mzzVar2 = this.ekw;
        if (mzzVar2 != null) {
            mzzVar2.qdl(mzzVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.bjy
    public void qdl(exu exuVar, bjy.ud udVar, bjy.qdl qdlVar) {
        if (exuVar == null) {
            return;
        }
        if (exuVar.ud() == 1 || exuVar.ud() == 4) {
            qdl(exuVar);
        }
        if (exuVar.ud() == 10) {
            qdl(exuVar.lnr());
        }
        if (udVar == null || exuVar.mml() == null) {
            return;
        }
        udVar.qdl(exuVar.mml());
    }

    private void qdl(JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.ud.lnr<T> lnrVarMzz;
        if (this.lnr == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(strOptString2) || (lnrVarMzz = this.lnr.mzz(strOptString2)) == 0) {
            return;
        }
        if (TextUtils.equals(strOptString, "onShow")) {
            lnrVarMzz.lnr(0);
        } else if (TextUtils.equals(strOptString, "onDismiss")) {
            lnrVarMzz.lnr(8);
        }
    }

    private void qdl(exu exuVar) {
        JSONObject jSONObjectMml;
        boolean zQdl;
        int i2;
        String str;
        mzz mzzVar;
        mzz mzzVar2;
        mzz mzzVar3;
        int i3 = 5;
        boolean z2 = true;
        if (this.jpc == null) {
            return;
        }
        String strOptString = exuVar.lnr().optString("type");
        if ("swiperLeft".equals(strOptString) && (mzzVar3 = this.ekw) != null) {
            mzzVar3.ud();
            return;
        }
        if ("swiperRight".equals(strOptString) && (mzzVar2 = this.ekw) != null) {
            mzzVar2.lnr();
            return;
        }
        if (!"swiperClick".equals(strOptString) || (mzzVar = this.ekw) == null) {
            jSONObjectMml = null;
            zQdl = false;
            i2 = 0;
        } else {
            zQdl = mzzVar.qdl(exuVar);
            jSONObjectMml = this.ekw.mml();
            i2 = 2;
        }
        strOptString.getClass();
        switch (strOptString) {
            case "privacy":
                i3 = 7;
                break;
            case "feedback":
                i3 = 3;
                break;
            case "mute":
                break;
            case "skip":
                i3 = 6;
                break;
            case "video":
                i3 = 4;
                break;
            case "creative":
                i3 = 2;
                break;
            default:
                i3 = i2;
                break;
        }
        com.bytedance.adsdk.ugeno.ud.lnr lnrVarQdl = exuVar.qdl();
        com.bytedance.sdk.openadsdk.core.model.jtx.qdl qdlVarQdl = new com.bytedance.sdk.openadsdk.core.model.jtx.qdl().mml(this.rdp).lnr(this.bjy).ud(this.jtx).qdl(this.yt).ud(this.jl).qdl(this.exc).qdl(this.ljh);
        if (exuVar.ud() == 1 && !this.aaj) {
            z2 = false;
        }
        com.bytedance.sdk.openadsdk.core.model.jtx.qdl qdlVarQdl2 = qdlVarQdl.qdl(z2);
        if (lnrVarQdl == null) {
            str = "";
        } else {
            str = lnrVarQdl.hzv() + "_" + lnrVarQdl.hkc();
        }
        this.jpc.qdl(exuVar.qdl().rq(), i3, qdlVarQdl2.qdl(str).ud(zQdl).ud(jSONObjectMml).qdl());
    }

    public JSONObject ud() {
        return this.mo.kdv();
    }

    private void ud(CharSequence charSequence, boolean z2, int i2, boolean z3) {
        com.bytedance.adsdk.ugeno.ud.lnr<T> lnrVarMzz;
        View viewRq;
        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = this.lnr;
        if (lnrVar == null || (lnrVarMzz = lnrVar.mzz("skip")) == 0 || (viewRq = lnrVarMzz.rq()) == null) {
            return;
        }
        int i3 = 0;
        if (!z2 && !z3) {
            i3 = 8;
        }
        viewRq.setVisibility(i3);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    @Override // com.bytedance.adsdk.ugeno.core.jtx
    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, MotionEvent motionEvent) {
        int i2;
        int action = motionEvent.getAction();
        int i3 = 1;
        if (action != 0) {
            int i4 = -1;
            if (action == 1) {
                this.jtx = motionEvent.getRawX();
                this.yt = motionEvent.getRawY();
                if (Math.abs(this.jtx - this.rdp) < jyq || Math.abs(this.yt - this.bjy) >= jyq) {
                    this.aaj = false;
                }
                this.exc = System.currentTimeMillis();
            } else if (action == 2) {
                rc = Math.abs(motionEvent.getX() - koa) + rc;
                kdv = Math.abs(motionEvent.getY() - vu) + kdv;
                koa = motionEvent.getX();
                vu = motionEvent.getY();
                if (System.currentTimeMillis() - bqt > 200) {
                    float f = rc;
                    int i5 = jyq;
                    if (f <= i5 && kdv <= i5) {
                        i3 = 2;
                    }
                } else {
                    i3 = 2;
                }
                if (Math.abs(motionEvent.getRawX() - this.rdp) >= jyq || Math.abs(motionEvent.getRawY() - this.bjy) >= jyq) {
                    this.aaj = false;
                }
                i4 = i3;
                this.jtx = motionEvent.getRawX();
                this.yt = motionEvent.getRawY();
                if (Math.abs(this.jtx - this.rdp) < jyq) {
                    this.aaj = false;
                } else {
                    this.aaj = false;
                }
                this.exc = System.currentTimeMillis();
            }
            i2 = i4;
        } else {
            this.jl = System.currentTimeMillis();
            this.rdp = motionEvent.getRawX();
            this.bjy = motionEvent.getRawY();
            this.aaj = true;
            bqt = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.to.lnr.qdl(motionEvent);
            i2 = 0;
        }
        this.ljh.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl(i2, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }

    private void qdl(CharSequence charSequence, boolean z2, int i2, boolean z3) {
        com.bytedance.adsdk.ugeno.ud.lnr<T> lnrVarMzz;
        int i3;
        com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar = this.lnr;
        if (lnrVar == null || (lnrVarMzz = lnrVar.mzz(b.l3)) == 0) {
            return;
        }
        View viewRq = lnrVarMzz.rq();
        if (viewRq instanceof TextView) {
            try {
                i3 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                com.bytedance.sdk.component.utils.aaj.lnr("UGenRender", "parse duration exception", charSequence);
                i3 = 0;
            }
            if (!z3 && i3 > 0 && !this.gy) {
                viewRq.setVisibility(0);
                if (!z2 && this.mo.qdl() && com.bytedance.sdk.component.adexpress.mml.mo.ud(this.mo.mml())) {
                    ((TextView) viewRq).setText(String.format(com.bytedance.sdk.component.utils.ljh.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), "tt_reward_full_skip"), Integer.valueOf(i2)));
                    return;
                }
                if (!"open_ad".equals(this.mo.mml()) && this.mo.qdl()) {
                    this.gy = true;
                    viewRq.setVisibility(8);
                    return;
                } else {
                    ((TextView) viewRq).setText(((Object) charSequence) + "s");
                    return;
                }
            }
            viewRq.setVisibility(8);
        }
    }
}

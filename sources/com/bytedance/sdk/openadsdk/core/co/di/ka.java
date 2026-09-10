package com.bytedance.sdk.openadsdk.core.co.di;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.aw;
import com.bytedance.adsdk.ugeno.core.co;
import com.bytedance.adsdk.ugeno.core.slm;
import com.bytedance.adsdk.ugeno.core.vr;
import com.bytedance.sdk.component.adexpress.lr.bgr;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.core.jbs.ac;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.settings.sf;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka implements slm, vr, com.bytedance.sdk.component.adexpress.dynamic.ka, com.bytedance.sdk.component.adexpress.lr.ka<View> {
    protected static int ihz = 24;
    protected com.bytedance.adsdk.ugeno.lr.ik aw;
    protected JSONObject ay;
    protected float bgr;
    protected float bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.lr.ik f18108co;
    protected ri di;
    protected wjv fi;
    private com.bytedance.sdk.component.adexpress.lr.xha fr;
    protected com.bytedance.adsdk.ugeno.lr.ik<View> ik;
    protected com.bytedance.sdk.openadsdk.core.jbs.vr jbs;
    protected JSONObject ka;
    protected Context lr;
    protected com.bytedance.sdk.component.adexpress.lr.mj mj;
    protected long nr;
    private fi oh;
    protected bgr qt;
    protected co ri;
    protected float slm;
    private boolean su;
    protected long tan;
    protected String uq;
    protected float vr;
    private ac xd;
    protected FrameLayout xha;
    protected boolean ac = true;
    private long igq = 0;
    private float zf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float dw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float ory = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float hcw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> wjv = new SparseArray<>();
    private String dzy = "";
    private final com.bytedance.sdk.component.mj.lr.ik pv = new com.bytedance.sdk.component.mj.lr.ik("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.co.di.ka.1
        @Override // java.lang.Runnable
        public void run() {
            ka kaVar = ka.this;
            kaVar.ka = kaVar.ri();
            ka kaVar2 = ka.this;
            kaVar2.ay = kaVar2.lr();
            ka kaVar3 = ka.this;
            kaVar3.oh = new fi(kaVar3.lr, kaVar3.fi, kaVar3.uq, kaVar3.ay);
            if (ka.this.xd != null) {
                ka kaVar4 = ka.this;
                kaVar4.dzy = kaVar4.xd.getUgenTemplateErrorReason();
            } else {
                ka.this.dzy = "expressView is null";
            }
            com.bytedance.sdk.openadsdk.core.vr.ik().post(ka.this.ig);
        }
    };
    private final Runnable ig = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.co.di.ka.2
        @Override // java.lang.Runnable
        public void run() {
            if (ka.this.fr != null) {
                ka kaVar = ka.this;
                kaVar.lr(kaVar.fr);
            }
        }
    };
    private boolean qd = false;
    protected AtomicBoolean sf = new AtomicBoolean(false);

    static {
        if (nr.ri() != null) {
            ihz = nr.lr();
        }
    }

    public ka(Context context, wjv wjvVar, boolean z, ri riVar, ViewGroup viewGroup) {
        this.lr = context;
        this.su = z;
        this.ri = new co(context);
        this.fi = wjvVar;
        this.di = riVar;
        this.xha = new FrameLayout(context);
        if (viewGroup instanceof ac) {
            this.xd = (ac) viewGroup;
        }
        this.uq = riVar.ka();
    }

    private void jbs() {
        com.bytedance.adsdk.ugeno.lr.ik<T> ikVarFi;
        if (this.ik == null) {
            return;
        }
        if (this.fi.wzs() && (ikVarFi = this.ik.fi("tvskip")) != 0) {
            ikVarFi.ik(8);
        }
        com.bytedance.adsdk.ugeno.lr.ik<T> ikVarFi2 = this.ik.fi("skip");
        if (ikVarFi2 != 0 && (ikVarFi2 instanceof com.bytedance.adsdk.ugeno.jbs.ka.ik)) {
            if (!sf.lr().bgr(String.valueOf(this.fi.ur())) || this.fi.nd() == 5 || this.fi.nd() == 6 || this.fi.go() == 3) {
                ((com.bytedance.adsdk.ugeno.jbs.ka.ik) ikVarFi2).bgr("local://tt_close_btn");
                ikVarFi2.lr();
            }
        }
    }

    public com.bytedance.adsdk.ugeno.lr.ik di() {
        com.bytedance.adsdk.ugeno.lr.ik<View> ikVar = this.ik;
        if (ikVar == null) {
            return null;
        }
        return ikVar.di("PlayableComponent");
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.ka
    public View fi() {
        return this.xha;
    }

    public int ka() {
        this.ri.ri((vr) this);
        this.ri.ri((slm) this);
        com.bytedance.adsdk.ugeno.lr.ik<View> ikVarRi = this.ri.ri(this.ka);
        this.ik = ikVarRi;
        fi fiVar = this.oh;
        if (fiVar != null && ikVarRi != null) {
            fiVar.ri(ikVarRi);
        }
        if (!(this instanceof com.bytedance.sdk.openadsdk.core.co.di.ri.di)) {
            this.di.oh().lr();
            this.di.oh().ik();
        }
        this.ri.lr(this.ay);
        return 0;
    }

    public com.bytedance.adsdk.ugeno.lr.ik mj() {
        com.bytedance.adsdk.ugeno.lr.ik<View> ikVar = this.ik;
        if (ikVar == null) {
            return null;
        }
        return ikVar.fi("video");
    }

    public void ri(long j, long j2) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ka
    public void setSoundMute(boolean z) {
        com.bytedance.adsdk.ugeno.lr.ik<T> ikVarFi;
        com.bytedance.adsdk.ugeno.lr.ik<View> ikVar = this.ik;
        if (ikVar == null || (ikVarFi = ikVar.fi(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) == 0) {
            return;
        }
        if (z) {
            ((com.bytedance.adsdk.ugeno.jbs.ka.ik) ikVarFi).bgr("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.jbs.ka.ik) ikVarFi).bgr("local://tt_reward_full_unmute");
        }
        ikVarFi.lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ka
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        if (this.ik == null) {
            return;
        }
        boolean z2 = i == 1;
        ri(charSequence, z2, i2, z);
        lr(charSequence, z2, i2, z);
    }

    public com.bytedance.adsdk.ugeno.lr.ik xha() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(com.bytedance.sdk.component.adexpress.lr.xha xhaVar) {
        if (this instanceof com.bytedance.sdk.openadsdk.core.co.di.ri.di) {
            this.di.fi().xha(1);
        } else {
            this.di.oh().ri();
        }
        if (this.ka == null) {
            xhaVar.ri(133, "ugen template is null real reason is " + this.dzy);
            return;
        }
        if (this.ay == null) {
            xhaVar.ri(133, "ugen data is null");
            return;
        }
        int iKa = ka();
        if (this.ri.ri()) {
            List<String> listLr = this.ri.lr();
            if (listLr == null) {
                xhaVar.ri(138, "unknow widget");
                return;
            }
            xhaVar.ri(138, "unknow widget;" + listLr.toString());
            return;
        }
        if (iKa != 0) {
            xhaVar.ri(iKa, "ugen render fail");
            return;
        }
        if (this.ik == null) {
            xhaVar.ri(138, "ugen render error");
            return;
        }
        lr lrVar = new lr();
        this.qt = lrVar;
        lrVar.ri(true);
        this.qt.ri(ik());
        setSoundMute(this.su);
        jbs();
        com.bytedance.adsdk.ugeno.lr.ik ikVarMj = mj();
        this.f18108co = ikVarMj;
        if (ikVarMj != null && (ikVarMj instanceof com.bytedance.sdk.openadsdk.core.co.lr.di.lr)) {
            ((lr) this.qt).ri((FrameLayout) ((com.bytedance.sdk.openadsdk.core.co.lr.di.lr) ikVarMj).ka());
        }
        fi fiVar = this.oh;
        if (fiVar != null) {
            fiVar.ri();
        }
        com.bytedance.adsdk.ugeno.lr.ik ikVarDi = di();
        this.aw = ikVarDi;
        if (ikVarDi != null && (ikVarDi instanceof com.bytedance.adsdk.ugeno.jbs.lr.lr)) {
            ((lr) this.qt).lr((FrameLayout) ikVarDi.sf());
        }
        if (dw.ik(this.fi)) {
            com.bytedance.adsdk.ugeno.lr.ik ikVarXha = xha();
            if (ikVarXha instanceof com.bytedance.sdk.openadsdk.core.co.lr.ik.lr) {
                ((lr) this.qt).ik(((com.bytedance.sdk.openadsdk.core.co.lr.ik.lr) ikVarXha).ka());
            }
        }
        int iPv = this.ik.pv();
        int iIg = this.ik.ig();
        this.xha.removeAllViews();
        this.xha.addView(this.ik.sf(), new FrameLayout.LayoutParams(iPv, iIg));
        float fDw = this.di.dw();
        float fOry = this.di.ory();
        float fLr = qd.lr(this.lr, fDw);
        float fLr2 = qd.lr(this.lr, fOry);
        if (ik() != 7) {
            this.xha.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else if (fOry <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.xha.setLayoutParams(new FrameLayout.LayoutParams((int) fLr, -2));
        } else {
            this.xha.setLayoutParams(new FrameLayout.LayoutParams((int) fLr, (int) fLr2));
        }
        if (fOry <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fDw <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.xha.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int iIk = qd.ik(this.lr, this.xha.getMeasuredWidth());
            int iIk2 = qd.ik(this.lr, this.xha.getMeasuredHeight());
            this.qt.ri(iIk);
            this.qt.lr(iIk2);
        } else {
            this.qt.ri(fDw);
            this.qt.lr(fOry);
        }
        if (this.sf.get()) {
            xhaVar.ri(137, "ugen render timeout");
        } else {
            this.ri.ri(this.ik, "renderDidFinish", new Object[0]);
            xhaVar.ri(this.xha, this.qt);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.ka
    public int ik() {
        return this.fi.hpn();
    }

    @Override // com.bytedance.adsdk.ugeno.core.vr
    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, com.bytedance.adsdk.ugeno.ka.di.ri riVar) {
    }

    public void ri(wjv wjvVar, boolean z, ri riVar, ViewGroup viewGroup) {
        this.fi = wjvVar;
        this.di = riVar;
        this.uq = riVar.ka();
        if (viewGroup instanceof ac) {
            this.xd = (ac) viewGroup;
        }
        this.su = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.ka
    public void ri(com.bytedance.sdk.component.adexpress.lr.xha xhaVar) {
        this.fr = xhaVar;
        dzy.ik((Runnable) this.pv);
    }

    public JSONObject ri() {
        return this.di.ik();
    }

    public void ri(boolean z) {
        this.sf.set(z);
    }

    public void ri(com.bytedance.sdk.component.adexpress.lr.mj mjVar) {
        this.mj = mjVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ka
    public void onvideoComplate() {
    }

    public void ri(com.bytedance.sdk.openadsdk.core.jbs.vr vrVar) {
        this.jbs = vrVar;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.widget.fi fiVar) {
        fi fiVar2 = this.oh;
        if (fiVar2 != null) {
            fiVar2.ri(fiVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.vr
    public void ri(aw awVar, vr.lr lrVar, vr.ri riVar) {
        if (awVar == null) {
            return;
        }
        if (awVar.lr() == 1 || awVar.lr() == 4) {
            ri(awVar);
        }
        if (awVar.lr() == 10) {
            ri(awVar.ik());
        }
        if (lrVar == null || awVar.ka() == null) {
            return;
        }
        lrVar.ri(awVar.ka());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ka
    public void setTimeUpdate(int i) {
    }

    private void ri(JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.lr.ik<T> ikVarFi;
        if (this.ik == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(strOptString2) || (ikVarFi = this.ik.fi(strOptString2)) == 0) {
            return;
        }
        if (TextUtils.equals(strOptString, "onShow")) {
            ikVarFi.ik(0);
        } else if (TextUtils.equals(strOptString, "onDismiss")) {
            ikVarFi.ik(8);
        }
    }

    private void ri(aw awVar) {
        JSONObject jSONObjectKa;
        boolean zRi;
        int i;
        String str;
        fi fiVar;
        fi fiVar2;
        fi fiVar3;
        if (this.mj == null) {
            return;
        }
        String strOptString = awVar.ik().optString("type");
        if ("swiperLeft".equals(strOptString) && (fiVar3 = this.oh) != null) {
            fiVar3.lr();
            return;
        }
        if ("swiperRight".equals(strOptString) && (fiVar2 = this.oh) != null) {
            fiVar2.ik();
            return;
        }
        int i2 = 2;
        if (!"swiperClick".equals(strOptString) || (fiVar = this.oh) == null) {
            jSONObjectKa = null;
            zRi = false;
            i = 0;
        } else {
            zRi = fiVar.ri(awVar);
            jSONObjectKa = this.oh.ka();
            i = 2;
        }
        strOptString.getClass();
        switch (strOptString) {
            case "privacy":
                i2 = 7;
                break;
            case "feedback":
                i2 = 3;
                break;
            case "mute":
                i2 = 5;
                break;
            case "skip":
                i2 = 6;
                break;
            case "video":
                i2 = 4;
                break;
            case "creative":
                break;
            default:
                i2 = i;
                break;
        }
        com.bytedance.adsdk.ugeno.lr.ik ikVarRi = awVar.ri();
        com.bytedance.sdk.openadsdk.core.model.slm.ri riVarRi = new com.bytedance.sdk.openadsdk.core.model.slm.ri().ka(this.bgr).ik(this.vr).lr(this.slm).ri(this.bu).lr(this.nr).ri(this.tan).ri(this.wjv).ri(awVar.lr() != 1 || this.ac);
        if (ikVarRi == null) {
            str = "";
        } else {
            str = ikVarRi.dzy() + "_" + ikVarRi.xd();
        }
        this.mj.ri(awVar.ri().sf(), i2, riVarRi.ri(str).lr(zRi).lr(jSONObjectKa).ri());
    }

    public JSONObject lr() {
        return this.di.hcw();
    }

    private void lr(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.lr.ik<T> ikVarFi;
        View viewSf;
        com.bytedance.adsdk.ugeno.lr.ik<View> ikVar = this.ik;
        if (ikVar == null || (ikVarFi = ikVar.fi("skip")) == 0 || (viewSf = ikVarFi.sf()) == null) {
            return;
        }
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        viewSf.setVisibility(i2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0059  */
    @Override // com.bytedance.adsdk.ugeno.core.slm
    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        int i2 = 0;
        int i3 = 1;
        if (action != 0) {
            if (action == 1) {
                this.slm = motionEvent.getRawX();
                this.bu = motionEvent.getRawY();
                if (Math.abs(this.slm - this.bgr) >= ihz || Math.abs(this.bu - this.vr) >= ihz) {
                    this.ac = false;
                }
                this.tan = System.currentTimeMillis();
            } else {
                if (action == 2) {
                    this.ory += Math.abs(motionEvent.getX() - this.zf);
                    this.hcw += Math.abs(motionEvent.getY() - this.dw);
                    this.zf = motionEvent.getX();
                    this.dw = motionEvent.getY();
                    if (System.currentTimeMillis() - this.igq > 200) {
                        float f = this.ory;
                        int i4 = ihz;
                        if (f <= i4 && this.hcw <= i4) {
                            i3 = 2;
                        }
                    } else {
                        i3 = 2;
                    }
                    if (Math.abs(motionEvent.getRawX() - this.bgr) >= ihz || Math.abs(motionEvent.getRawY() - this.vr) >= ihz) {
                        this.ac = false;
                    }
                    i = i3;
                }
                this.wjv.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.ik.ik.ri(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
            }
            i2 = -1;
        } else {
            this.nr = System.currentTimeMillis();
            this.bgr = motionEvent.getRawX();
            this.vr = motionEvent.getRawY();
            this.ac = true;
            this.ory = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.hcw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.igq = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.sf.ik.ri(motionEvent);
            this.zf = motionEvent.getX();
            this.dw = motionEvent.getY();
        }
        i = i2;
        this.wjv.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.ik.ik.ri(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }

    private void ri(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.lr.ik<T> ikVarFi;
        int i2;
        com.bytedance.adsdk.ugeno.lr.ik<View> ikVar = this.ik;
        if (ikVar == null || (ikVarFi = ikVar.fi("countdown")) == 0) {
            return;
        }
        View viewSf = ikVarFi.sf();
        if (viewSf instanceof TextView) {
            try {
                i2 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                com.bytedance.sdk.component.utils.ac.ik("UGenRender", "parse duration exception", charSequence);
                i2 = 0;
            }
            if (!z2 && i2 > 0 && !this.qd) {
                viewSf.setVisibility(0);
                if (!z && this.di.ri() && com.bytedance.sdk.component.adexpress.ka.di.lr(this.di.ka())) {
                    ((TextView) viewSf).setText(String.format(uq.ri(com.bytedance.sdk.component.adexpress.ka.ri(), "tt_reward_full_skip"), Integer.valueOf(i)));
                    return;
                }
                if (!"open_ad".equals(this.di.ka()) && this.di.ri()) {
                    this.qd = true;
                    viewSf.setVisibility(8);
                    return;
                } else {
                    ((TextView) viewSf).setText(((Object) charSequence) + "s");
                    return;
                }
            }
            viewSf.setVisibility(8);
        }
    }
}

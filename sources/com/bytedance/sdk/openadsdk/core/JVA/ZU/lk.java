package com.bytedance.sdk.openadsdk.core.JVA.ZU;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.NXR;
import com.bytedance.adsdk.ugeno.core.QAg;
import com.bytedance.adsdk.ugeno.core.nBu;
import com.bytedance.adsdk.ugeno.core.sLN;
import com.bytedance.sdk.component.adexpress.LD.OY;
import com.bytedance.sdk.component.adexpress.LD.STP;
import com.bytedance.sdk.component.adexpress.LD.ebl;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.core.widget.lc;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.analytics.pro.bc;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk implements NXR, sLN, com.bytedance.sdk.component.adexpress.LD.ZU<View>, com.bytedance.sdk.component.adexpress.dynamic.ZU {
    private static float Ivz = 0.0f;
    private static float KPU = 0.0f;
    private static float foI = 0.0f;
    private static long id = 0;
    private static float nE = 0.0f;
    protected static int tD = 24;
    private final boolean CSn;
    protected WeakReference<View> DY;
    protected float IeN;
    protected com.bytedance.adsdk.ugeno.LD.lk JVA;
    protected tD JXs;
    protected Context LD;
    protected QAg Lxb;
    protected float NXR;
    protected OY OY;
    protected STP QAg;
    protected float STP;
    protected String Sfi;
    protected long VVE;
    protected JSONObject ZU;
    private ebl aH;
    protected JSONObject eK;
    protected FrameLayout ebl;
    private com.bytedance.sdk.openadsdk.core.OY.tD hg;
    protected long kqm;
    protected Lxb lc;
    protected com.bytedance.adsdk.ugeno.LD.lk<View> lk;
    protected float sLN;
    private ZU xan;
    protected boolean brP = true;
    public SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> HD = new SparseArray<>();
    private String CG = "";
    private final com.bytedance.sdk.component.OY.OY nJ = new com.bytedance.sdk.component.OY.OY("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.JVA.ZU.lk.1
        @Override // java.lang.Runnable
        public void run() {
            lk lkVar = lk.this;
            lkVar.ZU = lkVar.Lxb();
            if (lk.this.hg != null) {
                lk lkVar2 = lk.this;
                lkVar2.CG = lkVar2.hg.getUgenTemplateErrorReason();
            } else {
                lk.this.CG = "expressView is null";
            }
            com.bytedance.sdk.openadsdk.core.STP.lk().post(lk.this.le);
        }
    };
    private final Runnable le = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.JVA.ZU.lk.2
        @Override // java.lang.Runnable
        public void run() {
            if (lk.this.aH != null) {
                lk lkVar = lk.this;
                lkVar.LD(lkVar.aH);
            }
        }
    };
    private boolean BcA = false;
    protected AtomicBoolean nBu = new AtomicBoolean(false);

    static {
        if (kqm.Lxb() != null) {
            tD = kqm.LD();
        }
    }

    public lk(Context context, tD tDVar, boolean z, Lxb lxb, ViewGroup viewGroup) {
        this.LD = context;
        this.CSn = z;
        this.Lxb = new QAg(context);
        this.JXs = tDVar;
        this.lc = lxb;
        this.ebl = new FrameLayout(context);
        if (viewGroup instanceof com.bytedance.sdk.openadsdk.core.OY.tD) {
            this.hg = (com.bytedance.sdk.openadsdk.core.OY.tD) viewGroup;
        }
        this.Sfi = lxb.ZU();
        JSONObject jSONObjectLD = LD();
        this.eK = jSONObjectLD;
        this.xan = new ZU(this.LD, this.JXs, this.Sfi, jSONObjectLD);
    }

    private void OY() {
        com.bytedance.adsdk.ugeno.LD.lk<T> lkVarLk;
        if (this.lk == null) {
            return;
        }
        if (this.JXs.Vs() && (lkVarLk = this.lk.lk("tvskip")) != 0) {
            lkVarLk.lk(8);
        }
        com.bytedance.adsdk.ugeno.LD.lk<T> lkVarLk2 = this.lk.lk("skip");
        if (lkVarLk2 != 0 && (lkVarLk2 instanceof com.bytedance.adsdk.ugeno.QAg.ZU.lk)) {
            if (!VVE.TA().STP(String.valueOf(this.JXs.Td())) || this.JXs.kqm() == 5 || this.JXs.kqm() == 6 || this.JXs.op() == 3) {
                ((com.bytedance.adsdk.ugeno.QAg.ZU.lk) lkVarLk2).OY("local://tt_close_btn");
                lkVarLk2.LD();
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.ZU
    public View JXs() {
        return this.ebl;
    }

    public void Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar, String str, com.bytedance.adsdk.ugeno.ZU.LD.Lxb lxb) {
    }

    public int ZU() {
        this.Lxb.Lxb((sLN) this);
        this.Lxb.Lxb((NXR) this);
        com.bytedance.adsdk.ugeno.LD.lk<View> lkVarLxb = this.Lxb.Lxb(this.ZU);
        this.lk = lkVarLxb;
        ZU zu = this.xan;
        if (zu != null && lkVarLxb != null) {
            zu.Lxb(lkVarLxb);
        }
        this.lc.Ivz().LD();
        this.lc.Ivz().lk();
        this.Lxb.LD(this.eK);
        return 0;
    }

    public com.bytedance.adsdk.ugeno.LD.lk ebl() {
        com.bytedance.adsdk.ugeno.LD.lk<View> lkVar = this.lk;
        if (lkVar == null) {
            return null;
        }
        return lkVar.lk("feedback");
    }

    public com.bytedance.adsdk.ugeno.LD.lk lc() {
        com.bytedance.adsdk.ugeno.LD.lk<View> lkVar = this.lk;
        if (lkVar == null) {
            return null;
        }
        return lkVar.lk("video");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ZU
    public void onvideoComplate() {
    }

    public void setSoundMute(boolean z) {
        com.bytedance.adsdk.ugeno.LD.lk<T> lkVarLk;
        com.bytedance.adsdk.ugeno.LD.lk<View> lkVar = this.lk;
        if (lkVar == null || (lkVarLk = lkVar.lk(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) == 0) {
            return;
        }
        if (z) {
            ((com.bytedance.adsdk.ugeno.QAg.ZU.lk) lkVarLk).OY("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.QAg.ZU.lk) lkVarLk).OY("local://tt_reward_full_unmute");
        }
        lkVarLk.LD();
    }

    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        if (this.lk == null) {
            return;
        }
        boolean z2 = i == 1;
        Lxb(charSequence, z2, i2, z);
        LD(charSequence, z2, i2, z);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ZU
    public void setTimeUpdate(int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(ebl eblVar) {
        this.lc.Ivz().Lxb();
        if (this.ZU == null) {
            eblVar.Lxb(133, "ugen template is null real reason is " + this.CG);
            return;
        }
        if (this.eK == null) {
            eblVar.Lxb(133, "ugen data is null");
            return;
        }
        int iZU = ZU();
        if (this.Lxb.Lxb()) {
            List<String> listLD = this.Lxb.LD();
            if (listLD == null) {
                eblVar.Lxb(138, "unknow widget");
                return;
            }
            eblVar.Lxb(138, "unknow widget;" + listLD.toString());
            return;
        }
        if (iZU != 0) {
            eblVar.Lxb(iZU, "ugen render fail");
            return;
        }
        if (this.lk == null) {
            eblVar.Lxb(138, "ugen render error");
            return;
        }
        LD ld = new LD();
        this.QAg = ld;
        ld.Lxb(true);
        this.QAg.Lxb(lk());
        setSoundMute(this.CSn);
        OY();
        com.bytedance.adsdk.ugeno.LD.lk lkVarLc = lc();
        this.JVA = lkVarLc;
        if (lkVarLc != null && (lkVarLc instanceof com.bytedance.sdk.openadsdk.core.JVA.LD.Lxb.LD)) {
            ((LD) this.QAg).Lxb((FrameLayout) ((com.bytedance.sdk.openadsdk.core.JVA.LD.Lxb.LD) lkVarLc).Ld());
        }
        com.bytedance.adsdk.ugeno.LD.lk lkVarEbl = ebl();
        ZU zu = this.xan;
        if (zu != null) {
            zu.Lxb();
        }
        if (lkVarEbl != null && lkVarEbl.QAg() != null) {
            this.DY = new WeakReference<>(lkVarEbl.QAg());
        }
        this.ebl.addView(this.lk.QAg(), new FrameLayout.LayoutParams(this.lk.hg(), this.lk.CG()));
        float fId = this.lc.id();
        float fFoI = this.lc.foI();
        float fLk = le.lk(this.LD, fId);
        float fLk2 = le.lk(this.LD, fFoI);
        if (lk() != 7) {
            this.ebl.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else if (fFoI <= 0.0f) {
            this.ebl.setLayoutParams(new FrameLayout.LayoutParams((int) fLk, -2));
        } else {
            this.ebl.setLayoutParams(new FrameLayout.LayoutParams((int) fLk, (int) fLk2));
        }
        if (fFoI <= 0.0f || fId <= 0.0f) {
            this.ebl.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int iZU2 = le.ZU(this.LD, this.ebl.getMeasuredWidth());
            int iZU3 = le.ZU(this.LD, this.ebl.getMeasuredHeight());
            this.QAg.Lxb(iZU2);
            this.QAg.LD(iZU3);
        } else {
            this.QAg.Lxb(fId);
            this.QAg.LD(fFoI);
        }
        if (this.nBu.get()) {
            eblVar.Lxb(137, "ugen render timeout");
        } else {
            eblVar.Lxb(this.ebl, this.QAg);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.ZU
    public int lk() {
        return this.JXs.id();
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.ZU
    public void Lxb(ebl eblVar) {
        this.aH = eblVar;
        hg.LD(this.nJ);
    }

    public JSONObject Lxb() {
        return this.lc.lk();
    }

    public void Lxb(boolean z) {
        this.nBu.set(z);
    }

    public void Lxb(OY oy) {
        this.OY = oy;
    }

    public void Lxb(lc lcVar) {
        ZU zu = this.xan;
        if (zu != null) {
            zu.Lxb(lcVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.sLN
    public void Lxb(nBu nbu, sLN.LD ld, sLN.Lxb lxb) {
        if (nbu == null) {
            return;
        }
        if (nbu.LD() == 1 || nbu.LD() == 4) {
            Lxb(nbu);
        }
        if (nbu.LD() == 10) {
            Lxb(nbu.lk());
        }
        if (ld == null || nbu.ZU() == null) {
            return;
        }
        ld.Lxb(nbu.ZU());
    }

    private void Lxb(JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.LD.lk<T> lkVarLk;
        if (this.lk == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(strOptString2) || (lkVarLk = this.lk.lk(strOptString2)) == 0) {
            return;
        }
        if (TextUtils.equals(strOptString, "onShow")) {
            lkVarLk.lk(0);
        } else if (TextUtils.equals(strOptString, "onDismiss")) {
            lkVarLk.lk(8);
        }
    }

    private void Lxb(nBu nbu) {
        JSONObject jSONObjectZU;
        boolean zLxb;
        int i;
        String str;
        ZU zu;
        ZU zu2;
        ZU zu3;
        if (this.OY == null) {
            return;
        }
        String strOptString = nbu.lk().optString("type");
        if ("swiperLeft".equals(strOptString) && (zu3 = this.xan) != null) {
            zu3.LD();
            return;
        }
        if ("swiperRight".equals(strOptString) && (zu2 = this.xan) != null) {
            zu2.lk();
            return;
        }
        if (!"swiperClick".equals(strOptString) || (zu = this.xan) == null) {
            jSONObjectZU = null;
            zLxb = false;
            i = 0;
        } else {
            zLxb = zu.Lxb(nbu);
            jSONObjectZU = this.xan.ZU();
            i = 2;
        }
        strOptString.getClass();
        switch (strOptString) {
            case "privacy":
                i = 7;
                break;
            case "feedback":
                i = 3;
                break;
            case "mute":
                i = 5;
                break;
            case "skip":
                i = 6;
                break;
            case "video":
                i = 4;
                break;
            case "creative":
                i = 2;
                break;
        }
        com.bytedance.adsdk.ugeno.LD.lk lkVarLxb = nbu.Lxb();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        WeakReference<View> weakReference = this.DY;
        if (weakReference != null) {
            int[] iArrLxb = le.Lxb(weakReference.get());
            if (iArrLxb != null) {
                iArr = iArrLxb;
            }
            int[] iArrLk = le.lk(this.DY.get());
            if (iArrLk != null) {
                iArr2 = iArrLk;
            }
        }
        com.bytedance.sdk.openadsdk.core.model.STP.Lxb Lxb = new com.bytedance.sdk.openadsdk.core.model.STP.Lxb().ZU(this.sLN).lk(this.NXR).LD(this.STP).Lxb(this.IeN).LD(this.VVE).Lxb(this.kqm).lk(iArr[0]).ZU(iArr[1]).JXs(iArr2[0]).lc(iArr2[1]).Lxb(this.HD).Lxb(nbu.LD() != 1 || this.brP);
        if (lkVarLxb == null) {
            str = "";
        } else {
            str = lkVarLxb.xan() + "_" + lkVarLxb.nE();
        }
        this.OY.Lxb(nbu.Lxb().QAg(), i, Lxb.Lxb(str).LD(zLxb).LD(jSONObjectZU).Lxb());
    }

    public JSONObject LD() {
        return this.lc.KPU();
    }

    private void LD(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.LD.lk<T> lkVarLk;
        View viewQAg;
        com.bytedance.adsdk.ugeno.LD.lk<View> lkVar = this.lk;
        if (lkVar == null || (lkVarLk = lkVar.lk("skip")) == 0 || (viewQAg = lkVarLk.QAg()) == null) {
            return;
        }
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        viewQAg.setVisibility(i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    @Override // com.bytedance.adsdk.ugeno.core.NXR
    public void Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar, MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        int i2 = 1;
        if (action != 0) {
            int i3 = -1;
            if (action == 1) {
                this.STP = motionEvent.getRawX();
                this.IeN = motionEvent.getRawY();
                if (Math.abs(this.STP - this.sLN) < tD || Math.abs(this.IeN - this.NXR) >= tD) {
                    this.brP = false;
                }
                this.kqm = System.currentTimeMillis();
                i = i3;
            } else if (action != 2) {
                i = -1;
            } else {
                Ivz = Math.abs(motionEvent.getX() - foI) + Ivz;
                nE = Math.abs(motionEvent.getY() - KPU) + nE;
                foI = motionEvent.getX();
                KPU = motionEvent.getY();
                if (System.currentTimeMillis() - id > 200) {
                    float f = Ivz;
                    int i4 = tD;
                    if (f <= i4 && nE <= i4) {
                        i2 = 2;
                    }
                } else {
                    i2 = 2;
                }
                if (Math.abs(motionEvent.getRawX() - this.sLN) >= tD || Math.abs(motionEvent.getRawY() - this.NXR) >= tD) {
                    this.brP = false;
                }
                i3 = i2;
                this.STP = motionEvent.getRawX();
                this.IeN = motionEvent.getRawY();
                if (Math.abs(this.STP - this.sLN) < tD) {
                    this.brP = false;
                } else {
                    this.brP = false;
                }
                this.kqm = System.currentTimeMillis();
                i = i3;
            }
        } else {
            this.VVE = System.currentTimeMillis();
            this.sLN = motionEvent.getRawX();
            this.NXR = motionEvent.getRawY();
            this.brP = true;
            id = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.QAg.lk.Lxb(motionEvent);
            i = 0;
        }
        this.HD.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.LD.lk.Lxb(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }

    private void Lxb(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.LD.lk<T> lkVarLk;
        int i2;
        com.bytedance.adsdk.ugeno.LD.lk<View> lkVar = this.lk;
        if (lkVar == null || (lkVarLk = lkVar.lk("countdown")) == 0) {
            return;
        }
        View viewQAg = lkVarLk.QAg();
        if (viewQAg instanceof TextView) {
            try {
                i2 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                com.bytedance.sdk.component.utils.sLN.Lxb("UGenRender", "parse duration exception", charSequence);
                i2 = 0;
            }
            if (!z2 && i2 > 0 && !this.BcA) {
                viewQAg.setVisibility(0);
                if (!z && this.lc.Lxb() && com.bytedance.sdk.component.adexpress.ZU.ebl.LD(this.lc.ZU())) {
                    ((TextView) viewQAg).setText(String.format(com.bytedance.sdk.component.utils.tD.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), "tt_reward_full_skip"), Integer.valueOf(i)));
                    return;
                }
                if (!"open_ad".equals(this.lc.ZU()) && this.lc.Lxb()) {
                    this.BcA = true;
                    viewQAg.setVisibility(8);
                    return;
                } else {
                    ((TextView) viewQAg).setText(((Object) charSequence) + bc.aH);
                    return;
                }
            }
            viewQAg.setVisibility(8);
        }
    }
}

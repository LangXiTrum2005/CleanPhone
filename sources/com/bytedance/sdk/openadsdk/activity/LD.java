package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.NXR.JVA;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.DY;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.sLN.OY;
import com.bytedance.sdk.openadsdk.utils.ebl;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.sLN;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private static com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb LD;
    private static com.bytedance.sdk.openadsdk.Lxb.lk.LD lk;
    private int CSn;
    private JVA DY;
    private AbstractC0083LD HD;
    private com.bytedance.sdk.openadsdk.activity.lk IeN;
    private Activity JVA;
    private final tD JXs;
    public sLN Lxb;
    private int NXR;
    private com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb OY;
    private com.bytedance.sdk.openadsdk.Lxb.lk.LD QAg;
    private com.bytedance.sdk.openadsdk.core.JXs.lk STP;
    private com.bytedance.sdk.openadsdk.component.reward.top.lk Sfi;
    private com.bytedance.sdk.openadsdk.core.JXs.lk VVE;
    private boolean aH;
    private int brP;
    private boolean eK;
    private final OY ebl;
    private Runnable id;
    private com.bytedance.sdk.openadsdk.core.JXs.OY kqm;
    private boolean nBu;
    private lc sLN;
    private Bundle tD;
    private final List<lc> ZU = new ArrayList();
    private final Bundle lc = new Bundle();

    public static class JXs {
        public boolean JXs;
        public final int LD;
        public final Bundle Lxb = new Bundle();
        public boolean ZU;
        public final com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lk;

        public JXs(int i, com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
            this.LD = i;
            this.lk = lxb;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.LD$LD, reason: collision with other inner class name */
    public static abstract class AbstractC0083LD implements Handler.Callback {
        protected int JXs;
        protected final tD LD;
        protected final LD Lxb;
        private final Context OY;
        private boolean QAg;
        protected int ZU;
        private final com.bytedance.sdk.openadsdk.component.reward.top.lk ebl;
        private final Handler lc = new Handler(Looper.getMainLooper(), this);
        protected float lk;
        private boolean nBu;

        public AbstractC0083LD(LD ld, tD tDVar, com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar) {
            this.Lxb = ld;
            this.LD = tDVar;
            this.ebl = lkVar;
            this.OY = lkVar.getContext();
            this.ZU = Lxb(tDVar);
        }

        private void ZU() {
            if (this.Lxb.DY()) {
                this.ebl.showSkipButton();
                this.QAg = true;
            } else {
                this.nBu = true;
                this.ebl.showCloseButton();
            }
        }

        public void LD() {
            if (this.ZU < 0 || this.QAg || this.nBu) {
                return;
            }
            this.lc.removeMessages(this.JXs);
            this.lc.sendEmptyMessage(this.JXs);
        }

        public abstract int Lxb(tD tDVar);

        public void Lxb() {
            this.lc.removeMessages(this.JXs);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 1) {
                if (this.ZU > 0) {
                    this.ebl.setSkipText(this.ZU + bc.aH);
                    int i2 = this.ZU - 1;
                    this.ZU = i2;
                    if (i2 >= 0) {
                        this.lc.removeMessages(message.what);
                        this.lc.sendEmptyMessageDelayed(message.what, 1000L);
                    }
                } else {
                    ZU();
                }
            } else if (i == 2) {
                if (this.ZU > 0) {
                    this.ebl.setSkipText(this.ZU + bc.aH);
                    int i3 = this.ZU - 1;
                    this.ZU = i3;
                    if (i3 >= 0) {
                        this.lc.removeMessages(message.what);
                        this.lc.sendEmptyMessageDelayed(message.what, 1000L);
                    }
                } else {
                    ZU();
                }
            }
            return true;
        }

        public void lk() {
            this.lc.removeMessages(this.JXs);
        }

        public void Lxb(int i) {
            if (this.QAg || this.nBu) {
                return;
            }
            float f = i;
            this.lk = f;
            if (f <= this.ZU) {
                this.JXs = 2;
                this.ZU = (int) f;
            } else if (this.JXs == 0) {
                this.JXs = 1;
            }
            this.lc.removeCallbacksAndMessages(null);
            this.lc.sendEmptyMessage(this.JXs);
        }
    }

    public static class Lxb extends AbstractC0083LD {
        public Lxb(LD ld, tD tDVar, com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar) {
            super(ld, tDVar, lkVar);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.LD.AbstractC0083LD
        public int Lxb(tD tDVar) {
            return kqm.ZU().tD(String.valueOf(tDVar.Td()));
        }
    }

    public static class ZU extends AbstractC0083LD {
        private boolean OY;
        private int ebl;
        private final int lc;

        public ZU(LD ld, tD tDVar, com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar) {
            super(ld, tDVar, lkVar);
            this.lc = kqm.ZU().foI(String.valueOf(tDVar.Td())).lc;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.LD.AbstractC0083LD
        public int Lxb(tD tDVar) {
            return kqm.ZU().JVA(String.valueOf(tDVar.Td()));
        }

        @Override // com.bytedance.sdk.openadsdk.activity.LD.AbstractC0083LD, android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (!this.OY && this.ZU <= this.ebl) {
                this.OY = true;
                lc lcVarTD = this.Lxb.tD();
                if (lcVarTD instanceof com.bytedance.sdk.openadsdk.activity.JXs) {
                    ((com.bytedance.sdk.openadsdk.activity.JXs) lcVarTD).eK();
                }
            }
            super.handleMessage(message);
            return true;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.LD.AbstractC0083LD
        public void Lxb(int i) {
            boolean z = this.JXs == 0;
            int i2 = this.ZU;
            super.Lxb(i);
            if (!z) {
                if (this.lk < i2) {
                    this.ebl = (int) ((1.0f - (this.lc / 100.0f)) * this.ZU);
                }
            } else if (this.JXs == 1) {
                this.ebl = 3;
            } else {
                this.ebl = (int) ((1.0f - (this.lc / 100.0f)) * this.lk);
            }
        }
    }

    public static class lk implements Runnable {
        private final tD Lxb;

        public lk(tD tDVar) {
            this.Lxb = tDVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.Lxb.cR()) {
                com.bytedance.sdk.openadsdk.component.reward.sLN.Lxb(kqm.Lxb()).Lxb(this.Lxb.hg());
            } else {
                com.bytedance.sdk.openadsdk.component.reward.JXs.Lxb(kqm.Lxb()).Lxb(this.Lxb.hg());
            }
        }
    }

    public LD(Activity activity, tD tDVar) {
        com.bytedance.sdk.openadsdk.core.model.Lxb lxbFoF;
        List<tD> listZU;
        this.JXs = tDVar;
        this.JVA = activity;
        this.ebl = new OY(activity.getApplicationContext());
        int i = 0;
        if ((tDVar instanceof DY) && (lxbFoF = ((DY) tDVar).foF()) != null) {
            boolean zSLN = lxbFoF.sLN();
            this.nBu = zSLN;
            if (zSLN) {
                if (!VVE.TA().bm()) {
                    this.nBu = false;
                }
                if (this.nBu && (listZU = lxbFoF.ZU()) != null) {
                    Iterator<tD> it = listZU.iterator();
                    while (it.hasNext()) {
                        this.ZU.add(Lxb(this, it.next(), i));
                        this.CSn++;
                        i++;
                    }
                }
            }
        }
        if (this.ZU.isEmpty() && !eK.lk(tDVar)) {
            this.ZU.add(Lxb(this, tDVar, i));
            i++;
        }
        if (VVE.TA().STP(String.valueOf(tDVar.Td())) || eK.lk(tDVar)) {
            this.ZU.add(new com.bytedance.sdk.openadsdk.activity.lk(this, tDVar, i));
        } else if (Lxb()) {
            this.Lxb = ebl.Lxb(activity, new ebl.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.LD.1
                @Override // com.bytedance.sdk.openadsdk.utils.ebl.Lxb
                public void LD() {
                    if (LD.this.Sfi != null) {
                        LD.this.Sfi.setSkipInvisiable();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.utils.ebl.Lxb
                public View Lxb() {
                    if (LD.this.Sfi != null) {
                        return LD.this.Sfi.getCloseButton();
                    }
                    return null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean DY() {
        if (this.ZU.isEmpty()) {
            return false;
        }
        return ((lc) DM.f(this.ZU, 1)) instanceof com.bytedance.sdk.openadsdk.activity.lk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public lc tD() {
        return this.sLN;
    }

    public void IeN() {
        this.aH = true;
    }

    public void JVA() {
        com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb lxb = this.OY;
        if (lxb != null) {
            lxb.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.Lxb.lk.LD ld = this.QAg;
        if (ld != null) {
            ld.onAdClicked();
        }
    }

    public void JXs(TTAdActivity tTAdActivity) {
        this.brP = 6;
        int iLD = LD();
        for (lc lcVar : this.ZU) {
            if (lcVar.QAg >= iLD) {
                lcVar.IeN();
            }
        }
        lc lcVar2 = this.sLN;
        if (lcVar2 != null) {
            lcVar2.foI();
        }
        lc lcVar3 = this.sLN;
        if (lcVar3 != null && !lcVar3.tD()) {
            STP.LD().post(new lk(this.JXs));
        }
        AbstractC0083LD abstractC0083LD = this.HD;
        if (abstractC0083LD != null) {
            abstractC0083LD.lk();
        }
        sLN sln = this.Lxb;
        if (sln != null) {
            sln.lk();
        }
        this.sLN = null;
        this.JVA = null;
    }

    public void NXR() {
        if (VVE()) {
            return;
        }
        kqm();
        com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb lxb = this.OY;
        if (lxb != null) {
            lxb.Lxb();
        } else {
            com.bytedance.sdk.openadsdk.Lxb.lk.LD ld = this.QAg;
            if (ld != null) {
                ld.Lxb();
            }
        }
        Runnable runnable = this.id;
        if (runnable != null) {
            runnable.run();
            this.id = null;
        }
    }

    public com.bytedance.sdk.openadsdk.component.reward.top.lk OY() {
        return this.Sfi;
    }

    @Nullable
    public lc QAg() {
        int i;
        lc lcVar = this.sLN;
        if (lcVar != null && (i = lcVar.QAg + 1) >= 0 && i < this.ZU.size()) {
            return this.ZU.get(i);
        }
        return null;
    }

    public boolean STP() {
        return this.aH;
    }

    public boolean VVE() {
        return this.eK;
    }

    public OY brP() {
        return this.ebl;
    }

    public int ebl() {
        return this.NXR;
    }

    public void kqm() {
        this.eK = true;
    }

    public com.bytedance.sdk.openadsdk.activity.Lxb lc() {
        lc lcVar;
        lc lcVar2 = this.sLN;
        if (lcVar2 == null) {
            return null;
        }
        int i = lcVar2.QAg;
        do {
            i++;
            if (i >= this.ZU.size()) {
                return null;
            }
            lcVar = this.ZU.get(i);
        } while (!(lcVar instanceof com.bytedance.sdk.openadsdk.activity.Lxb));
        return (com.bytedance.sdk.openadsdk.activity.Lxb) lcVar;
    }

    public Bundle nBu() {
        return this.lc;
    }

    public void sLN() {
        com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb lxb = this.OY;
        if (lxb != null) {
            lxb.LD();
            return;
        }
        com.bytedance.sdk.openadsdk.Lxb.lk.LD ld = this.QAg;
        if (ld != null) {
            ld.LD();
        }
    }

    private static lc Lxb(LD ld, tD tDVar, int i) {
        boolean zCR = tDVar.cR();
        AdSlot adSlotHg = tDVar.hg();
        return (adSlotHg == null ? !zCR : adSlotHg.getDurationSlotType() != 7) ? new com.bytedance.sdk.openadsdk.activity.ZU(ld, tDVar, i) : new com.bytedance.sdk.openadsdk.activity.JXs(ld, tDVar, i);
    }

    private void lk(lc lcVar, JXs jXs) {
        if (this.JVA == null) {
            return;
        }
        LD();
        if (lcVar == null) {
            lc lcVar2 = this.sLN;
            int i = lcVar2 != null ? lcVar2.QAg + 1 : 0;
            if (i < this.ZU.size()) {
                lcVar = this.ZU.get(i);
            }
            if (lcVar == null) {
                Lxb(this.sLN);
                return;
            }
        }
        lc lcVar3 = this.sLN;
        if (lcVar3 != null) {
            if (lcVar3 == lcVar) {
                return;
            }
            lcVar3.JXs(this.JVA);
            this.sLN.lk(this.JVA);
            View viewLxb = this.sLN.Lxb();
            if (viewLxb != null) {
                this.VVE.removeView(viewLxb);
            }
            this.sLN.IeN();
            this.sLN.nBu = false;
        }
        lcVar.nBu = true;
        lcVar.Lxb(this.JVA, jXs);
        View viewLxb2 = lcVar.Lxb();
        if (viewLxb2 != null) {
            ViewParent parent = viewLxb2.getParent();
            if (parent != null) {
                if (parent == this.VVE) {
                    viewLxb2.setVisibility(0);
                } else if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(viewLxb2);
                }
            }
            if (viewLxb2.getParent() == null) {
                this.VVE.addView(viewLxb2, new ViewGroup.LayoutParams(-1, -1));
            }
            if (this.JVA.getWindow().getContainer() == null) {
                this.JVA.setContentView(this.STP);
            }
        }
        lc lcVar4 = this.sLN;
        this.sLN = lcVar;
        Lxb(lcVar4, lcVar, jXs);
    }

    public void LD(TTAdActivity tTAdActivity) {
        this.brP = 3;
        lc lcVar = this.sLN;
        if (lcVar != null) {
            lcVar.LD(tTAdActivity);
        }
        AbstractC0083LD abstractC0083LD = this.HD;
        if (abstractC0083LD != null) {
            abstractC0083LD.LD();
        }
        sLN sln = this.Lxb;
        if (sln != null) {
            sln.Lxb();
        }
    }

    public void ZU(TTAdActivity tTAdActivity) {
        this.brP = 5;
        lc lcVar = this.sLN;
        if (lcVar != null) {
            lcVar.lk(tTAdActivity);
        }
    }

    public void ZU() {
        lc lcVar = this.sLN;
        if (lcVar != null) {
            lcVar.kqm();
        }
    }

    public boolean Lxb() {
        return this.nBu;
    }

    public void Lxb(TTAdActivity tTAdActivity, Bundle bundle, com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb lxb, com.bytedance.sdk.openadsdk.Lxb.lk.LD ld) {
        this.tD = bundle;
        this.brP = 1;
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar = new com.bytedance.sdk.openadsdk.core.JXs.lk(tTAdActivity);
        this.STP = lkVar;
        if (Build.VERSION.SDK_INT >= 35) {
            lkVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar2 = new com.bytedance.sdk.openadsdk.core.JXs.lk(tTAdActivity);
        this.VVE = lkVar2;
        this.STP.addView(lkVar2, new FrameLayout.LayoutParams(-1, -1));
        if (this.nBu) {
            this.DY = new JVA(tTAdActivity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, le.lk(tTAdActivity, 2.0f));
            layoutParams.gravity = 80;
            this.STP.addView(this.DY, layoutParams);
            com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(tTAdActivity);
            this.kqm = oy;
            oy.setTextColor(-1);
            this.kqm.setTextSize(15.0f);
            this.kqm.setShadowLayer(1.0f, 0.0f, 1.0f, ViewCompat.MEASURED_STATE_MASK);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = le.lk(tTAdActivity, 60.0f);
            layoutParams2.rightMargin = le.lk(tTAdActivity, 16.0f);
            layoutParams2.gravity = 8388661;
            this.STP.addView(this.kqm, layoutParams2);
            com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar3 = new com.bytedance.sdk.openadsdk.component.reward.top.lk(tTAdActivity);
            this.Sfi = lkVar3;
            this.STP.addView(lkVar3, new FrameLayout.LayoutParams(-1, -2));
            this.Sfi.Lxb(this.JXs);
            this.Sfi.setShowDislike(true);
        }
        this.OY = lxb;
        this.QAg = ld;
        if (lxb == null && bundle != null) {
            this.OY = LD;
            LD = null;
        }
        if (ld == null && bundle != null) {
            this.QAg = lk;
            lk = null;
        }
        lk(null, new JXs(1, null));
    }

    public int LD() {
        lc lcVar = this.sLN;
        if (lcVar != null) {
            return lcVar.QAg;
        }
        return -1;
    }

    public void LD(lc lcVar, JXs jXs) {
        lc lcVar2 = this.sLN;
        if (lcVar2 == null || lcVar2 == lcVar) {
            if (lcVar2 != null && (lcVar2 instanceof com.bytedance.sdk.openadsdk.activity.Lxb)) {
                final long jOY = (lcVar2.HD() == null || this.sLN.HD().eK == null) ? 0L : this.sLN.HD().eK.OY();
                final int i = this.sLN.QAg + 1;
                long jCurrentTimeMillis = System.currentTimeMillis();
                lc lcVar3 = this.sLN;
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(jCurrentTimeMillis, lcVar3.OY, lcVar3.b_(), "dislike_skip", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.LD.2
                    @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                    public JSONObject Lxb() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("ad_show_order", i);
                            jSONObject2.put("pag_json_data", jSONObject3.toString());
                            jSONObject.put("duration", jOY);
                            jSONObject.put("ad_extra_data", jSONObject2);
                        } catch (Throwable unused) {
                        }
                        return jSONObject;
                    }
                });
            }
            lk(lc(), jXs);
        }
    }

    public com.bytedance.sdk.openadsdk.activity.lk JXs() {
        com.bytedance.sdk.openadsdk.activity.lk lkVar = this.IeN;
        if (lkVar != null) {
            return lkVar;
        }
        lc lcVar = this.sLN;
        int i = lcVar != null ? lcVar.QAg : -1;
        for (int size = this.ZU.size() - 1; size > i; size--) {
            lc lcVar2 = this.ZU.get(size);
            if (lcVar2 instanceof com.bytedance.sdk.openadsdk.activity.lk) {
                this.IeN = (com.bytedance.sdk.openadsdk.activity.lk) lcVar2;
                break;
            }
        }
        return this.IeN;
    }

    public void lk(TTAdActivity tTAdActivity) {
        this.brP = 4;
        lc lcVar = this.sLN;
        if (lcVar != null) {
            lcVar.JXs(tTAdActivity);
        }
        AbstractC0083LD abstractC0083LD = this.HD;
        if (abstractC0083LD != null) {
            abstractC0083LD.Lxb();
        }
        sLN sln = this.Lxb;
        if (sln != null) {
            sln.LD();
        }
    }

    public Activity lk() {
        return this.JVA;
    }

    private void Lxb(lc lcVar, lc lcVar2, JXs jXs) {
        if (this.nBu) {
            boolean z = lcVar2 instanceof com.bytedance.sdk.openadsdk.activity.Lxb;
            if (z) {
                this.NXR++;
                Lxb(0.0f);
                if (this.HD == null) {
                    if (lcVar2 instanceof com.bytedance.sdk.openadsdk.activity.ZU) {
                        this.HD = new Lxb(this, this.JXs, this.Sfi);
                    } else {
                        this.HD = new ZU(this, this.JXs, this.Sfi);
                    }
                }
                int i = 0;
                for (int i2 = lcVar2.QAg; i2 < this.ZU.size(); i2++) {
                    lc lcVar3 = this.ZU.get(i2);
                    if (lcVar3 instanceof com.bytedance.sdk.openadsdk.activity.lk) {
                        break;
                    }
                    KG kgJJ = lcVar3.OY.JJ();
                    i = kgJJ != null ? (int) (((double) i) + kgJJ.d) : (int) (((long) i) + 10);
                }
                this.HD.Lxb(i);
                sLN sln = this.Lxb;
                if (sln != null && lcVar == null) {
                    sln.Lxb(i * 1000);
                }
            } else if (lcVar2 instanceof com.bytedance.sdk.openadsdk.activity.lk) {
                JVA jva = this.DY;
                if (jva != null) {
                    le.ebl(jva);
                    this.DY = null;
                }
                com.bytedance.sdk.openadsdk.component.reward.top.lk lkVar = this.Sfi;
                if (lkVar != null) {
                    le.ebl(lkVar);
                    le.ebl(this.Sfi.getITopLayout());
                    this.Sfi = null;
                }
                AbstractC0083LD abstractC0083LD = this.HD;
                if (abstractC0083LD != null) {
                    abstractC0083LD.lk();
                }
                if (lcVar instanceof com.bytedance.sdk.openadsdk.activity.JXs) {
                    ((com.bytedance.sdk.openadsdk.activity.JXs) lcVar).eK();
                }
                sLN sln2 = this.Lxb;
                if (sln2 != null) {
                    sln2.lk();
                }
            }
            if (z) {
                this.kqm.setText(this.JVA.getString(com.bytedance.sdk.component.utils.tD.LD(kqm.Lxb(), "tt_multiple_ad_indicator"), Integer.valueOf(lcVar2.QAg + 1), Integer.valueOf(this.CSn)));
            } else {
                this.kqm.setVisibility(8);
            }
        }
        for (int i3 = lcVar != null ? lcVar.QAg : 0; i3 < this.ZU.size(); i3++) {
            this.ZU.get(i3).Lxb(lcVar, lcVar2, jXs);
        }
        lcVar2.Lxb(this.JVA, this.tD);
        int i4 = this.brP;
        if (i4 == 2) {
            lcVar2.ZU(this.JVA);
            return;
        }
        if (i4 == 3) {
            lcVar2.ZU(this.JVA);
            lcVar2.LD(this.JVA);
            lcVar2.LD(true);
        } else if (i4 != 4) {
            if (i4 != 5) {
                return;
            }
            lcVar2.lk(this.JVA);
        } else {
            lcVar2.LD(false);
            lcVar2.JXs(this.JVA);
        }
    }

    public void Lxb(TTAdActivity tTAdActivity) {
        this.brP = 2;
        lc lcVar = this.sLN;
        if (lcVar != null) {
            lcVar.ZU(tTAdActivity);
        }
    }

    public void Lxb(boolean z) {
        lc lcVar = this.sLN;
        if (lcVar != null) {
            lcVar.LD(z);
        }
    }

    public void Lxb(TTAdActivity tTAdActivity, Bundle bundle) {
        com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb lxb = this.OY;
        if (lxb != null) {
            LD = lxb;
            return;
        }
        com.bytedance.sdk.openadsdk.Lxb.lk.LD ld = this.QAg;
        if (ld != null) {
            lk = ld;
        }
    }

    public void Lxb(lc lcVar, JXs jXs) {
        lc lcVar2 = this.sLN;
        if (lcVar2 == null || lcVar2 == lcVar) {
            lk(null, jXs);
        }
    }

    public void Lxb(lc lcVar) {
        Activity activity = this.JVA;
        if (activity != null) {
            activity.finish();
        }
    }

    public void Lxb(lc lcVar, boolean z, boolean z2, boolean z3, int i) {
        com.bytedance.sdk.openadsdk.activity.lk lkVarJXs;
        lc lcVar2 = this.sLN;
        if ((lcVar2 == null || lcVar2 == lcVar) && (lkVarJXs = JXs()) != null) {
            JXs jXs = new JXs(i, lcVar != null ? lcVar.HD() : null);
            jXs.Lxb.putBoolean("isSkip", z);
            jXs.Lxb.putBoolean("force", z2);
            jXs.Lxb.putBoolean("isFromLandingPage", z3);
            lk(lkVarJXs, jXs);
        }
    }

    public void Lxb(Activity activity) {
        lc lcVar = this.sLN;
        if (lcVar != null) {
            lcVar.Lxb(activity);
        }
    }

    public void Lxb(float f) {
        JVA jva = this.DY;
        if (jva == null) {
            return;
        }
        jva.setProgress(f);
        if (f == 0.0f && this.DY.getVisibility() == 0) {
            this.DY.setVisibility(4);
        } else {
            if (f <= 0.0f || this.DY.getVisibility() == 0) {
                return;
            }
            this.DY.setVisibility(0);
        }
    }

    public void Lxb(int i) {
        AbstractC0083LD abstractC0083LD = this.HD;
        if (abstractC0083LD == null) {
            return;
        }
        if (i == 2) {
            abstractC0083LD.Lxb();
            sLN sln = this.Lxb;
            if (sln != null) {
                sln.LD();
                return;
            }
            return;
        }
        if (i == 1) {
            abstractC0083LD.LD();
            sLN sln2 = this.Lxb;
            if (sln2 != null) {
                sln2.Lxb();
            }
        }
    }

    public void Lxb(final lc lcVar, final boolean z, final int i, final String str, final int i2, final String str2) {
        Activity activity;
        if (!this.eK) {
            this.id = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.LD.3
                @Override // java.lang.Runnable
                public void run() {
                    LD.this.Lxb(lcVar, z, i, str, i2, str2);
                }
            };
            return;
        }
        if (STP()) {
            return;
        }
        IeN();
        if (this.OY == null || (activity = this.JVA) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.LD.4
            @Override // java.lang.Runnable
            public void run() {
                LD.this.OY.Lxb(z, i, str, i2, str2);
            }
        });
        if (Lxb()) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(System.currentTimeMillis(), lcVar.OY, lcVar.b_(), z ? "reward_success" : "reward_fail");
        }
    }

    public void Lxb(View view) {
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.VVE.addView(view, 0);
    }
}

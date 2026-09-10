package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.aH;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public final com.bytedance.sdk.openadsdk.component.reward.view.nBu BcA;
    public final IeN CG;
    public final OY CSn;

    @Nullable
    public com.bytedance.sdk.openadsdk.activity.lc FGm;
    public final lc Ivz;
    public final aH JJ;
    public final String JXs;
    public int JZE;
    public final JVA KPU;
    public final com.bytedance.sdk.openadsdk.core.model.tD LD;
    public boolean LXE;
    public boolean Lpq;
    public com.bytedance.sdk.openadsdk.component.reward.top.lk Lv;
    public final int Lxb;
    public com.bytedance.sdk.openadsdk.utils.sLN MGT;
    public final Context NDz;
    public int Nu;
    public boolean Of;

    @NonNull
    public final Activity Pw;
    public boolean SS;
    public float Sv;
    public final boolean VU;
    private long Wi;
    public final boolean ZU;
    public final ZU aH;
    public com.bytedance.sdk.openadsdk.common.NXR ae;
    public com.bytedance.sdk.openadsdk.component.reward.LD.LD bG;
    public final com.bytedance.sdk.openadsdk.core.NXR.ZU.LD dR;

    @NonNull
    public final kqm eK;
    public final boolean ebl;
    public final sLN foI;
    public final brP hg;
    public final com.bytedance.sdk.openadsdk.component.reward.view.OY id;
    public boolean jeq;
    public final int lc;
    public final JXs le;
    public final boolean lk;
    public final lk nE;

    @NonNull
    public final STP nJ;
    public boolean nTb;
    private long oc;
    public final com.bytedance.sdk.openadsdk.component.reward.view.ebl rW;
    public String sRq;
    public int uxf;
    public boolean wbY;
    public com.bytedance.sdk.openadsdk.sLN.OY xan;
    public boolean xr;
    public int OY = 0;
    public int QAg = 0;
    public final AtomicBoolean nBu = new AtomicBoolean(false);
    public final AtomicBoolean JVA = new AtomicBoolean(false);
    public final AtomicBoolean sLN = new AtomicBoolean(false);
    public final AtomicBoolean NXR = new AtomicBoolean(false);
    public final AtomicBoolean STP = new AtomicBoolean(false);
    public final AtomicBoolean IeN = new AtomicBoolean(false);
    public final AtomicBoolean VVE = new AtomicBoolean(false);
    public final AtomicBoolean kqm = new AtomicBoolean(false);
    public final AtomicBoolean brP = new AtomicBoolean(false);
    public final AtomicBoolean tD = new AtomicBoolean(false);
    public final AtomicBoolean DY = new AtomicBoolean(false);
    public final AtomicBoolean Sfi = new AtomicBoolean(false);
    public final AtomicBoolean HD = new AtomicBoolean(false);
    public boolean Ld = false;
    public int Ns = 1;
    public long FD = 0;

    public Lxb(@NonNull Activity activity, aH aHVar, @NonNull com.bytedance.sdk.openadsdk.core.model.tD tDVar, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld, int i) {
        this.Pw = activity;
        this.dR = ld;
        Context contextLxb = com.bytedance.sdk.openadsdk.core.kqm.Lxb();
        this.NDz = contextLxb;
        this.LD = tDVar;
        this.Lxb = i;
        this.VU = i == 0 || i == 2;
        this.jeq = i == 0 || i == 1;
        this.JJ = aHVar;
        boolean z = tDVar.hg().getDurationSlotType() == 7;
        this.ZU = z;
        this.JXs = z ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.xr = tDVar.Lxb();
        this.ebl = com.bytedance.sdk.openadsdk.core.model.kqm.nBu(tDVar);
        int iTd = tDVar.Td();
        this.lc = iTd;
        this.Of = com.bytedance.sdk.openadsdk.core.kqm.ZU().kqm(String.valueOf(iTd));
        this.lk = com.bytedance.sdk.openadsdk.core.settings.VVE.TA().STP(String.valueOf(iTd));
        this.foI = i == 2 ? new NXR(this) : new sLN(this);
        this.BcA = i == 2 ? new com.bytedance.sdk.openadsdk.component.reward.view.JVA(this) : tDVar.Lxb() ? new com.bytedance.sdk.openadsdk.component.reward.view.nBu(this) : new com.bytedance.sdk.openadsdk.component.reward.view.QAg(this);
        this.rW = new com.bytedance.sdk.openadsdk.component.reward.view.ebl(this);
        this.eK = new kqm(this);
        this.aH = new ZU(this);
        this.CSn = new OY(this, tDVar);
        this.id = new com.bytedance.sdk.openadsdk.component.reward.view.OY(this);
        this.hg = new brP(this);
        this.CG = new IeN(this);
        this.nJ = new STP(this);
        this.le = new JXs(this);
        this.KPU = new JVA(this);
        this.Ivz = new lc(this);
        this.nE = new lk(this);
        this.xan = new com.bytedance.sdk.openadsdk.sLN.OY(contextLxb);
        this.MGT = com.bytedance.sdk.openadsdk.utils.ebl.Lxb(activity, new com.bytedance.sdk.openadsdk.utils.ebl.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb.1
            @Override // com.bytedance.sdk.openadsdk.utils.ebl.Lxb
            public void LD() {
                STP stp = Lxb.this.nJ;
                if (stp != null) {
                    stp.lc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ebl.Lxb
            public View Lxb() {
                com.bytedance.sdk.openadsdk.component.reward.view.nBu nbu = Lxb.this.BcA;
                if (nbu != null) {
                    return nbu.nBu();
                }
                return null;
            }
        });
    }

    public void LD() {
        if (this.Wi <= 0) {
            this.Wi = SystemClock.elapsedRealtime();
        }
        this.oc = (SystemClock.elapsedRealtime() - this.Wi) + this.oc;
    }

    public void Lxb(boolean z) {
        this.LXE = z;
        this.nJ.ZU(z);
    }

    public long lk() {
        return (SystemClock.elapsedRealtime() - this.Wi) + this.oc;
    }

    public void Lxb() {
        this.Wi = SystemClock.elapsedRealtime();
    }
}

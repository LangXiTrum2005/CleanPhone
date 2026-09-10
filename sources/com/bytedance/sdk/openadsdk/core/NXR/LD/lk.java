package com.bytedance.sdk.openadsdk.core.NXR.LD;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.component.utils.HD;
import com.bytedance.sdk.component.utils.IeN;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.NXR.NXR;
import com.bytedance.sdk.openadsdk.NXR.STP;
import com.bytedance.sdk.openadsdk.ZU.ebl;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.OY.eK;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Do0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ho0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uo0;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb {
    private final boolean BcA;
    private final boolean CG;
    private int JJ;
    private final Runnable JZE;
    private int Ld;
    private final HD.Lxb Lpq;
    private int NDz;
    private int Ns;
    private final InterfaceC5094yK Of;
    private WeakReference<Ho0> Pw;
    private boolean Sv;
    private ebl VU;
    private WeakReference<Lxb> dR;
    private long hg;
    private final boolean le;
    private final String nJ;
    private boolean rW;
    private LD sRq;
    private long xan;

    public interface Lxb {
        void Lxb(int i);

        void lc();
    }

    public lk(Context context, ViewGroup viewGroup, tD tDVar, String str, boolean z, boolean z2, boolean z3, ebl eblVar) {
        super(context, tDVar, viewGroup);
        this.xan = 0L;
        this.hg = 0L;
        this.rW = true;
        this.NDz = 0;
        this.JJ = 0;
        this.Of = new InterfaceC5094yK() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.1
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
            public void JXs(BK bk) {
                com.bytedance.sdk.openadsdk.core.sLN.Lxb lxbSlV = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY.SlV();
                if (lxbSlV != null && lxbSlV.Lxb() != null) {
                    lxbSlV.Lxb().lk(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).QAg);
                }
                if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).KPU != null) {
                    ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).KPU.Lxb(1);
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
            public void LD(BK bk, int i) {
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
            public void Lxb(BK bk) {
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY, 5);
                            com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY, 5);
                            if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).KPU != null) {
                                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).KPU.Lxb(9);
                            }
                        } catch (Exception unused) {
                        }
                        lk.this.nJ();
                    }
                });
                if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY.SlV() == null || ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY.SlV().Lxb() == null) {
                    return;
                }
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY.SlV().Lxb().ZU(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).QAg);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
            public void ZU(BK bk) {
                com.bytedance.sdk.openadsdk.core.sLN.Lxb lxbSlV = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY.SlV();
                if (lxbSlV != null && lxbSlV.Lxb() != null) {
                    lxbSlV.Lxb().LD(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).QAg);
                }
                com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY, 3);
                if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).KPU != null) {
                    ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).KPU.Lxb(0);
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
            public void LD(BK bk) {
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).lk.removeCallbacks(lk.this.JZE);
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (lk.this.Pw != null && lk.this.Pw.get() != null) {
                            lk.this.Pw.get();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl != null) {
                            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl.LD();
                        }
                    }
                });
                if (lk.this.CG) {
                    return;
                }
                lk lkVar = lk.this;
                lkVar.Lxb(lkVar.VU);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
            public void Lxb(BK bk, long j) {
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).aH = false;
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).lk.removeCallbacks(lk.this.JZE);
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl != null) {
                            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl.LD();
                        }
                        if (!((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).IeN || lk.this.dR == null || lk.this.dR.get() == null) {
                            return;
                        }
                        ((Lxb) lk.this.dR.get()).lc();
                    }
                });
                lk.this.xan();
                com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY, 0);
                if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).KPU != null) {
                    ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).KPU.lk();
                }
                lk lkVar = lk.this;
                lkVar.Lxb(lkVar.VU);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
            public void Lxb(BK bk, final HK hk) {
                sLN.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).Lxb, "onError: " + hk.f3167a + ", " + hk.b + ", " + hk.c);
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        HK hk2 = hk;
                        int i = hk2.f3167a;
                        int i2 = hk2.b;
                        if (!lk.this.id() || i2 == -1004) {
                            if (lk.this.lk(i, i2)) {
                                sLN.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).Lxb, "Play video error，show result page、、、、、、、");
                                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY, (WeakReference<Context>) null, false);
                                lk.this.lk(true);
                                lk.this.ZU();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl != null) {
                                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl.LD();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).foI != null) {
                                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).foI.LD(lk.this.hg, IK.a(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).QAg, ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).Ivz));
                            }
                            if (lk.this.Pw == null || lk.this.Pw.get() == null || lk.this.id()) {
                                return;
                            }
                            ((Ho0) lk.this.Pw.get()).Lxb(i, i2);
                        }
                    }
                });
                lk.this.Lxb(hk);
                com.bytedance.sdk.openadsdk.core.sLN.Lxb lxbSlV = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY.SlV();
                if (lxbSlV != null && lxbSlV.Lxb() != null) {
                    lxbSlV.Lxb().Lxb(com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY, 6);
                com.bytedance.sdk.openadsdk.eK.Lxb.lk.LD(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY);
                if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).KPU != null) {
                    ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).KPU.Lxb(14);
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
            public void Lxb(BK bk, boolean z4) {
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl != null) {
                            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl.LD();
                        }
                    }
                });
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
            public void Lxb(BK bk, int i, int i2) {
                com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        lk.this.BcA();
                    }
                });
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
            public void Lxb(BK bk, int i, int i2, int i3) {
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).aH = true;
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl != null) {
                            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl.kqm();
                            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).lk.postDelayed(lk.this.JZE, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY, 2);
                if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).KPU != null) {
                    ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).KPU.Lxb(4);
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
            public void lk(BK bk) {
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
            public void Lxb(BK bk, int i) {
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).aH = false;
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).lk.removeCallbacks(lk.this.JZE);
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl.LD();
                    }
                });
                com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY, 0);
                if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).KPU != null) {
                    ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).KPU.Lxb(5);
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
            public void Lxb(BK bk, final long j, final long j2) {
                if (Math.abs(j - ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).QAg) < 50) {
                    return;
                }
                lk lkVar = lk.this;
                lkVar.Lxb(lkVar.VU);
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        lk.this.Lxb(j, j2);
                        lk.this.LD(j, j2);
                    }
                });
            }
        };
        this.Ld = 0;
        this.JZE = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.4
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl != null) {
                    ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).OY, (WeakReference<Context>) null, false);
                    ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl.LD();
                    lk.this.lk(true);
                    sLN.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).Lxb, "Show result page after error.......showAdCard");
                }
            }
        };
        this.Lpq = new HD.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.6
            @Override // com.bytedance.sdk.component.utils.HD.Lxb
            @WorkerThread
            public void Lxb(Context context2, Intent intent, boolean z4, final int i) {
                hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        lk.this.JXs(i);
                    }
                });
            }
        };
        this.Sv = false;
        this.Ns = IeN.lk(context);
        Lxb(z);
        this.nJ = str;
        try {
            this.NDz = viewGroup.getWidth();
            this.JJ = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        Lxb(context);
        this.CG = true;
        this.le = z2;
        this.BcA = z3;
        if (eblVar != null) {
            this.VU = eblVar;
        }
    }

    private void lk(Uo0 uo0) {
        uo0.lk(0);
        this.lc.Lxb(uo0);
        this.xan = System.currentTimeMillis();
        this.ebl.lk(8);
        this.ebl.lk(0);
        Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).lc == null) {
                    return;
                }
                lk.this.xan = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).ebl.ZU(0);
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).lc.Lxb(true, ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).QAg, ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).VVE);
            }
        });
        if (this.IeN) {
            brP();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void BcA() {
        com.bytedance.sdk.openadsdk.core.NXR.ZU.lk lkVar;
        int i;
        int i2;
        try {
            if (rW() != null && (lkVar = this.lc) != null && this.CSn != null) {
                int iZU = lkVar.ZU();
                int iJXs = this.lc.JXs();
                final int width = this.CSn.getWidth();
                final int height = this.CSn.getHeight();
                if (width > 0 && height > 0 && iJXs > 0 && iZU > 0) {
                    if (iZU == iJXs) {
                        i2 = width > height ? height : width;
                        i = i2;
                    } else if (iZU > iJXs) {
                        i2 = (int) ((((double) width) * 1.0d) / ((double) ((iZU * 1.0f) / iJXs)));
                        i = width;
                    } else {
                        i = (int) ((((double) height) * 1.0d) / ((double) ((iJXs * 1.0f) / iZU)));
                        i2 = height;
                    }
                    if (i2 <= height && i2 > 0) {
                        height = i2;
                    }
                    if (i <= width && i > 0) {
                        width = i;
                    }
                    this.lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.5
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (lk.this.rW() instanceof TextureView) {
                                    ((TextureView) lk.this.rW()).setLayoutParams(layoutParams);
                                    String unused = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).Lxb;
                                } else if (lk.this.rW() instanceof SurfaceView) {
                                    ((SurfaceView) lk.this.rW()).setLayoutParams(layoutParams);
                                    String unused2 = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).Lxb;
                                }
                            } catch (Throwable unused3) {
                                String unused4 = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) lk.this).Lxb;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            Objects.toString(this.JVA);
            Objects.toString(rW());
        } catch (Throwable th) {
            th.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void JXs(int i) {
        ZU(i);
        if (i == 4) {
            this.kqm = false;
        }
    }

    private void le() {
        com.bytedance.sdk.openadsdk.core.NXR.ZU.lk lkVar = this.lc;
        if (lkVar != null) {
            if (!lkVar.ebl()) {
                this.lc.Lxb(false, this.QAg, this.VVE);
            } else if (this.NXR) {
                Sfi();
            } else {
                LD(this.nE);
            }
        }
        if (this.DY.get()) {
            foI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nJ() {
        this.Ld++;
        JXs jXs = this.ebl;
        if (jXs == null) {
            return;
        }
        jXs.LD();
        Fo0 fo0 = this.foI;
        if (fo0 != null) {
            fo0.Lxb(this.hg, IK.a(this.QAg, this.Ivz));
        }
        this.hg = System.currentTimeMillis() - this.xan;
        if (this.rW) {
            this.ebl.Lxb(this.OY, (WeakReference<Context>) null, true);
        }
        if (!this.Sfi) {
            this.Sfi = true;
            long j = this.Ivz;
            LD(j, j);
            long j2 = this.Ivz;
            this.QAg = j2;
            this.nBu = j2;
            LD(this.VU);
        }
        if (!this.IeN && this.tD) {
            JXs(this.ebl, null);
        }
        this.STP = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TG rW() {
        JXs jXs;
        if (this.JVA.getResources().getConfiguration().orientation != 1 || (jXs = this.ebl) == null) {
            return null;
        }
        return jXs.NXR();
    }

    public void CG() {
        com.bytedance.sdk.openadsdk.core.sLN.lc lcVar = this.KPU;
        if (lcVar != null) {
            lcVar.Lxb(13);
        }
    }

    public void OY(boolean z) {
        JXs jXs = this.ebl;
        if (jXs != null) {
            jXs.Lxb();
        }
        JXs jXs2 = this.ebl;
        if (jXs2 != null && z) {
            jXs2.brP();
        }
        le();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void ZU() {
        com.bytedance.sdk.openadsdk.core.NXR.ZU.lk lkVar = this.lc;
        if (lkVar != null) {
            lkVar.sLN();
            this.lc = null;
        }
        if (this.rW) {
            if ("embeded_ad".equals(this.nJ)) {
                this.ebl.DY();
            } else {
                this.ebl.Lxb(this.OY, (WeakReference<Context>) null, true);
            }
            this.lk.removeCallbacksAndMessages(null);
            this.sLN.clear();
            if (this.IeN) {
                hg();
            }
        }
    }

    public void brP() {
        if (this.Sv || !this.HD) {
            return;
        }
        Context applicationContext = kqm.Lxb().getApplicationContext();
        this.Sv = true;
        HD.Lxb(this.Lpq, applicationContext);
    }

    public void ebl(boolean z) {
        this.rW = z;
    }

    public void hg() {
        if (this.Sv && this.HD) {
            this.Sv = false;
            HD.Lxb(this.Lpq);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void LD() {
        JXs jXs = this.ebl;
        if (jXs != null) {
            jXs.Lxb();
        }
        JXs jXs2 = this.ebl;
        if (jXs2 != null) {
            jXs2.brP();
        }
        le();
    }

    public void Lxb(final lc.Lxb lxb) {
        JXs jXs;
        if (!this.IeN || (jXs = this.ebl) == null) {
            return;
        }
        jXs.Lxb(new lc.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.lk.2
            @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.lc.Lxb
            public void Lxb(View view, int i) {
                lc.Lxb lxb2 = lxb;
                if (lxb2 != null) {
                    lxb2.Lxb(view, i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(long j, long j2) {
        this.OY.lk(j);
        this.QAg = j;
        this.Ivz = j2;
        this.ebl.Lxb(j, j2);
        this.ebl.Lxb(IK.a(j, j2));
        try {
            Fo0 fo0 = this.foI;
            if (fo0 != null) {
                fo0.Lxb(j, j2);
            }
        } catch (Throwable th) {
            sLN.Lxb(this.Lxb, "onProgressUpdate error: ", th);
        }
        com.bytedance.sdk.openadsdk.core.sLN.Lxb lxbSlV = this.OY.SlV();
        if (lxbSlV == null || lxbSlV.Lxb() == null) {
            return;
        }
        lxbSlV.Lxb().Lxb(j, j2, this.KPU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean lk(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    public void Lxb(PAGNativeAd pAGNativeAd) {
        JXs jXs;
        if (!this.IeN || (jXs = this.ebl) == null) {
            return;
        }
        jXs.Lxb(pAGNativeAd);
    }

    private void ZU(int i) {
        if (this.Ns == i) {
            return;
        }
        this.Ns = i;
        if (i != 4 && i != 0) {
            this.brP = false;
        }
        if (!this.brP && !IeN() && this.le) {
            LD(2, i);
        }
        WeakReference<Lxb> weakReference = this.dR;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.dR.get().Lxb(this.Ns);
    }

    public void Lxb(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.NDz = i;
        this.JJ = i2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void lk() {
        Lxb(true, 3);
    }

    public void Lxb(LD ld) {
        this.sRq = ld;
    }

    public void lk(int i) {
        ZU(i);
        if (i == 4) {
            this.kqm = false;
            LD();
        }
    }

    private void Lxb(Context context) {
        ViewGroup nxr;
        if (this.IeN) {
            nxr = new STP(context);
        } else {
            nxr = new NXR(context);
        }
        ViewGroup viewGroup = nxr;
        if (this.IeN) {
            this.ebl = new JXs(context, viewGroup, true, 17, this.OY, this, eK());
        } else {
            this.ebl = new ZU(context, viewGroup, true, 17, this.OY, this, false);
        }
        this.ebl.Lxb(this);
    }

    private boolean LD(int i, int i2) {
        if (i2 == 0) {
            Lxb();
            this.kqm = true;
            JXs jXs = this.ebl;
            if (jXs != null) {
                jXs.Lxb(this.OY, (WeakReference<Context>) null, false);
            }
        }
        if (i2 != 4 && i2 != 0) {
            JXs jXs2 = this.ebl;
            if (jXs2 != null) {
                jXs2.Lxb();
            }
            Lxb();
            this.kqm = true;
            this.brP = false;
            JXs jXs3 = this.ebl;
            if (jXs3 != null) {
                return jXs3.Lxb(i, this.OY.JJ(), this.BcA);
            }
        } else if (i2 == 4) {
            this.kqm = false;
            JXs jXs4 = this.ebl;
            if (jXs4 != null) {
                jXs4.IeN();
            }
        }
        return true;
    }

    public com.bytedance.sdk.openadsdk.core.sLN.lc Lxb(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.OY.chu()) {
            return null;
        }
        if (this.KPU == null) {
            this.KPU = com.bytedance.sdk.openadsdk.core.sLN.lc.Lxb();
        }
        this.KPU.Lxb(view, this.OY.SlV().STP());
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    Object obj = pair.second;
                    this.KPU.Lxb((View) pair.first, obj == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) obj);
                }
            }
        }
        return this.KPU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void Lxb(Ho0 ho0) {
        this.Pw = new WeakReference<>(ho0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public boolean Lxb(Uo0 uo0) {
        if (this.lc != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(uo0.NXR())) {
            sLN.Lxb(this.Lxb, "[video] play video stop , because no video info");
            return false;
        }
        lk(false);
        uo0.NXR();
        LD(uo0);
        Ivz();
        com.bytedance.sdk.openadsdk.core.sLN.lc lcVar = this.KPU;
        if (lcVar != null) {
            lcVar.Lxb(false, 0.0f);
        }
        if (!eK.LD(this.nJ) || this.QAg <= 0) {
            this.QAg = uo0.ebl();
        }
        if (uo0.ebl() <= 0) {
            this.Sfi = false;
            this.DY.set(false);
        } else {
            long jEbl = uo0.ebl();
            this.QAg = jEbl;
            this.nBu = Math.max(this.nBu, jEbl);
        }
        JXs jXs = this.ebl;
        if (jXs != null) {
            jXs.Lxb();
            if (this.Ld == 0) {
                this.ebl.ebl();
            }
            this.ebl.lk(uo0.JXs(), uo0.lc());
            this.ebl.lk(this.CSn);
            this.ebl.Lxb(uo0.JXs(), uo0.lc());
        }
        if (this.lc == null) {
            com.bytedance.sdk.openadsdk.core.NXR.ZU.lk lkVar = new com.bytedance.sdk.openadsdk.core.NXR.ZU.lk();
            this.lc = lkVar;
            lkVar.Lxb(this.Of);
        }
        tD();
        this.hg = 0L;
        try {
            lk(uo0);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            HK hk = new HK();
            hk.f3167a = -10;
            hk.b = 0;
            hk.c = message;
            Lxb(hk);
            sLN.Lxb(this.Lxb, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e)));
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void Lxb(boolean z, int i) {
        if (!this.Sfi && this.DY.get()) {
            if (z) {
                com.bytedance.sdk.openadsdk.ZU.JXs.LD.IeN.Lxb lxb = new com.bytedance.sdk.openadsdk.ZU.JXs.LD.IeN.Lxb();
                lxb.Lxb(JXs());
                lxb.lk(OY());
                lxb.LD(lc());
                lxb.lk(i);
                lxb.ZU(ebl());
                com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb(this.ebl, lxb, this.VU);
                this.Sfi = false;
            } else {
                KPU();
            }
        }
        ZU();
        com.bytedance.sdk.openadsdk.core.sLN.lc lcVar = this.KPU;
        if (lcVar != null) {
            lcVar.ZU();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb, com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb
    public void Lxb(RG rg, View view) {
        com.bytedance.sdk.openadsdk.core.NXR.ZU.lk lkVar = this.lc;
        if (lkVar == null) {
            return;
        }
        if (lkVar.lc()) {
            Lxb();
            this.ebl.LD(true, false);
            this.ebl.lc();
            return;
        }
        if (!this.lc.ebl()) {
            JXs jXs = this.ebl;
            if (jXs != null) {
                jXs.lk(this.CSn);
            }
            ZU(this.QAg);
            JXs jXs2 = this.ebl;
            if (jXs2 != null) {
                jXs2.LD(false, false);
                return;
            }
            return;
        }
        OY(false);
        JXs jXs3 = this.ebl;
        if (jXs3 != null) {
            jXs3.LD(false, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb
    public void Lxb(RG rg, View view, boolean z) {
        lc(!this.tD);
        if (this.JVA instanceof Activity) {
            JXs jXs = this.ebl;
            if (jXs != null) {
                jXs.LD(this.CSn);
                this.ebl.lk(false);
            }
            Lxb(1);
            WeakReference<Do0> weakReference = this.id;
            Do0 do0 = weakReference != null ? weakReference.get() : null;
            if (do0 != null) {
                do0.Lxb(this.tD);
            }
        }
    }

    public void Lxb(Lxb lxb) {
        this.dR = new WeakReference<>(lxb);
    }
}

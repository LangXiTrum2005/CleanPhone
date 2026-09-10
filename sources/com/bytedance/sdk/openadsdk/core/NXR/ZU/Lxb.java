package com.bytedance.sdk.openadsdk.core.NXR.ZU;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.NXR.STP;
import com.bytedance.sdk.openadsdk.ZU.ebl;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.model.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.sLN.lc;
import com.bytedance.sdk.openadsdk.eK.LD.JXs;
import com.bytedance.sdk.openadsdk.utils.le;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uo0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb {
    private long BcA;
    final lk.LD CG;
    private InterfaceC0097Lxb NDz;
    private final int Pw;
    private final Runnable dR;
    protected boolean hg;
    private long le;
    private final ebl nJ;
    private boolean rW;
    protected long xan;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb$1, reason: invalid class name */
    public class AnonymousClass1 implements lk.LD {
        private boolean LD = true;

        public AnonymousClass1() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.lk.LD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void JXs(BK bk) {
            JXs.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY, 0);
            if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).KPU != null) {
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).KPU.Lxb(1);
            }
            if (Lxb.this.NDz != null) {
                Lxb.this.NDz.Lxb(1);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.lk.LD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void LD(BK bk, int i) {
        }

        @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.lk.LD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk) {
            String unused = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).Lxb;
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.1.1
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).KPU != null) {
                        try {
                            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).KPU.Lxb(9);
                        } catch (Exception unused2) {
                        }
                    }
                    Lxb.this.dR();
                }
            });
            com.bytedance.sdk.openadsdk.core.sLN.Lxb lxbSlV = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY.SlV();
            if (lxbSlV != null && lxbSlV.Lxb() != null) {
                long jJXs = Lxb.this.JXs();
                lxbSlV.Lxb().ZU(jJXs);
                lxbSlV.Lxb().JXs(jJXs);
            }
            JXs.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY, 5);
            com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY, 5);
            if (Lxb.this.NDz != null) {
                Lxb.this.NDz.Lxb(3);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.lk.LD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void ZU(BK bk) {
            com.bytedance.sdk.openadsdk.core.sLN.Lxb lxbSlV = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY.SlV();
            if (lxbSlV != null && lxbSlV.Lxb() != null) {
                lxbSlV.Lxb().LD(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).QAg);
            }
            JXs.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY, 3);
            if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).KPU != null) {
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).KPU.Lxb(0);
            }
            if (Lxb.this.NDz != null) {
                Lxb.this.NDz.Lxb(2);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.lk.LD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void lk(BK bk) {
            String unused = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).Lxb;
        }

        @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.lk.LD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void LD(BK bk) {
            String unused = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).Lxb;
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lk.removeCallbacks(Lxb.this.dR);
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.1.3
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).ebl != null) {
                        ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).ebl.LD();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.lk.LD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk, long j) {
            String unused = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).Lxb;
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).aH = false;
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lk.removeCallbacks(Lxb.this.dR);
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.1.2
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).ebl != null) {
                        ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).ebl.LD();
                    }
                }
            });
            if (!((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).DY.get()) {
                Lxb lxb = Lxb.this;
                lxb.xan = j;
                lxb.Lxb(lxb.nJ);
                Lxb.this.xan();
            }
            if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).KPU != null) {
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).KPU.lk();
            }
            JXs.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY, 0);
        }

        @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.lk.LD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk, HK hk) {
            sLN.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).Lxb, "onError: " + hk.f3167a + "," + hk.b + "," + hk.c);
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lk.removeCallbacks(Lxb.this.dR);
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.1.4
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).ebl != null) {
                        ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).ebl.LD();
                    }
                    if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).foI != null) {
                        ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).foI.LD(Lxb.this.BcA, IK.a(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).QAg, ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).Ivz));
                    }
                }
            });
            Lxb.this.Lxb(hk);
            JXs.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY, 6);
            com.bytedance.sdk.openadsdk.eK.Lxb.lk.LD(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY);
            if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).KPU != null) {
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).KPU.Lxb(14);
            }
            if (Lxb.this.NDz != null) {
                Lxb.this.NDz.Lxb(4);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.lk.LD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk, boolean z) {
            String unused = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).Lxb;
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lk.removeCallbacks(Lxb.this.dR);
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.1.5
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).ebl != null) {
                        ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).ebl.LD();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.lk.LD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk, int i, int i2) {
            String unused = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).Lxb;
            com.bytedance.sdk.component.utils.ebl.Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.1.6
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lc == null) {
                        return;
                    }
                    try {
                        final float fZU = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lc.ZU();
                        final float fJXs = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lc.JXs();
                        if (fZU == 0.0f || fJXs == 0.0f) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.1.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (!Lxb.this.NDz()) {
                                    Lxb.this.Lxb(fZU, fJXs);
                                    return;
                                }
                                if (kqm.LD(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY) || ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).eK.JXs == 4) {
                                    Lxb.this.Lxb(true, fZU, fJXs);
                                    return;
                                }
                                if (kqm.lk(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY)) {
                                    Lxb.this.Lxb(true, fZU, fJXs);
                                    return;
                                }
                                if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY.Ivz() == 3) {
                                    Lxb.this.Lxb(true, fZU, fJXs);
                                } else if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY.Ivz() == 0) {
                                    Lxb.this.lk(fZU, fJXs);
                                } else {
                                    Lxb.this.LD(fZU, fJXs);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        sLN.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).Lxb, th.getMessage());
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.lk.LD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk, int i, int i2, int i3) {
            String unused = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).Lxb;
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).aH = true;
            Lxb.this.Pw();
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.1.7
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).ebl != null) {
                        ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).ebl.kqm();
                    }
                }
            });
            JXs.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY, 3);
            if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).KPU != null) {
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).KPU.Lxb(4);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.lk.LD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk, int i) {
            String unused = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).Lxb;
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).aH = false;
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lk.removeCallbacks(Lxb.this.dR);
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.1.8
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).ebl != null) {
                        ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).ebl.LD();
                    }
                }
            });
            JXs.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY, 0);
            if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).KPU != null) {
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).KPU.Lxb(5);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.lk.LD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk, long j, long j2) {
            if (Math.abs(j - ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).QAg) < 50) {
                return;
            }
            Lxb lxb = Lxb.this;
            lxb.Lxb(lxb.nJ);
            Lxb.this.Lxb(j, j2);
            Lxb.this.LD(j, j2);
            com.bytedance.sdk.openadsdk.core.sLN.Lxb lxbSlV = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).OY.SlV();
            if (lxbSlV != null && lxbSlV.Lxb() != null) {
                lxbSlV.Lxb().Lxb(j, j2, ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).KPU);
            }
            if (!this.LD || j2 - j >= 500) {
                return;
            }
            this.LD = false;
            Lxb(bk);
        }

        @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.lk.LD
        public void Lxb(int i, int i2) {
            Lxb lxb = Lxb.this;
            lxb.LD(lxb.nJ);
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).eK.ZU = ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lc.DY();
            Lxb.this.Ivz();
            ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).DY.set(false);
            Lxb lxb2 = Lxb.this;
            lxb2.Lxb(lxb2.nJ);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb$Lxb, reason: collision with other inner class name */
    public interface InterfaceC0097Lxb {
        void Lxb(int i);
    }

    public Lxb(Context context, ViewGroup viewGroup, tD tDVar, ebl eblVar) {
        super(context, tDVar, viewGroup);
        this.le = 0L;
        this.BcA = 0L;
        this.rW = false;
        this.xan = 0L;
        this.hg = false;
        this.CG = new AnonymousClass1();
        this.dR = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).foI != null) {
                    Lxb.this.brP();
                    ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).foI.Lxb();
                }
            }
        };
        this.nJ = eblVar;
        this.Pw = tDVar.Td();
        if (tDVar.chu() && tDVar.SlV() != null && this.CSn != null) {
            if (this.KPU == null) {
                this.KPU = lc.Lxb();
            }
            this.KPU.Lxb(this.CSn, tDVar.SlV().STP());
        }
        com.bytedance.sdk.openadsdk.core.NXR.LD.JXs jXs = new com.bytedance.sdk.openadsdk.core.NXR.LD.JXs(context.getApplicationContext(), new STP(context), true, 17, this.OY, this);
        this.ebl = jXs;
        jXs.Lxb(this);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb
    public boolean aH() {
        return true;
    }

    public void brP() {
    }

    private boolean JJ() {
        return nJ() == null || this.lc == null || (!com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb(this.OY.id()) ? this.OY.rW() != null : this.OY.dR() != null) || this.OY.nE() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean NDz() {
        return this.OY.Za() == 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pw() {
        int iDR;
        int i = this.eK.JXs;
        if (i == 2 || i == 1) {
            iDR = com.bytedance.sdk.openadsdk.core.kqm.ZU().dR() * 1000;
        } else {
            iDR = i == 4 ? com.bytedance.sdk.openadsdk.core.kqm.ZU().QAg(String.valueOf(this.Pw)) : 5000;
        }
        this.lk.removeCallbacks(this.dR);
        this.lk.postDelayed(this.dR, iDR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dR() {
        if (this.ebl == null) {
            return;
        }
        this.lk.removeCallbacks(this.dR);
        this.ebl.LD();
        this.BcA = System.currentTimeMillis() - this.le;
        if (!this.rW) {
            this.rW = true;
            long j = this.Ivz;
            LD(j, j);
            long j2 = this.Ivz;
            this.QAg = j2;
            this.nBu = j2;
            LD(this.nJ);
        }
        Fo0 fo0 = this.foI;
        if (fo0 != null) {
            fo0.Lxb(this.BcA, IK.a(this.QAg, this.Ivz));
        }
        this.STP = true;
    }

    private void rW() {
        this.lc.lk(nE());
        this.lc.Lxb(this.eK);
        this.le = System.currentTimeMillis();
        this.ebl.lk(8);
        this.ebl.lk(0);
        Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lc == null) {
                    return;
                }
                Lxb.this.le = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).ebl.ZU(0);
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).lc.Lxb(true, ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).QAg, ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).VVE);
            }
        });
    }

    public void BcA() {
        lc lcVar = this.KPU;
        if (lcVar != null) {
            lcVar.Lxb(13);
        }
    }

    public void CG() {
        if (this.rW || !this.DY.get()) {
            return;
        }
        foI();
        com.bytedance.sdk.openadsdk.core.sLN.Lxb lxbSlV = this.OY.SlV();
        if (lxbSlV == null || lxbSlV.Lxb() == null) {
            return;
        }
        lxbSlV.Lxb().lk(JXs());
    }

    public void hg() {
        this.CG.Lxb((BK) null, 0, 0);
    }

    public void le() {
        lc lcVar = this.KPU;
        if (lcVar != null) {
            lcVar.Lxb(2);
        }
    }

    public TG nJ() {
        com.bytedance.sdk.openadsdk.core.NXR.LD.JXs jXs = this.ebl;
        if (jXs != null) {
            return jXs.NXR();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void ZU() {
        lk();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void lk() {
        lk lkVar = this.lc;
        if (lkVar == null) {
            return;
        }
        lkVar.sLN();
        this.lc = null;
        com.bytedance.sdk.openadsdk.core.NXR.LD.JXs jXs = this.ebl;
        if (jXs != null) {
            jXs.QAg();
        }
        this.lk.removeCallbacks(this.dR);
        this.lk.removeCallbacksAndMessages(null);
        lc lcVar = this.KPU;
        if (lcVar != null) {
            lcVar.ZU();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void LD() {
        com.bytedance.sdk.openadsdk.core.NXR.LD.JXs jXs = this.ebl;
        if (jXs != null) {
            jXs.Lxb();
            this.ebl.IeN();
            this.ebl.brP();
        }
        lk lkVar = this.lc;
        if (lkVar != null) {
            if (lkVar.ebl()) {
                if (this.NXR) {
                    if (QAg.HD()) {
                        this.lc.LD(3);
                        lk lkVar2 = this.lc;
                        lkVar2.Lxb(false, lkVar2.kqm(), this.VVE);
                    } else {
                        Sfi();
                    }
                } else {
                    LD(this.nE);
                }
            } else {
                this.lc.Lxb(false, this.QAg, this.VVE);
            }
        }
        if (this.rW || !this.DY.get()) {
            return;
        }
        foI();
        com.bytedance.sdk.openadsdk.core.sLN.Lxb lxbSlV = this.OY.SlV();
        if (lxbSlV == null || lxbSlV.Lxb() == null) {
            return;
        }
        lxbSlV.Lxb().lk(JXs());
    }

    public void Lxb(boolean z, float f, float f2) {
        try {
            Objects.toString(this.OY.hg());
            if (!JJ() || z) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f, (int) f2);
                layoutParams.addRule(13);
                if (nJ() != null) {
                    if (nJ() instanceof TextureView) {
                        ((TextureView) nJ()).setLayoutParams(layoutParams);
                    } else if (nJ() instanceof SurfaceView) {
                        ((SurfaceView) nJ()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.CSn.getLayoutParams();
                    if (this.CSn.getHeight() > 0) {
                        float fMin = Math.min(this.CSn.getWidth() / f, this.CSn.getHeight() / f2);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (f * fMin);
                            layoutParams.height = (int) (f2 * fMin);
                            if (nJ() instanceof TextureView) {
                                ((TextureView) nJ()).setLayoutParams(layoutParams);
                            } else if (nJ() instanceof SurfaceView) {
                                ((SurfaceView) nJ()).setLayoutParams(layoutParams);
                            }
                            if (this.eK.JXs == 4) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.CSn.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            sLN.Lxb(this.Lxb, "changeSize error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk(float f, float f2) {
        try {
            if (nJ() != null && this.lc != null) {
                boolean z = this.OY.wCT() == 1;
                int[] iArrLD = le.LD(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
                Lxb(iArrLD[0], iArrLD[1], f, f2, z);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(float f, float f2) {
        try {
            Objects.toString(this.OY.hg());
            if (JJ()) {
                return;
            }
            int[] iArrLD = le.LD(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
            boolean z = false;
            boolean z2 = this.OY.wCT() == 1;
            float f3 = iArrLD[0];
            float f4 = iArrLD[1];
            if (z2) {
                if (f > f2) {
                    Lxb(f3, f4, f, f2, true);
                    return;
                }
            } else if (f < f2) {
                Lxb(f3, f4, f, f2, false);
                return;
            }
            float f5 = f / f2;
            float f6 = f3 / f4;
            if (z2) {
                if (f6 < 0.5625f && f5 == 0.5625f) {
                    f = (9.0f * f4) / 16.0f;
                    f2 = f4;
                    z = true;
                }
            } else if (f6 > 1.7777778f && f5 == 1.7777778f) {
                f2 = (9.0f * f3) / 16.0f;
                f = f3;
                z = true;
            }
            if (z) {
                f3 = f;
                f4 = f2;
            }
            int i = (int) f3;
            int i2 = (int) f4;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(13);
            if (nJ() != null) {
                if (nJ() instanceof TextureView) {
                    ((TextureView) nJ()).setLayoutParams(layoutParams);
                } else if (nJ() instanceof SurfaceView) {
                    ((SurfaceView) nJ()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.CSn.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = i2;
                    layoutParams2.width = i;
                    this.CSn.setLayoutParams(layoutParams2);
                }
            }
        } catch (Throwable th) {
            sLN.Lxb(this.Lxb, "changeSize error", th);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public boolean Lxb(@NonNull Uo0 uo0) {
        int iTD;
        View view;
        if (this.lc != null) {
            sLN.Lxb(this.Lxb, "playVideoUrl: already invoked");
            return false;
        }
        uo0.NXR();
        if (TextUtils.isEmpty(uo0.NXR())) {
            sLN.Lxb(this.Lxb, "No video info");
            return false;
        }
        LD(uo0);
        uo0.lk(1);
        this.hg = !uo0.NXR().startsWith(ProxyConfig.MATCH_HTTP);
        if (this.KPU != null) {
            if (this.eK.JXs == 1) {
                iTD = com.bytedance.sdk.openadsdk.core.kqm.ZU().nBu(String.valueOf(this.Pw));
            } else {
                iTD = com.bytedance.sdk.openadsdk.core.kqm.ZU().tD(String.valueOf(this.Pw));
            }
            ViewGroup viewGroup = this.CSn;
            if (viewGroup != null && (view = (View) viewGroup.getParent()) != null) {
                try {
                    View viewFindViewById = view.findViewById(com.bytedance.sdk.openadsdk.utils.STP.sLN);
                    View viewFindViewById2 = view.findViewById(com.bytedance.sdk.openadsdk.utils.STP.Yw);
                    lc lcVar = this.KPU;
                    FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                    lcVar.Lxb(viewFindViewById2, friendlyObstructionPurpose);
                    this.KPU.Lxb(viewFindViewById, friendlyObstructionPurpose);
                } catch (Throwable unused) {
                }
            }
            this.KPU.Lxb(iTD > 0, iTD / 1000.0f);
        }
        Ivz();
        if (uo0.ebl() > 0) {
            long jEbl = uo0.ebl();
            this.QAg = jEbl;
            this.nBu = Math.max(this.nBu, jEbl);
        }
        com.bytedance.sdk.openadsdk.core.NXR.LD.JXs jXs = this.ebl;
        if (jXs != null) {
            jXs.Lxb();
            this.ebl.ebl();
            this.ebl.lk(uo0.JXs(), uo0.lc());
            this.ebl.lk(this.CSn);
        }
        lk lkVar = new lk();
        this.lc = lkVar;
        lkVar.Lxb(this.CG);
        tD();
        this.BcA = 0L;
        rW();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(final long j, final long j2) {
        this.OY.lk(j);
        this.QAg = j;
        this.Ivz = j2;
        final int iA = IK.a(j, j2);
        this.lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.4
            @Override // java.lang.Runnable
            public void run() {
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).ebl.Lxb(j, j2);
                ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).ebl.Lxb(iA);
                try {
                    if (((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).foI != null) {
                        ((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).foI.Lxb(j, j2);
                    }
                } catch (Throwable th) {
                    sLN.Lxb(((com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb) Lxb.this).Lxb, "onProgressUpdate error: ", th);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void Lxb(boolean z, int i) {
        lk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(float f, float f2) {
        ViewGroup viewGroup;
        try {
            if (nJ() != null && this.lc != null && (viewGroup = this.CSn) != null) {
                float width = viewGroup.getWidth();
                float f3 = f / (width * 1.0f);
                float height = this.CSn.getHeight();
                if (f3 <= f2 / (1.0f * height)) {
                    width = (height / f2) * f;
                } else {
                    height = (width / f) * f2;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) width, (int) height);
                layoutParams.addRule(13);
                if (nJ() instanceof TextureView) {
                    ((TextureView) nJ()).setLayoutParams(layoutParams);
                } else if (nJ() instanceof SurfaceView) {
                    ((SurfaceView) nJ()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            sLN.Lxb(this.Lxb, "changeVideoSizeSupportInteraction error", th);
        }
    }

    private void Lxb(float f, float f2, float f3, float f4, boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        if (f3 <= 0.0f || f4 <= 0.0f) {
            try {
                f3 = this.OY.JJ().b;
                f4 = this.OY.JJ().f3307a;
            } catch (Throwable unused) {
                return;
            }
        }
        if (f4 > 0.0f && f3 > 0.0f) {
            if (z) {
                if (f3 < f4) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f, (int) ((f4 * f) / f3));
            } else if (f3 > f4) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f3 * f2) / f4), (int) f2);
            }
            layoutParams.addRule(13);
            if (nJ() != null) {
                if (nJ() instanceof TextureView) {
                    ((TextureView) nJ()).setLayoutParams(layoutParams);
                } else if (nJ() instanceof SurfaceView) {
                    ((SurfaceView) nJ()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.CSn.getLayoutParams();
                if (!com.bytedance.sdk.component.adexpress.ZU.LD.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb()) || this.CSn.getHeight() <= 0 || layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.CSn.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb, com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb
    public void Lxb(RG rg, View view) {
        lk lkVar = this.lc;
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
            com.bytedance.sdk.openadsdk.core.NXR.LD.JXs jXs = this.ebl;
            if (jXs != null) {
                jXs.lk(this.CSn);
            }
            ZU(this.QAg);
            com.bytedance.sdk.openadsdk.core.NXR.LD.JXs jXs2 = this.ebl;
            if (jXs2 != null) {
                jXs2.LD(false, false);
                return;
            }
            return;
        }
        LD();
        com.bytedance.sdk.openadsdk.core.NXR.LD.JXs jXs3 = this.ebl;
        if (jXs3 != null) {
            jXs3.LD(false, false);
        }
    }

    public void Lxb(InterfaceC0097Lxb interfaceC0097Lxb) {
        this.NDz = interfaceC0097Lxb;
    }
}

package com.bytedance.sdk.openadsdk.component.reward;

import android.os.CountDownTimer;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.IeN;
import com.bytedance.sdk.openadsdk.core.model.tD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Do0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ho0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uo0;

/* JADX INFO: loaded from: classes2.dex */
public class lk implements So0 {
    private boolean JXs;
    private final Lxb Lxb;
    private com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.InterfaceC0097Lxb OY;
    private final DK ebl;
    private final tD lc;
    private boolean LD = true;
    private long lk = 0;
    private boolean ZU = false;

    public static class Lxb implements BK {
        private Fo0 JXs;
        private long LD;
        private final long Lxb;
        private final com.bytedance.sdk.openadsdk.ZU.ebl OY;
        private CountDownTimer ZU;
        private final DK ebl;
        private long lc;
        private int lk = 0;

        public Lxb(long j, DK dk, com.bytedance.sdk.openadsdk.ZU.ebl eblVar) {
            this.Lxb = j;
            this.ebl = dk;
            this.OY = eblVar;
        }

        public long IeN() {
            return this.lc;
        }

        public void JVA() {
            this.lk = 0;
            CountDownTimer countDownTimer = this.ZU;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.ZU = null;
            }
            if (this.JXs != null) {
                this.JXs = null;
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
        public int JXs() {
            return 0;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
        public boolean LD() {
            return false;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
        public boolean Lxb() {
            return false;
        }

        public int NXR() {
            return 0;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
        public boolean OY() {
            return this.lk == 0;
        }

        public void QAg() {
            if (this.lk == 1) {
                return;
            }
            this.lk = 1;
            final long jSTP = STP();
            final long j = jSTP - this.LD;
            CountDownTimer countDownTimer = new CountDownTimer(j, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.lk.Lxb.1
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    Lxb.this.lk = 4;
                    Lxb.this.lc = jSTP;
                    if (Lxb.this.JXs != null) {
                        Lxb.this.JXs.Lxb(Lxb.this.IeN(), 100);
                    }
                    IeN.Lxb lxb = new IeN.Lxb();
                    lxb.Lxb(jSTP);
                    lxb.lk(jSTP);
                    lxb.LD(Lxb.this.sLN());
                    lxb.ZU(Lxb.this.NXR());
                    com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.LD(Lxb.this.ebl, lxb, Lxb.this.OY);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j2) {
                    long j3 = (j - j2) + Lxb.this.LD;
                    Lxb.this.lc = j3;
                    if (Lxb.this.JXs != null) {
                        Lxb.this.JXs.Lxb(j3, jSTP);
                    }
                }
            };
            this.ZU = countDownTimer;
            countDownTimer.start();
        }

        public long STP() {
            return this.Lxb;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
        public int ZU() {
            return 0;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
        public boolean ebl() {
            return this.lk == 2;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
        public boolean lk() {
            return false;
        }

        public void nBu() {
            this.lk = 2;
            this.LD = this.lc;
            CountDownTimer countDownTimer = this.ZU;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.ZU = null;
            }
        }

        public long sLN() {
            return 0L;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
        public boolean lc() {
            return this.lk == 1;
        }

        public void Lxb(long j) {
            this.LD = j;
        }

        public void Lxb(Fo0 fo0) {
            this.JXs = fo0;
        }
    }

    public lk(tD tDVar, com.bytedance.sdk.openadsdk.ZU.ebl eblVar) {
        DK dk = new DK() { // from class: com.bytedance.sdk.openadsdk.component.reward.lk.1
        };
        this.ebl = dk;
        this.lc = tDVar;
        KG kgJJ = tDVar.JJ();
        long j = 10;
        long j2 = kgJJ != null ? (long) kgJJ.d : 10L;
        if (j2 <= 0) {
            kgJJ.d = 10.0d;
        } else {
            j = j2;
        }
        this.Lxb = new Lxb(j * 1000, dk, eblVar);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public boolean IeN() {
        return this.JXs;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public boolean JVA() {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void JXs(boolean z) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void LD(Uo0 uo0) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void Lxb(Do0 do0) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public RG NXR() {
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public long OY() {
        return this.Lxb.STP();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public long QAg() {
        return JXs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public boolean STP() {
        return this.ZU;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public boolean VVE() {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void ZU(boolean z) {
    }

    public DK brP() {
        return this.ebl;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public int ebl() {
        return 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public boolean kqm() {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public long lc() {
        return 0L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void lk(long j) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public int nBu() {
        return IK.a(this.Lxb.lc, this.Lxb.Lxb);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public BK sLN() {
        return this.Lxb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public long JXs() {
        return this.Lxb.IeN();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void LD() {
        this.Lxb.QAg();
        IeN.Lxb lxb = new IeN.Lxb();
        lxb.Lxb(JXs());
        lxb.lk(OY());
        lxb.LD(lc());
        com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.LD(this.ebl, lxb);
        com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.InterfaceC0097Lxb interfaceC0097Lxb = this.OY;
        if (interfaceC0097Lxb != null) {
            interfaceC0097Lxb.Lxb(1);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void Lxb(Ho0 ho0) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void ZU() {
        lk();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void lk() {
        this.Lxb.JVA();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void Lxb() {
        this.Lxb.nBu();
        IeN.Lxb lxb = new IeN.Lxb();
        lxb.Lxb(JXs());
        lxb.lk(OY());
        lxb.LD(lc());
        com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb(this.ebl, lxb);
        com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.InterfaceC0097Lxb interfaceC0097Lxb = this.OY;
        if (interfaceC0097Lxb != null) {
            interfaceC0097Lxb.Lxb(2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void lk(boolean z) {
        this.JXs = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void LD(long j) {
        this.lk = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void LD(boolean z) {
        this.ZU = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void Lxb(boolean z, int i) {
        lk();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public boolean Lxb(Uo0 uo0) {
        this.ZU = uo0.OY();
        if (uo0.ebl() > 0) {
            this.Lxb.Lxb(uo0.ebl());
        }
        com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb(this.lc, this.ebl, uo0);
        this.Lxb.QAg();
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void Lxb(long j) {
        this.Lxb.Lxb(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void Lxb(boolean z) {
        this.LD = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void Lxb(Fo0 fo0) {
        this.Lxb.Lxb(fo0);
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.InterfaceC0097Lxb interfaceC0097Lxb) {
        this.OY = interfaceC0097Lxb;
    }
}

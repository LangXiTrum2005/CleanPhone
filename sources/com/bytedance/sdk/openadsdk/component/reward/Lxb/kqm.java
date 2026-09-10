package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.app.Activity;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class kqm {
    private com.bytedance.sdk.openadsdk.ZU.ebl DY;
    private long JVA;
    private final com.bytedance.sdk.openadsdk.core.model.tD OY;
    private FrameLayout QAg;
    private String STP;
    private boolean VVE;
    final boolean ZU;
    private boolean brP;
    private final Activity ebl;
    private final Lxb kqm;
    So0 lc;
    boolean lk;
    private final String nBu;
    private long sLN;
    private com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.InterfaceC0097Lxb tD;
    protected boolean Lxb = false;
    boolean LD = false;
    protected boolean JXs = false;
    private int NXR = -1;
    private HashSet<String> IeN = new HashSet<>();

    public kqm(Lxb lxb) {
        this.kqm = lxb;
        this.ebl = lxb.Pw;
        this.OY = lxb.LD;
        this.ZU = lxb.ZU;
        this.nBu = lxb.JXs;
    }

    private void CG() {
        So0 so0 = this.lc;
        if (so0 == null || so0.sLN() == null) {
            return;
        }
        this.JVA = this.lc.JXs();
        if (this.lc.sLN().lk() || !this.lc.sLN().LD()) {
            this.lc.Lxb();
            this.lc.lk();
            this.Lxb = true;
        }
    }

    public void CSn() {
        sLN();
    }

    public long DY() {
        So0 so0 = this.lc;
        if (so0 != null) {
            return so0.OY();
        }
        return 0L;
    }

    public boolean HD() {
        return this.lc != null;
    }

    public void IeN() {
        So0 so0 = this.lc;
        if (so0 != null) {
            so0.Lxb();
        }
    }

    public void Ivz() {
        So0 so0 = this.lc;
        if (so0 instanceof com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) {
            ((com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) so0).hg();
        }
    }

    public long JVA() {
        So0 so0 = this.lc;
        if (so0 != null) {
            return so0.lc();
        }
        return 0L;
    }

    public boolean JXs() {
        So0 so0 = this.lc;
        return so0 != null && so0.VVE();
    }

    public double KPU() {
        long jZU;
        com.bytedance.sdk.openadsdk.core.model.brP brpQAg = this.OY.QAg();
        if (com.bytedance.sdk.openadsdk.core.model.kqm.ZU(this.OY) && brpQAg != null) {
            jZU = brpQAg.LD();
        } else {
            if (!com.bytedance.sdk.openadsdk.core.model.kqm.JXs(this.OY) || brpQAg == null) {
                KG kgJJ = this.OY.JJ();
                if (kgJJ != null) {
                    return kgJJ.d * ((double) kgJJ.r);
                }
                return 0.0d;
            }
            jZU = brpQAg.ZU();
        }
        return jZU;
    }

    public void NXR() {
        So0 so0 = this.lc;
        if (so0 != null) {
            so0.ZU();
        }
    }

    public long OY() {
        return this.sLN;
    }

    public long QAg() {
        return this.JVA;
    }

    public void STP() {
        So0 so0 = this.lc;
        if (so0 != null) {
            so0.LD();
        }
    }

    public boolean Sfi() {
        So0 so0 = this.lc;
        if (so0 != null) {
            if (so0.sLN() != null) {
                BK bkSLN = this.lc.sLN();
                if (bkSLN.ebl() || bkSLN.OY()) {
                    So0 so1 = this.lc;
                    if (so1 instanceof com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) {
                        ((com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) so1).CG();
                    }
                    return true;
                }
            } else if (lc()) {
                Lxb(false);
                So0 so2 = this.lc;
                if (so2 instanceof com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) {
                    ((com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) so2).CG();
                }
                return true;
            }
        }
        return false;
    }

    public long VVE() {
        So0 so0 = this.lc;
        if (so0 != null) {
            return so0.OY();
        }
        return 0L;
    }

    public boolean ZU() {
        So0 so0 = this.lc;
        return (so0 == null || so0.sLN() == null || !this.lc.sLN().ebl()) ? false : true;
    }

    public boolean aH() {
        return this.lk;
    }

    public int brP() {
        So0 so0 = this.lc;
        if (so0 != null) {
            return so0.ebl();
        }
        return 0;
    }

    public boolean eK() {
        So0 so0 = this.lc;
        return so0 != null && so0.sLN() == null;
    }

    public long ebl() {
        So0 so0 = this.lc;
        return so0 != null ? so0.JXs() : this.JVA;
    }

    public boolean foI() {
        So0 so0 = this.lc;
        if (so0 == null || so0.sLN() == null) {
            return false;
        }
        return this.lc.sLN().Lxb();
    }

    public void hg() {
        So0 so0 = this.lc;
        if (so0 instanceof com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) {
            ((com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) so0).BcA();
        }
    }

    public void id() {
        try {
            if (LD()) {
                this.JXs = true;
                IeN();
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e.getMessage());
        }
    }

    public int kqm() {
        So0 so0 = this.lc;
        if (so0 != null) {
            return so0.nBu();
        }
        return 0;
    }

    public boolean lc() {
        return this.Lxb;
    }

    public void nBu() {
        try {
            if (LD()) {
                this.lc.Lxb();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.LD("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage());
        }
    }

    public View nE() {
        So0 so0 = this.lc;
        if (so0 instanceof com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) {
            return (View) ((com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) so0).nJ();
        }
        return null;
    }

    public void sLN() {
        So0 so0 = this.lc;
        if (so0 == null) {
            return;
        }
        so0.lk();
        this.lc = null;
    }

    public long tD() {
        So0 so0 = this.lc;
        if (so0 == null) {
            return 0L;
        }
        return this.lc.lc() + so0.OY();
    }

    public void xan() {
        So0 so0 = this.lc;
        if (so0 instanceof com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) {
            ((com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) so0).le();
        }
    }

    public boolean LD() {
        So0 so0 = this.lc;
        return (so0 == null || so0.sLN() == null || !this.lc.sLN().lc()) ? false : true;
    }

    public com.bytedance.sdk.openadsdk.ZU.ebl Lxb() {
        return this.DY;
    }

    public void ZU(boolean z) {
        this.brP = z;
        if (this.lc instanceof com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) {
            if (z) {
                ((com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) this.lc).LD(this.OY.JJ().r);
            } else {
                KG kgJJ = this.OY.JJ();
                kgJJ.getClass();
                kgJJ.r = Math.min(4, Math.max(1, 1));
                ((com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) this.lc).LD(1);
            }
        }
    }

    public DK lk() {
        So0 so0 = this.lc;
        if (so0 != null) {
            return so0 instanceof com.bytedance.sdk.openadsdk.component.reward.lk ? ((com.bytedance.sdk.openadsdk.component.reward.lk) so0).brP() : so0.NXR();
        }
        return null;
    }

    private void LD(long j, long j2) {
        int iAbs = (int) Math.abs(((long) this.NXR) - j);
        int i = this.NXR;
        if (i < 0 || iAbs > 500 || i > j2 || iAbs >= 500 || this.IeN.contains(this.STP)) {
            return;
        }
        if (this.NXR > j) {
            com.bytedance.sdk.openadsdk.core.STP.lk().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.kqm.1
                @Override // java.lang.Runnable
                public void run() {
                    kqm.this.id();
                    kqm.this.kqm.id.Lxb(kqm.this.NXR, kqm.this.STP);
                }
            }, iAbs);
        } else {
            id();
            this.kqm.id.Lxb(this.NXR, this.STP);
        }
        this.IeN.add(this.STP);
    }

    public void Lxb(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.ZU.ebl eblVar) {
        if (this.VVE) {
            return;
        }
        this.VVE = true;
        this.QAg = frameLayout;
        this.DY = eblVar;
        if (com.bytedance.sdk.openadsdk.core.model.tD.JXs(this.OY)) {
            this.lc = new com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb(this.ebl, this.QAg, this.OY, eblVar);
            ZU(this.brP);
            com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.InterfaceC0097Lxb interfaceC0097Lxb = this.tD;
            if (interfaceC0097Lxb != null) {
                ((com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb) this.lc).Lxb(interfaceC0097Lxb);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.lk lkVar = new com.bytedance.sdk.openadsdk.component.reward.lk(this.OY, eblVar);
        this.lc = lkVar;
        com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.InterfaceC0097Lxb interfaceC0097Lxb2 = this.tD;
        if (interfaceC0097Lxb2 != null) {
            lkVar.Lxb(interfaceC0097Lxb2);
        }
    }

    public void lk(boolean z) {
        this.lk = z;
    }

    public void LD(boolean z) {
        So0 so0 = this.lc;
        if (so0 != null) {
            so0.LD(z);
        }
    }

    public void LD(com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld) {
        if (!Sfi() || ld == null) {
            return;
        }
        ld.Lxb(QAg(), true);
    }

    public void Lxb(com.bytedance.sdk.openadsdk.ZU.ebl eblVar) {
        this.DY = eblVar;
    }

    public void Lxb(long j, long j2) {
        this.sLN = j;
        LD(j, j2);
    }

    public void Lxb(int i, String str) {
        this.NXR = i;
        this.STP = str;
    }

    public void Lxb(long j) {
        this.JVA = j;
    }

    public void Lxb(boolean z) {
        this.Lxb = z;
    }

    public void Lxb(int i, int i2) {
        if (this.lc != null) {
            com.bytedance.sdk.openadsdk.ZU.JXs.LD.IeN.Lxb lxb = new com.bytedance.sdk.openadsdk.ZU.JXs.LD.IeN.Lxb();
            lxb.LD(JVA());
            lxb.lk(tD());
            lxb.Lxb(ebl());
            lxb.Lxb(i);
            lxb.LD(i2);
            com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.ZU(this.lc.NXR(), lxb);
        }
    }

    public void Lxb(Fo0 fo0) {
        So0 so0 = this.lc;
        if (so0 != null) {
            so0.Lxb(fo0);
        }
    }

    public void Lxb(String str, boolean z) {
        if (this.lc != null) {
            long jEbl = ebl();
            if (this.OY.MH()) {
                jEbl = this.kqm.lk();
            }
            long j = jEbl;
            JSONObject jSONObjectLxb = nJ.Lxb(this.OY, this.lc.lc(), this.lc.sLN());
            try {
                jSONObjectLxb.put("auto_click", z);
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.OY, this.nBu, str, j, kqm(), jSONObjectLxb, this.DY);
            tD();
            kqm();
        }
        xan();
    }

    public boolean Lxb(long j, boolean z, Map<String, Object> map, com.bytedance.sdk.openadsdk.component.reward.LD.LD ld) {
        boolean zLxb = false;
        if (!HD()) {
            return false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.kqm.ZU(this.kqm.LD) || com.bytedance.sdk.openadsdk.core.model.kqm.JXs(this.kqm.LD)) {
            return true;
        }
        if (!z || !eK()) {
            Lxb(ld);
        }
        try {
            zLxb = Lxb(j, this.kqm.Of);
        } catch (Exception unused) {
        }
        if (zLxb && !z) {
            this.kqm.KPU.Lxb(map);
        }
        return zLxb;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.component.reward.LD.LD ld) {
        if (this.kqm.nBu.get()) {
            return;
        }
        Lxb lxb = this.kqm;
        if (!lxb.Ld || eK.lk(lxb.LD)) {
            return;
        }
        if ((!com.bytedance.sdk.openadsdk.core.model.tD.JXs(this.kqm.LD) && com.bytedance.sdk.openadsdk.core.kqm.ZU().NXR(String.valueOf(this.kqm.lc)) == 1 && this.kqm.id.ZU()) || com.bytedance.sdk.openadsdk.core.model.kqm.ZU(this.kqm.LD) || com.bytedance.sdk.openadsdk.core.model.kqm.JXs(this.kqm.LD) || this.JXs || !ld.lc()) {
            return;
        }
        this.kqm.JJ.removeMessages(300);
        Message messageObtain = Message.obtain();
        messageObtain.what = 300;
        this.kqm.JJ.sendMessageDelayed(messageObtain, 5000L);
    }

    private boolean Lxb(long j, boolean z) {
        if (this.lc == null || this.OY.JJ() == null) {
            return false;
        }
        String strB = ((OK) CacheDirFactory.getICacheDir(this.OY.tv())).b();
        File file = new File(strB, this.OY.JJ().b());
        if (file.exists() && file.length() > 0) {
            this.LD = true;
        }
        com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = com.bytedance.sdk.openadsdk.core.model.tD.Lxb(strB, this.OY);
        ldLxb.LD(this.OY.bG());
        ldLxb.Lxb(this.QAg.getWidth());
        ldLxb.LD(this.QAg.getHeight());
        ldLxb.lk(this.OY.Lv());
        ldLxb.Lxb(j);
        ldLxb.Lxb(z);
        if (this.kqm.LD.Lxb() && !this.kqm.id.OY() && com.bytedance.sdk.openadsdk.core.model.tD.JXs(this.OY)) {
            ldLxb.ZU = 1;
        }
        return this.lc.Lxb(ldLxb);
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld) {
        try {
            this.JXs = false;
            if (lc()) {
                CG();
                LD(ld);
            } else if (ZU()) {
                STP();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void Lxb(boolean z, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld, boolean z2) {
        if (!z2 || z || this.JXs) {
            return;
        }
        if (ZU()) {
            STP();
        } else {
            CG();
            LD(ld);
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.InterfaceC0097Lxb interfaceC0097Lxb) {
        this.tD = interfaceC0097Lxb;
    }
}

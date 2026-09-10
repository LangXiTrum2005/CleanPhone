package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.reward.LD.ebl;
import com.bytedance.sdk.openadsdk.component.reward.Lxb.JVA;
import com.bytedance.sdk.openadsdk.component.reward.Lxb.kqm;
import com.bytedance.sdk.openadsdk.component.reward.view.OY;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.NXR;
import com.bytedance.sdk.openadsdk.utils.Sfi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uo0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Lxb extends lc implements aH.Lxb, com.bytedance.sdk.openadsdk.component.reward.Lxb.JXs.Lxb, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD {
    private boolean IeN;
    private final AtomicBoolean JXs;

    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.LD.LD LD;
    protected final aH Lxb;
    private int NXR;
    private boolean STP;
    protected int ZU;
    private Bundle ebl;
    private int lc;
    protected com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lk;

    public Lxb(LD ld, tD tDVar, int i) {
        super(ld, tDVar, i);
        this.Lxb = new aH(Looper.getMainLooper(), this);
        this.JXs = new AtomicBoolean(false);
        this.lc = 1;
        this.NXR = 0;
        this.STP = false;
    }

    private void CG() {
        if (this.OY.Lxb()) {
            return;
        }
        if (eK.brP(this.lk.LD)) {
            Lxb(false, com.bytedance.sdk.openadsdk.ZU.LD.C0078LD.lk);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.LD;
        if (ld != null) {
            ld.Lxb(this.lk.BcA.lc());
            this.LD.id();
        }
    }

    private void eK() {
        this.lk.rW.Lxb(this.LD);
        this.LD.Lxb(this, this.Lxb);
        this.LD.JVA();
    }

    private void hg() {
        if (this.OY.Lxb() && !this.STP) {
            this.STP = true;
            Lxb().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.Lxb.2
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public void run() {
                    Lxb lxb = Lxb.this;
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = lxb.lk;
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.lc lcVar = lxb2.Ivz;
                    float[] fArrLxb = lxb2.foI.Lxb(lxb.lc);
                    Lxb lxb3 = Lxb.this;
                    lcVar.Lxb(fArrLxb, lxb3, lxb3.LD);
                }
            });
        }
    }

    private void nE() {
        this.LD.Lxb(this.sLN);
        this.ZU = (int) this.lk.eK.KPU();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
        if (lxb.nTb) {
            Lxb(lxb.KPU.JXs());
            Lxb(this.lk.KPU.ZU());
        }
        lk();
        CG();
        if (this.lk.LD.SlV() == null || this.lk.LD.SlV().Lxb() == null) {
            return;
        }
        this.lk.LD.SlV().Lxb().Lxb(0L);
    }

    private boolean xan() {
        if (this.lk.nBu.get() && this.lk.ebl) {
            return false;
        }
        if (this.OY.Lxb()) {
            return this.lk.nBu.get();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public String DY() {
        return this.lk.sRq;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb HD() {
        return this.lk;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public void IeN() {
        super.IeN();
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.LD;
        if (ld == null) {
            return;
        }
        ld.HD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public final void JVA() {
        if (!this.lk.STP.getAndSet(true) || eK.lk(this.lk.LD)) {
            this.lk.KPU.Lxb();
        }
    }

    public final void JXs() {
        Message message = new Message();
        message.what = 400;
        if (this.OY.cR()) {
            Lxb(10000);
        }
        this.Lxb.sendMessageDelayed(message, 2000L);
    }

    public abstract void LD();

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public final void LD(Activity activity) {
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld;
        super.LD(activity);
        if (this.lk == null || (ld = this.LD) == null) {
            return;
        }
        ld.kqm();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
        lxb.Ld = true;
        lxb.foI.LD(this.Lxb);
        if (xan()) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.lk;
            lxb2.nJ.Lxb(lxb2.LD.FV());
        }
        this.lk.BcA.IeN();
        this.lk.hg.HD();
        this.lk.CSn.NXR();
        if (this.LD.LD()) {
            this.lk.eK.Lxb(this.LD);
            this.lk.eK.Lxb(false, this, this.NXR != 0);
        }
        this.NXR++;
        hg();
        OY oy = this.lk.id;
        if (oy != null) {
            oy.ebl();
        }
        this.lk.foI.Lxb(this.Lxb);
        this.LD.tD();
    }

    public void Lxb(int i) {
    }

    public abstract void Lxb(Bundle bundle);

    public final void NXR() {
        this.Lxb.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public final void OY() {
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.LD;
        if (ld == null) {
            return;
        }
        ld.NXR();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public final void QAg() {
        this.lk.eK.Ivz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public void STP() {
    }

    public void Sfi() {
        aH().Lxb(this, LD(com.bytedance.sdk.openadsdk.ZU.LD.C0078LD.LD));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.JXs.Lxb
    public void VVE() {
        lk lkVarJXs;
        LD ldAH = aH();
        if (ldAH == null || (lkVarJXs = ldAH.JXs()) == null) {
            return;
        }
        lkVarJXs.JXs();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public final void ZU() {
        Ivz();
        this.lk.LD.BK();
        this.lk.LD.Lxb(true);
        if (tD.JXs(this.lk.LD)) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
            tD tDVar = lxb.LD;
            com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, lxb.JXs, tDVar.mhk());
        }
    }

    public void brP() {
        com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = tD.Lxb(((OK) CacheDirFactory.getICacheDir(this.OY.tv())).b(), this.OY);
        ldLxb.Lxb("material_meta", this.OY);
        ldLxb.Lxb("ad_slot", this.OY.hg());
        com.bytedance.sdk.openadsdk.core.NXR.JXs.Lxb.Lxb(ldLxb, new PG() { // from class: com.bytedance.sdk.openadsdk.activity.Lxb.3
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
            public void Lxb(Uo0 uo0, int i) {
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
            public void Lxb(Uo0 uo0, int i, String str) {
            }
        });
    }

    public abstract void ebl();

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public void kqm() {
        super.kqm();
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.LD;
        if (ld != null) {
            ld.eK();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public final void lc() {
        if (this.JXs.compareAndSet(false, true)) {
            Sfi.Lxb("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            ebl();
        }
    }

    public abstract void lk();

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public void lk(Activity activity) {
        super.lk(activity);
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.LD;
        if (ld == null) {
            return;
        }
        ld.Sfi();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.LD
    public final View nBu() {
        return this.lk.eK.nE();
    }

    public void sLN() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public boolean tD() {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
        return lxb != null && lxb.eK.aH();
    }

    public void Lxb(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public final void Lxb(Activity activity, Bundle bundle) {
        this.ebl = bundle;
        super.Lxb(activity, bundle);
        Lxb(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public final void JXs(Activity activity) {
        super.JXs(activity);
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.LD;
        if (ld == null) {
            return;
        }
        ld.DY();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public final void ZU(Activity activity) {
        super.ZU(activity);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
        if (lxb == null) {
            return;
        }
        lxb.hg.hg();
        com.bytedance.sdk.openadsdk.utils.lk.Lxb(activity, this.lk.LD);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public final View Lxb() {
        return this.lk.rW;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public void Lxb(Activity activity, LD.JXs jXs) {
        super.Lxb(activity, jXs);
        this.lc = this.OY.wCT();
        Lxb(this.OY, this.ebl);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
        if (lxb.nTb && this.QAg > 0) {
            lxb.Of = jXs.ZU;
        }
        try {
            eK();
            nE();
        } catch (Throwable th) {
            sLN.Lxb("TTAD.AdScene", "onCreate: ", th);
            com.bytedance.sdk.openadsdk.STP.lk.LD();
            id();
        }
    }

    private void Lxb(tD tDVar, Bundle bundle) {
        Activity activityCSn = CSn();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = new com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb(activityCSn, this.Lxb, tDVar, this, 1);
        this.lk = lxb;
        lxb.nTb = aH().Lxb();
        this.lk.Lv = aH().OY();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.lk;
        lxb2.FGm = this;
        lxb2.xan = aH().brP();
        Intent intent = activityCSn.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.Lxb.LD.Lxb(this.lk, intent, bundle);
        if (intent != null) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.LD.Lxb(intent, this.lk);
            tDVar.Lxb(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.lk.LXE) {
            LD();
        }
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ldLxb = ebl.Lxb(this.lk);
        this.LD = ldLxb;
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = this.lk;
        lxb3.bG = ldLxb;
        lxb3.le.Lxb(this);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb4 = this.lk;
        if (lxb4.nTb) {
            lxb4.eK.Lxb(new com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.InterfaceC0097Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.Lxb.1
                @Override // com.bytedance.sdk.openadsdk.core.NXR.ZU.Lxb.InterfaceC0097Lxb
                public void Lxb(int i) {
                    LD ldAH = Lxb.this.aH();
                    if (ldAH == null) {
                        return;
                    }
                    ldAH.Lxb(i);
                }
            });
            aH().OY().setShowSound(tD.JXs(tDVar));
        }
        NXR.Lxb(this.lk);
        Objects.toString(this.LD);
    }

    public LD.JXs LD(int i) {
        LD.JXs jXs = new LD.JXs(i, this.lk);
        jXs.ZU = this.lk.Of;
        return jXs;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public void LD(boolean z) {
        JVA jva;
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
        if (lxb != null && (jva = lxb.KPU) != null) {
            jva.LD(z);
            this.lk.KPU.lk(z);
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.lk;
        if (lxb2 != null) {
            com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = lxb2.bG;
            if (ld instanceof com.bytedance.sdk.openadsdk.component.reward.LD.lc) {
                ((com.bytedance.sdk.openadsdk.component.reward.LD.lc) ld).LD(z);
            }
        }
    }

    private void Lxb(com.bytedance.sdk.openadsdk.core.LD.LD ld) {
        if (ld != null) {
            HashMap map = new HashMap();
            map.put("ad_show_order", Integer.valueOf(this.QAg + 1));
            ld.Lxb(map);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public void Lxb(Activity activity) {
        super.Lxb(activity);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
        if (lxb == null) {
            return;
        }
        lxb.foI.Lxb();
    }

    public final void Lxb(boolean z, int i) {
        Lxb(z, false, i);
    }

    public final void Lxb(boolean z, boolean z2, int i) {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.lk;
        lxb.le.Lxb(z, z2, false, lxb.bG, i);
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public final void Lxb(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.LD.LD ld = this.LD;
        if (ld == null) {
            return;
        }
        ld.Lxb(message);
    }

    public void Lxb(String str, JSONObject jSONObject) {
        if (str == null || !"skipToNextAd".equals(str) || aH() == null) {
            return;
        }
        aH().LD(this, LD(7));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.JXs.Lxb
    public void Lxb(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.LD.LD ld, int i) {
        Lxb(z, z2, z3, i);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lc
    public void Lxb(lc lcVar, lc lcVar2, LD.JXs jXs) {
        super.Lxb(lcVar, lcVar2, jXs);
        if (lcVar == this && (lcVar2 instanceof lk)) {
            int i = jXs.LD;
            if (i == 3) {
                kqm kqmVar = this.lk.eK;
                kqmVar.Lxb(!kqmVar.foI() ? 1 : 0, 2);
            } else if (i == 6) {
                kqm kqmVar2 = this.lk.eK;
                kqmVar2.Lxb(!kqmVar2.foI() ? 1 : 0, !this.lk.eK.foI() ? 1 : 0);
            } else if (i == 5 && !tD.JXs(this.lk.LD) && jXs.JXs) {
                this.lk.eK.Lxb("skip", true);
            }
            this.lk.nJ.Lxb(false);
            this.lk.nJ.ZU(false);
        }
        if (lcVar2.QAg != 0 || this.QAg == 0) {
            return;
        }
        this.OY.QAg("0");
        Map<String, Object> mapHu = this.OY.Hu();
        if (mapHu != null) {
            mapHu.put("price", "0");
        }
    }

    public void Lxb(float f) {
        LD ldAH = aH();
        if (ldAH == null) {
            return;
        }
        ldAH.Lxb(f);
        if (this.IeN || f < this.OY.YUS() / 100.0f) {
            return;
        }
        this.IeN = true;
        lc lcVarQAg = ldAH.QAg();
        if (lcVarQAg instanceof Lxb) {
            ((Lxb) lcVarQAg).brP();
        }
    }
}

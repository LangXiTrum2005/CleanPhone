package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private ri ik;
    private final com.bytedance.sdk.openadsdk.component.reward.view.xha lr;
    private final com.bytedance.sdk.openadsdk.component.reward.ri.ri ri;

    public interface ri {
        void ri(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar, int i);
    }

    public fi(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        this.ri = riVar;
        this.lr = new com.bytedance.sdk.openadsdk.component.reward.view.xha(riVar);
    }

    private int di() {
        wjv wjvVar;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        if (riVar != null && (wjvVar = riVar.lr) != null) {
            int iVtj = wjvVar.vtj();
            if (nr.ka() == null) {
                return -1;
            }
            int iRi = nr.ka().ri(this.ri.lr.ur());
            if (!ri(iVtj) && !ri(iRi)) {
                return Math.min(lr(iVtj), lr(iRi));
            }
        }
        return -1;
    }

    private boolean ri(int i) {
        return i < 0 || i > 20000;
    }

    public boolean fi() {
        return this.lr.fi();
    }

    public void ik() {
        this.lr.ka();
    }

    public void ka() {
        ri(true);
    }

    public void lr() {
        this.lr.ik();
    }

    public boolean lr(com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar) {
        boolean z;
        this.ri.xha = di();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        int i = riVar.xha;
        if (riVar.lr.ac()) {
            return false;
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.ri;
        int i2 = riVar2.xha;
        if (i2 != -1) {
            if (i2 >= 0) {
                riVar2.nr.set(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar3 = this.ri;
                messageObtain.arg1 = riVar3.xha;
                riVar3.jc.sendMessage(messageObtain);
                if (!dw.xha(this.ri.lr)) {
                    z = true;
                }
            }
            z = false;
        } else if (riVar2.ajz == null && dw.mj(riVar2.lr) && this.ri.ory.aw()) {
            lrVar.uq();
            z = false;
        } else {
            lrVar.aw();
            z = true;
        }
        if (this.ri.ory.ac() ? false : z) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar4 = this.ri;
            if (riVar4.aac == null || !riVar4.xha()) {
                return true;
            }
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar5 = this.ri;
            riVar5.aac.ri(riVar5.xha);
        }
        return true;
    }

    public void ri() {
        this.lr.ri();
    }

    public void ri(com.bytedance.sdk.openadsdk.core.ik.fi fiVar) {
        this.lr.ri(fiVar);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0138  */
    public void ri(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar, int i) {
        if (this.ri != null) {
            com.bytedance.sdk.openadsdk.di.lr.ri().ri("videoForceBreak", this.ri.lr);
            com.bytedance.sdk.openadsdk.ay.ri.ik.lr(this.ri.lr);
        }
        Objects.toString(lrVar);
        if (this.ri.ig.isFinishing() || lrVar == null) {
            return;
        }
        this.ri.dzy.co();
        if (z2) {
            this.ri.f18096co.set(true);
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        if (riVar.zb && !riVar.aw.get() && !ac.aw(this.ri.lr) && !ac.sf(this.ri.lr) && (!ac.lr(this.ri.lr) || !this.ri.f18096co.get() || !this.ri.bgr.get())) {
            if ((ac.lr(this.ri.lr) && z3) || !lr(z2)) {
                return;
            }
            if (ac.lr(this.ri.lr) || ac.ka(this.ri.lr) || ac.xha(this.ri.lr)) {
                this.ri.oh.ik(false);
                lrVar.aw();
                return;
            }
        }
        if (this.ri.ig.isDestroyed() || this.ri.ig.isFinishing()) {
            return;
        }
        if (this.ri.lr.vgs()) {
            com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar = this.ri.ay;
            com.bytedance.sdk.openadsdk.core.jbs.ik brandBannerController = (jbsVar == null || jbsVar.ri() == null) ? null : jbsVar.ri().getBrandBannerController();
            if (brandBannerController != null) {
                brandBannerController.lr();
            }
            this.ri.ig.finish();
            return;
        }
        ri riVar2 = this.ik;
        if (riVar2 != null) {
            riVar2.ri(z, z2, z3, lrVar, i);
            return;
        }
        this.ri.ihz.ac();
        this.ri.ory.uq();
        this.ri.qt.set(false);
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar3 = this.ri;
        if (riVar3.yjm) {
            com.bytedance.sdk.openadsdk.activity.single.mj mjVar = riVar3.ajz;
            if (!(mjVar instanceof com.bytedance.sdk.openadsdk.activity.single.fi) || mjVar.ig()) {
                this.ri.sf.set(false);
            }
        } else {
            this.ri.sf.set(false);
        }
        this.ri.zf.ri();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar4 = this.ri;
        riVar4.oh.ri(riVar4.lr.nlk());
        if (this.ri.jbs.getAndSet(true)) {
            return;
        }
        if (dw.lr(this.ri.lr) && this.ri.luy) {
            ri(z, z2, z3, i);
            this.ri.dzy.ka(8);
            this.ri.oh.ik(true);
            this.ri.wjv.qt();
            com.bytedance.sdk.openadsdk.core.vr.ik().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.fi.1
                @Override // java.lang.Runnable
                public void run() {
                    fi.this.ri.dzy.ik();
                    if (fi.this.ri.ay != null) {
                        fi.this.ri.ay.di();
                    }
                }
            });
            return;
        }
        ri(z, lrVar);
    }

    private int lr(int i) {
        if (i <= 1000) {
            return 1000;
        }
        return (i / 1000) * 1000;
    }

    private boolean lr(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.view.ik ikVarRi;
        if (!ac.ik(this.ri.lr) || (ikVarRi = this.ri.ay.ri()) == null || ikVarRi.ka != 0 || z) {
            return true;
        }
        this.ri.oh.ik(false);
        return false;
    }

    private void ri(boolean z, boolean z2, boolean z3, int i) {
        int i2;
        HashMap map = new HashMap();
        if (this.ri.ory.igq()) {
            i2 = 1;
        } else {
            i2 = !this.ri.ory.bgr() ? -1 : 2;
        }
        map.put("webview_state", Integer.valueOf(i2));
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        com.bytedance.sdk.openadsdk.ka.ik.ri(riVar.lr, riVar.fi, z, z2, z3, riVar.ig.isFinishing(), i, map);
    }

    public void ri(boolean z, com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar) {
        aw awVar;
        this.ri.vr.set(z);
        lrVar.co();
        this.ri.lr.zz();
        this.ri.oh.ka(false);
        this.ri.oh.ik(false);
        this.ri.ory.wjv();
        ac acVar = this.ri.dzy.vr;
        if (acVar != null) {
            acVar.fi();
        }
        this.ri.dzy.ik();
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar = this.ri.ay;
        if (jbsVar != null) {
            jbsVar.di();
        }
        mj mjVar = this.ri.wjv;
        if (mjVar != null) {
            mjVar.ik(mj.lr);
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        if (!TextUtils.isEmpty(wjv.ri(riVar.srn, riVar.lr))) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.ri;
            com.bytedance.sdk.openadsdk.utils.wjv.ri(riVar2.ig, dw.co(riVar2.lr), this.ri.lr, com.bytedance.sdk.openadsdk.ka.lr.ri.ik, true);
            return;
        }
        if (wjv.ik(this.ri.lr) && (awVar = this.ri.hcw) != null) {
            awVar.di();
        }
        if (!wjv.ri(this.ri.lr) && (wjv.ik(this.ri.lr) || !this.ri.ory.dw())) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar3 = this.ri;
            if (wjv.ri(riVar3.lr, riVar3.ory.aw(), this.ri.ory.oh(), this.ri.hcw.co(), this.ri.ory.ay())) {
                if (!wjv.ka(this.ri.lr) && !wjv.ik(this.ri.lr)) {
                    this.ri.ory.ri(true, 0, (String) null);
                }
                lr(lrVar);
                ri(lrVar);
                return;
            }
        }
        ka();
    }

    public void ri(com.bytedance.sdk.openadsdk.component.reward.lr.lr lrVar) {
        if (!wjv.ik(this.ri.lr)) {
            this.ri.hcw.ri(8);
            this.ri.ory.ri(0);
            this.ri.ory.ory();
        } else {
            this.ri.ory.ri(8);
            this.ri.hcw.ri(0);
            this.ri.hcw.xha();
        }
        this.ri.dzy.ka(8);
        this.ri.dzy.xha();
        if (wjv.ik(this.ri.lr)) {
            this.ri.jc.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        riVar.ory.ri(riVar.zyn, true);
        this.ri.ory.ik(true);
        this.ri.ory.lr(true);
        dzy dzyVarJbs = this.ri.ory.jbs();
        if (dzyVarJbs != null) {
            dzyVarJbs.ri("prerender_page_show", (JSONObject) null);
        }
        if (!dw.lr(this.ri.lr)) {
            this.ri.oh.ik(false);
        }
        com.bytedance.sdk.component.jbs.di diVarMj = this.ri.ory.mj();
        if (diVarMj == null || diVarMj.getWebView() == null) {
            return;
        }
        diVarMj.aw();
        diVarMj.getWebView().resumeTimers();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void ri(boolean z) {
        if (!wjv.ka(this.ri.lr)) {
            this.ri.ory.ri(false, 408, "end_card_timeout");
        }
        this.ri.ory.lr(com.bytedance.sdk.openadsdk.core.co.di.ri.ik.ri() ? 1 : 0);
        this.ri.ory.ri(8);
        this.ri.hcw.ri(8);
        this.ri.dzy.ka(8);
        if (this.ri.lr.zz()) {
            if (!this.lr.ri(this.ri.ihz)) {
                this.ri.ig.finish();
            }
        } else {
            com.bytedance.sdk.openadsdk.activity.single.mj mjVar = this.ri.ajz;
            if (mjVar != null) {
                this.lr.ri(mjVar.jc().qt());
            }
            this.lr.lr();
        }
        this.ri.dzy.xha();
        if (z) {
            lr(this.ri.nd);
        }
        this.ri.oh.ik(false);
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        riVar.su.ri(riVar.lr.qa());
    }

    public void ri(ri riVar) {
        this.ik = riVar;
    }
}

package com.bytedance.sdk.openadsdk.core.OY;

import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.hg;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class DY extends com.bytedance.sdk.component.adexpress.LD.Lxb<Lxb> {
    private com.bytedance.sdk.component.adexpress.LD.ebl JXs;
    private Lxb LD;
    AtomicBoolean Lxb = new AtomicBoolean(false);
    private com.bytedance.sdk.component.adexpress.LD.lk ZU;
    private final com.bytedance.sdk.component.adexpress.LD.NXR lc;
    private final View lk;

    public DY(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.component.adexpress.LD.NXR nxr) {
        this.lk = view;
        this.lc = nxr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD() {
        if (this.Lxb.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.LD.lk lkVar = this.ZU;
        if (lkVar == null || !lkVar.Lxb((tD) this.lk, 0)) {
            this.JXs.Lxb(107, "backup false");
            return;
        }
        this.lc.JXs().ebl();
        Lxb lxb = (Lxb) this.lk.findViewWithTag("tt_express_backup_fl_tag_26");
        this.LD = lxb;
        if (lxb == null) {
            this.JXs.Lxb(107, "backupview is null");
            return;
        }
        com.bytedance.sdk.component.adexpress.LD.STP stp = new com.bytedance.sdk.component.adexpress.LD.STP();
        Lxb lxb2 = this.LD;
        float realWidth = lxb2 == null ? 0.0f : lxb2.getRealWidth();
        Lxb lxb3 = this.LD;
        float realHeight = lxb3 != null ? lxb3.getRealHeight() : 0.0f;
        stp.Lxb(true);
        stp.Lxb(realWidth);
        stp.LD(realHeight);
        this.JXs.Lxb(this.LD, stp);
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.ZU
    public void Lxb(com.bytedance.sdk.component.adexpress.LD.ebl eblVar) {
        this.JXs = eblVar;
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.DY.1
            @Override // java.lang.Runnable
            public void run() {
                DY.this.LD();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.ZU
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public Lxb JXs() {
        return this.LD;
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.Lxb
    public void Lxb(com.bytedance.sdk.component.adexpress.LD.lk lkVar) {
        this.ZU = lkVar;
    }
}

package com.bytedance.sdk.component.JXs.ZU;

import android.graphics.Bitmap;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends Lxb {
    private com.bytedance.sdk.component.JXs.lc LD;
    private byte[] Lxb;

    public JXs(byte[] bArr, com.bytedance.sdk.component.JXs.lc lcVar) {
        this.Lxb = bArr;
        this.LD = lcVar;
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public void Lxb(com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        com.bytedance.sdk.component.JXs.lk.lc lcVarTD = lkVar.tD();
        com.bytedance.sdk.component.JXs.lk.LD.Lxb Lxb = lcVarTD.Lxb(lkVar);
        try {
            lkVar.HD();
            Bitmap bitmapLxb = Lxb.Lxb(this.Lxb);
            if (bitmapLxb == null) {
                Lxb(1002, "decode failed bitmap null", null, lkVar);
                return;
            }
            lkVar.Lxb(new NXR(bitmapLxb, this.LD, false));
            lcVarTD.Lxb(lkVar.DY()).Lxb(lkVar.JXs(), bitmapLxb);
        } catch (Throwable th) {
            Lxb(1002, AbstractC3888ke0.l(th, new StringBuilder("decode failed:")), th, lkVar);
        }
    }

    private void Lxb(int i, String str, Throwable th, com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        if (this.LD == null) {
            lkVar.Lxb(new JVA());
        } else {
            lkVar.Lxb(new OY(i, str, th));
        }
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public String Lxb() {
        return "decode";
    }
}

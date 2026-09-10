package com.bytedance.sdk.component.JXs.lk;

import android.content.Context;
import com.bytedance.sdk.component.JXs.NXR;
import com.bytedance.sdk.component.JXs.Sfi;
import com.bytedance.sdk.component.JXs.brP;
import com.bytedance.sdk.component.JXs.kqm;
import com.bytedance.sdk.component.JXs.sLN;
import com.bytedance.sdk.component.JXs.tD;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class JXs implements NXR {
    private tD JXs;
    private ExecutorService LD;
    private sLN Lxb;
    private com.bytedance.sdk.component.JXs.LD OY;
    private Sfi QAg;
    private brP ZU;
    private kqm ebl;
    private com.bytedance.sdk.component.JXs.lk lc;
    private com.bytedance.sdk.component.JXs.ZU lk;

    public static class Lxb {
        private tD JXs;
        private ExecutorService LD;
        private sLN Lxb;
        private com.bytedance.sdk.component.JXs.LD OY;
        private Sfi QAg;
        private brP ZU;
        private kqm ebl;
        private com.bytedance.sdk.component.JXs.lk lc;
        private com.bytedance.sdk.component.JXs.ZU lk;

        public Lxb Lxb(com.bytedance.sdk.component.JXs.LD ld) {
            this.OY = ld;
            return this;
        }

        public Lxb Lxb(Sfi sfi) {
            this.QAg = sfi;
            return this;
        }

        public Lxb Lxb(com.bytedance.sdk.component.JXs.ZU zu) {
            this.lk = zu;
            return this;
        }

        public JXs Lxb() {
            return new JXs(this);
        }
    }

    @Override // com.bytedance.sdk.component.JXs.NXR
    public brP JXs() {
        return this.ZU;
    }

    @Override // com.bytedance.sdk.component.JXs.NXR
    public ExecutorService LD() {
        return this.LD;
    }

    @Override // com.bytedance.sdk.component.JXs.NXR
    public sLN Lxb() {
        return this.Lxb;
    }

    @Override // com.bytedance.sdk.component.JXs.NXR
    public kqm OY() {
        return this.ebl;
    }

    @Override // com.bytedance.sdk.component.JXs.NXR
    public com.bytedance.sdk.component.JXs.LD QAg() {
        return this.OY;
    }

    @Override // com.bytedance.sdk.component.JXs.NXR
    public com.bytedance.sdk.component.JXs.ZU ZU() {
        return this.lk;
    }

    @Override // com.bytedance.sdk.component.JXs.NXR
    public com.bytedance.sdk.component.JXs.lk ebl() {
        return this.lc;
    }

    @Override // com.bytedance.sdk.component.JXs.NXR
    public tD lc() {
        return this.JXs;
    }

    @Override // com.bytedance.sdk.component.JXs.NXR
    public Sfi lk() {
        return this.QAg;
    }

    private JXs(Lxb lxb) {
        this.Lxb = lxb.Lxb;
        this.LD = lxb.LD;
        this.lk = lxb.lk;
        this.ZU = lxb.ZU;
        this.JXs = lxb.JXs;
        this.lc = lxb.lc;
        this.OY = lxb.OY;
        this.ebl = lxb.ebl;
        this.QAg = lxb.QAg;
    }

    public static JXs Lxb(Context context) {
        return new Lxb().Lxb();
    }
}

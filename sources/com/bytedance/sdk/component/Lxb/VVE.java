package com.bytedance.sdk.component.Lxb;

import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class VVE {
    public final String JXs;
    public final String LD;
    public final int Lxb;
    public final String OY;
    public final String ZU;
    public final String ebl;
    public final String lc;
    public final String lk;

    public static final class Lxb {
        private String JXs;
        private String LD;
        private String Lxb;
        private String ZU;
        private String ebl;
        private String lc;
        private String lk;

        private Lxb() {
        }

        public Lxb JXs(String str) {
            this.JXs = str;
            return this;
        }

        public Lxb LD(String str) {
            this.LD = str;
            return this;
        }

        public Lxb Lxb(String str) {
            this.Lxb = str;
            return this;
        }

        public Lxb ZU(String str) {
            this.ZU = str;
            return this;
        }

        public Lxb ebl(String str) {
            this.ebl = str;
            return this;
        }

        public Lxb lc(String str) {
            this.lc = str;
            return this;
        }

        public Lxb lk(String str) {
            this.lk = str;
            return this;
        }

        public VVE Lxb() {
            return new VVE(this);
        }
    }

    public static Lxb Lxb() {
        return new Lxb();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("methodName: ");
        sb.append(this.ZU);
        sb.append(", params: ");
        sb.append(this.JXs);
        sb.append(", callbackId: ");
        sb.append(this.lc);
        sb.append(", type: ");
        sb.append(this.lk);
        sb.append(", version: ");
        return DM.m(sb, this.LD, ", ");
    }

    private VVE(String str, int i) {
        this.LD = null;
        this.lk = null;
        this.ZU = null;
        this.JXs = null;
        this.lc = str;
        this.ebl = null;
        this.Lxb = i;
        this.OY = null;
    }

    public static VVE Lxb(String str, int i) {
        return new VVE(str, i);
    }

    public static boolean Lxb(VVE vve) {
        return vve == null || vve.Lxb != 1 || TextUtils.isEmpty(vve.ZU) || TextUtils.isEmpty(vve.JXs);
    }

    private VVE(Lxb lxb) {
        this.LD = lxb.Lxb;
        this.lk = lxb.LD;
        this.ZU = lxb.lk;
        this.JXs = lxb.ZU;
        this.lc = lxb.JXs;
        this.ebl = lxb.lc;
        this.Lxb = 1;
        this.OY = lxb.ebl;
    }
}

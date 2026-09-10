package com.bytedance.sdk.openadsdk.ZU.JXs.LD;

import com.bytedance.sdk.openadsdk.core.model.tD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uo0;

/* JADX INFO: loaded from: classes2.dex */
public class IeN {
    private tD JXs;
    private String LD;
    private long Lxb;
    private Uo0 ZU;
    private int lk;

    public static class Lxb {
        private HK JVA;
        private int JXs;
        private int OY;
        private int QAg;
        private int ebl;
        private int lc;
        private long Lxb = 0;
        private long LD = 0;
        private long lk = 0;
        private boolean ZU = false;
        private boolean nBu = false;

        private void NXR() {
            long j = this.lk;
            if (j > 0) {
                long j2 = this.Lxb;
                if (j2 > j) {
                    long j3 = j2 % j;
                    this.Lxb = j3;
                    if (j3 == 0) {
                        this.Lxb = j;
                    }
                }
            }
        }

        public boolean JVA() {
            return this.ZU;
        }

        public int JXs() {
            return this.lc;
        }

        public long LD() {
            return this.LD;
        }

        public long Lxb() {
            return this.Lxb;
        }

        public int OY() {
            return this.OY;
        }

        public int QAg() {
            return this.QAg;
        }

        public int ZU() {
            return this.JXs;
        }

        public int ebl() {
            return this.ebl;
        }

        public int lc() {
            long j = this.lk;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.Lxb * 100) / j), 100);
        }

        public long lk() {
            return this.lk;
        }

        public boolean nBu() {
            return this.nBu;
        }

        public HK sLN() {
            return this.JVA;
        }

        public void LD(long j) {
            this.LD = j;
        }

        public void Lxb(long j) {
            this.Lxb = j;
            NXR();
        }

        public void ZU(int i) {
            this.QAg = i;
        }

        public void lk(long j) {
            this.lk = j;
            NXR();
        }

        public void LD(int i) {
            this.lc = i;
        }

        public void Lxb(int i) {
            this.JXs = i;
        }

        public void lk(int i) {
            this.ebl = i;
        }

        public void Lxb(boolean z) {
            this.ZU = z;
        }

        public void Lxb(HK hk) {
            this.JVA = hk;
        }
    }

    public IeN(long j, String str, int i, Uo0 uo0, tD tDVar) {
        this.Lxb = j;
        this.LD = str;
        this.lk = i;
        this.ZU = uo0;
        this.JXs = tDVar;
    }

    public tD JXs() {
        return this.JXs;
    }

    public String LD() {
        return this.LD;
    }

    public long Lxb() {
        return this.Lxb;
    }

    public Uo0 ZU() {
        return this.ZU;
    }

    public int lk() {
        return this.lk;
    }
}

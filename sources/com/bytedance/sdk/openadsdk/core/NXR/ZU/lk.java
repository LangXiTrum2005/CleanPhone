package com.bytedance.sdk.openadsdk.core.NXR.ZU;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4783um0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends AbstractC4783um0 {
    private final Lxb ZU;
    private final List<LD> Lxb = Collections.synchronizedList(new ArrayList());
    private int LD = 1;
    private int lk = 1;

    public interface LD extends InterfaceC5094yK {
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        /* synthetic */ void JXs(BK bk);

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        /* synthetic */ void LD(BK bk);

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        /* synthetic */ void LD(BK bk, int i);

        void Lxb(int i, int i2);

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        /* synthetic */ void Lxb(BK bk);

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        /* synthetic */ void Lxb(BK bk, int i);

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        /* synthetic */ void Lxb(BK bk, int i, int i2);

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        /* synthetic */ void Lxb(BK bk, int i, int i2, int i3);

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        /* synthetic */ void Lxb(BK bk, long j);

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        /* synthetic */ void Lxb(BK bk, long j, long j2);

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        /* synthetic */ void Lxb(BK bk, HK hk);

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        /* synthetic */ void Lxb(BK bk, boolean z);

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        /* synthetic */ void ZU(BK bk);

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        /* synthetic */ void lk(BK bk);
    }

    public lk() {
        Lxb lxb = new Lxb();
        this.ZU = lxb;
        super.Lxb(lxb);
        Lxb(500);
    }

    public static /* synthetic */ int Lxb(lk lkVar) {
        int i = lkVar.lk;
        lkVar.lk = i + 1;
        return i;
    }

    public int DY() {
        return this.lk;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4783um0
    public long VVE() {
        return super.VVE() * ((long) this.LD);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4783um0
    public long kqm() {
        return (((long) (this.lk - 1)) * super.VVE()) + super.kqm();
    }

    public class Lxb implements InterfaceC5094yK {
        private Lxb() {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void JXs(BK bk) {
            Iterator it = lk.this.Lxb.iterator();
            while (it.hasNext()) {
                ((LD) it.next()).JXs(bk);
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void LD(BK bk) {
            Iterator it = lk.this.Lxb.iterator();
            while (it.hasNext()) {
                ((LD) it.next()).LD(bk);
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk) {
            lk.Lxb(lk.this);
            if (lk.this.lk > lk.this.LD) {
                Iterator it = lk.this.Lxb.iterator();
                while (it.hasNext()) {
                    ((LD) it.next()).Lxb(bk);
                }
            } else {
                Iterator it2 = lk.this.Lxb.iterator();
                while (it2.hasNext()) {
                    ((LD) it2.next()).Lxb(lk.this.lk, lk.this.LD);
                }
                lk.this.QAg();
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void ZU(BK bk) {
            Iterator it = lk.this.Lxb.iterator();
            while (it.hasNext()) {
                ((LD) it.next()).ZU(bk);
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void lk(BK bk) {
            Iterator it = lk.this.Lxb.iterator();
            while (it.hasNext()) {
                ((LD) it.next()).lk(bk);
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void LD(BK bk, int i) {
            Iterator it = lk.this.Lxb.iterator();
            while (it.hasNext()) {
                ((LD) it.next()).LD(bk, i);
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk, long j) {
            Iterator it = lk.this.Lxb.iterator();
            while (it.hasNext()) {
                ((LD) it.next()).Lxb(bk, j);
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk, HK hk) {
            Iterator it = lk.this.Lxb.iterator();
            while (it.hasNext()) {
                ((LD) it.next()).Lxb(bk, hk);
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk, boolean z) {
            Iterator it = lk.this.Lxb.iterator();
            while (it.hasNext()) {
                ((LD) it.next()).Lxb(bk, z);
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk, int i, int i2) {
            Iterator it = lk.this.Lxb.iterator();
            while (it.hasNext()) {
                ((LD) it.next()).Lxb(bk, i, i2);
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk, int i, int i2, int i3) {
            Iterator it = lk.this.Lxb.iterator();
            while (it.hasNext()) {
                ((LD) it.next()).Lxb(bk, i, i2, i3);
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk, int i) {
            Iterator it = lk.this.Lxb.iterator();
            while (it.hasNext()) {
                ((LD) it.next()).Lxb(bk, i);
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5094yK
        public void Lxb(BK bk, long j, long j2) {
            Iterator it = lk.this.Lxb.iterator();
            while (it.hasNext()) {
                ((LD) it.next()).Lxb(bk, j, j2);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4783um0
    public void Lxb(InterfaceC5094yK interfaceC5094yK) {
        if (!(interfaceC5094yK instanceof LD)) {
            super.Lxb(interfaceC5094yK);
        } else {
            if (this.Lxb.contains(interfaceC5094yK)) {
                return;
            }
            this.Lxb.add((LD) interfaceC5094yK);
        }
    }

    public void lk(int i) {
        this.LD = Math.max(1, i);
    }
}

package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5073y40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes2.dex */
public final class cs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f663a;
    final int b;
    public final int c;
    final boolean d;
    final int e;
    final byte[] f;

    public static final class a extends WG implements InterfaceC2766Sw {
        public a() {
            super(1);
        }

        public final db<cd> a(int i) {
            cs csVar = cs.this;
            int i2 = (csVar.b * i) + csVar.f663a;
            long jB = csVar.b(i);
            cs csVar2 = cs.this;
            return de.a(jB, new cd(csVar2.f, i2, csVar2.e, csVar2.d));
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public cs(boolean z, int i, byte[] bArr) {
        AbstractC2995aW.q(bArr, "sortedEntries");
        this.d = z;
        this.e = i;
        this.f = bArr;
        int i2 = z ? 8 : 4;
        this.f663a = i2;
        int i3 = i2 + i;
        this.b = i3;
        this.c = bArr.length / i3;
    }

    public final InterfaceC4545s40 a() {
        return AbstractC5073y40.M0(AbstractC2853Wf.c0(AbstractC3375el.f0(0, this.c)), new a());
    }

    public final int b(long j) {
        int i = this.c - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long jB = b(i3);
            if (jB < j) {
                i2 = i3 + 1;
            } else {
                if (jB <= j) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return ~i2;
    }

    public final long b(int i) {
        int i2 = i * this.b;
        if (this.d) {
            return ce.c(this.f, i2);
        }
        return ce.b(this.f, i2);
    }

    public final cd a(long j) {
        int iB = b(j);
        if (iB < 0) {
            return null;
        }
        return a(iB);
    }

    public final cd a(int i) {
        return new cd(this.f, (i * this.b) + this.f663a, this.e, this.d);
    }
}

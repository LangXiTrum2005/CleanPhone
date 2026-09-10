package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2833Vl {
    public int c;
    public int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3891a = true;
    public final int b = 65536;
    public int e = 0;
    public P3[] f = new P3[100];

    public final synchronized void a(int i) {
        boolean z = i < this.c;
        this.c = i;
        if (z) {
            b();
        }
    }

    public final synchronized void b() {
        int iMax = Math.max(0, Ug0.g(this.c, this.b) - this.d);
        int i = this.e;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f, iMax, i, (Object) null);
        this.e = iMax;
    }
}

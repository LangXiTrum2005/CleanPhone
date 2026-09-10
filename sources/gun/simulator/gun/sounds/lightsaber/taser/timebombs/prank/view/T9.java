package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class T9 implements InterfaceC3299dt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3974ld0 f3758a;
    public final int b;
    public final int[] c;
    public final C4619sw[] d;
    public final long[] e;
    public int f;

    public T9(C3974ld0 c3974ld0, int[] iArr) {
        int i = 0;
        FW.s(iArr.length > 0);
        c3974ld0.getClass();
        this.f3758a = c3974ld0;
        int length = iArr.length;
        this.b = length;
        this.d = new C4619sw[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = c3974ld0.d[iArr[i2]];
        }
        Arrays.sort(this.d, new P70(6));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = c3974ld0.a(this.d[i]);
                i++;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final boolean a(int i, long j) {
        return this.e[i] > j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final /* synthetic */ boolean b(long j, AbstractC2567Le abstractC2567Le, List list) {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final boolean blacklist(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zA) {
            zA = (i2 == i || a(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = Ug0.f3833a;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int d(C4619sw c4619sw) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == c4619sw) {
                return i;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        T9 t9 = (T9) obj;
        return this.f3758a == t9.f3758a && Arrays.equals(this.c, t9.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public int evaluateQueueSize(long j, List list) {
        return list.size();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final C4619sw getFormat(int i) {
        return this.d[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int getIndexInTrackGroup(int i) {
        return this.c[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final C4619sw getSelectedFormat() {
        return this.d[getSelectedIndex()];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int getSelectedIndexInTrackGroup() {
        return this.c[getSelectedIndex()];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final C3974ld0 getTrackGroup() {
        return this.f3758a;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.f3758a) * 31);
        }
        return this.f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final int length() {
        return this.c.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public void disable() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final /* synthetic */ void e() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public void enable() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final /* synthetic */ void g() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public final /* synthetic */ void f(boolean z) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3299dt
    public void onPlaybackSpeed(float f) {
    }
}

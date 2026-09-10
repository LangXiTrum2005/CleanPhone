package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4140nX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5236zx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ZX;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class dc<T> {
    boolean c;
    private int d;
    private int e;
    private int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long[] f678a = new long[0];
    T[] b = (T[]) new Object[0];
    private double g = 0.75d;

    public static final class a extends WG implements InterfaceC2714Qw {
        final /* synthetic */ ZX b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ZX zx, int i) {
            super(0);
            this.b = zx;
            this.c = i;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final db<T> invoke() {
            ZX zx = this.b;
            int i = zx.f4074a;
            if (i < this.c) {
                zx.f4074a = i + 1;
                while (true) {
                    ZX zx2 = this.b;
                    int i2 = zx2.f4074a;
                    if (i2 >= this.c) {
                        break;
                    }
                    dc dcVar = dc.this;
                    long j = dcVar.f678a[i2];
                    if (j != 0) {
                        T t = dcVar.b[i2];
                        AbstractC2995aW.n(t);
                        return de.a(j, t);
                    }
                    zx2.f4074a = i2 + 1;
                }
            }
            ZX zx3 = this.b;
            int i3 = zx3.f4074a;
            int i4 = this.c;
            if (i3 != i4) {
                return null;
            }
            dc dcVar2 = dc.this;
            if (!dcVar2.c) {
                return null;
            }
            zx3.f4074a = i3 + 1;
            T t2 = dcVar2.b[i4];
            AbstractC2995aW.n(t2);
            return de.a(0L, t2);
        }
    }

    public dc() {
        a(4);
    }

    public final boolean a() {
        return c() == 0;
    }

    public final InterfaceC4545s40 b() {
        int i = this.e + 1;
        ZX zx = new ZX();
        zx.f4074a = -1;
        a aVar = new a(zx, i);
        return A40.H0(new C5236zx(aVar, new C4140nX(aVar, 5)));
    }

    public final int c() {
        return this.d + (this.c ? 1 : 0);
    }

    public final T a(long j, T t) {
        int i = this.e;
        if (j == 0) {
            this.c = true;
            T[] tArr = this.b;
            int i2 = i + 1;
            T t2 = tArr[i2];
            tArr[i2] = t;
            return t2;
        }
        long[] jArr = this.f678a;
        int iA = cx.f670a.a(j) & i;
        long j2 = jArr[iA];
        while (j2 != 0) {
            if (j2 == j) {
                T[] tArr2 = this.b;
                T t3 = tArr2[iA];
                tArr2[iA] = t;
                return t3;
            }
            iA = (iA + 1) & i;
            j2 = jArr[iA];
        }
        if (this.d == this.f) {
            a(iA, j, t);
        } else {
            jArr[iA] = j;
            this.b[iA] = t;
        }
        this.d++;
        return null;
    }

    private final void b(int i) {
        long[] jArr = this.f678a;
        T[] tArr = this.b;
        int i2 = i + 1;
        try {
            this.f678a = new long[i2];
            this.b = (T[]) new Object[i2];
            this.f = cx.f670a.b(i, this.g);
            this.e = i - 1;
        } catch (OutOfMemoryError e) {
            this.f678a = jArr;
            this.b = tArr;
            throw new RuntimeException(String.format(Locale.ROOT, "Not enough memory to allocate buffers for rehashing: %,d -> %,d", Arrays.copyOf(new Object[]{Integer.valueOf(this.e + 1), Integer.valueOf(i)}, 2)), e);
        }
    }

    public final T a(long j) {
        if (j == 0) {
            if (this.c) {
                return this.b[this.e + 1];
            }
            return null;
        }
        long[] jArr = this.f678a;
        int i = this.e;
        int iA = cx.f670a.a(j) & i;
        long j2 = jArr[iA];
        while (j2 != 0) {
            if (j2 == j) {
                return this.b[iA];
            }
            iA = (iA + 1) & i;
            j2 = jArr[iA];
        }
        return null;
    }

    public final void a(int i) {
        if (i > this.f) {
            long[] jArr = this.f678a;
            T[] tArr = this.b;
            b(cx.f670a.a(i, this.g));
            if (a()) {
                return;
            }
            a(jArr, tArr);
        }
    }

    private final void a(long[] jArr, T[] tArr) {
        int i;
        long[] jArr2 = this.f678a;
        T[] tArr2 = this.b;
        int i2 = this.e;
        int length = jArr.length - 1;
        jArr2[jArr2.length - 1] = jArr[length];
        tArr2[tArr2.length - 1] = tArr[length];
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            long j = jArr[length];
            if (j != 0) {
                int iA = cx.f670a.a(j);
                while (true) {
                    i = iA & i2;
                    if (jArr2[i] == 0) {
                        break;
                    } else {
                        iA = i + 1;
                    }
                }
                jArr2[i] = j;
                tArr2[i] = tArr[length];
            }
        }
    }

    private final void a(int i, long j, T t) {
        long[] jArr = this.f678a;
        T[] tArr = this.b;
        b(cx.f670a.a(this.e + 1, c(), this.g));
        jArr[i] = j;
        tArr[i] = t;
        a(jArr, tArr);
    }
}

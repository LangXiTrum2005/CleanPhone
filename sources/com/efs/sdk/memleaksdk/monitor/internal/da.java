package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4140nX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5236zx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ZX;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long[] f675a;
    public long[] b;
    boolean c;
    private int d;
    private int e;
    private int f;
    private double g;

    public interface a {
        void a(long j, long j2);
    }

    public static final class b extends WG implements InterfaceC2714Qw {
        final /* synthetic */ ZX b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ZX zx, int i) {
            super(0);
            this.b = zx;
            this.c = i;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cz invoke() {
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
                    da daVar = da.this;
                    long j = daVar.f675a[i2];
                    if (j != 0) {
                        return de.a(j, daVar.b[i2]);
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
            da daVar2 = da.this;
            if (!daVar2.c) {
                return null;
            }
            zx3.f4074a = i3 + 1;
            return de.a(0L, daVar2.b[i4]);
        }
    }

    public da() {
        this(0, 1);
    }

    public final boolean a() {
        return d() == 0;
    }

    public final long b(long j) {
        int iA = a(j);
        if (iA != -1) {
            return this.b[iA];
        }
        throw new IllegalArgumentException(AbstractC5044xl.h("Unknown key ", j).toString());
    }

    public final void c() {
        this.d = 0;
        this.c = false;
        b(cx.f670a.a(4, this.g));
    }

    public final int d() {
        return this.d + (this.c ? 1 : 0);
    }

    public da(int i) {
        this.f675a = new long[0];
        this.b = new long[0];
        this.g = 0.75d;
        a(i);
    }

    public final long a(long j, long j2) {
        int i = this.e;
        if (j == 0) {
            this.c = true;
            long[] jArr = this.b;
            int i2 = i + 1;
            long j3 = jArr[i2];
            jArr[i2] = j2;
            return j3;
        }
        long[] jArr2 = this.f675a;
        int iA = cx.f670a.a(j) & i;
        long j4 = jArr2[iA];
        while (j4 != 0) {
            if (j4 == j) {
                long[] jArr3 = this.b;
                long j5 = jArr3[iA];
                jArr3[iA] = j2;
                return j5;
            }
            iA = (iA + 1) & i;
            j4 = jArr2[iA];
        }
        if (this.d == this.f) {
            a(iA, j, j2);
        } else {
            jArr2[iA] = j;
            this.b[iA] = j2;
        }
        this.d++;
        return 0L;
    }

    public /* synthetic */ da(int i, int i2) {
        this((i2 & 1) != 0 ? 4 : i);
    }

    public final InterfaceC4545s40 b() {
        int i = this.e + 1;
        ZX zx = new ZX();
        zx.f4074a = -1;
        b bVar = new b(zx, i);
        return A40.H0(new C5236zx(bVar, new C4140nX(bVar, 5)));
    }

    private final void b(int i) {
        long[] jArr = this.f675a;
        long[] jArr2 = this.b;
        int i2 = i + 1;
        try {
            this.f675a = new long[i2];
            this.b = new long[i2];
            this.f = cx.f670a.b(i, this.g);
            this.e = i - 1;
        } catch (OutOfMemoryError e) {
            this.f675a = jArr;
            this.b = jArr2;
            throw new RuntimeException(String.format(Locale.ROOT, "Not enough memory to allocate buffers for rehashing: %,d -> %,d", Arrays.copyOf(new Object[]{Integer.valueOf(this.e + 1), Integer.valueOf(i)}, 2)), e);
        }
    }

    public final int a(long j) {
        if (j == 0) {
            if (this.c) {
                return this.e + 1;
            }
            return -1;
        }
        long[] jArr = this.f675a;
        int i = this.e;
        int iA = cx.f670a.a(j) & i;
        long j2 = jArr[iA];
        while (j2 != 0) {
            if (j2 == j) {
                return iA;
            }
            iA = (iA + 1) & i;
            j2 = jArr[iA];
        }
        return -1;
    }

    public final void a(a aVar) {
        AbstractC2995aW.q(aVar, "forEachCallback");
        int i = this.e + 1;
        int i2 = -1;
        while (true) {
            if (i2 < i) {
                while (true) {
                    i2++;
                    if (i2 < i) {
                        long j = this.f675a[i2];
                        if (j != 0) {
                            aVar.a(j, this.b[i2]);
                        }
                    }
                }
            }
            if (i2 != i || !this.c) {
                return;
            }
            i2++;
            aVar.a(0L, this.b[i]);
        }
    }

    public final void a(int i) {
        if (i > this.f) {
            long[] jArr = this.f675a;
            long[] jArr2 = this.b;
            b(cx.f670a.a(i, this.g));
            if (a()) {
                return;
            }
            a(jArr, jArr2);
        }
    }

    private final void a(long[] jArr, long[] jArr2) {
        int i;
        long[] jArr3 = this.f675a;
        long[] jArr4 = this.b;
        int i2 = this.e;
        int length = jArr.length - 1;
        jArr3[jArr3.length - 1] = jArr[length];
        jArr4[jArr4.length - 1] = jArr2[length];
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
                    if (jArr3[i] == 0) {
                        break;
                    } else {
                        iA = i + 1;
                    }
                }
                jArr3[i] = j;
                jArr4[i] = jArr2[length];
            }
        }
    }

    private final void a(int i, long j, long j2) {
        long[] jArr = this.f675a;
        long[] jArr2 = this.b;
        b(cx.f670a.a(this.e + 1, d(), this.g));
        jArr[i] = j;
        jArr2[i] = j2;
        a(jArr, jArr2);
    }
}

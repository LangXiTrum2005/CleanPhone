package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class cu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f666a;
    byte[] b;
    int c;
    int d;
    final boolean e;
    private final a f;
    private int g;
    private final int h;
    private final int i;
    private final double j;

    public static final class b implements cv {
        public b() {
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.cv
        public int a(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
            AbstractC2995aW.q(bArr, "o1Array");
            AbstractC2995aW.q(bArr2, "o2Array");
            cu cuVar = cu.this;
            return cuVar.e ? (cuVar.b(bArr, i2 * i) > cu.this.b(bArr2, i3 * i) ? 1 : (cuVar.b(bArr, i2 * i) == cu.this.b(bArr2, i3 * i) ? 0 : -1)) : AbstractC2995aW.s(cuVar.a(bArr, i2 * i), cu.this.a(bArr2, i3 * i));
        }
    }

    public cu(int i, boolean z, int i2, double d) {
        this.h = i;
        this.e = z;
        this.i = i2;
        this.j = d;
        this.f666a = i + (z ? 8 : 4);
        this.f = new a();
    }

    public final a a(long j) {
        if (this.b == null) {
            int i = this.i;
            this.g = i;
            this.b = new byte[i * this.f666a];
        } else {
            int i2 = this.g;
            if (i2 == this.d) {
                int i3 = (int) (((double) i2) * this.j);
                a(i3);
                this.g = i3;
            }
        }
        this.d++;
        this.c = 0;
        this.f.a(j);
        return this.f;
    }

    public final long b(byte[] bArr, int i) {
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16);
        return (((long) bArr[i + 7]) & 255) | j | ((((long) bArr[i + 6]) & 255) << 8);
    }

    public /* synthetic */ cu(int i, boolean z, int i2, double d, int i3) {
        this(i, z, (i3 & 4) != 0 ? 4 : i2, (i3 & 8) != 0 ? 2.0d : d);
    }

    public final cs a() {
        if (this.d == 0) {
            return new cs(this.e, this.h, new byte[0]);
        }
        byte[] bArrCopyOf = this.b;
        AbstractC2995aW.n(bArrCopyOf);
        cw.f669a.a(bArrCopyOf, 0, this.d, this.f666a, new b());
        int length = bArrCopyOf.length;
        int i = this.d;
        int i2 = this.f666a;
        if (length > i * i2) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i * i2);
            AbstractC2995aW.p(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        }
        this.b = null;
        this.d = 0;
        return new cs(this.e, this.h, bArrCopyOf);
    }

    public final class a {
        public a() {
        }

        public final void a(byte b) {
            cu cuVar = cu.this;
            int i = cuVar.c;
            cuVar.c = i + 1;
            int i2 = cuVar.f666a;
            if (i < 0 || i2 < i) {
                StringBuilder sbQ = AbstractC5044xl.q("Index ", i, " should be between 0 and ");
                sbQ.append(cu.this.f666a);
                throw new IllegalArgumentException(sbQ.toString().toString());
            }
            int i3 = ((cuVar.d - 1) * i2) + i;
            byte[] bArr = cuVar.b;
            AbstractC2995aW.n(bArr);
            bArr[i3] = b;
        }

        public final void b(long j) {
            cu cuVar = cu.this;
            int i = cuVar.c;
            cuVar.c = i + 8;
            if (i >= 0) {
                int i2 = cuVar.f666a;
                if (i <= i2 - 8) {
                    int i3 = ((cuVar.d - 1) * i2) + i;
                    byte[] bArr = cuVar.b;
                    AbstractC2995aW.n(bArr);
                    bArr[i3] = (byte) ((j >>> 56) & 255);
                    bArr[i3 + 1] = (byte) ((j >>> 48) & 255);
                    bArr[i3 + 2] = (byte) ((j >>> 40) & 255);
                    bArr[i3 + 3] = (byte) ((j >>> 32) & 255);
                    bArr[i3 + 4] = (byte) ((j >>> 24) & 255);
                    bArr[i3 + 5] = (byte) ((j >>> 16) & 255);
                    bArr[i3 + 6] = (byte) ((j >>> 8) & 255);
                    bArr[i3 + 7] = (byte) (j & 255);
                    return;
                }
            }
            StringBuilder sbQ = AbstractC5044xl.q("Index ", i, " should be between 0 and ");
            sbQ.append(cu.this.f666a - 8);
            throw new IllegalArgumentException(sbQ.toString().toString());
        }

        public final void a(long j) {
            if (cu.this.e) {
                b(j);
            } else {
                a((int) j);
            }
        }

        public final void a(int i) {
            cu cuVar = cu.this;
            int i2 = cuVar.c;
            cuVar.c = i2 + 4;
            if (i2 >= 0) {
                int i3 = cuVar.f666a;
                if (i2 <= i3 - 4) {
                    int i4 = ((cuVar.d - 1) * i3) + i2;
                    byte[] bArr = cuVar.b;
                    AbstractC2995aW.n(bArr);
                    bArr[i4] = (byte) ((i >>> 24) & 255);
                    bArr[i4 + 1] = (byte) ((i >>> 16) & 255);
                    bArr[i4 + 2] = (byte) ((i >>> 8) & 255);
                    bArr[i4 + 3] = (byte) (i & 255);
                    return;
                }
            }
            StringBuilder sbQ = AbstractC5044xl.q("Index ", i2, " should be between 0 and ");
            sbQ.append(cu.this.f666a - 4);
            throw new IllegalArgumentException(sbQ.toString().toString());
        }

        public final void a(long j, int i) {
            cu cuVar = cu.this;
            int i2 = cuVar.c;
            cuVar.c = i2 + i;
            if (i2 >= 0) {
                int i3 = cuVar.f666a;
                if (i2 <= i3 - i) {
                    int i4 = ((cuVar.d - 1) * i3) + i2;
                    byte[] bArr = cuVar.b;
                    AbstractC2995aW.n(bArr);
                    int i5 = (i - 1) * 8;
                    while (i5 >= 8) {
                        bArr[i4] = (byte) (255 & (j >>> i5));
                        i5 -= 8;
                        i4++;
                    }
                    bArr[i4] = (byte) (j & 255);
                    return;
                }
            }
            StringBuilder sbQ = AbstractC5044xl.q("Index ", i2, " should be between 0 and ");
            sbQ.append(cu.this.f666a - i);
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
    }

    public final int a(byte[] bArr, int i) {
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        return (bArr[i + 3] & 255) | i2 | ((bArr[i + 2] & 255) << 8);
    }

    private final void a(int i) {
        int i2 = this.f666a;
        byte[] bArr = new byte[i * i2];
        System.arraycopy(this.b, 0, bArr, 0, this.d * i2);
        this.b = bArr;
    }
}

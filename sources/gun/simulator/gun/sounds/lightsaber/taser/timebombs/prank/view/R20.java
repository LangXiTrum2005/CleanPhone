package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class R20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2833Vl f3641a;
    public final int b;
    public final JT c;
    public Q20 d;
    public Q20 e;
    public Q20 f;
    public long g;

    public R20(C2833Vl c2833Vl) {
        this.f3641a = c2833Vl;
        int i = c2833Vl.b;
        this.b = i;
        this.c = new JT(32);
        Q20 q20 = new Q20(0L, i);
        this.d = q20;
        this.e = q20;
        this.f = q20;
    }

    public static Q20 d(Q20 q20, long j, ByteBuffer byteBuffer, int i) {
        while (j >= q20.b) {
            q20 = q20.d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (q20.b - j));
            P3 p3 = q20.c;
            byteBuffer.put(p3.f3533a, ((int) (j - q20.f3586a)) + p3.b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == q20.b) {
                q20 = q20.d;
            }
        }
        return q20;
    }

    public static Q20 e(Q20 q20, long j, byte[] bArr, int i) {
        while (j >= q20.b) {
            q20 = q20.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (q20.b - j));
            P3 p3 = q20.c;
            System.arraycopy(p3.f3533a, ((int) (j - q20.f3586a)) + p3.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == q20.b) {
                q20 = q20.d;
            }
        }
        return q20;
    }

    public static Q20 f(Q20 q20, C2677Pl c2677Pl, S20 s20, JT jt) {
        if (c2677Pl.c(1073741824)) {
            long j = s20.b;
            int iY = 1;
            jt.B(1);
            Q20 q20E = e(q20, j, jt.f3266a, 1);
            long j2 = j + 1;
            byte b = jt.f3266a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            C2339Ck c2339Ck = c2677Pl.c;
            byte[] bArr = c2339Ck.f2937a;
            if (bArr == null) {
                c2339Ck.f2937a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            q20 = e(q20E, j2, c2339Ck.f2937a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                jt.B(2);
                q20 = e(q20, j3, jt.f3266a, 2);
                j3 += 2;
                iY = jt.y();
            }
            int[] iArr = c2339Ck.d;
            if (iArr == null || iArr.length < iY) {
                iArr = new int[iY];
            }
            int[] iArr2 = c2339Ck.e;
            if (iArr2 == null || iArr2.length < iY) {
                iArr2 = new int[iY];
            }
            if (z) {
                int i2 = iY * 6;
                jt.B(i2);
                q20 = e(q20, j3, jt.f3266a, i2);
                j3 += (long) i2;
                jt.E(0);
                for (int i3 = 0; i3 < iY; i3++) {
                    iArr[i3] = jt.y();
                    iArr2[i3] = jt.w();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = s20.f3696a - ((int) (j3 - s20.b));
            }
            C4238od0 c4238od0 = (C4238od0) s20.c;
            int i4 = Ug0.f3833a;
            byte[] bArr2 = c4238od0.b;
            byte[] bArr3 = c2339Ck.f2937a;
            c2339Ck.f = iY;
            c2339Ck.d = iArr;
            c2339Ck.e = iArr2;
            c2339Ck.b = bArr2;
            c2339Ck.f2937a = bArr3;
            int i5 = c4238od0.f4798a;
            c2339Ck.c = i5;
            int i6 = c4238od0.c;
            c2339Ck.g = i6;
            int i7 = c4238od0.d;
            c2339Ck.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = c2339Ck.i;
            cryptoInfo.numSubSamples = iY;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (Ug0.f3833a >= 24) {
                C2313Bk c2313Bk = c2339Ck.j;
                c2313Bk.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = c2313Bk.b;
                pattern.set(i6, i7);
                c2313Bk.f2888a.setPattern(pattern);
            }
            long j4 = s20.b;
            int i8 = (int) (j3 - j4);
            s20.b = j4 + ((long) i8);
            s20.f3696a -= i8;
        }
        if (!c2677Pl.c(268435456)) {
            c2677Pl.g(s20.f3696a);
            return d(q20, s20.b, c2677Pl.d, s20.f3696a);
        }
        jt.B(4);
        Q20 q20E2 = e(q20, s20.b, jt.f3266a, 4);
        int iW = jt.w();
        s20.b += 4;
        s20.f3696a -= 4;
        c2677Pl.g(iW);
        Q20 q20D = d(q20E2, s20.b, c2677Pl.d, iW);
        s20.b += (long) iW;
        int i9 = s20.f3696a - iW;
        s20.f3696a = i9;
        ByteBuffer byteBuffer = c2677Pl.g;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            c2677Pl.g = ByteBuffer.allocate(i9);
        } else {
            c2677Pl.g.clear();
        }
        return d(q20D, s20.b, c2677Pl.g, s20.f3696a);
    }

    public final void a(Q20 q20) {
        if (q20.c == null) {
            return;
        }
        C2833Vl c2833Vl = this.f3641a;
        synchronized (c2833Vl) {
            Q20 q21 = q20;
            while (q21 != null) {
                try {
                    P3[] p3Arr = c2833Vl.f;
                    int i = c2833Vl.e;
                    c2833Vl.e = i + 1;
                    P3 p3 = q21.c;
                    p3.getClass();
                    p3Arr[i] = p3;
                    c2833Vl.d--;
                    q21 = q21.d;
                    if (q21 == null || q21.c == null) {
                        q21 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c2833Vl.notifyAll();
        }
        q20.c = null;
        q20.d = null;
    }

    public final void b(long j) {
        Q20 q20;
        if (j == -1) {
            return;
        }
        while (true) {
            q20 = this.d;
            if (j < q20.b) {
                break;
            }
            C2833Vl c2833Vl = this.f3641a;
            P3 p3 = q20.c;
            synchronized (c2833Vl) {
                P3[] p3Arr = c2833Vl.f;
                int i = c2833Vl.e;
                c2833Vl.e = i + 1;
                p3Arr[i] = p3;
                c2833Vl.d--;
                c2833Vl.notifyAll();
            }
            Q20 q21 = this.d;
            q21.c = null;
            Q20 q22 = q21.d;
            q21.d = null;
            this.d = q22;
        }
        if (this.e.f3586a < q20.f3586a) {
            this.e = q20;
        }
    }

    public final int c(int i) {
        P3 p3;
        Q20 q20 = this.f;
        if (q20.c == null) {
            C2833Vl c2833Vl = this.f3641a;
            synchronized (c2833Vl) {
                try {
                    int i2 = c2833Vl.d + 1;
                    c2833Vl.d = i2;
                    int i3 = c2833Vl.e;
                    if (i3 > 0) {
                        P3[] p3Arr = c2833Vl.f;
                        int i4 = i3 - 1;
                        c2833Vl.e = i4;
                        p3 = p3Arr[i4];
                        p3.getClass();
                        c2833Vl.f[c2833Vl.e] = null;
                    } else {
                        P3 p4 = new P3(new byte[c2833Vl.b], 0);
                        P3[] p3Arr2 = c2833Vl.f;
                        if (i2 > p3Arr2.length) {
                            c2833Vl.f = (P3[]) Arrays.copyOf(p3Arr2, p3Arr2.length * 2);
                        }
                        p3 = p4;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Q20 q21 = new Q20(this.f.b, this.b);
            q20.c = p3;
            q20.d = q21;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}

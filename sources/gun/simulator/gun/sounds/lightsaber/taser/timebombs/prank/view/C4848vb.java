package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4848vb implements InterfaceC2460Hb, InterfaceC2434Gb, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V30 f5139a;
    public long b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final /* bridge */ /* synthetic */ InterfaceC2434Gb A(String str) {
        Y(str);
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final long B(InterfaceC3588h80 interfaceC3588h80) {
        AbstractC2995aW.q(interfaceC3588h80, "source");
        long j = 0;
        while (true) {
            long j2 = interfaceC3588h80.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final String C() {
        return j(Long.MAX_VALUE);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final void D(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final /* bridge */ /* synthetic */ InterfaceC2434Gb E(long j) {
        S(j);
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final C3971lc F(long j) throws EOFException {
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new C3971lc(q(j));
        }
        C3971lc c3971lcV = v((int) j);
        skip(j);
        return c3971lcV;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final long G(C3971lc c3971lc) {
        AbstractC2995aW.q(c3971lc, "targetBytes");
        return p(c3971lc, 0L);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final long H(C4848vb c4848vb) {
        long j = this.b;
        if (j > 0) {
            c4848vb.d(this, j);
        }
        return j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final /* bridge */ /* synthetic */ InterfaceC2434Gb I(C3971lc c3971lc) {
        x(c3971lc);
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final byte[] J() {
        return q(this.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final boolean K() {
        return this.b == 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final String L(Charset charset) {
        return s(this.b, charset);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final /* bridge */ /* synthetic */ InterfaceC2434Gb M(long j) {
        T(j);
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final C3971lc N() {
        return F(this.b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final int O(XS xs) throws EOFException {
        AbstractC2995aW.q(xs, "options");
        int iB = AbstractC5135ym0.b(this, xs, false);
        if (iB == -1) {
            return -1;
        }
        skip(xs.f3969a[iB].c());
        return iB;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final long P() throws EOFException {
        int i;
        if (this.b == 0) {
            throw new EOFException();
        }
        long j = 0;
        int i2 = 0;
        boolean z = false;
        do {
            V30 v30 = this.f5139a;
            AbstractC2995aW.n(v30);
            int i3 = v30.b;
            int i4 = v30.c;
            while (i3 < i4) {
                byte b = v30.f3857a[i3];
                byte b2 = (byte) 48;
                if (b < b2 || b > ((byte) 57)) {
                    byte b3 = (byte) 97;
                    if ((b < b3 || b > ((byte) 102)) && (b < (b3 = (byte) 65) || b > ((byte) 70))) {
                        if (i2 != 0) {
                            z = true;
                            break;
                        }
                        char[] cArr = AbstractC2340Cl.f;
                        throw new NumberFormatException(AbstractC2995aW.v0(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & com.umeng.analytics.pro.cw.m]}), "Expected leading [0-9a-fA-F] character but was 0x"));
                    }
                    i = (b - b3) + 10;
                } else {
                    i = b - b2;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C4848vb c4848vb = new C4848vb();
                    c4848vb.T(j);
                    c4848vb.R(b);
                    throw new NumberFormatException(AbstractC2995aW.v0(c4848vb.t(), "Number too large: "));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f5139a = v30.a();
                AbstractC3228d40.a(v30);
            } else {
                v30.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.f5139a != null);
        this.b -= (long) i2;
        return j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final C4760ub Q() {
        return new C4760ub(this, 0);
    }

    public final void R(int i) {
        V30 v30W = w(1);
        int i2 = v30W.c;
        v30W.c = i2 + 1;
        v30W.f3857a[i2] = (byte) i;
        this.b++;
    }

    public final void S(long j) {
        boolean z;
        byte[] bArr;
        if (j == 0) {
            R(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                Y("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < WorkRequest.MIN_BACKOFF_MILLIS) {
                if (j >= 100) {
                    i = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i = 2;
                }
            } else if (j < 1000000) {
                i = j < 100000 ? 5 : 6;
            } else {
                i = j < 10000000 ? 7 : 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i = j < com.mbridge.msdk.playercommon.exoplayer2.C.NANOS_PER_SECOND ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else {
                i = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i = j < 10000000000000000L ? 16 : 17;
        } else {
            i = j < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        V30 v30W = w(i);
        int i2 = v30W.c + i;
        while (true) {
            bArr = v30W.f3857a;
            if (j == 0) {
                break;
            }
            long j2 = 10;
            i2--;
            bArr[i2] = AbstractC5135ym0.f5297a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = (byte) 45;
        }
        v30W.c += i;
        this.b += (long) i;
    }

    public final void T(long j) {
        if (j == 0) {
            R(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        V30 v30W = w(i);
        int i2 = v30W.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            v30W.f3857a[i3] = AbstractC5135ym0.f5297a[(int) (15 & j)];
            j >>>= 4;
        }
        v30W.c += i;
        this.b += (long) i;
    }

    public final void U(int i) {
        V30 v30W = w(4);
        int i2 = v30W.c;
        byte[] bArr = v30W.f3857a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        v30W.c = i2 + 4;
        this.b += 4;
    }

    public final void V(int i) {
        V30 v30W = w(2);
        int i2 = v30W.c;
        byte[] bArr = v30W.f3857a;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        v30W.c = i2 + 2;
        this.b += 2;
    }

    public final void W(String str, int i, int i2, Charset charset) {
        AbstractC2995aW.q(str, TypedValues.Custom.S_STRING);
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Integer.valueOf(i), "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC3888ke0.h("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbQ = AbstractC5044xl.q("endIndex > string.length: ", i2, " > ");
            sbQ.append(str.length());
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        if (AbstractC2995aW.i(charset, AbstractC2307Be.f2881a)) {
            X(i, i2, str);
            return;
        }
        String strSubstring = str.substring(i, i2);
        AbstractC2995aW.p(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        AbstractC2995aW.p(bytes, "(this as java.lang.String).getBytes(charset)");
        y(bytes, 0, bytes.length);
    }

    public final void X(int i, int i2, String str) {
        char cCharAt;
        AbstractC2995aW.q(str, TypedValues.Custom.S_STRING);
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Integer.valueOf(i), "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC3888ke0.h("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbQ = AbstractC5044xl.q("endIndex > string.length: ", i2, " > ");
            sbQ.append(str.length());
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                V30 v30W = w(1);
                int i3 = v30W.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = v30W.f3857a;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = v30W.c;
                int i6 = (i3 + i) - i5;
                v30W.c = i5 + i6;
                this.b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    V30 v30W2 = w(2);
                    int i7 = v30W2.c;
                    byte[] bArr2 = v30W2.f3857a;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    v30W2.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    V30 v30W3 = w(3);
                    int i8 = v30W3.c;
                    byte[] bArr3 = v30W3.f3857a;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    v30W3.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 > 57343) {
                        R(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        V30 v30W4 = w(4);
                        int i11 = v30W4.c;
                        byte b = (byte) ((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                        byte[] bArr4 = v30W4.f3857a;
                        bArr4[i11] = b;
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        v30W4.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void Y(String str) {
        AbstractC2995aW.q(str, TypedValues.Custom.S_STRING);
        X(0, str.length(), str);
    }

    public final void Z(int i) {
        String str;
        int i2 = 0;
        if (i < 128) {
            R(i);
            return;
        }
        if (i < 2048) {
            V30 v30W = w(2);
            int i3 = v30W.c;
            byte[] bArr = v30W.f3857a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            v30W.c = i3 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i <= 57343) {
            R(63);
            return;
        }
        if (i < 65536) {
            V30 v30W2 = w(3);
            int i4 = v30W2.c;
            byte[] bArr2 = v30W2.f3857a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            v30W2.c = i4 + 3;
            this.b += 3;
            return;
        }
        if (i <= 1114111) {
            V30 v30W3 = w(4);
            int i5 = v30W3.c;
            byte b = (byte) ((i >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            byte[] bArr3 = v30W3.f3857a;
            bArr3[i5] = b;
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            v30W3.c = i5 + 4;
            this.b += 4;
            return;
        }
        if (i != 0) {
            char[] cArr = AbstractC2340Cl.f;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i2 < 8 && cArr2[i2] == '0') {
                i2++;
            }
            if (i2 < 0) {
                throw new IndexOutOfBoundsException(AbstractC5044xl.g("startIndex: ", i2, ", endIndex: 8, size: 8"));
            }
            if (i2 > 8) {
                throw new IllegalArgumentException(AbstractC5044xl.g("startIndex: ", i2, " > endIndex: 8"));
            }
            str = new String(cArr2, i2, 8 - i2);
        } else {
            str = "0";
        }
        throw new IllegalArgumentException(AbstractC2995aW.v0(str, "Unexpected code point: 0x"));
    }

    public final Object clone() {
        C4848vb c4848vb = new C4848vb();
        if (this.b != 0) {
            V30 v30 = this.f5139a;
            AbstractC2995aW.n(v30);
            V30 v30C = v30.c();
            c4848vb.f5139a = v30C;
            v30C.g = v30C;
            v30C.f = v30C;
            for (V30 v31 = v30.f; v31 != v30; v31 = v31.f) {
                V30 v32 = v30C.g;
                AbstractC2995aW.n(v32);
                AbstractC2995aW.n(v31);
                v32.b(v31.c());
            }
            c4848vb.b = this.b;
        }
        return c4848vb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final void d(C4848vb c4848vb, long j) {
        V30 v30B;
        AbstractC2995aW.q(c4848vb, "source");
        if (c4848vb == this) {
            throw new IllegalArgumentException("source == this".toString());
        }
        AbstractC2845Vx.P(c4848vb.b, 0L, j);
        while (j > 0) {
            V30 v30 = c4848vb.f5139a;
            AbstractC2995aW.n(v30);
            int i = v30.c;
            V30 v31 = c4848vb.f5139a;
            AbstractC2995aW.n(v31);
            int i2 = 0;
            if (j < i - v31.b) {
                V30 v32 = this.f5139a;
                V30 v33 = v32 != null ? v32.g : null;
                if (v33 != null && v33.e) {
                    if ((((long) v33.c) + j) - ((long) (v33.d ? 0 : v33.b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        V30 v34 = c4848vb.f5139a;
                        AbstractC2995aW.n(v34);
                        v34.d(v33, (int) j);
                        c4848vb.b -= j;
                        this.b += j;
                        return;
                    }
                }
                V30 v35 = c4848vb.f5139a;
                AbstractC2995aW.n(v35);
                int i3 = (int) j;
                if (i3 <= 0 || i3 > v35.c - v35.b) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i3 >= 1024) {
                    v30B = v35.c();
                } else {
                    v30B = AbstractC3228d40.b();
                    int i4 = v35.b;
                    U5.j0(0, v35.f3857a, i4, v30B.f3857a, i4 + i3);
                }
                v30B.c = v30B.b + i3;
                v35.b += i3;
                V30 v36 = v35.g;
                AbstractC2995aW.n(v36);
                v36.b(v30B);
                c4848vb.f5139a = v30B;
            }
            V30 v37 = c4848vb.f5139a;
            AbstractC2995aW.n(v37);
            long j2 = v37.c - v37.b;
            c4848vb.f5139a = v37.a();
            V30 v38 = this.f5139a;
            if (v38 == null) {
                this.f5139a = v37;
                v37.g = v37;
                v37.f = v37;
            } else {
                V30 v39 = v38.g;
                AbstractC2995aW.n(v39);
                v39.b(v37);
                V30 v310 = v37.g;
                if (v310 == v37) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                AbstractC2995aW.n(v310);
                if (v310.e) {
                    int i5 = v37.c - v37.b;
                    V30 v311 = v37.g;
                    AbstractC2995aW.n(v311);
                    int i6 = 8192 - v311.c;
                    V30 v312 = v37.g;
                    AbstractC2995aW.n(v312);
                    if (!v312.d) {
                        V30 v313 = v37.g;
                        AbstractC2995aW.n(v313);
                        i2 = v313.b;
                    }
                    if (i5 <= i6 + i2) {
                        V30 v314 = v37.g;
                        AbstractC2995aW.n(v314);
                        v37.d(v314, i5);
                        v37.a();
                        AbstractC3228d40.a(v37);
                    }
                }
            }
            c4848vb.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4848vb) {
                long j = this.b;
                C4848vb c4848vb = (C4848vb) obj;
                if (j == c4848vb.b) {
                    if (j != 0) {
                        V30 v30 = this.f5139a;
                        AbstractC2995aW.n(v30);
                        V30 v31 = c4848vb.f5139a;
                        AbstractC2995aW.n(v31);
                        int i = v30.b;
                        int i2 = v31.b;
                        long j2 = 0;
                        while (j2 < this.b) {
                            long jMin = Math.min(v30.c - i, v31.c - i2);
                            if (0 < jMin) {
                                long j3 = 0;
                                do {
                                    j3++;
                                    int i3 = i + 1;
                                    byte b = v30.f3857a[i];
                                    int i4 = i2 + 1;
                                    if (b == v31.f3857a[i2]) {
                                        i2 = i4;
                                        i = i3;
                                    }
                                } while (j3 < jMin);
                            }
                            if (i == v30.c) {
                                V30 v32 = v30.f;
                                AbstractC2995aW.n(v32);
                                i = v32.b;
                                v30 = v32;
                            }
                            if (i2 == v31.c) {
                                v31 = v31.f;
                                AbstractC2995aW.n(v31);
                                i2 = v31.b;
                            }
                            j2 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        V30 v30 = this.f5139a;
        if (v30 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = v30.c;
            for (int i3 = v30.b; i3 < i2; i3++) {
                i = (i * 31) + v30.f3857a[i3];
            }
            v30 = v30.f;
            AbstractC2995aW.n(v30);
        } while (v30 != this.f5139a);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final String j(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "limit < 0: ").toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        byte b = (byte) 10;
        long jO = o(b, 0L, j2);
        if (jO != -1) {
            return AbstractC5135ym0.a(this, jO);
        }
        if (j2 < this.b && n(j2 - 1) == ((byte) 13) && n(j2) == b) {
            return AbstractC5135ym0.a(this, j2);
        }
        C4848vb c4848vb = new C4848vb();
        m(c4848vb, 0L, Math.min(32, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + c4848vb.F(c4848vb.b).d() + (char) 8230);
    }

    public final long k() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        V30 v30 = this.f5139a;
        AbstractC2995aW.n(v30);
        V30 v31 = v30.g;
        AbstractC2995aW.n(v31);
        int i = v31.c;
        if (i < 8192 && v31.e) {
            j -= (long) (i - v31.b);
        }
        return j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final boolean l(long j) {
        return this.b >= j;
    }

    public final void m(C4848vb c4848vb, long j, long j2) {
        AbstractC2995aW.q(c4848vb, "out");
        AbstractC2845Vx.P(this.b, j, j2);
        if (j2 == 0) {
            return;
        }
        c4848vb.b += j2;
        V30 v30 = this.f5139a;
        while (true) {
            AbstractC2995aW.n(v30);
            long j3 = v30.c - v30.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            v30 = v30.f;
        }
        while (j2 > 0) {
            AbstractC2995aW.n(v30);
            V30 v30C = v30.c();
            int i = v30C.b + ((int) j);
            v30C.b = i;
            v30C.c = Math.min(i + ((int) j2), v30C.c);
            V30 v31 = c4848vb.f5139a;
            if (v31 == null) {
                v30C.g = v30C;
                v30C.f = v30C;
                c4848vb.f5139a = v30C;
            } else {
                V30 v32 = v31.g;
                AbstractC2995aW.n(v32);
                v32.b(v30C);
            }
            j2 -= (long) (v30C.c - v30C.b);
            v30 = v30.f;
            j = 0;
        }
    }

    public final byte n(long j) {
        AbstractC2845Vx.P(this.b, j, 1L);
        V30 v30 = this.f5139a;
        if (v30 == null) {
            AbstractC2995aW.n(null);
            throw null;
        }
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                v30 = v30.g;
                AbstractC2995aW.n(v30);
                j2 -= (long) (v30.c - v30.b);
            }
            return v30.f3857a[(int) ((((long) v30.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = v30.c;
            int i2 = v30.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return v30.f3857a[(int) ((((long) i2) + j) - j3)];
            }
            v30 = v30.f;
            AbstractC2995aW.n(v30);
            j3 = j4;
        }
    }

    public final long o(byte b, long j, long j2) {
        V30 v30;
        long j3 = j;
        boolean z = false;
        long j4 = 0;
        if (0 <= j3 && j3 <= j2) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("size=" + this.b + " fromIndex=" + j3 + " toIndex=" + j2).toString());
        }
        long j5 = this.b;
        long j6 = j2 > j5 ? j5 : j2;
        if (j3 == j6 || (v30 = this.f5139a) == null) {
            return -1L;
        }
        if (j5 - j3 < j3) {
            while (j5 > j3) {
                v30 = v30.g;
                AbstractC2995aW.n(v30);
                j5 -= (long) (v30.c - v30.b);
            }
            while (j5 < j6) {
                int iMin = (int) Math.min(v30.c, (((long) v30.b) + j6) - j5);
                for (int i = (int) ((((long) v30.b) + j3) - j5); i < iMin; i++) {
                    if (v30.f3857a[i] == b) {
                        return ((long) (i - v30.b)) + j5;
                    }
                }
                j5 += (long) (v30.c - v30.b);
                v30 = v30.f;
                AbstractC2995aW.n(v30);
                j3 = j5;
            }
            return -1L;
        }
        while (true) {
            long j7 = ((long) (v30.c - v30.b)) + j4;
            if (j7 > j3) {
                break;
            }
            v30 = v30.f;
            AbstractC2995aW.n(v30);
            j4 = j7;
        }
        while (j4 < j6) {
            int iMin2 = (int) Math.min(v30.c, (((long) v30.b) + j6) - j4);
            for (int i2 = (int) ((((long) v30.b) + j3) - j4); i2 < iMin2; i2++) {
                if (v30.f3857a[i2] == b) {
                    return ((long) (i2 - v30.b)) + j4;
                }
            }
            j4 += (long) (v30.c - v30.b);
            v30 = v30.f;
            AbstractC2995aW.n(v30);
            j3 = j4;
        }
        return -1L;
    }

    public final long p(C3971lc c3971lc, long j) {
        int i;
        long j2;
        long j3;
        AbstractC2995aW.q(c3971lc, "targetBytes");
        long j4 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "fromIndex < 0: ").toString());
        }
        V30 v30 = this.f5139a;
        if (v30 == null) {
            return -1L;
        }
        long j5 = this.b;
        long j6 = j5 - j;
        byte[] bArr = c3971lc.f4653a;
        if (j6 < j) {
            while (j5 > j) {
                v30 = v30.g;
                AbstractC2995aW.n(v30);
                j5 -= (long) (v30.c - v30.b);
            }
            if (bArr.length != 2) {
                long j7 = j;
                while (j5 < this.b) {
                    i = (int) ((((long) v30.b) + j7) - j5);
                    int i2 = v30.c;
                    while (i < i2) {
                        byte b = v30.f3857a[i];
                        int length = bArr.length;
                        int i3 = 0;
                        while (i3 < length) {
                            byte b2 = bArr[i3];
                            i3++;
                            if (b == b2) {
                                return ((long) (i - v30.b)) + j5;
                            }
                        }
                        i++;
                    }
                    j5 += (long) (v30.c - v30.b);
                    v30 = v30.f;
                    AbstractC2995aW.n(v30);
                    j7 = j5;
                }
                return -1L;
            }
            byte b3 = bArr[0];
            byte b4 = bArr[1];
            j2 = j5;
            V30 v31 = v30;
            long j8 = j;
            while (j2 < this.b) {
                int i4 = v31.c;
                for (int i5 = (int) ((((long) v31.b) + j8) - j2); i5 < i4; i5++) {
                    byte b5 = v31.f3857a[i5];
                    if (b5 == b3 || b5 == b4) {
                        j3 = i5 - v31.b;
                        return j3 + j2;
                    }
                }
                j2 += (long) (v31.c - v31.b);
                v31 = v31.f;
                AbstractC2995aW.n(v31);
                j8 = j2;
            }
            return -1L;
        }
        while (true) {
            long j9 = ((long) (v30.c - v30.b)) + j4;
            if (j9 > j) {
                break;
            }
            v30 = v30.f;
            AbstractC2995aW.n(v30);
            j4 = j9;
        }
        if (bArr.length == 2) {
            byte b6 = bArr[0];
            byte b7 = bArr[1];
            j2 = j4;
            long j10 = j;
            while (j2 < this.b) {
                int i6 = v30.c;
                for (int i7 = (int) ((((long) v30.b) + j10) - j2); i7 < i6; i7++) {
                    byte b8 = v30.f3857a[i7];
                    if (b8 == b6 || b8 == b7) {
                        j3 = i7 - v30.b;
                        return j3 + j2;
                    }
                }
                j2 += (long) (v30.c - v30.b);
                v30 = v30.f;
                AbstractC2995aW.n(v30);
                j10 = j2;
            }
            return -1L;
        }
        j5 = j4;
        long j11 = j;
        while (j5 < this.b) {
            i = (int) ((((long) v30.b) + j11) - j5);
            int i8 = v30.c;
            while (i < i8) {
                byte b9 = v30.f3857a[i];
                int length2 = bArr.length;
                int i9 = 0;
                while (i9 < length2) {
                    byte b10 = bArr[i9];
                    i9++;
                    if (b9 == b10) {
                        return ((long) (i - v30.b)) + j5;
                    }
                }
                i++;
            }
            j5 += (long) (v30.c - v30.b);
            v30 = v30.f;
            AbstractC2995aW.n(v30);
            j11 = j5;
        }
        return -1L;
    }

    public final byte[] q(long j) throws EOFException {
        int i = 0;
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        int i2 = (int) j;
        byte[] bArr = new byte[i2];
        while (i < i2) {
            int i3 = read(bArr, i, i2 - i);
            if (i3 == -1) {
                throw new EOFException();
            }
            i += i3;
        }
        return bArr;
    }

    public final long r() throws EOFException {
        if (this.b == 0) {
            throw new EOFException();
        }
        long j = -7;
        long j2 = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        do {
            V30 v30 = this.f5139a;
            AbstractC2995aW.n(v30);
            int i2 = v30.b;
            int i3 = v30.c;
            while (i2 < i3) {
                byte b = v30.f3857a[i2];
                byte b2 = (byte) 48;
                if (b >= b2 && b <= ((byte) 57)) {
                    int i4 = b2 - b;
                    if (j2 < -922337203685477580L || (j2 == -922337203685477580L && i4 < j)) {
                        C4848vb c4848vb = new C4848vb();
                        c4848vb.S(j2);
                        c4848vb.R(b);
                        if (!z) {
                            c4848vb.readByte();
                        }
                        throw new NumberFormatException(AbstractC2995aW.v0(c4848vb.t(), "Number too large: "));
                    }
                    j2 = (j2 * 10) + ((long) i4);
                } else {
                    if (b != ((byte) 45) || i != 0) {
                        z2 = true;
                        break;
                    }
                    j--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.f5139a = v30.a();
                AbstractC3228d40.a(v30);
            } else {
                v30.b = i2;
            }
            if (z2) {
                break;
            }
        } while (this.f5139a != null);
        long j3 = this.b - ((long) i);
        this.b = j3;
        if (i >= (z ? 2 : 1)) {
            return z ? j2 : -j2;
        }
        if (j3 == 0) {
            throw new EOFException();
        }
        StringBuilder sbQ = DM.q(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
        byte bN = n(0L);
        char[] cArr = AbstractC2340Cl.f;
        sbQ.append(new String(new char[]{cArr[(bN >> 4) & 15], cArr[bN & com.umeng.analytics.pro.cw.m]}));
        throw new NumberFormatException(sbQ.toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC2995aW.q(byteBuffer, "sink");
        V30 v30 = this.f5139a;
        if (v30 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), v30.c - v30.b);
        byteBuffer.put(v30.f3857a, v30.b, iMin);
        int i = v30.b + iMin;
        v30.b = i;
        this.b -= (long) iMin;
        if (i == v30.c) {
            this.f5139a = v30.a();
            AbstractC3228d40.a(v30);
        }
        return iMin;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final byte readByte() {
        if (this.b == 0) {
            throw new EOFException();
        }
        V30 v30 = this.f5139a;
        AbstractC2995aW.n(v30);
        int i = v30.b;
        int i2 = v30.c;
        int i3 = i + 1;
        byte b = v30.f3857a[i];
        this.b--;
        if (i3 == i2) {
            this.f5139a = v30.a();
            AbstractC3228d40.a(v30);
        } else {
            v30.b = i3;
        }
        return b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final int readInt() throws EOFException {
        if (this.b < 4) {
            throw new EOFException();
        }
        V30 v30 = this.f5139a;
        AbstractC2995aW.n(v30);
        int i = v30.b;
        int i2 = v30.c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = v30.f3857a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.b -= 4;
        if (i5 == i2) {
            this.f5139a = v30.a();
            AbstractC3228d40.a(v30);
        } else {
            v30.b = i5;
        }
        return i6;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final short readShort() throws EOFException {
        if (this.b < 2) {
            throw new EOFException();
        }
        V30 v30 = this.f5139a;
        AbstractC2995aW.n(v30);
        int i = v30.b;
        int i2 = v30.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = v30.f3857a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.f5139a = v30.a();
            AbstractC3228d40.a(v30);
        } else {
            v30.b = i5;
        }
        return (short) i6;
    }

    public final String s(long j, Charset charset) throws EOFException {
        AbstractC2995aW.q(charset, "charset");
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        V30 v30 = this.f5139a;
        AbstractC2995aW.n(v30);
        int i = v30.b;
        if (((long) i) + j > v30.c) {
            return new String(q(j), charset);
        }
        int i2 = (int) j;
        String str = new String(v30.f3857a, i, i2, charset);
        int i3 = v30.b + i2;
        v30.b = i3;
        this.b -= j;
        if (i3 == v30.c) {
            this.f5139a = v30.a();
            AbstractC3228d40.a(v30);
        }
        return str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            V30 v30 = this.f5139a;
            if (v30 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, v30.c - v30.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = v30.b + iMin;
            v30.b = i;
            if (i == v30.c) {
                this.f5139a = v30.a();
                AbstractC3228d40.a(v30);
            }
        }
    }

    public final String t() {
        return s(this.b, AbstractC2307Be.f2881a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final Ic0 timeout() {
        return Ic0.d;
    }

    public final String toString() {
        return u().toString();
    }

    public final C3971lc u() {
        long j = this.b;
        if (j <= 2147483647L) {
            return v((int) j);
        }
        throw new IllegalStateException(AbstractC2995aW.v0(Long.valueOf(j), "size > Int.MAX_VALUE: ").toString());
    }

    public final C3971lc v(int i) {
        if (i == 0) {
            return C3971lc.d;
        }
        AbstractC2845Vx.P(this.b, 0L, i);
        V30 v30 = this.f5139a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            AbstractC2995aW.n(v30);
            int i5 = v30.c;
            int i6 = v30.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            v30 = v30.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        V30 v31 = this.f5139a;
        int i7 = 0;
        while (i2 < i) {
            AbstractC2995aW.n(v31);
            bArr[i7] = v31.f3857a;
            i2 += v31.c - v31.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = v31.b;
            v31.d = true;
            i7++;
            v31 = v31.f;
        }
        return new C3316e40(bArr, iArr);
    }

    public final V30 w(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        V30 v30 = this.f5139a;
        if (v30 == null) {
            V30 v30B = AbstractC3228d40.b();
            this.f5139a = v30B;
            v30B.g = v30B;
            v30B.f = v30B;
            return v30B;
        }
        V30 v31 = v30.g;
        AbstractC2995aW.n(v31);
        if (v31.c + i <= 8192 && v31.e) {
            return v31;
        }
        V30 v30B2 = AbstractC3228d40.b();
        v31.b(v30B2);
        return v30B2;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC2995aW.q(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            V30 v30W = w(1);
            int iMin = Math.min(i, 8192 - v30W.c);
            byteBuffer.get(v30W.f3857a, v30W.c, iMin);
            i -= iMin;
            v30W.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final /* bridge */ /* synthetic */ InterfaceC2434Gb writeByte(int i) {
        R(i);
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final /* bridge */ /* synthetic */ InterfaceC2434Gb writeInt(int i) {
        U(i);
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final /* bridge */ /* synthetic */ InterfaceC2434Gb writeShort(int i) {
        V(i);
        return this;
    }

    public final void x(C3971lc c3971lc) {
        AbstractC2995aW.q(c3971lc, "byteString");
        c3971lc.k(this, c3971lc.c());
    }

    public final void y(byte[] bArr, int i, int i2) {
        AbstractC2995aW.q(bArr, "source");
        long j = i2;
        AbstractC2845Vx.P(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            V30 v30W = w(1);
            int iMin = Math.min(i3 - i, 8192 - v30W.c);
            int i4 = i + iMin;
            U5.j0(v30W.c, bArr, i, v30W.f3857a, i4);
            v30W.c += iMin;
            i = i4;
        }
        this.b += j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final InterfaceC2434Gb write(byte[] bArr) {
        y(bArr, 0, bArr.length);
        return this;
    }

    public final int read(byte[] bArr, int i, int i2) {
        AbstractC2995aW.q(bArr, "sink");
        AbstractC2845Vx.P(bArr.length, i, i2);
        V30 v30 = this.f5139a;
        if (v30 == null) {
            return -1;
        }
        int iMin = Math.min(i2, v30.c - v30.b);
        int i3 = v30.b;
        U5.j0(i, v30.f3857a, i3, bArr, i3 + iMin);
        int i4 = v30.b + iMin;
        v30.b = i4;
        this.b -= (long) iMin;
        if (i4 == v30.c) {
            this.f5139a = v30.a();
            AbstractC3228d40.a(v30);
        }
        return iMin;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final /* bridge */ /* synthetic */ InterfaceC2434Gb write(byte[] bArr, int i, int i2) {
        y(bArr, i, i2);
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final long read(C4848vb c4848vb, long j) {
        AbstractC2995aW.q(c4848vb, "sink");
        if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            c4848vb.d(this, j);
            return j;
        }
        throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "byteCount < 0: ").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70
    public final void close() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Flushable
    public final void flush() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb
    public final C4848vb getBuffer() {
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2434Gb
    public final InterfaceC2434Gb z() {
        return this;
    }
}

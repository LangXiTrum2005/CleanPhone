package com.thinkup.core.common.no.n;

import android.support.v4.media.session.PlaybackStateCompat;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.mediationsdk.metadata.a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
final class o0m implements oo {
    public final oon m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f42089n;
    public final n o = new n();

    public o0m(oon oonVar) {
        if (oonVar == null) {
            throw new NullPointerException("source == null");
        }
        this.m = oonVar;
    }

    @Override // com.thinkup.core.common.no.n.oon
    public final long a_(n nVar, long j) {
        if (nVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (this.f42089n) {
            throw new IllegalStateException("closed");
        }
        n nVar2 = this.o;
        if (nVar2.f42084n == 0 && this.m.a_(nVar2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.o.a_(nVar, Math.min(j, this.o.f42084n));
    }

    @Override // com.thinkup.core.common.no.n.oon, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f42089n) {
            return;
        }
        this.f42089n = true;
        this.m.close();
        this.o.omm();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f42089n;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final boolean m(long j) {
        n nVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (this.f42089n) {
            throw new IllegalStateException("closed");
        }
        do {
            nVar = this.o;
            if (nVar.f42084n >= j) {
                return true;
            }
        } while (this.m.a_(nVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final byte[] m0(long j) throws EOFException {
        o(j);
        return this.o.m0(j);
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final byte mn() throws EOFException {
        o(1L);
        return this.o.mn();
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final void mo(long j) throws EOFException {
        if (this.f42089n) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            n nVar = this.o;
            if (nVar.f42084n == 0 && this.m.a_(nVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.o.f42084n);
            this.o.mo(jMin);
            j -= jMin;
        }
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final n n() {
        return this.o;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final short n0() throws EOFException {
        o(2L);
        return this.o.n0();
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long nm() throws EOFException {
        o(8L);
        return this.o.nm();
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final short nn() throws EOFException {
        o(2L);
        return omo.o(this.o.n0());
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final int no() throws EOFException {
        o(4L);
        return this.o.no();
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final void o(long j) throws EOFException {
        if (!m(j)) {
            throw new EOFException();
        }
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final n o0() {
        return this.o;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final int o00() throws EOFException {
        o(4L);
        return omo.o(this.o.no());
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long o0m() throws EOFException {
        o(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!m(i3)) {
                break;
            }
            byte bN = this.o.n(i2);
            if ((bN < 48 || bN > 57) && !(i2 == 0 && bN == 45)) {
                if (i2 != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(bN)));
            }
            i2 = i3;
        }
        return this.o.o0m();
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long o0n() throws EOFException {
        o(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!m(i3)) {
                break;
            }
            byte bN = this.o.n(i2);
            if ((bN < 48 || bN > 57) && ((bN < 97 || bN > 102) && (bN < 65 || bN > 70))) {
                if (i2 != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bN)));
            }
            i2 = i3;
        }
        return this.o.o0n();
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long o0o() throws EOFException {
        o(8L);
        return omo.o(this.o.nm());
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final String om(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)));
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jO = o((byte) 10, 0L, j2);
        if (jO != -1) {
            return this.o.on(jO);
        }
        if (j2 < Long.MAX_VALUE && m(j2) && this.o.n(j2 - 1) == 13 && m(j2 + 1) && this.o.n(j2) == 10) {
            return this.o.on(j2);
        }
        n nVar = new n();
        n nVar2 = this.o;
        nVar2.o(nVar, 0L, Math.min(32L, nVar2.f42084n));
        throw new EOFException("\\n not found: limit=" + Math.min(this.o.f42084n, j) + " content=" + nVar.oo0().on() + (char) 8230);
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final int om0() throws EOFException {
        int i2;
        int i3;
        int i4;
        o(1L);
        byte bN = this.o.n(0L);
        if ((bN & 224) == 192) {
            o(2L);
        } else if ((bN & 240) == 224) {
            o(3L);
        } else if ((bN & 248) == 240) {
            o(4L);
        }
        n nVar = this.o;
        if (nVar.f42084n == 0) {
            throw new EOFException();
        }
        byte bN2 = nVar.n(0L);
        if ((bN2 & 128) == 0) {
            i2 = bN2 & AbstractJsonLexerKt.TC_INVALID;
            i4 = 0;
            i3 = 1;
        } else if ((bN2 & 224) == 192) {
            i2 = bN2 & 31;
            i3 = 2;
            i4 = 128;
        } else if ((bN2 & 240) == 224) {
            i2 = bN2 & 15;
            i3 = 3;
            i4 = a.f25965n;
        } else {
            if ((bN2 & 248) != 240) {
                nVar.mo(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i2 = bN2 & 7;
            i3 = 4;
            i4 = 65536;
        }
        long j = i3;
        if (nVar.f42084n < j) {
            StringBuilder sbU = android.support.v4.media.a.u(i3, "size < ", ": ");
            sbU.append(nVar.f42084n);
            sbU.append(" (to read code point prefixed 0x");
            sbU.append(Integer.toHexString(bN2));
            sbU.append(")");
            throw new EOFException(sbU.toString());
        }
        for (int i5 = 1; i5 < i3; i5++) {
            long j2 = i5;
            byte bN3 = nVar.n(j2);
            if ((bN3 & 192) != 128) {
                nVar.mo(j2);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i2 = (i2 << 6) | (bN3 & 63);
        }
        nVar.mo(j);
        if (i2 > 1114111) {
            return Utf8.REPLACEMENT_CODE_POINT;
        }
        return ((i2 < 55296 || i2 > 57343) && i2 >= i4) ? i2 : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final byte[] omo() {
        this.o.o(this.m);
        return this.o.omo();
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final boolean on() {
        if (this.f42089n) {
            throw new IllegalStateException("closed");
        }
        return this.o.on() && this.m.a_(this.o, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final String oo(long j) throws EOFException {
        o(j);
        return this.o.oo(j);
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final om oo0() {
        this.o.o(this.m);
        return this.o.oo0();
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final String oom() {
        long jO = o((byte) 10);
        if (jO != -1) {
            return this.o.on(jO);
        }
        long j = this.o.f42084n;
        if (j != 0) {
            return oo(j);
        }
        return null;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final String oon() {
        return om(Long.MAX_VALUE);
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final String ooo() {
        this.o.o(this.m);
        return this.o.ooo();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        n nVar = this.o;
        if (nVar.f42084n == 0 && this.m.a_(nVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.o.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.m + ")";
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long n(om omVar) {
        return m(omVar, 0L);
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final int o(nn nnVar) throws EOFException {
        if (this.f42089n) {
            throw new IllegalStateException("closed");
        }
        do {
            int iO = this.o.o(nnVar, true);
            if (iO == -1) {
                return -1;
            }
            if (iO != -2) {
                this.o.mo(nnVar.o[iO].mm());
                return iO;
            }
        } while (this.m.a_(this.o, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final om o0(long j) throws EOFException {
        o(j);
        return this.o.o0(j);
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final oo m0() {
        return nm.o(new o00(this));
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final void m(byte[] bArr) throws EOFException {
        try {
            o(bArr.length);
            this.o.m(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (true) {
                n nVar = this.o;
                long j = nVar.f42084n;
                if (j > 0) {
                    int iO = nVar.o(bArr, i2, (int) j);
                    if (iO == -1) {
                        throw new AssertionError();
                    }
                    i2 += iO;
                } else {
                    throw e2;
                }
            }
        }
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final int o(byte[] bArr) {
        return o(bArr, 0, bArr.length);
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final InputStream mo() {
        return new InputStream() { // from class: com.thinkup.core.common.no.n.o0m.1
            @Override // java.io.InputStream
            public final int available() throws IOException {
                o0m o0mVar = o0m.this;
                if (o0mVar.f42089n) {
                    throw new IOException("closed");
                }
                return (int) Math.min(o0mVar.o.f42084n, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                o0m.this.close();
            }

            @Override // java.io.InputStream
            public final int read() throws IOException {
                o0m o0mVar = o0m.this;
                if (o0mVar.f42089n) {
                    throw new IOException("closed");
                }
                n nVar = o0mVar.o;
                if (nVar.f42084n == 0 && o0mVar.m.a_(nVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return o0m.this.o.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }

            public final String toString() {
                return o0m.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i2, int i3) throws IOException {
                if (!o0m.this.f42089n) {
                    omo.o(bArr.length, i2, i3);
                    o0m o0mVar = o0m.this;
                    n nVar = o0mVar.o;
                    if (nVar.f42084n == 0 && o0mVar.m.a_(nVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return -1;
                    }
                    return o0m.this.o.o(bArr, i2, i3);
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final int o(byte[] bArr, int i2, int i3) {
        long j = i3;
        omo.o(bArr.length, i2, j);
        n nVar = this.o;
        if (nVar.f42084n == 0 && this.m.a_(nVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.o.o(bArr, i2, (int) Math.min(j, this.o.f42084n));
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final void m(n nVar, long j) throws EOFException {
        try {
            o(j);
            this.o.m(nVar, j);
        } catch (EOFException e2) {
            nVar.o((oon) this.o);
            throw e2;
        }
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long o(oom oomVar) {
        if (oomVar != null) {
            long j = 0;
            while (this.m.a_(this.o, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                long jMm = this.o.mm();
                if (jMm > 0) {
                    j += jMm;
                    oomVar.o(this.o, jMm);
                }
            }
            n nVar = this.o;
            long j2 = nVar.f42084n;
            if (j2 <= 0) {
                return j;
            }
            long j3 = j + j2;
            oomVar.o(nVar, j2);
            return j3;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long m(om omVar) {
        return o(omVar, 0L);
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long m(om omVar, long j) {
        if (this.f42089n) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jM = this.o.m(omVar, j);
            if (jM != -1) {
                return jM;
            }
            n nVar = this.o;
            long j2 = nVar.f42084n;
            if (this.m.a_(nVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final String o(Charset charset) {
        if (charset != null) {
            this.o.o(this.m);
            return this.o.o(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final String o(long j, Charset charset) throws EOFException {
        o(j);
        if (charset != null) {
            return this.o.o(j, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long o(byte b2) {
        return o(b2, 0L, Long.MAX_VALUE);
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long o(byte b2, long j) {
        return o(b2, j, Long.MAX_VALUE);
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long o(byte b2, long j, long j2) {
        if (this.f42089n) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || j2 < j) {
            StringBuilder sbV = android.support.v4.media.a.v(j, "fromIndex=", " toIndex=");
            sbV.append(j2);
            throw new IllegalArgumentException(sbV.toString());
        }
        long jMax = j;
        while (jMax < j2) {
            byte b3 = b2;
            long j3 = j2;
            long jO = this.o.o(b3, jMax, j3);
            if (jO != -1) {
                return jO;
            }
            n nVar = this.o;
            long j4 = nVar.f42084n;
            if (j4 >= j3 || this.m.a_(nVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b2 = b3;
            j2 = j3;
        }
        return -1L;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long o(om omVar, long j) {
        if (this.f42089n) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jO = this.o.o(omVar, j);
            if (jO != -1) {
                return jO;
            }
            n nVar = this.o;
            long j2 = nVar.f42084n;
            if (this.m.a_(nVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, (j2 - ((long) omVar.mm())) + 1);
        }
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final boolean o(long j, om omVar) {
        return o(j, omVar, omVar.mm());
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final boolean o(long j, om omVar, int i2) {
        if (!this.f42089n) {
            if (j < 0 || i2 < 0 || omVar.mm() < i2) {
                return false;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!m(1 + j2) || this.o.n(j2) != omVar.m(i3)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.thinkup.core.common.no.n.oon
    public final om0 o() {
        return this.m.o();
    }
}

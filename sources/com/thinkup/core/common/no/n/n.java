package com.thinkup.core.common.no.n;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.datastore.preferences.protobuf.a;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements o0, oo, Cloneable, ByteChannel {
    static final int o = 65533;
    private static final byte[] o0 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    o0n m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f42084n;

    private om m00() {
        return n("SHA-256");
    }

    private n m0m() {
        n nVar = new n();
        if (this.f42084n == 0) {
            return nVar;
        }
        o0n o0nVarO = this.m.o();
        nVar.m = o0nVarO;
        o0nVarO.mo = o0nVarO;
        o0nVarO.m0 = o0nVarO;
        o0n o0nVar = this.m;
        while (true) {
            o0nVar = o0nVar.m0;
            if (o0nVar == this.m) {
                nVar.f42084n = this.f42084n;
                return nVar;
            }
            nVar.m.mo.o(o0nVar.o());
        }
    }

    private om m0n() {
        long j = this.f42084n;
        if (j <= 2147483647L) {
            int i2 = (int) j;
            return i2 == 0 ? om.m : new ooo(this, i2);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f42084n);
    }

    private om m0o() {
        return n("SHA-512");
    }

    private o mo0() {
        o oVar = new o();
        if (oVar.o != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        oVar.o = this;
        oVar.m = false;
        return oVar;
    }

    private o moo() {
        return o(new o());
    }

    private n on0() {
        return this;
    }

    private om onm() {
        return n("MD5");
    }

    private om onn() {
        return n(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    private List<Integer> ono() {
        if (this.m == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        o0n o0nVar = this.m;
        arrayList.add(Integer.valueOf(o0nVar.oo - o0nVar.o0));
        o0n o0nVar2 = this.m;
        while (true) {
            o0nVar2 = o0nVar2.m0;
            if (o0nVar2 == this.m) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(o0nVar2.oo - o0nVar2.o0));
        }
    }

    @Override // com.thinkup.core.common.no.n.oon
    public final long a_(n nVar, long j) {
        if (nVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        long j2 = this.f42084n;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        nVar.o(this, j);
        return j;
    }

    public final /* synthetic */ Object clone() {
        n nVar = new n();
        if (this.f42084n == 0) {
            return nVar;
        }
        o0n o0nVarO = this.m.o();
        nVar.m = o0nVarO;
        o0nVarO.mo = o0nVarO;
        o0nVarO.m0 = o0nVarO;
        o0n o0nVar = this.m;
        while (true) {
            o0nVar = o0nVar.m0;
            if (o0nVar == this.m) {
                nVar.f42084n = this.f42084n;
                return nVar;
            }
            nVar.m.mo.o(o0nVar.o());
        }
    }

    @Override // com.thinkup.core.common.no.n.oom, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        long j = this.f42084n;
        if (j != nVar.f42084n) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        o0n o0nVar = this.m;
        o0n o0nVar2 = nVar.m;
        int i2 = o0nVar.o0;
        int i3 = o0nVar2.o0;
        while (j2 < this.f42084n) {
            long jMin = Math.min(o0nVar.oo - i2, o0nVar2.oo - i3);
            int i4 = 0;
            while (i4 < jMin) {
                int i5 = i2 + 1;
                int i6 = i3 + 1;
                if (o0nVar.f42090n[i2] != o0nVar2.f42090n[i3]) {
                    return false;
                }
                i4++;
                i2 = i5;
                i3 = i6;
            }
            if (i2 == o0nVar.oo) {
                o0nVar = o0nVar.m0;
                i2 = o0nVar.o0;
            }
            if (i3 == o0nVar2.oo) {
                o0nVar2 = o0nVar2.m0;
                i3 = o0nVar2.o0;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // com.thinkup.core.common.no.n.o0, com.thinkup.core.common.no.n.oom, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        o0n o0nVar = this.m;
        if (o0nVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = o0nVar.oo;
            for (int i4 = o0nVar.o0; i4 < i3; i4++) {
                i2 = (i2 * 31) + o0nVar.f42090n[i4];
            }
            o0nVar = o0nVar.m0;
        } while (o0nVar != this.m);
        return i2;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // com.thinkup.core.common.no.n.o0, com.thinkup.core.common.no.n.oo
    public final n n() {
        return this;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final void o(long j) throws EOFException {
        if (this.f42084n < j) {
            throw new EOFException();
        }
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final n o0() {
        return this;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long o0m() {
        if (this.f42084n == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i2 = 0;
        boolean z2 = false;
        long j = -7;
        long j2 = 0;
        boolean z3 = false;
        do {
            o0n o0nVar = this.m;
            byte[] bArr = o0nVar.f42090n;
            int i3 = o0nVar.o0;
            int i4 = o0nVar.oo;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    int i5 = 48 - b2;
                    if (j2 < Buffer.OVERFLOW_ZONE || (j2 == Buffer.OVERFLOW_ZONE && i5 < j)) {
                        n nVarN0 = new n().nn(j2).n0((int) b2);
                        if (!z2) {
                            nVarN0.mn();
                        }
                        throw new NumberFormatException("Number too large: " + nVarN0.ooo());
                    }
                    j2 = (j2 * 10) + ((long) i5);
                } else {
                    if (b2 != 45 || i2 != 0) {
                        if (i2 == 0) {
                            throw new NumberFormatException(a.h(b2, new StringBuilder("Expected leading [0-9] or '-' character but was 0x")));
                        }
                        z3 = true;
                        break;
                    }
                    j--;
                    z2 = true;
                }
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.m = o0nVar.n();
                oo0.o(o0nVar);
            } else {
                o0nVar.o0 = i3;
            }
            if (z3) {
                break;
            }
        } while (this.m != null);
        this.f42084n -= (long) i2;
        return z2 ? j2 : -j2;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long o0n() {
        int i2;
        if (this.f42084n == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i3 = 0;
        boolean z2 = false;
        long j = 0;
        do {
            o0n o0nVar = this.m;
            byte[] bArr = o0nVar.f42090n;
            int i4 = o0nVar.o0;
            int i5 = o0nVar.oo;
            while (i4 < i5) {
                byte b2 = bArr[i4];
                if (b2 >= 48 && b2 <= 57) {
                    i2 = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i2 = b2 - 87;
                } else {
                    if (b2 < 65 || b2 > 70) {
                        if (i3 == 0) {
                            throw new NumberFormatException(a.h(b2, new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x")));
                        }
                        z2 = true;
                        break;
                    }
                    i2 = b2 - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    throw new NumberFormatException("Number too large: " + new n().nm(j).n0((int) b2).ooo());
                }
                j = (j << 4) | ((long) i2);
                i4++;
                i3++;
            }
            if (i4 == i5) {
                this.m = o0nVar.n();
                oo0.o(o0nVar);
            } else {
                o0nVar.o0 = i4;
            }
            if (z2) {
                break;
            }
        } while (this.m != null);
        this.f42084n -= (long) i3;
        return j;
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 om() {
        return this;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final int om0() throws EOFException {
        int i2;
        int i3;
        int i4;
        if (this.f42084n == 0) {
            throw new EOFException();
        }
        byte bN = n(0L);
        if ((bN & 128) == 0) {
            i2 = bN & AbstractJsonLexerKt.TC_INVALID;
            i4 = 0;
            i3 = 1;
        } else if ((bN & 224) == 192) {
            i2 = bN & 31;
            i3 = 2;
            i4 = 128;
        } else if ((bN & 240) == 224) {
            i2 = bN & 15;
            i3 = 3;
            i4 = com.p004ironsource.mediationsdk.metadata.a.f25965n;
        } else {
            if ((bN & 248) != 240) {
                mo(1L);
                return 65533;
            }
            i2 = bN & 7;
            i3 = 4;
            i4 = 65536;
        }
        long j = i3;
        if (this.f42084n < j) {
            StringBuilder sbU = android.support.v4.media.a.u(i3, "size < ", ": ");
            sbU.append(this.f42084n);
            sbU.append(" (to read code point prefixed 0x");
            sbU.append(Integer.toHexString(bN));
            sbU.append(")");
            throw new EOFException(sbU.toString());
        }
        for (int i5 = 1; i5 < i3; i5++) {
            long j2 = i5;
            byte bN2 = n(j2);
            if ((bN2 & 192) != 128) {
                mo(j2);
                return 65533;
            }
            i2 = (i2 << 6) | (bN2 & 63);
        }
        mo(j);
        if (i2 > 1114111) {
            return 65533;
        }
        if ((i2 < 55296 || i2 > 57343) && i2 >= i4) {
            return i2;
        }
        return 65533;
    }

    public final void omm() {
        try {
            mo(this.f42084n);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final /* bridge */ /* synthetic */ o0 omn() {
        return this;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final byte[] omo() {
        try {
            return m0(this.f42084n);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final boolean on() {
        return this.f42084n == 0;
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final OutputStream oo() {
        return new OutputStream() { // from class: com.thinkup.core.common.no.n.n.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
            }

            public final String toString() {
                return n.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public final void write(int i2) {
                n.this.n0((int) ((byte) i2));
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i2, int i3) {
                n.this.n(bArr, i2, i3);
            }
        };
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final om oo0() {
        return new om(omo());
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final String oom() {
        long jO = o((byte) 10);
        if (jO != -1) {
            return on(jO);
        }
        long j = this.f42084n;
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
        try {
            return o(this.f42084n, omo.o);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        o0n o0nVar = this.m;
        if (o0nVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), o0nVar.oo - o0nVar.o0);
        byteBuffer.put(o0nVar.f42090n, o0nVar.o0, iMin);
        int i2 = o0nVar.o0 + iMin;
        o0nVar.o0 = i2;
        this.f42084n -= (long) iMin;
        if (i2 == o0nVar.oo) {
            this.m = o0nVar.n();
            oo0.o(o0nVar);
        }
        return iMin;
    }

    public final String toString() {
        long j = this.f42084n;
        if (j <= 2147483647L) {
            int i2 = (int) j;
            return (i2 == 0 ? om.m : new ooo(this, i2)).toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f42084n);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i2 = iRemaining;
        while (i2 > 0) {
            o0n o0nVarOn = on(1);
            int iMin = Math.min(i2, 8192 - o0nVarOn.oo);
            byteBuffer.get(o0nVarOn.f42090n, o0nVarOn.oo, iMin);
            i2 -= iMin;
            o0nVarOn.oo += iMin;
        }
        this.f42084n += (long) iRemaining;
        return iRemaining;
    }

    private n o(OutputStream outputStream) throws IOException {
        long j = this.f42084n;
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        omo.o(j, 0L, j);
        if (j != 0) {
            o0n o0nVar = this.m;
            long j2 = 0;
            while (true) {
                int i2 = o0nVar.oo;
                int i3 = o0nVar.o0;
                if (j2 < i2 - i3) {
                    break;
                }
                j2 -= (long) (i2 - i3);
                o0nVar = o0nVar.m0;
            }
            while (j > 0) {
                int i4 = (int) (((long) o0nVar.o0) + j2);
                int iMin = (int) Math.min(o0nVar.oo - i4, j);
                outputStream.write(o0nVar.f42090n, i4, iMin);
                j -= (long) iMin;
                o0nVar = o0nVar.m0;
                j2 = 0;
            }
        }
        return this;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final oo m0() {
        return nm.o(new o00(this));
    }

    public final long mm() {
        long j = this.f42084n;
        if (j == 0) {
            return 0L;
        }
        o0n o0nVar = this.m.mo;
        int i2 = o0nVar.oo;
        return (i2 >= 8192 || !o0nVar.on) ? j : j - ((long) (i2 - o0nVar.o0));
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final byte mn() {
        long j = this.f42084n;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        o0n o0nVar = this.m;
        int i2 = o0nVar.o0;
        int i3 = o0nVar.oo;
        int i4 = i2 + 1;
        byte b2 = o0nVar.f42090n[i2];
        this.f42084n = j - 1;
        if (i4 != i3) {
            o0nVar.o0 = i4;
            return b2;
        }
        this.m = o0nVar.n();
        oo0.o(o0nVar);
        return b2;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final InputStream mo() {
        return new InputStream() { // from class: com.thinkup.core.common.no.n.n.2
            @Override // java.io.InputStream
            public final int available() {
                return (int) Math.min(n.this.f42084n, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.InputStream
            public final int read() {
                n nVar = n.this;
                if (nVar.f42084n > 0) {
                    return nVar.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                }
                return -1;
            }

            public final String toString() {
                return n.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i2, int i3) {
                return n.this.o(bArr, i2, i3);
            }
        };
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final short n0() {
        long j = this.f42084n;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f42084n);
        }
        o0n o0nVar = this.m;
        int i2 = o0nVar.o0;
        int i3 = o0nVar.oo;
        if (i3 - i2 < 2) {
            return (short) (((mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        byte[] bArr = o0nVar.f42090n;
        int i4 = i2 + 1;
        int i5 = (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        int i6 = i2 + 2;
        int i7 = (bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i5;
        this.f42084n = j - 2;
        if (i6 == i3) {
            this.m = o0nVar.n();
            oo0.o(o0nVar);
        } else {
            o0nVar.o0 = i6;
        }
        return (short) i7;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long nm() {
        long j = this.f42084n;
        if (j < 8) {
            throw new IllegalStateException("size < 8: " + this.f42084n);
        }
        o0n o0nVar = this.m;
        int i2 = o0nVar.o0;
        int i3 = o0nVar.oo;
        if (i3 - i2 < 8) {
            return ((((long) no()) & 4294967295L) << 32) | (4294967295L & ((long) no()));
        }
        byte[] bArr = o0nVar.f42090n;
        int i4 = i2 + 7;
        long j2 = ((((long) bArr[i2 + 1]) & 255) << 48) | ((((long) bArr[i2]) & 255) << 56) | ((((long) bArr[i2 + 2]) & 255) << 40) | ((((long) bArr[i2 + 3]) & 255) << 32) | ((((long) bArr[i2 + 4]) & 255) << 24) | ((((long) bArr[i2 + 5]) & 255) << 16) | ((((long) bArr[i2 + 6]) & 255) << 8);
        int i5 = i2 + 8;
        long j3 = j2 | (((long) bArr[i4]) & 255);
        this.f42084n = j - 8;
        if (i5 != i3) {
            o0nVar.o0 = i5;
            return j3;
        }
        this.m = o0nVar.n();
        oo0.o(o0nVar);
        return j3;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final short nn() {
        return omo.o(n0());
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final int no() {
        long j = this.f42084n;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f42084n);
        }
        o0n o0nVar = this.m;
        int i2 = o0nVar.o0;
        int i3 = o0nVar.oo;
        if (i3 - i2 < 4) {
            return ((mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        byte[] bArr = o0nVar.f42090n;
        int i4 = i2 + 3;
        int i5 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i6 = i2 + 4;
        int i7 = (bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i5;
        this.f42084n = j - 4;
        if (i6 != i3) {
            o0nVar.o0 = i6;
            return i7;
        }
        this.m = o0nVar.n();
        oo0.o(o0nVar);
        return i7;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final int o00() {
        return omo.o(no());
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long o0o() {
        return omo.o(nm());
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final String om(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)));
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jO = o((byte) 10, 0L, j2);
        if (jO != -1) {
            return on(jO);
        }
        if (j2 < this.f42084n && n(j2 - 1) == 13 && n(j2) == 10) {
            return on(j2);
        }
        n nVar = new n();
        o(nVar, 0L, Math.min(32L, this.f42084n));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f42084n, j) + " content=" + nVar.oo0().on() + (char) 8230);
    }

    public final String on(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (n(j2) == 13) {
                String strOo = oo(j2);
                mo(2L);
                return strOo;
            }
        }
        String strOo2 = oo(j);
        mo(1L);
        return strOo2;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final String oo(long j) {
        return o(j, omo.o);
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final byte[] m0(long j) throws EOFException {
        omo.o(this.f42084n, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            m(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final void mo(long j) throws EOFException {
        while (j > 0) {
            o0n o0nVar = this.m;
            if (o0nVar != null) {
                int iMin = (int) Math.min(j, o0nVar.oo - o0nVar.o0);
                long j2 = iMin;
                this.f42084n -= j2;
                j -= j2;
                o0n o0nVar2 = this.m;
                int i2 = o0nVar2.o0 + iMin;
                o0nVar2.o0 = i2;
                if (i2 == o0nVar2.oo) {
                    this.m = o0nVar2.n();
                    oo0.o(o0nVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final byte n(long j) {
        int i2;
        long j2 = j;
        omo.o(this.f42084n, j2, 1L);
        long j3 = this.f42084n;
        if (j3 - j2 > j2) {
            o0n o0nVar = this.m;
            while (true) {
                int i3 = o0nVar.oo;
                int i4 = o0nVar.o0;
                long j4 = i3 - i4;
                if (j2 < j4) {
                    return o0nVar.f42090n[i4 + ((int) j2)];
                }
                j2 -= j4;
                o0nVar = o0nVar.m0;
            }
        } else {
            long j5 = j2 - j3;
            o0n o0nVar2 = this.m;
            do {
                o0nVar2 = o0nVar2.mo;
                int i5 = o0nVar2.oo;
                i2 = o0nVar2.o0;
                j5 += (long) (i5 - i2);
            } while (j5 < 0);
            return o0nVar2.f42090n[i2 + ((int) j5)];
        }
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: oo, reason: merged with bridge method [inline-methods] */
    public final n mo(int i2) {
        o0n o0nVarOn = on(4);
        byte[] bArr = o0nVarOn.f42090n;
        int i3 = o0nVarOn.oo;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        bArr[i3 + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i3 + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 3] = (byte) (i2 & 255);
        o0nVarOn.oo = i3 + 4;
        this.f42084n += 4;
        return this;
    }

    public static final class o implements Closeable {
        public boolean m;
        public n o;
        public byte[] o0;
        private o0n on;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f42085n = -1;
        public int oo = -1;
        public int om = -1;

        private long m(long j) {
            n nVar = this.o;
            if (nVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.m) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j2 = nVar.f42084n;
            if (j <= j2) {
                if (j < 0) {
                    throw new IllegalArgumentException("newSize < 0: ".concat(String.valueOf(j)));
                }
                long j3 = j2 - j;
                while (j3 > 0) {
                    n nVar2 = this.o;
                    o0n o0nVar = nVar2.m.mo;
                    int i2 = o0nVar.oo;
                    long j4 = i2 - o0nVar.o0;
                    if (j4 > j3) {
                        o0nVar.oo = (int) (((long) i2) - j3);
                        break;
                    }
                    nVar2.m = o0nVar.n();
                    oo0.o(o0nVar);
                    j3 -= j4;
                }
                this.on = null;
                this.f42085n = j;
                this.o0 = null;
                this.oo = -1;
                this.om = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                boolean z2 = true;
                while (j5 > 0) {
                    o0n o0nVarOn = this.o.on(1);
                    int iMin = (int) Math.min(j5, 8192 - o0nVarOn.oo);
                    int i3 = o0nVarOn.oo + iMin;
                    o0nVarOn.oo = i3;
                    j5 -= (long) iMin;
                    if (z2) {
                        this.on = o0nVarOn;
                        this.f42085n = j2;
                        this.o0 = o0nVarOn.f42090n;
                        this.oo = i3 - iMin;
                        this.om = i3;
                        z2 = false;
                    }
                }
            }
            this.o.f42084n = j;
            return j2;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.o == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.o = null;
            this.on = null;
            this.f42085n = -1L;
            this.o0 = null;
            this.oo = -1;
            this.om = -1;
        }

        public final int o() {
            long j = this.f42085n;
            if (j != this.o.f42084n) {
                return j == -1 ? o(0L) : o(j + ((long) (this.om - this.oo)));
            }
            throw new IllegalStateException();
        }

        public final int o(long j) {
            if (j >= -1) {
                n nVar = this.o;
                long j2 = nVar.f42084n;
                if (j <= j2) {
                    if (j != -1 && j != j2) {
                        o0n o0nVar = nVar.m;
                        o0n o0nVarO = this.on;
                        long j3 = 0;
                        if (o0nVarO != null) {
                            long j4 = this.f42085n - ((long) (this.oo - o0nVarO.o0));
                            if (j4 > j) {
                                o0nVarO = o0nVar;
                                o0nVar = o0nVarO;
                                j2 = j4;
                            } else {
                                j3 = j4;
                            }
                        } else {
                            o0nVarO = o0nVar;
                        }
                        if (j2 - j > j - j3) {
                            while (true) {
                                int i2 = o0nVarO.oo;
                                int i3 = o0nVarO.o0;
                                if (j < ((long) (i2 - i3)) + j3) {
                                    break;
                                }
                                j3 += (long) (i2 - i3);
                                o0nVarO = o0nVarO.m0;
                            }
                        } else {
                            while (j2 > j) {
                                o0nVar = o0nVar.mo;
                                j2 -= (long) (o0nVar.oo - o0nVar.o0);
                            }
                            o0nVarO = o0nVar;
                            j3 = j2;
                        }
                        if (this.m && o0nVarO.om) {
                            o0n o0nVarM = o0nVarO.m();
                            n nVar2 = this.o;
                            if (nVar2.m == o0nVarO) {
                                nVar2.m = o0nVarM;
                            }
                            o0nVarO = o0nVarO.o(o0nVarM);
                            o0nVarO.mo.n();
                        }
                        this.on = o0nVarO;
                        this.f42085n = j;
                        this.o0 = o0nVarO.f42090n;
                        int i4 = o0nVarO.o0 + ((int) (j - j3));
                        this.oo = i4;
                        int i5 = o0nVarO.oo;
                        this.om = i5;
                        return i5 - i4;
                    }
                    this.on = null;
                    this.f42085n = j;
                    this.o0 = null;
                    this.oo = -1;
                    this.om = -1;
                    return -1;
                }
            }
            long j5 = this.o.f42084n;
            StringBuilder sbV = android.support.v4.media.a.v(j, "offset=", " > size=");
            sbV.append(j5);
            throw new ArrayIndexOutOfBoundsException(sbV.toString());
        }

        private long o(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("minByteCount <= 0: ".concat(String.valueOf(i2)));
            }
            if (i2 <= 8192) {
                n nVar = this.o;
                if (nVar != null) {
                    if (this.m) {
                        long j = nVar.f42084n;
                        o0n o0nVarOn = nVar.on(i2);
                        int i3 = 8192 - o0nVarOn.oo;
                        o0nVarOn.oo = Segment.SIZE;
                        long j2 = i3;
                        this.o.f42084n = j + j2;
                        this.on = o0nVarOn;
                        this.f42085n = j;
                        this.o0 = o0nVarOn.f42090n;
                        this.oo = 8192 - i3;
                        this.om = Segment.SIZE;
                        return j2;
                    }
                    throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
                }
                throw new IllegalStateException("not attached to a buffer");
            }
            throw new IllegalArgumentException("minByteCount > Segment.SIZE: ".concat(String.valueOf(i2)));
        }
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final om o0(long j) {
        return new om(m0(j));
    }

    public final long m() {
        return this.f42084n;
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final n mm(int i2) {
        return mn((int) omo.o((short) i2));
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final boolean m(long j) {
        return this.f42084n >= j;
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: mm, reason: merged with bridge method [inline-methods] */
    public final n o0o(long j) {
        o0n o0nVarOn = on(8);
        byte[] bArr = o0nVarOn.f42090n;
        int i2 = o0nVarOn.oo;
        bArr[i2] = (byte) ((j >>> 56) & 255);
        bArr[i2 + 1] = (byte) ((j >>> 48) & 255);
        bArr[i2 + 2] = (byte) ((j >>> 40) & 255);
        bArr[i2 + 3] = (byte) ((j >>> 32) & 255);
        bArr[i2 + 4] = (byte) ((j >>> 24) & 255);
        bArr[i2 + 5] = (byte) ((j >>> 16) & 255);
        bArr[i2 + 6] = (byte) ((j >>> 8) & 255);
        bArr[i2 + 7] = (byte) (j & 255);
        o0nVarOn.oo = i2 + 8;
        this.f42084n += 8;
        return this;
    }

    private n m(OutputStream outputStream) throws IOException {
        long j = this.f42084n;
        if (outputStream != null) {
            omo.o(j, 0L, j);
            o0n o0nVar = this.m;
            while (j > 0) {
                int iMin = (int) Math.min(j, o0nVar.oo - o0nVar.o0);
                outputStream.write(o0nVar.f42090n, o0nVar.o0, iMin);
                int i2 = o0nVar.o0 + iMin;
                o0nVar.o0 = i2;
                long j2 = iMin;
                this.f42084n -= j2;
                j -= j2;
                if (i2 == o0nVar.oo) {
                    o0n o0nVarN = o0nVar.n();
                    this.m = o0nVarN;
                    oo0.o(o0nVar);
                    o0nVar = o0nVarN;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final o0n on(int i2) {
        if (i2 > 0 && i2 <= 8192) {
            o0n o0nVar = this.m;
            if (o0nVar == null) {
                o0n o0nVarO = oo0.o();
                this.m = o0nVarO;
                o0nVarO.mo = o0nVarO;
                o0nVarO.m0 = o0nVarO;
                return o0nVarO;
            }
            o0n o0nVar2 = o0nVar.mo;
            return (o0nVar2.oo + i2 > 8192 || !o0nVar2.on) ? o0nVar2.o(oo0.o()) : o0nVar2;
        }
        throw new IllegalArgumentException();
    }

    private n o(OutputStream outputStream, long j, long j2) throws IOException {
        if (outputStream != null) {
            long j3 = j2;
            omo.o(this.f42084n, 0L, j3);
            if (j3 != 0) {
                o0n o0nVar = this.m;
                while (true) {
                    int i2 = o0nVar.oo;
                    int i3 = o0nVar.o0;
                    if (j < i2 - i3) {
                        break;
                    }
                    j -= (long) (i2 - i3);
                    o0nVar = o0nVar.m0;
                }
                while (j3 > 0) {
                    int i4 = (int) (((long) o0nVar.o0) + j);
                    int iMin = (int) Math.min(o0nVar.oo - i4, j3);
                    outputStream.write(o0nVar.f42090n, i4, iMin);
                    j3 -= (long) iMin;
                    o0nVar = o0nVar.m0;
                    j = 0;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    private om oo(om omVar) {
        return o("HmacSHA1", omVar);
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final n o0(byte[] bArr) {
        if (bArr != null) {
            return n(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: mn, reason: merged with bridge method [inline-methods] */
    public final n o00(long j) {
        return o0o(omo.o(j));
    }

    private om on(om omVar) {
        return o("HmacSHA512", omVar);
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final n mn(int i2) {
        o0n o0nVarOn = on(2);
        byte[] bArr = o0nVarOn.f42090n;
        int i3 = o0nVarOn.oo;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 1] = (byte) (i2 & 255);
        o0nVarOn.oo = i3 + 2;
        this.f42084n += 2;
        return this;
    }

    private om nm(int i2) {
        if (i2 == 0) {
            return om.m;
        }
        return new ooo(this, i2);
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final n nn(long j) {
        boolean z2;
        if (j == 0) {
            return n0(48);
        }
        int i2 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return m("-9223372036854775808");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i2 = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i2 = 2;
                }
            } else if (j < 1000000) {
                i2 = j < 100000 ? 5 : 6;
            } else {
                i2 = j < 10000000 ? 7 : 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i2 = j < 1000000000 ? 9 : 10;
            } else {
                i2 = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else {
                i2 = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i2 = j < 10000000000000000L ? 16 : 17;
        } else {
            i2 = j < 1000000000000000000L ? 18 : 19;
        }
        if (z2) {
            i2++;
        }
        o0n o0nVarOn = on(i2);
        byte[] bArr = o0nVarOn.f42090n;
        int i3 = o0nVarOn.oo + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = o0[(int) (j % 10)];
            j /= 10;
        }
        if (z2) {
            bArr[i3 - 1] = 45;
        }
        o0nVarOn.oo += i2;
        this.f42084n += (long) i2;
        return this;
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: om, reason: merged with bridge method [inline-methods] */
    public final n m0(int i2) {
        return mo(omo.o(i2));
    }

    private om om(om omVar) {
        return o("HmacSHA256", omVar);
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: no, reason: merged with bridge method [inline-methods] */
    public final n nm(long j) {
        if (j == 0) {
            return n0(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        o0n o0nVarOn = on(iNumberOfTrailingZeros);
        byte[] bArr = o0nVarOn.f42090n;
        int i2 = o0nVarOn.oo;
        for (int i3 = (i2 + iNumberOfTrailingZeros) - 1; i3 >= i2; i3--) {
            bArr[i3] = o0[(int) (15 & j)];
            j >>>= 4;
        }
        o0nVarOn.oo += iNumberOfTrailingZeros;
        this.f42084n += (long) iNumberOfTrailingZeros;
        return this;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final void m(n nVar, long j) throws EOFException {
        long j2 = this.f42084n;
        if (j2 >= j) {
            nVar.o(this, j);
        } else {
            nVar.o(this, j2);
            throw new EOFException();
        }
    }

    public final n o(n nVar, long j, long j2) {
        if (nVar != null) {
            long j3 = j;
            omo.o(this.f42084n, j3, j2);
            if (j2 != 0) {
                nVar.f42084n += j2;
                o0n o0nVar = this.m;
                while (true) {
                    int i2 = o0nVar.oo;
                    int i3 = o0nVar.o0;
                    if (j3 < i2 - i3) {
                        break;
                    }
                    j3 -= (long) (i2 - i3);
                    o0nVar = o0nVar.m0;
                }
                o0n o0nVar2 = o0nVar;
                long j4 = j2;
                while (j4 > 0) {
                    o0n o0nVarO = o0nVar2.o();
                    int i4 = (int) (((long) o0nVarO.o0) + j3);
                    o0nVarO.o0 = i4;
                    o0nVarO.oo = Math.min(i4 + ((int) j4), o0nVarO.oo);
                    o0n o0nVar3 = nVar.m;
                    if (o0nVar3 == null) {
                        o0nVarO.mo = o0nVarO;
                        o0nVarO.m0 = o0nVarO;
                        nVar.m = o0nVarO;
                    } else {
                        o0nVar3.mo.o(o0nVarO);
                    }
                    j4 -= (long) (o0nVarO.oo - o0nVarO.o0);
                    o0nVar2 = o0nVar2.m0;
                    j3 = 0;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long n(om omVar) {
        return m(omVar, 0L);
    }

    private om n(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            o0n o0nVar = this.m;
            if (o0nVar != null) {
                byte[] bArr = o0nVar.f42090n;
                int i2 = o0nVar.o0;
                messageDigest.update(bArr, i2, o0nVar.oo - i2);
                o0n o0nVar2 = this.m;
                while (true) {
                    o0nVar2 = o0nVar2.m0;
                    if (o0nVar2 == this.m) {
                        break;
                    }
                    byte[] bArr2 = o0nVar2.f42090n;
                    int i3 = o0nVar2.o0;
                    messageDigest.update(bArr2, i3, o0nVar2.oo - i3);
                }
            }
            return om.o(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final void m(byte[] bArr) throws EOFException {
        int i2 = 0;
        while (i2 < bArr.length) {
            int iO = o(bArr, i2, bArr.length - i2);
            if (iO == -1) {
                throw new EOFException();
            }
            i2 += iO;
        }
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final n n(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            long j = i3;
            omo.o(bArr.length, i2, j);
            int i4 = i3 + i2;
            while (i2 < i4) {
                o0n o0nVarOn = on(1);
                int iMin = Math.min(i4 - i2, 8192 - o0nVarOn.oo);
                System.arraycopy(bArr, i2, o0nVarOn.f42090n, o0nVarOn.oo, iMin);
                i2 += iMin;
                o0nVarOn.oo += iMin;
            }
            this.f42084n += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    private n o(OutputStream outputStream, long j) throws IOException {
        if (outputStream != null) {
            omo.o(this.f42084n, 0L, j);
            o0n o0nVar = this.m;
            long j2 = j;
            while (j2 > 0) {
                int iMin = (int) Math.min(j2, o0nVar.oo - o0nVar.o0);
                outputStream.write(o0nVar.f42090n, o0nVar.o0, iMin);
                int i2 = o0nVar.o0 + iMin;
                o0nVar.o0 = i2;
                long j3 = iMin;
                this.f42084n -= j3;
                j2 -= j3;
                if (i2 == o0nVar.oo) {
                    o0n o0nVarN = o0nVar.n();
                    this.m = o0nVarN;
                    oo0.o(o0nVar);
                    o0nVar = o0nVarN;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final n n0(int i2) {
        o0n o0nVarOn = on(1);
        byte[] bArr = o0nVarOn.f42090n;
        int i3 = o0nVarOn.oo;
        o0nVarOn.oo = i3 + 1;
        bArr[i3] = (byte) i2;
        this.f42084n++;
        return this;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long m(om omVar) {
        return o(omVar, 0L);
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long m(om omVar, long j) {
        int i2;
        int i3;
        long j2 = 0;
        if (j >= 0) {
            o0n o0nVar = this.m;
            if (o0nVar == null) {
                return -1L;
            }
            long j3 = this.f42084n;
            if (j3 - j < j) {
                while (j3 > j) {
                    o0nVar = o0nVar.mo;
                    j3 -= (long) (o0nVar.oo - o0nVar.o0);
                }
            } else {
                while (true) {
                    long j4 = ((long) (o0nVar.oo - o0nVar.o0)) + j2;
                    if (j4 >= j) {
                        break;
                    }
                    o0nVar = o0nVar.m0;
                    j2 = j4;
                }
                j3 = j2;
            }
            if (omVar.mm() == 2) {
                byte bM = omVar.m(0);
                byte bM2 = omVar.m(1);
                while (j3 < this.f42084n) {
                    byte[] bArr = o0nVar.f42090n;
                    i2 = (int) ((((long) o0nVar.o0) + j) - j3);
                    int i4 = o0nVar.oo;
                    while (i2 < i4) {
                        byte b2 = bArr[i2];
                        if (b2 == bM || b2 == bM2) {
                            i3 = o0nVar.o0;
                            return ((long) (i2 - i3)) + j3;
                        }
                        i2++;
                    }
                    j3 += (long) (o0nVar.oo - o0nVar.o0);
                    o0nVar = o0nVar.m0;
                    j = j3;
                }
                return -1L;
            }
            byte[] bArrN0 = omVar.n0();
            while (j3 < this.f42084n) {
                byte[] bArr2 = o0nVar.f42090n;
                i2 = (int) ((((long) o0nVar.o0) + j) - j3);
                int i5 = o0nVar.oo;
                while (i2 < i5) {
                    byte b3 = bArr2[i2];
                    for (byte b4 : bArrN0) {
                        if (b3 == b4) {
                            i3 = o0nVar.o0;
                            return ((long) (i2 - i3)) + j3;
                        }
                    }
                    i2++;
                }
                j3 += (long) (o0nVar.oo - o0nVar.o0);
                o0nVar = o0nVar.m0;
                j = j3;
            }
            return -1L;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    private n o(InputStream inputStream) throws IOException {
        o(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    private n o(InputStream inputStream, long j) throws IOException {
        if (j >= 0) {
            o(inputStream, j, false);
            return this;
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
    }

    private void o(InputStream inputStream, long j, boolean z2) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        while (true) {
            if (j <= 0 && !z2) {
                return;
            }
            o0n o0nVarOn = on(1);
            int i2 = inputStream.read(o0nVarOn.f42090n, o0nVarOn.oo, (int) Math.min(j, 8192 - o0nVarOn.oo));
            if (i2 == -1) {
                if (!z2) {
                    throw new EOFException();
                }
                return;
            } else {
                o0nVarOn.oo += i2;
                long j2 = i2;
                this.f42084n += j2;
                j -= j2;
            }
        }
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final int o(nn nnVar) {
        int iO = o(nnVar, false);
        if (iO == -1) {
            return -1;
        }
        try {
            mo(nnVar.o[iO].mm());
            return iO;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009a A[LOOP:0: B:9:0x0020->B:46:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0099 A[SYNTHETIC] */
    public final int o(nn nnVar, boolean z2) {
        int i2;
        int i3;
        int i4;
        o0n o0nVar;
        int i5;
        int i6;
        o0n o0nVar2 = this.m;
        int i7 = -2;
        if (o0nVar2 == null) {
            if (z2) {
                return -2;
            }
            return nnVar.indexOf(om.m);
        }
        byte[] bArr = o0nVar2.f42090n;
        int i8 = o0nVar2.o0;
        int i9 = o0nVar2.oo;
        int[] iArr = nnVar.m;
        o0n o0nVar3 = o0nVar2;
        int i10 = 0;
        int i11 = -1;
        loop0: while (true) {
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            int i14 = i10 + 2;
            int i15 = iArr[i12];
            if (i15 != -1) {
                i11 = i15;
            }
            if (o0nVar3 == null) {
                break;
            }
            if (i13 >= 0) {
                int i16 = i8 + 1;
                int i17 = bArr[i8] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i18 = i14 + i13;
                while (i14 != i18) {
                    i2 = i7;
                    if (i17 == iArr[i14]) {
                        i3 = iArr[i14 + i13];
                        if (i16 == i9) {
                            o0nVar3 = o0nVar3.m0;
                            i4 = o0nVar3.o0;
                            bArr = o0nVar3.f42090n;
                            i9 = o0nVar3.oo;
                            if (o0nVar3 == o0nVar2) {
                                o0nVar3 = null;
                            }
                        } else {
                            i4 = i16;
                        }
                        if (i3 >= 0) {
                            return i3;
                        }
                        i10 = -i3;
                        i8 = i4;
                        i7 = i2;
                    } else {
                        i14++;
                        i7 = i2;
                    }
                }
            }
            int i19 = (i13 * (-1)) + i14;
            while (true) {
                int i20 = i8 + 1;
                int i21 = i14 + 1;
                if ((bArr[i8] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == iArr[i14]) {
                    boolean z3 = i21 == i19;
                    if (i20 == i9) {
                        o0n o0nVar4 = o0nVar3.m0;
                        i6 = o0nVar4.o0;
                        byte[] bArr2 = o0nVar4.f42090n;
                        i5 = o0nVar4.oo;
                        if (o0nVar4 != o0nVar2) {
                            o0nVar = o0nVar4;
                            bArr = bArr2;
                        } else {
                            if (!z3) {
                                break loop0;
                            }
                            bArr = bArr2;
                            o0nVar = null;
                        }
                    } else {
                        o0nVar = o0nVar3;
                        i5 = i9;
                        i6 = i20;
                    }
                    if (z3) {
                        i3 = iArr[i21];
                        i2 = i7;
                        i4 = i6;
                        i9 = i5;
                        o0nVar3 = o0nVar;
                        break;
                    }
                    i8 = i6;
                    i9 = i5;
                    o0nVar3 = o0nVar;
                    i14 = i21;
                }
            }
            if (i3 >= 0) {
                return i3;
            }
            i10 = -i3;
            i8 = i4;
            i7 = i2;
        }
        return z2 ? i7 : i11;
    }

    private o m(o oVar) {
        if (oVar.o == null) {
            oVar.o = this;
            oVar.m = false;
            return oVar;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long o(oom oomVar) {
        long j = this.f42084n;
        if (j > 0) {
            oomVar.o(this, j);
        }
        return j;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final String o(Charset charset) {
        try {
            return o(this.f42084n, charset);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final String o(long j, Charset charset) {
        omo.o(this.f42084n, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return "";
        }
        o0n o0nVar = this.m;
        int i2 = o0nVar.o0;
        if (((long) i2) + j > o0nVar.oo) {
            return new String(m0(j), charset);
        }
        String str = new String(o0nVar.f42090n, i2, (int) j, charset);
        int i3 = (int) (((long) o0nVar.o0) + j);
        o0nVar.o0 = i3;
        this.f42084n -= j;
        if (i3 == o0nVar.oo) {
            this.m = o0nVar.n();
            oo0.o(o0nVar);
        }
        return str;
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final int o(byte[] bArr) {
        return o(bArr, 0, bArr.length);
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final int o(byte[] bArr, int i2, int i3) {
        omo.o(bArr.length, i2, i3);
        o0n o0nVar = this.m;
        if (o0nVar == null) {
            return -1;
        }
        int iMin = Math.min(i3, o0nVar.oo - o0nVar.o0);
        System.arraycopy(o0nVar.f42090n, o0nVar.o0, bArr, i2, iMin);
        int i4 = o0nVar.o0 + iMin;
        o0nVar.o0 = i4;
        this.f42084n -= (long) iMin;
        if (i4 == o0nVar.oo) {
            this.m = o0nVar.n();
            oo0.o(o0nVar);
        }
        return iMin;
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final n o0(om omVar) {
        if (omVar != null) {
            omVar.o(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final n m(String str) {
        return m(str, 0, str.length());
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final n m(String str, int i2, int i3) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i2)));
        }
        if (i3 >= i2) {
            if (i3 > str.length()) {
                StringBuilder sbU = android.support.v4.media.a.u(i3, "endIndex > string.length: ", " > ");
                sbU.append(str.length());
                throw new IllegalArgumentException(sbU.toString());
            }
            while (i2 < i3) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 < 128) {
                    o0n o0nVarOn = on(1);
                    byte[] bArr = o0nVarOn.f42090n;
                    int i4 = o0nVarOn.oo - i2;
                    int iMin = Math.min(i3, 8192 - i4);
                    int i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) cCharAt2;
                    while (true) {
                        i2 = i5;
                        if (i2 >= iMin || (cCharAt = str.charAt(i2)) >= 128) {
                            break;
                        }
                        i5 = i2 + 1;
                        bArr[i2 + i4] = (byte) cCharAt;
                    }
                    int i6 = o0nVarOn.oo;
                    int i7 = (i4 + i2) - i6;
                    o0nVarOn.oo = i6 + i7;
                    this.f42084n += (long) i7;
                } else {
                    if (cCharAt2 < 2048) {
                        n0((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        n0((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i8 = i2 + 1;
                        char cCharAt3 = i8 < i3 ? str.charAt(i8) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i9 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            n0((i9 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            n0(((i9 >> 12) & 63) | 128);
                            n0(((i9 >> 6) & 63) | 128);
                            n0((i9 & 63) | 128);
                            i2 += 2;
                        } else {
                            n0(63);
                            i2 = i8;
                        }
                    } else {
                        n0((cCharAt2 >> '\f') | 224);
                        n0(((cCharAt2 >> 6) & 63) | 128);
                        n0((cCharAt2 & '?') | 128);
                    }
                    i2++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.g(i3, i2, "endIndex < beginIndex: ", " < "));
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final n no(int i2) {
        if (i2 < 128) {
            n0(i2);
            return this;
        }
        if (i2 < 2048) {
            n0((i2 >> 6) | PsExtractor.AUDIO_STREAM);
            n0((i2 & 63) | 128);
            return this;
        }
        if (i2 >= 65536) {
            if (i2 <= 1114111) {
                n0((i2 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                n0(((i2 >> 12) & 63) | 128);
                n0(((i2 >> 6) & 63) | 128);
                n0((i2 & 63) | 128);
                return this;
            }
            throw new IllegalArgumentException(a.h(i2, new StringBuilder("Unexpected code point: ")));
        }
        if (i2 >= 55296 && i2 <= 57343) {
            n0(63);
            return this;
        }
        n0((i2 >> 12) | 224);
        n0(((i2 >> 6) & 63) | 128);
        n0((i2 & 63) | 128);
        return this;
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final n m(String str, Charset charset) {
        return m(str, 0, str.length(), charset);
    }

    @Override // com.thinkup.core.common.no.n.o0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final n m(String str, int i2, int i3, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i2 < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i2)));
        }
        if (i3 >= i2) {
            if (i3 > str.length()) {
                StringBuilder sbU = android.support.v4.media.a.u(i3, "endIndex > string.length: ", " > ");
                sbU.append(str.length());
                throw new IllegalArgumentException(sbU.toString());
            }
            if (charset != null) {
                if (charset.equals(omo.o)) {
                    return m(str, i2, i3);
                }
                byte[] bytes = str.substring(i2, i3).getBytes(charset);
                return n(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(android.support.v4.media.a.g(i3, i2, "endIndex < beginIndex: ", " < "));
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final long o(oon oonVar) {
        if (oonVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long jA_ = oonVar.a_(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (jA_ == -1) {
                return j;
            }
            j += jA_;
        }
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 o(oon oonVar, long j) throws EOFException {
        while (j > 0) {
            long jA_ = oonVar.a_(this, j);
            if (jA_ == -1) {
                throw new EOFException();
            }
            j -= jA_;
        }
        return this;
    }

    @Override // com.thinkup.core.common.no.n.oom
    public final void o(n nVar, long j) {
        if (nVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (nVar != this) {
            omo.o(nVar.f42084n, 0L, j);
            while (j > 0) {
                o0n o0nVar = nVar.m;
                if (j < o0nVar.oo - o0nVar.o0) {
                    o0n o0nVar2 = this.m;
                    o0n o0nVar3 = o0nVar2 != null ? o0nVar2.mo : null;
                    if (o0nVar3 != null && o0nVar3.on) {
                        if ((((long) o0nVar3.oo) + j) - ((long) (o0nVar3.om ? 0 : o0nVar3.o0)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            o0nVar.o(o0nVar3, (int) j);
                            nVar.f42084n -= j;
                            this.f42084n += j;
                            return;
                        }
                    }
                    nVar.m = o0nVar.o((int) j);
                }
                o0n o0nVar4 = nVar.m;
                long j2 = o0nVar4.oo - o0nVar4.o0;
                nVar.m = o0nVar4.n();
                o0n o0nVar5 = this.m;
                if (o0nVar5 == null) {
                    this.m = o0nVar4;
                    o0nVar4.mo = o0nVar4;
                    o0nVar4.m0 = o0nVar4;
                } else {
                    o0nVar5.mo.o(o0nVar4).o0();
                }
                nVar.f42084n -= j2;
                this.f42084n += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
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
        o0n o0nVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (j3 >= 0 && j4 >= j3) {
            long j6 = this.f42084n;
            if (j4 > j6) {
                j4 = j6;
            }
            if (j3 == j4 || (o0nVar = this.m) == null) {
                return -1L;
            }
            if (j6 - j3 < j3) {
                while (j6 > j3) {
                    o0nVar = o0nVar.mo;
                    j6 -= (long) (o0nVar.oo - o0nVar.o0);
                }
            } else {
                while (true) {
                    long j7 = ((long) (o0nVar.oo - o0nVar.o0)) + j5;
                    if (j7 >= j3) {
                        break;
                    }
                    o0nVar = o0nVar.m0;
                    j5 = j7;
                }
                j6 = j5;
            }
            while (j6 < j4) {
                byte[] bArr = o0nVar.f42090n;
                int iMin = (int) Math.min(o0nVar.oo, (((long) o0nVar.o0) + j4) - j6);
                for (int i2 = (int) ((((long) o0nVar.o0) + j3) - j6); i2 < iMin; i2++) {
                    if (bArr[i2] == b2) {
                        return ((long) (i2 - o0nVar.o0)) + j6;
                    }
                }
                j6 += (long) (o0nVar.oo - o0nVar.o0);
                o0nVar = o0nVar.m0;
                j3 = j6;
            }
            return -1L;
        }
        StringBuilder sbV = android.support.v4.media.a.v(this.f42084n, "size=", " fromIndex=");
        sbV.append(j3);
        throw new IllegalArgumentException(androidx.media3.extractor.text.ttml.a.k(j4, " toIndex=", sbV));
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final long o(om omVar, long j) {
        if (omVar.mm() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j2 = 0;
        if (j >= 0) {
            o0n o0nVar = this.m;
            long j3 = -1;
            if (o0nVar == null) {
                return -1L;
            }
            long j4 = this.f42084n;
            if (j4 - j < j) {
                while (j4 > j) {
                    o0nVar = o0nVar.mo;
                    j4 -= (long) (o0nVar.oo - o0nVar.o0);
                }
            } else {
                while (true) {
                    long j5 = ((long) (o0nVar.oo - o0nVar.o0)) + j2;
                    if (j5 >= j) {
                        break;
                    }
                    o0nVar = o0nVar.m0;
                    j2 = j5;
                }
                j4 = j2;
            }
            byte bM = omVar.m(0);
            int iMm = omVar.mm();
            long j6 = (this.f42084n - ((long) iMm)) + 1;
            long j7 = j4;
            long j8 = j;
            while (j7 < j6) {
                byte[] bArr = o0nVar.f42090n;
                long j9 = j3;
                int iMin = (int) Math.min(o0nVar.oo, (((long) o0nVar.o0) + j6) - j7);
                for (int i2 = (int) ((((long) o0nVar.o0) + j8) - j7); i2 < iMin; i2++) {
                    if (bArr[i2] == bM && o(o0nVar, i2 + 1, omVar, iMm)) {
                        return ((long) (i2 - o0nVar.o0)) + j7;
                    }
                }
                j7 += (long) (o0nVar.oo - o0nVar.o0);
                o0nVar = o0nVar.m0;
                j8 = j7;
                j3 = j9;
            }
            return j3;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final boolean o(long j, om omVar) {
        return o(j, omVar, omVar.mm());
    }

    @Override // com.thinkup.core.common.no.n.oo
    public final boolean o(long j, om omVar, int i2) {
        if (j < 0 || i2 < 0 || this.f42084n - j < i2 || omVar.mm() < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (n(((long) i3) + j) != omVar.m(i3)) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(o0n o0nVar, int i2, om omVar, int i3) {
        int i4 = o0nVar.oo;
        byte[] bArr = o0nVar.f42090n;
        for (int i5 = 1; i5 < i3; i5++) {
            if (i2 == i4) {
                o0nVar = o0nVar.m0;
                bArr = o0nVar.f42090n;
                i2 = o0nVar.o0;
                i4 = o0nVar.oo;
            }
            if (bArr[i2] != omVar.m(i5)) {
                return false;
            }
            i2++;
        }
        return true;
    }

    @Override // com.thinkup.core.common.no.n.oom
    public final om0 o() {
        return om0.f42093n;
    }

    private om o(String str, om omVar) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(omVar.mn(), str));
            o0n o0nVar = this.m;
            if (o0nVar != null) {
                byte[] bArr = o0nVar.f42090n;
                int i2 = o0nVar.o0;
                mac.update(bArr, i2, o0nVar.oo - i2);
                o0n o0nVar2 = this.m;
                while (true) {
                    o0nVar2 = o0nVar2.m0;
                    if (o0nVar2 == this.m) {
                        break;
                    }
                    byte[] bArr2 = o0nVar2.f42090n;
                    int i3 = o0nVar2.o0;
                    mac.update(bArr2, i3, o0nVar2.oo - i3);
                }
            }
            return om.o(mac.doFinal());
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public final o o(o oVar) {
        if (oVar.o == null) {
            oVar.o = this;
            oVar.m = true;
            return oVar;
        }
        throw new IllegalStateException("already attached to a buffer");
    }
}

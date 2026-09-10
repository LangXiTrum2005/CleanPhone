package y1;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.gms.internal.ads.ht0;
import com.google.android.gms.internal.ads.qx1;
import com.google.android.gms.internal.ads.xx1;
import com.google.android.gms.internal.consent_sdk.x;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import f2.c1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import l1.y;
import m0.s1;
import oa.e2;
import oa.u0;
import oa.u1;
import r1.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends p1.a {
    public static final byte[] D0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final MediaCodec.BufferInfo A;
    public p1.b A0;
    public final ArrayDeque B;
    public p1.b B0;
    public final d0 C;
    public u0 C0;
    public final AtomicInteger D;
    public i1.p E;
    public i1.p F;
    public na.g G;
    public na.g H;
    public p1.d0 I;
    public MediaCrypto J;
    public final long K;
    public float L;
    public float M;
    public j N;
    public i1.p O;
    public MediaFormat P;
    public boolean Q;
    public float R;
    public ArrayDeque S;
    public n T;
    public m U;
    public boolean V;
    public boolean W;
    public boolean X;
    public long Y;
    public long Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f54148a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f54149b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ByteBuffer f54150c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f54151d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f54152e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f54153f0;
    public boolean g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f54154h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f54155i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f54156j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f54157k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f54158l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f54159m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public long f54160n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f54161o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f54162p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f54163q0;
    public boolean r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f54164s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public p1.h f54165s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f54166t;
    public xx1 t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g f54167u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public o f54168u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f54169v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f54170v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o1.d f54171w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f54172w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o1.d f54173x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f54174x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o1.d f54175y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f54176y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e f54177z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public long f54178z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, int i10, i iVar, float f10) {
        super(i10);
        g gVar = g.f54122b;
        this.f54164s = context.getApplicationContext();
        this.f54166t = iVar;
        this.f54167u = gVar;
        this.f54169v = f10;
        this.D = new AtomicInteger();
        this.f54171w = new o1.d(0);
        this.f54173x = new o1.d(0);
        this.f54175y = new o1.d(2);
        e eVar = new e(2);
        eVar.l = 32;
        this.f54177z = eVar;
        this.A = new MediaCodec.BufferInfo();
        this.L = 1.0f;
        this.M = 1.0f;
        this.K = C.TIME_UNSET;
        this.B = new ArrayDeque();
        this.f54168u0 = o.f54142f;
        eVar.i(0);
        eVar.f47035e.order(ByteOrder.nativeOrder());
        d0 d0Var = new d0();
        d0Var.f49264a = j1.k.f43603a;
        d0Var.f49266c = 0;
        d0Var.f49265b = 2;
        this.C = d0Var;
        this.R = -1.0f;
        this.f54155i0 = 0;
        this.f54148a0 = -1;
        this.f54149b0 = -1;
        this.Z = C.TIME_UNSET;
        this.f54160n0 = C.TIME_UNSET;
        this.f54170v0 = C.TIME_UNSET;
        this.Y = C.TIME_UNSET;
        this.f54156j0 = 0;
        this.f54157k0 = 0;
        this.t0 = new xx1(1);
        this.f54176y0 = false;
        this.f54178z0 = 0L;
        int i11 = u0.f47325c;
        this.C0 = u1.f47328j;
        p1.b bVar = p1.b.f47926b;
        this.A0 = bVar;
        this.B0 = bVar;
    }

    @Override // p1.a
    public final int A(i1.p pVar) throws p1.h {
        try {
            return w0(this.f54167u, pVar);
        } catch (s e10) {
            throw d(e10, pVar, false, 4002);
        }
    }

    @Override // p1.a
    public final int B() {
        return 8;
    }

    public final void D(MediaFormat mediaFormat) {
        for (Map.Entry entry : this.A0.f47927a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(str, null);
            } else if (value instanceof Integer) {
                mediaFormat.setInteger(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                mediaFormat.setLong(str, ((Long) value).longValue());
            } else if (value instanceof Float) {
                mediaFormat.setFloat(str, ((Float) value).floatValue());
            } else if (value instanceof String) {
                mediaFormat.setString(str, (String) value);
            } else if (value instanceof ByteBuffer) {
                mediaFormat.setByteBuffer(str, (ByteBuffer) value);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x030b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0313 A[LOOP:0: B:25:0x0090->B:117:0x0313, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [p1.a, y1.p] */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v22, types: [int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.util.List] */
    public final boolean E(long j10, long j11) {
        e eVar;
        ?? r10;
        ?? r28;
        go.k.t(!this.f54162p0);
        e eVar2 = this.f54177z;
        if (eVar2.l()) {
            ByteBuffer byteBuffer = eVar2.f47035e;
            int i10 = this.f54149b0;
            int i11 = eVar2.f54119k;
            long j12 = eVar2.f47037g;
            boolean zT = T(this.l, eVar2.f54118j);
            boolean zC = eVar2.c(4);
            i1.p pVar = this.F;
            pVar.getClass();
            eVar = eVar2;
            if (i0(j10, j11, null, byteBuffer, i10, 0, i11, j12, zT, zC, pVar)) {
                e0(eVar.f54118j);
                eVar.g();
            }
        }
        eVar = eVar2;
        if (this.f54161o0) {
            this.f54162p0 = true;
            return false;
        }
        ?? r2 = 0;
        boolean z10 = this.f54153f0;
        o1.d dVar = this.f54175y;
        if (z10) {
            go.k.t(eVar.k(dVar));
            this.f54153f0 = false;
        }
        if (this.g0) {
            if (eVar.l()) {
                return true;
            }
            this.f54152e0 = false;
            m0();
            this.g0 = false;
            U();
            if (!this.f54152e0) {
                return false;
            }
        }
        go.k.t(!this.f54161o0);
        s1 s1Var = this.f47907c;
        s1Var.c();
        dVar.g();
        while (true) {
            dVar.g();
            int iV = v(s1Var, dVar, r2);
            if (iV == -5) {
                b0(s1Var);
            } else if (iV != -4) {
                if (iV != -3) {
                    throw new IllegalStateException();
                }
                if (i()) {
                    P().f54147e = this.f54160n0;
                }
            } else if (dVar.c(4)) {
                this.f54161o0 = true;
                P().f54147e = this.f54160n0;
            } else {
                this.f54160n0 = Math.max(this.f54160n0, dVar.f47037g);
                if (i() || this.f54173x.c(536870912)) {
                    P().f54147e = this.f54160n0;
                }
                byte[] bArr = null;
                if (this.f54163q0) {
                    i1.p pVar2 = this.E;
                    pVar2.getClass();
                    this.F = pVar2;
                    if (Objects.equals(pVar2.f42643n, MimeTypes.AUDIO_OPUS) && !this.F.f42646q.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.F.f42646q.get(r2);
                        int i12 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        i1.o oVarA = this.F.a();
                        oVarA.H = i12;
                        this.F = new i1.p(oVarA);
                    }
                    c0(this.F, null);
                    this.f54163q0 = r2;
                }
                dVar.j();
                i1.p pVar3 = this.F;
                if (pVar3 != null && Objects.equals(pVar3.f42643n, MimeTypes.AUDIO_OPUS)) {
                    if (dVar.c(268435456)) {
                        dVar.f47033c = this.F;
                        R(dVar);
                    }
                    if (this.l - dVar.f47037g <= 80000) {
                        ?? r11 = this.F.f42646q;
                        d0 d0Var = this.C;
                        d0Var.getClass();
                        dVar.f47035e.getClass();
                        if (dVar.f47035e.limit() - dVar.f47035e.position() != 0) {
                            if (d0Var.f49265b == 2 && (r11.size() == 1 || r11.size() == 3)) {
                                bArr = (byte[]) r11.get(r2);
                            }
                            ByteBuffer byteBuffer2 = dVar.f47035e;
                            int iPosition = byteBuffer2.position();
                            int iLimit = byteBuffer2.limit();
                            int i13 = iLimit - iPosition;
                            int i14 = (i13 + 255) / 255;
                            int i15 = i14 + 27 + i13;
                            if (d0Var.f49265b == 2) {
                                int length = bArr != null ? bArr.length + 28 : 47;
                                i15 = (length == true ? 1 : 0) + 44 + i15;
                                r10 = length;
                            } else {
                                r10 = r2;
                            }
                            if (d0Var.f49264a.capacity() < i15) {
                                d0Var.f49264a = ByteBuffer.allocate(i15).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                d0Var.f49264a.clear();
                            }
                            ByteBuffer byteBuffer3 = d0Var.f49264a;
                            if (d0Var.f49265b == 2) {
                                if (bArr != null) {
                                    d0.a(byteBuffer3, 0L, 0, 1, true);
                                    byteBuffer3.put(com.google.android.gms.internal.auth.i.c(bArr.length));
                                    byteBuffer3.put(bArr);
                                    byteBuffer3.putInt(22, y.p(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    byteBuffer3.put(d0.f49262d);
                                }
                                byteBuffer3.put(d0.f49263e);
                                r28 = r10;
                            } else {
                                r28 = r10 == true ? 1 : 0;
                                iLimit = iLimit;
                            }
                            int iO = d0Var.f49266c + ((int) ((n2.b.o(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            d0Var.f49266c = iO;
                            d0.a(byteBuffer3, iO, d0Var.f49265b, i14, false);
                            for (int i16 = 0; i16 < i14; i16++) {
                                if (i13 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i13 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i13);
                                    i13 = 0;
                                }
                            }
                            int i17 = iLimit;
                            while (iPosition < i17) {
                                byteBuffer3.put(byteBuffer2.get(iPosition));
                                iPosition++;
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (d0Var.f49265b == 2) {
                                byteBuffer3.putInt(r28 + 66, y.p(byteBuffer3.arrayOffset() + r28 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            } else {
                                byteBuffer3.putInt(22, y.p(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            }
                            d0Var.f49265b++;
                            d0Var.f49264a = byteBuffer3;
                            dVar.g();
                            dVar.i(d0Var.f49264a.remaining());
                            dVar.f47035e.put(d0Var.f49264a);
                            dVar.j();
                        }
                    }
                }
                if (eVar.l()) {
                    long j13 = this.l;
                    if (T(j13, eVar.f54118j) == T(j13, dVar.f47037g)) {
                        if (!eVar.k(dVar)) {
                            r2 = 0;
                        }
                    }
                } else if (!eVar.k(dVar)) {
                    r2 = 0;
                }
                this.f54153f0 = true;
            }
            if (eVar.l()) {
                eVar.j();
            }
            return eVar.l() || this.f54161o0 || this.g0;
        }
    }

    public abstract p1.c F(m mVar, i1.p pVar, i1.p pVar2);

    public l G(IllegalStateException illegalStateException, m mVar) {
        return new l(illegalStateException, mVar);
    }

    public final boolean H(long j10, long j11) throws p1.h {
        j jVar = this.N;
        jVar.getClass();
        int i10 = this.f54149b0;
        MediaCodec.BufferInfo bufferInfo = this.A;
        if (i10 < 0) {
            int iX = jVar.x(bufferInfo);
            if (iX < 0) {
                if (iX != -2) {
                    if (this.X && (this.f54161o0 || this.f54156j0 == 2)) {
                        h0();
                    }
                    long j12 = this.Y;
                    if (j12 != C.TIME_UNSET) {
                        long j13 = j12 + 100;
                        this.f47911g.getClass();
                        if (j13 < System.currentTimeMillis()) {
                            h0();
                            return false;
                        }
                    }
                    return false;
                }
                j jVar2 = this.N;
                jVar2.getClass();
                MediaFormat mediaFormatJ = jVar2.j();
                if (!this.C0.isEmpty()) {
                    u0<String> u0Var = this.C0;
                    p1.b bVar = p1.b.f47926b;
                    HashMap map = new HashMap();
                    for (String str : u0Var) {
                        if (mediaFormatJ.containsKey(str)) {
                            int valueTypeForKey = mediaFormatJ.getValueTypeForKey(str);
                            if (valueTypeForKey == 1) {
                                map.put(str, Integer.valueOf(mediaFormatJ.getInteger(str)));
                            } else if (valueTypeForKey == 2) {
                                map.put(str, Long.valueOf(mediaFormatJ.getLong(str)));
                            } else if (valueTypeForKey == 3) {
                                map.put(str, Float.valueOf(mediaFormatJ.getFloat(str)));
                            } else if (valueTypeForKey == 4) {
                                map.put(str, mediaFormatJ.getString(str));
                            } else if (valueTypeForKey == 5) {
                                ByteBuffer byteBuffer = mediaFormatJ.getByteBuffer(str);
                                if (byteBuffer == null) {
                                    map.put(str, null);
                                } else {
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
                                    byteBufferAllocate.put(byteBuffer.duplicate());
                                    byteBufferAllocate.flip();
                                    map.put(str, byteBufferAllocate);
                                }
                            }
                        }
                    }
                    p1.b bVar2 = new p1.b(map);
                    if (!bVar2.equals(this.B0)) {
                        this.B0 = bVar2;
                        Z(bVar2);
                    }
                }
                this.P = mediaFormatJ;
                this.Q = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.f54178z0;
            if (this.W) {
                this.W = false;
                jVar.t(iX);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                h0();
                return false;
            }
            this.f54149b0 = iX;
            ByteBuffer byteBufferA = jVar.A(iX);
            this.f54150c0 = byteBufferA;
            if (byteBufferA != null) {
                byteBufferA.position(bufferInfo.offset);
                this.f54150c0.limit(bufferInfo.offset + bufferInfo.size);
            }
            z0(bufferInfo.presentationTimeUs);
        }
        boolean z10 = this.f54176y0 || bufferInfo.presentationTimeUs < this.l;
        long j14 = this.f54168u0.f54147e;
        boolean z11 = j14 != C.TIME_UNSET && j14 <= bufferInfo.presentationTimeUs;
        this.f54151d0 = z11;
        ByteBuffer byteBuffer2 = this.f54150c0;
        int i11 = this.f54149b0;
        int i12 = bufferInfo.flags;
        long j15 = bufferInfo.presentationTimeUs;
        i1.p pVar = this.F;
        pVar.getClass();
        if (!i0(j10, j11, jVar, byteBuffer2, i11, i12, 1, j15, z10, z11, pVar)) {
            return false;
        }
        e0(bufferInfo.presentationTimeUs);
        boolean z12 = (bufferInfo.flags & 4) != 0;
        if (!z12 && this.f54159m0 && this.f54151d0) {
            this.f47911g.getClass();
            this.Y = System.currentTimeMillis();
        }
        this.f54149b0 = -1;
        this.f54150c0 = null;
        if (!z12) {
            return true;
        }
        h0();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:112:0x0091 A[EDGE_INSN: B:112:0x0091->B:33:0x0091 BREAK  A[LOOP:0: B:30:0x006f->B:32:0x007c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[LOOP:0: B:30:0x006f->B:32:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:76:0x012f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0133  */
    /* JADX WARN: Code duplicated, block: B:79:0x0137  */
    /* JADX WARN: Code duplicated, block: B:81:0x013b  */
    /* JADX WARN: Code duplicated, block: B:85:0x014e  */
    /* JADX WARN: Code duplicated, block: B:88:0x016c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0174  */
    /* JADX WARN: Code duplicated, block: B:93:0x0187  */
    /* JADX WARN: Code duplicated, block: B:96:0x018e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0194  */
    public final boolean I() throws p1.h {
        int iPosition;
        s1 s1Var;
        int i10;
        long j10;
        boolean zC;
        int iL;
        long j11;
        long j12;
        qx1 qx1Var;
        int i11;
        i1.p pVar;
        j jVar = this.N;
        if (jVar != null && this.f54156j0 != 2 && !this.f54161o0) {
            int i12 = this.f54148a0;
            o1.d dVar = this.f54173x;
            if (i12 < 0) {
                int iW = jVar.w();
                this.f54148a0 = iW;
                if (iW >= 0) {
                    dVar.f47035e = jVar.q(iW);
                    dVar.g();
                    if (this.f54156j0 == 1) {
                        if (!this.X) {
                            this.f54159m0 = true;
                            jVar.d(this.f54148a0, 0, 4, 0L);
                            this.f54148a0 = -1;
                            dVar.f47035e = null;
                        }
                        this.f54156j0 = 2;
                        return false;
                    }
                    if (this.V) {
                        this.V = false;
                        ByteBuffer byteBuffer = dVar.f47035e;
                        byteBuffer.getClass();
                        byteBuffer.put(D0);
                        jVar.d(this.f54148a0, 38, 0, 0L);
                        this.f54148a0 = -1;
                        dVar.f47035e = null;
                        this.f54158l0 = true;
                        return true;
                    }
                    if (this.f54155i0 == 1) {
                        i11 = 0;
                        while (true) {
                            pVar = this.O;
                            pVar.getClass();
                            if (i11 < pVar.f42646q.size()) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.O.f42646q.get(i11);
                            ByteBuffer byteBuffer2 = dVar.f47035e;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i11++;
                        }
                        this.f54155i0 = 2;
                    }
                    ByteBuffer byteBuffer3 = dVar.f47035e;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    s1Var = this.f47907c;
                    s1Var.c();
                    try {
                        jVar.k(new w1.b(4, this, s1Var));
                        i10 = this.D.get();
                        if (i10 == -3) {
                            if (i()) {
                                P().f54147e = this.f54160n0;
                                return false;
                            }
                        } else {
                            if (i10 == -5) {
                                if (this.f54155i0 == 2) {
                                    dVar.g();
                                    this.f54155i0 = 1;
                                }
                                b0(s1Var);
                                return true;
                            }
                            if (dVar.c(4)) {
                                if (!this.f54158l0 || dVar.c(1)) {
                                    j10 = dVar.f47037g;
                                    if (!r0(dVar)) {
                                        zC = dVar.c(1073741824);
                                        if (zC) {
                                            qx1Var = dVar.f47034d;
                                            if (iPosition == 0) {
                                                qx1Var.getClass();
                                            } else {
                                                if (qx1Var.f19233d == null) {
                                                    int[] iArr = new int[1];
                                                    qx1Var.f19233d = iArr;
                                                    qx1Var.f19238i.numBytesOfClearData = iArr;
                                                }
                                                int[] iArr2 = qx1Var.f19233d;
                                                iArr2[0] = iArr2[0] + iPosition;
                                            }
                                        }
                                        if (this.f54163q0) {
                                            ht0 ht0Var = P().f54146d;
                                            i1.p pVar2 = this.E;
                                            pVar2.getClass();
                                            ht0Var.a(j10, pVar2);
                                            this.f54163q0 = false;
                                        }
                                        this.f54160n0 = Math.max(this.f54160n0, j10);
                                        if (i() || dVar.c(536870912)) {
                                            P().f54147e = this.f54160n0;
                                        }
                                        dVar.j();
                                        if (dVar.c(268435456)) {
                                            R(dVar);
                                        }
                                        if (this.f54176y0) {
                                            j12 = this.f54160n0;
                                            if (j10 <= j12) {
                                                this.f54178z0 = (j12 - j10) + 1 + this.f54178z0;
                                            }
                                            this.f54160n0 = j10;
                                            this.f54176y0 = false;
                                        }
                                        g0(dVar);
                                        iL = L(dVar);
                                        j11 = j10 + this.f54178z0;
                                        if (zC) {
                                            jVar.c(this.f54148a0, dVar.f47034d, j11, iL);
                                        } else {
                                            int i13 = this.f54148a0;
                                            ByteBuffer byteBuffer4 = dVar.f47035e;
                                            byteBuffer4.getClass();
                                            jVar.d(i13, byteBuffer4.limit(), iL, j11);
                                        }
                                        this.f54148a0 = -1;
                                        dVar.f47035e = null;
                                        this.f54158l0 = true;
                                        this.f54155i0 = 0;
                                        this.t0.f22025d++;
                                        return true;
                                    }
                                } else {
                                    dVar.g();
                                    if (this.f54155i0 == 2) {
                                        this.f54155i0 = 1;
                                        return true;
                                    }
                                }
                                return true;
                            }
                            P().f54147e = this.f54160n0;
                            if (this.f54155i0 == 2) {
                                dVar.g();
                                this.f54155i0 = 1;
                            }
                            this.f54161o0 = true;
                            if (!this.f54158l0) {
                                h0();
                                return false;
                            }
                            if (!this.X) {
                                this.f54159m0 = true;
                                jVar.d(this.f54148a0, 0, 4, 0L);
                                this.f54148a0 = -1;
                                dVar.f47035e = null;
                                return false;
                            }
                        }
                    } catch (o1.c e10) {
                        X(e10);
                        j0(0);
                        J();
                        return true;
                    }
                }
            } else {
                if (this.f54156j0 == 1) {
                    if (!this.X) {
                        this.f54159m0 = true;
                        jVar.d(this.f54148a0, 0, 4, 0L);
                        this.f54148a0 = -1;
                        dVar.f47035e = null;
                    }
                    this.f54156j0 = 2;
                    return false;
                }
                if (this.V) {
                    this.V = false;
                    ByteBuffer byteBuffer5 = dVar.f47035e;
                    byteBuffer5.getClass();
                    byteBuffer5.put(D0);
                    jVar.d(this.f54148a0, 38, 0, 0L);
                    this.f54148a0 = -1;
                    dVar.f47035e = null;
                    this.f54158l0 = true;
                    return true;
                }
                if (this.f54155i0 == 1) {
                    i11 = 0;
                    while (true) {
                        pVar = this.O;
                        pVar.getClass();
                        if (i11 < pVar.f42646q.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = (byte[]) this.O.f42646q.get(i11);
                        ByteBuffer byteBuffer6 = dVar.f47035e;
                        byteBuffer6.getClass();
                        byteBuffer6.put(bArr2);
                        i11++;
                    }
                    this.f54155i0 = 2;
                }
                ByteBuffer byteBuffer7 = dVar.f47035e;
                byteBuffer7.getClass();
                iPosition = byteBuffer7.position();
                s1Var = this.f47907c;
                s1Var.c();
                jVar.k(new w1.b(4, this, s1Var));
                i10 = this.D.get();
                if (i10 == -3) {
                    if (i()) {
                        P().f54147e = this.f54160n0;
                        return false;
                    }
                } else {
                    if (i10 == -5) {
                        if (this.f54155i0 == 2) {
                            dVar.g();
                            this.f54155i0 = 1;
                        }
                        b0(s1Var);
                        return true;
                    }
                    if (dVar.c(4)) {
                        if (this.f54158l0) {
                            j10 = dVar.f47037g;
                            if (!r0(dVar)) {
                                zC = dVar.c(1073741824);
                                if (zC) {
                                    qx1Var = dVar.f47034d;
                                    if (iPosition == 0) {
                                        qx1Var.getClass();
                                    } else {
                                        if (qx1Var.f19233d == null) {
                                            int[] iArr3 = new int[1];
                                            qx1Var.f19233d = iArr3;
                                            qx1Var.f19238i.numBytesOfClearData = iArr3;
                                        }
                                        int[] iArr4 = qx1Var.f19233d;
                                        iArr4[0] = iArr4[0] + iPosition;
                                    }
                                }
                                if (this.f54163q0) {
                                    ht0 ht0Var2 = P().f54146d;
                                    i1.p pVar3 = this.E;
                                    pVar3.getClass();
                                    ht0Var2.a(j10, pVar3);
                                    this.f54163q0 = false;
                                }
                                this.f54160n0 = Math.max(this.f54160n0, j10);
                                if (i()) {
                                    P().f54147e = this.f54160n0;
                                } else {
                                    P().f54147e = this.f54160n0;
                                }
                                dVar.j();
                                if (dVar.c(268435456)) {
                                    R(dVar);
                                }
                                if (this.f54176y0) {
                                    j12 = this.f54160n0;
                                    if (j10 <= j12) {
                                        this.f54178z0 = (j12 - j10) + 1 + this.f54178z0;
                                    }
                                    this.f54160n0 = j10;
                                    this.f54176y0 = false;
                                }
                                g0(dVar);
                                iL = L(dVar);
                                j11 = j10 + this.f54178z0;
                                if (zC) {
                                    jVar.c(this.f54148a0, dVar.f47034d, j11, iL);
                                } else {
                                    int i14 = this.f54148a0;
                                    ByteBuffer byteBuffer8 = dVar.f47035e;
                                    byteBuffer8.getClass();
                                    jVar.d(i14, byteBuffer8.limit(), iL, j11);
                                }
                                this.f54148a0 = -1;
                                dVar.f47035e = null;
                                this.f54158l0 = true;
                                this.f54155i0 = 0;
                                this.t0.f22025d++;
                                return true;
                            }
                        } else {
                            j10 = dVar.f47037g;
                            if (!r0(dVar)) {
                                zC = dVar.c(1073741824);
                                if (zC) {
                                    qx1Var = dVar.f47034d;
                                    if (iPosition == 0) {
                                        qx1Var.getClass();
                                    } else {
                                        if (qx1Var.f19233d == null) {
                                            int[] iArr5 = new int[1];
                                            qx1Var.f19233d = iArr5;
                                            qx1Var.f19238i.numBytesOfClearData = iArr5;
                                        }
                                        int[] iArr6 = qx1Var.f19233d;
                                        iArr6[0] = iArr6[0] + iPosition;
                                    }
                                }
                                if (this.f54163q0) {
                                    ht0 ht0Var3 = P().f54146d;
                                    i1.p pVar4 = this.E;
                                    pVar4.getClass();
                                    ht0Var3.a(j10, pVar4);
                                    this.f54163q0 = false;
                                }
                                this.f54160n0 = Math.max(this.f54160n0, j10);
                                if (i()) {
                                    P().f54147e = this.f54160n0;
                                } else {
                                    P().f54147e = this.f54160n0;
                                }
                                dVar.j();
                                if (dVar.c(268435456)) {
                                    R(dVar);
                                }
                                if (this.f54176y0) {
                                    j12 = this.f54160n0;
                                    if (j10 <= j12) {
                                        this.f54178z0 = (j12 - j10) + 1 + this.f54178z0;
                                    }
                                    this.f54160n0 = j10;
                                    this.f54176y0 = false;
                                }
                                g0(dVar);
                                iL = L(dVar);
                                j11 = j10 + this.f54178z0;
                                if (zC) {
                                    jVar.c(this.f54148a0, dVar.f47034d, j11, iL);
                                } else {
                                    int i15 = this.f54148a0;
                                    ByteBuffer byteBuffer9 = dVar.f47035e;
                                    byteBuffer9.getClass();
                                    jVar.d(i15, byteBuffer9.limit(), iL, j11);
                                }
                                this.f54148a0 = -1;
                                dVar.f47035e = null;
                                this.f54158l0 = true;
                                this.f54155i0 = 0;
                                this.t0.f22025d++;
                                return true;
                            }
                        }
                        return true;
                    }
                    P().f54147e = this.f54160n0;
                    if (this.f54155i0 == 2) {
                        dVar.g();
                        this.f54155i0 = 1;
                    }
                    this.f54161o0 = true;
                    if (!this.f54158l0) {
                        h0();
                        return false;
                    }
                    if (!this.X) {
                        this.f54159m0 = true;
                        jVar.d(this.f54148a0, 0, 4, 0L);
                        this.f54148a0 = -1;
                        dVar.f47035e = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void J() {
        try {
            j jVar = this.N;
            jVar.getClass();
            jVar.flush();
        } finally {
            n0();
        }
    }

    public final List K(boolean z10) {
        i1.p pVar = this.E;
        pVar.getClass();
        g gVar = this.f54167u;
        ArrayList arrayListN = N(gVar, pVar, z10);
        if (!arrayListN.isEmpty() || !z10) {
            return arrayListN;
        }
        ArrayList arrayListN2 = N(gVar, pVar, false);
        if (!arrayListN2.isEmpty()) {
            l1.a.s("MediaCodecRenderer", "Drm session requires secure decoder for " + pVar.f42643n + ", but no secure decoder available. Trying to proceed with " + arrayListN2 + ".");
        }
        return arrayListN2;
    }

    public int L(o1.d dVar) {
        return 0;
    }

    public abstract float M(float f10, i1.p pVar, i1.p[] pVarArr);

    public abstract ArrayList N(g gVar, i1.p pVar, boolean z10);

    public long O(long j10, long j11) {
        return super.f(j10, j11);
    }

    public final o P() {
        ArrayDeque arrayDeque = this.B;
        return !arrayDeque.isEmpty() ? (o) arrayDeque.getLast() : this.f54168u0;
    }

    public abstract x Q(m mVar, i1.p pVar, MediaCrypto mediaCrypto, float f10);

    public abstract void R(o1.d dVar);

    public final void S(m mVar, MediaCrypto mediaCrypto) {
        this.U = mVar;
        i1.p pVar = this.E;
        pVar.getClass();
        String str = mVar.f54127a;
        float f10 = this.M;
        i1.p[] pVarArr = this.f47914j;
        pVarArr.getClass();
        float fM = M(f10, pVar, pVarArr);
        if (fM <= this.f54169v) {
            fM = -1.0f;
        }
        this.f47911g.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        x xVarQ = Q(mVar, pVar, mediaCrypto, fM);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            q1.j jVar = this.f47910f;
            jVar.getClass();
            m0.i.c(xVarQ, jVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            j jVarD = this.f54166t.d(xVarQ);
            this.N = jVarD;
            jVarD.p(new qj.x(this, 24));
            Trace.endSection();
            this.f47911g.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!mVar.e(this.f54164s, pVar)) {
                String strC = i1.p.c(pVar);
                Locale locale = Locale.US;
                l1.a.s("MediaCodecRenderer", l1.d.h("Format exceeds selected codec's capabilities [", strC, ", ", str, X3.j.f27836e));
            }
            this.R = fM;
            this.O = pVar;
            this.X = "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && mVar.f54132f;
            this.N.getClass();
            if (this.f47912h == 2) {
                this.f47911g.getClass();
                this.Z = SystemClock.elapsedRealtime() + 1000;
            }
            this.t0.f22023b++;
            long j10 = jElapsedRealtime2 - jElapsedRealtime;
            if (i10 >= 31 && !this.C0.isEmpty()) {
                j jVar2 = this.N;
                jVar2.getClass();
                jVar2.B(new ArrayList(this.C0));
            }
            Y(str, jElapsedRealtime2, j10);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean T(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        i1.p pVar = this.F;
        return pVar == null || !Objects.equals(pVar.f42643n, MimeTypes.AUDIO_OPUS) || j10 - j11 > 80000;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ad A[Catch: n -> 0x00bd, TryCatch #1 {n -> 0x00bd, blocks: (B:51:0x00a9, B:53:0x00ad, B:55:0x00b4, B:60:0x00bf, B:64:0x00cc), top: B:76:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb  */
    public final void U() {
        i1.p pVar;
        na.g gVar;
        if (this.N != null || this.f54152e0 || (pVar = this.E) == null) {
            return;
        }
        String str = pVar.f42643n;
        boolean z10 = true;
        if (this.H == null && v0(pVar)) {
            this.f54152e0 = false;
            m0();
            boolean zEquals = MimeTypes.AUDIO_AAC.equals(str);
            e eVar = this.f54177z;
            if (zEquals || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
                eVar.getClass();
                eVar.l = 32;
            } else {
                eVar.getClass();
                eVar.l = 1;
            }
            this.f54152e0 = true;
            return;
        }
        p0(this.H);
        if (this.G == null) {
            try {
                gVar = this.G;
                if (gVar == null && (gVar.B() == 3 || this.G.B() == 4)) {
                    na.g gVar2 = this.G;
                    str.getClass();
                    if (!gVar2.E(str)) {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                V(this.J, z10);
            } catch (n e10) {
                throw d(e10, pVar, false, 4001);
            }
        } else {
            go.k.t(this.J == null);
            na.g gVar3 = this.G;
            o1.a aVarV = gVar3.v();
            if (u1.i.f51662a && (aVarV instanceof u1.i)) {
                int iB = gVar3.B();
                if (iB == 1) {
                    u1.c cVarX = gVar3.x();
                    cVarX.getClass();
                    throw d(cVarX, this.E, false, cVarX.f51658a);
                }
                if (iB == 4) {
                    if (aVarV == null) {
                        if (gVar3.x() != null) {
                        }
                    } else if (aVarV instanceof u1.i) {
                        this.J = new MediaCrypto(null, null);
                    }
                    gVar = this.G;
                    if (gVar == null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    V(this.J, z10);
                }
            } else {
                if (aVarV == null) {
                    if (gVar3.x() != null) {
                    }
                } else if (aVarV instanceof u1.i) {
                    try {
                        this.J = new MediaCrypto(null, null);
                    } catch (MediaCryptoException e11) {
                        throw d(e11, this.E, false, 6006);
                    }
                }
                gVar = this.G;
                if (gVar == null) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                V(this.J, z10);
            }
        }
        MediaCrypto mediaCrypto = this.J;
        if (mediaCrypto == null || this.N != null) {
            return;
        }
        mediaCrypto.release();
        this.J = null;
    }

    public final void V(MediaCrypto mediaCrypto, boolean z10) throws n {
        i1.p pVar = this.E;
        pVar.getClass();
        if (this.S == null) {
            try {
                List listK = K(z10);
                this.S = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listK;
                if (!arrayList.isEmpty()) {
                    this.S.add((m) arrayList.get(0));
                }
                this.T = null;
            } catch (s e10) {
                throw new n(pVar, e10, z10, -49998);
            }
        }
        if (this.S.isEmpty()) {
            throw new n(pVar, null, z10, -49999);
        }
        ArrayDeque arrayDeque = this.S;
        arrayDeque.getClass();
        while (this.N == null) {
            m mVar = (m) arrayDeque.peekFirst();
            mVar.getClass();
            if (!W(pVar) || !t0(mVar)) {
                return;
            }
            try {
                S(mVar, mediaCrypto);
            } catch (Exception e11) {
                l1.a.t("MediaCodecRenderer", "Failed to initialize decoder: " + mVar, e11);
                arrayDeque.removeFirst();
                n nVar = new n("Decoder init failed: " + mVar.f54127a + ", " + pVar, e11, pVar.f42643n, z10, mVar, e11 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e11).getDiagnosticInfo() : null);
                X(nVar);
                n nVar2 = this.T;
                if (nVar2 == null) {
                    this.T = nVar;
                } else {
                    this.T = new n(nVar2.getMessage(), nVar2.getCause(), nVar2.f54138a, nVar2.f54139b, nVar2.f54140c, nVar2.f54141d);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.T;
                }
            }
        }
        this.S = null;
    }

    public boolean W(i1.p pVar) {
        return true;
    }

    public abstract void X(Exception exc);

    public abstract void Y(String str, long j10, long j11);

    public abstract void Z(p1.b bVar);

    public abstract void a0(String str);

    /* JADX WARN: Code duplicated, block: B:75:0x0106  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e3, code lost:
    
        if (r4.E(r2) != false) goto L118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p1.c b0(m0.s1 r13) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.p.b0(m0.s1):p1.c");
    }

    public abstract void c0(i1.p pVar, MediaFormat mediaFormat);

    public void e0(long j10) {
        this.f54170v0 = j10;
        while (true) {
            ArrayDeque arrayDeque = this.B;
            if (arrayDeque.isEmpty() || j10 < ((o) arrayDeque.peek()).f54143a) {
                return;
            }
            o oVar = (o) arrayDeque.poll();
            oVar.getClass();
            q0(oVar);
            f0();
        }
    }

    @Override // p1.a
    public final long f(long j10, long j11) {
        return O(j10, j11);
    }

    public abstract void f0();

    public final void h0() throws p1.h {
        int i10 = this.f54157k0;
        if (i10 == 1) {
            J();
            return;
        }
        if (i10 == 2) {
            J();
            y0();
        } else if (i10 != 3) {
            this.f54162p0 = true;
            l0();
        } else {
            k0();
            U();
        }
    }

    @Override // p1.a, p1.y0
    public void handleMessage(int i10, Object obj) {
        if (i10 == 11) {
            p1.d0 d0Var = (p1.d0) obj;
            d0Var.getClass();
            this.I = d0Var;
            return;
        }
        if (i10 != 21) {
            if (i10 != 22) {
                return;
            }
            int i11 = Build.VERSION.SDK_INT;
            obj.getClass();
            u0 u0Var = (u0) obj;
            if (this.C0.equals(u0Var)) {
                return;
            }
            if (i11 >= 31) {
                HashSet hashSet = new HashSet(u0Var);
                HashSet hashSet2 = new HashSet();
                e2 it = this.C0.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!hashSet.remove(str)) {
                        hashSet2.add(str);
                    }
                }
                j jVar = this.N;
                if (jVar != null) {
                    if (!hashSet2.isEmpty()) {
                        jVar.C(new ArrayList(hashSet2));
                    }
                    if (!hashSet.isEmpty()) {
                        jVar.B(new ArrayList(hashSet));
                    }
                }
            }
            this.C0 = u0Var;
            return;
        }
        obj.getClass();
        p1.b bVar = (p1.b) obj;
        this.A0 = bVar;
        j jVar2 = this.N;
        if (jVar2 != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : bVar.f47927a.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof Integer) {
                        bundle.putInt(str2, ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        bundle.putLong(str2, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        bundle.putFloat(str2, ((Float) value).floatValue());
                    } else if (value instanceof String) {
                        bundle.putString(str2, (String) value);
                    } else if (value instanceof ByteBuffer) {
                        ByteBuffer byteBuffer = (ByteBuffer) value;
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.duplicate().get(bArr);
                        bundle.putByteArray(str2, bArr);
                    }
                }
            }
            jVar2.b(bundle);
        }
    }

    public abstract boolean i0(long j10, long j11, j jVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, i1.p pVar);

    public final boolean j0(int i10) throws p1.h {
        s1 s1Var = this.f47907c;
        s1Var.c();
        o1.d dVar = this.f54171w;
        dVar.g();
        int iV = v(s1Var, dVar, i10 | 4);
        if (iV == -5) {
            b0(s1Var);
            return true;
        }
        if (iV != -4 || !dVar.c(4)) {
            return false;
        }
        this.f54161o0 = true;
        h0();
        return false;
    }

    public final void k0() {
        try {
            j jVar = this.N;
            if (jVar != null) {
                jVar.release();
                this.t0.f22024c++;
                m mVar = this.U;
                mVar.getClass();
                a0(mVar.f54127a);
            }
            this.N = null;
            try {
                MediaCrypto mediaCrypto = this.J;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.J = null;
                p0(null);
                o0();
            }
        } catch (Throwable th2) {
            this.N = null;
            try {
                MediaCrypto mediaCrypto2 = this.J;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.J = null;
                p0(null);
                o0();
            }
        }
    }

    public abstract void l0();

    @Override // p1.a
    public void m() {
        this.E = null;
        q0(o.f54142f);
        this.B.clear();
        if (this.f54152e0) {
            this.f54152e0 = false;
            m0();
        } else {
            if (this.N == null) {
                return;
            }
            if (u0()) {
                k0();
            } else if (s0()) {
                J();
            } else {
                this.f54176y0 = true;
            }
        }
    }

    public final void m0() {
        this.f54160n0 = C.TIME_UNSET;
        P().f54147e = C.TIME_UNSET;
        this.f54170v0 = C.TIME_UNSET;
        this.g0 = false;
        this.f54177z.g();
        this.f54175y.g();
        this.f54153f0 = false;
        d0 d0Var = this.C;
        d0Var.getClass();
        d0Var.f49264a = j1.k.f43603a;
        d0Var.f49266c = 0;
        d0Var.f49265b = 2;
    }

    public void n0() {
        this.f54148a0 = -1;
        this.f54173x.f47035e = null;
        this.f54149b0 = -1;
        this.f54150c0 = null;
        this.f54160n0 = C.TIME_UNSET;
        P().f54147e = C.TIME_UNSET;
        this.f54170v0 = C.TIME_UNSET;
        this.Z = C.TIME_UNSET;
        this.f54159m0 = false;
        this.Y = C.TIME_UNSET;
        this.f54158l0 = false;
        this.V = false;
        this.W = false;
        this.f54151d0 = false;
        this.f54156j0 = 0;
        this.f54157k0 = 0;
        this.f54155i0 = this.f54154h0 ? 1 : 0;
        this.f54176y0 = false;
        this.f54178z0 = 0L;
    }

    @Override // p1.a
    public void o(long j10, boolean z10, boolean z11) {
        ArrayDeque arrayDeque = this.B;
        if (!arrayDeque.isEmpty()) {
            this.f54168u0 = (o) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z11) {
            this.f54161o0 = false;
            this.f54162p0 = false;
            this.r0 = false;
            if (this.f54152e0) {
                m0();
            } else if (this.N != null) {
                if (u0()) {
                    k0();
                    U();
                } else if (s0()) {
                    J();
                } else {
                    this.f54176y0 = true;
                }
            }
            if (this.f54168u0.f54146d.f() > 0) {
                this.f54163q0 = true;
            }
            ht0 ht0Var = this.f54168u0.f54146d;
            synchronized (ht0Var) {
                ht0Var.f15389c = 0;
                ht0Var.f15390d = 0;
                Arrays.fill(ht0Var.f15388b, (Object) null);
            }
        }
    }

    public final void o0() {
        n0();
        this.f54165s0 = null;
        this.S = null;
        this.U = null;
        this.O = null;
        this.P = null;
        this.Q = false;
        this.R = -1.0f;
        this.X = false;
        this.f54154h0 = false;
        this.f54155i0 = 0;
    }

    public final void p0(na.g gVar) {
        na.g gVar2 = this.G;
        if (gVar2 != gVar) {
            if (gVar != null) {
                gVar.r(null);
            }
            if (gVar2 != null) {
                gVar2.D(null);
            }
        }
        this.G = gVar;
    }

    public final void q0(o oVar) {
        this.f54168u0 = oVar;
        if (oVar.f54145c != C.TIME_UNSET) {
            this.f54172w0 = true;
            d0();
        }
    }

    public boolean r0(o1.d dVar) {
        return false;
    }

    public boolean s0() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // p1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(i1.p[] r12, long r13, long r15, f2.c0 r17) {
        /*
            r11 = this;
            y1.o r12 = r11.f54168u0
            long r0 = r12.f54145c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            y1.o r4 = new y1.o
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.q0(r4)
            boolean r12 = r11.f54174x0
            if (r12 == 0) goto L56
            r11.f0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.B
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.f54160n0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.f54170v0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            y1.o r4 = new y1.o
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.q0(r4)
            y1.o r12 = r11.f54168u0
            long r12 = r12.f54145c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.f0()
        L56:
            return
        L57:
            y1.o r0 = new y1.o
            long r1 = r11.f54160n0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.p.t(i1.p[], long, long, f2.c0):void");
    }

    public boolean t0(m mVar) {
        return true;
    }

    public boolean u0() {
        int i10 = this.f54157k0;
        if (i10 == 3) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        try {
            y0();
            return false;
        } catch (p1.h e10) {
            l1.a.t("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
            return true;
        }
    }

    public boolean v0(i1.p pVar) {
        return false;
    }

    @Override // p1.a
    public void w(long j10, long j11) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (this.r0) {
            this.r0 = false;
            h0();
        }
        p1.h hVar = this.f54165s0;
        if (hVar != null) {
            this.f54165s0 = null;
            throw hVar;
        }
        try {
            if (this.f54162p0) {
                l0();
                return;
            }
            if (this.E != null || j0(2)) {
                U();
                if (this.f54152e0) {
                    Trace.beginSection("bypassRender");
                    while (E(j10, j11)) {
                    }
                    Trace.endSection();
                } else if (this.N != null) {
                    this.f47911g.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (H(j10, j11)) {
                        long j12 = this.K;
                        if (j12 != C.TIME_UNSET) {
                            this.f47911g.getClass();
                            z11 = SystemClock.elapsedRealtime() - jElapsedRealtime < j12;
                        }
                        if (!z11) {
                            break;
                        }
                    }
                    while (I()) {
                        long j13 = this.K;
                        if (j13 != C.TIME_UNSET) {
                            this.f47911g.getClass();
                            z10 = SystemClock.elapsedRealtime() - jElapsedRealtime < j13;
                        }
                        if (!z10) {
                            break;
                        }
                    }
                    Trace.endSection();
                } else {
                    xx1 xx1Var = this.t0;
                    int i10 = xx1Var.f22026e;
                    c1 c1Var = this.f47913i;
                    c1Var.getClass();
                    xx1Var.f22026e = i10 + c1Var.skipData(j10 - this.f47915k);
                    j0(1);
                }
                synchronized (this.t0) {
                }
            }
        } catch (MediaCodec.CryptoException e10) {
            throw d(e10, this.E, false, y.y(e10.getErrorCode()));
        } catch (IllegalStateException e11) {
            boolean z13 = e11 instanceof MediaCodec.CodecException;
            if (!z13) {
                StackTraceElement[] stackTrace = e11.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e11;
                }
            }
            X(e11);
            if (z13 && ((MediaCodec.CodecException) e11).isRecoverable()) {
                z12 = true;
            }
            if (z12) {
                k0();
            }
            l lVarG = G(e11, this.U);
            throw d(lVarG, this.E, z12, lVarG.f54126a == 1101 ? 4006 : 4003);
        }
    }

    public abstract int w0(g gVar, i1.p pVar);

    public final boolean x0(i1.p pVar) {
        if (this.N != null && this.f54157k0 != 3 && this.f47912h != 0) {
            float f10 = this.M;
            pVar.getClass();
            i1.p[] pVarArr = this.f47914j;
            pVarArr.getClass();
            float fM = M(f10, pVar, pVarArr);
            float f11 = this.R;
            if (f11 != fM) {
                if (fM == -1.0f) {
                    if (this.f54158l0) {
                        this.f54156j0 = 1;
                        this.f54157k0 = 3;
                        return false;
                    }
                    k0();
                    U();
                    return false;
                }
                if (f11 != -1.0f || fM > this.f54169v) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fM);
                    j jVar = this.N;
                    jVar.getClass();
                    jVar.b(bundle);
                    this.R = fM;
                }
            }
        }
        return true;
    }

    public final void y0() throws p1.h {
        na.g gVar = this.H;
        gVar.getClass();
        if (gVar.v() instanceof u1.i) {
            try {
                MediaCrypto mediaCrypto = this.J;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e10) {
                throw d(e10, this.E, false, 6006);
            }
        }
        p0(this.H);
        this.f54156j0 = 0;
        this.f54157k0 = 0;
    }

    @Override // p1.a
    public void z(float f10, float f11) {
        this.L = f10;
        this.M = f11;
        x0(this.O);
    }

    public final void z0(long j10) {
        i1.p pVar = (i1.p) this.f54168u0.f54146d.d(j10);
        if (pVar == null && this.f54172w0 && this.P != null) {
            pVar = (i1.p) this.f54168u0.f54146d.c();
        }
        if (pVar != null) {
            this.F = pVar;
        } else if (!this.Q || this.F == null) {
            return;
        }
        i1.p pVar2 = this.F;
        pVar2.getClass();
        c0(pVar2, this.P);
        this.Q = false;
        this.f54172w0 = false;
    }

    public void d0() {
    }

    public void g0(o1.d dVar) {
    }
}

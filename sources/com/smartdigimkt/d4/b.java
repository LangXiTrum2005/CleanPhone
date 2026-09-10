package com.smartdigimkt.d4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.smartdigimkt.a4.f;
import com.smartdigimkt.a4.g;
import com.smartdigimkt.a4.k;
import com.smartdigimkt.p4.d0;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.p4.p;
import com.smartdigimkt.w3.m;
import com.smartdigimkt.w3.n;
import com.thinkup.core.common.n.mo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b extends com.smartdigimkt.w3.a {
    private static final String X0 = "MediaCodecRenderer";
    private static final long Y0 = 1000;
    protected static final int Z0 = 0;
    protected static final int a1 = 1;
    protected static final int b1 = 3;
    private static final int c1 = 0;
    private static final int d1 = 1;
    private static final int e1 = 2;
    private static final int f1 = 0;
    private static final int g1 = 1;
    private static final int h1 = 2;
    private static final int i1 = 0;
    private static final int j1 = 1;
    private static final int k1 = 2;
    private static final byte[] l1 = f0.b("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private static final int m1 = 32;
    private boolean A0;
    private boolean B0;
    private boolean C0;
    private boolean D0;
    private boolean E0;
    private boolean F0;
    private ByteBuffer[] G0;
    private ByteBuffer[] H0;
    private long I0;
    private int J0;
    private int K0;
    private ByteBuffer L0;
    private boolean M0;
    private boolean N0;
    private int O0;
    private int P0;
    private boolean Q0;
    private boolean R0;
    private boolean S0;
    private boolean T0;
    private boolean U0;
    private boolean V0;
    protected com.smartdigimkt.z3.d W0;
    private final com.smartdigimkt.d4.c k0;
    private final g<k> l0;
    private final boolean m0;
    private final com.smartdigimkt.z3.e n0;
    private final com.smartdigimkt.z3.e o0;
    private final n p0;
    private final List<Long> q0;
    private final MediaCodec.BufferInfo r0;
    private m s0;
    private f<k> t0;
    private f<k> u0;
    private MediaCodec v0;
    private com.smartdigimkt.d4.a w0;
    private int x0;
    private boolean y0;
    private boolean z0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public b(int i2, com.smartdigimkt.d4.c cVar, g<k> gVar, boolean z2) {
        super(i2);
        com.smartdigimkt.p4.a.b(f0.f37540a >= 16);
        this.k0 = (com.smartdigimkt.d4.c) com.smartdigimkt.p4.a.a(cVar);
        this.l0 = gVar;
        this.m0 = z2;
        this.n0 = new com.smartdigimkt.z3.e(0);
        this.o0 = com.smartdigimkt.z3.e.h();
        this.p0 = new n();
        this.q0 = new ArrayList();
        this.r0 = new MediaCodec.BufferInfo();
        this.O0 = 0;
        this.P0 = 0;
    }

    private boolean C() {
        return this.K0 >= 0;
    }

    private void E() throws com.smartdigimkt.w3.g {
        if (this.P0 == 2) {
            H();
            D();
        } else {
            this.T0 = true;
            I();
        }
    }

    private void F() {
        if (f0.f37540a < 21) {
            this.H0 = this.v0.getOutputBuffers();
        }
    }

    private void G() throws com.smartdigimkt.w3.g {
        MediaFormat outputFormat = this.v0.getOutputFormat();
        if (this.x0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.F0 = true;
            return;
        }
        if (this.D0) {
            outputFormat.setInteger("channel-count", 1);
        }
        a(this.v0, outputFormat);
    }

    private void J() {
        if (f0.f37540a < 21) {
            this.G0 = null;
            this.H0 = null;
        }
    }

    private void K() {
        this.J0 = -1;
        this.n0.f40353c = null;
    }

    private void L() {
        this.K0 = -1;
        this.L0 = null;
    }

    private boolean d(long j) {
        int size = this.q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.q0.get(i2).longValue() == j) {
                this.q0.remove(i2);
                return true;
            }
        }
        return false;
    }

    private boolean v() {
        if (!"Amazon".equals(f0.f37542c)) {
            return false;
        }
        String str = f0.d;
        return "AFTM".equals(str) || "AFTB".equals(str);
    }

    private boolean w() throws com.smartdigimkt.w3.g {
        int iPosition;
        int iA;
        MediaCodec mediaCodec = this.v0;
        if (mediaCodec == null || this.P0 == 2 || this.S0) {
            return false;
        }
        if (this.J0 < 0) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.J0 = iDequeueInputBuffer;
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            this.n0.f40353c = b(iDequeueInputBuffer);
            this.n0.a();
        }
        if (this.P0 == 1) {
            if (!this.A0) {
                this.R0 = true;
                this.v0.queueInputBuffer(this.J0, 0, 0, 0L, 4);
                K();
            }
            this.P0 = 2;
            return false;
        }
        if (this.E0) {
            this.E0 = false;
            ByteBuffer byteBuffer = this.n0.f40353c;
            byte[] bArr = l1;
            byteBuffer.put(bArr);
            this.v0.queueInputBuffer(this.J0, 0, bArr.length, 0L, 0);
            K();
            this.Q0 = true;
            return true;
        }
        if (this.U0) {
            iA = -4;
            iPosition = 0;
        } else {
            if (this.O0 == 1) {
                for (int i2 = 0; i2 < this.s0.f39335h.size(); i2++) {
                    this.n0.f40353c.put(this.s0.f39335h.get(i2));
                }
                this.O0 = 2;
            }
            iPosition = this.n0.f40353c.position();
            iA = a(this.p0, this.n0, false);
        }
        if (iA == -3) {
            return false;
        }
        if (iA == -5) {
            if (this.O0 == 2) {
                this.n0.a();
                this.O0 = 1;
            }
            b(this.p0.f39343a);
            return true;
        }
        if (this.n0.c()) {
            if (this.O0 == 2) {
                this.n0.a();
                this.O0 = 1;
            }
            this.S0 = true;
            if (!this.Q0) {
                E();
                return false;
            }
            try {
                if (!this.A0) {
                    this.R0 = true;
                    this.v0.queueInputBuffer(this.J0, 0, 0, 0L, 4);
                    K();
                }
                return false;
            } catch (Exception e2) {
                throw com.smartdigimkt.w3.g.a(e2, p());
            }
        }
        if (this.V0 && !this.n0.d()) {
            this.n0.a();
            if (this.O0 == 2) {
                this.O0 = 1;
            }
            return true;
        }
        this.V0 = false;
        boolean zF = this.n0.f();
        boolean zB = b(zF);
        this.U0 = zB;
        if (zB) {
            return false;
        }
        if (this.y0 && !zF) {
            p.a(this.n0.f40353c);
            if (this.n0.f40353c.position() == 0) {
                return true;
            }
            this.y0 = false;
        }
        try {
            com.smartdigimkt.z3.e eVar = this.n0;
            long j = eVar.d;
            if (eVar.b()) {
                this.q0.add(Long.valueOf(j));
            }
            this.n0.e();
            a(this.n0);
            if (zF) {
                this.v0.queueSecureInputBuffer(this.J0, 0, a(this.n0, iPosition), j, 0);
            } else {
                this.v0.queueInputBuffer(this.J0, 0, this.n0.f40353c.limit(), j, 0);
            }
            K();
            this.Q0 = true;
            this.O0 = 0;
            this.W0.f40347c++;
            return true;
        } catch (Exception e3) {
            throw com.smartdigimkt.w3.g.a(e3, p());
        }
    }

    private void z() {
        if (f0.f37540a < 21) {
            this.G0 = this.v0.getInputBuffers();
            this.H0 = this.v0.getOutputBuffers();
        }
    }

    public final com.smartdigimkt.d4.a A() {
        return this.w0;
    }

    public long B() {
        return 0L;
    }

    public final void D() throws com.smartdigimkt.w3.g {
        m mVar;
        boolean zA;
        MediaCrypto mediaCryptoA;
        b bVar;
        if (this.v0 == null && (mVar = this.s0) != null) {
            f<k> fVar = this.u0;
            this.t0 = fVar;
            String str = mVar.f;
            if (fVar != null) {
                k kVar = (k) fVar.f();
                if (kVar != null) {
                    mediaCryptoA = kVar.a();
                    zA = kVar.a(str);
                } else if (this.t0.h() != null) {
                    zA = false;
                    mediaCryptoA = null;
                }
                if (v()) {
                    int iD = this.t0.d();
                    if (iD == 1) {
                        throw com.smartdigimkt.w3.g.a(this.t0.h(), p());
                    }
                    if (iD == 4) {
                    }
                }
            } else {
                zA = false;
                mediaCryptoA = null;
            }
            if (this.w0 == null) {
                try {
                    com.smartdigimkt.d4.a aVarA = a(this.k0, this.s0, zA);
                    this.w0 = aVarA;
                    if (aVarA == null && zA) {
                        com.smartdigimkt.d4.a aVarA2 = a(this.k0, this.s0, false);
                        this.w0 = aVarA2;
                        if (aVarA2 != null) {
                            Log.w(X0, "Drm session requires secure decoder for " + str + ", but no secure decoder available. Trying to proceed with " + this.w0.f34432a + mo.ono);
                        }
                    }
                } catch (com.smartdigimkt.d4.d.c e2) {
                    a(new C0456b(this.s0, e2, zA, -49998));
                }
                if (this.w0 == null) {
                    a(new C0456b(this.s0, (Throwable) null, zA, -49999));
                }
            }
            if (b(this.w0)) {
                String str2 = this.w0.f34432a;
                this.x0 = a(str2);
                this.y0 = a(str2, this.s0);
                this.z0 = d(str2);
                this.A0 = a(this.w0);
                this.B0 = b(str2);
                this.C0 = c(str2);
                this.D0 = b(str2, this.s0);
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    d0.a("createCodec:" + str2);
                    this.v0 = MediaCodec.createByCodecName(str2);
                    d0.a();
                    d0.a("configureCodec");
                    a(this.w0, this.v0, this.s0, mediaCryptoA);
                    d0.a();
                    d0.a("startCodec");
                    this.v0.start();
                    d0.a();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    bVar = this;
                    try {
                        bVar.a(str2, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                        z();
                    } catch (Exception e3) {
                        e = e3;
                        a(new C0456b(bVar.s0, e, zA, str2));
                    }
                } catch (Exception e4) {
                    e = e4;
                    bVar = this;
                }
                bVar.I0 = d() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                K();
                L();
                bVar.V0 = true;
                bVar.W0.f40345a++;
            }
        }
    }

    public void H() {
        this.I0 = -9223372036854775807L;
        K();
        L();
        this.U0 = false;
        this.M0 = false;
        this.q0.clear();
        J();
        this.w0 = null;
        this.N0 = false;
        this.Q0 = false;
        this.y0 = false;
        this.z0 = false;
        this.x0 = 0;
        this.A0 = false;
        this.B0 = false;
        this.D0 = false;
        this.E0 = false;
        this.F0 = false;
        this.R0 = false;
        this.O0 = 0;
        this.P0 = 0;
        MediaCodec mediaCodec = this.v0;
        if (mediaCodec != null) {
            this.W0.f40346b++;
            try {
                mediaCodec.stop();
                try {
                    this.v0.release();
                    this.v0 = null;
                    f<k> fVar = this.t0;
                    if (fVar == null || this.u0 == fVar) {
                        return;
                    }
                    try {
                        this.l0.a(fVar);
                    } finally {
                        this.t0 = null;
                    }
                } catch (Throwable th) {
                    this.v0 = null;
                    f<k> fVar2 = this.t0;
                    if (fVar2 != null && this.u0 != fVar2) {
                        try {
                            this.l0.a(fVar2);
                        } finally {
                            this.t0 = null;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.v0.release();
                    this.v0 = null;
                    f<k> fVar3 = this.t0;
                    if (fVar3 != null && this.u0 != fVar3) {
                        try {
                            this.l0.a(fVar3);
                        } finally {
                            this.t0 = null;
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.v0 = null;
                    f<k> fVar4 = this.t0;
                    if (fVar4 != null && this.u0 != fVar4) {
                        try {
                            this.l0.a(fVar4);
                        } finally {
                            this.t0 = null;
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    public void I() throws com.smartdigimkt.w3.g {
    }

    public int a(MediaCodec mediaCodec, com.smartdigimkt.d4.a aVar, m mVar, m mVar2) {
        return 0;
    }

    public abstract int a(com.smartdigimkt.d4.c cVar, g<k> gVar, m mVar) throws com.smartdigimkt.d4.d.c;

    public abstract void a(com.smartdigimkt.d4.a aVar, MediaCodec mediaCodec, m mVar, MediaCrypto mediaCrypto) throws com.smartdigimkt.d4.d.c;

    public abstract boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j3, boolean z2) throws com.smartdigimkt.w3.g;

    public boolean b(com.smartdigimkt.d4.a aVar) {
        return true;
    }

    public void c(long j) {
    }

    @Override // com.smartdigimkt.w3.a, com.smartdigimkt.w3.z
    public final int g() {
        return 8;
    }

    @Override // com.smartdigimkt.w3.y
    public boolean isReady() {
        if (this.s0 == null || this.U0) {
            return false;
        }
        if (r() || C()) {
            return true;
        }
        return this.I0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.I0;
    }

    @Override // com.smartdigimkt.w3.a
    public void s() {
        this.s0 = null;
        try {
            H();
            try {
                f<k> fVar = this.t0;
                if (fVar != null) {
                    this.l0.a(fVar);
                }
                try {
                    f<k> fVar2 = this.u0;
                    if (fVar2 != null && fVar2 != this.t0) {
                        this.l0.a(fVar2);
                    }
                } finally {
                    this.t0 = null;
                    this.u0 = null;
                }
            } catch (Throwable th) {
                try {
                    f<k> fVar3 = this.u0;
                    if (fVar3 != null && fVar3 != this.t0) {
                        this.l0.a(fVar3);
                    }
                    throw th;
                } finally {
                    this.t0 = null;
                    this.u0 = null;
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.t0 != null) {
                    this.l0.a(this.t0);
                }
                try {
                    f<k> fVar4 = this.u0;
                    if (fVar4 != null && fVar4 != this.t0) {
                        this.l0.a(fVar4);
                    }
                    throw th2;
                } finally {
                    this.t0 = null;
                    this.u0 = null;
                }
            } catch (Throwable th3) {
                try {
                    f<k> fVar5 = this.u0;
                    if (fVar5 != null && fVar5 != this.t0) {
                        this.l0.a(fVar5);
                    }
                    throw th3;
                } finally {
                    this.t0 = null;
                    this.u0 = null;
                }
            }
        }
    }

    @Override // com.smartdigimkt.w3.a
    public void t() {
    }

    @Override // com.smartdigimkt.w3.a
    public void u() {
    }

    public void x() throws com.smartdigimkt.w3.g {
        this.I0 = -9223372036854775807L;
        K();
        L();
        this.V0 = true;
        this.U0 = false;
        this.M0 = false;
        this.q0.clear();
        this.E0 = false;
        this.F0 = false;
        if (this.z0 || ((this.B0 && this.R0) || this.P0 != 0)) {
            H();
            D();
        } else {
            this.v0.flush();
            this.Q0 = false;
        }
        if (!this.N0 || this.s0 == null) {
            return;
        }
        this.O0 = 1;
    }

    public final MediaCodec y() {
        return this.v0;
    }

    /* JADX INFO: renamed from: com.smartdigimkt.d4.b$b, reason: collision with other inner class name */
    public static class C0456b extends Exception {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f34436e = -50000;
        private static final int f = -49999;
        private static final int g = -49998;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f34438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f34439c;
        public final String d;

        public C0456b(m mVar, Throwable th, boolean z2, int i2) {
            super("Decoder init failed: [" + i2 + "], " + mVar, th);
            this.f34437a = mVar.f;
            this.f34438b = z2;
            this.f34439c = null;
            this.d = a(i2);
        }

        private static String a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        private static String a(int i2) {
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + (i2 < 0 ? "neg_" : "") + Math.abs(i2);
        }

        public C0456b(m mVar, Throwable th, boolean z2, String str) {
            super("Decoder init failed: " + str + ", " + mVar, th);
            this.f34437a = mVar.f;
            this.f34438b = z2;
            this.f34439c = str;
            this.d = f0.f37540a >= 21 ? a(th) : null;
        }
    }

    private ByteBuffer b(int i2) {
        return f0.f37540a >= 21 ? this.v0.getInputBuffer(i2) : this.G0[i2];
    }

    private ByteBuffer c(int i2) {
        return f0.f37540a >= 21 ? this.v0.getOutputBuffer(i2) : this.H0[i2];
    }

    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws com.smartdigimkt.w3.g {
    }

    public void a(com.smartdigimkt.z3.e eVar) {
    }

    private static boolean d(String str) {
        int i2 = f0.f37540a;
        if (i2 < 18) {
            return true;
        }
        if (i2 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) {
            return true;
        }
        if (i2 == 19 && f0.d.startsWith("SM-G800")) {
            return "OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str);
        }
        return false;
    }

    public void a(String str, long j, long j2) {
    }

    private boolean b(boolean z2) throws com.smartdigimkt.w3.g {
        f<k> fVar = this.t0;
        if (fVar == null || (!z2 && this.m0)) {
            return false;
        }
        int iD = fVar.d();
        if (iD != 1) {
            return iD != 4;
        }
        throw com.smartdigimkt.w3.g.a(this.t0.h(), p());
    }

    private static boolean c(String str) {
        return f0.f37540a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    @Override // com.smartdigimkt.w3.z
    public final int a(m mVar) throws com.smartdigimkt.w3.g {
        try {
            return a(this.k0, this.l0, mVar);
        } catch (com.smartdigimkt.d4.d.c e2) {
            throw com.smartdigimkt.w3.g.a(e2, p());
        }
    }

    public com.smartdigimkt.d4.a a(com.smartdigimkt.d4.c cVar, m mVar, boolean z2) throws com.smartdigimkt.d4.d.c {
        return cVar.a(mVar.f, z2);
    }

    private void a(C0456b c0456b) throws com.smartdigimkt.w3.g {
        throw com.smartdigimkt.w3.g.a(c0456b, p());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    public void b(m mVar) throws com.smartdigimkt.w3.g {
        MediaCodec mediaCodec;
        int iA;
        m mVar2 = this.s0;
        this.s0 = mVar;
        if (!f0.a(mVar.f39336i, mVar2 == null ? null : mVar2.f39336i)) {
            if (this.s0.f39336i != null) {
                g<k> gVar = this.l0;
                if (gVar != null) {
                    f fVarA = gVar.a(Looper.myLooper(), this.s0.f39336i);
                    this.u0 = fVarA;
                    if (fVarA == this.t0) {
                        this.l0.a(fVarA);
                    }
                } else {
                    throw com.smartdigimkt.w3.g.a(new IllegalStateException("Media requires a DrmSessionManager"), p());
                }
            } else {
                this.u0 = null;
            }
        }
        boolean z2 = true;
        if (this.u0 != this.t0 || (mediaCodec = this.v0) == null || (iA = a(mediaCodec, this.w0, mVar2, this.s0)) == 0) {
            if (this.Q0) {
                this.P0 = 1;
                return;
            } else {
                H();
                D();
                return;
            }
        }
        if (iA != 1) {
            if (iA == 3) {
                this.N0 = true;
                this.O0 = 1;
                int i2 = this.x0;
                if (i2 != 2) {
                    if (i2 == 1) {
                        m mVar3 = this.s0;
                        if (mVar3.k != mVar2.k || mVar3.f39337l != mVar2.f39337l) {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                }
                this.E0 = z2;
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.smartdigimkt.w3.a
    public void a(boolean z2) throws com.smartdigimkt.w3.g {
        this.W0 = new com.smartdigimkt.z3.d();
    }

    @Override // com.smartdigimkt.w3.a
    public void a(long j, boolean z2) throws com.smartdigimkt.w3.g {
        this.S0 = false;
        this.T0 = false;
        if (this.v0 != null) {
            x();
        }
    }

    @Override // com.smartdigimkt.w3.y
    public void a(long j, long j2) throws com.smartdigimkt.w3.g {
        if (this.T0) {
            I();
            return;
        }
        if (this.s0 == null) {
            this.o0.a();
            int iA = a(this.p0, this.o0, true);
            if (iA != -5) {
                if (iA == -4) {
                    com.smartdigimkt.p4.a.b(this.o0.c());
                    this.S0 = true;
                    E();
                    return;
                }
                return;
            }
            b(this.p0.f39343a);
        }
        D();
        if (this.v0 != null) {
            d0.a("drainAndFeed");
            while (b(j, j2)) {
            }
            while (w()) {
            }
            d0.a();
        } else {
            com.smartdigimkt.z3.d dVar = this.W0;
            dVar.d = b(j) + dVar.d;
            this.o0.a();
            int iA2 = a(this.p0, this.o0, false);
            if (iA2 == -5) {
                b(this.p0.f39343a);
            } else if (iA2 == -4) {
                com.smartdigimkt.p4.a.b(this.o0.c());
                this.S0 = true;
                E();
            }
        }
        this.W0.a();
    }

    private boolean b(long j, long j2) throws com.smartdigimkt.w3.g {
        boolean zA;
        int iDequeueOutputBuffer;
        if (!C()) {
            if (this.C0 && this.R0) {
                try {
                    iDequeueOutputBuffer = this.v0.dequeueOutputBuffer(this.r0, B());
                } catch (IllegalStateException unused) {
                    E();
                    if (this.T0) {
                        H();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBuffer = this.v0.dequeueOutputBuffer(this.r0, B());
            }
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer == -2) {
                    G();
                    return true;
                }
                if (iDequeueOutputBuffer == -3) {
                    F();
                    return true;
                }
                if (this.A0 && (this.S0 || this.P0 == 2)) {
                    E();
                }
                return false;
            }
            if (this.F0) {
                this.F0 = false;
                this.v0.releaseOutputBuffer(iDequeueOutputBuffer, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.r0;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                E();
                return false;
            }
            this.K0 = iDequeueOutputBuffer;
            ByteBuffer byteBufferC = c(iDequeueOutputBuffer);
            this.L0 = byteBufferC;
            if (byteBufferC != null) {
                byteBufferC.position(this.r0.offset);
                ByteBuffer byteBuffer = this.L0;
                MediaCodec.BufferInfo bufferInfo2 = this.r0;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            this.M0 = d(this.r0.presentationTimeUs);
        }
        if (this.C0 && this.R0) {
            try {
                MediaCodec mediaCodec = this.v0;
                ByteBuffer byteBuffer2 = this.L0;
                int i2 = this.K0;
                MediaCodec.BufferInfo bufferInfo3 = this.r0;
                zA = a(j, j2, mediaCodec, byteBuffer2, i2, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.M0);
            } catch (IllegalStateException unused2) {
                E();
                if (this.T0) {
                    H();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec2 = this.v0;
            ByteBuffer byteBuffer3 = this.L0;
            int i3 = this.K0;
            MediaCodec.BufferInfo bufferInfo4 = this.r0;
            zA = a(j, j2, mediaCodec2, byteBuffer3, i3, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.M0);
        }
        if (zA) {
            c(this.r0.presentationTimeUs);
            boolean z2 = (this.r0.flags & 4) != 0;
            L();
            if (!z2) {
                return true;
            }
            E();
        }
        return false;
    }

    private static MediaCodec.CryptoInfo a(com.smartdigimkt.z3.e eVar, int i2) {
        MediaCodec.CryptoInfo cryptoInfoA = eVar.f40352b.a();
        if (i2 == 0) {
            return cryptoInfoA;
        }
        if (cryptoInfoA.numBytesOfClearData == null) {
            cryptoInfoA.numBytesOfClearData = new int[1];
        }
        int[] iArr = cryptoInfoA.numBytesOfClearData;
        iArr[0] = iArr[0] + i2;
        return cryptoInfoA;
    }

    @Override // com.smartdigimkt.w3.y
    public boolean a() {
        return this.T0;
    }

    private int a(String str) {
        int i2 = f0.f37540a;
        if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = f0.d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i2 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = f0.f37541b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean a(String str, m mVar) {
        return f0.f37540a < 21 && mVar.f39335h.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static boolean a(com.smartdigimkt.d4.a aVar) {
        String str = aVar.f34432a;
        if (f0.f37540a > 17 || !("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str))) {
            return "Amazon".equals(f0.f37542c) && "AFTS".equals(f0.d) && aVar.f;
        }
        return true;
    }

    private static boolean b(String str) {
        int i2 = f0.f37540a;
        if (i2 <= 23 && "OMX.google.vorbis.decoder".equals(str)) {
            return true;
        }
        if (i2 > 19 || !"hb2000".equals(f0.f37541b)) {
            return false;
        }
        return "OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str);
    }

    private static boolean b(String str, m mVar) {
        return f0.f37540a <= 18 && mVar.s == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }
}

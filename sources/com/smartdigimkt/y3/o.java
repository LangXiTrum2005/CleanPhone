package com.smartdigimkt.y3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.w3.v;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class o extends com.smartdigimkt.d4.b implements com.smartdigimkt.p4.n {
    private boolean A1;
    private final Context n1;
    private final g.a o1;
    private final h p1;
    private int q1;
    private boolean r1;
    private boolean s1;
    private MediaFormat t1;
    private int u1;
    private int v1;
    private int w1;
    private int x1;
    private long y1;
    private boolean z1;

    public o(Context context, com.smartdigimkt.d4.c cVar) {
        this(context, cVar, (com.smartdigimkt.a4.g<com.smartdigimkt.a4.k>) null, false);
    }

    private void N() {
        long jA = this.p1.a(a());
        if (jA != Long.MIN_VALUE) {
            if (!this.A1) {
                jA = Math.max(this.y1, jA);
            }
            this.y1 = jA;
            this.A1 = false;
        }
    }

    private static boolean f(String str) {
        if (f0.f37540a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(f0.f37542c)) {
            return false;
        }
        String str2 = f0.f37541b;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    @Override // com.smartdigimkt.d4.b
    public void I() throws com.smartdigimkt.w3.g {
        try {
            this.p1.d();
        } catch (h.d e2) {
            throw com.smartdigimkt.w3.g.a(e2, p());
        }
    }

    public void M() {
    }

    @Override // com.smartdigimkt.d4.b
    public int a(MediaCodec mediaCodec, com.smartdigimkt.d4.a aVar, com.smartdigimkt.w3.m mVar, com.smartdigimkt.w3.m mVar2) {
        return 0;
    }

    @Override // com.smartdigimkt.d4.b
    public void b(com.smartdigimkt.w3.m mVar) throws com.smartdigimkt.w3.g {
        super.b(mVar);
        this.o1.a(mVar);
        this.u1 = "audio/raw".equals(mVar.f) ? mVar.f39340u : 2;
        this.v1 = mVar.s;
        this.w1 = mVar.v;
        this.x1 = mVar.f39341w;
    }

    public void d(int i2) {
    }

    public boolean e(String str) {
        int iC = com.smartdigimkt.p4.o.c(str);
        return iC != 0 && this.p1.b(iC);
    }

    @Override // com.smartdigimkt.d4.b, com.smartdigimkt.w3.y
    public boolean isReady() {
        return this.p1.e() || super.isReady();
    }

    @Override // com.smartdigimkt.w3.a, com.smartdigimkt.w3.y
    public com.smartdigimkt.p4.n l() {
        return this;
    }

    @Override // com.smartdigimkt.p4.n
    public long n() {
        if (d() == 2) {
            N();
        }
        return this.y1;
    }

    @Override // com.smartdigimkt.d4.b, com.smartdigimkt.w3.a
    public void s() {
        try {
            this.p1.release();
            try {
                super.s();
            } finally {
                this.W0.a();
                this.o1.a(this.W0);
            }
        } catch (Throwable th) {
            try {
                super.s();
                throw th;
            } finally {
                this.W0.a();
                this.o1.a(this.W0);
            }
        }
    }

    @Override // com.smartdigimkt.d4.b, com.smartdigimkt.w3.a
    public void t() {
        super.t();
        this.p1.f();
    }

    @Override // com.smartdigimkt.d4.b, com.smartdigimkt.w3.a
    public void u() {
        N();
        this.p1.pause();
        super.u();
    }

    public final class b implements h.c {
        private b() {
        }

        @Override // com.smartdigimkt.y3.h.c
        public void a(int i2) {
            o.this.o1.a(i2);
            o.this.d(i2);
        }

        @Override // com.smartdigimkt.y3.h.c
        public void a() {
            o.this.M();
            o.this.A1 = true;
        }

        @Override // com.smartdigimkt.y3.h.c
        public void a(int i2, long j, long j2) {
            o.this.o1.a(i2, j, j2);
            o.this.a(i2, j, j2);
        }
    }

    public o(Context context, com.smartdigimkt.d4.c cVar, com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> gVar, boolean z2) {
        this(context, cVar, gVar, z2, null, null);
    }

    public void a(int i2, long j, long j2) {
    }

    public o(Context context, com.smartdigimkt.d4.c cVar, Handler handler, g gVar) {
        this(context, cVar, null, false, handler, gVar);
    }

    public o(Context context, com.smartdigimkt.d4.c cVar, com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> gVar, boolean z2, Handler handler, g gVar2) {
        this(context, cVar, gVar, z2, handler, gVar2, null, new f[0]);
    }

    public o(Context context, com.smartdigimkt.d4.c cVar, com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> gVar, boolean z2, Handler handler, g gVar2, c cVar2, f... fVarArr) {
        this(context, cVar, gVar, z2, handler, gVar2, new l(cVar2, fVarArr));
    }

    @Override // com.smartdigimkt.d4.b
    public int a(com.smartdigimkt.d4.c cVar, com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> gVar, com.smartdigimkt.w3.m mVar) throws com.smartdigimkt.d4.d.c {
        boolean z2;
        int i2;
        int i3;
        String str = mVar.f;
        if (!com.smartdigimkt.p4.o.k(str)) {
            return 0;
        }
        int i4 = f0.f37540a >= 21 ? 32 : 0;
        boolean zA = com.smartdigimkt.w3.a.a(gVar, mVar.f39336i);
        if (zA && e(str) && cVar.a() != null) {
            return i4 | 12;
        }
        if (("audio/raw".equals(str) && !this.p1.b(mVar.f39340u)) || !this.p1.b(2)) {
            return 1;
        }
        com.smartdigimkt.a4.e eVar = mVar.f39336i;
        if (eVar != null) {
            z2 = false;
            for (int i5 = 0; i5 < eVar.d; i5++) {
                z2 |= eVar.a(i5).f;
            }
        } else {
            z2 = false;
        }
        com.smartdigimkt.d4.a aVarA = cVar.a(str, z2);
        if (aVarA == null) {
            return (!z2 || cVar.a(str, false) == null) ? 1 : 2;
        }
        if (zA) {
            return ((f0.f37540a < 21 || (((i2 = mVar.t) == -1 || aVarA.b(i2)) && ((i3 = mVar.s) == -1 || aVarA.a(i3)))) ? 4 : 3) | i4 | 8;
        }
        return 2;
    }

    public o(Context context, com.smartdigimkt.d4.c cVar, com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> gVar, boolean z2, Handler handler, g gVar2, h hVar) {
        super(1, cVar, gVar, z2);
        this.n1 = context.getApplicationContext();
        this.p1 = hVar;
        this.o1 = new g.a(handler, gVar2);
        hVar.a(new b());
    }

    @Override // com.smartdigimkt.p4.n
    public v b() {
        return this.p1.b();
    }

    @Override // com.smartdigimkt.d4.b
    public com.smartdigimkt.d4.a a(com.smartdigimkt.d4.c cVar, com.smartdigimkt.w3.m mVar, boolean z2) throws com.smartdigimkt.d4.d.c {
        com.smartdigimkt.d4.a aVarA;
        return (!e(mVar.f) || (aVarA = cVar.a()) == null) ? super.a(cVar, mVar, z2) : aVarA;
    }

    @Override // com.smartdigimkt.d4.b
    public void a(com.smartdigimkt.d4.a aVar, MediaCodec mediaCodec, com.smartdigimkt.w3.m mVar, MediaCrypto mediaCrypto) {
        this.q1 = a(aVar, mVar, q());
        this.s1 = f(aVar.f34432a);
        this.r1 = aVar.g;
        String str = aVar.f34433b;
        if (str == null) {
            str = "audio/raw";
        }
        MediaFormat mediaFormatA = a(mVar, str, this.q1);
        mediaCodec.configure(mediaFormatA, (Surface) null, mediaCrypto, 0);
        if (this.r1) {
            this.t1 = mediaFormatA;
            mediaFormatA.setString("mime", mVar.f);
        } else {
            this.t1 = null;
        }
    }

    @Override // com.smartdigimkt.d4.b
    public void a(String str, long j, long j2) {
        this.o1.a(str, j, j2);
    }

    @Override // com.smartdigimkt.d4.b
    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws com.smartdigimkt.w3.g {
        int iC;
        int[] iArr;
        int i2;
        MediaFormat mediaFormat2 = this.t1;
        if (mediaFormat2 != null) {
            iC = com.smartdigimkt.p4.o.c(mediaFormat2.getString("mime"));
            mediaFormat = this.t1;
        } else {
            iC = this.u1;
        }
        int i3 = iC;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.s1 && integer == 6 && (i2 = this.v1) < 6) {
            iArr = new int[i2];
            for (int i4 = 0; i4 < this.v1; i4++) {
                iArr[i4] = i4;
            }
        } else {
            iArr = null;
        }
        try {
            this.p1.a(i3, integer, integer2, 0, iArr, this.w1, this.x1);
        } catch (h.a e2) {
            throw com.smartdigimkt.w3.g.a(e2, p());
        }
    }

    @Override // com.smartdigimkt.d4.b, com.smartdigimkt.w3.a
    public void a(boolean z2) throws com.smartdigimkt.w3.g {
        super.a(z2);
        this.o1.b(this.W0);
        int i2 = o().f39201a;
        if (i2 != 0) {
            this.p1.c(i2);
        } else {
            this.p1.g();
        }
    }

    @Override // com.smartdigimkt.d4.b, com.smartdigimkt.w3.a
    public void a(long j, boolean z2) throws com.smartdigimkt.w3.g {
        super.a(j, z2);
        this.p1.c();
        this.y1 = j;
        this.z1 = true;
        this.A1 = true;
    }

    @Override // com.smartdigimkt.d4.b, com.smartdigimkt.w3.y
    public boolean a() {
        return super.a() && this.p1.a();
    }

    @Override // com.smartdigimkt.p4.n
    public v a(v vVar) {
        return this.p1.a(vVar);
    }

    @Override // com.smartdigimkt.d4.b
    public void a(com.smartdigimkt.z3.e eVar) {
        if (!this.z1 || eVar.b()) {
            return;
        }
        if (Math.abs(eVar.d - this.y1) > 500000) {
            this.y1 = eVar.d;
        }
        this.z1 = false;
    }

    @Override // com.smartdigimkt.d4.b
    public boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j3, boolean z2) throws com.smartdigimkt.w3.g {
        if (this.r1 && (i3 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i2, false);
            return true;
        }
        if (z2) {
            mediaCodec.releaseOutputBuffer(i2, false);
            this.W0.f++;
            this.p1.h();
            return true;
        }
        try {
            if (!this.p1.a(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i2, false);
            this.W0.f40348e++;
            return true;
        } catch (h.b | h.d e2) {
            throw com.smartdigimkt.w3.g.a(e2, p());
        }
    }

    @Override // com.smartdigimkt.w3.a, com.smartdigimkt.w3.x.b
    public void a(int i2, Object obj) throws com.smartdigimkt.w3.g {
        if (i2 == 2) {
            this.p1.a(((Float) obj).floatValue());
        } else if (i2 != 3) {
            super.a(i2, obj);
        } else {
            this.p1.a((com.smartdigimkt.y3.b) obj);
        }
    }

    public int a(com.smartdigimkt.d4.a aVar, com.smartdigimkt.w3.m mVar, com.smartdigimkt.w3.m[] mVarArr) {
        return a(aVar, mVar);
    }

    private int a(com.smartdigimkt.d4.a aVar, com.smartdigimkt.w3.m mVar) {
        PackageManager packageManager;
        int i2 = f0.f37540a;
        if (i2 >= 24 || !"OMX.google.raw.decoder".equals(aVar.f34432a) || (i2 == 23 && (packageManager = this.n1.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) {
            return mVar.g;
        }
        return -1;
    }

    public MediaFormat a(com.smartdigimkt.w3.m mVar, String str, int i2) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", mVar.s);
        mediaFormat.setInteger("sample-rate", mVar.t);
        com.smartdigimkt.d4.e.a(mediaFormat, mVar.f39335h);
        com.smartdigimkt.d4.e.a(mediaFormat, "max-input-size", i2);
        if (f0.f37540a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        }
        return mediaFormat;
    }

    private static boolean a(com.smartdigimkt.w3.m mVar, com.smartdigimkt.w3.m mVar2) {
        return mVar.f.equals(mVar2.f) && mVar.s == mVar2.s && mVar.t == mVar2.t && mVar.v == 0 && mVar.f39341w == 0 && mVar2.v == 0 && mVar2.f39341w == 0 && mVar.b(mVar2);
    }
}

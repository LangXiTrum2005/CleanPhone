package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends s22 {

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final int[] f20542o1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static boolean f20543p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static boolean f20544q1;
    public final boolean A0;
    public final md0 B0;
    public final boolean C0;
    public final f1 D0;
    public final e1 E0;
    public final md0 F0;
    public final long G0;
    public final g1 H0;
    public final PriorityQueue I0;
    public t0 J0;
    public boolean K0;
    public boolean L0;
    public u1 M0;
    public boolean N0;
    public int O0;
    public List P0;
    public Surface Q0;
    public w0 R0;
    public aq0 S0;
    public boolean T0;
    public int U0;
    public int V0;
    public long W0;
    public int X0;
    public int Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public vz1 f20545a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public long f20546b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f20547c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public long f20548d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f20549e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public long f20550f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public lt f20551g1;
    public lt h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f20552i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f20553j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public d1 f20554k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public long f20555l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f20556m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f20557n1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final Context f20558z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public u0(com.google.android.gms.common.api.internal.t tVar) {
        zl zlVar = (zl) tVar.f11768d;
        b02 b02Var = (b02) tVar.f11767c;
        Context context = (Context) tVar.f11766b;
        super(context.getApplicationContext(), 2, zlVar, b02Var, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f20558z0 = applicationContext;
        this.M0 = null;
        this.B0 = new md0((Handler) tVar.f11769e, (jy1) tVar.f11770f);
        this.A0 = this.M0 == null;
        this.D0 = new f1(applicationContext, this);
        this.E0 = new e1();
        this.C0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.S0 = aq0.f12492c;
        this.U0 = 1;
        this.V0 = 0;
        this.f20551g1 = lt.f17121d;
        this.f20553j1 = 0;
        this.h1 = null;
        this.f20552i1 = -1000;
        this.f20555l1 = C.TIME_UNSET;
        this.F0 = new md0();
        this.I0 = new PriorityQueue();
        this.G0 = -15000L;
        this.H0 = new g1(0);
        this.f20545a1 = null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean A0(String str) {
        boolean z10 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (u0.class) {
            if (!f20543p1) {
                String str2 = Build.MODEL;
                switch (str2.hashCode()) {
                    case -349662828:
                        if (str2.equals("AFTJMST12")) {
                            z10 = true;
                        }
                        break;
                    case -321033677:
                        if (str2.equals("AFTKMST12")) {
                            z10 = true;
                        }
                        break;
                    case 2006354:
                        if (str2.equals("AFTA")) {
                            z10 = true;
                        }
                        break;
                    case 2006367:
                        if (str2.equals("AFTN")) {
                            z10 = true;
                        }
                        break;
                    case 2006371:
                        if (str2.equals("AFTR")) {
                            z10 = true;
                        }
                        break;
                    case 1785421873:
                        if (str2.equals("AFTEU011")) {
                            z10 = true;
                        }
                        break;
                    case 1785421876:
                        if (str2.equals("AFTEU014")) {
                            z10 = true;
                        }
                        break;
                    case 1798172390:
                        if (str2.equals("AFTSO001")) {
                            z10 = true;
                        }
                        break;
                    case 2119412532:
                        if (str2.equals("AFTEUFF014")) {
                            z10 = true;
                        }
                        break;
                }
                f20544q1 = z10;
                f20543p1 = true;
            }
        }
        return f20544q1;
    }

    public static List B0(Context context, b02 b02Var, g22 g22Var, boolean z10, boolean z11) {
        List listA;
        String str = g22Var.f14678o;
        if (str == null) {
            return ya1.f22208e;
        }
        if ("video/dolby-vision".equals(str) && !x10.k(context)) {
            String strD = z22.d(g22Var);
            if (strD == null) {
                listA = ya1.f22208e;
            } else {
                b02Var.getClass();
                listA = z22.a(strD, z10, z11);
            }
            if (!listA.isEmpty()) {
                return listA;
            }
        }
        return z22.b(b02Var, g22Var, z10, z11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP8) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MP4V) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ba, code lost:
    
        if (r3.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c3, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H263) != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w0(com.google.android.gms.internal.ads.p22 r8, com.google.android.gms.internal.ads.g22 r9) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u0.w0(com.google.android.gms.internal.ads.p22, com.google.android.gms.internal.ads.g22):int");
    }

    public static int z0(p22 p22Var, g22 g22Var) {
        int i10 = g22Var.f14679p;
        if (i10 == -1) {
            return w0(p22Var, g22Var);
        }
        List list = g22Var.f14681r;
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return i10 + length;
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final void A(boolean z10, boolean z11) {
        u1 u1Var;
        this.f19796p0 = new xx1(0);
        i();
        xx1 xx1Var = this.f19796p0;
        md0 md0Var = this.B0;
        Handler handler = (Handler) md0Var.f17399b;
        if (handler != null) {
            handler.post(new n1(md0Var, xx1Var, 4));
        }
        boolean z12 = this.N0;
        f1 f1Var = this.D0;
        if (!z12) {
            if (this.P0 != null && this.M0 == null) {
                x0 x0Var = new x0(this.f20558z0, f1Var);
                x0Var.f21656b = true;
                x0Var.f21658d = -this.G0;
                s6 s6Var = this.f20947g;
                s6Var.getClass();
                x0Var.f21661g = s6Var;
                ps1.c0(!x0Var.f21657c);
                if (((a1) x0Var.f21660f) == null) {
                    x0Var.f21660f = new a1();
                }
                c1 c1Var = new c1(x0Var);
                x0Var.f21657c = true;
                c1Var.f12986p = 1;
                SparseArray sparseArray = c1Var.f12974c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    u1Var = (u1) sparseArray.get(0);
                } else {
                    y0 y0Var = new y0(c1Var, c1Var.f12972a);
                    c1Var.f12978g.add(y0Var);
                    sparseArray.put(0, y0Var);
                    u1Var = y0Var;
                }
                this.M0 = u1Var;
            }
            this.N0 = true;
        }
        int i10 = !z11 ? 1 : 0;
        u1 u1Var2 = this.M0;
        if (u1Var2 == null) {
            s6 s6Var2 = this.f20947g;
            s6Var2.getClass();
            f1Var.f14166k = s6Var2;
            f1Var.a(i10);
            return;
        }
        u1Var2.a(new r0(this));
        d1 d1Var = this.f20554k1;
        if (d1Var != null) {
            this.M0.d(d1Var);
        }
        if (this.Q0 != null && !this.S0.equals(aq0.f12492c)) {
            this.M0.f(this.Q0, this.S0);
        }
        this.M0.h(this.V0);
        this.M0.e(this.L);
        List list = this.P0;
        if (list != null) {
            this.M0.i(list);
        }
        this.O0 = i10;
        this.t0 = true;
    }

    @Override // com.google.android.gms.internal.ads.s22, com.google.android.gms.internal.ads.ux1
    public final void B(g22[] g22VarArr, long j10, long j11, r32 r32Var) {
        super.B(g22VarArr, j10, j11, r32Var);
        g1 g1Var = this.H0;
        if (g1Var != null) {
            g1Var.f();
        }
    }

    public final void C0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.Q0;
        md0 md0Var = this.B0;
        if (surface2 == surface) {
            if (surface != null) {
                lt ltVar = this.h1;
                if (ltVar != null) {
                    md0Var.h(ltVar);
                }
                Surface surface3 = this.Q0;
                if (surface3 == null || !this.T0 || (handler = (Handler) md0Var.f17399b) == null) {
                    return;
                }
                handler.post(new q1(md0Var, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.Q0 = surface;
        u1 u1Var = this.M0;
        f1 f1Var = this.D0;
        if (u1Var == null) {
            f1Var.c(surface);
        }
        this.T0 = false;
        int i10 = this.f20948h;
        m22 m22Var = this.N;
        if (m22Var != null && this.M0 == null) {
            p22 p22Var = this.U;
            p22Var.getClass();
            if (!E0(p22Var) || this.K0) {
                G();
                E();
            } else {
                Surface surfaceY0 = y0(p22Var);
                if (surfaceY0 != null) {
                    m22Var.i(surfaceY0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    m22Var.zzo();
                }
            }
        }
        if (surface != null) {
            lt ltVar2 = this.h1;
            if (ltVar2 != null) {
                md0Var.h(ltVar2);
            }
        } else {
            this.h1 = null;
            u1 u1Var2 = this.M0;
            if (u1Var2 != null) {
                u1Var2.zzq();
            }
        }
        if (i10 == 2) {
            u1 u1Var3 = this.M0;
            if (u1Var3 != null) {
                u1Var3.zzw(true);
            } else {
                f1Var.f14164i = true;
                f1Var.f14163h = C.TIME_UNSET;
            }
        }
    }

    public final boolean D0(tx1 tx1Var) {
        if (x() || tx1Var.f(536870912)) {
            return true;
        }
        long j10 = this.f20957r;
        return j10 == C.TIME_UNSET || j10 - (tx1Var.f20524f - this.f19797q0.f19307c) <= 100000;
    }

    public final boolean E0(p22 p22Var) {
        if (this.M0 != null) {
            return true;
        }
        Surface surface = this.Q0;
        if (surface != null && surface.isValid()) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 35 && p22Var.f18459h) {
            return true;
        }
        if (A0(p22Var.f18452a)) {
            return false;
        }
        return !p22Var.f18457f || w0.a();
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final boolean F(p22 p22Var) {
        return E0(p22Var);
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final boolean H() {
        p22 p22Var = this.U;
        if (this.M0 != null && p22Var != null) {
            String str = p22Var.f18452a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.H();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
    @Override // com.google.android.gms.internal.ads.s22
    public final boolean I() {
        boolean z10;
        g22 g22Var = this.O;
        long j10 = this.f20957r;
        if (j10 != C.TIME_UNSET) {
            if (this.f19803v0 + 1 + j10 > Long.MAX_VALUE - (this.f19797q0.f19307c + j10)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        return this.f20545a1 == null || this.f20547c1 || (g22Var != null && g22Var.f14680q > 0) || z10 || this.f19797q0.f19310f != C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void J() {
        super.J();
        this.I0.clear();
        this.Z0 = 0;
        this.f20557n1 = 0;
        this.f20547c1 = false;
        md0 md0Var = this.F0;
        if (md0Var != null) {
            md0Var.f17400c = null;
            ByteBuffer byteBuffer = (ByteBuffer) md0Var.f17399b;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final o22 L(IllegalStateException illegalStateException, p22 p22Var) {
        Surface surface = this.Q0;
        q0 q0Var = new q0(illegalStateException, p22Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return q0Var;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void M(g22 g22Var) throws dy1 {
        u1 u1Var = this.M0;
        if (u1Var == null || u1Var.zze()) {
            return;
        }
        try {
            u1Var.c(g22Var);
        } catch (t1 e10) {
            throw j(e10, g22Var, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void N(tx1 tx1Var) {
        ByteBuffer byteBuffer;
        md0 md0Var = this.F0;
        if (md0Var != null) {
            p22 p22Var = this.U;
            p22Var.getClass();
            if (p22Var.f18453b.equals(MimeTypes.VIDEO_AV1) && tx1Var.f(1) && (byteBuffer = tx1Var.f20523e) != null) {
                int iPosition = byteBuffer.position();
                int i10 = iPosition + UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, i10));
                ByteBuffer byteBuffer2 = (ByteBuffer) md0Var.f17399b;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }
        this.f20557n1 = 0;
        int iO = O(tx1Var);
        if (Build.VERSION.SDK_INT < 34 || (iO & 32) == 0) {
            this.Z0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final int O(tx1 tx1Var) {
        return (Build.VERSION.SDK_INT < 34 || this.f20545a1 == null || tx1Var.f20524f >= this.l || D0(tx1Var)) ? 0 : 32;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00ef A[ADDED_TO_REGION, EDGE_INSN: B:101:0x00ef->B:72:0x00ef BREAK  A[LOOP:0: B:46:0x00a5->B:71:0x00ec], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:90:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0141  */
    /* JADX WARN: Code duplicated, block: B:92:0x0149  */
    @Override // com.google.android.gms.internal.ads.s22
    public final boolean P(tx1 tx1Var) {
        boolean z10;
        ByteBuffer byteBuffer;
        int iLimit;
        b91 b91Var;
        n6 n6Var;
        boolean z11 = false;
        if (!D0(tx1Var)) {
            long j10 = tx1Var.f20524f;
            boolean z12 = j10 < this.l;
            g1 g1Var = this.H0;
            if (g1Var != null) {
                long j11 = g1Var.f14649a;
                long j12 = j11 == C.TIME_UNSET ? -9223372036854775807L : (long) (((j10 - j11) * g1Var.f14651c) + g1Var.f14650b);
                if (j12 == C.TIME_UNSET || j12 >= this.G0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if ((z12 || z10) && !tx1Var.f(268435456)) {
                if (!tx1Var.f(67108864)) {
                    md0 md0Var = this.F0;
                    if (md0Var != null) {
                        ByteBuffer byteBuffer2 = (ByteBuffer) md0Var.f17399b;
                        p22 p22Var = this.U;
                        p22Var.getClass();
                        if (p22Var.f18453b.equals(MimeTypes.VIDEO_AV1) && (byteBuffer = tx1Var.f20523e) != null) {
                            boolean z13 = z12 || this.f20557n1 <= 0;
                            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                            byteBufferAsReadOnlyBuffer.flip();
                            if (byteBuffer2.hasRemaining()) {
                                md0Var.g(v71.f(byteBuffer2));
                                byteBuffer2.position(byteBuffer2.limit());
                            }
                            ArrayList arrayListF = v71.f(byteBufferAsReadOnlyBuffer);
                            md0Var.g(arrayListF);
                            int size = arrayListF.size() - 1;
                            int i10 = 0;
                            while (size >= 0) {
                                n81 n81Var = (n81) arrayListF.get(size);
                                int i11 = n81Var.f17713a;
                                if (i11 != 2 && i11 != 15) {
                                    if (i11 == 3) {
                                        if (!z13) {
                                            break;
                                        }
                                        i11 = 3;
                                        if (i11 != 6) {
                                            n6Var = new n6(b91Var, n81Var);
                                            if (n6Var != null) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                        }
                                        n6Var = new n6(b91Var, n81Var);
                                        if (n6Var != null) {
                                            break;
                                        }
                                        break;
                                        break;
                                    }
                                    if ((i11 != 6 && i11 != 3) || (b91Var = (b91) md0Var.f17400c) == null) {
                                        break;
                                    }
                                    try {
                                        n6Var = new n6(b91Var, n81Var);
                                    } catch (x71 unused) {
                                        n6Var = null;
                                    }
                                    if (n6Var != null || n6Var.f17679b) {
                                        break;
                                    }
                                }
                                if (((n81) arrayListF.get(size)).f17713a == 6 || ((n81) arrayListF.get(size)).f17713a == 3) {
                                    i10++;
                                }
                                size--;
                            }
                            if (i10 > 1 || size + 1 >= 8) {
                                iLimit = byteBufferAsReadOnlyBuffer.limit();
                            } else {
                                iLimit = size >= 0 ? ((n81) arrayListF.get(size)).f17714b.limit() : byteBufferAsReadOnlyBuffer.position();
                            }
                            if (iLimit == 0) {
                                tx1Var.g();
                            } else if (iLimit != byteBufferAsReadOnlyBuffer.limit()) {
                                t0 t0Var = this.J0;
                                t0Var.getClass();
                                if (t0Var.f20105c + iLimit < byteBufferAsReadOnlyBuffer.capacity() && !tx1Var.f(1073741824)) {
                                    ByteBuffer byteBuffer3 = tx1Var.f20523e;
                                    byteBuffer3.getClass();
                                    byteBuffer3.position(iLimit);
                                }
                            }
                        }
                    }
                    if (z11) {
                        if (z12) {
                            this.f19796p0.f22026e++;
                        } else {
                            this.I0.add(Long.valueOf(tx1Var.f20524f));
                            this.f20557n1++;
                        }
                    }
                    return z11;
                }
                tx1Var.g();
                z11 = true;
                if (z11) {
                    if (z12) {
                        this.f19796p0.f22026e++;
                    } else {
                        this.I0.add(Long.valueOf(tx1Var.f20524f));
                        this.f20557n1++;
                    }
                }
                return z11;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final int Q(b02 b02Var, g22 g22Var) {
        boolean z10;
        String str = g22Var.f14678o;
        if (!na.a(str)) {
            return 128;
        }
        int i10 = 0;
        boolean z11 = g22Var.f14682s != null;
        Context context = this.f20558z0;
        List listB0 = B0(context, b02Var, g22Var, z11, false);
        if (z11 && listB0.isEmpty()) {
            listB0 = B0(context, b02Var, g22Var, false, false);
        }
        if (listB0.isEmpty()) {
            return TsExtractor.TS_STREAM_TYPE_AC3;
        }
        if (g22Var.O != 0) {
            return TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        }
        p22 p22Var = (p22) listB0.get(0);
        boolean zB = p22Var.b(context, g22Var);
        if (!zB) {
            int i11 = 1;
            while (true) {
                if (i11 >= listB0.size()) {
                    z10 = true;
                    break;
                }
                p22 p22Var2 = (p22) listB0.get(i11);
                if (p22Var2.b(context, g22Var)) {
                    zB = true;
                    z10 = false;
                    p22Var = p22Var2;
                    break;
                }
                i11++;
            }
        } else {
            z10 = true;
            break;
        }
        int i12 = true != zB ? 3 : 4;
        int i13 = 16;
        int i14 = true != p22Var.c(g22Var) ? 8 : 16;
        int i15 = true != p22Var.f18458g ? 0 : 64;
        int i16 = true != z10 ? 0 : 128;
        if ("video/dolby-vision".equals(str) && !x10.k(context)) {
            i16 = NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (zB) {
            List listB1 = B0(context, b02Var, g22Var, z11, true);
            if (!listB1.isEmpty()) {
                HashMap map = z22.f22480a;
                ArrayList arrayList = new ArrayList(listB1);
                Collections.sort(arrayList, new x22(new iw0(i13, context, g22Var)));
                p22 p22Var3 = (p22) arrayList.get(0);
                if (p22Var3.b(context, g22Var) && p22Var3.c(g22Var)) {
                    i10 = 32;
                }
            }
        }
        return i12 | i14 | i10 | i15 | i16;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final ArrayList R(b02 b02Var, g22 g22Var) {
        Context context = this.f20558z0;
        List listB0 = B0(context, b02Var, g22Var, false, false);
        HashMap map = z22.f22480a;
        ArrayList arrayList = new ArrayList(listB0);
        Collections.sort(arrayList, new x22(new iw0(16, context, g22Var)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final o8 T(p22 p22Var, g22 g22Var, float f10) {
        lq1 lq1Var;
        t0 t0Var;
        Point point;
        int i10;
        int i11;
        int i12;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b10;
        int i13;
        Pair pairB;
        int iW0;
        g22[] g22VarArr = this.f20950j;
        g22VarArr.getClass();
        int length = g22VarArr.length;
        int iZ0 = z0(p22Var, g22Var);
        float f11 = g22Var.f14689z;
        lq1 lq1Var2 = g22Var.E;
        int i14 = g22Var.f14686w;
        int i15 = g22Var.f14685v;
        if (length == 1) {
            if (iZ0 != -1 && (iW0 = w0(p22Var, g22Var)) != -1) {
                iZ0 = Math.min((int) (iZ0 * 1.5f), iW0);
            }
            t0Var = new t0(i15, i14, iZ0, false);
            lq1Var = lq1Var2;
        } else {
            int iMax = i14;
            int iMax2 = i15;
            int i16 = 0;
            boolean z10 = false;
            while (i16 < length) {
                g22 g22Var2 = g22VarArr[i16];
                if (lq1Var2 != null && g22Var2.E == null) {
                    i12 i12Var = new i12(g22Var2);
                    i12Var.D = lq1Var2;
                    g22Var2 = new g22(i12Var);
                }
                yx1 yx1VarD = p22Var.d(g22Var, g22Var2);
                g22[] g22VarArr2 = g22VarArr;
                int i17 = g22Var2.f14686w;
                if (yx1VarD.f22398d != 0) {
                    int i18 = g22Var2.f14685v;
                    b10 = -1;
                    z10 |= i18 == -1 || i17 == -1;
                    iMax2 = Math.max(iMax2, i18);
                    iMax = Math.max(iMax, i17);
                    iZ0 = Math.max(iZ0, z0(p22Var, g22Var2));
                } else {
                    b10 = -1;
                }
                i16++;
                g22VarArr = g22VarArr2;
                length = length;
            }
            if (z10) {
                v71.y("MediaCodecVideoRenderer", l1.d.j(new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length()), iMax2, "Resolutions unknown. Codec max resolution: ", iMax, "x"));
                boolean z11 = i14 > i15;
                int i19 = z11 ? i14 : i15;
                int i20 = true != z11 ? i14 : i15;
                lq1Var = lq1Var2;
                int i21 = 0;
                while (true) {
                    Point pointJ = null;
                    if (i21 < 9) {
                        float f12 = i20;
                        int i22 = i21;
                        float f13 = i19;
                        int i23 = f20542o1[i22];
                        float f14 = i23;
                        if (i23 > i19 && (i10 = (int) (f14 * (f12 / f13))) > i20) {
                            if (true != z11) {
                                i10 = i23;
                            }
                            int i24 = true == z11 ? i23 : i10;
                            boolean z12 = z11;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = p22Var.f18455d;
                            if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                                pointJ = p22.j(videoCapabilities, i10, i24);
                            }
                            point = pointJ;
                            if (point != null) {
                                i11 = i19;
                                i12 = i20;
                                if (p22Var.e(point.x, point.y, f11)) {
                                    break;
                                }
                            } else {
                                i11 = i19;
                                i12 = i20;
                            }
                            i21 = i22 + 1;
                            z11 = z12;
                            i19 = i11;
                            i20 = i12;
                        }
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax2 = Math.max(iMax2, point.x);
                    iMax = Math.max(iMax, point.y);
                    i12 i12Var2 = new i12(g22Var);
                    i12Var2.f15518u = iMax2;
                    i12Var2.f15519v = iMax;
                    iZ0 = Math.max(iZ0, w0(p22Var, new g22(i12Var2)));
                    v71.y("MediaCodecVideoRenderer", l1.d.j(new StringBuilder(com.applovin.impl.ca.e(iMax2, 35) + String.valueOf(iMax).length()), iMax2, "Codec max resolution adjusted to: ", iMax, "x"));
                }
            } else {
                lq1Var = lq1Var2;
            }
            t0Var = new t0(iMax2, iMax, iZ0, false);
        }
        String str = p22Var.f18454c;
        this.J0 = t0Var;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i15);
        mediaFormat.setInteger("height", i14);
        pi1.i(mediaFormat, g22Var.f14681r);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        pi1.t(mediaFormat, "rotation-degrees", g22Var.A);
        if (lq1Var != null) {
            lq1 lq1Var3 = lq1Var;
            pi1.t(mediaFormat, "color-transfer", lq1Var3.f17104c);
            pi1.t(mediaFormat, "color-standard", lq1Var3.f17102a);
            pi1.t(mediaFormat, "color-range", lq1Var3.f17103b);
            byte[] bArr = lq1Var3.f17105d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(g22Var.f14678o) && (pairB = re0.b(g22Var)) != null) {
            pi1.t(mediaFormat, "profile", ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", t0Var.f20103a);
        mediaFormat.setInteger("max-height", t0Var.f20104b);
        pi1.t(mediaFormat, "max-input-size", t0Var.f20105c);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (this.C0) {
            mediaFormat.setInteger("no-post-process", 1);
            i13 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i13 = 0;
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(i13, -this.f20552i1));
        }
        k0(mediaFormat);
        Surface surfaceY0 = y0(p22Var);
        if (this.M0 != null && !uu0.l(this.f20558z0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new o8(p22Var, mediaFormat, g22Var, surfaceY0, null, 9, false);
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final yx1 U(p22 p22Var, g22 g22Var, g22 g22Var2, boolean z10) {
        int i10;
        int i11;
        int i12;
        yx1 yx1VarD = p22Var.d(g22Var, g22Var2);
        int i13 = yx1VarD.f22399e;
        t0 t0Var = this.J0;
        t0Var.getClass();
        if (g22Var2.f14685v > t0Var.f20103a || g22Var2.f14686w > t0Var.f20104b) {
            i13 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (z0(p22Var, g22Var2) > t0Var.f20105c) {
            i13 |= 64;
        }
        if (this.V0 != Integer.MIN_VALUE && (i12 = Build.VERSION.SDK_INT) < 31 && (i12 != 30 || Build.MODEL.startsWith("MiTV"))) {
            float f10 = g22Var.f14689z;
            if (f10 != -1.0f) {
                float f11 = g22Var2.f14689z;
                if (f11 != -1.0f && (!p22Var.f18457f || !z10)) {
                    float fMax = Math.max(f11, f10) / Math.min(f11, f10);
                    if (Math.abs(fMax - Math.round(fMax)) > 0.01f) {
                        i13 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    }
                }
            }
        }
        String str = p22Var.f18452a;
        if (i13 != 0) {
            i11 = 0;
            i10 = i13;
        } else {
            i10 = 0;
            i11 = yx1VarD.f22398d;
        }
        return new yx1(str, g22Var, g22Var2, i11, i10);
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final float W(float f10, g22 g22Var, g22[] g22VarArr) {
        p22 p22Var;
        float fMax = -1.0f;
        for (g22 g22Var2 : g22VarArr) {
            float f11 = g22Var2.f14689z;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f10;
        if (this.f20545a1 == null || (p22Var = this.U) == null) {
            return f12;
        }
        int i10 = g22Var.f14685v;
        int i11 = g22Var.f14686w;
        float f13 = -3.4028235E38f;
        if (p22Var.f18460i) {
            float f14 = p22Var.l;
            if (f14 != -3.4028235E38f && p22Var.f18461j == i10 && p22Var.f18462k == i11) {
                f13 = f14;
            } else {
                f13 = 1024.0f;
                if (!p22Var.e(i10, i11, 1024.0d)) {
                    float f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    while (true) {
                        float f16 = f13 - f15;
                        if (Math.abs(f16) <= 5.0f) {
                            break;
                        }
                        float f17 = (f16 / 2.0f) + f15;
                        boolean zE = p22Var.e(i10, i11, f17);
                        if (true == zE) {
                            f15 = f17;
                        }
                        if (true != zE) {
                            f13 = f17;
                        }
                    }
                    f13 = f15;
                }
                p22Var.l = f13;
                p22Var.f18461j = i10;
                p22Var.f18462k = i11;
            }
        }
        return f12 != -1.0f ? Math.max(f12, f13) : f13;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void X(long j10, long j11, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        md0 md0Var = this.B0;
        Handler handler = (Handler) md0Var.f17399b;
        if (handler != null) {
            str2 = str;
            handler.post(new n1(md0Var, str2, j10, j11));
        } else {
            str2 = str;
        }
        this.K0 = A0(str2);
        p22 p22Var = this.U;
        p22Var.getClass();
        boolean z10 = false;
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9.equals(p22Var.f18453b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = p22Var.f18455d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z10 = true;
                    break;
                }
            }
        }
        this.L0 = z10;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void Y(String str) {
        md0 md0Var = this.B0;
        Handler handler = (Handler) md0Var.f17399b;
        if (handler != null) {
            handler.post(new n1(md0Var, str, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void Z(Exception exc) {
        v71.J("MediaCodecVideoRenderer", "Video codec error", exc);
        md0 md0Var = this.B0;
        Handler handler = (Handler) md0Var.f17399b;
        if (handler != null) {
            handler.post(new n1(md0Var, exc, 3));
        }
    }

    @Override // com.google.android.gms.internal.ads.s22, com.google.android.gms.internal.ads.ux1
    public final void a(long j10, boolean z10, boolean z11) {
        u1 u1Var = this.M0;
        if (u1Var != null && !z10) {
            u1Var.zzg(true);
        }
        if (z11) {
            this.f20546b1 = j10;
        }
        super.a(j10, z10, z11);
        u1 u1Var2 = this.M0;
        f1 f1Var = this.D0;
        if (u1Var2 == null) {
            f1Var.f14157b.e();
            f1Var.f14162g = C.TIME_UNSET;
            f1Var.f14160e = C.TIME_UNSET;
            f1Var.f14159d = Math.min(f1Var.f14159d, 1);
            f1Var.f14163h = C.TIME_UNSET;
            f1Var.f14167m = false;
        }
        g1 g1Var = this.H0;
        if (g1Var != null) {
            g1Var.f();
        }
        if (z10) {
            u1 u1Var3 = this.M0;
            if (u1Var3 != null) {
                u1Var3.zzw(false);
            } else {
                f1Var.f14164i = false;
                f1Var.f14163h = C.TIME_UNSET;
            }
        }
        this.Y0 = 0;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final yx1 a0(f81 f81Var) {
        yx1 yx1VarA0 = super.a0(f81Var);
        g22 g22Var = (g22) f81Var.f14318c;
        g22Var.getClass();
        md0 md0Var = this.B0;
        Handler handler = (Handler) md0Var.f17399b;
        if (handler != null) {
            handler.post(new o1(md0Var, g22Var, yx1VarA0, 0));
        }
        g1 g1Var = this.H0;
        if (g1Var != null) {
            g1Var.f();
        }
        return yx1VarA0;
    }

    @Override // com.google.android.gms.internal.ads.pz1
    public final void b(int i10, Object obj) {
        if (i10 == 1) {
            C0(obj);
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            d1 d1Var = (d1) obj;
            this.f20554k1 = d1Var;
            u1 u1Var = this.M0;
            if (u1Var != null) {
                u1Var.d(d1Var);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f20553j1 != iIntValue) {
                this.f20553j1 = iIntValue;
                return;
            }
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.U0 = iIntValue2;
            m22 m22Var = this.N;
            if (m22Var != null) {
                m22Var.y(iIntValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.V0 = iIntValue3;
            u1 u1Var2 = this.M0;
            if (u1Var2 != null) {
                u1Var2.h(iIntValue3);
                return;
            }
            l1 l1Var = this.D0.f14157b;
            if (l1Var.f16634h == iIntValue3) {
                return;
            }
            l1Var.f16634h = iIntValue3;
            l1Var.g(true);
            return;
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(gr.f14933a)) {
                u1 u1Var3 = this.M0;
                if (u1Var3 == null || !u1Var3.zze()) {
                    return;
                }
                u1Var3.zzf();
                return;
            }
            this.P0 = list;
            u1 u1Var4 = this.M0;
            if (u1Var4 != null) {
                u1Var4.i(list);
                return;
            }
            return;
        }
        if (i10 == 14) {
            obj.getClass();
            aq0 aq0Var = (aq0) obj;
            if (aq0Var.f12493a == 0 || aq0Var.f12494b == 0) {
                return;
            }
            this.S0 = aq0Var;
            u1 u1Var5 = this.M0;
            if (u1Var5 != null) {
                Surface surface = this.Q0;
                surface.getClass();
                u1Var5.f(surface, aq0Var);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                obj.getClass();
                this.f20552i1 = ((Integer) obj).intValue();
                m22 m22Var2 = this.N;
                if (m22Var2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f20552i1));
                    m22Var2.h(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.Q0;
                C0(null);
                obj.getClass();
                ((u0) obj).b(1, surface2);
                break;
            case 18:
                boolean z10 = this.f20545a1 != null;
                vz1 vz1Var = (vz1) obj;
                this.f20545a1 = vz1Var;
                if (z10 != (vz1Var != null)) {
                    l0(this.O);
                }
                break;
            default:
                if (i10 == 11) {
                    sy1 sy1Var = (sy1) obj;
                    sy1Var.getClass();
                    this.J = sy1Var;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void b0(g22 g22Var, MediaFormat mediaFormat) {
        m22 m22Var = this.N;
        if (m22Var != null) {
            m22Var.y(this.U0);
        }
        mediaFormat.getClass();
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f10 = g22Var.B;
        int i10 = g22Var.A;
        if (i10 == 90 || i10 == 270) {
            f10 = 1.0f / f10;
            int i11 = integer2;
            integer2 = integer;
            integer = i11;
        }
        this.f20551g1 = new lt(f10, integer, integer2);
        u1 u1Var = this.M0;
        if (u1Var == null || !this.f20556m1) {
            this.D0.d(g22Var.f14689z);
        } else {
            i12 i12Var = new i12(g22Var);
            i12Var.f15518u = integer;
            i12Var.f15519v = integer2;
            i12Var.A = f10;
            g22 g22Var2 = new g22(i12Var);
            int i12 = this.O0;
            List list = this.P0;
            if (list == null) {
                list = ya1.f22208e;
            }
            u1Var.k(g22Var2, this.f19797q0.f19306b, i12, list);
            this.O0 = 2;
        }
        this.f20556m1 = false;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void c0() {
        u1 u1Var = this.M0;
        if (u1Var != null) {
            u1Var.zzi();
            long j10 = this.f20555l1;
            if (j10 == C.TIME_UNSET) {
                j10 = this.f19797q0.f19306b;
                this.f20555l1 = j10;
            }
            this.M0.j(-j10);
        } else {
            this.D0.a(2);
        }
        this.f20556m1 = true;
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final void d() {
        this.X0 = 0;
        this.f20947g.getClass();
        this.W0 = SystemClock.elapsedRealtime();
        this.f20548d1 = 0L;
        this.f20549e1 = 0;
        u1 u1Var = this.M0;
        if (u1Var != null) {
            u1Var.zza();
        } else {
            this.D0.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    @Override // com.google.android.gms.internal.ads.s22
    public final boolean d0(long j10, long j11, m22 m22Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, g22 g22Var) {
        long jNanoTime;
        d1 d1Var;
        long j13;
        d1 d1Var2;
        int i13;
        m22Var.getClass();
        long j14 = j12 - this.f19797q0.f19307c;
        int i14 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.I0;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j12) {
                break;
            }
            priorityQueue.poll();
            i14++;
        }
        s0(i14, 0);
        u1 u1Var = this.M0;
        if (u1Var != null) {
            if (!z10 || z11) {
                return u1Var.g(j12, new s0(this, m22Var, i10, j14));
            }
            x0(m22Var, i10);
            return true;
        }
        long j15 = this.f19797q0.f19306b;
        f1 f1Var = this.D0;
        e1 e1Var = this.E0;
        int iF = f1Var.f(j12, j10, j11, j15, z10, z11, e1Var);
        g1 g1Var = this.H0;
        if (g1Var == null) {
            if (iF != 0) {
                this.f20947g.getClass();
                jNanoTime = System.nanoTime();
                d1Var = this.f20554k1;
                if (d1Var != null) {
                    d1Var.a(j14, jNanoTime, g22Var, this.P);
                }
                u0(m22Var, i10, jNanoTime);
                t0(e1Var.f13801a);
                return true;
            }
            if (iF != 1) {
                j13 = e1Var.f13802b;
                long j16 = e1Var.f13801a;
                if (j13 == this.f20550f1) {
                    x0(m22Var, i10);
                } else {
                    d1Var2 = this.f20554k1;
                    if (d1Var2 != null) {
                        i13 = i10;
                        d1Var2.a(j14, j13, g22Var, this.P);
                    } else {
                        i13 = i10;
                    }
                    u0(m22Var, i13, j13);
                }
                t0(j16);
                this.f20550f1 = j13;
                return true;
            }
            if (iF != 2) {
                Trace.beginSection("dropVideoBuffer");
                m22Var.zzc(i10);
                Trace.endSection();
                s0(0, 1);
                t0(e1Var.f13801a);
                return true;
            }
            if (iF == 3) {
                x0(m22Var, i10);
                t0(e1Var.f13801a);
                return true;
            }
        } else if (iF != 5 && iF != 4) {
            g1Var.d(j12, e1Var.f13801a);
            if (iF != 0) {
                this.f20947g.getClass();
                jNanoTime = System.nanoTime();
                d1Var = this.f20554k1;
                if (d1Var != null) {
                    d1Var.a(j14, jNanoTime, g22Var, this.P);
                }
                u0(m22Var, i10, jNanoTime);
                t0(e1Var.f13801a);
                return true;
            }
            if (iF != 1) {
                j13 = e1Var.f13802b;
                long j17 = e1Var.f13801a;
                if (j13 == this.f20550f1) {
                    x0(m22Var, i10);
                } else {
                    d1Var2 = this.f20554k1;
                    if (d1Var2 != null) {
                        i13 = i10;
                        d1Var2.a(j14, j13, g22Var, this.P);
                    } else {
                        i13 = i10;
                    }
                    u0(m22Var, i13, j13);
                }
                t0(j17);
                this.f20550f1 = j13;
                return true;
            }
            if (iF != 2) {
                Trace.beginSection("dropVideoBuffer");
                m22Var.zzc(i10);
                Trace.endSection();
                s0(0, 1);
                t0(e1Var.f13801a);
                return true;
            }
            if (iF == 3) {
                x0(m22Var, i10);
                t0(e1Var.f13801a);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final void e() {
        int i10 = this.X0;
        md0 md0Var = this.B0;
        if (i10 > 0) {
            this.f20947g.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.W0;
            int i11 = this.X0;
            Handler handler = (Handler) md0Var.f17399b;
            if (handler != null) {
                handler.post(new p1(md0Var, i11, j10, 0));
            }
            this.X0 = 0;
            this.W0 = jElapsedRealtime;
        }
        int i12 = this.f20549e1;
        if (i12 != 0) {
            long j11 = this.f20548d1;
            Handler handler2 = (Handler) md0Var.f17399b;
            if (handler2 != null) {
                handler2.post(new n1(md0Var, j11, i12));
            }
            this.f20548d1 = 0L;
            this.f20549e1 = 0;
        }
        u1 u1Var = this.M0;
        if (u1Var != null) {
            u1Var.zzb();
        } else {
            f1 f1Var = this.D0;
            f1Var.f14158c = false;
            f1Var.f14163h = C.TIME_UNSET;
            l1 l1Var = f1Var.f14157b;
            l1Var.f16628b = false;
            h1 h1Var = (h1) l1Var.f16644s;
            if (h1Var != null) {
                h1Var.h();
            }
            l1Var.h();
        }
        g1 g1Var = this.H0;
        if (g1Var != null) {
            g1Var.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void e0(wx1 wx1Var) {
        md0 md0Var = this.B0;
        Handler handler = (Handler) md0Var.f17399b;
        if (handler != null) {
            handler.post(new zd1(3, md0Var, wx1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.s22, com.google.android.gms.internal.ads.ux1
    public final void f() {
        xx1 xx1Var;
        md0 md0Var = this.B0;
        this.h1 = null;
        this.T0 = false;
        this.f20547c1 = true;
        try {
            super.f();
            xx1Var = this.f19796p0;
            md0Var.getClass();
            synchronized (xx1Var) {
            }
        } finally {
            xx1Var = this.f19796p0;
            md0Var.getClass();
            synchronized (xx1Var) {
                Handler handler = (Handler) md0Var.f17399b;
                if (handler != null) {
                    handler.post(new zd1(2, md0Var, xx1Var));
                }
                md0Var.h(lt.f17121d);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void f0() {
        u1 u1Var = this.M0;
        if (u1Var != null) {
            u1Var.zzi();
        } else {
            long j10 = this.f19797q0.f19310f;
        }
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final void g() {
        try {
            try {
                this.f19783b0 = false;
                i0();
                G();
                this.I = null;
                this.N0 = false;
                this.f20555l1 = C.TIME_UNSET;
                w0 w0Var = this.R0;
                if (w0Var != null) {
                    w0Var.release();
                    this.R0 = null;
                }
            } catch (Throwable th2) {
                this.I = null;
                throw th2;
            }
        } catch (Throwable th3) {
            this.N0 = false;
            this.f20555l1 = C.TIME_UNSET;
            w0 w0Var2 = this.R0;
            if (w0Var2 != null) {
                w0Var2.release();
                this.R0 = null;
            }
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final void h() {
        u1 u1Var = this.M0;
        if (u1Var == null || !this.A0) {
            return;
        }
        u1Var.zzx();
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void h0(tx1 tx1Var) {
        if (this.L0) {
            ByteBuffer byteBuffer = tx1Var.f20525g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        m22 m22Var = this.N;
                        m22Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        m22Var.h(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void j0(long j10) {
        super.j0(j10);
        this.Z0--;
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final String l() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final boolean m(long j10) {
        if (this.f19791k0 == C.TIME_UNSET || j10 < this.f20546b1) {
            return false;
        }
        long j11 = this.r0;
        return j11 == C.TIME_UNSET || j10 > j11;
    }

    @Override // com.google.android.gms.internal.ads.s22, com.google.android.gms.internal.ads.ux1
    public final void n(float f10, float f11) {
        super.n(f10, f11);
        u1 u1Var = this.M0;
        if (u1Var != null) {
            u1Var.e(f10);
        } else {
            this.D0.g(f10);
        }
        g1 g1Var = this.H0;
        if (g1Var != null) {
            g1Var.e(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final void o() {
        u1 u1Var = this.M0;
        if (u1Var == null) {
            f1 f1Var = this.D0;
            if (f1Var.f14159d == 0) {
                f1Var.f14159d = 1;
                return;
            }
            return;
        }
        int i10 = this.O0;
        if (i10 == 0 || i10 == 1) {
            this.O0 = 0;
        } else {
            u1Var.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.s22, com.google.android.gms.internal.ads.ux1
    public final void p(long j10, long j11) throws dy1 {
        u1 u1Var = this.M0;
        if (u1Var != null) {
            try {
                u1Var.b(j10, j11);
            } catch (t1 e10) {
                throw j(e10, e10.f20109a, false, 7001);
            }
        }
        super.p(j10, j11);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // com.google.android.gms.internal.ads.ux1
    public final boolean q() {
        boolean zZza;
        boolean z10 = false;
        if (this.F != null) {
            if (x()) {
                zZza = this.f20953n;
            } else {
                o42 o42Var = this.f20949i;
                o42Var.getClass();
                zZza = o42Var.zza();
            }
            if (zZza) {
                z10 = true;
            } else {
                if (this.Z >= 0) {
                    z10 = true;
                } else if (this.X != C.TIME_UNSET) {
                    this.f20947g.getClass();
                    if (SystemClock.elapsedRealtime() < this.X) {
                        z10 = true;
                    }
                }
            }
        }
        u1 u1Var = this.M0;
        if (u1Var != null) {
            return u1Var.zzh(z10);
        }
        if (z10 && this.N == null) {
            return true;
        }
        return this.D0.e(z10);
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final boolean r() {
        if (!this.f19794n0) {
            return false;
        }
        u1 u1Var = this.M0;
        return u1Var == null || u1Var.zzj();
    }

    public final void s0(int i10, int i11) {
        xx1 xx1Var = this.f19796p0;
        xx1Var.f22030i += i10;
        int i12 = i10 + i11;
        xx1Var.f22029h += i12;
        this.X0 += i12;
        int i13 = this.Y0 + i12;
        this.Y0 = i13;
        xx1Var.f22031j = Math.max(i13, xx1Var.f22031j);
    }

    public final void t0(long j10) {
        xx1 xx1Var = this.f19796p0;
        xx1Var.l += j10;
        xx1Var.f22033m++;
        this.f20548d1 += j10;
        this.f20549e1++;
    }

    public final void u0(m22 m22Var, int i10, long j10) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        m22Var.s(i10, j10);
        Trace.endSection();
        this.f19796p0.f22027f++;
        this.Y0 = 0;
        if (this.M0 == null) {
            lt ltVar = this.f20551g1;
            boolean zEquals = ltVar.equals(lt.f17121d);
            md0 md0Var = this.B0;
            if (!zEquals && !ltVar.equals(this.h1)) {
                this.h1 = ltVar;
                md0Var.h(ltVar);
            }
            f1 f1Var = this.D0;
            int i11 = f1Var.f14159d;
            f1Var.f14159d = 3;
            f1Var.f14166k.getClass();
            f1Var.f14161f = uu0.t(SystemClock.elapsedRealtime());
            if (i11 == 3 || (surface = this.Q0) == null) {
                return;
            }
            Handler handler = (Handler) md0Var.f17399b;
            if (handler != null) {
                handler.post(new q1(md0Var, surface, SystemClock.elapsedRealtime()));
            }
            this.T0 = true;
        }
    }

    public final boolean v0(long j10, long j11, boolean z10, boolean z11) {
        if (this.M0 != null && this.A0) {
            j11 -= -this.f20555l1;
        }
        if (j10 < -500000 && !z10) {
            o42 o42Var = this.f20949i;
            o42Var.getClass();
            int iA = o42Var.a(j11 - this.f20951k);
            if (iA != 0) {
                this.f20546b1 = j11;
                PriorityQueue priorityQueue = this.I0;
                if (z11) {
                    xx1 xx1Var = this.f19796p0;
                    int i10 = xx1Var.f22026e + iA;
                    xx1Var.f22026e = i10;
                    xx1Var.f22028g += this.Z0;
                    xx1Var.f22026e = priorityQueue.size() + i10;
                } else {
                    this.f19796p0.f22032k++;
                    s0(priorityQueue.size() + iA, this.Z0);
                }
                if (this.N != null) {
                    if (H()) {
                        G();
                        E();
                    } else if (I()) {
                        C();
                    } else {
                        this.f19801u0 = true;
                    }
                }
                u1 u1Var = this.M0;
                if (u1Var != null) {
                    u1Var.zzg(false);
                }
                return true;
            }
        }
        return false;
    }

    public final void x0(m22 m22Var, int i10) {
        Trace.beginSection("skipVideoBuffer");
        m22Var.zzc(i10);
        Trace.endSection();
        this.f19796p0.f22028g++;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Surface y0(p22 p22Var) {
        boolean z10;
        v0 v0Var;
        int i10;
        RuntimeException runtimeException;
        Error error;
        u1 u1Var = this.M0;
        if (u1Var != null) {
            return u1Var.zzk();
        }
        Surface surface = this.Q0;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && p22Var.f18459h) {
            return null;
        }
        boolean z11 = false;
        ps1.c0(!A0(p22Var.f18452a) && (!p22Var.f18457f || w0.a()));
        w0 w0Var = this.R0;
        if (w0Var != null) {
            if (w0Var.f21333a != p22Var.f18457f && w0Var != null) {
                w0Var.release();
                this.R0 = null;
            }
        }
        if (this.R0 == null) {
            boolean z12 = p22Var.f18457f;
            if (z12) {
                if (!w0.a()) {
                    z10 = false;
                }
                ps1.c0(z10);
                v0Var = new v0("ExoPlayer:PlaceholderSurface", 0);
                if (z12) {
                    i10 = w0.f21331d;
                } else {
                    i10 = 0;
                }
                v0Var.start();
                Handler handler = new Handler(v0Var.getLooper(), v0Var);
                v0Var.f20979b = handler;
                v0Var.f20982e = new yg0(handler);
                synchronized (v0Var) {
                    v0Var.f20979b.obtainMessage(1, i10, 0).sendToTarget();
                    while (((w0) v0Var.f20983f) == null && v0Var.f20981d == null && v0Var.f20980c == null) {
                        try {
                            v0Var.wait();
                        } catch (InterruptedException unused) {
                            z11 = true;
                        }
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = v0Var.f20981d;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = v0Var.f20980c;
                if (error == null) {
                    throw error;
                }
                w0 w0Var2 = (w0) v0Var.f20983f;
                w0Var2.getClass();
                this.R0 = w0Var2;
            } else {
                int i11 = w0.f21331d;
            }
            z10 = true;
            ps1.c0(z10);
            v0Var = new v0("ExoPlayer:PlaceholderSurface", 0);
            if (z12) {
                i10 = w0.f21331d;
            } else {
                i10 = 0;
            }
            v0Var.start();
            Handler handler2 = new Handler(v0Var.getLooper(), v0Var);
            v0Var.f20979b = handler2;
            v0Var.f20982e = new yg0(handler2);
            synchronized (v0Var) {
                v0Var.f20979b.obtainMessage(1, i10, 0).sendToTarget();
                while (((w0) v0Var.f20983f) == null) {
                    v0Var.wait();
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = v0Var.f20981d;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = v0Var.f20980c;
                if (error == null) {
                    throw error;
                }
                w0 w0Var3 = (w0) v0Var.f20983f;
                w0Var3.getClass();
                this.R0 = w0Var3;
            }
        }
        return this.R0;
    }
}

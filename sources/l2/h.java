package l2;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
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
import com.google.android.gms.internal.ads.e1;
import com.google.android.gms.internal.ads.g1;
import com.google.android.gms.internal.ads.h1;
import com.google.android.gms.internal.ads.l1;
import com.google.android.gms.internal.ads.t0;
import com.google.android.gms.internal.ads.v0;
import com.google.android.gms.internal.ads.x0;
import com.google.android.gms.internal.ads.xx1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import f2.c0;
import f2.c1;
import i1.d0;
import i1.n0;
import i1.p0;
import i1.y0;
import i1.z0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import m0.s1;
import oa.f0;
import oa.j0;
import oa.n1;
import p1.d1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends y1.p {

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final int[] f44867w1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static boolean f44868x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static boolean f44869y1;
    public final Context E0;
    public final boolean F0;
    public final v G0;
    public final int H0;
    public final boolean I0;
    public final q J0;
    public final e1 K0;
    public final long L0;
    public final g1 M0;
    public final PriorityQueue N0;
    public t0 O0;
    public boolean P0;
    public boolean Q0;
    public z R0;
    public boolean S0;
    public int T0;
    public List U0;
    public Surface V0;
    public i W0;
    public l1.r X0;
    public boolean Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f44870a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public long f44871b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int f44872c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f44873d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f44874e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public d1 f44875f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public long f44876g1;
    public boolean h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public long f44877i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f44878j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public long f44879k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public z0 f44880l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public z0 f44881m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f44882n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f44883o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f44884p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public h9.h f44885q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public p f44886r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public long f44887s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public long f44888t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public boolean f44889u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public int f44890v1;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(g gVar) {
        Context context = gVar.f44860a;
        super(context.getApplicationContext(), 2, gVar.f44862c, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.E0 = applicationContext;
        this.H0 = gVar.f44866g;
        this.R0 = null;
        this.G0 = new v(gVar.f44864e, gVar.f44865f, 0);
        this.F0 = this.R0 == null;
        this.J0 = new q(applicationContext, this, gVar.f44863d);
        this.K0 = new e1();
        this.I0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.X0 = l1.r.f44816c;
        this.Z0 = 1;
        this.f44870a1 = 0;
        this.f44880l1 = z0.f42722d;
        this.f44884p1 = 0;
        this.f44881m1 = null;
        this.f44882n1 = -1000;
        this.f44887s1 = C.TIME_UNSET;
        this.f44888t1 = C.TIME_UNSET;
        this.N0 = new PriorityQueue();
        this.L0 = C.TIME_UNSET;
        this.M0 = null;
        this.f44875f1 = null;
    }

    public static boolean A0(String str) {
        boolean z10 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            try {
                if (!f44868x1) {
                    String str2 = Build.MODEL;
                    str2.getClass();
                    switch (str2) {
                        case "AFTJMST12":
                        case "AFTKMST12":
                        case "AFTA":
                        case "AFTN":
                        case "AFTR":
                        case "AFTEU011":
                        case "AFTEU014":
                        case "AFTSO001":
                        case "AFTEUFF014":
                            z10 = true;
                            break;
                    }
                    f44869y1 = z10;
                    f44868x1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f44869y1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    public static int B0(y1.m mVar, i1.p pVar) {
        int i10 = pVar.f42650u;
        int i11 = pVar.f42651v;
        if (i10 != -1 && i11 != -1) {
            String str = pVar.f42643n;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairC = l1.c.c(pVar);
                if (pairC == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairC.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = MimeTypes.VIDEO_AV1;
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i10 * i11) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i10 * i11) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !mVar.f54132f)))) {
                        return ((l1.y.g(i11, 16) * l1.y.g(i10, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i10 * i11) * 3) / 8;
            }
        }
        return -1;
    }

    public static List C0(Context context, y1.g gVar, i1.p pVar, boolean z10, boolean z11) {
        String str = pVar.f42643n;
        if (str == null) {
            return n1.f47281e;
        }
        if ("video/dolby-vision".equals(str) && !go.c.p(context)) {
            String strC = y1.u.c(pVar);
            List listB = strC == null ? n1.f47281e : gVar.b(strC, z10, z11);
            if (!listB.isEmpty()) {
                return listB;
            }
        }
        return y1.u.g(gVar, pVar, z10, z11);
    }

    public static int D0(y1.m mVar, i1.p pVar) {
        int i10 = pVar.f42644o;
        List list = pVar.f42646q;
        if (i10 == -1) {
            return B0(mVar, pVar);
        }
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return pVar.f42644o + length;
    }

    @Override // p1.a
    public final boolean C(long j10) {
        if (this.f54160n0 == C.TIME_UNSET || j10 < this.f44876g1) {
            return false;
        }
        long j11 = this.f54170v0;
        return j11 == C.TIME_UNSET || j10 > j11;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Surface E0(y1.m mVar) {
        boolean z10;
        v0 v0Var;
        int i10;
        RuntimeException runtimeException;
        Error error;
        z zVar = this.R0;
        if (zVar != null) {
            return zVar.k();
        }
        Surface surface = this.V0;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && mVar.f54134h) {
            return null;
        }
        go.k.t(M0(mVar));
        i iVar = this.W0;
        if (iVar != null && iVar.f44893a != mVar.f54132f && iVar != null) {
            iVar.release();
            this.W0 = null;
        }
        if (this.W0 == null) {
            boolean z11 = mVar.f54132f;
            boolean z12 = false;
            if (z11) {
                if (!i.a()) {
                    z10 = false;
                }
                go.k.t(z10);
                v0Var = new v0("ExoPlayer:PlaceholderSurface", 1);
                if (z11) {
                    i10 = i.f44891d;
                } else {
                    i10 = 0;
                }
                v0Var.start();
                Handler handler = new Handler(v0Var.getLooper(), v0Var);
                v0Var.f20979b = handler;
                v0Var.f20982e = new l1.h(handler);
                synchronized (v0Var) {
                    v0Var.f20979b.obtainMessage(1, i10, 0).sendToTarget();
                    while (((i) v0Var.f20983f) == null && v0Var.f20981d == null && v0Var.f20980c == null) {
                        try {
                            v0Var.wait();
                        } catch (InterruptedException unused) {
                            z12 = true;
                        }
                    }
                }
                if (z12) {
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
                i iVar2 = (i) v0Var.f20983f;
                iVar2.getClass();
                this.W0 = iVar2;
            } else {
                int i11 = i.f44891d;
            }
            z10 = true;
            go.k.t(z10);
            v0Var = new v0("ExoPlayer:PlaceholderSurface", 1);
            if (z11) {
                i10 = i.f44891d;
            } else {
                i10 = 0;
            }
            v0Var.start();
            Handler handler2 = new Handler(v0Var.getLooper(), v0Var);
            v0Var.f20979b = handler2;
            v0Var.f20982e = new l1.h(handler2);
            synchronized (v0Var) {
                v0Var.f20979b.obtainMessage(1, i10, 0).sendToTarget();
                while (((i) v0Var.f20983f) == null) {
                    v0Var.wait();
                }
                if (z12) {
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
                i iVar3 = (i) v0Var.f20983f;
                iVar3.getClass();
                this.W0 = iVar3;
            }
        }
        return this.W0;
    }

    @Override // y1.p
    public final p1.c F(y1.m mVar, i1.p pVar, i1.p pVar2) {
        p1.c cVarB = mVar.b(pVar, pVar2);
        int i10 = cVarB.f47975e;
        t0 t0Var = this.O0;
        t0Var.getClass();
        if (pVar2.f42650u > t0Var.f20103a || pVar2.f42651v > t0Var.f20104b) {
            i10 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (D0(mVar, pVar2) > t0Var.f20105c) {
            i10 |= 64;
        }
        if (this.f44870a1 != Integer.MIN_VALUE) {
            float f10 = pVar.f42654y;
            if (f10 != -1.0f) {
                float f11 = pVar2.f42654y;
                if (f11 != -1.0f && Math.abs(f11 - f10) > 1.0f && Build.VERSION.SDK_INT == 30 && Build.MODEL.startsWith("MiTV")) {
                    i10 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                }
            }
        }
        int i11 = i10;
        return new p1.c(mVar.f54127a, pVar, pVar2, i11 != 0 ? 0 : cVarB.f47974d, i11);
    }

    public final boolean F0(y1.m mVar) {
        if (this.R0 != null) {
            return true;
        }
        Surface surface = this.V0;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && mVar.f54134h) || M0(mVar);
        }
        return true;
    }

    @Override // y1.p
    public final y1.l G(IllegalStateException illegalStateException, y1.m mVar) {
        Surface surface = this.V0;
        d dVar = new d(illegalStateException, mVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return dVar;
    }

    public final boolean G0(o1.d dVar) {
        if (i() || dVar.c(536870912)) {
            return true;
        }
        long j10 = this.f44888t1;
        return j10 == C.TIME_UNSET || j10 - (dVar.f47037g - this.f54168u0.f54145c) <= 100000;
    }

    public final void H0() {
        if (this.f44872c1 > 0) {
            this.f47911g.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f44871b1;
            int i10 = this.f44872c1;
            v vVar = this.G0;
            Handler handler = vVar.f44941a;
            if (handler != null) {
                handler.post(new t(vVar, i10, j10));
            }
            this.f44872c1 = 0;
            this.f44871b1 = jElapsedRealtime;
        }
    }

    public final void I0() {
        y1.j jVar;
        if (this.f44883o1 && (jVar = this.N) != null) {
            this.f44885q1 = new h9.h(this, jVar);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                jVar.b(bundle);
            }
        }
    }

    public final void J0(y1.j jVar, int i10, long j10) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        jVar.v(i10, j10);
        Trace.endSection();
        this.t0.f22027f++;
        this.f44873d1 = 0;
        if (this.R0 == null) {
            z0 z0Var = this.f44880l1;
            boolean zEquals = z0Var.equals(z0.f42722d);
            v vVar = this.G0;
            if (!zEquals && !z0Var.equals(this.f44881m1)) {
                this.f44881m1 = z0Var;
                vVar.b(z0Var);
            }
            q qVar = this.J0;
            boolean z10 = qVar.f44926e != 3;
            qVar.f44926e = 3;
            qVar.l.getClass();
            qVar.f44928g = l1.y.M(SystemClock.elapsedRealtime());
            if (!z10 || (surface = this.V0) == null) {
                return;
            }
            Handler handler = vVar.f44941a;
            if (handler != null) {
                handler.post(new cj.l(vVar, surface, SystemClock.elapsedRealtime(), 5));
            }
            this.Y0 = true;
        }
    }

    public final void K0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.V0;
        v vVar = this.G0;
        if (surface2 == surface) {
            if (surface != null) {
                z0 z0Var = this.f44881m1;
                if (z0Var != null) {
                    vVar.b(z0Var);
                }
                Surface surface3 = this.V0;
                if (surface3 == null || !this.Y0 || (handler = vVar.f44941a) == null) {
                    return;
                }
                handler.post(new cj.l(vVar, surface3, SystemClock.elapsedRealtime(), 5));
                return;
            }
            return;
        }
        this.V0 = surface;
        z zVar = this.R0;
        q qVar = this.J0;
        if (zVar == null) {
            qVar.g(surface);
        }
        this.Y0 = false;
        int i10 = this.f47912h;
        y1.j jVar = this.N;
        if (jVar != null && this.R0 == null) {
            y1.m mVar = this.U;
            mVar.getClass();
            if (!F0(mVar) || this.P0) {
                k0();
                U();
            } else {
                Surface surfaceE0 = E0(mVar);
                if (surfaceE0 != null) {
                    jVar.r(surfaceE0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    jVar.l();
                }
            }
        }
        if (surface != null) {
            z0 z0Var2 = this.f44881m1;
            if (z0Var2 != null) {
                vVar.b(z0Var2);
            }
        } else {
            this.f44881m1 = null;
            z zVar2 = this.R0;
            if (zVar2 != null) {
                zVar2.q();
            }
        }
        if (i10 == 2) {
            z zVar3 = this.R0;
            if (zVar3 != null) {
                zVar3.t(true);
            } else {
                qVar.c(true);
            }
        }
        I0();
    }

    @Override // y1.p
    public final int L(o1.d dVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f44875f1 == null && !this.f44883o1) || dVar.f47037g >= this.l || G0(dVar)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean L0(long j10, long j11, boolean z10, boolean z11) {
        if (this.R0 != null && this.F0) {
            j11 -= -this.f44887s1;
        }
        if (j10 < -500000 && !z10) {
            c1 c1Var = this.f47913i;
            c1Var.getClass();
            int iSkipData = c1Var.skipData(j11 - this.f47915k);
            if (iSkipData != 0) {
                this.f44876g1 = j11;
                PriorityQueue priorityQueue = this.N0;
                if (z11) {
                    xx1 xx1Var = this.t0;
                    int i10 = xx1Var.f22026e + iSkipData;
                    xx1Var.f22026e = i10;
                    xx1Var.f22028g += this.f44874e1;
                    xx1Var.f22026e = priorityQueue.size() + i10;
                } else {
                    this.t0.f22032k++;
                    O0(priorityQueue.size() + iSkipData, this.f44874e1);
                }
                if (this.N != null) {
                    if (u0()) {
                        k0();
                        U();
                    } else if (s0()) {
                        J();
                    } else {
                        this.f54176y0 = true;
                    }
                }
                z zVar = this.R0;
                if (zVar != null) {
                    zVar.r(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // y1.p
    public final float M(float f10, i1.p pVar, i1.p[] pVarArr) {
        y1.m mVar;
        float fMax = -1.0f;
        for (i1.p pVar2 : pVarArr) {
            float f11 = pVar2.f42654y;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f10;
        if (this.f44875f1 == null || (mVar = this.U) == null) {
            return f12;
        }
        int i10 = pVar.f42650u;
        int i11 = pVar.f42651v;
        float f13 = -3.4028235E38f;
        if (mVar.f54135i) {
            float f14 = mVar.l;
            if (f14 != -3.4028235E38f && mVar.f54136j == i10 && mVar.f54137k == i11) {
                f13 = f14;
            } else {
                float f15 = 1024.0f;
                if (!mVar.g(i10, i11, 1024.0f)) {
                    f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    while (true) {
                        float f16 = f15 - f13;
                        if (Math.abs(f16) <= 5.0f) {
                            break;
                        }
                        float f17 = (f16 / 2.0f) + f13;
                        if (mVar.g(i10, i11, f17)) {
                            f13 = f17;
                        } else {
                            f15 = f17;
                        }
                    }
                } else {
                    f13 = 1024.0f;
                }
                mVar.l = f13;
                mVar.f54136j = i10;
                mVar.f54137k = i11;
            }
        }
        return f12 != -1.0f ? Math.max(f12, f13) : f13;
    }

    public final boolean M0(y1.m mVar) {
        if (this.f44883o1 || A0(mVar.f54127a)) {
            return false;
        }
        return !mVar.f54132f || i.a();
    }

    @Override // y1.p
    public final ArrayList N(y1.g gVar, i1.p pVar, boolean z10) {
        boolean z11 = this.f44883o1;
        Context context = this.E0;
        List listC0 = C0(context, gVar, pVar, z10, z11);
        HashMap map = y1.u.f54183a;
        ArrayList arrayList = new ArrayList(listC0);
        Collections.sort(arrayList, new y1.q(new tb.n(3, context, pVar)));
        return arrayList;
    }

    public final void N0(y1.j jVar, int i10) {
        Trace.beginSection("skipVideoBuffer");
        jVar.t(i10);
        Trace.endSection();
        this.t0.f22028g++;
    }

    public final void O0(int i10, int i11) {
        xx1 xx1Var = this.t0;
        xx1Var.f22030i += i10;
        int i12 = i10 + i11;
        xx1Var.f22029h += i12;
        this.f44872c1 += i12;
        int i13 = this.f44873d1 + i12;
        this.f44873d1 = i13;
        xx1Var.f22031j = Math.max(i13, xx1Var.f22031j);
        int i14 = this.H0;
        if (i14 <= 0 || this.f44872c1 < i14) {
            return;
        }
        H0();
    }

    public final void P0(c0 c0Var) {
        p0 p0Var = this.f47919p;
        if (p0Var.p()) {
            this.f44888t1 = C.TIME_UNSET;
            return;
        }
        int iB = p0Var.b(c0Var.f40307a);
        if (iB == -1) {
            this.f44888t1 = C.TIME_UNSET;
        } else {
            this.f44888t1 = p0Var.f(iB, new n0(), false).f42585d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x013d  */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x013d, please report this as an issue */
    @Override // y1.p
    public final com.google.android.gms.internal.consent_sdk.x Q(y1.m mVar, i1.p pVar, MediaCrypto mediaCrypto, float f10) {
        i1.h hVar;
        int i10;
        t0 t0Var;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b10;
        boolean z10;
        Pair pairC;
        int iB0;
        String str = mVar.f54129c;
        i1.p[] pVarArr = this.f47914j;
        pVarArr.getClass();
        int i11 = pVar.f42650u;
        float f11 = pVar.f42654y;
        i1.h hVar2 = pVar.D;
        int i12 = pVar.f42651v;
        int iD0 = D0(mVar, pVar);
        if (pVarArr.length == 1) {
            if (iD0 != -1 && (iB0 = B0(mVar, pVar)) != -1) {
                iD0 = Math.min((int) (iD0 * 1.5f), iB0);
            }
            t0Var = new t0(i11, i12, iD0, false);
            hVar = hVar2;
            i10 = i12;
        } else {
            int length = pVarArr.length;
            int iMax = i11;
            int iMax2 = i12;
            int i13 = 0;
            boolean z11 = false;
            while (i13 < length) {
                i1.p pVar2 = pVarArr[i13];
                i1.p[] pVarArr2 = pVarArr;
                if (hVar2 != null && pVar2.D == null) {
                    i1.o oVarA = pVar2.a();
                    oVarA.C = hVar2;
                    pVar2 = new i1.p(oVarA);
                }
                p1.c cVarB = mVar.b(pVar, pVar2);
                int i14 = length;
                int i15 = pVar2.f42651v;
                if (cVarB.f47974d != 0) {
                    int i16 = pVar2.f42650u;
                    b10 = -1;
                    z11 |= i16 == -1 || i15 == -1;
                    iMax = Math.max(iMax, i16);
                    iMax2 = Math.max(iMax2, i15);
                    iD0 = Math.max(iD0, D0(mVar, pVar2));
                } else {
                    b10 = -1;
                }
                length = i14;
                i13++;
                pVarArr = pVarArr2;
            }
            if (z11) {
                l1.a.s("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z12 = i12 > i11;
                int i17 = z12 ? i12 : i11;
                boolean z13 = z12;
                int i18 = z12 ? i11 : i12;
                float f12 = i18 / i17;
                int i19 = 0;
                while (true) {
                    hVar = hVar2;
                    if (i19 < 9) {
                        int i20 = f44867w1[i19];
                        int i21 = i19;
                        int i22 = (int) (i20 * f12);
                        if (i20 > i17 && i22 > i18) {
                            if (!z13) {
                                i22 = i20;
                            }
                            if (!z13) {
                                i20 = i22;
                            }
                            int i23 = i18;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f54130d;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point = new Point(l1.y.g(i22, widthAlignment) * widthAlignment, l1.y.g(i20, heightAlignment) * heightAlignment);
                            }
                            if (point != null) {
                                i10 = i12;
                                if (mVar.g(point.x, point.y, f11)) {
                                }
                            } else {
                                i10 = i12;
                            }
                            i19 = i21 + 1;
                            i12 = i10;
                            hVar2 = hVar;
                            i18 = i23;
                            i17 = i17;
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            i1.o oVarA2 = pVar.a();
                            oVarA2.f42607t = iMax;
                            oVarA2.f42608u = iMax2;
                            iD0 = Math.max(iD0, B0(mVar, new i1.p(oVarA2)));
                            l1.a.s("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    i10 = i12;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        i1.o oVarA3 = pVar.a();
                        oVarA3.f42607t = iMax;
                        oVarA3.f42608u = iMax2;
                        iD0 = Math.max(iD0, B0(mVar, new i1.p(oVarA3)));
                        l1.a.s("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                hVar = hVar2;
                i10 = i12;
            }
            t0Var = new t0(iMax, iMax2, iD0, false);
        }
        this.O0 = t0Var;
        int i24 = this.f44883o1 ? this.f44884p1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i11);
        mediaFormat.setInteger("height", i10);
        l1.a.r(mediaFormat, pVar.f42646q);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        l1.a.n(mediaFormat, "rotation-degrees", pVar.f42655z);
        if (hVar != null) {
            i1.h hVar3 = hVar;
            l1.a.n(mediaFormat, "color-transfer", hVar3.f42550c);
            l1.a.n(mediaFormat, "color-standard", hVar3.f42548a);
            l1.a.n(mediaFormat, "color-range", hVar3.f42549b);
            byte[] bArr = hVar3.f42551d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(pVar.f42643n) && (pairC = l1.c.c(pVar)) != null) {
            l1.a.n(mediaFormat, "profile", ((Integer) pairC.first).intValue());
        }
        mediaFormat.setInteger("max-width", t0Var.f20103a);
        mediaFormat.setInteger("max-height", t0Var.f20104b);
        l1.a.n(mediaFormat, "max-input-size", t0Var.f20105c);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (this.I0) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i24 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i24);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f44882n1));
        }
        D(mediaFormat);
        Surface surfaceE0 = E0(mVar);
        if (this.R0 != null && !l1.y.I(this.E0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new com.google.android.gms.internal.consent_sdk.x(mVar, mediaFormat, pVar, surfaceE0, mediaCrypto, (Object) null);
    }

    public final void Q0(long j10) {
        xx1 xx1Var = this.t0;
        xx1Var.l += j10;
        xx1Var.f22033m++;
        this.f44877i1 += j10;
        this.f44878j1++;
    }

    @Override // y1.p
    public final void R(o1.d dVar) {
        if (this.Q0) {
            ByteBuffer byteBuffer = dVar.f47038h;
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
                        y1.j jVar = this.N;
                        jVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        jVar.b(bundle);
                    }
                }
            }
        }
    }

    @Override // y1.p
    public final boolean W(i1.p pVar) throws p1.h {
        z zVar = this.R0;
        if (zVar == null || zVar.isInitialized()) {
            return true;
        }
        try {
            return this.R0.a(pVar);
        } catch (y e10) {
            throw d(e10, pVar, false, 7000);
        }
    }

    @Override // y1.p
    public final void X(Exception exc) {
        l1.a.f("MediaCodecVideoRenderer", "Video codec error", exc);
        v vVar = this.G0;
        Handler handler = vVar.f44941a;
        if (handler != null) {
            handler.post(new t(vVar, exc, 1));
        }
    }

    @Override // y1.p
    public final void Y(String str, long j10, long j11) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        v vVar = this.G0;
        Handler handler = vVar.f44941a;
        if (handler != null) {
            str2 = str;
            handler.post(new t(vVar, str2, j10, j11));
        } else {
            str2 = str;
        }
        this.P0 = A0(str2);
        y1.m mVar = this.U;
        mVar.getClass();
        boolean z10 = false;
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9.equals(mVar.f54128b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f54130d;
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
        this.Q0 = z10;
        I0();
    }

    @Override // y1.p
    public final void Z(p1.b bVar) {
        v vVar = this.G0;
        Handler handler = vVar.f44941a;
        if (handler != null) {
            handler.post(new u(0, vVar, bVar));
        }
    }

    @Override // y1.p
    public final void a0(String str) {
        v vVar = this.G0;
        Handler handler = vVar.f44941a;
        if (handler != null) {
            handler.post(new t(vVar, str, 2));
        }
    }

    @Override // y1.p
    public final p1.c b0(s1 s1Var) {
        p1.c cVarB0 = super.b0(s1Var);
        i1.p pVar = (i1.p) s1Var.f45752c;
        pVar.getClass();
        v vVar = this.G0;
        Handler handler = vVar.f44941a;
        if (handler != null) {
            handler.post(new u(vVar, pVar, cVarB0));
        }
        g1 g1Var = this.M0;
        if (g1Var != null) {
            g1Var.b();
        }
        return cVarB0;
    }

    @Override // y1.p
    public final void c0(i1.p pVar, MediaFormat mediaFormat) {
        int integer;
        int i10;
        y1.j jVar = this.N;
        if (jVar != null) {
            jVar.setVideoScalingMode(this.Z0);
        }
        if (this.f44883o1) {
            i10 = pVar.f42650u;
            integer = pVar.f42651v;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f10 = pVar.A;
        int i11 = pVar.f42655z;
        if (i11 == 90 || i11 == 270) {
            f10 = 1.0f / f10;
            int i12 = integer;
            integer = i10;
            i10 = i12;
        }
        this.f44880l1 = new z0(f10, i10, integer);
        z zVar = this.R0;
        if (zVar == null || !this.f44889u1) {
            this.J0.f(pVar.f42654y);
        } else {
            i1.o oVarA = pVar.a();
            oVarA.f42607t = i10;
            oVarA.f42608u = integer;
            oVarA.f42613z = f10;
            i1.p pVar2 = new i1.p(oVarA);
            int i13 = this.T0;
            List list = this.U0;
            if (list == null) {
                f0 f0Var = j0.f47265b;
                list = n1.f47281e;
            }
            zVar.d(pVar2, this.f54168u0.f54144b, i13, list);
            this.T0 = 2;
        }
        this.f44889u1 = false;
    }

    @Override // p1.a
    public final void e() {
        z zVar = this.R0;
        if (zVar == null) {
            q qVar = this.J0;
            if (qVar.f44926e == 0) {
                qVar.f44926e = 1;
                return;
            }
            return;
        }
        int i10 = this.T0;
        if (i10 == 0 || i10 == 1) {
            this.T0 = 0;
        } else {
            zVar.j();
        }
    }

    @Override // y1.p
    public final void e0(long j10) {
        super.e0(j10);
        if (this.f44883o1) {
            return;
        }
        this.f44874e1--;
    }

    @Override // y1.p
    public final void f0() {
        z zVar = this.R0;
        if (zVar != null) {
            zVar.c();
            if (this.f44887s1 == C.TIME_UNSET) {
                this.f44887s1 = this.f54168u0.f54144b;
            }
            this.R0.b(-this.f44887s1);
        } else {
            this.J0.e(2);
        }
        this.f44889u1 = true;
        I0();
    }

    @Override // y1.p
    public final void g0(o1.d dVar) {
        this.f44890v1 = 0;
        int iL = L(dVar);
        if ((Build.VERSION.SDK_INT < 34 || (iL & 32) == 0) && !this.f44883o1) {
            this.f44874e1++;
        }
    }

    @Override // p1.a
    public final String h() {
        return "MediaCodecVideoRenderer";
    }

    @Override // y1.p, p1.a, p1.y0
    public final void handleMessage(int i10, Object obj) {
        if (i10 == 1) {
            K0(obj);
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            p pVar = (p) obj;
            this.f44886r1 = pVar;
            z zVar = this.R0;
            if (zVar != null) {
                zVar.n(pVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f44884p1 != iIntValue) {
                this.f44884p1 = iIntValue;
                if (this.f44883o1) {
                    k0();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.Z0 = iIntValue2;
            y1.j jVar = this.N;
            if (jVar != null) {
                jVar.setVideoScalingMode(iIntValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f44870a1 = iIntValue3;
            z zVar2 = this.R0;
            if (zVar2 != null) {
                zVar2.o(iIntValue3);
                return;
            }
            l1 l1Var = this.J0.f44923b;
            if (l1Var.f16634h == iIntValue3) {
                return;
            }
            l1Var.f16634h = iIntValue3;
            l1Var.d(true);
            return;
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(y0.f42719a)) {
                z zVar3 = this.R0;
                if (zVar3 == null || !zVar3.isInitialized()) {
                    return;
                }
                this.R0.g();
                return;
            }
            this.U0 = list;
            z zVar4 = this.R0;
            if (zVar4 != null) {
                zVar4.e(list);
                return;
            }
            return;
        }
        if (i10 == 14) {
            obj.getClass();
            l1.r rVar = (l1.r) obj;
            if (rVar.f44817a == 0 || rVar.f44818b == 0) {
                return;
            }
            this.X0 = rVar;
            z zVar5 = this.R0;
            if (zVar5 != null) {
                Surface surface = this.V0;
                surface.getClass();
                zVar5.i(surface, rVar);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                obj.getClass();
                this.f44882n1 = ((Integer) obj).intValue();
                y1.j jVar2 = this.N;
                if (jVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f44882n1));
                    jVar2.b(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.V0;
                K0(null);
                obj.getClass();
                ((h) obj).handleMessage(1, surface2);
                break;
            case 18:
                boolean z10 = this.f44875f1 != null;
                d1 d1Var = (d1) obj;
                this.f44875f1 = d1Var;
                if (z10 != (d1Var != null)) {
                    x0(this.O);
                }
                break;
            default:
                super.handleMessage(i10, obj);
                break;
        }
    }

    @Override // y1.p
    public final boolean i0(long j10, long j11, y1.j jVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, i1.p pVar) {
        int i13;
        jVar.getClass();
        long j13 = j12 - this.f54168u0.f54145c;
        int i14 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.N0;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j12) {
                break;
            }
            i14++;
            priorityQueue.poll();
        }
        O0(i14, 0);
        z zVar = this.R0;
        if (zVar != null) {
            if (!z10 || z11) {
                return zVar.h(j12, new f(this, jVar, i10, j13));
            }
            N0(jVar, i10);
            return true;
        }
        int iA = this.J0.a(j12, j10, j11, this.f54168u0.f54144b, z10, z11, this.K0);
        e1 e1Var = this.K0;
        g1 g1Var = this.M0;
        if (g1Var != null && iA != 5 && iA != 4) {
            g1Var.a(j12, e1Var.f13801a);
        }
        if (iA == 0) {
            this.f47911g.getClass();
            long jNanoTime = System.nanoTime();
            p pVar2 = this.f44886r1;
            if (pVar2 != null) {
                pVar2.a(j13, jNanoTime, pVar, this.P);
            }
            J0(jVar, i10, jNanoTime);
            Q0(e1Var.f13801a);
            return true;
        }
        if (iA == 1) {
            long j14 = e1Var.f13802b;
            long j15 = e1Var.f13801a;
            if (j14 == this.f44879k1) {
                N0(jVar, i10);
            } else {
                p pVar3 = this.f44886r1;
                if (pVar3 != null) {
                    i13 = i10;
                    pVar3.a(j13, j14, pVar, this.P);
                } else {
                    i13 = i10;
                }
                J0(jVar, i13, j14);
            }
            Q0(j15);
            this.f44879k1 = j14;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            jVar.t(i10);
            Trace.endSection();
            O0(0, 1);
            Q0(e1Var.f13801a);
            return true;
        }
        if (iA == 3) {
            N0(jVar, i10);
            Q0(e1Var.f13801a);
            return true;
        }
        if (iA == 4 || iA == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iA));
    }

    @Override // p1.a
    public final boolean j() {
        if (!this.f54162p0) {
            return false;
        }
        z zVar = this.R0;
        return zVar == null || zVar.isEnded();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    @Override // p1.a
    public final boolean l() {
        boolean zIsReady;
        boolean z10 = false;
        if (this.E != null) {
            if (i()) {
                zIsReady = this.f47917n;
            } else {
                c1 c1Var = this.f47913i;
                c1Var.getClass();
                zIsReady = c1Var.isReady();
            }
            if (zIsReady) {
                z10 = true;
            } else {
                if (this.f54149b0 >= 0) {
                    z10 = true;
                } else if (this.Z != C.TIME_UNSET) {
                    this.f47911g.getClass();
                    if (SystemClock.elapsedRealtime() < this.Z) {
                        z10 = true;
                    }
                }
            }
        }
        z zVar = this.R0;
        if (zVar != null) {
            return zVar.f(z10);
        }
        if (z10 && (this.N == null || this.f44883o1)) {
            return true;
        }
        return this.J0.b(z10);
    }

    @Override // y1.p
    public final void l0() {
        z zVar = this.R0;
        if (zVar != null) {
            zVar.c();
        }
    }

    @Override // y1.p, p1.a
    public final void m() {
        xx1 xx1Var;
        v vVar = this.G0;
        this.f44881m1 = null;
        this.f44888t1 = C.TIME_UNSET;
        I0();
        this.Y0 = false;
        this.f44885q1 = null;
        this.h1 = true;
        try {
            super.m();
            xx1Var = this.t0;
            vVar.getClass();
            synchronized (xx1Var) {
            }
        } finally {
            xx1Var = this.t0;
            vVar.getClass();
            synchronized (xx1Var) {
                Handler handler = vVar.f44941a;
                if (handler != null) {
                    handler.post(new u(3, vVar, xx1Var));
                }
                vVar.b(z0.f42722d);
            }
        }
    }

    @Override // p1.a
    public final void n(boolean z10, boolean z11) {
        z zVar;
        this.t0 = new xx1(1);
        p1.c1 c1Var = this.f47908d;
        c1Var.getClass();
        boolean z12 = c1Var.f47980b;
        go.k.t((z12 && this.f44884p1 == 0) ? false : true);
        if (this.f44883o1 != z12) {
            this.f44883o1 = z12;
            k0();
        }
        xx1 xx1Var = this.t0;
        v vVar = this.G0;
        Handler handler = vVar.f44941a;
        if (handler != null) {
            handler.post(new t(vVar, xx1Var, 5));
        }
        boolean z13 = this.S0;
        q qVar = this.J0;
        if (!z13) {
            if (this.U0 != null && this.R0 == null) {
                x0 x0Var = new x0(this.E0, qVar);
                x0Var.f21656b = true;
                long j10 = this.L0;
                long j11 = C.TIME_UNSET;
                if (j10 != C.TIME_UNSET) {
                    j11 = -j10;
                }
                x0Var.f21658d = j11;
                l1.u uVar = this.f47911g;
                uVar.getClass();
                x0Var.f21661g = uVar;
                go.k.t(!x0Var.f21657c);
                if (((m) x0Var.f21660f) == null) {
                    x0Var.f21660f = new m();
                }
                o oVar = new o(x0Var);
                x0Var.f21657c = true;
                if (1 >= oVar.f44921q) {
                    oVar.f44921q = 1;
                }
                SparseArray sparseArray = oVar.f44908c;
                if (l1.y.l(sparseArray, 0)) {
                    zVar = (z) sparseArray.get(0);
                } else {
                    j jVar = new j(oVar, oVar.f44906a);
                    oVar.f44912g.add(jVar);
                    sparseArray.put(0, jVar);
                    zVar = jVar;
                }
                this.R0 = zVar;
            }
            this.S0 = true;
        }
        z zVar2 = this.R0;
        if (zVar2 == null) {
            l1.u uVar2 = this.f47911g;
            uVar2.getClass();
            qVar.l = uVar2;
            qVar.e(!z11 ? 1 : 0);
            return;
        }
        zVar2.s(new e(this));
        p pVar = this.f44886r1;
        if (pVar != null) {
            this.R0.n(pVar);
        }
        if (this.V0 != null && !this.X0.equals(l1.r.f44816c)) {
            this.R0.i(this.V0, this.X0);
        }
        this.R0.o(this.f44870a1);
        this.R0.p(this.L);
        List list = this.U0;
        if (list != null) {
            this.R0.e(list);
        }
        this.T0 = !z11 ? 1 : 0;
        this.f54174x0 = true;
    }

    @Override // y1.p
    public final void n0() {
        super.n0();
        this.N0.clear();
        this.f44874e1 = 0;
        this.f44890v1 = 0;
        this.h1 = false;
    }

    @Override // y1.p, p1.a
    public final void o(long j10, boolean z10, boolean z11) {
        z zVar = this.R0;
        if (zVar != null && !z10) {
            zVar.r(true);
        }
        if (z11) {
            this.f44876g1 = j10;
        }
        super.o(j10, z10, z11);
        z zVar2 = this.R0;
        q qVar = this.J0;
        if (zVar2 == null) {
            qVar.f44923b.b();
            qVar.f44929h = C.TIME_UNSET;
            qVar.f44927f = C.TIME_UNSET;
            qVar.f44926e = Math.min(qVar.f44926e, 1);
            qVar.f44930i = C.TIME_UNSET;
        }
        g1 g1Var = this.M0;
        if (g1Var != null) {
            g1Var.b();
        }
        if (z10) {
            z zVar3 = this.R0;
            if (zVar3 != null) {
                zVar3.t(false);
            } else {
                qVar.c(false);
            }
        }
        I0();
        this.f44873d1 = 0;
    }

    @Override // p1.a
    public final void p() {
        z zVar = this.R0;
        if (zVar == null || !this.F0) {
            return;
        }
        zVar.release();
    }

    @Override // p1.a
    public final void q() {
        try {
            try {
                this.f54152e0 = false;
                m0();
                k0();
                na.g gVar = this.H;
                if (gVar != null) {
                    gVar.D(null);
                }
                this.H = null;
                this.S0 = false;
                this.f44887s1 = C.TIME_UNSET;
                i iVar = this.W0;
                if (iVar != null) {
                    iVar.release();
                    this.W0 = null;
                }
            } catch (Throwable th2) {
                na.g gVar2 = this.H;
                if (gVar2 != null) {
                    gVar2.D(null);
                }
                this.H = null;
                throw th2;
            }
        } catch (Throwable th3) {
            this.S0 = false;
            this.f44887s1 = C.TIME_UNSET;
            i iVar2 = this.W0;
            if (iVar2 != null) {
                iVar2.release();
                this.W0 = null;
            }
            throw th3;
        }
    }

    @Override // p1.a
    public final void r() {
        this.f44872c1 = 0;
        this.f47911g.getClass();
        this.f44871b1 = SystemClock.elapsedRealtime();
        this.f44877i1 = 0L;
        this.f44878j1 = 0;
        z zVar = this.R0;
        if (zVar != null) {
            zVar.m();
        } else {
            this.J0.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    @Override // y1.p
    public final boolean r0(o1.d dVar) {
        boolean z10;
        long j10;
        boolean z11 = false;
        if (!G0(dVar)) {
            long j11 = dVar.f47037g;
            boolean z12 = j11 < this.l;
            g1 g1Var = this.M0;
            if (g1Var != null) {
                long j12 = g1Var.f14649a;
                if (j12 == C.TIME_UNSET) {
                    j10 = -9223372036854775807L;
                } else {
                    j10 = (long) (((j11 - j12) * g1Var.f14651c) + g1Var.f14650b);
                }
                if (j10 == C.TIME_UNSET || j10 >= this.L0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if ((z12 || z10) && !dVar.c(268435456)) {
                if (dVar.c(67108864)) {
                    dVar.g();
                    z11 = true;
                }
                if (z11) {
                    if (z12) {
                        this.t0.f22026e++;
                    } else {
                        this.N0.add(Long.valueOf(dVar.f47037g));
                        this.f44890v1++;
                    }
                }
                return z11;
            }
        }
        return false;
    }

    @Override // p1.a
    public final void s() {
        H0();
        int i10 = this.f44878j1;
        if (i10 != 0) {
            long j10 = this.f44877i1;
            v vVar = this.G0;
            Handler handler = vVar.f44941a;
            if (handler != null) {
                handler.post(new t(vVar, j10, i10));
            }
            this.f44877i1 = 0L;
            this.f44878j1 = 0;
        }
        z zVar = this.R0;
        if (zVar != null) {
            zVar.l();
        } else {
            q qVar = this.J0;
            qVar.f44925d = false;
            qVar.f44930i = C.TIME_UNSET;
            l1 l1Var = qVar.f44923b;
            l1Var.f16628b = false;
            h1 h1Var = (h1) l1Var.f16644s;
            if (h1Var != null) {
                h1Var.f();
            }
            l1Var.a();
        }
        g1 g1Var = this.M0;
        if (g1Var != null) {
            g1Var.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    @Override // y1.p
    public final boolean s0() {
        boolean z10;
        i1.p pVar = this.O;
        long j10 = this.f44888t1;
        if (j10 != C.TIME_UNSET) {
            if (this.f54178z0 + 1 + j10 > Long.MAX_VALUE - (this.f54168u0.f54145c + j10)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        return this.f44875f1 == null || this.h1 || this.f44883o1 || (pVar != null && pVar.f42645p > 0) || z10 || this.f54168u0.f54147e != C.TIME_UNSET;
    }

    @Override // y1.p, p1.a
    public final void t(i1.p[] pVarArr, long j10, long j11, c0 c0Var) {
        super.t(pVarArr, j10, j11, c0Var);
        P0(c0Var);
        g1 g1Var = this.M0;
        if (g1Var != null) {
            g1Var.b();
        }
    }

    @Override // y1.p
    public final boolean t0(y1.m mVar) {
        return F0(mVar);
    }

    @Override // p1.a
    public final void u() {
        c0 c0Var = this.f47920q;
        if (c0Var != null) {
            P0(c0Var);
        }
    }

    @Override // y1.p
    public final boolean u0() {
        y1.m mVar = this.U;
        if (this.R0 != null && mVar != null) {
            String str = mVar.f54127a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.u0();
    }

    @Override // y1.p, p1.a
    public final void w(long j10, long j11) throws p1.h {
        z zVar = this.R0;
        if (zVar != null) {
            try {
                zVar.render(j10, j11);
            } catch (y e10) {
                throw d(e10, e10.f44944a, false, 7001);
            }
        }
        super.w(j10, j11);
    }

    @Override // y1.p
    public final int w0(y1.g gVar, i1.p pVar) {
        boolean z10;
        int i10 = 0;
        if (!d0.m(pVar.f42643n)) {
            return p1.a.c(0, 0, 0, 0);
        }
        boolean z11 = pVar.f42647r != null;
        Context context = this.E0;
        List listC0 = C0(context, gVar, pVar, z11, false);
        if (z11 && listC0.isEmpty()) {
            listC0 = C0(context, gVar, pVar, false, false);
        }
        if (listC0.isEmpty()) {
            return p1.a.c(1, 0, 0, 0);
        }
        int i11 = pVar.O;
        if (i11 != 0 && i11 != 2) {
            return p1.a.c(2, 0, 0, 0);
        }
        y1.m mVar = (y1.m) listC0.get(0);
        boolean zE = mVar.e(context, pVar);
        if (!zE) {
            int i12 = 1;
            while (true) {
                if (i12 >= listC0.size()) {
                    z10 = true;
                    break;
                }
                y1.m mVar2 = (y1.m) listC0.get(i12);
                if (mVar2.e(context, pVar)) {
                    z10 = false;
                    zE = true;
                    mVar = mVar2;
                    break;
                }
                i12++;
            }
        } else {
            z10 = true;
            break;
        }
        int i13 = 3;
        int i14 = zE ? 4 : 3;
        int i15 = mVar.f(pVar) ? 16 : 8;
        int i16 = mVar.f54133g ? 64 : 0;
        int i17 = z10 ? 128 : 0;
        if ("video/dolby-vision".equals(pVar.f42643n) && !go.c.p(context)) {
            i17 = NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (zE) {
            List listC1 = C0(context, gVar, pVar, z11, true);
            if (!listC1.isEmpty()) {
                HashMap map = y1.u.f54183a;
                ArrayList arrayList = new ArrayList(listC1);
                Collections.sort(arrayList, new y1.q(new tb.n(i13, context, pVar)));
                y1.m mVar3 = (y1.m) arrayList.get(0);
                if (mVar3.e(context, pVar) && mVar3.f(pVar)) {
                    i10 = 32;
                }
            }
        }
        return i14 | i15 | i10 | i16 | i17;
    }

    @Override // y1.p, p1.a
    public final void z(float f10, float f11) {
        super.z(f10, f11);
        z zVar = this.R0;
        if (zVar != null) {
            zVar.p(f10);
        } else {
            this.J0.h(f10);
        }
        g1 g1Var = this.M0;
        if (g1Var != null) {
            g1Var.c(f10);
        }
    }
}

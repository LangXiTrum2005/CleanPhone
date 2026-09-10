package r1;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.q9;
import com.google.android.gms.internal.ads.dm0;
import com.google.android.gms.internal.ads.h12;
import com.google.android.gms.internal.ads.mk0;
import com.google.android.gms.internal.ads.p12;
import com.google.android.gms.internal.ads.t12;
import com.google.android.gms.internal.ads.xd1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final AtomicInteger f49222c0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public ByteBuffer I;
    public int J;
    public ByteBuffer K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public i1.f S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f49223a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f49224a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd.i f49225b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Handler f49226b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f49227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f49228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j1.o f49229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f0 f49230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f49231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayDeque f49232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f49233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f49234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t12 f49235k;
    public final t12 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public q1.j f49236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public qj.x f49237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public dm0 f49238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public dm0 f49239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j1.g f49240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k f49241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public x f49242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t f49243t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i1.e f49244u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z f49245v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z f49246w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i1.g0 f49247x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f49248y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f49249z;

    public a0(p12 p12Var) {
        int deviceId;
        Context context = (Context) p12Var.f18438b;
        this.f49223a = context == null ? null : context.getApplicationContext();
        this.f49244u = i1.e.f42531c;
        this.f49225b = (qd.i) p12Var.f18440d;
        this.f49233i = 0;
        this.f49241r = (u) p12Var.f18442f;
        w wVar = new w();
        this.f49227c = wVar;
        g0 g0Var = new g0();
        g0Var.f49296m = l1.y.f44831b;
        this.f49228d = g0Var;
        this.f49229e = new j1.o();
        this.f49230f = new f0();
        this.f49231g = j0.C(g0Var, wVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new i1.f();
        i1.g0 g0Var2 = i1.g0.f42543d;
        this.f49246w = new z(g0Var2, 0L, 0L);
        this.f49247x = g0Var2;
        this.f49248y = false;
        this.f49232h = new ArrayDeque();
        this.f49235k = new t12();
        this.l = new t12();
        int i10 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i10 = deviceId;
        }
        this.U = i10;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    public static int i(int i10, ByteBuffer byteBuffer) {
        int i11;
        int i12;
        byte b10;
        int i13;
        byte b11;
        int i14;
        int i15;
        int i16;
        int i17;
        if (i10 == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i11 = 0;
            } else {
                byte b12 = byteBuffer.get(26);
                int i18 = 28;
                int i19 = 28;
                for (int i20 = 0; i20 < b12; i20++) {
                    i19 += byteBuffer.get(i20 + 27);
                }
                byte b13 = byteBuffer.get(i19 + 26);
                for (int i21 = 0; i21 < b13; i21++) {
                    i18 += byteBuffer.get(i19 + 27 + i21);
                }
                i11 = i19 + i18;
            }
            int i22 = byteBuffer.get(i11 + 26) + 27 + i11;
            return (int) ((n2.b.o(byteBuffer.get(i22), byteBuffer.limit() - i22 > 1 ? byteBuffer.get(i22 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iPosition = byteBuffer.position();
                    String str = l1.y.f44830a;
                    int iReverseBytes = byteBuffer.getInt(iPosition);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    if ((iReverseBytes & (-2097152)) != -2097152 || (i15 = (iReverseBytes >>> 19) & 3) == 1 || (i16 = (iReverseBytes >>> 17) & 3) == 0) {
                        i14 = -1;
                    } else {
                        int i23 = (iReverseBytes >>> 12) & 15;
                        int i24 = (iReverseBytes >>> 10) & 3;
                        if (i23 == 0 || i23 == 15 || i24 == 3) {
                            i14 = -1;
                        } else {
                            i14 = 1152;
                            if (i16 != 1) {
                                if (i16 != 2) {
                                    if (i16 != 3) {
                                        throw new IllegalArgumentException();
                                    }
                                    i14 = 384;
                                }
                            } else if (i15 != 3) {
                                i14 = 576;
                            }
                        }
                    }
                    if (i14 != -1) {
                        return i14;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return com.ironsource.mediationsdk.metadata.a.f29616n;
                default:
                    switch (i10) {
                        case 14:
                            int iPosition2 = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i25 = iPosition2;
                            while (true) {
                                if (i25 <= iLimit) {
                                    String str2 = l1.y.f44830a;
                                    int iReverseBytes2 = byteBuffer.getInt(i25 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                    }
                                    if ((iReverseBytes2 & (-2)) == -126718022) {
                                        i17 = i25 - iPosition2;
                                    } else {
                                        i25++;
                                    }
                                } else {
                                    i17 = -1;
                                }
                            }
                            if (i17 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i17) + (((byteBuffer.get((byteBuffer.position() + i17) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int iPosition3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition3);
                            return n2.b.r(new xd1(bArr, 16)).f20105c;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(l1.d.e(i10, "Unexpected audio encoding: "));
                    }
                    break;
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return n2.b.f46425c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * NotificationCompat.FLAG_LOCAL_ONLY;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition4 = byteBuffer.position();
        byte b14 = byteBuffer.get(iPosition4);
        if (b14 != -2) {
            if (b14 == -1) {
                i12 = (byteBuffer.get(iPosition4 + 4) & 7) << 4;
                b11 = byteBuffer.get(iPosition4 + 7);
            } else if (b14 != 31) {
                i12 = (byteBuffer.get(iPosition4 + 4) & 1) << 6;
                b10 = byteBuffer.get(iPosition4 + 5);
            } else {
                i12 = (byteBuffer.get(iPosition4 + 5) & 7) << 4;
                b11 = byteBuffer.get(iPosition4 + 6);
            }
            i13 = b11 & 60;
            return (((i13 >> 2) | i12) + 1) * 32;
        }
        i12 = (byteBuffer.get(iPosition4 + 5) & 1) << 6;
        b10 = byteBuffer.get(iPosition4 + 4);
        i13 = b10 & 252;
        return (((i13 >> 2) | i12) + 1) * 32;
    }

    public final void a(long j10) {
        i1.g0 g0Var;
        boolean zV = v();
        boolean z10 = false;
        qd.i iVar = this.f49225b;
        if (zV) {
            g0Var = i1.g0.f42543d;
        } else {
            if (this.V || !dm0.a(this.f49239p)) {
                g0Var = i1.g0.f42543d;
            } else {
                int i10 = ((i1.p) this.f49239p.f13585c).H;
                g0Var = this.f49247x;
                j1.n nVar = (j1.n) iVar.f48982d;
                float f10 = g0Var.f42544a;
                nVar.getClass();
                go.k.i(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (nVar.f43612c != f10) {
                    nVar.f43612c = f10;
                    nVar.f43618i = true;
                }
                float f11 = g0Var.f42545b;
                go.k.i(f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (nVar.f43613d != f11) {
                    nVar.f43613d = f11;
                    nVar.f43618i = true;
                }
            }
            this.f49247x = g0Var;
        }
        i1.g0 g0Var2 = g0Var;
        if (!this.V && dm0.a(this.f49239p)) {
            int i11 = ((i1.p) this.f49239p.f13585c).H;
            z10 = this.f49248y;
            ((e0) iVar.f48981c).f49272o = z10;
        }
        this.f49248y = z10;
        this.f49232h.add(new z(g0Var2, Math.max(0L, j10), l1.y.S(((j) this.f49239p.f13587e).f49311b, j())));
        j1.g gVar = (j1.g) this.f49239p.f13588f;
        this.f49240q = gVar;
        gVar.a();
        qj.x xVar = this.f49237n;
        if (xVar != null) {
            boolean z11 = this.f49248y;
            l2.v vVar = ((c0) xVar.f49096b).F0;
            Handler handler = vVar.f44941a;
            if (handler != null) {
                handler.post(new q9(3, vVar, z11));
            }
        }
    }

    public final t b(j jVar) throws n {
        try {
            return ((u) this.f49241r).a(jVar);
        } catch (h e10) {
            n nVar = new n(jVar.f49311b, jVar.f49312c, jVar.f49310a, jVar.f49315f, (i1.p) this.f49239p.f13585c, jVar.f49314e, e10);
            qj.x xVar = this.f49237n;
            if (xVar == null) {
                throw nVar;
            }
            xVar.x(nVar);
            throw nVar;
        }
    }

    public final void c(i1.p pVar, int[] iArr) throws m {
        j1.g gVar;
        i1.p pVar2;
        int i10;
        int iT;
        if (this.f49242s == null && this.f49223a != null) {
            x xVar = new x(this);
            this.f49242s = xVar;
            u uVar = (u) this.f49241r;
            uVar.f();
            if (uVar.f49362e == null) {
                mk0 mk0Var = new mk0(Thread.currentThread(), 2);
                uVar.f49362e = mk0Var;
                mk0Var.f17460b = false;
            }
            uVar.f49362e.a(xVar);
        }
        String str = pVar.f42643n;
        int i11 = pVar.F;
        int i12 = pVar.H;
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            go.k.i(l1.y.H(i12));
            int iT2 = l1.y.t(i12) * i11;
            oa.e0 e0Var = new oa.e0(4);
            e0Var.d(this.f49231g);
            e0Var.b(this.f49229e);
            e0Var.c((j1.k[]) this.f49225b.f48980b);
            gVar = new j1.g(e0Var.g());
            if (gVar.equals(this.f49240q)) {
                gVar = this.f49240q;
            }
            int i13 = pVar.I;
            int i14 = pVar.J;
            g0 g0Var = this.f49228d;
            g0Var.f49293i = i13;
            g0Var.f49294j = i14;
            this.f49227c.f49393i = iArr;
            j1.h hVar = new j1.h(pVar.G, i11, i12);
            try {
                j0 j0Var = gVar.f43592a;
                if (hVar.equals(j1.h.f43596e)) {
                    throw new j1.j(hVar);
                }
                for (int i15 = 0; i15 < j0Var.size(); i15++) {
                    j1.k kVar = (j1.k) j0Var.get(i15);
                    j1.h hVarA = kVar.a(hVar);
                    if (kVar.isActive()) {
                        go.k.t(!hVarA.equals(j1.h.f43596e));
                        hVar = hVarA;
                    }
                }
                int i16 = hVar.f43598b;
                int i17 = hVar.f43599c;
                i1.o oVarA = pVar.a();
                oVarA.G = i17;
                oVarA.F = hVar.f43597a;
                oVarA.E = i16;
                pVar2 = new i1.p(oVarA);
                i10 = iT2;
                iT = l1.y.t(i17) * i16;
            } catch (j1.j e10) {
                throw new m(e10, pVar);
            }
        } else {
            gVar = new j1.g(n1.f47281e);
            pVar2 = pVar;
            i10 = -1;
            iT = -1;
        }
        j1.g gVar2 = gVar;
        f fVarG = g(pVar2);
        i1.p pVar3 = fVarG.f49280a;
        try {
            j jVarC = ((u) this.f49241r).c(fVarG);
            boolean z10 = jVarC.f49314e;
            if (jVarC.f49310a == 0) {
                throw new m("Invalid output encoding (isOffload=" + z10 + ")", pVar3);
            }
            if (jVarC.f49312c == 0) {
                throw new m("Invalid output channel config (isOffload=" + z10 + ")", pVar3);
            }
            this.X = false;
            dm0 dm0Var = new dm0(pVar, pVar2, i10, iT, jVarC, gVar2);
            if (n()) {
                this.f49238o = dm0Var;
            } else {
                this.f49239p = dm0Var;
            }
        } catch (e e11) {
            throw new m(e11, pVar);
        }
    }

    public final void d(long j10) throws Exception {
        qj.x xVar;
        p1.d0 d0Var;
        if (this.K == null) {
            return;
        }
        t12 t12Var = this.l;
        if (t12Var.f20114a != null && (f49222c0.get() > 0 || SystemClock.elapsedRealtime() < t12Var.f20116c)) {
            return;
        }
        int iRemaining = this.K.remaining();
        boolean z10 = false;
        try {
            boolean zE = this.f49243t.e(j10, this.K, this.J);
            this.W = SystemClock.elapsedRealtime();
            t12Var.f20114a = null;
            t12Var.f20115b = C.TIME_UNSET;
            t12Var.f20116c = C.TIME_UNSET;
            if (this.f49243t.c()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (xVar = this.f49237n) != null && !zE && !this.Y && (d0Var = ((c0) xVar.f49096b).I) != null) {
                    d0Var.f47994a.S = true;
                }
            }
            if (dm0.a(this.f49239p)) {
                this.B += (long) (iRemaining - this.K.remaining());
            }
            if (zE) {
                if (!dm0.a(this.f49239p)) {
                    go.k.t(this.K == this.I);
                    this.C = (((long) this.D) * ((long) this.J)) + this.C;
                }
                this.K = null;
            }
        } catch (d e10) {
            boolean z11 = e10.f49261b;
            if (z11) {
                if (j() > 0) {
                    z10 = true;
                } else if (this.f49243t.c()) {
                    if (((j) this.f49239p.f13587e).f49314e) {
                        this.X = true;
                    }
                    z10 = true;
                }
            }
            o oVar = new o(e10.f49260a, (i1.p) this.f49239p.f13585c, z10);
            qj.x xVar2 = this.f49237n;
            if (xVar2 != null) {
                xVar2.x(oVar);
            }
            if (z11) {
                throw oVar;
            }
            t12Var.a(oVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    public final boolean e() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f49240q.d()) {
            d(Long.MIN_VALUE);
            if (this.K == null) {
                return true;
            }
            return false;
        }
        j1.g gVar = this.f49240q;
        if (gVar.d() && !gVar.f43595d) {
            gVar.f43595d = true;
            ((j1.k) gVar.f43593b.get(0)).queueEndOfStream();
        }
        q(Long.MIN_VALUE);
        if (!this.f49240q.c() || ((byteBuffer = this.K) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    public final void f() {
        if (n()) {
            this.f49249z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.f49246w = new z(this.f49247x, 0L, 0L);
            this.G = 0L;
            this.f49245v = null;
            this.f49232h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.f49228d.f49298o = 0L;
            j1.g gVar = (j1.g) this.f49239p.f13588f;
            this.f49240q = gVar;
            gVar.a();
            this.f49234j = null;
            dm0 dm0Var = this.f49238o;
            if (dm0Var != null) {
                this.f49239p = dm0Var;
                this.f49238o = null;
            }
            f49222c0.incrementAndGet();
            t tVar = this.f49243t;
            if (tVar.f49348e.f49371d.getPlayState() == 3) {
                tVar.f49344a.pause();
            }
            if (tVar.c()) {
                s sVar = tVar.f49351h;
                sVar.getClass();
                ((t) sVar.f49340d).f49344a.unregisterStreamEventCallback((h12) sVar.f49339c);
                ((Handler) sVar.f49338b).removeCallbacksAndMessages(null);
            }
            k5.g gVar2 = tVar.f49347d;
            if (gVar2 != null) {
                AudioTrack audioTrack = (AudioTrack) gVar2.f44325a;
                r rVar = (r) gVar2.f44328d;
                rVar.getClass();
                audioTrack.removeOnRoutingChangedListener(rVar);
                gVar2.f44328d = null;
                tVar.f49347d = null;
            }
            AudioTrack audioTrack2 = tVar.f49344a;
            mk0 mk0Var = tVar.f49352i;
            Handler handlerQ = l1.y.q(null);
            synchronized (t.f49341p) {
                try {
                    if (t.f49342q == null) {
                        t.f49342q = Executors.newSingleThreadScheduledExecutor(new com.applovin.impl.communicator.a(1));
                    }
                    t.f49343r++;
                    t.f49342q.schedule(new ld.f(audioTrack2, handlerQ, mk0Var, 7), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f49243t = null;
        }
        t12 t12Var = this.l;
        t12Var.f20114a = null;
        t12Var.f20115b = C.TIME_UNSET;
        t12Var.f20116c = C.TIME_UNSET;
        t12 t12Var2 = this.f49235k;
        t12Var2.f20114a = null;
        t12Var2.f20115b = C.TIME_UNSET;
        t12Var2.f20116c = C.TIME_UNSET;
        this.Z = 0L;
        this.f49224a0 = 0L;
        Handler handler = this.f49226b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final f g(i1.p pVar) {
        f fVar = new f(pVar);
        fVar.f49281b = this.f49244u;
        fVar.f49283d = this.f49233i != 0;
        fVar.f49282c = this.T;
        fVar.f49284e = this.Q;
        fVar.f49286g = this.V;
        fVar.f49287h = -1;
        fVar.f49285f = this.U;
        return new f(fVar);
    }

    public final int h(i1.p pVar) {
        boolean z10;
        if (!l1.y.H(pVar.H) || pVar.H == 2) {
            z10 = false;
        } else {
            i1.o oVarA = pVar.a();
            oVarA.G = 2;
            pVar = new i1.p(oVarA);
            z10 = true;
        }
        int i10 = ((u) this.f49241r).b(g(pVar)).f49292d;
        if (i10 != 1) {
            if (i10 != 2) {
                return 0;
            }
            if (!z10) {
                return 2;
            }
        }
        return 1;
    }

    public final long j() {
        if (!dm0.a(this.f49239p)) {
            return this.C;
        }
        long j10 = this.B;
        long j11 = this.f49239p.f13584b;
        return ((j10 + j11) - 1) / j11;
    }

    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final boolean k(long r21, java.nio.ByteBuffer r23, int r24) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.a0.k(long, java.nio.ByteBuffer, int):boolean");
    }

    public final boolean l() {
        if (!n()) {
            return false;
        }
        if (this.f49243t.c() && this.N) {
            return false;
        }
        long j10 = j();
        long jA = this.f49243t.a();
        t tVar = this.f49243t;
        tVar.getClass();
        return j10 > l1.y.U(jA, (long) tVar.f49344a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0188  */
    /* JADX WARN: Code duplicated, block: B:65:? A[SYNTHETIC] */
    public final boolean m() throws n {
        t tVarB;
        y1.h hVar;
        t12 t12Var = this.f49235k;
        if (t12Var.f20114a != null && (f49222c0.get() > 0 || SystemClock.elapsedRealtime() < t12Var.f20116c)) {
            return false;
        }
        try {
            tVarB = b((j) this.f49239p.f13587e);
        } catch (n e10) {
            j jVar = (j) this.f49239p.f13587e;
            if (jVar.f49315f > 1000000) {
                i iVarA = jVar.a();
                iVarA.f49304f = 1000000;
                j jVar2 = new j(iVarA);
                try {
                    tVarB = b(jVar2);
                    dm0 dm0Var = this.f49239p;
                    this.f49239p = new dm0((i1.p) dm0Var.f13585c, (i1.p) dm0Var.f13586d, dm0Var.f13583a, dm0Var.f13584b, jVar2, (j1.g) dm0Var.f13588f);
                } catch (n e11) {
                    e10.addSuppressed(e11);
                    if (!((j) this.f49239p.f13587e).f49314e) {
                        throw e10;
                    }
                    this.X = true;
                    throw e10;
                }
            }
            if (!((j) this.f49239p.f13587e).f49314e) {
                throw e10;
            }
            this.X = true;
            throw e10;
        }
        this.f49243t = tVarB;
        y yVar = new y(this, (j) this.f49239p.f13587e);
        this.f49234j = yVar;
        tVarB.f49352i.a(yVar);
        if (this.f49243t.c()) {
            dm0 dm0Var2 = this.f49239p;
            if (((j) dm0Var2.f13587e).f49320k) {
                t tVar = this.f49243t;
                i1.p pVar = (i1.p) dm0Var2.f13585c;
                tVar.f49344a.setOffloadDelayPadding(pVar.I, pVar.J);
            }
        }
        q1.j jVar3 = this.f49236m;
        if (jVar3 != null) {
            this.f49243t.d(jVar3);
        }
        if (n()) {
            this.f49243t.f49344a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.f49243t.f49344a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.f49243t.f49344a.getAudioSessionId();
        boolean z10 = audioSessionId != this.Q;
        this.Q = audioSessionId;
        qj.x xVar = this.f49237n;
        if (xVar != null) {
            int i10 = ((j) this.f49239p.f13587e).f49310a;
            b0 b0Var = new b0();
            l2.v vVar = ((c0) xVar.f49096b).F0;
            Handler handler = vVar.f44941a;
            if (handler != null) {
                handler.post(new l(vVar, b0Var, 7));
            }
            if (z10) {
                this.R = true;
                dm0 dm0Var3 = this.f49239p;
                i iVarA2 = ((j) dm0Var3.f13587e).a();
                iVarA2.f49306h = this.Q;
                this.f49239p = new dm0((i1.p) dm0Var3.f13585c, (i1.p) dm0Var3.f13586d, dm0Var3.f13583a, dm0Var3.f13584b, new j(iVarA2), (j1.g) dm0Var3.f13588f);
                dm0 dm0Var4 = this.f49238o;
                if (dm0Var4 != null) {
                    i iVarA3 = ((j) dm0Var4.f13587e).a();
                    iVarA3.f49306h = this.Q;
                    this.f49238o = new dm0((i1.p) dm0Var4.f13585c, (i1.p) dm0Var4.f13586d, dm0Var4.f13583a, dm0Var4.f13584b, new j(iVarA3), (j1.g) dm0Var4.f13588f);
                }
                qj.x xVar2 = this.f49237n;
                int i11 = this.Q;
                c0 c0Var = (c0) xVar2.f49096b;
                if (Build.VERSION.SDK_INT >= 35 && (hVar = c0Var.H0) != null) {
                    hVar.d(i11);
                }
                l2.v vVar2 = c0Var.F0;
                Handler handler2 = vVar2.f44941a;
                if (handler2 != null) {
                    handler2.post(new com.applovin.impl.adview.o(i11, 5, vVar2));
                }
            }
        }
        return true;
    }

    public final boolean n() {
        return this.f49243t != null;
    }

    public final void o() {
        this.O = true;
        if (n()) {
            t tVar = this.f49243t;
            v vVar = tVar.f49348e;
            if (vVar.f49387u != C.TIME_UNSET) {
                vVar.f49369b.getClass();
                vVar.f49387u = l1.y.M(SystemClock.elapsedRealtime());
            }
            vVar.f49377j = l1.y.S(vVar.f49372e, vVar.a());
            vVar.f49375h.a(0);
            if (!tVar.f49353j || tVar.c()) {
                tVar.f49344a.play();
            }
        }
    }

    public final void p() {
        if (this.M) {
            return;
        }
        this.M = true;
        if (this.f49243t.c()) {
            this.N = false;
        }
        t tVar = this.f49243t;
        if (tVar.f49353j) {
            return;
        }
        tVar.f49353j = true;
        v vVar = tVar.f49348e;
        long jB = tVar.b();
        vVar.f49389w = vVar.a();
        vVar.f49369b.getClass();
        vVar.f49387u = l1.y.M(SystemClock.elapsedRealtime());
        vVar.f49390x = jB;
        tVar.f49344a.stop();
    }

    public final void q(long j10) throws Exception {
        ByteBuffer byteBuffer;
        d(j10);
        if (this.K != null) {
            return;
        }
        if (!this.f49240q.d()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 != null) {
                u(byteBuffer2);
                d(j10);
                return;
            }
            return;
        }
        while (!this.f49240q.c()) {
            do {
                j1.g gVar = this.f49240q;
                if (gVar.d()) {
                    ByteBuffer byteBuffer3 = gVar.f43594c[gVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        gVar.e(j1.k.f43603a);
                        byteBuffer = gVar.f43594c[gVar.b()];
                    }
                } else {
                    byteBuffer = j1.k.f43603a;
                }
                if (byteBuffer.hasRemaining()) {
                    u(byteBuffer);
                    d(j10);
                } else {
                    ByteBuffer byteBuffer4 = this.I;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    j1.g gVar2 = this.f49240q;
                    ByteBuffer byteBuffer5 = this.I;
                    if (gVar2.d() && !gVar2.f43595d) {
                        gVar2.e(byteBuffer5);
                    }
                }
            } while (this.K == null);
            return;
        }
    }

    public final void r() {
        if (this.f49239p != null) {
            dm0 dm0Var = this.f49238o;
            if (dm0Var != null) {
                this.f49239p = dm0Var;
                this.f49238o = null;
            }
            try {
                j jVarC = ((u) this.f49241r).c(g((i1.p) this.f49239p.f13586d));
                dm0 dm0Var2 = this.f49239p;
                this.f49239p = new dm0((i1.p) dm0Var2.f13585c, (i1.p) dm0Var2.f13586d, dm0Var2.f13583a, dm0Var2.f13584b, jVarC, (j1.g) dm0Var2.f13588f);
            } catch (e e10) {
                throw new IllegalStateException(new m(e10, (i1.p) this.f49239p.f13585c));
            }
        }
        f();
    }

    public final void s() {
        f();
        oa.f0 f0VarListIterator = this.f49231g.listIterator(0);
        while (f0VarListIterator.hasNext()) {
            ((j1.k) f0VarListIterator.next()).reset();
        }
        this.f49229e.reset();
        this.f49230f.reset();
        j1.g gVar = this.f49240q;
        if (gVar != null) {
            j0 j0Var = gVar.f43592a;
            for (int i10 = 0; i10 < j0Var.size(); i10++) {
                j1.k kVar = (j1.k) j0Var.get(i10);
                j1.i iVar = j1.i.f43601b;
                kVar.flush();
                kVar.reset();
            }
            gVar.f43593b.clear();
            gVar.f43594c = new ByteBuffer[0];
            j1.h hVar = j1.h.f43596e;
            gVar.f43595d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void t() {
        if (n()) {
            t tVar = this.f49243t;
            i1.g0 g0Var = this.f49247x;
            AudioTrack audioTrack = tVar.f49344a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(g0Var.f42544a).setPitch(g0Var.f42545b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                l1.a.t("AudioTrackAudioOutput", "Failed to set playback params", e10);
            }
            v vVar = tVar.f49348e;
            vVar.f49376i = audioTrack.getPlaybackParams().getSpeed();
            vVar.f49375h.a(0);
            vVar.f49378k = 0L;
            vVar.f49386t = 0;
            vVar.f49385s = 0;
            vVar.l = 0L;
            vVar.f49391y = C.TIME_UNSET;
            vVar.f49392z = C.TIME_UNSET;
            PlaybackParams playbackParams = this.f49243t.f49344a.getPlaybackParams();
            this.f49247x = new i1.g0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:47:0x014b  */
    /* JADX WARN: Code duplicated, block: B:49:0x014e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0153  */
    /* JADX WARN: Code duplicated, block: B:54:0x0157  */
    /* JADX WARN: Code duplicated, block: B:56:0x015b  */
    /* JADX WARN: Code duplicated, block: B:58:0x015f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0163  */
    /* JADX WARN: Code duplicated, block: B:63:0x0181  */
    /* JADX WARN: Code duplicated, block: B:64:0x0194  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0061 A[SYNTHETIC] */
    public final void u(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i10;
        byte b10;
        int i11;
        int i12;
        int i13;
        go.k.t(this.K == null);
        if (byteBuffer.hasRemaining()) {
            if (dm0.a(this.f49239p)) {
                int iU = (int) l1.y.U(l1.y.M(20L), ((j) this.f49239p.f13587e).f49311b, 1000000L, RoundingMode.UP);
                long j10 = j();
                long j11 = iU;
                if (j10 >= j11) {
                    byteBufferOrder = byteBuffer;
                } else {
                    dm0 dm0Var = this.f49239p;
                    int i14 = ((j) dm0Var.f13587e).f49310a;
                    int i15 = dm0Var.f13584b;
                    int i16 = (int) j10;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i16 < iU) {
                        if (i14 != 2) {
                            if (i14 == 3) {
                                i12 = (byteBuffer.get() & 255) << 24;
                            } else if (i14 == 4) {
                                float fI = l1.y.i(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i12 = (int) (fI < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (-fI) * (-2.1474836E9f) : fI * 2.1474836E9f);
                            } else if (i14 != 21) {
                                if (i14 == 22) {
                                    i10 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                    b10 = byteBuffer.get();
                                } else if (i14 == 268435456) {
                                    i10 = (byteBuffer.get() & 255) << 24;
                                    i11 = (byteBuffer.get() & 255) << 16;
                                } else if (i14 == 1342177280) {
                                    i10 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i11 = (byteBuffer.get() & 255) << 8;
                                } else {
                                    if (i14 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    i10 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i11 = byteBuffer.get() & 255;
                                }
                                i12 = i10 | i11;
                            } else {
                                i10 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b10 = byteBuffer.get();
                            }
                            i13 = (int) ((((long) i12) * ((long) i16)) / j11);
                            if (i14 != 2) {
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i14 != 3) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i14 != 4) {
                                if (i14 != 21) {
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                } else if (i14 != 22) {
                                    byteBufferOrder.put((byte) i13);
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                } else if (i14 != 268435456) {
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                } else if (i14 != 1342177280) {
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                } else {
                                    if (i14 == 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                    byteBufferOrder.put((byte) i13);
                                }
                            } else if (i13 < 0) {
                                byteBufferOrder.putFloat((-i13) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i13 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i15) {
                                i16++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i10 = (byteBuffer.get() & 255) << 16;
                            b10 = byteBuffer.get();
                        }
                        i11 = (b10 & 255) << 24;
                        i12 = i10 | i11;
                        i13 = (int) ((((long) i12) * ((long) i16)) / j11);
                        if (i14 != 2) {
                            byteBufferOrder.put((byte) (i13 >> 16));
                            byteBufferOrder.put((byte) (i13 >> 24));
                        } else if (i14 != 3) {
                            byteBufferOrder.put((byte) (i13 >> 24));
                        } else if (i14 != 4) {
                            if (i14 != 21) {
                                byteBufferOrder.put((byte) (i13 >> 8));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i14 != 22) {
                                byteBufferOrder.put((byte) i13);
                                byteBufferOrder.put((byte) (i13 >> 8));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i14 != 268435456) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                                byteBufferOrder.put((byte) (i13 >> 16));
                            } else if (i14 != 1342177280) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 8));
                            } else {
                                if (i14 == 1610612736) {
                                    throw new IllegalStateException();
                                }
                                byteBufferOrder.put((byte) (i13 >> 24));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 8));
                                byteBufferOrder.put((byte) i13);
                            }
                        } else if (i13 < 0) {
                            byteBufferOrder.putFloat((-i13) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i13 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i15) {
                            i16++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            } else {
                byteBufferOrder = byteBuffer;
            }
            this.K = byteBufferOrder;
        }
    }

    public final boolean v() {
        dm0 dm0Var = this.f49239p;
        return dm0Var != null && ((j) dm0Var.f13587e).f49319j;
    }
}

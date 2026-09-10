package q1;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b2.p;
import com.google.android.gms.internal.ads.n3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import f2.c0;
import go.k;
import i1.e0;
import i1.f0;
import i1.k0;
import i1.m;
import i1.n;
import i1.n0;
import i1.o0;
import i1.p0;
import i1.u0;
import i1.v;
import i1.v0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import l1.y;
import l2.u;
import m0.s1;
import n1.a0;
import n1.s;
import n1.t;
import p1.b0;
import r1.o;
import y1.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements b {
    public int A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48554a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f48556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PlaybackSession f48557d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f48563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PlaybackMetrics.Builder f48564k;
    public int l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f0 f48567o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p f48568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p f48569q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p f48570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i1.p f48571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i1.p f48572t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i1.p f48573u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f48574v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f48575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f48576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f48577y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f48578z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f48555b = l1.a.g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f48559f = new o0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n0 f48560g = new n0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f48562i = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f48561h = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48558e = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f48565m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f48566n = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.f48554a = context.getApplicationContext();
        this.f48557d = playbackSession;
        h hVar = new h();
        this.f48556c = hVar;
        hVar.f48550d = this;
    }

    public static i g(Context context) {
        MediaMetricsManager mediaMetricsManagerC = d.c(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerC == null) {
            return null;
        }
        return new i(context, mediaMetricsManagerC.createPlaybackSession());
    }

    public final boolean f(p pVar) {
        String str;
        if (pVar == null) {
            return false;
        }
        String str2 = (String) pVar.f5365d;
        h hVar = this.f48556c;
        synchronized (hVar) {
            str = hVar.f48552f;
        }
        return str2.equals(str);
    }

    public final void h() {
        PlaybackMetrics.Builder builder = this.f48564k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.f48564k.setVideoFramesDropped(this.f48577y);
            this.f48564k.setVideoFramesPlayed(this.f48578z);
            Long l = (Long) this.f48561h.get(this.f48563j);
            this.f48564k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l10 = (Long) this.f48562i.get(this.f48563j);
            this.f48564k.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.f48564k.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            this.f48555b.execute(new u(14, this, this.f48564k.build()));
        }
        this.f48564k = null;
        this.f48563j = null;
        this.A = 0;
        this.f48577y = 0;
        this.f48578z = 0;
        this.f48571s = null;
        this.f48572t = null;
        this.f48573u = null;
        this.B = false;
    }

    public final LogSessionId i() {
        return this.f48557d.getSessionId();
    }

    public final void j(p0 p0Var, c0 c0Var) {
        int iB;
        PlaybackMetrics.Builder builder = this.f48564k;
        if (c0Var == null || (iB = p0Var.b(c0Var.f40307a)) == -1) {
            return;
        }
        n0 n0Var = this.f48560g;
        int i10 = 0;
        p0Var.f(iB, n0Var, false);
        int i11 = n0Var.f42584c;
        o0 o0Var = this.f48559f;
        p0Var.n(i11, o0Var);
        v vVar = o0Var.f42618c.f42714b;
        if (vVar != null) {
            int iF = y.F(vVar.f42704a, vVar.f42705b);
            if (iF == 0) {
                i10 = 3;
            } else if (iF != 1) {
                i10 = iF != 2 ? 1 : 4;
            } else {
                i10 = 5;
            }
        }
        builder.setStreamType(i10);
        if (o0Var.f42627m != C.TIME_UNSET && !o0Var.f42626k && !o0Var.f42624i && !o0Var.a()) {
            builder.setMediaDurationMillis(y.Z(o0Var.f42627m));
        }
        builder.setPlaybackType(o0Var.a() ? 2 : 1);
        this.B = true;
    }

    /* JADX WARN: Code duplicated, block: B:254:0x0497  */
    /* JADX WARN: Code duplicated, block: B:387:0x0644  */
    /* JADX WARN: Code duplicated, block: B:390:0x0672  */
    /* JADX WARN: Code duplicated, block: B:394:0x0686 A[Catch: all -> 0x0695, TryCatch #0 {all -> 0x0695, blocks: (B:392:0x0682, B:394:0x0686, B:397:0x0697, B:398:0x06a1, B:400:0x06a7, B:402:0x06b4, B:404:0x06b8), top: B:411:0x0682 }] */
    /* JADX WARN: Code duplicated, block: B:400:0x06a7 A[Catch: all -> 0x0695, TryCatch #0 {all -> 0x0695, blocks: (B:392:0x0682, B:394:0x0686, B:397:0x0697, B:398:0x06a1, B:400:0x06a7, B:402:0x06b4, B:404:0x06b8), top: B:411:0x0682 }] */
    /* JADX WARN: Code duplicated, block: B:410:0x06c2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:411:0x0682 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void k(k0 k0Var, s1 s1Var) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        n3 n3Var;
        n3 n3Var2;
        int i17;
        int i18;
        int i19;
        int i20;
        n3 n3Var3;
        int i21;
        int i22;
        p pVar;
        int i23;
        int i24;
        int i25;
        boolean z11;
        h hVar;
        String str;
        Iterator it;
        g gVar;
        i iVar;
        i1.p pVar2;
        m mVar;
        int i26;
        if (((n) s1Var.f45751b).f42581a.size() == 0) {
            return;
        }
        int i27 = 0;
        while (true) {
            boolean z12 = true;
            if (i27 >= ((n) s1Var.f45751b).f42581a.size()) {
                break;
            }
            SparseBooleanArray sparseBooleanArray = ((n) s1Var.f45751b).f42581a;
            k.m(i27, sparseBooleanArray.size());
            int iKeyAt = sparseBooleanArray.keyAt(i27);
            a aVar = (a) ((SparseArray) s1Var.f45752c).get(iKeyAt);
            aVar.getClass();
            if (iKeyAt == 0) {
                h hVar2 = this.f48556c;
                synchronized (hVar2) {
                    try {
                        hVar2.f48550d.getClass();
                        p0 p0Var = hVar2.f48551e;
                        hVar2.f48551e = aVar.f48516b;
                        Iterator it2 = hVar2.f48549c.values().iterator();
                        while (it2.hasNext()) {
                            g gVar2 = (g) it2.next();
                            if (!gVar2.b(p0Var, hVar2.f48551e) || gVar2.a(aVar)) {
                                it2.remove();
                                if (gVar2.f48538a.equals(hVar2.f48552f)) {
                                    hVar2.a(gVar2);
                                }
                                if (gVar2.f48542e) {
                                    hVar2.f48550d.m(aVar, gVar2.f48538a);
                                }
                            }
                        }
                        hVar2.d(aVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (iKeyAt == 11) {
                h hVar3 = this.f48556c;
                int i28 = this.l;
                synchronized (hVar3) {
                    try {
                        hVar3.f48550d.getClass();
                        if (i28 != 0) {
                            z12 = false;
                        }
                        Iterator it3 = hVar3.f48549c.values().iterator();
                        while (it3.hasNext()) {
                            g gVar3 = (g) it3.next();
                            if (gVar3.a(aVar)) {
                                it3.remove();
                                boolean zEquals = gVar3.f48538a.equals(hVar3.f48552f);
                                if (zEquals) {
                                    hVar3.a(gVar3);
                                }
                                if (gVar3.f48542e) {
                                    if (z12 && zEquals) {
                                        boolean z13 = gVar3.f48543f;
                                    }
                                    hVar3.f48550d.m(aVar, gVar3.f48538a);
                                }
                            }
                        }
                        hVar3.d(aVar);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else {
                this.f48556c.e(aVar);
            }
            i27++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (s1Var.f(0)) {
            a aVar2 = (a) ((SparseArray) s1Var.f45752c).get(0);
            aVar2.getClass();
            if (this.f48564k != null) {
                j(aVar2.f48516b, aVar2.f48518d);
            }
        }
        if (s1Var.f(2) && this.f48564k != null) {
            b0 b0Var = (b0) k0Var;
            b0Var.l1();
            oa.f0 f0VarListIterator = b0Var.f47941h0.f48187i.f42840d.f42710a.listIterator(0);
            loop3: while (true) {
                if (!f0VarListIterator.hasNext()) {
                    mVar = null;
                    break;
                }
                u0 u0Var = (u0) f0VarListIterator.next();
                for (int i29 = 0; i29 < u0Var.f42699a; i29++) {
                    if (u0Var.f42703e[i29] && (mVar = u0Var.f42700b.f42662d[i29].f42647r) != null) {
                        break loop3;
                    }
                }
            }
            if (mVar != null) {
                PlaybackMetrics.Builder builder = this.f48564k;
                int i30 = 0;
                while (true) {
                    if (i30 >= mVar.f42580d) {
                        i26 = 1;
                        break;
                    }
                    UUID uuid = mVar.f42577a[i30].f42570b;
                    if (uuid.equals(i1.g.f42541d)) {
                        i26 = 3;
                        break;
                    } else if (uuid.equals(i1.g.f42542e)) {
                        i26 = 2;
                        break;
                    } else {
                        if (uuid.equals(i1.g.f42540c)) {
                            i26 = 6;
                            break;
                        }
                        i30++;
                    }
                }
                builder.setDrmType(i26);
            }
        }
        if (s1Var.f(1011)) {
            this.A++;
        }
        f0 f0Var = this.f48567o;
        if (f0Var == null) {
            i13 = 4;
            i21 = 1;
            i22 = 2;
            i16 = 13;
            i11 = 9;
            i12 = 8;
            i14 = 7;
            i15 = 6;
        } else {
            int i31 = f0Var.f42536a;
            Context context = this.f48554a;
            boolean z14 = this.f48575w == 4;
            if (i31 == 1001) {
                n3Var = new n3(20, 0, false);
            } else {
                if (f0Var instanceof p1.h) {
                    p1.h hVar4 = (p1.h) f0Var;
                    z10 = hVar4.f48035c == 1;
                    i10 = hVar4.f48039g;
                } else {
                    i10 = 0;
                    z10 = false;
                }
                Throwable cause = f0Var.getCause();
                cause.getClass();
                int i32 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof n1.u) {
                        n3Var3 = new n3(5, ((n1.u) cause).f46407c, false);
                    } else {
                        if ((cause instanceof t) || (cause instanceof e0)) {
                            i17 = 6;
                            i18 = 7;
                            i19 = 4;
                            i20 = 8;
                            i11 = 9;
                            n3Var = new n3(z14 ? 10 : 11, 0, false);
                        } else {
                            boolean z15 = cause instanceof s;
                            if (z15 || (cause instanceof a0)) {
                                i11 = 9;
                                if (l1.p.a(context).b() == 1) {
                                    n3Var = new n3(3, 0, false);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        n3Var = new n3(6, 0, false);
                                        i15 = 6;
                                        i16 = 13;
                                        i12 = 8;
                                        i13 = 4;
                                        i14 = 7;
                                    } else {
                                        i17 = 6;
                                        if (cause2 instanceof SocketTimeoutException) {
                                            n3Var = new n3(7, 0, false);
                                            i15 = 6;
                                            i14 = 7;
                                            i16 = 13;
                                            i12 = 8;
                                            i13 = 4;
                                        } else {
                                            i18 = 7;
                                            if (z15 && ((s) cause).f46406b == 1) {
                                                n3Var = new n3(4, 0, false);
                                                i15 = 6;
                                                i14 = 7;
                                                i13 = 4;
                                                i16 = 13;
                                                i12 = 8;
                                            } else {
                                                i19 = 4;
                                                i20 = 8;
                                                n3Var = new n3(8, 0, false);
                                            }
                                        }
                                    }
                                }
                            } else if (i31 == 1002) {
                                n3Var = new n3(21, 0, false);
                            } else if (cause instanceof u1.c) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                    int iZ = y.z(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (y.y(iZ)) {
                                        case 6002:
                                            i32 = 24;
                                            break;
                                        case 6003:
                                            i32 = 28;
                                            break;
                                        case 6004:
                                            i32 = 25;
                                            break;
                                        case 6005:
                                            i32 = 26;
                                            break;
                                    }
                                    n3Var3 = new n3(i32, iZ, false);
                                } else if (cause3 instanceof MediaDrmResetException) {
                                    n3Var = new n3(27, 0, false);
                                } else if (cause3 instanceof NotProvisionedException) {
                                    n3Var = new n3(24, 0, false);
                                } else if (cause3 instanceof DeniedByServerException) {
                                    n3Var = new n3(29, 0, false);
                                } else if (cause3 instanceof u1.j) {
                                    n3Var = new n3(23, 0, false);
                                } else {
                                    n3Var = cause3 instanceof u1.a ? new n3(28, 0, false) : new n3(30, 0, false);
                                }
                            } else if ((cause instanceof n1.p) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                n3Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new n3(32, 0, false) : new n3(31, 0, false);
                            } else {
                                i11 = 9;
                                n3Var = new n3(9, 0, false);
                            }
                            i16 = 13;
                            i12 = 8;
                            i13 = 4;
                            i14 = 7;
                            i15 = 6;
                        }
                        i15 = i17;
                        i14 = i18;
                        i13 = i19;
                        i12 = i20;
                        i16 = 13;
                    }
                    n3Var = n3Var3;
                } else {
                    i11 = 9;
                    i12 = 8;
                    i13 = 4;
                    i14 = 7;
                    i15 = 6;
                    if (z10 && (i10 == 0 || i10 == 1)) {
                        n3Var = new n3(35, 0, false);
                    } else if (z10 && i10 == 3) {
                        n3Var = new n3(15, 0, false);
                    } else if (z10 && i10 == 2) {
                        n3Var = new n3(23, 0, false);
                    } else {
                        if (cause instanceof y1.n) {
                            i16 = 13;
                            n3Var2 = new n3(13, y.z(((y1.n) cause).f54141d), false);
                        } else {
                            i16 = 13;
                            if (cause instanceof l) {
                                n3Var = new n3(14, ((l) cause).f54126a, false);
                            } else if (cause instanceof OutOfMemoryError) {
                                n3Var = new n3(14, 0, false);
                            } else if (cause instanceof r1.n) {
                                n3Var = new n3(17, 0, false);
                            } else if (cause instanceof o) {
                                n3Var2 = new n3(18, ((o) cause).f49325a, false);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (y.y(errorCode)) {
                                    case 6002:
                                        i32 = 24;
                                        break;
                                    case 6003:
                                        i32 = 28;
                                        break;
                                    case 6004:
                                        i32 = 25;
                                        break;
                                    case 6005:
                                        i32 = 26;
                                        break;
                                }
                                n3Var2 = new n3(i32, errorCode, false);
                            } else {
                                n3Var = new n3(22, 0, false);
                            }
                        }
                        n3Var = n3Var2;
                    }
                    i16 = 13;
                }
                this.f48555b.execute(new u(13, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f48558e).setErrorCode(n3Var.f17624a).setSubErrorCode(n3Var.f17625b).setException(f0Var).build()));
                i21 = 1;
                this.B = true;
                this.f48567o = null;
                i22 = 2;
            }
            i16 = 13;
            i11 = 9;
            i12 = 8;
            i13 = 4;
            i14 = 7;
            i15 = 6;
            this.f48555b.execute(new u(13, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.f48558e).setErrorCode(n3Var.f17624a).setSubErrorCode(n3Var.f17625b).setException(f0Var).build()));
            i21 = 1;
            this.B = true;
            this.f48567o = null;
            i22 = 2;
        }
        if (s1Var.f(i22)) {
            b0 b0Var2 = (b0) k0Var;
            b0Var2.l1();
            v0 v0Var = b0Var2.f47941h0.f48187i.f42840d;
            boolean zA = v0Var.a(i22);
            boolean zA2 = v0Var.a(i21);
            boolean zA3 = v0Var.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    pVar2 = null;
                } else {
                    pVar2 = null;
                    if (!Objects.equals(this.f48571s, null)) {
                        int i33 = this.f48571s == null ? 1 : 0;
                        this.f48571s = null;
                        n(1, jElapsedRealtime, null, i33);
                    }
                }
                if (!zA2 && !Objects.equals(this.f48572t, pVar2)) {
                    int i34 = this.f48572t == null ? 1 : 0;
                    this.f48572t = pVar2;
                    n(0, jElapsedRealtime, pVar2, i34);
                }
                if (!zA3 && !Objects.equals(this.f48573u, pVar2)) {
                    int i35 = this.f48573u == null ? 1 : 0;
                    this.f48573u = pVar2;
                    n(2, jElapsedRealtime, pVar2, i35);
                }
                pVar = pVar2;
            } else {
                i13 = i13;
                pVar = 0;
            }
        } else {
            i13 = i13;
            pVar = 0;
        }
        if (f(this.f48568p)) {
            p pVar3 = this.f48568p;
            i1.p pVar4 = (i1.p) pVar3.f5364c;
            if (pVar4.f42651v != -1) {
                int i36 = pVar3.f5363b;
                if (!Objects.equals(this.f48571s, pVar4)) {
                    int i37 = (this.f48571s == null && i36 == 0) ? 1 : i36;
                    this.f48571s = pVar4;
                    n(1, jElapsedRealtime, pVar4, i37);
                }
                this.f48568p = pVar;
            }
        }
        if (f(this.f48569q)) {
            p pVar5 = this.f48569q;
            i1.p pVar6 = (i1.p) pVar5.f5364c;
            int i38 = pVar5.f5363b;
            if (!Objects.equals(this.f48572t, pVar6)) {
                int i39 = (this.f48572t == null && i38 == 0) ? 1 : i38;
                this.f48572t = pVar6;
                n(0, jElapsedRealtime, pVar6, i39);
            }
            this.f48569q = pVar;
        }
        if (f(this.f48570r)) {
            p pVar7 = this.f48570r;
            i1.p pVar8 = (i1.p) pVar7.f5364c;
            int i40 = pVar7.f5363b;
            if (!Objects.equals(this.f48573u, pVar8)) {
                int i41 = (this.f48573u == null && i40 == 0) ? 1 : i40;
                this.f48573u = pVar8;
                n(2, jElapsedRealtime, pVar8, i41);
            }
            this.f48570r = pVar;
        }
        switch (l1.p.a(this.f48554a).b()) {
            case 0:
                i23 = 0;
                break;
            case 1:
                i23 = i11;
                break;
            case 2:
                i23 = 2;
                break;
            case 3:
                i23 = i13;
                break;
            case 4:
                i23 = 5;
                break;
            case 5:
                i23 = i15;
                break;
            case 6:
            case 8:
            default:
                i23 = 1;
                break;
            case 7:
                i23 = 3;
                break;
            case 9:
                i23 = i12;
                break;
            case 10:
                i23 = i14;
                break;
        }
        if (i23 != this.f48566n) {
            this.f48566n = i23;
            this.f48555b.execute(new u(12, this, new NetworkEvent.Builder().setNetworkType(i23).setTimeSinceCreatedMillis(jElapsedRealtime - this.f48558e).build()));
        }
        b0 b0Var3 = (b0) k0Var;
        if (b0Var3.U0() != 2) {
            this.f48574v = false;
        }
        b0Var3.l1();
        if (b0Var3.f47941h0.f48184f == null) {
            this.f48576x = false;
            i24 = 10;
        } else {
            i24 = 10;
            if (s1Var.f(10)) {
                this.f48576x = true;
            }
        }
        int iU0 = b0Var3.U0();
        if (this.f48574v) {
            i25 = 5;
        } else if (this.f48576x) {
            i25 = i16;
        } else if (iU0 == i13) {
            i25 = 11;
        } else {
            i25 = 12;
            if (iU0 != 2) {
                if (iU0 != 3) {
                    z11 = true;
                    if (iU0 != 1 || this.f48565m == 0) {
                        i25 = this.f48565m;
                    }
                } else if (b0Var3.T0()) {
                    b0Var3.l1();
                    i25 = b0Var3.f47941h0.f48191n != 0 ? i11 : 3;
                } else {
                    i25 = i13;
                }
                if (this.f48565m != i25) {
                    this.f48565m = i25;
                    this.B = z11;
                    this.f48555b.execute(new u(15, this, new PlaybackStateEvent.Builder().setState(this.f48565m).setTimeSinceCreatedMillis(jElapsedRealtime - this.f48558e).build()));
                }
                if (s1Var.f(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
                    hVar = this.f48556c;
                    a aVar3 = (a) ((SparseArray) s1Var.f45752c).get(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED);
                    aVar3.getClass();
                    synchronized (hVar) {
                        try {
                            str = hVar.f48552f;
                            if (str != null) {
                                g gVar4 = (g) hVar.f48549c.get(str);
                                gVar4.getClass();
                                hVar.a(gVar4);
                            }
                            it = hVar.f48549c.values().iterator();
                            while (it.hasNext()) {
                                gVar = (g) it.next();
                                it.remove();
                                if (!gVar.f48542e && (iVar = hVar.f48550d) != null) {
                                    iVar.m(aVar3, gVar.f48538a);
                                }
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            int i42 = this.f48565m;
            if (i42 == 0 || i42 == 2 || i42 == 12) {
                i25 = 2;
            } else if (b0Var3.T0()) {
                b0Var3.l1();
                i25 = b0Var3.f47941h0.f48191n != 0 ? i24 : i15;
            } else {
                i25 = i14;
            }
        }
        z11 = true;
        if (this.f48565m != i25) {
            this.f48565m = i25;
            this.B = z11;
            this.f48555b.execute(new u(15, this, new PlaybackStateEvent.Builder().setState(this.f48565m).setTimeSinceCreatedMillis(jElapsedRealtime - this.f48558e).build()));
        }
        if (s1Var.f(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
            hVar = this.f48556c;
            a aVar4 = (a) ((SparseArray) s1Var.f45752c).get(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED);
            aVar4.getClass();
            synchronized (hVar) {
                str = hVar.f48552f;
                if (str != null) {
                    g gVar5 = (g) hVar.f48549c.get(str);
                    gVar5.getClass();
                    hVar.a(gVar5);
                }
                it = hVar.f48549c.values().iterator();
                while (it.hasNext()) {
                    gVar = (g) it.next();
                    it.remove();
                    if (!gVar.f48542e) {
                    }
                }
            }
        }
    }

    public final void l(a aVar, String str) {
        c0 c0Var = aVar.f48518d;
        if (c0Var == null || !c0Var.b()) {
            h();
            this.f48563j = str;
            this.f48564k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.9.2");
            j(aVar.f48516b, c0Var);
        }
    }

    public final void m(a aVar, String str) {
        c0 c0Var = aVar.f48518d;
        if ((c0Var == null || !c0Var.b()) && str.equals(this.f48563j)) {
            h();
        }
        this.f48561h.remove(str);
        this.f48562i.remove(str);
    }

    public final void n(int i10, long j10, i1.p pVar, int i11) {
        int i12;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f48558e);
        if (pVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    i12 = i11 != 3 ? 1 : 4;
                }
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str = pVar.f42642m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = pVar.f42643n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = pVar.f42641k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = pVar.f42640j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = pVar.f42650u;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = pVar.f42651v;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = pVar.F;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = pVar.G;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = pVar.f42634d;
            if (str4 != null) {
                String str5 = y.f44830a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = pVar.f42654y;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.f48555b.execute(new u(11, this, timeSinceCreatedMillis.build()));
    }
}

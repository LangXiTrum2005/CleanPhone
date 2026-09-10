package w1;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.a0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ea.b0;
import f2.i0;
import i1.d0;
import i1.e0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n1.y;
import oa.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements j2.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ud.t f52756o = new ud.t(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final na.g f52757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f52758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f52759c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0 f52762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j2.m f52763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Handler f52764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v1.m f52765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f52766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Uri f52767k;
    public m l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f52768m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f52761e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f52760d = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f52769n = C.TIME_UNSET;

    public d(na.g gVar, b0 b0Var, t tVar) {
        this.f52757a = gVar;
        this.f52758b = tVar;
        this.f52759c = b0Var;
    }

    public final m a(boolean z10, Uri uri) {
        HashMap map = this.f52760d;
        m mVar = ((c) map.get(uri)).f52748d;
        if (mVar != null && z10) {
            if (!uri.equals(this.f52767k)) {
                List list = this.f52766j.f52863e;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    if (uri.equals(((o) list.get(i10)).f52855a)) {
                        m mVar2 = this.l;
                        if (mVar2 != null && mVar2.f52843o) {
                            break;
                        }
                        this.f52767k = uri;
                        c cVar = (c) map.get(uri);
                        m mVar3 = cVar.f52748d;
                        if (mVar3 != null && mVar3.f52843o) {
                            this.l = mVar3;
                            this.f52765i.y(mVar3);
                            break;
                        }
                        cVar.g(c(uri));
                        break;
                    }
                }
            }
            c cVar2 = (c) map.get(uri);
            m mVar4 = cVar2.f52748d;
            if (!cVar2.f52755k) {
                cVar2.f52755k = true;
                if (mVar4 != null && !mVar4.f52843o) {
                    cVar2.e(true);
                }
            }
        }
        return mVar;
    }

    @Override // j2.h
    public final void b(j2.j jVar, long j10, long j11, boolean z10) {
        j2.q qVar = (j2.q) jVar;
        long j12 = qVar.f43678a;
        n1.k kVar = qVar.f43679b;
        y yVar = qVar.f43681d;
        f2.u uVar = new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        this.f52759c.getClass();
        this.f52762f.c(uVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public final Uri c(Uri uri) {
        i iVar;
        m mVar = this.l;
        if (mVar == null || !mVar.f52850v.f52832e || (iVar = (i) ((s1) mVar.f52848t).get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar.f52814b));
        int i10 = iVar.f52815c;
        if (i10 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return builderBuildUpon.build();
    }

    @Override // j2.h
    public final a0 d(j2.j jVar, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        j2.q qVar = (j2.q) jVar;
        long j12 = qVar.f43678a;
        n1.k kVar = qVar.f43679b;
        y yVar = qVar.f43681d;
        f2.u uVar = new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        int i11 = qVar.f43680c;
        this.f52759c.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i10 - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof e0) || (cause instanceof FileNotFoundException) || (cause instanceof n1.r) || (cause instanceof j2.l) || ((cause instanceof n1.i) && ((n1.i) cause).f46362a == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        boolean z10 = jMin == C.TIME_UNSET;
        this.f52762f.g(uVar, i11, iOException, z10);
        return z10 ? j2.m.f43673f : new a0(jMin, 0, false);
    }

    public final boolean e(Uri uri) {
        int i10;
        c cVar = (c) this.f52760d.get(uri);
        if (cVar.f52748d == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, l1.y.Z(cVar.f52748d.f52849u));
        m mVar = cVar.f52748d;
        return mVar.f52843o || (i10 = mVar.f52833d) == 2 || i10 == 1 || cVar.f52749e + jMax > jElapsedRealtime;
    }

    @Override // j2.h
    public final void j(j2.j jVar, long j10, long j11) {
        p pVar;
        j2.q qVar = (j2.q) jVar;
        q qVar2 = (q) qVar.f43683f;
        boolean z10 = qVar2 instanceof m;
        if (z10) {
            String str = qVar2.f52871a;
            p pVar2 = p.f52861n;
            Uri uri = Uri.parse(str);
            i1.o oVar = new i1.o();
            oVar.f42589a = "0";
            oVar.l = d0.n(MimeTypes.APPLICATION_M3U8);
            List listSingletonList = Collections.singletonList(new o(uri, new i1.p(oVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            pVar = new p("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            pVar = (p) qVar2;
        }
        this.f52766j = pVar;
        this.f52767k = ((o) pVar.f52863e.get(0)).f52855a;
        this.f52761e.add(new a(this));
        List list2 = pVar.f52862d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri2 = (Uri) list2.get(i10);
            this.f52760d.put(uri2, new c(this, uri2));
        }
        n1.k kVar = qVar.f43679b;
        y yVar = qVar.f43681d;
        f2.u uVar = new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        c cVar = (c) this.f52760d.get(this.f52767k);
        if (z10) {
            cVar.h((m) qVar2, uVar);
        } else {
            cVar.e(false);
        }
        this.f52759c.getClass();
        this.f52762f.d(uVar, 4);
    }

    @Override // j2.h
    public final void n(j2.j jVar, long j10, long j11, int i10) {
        f2.u uVar;
        j2.q qVar = (j2.q) jVar;
        if (i10 == 0) {
            long j12 = qVar.f43678a;
            uVar = new f2.u(qVar.f43679b, j10);
        } else {
            long j13 = qVar.f43678a;
            n1.k kVar = qVar.f43679b;
            y yVar = qVar.f43681d;
            uVar = new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        }
        this.f52762f.h(uVar, qVar.f43680c, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, i10);
    }
}

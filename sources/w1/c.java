package w1;

import android.net.Uri;
import android.os.SystemClock;
import b2.w;
import b2.z;
import com.google.android.gms.internal.ads.a0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ea.b0;
import f2.i0;
import i1.e0;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import n1.y;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements j2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f52745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2.m f52746b = new j2.m("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1.h f52747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f52748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f52749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f52750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f52751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f52752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f52753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IOException f52754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f52755k;
    public final /* synthetic */ d l;

    public c(d dVar, Uri uri) {
        this.l = dVar;
        this.f52745a = uri;
        this.f52747c = ((n1.g) dVar.f52757a.f46631b).createDataSource();
    }

    public static boolean a(c cVar, long j10) {
        cVar.f52752h = SystemClock.elapsedRealtime() + j10;
        Uri uri = cVar.f52745a;
        d dVar = cVar.l;
        if (!uri.equals(dVar.f52767k)) {
            return true;
        }
        List list = dVar.f52766j.f52863e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar2 = (c) dVar.f52760d.get(((o) list.get(i10)).f52855a);
            cVar2.getClass();
            if (jElapsedRealtime > cVar2.f52752h) {
                Uri uri2 = cVar2.f52745a;
                dVar.f52767k = uri2;
                cVar2.g(dVar.c(uri2));
                return true;
            }
        }
        return false;
    }

    @Override // j2.h
    public final void b(j2.j jVar, long j10, long j11, boolean z10) {
        j2.q qVar = (j2.q) jVar;
        long j12 = qVar.f43678a;
        n1.k kVar = qVar.f43679b;
        y yVar = qVar.f43681d;
        f2.u uVar = new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        d dVar = this.l;
        dVar.f52759c.getClass();
        dVar.f52762f.c(uVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public final Uri c() {
        m mVar = this.f52748d;
        Uri uri = this.f52745a;
        if (mVar != null) {
            l lVar = mVar.f52850v;
            if (lVar.f52828a != C.TIME_UNSET || lVar.f52832e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                m mVar2 = this.f52748d;
                if (mVar2.f52850v.f52832e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f52840k + ((long) mVar2.f52846r.size())));
                    m mVar3 = this.f52748d;
                    if (mVar3.f52842n != C.TIME_UNSET) {
                        j0 j0Var = mVar3.f52847s;
                        int size = j0Var.size();
                        if (!j0Var.isEmpty() && ((h) oa.q.k(j0Var)).f52812m) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.f52748d.f52850v;
                if (lVar2.f52828a != C.TIME_UNSET) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", lVar2.f52829b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    @Override // j2.h
    public final a0 d(j2.j jVar, long j10, long j11, IOException iOException, int i10) {
        j2.q qVar = (j2.q) jVar;
        long j12 = qVar.f43678a;
        int i11 = qVar.f43680c;
        n1.k kVar = qVar.f43679b;
        y yVar = qVar.f43681d;
        Uri uri = yVar.f46418c;
        f2.u uVar = new f2.u(kVar, uri, yVar.f46419d, j10, j11, yVar.f46417b);
        boolean z10 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z11 = iOException instanceof r;
        a0 a0Var = j2.m.f43672e;
        d dVar = this.l;
        if (z10 || z11) {
            int i12 = iOException instanceof n1.u ? ((n1.u) iOException).f46407c : Integer.MAX_VALUE;
            if (z11 || i12 == 400 || i12 == 503) {
                this.f52751g = SystemClock.elapsedRealtime();
                e(false);
                i0 i0Var = dVar.f52762f;
                String str = l1.y.f44830a;
                i0Var.g(uVar, i11, iOException, true);
                return a0Var;
            }
        }
        w wVar = new w(i10, 14, iOException);
        Iterator it = dVar.f52761e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((u) it.next()).d(this.f52745a, wVar, false);
        }
        b0 b0Var = dVar.f52759c;
        if (z12) {
            b0Var.getClass();
            long jK = b0.k(wVar);
            a0Var = jK != C.TIME_UNSET ? new a0(jK, 0, false) : j2.m.f43673f;
        }
        boolean zA = a0Var.a();
        dVar.f52762f.g(uVar, i11, iOException, !zA);
        if (!zA) {
            b0Var.getClass();
        }
        return a0Var;
    }

    public final void e(boolean z10) {
        g(z10 ? c() : this.f52745a);
    }

    public final void f(Uri uri) {
        d dVar = this.l;
        j2.p pVarC = dVar.f52758b.c(dVar.f52766j, this.f52748d);
        Map map = Collections.EMPTY_MAP;
        go.k.o(uri, "The uri must be set.");
        j2.q qVar = new j2.q(this.f52747c, new n1.k(uri, 1, null, map, 0L, -1L, null, 1), 4, pVarC);
        this.f52746b.e(qVar, this, dVar.f52759c.j(qVar.f43680c));
    }

    public final void g(Uri uri) {
        this.f52752h = 0L;
        if (this.f52753i) {
            return;
        }
        j2.m mVar = this.f52746b;
        if (mVar.c() || mVar.b()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f52751g;
        if (jElapsedRealtime >= j10) {
            f(uri);
        } else {
            this.f52753i = true;
            this.l.f52764h.postDelayed(new b(0, this, uri), j10 - jElapsedRealtime);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0259  */
    /* JADX WARN: Code duplicated, block: B:101:0x025b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x025d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0268  */
    /* JADX WARN: Code duplicated, block: B:105:0x026c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0280  */
    /* JADX WARN: Code duplicated, block: B:110:0x0288  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    /* JADX WARN: Code duplicated, block: B:49:0x010f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0116  */
    /* JADX WARN: Code duplicated, block: B:54:0x011d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0125  */
    /* JADX WARN: Code duplicated, block: B:57:0x0129  */
    /* JADX WARN: Code duplicated, block: B:58:0x012c  */
    /* JADX WARN: Code duplicated, block: B:60:0x012f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:63:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145  */
    /* JADX WARN: Code duplicated, block: B:66:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e4 A[LOOP:0: B:78:0x01de->B:80:0x01e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x0203  */
    /* JADX WARN: Code duplicated, block: B:86:0x020b  */
    /* JADX WARN: Code duplicated, block: B:88:0x021e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0225  */
    /* JADX WARN: Code duplicated, block: B:92:0x0229  */
    /* JADX WARN: Code duplicated, block: B:95:0x023e A[LOOP:1: B:93:0x0238->B:95:0x023e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0254 A[DONT_INVERT] */
    public final void h(m mVar, f2.u uVar) {
        boolean z10;
        j0 j0Var;
        long j10;
        long j11;
        boolean z11;
        m mVar2;
        long j12;
        long j13;
        j0 j0Var2;
        long j14;
        int size;
        int i10;
        j jVar;
        long j15;
        m mVar3;
        int i11;
        int i12;
        j0 j0Var3;
        j jVar2;
        int i13;
        m mVar4;
        z zVar;
        Uri uri;
        long size2;
        m mVar5;
        z zVar2;
        boolean z12;
        w wVar;
        Iterator it;
        m mVar6;
        l lVar;
        long j16;
        long j17;
        Iterator it2;
        int size3;
        int size4;
        int size5;
        m mVar7 = this.f52748d;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f52749e = jElapsedRealtime;
        d dVar = this.l;
        CopyOnWriteArrayList copyOnWriteArrayList = dVar.f52761e;
        if (mVar7 != null) {
            long j18 = mVar.f52840k;
            long j19 = mVar7.f52840k;
            z10 = j18 > j19 || (j18 >= j19 && ((size3 = mVar.f52846r.size() - mVar7.f52846r.size()) == 0 ? (size4 = mVar.f52847s.size()) > (size5 = mVar7.f52847s.size()) || (size4 == size5 && mVar.f52843o && !mVar7.f52843o) : size3 > 0));
            j0Var = mVar.f52846r;
            j10 = mVar.f52840k;
            j11 = 0;
            if (z10) {
                copyOnWriteArrayList = copyOnWriteArrayList;
                z11 = true;
                if (mVar.f52844p) {
                    j12 = mVar.f52837h;
                } else {
                    mVar2 = dVar.l;
                    if (mVar2 != null) {
                        j12 = mVar2.f52837h;
                    } else {
                        j12 = 0;
                    }
                    if (mVar7 == null) {
                        long j20 = mVar7.f52837h;
                        j13 = mVar7.f52840k;
                        j0Var2 = mVar7.f52846r;
                        j14 = j12;
                        size = j0Var2.size();
                        i10 = (int) (j10 - j13);
                        if (i10 < j0Var2.size()) {
                            jVar = (j) j0Var2.get(i10);
                        } else {
                            jVar = null;
                        }
                        if (jVar != null) {
                            j15 = jVar.f52821e;
                        } else if (size == j10 - j13) {
                            j15 = mVar7.f52849u;
                        }
                        j12 = j20 + j15;
                    }
                    if (mVar.f52838i) {
                        i13 = mVar.f52839j;
                    } else {
                        mVar3 = dVar.l;
                        if (mVar3 != null) {
                            i11 = mVar3.f52839j;
                        } else {
                            i11 = 0;
                        }
                        if (mVar7 == null) {
                            i12 = (int) (j10 - mVar7.f52840k);
                            j0Var3 = mVar7.f52846r;
                            if (i12 < j0Var3.size()) {
                                jVar2 = (j) j0Var3.get(i12);
                            } else {
                                jVar2 = null;
                            }
                            if (jVar2 != null) {
                                i11 = (mVar7.f52839j + jVar2.f52820d) - ((j) j0Var.get(0)).f52820d;
                            }
                        }
                        i13 = i11;
                    }
                    zVar = null;
                    j10 = j10;
                    mVar4 = new m(mVar.f52833d, mVar.f52871a, mVar.f52872b, mVar.f52834e, mVar.f52836g, j14, true, i13, mVar.f52840k, mVar.l, mVar.f52841m, mVar.f52842n, mVar.f52873c, mVar.f52843o, mVar.f52844p, mVar.f52845q, j0Var, mVar.f52847s, mVar.f52850v, mVar.f52848t, mVar.f52851w);
                }
                j14 = j12;
                if (mVar.f52838i) {
                    i13 = mVar.f52839j;
                } else {
                    mVar3 = dVar.l;
                    if (mVar3 != null) {
                        i11 = mVar3.f52839j;
                    } else {
                        i11 = 0;
                    }
                    if (mVar7 == null) {
                        i12 = (int) (j10 - mVar7.f52840k);
                        j0Var3 = mVar7.f52846r;
                        if (i12 < j0Var3.size()) {
                            jVar2 = (j) j0Var3.get(i12);
                        } else {
                            jVar2 = null;
                        }
                        if (jVar2 != null) {
                            i11 = (mVar7.f52839j + jVar2.f52820d) - ((j) j0Var.get(0)).f52820d;
                        }
                    }
                    i13 = i11;
                }
                zVar = null;
                j10 = j10;
                mVar4 = new m(mVar.f52833d, mVar.f52871a, mVar.f52872b, mVar.f52834e, mVar.f52836g, j14, true, i13, mVar.f52840k, mVar.l, mVar.f52841m, mVar.f52842n, mVar.f52873c, mVar.f52843o, mVar.f52844p, mVar.f52845q, j0Var, mVar.f52847s, mVar.f52850v, mVar.f52848t, mVar.f52851w);
            } else {
                if (mVar.f52843o) {
                    z11 = true;
                    mVar4 = mVar7;
                } else if (mVar7.f52843o) {
                    mVar4 = mVar7;
                    copyOnWriteArrayList = copyOnWriteArrayList;
                    j10 = j10;
                    zVar = null;
                    z11 = true;
                } else {
                    z11 = true;
                    mVar4 = new m(mVar7.f52833d, mVar7.f52871a, mVar7.f52872b, mVar7.f52834e, mVar7.f52836g, mVar7.f52837h, mVar7.f52838i, mVar7.f52839j, mVar7.f52840k, mVar7.l, mVar7.f52841m, mVar7.f52842n, mVar7.f52873c, true, mVar7.f52844p, mVar7.f52845q, mVar7.f52846r, mVar7.f52847s, mVar7.f52850v, mVar7.f52848t, mVar7.f52851w);
                }
                zVar = null;
            }
            this.f52748d = mVar4;
            uri = this.f52745a;
            if (mVar4 != mVar7) {
                this.f52754j = zVar;
                this.f52750f = jElapsedRealtime;
                if (uri.equals(dVar.f52767k)) {
                    if (dVar.l == null) {
                        dVar.f52768m = !mVar4.f52843o;
                        dVar.f52769n = mVar4.f52837h;
                    }
                    dVar.l = mVar4;
                    dVar.f52765i.y(mVar4);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((u) it2.next()).b();
                }
            } else if (!mVar4.f52843o) {
                size2 = j10 + ((long) mVar.f52846r.size());
                mVar5 = this.f52748d;
                if (size2 < mVar5.f52840k) {
                    zVar2 = new z();
                    z12 = z11;
                } else {
                    if (jElapsedRealtime - this.f52750f > l1.y.Z(mVar5.f52841m) * 3.5d) {
                        zVar2 = new z();
                    } else {
                        zVar2 = zVar;
                    }
                    z12 = false;
                }
                if (zVar2 != null) {
                    this.f52754j = zVar2;
                    wVar = new w(z11 ? 1 : 0, 14, zVar2);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((u) it.next()).d(uri, wVar, z12);
                    }
                }
            }
            mVar6 = this.f52748d;
            lVar = mVar6.f52850v;
            j16 = mVar6.f52841m;
            if (!lVar.f52832e) {
                if (mVar6 == mVar7) {
                    j17 = mVar6.f52842n;
                    if (j17 != C.TIME_UNSET) {
                        j11 = j17 / 2;
                    } else {
                        j16 /= 2;
                    }
                }
                this.f52751g = (l1.y.Z(j11) + jElapsedRealtime) - uVar.f40464a;
                if (this.f52748d.f52843o) {
                }
                if (!uri.equals(dVar.f52767k) || this.f52755k) {
                    g(c());
                }
                return;
            }
            if (mVar6 == mVar7) {
                j16 /= 2;
            }
            j11 = j16;
            this.f52751g = (l1.y.Z(j11) + jElapsedRealtime) - uVar.f40464a;
            if (this.f52748d.f52843o) {
                if (uri.equals(dVar.f52767k)) {
                }
                g(c());
            }
        }
        mVar.getClass();
        j0Var = mVar.f52846r;
        j10 = mVar.f52840k;
        j11 = 0;
        if (z10) {
            if (mVar.f52843o) {
                z11 = true;
                mVar4 = mVar7;
            } else if (mVar7.f52843o) {
                mVar4 = mVar7;
                copyOnWriteArrayList = copyOnWriteArrayList;
                j10 = j10;
                zVar = null;
                z11 = true;
            } else {
                z11 = true;
                mVar4 = new m(mVar7.f52833d, mVar7.f52871a, mVar7.f52872b, mVar7.f52834e, mVar7.f52836g, mVar7.f52837h, mVar7.f52838i, mVar7.f52839j, mVar7.f52840k, mVar7.l, mVar7.f52841m, mVar7.f52842n, mVar7.f52873c, true, mVar7.f52844p, mVar7.f52845q, mVar7.f52846r, mVar7.f52847s, mVar7.f52850v, mVar7.f52848t, mVar7.f52851w);
            }
            zVar = null;
        } else {
            copyOnWriteArrayList = copyOnWriteArrayList;
            z11 = true;
            if (mVar.f52844p) {
                j12 = mVar.f52837h;
            } else {
                mVar2 = dVar.l;
                if (mVar2 != null) {
                    j12 = mVar2.f52837h;
                } else {
                    j12 = 0;
                }
                if (mVar7 == null) {
                    long j21 = mVar7.f52837h;
                    j13 = mVar7.f52840k;
                    j0Var2 = mVar7.f52846r;
                    j14 = j12;
                    size = j0Var2.size();
                    i10 = (int) (j10 - j13);
                    if (i10 < j0Var2.size()) {
                        jVar = (j) j0Var2.get(i10);
                    } else {
                        jVar = null;
                    }
                    if (jVar != null) {
                        j15 = jVar.f52821e;
                    } else if (size == j10 - j13) {
                        j15 = mVar7.f52849u;
                    }
                    j12 = j21 + j15;
                }
                if (mVar.f52838i) {
                    i13 = mVar.f52839j;
                } else {
                    mVar3 = dVar.l;
                    if (mVar3 != null) {
                        i11 = mVar3.f52839j;
                    } else {
                        i11 = 0;
                    }
                    if (mVar7 == null) {
                        i12 = (int) (j10 - mVar7.f52840k);
                        j0Var3 = mVar7.f52846r;
                        if (i12 < j0Var3.size()) {
                            jVar2 = (j) j0Var3.get(i12);
                        } else {
                            jVar2 = null;
                        }
                        if (jVar2 != null) {
                            i11 = (mVar7.f52839j + jVar2.f52820d) - ((j) j0Var.get(0)).f52820d;
                        }
                    }
                    i13 = i11;
                }
                zVar = null;
                j10 = j10;
                mVar4 = new m(mVar.f52833d, mVar.f52871a, mVar.f52872b, mVar.f52834e, mVar.f52836g, j14, true, i13, mVar.f52840k, mVar.l, mVar.f52841m, mVar.f52842n, mVar.f52873c, mVar.f52843o, mVar.f52844p, mVar.f52845q, j0Var, mVar.f52847s, mVar.f52850v, mVar.f52848t, mVar.f52851w);
            }
            j14 = j12;
            if (mVar.f52838i) {
                i13 = mVar.f52839j;
            } else {
                mVar3 = dVar.l;
                if (mVar3 != null) {
                    i11 = mVar3.f52839j;
                } else {
                    i11 = 0;
                }
                if (mVar7 == null) {
                    i12 = (int) (j10 - mVar7.f52840k);
                    j0Var3 = mVar7.f52846r;
                    if (i12 < j0Var3.size()) {
                        jVar2 = (j) j0Var3.get(i12);
                    } else {
                        jVar2 = null;
                    }
                    if (jVar2 != null) {
                        i11 = (mVar7.f52839j + jVar2.f52820d) - ((j) j0Var.get(0)).f52820d;
                    }
                }
                i13 = i11;
            }
            zVar = null;
            j10 = j10;
            mVar4 = new m(mVar.f52833d, mVar.f52871a, mVar.f52872b, mVar.f52834e, mVar.f52836g, j14, true, i13, mVar.f52840k, mVar.l, mVar.f52841m, mVar.f52842n, mVar.f52873c, mVar.f52843o, mVar.f52844p, mVar.f52845q, j0Var, mVar.f52847s, mVar.f52850v, mVar.f52848t, mVar.f52851w);
        }
        this.f52748d = mVar4;
        uri = this.f52745a;
        if (mVar4 != mVar7) {
            this.f52754j = zVar;
            this.f52750f = jElapsedRealtime;
            if (uri.equals(dVar.f52767k)) {
                if (dVar.l == null) {
                    dVar.f52768m = !mVar4.f52843o;
                    dVar.f52769n = mVar4.f52837h;
                }
                dVar.l = mVar4;
                dVar.f52765i.y(mVar4);
            }
            it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((u) it2.next()).b();
            }
        } else if (!mVar4.f52843o) {
            size2 = j10 + ((long) mVar.f52846r.size());
            mVar5 = this.f52748d;
            if (size2 < mVar5.f52840k) {
                zVar2 = new z();
                z12 = z11;
            } else {
                if (jElapsedRealtime - this.f52750f > l1.y.Z(mVar5.f52841m) * 3.5d) {
                    zVar2 = new z();
                } else {
                    zVar2 = zVar;
                }
                z12 = false;
            }
            if (zVar2 != null) {
                this.f52754j = zVar2;
                wVar = new w(z11 ? 1 : 0, 14, zVar2);
                it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).d(uri, wVar, z12);
                }
            }
        }
        mVar6 = this.f52748d;
        lVar = mVar6.f52850v;
        j16 = mVar6.f52841m;
        if (!lVar.f52832e) {
            if (mVar6 == mVar7) {
                j17 = mVar6.f52842n;
                if (j17 != C.TIME_UNSET) {
                    j11 = j17 / 2;
                } else {
                    j16 /= 2;
                }
            }
            this.f52751g = (l1.y.Z(j11) + jElapsedRealtime) - uVar.f40464a;
            if (this.f52748d.f52843o) {
                if (uri.equals(dVar.f52767k)) {
                }
                g(c());
            }
        }
        if (mVar6 == mVar7) {
            j16 /= 2;
        }
        j11 = j16;
        this.f52751g = (l1.y.Z(j11) + jElapsedRealtime) - uVar.f40464a;
        if (this.f52748d.f52843o) {
            if (uri.equals(dVar.f52767k)) {
            }
            g(c());
        }
    }

    @Override // j2.h
    public final void j(j2.j jVar, long j10, long j11) {
        j2.q qVar = (j2.q) jVar;
        q qVar2 = (q) qVar.f43683f;
        n1.k kVar = qVar.f43679b;
        y yVar = qVar.f43681d;
        f2.u uVar = new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        if (qVar2 instanceof m) {
            h((m) qVar2, uVar);
            this.l.f52762f.d(uVar, 4);
        } else {
            e0 e0VarB = e0.b("Loaded playlist has unexpected type.", null);
            this.f52754j = e0VarB;
            this.l.f52762f.g(uVar, 4, e0VarB, true);
        }
        this.l.f52759c.getClass();
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
        this.l.f52762f.h(uVar, qVar.f43680c, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, i10);
    }
}

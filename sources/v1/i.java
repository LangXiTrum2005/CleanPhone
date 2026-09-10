package v1;

import android.net.Uri;
import android.util.Pair;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import l1.y;
import n1.z;
import oa.f0;
import oa.j0;
import oa.k0;
import oa.n1;
import qj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f52312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1.h f52313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1.h f52314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f52315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri[] f52316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i1.p[] f52317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1.d f52318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q0 f52319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f52320i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q1.j f52322k;
    public boolean l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f2.b f52324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Uri f52325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Uri f52326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f52327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i2.r f52328r;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f52321j = new x(13);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f52323m = y.f44831b;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f52329s = C.TIME_UNSET;

    public i(c cVar, w1.d dVar, Uri[] uriArr, i1.p[] pVarArr, na.g gVar, z zVar, k0 k0Var, List list, q1.j jVar) {
        this.f52312a = cVar;
        this.f52318g = dVar;
        this.f52316e = uriArr;
        this.f52317f = pVarArr;
        this.f52315d = k0Var;
        this.f52320i = list;
        this.f52322k = jVar;
        n1.h hVarCreateDataSource = ((n1.g) gVar.f46631b).createDataSource();
        this.f52313b = hVarCreateDataSource;
        if (zVar != null) {
            hVarCreateDataSource.c(zVar);
        }
        this.f52314c = ((n1.g) gVar.f46631b).createDataSource();
        this.f52319h = new q0("", pVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((pVarArr[i10].f42636f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        q0 q0Var = this.f52319h;
        int[] iArrH = com.bumptech.glide.c.H(arrayList);
        g gVar2 = new g(q0Var, iArrH);
        gVar2.f52307g = gVar2.f(q0Var.f42662d[iArrH[0]]);
        this.f52328r = gVar2;
    }

    public static h d(w1.m mVar, long j10, int i10) {
        long j11 = mVar.f52840k;
        j0 j0Var = mVar.f52847s;
        int i11 = (int) (j10 - j11);
        j0 j0Var2 = mVar.f52846r;
        if (i11 == j0Var2.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < j0Var.size()) {
                return new h((w1.k) j0Var.get(i10), j10, i10);
            }
            return null;
        }
        w1.j jVar = (w1.j) j0Var2.get(i11);
        if (i10 == -1) {
            return new h(jVar, j10, -1);
        }
        if (i10 < jVar.f52816m.size()) {
            return new h((w1.k) jVar.f52816m.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < j0Var2.size()) {
            return new h((w1.k) j0Var2.get(i12), j10 + 1, -1);
        }
        if (j0Var.isEmpty()) {
            return null;
        }
        return new h((w1.k) j0Var.get(0), j10 + 1, 0);
    }

    public final g2.n[] a(k kVar, long j10) {
        List listUnmodifiableList;
        i iVar = this;
        k kVar2 = kVar;
        int iA = kVar2 == null ? -1 : iVar.f52319h.a(kVar2.f41369d);
        int length = iVar.f52328r.length();
        g2.n[] nVarArr = new g2.n[length];
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            int indexInTrackGroup = iVar.f52328r.getIndexInTrackGroup(i10);
            Uri uri = iVar.f52316e[indexInTrackGroup];
            w1.d dVar = iVar.f52318g;
            if (dVar.e(uri)) {
                w1.m mVarA = dVar.a(z10, uri);
                mVarA.getClass();
                long j11 = mVarA.f52837h - dVar.f52769n;
                Pair pairC = iVar.c(kVar2, indexInTrackGroup != iA ? true : z10, mVarA, j11, j10);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                long j12 = mVarA.f52840k;
                j0 j0Var = mVarA.f52847s;
                j0 j0Var2 = mVarA.f52846r;
                int i11 = (int) (jLongValue - j12);
                if (i11 < 0 || j0Var2.size() < i11) {
                    f0 f0Var = j0.f47265b;
                    listUnmodifiableList = n1.f47281e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < j0Var2.size()) {
                        if (iIntValue != -1) {
                            w1.j jVar = (w1.j) j0Var2.get(i11);
                            if (iIntValue == 0) {
                                arrayList.add(jVar);
                            } else if (iIntValue < jVar.f52816m.size()) {
                                j0 j0Var3 = jVar.f52816m;
                                arrayList.addAll(j0Var3.subList(iIntValue, j0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(j0Var2.subList(i11, j0Var2.size()));
                        iIntValue = 0;
                    }
                    if (mVarA.f52842n != C.TIME_UNSET) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < j0Var.size()) {
                            arrayList.addAll(j0Var.subList(iIntValue, j0Var.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                nVarArr[i10] = new f(j11, listUnmodifiableList);
            } else {
                nVarArr[i10] = g2.n.f41414i9;
            }
            i10++;
            iVar = this;
            kVar2 = kVar;
            z10 = false;
        }
        return nVarArr;
    }

    public final int b(k kVar) {
        int i10 = kVar.f52336o;
        if (i10 == -1) {
            return 1;
        }
        w1.m mVarA = this.f52318g.a(false, this.f52316e[this.f52319h.a(kVar.f41369d)]);
        mVarA.getClass();
        j0 j0Var = mVarA.f52846r;
        int i11 = (int) (kVar.f41413j - mVarA.f52840k);
        if (i11 < 0) {
            return 1;
        }
        j0 j0Var2 = i11 < j0Var.size() ? ((w1.j) j0Var.get(i11)).f52816m : mVarA.f52847s;
        if (i10 >= j0Var2.size()) {
            return 2;
        }
        w1.h hVar = (w1.h) j0Var2.get(i10);
        if (hVar.f52812m) {
            return 0;
        }
        return Objects.equals(Uri.parse(l1.a.p(mVarA.f52871a, hVar.f52817a)), kVar.f41367b.f46369a) ? 1 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    public final Pair c(k kVar, boolean z10, w1.m mVar, long j10, long j11) {
        j0 j0Var;
        int i10 = -1;
        boolean z11 = true;
        if (kVar != null) {
            long jA = kVar.f41413j;
            int i11 = kVar.f52336o;
            if (!z10) {
                if (!kVar.H) {
                    return new Pair(Long.valueOf(jA), Integer.valueOf(i11));
                }
                if (i11 == -1) {
                    jA = kVar.a();
                }
                return new Pair(Long.valueOf(jA), Integer.valueOf(i11 != -1 ? i11 + 1 : -1));
            }
        }
        long j12 = mVar.f52849u;
        long j13 = mVar.f52840k;
        j0 j0Var2 = mVar.f52847s;
        j0 j0Var3 = mVar.f52846r;
        long j14 = j10 + j12;
        long j15 = (kVar == null || this.f52327q) ? j11 : kVar.f41372g;
        if (!mVar.f52843o && j15 >= j14) {
            return new Pair(Long.valueOf(j13 + ((long) j0Var3.size())), -1);
        }
        long j16 = j15 - j10;
        Long lValueOf = Long.valueOf(j16);
        w1.d dVar = this.f52318g;
        if (dVar.f52768m && kVar != null) {
            z11 = false;
        }
        int iD = y.d(j0Var3, lValueOf, z11);
        long j17 = ((long) iD) + j13;
        if (!dVar.f52768m) {
            return new Pair(Long.valueOf(j17), -1);
        }
        if (iD >= 0) {
            if (j0Var3.isEmpty()) {
                j0Var = j0Var2;
            } else {
                w1.j jVar = (w1.j) j0Var3.get(iD);
                if (j16 < jVar.f52821e + jVar.f52819c) {
                    j0Var = jVar.f52816m;
                } else {
                    j0Var = j0Var2;
                }
            }
            for (int i12 = 0; i12 < j0Var.size(); i12++) {
                w1.h hVar = (w1.h) j0Var.get(i12);
                if (j16 < hVar.f52821e + hVar.f52819c) {
                    if (!hVar.l) {
                        break;
                    }
                    j17 += (j0Var != j0Var2 || j0Var3.isEmpty()) ? 0L : 1L;
                    i10 = i12;
                    break;
                }
            }
        }
        return new Pair(Long.valueOf(j17), Integer.valueOf(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e e(Uri uri, int i10, boolean z10) {
        if (uri == null) {
            return null;
        }
        x xVar = this.f52321j;
        byte[] bArr = (byte[]) ((d) xVar.f49096b).remove(uri);
        if (bArr != null) {
            return null;
        }
        n1.k kVar = new n1.k(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        i1.p pVar = this.f52317f[i10];
        int selectionReason = this.f52328r.getSelectionReason();
        Object selectionData = this.f52328r.getSelectionData();
        byte[] bArr2 = this.f52323m;
        e eVar = new e(this.f52314c, kVar, 3, pVar, selectionReason, selectionData, C.TIME_UNSET, C.TIME_UNSET);
        if (bArr2 == null) {
            bArr2 = y.f44831b;
        }
        eVar.f52303j = bArr2;
        return eVar;
    }
}

package v1;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.google.android.gms.internal.play_billing.q1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.b0;
import i1.c0;
import i1.d0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import l1.x;
import oa.f0;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends g2.m {
    public static final AtomicInteger M = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public b C;
    public r D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public j0 I;
    public boolean J;
    public long K;
    public boolean L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f52333k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f52334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f52335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f52336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n1.h f52337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n1.k f52338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f52339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f52340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f52341t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x f52342u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f52343v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f52344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i1.m f52345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b3.i f52346y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final l1.q f52347z;

    public k(c cVar, n1.h hVar, n1.k kVar, i1.p pVar, boolean z10, n1.h hVar2, n1.k kVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, x xVar, i1.m mVar, b bVar, b3.i iVar, l1.q qVar, boolean z15, boolean z16, q1.j jVar) {
        super(hVar, kVar, pVar, i10, obj, j10, j11, j12);
        this.A = z10;
        this.f52336o = i11;
        this.K = z12 ? j11 - j10 : C.TIME_UNSET;
        this.l = i12;
        this.f52338q = kVar2;
        this.f52337p = hVar2;
        this.F = kVar2 != null;
        this.B = z11;
        this.f52334m = uri;
        this.f52340s = z14;
        this.f52342u = xVar;
        this.f52341t = z13;
        this.f52343v = cVar;
        this.f52344w = list;
        this.f52345x = mVar;
        this.f52339r = bVar;
        this.f52346y = iVar;
        this.f52347z = qVar;
        this.L = z15;
        this.f52335n = z16;
        f0 f0Var = j0.f47265b;
        this.I = n1.f47281e;
        this.f52333k = M.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (q1.F(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // g2.m
    public final boolean b() {
        throw null;
    }

    public final void c(n1.h hVar, n1.k kVar, boolean z10, boolean z11) {
        n1.k kVarA;
        boolean z12;
        long j10;
        if (z10) {
            z12 = this.E != 0;
            kVarA = kVar;
        } else {
            kVarA = kVar.a(this.E);
            z12 = false;
        }
        try {
            n2.h hVarG = g(hVar, kVarA, z11);
            if (z12) {
                hVarG.skipFully(this.E, false);
            }
            while (!this.G && this.C.f52295a.b(hVarG, b.f52294f) == 0) {
                try {
                    try {
                    } catch (EOFException e10) {
                        if ((this.f41369d.f42636f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                            throw e10;
                        }
                        this.C.f52295a.seek(0L, 0L);
                        j10 = hVarG.f46466d;
                    }
                } catch (Throwable th2) {
                    this.E = (int) (hVarG.f46466d - kVar.f46373e);
                    throw th2;
                }
            }
            j10 = hVarG.f46466d;
            this.E = (int) (j10 - kVar.f46373e);
            com.google.android.gms.internal.auth.i.e(hVar);
        } catch (Throwable th3) {
            com.google.android.gms.internal.auth.i.e(hVar);
            throw th3;
        }
    }

    @Override // j2.j
    public final void cancelLoad() {
        this.G = true;
    }

    public final int e(int i10) {
        go.k.t(!this.L);
        if (i10 >= this.I.size()) {
            return 0;
        }
        return ((Integer) this.I.get(i10)).intValue();
    }

    public final boolean f() {
        return this.K != C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:138:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:140:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:143:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:23:0x0080 A[PHI: r16
  0x0080: PHI (r16v1 long) = (r16v0 long), (r16v3 long), (r16v3 long) binds: [B:40:0x00d0, B:22:0x007e, B:37:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
    public final n2.h g(n1.h hVar, n1.k kVar, boolean z10) throws IOException {
        int i10;
        long j10;
        long jT;
        b bVar;
        x xVar;
        n2.k aVar;
        boolean zA;
        j2.n nVar;
        boolean z11;
        b0 b0Var;
        int i11;
        k3.k kVar2;
        n2.k gVar;
        List list;
        List listSingletonList;
        int i12;
        n2.k dVar;
        b0 b0Var2;
        long jC = hVar.C(kVar);
        long j11 = this.f41372g;
        x xVar2 = this.f52342u;
        if (z10) {
            try {
                xVar2.g(j11, this.f52340s);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e10) {
                throw new IOException(e10);
            }
        }
        n2.h hVar2 = new n2.h(hVar, kVar.f46373e, jC);
        if (this.C == null) {
            l1.q qVar = this.f52347z;
            hVar2.f46468f = 0;
            try {
                qVar.J(10);
                hVar2.peekFully(qVar.f44813a, 0, 10, false);
                if (qVar.C() != 4801587) {
                    jT = C.TIME_UNSET;
                    j10 = C.TIME_UNSET;
                } else {
                    qVar.N(3);
                    int iY = qVar.y();
                    int i13 = iY + 10;
                    byte[] bArr = qVar.f44813a;
                    j10 = C.TIME_UNSET;
                    if (i13 > bArr.length) {
                        qVar.J(i13);
                        System.arraycopy(bArr, 0, qVar.f44813a, 0, 10);
                    }
                    hVar2.peekFully(qVar.f44813a, 10, iY, false);
                    c0 c0VarM = this.f52346y.M(iY, qVar.f44813a);
                    if (c0VarM == null) {
                        jT = j10;
                    } else {
                        b0[] b0VarArr = c0VarM.f42527a;
                        int length = b0VarArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                b0Var2 = null;
                                break;
                            }
                            b0 b0Var3 = b0VarArr[i14];
                            if (b3.n.class.isAssignableFrom(b0Var3.getClass())) {
                                b0Var2 = (b0) b3.n.class.cast(b0Var3);
                                if (!((b3.n) b0Var2).f5472b.equals("com.apple.streaming.transportStreamTimestamp")) {
                                    b0Var2 = null;
                                }
                            } else {
                                b0Var2 = null;
                            }
                            if (b0Var2 != null) {
                                break;
                            }
                            i14++;
                        }
                        b3.n nVar2 = (b3.n) b0Var2;
                        if (nVar2 == null) {
                            jT = j10;
                        } else {
                            System.arraycopy(nVar2.f5473c, 0, qVar.f44813a, 0, 8);
                            qVar.M(0);
                            qVar.L(8);
                            jT = qVar.t() & 8589934591L;
                        }
                    }
                }
            } catch (EOFException unused2) {
                j10 = C.TIME_UNSET;
            }
            hVar2.f46468f = 0;
            b bVar2 = this.f52339r;
            if (bVar2 == null) {
                Uri uri = kVar.f46369a;
                Map responseHeaders = hVar.getResponseHeaders();
                c cVar = this.f52343v;
                cVar.getClass();
                i1.p pVar = this.f41369d;
                int iU = android.support.v4.media.session.a.u(pVar.f42643n);
                List list2 = (List) responseHeaders.get("Content-Type");
                int iU2 = android.support.v4.media.session.a.u((list2 == null || list2.isEmpty()) ? null : (String) list2.get(0));
                int iV = android.support.v4.media.session.a.v(uri);
                ArrayList arrayList = new ArrayList(7);
                c.a(arrayList, iU);
                c.a(arrayList, iU2);
                c.a(arrayList, iV);
                int i15 = 0;
                for (int i16 = 7; i15 < i16; i16 = 7) {
                    c.a(arrayList, c.f52300c[i15]);
                    i15++;
                }
                hVar2.f46468f = 0;
                int i17 = 0;
                n2.k kVar3 = null;
                while (true) {
                    int size = arrayList.size();
                    x xVar3 = this.f52342u;
                    if (i17 >= size) {
                        j11 = j11;
                        i10 = 0;
                        kVar3.getClass();
                        bVar = new b(kVar3, pVar, xVar3, cVar.f52301a, cVar.f52302b);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList.get(i17)).intValue();
                    int i18 = i17;
                    if (iIntValue == 0) {
                        xVar = xVar3;
                        j11 = j11;
                        arrayList = arrayList;
                        aVar = new u3.a();
                    } else if (iIntValue == 1) {
                        xVar = xVar3;
                        j11 = j11;
                        arrayList = arrayList;
                        aVar = new u3.c();
                    } else if (iIntValue == 2) {
                        xVar = xVar3;
                        j11 = j11;
                        arrayList = arrayList;
                        aVar = new u3.d(0);
                    } else if (iIntValue != 7) {
                        List list3 = this.f52344w;
                        jj.d dVar2 = k3.k.f44294p9;
                        if (iIntValue == 8) {
                            j2.n nVar3 = cVar.f52301a;
                            boolean z12 = cVar.f52302b;
                            c0 c0Var = pVar.l;
                            if (c0Var == null) {
                                nVar = nVar3;
                                z11 = z12;
                            } else {
                                b0[] b0VarArr2 = c0Var.f42527a;
                                int length2 = b0VarArr2.length;
                                int i19 = 0;
                                while (true) {
                                    if (i19 >= length2) {
                                        nVar = nVar3;
                                        z11 = z12;
                                        b0Var = null;
                                        break;
                                    }
                                    nVar = nVar3;
                                    b0 b0Var4 = b0VarArr2[i19];
                                    z11 = z12;
                                    b0[] b0VarArr3 = b0VarArr2;
                                    if (t.class.isAssignableFrom(b0Var4.getClass())) {
                                        b0Var = (b0) t.class.cast(b0Var4);
                                        if (((t) b0Var).f52426c.isEmpty()) {
                                            b0Var = null;
                                        }
                                    } else {
                                        b0Var = null;
                                    }
                                    if (b0Var != null) {
                                        break;
                                    }
                                    i19++;
                                    nVar3 = nVar;
                                    z12 = z11;
                                    b0VarArr2 = b0VarArr3;
                                }
                                i11 = b0Var != null ? 4 : 0;
                                if (z11) {
                                    kVar2 = nVar;
                                } else {
                                    i11 |= 32;
                                    kVar2 = dVar2;
                                }
                                int i20 = i11;
                                if (list3 != null) {
                                    list = list3;
                                } else {
                                    list = n1.f47281e;
                                }
                                gVar = new h3.g(kVar2, i20, xVar3, null, list, null);
                                xVar = xVar3;
                            }
                            if (z11) {
                                i11 |= 32;
                                kVar2 = dVar2;
                            } else {
                                kVar2 = nVar;
                            }
                            int i21 = i11;
                            if (list3 != null) {
                                list = list3;
                            } else {
                                list = n1.f47281e;
                            }
                            gVar = new h3.g(kVar2, i21, xVar3, null, list, null);
                            xVar = xVar3;
                        } else if (iIntValue == 11) {
                            j2.n nVar4 = cVar.f52301a;
                            boolean z13 = cVar.f52302b;
                            if (list3 != null) {
                                i12 = 48;
                                listSingletonList = list3;
                            } else {
                                i1.o oVar = new i1.o();
                                oVar.f42600m = d0.n(MimeTypes.APPLICATION_CEA608);
                                listSingletonList = Collections.singletonList(new i1.p(oVar));
                                i12 = 16;
                            }
                            String str = pVar.f42641k;
                            xVar = xVar3;
                            if (!TextUtils.isEmpty(str)) {
                                if (d0.b(str, MimeTypes.AUDIO_AAC) == null) {
                                    i12 |= 2;
                                }
                                if (d0.b(str, "video/avc") == null) {
                                    i12 |= 4;
                                }
                            }
                            gVar = new u3.t(2, !z13 ? 1 : 0, !z13 ? dVar2 : nVar4, xVar, new j0.h(i12, listSingletonList));
                        } else if (iIntValue != 13) {
                            xVar = xVar3;
                            j11 = j11;
                            arrayList = arrayList;
                            aVar = null;
                        } else {
                            j11 = j11;
                            arrayList = arrayList;
                            aVar = new u(pVar.f42634d, xVar3, cVar.f52301a, cVar.f52302b);
                            xVar = xVar3;
                        }
                        aVar = gVar;
                    } else {
                        xVar = xVar3;
                        j11 = j11;
                        arrayList = arrayList;
                        aVar = new g3.d(0L);
                    }
                    aVar.getClass();
                    try {
                        zA = aVar.a(hVar2);
                        i10 = 0;
                        hVar2.f46468f = 0;
                    } catch (EOFException unused3) {
                        i10 = 0;
                        hVar2.f46468f = 0;
                        zA = false;
                    } catch (Throwable th2) {
                        hVar2.f46468f = 0;
                        throw th2;
                    }
                    if (zA) {
                        bVar = new b(aVar, pVar, xVar, cVar.f52301a, cVar.f52302b);
                        break;
                    }
                    i1.p pVar2 = pVar;
                    if (kVar3 == null && (iIntValue == iU || iIntValue == iU2 || iIntValue == iV || iIntValue == 11)) {
                        kVar3 = aVar;
                    }
                    i17 = i18 + 1;
                    pVar = pVar2;
                    arrayList = arrayList;
                    j11 = j11;
                }
            } else {
                n2.k kVar4 = bVar2.f52295a;
                go.k.t(!((kVar4 instanceof u3.t) || (kVar4 instanceof h3.g)));
                if (kVar4 instanceof u) {
                    dVar = new u(bVar2.f52296b.f42634d, bVar2.f52297c, bVar2.f52298d, bVar2.f52299e);
                } else if (kVar4 instanceof u3.d) {
                    dVar = new u3.d(0);
                } else if (kVar4 instanceof u3.a) {
                    dVar = new u3.a();
                } else if (kVar4 instanceof u3.c) {
                    dVar = new u3.c();
                } else {
                    if (!(kVar4 instanceof g3.d)) {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(kVar4.getClass().getSimpleName()));
                    }
                    dVar = new g3.d(0);
                }
                bVar = new b(dVar, bVar2.f52296b, bVar2.f52297c, bVar2.f52298d, bVar2.f52299e);
                j11 = j11;
                i10 = 0;
            }
            b bVar3 = bVar;
            this.C = bVar3;
            n2.k kVar5 = bVar3.f52295a;
            if ((((kVar5 instanceof u3.d) || (kVar5 instanceof u3.a) || (kVar5 instanceof u3.c) || (kVar5 instanceof g3.d)) ? 1 : i10) != 0) {
                r rVar = this.D;
                long jB = jT != j10 ? xVar2.b(jT) : j11;
                if (rVar.V != jB) {
                    rVar.V = jB;
                    q[] qVarArr = rVar.f52413v;
                    int length3 = qVarArr.length;
                    for (int i22 = i10; i22 < length3; i22++) {
                        q qVar2 = qVarArr[i22];
                        if (qVar2.F != jB) {
                            qVar2.F = jB;
                            qVar2.f40303z = true;
                        }
                    }
                }
            } else {
                r rVar2 = this.D;
                if (rVar2.V != 0) {
                    rVar2.V = 0L;
                    q[] qVarArr2 = rVar2.f52413v;
                    int length4 = qVarArr2.length;
                    for (int i23 = i10; i23 < length4; i23++) {
                        q qVar3 = qVarArr2[i23];
                        if (qVar3.F != 0) {
                            qVar3.F = 0L;
                            qVar3.f40303z = true;
                        }
                    }
                }
            }
            this.D.f52415x.clear();
            this.C.f52295a.c(this.D);
        } else {
            i10 = 0;
        }
        r rVar3 = this.D;
        i1.m mVar = rVar3.W;
        i1.m mVar2 = this.f52345x;
        if (!Objects.equals(mVar, mVar2)) {
            rVar3.W = mVar2;
            int i24 = i10;
            while (true) {
                q[] qVarArr3 = rVar3.f52413v;
                if (i24 >= qVarArr3.length) {
                    break;
                }
                if (rVar3.O[i24]) {
                    q qVar4 = qVarArr3[i24];
                    qVar4.I = mVar2;
                    qVar4.f40303z = true;
                }
                i24++;
            }
        }
        return hVar2;
    }

    @Override // j2.j
    public final void load() {
        b bVar;
        this.D.getClass();
        if (this.C == null && (bVar = this.f52339r) != null) {
            n2.k kVar = bVar.f52295a;
            if ((kVar instanceof u3.t) || (kVar instanceof h3.g)) {
                this.C = bVar;
                this.F = false;
            }
        }
        n1.k kVar2 = this.f52338q;
        n1.h hVar = this.f52337p;
        if (this.F) {
            hVar.getClass();
            kVar2.getClass();
            c(hVar, kVar2, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.f52341t) {
            c(this.f41374i, this.f41367b, this.A, true);
        }
        this.H = !this.G;
    }
}

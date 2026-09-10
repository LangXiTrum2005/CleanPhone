package tl;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.k3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends zl.k {
    public static final j J;
    public static final a K = new a(3);
    public int A;
    public List B;
    public List C;
    public int D;
    public w0 E;
    public List F;
    public d1 G;
    public byte H;
    public int I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zl.d f51294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f51299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f51300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f51301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f51303k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f51304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f51305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f51306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f51307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f51308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f51309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f51310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f51311t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f51312u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f51313v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f51314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public q0 f51315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f51316y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f51317z;

    static {
        j jVar = new j();
        J = jVar;
        jVar.s();
    }

    public j(h hVar) {
        super(hVar);
        this.f51302j = -1;
        this.l = -1;
        this.f51306o = -1;
        this.f51313v = -1;
        this.A = -1;
        this.D = -1;
        this.H = (byte) -1;
        this.I = -1;
        this.f51294b = hVar.f55044a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.I;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f51295c & 1) == 1 ? k3.c(1, this.f51296d) : 0;
        int iD = 0;
        for (int i11 = 0; i11 < this.f51301i.size(); i11++) {
            iD += k3.d(((Integer) this.f51301i.get(i11)).intValue());
        }
        int iE = iC + iD;
        if (!this.f51301i.isEmpty()) {
            iE = iE + 1 + k3.d(iD);
        }
        this.f51302j = iD;
        if ((this.f51295c & 2) == 2) {
            iE += k3.c(3, this.f51297e);
        }
        if ((this.f51295c & 4) == 4) {
            iE += k3.c(4, this.f51298f);
        }
        for (int i12 = 0; i12 < this.f51299g.size(); i12++) {
            iE += k3.e(5, (zl.a) this.f51299g.get(i12));
        }
        for (int i13 = 0; i13 < this.f51300h.size(); i13++) {
            iE += k3.e(6, (zl.a) this.f51300h.get(i13));
        }
        int iD2 = 0;
        for (int i14 = 0; i14 < this.f51303k.size(); i14++) {
            iD2 += k3.d(((Integer) this.f51303k.get(i14)).intValue());
        }
        int iE2 = iE + iD2;
        if (!this.f51303k.isEmpty()) {
            iE2 = iE2 + 1 + k3.d(iD2);
        }
        this.l = iD2;
        for (int i15 = 0; i15 < this.f51307p.size(); i15++) {
            iE2 += k3.e(8, (zl.a) this.f51307p.get(i15));
        }
        for (int i16 = 0; i16 < this.f51308q.size(); i16++) {
            iE2 += k3.e(9, (zl.a) this.f51308q.get(i16));
        }
        for (int i17 = 0; i17 < this.f51309r.size(); i17++) {
            iE2 += k3.e(10, (zl.a) this.f51309r.get(i17));
        }
        for (int i18 = 0; i18 < this.f51310s.size(); i18++) {
            iE2 += k3.e(11, (zl.a) this.f51310s.get(i18));
        }
        for (int i19 = 0; i19 < this.f51311t.size(); i19++) {
            iE2 += k3.e(13, (zl.a) this.f51311t.get(i19));
        }
        int iD3 = 0;
        for (int i20 = 0; i20 < this.f51312u.size(); i20++) {
            iD3 += k3.d(((Integer) this.f51312u.get(i20)).intValue());
        }
        int iE3 = iE2 + iD3;
        if (!this.f51312u.isEmpty()) {
            iE3 = iE3 + 2 + k3.d(iD3);
        }
        this.f51313v = iD3;
        if ((this.f51295c & 8) == 8) {
            iE3 += k3.c(17, this.f51314w);
        }
        if ((this.f51295c & 16) == 16) {
            iE3 += k3.e(18, this.f51315x);
        }
        if ((this.f51295c & 32) == 32) {
            iE3 += k3.c(19, this.f51316y);
        }
        for (int i21 = 0; i21 < this.f51304m.size(); i21++) {
            iE3 += k3.e(20, (zl.a) this.f51304m.get(i21));
        }
        int iD4 = 0;
        for (int i22 = 0; i22 < this.f51305n.size(); i22++) {
            iD4 += k3.d(((Integer) this.f51305n.get(i22)).intValue());
        }
        int iD5 = iE3 + iD4;
        if (!this.f51305n.isEmpty()) {
            iD5 = iD5 + 2 + k3.d(iD4);
        }
        this.f51306o = iD4;
        int iD6 = 0;
        for (int i23 = 0; i23 < this.f51317z.size(); i23++) {
            iD6 += k3.d(((Integer) this.f51317z.get(i23)).intValue());
        }
        int iE4 = iD5 + iD6;
        if (!this.f51317z.isEmpty()) {
            iE4 = iE4 + 2 + k3.d(iD6);
        }
        this.A = iD6;
        for (int i24 = 0; i24 < this.B.size(); i24++) {
            iE4 += k3.e(23, (zl.a) this.B.get(i24));
        }
        int iD7 = 0;
        for (int i25 = 0; i25 < this.C.size(); i25++) {
            iD7 += k3.d(((Integer) this.C.get(i25)).intValue());
        }
        int iE5 = iE4 + iD7;
        if (!this.C.isEmpty()) {
            iE5 = iE5 + 2 + k3.d(iD7);
        }
        this.D = iD7;
        if ((this.f51295c & 64) == 64) {
            iE5 += k3.e(30, this.E);
        }
        int iD8 = 0;
        for (int i26 = 0; i26 < this.F.size(); i26++) {
            iD8 += k3.d(((Integer) this.F.get(i26)).intValue());
        }
        int size = (this.F.size() * 2) + iE5 + iD8;
        if ((this.f51295c & 128) == 128) {
            size += k3.e(32, this.G);
        }
        int size2 = this.f51294b.size() + m() + size;
        this.I = size2;
        return size2;
    }

    @Override // zl.a
    public final zl.i g() {
        return h.f();
    }

    @Override // zl.u
    public final zl.a getDefaultInstanceForType() {
        return J;
    }

    @Override // zl.a
    public final zl.i h() {
        h hVarF = h.f();
        hVarF.g(this);
        return hVarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        v6.c cVar = new v6.c(this);
        if ((this.f51295c & 1) == 1) {
            k3Var.q(1, this.f51296d);
        }
        if (this.f51301i.size() > 0) {
            k3Var.z(18);
            k3Var.z(this.f51302j);
        }
        for (int i10 = 0; i10 < this.f51301i.size(); i10++) {
            k3Var.r(((Integer) this.f51301i.get(i10)).intValue());
        }
        if ((this.f51295c & 2) == 2) {
            k3Var.q(3, this.f51297e);
        }
        if ((this.f51295c & 4) == 4) {
            k3Var.q(4, this.f51298f);
        }
        for (int i11 = 0; i11 < this.f51299g.size(); i11++) {
            k3Var.s(5, (zl.a) this.f51299g.get(i11));
        }
        for (int i12 = 0; i12 < this.f51300h.size(); i12++) {
            k3Var.s(6, (zl.a) this.f51300h.get(i12));
        }
        if (this.f51303k.size() > 0) {
            k3Var.z(58);
            k3Var.z(this.l);
        }
        for (int i13 = 0; i13 < this.f51303k.size(); i13++) {
            k3Var.r(((Integer) this.f51303k.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f51307p.size(); i14++) {
            k3Var.s(8, (zl.a) this.f51307p.get(i14));
        }
        for (int i15 = 0; i15 < this.f51308q.size(); i15++) {
            k3Var.s(9, (zl.a) this.f51308q.get(i15));
        }
        for (int i16 = 0; i16 < this.f51309r.size(); i16++) {
            k3Var.s(10, (zl.a) this.f51309r.get(i16));
        }
        for (int i17 = 0; i17 < this.f51310s.size(); i17++) {
            k3Var.s(11, (zl.a) this.f51310s.get(i17));
        }
        for (int i18 = 0; i18 < this.f51311t.size(); i18++) {
            k3Var.s(13, (zl.a) this.f51311t.get(i18));
        }
        if (this.f51312u.size() > 0) {
            k3Var.z(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            k3Var.z(this.f51313v);
        }
        for (int i19 = 0; i19 < this.f51312u.size(); i19++) {
            k3Var.r(((Integer) this.f51312u.get(i19)).intValue());
        }
        if ((this.f51295c & 8) == 8) {
            k3Var.q(17, this.f51314w);
        }
        if ((this.f51295c & 16) == 16) {
            k3Var.s(18, this.f51315x);
        }
        if ((this.f51295c & 32) == 32) {
            k3Var.q(19, this.f51316y);
        }
        for (int i20 = 0; i20 < this.f51304m.size(); i20++) {
            k3Var.s(20, (zl.a) this.f51304m.get(i20));
        }
        if (this.f51305n.size() > 0) {
            k3Var.z(170);
            k3Var.z(this.f51306o);
        }
        for (int i21 = 0; i21 < this.f51305n.size(); i21++) {
            k3Var.r(((Integer) this.f51305n.get(i21)).intValue());
        }
        if (this.f51317z.size() > 0) {
            k3Var.z(178);
            k3Var.z(this.A);
        }
        for (int i22 = 0; i22 < this.f51317z.size(); i22++) {
            k3Var.r(((Integer) this.f51317z.get(i22)).intValue());
        }
        for (int i23 = 0; i23 < this.B.size(); i23++) {
            k3Var.s(23, (zl.a) this.B.get(i23));
        }
        if (this.C.size() > 0) {
            k3Var.z(194);
            k3Var.z(this.D);
        }
        for (int i24 = 0; i24 < this.C.size(); i24++) {
            k3Var.r(((Integer) this.C.get(i24)).intValue());
        }
        if ((this.f51295c & 64) == 64) {
            k3Var.s(30, this.E);
        }
        for (int i25 = 0; i25 < this.F.size(); i25++) {
            k3Var.q(31, ((Integer) this.F.get(i25)).intValue());
        }
        if ((this.f51295c & 128) == 128) {
            k3Var.s(32, this.G);
        }
        cVar.s(19000, k3Var);
        k3Var.v(this.f51294b);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.H;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f51295c & 2) != 2) {
            this.H = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f51299g.size(); i10++) {
            if (!((v0) this.f51299g.get(i10)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f51300h.size(); i11++) {
            if (!((q0) this.f51300h.get(i11)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f51304m.size(); i12++) {
            if (!((q0) this.f51304m.get(i12)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f51307p.size(); i13++) {
            if (!((l) this.f51307p.get(i13)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f51308q.size(); i14++) {
            if (!((y) this.f51308q.get(i14)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f51309r.size(); i15++) {
            if (!((g0) this.f51309r.get(i15)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f51310s.size(); i16++) {
            if (!((s0) this.f51310s.get(i16)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.f51311t.size(); i17++) {
            if (!((t) this.f51311t.get(i17)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        if ((this.f51295c & 16) == 16 && !this.f51315x.isInitialized()) {
            this.H = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.B.size(); i18++) {
            if (!((q0) this.B.get(i18)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        if ((this.f51295c & 64) == 64 && !this.E.isInitialized()) {
            this.H = (byte) 0;
            return false;
        }
        if (l()) {
            this.H = (byte) 1;
            return true;
        }
        this.H = (byte) 0;
        return false;
    }

    public final void s() {
        this.f51296d = 6;
        this.f51297e = 0;
        this.f51298f = 0;
        List list = Collections.EMPTY_LIST;
        this.f51299g = list;
        this.f51300h = list;
        this.f51301i = list;
        this.f51303k = list;
        this.f51304m = list;
        this.f51305n = list;
        this.f51307p = list;
        this.f51308q = list;
        this.f51309r = list;
        this.f51310s = list;
        this.f51311t = list;
        this.f51312u = list;
        this.f51314w = 0;
        this.f51315x = q0.f51409t;
        this.f51316y = 0;
        this.f51317z = list;
        this.B = list;
        this.C = list;
        this.E = w0.f51519g;
        this.F = list;
        this.G = d1.f51184e;
    }

    public j() {
        this.f51302j = -1;
        this.l = -1;
        this.f51306o = -1;
        this.f51313v = -1;
        this.A = -1;
        this.D = -1;
        this.H = (byte) -1;
        this.I = -1;
        this.f51294b = zl.d.f55026a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    public j(zl.e eVar, zl.g gVar) throws Throwable {
        this.f51302j = -1;
        this.l = -1;
        this.f51306o = -1;
        this.f51313v = -1;
        this.A = -1;
        this.D = -1;
        this.H = (byte) -1;
        this.I = -1;
        s();
        zl.c cVarS = zl.d.s();
        boolean z10 = true;
        k3 k3VarL = k3.l(cVarS, 1);
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            boolean z12 = z10;
            if (!z11) {
                try {
                    try {
                        int iN = eVar.n();
                        switch (iN) {
                            case 0:
                                z11 = z12;
                                z10 = z12;
                                break;
                            case 8:
                                this.f51295c |= 1;
                                this.f51296d = eVar.f();
                                z10 = z12;
                                break;
                            case 16:
                                if ((i10 & 32) != 32) {
                                    this.f51301i = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f51301i.add(Integer.valueOf(eVar.f()));
                                z10 = z12;
                                break;
                            case 18:
                                int iD = eVar.d(eVar.k());
                                if ((i10 & 32) != 32 && eVar.b() > 0) {
                                    this.f51301i = new ArrayList();
                                    i10 |= 32;
                                }
                                while (eVar.b() > 0) {
                                    this.f51301i.add(Integer.valueOf(eVar.f()));
                                }
                                eVar.c(iD);
                                z10 = z12;
                                break;
                            case 24:
                                this.f51295c |= 2;
                                this.f51297e = eVar.f();
                                z10 = z12;
                                break;
                            case 32:
                                this.f51295c |= 4;
                                this.f51298f = eVar.f();
                                z10 = z12;
                                break;
                            case 42:
                                if ((i10 & 8) != 8) {
                                    this.f51299g = new ArrayList();
                                    i10 |= 8;
                                }
                                this.f51299g.add(eVar.g(v0.f51496n, gVar));
                                z10 = z12;
                                break;
                            case 50:
                                if ((i10 & 16) != 16) {
                                    this.f51300h = new ArrayList();
                                    i10 |= 16;
                                }
                                this.f51300h.add(eVar.g(q0.f51410u, gVar));
                                z10 = z12;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                                if ((i10 & 64) != 64) {
                                    this.f51303k = new ArrayList();
                                    i10 |= 64;
                                }
                                this.f51303k.add(Integer.valueOf(eVar.f()));
                                z10 = z12;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                                int iD2 = eVar.d(eVar.k());
                                if ((i10 & 64) != 64 && eVar.b() > 0) {
                                    this.f51303k = new ArrayList();
                                    i10 |= 64;
                                }
                                while (eVar.b() > 0) {
                                    this.f51303k.add(Integer.valueOf(eVar.f()));
                                }
                                eVar.c(iD2);
                                z10 = z12;
                                break;
                            case 66:
                                if ((i10 & 512) != 512) {
                                    this.f51307p = new ArrayList();
                                    i10 |= 512;
                                }
                                this.f51307p.add(eVar.g(l.f51338j, gVar));
                                z10 = z12;
                                break;
                            case 74:
                                if ((i10 & 1024) != 1024) {
                                    this.f51308q = new ArrayList();
                                    i10 |= 1024;
                                }
                                this.f51308q.add(eVar.g(y.f51549v, gVar));
                                z10 = z12;
                                break;
                            case 82:
                                if ((i10 & com.ironsource.mediationsdk.metadata.a.f29616n) != 2048) {
                                    this.f51309r = new ArrayList();
                                    i10 |= com.ironsource.mediationsdk.metadata.a.f29616n;
                                }
                                this.f51309r.add(eVar.g(g0.f51237v, gVar));
                                z10 = z12;
                                break;
                            case 90:
                                if ((i10 & 4096) != 4096) {
                                    this.f51310s = new ArrayList();
                                    i10 |= 4096;
                                }
                                this.f51310s.add(eVar.g(s0.f51450p, gVar));
                                z10 = z12;
                                break;
                            case 106:
                                if ((i10 & Segment.SIZE) != 8192) {
                                    this.f51311t = new ArrayList();
                                    i10 |= Segment.SIZE;
                                }
                                this.f51311t.add(eVar.g(t.f51464h, gVar));
                                z10 = z12;
                                break;
                            case 128:
                                if ((i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                                    this.f51312u = new ArrayList();
                                    i10 |= Http2.INITIAL_MAX_FRAME_SIZE;
                                }
                                this.f51312u.add(Integer.valueOf(eVar.f()));
                                z10 = z12;
                                break;
                            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                                int iD3 = eVar.d(eVar.k());
                                if ((i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 16384 && eVar.b() > 0) {
                                    this.f51312u = new ArrayList();
                                    i10 |= Http2.INITIAL_MAX_FRAME_SIZE;
                                }
                                while (eVar.b() > 0) {
                                    this.f51312u.add(Integer.valueOf(eVar.f()));
                                }
                                eVar.c(iD3);
                                z10 = z12;
                                break;
                            case 136:
                                this.f51295c |= 8;
                                this.f51314w = eVar.f();
                                z10 = z12;
                                break;
                            case 146:
                                p0 p0VarV = (this.f51295c & 16) == 16 ? this.f51315x.h() : null;
                                q0 q0Var = (q0) eVar.g(q0.f51410u, gVar);
                                this.f51315x = q0Var;
                                if (p0VarV != 0) {
                                    p0VarV.g(q0Var);
                                    this.f51315x = p0VarV.e();
                                }
                                this.f51295c |= 16;
                                z10 = z12;
                                break;
                            case 152:
                                this.f51295c |= 32;
                                this.f51316y = eVar.f();
                                z10 = z12;
                                break;
                            case 162:
                                if ((i10 & 128) != 128) {
                                    this.f51304m = new ArrayList();
                                    i10 |= 128;
                                }
                                this.f51304m.add(eVar.g(q0.f51410u, gVar));
                                z10 = z12;
                                break;
                            case 168:
                                if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 256) {
                                    this.f51305n = new ArrayList();
                                    i10 |= NotificationCompat.FLAG_LOCAL_ONLY;
                                }
                                this.f51305n.add(Integer.valueOf(eVar.f()));
                                z10 = z12;
                                break;
                            case 170:
                                int iD4 = eVar.d(eVar.k());
                                if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 256 && eVar.b() > 0) {
                                    this.f51305n = new ArrayList();
                                    i10 |= NotificationCompat.FLAG_LOCAL_ONLY;
                                }
                                while (eVar.b() > 0) {
                                    this.f51305n.add(Integer.valueOf(eVar.f()));
                                }
                                eVar.c(iD4);
                                z10 = z12;
                                break;
                            case 176:
                                if ((i10 & 262144) != 262144) {
                                    this.f51317z = new ArrayList();
                                    i10 |= 262144;
                                }
                                this.f51317z.add(Integer.valueOf(eVar.f()));
                                z10 = z12;
                                break;
                            case 178:
                                int iD5 = eVar.d(eVar.k());
                                if ((i10 & 262144) != 262144 && eVar.b() > 0) {
                                    this.f51317z = new ArrayList();
                                    i10 |= 262144;
                                }
                                while (eVar.b() > 0) {
                                    this.f51317z.add(Integer.valueOf(eVar.f()));
                                }
                                eVar.c(iD5);
                                z10 = z12;
                                break;
                            case 186:
                                if ((i10 & 524288) != 524288) {
                                    this.B = new ArrayList();
                                    i10 |= 524288;
                                }
                                this.B.add(eVar.g(q0.f51410u, gVar));
                                z10 = z12;
                                break;
                            case PsExtractor.AUDIO_STREAM /* 192 */:
                                if ((i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 1048576) {
                                    this.C = new ArrayList();
                                    i10 |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                }
                                this.C.add(Integer.valueOf(eVar.f()));
                                z10 = z12;
                                break;
                            case 194:
                                int iD6 = eVar.d(eVar.k());
                                if ((i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 1048576 && eVar.b() > 0) {
                                    this.C = new ArrayList();
                                    i10 |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                }
                                while (eVar.b() > 0) {
                                    this.C.add(Integer.valueOf(eVar.f()));
                                }
                                eVar.c(iD6);
                                z10 = z12;
                                break;
                            case 242:
                                f fVarM = (this.f51295c & 64) == 64 ? this.E.m() : null;
                                w0 w0Var = (w0) eVar.g(w0.f51520h, gVar);
                                this.E = w0Var;
                                if (fVarM != 0) {
                                    fVarM.l(w0Var);
                                    this.E = fVarM.g();
                                }
                                this.f51295c |= 64;
                                z10 = z12;
                                break;
                            case 248:
                                if ((i10 & 4194304) != 4194304) {
                                    this.F = new ArrayList();
                                    i10 |= 4194304;
                                }
                                this.F.add(Integer.valueOf(eVar.f()));
                                z10 = z12;
                                break;
                            case 250:
                                int iD7 = eVar.d(eVar.k());
                                if ((i10 & 4194304) != 4194304 && eVar.b() > 0) {
                                    this.F = new ArrayList();
                                    i10 |= 4194304;
                                }
                                while (eVar.b() > 0) {
                                    this.F.add(Integer.valueOf(eVar.f()));
                                }
                                eVar.c(iD7);
                                z10 = z12;
                                break;
                            case 258:
                                try {
                                    m mVarL = (this.f51295c & 128) == 128 ? this.G.l() : null;
                                    d1 d1Var = (d1) eVar.g(d1.f51185f, gVar);
                                    this.G = d1Var;
                                    if (mVarL != 0) {
                                        mVarL.m(d1Var);
                                        this.G = mVarL.i();
                                    }
                                    this.f51295c |= 128;
                                    z10 = z12;
                                } catch (zl.q e10) {
                                    e = e10;
                                    e.f55076a = this;
                                    throw e;
                                } catch (IOException e11) {
                                    e = e11;
                                    zl.q qVar = new zl.q(e.getMessage());
                                    qVar.f55076a = this;
                                    throw qVar;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if ((i10 & 32) == 32) {
                                        this.f51301i = Collections.unmodifiableList(this.f51301i);
                                    }
                                    if ((i10 & 8) == 8) {
                                        this.f51299g = Collections.unmodifiableList(this.f51299g);
                                    }
                                    if ((i10 & 16) == 16) {
                                        this.f51300h = Collections.unmodifiableList(this.f51300h);
                                    }
                                    if ((i10 & 64) == 64) {
                                        this.f51303k = Collections.unmodifiableList(this.f51303k);
                                    }
                                    if ((i10 & 512) == 512) {
                                        this.f51307p = Collections.unmodifiableList(this.f51307p);
                                    }
                                    if ((i10 & 1024) == 1024) {
                                        this.f51308q = Collections.unmodifiableList(this.f51308q);
                                    }
                                    if ((i10 & com.ironsource.mediationsdk.metadata.a.f29616n) == 2048) {
                                        this.f51309r = Collections.unmodifiableList(this.f51309r);
                                    }
                                    if ((i10 & 4096) == 4096) {
                                        this.f51310s = Collections.unmodifiableList(this.f51310s);
                                    }
                                    if ((i10 & Segment.SIZE) == 8192) {
                                        this.f51311t = Collections.unmodifiableList(this.f51311t);
                                    }
                                    if ((i10 & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                                        this.f51312u = Collections.unmodifiableList(this.f51312u);
                                    }
                                    if ((i10 & 128) == 128) {
                                        this.f51304m = Collections.unmodifiableList(this.f51304m);
                                    }
                                    if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
                                        this.f51305n = Collections.unmodifiableList(this.f51305n);
                                    }
                                    if ((i10 & 262144) == 262144) {
                                        this.f51317z = Collections.unmodifiableList(this.f51317z);
                                    }
                                    if ((i10 & 524288) == 524288) {
                                        this.B = Collections.unmodifiableList(this.B);
                                    }
                                    if ((i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576) {
                                        this.C = Collections.unmodifiableList(this.C);
                                    }
                                    if ((i10 & 4194304) == 4194304) {
                                        this.F = Collections.unmodifiableList(this.F);
                                    }
                                    try {
                                        k3VarL.j();
                                        break;
                                    } catch (IOException unused) {
                                    } finally {
                                        this.f51294b = cVarS.h();
                                    }
                                    p();
                                    throw th;
                                }
                                break;
                            default:
                                if (!q(eVar, k3VarL, gVar, iN)) {
                                    z11 = z12;
                                }
                                z10 = z12;
                                break;
                        }
                    } catch (zl.q e12) {
                        e = e12;
                    } catch (IOException e13) {
                        e = e13;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                if ((i10 & 32) == 32) {
                    this.f51301i = Collections.unmodifiableList(this.f51301i);
                }
                if ((i10 & 8) == 8) {
                    this.f51299g = Collections.unmodifiableList(this.f51299g);
                }
                if ((i10 & 16) == 16) {
                    this.f51300h = Collections.unmodifiableList(this.f51300h);
                }
                if ((i10 & 64) == 64) {
                    this.f51303k = Collections.unmodifiableList(this.f51303k);
                }
                if ((i10 & 512) == 512) {
                    this.f51307p = Collections.unmodifiableList(this.f51307p);
                }
                if ((i10 & 1024) == 1024) {
                    this.f51308q = Collections.unmodifiableList(this.f51308q);
                }
                if ((i10 & com.ironsource.mediationsdk.metadata.a.f29616n) == 2048) {
                    this.f51309r = Collections.unmodifiableList(this.f51309r);
                }
                if ((i10 & 4096) == 4096) {
                    this.f51310s = Collections.unmodifiableList(this.f51310s);
                }
                if ((i10 & Segment.SIZE) == 8192) {
                    this.f51311t = Collections.unmodifiableList(this.f51311t);
                }
                if ((i10 & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                    this.f51312u = Collections.unmodifiableList(this.f51312u);
                }
                if ((i10 & 128) == 128) {
                    this.f51304m = Collections.unmodifiableList(this.f51304m);
                }
                if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
                    this.f51305n = Collections.unmodifiableList(this.f51305n);
                }
                if ((i10 & 262144) == 262144) {
                    this.f51317z = Collections.unmodifiableList(this.f51317z);
                }
                if ((i10 & 524288) == 524288) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                if ((i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576) {
                    this.C = Collections.unmodifiableList(this.C);
                }
                if ((i10 & 4194304) == 4194304) {
                    this.F = Collections.unmodifiableList(this.F);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused2) {
                } finally {
                    this.f51294b = cVarS.h();
                }
                p();
                return;
            }
        }
    }
}

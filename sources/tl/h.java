package tl;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends zl.j {
    public List A;
    public d1 B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f51260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f51261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f51262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f51263k;
    public List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f51264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f51265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f51266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f51267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f51268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f51269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f51270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f51271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q0 f51272u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f51273v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f51274w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f51275x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f51276y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public w0 f51277z;

    public static h f() {
        h hVar = new h();
        hVar.f51257e = 6;
        List list = Collections.EMPTY_LIST;
        hVar.f51260h = list;
        hVar.f51261i = list;
        hVar.f51262j = list;
        hVar.f51263k = list;
        hVar.l = list;
        hVar.f51264m = list;
        hVar.f51265n = list;
        hVar.f51266o = list;
        hVar.f51267p = list;
        hVar.f51268q = list;
        hVar.f51269r = list;
        hVar.f51270s = list;
        hVar.f51272u = q0.f51409t;
        hVar.f51274w = list;
        hVar.f51275x = list;
        hVar.f51276y = list;
        hVar.f51277z = w0.f51519g;
        hVar.A = list;
        hVar.B = d1.f51184e;
        return hVar;
    }

    @Override // zl.i
    public final zl.a a() {
        j jVarE = e();
        if (jVarE.isInitialized()) {
            return jVarE;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        j jVar = null;
        try {
            try {
                j.K.getClass();
                g(new j(eVar, gVar));
                return this;
            } catch (zl.q e10) {
                j jVar2 = (j) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    jVar = jVar2;
                    if (jVar != null) {
                        g(jVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (jVar != null) {
                g(jVar);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        g((j) nVar);
        return this;
    }

    public final Object clone() {
        h hVarF = f();
        hVarF.g(e());
        return hVarF;
    }

    public final j e() {
        j jVar = new j(this);
        int i10 = this.f51256d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        jVar.f51296d = this.f51257e;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        jVar.f51297e = this.f51258f;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        jVar.f51298f = this.f51259g;
        if ((i10 & 8) == 8) {
            this.f51260h = Collections.unmodifiableList(this.f51260h);
            this.f51256d &= -9;
        }
        jVar.f51299g = this.f51260h;
        if ((this.f51256d & 16) == 16) {
            this.f51261i = Collections.unmodifiableList(this.f51261i);
            this.f51256d &= -17;
        }
        jVar.f51300h = this.f51261i;
        if ((this.f51256d & 32) == 32) {
            this.f51262j = Collections.unmodifiableList(this.f51262j);
            this.f51256d &= -33;
        }
        jVar.f51301i = this.f51262j;
        if ((this.f51256d & 64) == 64) {
            this.f51263k = Collections.unmodifiableList(this.f51263k);
            this.f51256d &= -65;
        }
        jVar.f51303k = this.f51263k;
        if ((this.f51256d & 128) == 128) {
            this.l = Collections.unmodifiableList(this.l);
            this.f51256d &= -129;
        }
        jVar.f51304m = this.l;
        if ((this.f51256d & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            this.f51264m = Collections.unmodifiableList(this.f51264m);
            this.f51256d &= -257;
        }
        jVar.f51305n = this.f51264m;
        if ((this.f51256d & 512) == 512) {
            this.f51265n = Collections.unmodifiableList(this.f51265n);
            this.f51256d &= -513;
        }
        jVar.f51307p = this.f51265n;
        if ((this.f51256d & 1024) == 1024) {
            this.f51266o = Collections.unmodifiableList(this.f51266o);
            this.f51256d &= -1025;
        }
        jVar.f51308q = this.f51266o;
        if ((this.f51256d & com.ironsource.mediationsdk.metadata.a.f29616n) == 2048) {
            this.f51267p = Collections.unmodifiableList(this.f51267p);
            this.f51256d &= -2049;
        }
        jVar.f51309r = this.f51267p;
        if ((this.f51256d & 4096) == 4096) {
            this.f51268q = Collections.unmodifiableList(this.f51268q);
            this.f51256d &= -4097;
        }
        jVar.f51310s = this.f51268q;
        if ((this.f51256d & Segment.SIZE) == 8192) {
            this.f51269r = Collections.unmodifiableList(this.f51269r);
            this.f51256d &= -8193;
        }
        jVar.f51311t = this.f51269r;
        if ((this.f51256d & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
            this.f51270s = Collections.unmodifiableList(this.f51270s);
            this.f51256d &= -16385;
        }
        jVar.f51312u = this.f51270s;
        if ((i10 & 32768) == 32768) {
            i11 |= 8;
        }
        jVar.f51314w = this.f51271t;
        if ((i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 65536) {
            i11 |= 16;
        }
        jVar.f51315x = this.f51272u;
        if ((i10 & 131072) == 131072) {
            i11 |= 32;
        }
        jVar.f51316y = this.f51273v;
        if ((this.f51256d & 262144) == 262144) {
            this.f51274w = Collections.unmodifiableList(this.f51274w);
            this.f51256d &= -262145;
        }
        jVar.f51317z = this.f51274w;
        if ((this.f51256d & 524288) == 524288) {
            this.f51275x = Collections.unmodifiableList(this.f51275x);
            this.f51256d &= -524289;
        }
        jVar.B = this.f51275x;
        if ((this.f51256d & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576) {
            this.f51276y = Collections.unmodifiableList(this.f51276y);
            this.f51256d &= -1048577;
        }
        jVar.C = this.f51276y;
        if ((i10 & 2097152) == 2097152) {
            i11 |= 64;
        }
        jVar.E = this.f51277z;
        if ((this.f51256d & 4194304) == 4194304) {
            this.A = Collections.unmodifiableList(this.A);
            this.f51256d &= -4194305;
        }
        jVar.F = this.A;
        if ((i10 & 8388608) == 8388608) {
            i11 |= 128;
        }
        jVar.G = this.B;
        jVar.f51295c = i11;
        return jVar;
    }

    public final void g(j jVar) {
        d1 d1Var;
        w0 w0Var;
        q0 q0Var;
        if (jVar == j.J) {
            return;
        }
        int i10 = jVar.f51295c;
        if ((i10 & 1) == 1) {
            int i11 = jVar.f51296d;
            this.f51256d = 1 | this.f51256d;
            this.f51257e = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = jVar.f51297e;
            this.f51256d = 2 | this.f51256d;
            this.f51258f = i12;
        }
        if ((i10 & 4) == 4) {
            int i13 = jVar.f51298f;
            this.f51256d = 4 | this.f51256d;
            this.f51259g = i13;
        }
        if (!jVar.f51299g.isEmpty()) {
            if (this.f51260h.isEmpty()) {
                this.f51260h = jVar.f51299g;
                this.f51256d &= -9;
            } else {
                if ((this.f51256d & 8) != 8) {
                    this.f51260h = new ArrayList(this.f51260h);
                    this.f51256d |= 8;
                }
                this.f51260h.addAll(jVar.f51299g);
            }
        }
        if (!jVar.f51300h.isEmpty()) {
            if (this.f51261i.isEmpty()) {
                this.f51261i = jVar.f51300h;
                this.f51256d &= -17;
            } else {
                if ((this.f51256d & 16) != 16) {
                    this.f51261i = new ArrayList(this.f51261i);
                    this.f51256d |= 16;
                }
                this.f51261i.addAll(jVar.f51300h);
            }
        }
        if (!jVar.f51301i.isEmpty()) {
            if (this.f51262j.isEmpty()) {
                this.f51262j = jVar.f51301i;
                this.f51256d &= -33;
            } else {
                if ((this.f51256d & 32) != 32) {
                    this.f51262j = new ArrayList(this.f51262j);
                    this.f51256d |= 32;
                }
                this.f51262j.addAll(jVar.f51301i);
            }
        }
        if (!jVar.f51303k.isEmpty()) {
            if (this.f51263k.isEmpty()) {
                this.f51263k = jVar.f51303k;
                this.f51256d &= -65;
            } else {
                if ((this.f51256d & 64) != 64) {
                    this.f51263k = new ArrayList(this.f51263k);
                    this.f51256d |= 64;
                }
                this.f51263k.addAll(jVar.f51303k);
            }
        }
        if (!jVar.f51304m.isEmpty()) {
            if (this.l.isEmpty()) {
                this.l = jVar.f51304m;
                this.f51256d &= -129;
            } else {
                if ((this.f51256d & 128) != 128) {
                    this.l = new ArrayList(this.l);
                    this.f51256d |= 128;
                }
                this.l.addAll(jVar.f51304m);
            }
        }
        if (!jVar.f51305n.isEmpty()) {
            if (this.f51264m.isEmpty()) {
                this.f51264m = jVar.f51305n;
                this.f51256d &= -257;
            } else {
                if ((this.f51256d & NotificationCompat.FLAG_LOCAL_ONLY) != 256) {
                    this.f51264m = new ArrayList(this.f51264m);
                    this.f51256d |= NotificationCompat.FLAG_LOCAL_ONLY;
                }
                this.f51264m.addAll(jVar.f51305n);
            }
        }
        if (!jVar.f51307p.isEmpty()) {
            if (this.f51265n.isEmpty()) {
                this.f51265n = jVar.f51307p;
                this.f51256d &= -513;
            } else {
                if ((this.f51256d & 512) != 512) {
                    this.f51265n = new ArrayList(this.f51265n);
                    this.f51256d |= 512;
                }
                this.f51265n.addAll(jVar.f51307p);
            }
        }
        if (!jVar.f51308q.isEmpty()) {
            if (this.f51266o.isEmpty()) {
                this.f51266o = jVar.f51308q;
                this.f51256d &= -1025;
            } else {
                if ((this.f51256d & 1024) != 1024) {
                    this.f51266o = new ArrayList(this.f51266o);
                    this.f51256d |= 1024;
                }
                this.f51266o.addAll(jVar.f51308q);
            }
        }
        if (!jVar.f51309r.isEmpty()) {
            if (this.f51267p.isEmpty()) {
                this.f51267p = jVar.f51309r;
                this.f51256d &= -2049;
            } else {
                if ((this.f51256d & com.ironsource.mediationsdk.metadata.a.f29616n) != 2048) {
                    this.f51267p = new ArrayList(this.f51267p);
                    this.f51256d |= com.ironsource.mediationsdk.metadata.a.f29616n;
                }
                this.f51267p.addAll(jVar.f51309r);
            }
        }
        if (!jVar.f51310s.isEmpty()) {
            if (this.f51268q.isEmpty()) {
                this.f51268q = jVar.f51310s;
                this.f51256d &= -4097;
            } else {
                if ((this.f51256d & 4096) != 4096) {
                    this.f51268q = new ArrayList(this.f51268q);
                    this.f51256d |= 4096;
                }
                this.f51268q.addAll(jVar.f51310s);
            }
        }
        if (!jVar.f51311t.isEmpty()) {
            if (this.f51269r.isEmpty()) {
                this.f51269r = jVar.f51311t;
                this.f51256d &= -8193;
            } else {
                if ((this.f51256d & Segment.SIZE) != 8192) {
                    this.f51269r = new ArrayList(this.f51269r);
                    this.f51256d |= Segment.SIZE;
                }
                this.f51269r.addAll(jVar.f51311t);
            }
        }
        if (!jVar.f51312u.isEmpty()) {
            if (this.f51270s.isEmpty()) {
                this.f51270s = jVar.f51312u;
                this.f51256d &= -16385;
            } else {
                if ((this.f51256d & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                    this.f51270s = new ArrayList(this.f51270s);
                    this.f51256d |= Http2.INITIAL_MAX_FRAME_SIZE;
                }
                this.f51270s.addAll(jVar.f51312u);
            }
        }
        int i14 = jVar.f51295c;
        if ((i14 & 8) == 8) {
            int i15 = jVar.f51314w;
            this.f51256d |= 32768;
            this.f51271t = i15;
        }
        if ((i14 & 16) == 16) {
            q0 q0Var2 = jVar.f51315x;
            if ((this.f51256d & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 65536 || (q0Var = this.f51272u) == q0.f51409t) {
                this.f51272u = q0Var2;
            } else {
                p0 p0VarU = q0.u(q0Var);
                p0VarU.g(q0Var2);
                this.f51272u = p0VarU.e();
            }
            this.f51256d |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((jVar.f51295c & 32) == 32) {
            int i16 = jVar.f51316y;
            this.f51256d |= 131072;
            this.f51273v = i16;
        }
        if (!jVar.f51317z.isEmpty()) {
            if (this.f51274w.isEmpty()) {
                this.f51274w = jVar.f51317z;
                this.f51256d &= -262145;
            } else {
                if ((this.f51256d & 262144) != 262144) {
                    this.f51274w = new ArrayList(this.f51274w);
                    this.f51256d |= 262144;
                }
                this.f51274w.addAll(jVar.f51317z);
            }
        }
        if (!jVar.B.isEmpty()) {
            if (this.f51275x.isEmpty()) {
                this.f51275x = jVar.B;
                this.f51256d &= -524289;
            } else {
                if ((this.f51256d & 524288) != 524288) {
                    this.f51275x = new ArrayList(this.f51275x);
                    this.f51256d |= 524288;
                }
                this.f51275x.addAll(jVar.B);
            }
        }
        if (!jVar.C.isEmpty()) {
            if (this.f51276y.isEmpty()) {
                this.f51276y = jVar.C;
                this.f51256d &= -1048577;
            } else {
                if ((this.f51256d & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 1048576) {
                    this.f51276y = new ArrayList(this.f51276y);
                    this.f51256d |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                }
                this.f51276y.addAll(jVar.C);
            }
        }
        if ((jVar.f51295c & 64) == 64) {
            w0 w0Var2 = jVar.E;
            if ((this.f51256d & 2097152) != 2097152 || (w0Var = this.f51277z) == w0.f51519g) {
                this.f51277z = w0Var2;
            } else {
                f fVarL = w0.l(w0Var);
                fVarL.l(w0Var2);
                this.f51277z = fVarL.g();
            }
            this.f51256d |= 2097152;
        }
        if (!jVar.F.isEmpty()) {
            if (this.A.isEmpty()) {
                this.A = jVar.F;
                this.f51256d &= -4194305;
            } else {
                if ((this.f51256d & 4194304) != 4194304) {
                    this.A = new ArrayList(this.A);
                    this.f51256d |= 4194304;
                }
                this.A.addAll(jVar.F);
            }
        }
        if ((jVar.f51295c & 128) == 128) {
            d1 d1Var2 = jVar.G;
            if ((this.f51256d & 8388608) != 8388608 || (d1Var = this.B) == d1.f51184e) {
                this.B = d1Var2;
            } else {
                m mVar = new m(2);
                mVar.f51354d = Collections.EMPTY_LIST;
                mVar.m(d1Var);
                mVar.m(d1Var2);
                this.B = mVar.i();
            }
            this.f51256d |= 8388608;
        }
        d(jVar);
        this.f55044a = this.f55044a.h(jVar.f51294b);
    }
}

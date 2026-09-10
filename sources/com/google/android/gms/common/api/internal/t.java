package com.google.android.gms.common.api.internal;

import android.content.Context;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.b02;
import com.google.android.gms.internal.ads.zl;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import m0.s1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements k9.d, uf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f11768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f11769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f11770f;

    public t(Context context) {
        this.f11766b = context;
        this.f11767c = b02.f12591h;
        this.f11768d = new zl(context, 3);
    }

    @Override // k9.d
    public void a(ConnectionResult connectionResult) {
        ((e) this.f11770f).f11705n.post(new i0(this, connectionResult, 1));
    }

    @Override // uf.a
    public void b() throws JSONException, IOException {
        ((xi.p) this.f11766b).a("updateProgress", Double.valueOf(100.0d), null);
        JSONObject jSONObjectW = j2.n.w((Context) this.f11767c, (String) this.f11768d);
        jSONObjectW.put("isCancel", false);
        ((wi.j) this.f11769e).a(jSONObjectW.toString());
        if (this.f11765a) {
            new File((String) this.f11770f).delete();
        }
    }

    @Override // uf.a
    public void c() {
        ((wi.j) this.f11769e).a(null);
    }

    @Override // uf.a
    public void d(Exception exc) {
        ((wi.j) this.f11769e).a(null);
    }

    @Override // uf.a
    public void e(double d10) {
        ((xi.p) this.f11766b).a("updateProgress", Double.valueOf(d10 * 100.0d), null);
    }

    public na.r f(int i10) {
        na.r pVar;
        HashMap map = (HashMap) this.f11767c;
        na.r rVar = (na.r) map.get(Integer.valueOf(i10));
        if (rVar != null) {
            return rVar;
        }
        final s1 s1Var = (s1) this.f11769e;
        s1Var.getClass();
        if (i10 == 0) {
            final Class clsAsSubclass = DashMediaSource$Factory.class.asSubclass(f2.b0.class);
            final int i11 = 0;
            pVar = new na.r() { // from class: f2.o
                @Override // na.r
                public final Object get() {
                    switch (i11) {
                        case 0:
                            return q.e((Class) clsAsSubclass, s1Var);
                        case 1:
                            return q.e((Class) clsAsSubclass, s1Var);
                        case 2:
                            return q.e((Class) clsAsSubclass, s1Var);
                        default:
                            return new w0(s1Var, (n2.i) ((com.google.android.gms.common.api.internal.t) clsAsSubclass).f11766b);
                    }
                }
            };
        } else if (i10 == 1) {
            final Class clsAsSubclass2 = SsMediaSource$Factory.class.asSubclass(f2.b0.class);
            final int i12 = 1;
            pVar = new na.r() { // from class: f2.o
                @Override // na.r
                public final Object get() {
                    switch (i12) {
                        case 0:
                            return q.e((Class) clsAsSubclass2, s1Var);
                        case 1:
                            return q.e((Class) clsAsSubclass2, s1Var);
                        case 2:
                            return q.e((Class) clsAsSubclass2, s1Var);
                        default:
                            return new w0(s1Var, (n2.i) ((com.google.android.gms.common.api.internal.t) clsAsSubclass2).f11766b);
                    }
                }
            };
        } else if (i10 == 2) {
            final Class clsAsSubclass3 = HlsMediaSource$Factory.class.asSubclass(f2.b0.class);
            final int i13 = 2;
            pVar = new na.r() { // from class: f2.o
                @Override // na.r
                public final Object get() {
                    switch (i13) {
                        case 0:
                            return q.e((Class) clsAsSubclass3, s1Var);
                        case 1:
                            return q.e((Class) clsAsSubclass3, s1Var);
                        case 2:
                            return q.e((Class) clsAsSubclass3, s1Var);
                        default:
                            return new w0(s1Var, (n2.i) ((com.google.android.gms.common.api.internal.t) clsAsSubclass3).f11766b);
                    }
                }
            };
        } else if (i10 == 3) {
            pVar = new f2.p(RtspMediaSource$Factory.class.asSubclass(f2.b0.class), 0);
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException(l1.d.e(i10, "Unrecognized contentType: "));
            }
            final int i14 = 3;
            pVar = new na.r() { // from class: f2.o
                @Override // na.r
                public final Object get() {
                    switch (i14) {
                        case 0:
                            return q.e((Class) this, s1Var);
                        case 1:
                            return q.e((Class) this, s1Var);
                        case 2:
                            return q.e((Class) this, s1Var);
                        default:
                            return new w0(s1Var, (n2.i) ((com.google.android.gms.common.api.internal.t) this).f11766b);
                    }
                }
            };
        }
        map.put(Integer.valueOf(i10), pVar);
        return pVar;
    }

    public void g(ConnectionResult connectionResult) {
        r rVar = (r) ((e) this.f11770f).f11702j.get((a) this.f11767c);
        if (rVar != null) {
            rVar.k(connectionResult);
        }
    }

    public t(e eVar, j9.c cVar, a aVar) {
        Objects.requireNonNull(eVar);
        this.f11770f = eVar;
        this.f11768d = null;
        this.f11769e = null;
        this.f11765a = false;
        this.f11766b = cVar;
        this.f11767c = aVar;
    }

    public t(xi.p pVar, k7.a aVar, Context context, String str, wi.j jVar, boolean z10, String str2) {
        this.f11766b = pVar;
        this.f11767c = context;
        this.f11768d = str;
        this.f11769e = jVar;
        this.f11765a = z10;
        this.f11770f = str2;
    }

    public t(n2.i iVar, j2.n nVar) {
        this.f11766b = iVar;
        this.f11770f = nVar;
        this.f11767c = new HashMap();
        this.f11768d = new HashMap();
        this.f11765a = true;
    }
}

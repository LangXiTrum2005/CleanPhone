package com.smartdigimkt.s8;

import android.content.Context;
import com.smartdigimkt.l8.e;
import com.smartdigimkt.l8.f;
import com.smartdigimkt.q8.k;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class b implements com.smartdigimkt.t8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f38236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SDMAdRequest f38237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38238c;
    private final k d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f38239e;
    private final AtomicBoolean f = new AtomicBoolean(false);
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f38240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.smartdigimkt.t8.b f38241i;
    private com.smartdigimkt.h7.b j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private e f38242l;
    private f m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.smartdigimkt.v6.a f38243n;
    private com.smartdigimkt.y4.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.smartdigimkt.y6.b f38244p;
    private com.smartdigimkt.v7.a q;
    private d r;
    private com.smartdigimkt.a7.a s;
    private final int t;

    public b(Context context, String str, int i2, int i3, SDMAdRequest sDMAdRequest, k kVar) {
        this.f38236a = context.getApplicationContext();
        this.f38237b = sDMAdRequest;
        this.t = i3;
        this.d = kVar;
        this.f38239e = str;
        this.f38238c = i2;
    }

    public d a() {
        return this.r;
    }

    public void b(boolean z2) {
        this.f38240h = z2;
    }

    public SDMAdRequest c() {
        return this.f38237b;
    }

    @Override // com.smartdigimkt.t8.a
    public void d(long j) {
        com.smartdigimkt.t8.b bVar = this.f38241i;
        if (bVar != null) {
            bVar.d(j);
        }
    }

    public com.smartdigimkt.v6.a e() {
        return this.f38243n;
    }

    public com.smartdigimkt.y6.b f() {
        return this.f38244p;
    }

    public Context g() {
        return this.f38236a;
    }

    public com.smartdigimkt.v7.a h() {
        return this.q;
    }

    public int i() {
        return this.f38238c;
    }

    public k j() {
        return this.d;
    }

    public int k() {
        return this.t;
    }

    public com.smartdigimkt.y4.d l() {
        return this.o;
    }

    public e m() {
        return this.f38242l;
    }

    public String n() {
        return this.f38239e;
    }

    public String o() {
        return this.g;
    }

    public com.smartdigimkt.t8.b p() {
        return this.f38241i;
    }

    public f q() {
        return this.m;
    }

    public boolean r() {
        return this.f.get();
    }

    public boolean s() {
        return this.f38240h;
    }

    public boolean t() {
        return this.k;
    }

    public void a(com.smartdigimkt.v7.a aVar) {
        this.q = aVar;
        if (aVar != null) {
            aVar.a(this.s);
        }
    }

    @Override // com.smartdigimkt.t8.a
    public void b(long j) {
        com.smartdigimkt.t8.b bVar = this.f38241i;
        if (bVar != null) {
            bVar.b(j);
        }
    }

    public void c(boolean z2) {
        this.k = z2;
    }

    @Override // com.smartdigimkt.t8.a
    public void e(long j) {
        com.smartdigimkt.t8.b bVar = this.f38241i;
        if (bVar != null) {
            bVar.e(j);
        }
    }

    @Override // com.smartdigimkt.t8.a
    public void f(long j) {
        com.smartdigimkt.t8.b bVar = this.f38241i;
        if (bVar != null) {
            bVar.f(j);
        }
    }

    @Override // com.smartdigimkt.t8.a
    public void g(long j) {
        com.smartdigimkt.t8.b bVar = this.f38241i;
        if (bVar != null) {
            bVar.g(j);
        }
    }

    @Override // com.smartdigimkt.t8.a
    public void c(long j) {
        com.smartdigimkt.t8.b bVar = this.f38241i;
        if (bVar != null) {
            bVar.c(j);
        }
    }

    public com.smartdigimkt.a7.a d() {
        return this.s;
    }

    public void a(e eVar) {
        this.f38242l = eVar;
    }

    public com.smartdigimkt.h7.b b() {
        return this.j;
    }

    public void a(f fVar) {
        this.m = fVar;
    }

    public void a(d dVar) {
        this.r = dVar;
    }

    public void a(com.smartdigimkt.v6.a aVar) {
        this.f38243n = aVar;
    }

    public void a(com.smartdigimkt.y6.b bVar) {
        this.f38244p = bVar;
    }

    public void a(com.smartdigimkt.t8.b bVar) {
        this.f38241i = bVar;
    }

    @Override // com.smartdigimkt.t8.a
    public void a(long j) {
        com.smartdigimkt.t8.b bVar = this.f38241i;
        if (bVar != null) {
            bVar.a(j);
        }
    }

    public void a(com.smartdigimkt.h7.b bVar) {
        this.j = bVar;
    }

    public void a(String str) {
        this.g = str;
    }

    public void a(boolean z2) {
        this.f.set(z2);
    }

    public void a(com.smartdigimkt.y4.d dVar) {
        this.o = dVar;
    }

    public void a(com.smartdigimkt.a7.a aVar) {
        this.s = aVar;
    }
}

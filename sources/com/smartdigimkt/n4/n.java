package com.smartdigimkt.n4;

import android.content.Context;
import android.net.Uri;
import com.smartdigimkt.p4.f0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f37027l = "DefaultDataSource";
    private static final String m = "asset";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f37028n = "content";
    private static final String o = "rtmp";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f37029p = "rawresource";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f37030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0<? super h> f37031c;
    private final h d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f37032e;
    private h f;
    private h g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private h f37033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f37034i;
    private h j;
    private h k;

    public n(Context context, a0<? super h> a0Var, String str, boolean z2) {
        this(context, a0Var, str, 8000, 8000, z2);
    }

    private h d() {
        if (this.f == null) {
            this.f = new c(this.f37030b, this.f37031c);
        }
        return this.f;
    }

    private h e() {
        if (this.g == null) {
            this.g = new e(this.f37030b, this.f37031c);
        }
        return this.g;
    }

    private h f() {
        if (this.f37034i == null) {
            this.f37034i = new f();
        }
        return this.f37034i;
    }

    private h g() {
        if (this.f37032e == null) {
            this.f37032e = new r(this.f37031c);
        }
        return this.f37032e;
    }

    private h h() {
        if (this.j == null) {
            this.j = new y(this.f37030b, this.f37031c);
        }
        return this.j;
    }

    private h i() {
        h hVar = this.f37033h;
        if (hVar == null && hVar == null) {
            this.f37033h = this.d;
        }
        return this.f37033h;
    }

    @Override // com.smartdigimkt.n4.h
    public long a(k kVar) throws IOException {
        com.smartdigimkt.p4.a.b(this.k == null);
        String scheme = kVar.f37004a.getScheme();
        if (f0.b(kVar.f37004a)) {
            if (kVar.f37004a.getPath().startsWith("/android_asset/")) {
                this.k = d();
            } else {
                this.k = g();
            }
        } else if (m.equals(scheme)) {
            this.k = d();
        } else if ("content".equals(scheme)) {
            this.k = e();
        } else if (o.equals(scheme)) {
            this.k = i();
        } else if ("data".equals(scheme)) {
            this.k = f();
        } else if ("rawresource".equals(scheme)) {
            this.k = h();
        } else {
            this.k = this.d;
        }
        return this.k.a(kVar);
    }

    @Override // com.smartdigimkt.n4.h
    public Uri c() {
        h hVar = this.k;
        if (hVar == null) {
            return null;
        }
        return hVar.c();
    }

    @Override // com.smartdigimkt.n4.h
    public void close() throws IOException {
        h hVar = this.k;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.k = null;
            }
        }
    }

    public n(Context context, a0<? super h> a0Var, String str, int i2, int i3, boolean z2) {
        this(context, a0Var, new p(str, null, a0Var, i2, i3, z2, null));
    }

    public n(Context context, a0<? super h> a0Var, h hVar) {
        this.f37030b = context.getApplicationContext();
        this.f37031c = a0Var;
        this.d = (h) com.smartdigimkt.p4.a.a(hVar);
    }

    @Override // com.smartdigimkt.n4.h
    public int a(byte[] bArr, int i2, int i3) throws IOException {
        return this.k.a(bArr, i2, i3);
    }
}

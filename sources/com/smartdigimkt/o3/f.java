package com.smartdigimkt.o3;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.smartdigimkt.w6.f f37360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.smartdigimkt.v6.a f37361c;
    String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    com.smartdigimkt.v3.l f37362e;
    private k g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37359a = 3;
    private List<Boolean> f = new ArrayList();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.w6.f fVar;
            boolean zH = com.smartdigimkt.k3.c.d().h();
            f.this.f.add(Boolean.valueOf(zH));
            if (f.this.f.size() == 3 && (fVar = f.this.f37360b) != null && fVar.i() != null && f.this.f37360b.i().G1() == 1 && !zH && f.this.g != null) {
                f.this.g.c();
            }
            if (f.this.f.size() < 5) {
                f.this.b();
            } else {
                f.this.a();
            }
        }
    }

    public f(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, String str, com.smartdigimkt.v3.l lVar, k kVar) {
        this.f37360b = fVar;
        this.f37361c = aVar;
        this.d = str;
        this.f37362e = lVar;
        this.g = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        String scheme;
        com.smartdigimkt.v3.a aVar;
        if (TextUtils.isEmpty(this.d)) {
            scheme = "";
        } else {
            try {
                scheme = Uri.parse(this.d).getScheme();
            } catch (Throwable unused) {
                scheme = "";
            }
        }
        String str = scheme;
        com.smartdigimkt.v3.l lVar = this.f37362e;
        com.smartdigimkt.i7.d.a(this.f37360b, this.f37361c, this.d, str, this.f, (lVar == null || (aVar = lVar.f39137i) == null) ? -1 : aVar.f39068n, com.smartdigimkt.k3.c.d().e());
    }

    public void b() {
        com.smartdigimkt.l7.b.a().a((Runnable) new a(), 1000L);
    }
}

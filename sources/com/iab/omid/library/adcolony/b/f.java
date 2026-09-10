package com.iab.omid.library.adcolony.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.adcolony.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class f implements com.iab.omid.library.adcolony.a.c, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f21474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f21475b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.adcolony.a.e f21476c;
    private final com.iab.omid.library.adcolony.a.b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.adcolony.a.d f21477e;
    private a f;

    public f(com.iab.omid.library.adcolony.a.e eVar, com.iab.omid.library.adcolony.a.b bVar) {
        this.f21476c = eVar;
        this.d = bVar;
    }

    public static f a() {
        if (f21474a == null) {
            f21474a = new f(new com.iab.omid.library.adcolony.a.e(), new com.iab.omid.library.adcolony.a.b());
        }
        return f21474a;
    }

    private a e() {
        if (this.f == null) {
            this.f = a.a();
        }
        return this.f;
    }

    public void b() {
        b.a().a(this);
        b.a().b();
        TreeWalker.getInstance().a();
        this.f21477e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f21477e.b();
    }

    public float d() {
        return this.f21475b;
    }

    @Override // com.iab.omid.library.adcolony.a.c
    public void a(float f) {
        this.f21475b = f;
        Iterator<com.iab.omid.library.adcolony.adsession.a> it = e().c().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f);
        }
    }

    public void a(Context context) {
        this.f21477e = this.f21476c.a(new Handler(), context, this.d.a(), this);
    }

    @Override // com.iab.omid.library.adcolony.b.b.a
    public void a(boolean z2) {
        if (z2) {
            TreeWalker.getInstance().a();
        } else {
            TreeWalker.getInstance().c();
        }
    }
}

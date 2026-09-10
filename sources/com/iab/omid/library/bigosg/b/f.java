package com.iab.omid.library.bigosg.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bigosg.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class f implements com.iab.omid.library.bigosg.a.c, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f21667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f21668b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.a.e f21669c;
    private final com.iab.omid.library.bigosg.a.b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bigosg.a.d f21670e;
    private a f;

    public f(com.iab.omid.library.bigosg.a.e eVar, com.iab.omid.library.bigosg.a.b bVar) {
        this.f21669c = eVar;
        this.d = bVar;
    }

    public static f a() {
        if (f21667a == null) {
            f21667a = new f(new com.iab.omid.library.bigosg.a.e(), new com.iab.omid.library.bigosg.a.b());
        }
        return f21667a;
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
        if (b.a().d()) {
            TreeWalker.getInstance().a();
        }
        this.f21670e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f21670e.b();
    }

    public float d() {
        return this.f21668b;
    }

    @Override // com.iab.omid.library.bigosg.a.c
    public void a(float f) {
        this.f21668b = f;
        Iterator<com.iab.omid.library.bigosg.adsession.a> it = e().c().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f);
        }
    }

    public void a(Context context) {
        this.f21670e = this.f21669c.a(new Handler(), context, this.d.a(), this);
    }

    @Override // com.iab.omid.library.bigosg.b.b.a
    public void a(boolean z2) {
        if (z2) {
            TreeWalker.getInstance().a();
        } else {
            TreeWalker.getInstance().c();
        }
    }
}

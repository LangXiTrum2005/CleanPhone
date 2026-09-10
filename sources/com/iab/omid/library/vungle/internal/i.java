package com.iab.omid.library.vungle.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.vungle.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class i implements d.a, com.iab.omid.library.vungle.devicevolume.c {
    private static i f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f22558a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.e f22559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.b f22560c;
    private com.iab.omid.library.vungle.devicevolume.d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f22561e;

    public i(com.iab.omid.library.vungle.devicevolume.e eVar, com.iab.omid.library.vungle.devicevolume.b bVar) {
        this.f22559b = eVar;
        this.f22560c = bVar;
    }

    private c a() {
        if (this.f22561e == null) {
            this.f22561e = c.c();
        }
        return this.f22561e;
    }

    public static i c() {
        if (f == null) {
            f = new i(new com.iab.omid.library.vungle.devicevolume.e(), new com.iab.omid.library.vungle.devicevolume.b());
        }
        return f;
    }

    public float b() {
        return this.f22558a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.d.c();
    }

    @Override // com.iab.omid.library.vungle.devicevolume.c
    public void a(float f2) {
        this.f22558a = f2;
        Iterator<com.iab.omid.library.vungle.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f2);
        }
    }

    public void a(Context context) {
        this.d = this.f22559b.a(new Handler(), context, this.f22560c.a(), this);
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z2) {
        if (z2) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}

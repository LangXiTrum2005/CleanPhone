package com.iab.omid.library.startio.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.startio.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class i implements d.a, com.iab.omid.library.startio.devicevolume.c {
    private static i f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f22263a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.startio.devicevolume.e f22264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.startio.devicevolume.b f22265c;
    private com.iab.omid.library.startio.devicevolume.d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f22266e;

    public i(com.iab.omid.library.startio.devicevolume.e eVar, com.iab.omid.library.startio.devicevolume.b bVar) {
        this.f22264b = eVar;
        this.f22265c = bVar;
    }

    private c a() {
        if (this.f22266e == null) {
            this.f22266e = c.c();
        }
        return this.f22266e;
    }

    public static i c() {
        if (f == null) {
            f = new i(new com.iab.omid.library.startio.devicevolume.e(), new com.iab.omid.library.startio.devicevolume.b());
        }
        return f;
    }

    public float b() {
        return this.f22263a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.d.d();
    }

    @Override // com.iab.omid.library.startio.devicevolume.c
    public void a(float f2) {
        this.f22263a = f2;
        Iterator<com.iab.omid.library.startio.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f2);
        }
    }

    public void a(Context context) {
        this.d = this.f22264b.a(new Handler(), context, this.f22265c.a(), this);
    }

    @Override // com.iab.omid.library.startio.internal.d.a
    public void a(boolean z2) {
        if (z2) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}

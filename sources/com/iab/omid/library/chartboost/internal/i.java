package com.iab.omid.library.chartboost.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.chartboost.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class i implements d.a, com.iab.omid.library.chartboost.devicevolume.c {
    private static i f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f21862a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.chartboost.devicevolume.e f21863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.chartboost.devicevolume.b f21864c;
    private com.iab.omid.library.chartboost.devicevolume.d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f21865e;

    public i(com.iab.omid.library.chartboost.devicevolume.e eVar, com.iab.omid.library.chartboost.devicevolume.b bVar) {
        this.f21863b = eVar;
        this.f21864c = bVar;
    }

    private c a() {
        if (this.f21865e == null) {
            this.f21865e = c.c();
        }
        return this.f21865e;
    }

    public static i c() {
        if (f == null) {
            f = new i(new com.iab.omid.library.chartboost.devicevolume.e(), new com.iab.omid.library.chartboost.devicevolume.b());
        }
        return f;
    }

    public float b() {
        return this.f21862a;
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

    @Override // com.iab.omid.library.chartboost.devicevolume.c
    public void a(float f2) {
        this.f21862a = f2;
        Iterator<com.iab.omid.library.chartboost.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f2);
        }
    }

    public void a(Context context) {
        this.d = this.f21863b.a(new Handler(), context, this.f21864c.a(), this);
    }

    @Override // com.iab.omid.library.chartboost.internal.d.a
    public void a(boolean z2) {
        if (z2) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}

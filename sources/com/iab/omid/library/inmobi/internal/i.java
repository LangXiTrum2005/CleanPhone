package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.inmobi.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class i implements d.a, com.iab.omid.library.inmobi.devicevolume.c {
    private static i f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f21963a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.e f21964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.b f21965c;
    private com.iab.omid.library.inmobi.devicevolume.d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f21966e;

    public i(com.iab.omid.library.inmobi.devicevolume.e eVar, com.iab.omid.library.inmobi.devicevolume.b bVar) {
        this.f21964b = eVar;
        this.f21965c = bVar;
    }

    private c a() {
        if (this.f21966e == null) {
            this.f21966e = c.c();
        }
        return this.f21966e;
    }

    public static i c() {
        if (f == null) {
            f = new i(new com.iab.omid.library.inmobi.devicevolume.e(), new com.iab.omid.library.inmobi.devicevolume.b());
        }
        return f;
    }

    public float b() {
        return this.f21963a;
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

    @Override // com.iab.omid.library.inmobi.devicevolume.c
    public void a(float f2) {
        this.f21963a = f2;
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f2);
        }
    }

    public void a(Context context) {
        this.d = this.f21964b.a(new Handler(), context, this.f21965c.a(), this);
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z2) {
        if (z2) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}

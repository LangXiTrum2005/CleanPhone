package com.iab.omid.library.toponad.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.toponad.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class i implements d.a, com.iab.omid.library.toponad.devicevolume.c {
    private static i f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f22359a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.toponad.devicevolume.e f22360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.toponad.devicevolume.b f22361c;
    private com.iab.omid.library.toponad.devicevolume.d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f22362e;

    public i(com.iab.omid.library.toponad.devicevolume.e eVar, com.iab.omid.library.toponad.devicevolume.b bVar) {
        this.f22360b = eVar;
        this.f22361c = bVar;
    }

    private c a() {
        if (this.f22362e == null) {
            this.f22362e = c.c();
        }
        return this.f22362e;
    }

    public static i c() {
        if (f == null) {
            f = new i(new com.iab.omid.library.toponad.devicevolume.e(), new com.iab.omid.library.toponad.devicevolume.b());
        }
        return f;
    }

    public float b() {
        return this.f22359a;
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

    @Override // com.iab.omid.library.toponad.devicevolume.c
    public void a(float f2) {
        this.f22359a = f2;
        Iterator<com.iab.omid.library.toponad.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f2);
        }
    }

    public void a(Context context) {
        this.d = this.f22360b.a(new Handler(), context, this.f22361c.a(), this);
    }

    @Override // com.iab.omid.library.toponad.internal.d.a
    public void a(boolean z2) {
        if (z2) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}

package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.walking.TreeWalker;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class i implements d.a, com.iab.omid.library.ironsrc.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f25257f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f25258a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.devicevolume.e f25259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.devicevolume.b f25260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.devicevolume.d f25261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f25262e;

    public i(com.iab.omid.library.ironsrc.devicevolume.e eVar, com.iab.omid.library.ironsrc.devicevolume.b bVar) {
        this.f25259b = eVar;
        this.f25260c = bVar;
    }

    private c a() {
        if (this.f25262e == null) {
            this.f25262e = c.c();
        }
        return this.f25262e;
    }

    public static i c() {
        if (f25257f == null) {
            f25257f = new i(new com.iab.omid.library.ironsrc.devicevolume.e(), new com.iab.omid.library.ironsrc.devicevolume.b());
        }
        return f25257f;
    }

    public float b() {
        return this.f25258a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f25261d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f25261d.d();
    }

    @Override // com.iab.omid.library.ironsrc.devicevolume.c
    public void a(float f10) {
        this.f25258a = f10;
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f25261d = this.f25259b.a(new Handler(), context, this.f25260c.a(), this);
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z10) {
        TreeWalker treeWalker = TreeWalker.getInstance();
        if (z10) {
            treeWalker.h();
        } else {
            treeWalker.g();
        }
    }
}

package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.walking.TreeWalker;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class i implements d.a, com.iab.omid.library.applovin.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f25123f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f25124a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.e f25125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.b f25126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.devicevolume.d f25127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f25128e;

    public i(com.iab.omid.library.applovin.devicevolume.e eVar, com.iab.omid.library.applovin.devicevolume.b bVar) {
        this.f25125b = eVar;
        this.f25126c = bVar;
    }

    private c a() {
        if (this.f25128e == null) {
            this.f25128e = c.c();
        }
        return this.f25128e;
    }

    public static i c() {
        if (f25123f == null) {
            f25123f = new i(new com.iab.omid.library.applovin.devicevolume.e(), new com.iab.omid.library.applovin.devicevolume.b());
        }
        return f25123f;
    }

    public float b() {
        return this.f25124a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f25127d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f25127d.d();
    }

    @Override // com.iab.omid.library.applovin.devicevolume.c
    public void a(float f10) {
        this.f25124a = f10;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f25127d = this.f25125b.a(new Handler(), context, this.f25126c.a(), this);
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        TreeWalker treeWalker = TreeWalker.getInstance();
        if (z10) {
            treeWalker.h();
        } else {
            treeWalker.g();
        }
    }
}

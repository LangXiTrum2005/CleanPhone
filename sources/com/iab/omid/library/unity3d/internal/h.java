package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.unity3d.walking.TreeWalker;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class h implements d.a, com.iab.omid.library.unity3d.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static h f25523f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f25524a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.devicevolume.e f25525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.devicevolume.b f25526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.unity3d.devicevolume.d f25527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f25528e;

    public h(com.iab.omid.library.unity3d.devicevolume.e eVar, com.iab.omid.library.unity3d.devicevolume.b bVar) {
        this.f25525b = eVar;
        this.f25526c = bVar;
    }

    private c a() {
        if (this.f25528e == null) {
            this.f25528e = c.c();
        }
        return this.f25528e;
    }

    public static h c() {
        if (f25523f == null) {
            f25523f = new h(new com.iab.omid.library.unity3d.devicevolume.e(), new com.iab.omid.library.unity3d.devicevolume.b());
        }
        return f25523f;
    }

    public float b() {
        return this.f25524a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f25527d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f25527d.d();
    }

    @Override // com.iab.omid.library.unity3d.devicevolume.c
    public void a(float f10) {
        this.f25524a = f10;
        Iterator<com.iab.omid.library.unity3d.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f25527d = this.f25525b.a(new Handler(), context, this.f25526c.a(), this);
    }

    @Override // com.iab.omid.library.unity3d.internal.d.a
    public void a(boolean z10) {
        TreeWalker treeWalker = TreeWalker.getInstance();
        if (z10) {
            treeWalker.h();
        } else {
            treeWalker.g();
        }
    }
}

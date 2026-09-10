package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.mmadbridge.walking.TreeWalker;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class i implements d.a, com.iab.omid.library.mmadbridge.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f25391f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f25392a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.devicevolume.e f25393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.devicevolume.b f25394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.devicevolume.d f25395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f25396e;

    public i(com.iab.omid.library.mmadbridge.devicevolume.e eVar, com.iab.omid.library.mmadbridge.devicevolume.b bVar) {
        this.f25393b = eVar;
        this.f25394c = bVar;
    }

    private c a() {
        if (this.f25396e == null) {
            this.f25396e = c.c();
        }
        return this.f25396e;
    }

    public static i c() {
        if (f25391f == null) {
            f25391f = new i(new com.iab.omid.library.mmadbridge.devicevolume.e(), new com.iab.omid.library.mmadbridge.devicevolume.b());
        }
        return f25391f;
    }

    public float b() {
        return this.f25392a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f25395d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f25395d.d();
    }

    @Override // com.iab.omid.library.mmadbridge.devicevolume.c
    public void a(float f10) {
        this.f25392a = f10;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f25395d = this.f25393b.a(new Handler(), context, this.f25394c.a(), this);
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d.a
    public void a(boolean z10) {
        TreeWalker treeWalker = TreeWalker.getInstance();
        if (z10) {
            treeWalker.h();
        } else {
            treeWalker.g();
        }
    }
}

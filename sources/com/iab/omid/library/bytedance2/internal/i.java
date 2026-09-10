package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bytedance2.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class i implements com.iab.omid.library.bytedance2.devicevolume.c, d.a {
    private static i f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f21762a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.devicevolume.e f21763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.devicevolume.b f21764c;
    private com.iab.omid.library.bytedance2.devicevolume.d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f21765e;

    public i(com.iab.omid.library.bytedance2.devicevolume.e eVar, com.iab.omid.library.bytedance2.devicevolume.b bVar) {
        this.f21763b = eVar;
        this.f21764c = bVar;
    }

    private c a() {
        if (this.f21765e == null) {
            this.f21765e = c.c();
        }
        return this.f21765e;
    }

    public static i c() {
        if (f == null) {
            f = new i(new com.iab.omid.library.bytedance2.devicevolume.e(), new com.iab.omid.library.bytedance2.devicevolume.b());
        }
        return f;
    }

    public float b() {
        return this.f21762a;
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

    @Override // com.iab.omid.library.bytedance2.devicevolume.c
    public void a(float f2) {
        this.f21762a = f2;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f2);
        }
    }

    public void a(Context context) {
        this.d = this.f21763b.a(new Handler(), context, this.f21764c.a(), this);
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z2) {
        if (z2) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}

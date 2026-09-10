package com.iab.omid.library.bytedance2.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f21745c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bytedance2.adsession.a> f21746a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bytedance2.adsession.a> f21747b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f21745c;
    }

    public Collection<com.iab.omid.library.bytedance2.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f21747b);
    }

    public Collection<com.iab.omid.library.bytedance2.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f21746a);
    }

    public boolean d() {
        return this.f21747b.size() > 0;
    }

    public void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        this.f21746a.add(aVar);
    }

    public void b(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean zD = d();
        this.f21746a.remove(aVar);
        this.f21747b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean zD = d();
        this.f21747b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}

package com.iab.omid.library.inmobi.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f21946c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.inmobi.adsession.a> f21947a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.inmobi.adsession.a> f21948b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f21946c;
    }

    public Collection<com.iab.omid.library.inmobi.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f21948b);
    }

    public Collection<com.iab.omid.library.inmobi.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f21947a);
    }

    public boolean d() {
        return this.f21948b.size() > 0;
    }

    public void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        this.f21947a.add(aVar);
    }

    public void b(com.iab.omid.library.inmobi.adsession.a aVar) {
        boolean zD = d();
        this.f21947a.remove(aVar);
        this.f21948b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.inmobi.adsession.a aVar) {
        boolean zD = d();
        this.f21948b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}

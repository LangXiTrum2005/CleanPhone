package com.iab.omid.library.mmadbridge.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f25373c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.mmadbridge.adsession.a> f25374a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.mmadbridge.adsession.a> f25375b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f25373c;
    }

    public Collection<com.iab.omid.library.mmadbridge.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f25375b);
    }

    public Collection<com.iab.omid.library.mmadbridge.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f25374a);
    }

    public boolean d() {
        return this.f25375b.size() > 0;
    }

    public void a(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        this.f25374a.add(aVar);
    }

    public void b(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        boolean zD = d();
        this.f25374a.remove(aVar);
        this.f25375b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        boolean zD = d();
        this.f25375b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}

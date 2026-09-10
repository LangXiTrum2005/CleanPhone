package com.iab.omid.library.vungle.internal;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d.a {
    private static a f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.vungle.utils.f f22537a = new com.iab.omid.library.vungle.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f22538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22539c;
    private d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22540e;

    private a(d dVar) {
        this.d = dVar;
    }

    public static a a() {
        return f;
    }

    private void c() {
        if (!this.f22539c || this.f22538b == null) {
            return;
        }
        Iterator<com.iab.omid.library.vungle.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f22538b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f22537a.a();
        Date date = this.f22538b;
        if (date == null || dateA.after(date)) {
            this.f22538b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f22539c) {
            return;
        }
        this.d.a(context);
        this.d.a(this);
        this.d.e();
        this.f22540e = this.d.c();
        this.f22539c = true;
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z2) {
        if (!this.f22540e && z2) {
            d();
        }
        this.f22540e = z2;
    }
}

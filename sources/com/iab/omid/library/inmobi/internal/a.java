package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d.a {
    private static a f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.inmobi.utils.f f21942a = new com.iab.omid.library.inmobi.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f21943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21944c;
    private d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21945e;

    private a(d dVar) {
        this.d = dVar;
    }

    public static a a() {
        return f;
    }

    private void c() {
        if (!this.f21944c || this.f21943b == null) {
            return;
        }
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f21943b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f21942a.a();
        Date date = this.f21943b;
        if (date == null || dateA.after(date)) {
            this.f21943b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f21944c) {
            return;
        }
        this.d.a(context);
        this.d.a(this);
        this.d.e();
        this.f21945e = this.d.c();
        this.f21944c = true;
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z2) {
        if (!this.f21945e && z2) {
            d();
        }
        this.f21945e = z2;
    }
}

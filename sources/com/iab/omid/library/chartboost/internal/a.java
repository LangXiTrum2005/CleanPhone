package com.iab.omid.library.chartboost.internal;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d.a {
    private static a f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.chartboost.utils.f f21841a = new com.iab.omid.library.chartboost.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f21842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21843c;
    private d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21844e;

    private a(d dVar) {
        this.d = dVar;
    }

    public static a a() {
        return f;
    }

    private void c() {
        if (!this.f21843c || this.f21842b == null) {
            return;
        }
        Iterator<com.iab.omid.library.chartboost.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f21842b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f21841a.a();
        Date date = this.f21842b;
        if (date == null || dateA.after(date)) {
            this.f21842b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f21843c) {
            return;
        }
        this.d.a(context);
        this.d.a(this);
        this.d.e();
        this.f21844e = this.d.c();
        this.f21843c = true;
    }

    @Override // com.iab.omid.library.chartboost.internal.d.a
    public void a(boolean z2) {
        if (!this.f21844e && z2) {
            d();
        }
        this.f21844e = z2;
    }
}

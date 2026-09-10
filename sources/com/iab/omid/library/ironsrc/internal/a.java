package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f25232f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.ironsrc.utils.f f25233a = new com.iab.omid.library.ironsrc.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f25234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f25236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25237e;

    private a(d dVar) {
        this.f25236d = dVar;
    }

    public static a a() {
        return f25232f;
    }

    private void c() {
        if (!this.f25235c || this.f25234b == null) {
            return;
        }
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f25234b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f25233a.a();
        Date date = this.f25234b;
        if (date == null || dateA.after(date)) {
            this.f25234b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f25235c) {
            return;
        }
        this.f25236d.a(context);
        this.f25236d.a(this);
        this.f25236d.e();
        this.f25237e = this.f25236d.c();
        this.f25235c = true;
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z10) {
        if (!this.f25237e && z10) {
            d();
        }
        this.f25237e = z10;
    }
}

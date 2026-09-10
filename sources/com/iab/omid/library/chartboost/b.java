package com.iab.omid.library.chartboost;

import android.content.Context;
import com.iab.omid.library.chartboost.internal.i;
import com.iab.omid.library.chartboost.internal.j;
import com.iab.omid.library.chartboost.utils.e;
import com.iab.omid.library.chartboost.utils.g;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21828a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.5.7-Chartboost";
    }

    public void c() {
        g.a();
        com.iab.omid.library.chartboost.internal.a.a().d();
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.chartboost.internal.b.g().a(context);
        com.iab.omid.library.chartboost.utils.a.a(context);
        com.iab.omid.library.chartboost.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.chartboost.internal.g.b().a(context);
        com.iab.omid.library.chartboost.internal.a.a().a(context);
        j.b().a(context);
    }

    public boolean b() {
        return this.f21828a;
    }

    public void a(boolean z2) {
        this.f21828a = z2;
    }
}

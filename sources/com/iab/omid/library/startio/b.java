package com.iab.omid.library.startio;

import android.content.Context;
import com.iab.omid.library.startio.internal.i;
import com.iab.omid.library.startio.utils.e;
import com.iab.omid.library.startio.utils.g;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22233a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.4.12-Startio";
    }

    public void c() {
        g.a();
        com.iab.omid.library.startio.internal.a.a().d();
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.startio.internal.b.g().a(context);
        com.iab.omid.library.startio.utils.a.a(context);
        com.iab.omid.library.startio.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.startio.internal.g.b().a(context);
        com.iab.omid.library.startio.internal.a.a().a(context);
    }

    public boolean b() {
        return this.f22233a;
    }

    public void a(boolean z2) {
        this.f22233a = z2;
    }
}

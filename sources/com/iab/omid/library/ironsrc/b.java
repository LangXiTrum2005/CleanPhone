package com.iab.omid.library.ironsrc;

import android.content.Context;
import com.iab.omid.library.ironsrc.internal.i;
import com.iab.omid.library.ironsrc.internal.j;
import com.iab.omid.library.ironsrc.utils.e;
import com.iab.omid.library.ironsrc.utils.g;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25219a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.5.2-Ironsrc";
    }

    public void c() {
        g.a();
        com.iab.omid.library.ironsrc.internal.a.a().d();
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.ironsrc.internal.b.g().a(context);
        com.iab.omid.library.ironsrc.utils.a.a(context);
        com.iab.omid.library.ironsrc.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.ironsrc.internal.g.b().a(context);
        com.iab.omid.library.ironsrc.internal.a.a().a(context);
        j.b().a(context);
    }

    public boolean b() {
        return this.f25219a;
    }

    public void a(boolean z10) {
        this.f25219a = z10;
    }
}

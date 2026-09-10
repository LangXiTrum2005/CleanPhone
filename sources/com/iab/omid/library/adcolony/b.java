package com.iab.omid.library.adcolony;

import android.content.Context;
import com.iab.omid.library.adcolony.b.d;
import com.iab.omid.library.adcolony.b.f;
import com.iab.omid.library.adcolony.d.e;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21458a;

    private void b(Context context) {
        e.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.3.30-Adcolony";
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        f.a().a(context);
        com.iab.omid.library.adcolony.b.b.a().a(context);
        com.iab.omid.library.adcolony.d.b.a(context);
        d.a().a(context);
    }

    public boolean b() {
        return this.f21458a;
    }

    public void a(boolean z2) {
        this.f21458a = z2;
    }
}

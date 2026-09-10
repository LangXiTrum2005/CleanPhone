package com.iab.omid.library.bigosg;

import android.content.Context;
import com.iab.omid.library.bigosg.b.d;
import com.iab.omid.library.bigosg.b.f;
import com.iab.omid.library.bigosg.d.e;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21649a;

    private void b(Context context) {
        e.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.3.0-Bigosg";
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        f.a().a(context);
        com.iab.omid.library.bigosg.b.b.a().a(context);
        com.iab.omid.library.bigosg.d.b.a(context);
        d.a().a(context);
    }

    public boolean b() {
        return this.f21649a;
    }

    public void a(boolean z2) {
        this.f21649a = z2;
    }

    public boolean a(String str) {
        return true;
    }
}

package com.iab.omid.library.unity3d.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static f f25517b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f25518a;

    private f() {
    }

    public static f b() {
        return f25517b;
    }

    public Context a() {
        return this.f25518a;
    }

    public void a(Context context) {
        this.f25518a = context != null ? context.getApplicationContext() : null;
    }
}

package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* JADX INFO: renamed from: com.ironsource.a4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0241a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    MutableContextWrapper f28171a;

    public synchronized void a(Activity activity) {
        try {
            if (this.f28171a == null) {
                this.f28171a = new MutableContextWrapper(activity);
            }
            this.f28171a.setBaseContext(activity);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b() {
        this.f28171a = null;
    }

    public Activity a() {
        return (Activity) this.f28171a.getBaseContext();
    }
}

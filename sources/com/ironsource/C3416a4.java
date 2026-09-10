package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* JADX INFO: renamed from: com.ironsource.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3416a4 {
    MutableContextWrapper a;

    public synchronized void a(Activity activity) {
        try {
            if (this.a == null) {
                this.a = new MutableContextWrapper(activity);
            }
            this.a.setBaseContext(activity);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        this.a = null;
    }

    public Activity a() {
        return (Activity) this.a.getBaseContext();
    }
}

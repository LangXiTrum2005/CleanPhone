package com.p004ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* JADX INFO: loaded from: classes5.dex */
public class g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    MutableContextWrapper f25134a;

    public Activity a() {
        return (Activity) this.f25134a.getBaseContext();
    }

    public synchronized void b() {
        this.f25134a = null;
    }

    public synchronized void a(Activity activity) {
        try {
            if (this.f25134a == null) {
                this.f25134a = new MutableContextWrapper(activity);
            }
            this.f25134a.setBaseContext(activity);
        } catch (Throwable th) {
            throw th;
        }
    }
}

package com.p004ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3366l implements bx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f25552a;

    public C3366l(Activity activity) {
        this.f25552a = new WeakReference<>(activity);
    }

    @Override // com.p004ironsource.bx
    public void a() {
        Activity activity = this.f25552a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}

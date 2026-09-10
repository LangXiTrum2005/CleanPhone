package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3608l implements InterfaceC3679og {
    private WeakReference<Activity> a;

    public C3608l(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.InterfaceC3679og
    public void a() {
        Activity activity = this.a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}

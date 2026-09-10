package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0433l implements Hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f29078a;

    public C0433l(Activity activity) {
        this.f29078a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.Hg
    public void a() {
        Activity activity = this.f29078a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}

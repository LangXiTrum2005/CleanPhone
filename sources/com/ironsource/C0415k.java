package com.ironsource;

import android.app.Activity;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0415k implements Hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f29010a;

    public C0415k(Activity activity) {
        this.f29010a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.Hg
    public void a() {
        WindowInsetsController windowInsetsController;
        Activity activity = this.f29010a.get();
        if (activity == null || (windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController()) == null) {
            return;
        }
        windowInsetsController.hide(WindowInsets.Type.statusBars());
    }
}

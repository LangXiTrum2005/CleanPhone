package com.p004ironsource;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3364k implements bx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f25470a;

    public C3364k(Activity activity) {
        this.f25470a = new WeakReference<>(activity);
    }

    @Override // com.p004ironsource.bx
    public void a() {
        Activity activity = this.f25470a.get();
        if (activity == null) {
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        Window window = activity.getWindow();
        if (i2 < 30) {
            window.setFlags(1024, 1024);
            return;
        }
        WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.hide(WindowInsets.Type.statusBars());
        }
    }
}

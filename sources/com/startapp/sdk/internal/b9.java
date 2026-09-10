package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class b9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f40832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9 f40833b;

    public b9(c9 c9Var, Bitmap bitmap) {
        this.f40833b = c9Var;
        this.f40832a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c9 c9Var;
        c9 c9Var2 = this.f40833b;
        Bitmap bitmap = this.f40832a;
        d9 d9Var = c9Var2.d;
        d9Var.g--;
        if (bitmap != null) {
            d9Var.d.put(c9Var2.f40863b, bitmap);
            List3DActivity list3DActivity = c9Var2.d.f;
            if (list3DActivity != null) {
                list3DActivity.a(c9Var2.f40862a);
            }
            d9 d9Var2 = c9Var2.d;
            if (d9Var2.f40905h.isEmpty() || (c9Var = (c9) d9Var2.f40905h.poll()) == null) {
                return;
            }
            ((Executor) d9Var2.f40901a.a()).execute(c9Var);
        }
    }
}

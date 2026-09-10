package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class kc implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41184b;

    public kc(Context context, String str) {
        this.f41183a = context;
        this.f41184b = str;
    }

    @Override // com.startapp.sdk.internal.j2
    public final void a(Bitmap bitmap, int i2) {
        if (bitmap != null) {
            Context context = this.f41183a;
            String str = this.f41184b;
            ConcurrentHashMap concurrentHashMap = g2.f40993a;
            ((Executor) com.startapp.sdk.components.a.a(context).C.a()).execute(new f2(str, bitmap, context));
        }
    }
}

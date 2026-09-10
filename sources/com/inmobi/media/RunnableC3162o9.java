package com.inmobi.media;

import android.content.Context;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.o9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC3162o9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f23870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f23871b;

    public RunnableC3162o9(Context context, ImageView imageView) {
        Intrinsics.f(context, "context");
        Intrinsics.f(imageView, "imageView");
        this.f23870a = new WeakReference(context);
        this.f23871b = new WeakReference(imageView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = (Context) this.f23870a.get();
        ImageView imageView = (ImageView) this.f23871b.get();
        if (context == null || imageView == null) {
            return;
        }
        HashMap map = D9.f22775c;
        C3146n9.a(context, imageView);
    }
}

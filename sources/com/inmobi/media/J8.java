package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class J8 extends C3081j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f22905a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J8(Context context) {
        super(context);
        Intrinsics.f(context, "context");
    }

    public final T7 getNativeStrandAd() {
        WeakReference weakReference = this.f22905a;
        if (weakReference != null) {
            return (T7) weakReference.get();
        }
        return null;
    }

    public final void setNativeStrandAd(T7 t7) {
        this.f22905a = new WeakReference(t7);
    }
}

package com.inmobi.media;

import A.RunnableC0905n;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3230se extends G1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3230se(S0 obj, byte b2) {
        super(obj);
        Intrinsics.f(obj, "obj");
    }

    public static final void a(AbstractC3230se this$0, Object obj) {
        Intrinsics.f(this$0, "this$0");
        this$0.a(obj);
    }

    public abstract void a(Object obj);

    public final void b(Object obj) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0905n(24, this, obj));
    }
}

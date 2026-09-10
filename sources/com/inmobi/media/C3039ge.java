package com.inmobi.media;

import A.RunnableC0881b;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3039ge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S0 f23639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f23640b;

    public C3039ge(S0 timeOutInformer) {
        Intrinsics.f(timeOutInformer, "timeOutInformer");
        this.f23639a = timeOutInformer;
        this.f23640b = new HashMap();
    }

    public final void a(byte b2) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0881b(this, b2, 1));
    }

    public static final void a(C3039ge this$0, byte b2) {
        Intrinsics.f(this$0, "this$0");
        this$0.f23639a.a(b2);
    }
}

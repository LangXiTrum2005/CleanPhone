package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC3308xc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3260uc f24105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3276vc f24106b;

    public RunnableC3308xc(C3260uc request, C3276vc c3276vc) {
        Intrinsics.f(request, "request");
        this.f24105a = request;
        this.f24106b = c3276vc;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public static final void a(RunnableC3308xc this$0, C3324yc response) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(response, "$response");
        C3260uc c3260uc = this$0.f24105a;
        c3260uc.getClass();
        M9 m9 = c3260uc.f24037l;
        if (m9 != null) {
            P9 response2 = D4.a(response);
            N9 request = m9.f22980a;
            Intrinsics.f(response2, "response");
            Intrinsics.f(request, "request");
            m9.f22981b.invoke(response2);
        }
        c3260uc.f24037l = null;
        try {
            AbstractC3292wc.f24075a.remove(c3260uc);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24105a.getClass();
        C3324yc c3324ycA = H9.a(this.f24105a, this.f24106b);
        I9 i9 = c3324ycA.f24133a;
        if ((i9 != null ? i9.f22886a : null) != EnumC3157o4.m) {
            ExecutorC3160o7 executorC3160o7 = (ExecutorC3160o7) AbstractC3332z4.d.getX();
            A.I0 i0 = new A.I0(2, this, c3324ycA);
            executorC3160o7.getClass();
            executorC3160o7.f23866a.post(i0);
            this.f24105a.getClass();
        }
    }
}

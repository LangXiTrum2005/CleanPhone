package com.inmobi.media;

import A.RunnableC0883c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class kf extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lf f23756a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(lf lfVar) {
        super(0);
        this.f23756a = lfVar;
    }

    public static final void a(lf this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.f23793c.post((gf) this$0.k.getX());
    }

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Runnable invoke() {
        return new RunnableC0883c(this.f23756a, 20);
    }
}

package com.inmobi.media;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3000e7 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3016f7 f23550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23551b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3000e7(C3016f7 c3016f7, Context context) {
        super(1);
        this.f23550a = c3016f7;
        this.f23551b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Y6 it = (Y6) obj;
        Intrinsics.f(it, "it");
        C3016f7 c3016f7 = this.f23550a;
        c3016f7.a(this.f23551b, c3016f7.f23604a, it);
        return Unit.f43263a;
    }
}

package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3079j6 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3127m6 f23721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ short f23722b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3079j6(C3127m6 c3127m6, short s) {
        super(0);
        this.f23721a = c3127m6;
        this.f23722b = s;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC3048h7.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        InterfaceC3333z5 interfaceC3333z5 = this.f23721a.j;
        if (interfaceC3333z5 != null) {
            String strE = C3127m6.e();
            Intrinsics.e(strE, "access$getTAG$cp(...)");
            ((A5) interfaceC3333z5).b(strE, "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        this.f23721a.a(true, this.f23722b);
        this.f23721a.f23812Q = null;
        return Unit.f43263a;
    }
}

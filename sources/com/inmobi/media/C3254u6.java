package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3254u6 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3270v6 f24022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3210ra f24023b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3254u6(C3270v6 c3270v6, C3210ra c3210ra) {
        super(1);
        this.f24022a = c3270v6;
        this.f24023b = c3210ra;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GestureDetectorOnGestureListenerC3005ec it = (GestureDetectorOnGestureListenerC3005ec) obj;
        Intrinsics.f(it, "it");
        if (it.K0) {
            InterfaceC3333z5 interfaceC3333z5 = this.f24022a.f24051c;
            if (interfaceC3333z5 != null) {
                String str = AbstractC3286w6.f24072a;
                Intrinsics.e(str, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5).b(str, "setOrientationProperties called on unloaded ad");
            }
        } else {
            it.a(this.f24023b);
        }
        return Unit.f43263a;
    }
}

package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3325yd extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bd f24137a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3325yd(Bd bd) {
        super(0);
        this.f24137a = bd;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC3333z5 interfaceC3333z5 = this.f24137a.f22725a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("StateMachine", " WebView Show called and started rendering from LOADING");
        }
        return Unit.f43263a;
    }
}

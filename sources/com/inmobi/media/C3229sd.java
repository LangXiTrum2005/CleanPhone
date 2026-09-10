package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3229sd extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bd f23986a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3229sd(Bd bd) {
        super(0);
        this.f23986a = bd;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23986a.f22725a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("StateMachine", "SDK loads HTML in EndCardWebView");
        }
        return Unit.f43263a;
    }
}

package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Ad extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bd f22702a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ad(Bd bd) {
        super(0);
        this.f22702a = bd;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC3333z5 interfaceC3333z5 = this.f22702a.f22725a;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("StateMachine", "WebView Show called on a view part of viewHierarchy but not on top");
        }
        return Unit.f43263a;
    }
}

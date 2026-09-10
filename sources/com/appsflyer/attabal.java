package com.appsflyer;

import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class attabal implements Runnable {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final /* synthetic */ Function1 f17356kowloon;

    public /* synthetic */ attabal(Function1 function1) {
        this.f17356kowloon = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFLogger.getMonetizationNetwork(this.f17356kowloon);
    }
}

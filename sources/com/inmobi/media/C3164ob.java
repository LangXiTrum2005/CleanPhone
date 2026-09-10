package com.inmobi.media;

import A.RunnableC0905n;
import A.RunnableC0906n0;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3164ob implements BillingClientStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3259ub f23873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3196qb f23874b;

    public C3164ob(C3259ub c3259ub, C3196qb c3196qb) {
        this.f23873a = c3259ub;
        this.f23874b = c3196qb;
    }

    public static final void a(Function1 onComplete, AbstractC3148nb result) {
        Intrinsics.f(onComplete, "$onComplete");
        Intrinsics.f(result, "$result");
        onComplete.invoke(result);
    }

    public final void onBillingServiceDisconnected() {
        this.f23873a.getClass();
        Uc.a(new RunnableC0906n0(this.f23874b, this.f23873a, 0));
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        Object c3116lb;
        Intrinsics.f(billingResult, "billingResult");
        this.f23873a.getClass();
        Objects.toString(billingResult);
        if (billingResult.getResponseCode() == 0) {
            c3116lb = C3132mb.f23820a;
        } else {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            Intrinsics.e(debugMessage, "getDebugMessage(...)");
            c3116lb = new C3116lb(debugMessage, responseCode);
        }
        Uc.a(new RunnableC0905n(22, this.f23874b, c3116lb));
    }

    public static final void a(Function1 onComplete, C3259ub this$0) {
        Intrinsics.f(onComplete, "$onComplete");
        Intrinsics.f(this$0, "this$0");
        onComplete.invoke(new C3116lb("Billing Service Disconnected", -1));
    }
}

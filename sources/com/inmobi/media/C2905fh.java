package com.inmobi.media;

import android.content.Context;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.inmobi.media.C2905fh;
import java.util.Objects;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2905fh implements BillingClientStateListener {
    public final /* synthetic */ C3005jh a;
    public final /* synthetic */ Function1 b;

    public C2905fh(Function1 function1, C3005jh c3005jh) {
        this.a = c3005jh;
        this.b = function1;
    }

    public static final void a(Function1 function1, AbstractC2879eh abstractC2879eh) {
        function1.invoke(abstractC2879eh);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        this.a.getClass();
        final Function1 function1 = this.b;
        final C3005jh c3005jh = this.a;
        Runnable runnable = new Runnable() { // from class: adsuki.maggot
            @Override // java.lang.Runnable
            public final void run() {
                C2905fh.a(function1, c3005jh);
            }
        };
        Context context = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        final AbstractC2879eh c2828ch;
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.a.getClass();
        Objects.toString(billingResult);
        if (billingResult.getResponseCode() == 0) {
            c2828ch = C2854dh.a;
        } else {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
            c2828ch = new C2828ch(debugMessage, responseCode);
        }
        final Function1 function1 = this.b;
        Runnable runnable = new Runnable() { // from class: adsuki.terni
            @Override // java.lang.Runnable
            public final void run() {
                C2905fh.a(function1, c2828ch);
            }
        };
        Context context = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
    }

    public static final void a(Function1 function1, C3005jh c3005jh) {
        c3005jh.getClass();
        function1.invoke(new C2828ch("Billing Service Disconnected", -1));
    }
}

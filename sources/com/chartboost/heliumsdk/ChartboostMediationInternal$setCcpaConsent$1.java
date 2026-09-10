package com.chartboost.heliumsdk;

import android.content.Context;
import com.chartboost.heliumsdk.controllers.PrivacyController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class ChartboostMediationInternal$setCcpaConsent$1 extends FunctionReferenceImpl implements Function2<Context, PrivacyController, Unit> {
    public ChartboostMediationInternal$setCcpaConsent$1(Object obj) {
        super(2, obj, ChartboostMediationInternal.class, "runCcpaConsentTask", "runCcpaConsentTask(Landroid/content/Context;Lcom/chartboost/heliumsdk/controllers/PrivacyController;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Context) obj, (PrivacyController) obj2);
        return Unit.f43263a;
    }

    public final void invoke(Context p0, PrivacyController p1) {
        Intrinsics.f(p0, "p0");
        Intrinsics.f(p1, "p1");
        ((ChartboostMediationInternal) this.receiver).runCcpaConsentTask(p0, p1);
    }
}

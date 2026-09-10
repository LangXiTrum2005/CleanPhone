package com.chartboost.sdk.privacy.model;

import com.p004ironsource.d9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/privacy/model/LGPD;", "Lcom/chartboost/sdk/privacy/model/GenericDataUseConsent;", "allowBehavioralTargeting", "", "(Z)V", d9.i.f24748b0, "getConsent", "()Ljava/lang/Boolean;", "Companion", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LGPD extends GenericDataUseConsent {
    public static final String LGPD_STANDARD = "lgpd";

    public LGPD(boolean z2) {
        super(null, 1, 0 == true ? 1 : 0);
        b(LGPD_STANDARD);
        a(Boolean.valueOf(z2));
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    public Boolean getConsent() {
        Object objA = getConsentValue();
        Intrinsics.d(objA, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objA;
    }
}

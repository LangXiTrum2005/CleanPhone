package com.chartboost.sdk.privacy.model;

import com.p004ironsource.d9;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/chartboost/sdk/privacy/model/Custom;", "Lcom/chartboost/sdk/privacy/model/GenericDataUseConsent;", "", d9.i.f24748b0, "", "d", "(Ljava/lang/String;)Z", "", "b", "()V", "privacyStandard", "c", "Ljava/lang/String;", "customPrivacyStandard", "e", "customConsent", "getConsent", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
public final class Custom extends GenericDataUseConsent {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String customPrivacyStandard;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String customConsent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Custom(String customPrivacyStandard, String customConsent) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.f(customPrivacyStandard, "customPrivacyStandard");
        Intrinsics.f(customConsent, "customConsent");
        this.customPrivacyStandard = customPrivacyStandard;
        this.customConsent = customConsent;
        b();
    }

    private final boolean d(String consent) {
        int length = consent.length();
        return 1 <= length && length < 100;
    }

    public final void b() {
        if (this.customPrivacyStandard.length() == 0 || this.customConsent.length() == 0) {
            a("Invalid Custom privacy standard name. Values cannot be null");
            return;
        }
        if (c(this.customPrivacyStandard)) {
            a("Invalid Custom privacy standard name. Cannot use GDPR as privacy standard");
            return;
        }
        if (d(this.customPrivacyStandard) && d(this.customConsent)) {
            b(this.customPrivacyStandard);
            a((Object) this.customConsent);
            return;
        }
        a("Invalid Custom consent values. Use valid values between 1 and 100 characters. privacyStandard: " + this.customPrivacyStandard + " consent: " + this.customConsent);
    }

    public final boolean c(String privacyStandard) {
        String lowerCase;
        String string;
        if (privacyStandard == null || (string = StringsKt.a0(privacyStandard).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase, "toLowerCase(...)");
        }
        return "gdpr".equals(lowerCase);
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    public String getConsent() {
        Object objA = getConsentValue();
        Intrinsics.d(objA, "null cannot be cast to non-null type kotlin.String");
        return (String) objA;
    }
}

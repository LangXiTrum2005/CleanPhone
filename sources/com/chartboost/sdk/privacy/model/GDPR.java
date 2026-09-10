package com.chartboost.sdk.privacy.model;

import com.p004ironsource.d9;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/chartboost/sdk/privacy/model/GDPR;", "Lcom/chartboost/sdk/privacy/model/GenericDataUseConsent;", "", d9.i.f24748b0, "", "c", "(Ljava/lang/String;)Z", "getConsent", "()Ljava/lang/String;", "Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;", "<init>", "(Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;)V", "Companion", "GDPR_CONSENT", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
public final class GDPR extends GenericDataUseConsent {
    public static final String GDPR_STANDARD = "gdpr";

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;", "", "", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "NON_BEHAVIORAL", "BEHAVIORAL", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
    public enum GDPR_CONSENT {
        NON_BEHAVIORAL("0"),
        BEHAVIORAL("1");


        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String value;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f15862c = EnumEntriesKt.a(a());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT$Companion;", "", "()V", "fromValue", "Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;", "value", "", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final GDPR_CONSENT fromValue(String value) {
                Intrinsics.f(value, "value");
                GDPR_CONSENT gdpr_consent = GDPR_CONSENT.NON_BEHAVIORAL;
                if (Intrinsics.a(gdpr_consent.getValue(), value)) {
                    return gdpr_consent;
                }
                GDPR_CONSENT gdpr_consent2 = GDPR_CONSENT.BEHAVIORAL;
                if (Intrinsics.a(gdpr_consent2.getValue(), value)) {
                    return gdpr_consent2;
                }
                return null;
            }

            private Companion() {
            }
        }

        GDPR_CONSENT(String str) {
            this.value = str;
        }

        @JvmStatic
        public static final GDPR_CONSENT fromValue(String str) {
            return INSTANCE.fromValue(str);
        }

        public static EnumEntries<GDPR_CONSENT> getEntries() {
            return f15862c;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GDPR(GDPR_CONSENT consent) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.f(consent, "consent");
        if (c(consent.getValue())) {
            b("gdpr");
            a((Object) consent.getValue());
        } else {
            a("Invalid GDPR consent values. Use provided values or Custom class. Value: " + consent);
        }
    }

    private final boolean c(String consent) {
        return Intrinsics.a(GDPR_CONSENT.NON_BEHAVIORAL.getValue(), consent) || Intrinsics.a(GDPR_CONSENT.BEHAVIORAL.getValue(), consent);
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    public String getConsent() {
        Object objA = getConsentValue();
        Intrinsics.d(objA, "null cannot be cast to non-null type kotlin.String");
        return (String) objA;
    }
}

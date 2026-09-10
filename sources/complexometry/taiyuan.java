package complexometry;

import com.appsflyer.AppsFlyerProperties;
import com.google.android.libraries.ads.mobile.sdk.common.PrecisionType;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcomplexometry/taiyuan;", "", "Lcom/google/android/libraries/ads/mobile/sdk/common/PrecisionType;", "precisionType", "", "valueMicros", "", AppsFlyerProperties.CURRENCY_CODE, "<init>", "(Lcom/google/android/libraries/ads/mobile/sdk/common/PrecisionType;JLjava/lang/String;)V", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Lcom/google/android/libraries/ads/mobile/sdk/common/PrecisionType;", "()Lcom/google/android/libraries/ads/mobile/sdk/common/PrecisionType;", "saneness", "J", "()J", "dern", "Ljava/lang/String;", "getCurrencyCode", "()Ljava/lang/String;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final PrecisionType precisionType;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final String currencyCode;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final long valueMicros;

    public taiyuan(PrecisionType precisionType, long j, String currencyCode) {
        Intrinsics.checkNotNullParameter(precisionType, "precisionType");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.precisionType = precisionType;
        this.valueMicros = j;
        this.currencyCode = currencyCode;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final PrecisionType getPrecisionType() {
        return this.precisionType;
    }

    public boolean equals(Object other) {
        if (!(other instanceof taiyuan)) {
            return false;
        }
        taiyuan taiyuanVar = (taiyuan) other;
        return this.precisionType == taiyuanVar.precisionType && this.valueMicros == taiyuanVar.valueMicros && Intrinsics.wireman(this.currencyCode, taiyuanVar.currencyCode);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final long getValueMicros() {
        return this.valueMicros;
    }
}

package com.unity3d.ads.core.data.model;

import com.ironsource.X3;
import com.ironsource.mediationsdk.j;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import t9.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "", "(Ljava/lang/String;I)V", j.f29553a, "MREC", "INTERSTITIAL", "REWARDED", "NATIVE", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public enum AdRevenueAdFormat {
    BANNER,
    MREC,
    INTERSTITIAL,
    REWARDED,
    NATIVE;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat$Companion;", "", "()V", "fromString", "Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", X3.i.X, "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final AdRevenueAdFormat fromString(String value) {
            Object objC;
            if (value == null) {
                return null;
            }
            try {
                String upperCase = value.toUpperCase(Locale.ROOT);
                n.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                objC = AdRevenueAdFormat.valueOf(upperCase);
            } catch (Throwable th2) {
                objC = e.c(th2);
            }
            return (AdRevenueAdFormat) (objC instanceof wj.g ? null : objC);
        }

        private Companion() {
        }
    }
}

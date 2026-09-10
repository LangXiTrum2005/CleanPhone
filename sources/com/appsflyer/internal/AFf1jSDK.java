package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0010\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u001b\u0010\f\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u000f\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFf1jSDK;", "", "Lcom/appsflyer/internal/AFc1oSDK;", "p0", "Lcom/appsflyer/internal/AFf1hSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1oSDK;Lcom/appsflyer/internal/AFf1hSDK;)V", "", "getCurrencyIso4217Code", "()J", "", "AFAdRevenueData", "()Z", "Lcom/appsflyer/internal/AFc1oSDK;", "getMediationNetwork", "getRevenue", "Lcom/appsflyer/internal/AFf1hSDK;", "getMonetizationNetwork", "Lpatroclinal/taiyuan;", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFf1jSDK {
    private static final long getMonetizationNetwork = TimeUnit.HOURS.toSeconds(24);

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final AFc1oSDK getMediationNetwork;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    private final patroclinal.taiyuan AFAdRevenueData;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    private final patroclinal.taiyuan getRevenue;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    private final AFf1hSDK getMonetizationNetwork;

    public AFf1jSDK(AFc1oSDK aFc1oSDK, AFf1hSDK aFf1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFf1hSDK, "");
        this.getMediationNetwork = aFc1oSDK;
        this.getMonetizationNetwork = aFf1hSDK;
        this.getRevenue = p002kotlin.saneness.saneness(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1jSDK.4
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1jSDK.this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.sandbox")));
            }
        });
        this.AFAdRevenueData = p002kotlin.saneness.saneness(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1jSDK.5
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1jSDK.this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.staging")));
            }
        });
    }

    public final boolean AFAdRevenueData() {
        AFi1xSDK aFi1xSDK;
        AFi1vSDK aFi1vSDK = this.getMonetizationNetwork.getCurrencyIso4217Code;
        if (aFi1vSDK == null) {
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFi1zSDK aFi1zSDK = aFi1vSDK.getMonetizationNetwork;
        boolean zAFAdRevenueData = (aFi1zSDK == null || (aFi1xSDK = aFi1zSDK.getMediationNetwork) == null) ? false : aFi1xSDK.AFAdRevenueData();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AFf1hSDK aFf1hSDK = this.getMonetizationNetwork;
        return zAFAdRevenueData || jCurrentTimeMillis - aFf1hSDK.getRevenue > TimeUnit.SECONDS.toMillis(aFf1hSDK.getMonetizationNetwork);
    }

    public final long getCurrencyIso4217Code() {
        Object objM3351constructorimpl;
        String currencyIso4217Code = this.getMediationNetwork.getCurrencyIso4217Code("com.appsflyer.rc.cache.max-age-fallback");
        if (currencyIso4217Code == null) {
            return getMonetizationNetwork;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(Long.valueOf(Long.parseLong(currencyIso4217Code)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + thM3354exceptionOrNullimpl.getMessage(), thM3354exceptionOrNullimpl);
            objM3351constructorimpl = Long.valueOf(getMonetizationNetwork);
        }
        return ((Number) objM3351constructorimpl).longValue();
    }

    public final boolean getMediationNetwork() {
        return ((Boolean) this.AFAdRevenueData.getValue()).booleanValue();
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }
}

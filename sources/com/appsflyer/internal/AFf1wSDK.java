package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import com.appsflyer.adrevenue.adnetworks.generic.Scheme;
import com.ironsource.L6;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u001e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Lcom/appsflyer/internal/AFf1wSDK;", "Lcom/appsflyer/internal/AFe1mSDK;", "", "Lcom/appsflyer/internal/AFe1rSDK;", "p0", "Ljava/util/concurrent/Executor;", "p1", "Lcom/appsflyer/internal/AFc1oSDK;", "p2", "Lcom/appsflyer/internal/AFc1hSDK;", "p3", "Lcom/appsflyer/internal/AFg1nSDK;", "p4", "Lcom/appsflyer/internal/AFf1eSDK;", "p5", "Lkotlin/Function1;", "Lcom/appsflyer/internal/AFe1uSDK;", "p6", "<init>", "(Lcom/appsflyer/internal/AFe1rSDK;Ljava/util/concurrent/Executor;Lcom/appsflyer/internal/AFc1oSDK;Lcom/appsflyer/internal/AFc1hSDK;Lcom/appsflyer/internal/AFg1nSDK;Lcom/appsflyer/internal/AFf1eSDK;Lkotlin/jvm/functions/Function1;)V", "", "AFAdRevenueData", "()J", "getRevenue", "()Lcom/appsflyer/internal/AFe1uSDK;", "getCurrencyIso4217Code", "()V", "", "getMonetizationNetwork", "()Z", "component3", "Ljava/util/concurrent/Executor;", "component4", "Lcom/appsflyer/internal/AFc1hSDK;", "getMediationNetwork", "component2", "Lcom/appsflyer/internal/AFe1rSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFg1nSDK;", "component1", "Lcom/appsflyer/internal/AFc1oSDK;", "equals", "Lkotlin/jvm/functions/Function1;", "toString", "Lcom/appsflyer/internal/AFf1eSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFf1wSDK extends AFe1mSDK<Unit> {

    /* JADX INFO: renamed from: areAllFieldsValid, reason: from kotlin metadata */
    public AFg1nSDK getRevenue;

    /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
    public AFc1oSDK AFAdRevenueData;

    /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
    public AFe1rSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    public Executor getCurrencyIso4217Code;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    public AFc1hSDK getMediationNetwork;

    /* JADX INFO: renamed from: equals, reason: from kotlin metadata */
    public Function1<AFe1uSDK, Unit> areAllFieldsValid;

    /* JADX INFO: renamed from: toString, reason: from kotlin metadata */
    public AFf1eSDK component3;

    public static final class AFa1uSDK implements OutcomeReceiver {
        private /* synthetic */ Ref$ObjectRef<AFe1uSDK> AFAdRevenueData;
        private /* synthetic */ CountDownLatch getCurrencyIso4217Code;
        private /* synthetic */ AFf1wSDK getRevenue;

        public AFa1uSDK(Ref$ObjectRef<AFe1uSDK> ref$ObjectRef, CountDownLatch countDownLatch, AFf1wSDK aFf1wSDK) {
            this.AFAdRevenueData = ref$ObjectRef;
            this.getCurrencyIso4217Code = countDownLatch;
            this.getRevenue = aFf1wSDK;
        }

        public final /* synthetic */ void onError(Throwable th) {
            Exception exc = (Exception) th;
            Intrinsics.checkNotNullParameter(exc, "");
            AFf1wSDK.getMediationNetwork(exc);
            this.getCurrencyIso4217Code.countDown();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.appsflyer.internal.AFe1uSDK] */
        public final void onResult(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.AFAdRevenueData.element = AFe1uSDK.SUCCESS;
            AFLogger.INSTANCE.d(AFg1cSDK.PRIVACY_SANDBOX, "Privacy Sandbox trigger has been registered successfully. ", true);
            this.getCurrencyIso4217Code.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFf1wSDK(AFe1rSDK aFe1rSDK, Executor executor, AFc1oSDK aFc1oSDK, AFc1hSDK aFc1hSDK, AFg1nSDK aFg1nSDK, AFf1eSDK aFf1eSDK, Function1<? super AFe1uSDK, Unit> function1) {
        super(AFe1pSDK.REGISTER_TRIGGER, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, null);
        Intrinsics.checkNotNullParameter(aFe1rSDK, "");
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFg1nSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.getMonetizationNetwork = aFe1rSDK;
        this.getCurrencyIso4217Code = executor;
        this.AFAdRevenueData = aFc1oSDK;
        this.getMediationNetwork = aFc1hSDK;
        this.getRevenue = aFg1nSDK;
        this.component3 = aFf1eSDK;
        this.areAllFieldsValid = function1;
        if (aFe1rSDK instanceof AFe1rSDK.AFa1tSDK) {
            this.AFAdRevenueData.add(AFe1pSDK.CONVERSION);
        }
        if (this.getMonetizationNetwork instanceof AFe1rSDK.AFa1uSDK) {
            this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
        }
        if (this.getMonetizationNetwork instanceof AFe1rSDK.AFa1zSDK) {
            this.getCurrencyIso4217Code.add(AFe1pSDK.INAPP);
        }
    }

    public static final /* synthetic */ void getMediationNetwork(Throwable th) {
        AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, false, true);
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return 20000L;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFe1uSDK aFe1uSDK = this.getMonetizationNetwork;
        if (aFe1uSDK != null) {
            this.areAllFieldsValid.invoke(aFe1uSDK);
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.appsflyer.internal.AFe1uSDK] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.appsflyer.internal.AFe1uSDK] */
    @Override // com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() {
        MeasurementManager measurementManagerAttabal;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = AFe1uSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.getMediationNetwork.getMonetizationNetwork;
            if (context != null && (measurementManagerAttabal = androidx.privacysandbox.ads.adservices.measurement.marial.attabal(context.getSystemService(androidx.privacysandbox.ads.adservices.measurement.wireman.attabal()))) != null) {
                new AFj1cSDK(this.AFAdRevenueData, null, 2, null);
                Uri.Builder builderBuildUpon = Uri.parse(AFj1cSDK.getMediationNetwork()).buildUpon();
                String strAreAllFieldsValid = this.AFAdRevenueData.areAllFieldsValid();
                if (strAreAllFieldsValid == null) {
                    strAreAllFieldsValid = "";
                }
                Map mapKowloon = p002kotlin.collections.seminary.kowloon(patroclinal.formularize.attabal("event_name", this.getMonetizationNetwork.getMediationNetwork), patroclinal.formularize.attabal("app_id", this.AFAdRevenueData.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()), patroclinal.formularize.attabal("app_version", this.AFAdRevenueData.n_().versionName), patroclinal.formularize.attabal("sdk_version", AFc1oSDK.getMonetizationNetwork()), patroclinal.formularize.attabal("api_version", AFc1oSDK.getCurrencyIso4217Code()), patroclinal.formularize.attabal("timestamp", String.valueOf(this.getRevenue.getCurrencyIso4217Code())), patroclinal.formularize.attabal("request_id", AFc1oSDK.getMediationNetwork()), patroclinal.formularize.attabal(L6.V0, strAreAllFieldsValid));
                String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.AFAdRevenueData.getMediationNetwork);
                if (currencyIso4217Code != null) {
                    mapKowloon.put("appsflyer_id", currencyIso4217Code);
                }
                Long monetizationNetwork = this.getRevenue.getMonetizationNetwork();
                if (monetizationNetwork != null) {
                    mapKowloon.put("install_time", String.valueOf(monetizationNetwork.longValue()));
                }
                AFe1rSDK aFe1rSDK = this.getMonetizationNetwork;
                if (aFe1rSDK instanceof AFe1rSDK.AFa1zSDK) {
                    Float f = ((AFe1rSDK.AFa1zSDK) aFe1rSDK).getCurrencyIso4217Code;
                    if (f != null) {
                        mapKowloon.put(Scheme.EVENT_REVENUE, String.valueOf(f.floatValue()));
                    }
                    Integer num = ((AFe1rSDK.AFa1zSDK) this.getMonetizationNetwork).AFAdRevenueData;
                    if (num != null) {
                        mapKowloon.put("event_count", String.valueOf(num.intValue()));
                    }
                }
                for (Map.Entry entry : mapKowloon.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri uriBuild = builderBuildUpon.build();
                Intrinsics.checkNotNullExpressionValue(uriBuild, "");
                measurementManagerAttabal.registerTrigger(uriBuild, this.getCurrencyIso4217Code, claque.formularize.attabal(new AFa1uSDK(ref$ObjectRef, countDownLatch, this)));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            ref$ObjectRef.element = AFe1uSDK.TIMEOUT;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, false, true);
        }
        return (AFe1uSDK) ref$ObjectRef.element;
    }
}

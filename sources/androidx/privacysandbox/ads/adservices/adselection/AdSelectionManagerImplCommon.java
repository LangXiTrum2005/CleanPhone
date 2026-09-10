package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.net.Uri;
import android.view.InputEvent;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0002!\"J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0097@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0097@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0097@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0097@¢\u0006\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", i.f37957c, "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "adSelectionFromOutcomesConfig", "j", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "reportImpressionRequest", "", g.f40227p, "(Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "reportEventRequest", "e", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "updateAdCounterHistogramRequest", "m", "(Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "a", "(Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "persistAdSelectionResultRequest", "c", "(Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ext10Impl", "Ext8Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AdSelectionManagerImplCommon extends AdSelectionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.adservices.adselection.AdSelectionManager f7909a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ext10Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Companion f7910a = new Companion();

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0087@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0087@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl$Companion;", "", "Landroid/adservices/adselection/AdSelectionManager;", "adSelectionManager", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "a", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "persistAdSelectionResultRequest", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "b", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "adSelectionFromOutcomesConfig", "c", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object a(android.adservices.adselection.AdSelectionManager adSelectionManager, GetAdSelectionDataRequest getAdSelectionDataRequest, Continuation<? super GetAdSelectionDataOutcome> continuation) {
                AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1;
                if (continuation instanceof AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1) {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 = (AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1) continuation;
                    int i2 = adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.e0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.e0 = i2 - Integer.MIN_VALUE;
                    } else {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1(this, continuation);
                    }
                } else {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1(this, continuation);
                }
                Object obj = adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.f7911Y;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i3 = adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.e0;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.privacysandbox.ads.adservices.adid.a.A(adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.X);
                    ResultKt.b(obj);
                    return new GetAdSelectionDataOutcome(a.b(obj));
                }
                ResultKt.b(obj);
                adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.X = adSelectionManager;
                adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1.e0 = 1;
                new CancellableContinuationImpl(1, IntrinsicsKt.b(adSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1)).q();
                getAdSelectionDataRequest.getClass();
                if (AdServicesInfo.a() >= 12 || AdServicesInfo.b() >= 12) {
                    a.y();
                    throw null;
                }
                a.y();
                throw null;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object b(android.adservices.adselection.AdSelectionManager adSelectionManager, PersistAdSelectionResultRequest persistAdSelectionResultRequest, Continuation<? super AdSelectionOutcome> continuation) throws Throwable {
                AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1;
                if (continuation instanceof AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1) {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 = (AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1) continuation;
                    int i2 = adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.e0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.e0 = i2 - Integer.MIN_VALUE;
                    } else {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1(this, continuation);
                    }
                } else {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1(this, continuation);
                }
                Object objP = adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.f7912Y;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i3 = adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.e0;
                if (i3 == 0) {
                    ResultKt.b(objP);
                    adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.X = adSelectionManager;
                    adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.e0 = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1));
                    cancellableContinuationImpl.q();
                    persistAdSelectionResultRequest.getClass();
                    android.adservices.adselection.PersistAdSelectionResultRequest persistAdSelectionResultRequestBuild = a.c().setAdSelectionId(0L).setSeller((AdTechIdentifier) null).setAdSelectionResult((byte[]) null).build();
                    Intrinsics.e(persistAdSelectionResultRequestBuild, "Builder()\n            .s…ult)\n            .build()");
                    adSelectionManager.persistAdSelectionResult(persistAdSelectionResultRequestBuild, new androidx.arch.core.executor.a(1), OutcomeReceiverKt.a(cancellableContinuationImpl));
                    objP = cancellableContinuationImpl.p();
                    if (objP == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.privacysandbox.ads.adservices.adid.a.A(adSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1.X);
                    ResultKt.b(objP);
                }
                return new AdSelectionOutcome(androidx.privacysandbox.ads.adservices.adid.a.m(objP));
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object c(android.adservices.adselection.AdSelectionManager adSelectionManager, AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, Continuation<? super AdSelectionOutcome> continuation) {
                AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1;
                if (continuation instanceof AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1) {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 = (AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1) continuation;
                    int i2 = adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.e0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.e0 = i2 - Integer.MIN_VALUE;
                    } else {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1(this, continuation);
                    }
                } else {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1(this, continuation);
                }
                Object obj = adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.f7913Y;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i3 = adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.e0;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.privacysandbox.ads.adservices.adid.a.A(adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.X);
                    ResultKt.b(obj);
                    return new AdSelectionOutcome(androidx.privacysandbox.ads.adservices.adid.a.m(obj));
                }
                ResultKt.b(obj);
                adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.X = adSelectionManager;
                adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.e0 = 1;
                new CancellableContinuationImpl(1, IntrinsicsKt.b(adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1)).q();
                adSelectionFromOutcomesConfig.getClass();
                a.q();
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ext8Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Companion f7914a = new Companion();

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0087@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl$Companion;", "", "Landroid/adservices/adselection/AdSelectionManager;", "adSelectionManager", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "updateAdCounterHistogramRequest", "", "b", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "reportEventRequest", "a", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public final Object a(android.adservices.adselection.AdSelectionManager adSelectionManager, ReportEventRequest reportEventRequest, Continuation<? super Unit> continuation) throws Throwable {
                android.adservices.adselection.ReportEventRequest reportEventRequestBuild;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
                cancellableContinuationImpl.q();
                reportEventRequest.getClass();
                if (AdServicesInfo.a() >= 10 || AdServicesInfo.b() >= 10) {
                    a.B();
                    reportEventRequestBuild = a.f().setInputEvent((InputEvent) null).build();
                    Intrinsics.e(reportEventRequestBuild, "Builder(\n               …                 .build()");
                } else {
                    a.B();
                    reportEventRequestBuild = a.f().build();
                    Intrinsics.e(reportEventRequestBuild, "Builder(\n               …                 .build()");
                }
                adSelectionManager.reportEvent(reportEventRequestBuild, new androidx.arch.core.executor.a(1), OutcomeReceiverKt.a(cancellableContinuationImpl));
                Object objP = cancellableContinuationImpl.p();
                return objP == CoroutineSingletons.X ? objP : Unit.f43263a;
            }

            public final Object b(android.adservices.adselection.AdSelectionManager adSelectionManager, UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, Continuation<? super Unit> continuation) {
                new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation)).q();
                updateAdCounterHistogramRequest.getClass();
                a.C();
                throw null;
            }
        }
    }

    public AdSelectionManagerImplCommon(android.adservices.adselection.AdSelectionManager adSelectionManager) {
        this.f7909a = adSelectionManager;
    }

    public static /* synthetic */ Object b(AdSelectionManagerImplCommon adSelectionManagerImplCommon, GetAdSelectionDataRequest getAdSelectionDataRequest, Continuation<? super GetAdSelectionDataOutcome> continuation) {
        if (AdServicesInfo.a() >= 10 || AdServicesInfo.b() >= 10) {
            return Ext10Impl.f7910a.a(adSelectionManagerImplCommon.f7909a, getAdSelectionDataRequest, continuation);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    public static /* synthetic */ Object d(AdSelectionManagerImplCommon adSelectionManagerImplCommon, PersistAdSelectionResultRequest persistAdSelectionResultRequest, Continuation<? super AdSelectionOutcome> continuation) {
        if (AdServicesInfo.a() >= 10 || AdServicesInfo.b() >= 10) {
            return Ext10Impl.f7910a.b(adSelectionManagerImplCommon.f7909a, persistAdSelectionResultRequest, continuation);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    public static Object f(AdSelectionManagerImplCommon adSelectionManagerImplCommon, ReportEventRequest reportEventRequest, Continuation<? super Unit> continuation) throws Throwable {
        if (AdServicesInfo.a() < 8 && AdServicesInfo.b() < 9) {
            throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        }
        Object objA = Ext8Impl.f7914a.a(adSelectionManagerImplCommon.f7909a, reportEventRequest, continuation);
        return objA == CoroutineSingletons.X ? objA : Unit.f43263a;
    }

    public static Object h(AdSelectionManagerImplCommon adSelectionManagerImplCommon, ReportImpressionRequest reportImpressionRequest, Continuation<? super Unit> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.q();
        android.adservices.adselection.AdSelectionManager adSelectionManager = adSelectionManagerImplCommon.f7909a;
        reportImpressionRequest.getClass();
        if (AdServicesInfo.a() < 10 && AdServicesInfo.b() < 10) {
            if (Intrinsics.a(null, AdSelectionConfig.f7905e)) {
                throw new UnsupportedOperationException("adSelectionConfig is mandatory forAPI versions lower than ext 10");
            }
            androidx.privacysandbox.ads.adservices.adid.a.v();
            throw null;
        }
        if (!Intrinsics.a(null, AdSelectionConfig.f7905e)) {
            androidx.privacysandbox.ads.adservices.adid.a.v();
            throw null;
        }
        androidx.privacysandbox.ads.adservices.adid.a.v();
        adSelectionManager.reportImpression(a.i(), new androidx.arch.core.executor.a(1), OutcomeReceiverKt.a(cancellableContinuationImpl));
        Object objP = cancellableContinuationImpl.p();
        return objP == CoroutineSingletons.X ? objP : Unit.f43263a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object k(AdSelectionManagerImplCommon adSelectionManagerImplCommon, AdSelectionConfig adSelectionConfig, Continuation<? super AdSelectionOutcome> continuation) throws Throwable {
        AdSelectionManagerImplCommon$selectAds$1 adSelectionManagerImplCommon$selectAds$1;
        AdSelectionSignals adSelectionSignalsFromString;
        if (continuation instanceof AdSelectionManagerImplCommon$selectAds$1) {
            adSelectionManagerImplCommon$selectAds$1 = (AdSelectionManagerImplCommon$selectAds$1) continuation;
            int i2 = adSelectionManagerImplCommon$selectAds$1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adSelectionManagerImplCommon$selectAds$1.Z = i2 - Integer.MIN_VALUE;
            } else {
                adSelectionManagerImplCommon$selectAds$1 = new AdSelectionManagerImplCommon$selectAds$1(adSelectionManagerImplCommon, continuation);
            }
        } else {
            adSelectionManagerImplCommon$selectAds$1 = new AdSelectionManagerImplCommon$selectAds$1(adSelectionManagerImplCommon, continuation);
        }
        Object objP = adSelectionManagerImplCommon$selectAds$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = adSelectionManagerImplCommon$selectAds$1.Z;
        if (i3 == 0) {
            ResultKt.b(objP);
            adSelectionConfig.getClass();
            android.adservices.adselection.AdSelectionConfig.Builder builderE = androidx.privacysandbox.ads.adservices.adid.a.e();
            AdSelectionSignals adSelectionSignalsFromString2 = AdSelectionSignals.fromString("");
            Intrinsics.e(adSelectionSignalsFromString2, "fromString(signals)");
            android.adservices.adselection.AdSelectionConfig.Builder customAudienceBuyers = builderE.setAdSelectionSignals(adSelectionSignalsFromString2).setCustomAudienceBuyers(new ArrayList());
            Uri uri = Uri.EMPTY;
            android.adservices.adselection.AdSelectionConfig.Builder decisionLogicUri = customAudienceBuyers.setDecisionLogicUri(Uri.EMPTY);
            AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString("");
            Intrinsics.e(adTechIdentifierFromString, "fromString(identifier)");
            android.adservices.adselection.AdSelectionConfig.Builder seller = decisionLogicUri.setSeller(adTechIdentifierFromString);
            HashMap map = new HashMap();
            Map map2 = adSelectionConfig.d;
            for (androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier : map2.keySet()) {
                adTechIdentifier.getClass();
                AdTechIdentifier adTechIdentifierFromString2 = AdTechIdentifier.fromString("");
                Intrinsics.e(adTechIdentifierFromString2, "fromString(identifier)");
                if (((androidx.privacysandbox.ads.adservices.common.AdSelectionSignals) map2.get(adTechIdentifier)) != null) {
                    adSelectionSignalsFromString = AdSelectionSignals.fromString("");
                    Intrinsics.e(adSelectionSignalsFromString, "fromString(signals)");
                } else {
                    adSelectionSignalsFromString = null;
                }
                map.put(adTechIdentifierFromString2, adSelectionSignalsFromString);
            }
            android.adservices.adselection.AdSelectionConfig.Builder perBuyerSignals = seller.setPerBuyerSignals(map);
            AdSelectionSignals adSelectionSignalsFromString3 = AdSelectionSignals.fromString("");
            Intrinsics.e(adSelectionSignalsFromString3, "fromString(signals)");
            android.adservices.adselection.AdSelectionConfig.Builder sellerSignals = perBuyerSignals.setSellerSignals(adSelectionSignalsFromString3);
            Uri uri2 = Uri.EMPTY;
            android.adservices.adselection.AdSelectionConfig adSelectionConfigBuild = sellerSignals.setTrustedScoringSignalsUri(Uri.EMPTY).build();
            Intrinsics.e(adSelectionConfigBuild, "Builder()\n            .s…Uri)\n            .build()");
            adSelectionManagerImplCommon$selectAds$1.Z = 1;
            adSelectionManagerImplCommon.getClass();
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(adSelectionManagerImplCommon$selectAds$1));
            cancellableContinuationImpl.q();
            adSelectionManagerImplCommon.f7909a.selectAds(adSelectionConfigBuild, new androidx.arch.core.executor.a(1), OutcomeReceiverKt.a(cancellableContinuationImpl));
            objP = cancellableContinuationImpl.p();
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objP);
        }
        return new AdSelectionOutcome(androidx.privacysandbox.ads.adservices.adid.a.m(objP));
    }

    public static /* synthetic */ Object l(AdSelectionManagerImplCommon adSelectionManagerImplCommon, AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, Continuation<? super AdSelectionOutcome> continuation) {
        if (AdServicesInfo.a() >= 10 || AdServicesInfo.b() >= 10) {
            return Ext10Impl.f7910a.c(adSelectionManagerImplCommon.f7909a, adSelectionFromOutcomesConfig, continuation);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    public static Object n(AdSelectionManagerImplCommon adSelectionManagerImplCommon, UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, Continuation<? super Unit> continuation) {
        if (AdServicesInfo.a() < 8 && AdServicesInfo.b() < 9) {
            throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        }
        Object objB = Ext8Impl.f7914a.b(adSelectionManagerImplCommon.f7909a, updateAdCounterHistogramRequest, continuation);
        return objB == CoroutineSingletons.X ? objB : Unit.f43263a;
    }

    public Object a(GetAdSelectionDataRequest getAdSelectionDataRequest, Continuation<? super GetAdSelectionDataOutcome> continuation) {
        return b(this, getAdSelectionDataRequest, continuation);
    }

    public Object c(PersistAdSelectionResultRequest persistAdSelectionResultRequest, Continuation<? super AdSelectionOutcome> continuation) {
        return d(this, persistAdSelectionResultRequest, continuation);
    }

    public Object e(ReportEventRequest reportEventRequest, Continuation<? super Unit> continuation) {
        return f(this, reportEventRequest, continuation);
    }

    public Object g(ReportImpressionRequest reportImpressionRequest, Continuation<? super Unit> continuation) {
        return h(this, reportImpressionRequest, continuation);
    }

    public Object i(AdSelectionConfig adSelectionConfig, Continuation<? super AdSelectionOutcome> continuation) {
        return k(this, adSelectionConfig, continuation);
    }

    public Object j(AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, Continuation<? super AdSelectionOutcome> continuation) {
        return l(this, adSelectionFromOutcomesConfig, continuation);
    }

    public Object m(UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, Continuation<? super Unit> continuation) {
        return n(this, updateAdCounterHistogramRequest, continuation);
    }
}

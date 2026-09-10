package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.common.AdSelectionSignals;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import j$.time.Instant;
import j$.time.TimeConversions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\rJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0097@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0097@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager;", "Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;", "request", "", "c", "(Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "a", "(Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;", "e", "(Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ext10Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class CustomAudienceManagerImplCommon extends CustomAudienceManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.adservices.customaudience.CustomAudienceManager f7924a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon$Ext10Impl;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ext10Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Companion f7925a = new Companion();

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon$Ext10Impl$Companion;", "", "Landroid/adservices/customaudience/CustomAudienceManager;", "customAudienceManager", "Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "fetchAndJoinCustomAudienceRequest", "", "a", "(Landroid/adservices/customaudience/CustomAudienceManager;Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public final Object a(android.adservices.customaudience.CustomAudienceManager customAudienceManager, FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, Continuation<? super Unit> continuation) throws Throwable {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
                cancellableContinuationImpl.q();
                fetchAndJoinCustomAudienceRequest.getClass();
                android.adservices.customaudience.FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequestBuild = androidx.privacysandbox.ads.adservices.adselection.a.j().setName((String) null).setActivationTime(TimeConversions.convert((Instant) null)).setExpirationTime(TimeConversions.convert((Instant) null)).setUserBiddingSignals((AdSelectionSignals) null).build();
                Intrinsics.e(fetchAndJoinCustomAudienceRequestBuild, "Builder(fetchUri)\n      …s())\n            .build()");
                customAudienceManager.fetchAndJoinCustomAudience(fetchAndJoinCustomAudienceRequestBuild, new androidx.arch.core.executor.a(1), OutcomeReceiverKt.a(cancellableContinuationImpl));
                Object objP = cancellableContinuationImpl.p();
                return objP == CoroutineSingletons.X ? objP : Unit.f43263a;
            }
        }
    }

    public CustomAudienceManagerImplCommon(android.adservices.customaudience.CustomAudienceManager customAudienceManager) {
        this.f7924a = customAudienceManager;
    }

    public static Object b(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, Continuation<? super Unit> continuation) throws Throwable {
        if (AdServicesInfo.a() < 10 && AdServicesInfo.b() < 10) {
            throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
        }
        Object objA = Ext10Impl.f7925a.a(customAudienceManagerImplCommon.f7924a, fetchAndJoinCustomAudienceRequest, continuation);
        return objA == CoroutineSingletons.X ? objA : Unit.f43263a;
    }

    public static Object d(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, JoinCustomAudienceRequest joinCustomAudienceRequest, Continuation<? super Unit> continuation) {
        new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation)).q();
        android.adservices.customaudience.CustomAudienceManager customAudienceManager = customAudienceManagerImplCommon.f7924a;
        a.z();
        joinCustomAudienceRequest.getClass();
        a.c();
        throw null;
    }

    public static Object f(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, LeaveCustomAudienceRequest leaveCustomAudienceRequest, Continuation<? super Unit> continuation) {
        new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation)).q();
        android.adservices.customaudience.CustomAudienceManager customAudienceManager = customAudienceManagerImplCommon.f7924a;
        a.r();
        leaveCustomAudienceRequest.getClass();
        throw null;
    }

    public Object a(FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, Continuation<? super Unit> continuation) {
        return b(this, fetchAndJoinCustomAudienceRequest, continuation);
    }

    public Object c(JoinCustomAudienceRequest joinCustomAudienceRequest, Continuation<? super Unit> continuation) {
        return d(this, joinCustomAudienceRequest, continuation);
    }

    public Object e(LeaveCustomAudienceRequest leaveCustomAudienceRequest, Continuation<? super Unit> continuation) {
        return f(this, leaveCustomAudienceRequest, continuation);
    }
}

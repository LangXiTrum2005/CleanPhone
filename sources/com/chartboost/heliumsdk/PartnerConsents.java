package com.chartboost.heliumsdk;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010$\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\f\u001a\u00020\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u000eJ\u0015\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u000eJ!\u0010\u0014\u001a\u00020\r2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u000eH\u0000¢\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\rH\u0002J\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0002\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u000eJ\u0016\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/chartboost/heliumsdk/PartnerConsents;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "partnerConsentsObservers", "", "Lcom/chartboost/heliumsdk/PartnerConsents$PartnerConsentsObserver;", "partnerIdToConsentGivenMap", "", "", "", "addPartnerConsents", "", "", "addPartnerConsentsObserver", "observer", "addPartnerConsentsObserver$Helium_release", "clear", "getPartnerIdToConsentGivenMapCopy", "mergePartnerConsentsFromDisk", "consentsFromDisk", "mergePartnerConsentsFromDisk$Helium_release", "notifyPartnerConsentsUpdated", "removePartnerConsent", "partnerId", "(Ljava/lang/String;)Ljava/lang/Boolean;", "replacePartnerConsents", "setPartnerConsent", "consentGiven", "PartnerConsentsObserver", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartnerConsents {
    private final CoroutineScope coroutineScope;
    private final Set<PartnerConsentsObserver> partnerConsentsObservers;
    private final Map<String, Boolean> partnerIdToConsentGivenMap;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/chartboost/heliumsdk/PartnerConsents$PartnerConsentsObserver;", "", "onPartnerConsentsUpdated", "", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PartnerConsentsObserver {
        void onPartnerConsentsUpdated();
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.PartnerConsents$notifyPartnerConsentsUpdated$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.PartnerConsents$notifyPartnerConsentsUpdated$1", f = "PartnerConsents.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PartnerConsents.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Iterator it = PartnerConsents.this.partnerConsentsObservers.iterator();
            while (it.hasNext()) {
                ((PartnerConsentsObserver) it.next()).onPartnerConsentsUpdated();
            }
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    public PartnerConsents() {
        this(null, 1, null);
    }

    private final void notifyPartnerConsentsUpdated() {
        BuildersKt.c(this.coroutineScope, null, null, new AnonymousClass1(null), 3);
    }

    public final void addPartnerConsents(Map<String, Boolean> partnerIdToConsentGivenMap) {
        Intrinsics.f(partnerIdToConsentGivenMap, "partnerIdToConsentGivenMap");
        this.partnerIdToConsentGivenMap.putAll(partnerIdToConsentGivenMap);
        notifyPartnerConsentsUpdated();
    }

    public final void addPartnerConsentsObserver$Helium_release(PartnerConsentsObserver observer) {
        Intrinsics.f(observer, "observer");
        BuildersKt.c(this.coroutineScope, null, null, new PartnerConsents$addPartnerConsentsObserver$1(this, observer, null), 3);
    }

    public final void clear() {
        boolean zIsEmpty = this.partnerIdToConsentGivenMap.isEmpty();
        this.partnerIdToConsentGivenMap.clear();
        if (zIsEmpty) {
            return;
        }
        notifyPartnerConsentsUpdated();
    }

    public final Map<String, Boolean> getPartnerIdToConsentGivenMapCopy() {
        return MapsKt.q(this.partnerIdToConsentGivenMap);
    }

    public final void mergePartnerConsentsFromDisk$Helium_release(Map<String, Boolean> consentsFromDisk) {
        Intrinsics.f(consentsFromDisk, "consentsFromDisk");
        Map<? extends String, ? extends Boolean> mapQ = MapsKt.q(this.partnerIdToConsentGivenMap);
        this.partnerIdToConsentGivenMap.putAll(consentsFromDisk);
        this.partnerIdToConsentGivenMap.putAll(mapQ);
    }

    public final Boolean removePartnerConsent(String partnerId) {
        Intrinsics.f(partnerId, "partnerId");
        Boolean boolRemove = this.partnerIdToConsentGivenMap.remove(partnerId);
        if (boolRemove != null) {
            notifyPartnerConsentsUpdated();
        }
        return boolRemove;
    }

    public final void replacePartnerConsents(Map<String, Boolean> partnerIdToConsentGivenMap) {
        Intrinsics.f(partnerIdToConsentGivenMap, "partnerIdToConsentGivenMap");
        this.partnerIdToConsentGivenMap.clear();
        addPartnerConsents(partnerIdToConsentGivenMap);
    }

    public final void setPartnerConsent(String partnerId, boolean consentGiven) {
        Intrinsics.f(partnerId, "partnerId");
        this.partnerIdToConsentGivenMap.put(partnerId, Boolean.valueOf(consentGiven));
        notifyPartnerConsentsUpdated();
    }

    public PartnerConsents(CoroutineScope coroutineScope) {
        Intrinsics.f(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.partnerIdToConsentGivenMap = new LinkedHashMap();
        this.partnerConsentsObservers = new LinkedHashSet();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PartnerConsents(CoroutineScope coroutineScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineScope = CoroutineScopeKt.a(MainDispatcherLoader.f45042a.j0());
        }
        this(coroutineScope);
    }
}

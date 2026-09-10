package com.chartboost.heliumsdk;

import com.chartboost.heliumsdk.domain.AppConfigStorage;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.utils.Environment;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002JD\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u000f0\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0005J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\u001c\u0010 \u001a\u00020\u001a*\u00020\u000e2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/chartboost/heliumsdk/PartnerInitializationResults;", "", "()V", "observers", "", "Lcom/chartboost/heliumsdk/PartnerInitializationResultsObserver;", "createCommonJson", "Lorg/json/JSONObject;", "partnerData", "createFailureJson", "heliumErrorCode", "", "createInProgressJson", "createJsonArray", "Lorg/json/JSONArray;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "groupedMetrics", "", "", "key", "transform", "Lkotlin/Function1;", "createSuccessJson", "getPublicPayload", "payload", "onResultsReceived", "", "results", "Lcom/chartboost/heliumsdk/PartnerInitializationResultsData;", "subscribe", "observer", "unsubscribe", "putAll", "collection", "", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartnerInitializationResults {
    private static final String DURATION_KEY = "duration";
    private static final String END_KEY = "end";
    private static final String FAILURE_GROUP_KEY = "failure";
    private static final String HELIUM_ERROR_CODE_KEY = "helium_error_code";
    private static final String HELIUM_ERROR_KEY = "helium_error";
    private static final String HELIUM_ERROR_MESSAGE_KEY = "helium_error_message";
    private static final String IN_PROGRESS_GROUP_KEY = "in_progress";
    private static final String IS_SUCCESS_KEY = "is_success";
    private static final String METRICS_NODE_KEY = "metrics";
    private static final String PARTNER_ADAPTER_VERSION_KEY = "partner_adapter_version";
    private static final String PARTNER_KEY = "partner";
    private static final String PARTNER_SDK_VERSION_KEY = "partner_sdk_version";
    private static final String SESSION_ID_KEY = "session_id";
    private static final String SKIPPED_GROUP_KEY = "skipped";
    private static final String START_KEY = "start";
    private static final String SUCCESS_GROUP_KEY = "success";
    private static final String TIMEOUT_SECONDS_KEY = "timeout_seconds";
    private final Set<PartnerInitializationResultsObserver> observers = new LinkedHashSet();

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.PartnerInitializationResults$onResultsReceived$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.PartnerInitializationResults$onResultsReceived$1", f = "PartnerInitializationResults.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PartnerInitializationResultsData $results;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PartnerInitializationResultsData partnerInitializationResultsData, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$results = partnerInitializationResultsData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PartnerInitializationResults.this.new AnonymousClass1(this.$results, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Set<PartnerInitializationResultsObserver> set = PartnerInitializationResults.this.observers;
            PartnerInitializationResults partnerInitializationResults = PartnerInitializationResults.this;
            PartnerInitializationResultsData partnerInitializationResultsData = this.$results;
            for (PartnerInitializationResultsObserver partnerInitializationResultsObserver : set) {
                partnerInitializationResultsObserver.onPartnerInitializationResultsReady(new PartnerInitializationResultsData(partnerInitializationResults.getPublicPayload(partnerInitializationResultsData.getData())));
                partnerInitializationResults.unsubscribe(partnerInitializationResultsObserver);
            }
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.PartnerInitializationResults$subscribe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.PartnerInitializationResults$subscribe$1", f = "PartnerInitializationResults.kt", l = {}, m = "invokeSuspend")
    public static final class C09811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PartnerInitializationResultsObserver $observer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09811(PartnerInitializationResultsObserver partnerInitializationResultsObserver, Continuation<? super C09811> continuation) {
            super(2, continuation);
            this.$observer = partnerInitializationResultsObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PartnerInitializationResults.this.new C09811(this.$observer, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            PartnerInitializationResults.this.observers.add(this.$observer);
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09811) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.PartnerInitializationResults$unsubscribe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.PartnerInitializationResults$unsubscribe$1", f = "PartnerInitializationResults.kt", l = {}, m = "invokeSuspend")
    public static final class C09821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PartnerInitializationResultsObserver $observer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09821(PartnerInitializationResultsObserver partnerInitializationResultsObserver, Continuation<? super C09821> continuation) {
            super(2, continuation);
            this.$observer = partnerInitializationResultsObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PartnerInitializationResults.this.new C09821(this.$observer, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            PartnerInitializationResults.this.observers.remove(this.$observer);
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09821) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    private final JSONObject createCommonJson(JSONObject partnerData) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PARTNER_KEY, partnerData.optString(PARTNER_KEY));
        jSONObject.put("start", partnerData.optLong("start"));
        jSONObject.put(PARTNER_SDK_VERSION_KEY, partnerData.optString(PARTNER_SDK_VERSION_KEY));
        jSONObject.put(PARTNER_ADAPTER_VERSION_KEY, partnerData.optString(PARTNER_ADAPTER_VERSION_KEY));
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject createFailureJson(JSONObject partnerData, String heliumErrorCode) throws JSONException {
        JSONObject jSONObjectCreateCommonJson = createCommonJson(partnerData);
        jSONObjectCreateCommonJson.put("end", partnerData.optLong("end"));
        jSONObjectCreateCommonJson.put("duration", partnerData.optInt("duration"));
        jSONObjectCreateCommonJson.put(HELIUM_ERROR_KEY, partnerData.opt(HELIUM_ERROR_KEY));
        jSONObjectCreateCommonJson.put(HELIUM_ERROR_CODE_KEY, heliumErrorCode);
        jSONObjectCreateCommonJson.put(HELIUM_ERROR_MESSAGE_KEY, partnerData.optString(HELIUM_ERROR_MESSAGE_KEY));
        return jSONObjectCreateCommonJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject createInProgressJson(JSONObject partnerData) throws JSONException {
        JSONObject jSONObjectCreateCommonJson = createCommonJson(partnerData);
        jSONObjectCreateCommonJson.put(TIMEOUT_SECONDS_KEY, AppConfigStorage.INSTANCE.getInitializationMetricsPostTimeout());
        return jSONObjectCreateCommonJson;
    }

    private final <T> JSONArray createJsonArray(Map<String, ? extends List<? extends JSONObject>> groupedMetrics, String key, Function1<? super JSONObject, ? extends T> transform) {
        Collection<? extends Object> arrayList;
        JSONArray jSONArray = new JSONArray();
        List<? extends JSONObject> list = groupedMetrics.get(key);
        if (list != null) {
            List<? extends JSONObject> list2 = list;
            arrayList = new ArrayList<>(CollectionsKt.n(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(transform.invoke(it.next()));
            }
        } else {
            arrayList = EmptyList.X;
        }
        putAll(jSONArray, arrayList);
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject createSuccessJson(JSONObject partnerData) throws JSONException {
        JSONObject jSONObjectCreateCommonJson = createCommonJson(partnerData);
        jSONObjectCreateCommonJson.put("end", partnerData.optLong("end"));
        jSONObjectCreateCommonJson.put("duration", partnerData.optInt("duration"));
        return jSONObjectCreateCommonJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject getPublicPayload(JSONObject payload) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("session_id", Environment.INSTANCE.getSessionId$Helium_release());
        JSONArray jSONArray = payload.getJSONArray(METRICS_NODE_KEY);
        IntRange intRangeE = RangesKt.e(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.n(intRangeE, 10));
        Iterator<Integer> it = intRangeE.iterator();
        while (((IntProgressionIterator) it).Z) {
            arrayList.add(jSONArray.getJSONObject(((IntIterator) it).a()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            String str = FAILURE_GROUP_KEY;
            if (!zHasNext) {
                jSONObject.put("success", createJsonArray(linkedHashMap, "success", new Function1<JSONObject, JSONObject>() { // from class: com.chartboost.heliumsdk.PartnerInitializationResults$getPublicPayload$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final JSONObject invoke(JSONObject it3) {
                        Intrinsics.f(it3, "it");
                        return this.this$0.createSuccessJson(it3);
                    }
                }));
                jSONObject.put(IN_PROGRESS_GROUP_KEY, createJsonArray(linkedHashMap, IN_PROGRESS_GROUP_KEY, new Function1<JSONObject, JSONObject>() { // from class: com.chartboost.heliumsdk.PartnerInitializationResults$getPublicPayload$1$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final JSONObject invoke(JSONObject it3) {
                        Intrinsics.f(it3, "it");
                        return this.this$0.createInProgressJson(it3);
                    }
                }));
                jSONObject.put(SKIPPED_GROUP_KEY, createJsonArray(linkedHashMap, SKIPPED_GROUP_KEY, new Function1<JSONObject, String>() { // from class: com.chartboost.heliumsdk.PartnerInitializationResults$getPublicPayload$1$3
                    @Override // kotlin.jvm.functions.Function1
                    public final String invoke(JSONObject it3) {
                        Intrinsics.f(it3, "it");
                        return it3.optString("partner");
                    }
                }));
                jSONObject.put(FAILURE_GROUP_KEY, createJsonArray(linkedHashMap, FAILURE_GROUP_KEY, new Function1<JSONObject, JSONObject>() { // from class: com.chartboost.heliumsdk.PartnerInitializationResults$getPublicPayload$1$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final JSONObject invoke(JSONObject it3) {
                        Intrinsics.f(it3, "it");
                        PartnerInitializationResults partnerInitializationResults = this.this$0;
                        Object objOpt = it3.opt("helium_error_code");
                        Intrinsics.d(objOpt, "null cannot be cast to non-null type kotlin.String");
                        return partnerInitializationResults.createFailureJson(it3, (String) objOpt);
                    }
                }));
                return jSONObject;
            }
            Object next = it2.next();
            JSONObject jSONObject2 = (JSONObject) next;
            Object objOpt = jSONObject2.opt(IS_SUCCESS_KEY);
            Intrinsics.d(objOpt, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) objOpt).booleanValue()) {
                str = "success";
            } else if (Intrinsics.a(jSONObject2.opt(HELIUM_ERROR_CODE_KEY), ChartboostMediationError.CM_INITIALIZATION_FAILURE_TIMEOUT.getCode())) {
                str = IN_PROGRESS_GROUP_KEY;
            } else if (Intrinsics.a(jSONObject2.opt(HELIUM_ERROR_CODE_KEY), ChartboostMediationError.CM_INITIALIZATION_SKIPPED.getCode())) {
                str = SKIPPED_GROUP_KEY;
            }
            Object arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add(next);
        }
    }

    private final void putAll(JSONArray jSONArray, Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unsubscribe(PartnerInitializationResultsObserver observer) {
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a.j0()), null, null, new C09821(observer, null), 3);
    }

    public final void onResultsReceived(PartnerInitializationResultsData results) {
        Intrinsics.f(results, "results");
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a.j0()), null, null, new AnonymousClass1(results, null), 3);
    }

    public final void subscribe(PartnerInitializationResultsObserver observer) {
        Intrinsics.f(observer, "observer");
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a.j0()), null, null, new C09811(observer, null), 3);
    }
}

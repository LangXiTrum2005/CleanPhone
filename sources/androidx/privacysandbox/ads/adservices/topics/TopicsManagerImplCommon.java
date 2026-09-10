package androidx.privacysandbox.ads.adservices.topics;

import androidx.core.os.OutcomeReceiverKt;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "request", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "a", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class TopicsManagerImplCommon extends TopicsManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.adservices.topics.TopicsManager f7964a;

    public TopicsManagerImplCommon(android.adservices.topics.TopicsManager mTopicsManager) {
        Intrinsics.f(mTopicsManager, "mTopicsManager");
        this.f7964a = mTopicsManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object d(TopicsManagerImplCommon topicsManagerImplCommon, GetTopicsRequest getTopicsRequest, Continuation<? super GetTopicsResponse> continuation) throws Throwable {
        TopicsManagerImplCommon$getTopics$1 topicsManagerImplCommon$getTopics$1;
        if (continuation instanceof TopicsManagerImplCommon$getTopics$1) {
            topicsManagerImplCommon$getTopics$1 = (TopicsManagerImplCommon$getTopics$1) continuation;
            int i2 = topicsManagerImplCommon$getTopics$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                topicsManagerImplCommon$getTopics$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                topicsManagerImplCommon$getTopics$1 = new TopicsManagerImplCommon$getTopics$1(topicsManagerImplCommon, continuation);
            }
        } else {
            topicsManagerImplCommon$getTopics$1 = new TopicsManagerImplCommon$getTopics$1(topicsManagerImplCommon, continuation);
        }
        Object objP = topicsManagerImplCommon$getTopics$1.f7965Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = topicsManagerImplCommon$getTopics$1.e0;
        if (i3 == 0) {
            ResultKt.b(objP);
            android.adservices.topics.GetTopicsRequest getTopicsRequestB = topicsManagerImplCommon.b(getTopicsRequest);
            topicsManagerImplCommon$getTopics$1.X = topicsManagerImplCommon;
            topicsManagerImplCommon$getTopics$1.e0 = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(topicsManagerImplCommon$getTopics$1));
            cancellableContinuationImpl.q();
            topicsManagerImplCommon.f7964a.getTopics(getTopicsRequestB, new androidx.arch.core.executor.a(1), OutcomeReceiverKt.a(cancellableContinuationImpl));
            objP = cancellableContinuationImpl.p();
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            topicsManagerImplCommon = topicsManagerImplCommon$getTopics$1.X;
            ResultKt.b(objP);
        }
        return topicsManagerImplCommon.c(a.e(objP));
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManager
    public Object a(GetTopicsRequest getTopicsRequest, Continuation<? super GetTopicsResponse> continuation) {
        return d(this, getTopicsRequest, continuation);
    }

    public android.adservices.topics.GetTopicsRequest b(GetTopicsRequest request) {
        Intrinsics.f(request, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = androidx.privacysandbox.ads.adservices.customaudience.a.i().setAdsSdkName(MobileAds.ERROR_DOMAIN).build();
        Intrinsics.e(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public GetTopicsResponse c(android.adservices.topics.GetTopicsResponse response) {
        Intrinsics.f(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic topicM = androidx.privacysandbox.ads.adservices.customaudience.a.m(it.next());
            arrayList.add(new Topic(topicM.getTaxonomyVersion(), topicM.getModelVersion(), topicM.getTopicId()));
        }
        return new GetTopicsResponse(arrayList);
    }
}

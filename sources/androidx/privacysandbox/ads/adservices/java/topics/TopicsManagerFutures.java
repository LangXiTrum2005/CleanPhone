package androidx.privacysandbox.ads.adservices.java.topics;

import android.content.Context;
import androidx.media3.extractor.text.ttml.a;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.TopicsManager;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures;", "", "CommonApiJavaImpl", "Companion", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class TopicsManagerFutures {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures$CommonApiJavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures;", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "request", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "b", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CommonApiJavaImpl extends TopicsManagerFutures {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopicsManager f7951a;

        public CommonApiJavaImpl(TopicsManager topicsManager) {
            this.f7951a = topicsManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures
        public ListenableFuture<GetTopicsResponse> b(GetTopicsRequest request) {
            Intrinsics.f(request, "request");
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            return a.g(BuildersKt.a(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, new TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1(this, request, null), 3));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/TopicsManagerFutures$Companion;", "", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public static final TopicsManagerFutures a(Context context) {
        Intrinsics.f(context, "context");
        TopicsManager topicsManagerA = TopicsManager.Companion.a(context);
        if (topicsManagerA != null) {
            return new CommonApiJavaImpl(topicsManagerA);
        }
        return null;
    }

    public abstract ListenableFuture b(GetTopicsRequest getTopicsRequest);
}

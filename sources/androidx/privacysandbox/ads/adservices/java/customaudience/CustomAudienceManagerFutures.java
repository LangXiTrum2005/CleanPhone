package androidx.privacysandbox.ads.adservices.java.customaudience;

import androidx.media3.extractor.text.ttml.a;
import androidx.privacysandbox.ads.adservices.customaudience.FetchAndJoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures;", "", "Api33Ext4JavaImpl", "Companion", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CustomAudienceManagerFutures {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures$Api33Ext4JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures;", "Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;", "request", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "b", "(Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "a", "(Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;", "c", "(Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api33Ext4JavaImpl extends CustomAudienceManagerFutures {
        public ListenableFuture<Unit> a(FetchAndJoinCustomAudienceRequest request) {
            Intrinsics.f(request, "request");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f44752a), null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$fetchAndJoinCustomAudienceAsync$1(this, request, null), 3));
        }

        public ListenableFuture<Unit> b(JoinCustomAudienceRequest request) {
            Intrinsics.f(request, "request");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f44752a), null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1(this, request, null), 3));
        }

        public ListenableFuture<Unit> c(LeaveCustomAudienceRequest request) {
            Intrinsics.f(request, "request");
            return a.g(BuildersKt.a(CoroutineScopeKt.a(Dispatchers.f44752a), null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1(this, request, null), 3));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/customaudience/CustomAudienceManagerFutures$Companion;", "", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }
}

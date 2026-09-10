package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import androidx.privacysandbox.ads.adservices.internal.BackCompatManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class TopicsManager {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManager$Companion;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static TopicsManager a(final Context context) {
            Intrinsics.f(context, "context");
            if (AdServicesInfo.a() >= 11) {
                Object systemService = context.getSystemService((Class<Object>) androidx.privacysandbox.ads.adservices.customaudience.a.y());
                Intrinsics.e(systemService, "context.getSystemService…opicsManager::class.java)");
                return new TopicsManagerApi33Ext11Impl(androidx.privacysandbox.ads.adservices.customaudience.a.o(systemService));
            }
            if (AdServicesInfo.a() >= 5) {
                Object systemService2 = context.getSystemService((Class<Object>) androidx.privacysandbox.ads.adservices.customaudience.a.y());
                Intrinsics.e(systemService2, "context.getSystemService…opicsManager::class.java)");
                return new TopicsManagerApi33Ext5Impl(androidx.privacysandbox.ads.adservices.customaudience.a.o(systemService2));
            }
            if (AdServicesInfo.a() == 4) {
                Object systemService3 = context.getSystemService((Class<Object>) androidx.privacysandbox.ads.adservices.customaudience.a.y());
                Intrinsics.e(systemService3, "context.getSystemService…opicsManager::class.java)");
                return new TopicsManagerApi33Ext4Impl(androidx.privacysandbox.ads.adservices.customaudience.a.o(systemService3));
            }
            if (AdServicesInfo.b() >= 11) {
                return (TopicsManager) BackCompatManager.a(context, "TopicsManager", new Function1<Context, TopicsManagerApi31Ext11Impl>() { // from class: androidx.privacysandbox.ads.adservices.topics.TopicsManager$Companion$obtain$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context it = (Context) obj;
                        Intrinsics.f(it, "it");
                        Context context2 = context;
                        Intrinsics.f(context2, "context");
                        android.adservices.topics.TopicsManager topicsManager = android.adservices.topics.TopicsManager.get(context2);
                        Intrinsics.e(topicsManager, "get(context)");
                        return new TopicsManagerApi31Ext11Impl(topicsManager);
                    }
                });
            }
            if (AdServicesInfo.b() >= 9) {
                return (TopicsManager) BackCompatManager.a(context, "TopicsManager", new Function1<Context, TopicsManagerApi31Ext9Impl>() { // from class: androidx.privacysandbox.ads.adservices.topics.TopicsManager$Companion$obtain$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context it = (Context) obj;
                        Intrinsics.f(it, "it");
                        Context context2 = context;
                        Intrinsics.f(context2, "context");
                        android.adservices.topics.TopicsManager topicsManager = android.adservices.topics.TopicsManager.get(context2);
                        Intrinsics.e(topicsManager, "get(context)");
                        return new TopicsManagerApi31Ext9Impl(topicsManager);
                    }
                });
            }
            return null;
        }
    }

    public abstract Object a(GetTopicsRequest getTopicsRequest, Continuation continuation);
}

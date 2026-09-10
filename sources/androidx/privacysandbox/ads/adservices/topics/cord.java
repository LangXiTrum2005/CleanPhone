package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.content.Context;
import com.ironsource.Ie;
import com.vungle.ads.internal.ui.AdActivity;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TopicsManagerApi33Ext11Impl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0011¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/cord;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/privacysandbox/ads/adservices/topics/saneness;", AdActivity.REQUEST_KEY_EXTRA, "Landroid/adservices/topics/GetTopicsRequest;", "dern", "(Landroidx/privacysandbox/ads/adservices/topics/saneness;)Landroid/adservices/topics/GetTopicsRequest;", "Landroid/adservices/topics/GetTopicsResponse;", Ie.n, "Landroidx/privacysandbox/ads/adservices/topics/impromptu;", "wireman", "(Landroid/adservices/topics/GetTopicsResponse;)Landroidx/privacysandbox/ads/adservices/topics/impromptu;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class cord extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public cord(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) rotuma.attabal());
        Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…opicsManager::class.java)");
        super(preprohormone.attabal(systemService));
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public GetTopicsRequest dern(saneness request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return competently.f13148attabal.attabal(request);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public impromptu wireman(GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return molybdenite.f13154attabal.saneness(response);
    }
}

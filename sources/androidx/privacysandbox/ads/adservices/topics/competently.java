package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import com.vungle.ads.internal.ui.AdActivity;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GetTopicsRequestHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/competently;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/topics/saneness;", AdActivity.REQUEST_KEY_EXTRA, "Landroid/adservices/topics/GetTopicsRequest;", "attabal", "(Landroidx/privacysandbox/ads/adservices/topics/saneness;)Landroid/adservices/topics/GetTopicsRequest;", "saneness", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final competently f13148attabal = new competently();

    public final GetTopicsRequest attabal(saneness request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequest getTopicsRequestBuild = dern.attabal().setAdsSdkName(request.getAdsSdkName()).setShouldRecordObservation(request.getShouldRecordObservation()).build();
        Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }

    public final GetTopicsRequest saneness(saneness request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequest getTopicsRequestBuild = dern.attabal().setAdsSdkName(request.getAdsSdkName()).build();
        Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }
}

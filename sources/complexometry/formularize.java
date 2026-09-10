package complexometry;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Map;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\bH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000fR#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\"\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0006¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010\u0015R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0006¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b'\u0010\u0015R\u0019\u0010+\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b*\u0010\u000fR\u0019\u0010.\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b,\u0010\r\u001a\u0004\b-\u0010\u000fR\u0017\u00104\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lcomplexometry/formularize;", "", "Ljava/lang/Class;", "Lcom/google/android/gms/ads/mediation/MediationExtrasReceiver;", "adapterClass", "Landroid/os/Bundle;", "formularize", "(Ljava/lang/Class;)Landroid/os/Bundle;", "", "", "impassible", "()Ljava/util/Map;", "attabal", "Ljava/lang/String;", "triweekly", "()Ljava/lang/String;", "adUnitId", "", "saneness", "Ljava/util/Set;", "kowloon", "()Ljava/util/Set;", "categoryExclusions", "dern", "arytenoidectomy", "contentUrl", "wireman", "Ljava/util/Map;", "monoploid", "customTargeting", "marial", "Landroid/os/Bundle;", "polloi", "()Landroid/os/Bundle;", "googleExtrasBundle", "beachfront", "molybdenite", "keywords", "competently", "graveside", "neighboringContentUrls", "taiyuan", "dovishness", "publisherProvidedId", "cutely", "gintrap", "requestAgent", "", "apical", "J", "adultoid", "()J", "placementId", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public abstract class formularize {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public final long placementId;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final String adUnitId;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final Set keywords;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final Set neighboringContentUrls;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final String requestAgent;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final String contentUrl;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final Map f23998impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final Bundle googleExtrasBundle;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Set categoryExclusions;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final String publisherProvidedId;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final Map customTargeting;

    public formularize(String str, Set categoryExclusions, String str2, Map customTargeting, Bundle googleExtrasBundle, Set keywords, Set neighboringContentUrls, Map adSourceExtrasBundles, String str3, String str4, long j) {
        Intrinsics.checkNotNullParameter(categoryExclusions, "categoryExclusions");
        Intrinsics.checkNotNullParameter(customTargeting, "customTargeting");
        Intrinsics.checkNotNullParameter(googleExtrasBundle, "googleExtrasBundle");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        Intrinsics.checkNotNullParameter(neighboringContentUrls, "neighboringContentUrls");
        Intrinsics.checkNotNullParameter(adSourceExtrasBundles, "adSourceExtrasBundles");
        this.adUnitId = str;
        this.categoryExclusions = categoryExclusions;
        this.contentUrl = str2;
        this.customTargeting = customTargeting;
        this.googleExtrasBundle = googleExtrasBundle;
        this.keywords = keywords;
        this.neighboringContentUrls = neighboringContentUrls;
        this.f23998impromptu = adSourceExtrasBundles;
        this.publisherProvidedId = str3;
        this.requestAgent = str4;
        this.placementId = j;
    }

    /* JADX INFO: renamed from: adultoid, reason: from getter */
    public final long getPlacementId() {
        return this.placementId;
    }

    /* JADX INFO: renamed from: arytenoidectomy, reason: from getter */
    public final String getContentUrl() {
        return this.contentUrl;
    }

    /* JADX INFO: renamed from: dovishness, reason: from getter */
    public final String getPublisherProvidedId() {
        return this.publisherProvidedId;
    }

    public final Bundle formularize(Class<? extends MediationExtrasReceiver> adapterClass) {
        Intrinsics.checkNotNullParameter(adapterClass, "adapterClass");
        return Intrinsics.wireman(adapterClass, AdMobAdapter.class) ? this.googleExtrasBundle : (Bundle) this.f23998impromptu.get(adapterClass.getName());
    }

    /* JADX INFO: renamed from: gintrap, reason: from getter */
    public final String getRequestAgent() {
        return this.requestAgent;
    }

    public final Set<String> graveside() {
        return this.neighboringContentUrls;
    }

    public final Map<String, Bundle> impassible() {
        return this.f23998impromptu;
    }

    public final Set<String> kowloon() {
        return this.categoryExclusions;
    }

    public final Set<String> molybdenite() {
        return this.keywords;
    }

    public final Map<String, String> monoploid() {
        return this.customTargeting;
    }

    /* JADX INFO: renamed from: polloi, reason: from getter */
    public final Bundle getGoogleExtrasBundle() {
        return this.googleExtrasBundle;
    }

    /* JADX INFO: renamed from: triweekly, reason: from getter */
    public String getAdUnitId() {
        return this.adUnitId;
    }
}

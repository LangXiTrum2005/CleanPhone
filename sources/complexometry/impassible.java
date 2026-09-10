package complexometry;

import ads_mobile_sdk.kn0;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.ironsource.X3;
import complexometry.impassible;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002J\u0015\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\u0006J\u001b\u0010\u000f\u001a\u00028\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0006J\u0015\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcomplexometry/impassible;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "keyword", "dern", "(Ljava/lang/String;)Lcomplexometry/impassible;", X3.i.W, "value", "triweekly", "(Ljava/lang/String;Ljava/lang/String;)Lcomplexometry/impassible;", "contentUrl", "arytenoidectomy", "", "neighboringContentUrls", "polloi", "(Ljava/util/Set;)Lcomplexometry/impassible;", "categoryExclusion", "saneness", "Landroid/os/Bundle;", "extraBundle", "monoploid", "(Landroid/os/Bundle;)Lcomplexometry/impassible;", "publisherProvidedId", "molybdenite", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public abstract class impassible<T extends impassible<T>> {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public long f24010apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f24011attabal;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public String f24014cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public String f24015dern;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public String f24019taiyuan;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final LinkedHashSet f24018saneness = new LinkedHashSet();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final LinkedHashMap f24020wireman = new LinkedHashMap();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public Bundle f24017marial = new Bundle();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final HashSet f24012beachfront = new HashSet();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final HashSet f24013competently = new HashSet();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final LinkedHashMap f24016impromptu = new LinkedHashMap();

    public impassible(String str) {
        this.f24011attabal = str;
    }

    /* JADX INFO: renamed from: apical, reason: from getter */
    public final long getF24010apical() {
        return this.f24010apical;
    }

    public final T arytenoidectomy(String contentUrl) {
        Intrinsics.checkNotNullParameter(contentUrl, "contentUrl");
        if (contentUrl.length() <= 0) {
            throw new IllegalArgumentException("Content URL must be non-empty.");
        }
        this.f24015dern = contentUrl;
        return (T) kowloon();
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final LinkedHashMap getF24016impromptu() {
        return this.f24016impromptu;
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final String getF24015dern() {
        return this.f24015dern;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final LinkedHashMap getF24020wireman() {
        return this.f24020wireman;
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final HashSet getF24013competently() {
        return this.f24013competently;
    }

    public final T dern(String keyword) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        this.f24012beachfront.add(keyword);
        return (T) kowloon();
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final String getF24019taiyuan() {
        return this.f24019taiyuan;
    }

    /* JADX INFO: renamed from: impassible, reason: from getter */
    public final String getF24014cutely() {
        return this.f24014cutely;
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final Bundle getF24017marial() {
        return this.f24017marial;
    }

    public abstract impassible kowloon();

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final LinkedHashSet getF24018saneness() {
        return this.f24018saneness;
    }

    public final T molybdenite(String publisherProvidedId) {
        Intrinsics.checkNotNullParameter(publisherProvidedId, "publisherProvidedId");
        this.f24019taiyuan = publisherProvidedId;
        return (T) kowloon();
    }

    public final T monoploid(Bundle extraBundle) {
        Intrinsics.checkNotNullParameter(extraBundle, "extraBundle");
        if (Build.VERSION.SDK_INT >= 26) {
            extraBundle = extraBundle.deepCopy();
            Intrinsics.beachfront(extraBundle);
        }
        this.f24017marial = extraBundle;
        return (T) kowloon();
    }

    public final T polloi(Set<String> neighboringContentUrls) {
        Intrinsics.checkNotNullParameter(neighboringContentUrls, "neighboringContentUrls");
        this.f24013competently.clear();
        for (String str : neighboringContentUrls) {
            if (str.length() == 0) {
                kn0.c("Neighboring content URL should not be empty.", null);
            } else {
                this.f24013competently.add(str);
            }
        }
        return (T) kowloon();
    }

    public final T saneness(String categoryExclusion) {
        Intrinsics.checkNotNullParameter(categoryExclusion, "categoryExclusion");
        this.f24018saneness.add(categoryExclusion);
        return (T) kowloon();
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final HashSet getF24012beachfront() {
        return this.f24012beachfront;
    }

    public final T triweekly(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f24020wireman.put(key, value);
        return (T) kowloon();
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final String getF24011attabal() {
        return this.f24011attabal;
    }
}

package canephora;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3414a2;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: canephora.beachfront, reason: from toString */
/* JADX INFO: compiled from: UserAttributesConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018\"\u0004\b\u001c\u0010\u001aR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001e\u0010\u001aR(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b \u0010\u001aR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcanephora/beachfront;", "", "", "", "gpStoreSource", "gpUtmSource", "gpUtmSourceProbability", "", "limitLabels", "Lcanephora/competently;", "userLabel", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcanephora/competently;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljava/util/List;", "getGpStoreSource", "()Ljava/util/List;", "setGpStoreSource", "(Ljava/util/List;)V", "saneness", "setGpUtmSource", "dern", "setGpUtmSourceProbability", "wireman", "setLimitLabels", "marial", "Lcanephora/competently;", "()Lcanephora/competently;", "setUserLabel", "(Lcanephora/competently;)V", "referrerlibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UserAttributesConfig {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("gp_store_source")
    private List<String> gpStoreSource;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("gp_utm_source_probability")
    private List<String> gpUtmSourceProbability;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("user_label")
    private UserLabel userLabel;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("gp_utm_source")
    private List<String> gpUtmSource;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("ad_limit_label")
    private List<Integer> limitLabels;

    public UserAttributesConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public final List<String> attabal() {
        return this.gpUtmSource;
    }

    public final List<Integer> dern() {
        return this.limitLabels;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAttributesConfig)) {
            return false;
        }
        UserAttributesConfig userAttributesConfig = (UserAttributesConfig) other;
        return Intrinsics.wireman(this.gpStoreSource, userAttributesConfig.gpStoreSource) && Intrinsics.wireman(this.gpUtmSource, userAttributesConfig.gpUtmSource) && Intrinsics.wireman(this.gpUtmSourceProbability, userAttributesConfig.gpUtmSourceProbability) && Intrinsics.wireman(this.limitLabels, userAttributesConfig.limitLabels) && Intrinsics.wireman(this.userLabel, userAttributesConfig.userLabel);
    }

    public int hashCode() {
        return (((((((this.gpStoreSource.hashCode() * 31) + this.gpUtmSource.hashCode()) * 31) + this.gpUtmSourceProbability.hashCode()) * 31) + this.limitLabels.hashCode()) * 31) + this.userLabel.hashCode();
    }

    public final List<String> saneness() {
        return this.gpUtmSourceProbability;
    }

    public String toString() {
        return "UserAttributesConfig(gpStoreSource=" + this.gpStoreSource + ", gpUtmSource=" + this.gpUtmSource + ", gpUtmSourceProbability=" + this.gpUtmSourceProbability + ", limitLabels=" + this.limitLabels + ", userLabel=" + this.userLabel + ')';
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final UserLabel getUserLabel() {
        return this.userLabel;
    }

    public UserAttributesConfig(List<String> gpStoreSource, List<String> gpUtmSource, List<String> gpUtmSourceProbability, List<Integer> limitLabels, UserLabel userLabel) {
        Intrinsics.checkNotNullParameter(gpStoreSource, "gpStoreSource");
        Intrinsics.checkNotNullParameter(gpUtmSource, "gpUtmSource");
        Intrinsics.checkNotNullParameter(gpUtmSourceProbability, "gpUtmSourceProbability");
        Intrinsics.checkNotNullParameter(limitLabels, "limitLabels");
        Intrinsics.checkNotNullParameter(userLabel, "userLabel");
        this.gpStoreSource = gpStoreSource;
        this.gpUtmSource = gpUtmSource;
        this.gpUtmSourceProbability = gpUtmSourceProbability;
        this.limitLabels = limitLabels;
        this.userLabel = userLabel;
    }

    public /* synthetic */ UserAttributesConfig(List list, List list2, List list3, List list4, UserLabel competentlyVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? adultoid.formularize() : list, (i & 2) != 0 ? adultoid.formularize() : list2, (i & 4) != 0 ? adultoid.formularize() : list3, (i & 8) != 0 ? adultoid.formularize() : list4, (i & 16) != 0 ? new UserLabel(null, null, null, null, 15, null) : competentlyVar);
    }
}

package cyclery;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3414a2;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cyclery.attabal, reason: from toString */
/* JADX INFO: compiled from: RegisterTokenReq.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\rR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\r¨\u0006$"}, d2 = {"Lcyclery/attabal;", "", "", "registerToken", "", "topics", "language", "country", "timezone", "timeOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljava/lang/String;", "getRegisterToken", "saneness", "Ljava/util/List;", "getTopics", "()Ljava/util/List;", "dern", "getLanguage", "wireman", "getCountry", "marial", "getTimezone", "beachfront", "getTimeOffset", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RegisterTokenReq {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("registration_token")
    private final String registerToken;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("time_offset")
    private final String timeOffset;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("language")
    private final String language;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("timezone")
    private final String timezone;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("topic_ids")
    private final List<String> topics;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("country")
    private final String country;

    public RegisterTokenReq() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterTokenReq)) {
            return false;
        }
        RegisterTokenReq registerTokenReq = (RegisterTokenReq) other;
        return Intrinsics.wireman(this.registerToken, registerTokenReq.registerToken) && Intrinsics.wireman(this.topics, registerTokenReq.topics) && Intrinsics.wireman(this.language, registerTokenReq.language) && Intrinsics.wireman(this.country, registerTokenReq.country) && Intrinsics.wireman(this.timezone, registerTokenReq.timezone) && Intrinsics.wireman(this.timeOffset, registerTokenReq.timeOffset);
    }

    public int hashCode() {
        return (((((((((this.registerToken.hashCode() * 31) + this.topics.hashCode()) * 31) + this.language.hashCode()) * 31) + this.country.hashCode()) * 31) + this.timezone.hashCode()) * 31) + this.timeOffset.hashCode();
    }

    public String toString() {
        return "RegisterTokenReq(registerToken=" + this.registerToken + ", topics=" + this.topics + ", language=" + this.language + ", country=" + this.country + ", timezone=" + this.timezone + ", timeOffset=" + this.timeOffset + ")";
    }

    public RegisterTokenReq(String registerToken, List<String> topics, String language, String country, String timezone, String timeOffset) {
        Intrinsics.checkNotNullParameter(registerToken, "registerToken");
        Intrinsics.checkNotNullParameter(topics, "topics");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(timeOffset, "timeOffset");
        this.registerToken = registerToken;
        this.topics = topics;
        this.language = language;
        this.country = country;
        this.timezone = timezone;
        this.timeOffset = timeOffset;
    }

    public /* synthetic */ RegisterTokenReq(String str, List list, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? adultoid.formularize() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }
}

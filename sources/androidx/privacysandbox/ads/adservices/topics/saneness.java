package androidx.privacysandbox.ads.adservices.topics;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GetTopicsRequest.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/saneness;", "", "", "adsSdkName", "", "shouldRecordObservation", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "attabal", "Ljava/lang/String;", "saneness", "Z", "()Z", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final String adsSdkName;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean shouldRecordObservation;

    /* JADX INFO: compiled from: GetTopicsRequest.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/saneness$attabal;", "", "<init>", "()V", "", "adsSdkName", "saneness", "(Ljava/lang/String;)Landroidx/privacysandbox/ads/adservices/topics/saneness$attabal;", "", "shouldRecordObservation", "dern", "(Z)Landroidx/privacysandbox/ads/adservices/topics/saneness$attabal;", "Landroidx/privacysandbox/ads/adservices/topics/saneness;", "attabal", "()Landroidx/privacysandbox/ads/adservices/topics/saneness;", "Ljava/lang/String;", "Z", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public String adsSdkName = "";

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public boolean shouldRecordObservation = true;

        public final saneness attabal() {
            return new saneness(this.adsSdkName, this.shouldRecordObservation);
        }

        public final attabal dern(boolean shouldRecordObservation) {
            this.shouldRecordObservation = shouldRecordObservation;
            return this;
        }

        public final attabal saneness(String adsSdkName) {
            Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
            if (adsSdkName.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set");
            }
            this.adsSdkName = adsSdkName;
            return this;
        }
    }

    public saneness(String adsSdkName, boolean z) {
        Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
        this.adsSdkName = adsSdkName;
        this.shouldRecordObservation = z;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final String getAdsSdkName() {
        return this.adsSdkName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof saneness)) {
            return false;
        }
        saneness sanenessVar = (saneness) other;
        return Intrinsics.wireman(this.adsSdkName, sanenessVar.adsSdkName) && this.shouldRecordObservation == sanenessVar.shouldRecordObservation;
    }

    public int hashCode() {
        return (this.adsSdkName.hashCode() * 31) + Boolean.hashCode(this.shouldRecordObservation);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final boolean getShouldRecordObservation() {
        return this.shouldRecordObservation;
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.adsSdkName + ", shouldRecordObservation=" + this.shouldRecordObservation;
    }
}

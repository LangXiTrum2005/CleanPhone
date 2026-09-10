package ballistician;

import com.ironsource.C3414a2;
import com.ironsource.sdk.controller.f;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ballistician.attabal, reason: from toString */
/* JADX INFO: compiled from: PreloadInfoMap.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lballistician/attabal;", "", "", f.b.c, "adScenes", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljava/lang/String;", "setAdId", "(Ljava/lang/String;)V", "saneness", "setAdScenes", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PreloadInfo {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public String adId;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public String adScenes;

    public PreloadInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final String getAdId() {
        return this.adId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreloadInfo)) {
            return false;
        }
        PreloadInfo preloadInfo = (PreloadInfo) other;
        return Intrinsics.wireman(this.adId, preloadInfo.adId) && Intrinsics.wireman(this.adScenes, preloadInfo.adScenes);
    }

    public int hashCode() {
        return (this.adId.hashCode() * 31) + this.adScenes.hashCode();
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final String getAdScenes() {
        return this.adScenes;
    }

    public String toString() {
        return "PreloadInfo(adId=" + this.adId + ", adScenes=" + this.adScenes + ")";
    }

    public PreloadInfo(String adId, String adScenes) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adScenes, "adScenes");
        this.adId = adId;
        this.adScenes = adScenes;
    }

    public /* synthetic */ PreloadInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}

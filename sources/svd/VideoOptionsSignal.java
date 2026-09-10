package svd;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;

/* JADX INFO: renamed from: svd.monoploid, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lsvd/monoploid;", "", "", "attabal", "Z", "startMuted", "saneness", "clickToExpandRequested", "dern", "customControlsRequested", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class VideoOptionsSignal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("startMuted")
    public boolean startMuted;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("customControlsRequested")
    public boolean customControlsRequested;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("clickToExpandRequested")
    public boolean clickToExpandRequested;

    public VideoOptionsSignal() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoOptionsSignal)) {
            return false;
        }
        VideoOptionsSignal videoOptionsSignal = (VideoOptionsSignal) obj;
        return this.startMuted == videoOptionsSignal.startMuted && this.clickToExpandRequested == videoOptionsSignal.clickToExpandRequested && this.customControlsRequested == videoOptionsSignal.customControlsRequested;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        boolean z = this.startMuted;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.clickToExpandRequested;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.customControlsRequested;
        return i2 + (z3 ? 1 : z3);
    }

    public final String toString() {
        return "VideoOptionsSignal(startMuted=" + this.startMuted + ", clickToExpandRequested=" + this.clickToExpandRequested + ", customControlsRequested=" + this.customControlsRequested + ")";
    }

    public VideoOptionsSignal(boolean z, boolean z2, boolean z3) {
        this.startMuted = z;
        this.clickToExpandRequested = z2;
        this.customControlsRequested = z3;
    }

    public /* synthetic */ VideoOptionsSignal(int i) {
        this(true, false, false);
    }
}

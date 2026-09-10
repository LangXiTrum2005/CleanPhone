package svd;

import com.google.gson.annotations.SerializedName;
import p002kotlin.Metadata;
import saneness.bonny;

/* JADX INFO: renamed from: svd.attabal, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lsvd/attabal;", "", "", "attabal", "I", "width", "saneness", "height", "", "dern", "Z", "isFluid", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AdSizeBundle {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("width")
    public final int width;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("is_fluid_height")
    public final boolean isFluid;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("height")
    public final int height;

    public AdSizeBundle(int i, int i2, boolean z) {
        this.width = i;
        this.height = i2;
        this.isFluid = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSizeBundle)) {
            return false;
        }
        AdSizeBundle adSizeBundle = (AdSizeBundle) obj;
        return this.width == adSizeBundle.width && this.height == adSizeBundle.height && this.isFluid == adSizeBundle.isFluid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iAttabal = bonny.attabal(this.height, Integer.hashCode(this.width) * 31, 31);
        boolean z = this.isFluid;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iAttabal + r1;
    }

    public final String toString() {
        return "AdSizeBundle(width=" + this.width + ", height=" + this.height + ", isFluid=" + this.isFluid + ")";
    }
}

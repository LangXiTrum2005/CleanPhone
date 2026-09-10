package chinny;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: compiled from: AdjustedCornerSize.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final wireman f15546attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final float f15547saneness;

    public saneness(float f, wireman wiremanVar) {
        while (wiremanVar instanceof saneness) {
            wiremanVar = ((saneness) wiremanVar).f15546attabal;
            f += ((saneness) wiremanVar).f15547saneness;
        }
        this.f15546attabal = wiremanVar;
        this.f15547saneness = f;
    }

    @Override // chinny.wireman
    public float attabal(RectF rectF) {
        return Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f15546attabal.attabal(rectF) + this.f15547saneness);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof saneness)) {
            return false;
        }
        saneness sanenessVar = (saneness) obj;
        return this.f15546attabal.equals(sanenessVar.f15546attabal) && this.f15547saneness == sanenessVar.f15547saneness;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15546attabal, Float.valueOf(this.f15547saneness)});
    }
}

package chinny;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: compiled from: ClampedCornerSize.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final float f15460attabal;

    public dern(float f) {
        this.f15460attabal = f;
    }

    public static float dern(RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    public static dern saneness(attabal attabalVar) {
        return new dern(attabalVar.saneness());
    }

    @Override // chinny.wireman
    public float attabal(RectF rectF) {
        return achondroplasia.attabal.attabal(this.f15460attabal, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, dern(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dern) && this.f15460attabal == ((dern) obj).f15460attabal;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15460attabal)});
    }
}

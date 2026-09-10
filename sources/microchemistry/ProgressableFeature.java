package microchemistry;

import androidx.core.app.NotificationCompat;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: microchemistry.molybdenite, reason: from toString */
/* JADX INFO: compiled from: FeatureMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lmicrochemistry/molybdenite;", "", "", NotificationCompat.CATEGORY_PROGRESS, "Lmicrochemistry/competently;", "feature", "<init>", "(FLmicrochemistry/competently;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "F", "saneness", "()F", "Lmicrochemistry/competently;", "()Lmicrochemistry/competently;", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ProgressableFeature {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final float progress;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final competently feature;

    public ProgressableFeature(float f, competently feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.progress = f;
        this.feature = feature;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final competently getFeature() {
        return this.feature;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressableFeature)) {
            return false;
        }
        ProgressableFeature progressableFeature = (ProgressableFeature) other;
        return Float.compare(this.progress, progressableFeature.progress) == 0 && Intrinsics.wireman(this.feature, progressableFeature.feature);
    }

    public int hashCode() {
        return (Float.hashCode(this.progress) * 31) + this.feature.hashCode();
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    public String toString() {
        return "ProgressableFeature(progress=" + this.progress + ", feature=" + this.feature + ')';
    }
}

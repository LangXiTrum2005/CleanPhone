package treadless;

import com.ironsource.C3414a2;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FontScaleConverterTable.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\tB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u0018¨\u0006!"}, d2 = {"Ltreadless/dern;", "Ltreadless/attabal;", "", "fromSp", "toDp", "<init>", "([F[F)V", "", "sp", "attabal", "(F)F", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "[F", "getMFromSpValues", "()[F", "getMFromSpValues$annotations", "()V", "mFromSpValues", "saneness", "getMToDpValues", "getMToDpValues$annotations", "mToDpValues", "dern", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class dern implements attabal {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f38980wireman = 8;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final float[] mFromSpValues;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final float[] toDpValues;

    /* JADX INFO: renamed from: treadless.dern$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FontScaleConverterTable.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltreadless/dern$attabal;", "", "<init>", "()V", "", "sourceValue", "", "sourceValues", "targetValues", "saneness", "(F[F[F)F", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float saneness(float sourceValue, float[] sourceValues, float[] targetValues) {
            float f;
            float f2;
            float f3;
            float fAttabal;
            float fAbs = Math.abs(sourceValue);
            float fSignum = Math.signum(sourceValue);
            int iBinarySearch = Arrays.binarySearch(sourceValues, fAbs);
            if (iBinarySearch >= 0) {
                fAttabal = targetValues[iBinarySearch];
            } else {
                int i = -(iBinarySearch + 1);
                int i2 = i - 1;
                int length = sourceValues.length - 1;
                float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (i2 >= length) {
                    float f5 = sourceValues[sourceValues.length - 1];
                    return f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : sourceValue * (targetValues[sourceValues.length - 1] / f5);
                }
                if (i2 == -1) {
                    f = sourceValues[0];
                    f3 = targetValues[0];
                    f2 = 0.0f;
                } else {
                    f4 = sourceValues[i2];
                    f = sourceValues[i];
                    f2 = targetValues[i2];
                    f3 = targetValues[i];
                }
                fAttabal = wireman.f38988attabal.attabal(f2, f3, f4, f, fAbs);
            }
            return fSignum * fAttabal;
        }

        public Companion() {
        }
    }

    public dern(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.mFromSpValues = fArr;
        this.toDpValues = fArr2;
    }

    @Override // treadless.attabal
    public float attabal(float sp) {
        return INSTANCE.saneness(sp, this.mFromSpValues, this.toDpValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof dern)) {
            return false;
        }
        dern dernVar = (dern) other;
        return Arrays.equals(this.mFromSpValues, dernVar.mFromSpValues) && Arrays.equals(this.toDpValues, dernVar.toDpValues);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.mFromSpValues) * 31) + Arrays.hashCode(this.toDpValues);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.mFromSpValues);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.toDpValues);
        Intrinsics.checkNotNullExpressionValue(string2, "toString(this)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}

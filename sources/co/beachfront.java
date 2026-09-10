package co;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "that", "Lco/saneness;", "saneness", "(FF)Lco/saneness;", "", "isPositive", "", "step", "", "attabal", "(ZLjava/lang/Number;)V", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
public class beachfront {
    public static final void attabal(boolean z, Number step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    public static saneness<Float> saneness(float f, float f2) {
        return new attabal(f, f2);
    }
}

package kotlin.reflect;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class KTypeProjection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KTypeProjection f43351c = new KTypeProjection(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KVariance f43352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KType f43353b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static KTypeProjection a(KType type) {
            Intrinsics.f(type, "type");
            return new KTypeProjection(KVariance.X, type);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43354a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.X;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.X;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.X;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43354a = iArr;
        }
    }

    public KTypeProjection(KVariance kVariance, KType kType) {
        String str;
        this.f43352a = kVariance;
        this.f43353b = kType;
        if ((kVariance == null) == (kType == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.f43352a == kTypeProjection.f43352a && Intrinsics.a(this.f43353b, kTypeProjection.f43353b);
    }

    public final int hashCode() {
        KVariance kVariance = this.f43352a;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        KType kType = this.f43353b;
        return iHashCode + (kType != null ? kType.hashCode() : 0);
    }

    public final String toString() {
        KVariance kVariance = this.f43352a;
        int i2 = kVariance == null ? -1 : WhenMappings.f43354a[kVariance.ordinal()];
        if (i2 == -1) {
            return "*";
        }
        KType kType = this.f43353b;
        if (i2 == 1) {
            return String.valueOf(kType);
        }
        if (i2 == 2) {
            return "in " + kType;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + kType;
    }
}

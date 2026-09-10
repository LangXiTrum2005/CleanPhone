package restrictive;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TransformOrigin.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087@\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\r"}, d2 = {"Lrestrictive/picketboat;", "", "", "packedValue", "saneness", "(J)J", "", "wireman", "(J)F", "pivotFractionX", "marial", "pivotFractionY", "attabal", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class picketboat {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final long f36294saneness = palmyra.attabal(0.5f, 0.5f);

    /* JADX INFO: renamed from: restrictive.picketboat$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TransformOrigin.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Lrestrictive/picketboat$attabal;", "", "<init>", "()V", "Lrestrictive/picketboat;", "Center", "J", "attabal", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long attabal() {
            return picketboat.f36294saneness;
        }

        public Companion() {
        }
    }

    public static final boolean dern(long j, long j2) {
        return j == j2;
    }

    public static final float marial(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float wireman(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static long saneness(long j) {
        return j;
    }
}

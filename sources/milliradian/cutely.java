package milliradian;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u000b\u001a\u00020\u00068FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00068FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lmilliradian/cutely;", "", "", "packedValue", "saneness", "(J)J", "Lmilliradian/impromptu;", "wireman", "(J)F", "getWidth-D9Ej5fM$annotations", "()V", "width", "dern", "getHeight-D9Ej5fM$annotations", "height", "attabal", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final long f33462saneness = saneness(0);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final long f33461dern = saneness(9205357640488583168L);

    /* JADX INFO: renamed from: milliradian.cutely$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Dp.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Lmilliradian/cutely$attabal;", "", "<init>", "()V", "Lmilliradian/cutely;", "Zero", "J", "attabal", "()J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long attabal() {
            return cutely.f33462saneness;
        }

        public Companion() {
        }
    }

    public static final float dern(long j) {
        return impromptu.wireman(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final float wireman(long j) {
        return impromptu.wireman(Float.intBitsToFloat((int) (j >> 32)));
    }

    public static long saneness(long j) {
        return j;
    }
}

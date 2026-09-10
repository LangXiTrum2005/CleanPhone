package androidx.compose.ui.graphics.colorspace;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ColorModel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/saneness;", "", "", "packedValue", "wireman", "(J)J", "", "impromptu", "(J)Ljava/lang/String;", "", "competently", "(J)I", "beachfront", "getComponentCount$annotations", "()V", "componentCount", "attabal", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final long f6563dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final long f6564marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final long f6565saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final long f6566wireman;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.saneness$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ColorModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/saneness$attabal;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/saneness;", "Rgb", "J", "saneness", "()J", "Xyz", "dern", "Lab", "attabal", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long attabal() {
            return saneness.f6566wireman;
        }

        public final long dern() {
            return saneness.f6563dern;
        }

        public final long saneness() {
            return saneness.f6565saneness;
        }

        public Companion() {
        }
    }

    static {
        long j = 3;
        long j2 = j << 32;
        f6565saneness = wireman((((long) 0) & 4294967295L) | j2);
        f6563dern = wireman((((long) 1) & 4294967295L) | j2);
        f6566wireman = wireman(j2 | (((long) 2) & 4294967295L));
        f6564marial = wireman((j & 4294967295L) | (((long) 4) << 32));
    }

    public static final int beachfront(long j) {
        return (int) (j >> 32);
    }

    public static int competently(long j) {
        return Long.hashCode(j);
    }

    public static String impromptu(long j) {
        if (marial(j, f6565saneness)) {
            return "Rgb";
        }
        if (marial(j, f6563dern)) {
            return "Xyz";
        }
        if (marial(j, f6566wireman)) {
            return "Lab";
        }
        return marial(j, f6564marial) ? "Cmyk" : "Unknown";
    }

    public static final boolean marial(long j, long j2) {
        return j == j2;
    }

    public static long wireman(long j) {
        return j;
    }
}

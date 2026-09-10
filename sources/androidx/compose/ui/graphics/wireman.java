package androidx.compose.ui.graphics;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PathFillType.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/wireman;", "", "", "value", "saneness", "(I)I", "", "beachfront", "(I)Ljava/lang/String;", "marial", C3414a2.d, "", "dern", "(ILjava/lang/Object;)Z", "I", "attabal", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class wireman {
    private final int value;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int f6722saneness = saneness(0);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f6721dern = saneness(1);

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.wireman$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PathFillType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/wireman$attabal;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/wireman;", "NonZero", "I", "attabal", "()I", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int attabal() {
            return wireman.f6722saneness;
        }

        public Companion() {
        }
    }

    public static String beachfront(int i) {
        if (wireman(i, f6722saneness)) {
            return "NonZero";
        }
        return wireman(i, f6721dern) ? "EvenOdd" : "Unknown";
    }

    public static boolean dern(int i, Object obj) {
        return (obj instanceof wireman) && i == ((wireman) obj).getValue();
    }

    public static int marial(int i) {
        return Integer.hashCode(i);
    }

    public static final boolean wireman(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return dern(this.value, obj);
    }

    public int hashCode() {
        return marial(this.value);
    }

    public String toString() {
        return beachfront(this.value);
    }

    public static int saneness(int i) {
        return i;
    }
}

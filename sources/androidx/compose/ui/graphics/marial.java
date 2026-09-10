package androidx.compose.ui.graphics;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PathOperation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/marial;", "", "", "value", "marial", "(I)I", "", "taiyuan", "(I)Ljava/lang/String;", "impromptu", C3414a2.d, "", "beachfront", "(ILjava/lang/Object;)Z", "I", "attabal", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class marial {
    private final int value;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int f6717saneness = marial(0);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f6715dern = marial(1);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f6718wireman = marial(2);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int f6716marial = marial(3);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final int f6714beachfront = marial(4);

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.marial$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PathOperation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/marial$attabal;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/marial;", "Difference", "I", "attabal", "()I", "Intersect", "saneness", "Union", "wireman", "ReverseDifference", "dern", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int attabal() {
            return marial.f6717saneness;
        }

        public final int dern() {
            return marial.f6714beachfront;
        }

        public final int saneness() {
            return marial.f6715dern;
        }

        public final int wireman() {
            return marial.f6718wireman;
        }

        public Companion() {
        }
    }

    public static boolean beachfront(int i, Object obj) {
        return (obj instanceof marial) && i == ((marial) obj).getValue();
    }

    public static final boolean competently(int i, int i2) {
        return i == i2;
    }

    public static int impromptu(int i) {
        return Integer.hashCode(i);
    }

    public static String taiyuan(int i) {
        if (competently(i, f6717saneness)) {
            return "Difference";
        }
        if (competently(i, f6715dern)) {
            return "Intersect";
        }
        if (competently(i, f6718wireman)) {
            return "Union";
        }
        if (competently(i, f6716marial)) {
            return "Xor";
        }
        return competently(i, f6714beachfront) ? "ReverseDifference" : "Unknown";
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return beachfront(this.value, obj);
    }

    public int hashCode() {
        return impromptu(this.value);
    }

    public String toString() {
        return taiyuan(this.value);
    }

    public static int marial(int i) {
        return i;
    }
}

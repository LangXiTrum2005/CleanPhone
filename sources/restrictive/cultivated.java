package restrictive;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FilterQuality.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Lrestrictive/cultivated;", "", "", "value", "dern", "(I)I", "", "competently", "(I)Ljava/lang/String;", "beachfront", C3414a2.d, "", "wireman", "(ILjava/lang/Object;)Z", "I", "getValue", "()I", "attabal", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class cultivated {
    private final int value;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int f36248saneness = dern(0);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f36246dern = dern(1);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f36249wireman = dern(2);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int f36247marial = dern(3);

    /* JADX INFO: renamed from: restrictive.cultivated$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FilterQuality.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lrestrictive/cultivated$attabal;", "", "<init>", "()V", "Lrestrictive/cultivated;", "None", "I", "saneness", "()I", "Low", "attabal", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int attabal() {
            return cultivated.f36246dern;
        }

        public final int saneness() {
            return cultivated.f36248saneness;
        }

        public Companion() {
        }
    }

    public static int beachfront(int i) {
        return Integer.hashCode(i);
    }

    public static String competently(int i) {
        if (marial(i, f36248saneness)) {
            return "None";
        }
        if (marial(i, f36246dern)) {
            return "Low";
        }
        if (marial(i, f36249wireman)) {
            return "Medium";
        }
        return marial(i, f36247marial) ? "High" : "Unknown";
    }

    public static final boolean marial(int i, int i2) {
        return i == i2;
    }

    public static boolean wireman(int i, Object obj) {
        return (obj instanceof cultivated) && i == ((cultivated) obj).getValue();
    }

    public boolean equals(Object obj) {
        return wireman(this.value, obj);
    }

    public int hashCode() {
        return beachfront(this.value);
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return competently(this.value);
    }

    public static int dern(int i) {
        return i;
    }
}

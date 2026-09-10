package timberyard;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TextAlign.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0010"}, d2 = {"Ltimberyard/competently;", "", "", "value", "dern", "(I)I", "", "competently", "(I)Ljava/lang/String;", "beachfront", C3414a2.d, "", "wireman", "(ILjava/lang/Object;)Z", "I", "attabal", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class competently {
    private final int value;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int f38839saneness = dern(1);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f38836dern = dern(2);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f38840wireman = dern(3);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int f38838marial = dern(4);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final int f38834beachfront = dern(5);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final int f38835competently = dern(6);

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final int f38837impromptu = dern(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: timberyard.competently$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextAlign.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Ltimberyard/competently$attabal;", "", "<init>", "()V", "Ltimberyard/competently;", "Unspecified", "I", "attabal", "()I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int attabal() {
            return competently.f38837impromptu;
        }

        public Companion() {
        }
    }

    public /* synthetic */ competently(int i) {
        this.value = i;
    }

    public static int beachfront(int i) {
        return Integer.hashCode(i);
    }

    public static String competently(int i) {
        if (marial(i, f38839saneness)) {
            return "Left";
        }
        if (marial(i, f38836dern)) {
            return "Right";
        }
        if (marial(i, f38840wireman)) {
            return "Center";
        }
        if (marial(i, f38838marial)) {
            return "Justify";
        }
        if (marial(i, f38834beachfront)) {
            return "Start";
        }
        if (marial(i, f38835competently)) {
            return "End";
        }
        return marial(i, f38837impromptu) ? "Unspecified" : "Invalid";
    }

    public static final boolean marial(int i, int i2) {
        return i == i2;
    }

    public static final /* synthetic */ competently saneness(int i) {
        return new competently(i);
    }

    public static boolean wireman(int i, Object obj) {
        return (obj instanceof competently) && i == ((competently) obj).getValue();
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

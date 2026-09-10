package starveling;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0010"}, d2 = {"Lstarveling/oilcan;", "", "", "value", "beachfront", "(I)I", "", "cutely", "(I)Ljava/lang/String;", "taiyuan", C3414a2.d, "", "competently", "(ILjava/lang/Object;)Z", "I", "attabal", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class oilcan {
    private final int value;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int f38135saneness = beachfront(0);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f38133dern = beachfront(1);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f38136wireman = beachfront(2);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int f38134marial = beachfront(3);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final int f38132beachfront = beachfront(4);

    /* JADX INFO: renamed from: starveling.oilcan$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PointerEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lstarveling/oilcan$attabal;", "", "<init>", "()V", "Lstarveling/oilcan;", "Unknown", "I", "marial", "()I", "Touch", "wireman", "Mouse", "saneness", "Stylus", "dern", "Eraser", "attabal", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int attabal() {
            return oilcan.f38132beachfront;
        }

        public final int dern() {
            return oilcan.f38134marial;
        }

        public final int marial() {
            return oilcan.f38135saneness;
        }

        public final int saneness() {
            return oilcan.f38136wireman;
        }

        public final int wireman() {
            return oilcan.f38133dern;
        }

        public Companion() {
        }
    }

    public static boolean competently(int i, Object obj) {
        return (obj instanceof oilcan) && i == ((oilcan) obj).getValue();
    }

    public static String cutely(int i) {
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Mouse";
        }
        if (i != 3) {
            return i != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }

    public static final boolean impromptu(int i, int i2) {
        return i == i2;
    }

    public static int taiyuan(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: apical, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return competently(this.value, obj);
    }

    public int hashCode() {
        return taiyuan(this.value);
    }

    public String toString() {
        return cutely(this.value);
    }

    public static int beachfront(int i) {
        return i;
    }
}

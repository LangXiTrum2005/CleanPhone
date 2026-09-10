package androidx.compose.ui.text.input;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ImeAction.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/input/kowloon;", "", "", "value", "cutely", "(I)I", "", "triweekly", "(I)Ljava/lang/String;", "impassible", C3414a2.d, "", "apical", "(ILjava/lang/Object;)Z", "I", "attabal", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class kowloon {
    private final int value;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int f7895saneness = cutely(-1);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f7892dern = cutely(1);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f7897wireman = cutely(0);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int f7894marial = cutely(2);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final int f7889beachfront = cutely(3);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final int f7890competently = cutely(4);

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final int f7893impromptu = cutely(5);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final int f7896taiyuan = cutely(6);

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final int f7891cutely = cutely(7);

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.kowloon$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ImeAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR&\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR&\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR&\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR&\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/input/kowloon$attabal;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/kowloon;", "Default", "I", "attabal", "()I", "getDefault-eUduSuo$annotations", "None", "marial", "getNone-eUduSuo$annotations", "Go", "dern", "getGo-eUduSuo$annotations", "Search", "competently", "getSearch-eUduSuo$annotations", "Send", "impromptu", "getSend-eUduSuo$annotations", "Previous", "beachfront", "getPrevious-eUduSuo$annotations", "Next", "wireman", "getNext-eUduSuo$annotations", "Done", "saneness", "getDone-eUduSuo$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int attabal() {
            return kowloon.f7892dern;
        }

        public final int beachfront() {
            return kowloon.f7893impromptu;
        }

        public final int competently() {
            return kowloon.f7889beachfront;
        }

        public final int dern() {
            return kowloon.f7894marial;
        }

        public final int impromptu() {
            return kowloon.f7890competently;
        }

        public final int marial() {
            return kowloon.f7897wireman;
        }

        public final int saneness() {
            return kowloon.f7891cutely;
        }

        public final int wireman() {
            return kowloon.f7896taiyuan;
        }

        public Companion() {
        }
    }

    public /* synthetic */ kowloon(int i) {
        this.value = i;
    }

    public static boolean apical(int i, Object obj) {
        return (obj instanceof kowloon) && i == ((kowloon) obj).getValue();
    }

    public static final boolean formularize(int i, int i2) {
        return i == i2;
    }

    public static int impassible(int i) {
        return Integer.hashCode(i);
    }

    public static final /* synthetic */ kowloon taiyuan(int i) {
        return new kowloon(i);
    }

    public static String triweekly(int i) {
        if (formularize(i, f7895saneness)) {
            return "Unspecified";
        }
        if (formularize(i, f7897wireman)) {
            return "None";
        }
        if (formularize(i, f7892dern)) {
            return "Default";
        }
        if (formularize(i, f7894marial)) {
            return "Go";
        }
        if (formularize(i, f7889beachfront)) {
            return "Search";
        }
        if (formularize(i, f7890competently)) {
            return "Send";
        }
        if (formularize(i, f7893impromptu)) {
            return "Previous";
        }
        if (formularize(i, f7896taiyuan)) {
            return "Next";
        }
        return formularize(i, f7891cutely) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return apical(this.value, obj);
    }

    public int hashCode() {
        return impassible(this.value);
    }

    /* JADX INFO: renamed from: kowloon, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return triweekly(this.value);
    }

    public static int cutely(int i) {
        return i;
    }
}

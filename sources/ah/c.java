package ah;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ah.c[], still in use, count: 1, list:
  (r0v1 ah.c[]) from 0x008d: CONSTRUCTOR (r0v1 ah.c[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:142) call: dk.a.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    SIMILAR("similar"),
    DUPLICATES("duplicates"),
    VIDEOS("videos"),
    SIMILAR_SCREENSHOTS("similarScreenshots"),
    OTHER_SCREENSHOTS("otherScreenshots"),
    /* JADX INFO: Fake field, exist only in values array */
    ALL_SCREENSHOTS("allScreenshots"),
    SIMILAR_VIDEOS("similarVideos"),
    OTHER("other"),
    CHAT_PHOTOS("chatPhotos"),
    SIMILAR_SCREEN_RECORDINGS("similarScreenRecordings"),
    OTHER_SCREEN_RECORDINGS("otherScreenRecordings");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ dk.a f3596m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3597a;

    static {
        f3596m = new dk.a(cVarArr);
    }

    public c(String str) {
        super(str, i);
        this.f3597a = str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) l.clone();
    }

    public final int d() {
        switch (this) {
            case SIMILAR:
            case DUPLICATES:
            case SIMILAR_SCREENSHOTS:
            case SIMILAR_VIDEOS:
            case SIMILAR_SCREEN_RECORDINGS:
                return 2;
            case VIDEOS:
            case OTHER_SCREENSHOTS:
            case ALL_SCREENSHOTS:
            case OTHER:
            case CHAT_PHOTOS:
            case OTHER_SCREEN_RECORDINGS:
                return 1;
            default:
                throw new aa.b((byte) 0, 20);
        }
    }
}

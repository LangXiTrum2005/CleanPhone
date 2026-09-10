package rg;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 rg.c[], still in use, count: 1, list:
  (r0v1 rg.c[]) from 0x0063: CONSTRUCTOR (r0v1 rg.c[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:100) call: dk.a.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    /* JADX INFO: Fake field, exist only in values array */
    GET_USED_DISK_RATIO("getUsedDiskRatio"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_FREE_DISK_SPACE_IN_GB("getFreeDiskSpaceInGB"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_TOTAL_DISK_SPACE_IN_GB("getTotalDiskSpaceInGB"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_USED_DISK_SPACE_IN_GB("getUsedDiskSpaceInGB"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_VIDEO_DURATION_STRING("getVideoDurationString"),
    /* JADX INFO: Fake field, exist only in values array */
    DELETE("delete"),
    /* JADX INFO: Fake field, exist only in values array */
    INITIAL_MUTE_STATE("initialMuteState"),
    /* JADX INFO: Fake field, exist only in values array */
    START_SCAN("startScan"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_FOLDERS_FILE_PATH("getFoldersFilePath");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ dk.a f49582c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49583a;

    static {
        f49582c = new dk.a(cVarArr);
    }

    public c(String str) {
        super(str, i);
        this.f49583a = str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f49581b.clone();
    }
}

package rg;

import com.ironsource.X3;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 rg.b[], still in use, count: 1, list:
  (r0v1 rg.b[]) from 0x0044: CONSTRUCTOR (r0v1 rg.b[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:69) call: dk.a.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class b {
    /* JADX INFO: Fake field, exist only in values array */
    GET_INSTALLED_APPS("getInstalledApps"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_APP_ICON("getAppIcon"),
    /* JADX INFO: Fake field, exist only in values array */
    HAS_USAGE_ACCESS("hasUsageAccess"),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN_USAGE_ACCESS_SETTINGS("openUsageAccessSettings"),
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_UNINSTALL("requestUninstall"),
    /* JADX INFO: Fake field, exist only in values array */
    IS_INSTALLED(X3.i.f27821w0);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ dk.a f49579c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49580a;

    static {
        f49579c = new dk.a(bVarArr);
    }

    public b(String str) {
        super(str, i);
        this.f49580a = str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f49578b.clone();
    }
}

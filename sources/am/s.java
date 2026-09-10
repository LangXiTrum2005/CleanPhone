package am;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f3765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f3766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s[] f3767c;

    static {
        r rVar = new r();
        f3765a = rVar;
        q qVar = new q();
        f3766b = qVar;
        f3767c = new s[]{rVar, qVar};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f3767c.clone();
    }

    public abstract String a(String str);
}

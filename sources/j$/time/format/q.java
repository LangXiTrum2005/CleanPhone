package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class q implements InterfaceC3555f {
    public static final q INSENSITIVE;
    public static final q LENIENT;
    public static final q SENSITIVE;
    public static final q STRICT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ q[] f43116a;

    @Override // j$.time.format.InterfaceC3555f
    public final boolean p(z zVar, StringBuilder sb) {
        return true;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f43116a.clone();
    }

    static {
        q qVar = new q("SENSITIVE", 0);
        SENSITIVE = qVar;
        q qVar2 = new q("INSENSITIVE", 1);
        INSENSITIVE = qVar2;
        q qVar3 = new q("STRICT", 2);
        STRICT = qVar3;
        q qVar4 = new q("LENIENT", 3);
        LENIENT = qVar4;
        f43116a = new q[]{qVar, qVar2, qVar3, qVar4};
    }

    @Override // j$.time.format.InterfaceC3555f
    public final int r(w wVar, CharSequence charSequence, int i2) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            wVar.m(true);
            return i2;
        }
        if (iOrdinal == 1) {
            wVar.m(false);
            return i2;
        }
        if (iOrdinal == 2) {
            wVar.q(true);
            return i2;
        }
        if (iOrdinal != 3) {
            return i2;
        }
        wVar.q(false);
        return i2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}

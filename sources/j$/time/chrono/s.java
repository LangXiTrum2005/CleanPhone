package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements n {
    public static final s AH;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ s[] f43051a;

    @Override // j$.time.chrono.n
    public final int p() {
        return 1;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f43051a.clone();
    }

    static {
        s sVar = new s("AH", 0);
        AH = sVar;
        f43051a = new s[]{sVar};
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w k(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ERA) {
            return j$.time.temporal.w.j(1L, 1L);
        }
        return super.k(rVar);
    }
}

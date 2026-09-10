package na;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f46633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ o[] f46634b;

    static {
        k kVar = new k();
        f46633a = kVar;
        f46634b = new o[]{kVar, new o() { // from class: na.l
            @Override // na.i
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new o() { // from class: na.m
            @Override // na.i
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new o() { // from class: na.n
            @Override // na.i
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f46634b.clone();
    }
}

package wi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f53213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c[] f53214b;

    static {
        c cVar = new c("PLAIN_TEXT", 0);
        f53213a = cVar;
        f53214b = new c[]{cVar};
    }

    public static c a(String str) throws NoSuchFieldException {
        for (c cVar : values()) {
            cVar.getClass();
            if ("text/plain".equals(str)) {
                return cVar;
            }
        }
        throw new NoSuchFieldException(defpackage.e.n("No such ClipboardContentFormat: ", str));
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f53214b.clone();
    }
}

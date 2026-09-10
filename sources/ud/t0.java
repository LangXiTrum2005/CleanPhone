package ud;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f52158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f52159b;

    public t0(g1 timeProvider, h1 uuidGenerator) {
        kotlin.jvm.internal.n.f(timeProvider, "timeProvider");
        kotlin.jvm.internal.n.f(uuidGenerator, "uuidGenerator");
        this.f52158a = timeProvider;
        this.f52159b = uuidGenerator;
    }

    public final m0 a(m0 m0Var) {
        String str;
        this.f52159b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.n.e(uuidRandomUUID, "randomUUID(...)");
        String string = uuidRandomUUID.toString();
        kotlin.jvm.internal.n.e(string, "toString(...)");
        String lowerCase = an.p.n0(string, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.n.e(lowerCase, "toLowerCase(...)");
        return new m0(lowerCase, m0Var != null ? m0Var.f52125c + 1 : 0, (m0Var == null || (str = m0Var.f52124b) == null) ? lowerCase : str, this.f52158a.a().f52073b);
    }
}

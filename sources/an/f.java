package an;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3788b;

    public f(String str, int i10) {
        this.f3787a = str;
        this.f3788b = i10;
    }

    private final Object readResolve() {
        Pattern patternCompile = Pattern.compile(this.f3787a, this.f3788b);
        kotlin.jvm.internal.n.e(patternCompile, "compile(...)");
        return new g(patternCompile);
    }
}

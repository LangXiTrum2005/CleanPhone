package i1;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42535b;

    public e0(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f42534a = z10;
        this.f42535b = i10;
    }

    public static e0 a(RuntimeException runtimeException, String str) {
        return new e0(str, runtimeException, true, 1);
    }

    public static e0 b(String str, Exception exc) {
        return new e0(str, exc, true, 4);
    }

    public static e0 c(String str) {
        return new e0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(message != null ? message.concat(" ") : "");
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f42534a);
        sb2.append(", dataType=");
        return l1.d.i(sb2, this.f42535b, "}");
    }
}

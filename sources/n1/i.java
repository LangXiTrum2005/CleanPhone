package n1;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class i extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46362a;

    public i(int i10) {
        this.f46362a = i10;
    }

    public i(int i10, Exception exc) {
        super(exc);
        this.f46362a = i10;
    }

    public i(String str, int i10) {
        super(str);
        this.f46362a = i10;
    }

    public i(int i10, Exception exc, String str) {
        super(str, exc);
        this.f46362a = i10;
    }
}

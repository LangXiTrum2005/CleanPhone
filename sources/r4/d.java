package r4;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49403b;

    public d(String str) {
        this.f49402a = str;
        this.f49403b = 0;
    }

    public final String a() {
        String str;
        int i10 = this.f49403b;
        if (i10 == 0) {
            return this.f49402a;
        }
        StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
        if (i10 != 0) {
            str = i10 != 1 ? "Unknown" : "ArrayBuffer";
        } else {
            str = "String";
        }
        throw new IllegalStateException(q4.a.j(sb2, str, " expected, but got ", "String"));
    }

    public d(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f49402a = null;
        this.f49403b = 1;
    }
}

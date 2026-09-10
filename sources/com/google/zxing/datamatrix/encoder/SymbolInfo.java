package com.google.zxing.datamatrix.encoder;

/* JADX INFO: loaded from: classes3.dex */
public class SymbolInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21364c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21365e;
    public final int f;

    public SymbolInfo(int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z2) {
        this.f21362a = z2;
        this.f21363b = i2;
        this.f21364c = i3;
        this.d = i4;
        this.f21365e = i5;
        this.f = i6;
    }

    public final int a() {
        int i2 = 1;
        int i3 = this.f;
        if (i3 != 1) {
            i2 = 2;
            if (i3 != 2 && i3 != 4) {
                if (i3 == 16) {
                    return 4;
                }
                if (i3 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    public final int b() {
        int i2 = this.f;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21362a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        int i2 = this.d;
        sb.append(i2);
        sb.append('x');
        int i3 = this.f21365e;
        sb.append(i3);
        sb.append(", symbol size ");
        sb.append((a() * this.d) + (a() << 1));
        sb.append('x');
        sb.append((b() * i3) + (b() << 1));
        sb.append(", symbol data size ");
        sb.append(a() * i2);
        sb.append('x');
        sb.append(b() * i3);
        sb.append(", codewords ");
        sb.append(this.f21363b);
        sb.append('+');
        sb.append(this.f21364c);
        return sb.toString();
    }
}

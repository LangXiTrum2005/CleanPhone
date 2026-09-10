package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22444b;

    public static String b(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static String e(int i10) {
        char c4 = (char) ((i10 >> 24) & 255);
        char c5 = (char) ((i10 >> 16) & 255);
        char c10 = (char) ((i10 >> 8) & 255);
        char c11 = (char) (i10 & 255);
        StringBuilder sb2 = new StringBuilder(l1.d.r(String.valueOf(c4).length(), String.valueOf(c5).length(), String.valueOf(c10).length(), String.valueOf(c11).length()));
        sb2.append(c4);
        sb2.append(c5);
        sb2.append(c10);
        sb2.append(c11);
        return sb2.toString();
    }

    public void a(int i10) {
        this.f22444b = i10 | this.f22444b;
    }

    public boolean c(int i10) {
        return (this.f22444b & i10) == i10;
    }

    public boolean d() {
        return f(1);
    }

    public boolean f(int i10) {
        return (this.f22444b & i10) == i10;
    }

    public String toString() {
        switch (this.f22443a) {
            case 0:
                return e(this.f22444b);
            case 1:
            default:
                return super.toString();
            case 2:
                return b(this.f22444b);
        }
    }

    public /* synthetic */ z01(int i10, int i11) {
        this.f22443a = i11;
        this.f22444b = i10;
    }
}

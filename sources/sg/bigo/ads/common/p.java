package sg.bigo.ads.common;

/* JADX INFO: loaded from: classes7.dex */
public class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47363c;

    public p(int i2, int i3) {
        this.f47362b = i2;
        this.f47363c = i3;
    }

    public static p a(int i2, int i3, int i4) {
        return new p((int) (((i4 * 1.0f) * i2) / i3), i4);
    }

    public static p b(int i2, int i3, int i4) {
        return new p(i4, (int) (((i4 * 1.0f) * i3) / i2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (pVar.f47363c == this.f47363c && pVar.f47362b == this.f47362b) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f47363c;
    }

    public int getWidth() {
        return this.f47362b;
    }

    public String toString() {
        return this.f47362b + "x" + this.f47363c;
    }

    public static p a(int i2, int i3, int i4, int i5) {
        float f = i2;
        float f2 = i3;
        float f3 = i4;
        float f4 = i5;
        if ((f * 1.0f) / f2 > (1.0f * f3) / f4) {
            f4 = (f3 / f) * f2;
        } else {
            f3 = (f4 / f2) * f;
        }
        return new p((int) f3, (int) f4);
    }

    public final boolean a() {
        return this.f47362b > 0 && this.f47363c > 0;
    }

    public final boolean a(int i2, int i3) {
        int i4;
        int i5;
        return (i2 == 0 || i3 == 0 || (i4 = this.f47362b) == 0 || (i5 = this.f47363c) == 0 || i2 * i5 != i3 * i4) ? false : true;
    }

    public final boolean a(p pVar) {
        return pVar != null && this.f47362b * this.f47363c > pVar.f47362b * pVar.f47363c;
    }
}

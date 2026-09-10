package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2417Fk implements InterfaceC2538Kb {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final C2911Yl J;
    public static final C2417Fk r = new C2417Fk("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f3084a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;

    static {
        int i = Ug0.f3833a;
        s = Integer.toString(0, 36);
        t = Integer.toString(1, 36);
        u = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
        x = Integer.toString(5, 36);
        y = Integer.toString(6, 36);
        z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(9, 36);
        C = Integer.toString(10, 36);
        D = Integer.toString(11, 36);
        E = Integer.toString(12, 36);
        F = Integer.toString(13, 36);
        G = Integer.toString(14, 36);
        H = Integer.toString(15, 36);
        I = Integer.toString(16, 36);
        J = new C2911Yl(17);
    }

    public C2417Fk(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            FW.h(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f3084a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f3084a = charSequence.toString();
        } else {
            this.f3084a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
    }

    public final C2391Ek a() {
        C2391Ek c2391Ek = new C2391Ek();
        c2391Ek.f3034a = this.f3084a;
        c2391Ek.b = this.d;
        c2391Ek.c = this.b;
        c2391Ek.d = this.c;
        c2391Ek.e = this.e;
        c2391Ek.f = this.f;
        c2391Ek.g = this.g;
        c2391Ek.h = this.h;
        c2391Ek.i = this.i;
        c2391Ek.j = this.n;
        c2391Ek.k = this.o;
        c2391Ek.l = this.j;
        c2391Ek.m = this.k;
        c2391Ek.n = this.l;
        c2391Ek.o = this.m;
        c2391Ek.p = this.p;
        c2391Ek.q = this.q;
        return c2391Ek;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2417Fk.class != obj.getClass()) {
            return false;
        }
        C2417Fk c2417Fk = (C2417Fk) obj;
        if (TextUtils.equals(this.f3084a, c2417Fk.f3084a) && this.b == c2417Fk.b && this.c == c2417Fk.c) {
            Bitmap bitmap = c2417Fk.d;
            Bitmap bitmap2 = this.d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.e == c2417Fk.e && this.f == c2417Fk.f && this.g == c2417Fk.g && this.h == c2417Fk.h && this.i == c2417Fk.i && this.j == c2417Fk.j && this.k == c2417Fk.k && this.l == c2417Fk.l && this.m == c2417Fk.m && this.n == c2417Fk.n && this.o == c2417Fk.o && this.p == c2417Fk.p && this.q == c2417Fk.q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3084a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q)});
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(s, this.f3084a);
        bundle.putSerializable(t, this.b);
        bundle.putSerializable(u, this.c);
        bundle.putParcelable(v, this.d);
        bundle.putFloat(w, this.e);
        bundle.putInt(x, this.f);
        bundle.putInt(y, this.g);
        bundle.putFloat(z, this.h);
        bundle.putInt(A, this.i);
        bundle.putInt(B, this.n);
        bundle.putFloat(C, this.o);
        bundle.putFloat(D, this.j);
        bundle.putFloat(E, this.k);
        bundle.putBoolean(G, this.l);
        bundle.putInt(F, this.m);
        bundle.putInt(H, this.p);
        bundle.putFloat(I, this.q);
        return bundle;
    }
}

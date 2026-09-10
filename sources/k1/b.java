package k1;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import go.k;
import java.util.Objects;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f44217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f44218t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f44219u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f44220v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f44221w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f44222x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f44223y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f44224z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f44225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f44226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f44227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f44228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f44229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f44231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f44232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f44233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f44234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f44235k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f44236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f44237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f44238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f44239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f44240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f44241r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        String str = y.f44830a;
        f44217s = Integer.toString(0, 36);
        f44218t = Integer.toString(17, 36);
        f44219u = Integer.toString(1, 36);
        f44220v = Integer.toString(2, 36);
        f44221w = Integer.toString(3, 36);
        f44222x = Integer.toString(18, 36);
        f44223y = Integer.toString(4, 36);
        f44224z = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = Integer.toString(8, 36);
        D = Integer.toString(9, 36);
        E = Integer.toString(10, 36);
        F = Integer.toString(11, 36);
        G = Integer.toString(12, 36);
        H = Integer.toString(13, 36);
        I = Integer.toString(14, 36);
        J = Integer.toString(15, 36);
        K = Integer.toString(16, 36);
        L = Integer.toString(19, 36);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15, int i16) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            k.i(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f44225a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f44225a = charSequence.toString();
        } else {
            this.f44225a = null;
        }
        this.f44226b = alignment;
        this.f44227c = alignment2;
        this.f44228d = bitmap;
        this.f44229e = f10;
        this.f44230f = i10;
        this.f44231g = i11;
        this.f44232h = f11;
        this.f44233i = i12;
        this.f44234j = f13;
        this.f44235k = f14;
        this.l = z10;
        this.f44236m = i14;
        this.f44237n = i13;
        this.f44238o = f12;
        this.f44239p = i15;
        this.f44240q = f15;
        this.f44241r = i16;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            Bitmap bitmap2 = bVar.f44228d;
            if (TextUtils.equals(this.f44225a, bVar.f44225a) && this.f44226b == bVar.f44226b && this.f44227c == bVar.f44227c && ((bitmap = this.f44228d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f44229e == bVar.f44229e && this.f44230f == bVar.f44230f && this.f44231g == bVar.f44231g && this.f44232h == bVar.f44232h && this.f44233i == bVar.f44233i && this.f44234j == bVar.f44234j && this.f44235k == bVar.f44235k && this.l == bVar.l && this.f44236m == bVar.f44236m && this.f44237n == bVar.f44237n && this.f44238o == bVar.f44238o && this.f44239p == bVar.f44239p && this.f44240q == bVar.f44240q && this.f44241r == bVar.f44241r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44225a, this.f44226b, this.f44227c, this.f44228d, Float.valueOf(this.f44229e), Integer.valueOf(this.f44230f), Integer.valueOf(this.f44231g), Float.valueOf(this.f44232h), Integer.valueOf(this.f44233i), Float.valueOf(this.f44234j), Float.valueOf(this.f44235k), Boolean.valueOf(this.l), Integer.valueOf(this.f44236m), Integer.valueOf(this.f44237n), Float.valueOf(this.f44238o), Integer.valueOf(this.f44239p), Float.valueOf(this.f44240q), Integer.valueOf(this.f44241r));
    }
}

package l3;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import go.k;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f44977v = c(2, 2, 2, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f44978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f44979x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f44980y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f44981z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44982a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f44983b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f44991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f44992k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f44993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f44994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f44995o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f44996p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f44997q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f44998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f44999s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45000t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f45001u;

    static {
        int iC = c(0, 0, 0, 0);
        f44978w = iC;
        int iC2 = c(0, 0, 0, 3);
        f44979x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f44980y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f44981z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public e() {
        d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static int c(int i10, int i11, int i12, int i13) {
        int i14;
        k.m(i10, 4);
        k.m(i11, 4);
        k.m(i12, 4);
        k.m(i13, 4);
        if (i13 == 0 || i13 == 1) {
            i14 = 255;
        } else if (i13 == 2) {
            i14 = 127;
        } else if (i13 != 3) {
            i14 = 255;
        } else {
            i14 = 0;
        }
        return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
    }

    public final void a(char c4) {
        SpannableStringBuilder spannableStringBuilder = this.f44983b;
        if (c4 != '\n') {
            spannableStringBuilder.append(c4);
            return;
        }
        SpannableString spannableStringB = b();
        ArrayList arrayList = this.f44982a;
        arrayList.add(spannableStringB);
        spannableStringBuilder.clear();
        if (this.f44995o != -1) {
            this.f44995o = 0;
        }
        if (this.f44996p != -1) {
            this.f44996p = 0;
        }
        if (this.f44997q != -1) {
            this.f44997q = 0;
        }
        if (this.f44999s != -1) {
            this.f44999s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f44991j && arrayList.size() < 15) {
                this.f45001u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f44983b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f44995o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f44995o, length, 33);
            }
            if (this.f44996p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f44996p, length, 33);
            }
            if (this.f44997q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f44998r), this.f44997q, length, 33);
            }
            if (this.f44999s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f45000t), this.f44999s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f44982a.clear();
        this.f44983b.clear();
        this.f44995o = -1;
        this.f44996p = -1;
        this.f44997q = -1;
        this.f44999s = -1;
        this.f45001u = 0;
        this.f44984c = false;
        this.f44985d = false;
        this.f44986e = 4;
        this.f44987f = false;
        this.f44988g = 0;
        this.f44989h = 0;
        this.f44990i = 0;
        this.f44991j = 15;
        this.f44992k = 0;
        this.l = 0;
        this.f44993m = 0;
        int i10 = f44978w;
        this.f44994n = i10;
        this.f44998r = f44977v;
        this.f45000t = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f44995o;
        SpannableStringBuilder spannableStringBuilder = this.f44983b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f44995o, spannableStringBuilder.length(), 33);
                this.f44995o = -1;
            }
        } else if (z10) {
            this.f44995o = spannableStringBuilder.length();
        }
        if (this.f44996p == -1) {
            if (z11) {
                this.f44996p = spannableStringBuilder.length();
            }
        } else {
            if (z11) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f44996p, spannableStringBuilder.length(), 33);
            this.f44996p = -1;
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f44997q;
        SpannableStringBuilder spannableStringBuilder = this.f44983b;
        if (i12 != -1 && this.f44998r != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f44998r), this.f44997q, spannableStringBuilder.length(), 33);
        }
        if (i10 != f44977v) {
            this.f44997q = spannableStringBuilder.length();
            this.f44998r = i10;
        }
        if (this.f44999s != -1 && this.f45000t != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f45000t), this.f44999s, spannableStringBuilder.length(), 33);
        }
        if (i11 != f44978w) {
            this.f44999s = spannableStringBuilder.length();
            this.f45000t = i11;
        }
    }
}

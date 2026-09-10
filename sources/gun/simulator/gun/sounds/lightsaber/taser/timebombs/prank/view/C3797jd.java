package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3797jd {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final int w = c(2, 2, 2, 0);
    public static final int x;
    public static final int[] y;
    public static final int[] z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4560a = new ArrayList();
    public final SpannableStringBuilder b = new SpannableStringBuilder();
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    static {
        int iC = c(0, 0, 0, 0);
        x = iC;
        int iC2 = c(0, 0, 0, 3);
        y = new int[]{0, 0, 0, 0, 0, 2, 0};
        z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public C3797jd() {
        d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static int c(int i, int i2, int i3, int i4) {
        int i5;
        FW.m(i, 4);
        FW.m(i2, 4);
        FW.m(i3, 4);
        FW.m(i4, 4);
        if (i4 == 0 || i4 == 1) {
            i5 = 255;
        } else if (i4 == 2) {
            i5 = EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        } else if (i4 != 3) {
            i5 = 255;
        } else {
            i5 = 0;
        }
        return Color.argb(i5, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
    }

    public final void a(char c) {
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (c != '\n') {
            spannableStringBuilder.append(c);
            return;
        }
        ArrayList arrayList = this.f4560a;
        arrayList.add(b());
        spannableStringBuilder.clear();
        if (this.p != -1) {
            this.p = 0;
        }
        if (this.q != -1) {
            this.q = 0;
        }
        if (this.r != -1) {
            this.r = 0;
        }
        if (this.t != -1) {
            this.t = 0;
        }
        while (true) {
            if ((!this.k || arrayList.size() < this.j) && arrayList.size() < 15) {
                return;
            } else {
                arrayList.remove(0);
            }
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
            }
            if (this.q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
            }
            if (this.r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
            }
            if (this.t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f4560a.clear();
        this.b.clear();
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.t = -1;
        this.v = 0;
        this.c = false;
        this.d = false;
        this.e = 4;
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 15;
        this.k = true;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        int i = x;
        this.o = i;
        this.s = w;
        this.u = i;
    }

    public final void e(boolean z2, boolean z3) {
        int i = this.p;
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (i != -1) {
            if (!z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.p, spannableStringBuilder.length(), 33);
                this.p = -1;
            }
        } else if (z2) {
            this.p = spannableStringBuilder.length();
        }
        if (this.q == -1) {
            if (z3) {
                this.q = spannableStringBuilder.length();
            }
        } else {
            if (z3) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, spannableStringBuilder.length(), 33);
            this.q = -1;
        }
    }

    public final void f(int i, int i2) {
        int i3 = this.r;
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (i3 != -1 && this.s != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, spannableStringBuilder.length(), 33);
        }
        if (i != w) {
            this.r = spannableStringBuilder.length();
            this.s = i;
        }
        if (this.t != -1 && this.u != i2) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, spannableStringBuilder.length(), 33);
        }
        if (i2 != x) {
            this.t = spannableStringBuilder.length();
            this.u = i2;
        }
    }
}

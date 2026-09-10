package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.Layout;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.we0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4943we0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5190a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public Kb0 r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(C4943we0 c4943we0) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c4943we0 != null) {
            if (!this.c && c4943we0.c) {
                this.b = c4943we0.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = c4943we0.h;
            }
            if (this.i == -1) {
                this.i = c4943we0.i;
            }
            if (this.f5190a == null && (str = c4943we0.f5190a) != null) {
                this.f5190a = str;
            }
            if (this.f == -1) {
                this.f = c4943we0.f;
            }
            if (this.g == -1) {
                this.g = c4943we0.g;
            }
            if (this.n == -1) {
                this.n = c4943we0.n;
            }
            if (this.o == null && (alignment2 = c4943we0.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = c4943we0.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = c4943we0.q;
            }
            if (this.j == -1) {
                this.j = c4943we0.j;
                this.k = c4943we0.k;
            }
            if (this.r == null) {
                this.r = c4943we0.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = c4943we0.s;
            }
            if (!this.e && c4943we0.e) {
                this.d = c4943we0.d;
                this.e = true;
            }
            if (this.m != -1 || (i = c4943we0.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}

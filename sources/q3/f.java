package q3;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f48628e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f48634k;
    public String l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f48637o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f48638p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f48640r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f48642t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f48643u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48629f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f48630g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f48631h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f48632i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f48633j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f48635m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f48636n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f48639q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f48641s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f48626c && fVar.f48626c) {
                this.f48625b = fVar.f48625b;
                this.f48626c = true;
            }
            if (this.f48631h == -1) {
                this.f48631h = fVar.f48631h;
            }
            if (this.f48632i == -1) {
                this.f48632i = fVar.f48632i;
            }
            if (this.f48624a == null && (str = fVar.f48624a) != null) {
                this.f48624a = str;
            }
            if (this.f48629f == -1) {
                this.f48629f = fVar.f48629f;
            }
            if (this.f48630g == -1) {
                this.f48630g = fVar.f48630g;
            }
            if (this.f48636n == -1) {
                this.f48636n = fVar.f48636n;
            }
            if (this.f48637o == null && (alignment2 = fVar.f48637o) != null) {
                this.f48637o = alignment2;
            }
            if (this.f48638p == null && (alignment = fVar.f48638p) != null) {
                this.f48638p = alignment;
            }
            if (this.f48639q == -1) {
                this.f48639q = fVar.f48639q;
            }
            if (this.f48633j == -1) {
                this.f48633j = fVar.f48633j;
                this.f48634k = fVar.f48634k;
            }
            if (this.f48640r == null) {
                this.f48640r = fVar.f48640r;
            }
            if (this.f48641s == Float.MAX_VALUE) {
                this.f48641s = fVar.f48641s;
            }
            if (this.f48642t == null) {
                this.f48642t = fVar.f48642t;
            }
            if (this.f48643u == null) {
                this.f48643u = fVar.f48643u;
            }
            if (!this.f48628e && fVar.f48628e) {
                this.f48627d = fVar.f48627d;
                this.f48628e = true;
            }
            if (this.f48635m != -1 || (i10 = fVar.f48635m) == -1) {
                return;
            }
            this.f48635m = i10;
        }
    }
}

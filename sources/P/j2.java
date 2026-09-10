package p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f47707h;

    public final void a(int i10, int i11) {
        this.f47702c = i10;
        this.f47703d = i11;
        this.f47707h = true;
        if (this.f47706g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f47700a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f47701b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f47700a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f47701b = i11;
        }
    }
}

package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class RtlSpacingHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3622c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3623e;
    public int f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3624h;

    public final void a(int i2, int i3) {
        this.f3622c = i2;
        this.d = i3;
        this.f3624h = true;
        if (this.g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f3620a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f3621b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3620a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f3621b = i3;
        }
    }
}

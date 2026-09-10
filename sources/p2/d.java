package p2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f48232f;

    public d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f48227a = i10;
        this.f48228b = i11;
        this.f48229c = i12;
        this.f48230d = i13;
        this.f48231e = i14;
        this.f48232f = i15;
    }

    public final int a() {
        int i10 = this.f48227a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        l1.a.s("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i10));
        return -1;
    }

    @Override // p2.a
    public final int getType() {
        return 1752331379;
    }
}

package u;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f51622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f51623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f51624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f51625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f51626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f51627g;

    public e(f fVar, int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
        this.f51627g = fVar;
        this.f51621a = i10;
        this.f51622b = i11;
        this.f51623c = i12;
        this.f51624d = i13;
        this.f51625e = i14;
        this.f51626f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f51627g.f51629b.onActivityLayout(this.f51621a, this.f51622b, this.f51623c, this.f51624d, this.f51625e, this.f51626f);
    }
}

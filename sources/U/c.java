package u;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f51613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f51614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f51615d;

    public /* synthetic */ c(f fVar, String str, Bundle bundle, int i10) {
        this.f51612a = i10;
        this.f51615d = fVar;
        this.f51613b = str;
        this.f51614c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f51612a) {
            case 0:
                this.f51615d.f51629b.extraCallback(this.f51613b, this.f51614c);
                break;
            default:
                this.f51615d.f51629b.onPostMessage(this.f51613b, this.f51614c);
                break;
        }
    }
}

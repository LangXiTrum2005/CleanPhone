package rc;

import android.util.Log;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements jk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f49562b;

    public /* synthetic */ h(long j10, int i10) {
        this.f49561a = i10;
        this.f49562b = j10;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f49561a) {
            case 0:
                ((w0.b) obj).e(i.f49563b, Long.valueOf(this.f49562b));
                return null;
            default:
                if (((wj.h) obj).f53286a instanceof wj.g) {
                    Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + this.f49562b);
                }
                return r.f53297a;
        }
    }
}

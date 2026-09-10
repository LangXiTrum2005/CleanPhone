package tj;

import android.webkit.ValueCallback;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk.b f50848b;

    public /* synthetic */ k(jk.b bVar, int i10) {
        this.f50847a = i10;
        this.f50848b = bVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i10 = this.f50847a;
        hj.b bVar = (hj.b) this.f50848b;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.h0.d(1, bVar);
                bVar.invoke(new wj.h((Boolean) obj));
                break;
            default:
                kotlin.jvm.internal.h0.d(1, bVar);
                bVar.invoke(new wj.h((String) obj));
                break;
        }
    }
}

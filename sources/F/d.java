package f;

import androidx.activity.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements androidx.lifecycle.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f40216c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f40214a = i10;
        this.f40215b = obj;
        this.f40216c = obj2;
    }

    @Override // androidx.lifecycle.t
    public final void onStateChanged(androidx.lifecycle.v vVar, androidx.lifecycle.m mVar) {
        switch (this.f40214a) {
            case 0:
                ComponentActivity.j((t) this.f40215b, (ComponentActivity) this.f40216c, vVar, mVar);
                break;
            default:
                m0.q qVar = (m0.q) this.f40215b;
                m0.r rVar = (m0.r) this.f40216c;
                if (mVar != androidx.lifecycle.m.ON_DESTROY) {
                    qVar.getClass();
                } else {
                    qVar.b(rVar);
                }
                break;
        }
    }
}

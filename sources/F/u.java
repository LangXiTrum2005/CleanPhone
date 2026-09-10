package f;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f40255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, int i10) {
        super(true);
        this.f40254d = i10;
        this.f40255e = obj;
    }

    @Override // f.o
    public final void b() {
        switch (this.f40254d) {
            case 0:
                ((jk.b) this.f40255e).invoke(this);
                break;
            default:
                mi.k kVar = (mi.k) this.f40255e;
                if (kVar.D("onBackPressed")) {
                    mi.e eVar = kVar.f46024b;
                    eVar.c();
                    ni.c cVar = eVar.f45984b;
                    if (cVar == null) {
                        Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
                    } else {
                        ((xi.p) cVar.f46745i.f49529b).a("popRoute", null, null);
                    }
                }
                break;
        }
    }
}

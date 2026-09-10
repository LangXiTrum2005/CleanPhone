package mb;

import android.content.Context;
import tb.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements tc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45922c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f45920a = i10;
        this.f45922c = obj;
        this.f45921b = obj2;
    }

    @Override // tc.b
    public final Object get() {
        switch (this.f45920a) {
            case 0:
                g gVar = (g) this.f45922c;
                return new yc.a((Context) this.f45921b, gVar.g(), (qc.c) gVar.f45931d.a(qc.c.class));
            case 1:
                return new rc.i((Context) this.f45921b, (String) this.f45922c);
            default:
                tb.e eVar = (tb.e) this.f45922c;
                tb.a aVar = (tb.a) this.f45921b;
                return aVar.f50678f.g(new s(aVar, eVar));
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.f45920a = 1;
        this.f45921b = context;
        this.f45922c = str;
    }
}

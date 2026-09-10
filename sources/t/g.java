package t;

import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.storage.androidcleaner.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f50292b;

    public /* synthetic */ g(l lVar, int i10) {
        this.f50291a = i10;
        this.f50292b = lVar;
    }

    @Override // androidx.lifecycle.g0
    public final void A(Object obj) {
        CharSequence string;
        switch (this.f50291a) {
            case 0:
                o oVar = (o) obj;
                if (oVar != null) {
                    l lVar = this.f50292b;
                    lVar.H(oVar);
                    t tVar = lVar.f50295a;
                    if (tVar.f50313m == null) {
                        tVar.f50313m = new f0();
                    }
                    t.g(tVar.f50313m, null);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    l lVar2 = this.f50292b;
                    p pVar = lVar2.f50295a.f50307f;
                    if (pVar != null) {
                        string = pVar.f50299d;
                        if (string == null) {
                            string = "";
                        }
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        string = lVar2.getString(R.string.default_error_msg);
                    }
                    lVar2.G(13, string);
                    lVar2.D(2);
                    lVar2.f50295a.f(false);
                }
                break;
        }
    }
}

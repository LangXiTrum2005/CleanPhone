package t;

import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.storage.androidcleaner.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f50294b;

    public /* synthetic */ h(l lVar, int i10) {
        this.f50293a = i10;
        this.f50294b = lVar;
    }

    @Override // androidx.lifecycle.g0
    public final void A(Object obj) {
        switch (this.f50293a) {
            case 0:
                e eVar = (e) obj;
                if (eVar != null) {
                    int i10 = eVar.f50287a;
                    CharSequence charSequence = eVar.f50288b;
                    switch (i10) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 6:
                        default:
                            i10 = 8;
                            break;
                    }
                    l lVar = this.f50294b;
                    lVar.getContext();
                    lVar.F();
                    if (charSequence == null) {
                        charSequence = lVar.getString(R.string.default_error_msg) + " " + i10;
                    }
                    lVar.G(i10, charSequence);
                    lVar.f50295a.c(null);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    l lVar2 = this.f50294b;
                    lVar2.D(1);
                    lVar2.E();
                    t tVar = lVar2.f50295a;
                    if (tVar.f50318r == null) {
                        tVar.f50318r = new f0();
                    }
                    t.g(tVar.f50318r, Boolean.FALSE);
                }
                break;
        }
    }
}

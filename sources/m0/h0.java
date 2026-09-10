package m0;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f45713e;

    public h0(int i10, Class cls, int i11, int i12, int i13) {
        this.f45713e = i13;
        this.f45717a = i10;
        this.f45720d = cls;
        this.f45719c = i11;
        this.f45718b = i12;
    }

    @Override // m0.j0
    public final Object e(View view) {
        switch (this.f45713e) {
            case 0:
                return o0.a(view);
            default:
                return q0.b(view);
        }
    }

    @Override // m0.j0
    public final void f(View view, Object obj) {
        switch (this.f45713e) {
            case 0:
                o0.d(view, (CharSequence) obj);
                break;
            default:
                q0.c(view, (CharSequence) obj);
                break;
        }
    }

    @Override // m0.j0
    public final boolean i(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f45713e) {
            case 0:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
        }
        return !zEquals;
    }
}

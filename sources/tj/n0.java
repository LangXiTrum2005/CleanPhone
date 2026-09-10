package tj;

import android.webkit.JsResult;
import com.google.android.gms.internal.measurement.nf;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n0 implements jk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f50871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JsResult f50872c;

    public /* synthetic */ n0(p0 p0Var, JsResult jsResult, int i10) {
        this.f50870a = i10;
        this.f50871b = p0Var;
        this.f50872c = jsResult;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        j0 j0Var = (j0) obj;
        switch (this.f50870a) {
            case 0:
                if (!j0Var.f50846d) {
                    boolean zEquals = Boolean.TRUE.equals(j0Var.f50844b);
                    JsResult jsResult = this.f50872c;
                    if (!zEquals) {
                        jsResult.cancel();
                    } else {
                        jsResult.confirm();
                    }
                } else {
                    nf nfVar = this.f50871b.f50885b.f50873a;
                    Throwable th2 = j0Var.f50845c;
                    Objects.requireNonNull(th2);
                    nfVar.getClass();
                    nf.r(th2);
                }
                break;
            default:
                if (!j0Var.f50846d) {
                    this.f50872c.confirm();
                } else {
                    nf nfVar2 = this.f50871b.f50885b.f50873a;
                    Throwable th3 = j0Var.f50845c;
                    Objects.requireNonNull(th3);
                    nfVar2.getClass();
                    nf.r(th3);
                }
                break;
        }
        return null;
    }
}

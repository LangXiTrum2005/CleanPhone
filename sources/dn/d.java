package dn;

import android.webkit.JsPromptResult;
import com.google.android.gms.internal.measurement.nf;
import ea.f2;
import java.util.Objects;
import tj.j0;
import tj.p0;
import wi.j;
import wj.h;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements jk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38969c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f38967a = i10;
        this.f38968b = obj;
        this.f38969c = obj2;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f38967a) {
            case 0:
                e eVar = (e) this.f38968b;
                eVar.f38970b.removeCallbacks((com.unity3d.services.ads.operation.show.b) this.f38969c);
                return r.f53297a;
            case 1:
                f2 f2Var = (f2) this.f38968b;
                j jVar = (j) this.f38969c;
                Object obj2 = ((h) obj).f53286a;
                Throwable thA = h.a(obj2);
                if (thA == null) {
                } else {
                    hi.b bVar = (hi.b) f2Var.f39410c;
                    bVar.f42358b.set(true);
                    bVar.f42357a = null;
                    jVar.b("Share failed", thA.getMessage(), thA);
                }
                return r.f53297a;
            default:
                p0 p0Var = (p0) this.f38968b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f38969c;
                j0 j0Var = (j0) obj;
                if (j0Var.f50846d) {
                    nf nfVar = p0Var.f50885b.f50873a;
                    Throwable th2 = j0Var.f50845c;
                    Objects.requireNonNull(th2);
                    nfVar.getClass();
                    nf.r(th2);
                    return null;
                }
                String str = (String) j0Var.f50844b;
                if (str != null) {
                    jsPromptResult.confirm(str);
                    return null;
                }
                jsPromptResult.cancel();
                return null;
        }
    }
}

package d4;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import androidx.lifecycle.p;
import cn.d0;
import cn.l;
import com.applovin.impl.da;
import com.google.android.gms.internal.play_billing.q1;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends t9.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MeasurementManager f38672d;

    public c(MeasurementManager measurementManager) {
        super(4);
        this.f38672d = measurementManager;
    }

    public static Object G(c cVar, a aVar, ak.f fVar) {
        new l(1, q1.t(fVar)).t();
        MeasurementManager measurementManager = cVar.f38672d;
        throw null;
    }

    public static Object H(c cVar, ak.f fVar) {
        l lVar = new l(1, q1.t(fVar));
        lVar.t();
        cVar.f38672d.getMeasurementApiStatus(new da(1), new i0.d(lVar));
        return lVar.s();
    }

    public static Object J(c cVar, Uri uri, InputEvent inputEvent, ak.f fVar) {
        l lVar = new l(1, q1.t(fVar));
        lVar.t();
        cVar.f38672d.registerSource(uri, inputEvent, new da(1), new i0.d(lVar));
        Object objS = lVar.s();
        return objS == bk.a.f5708a ? objS : r.f53297a;
    }

    public static Object K(c cVar, d dVar, ak.f fVar) {
        Object objK = d0.k(new p(cVar, null, 4), fVar);
        return objK == bk.a.f5708a ? objK : r.f53297a;
    }

    public static Object L(c cVar, Uri uri, ak.f fVar) {
        l lVar = new l(1, q1.t(fVar));
        lVar.t();
        cVar.f38672d.registerTrigger(uri, new da(1), new i0.d(lVar));
        Object objS = lVar.s();
        return objS == bk.a.f5708a ? objS : r.f53297a;
    }

    public static Object N(c cVar, e eVar, ak.f fVar) {
        new l(1, q1.t(fVar)).t();
        MeasurementManager measurementManager = cVar.f38672d;
        throw null;
    }

    public static Object P(c cVar, f fVar, ak.f fVar2) {
        new l(1, q1.t(fVar2)).t();
        MeasurementManager measurementManager = cVar.f38672d;
        throw null;
    }

    public Object F(a aVar, ak.f fVar) {
        return G(this, aVar, fVar);
    }

    public Object I(d dVar, ak.f fVar) {
        return K(this, dVar, fVar);
    }

    public Object M(e eVar, ak.f fVar) {
        return N(this, eVar, fVar);
    }

    public Object O(f fVar, ak.f fVar2) {
        return P(this, fVar, fVar2);
    }

    @Override // t9.e
    public Object m(ak.f fVar) {
        return H(this, fVar);
    }

    @Override // t9.e
    public Object q(Uri uri, InputEvent inputEvent, ak.f fVar) {
        return J(this, uri, inputEvent, fVar);
    }

    @Override // t9.e
    public Object r(Uri uri, ak.f fVar) {
        return L(this, uri, fVar);
    }
}

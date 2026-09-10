package androidx.datastore.preferences.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f4138b = new y(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4139a;

    public n0(p pVar) {
        e0.a(pVar, "output");
        this.f4139a = pVar;
        pVar.f4146b = this;
    }

    public void a(int i10, Object obj, d1 d1Var) {
        p pVar = (p) this.f4139a;
        pVar.m0(i10, 3);
        d1Var.e((a) obj, pVar.f4146b);
        pVar.m0(i10, 4);
    }

    public n0() {
        t0 t0Var;
        a1 a1Var = a1.f4050c;
        try {
            t0Var = (t0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            t0Var = f4138b;
        }
        t0[] t0VarArr = {y.f4197b, t0Var};
        m0 m0Var = new m0();
        m0Var.f4132a = t0VarArr;
        Charset charset = e0.f4067a;
        this.f4139a = m0Var;
    }
}

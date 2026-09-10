package ads_mobile_sdk;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import saneness.caparison;
import saneness.hel;
import saneness.transpositive;
import saneness.vaporizer;

/* JADX INFO: loaded from: classes.dex */
public final class lg0 implements caparison {
    public final transpositive a;

    public lg0(i72 i72Var) {
        this.a = i72Var;
    }

    @Override // saneness.caparison
    public final Object a() {
        return this.a;
    }

    @Override // saneness.caparison
    public final Object a(FileInputStream fileInputStream) {
        try {
            hel helVar = (hel) ((xm0) this.a).a(7, (xm0) null);
            vf0 vf0VarA = vf0.a();
            vaporizer vaporizerVar = (vaporizer) helVar;
            vaporizerVar.getClass();
            hr hrVarA = hr.a(fileInputStream);
            xm0 xm0VarA = xm0.a(((wm0) vaporizerVar).a, hrVarA, vf0VarA);
            hrVarA.a(0);
            if (xm0.a(xm0VarA, true)) {
                return xm0VarA;
            }
            throw new x81(new x43().getMessage());
        } catch (x81 e) {
            throw new kg0("Cannot read proto.", e);
        }
    }

    @Override // saneness.caparison
    public final void a(Object obj, FileOutputStream fileOutputStream) throws IOException {
        ((g) ((transpositive) obj)).a(fileOutputStream);
    }
}

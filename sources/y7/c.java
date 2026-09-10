package y7;

import java.util.Arrays;
import java.util.Locale;
import l7.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements l7.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f54221b;

    public /* synthetic */ c(h hVar, int i10) {
        this.f54220a = i10;
        this.f54221b = hVar;
    }

    @Override // l7.w
    public final void a(e0 e0Var) {
        int i10 = this.f54220a;
        h hVar = this.f54221b;
        switch (i10) {
            case 0:
                if (!hVar.f54240u.get()) {
                    l7.q qVar = e0Var.f45111c;
                    if (qVar != null) {
                        int i11 = qVar.f45204c;
                        if (i11 == 1349174 || i11 == 1349172) {
                            hVar.M();
                        } else if (i11 == 1349152) {
                            f fVar = hVar.f54243x;
                            if (fVar != null) {
                                p7.b.a(fVar.f54231b);
                            }
                            n nVar = hVar.A;
                            if (nVar == null) {
                                hVar.I();
                            } else {
                                hVar.O(nVar);
                            }
                        } else if (i11 != 1349173) {
                            l7.n nVar2 = qVar.f45210i;
                            if (nVar2 == null) {
                                nVar2 = new l7.n();
                            }
                            hVar.J(nVar2);
                        } else {
                            hVar.I();
                        }
                    } else {
                        try {
                            JSONObject jSONObject = e0Var.f45110b;
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            String string = jSONObject.getString("access_token");
                            kotlin.jvm.internal.n.e(string, "resultObject.getString(\"access_token\")");
                            hVar.K(string, jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                        } catch (JSONException e10) {
                            hVar.J(new l7.n(e10));
                            return;
                        }
                    }
                    break;
                }
                break;
            default:
                if (!hVar.f54244y) {
                    l7.q qVar2 = e0Var.f45111c;
                    if (qVar2 != null) {
                        l7.n nVar3 = qVar2.f45210i;
                        if (nVar3 == null) {
                            nVar3 = new l7.n();
                        }
                        hVar.J(nVar3);
                    } else {
                        JSONObject jSONObject2 = e0Var.f45110b;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        f fVar2 = new f();
                        try {
                            String string2 = jSONObject2.getString("user_code");
                            fVar2.f54231b = string2;
                            fVar2.f54230a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string2}, 1));
                            fVar2.f54232c = jSONObject2.getString("code");
                            fVar2.f54233d = jSONObject2.getLong("interval");
                            hVar.N(fVar2);
                        } catch (JSONException e11) {
                            hVar.J(new l7.n(e11));
                        }
                    }
                    break;
                }
                break;
        }
    }
}

package ads_mobile_sdk;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.ironsource.X3;
import formularization.beachfront;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.gintrap;
import p002kotlin.Unit;
import p002kotlin.text.arytenoidectomy;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class hg2 implements hemolysin {
    public final formularization.attabal a = beachfront.attabal(false);
    public final HashMap b = new HashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        eg2 eg2Var;
        String str;
        hg2 hg2Var;
        String str2;
        String str3;
        Map map2;
        formularization.attabal attabalVar;
        if (dernVar instanceof eg2) {
            eg2Var = (eg2) dernVar;
            int i = eg2Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                eg2Var.i = i - Integer.MIN_VALUE;
            } else {
                eg2Var = new eg2(this, dernVar);
            }
        } else {
            eg2Var = new eg2(this, dernVar);
        }
        Object obj = eg2Var.g;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = eg2Var.i;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            String str4 = (String) map.get("id");
            if (str4 == null) {
                return Unit.f29295attabal;
            }
            str = (String) map.get(X3.g.e);
            String str5 = (String) map.get("result");
            formularization.attabal attabalVar2 = this.a;
            eg2Var.a = this;
            eg2Var.b = map;
            eg2Var.c = str4;
            eg2Var.d = str;
            eg2Var.e = str5;
            eg2Var.f = attabalVar2;
            eg2Var.i = 1;
            if (attabalVar2.attabal(null, eg2Var) == objBeachfront) {
                return objBeachfront;
            }
            hg2Var = this;
            str2 = str4;
            str3 = str5;
            map2 = map;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = eg2Var.f;
            str3 = eg2Var.e;
            str = eg2Var.d;
            str2 = eg2Var.c;
            map2 = eg2Var.b;
            hg2Var = eg2Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            gintrap gintrapVar = (gintrap) hg2Var.b.remove(str2);
            attabalVar.wireman(null);
            if (gintrapVar == null) {
                return Unit.f29295attabal;
            }
            String str6 = (String) map2.get("fail_stack");
            String str7 = (String) map2.get("fail_reason");
            if (str6 == null || str6.length() == 0) {
                str7 = "Unknown Fail Reason.";
            }
            String strCutely = (str6 == null || str6.length() == 0) ? "" : arytenoidectomy.cutely(str6);
            if (str == null || str.length() == 0) {
                if (str3 == null) {
                    gintrapVar.saran(null);
                    return Unit.f29295attabal;
                }
                try {
                    gintrapVar.saran((JsonObject) new Gson().fromJson(str3, JsonObject.class));
                } catch (JsonSyntaxException e) {
                    CancellationException cancellationException = new CancellationException(e.toString());
                    cancellationException.initCause(e);
                    gintrapVar.attabal(cancellationException);
                }
                return Unit.f29295attabal;
            }
            gintrapVar.attabal(new CancellationException(str7 + strCutely));
            y13.a(str7 + strCutely, null, 6);
            return Unit.f29295attabal;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_NAME_RESULT;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(JsonObject jsonObject, wretchedly.dern dernVar) {
        fg2 fg2Var;
        String strA;
        hg2 hg2Var;
        String str;
        JsonObject jsonObject2;
        JsonObject jsonObject3;
        formularization.attabal attabalVar;
        if (dernVar instanceof fg2) {
            fg2Var = (fg2) dernVar;
            int i = fg2Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                fg2Var.i = i - Integer.MIN_VALUE;
            } else {
                fg2Var = new fg2(this, dernVar);
            }
        } else {
            fg2Var = new fg2(this, dernVar);
        }
        Object obj = fg2Var.g;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = fg2Var.i;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            String strA2 = cb1.a(jsonObject, "id", "");
            strA = cb1.a(jsonObject, X3.g.e, "");
            JsonObject jsonObjectA = cb1.a(jsonObject, "result", (JsonObject) null);
            formularization.attabal attabalVar2 = this.a;
            fg2Var.a = this;
            fg2Var.b = jsonObject;
            fg2Var.c = strA2;
            fg2Var.d = strA;
            fg2Var.e = jsonObjectA;
            fg2Var.f = attabalVar2;
            fg2Var.i = 1;
            if (attabalVar2.attabal(null, fg2Var) == objBeachfront) {
                return objBeachfront;
            }
            hg2Var = this;
            str = strA2;
            jsonObject2 = jsonObjectA;
            jsonObject3 = jsonObject;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = fg2Var.f;
            jsonObject2 = fg2Var.e;
            strA = fg2Var.d;
            str = fg2Var.c;
            jsonObject3 = fg2Var.b;
            hg2Var = fg2Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            gintrap gintrapVar = (gintrap) hg2Var.b.remove(str);
            attabalVar.wireman(null);
            if (gintrapVar != null) {
                String strA3 = cb1.a(jsonObject3, "fail_stack", "");
                String strA4 = cb1.a(jsonObject3, "fail_reason", "");
                if (strA3.length() == 0) {
                    strA4 = "Unknown Fail Reason.";
                }
                String strCutely = strA3.length() == 0 ? "" : arytenoidectomy.cutely(strA3);
                if (strA.length() <= 0) {
                    if (jsonObject2 == null) {
                        gintrapVar.saran(null);
                        return Unit.f29295attabal;
                    }
                    gintrapVar.saran(jsonObject2);
                    return Unit.f29295attabal;
                }
                gintrapVar.attabal(new CancellationException(strA4 + strCutely));
                y13.a(strA4 + strCutely, null, 6);
                return Unit.f29295attabal;
            }
            return Unit.f29295attabal;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, gintrap gintrapVar, wretchedly.dern dernVar) {
        gg2 gg2Var;
        formularization.attabal attabalVar;
        hg2 hg2Var;
        if (dernVar instanceof gg2) {
            gg2Var = (gg2) dernVar;
            int i = gg2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                gg2Var.g = i - Integer.MIN_VALUE;
            } else {
                gg2Var = new gg2(this, dernVar);
            }
        } else {
            gg2Var = new gg2(this, dernVar);
        }
        Object obj = gg2Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = gg2Var.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = this.a;
            gg2Var.a = this;
            gg2Var.b = str;
            gg2Var.c = gintrapVar;
            gg2Var.d = attabalVar;
            gg2Var.g = 1;
            if (attabalVar.attabal(null, gg2Var) == objBeachfront) {
                return objBeachfront;
            }
            hg2Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = gg2Var.d;
            gintrapVar = gg2Var.c;
            String str2 = gg2Var.b;
            hg2Var = gg2Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            str = str2;
        }
        try {
            hg2Var.b.put(str, gintrapVar);
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }
}

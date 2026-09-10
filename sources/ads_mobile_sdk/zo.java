package ads_mobile_sdk;

import com.google.gson.JsonObject;
import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class zo implements portwide {
    public final yf2 a;
    public final ug b;
    public final formularize c;
    public final bt d;

    public zo(yf2 requestType, ug appState, formularize adRequest, bt configLoader) {
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(configLoader, "configLoader");
        this.a = requestType;
        this.b = appState;
        this.c = adRequest;
        this.d = configLoader;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.CLD;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        yo yoVar;
        zo zoVar;
        zo zoVar2;
        String str;
        String str2;
        cb1 cb1Var;
        Object objB;
        String str3;
        JsonObject jsonObjectA;
        Object objA;
        JsonObject jsonObject;
        String str4;
        String str5;
        if (dernVar instanceof yo) {
            yoVar = (yo) dernVar;
            int i = yoVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                yoVar.g = i - Integer.MIN_VALUE;
            } else {
                yoVar = new yo(this, dernVar);
            }
        } else {
            yoVar = new yo(this, dernVar);
        }
        Object objB2 = yoVar.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = yoVar.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objB2);
            ug ugVar = this.b;
            String adUnitId = this.c.getAdUnitId();
            String str6 = this.a.a;
            yoVar.a = this;
            yoVar.g = 1;
            objB2 = ugVar.b(adUnitId, str6, yoVar);
            if (objB2 != objBeachfront) {
                zoVar = this;
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            zoVar = (zo) yoVar.a;
            p002kotlin.dern.saneness(objB2);
        } else {
            if (i2 == 2) {
                str = yoVar.b;
                zo zoVar3 = (zo) yoVar.a;
                p002kotlin.dern.saneness(objB2);
                zoVar2 = zoVar3;
                str2 = (String) objB2;
                cb1Var = cb1.a;
                ug ugVar2 = zoVar2.b;
                yoVar.a = zoVar2;
                yoVar.b = str;
                yoVar.c = str2;
                yoVar.d = cb1Var;
                yoVar.g = 3;
                ugVar2.getClass();
                objB = ug.b(ugVar2, yoVar);
                if (objB != objBeachfront) {
                    str3 = str2;
                    objB2 = objB;
                    cb1Var.getClass();
                    jsonObjectA = cb1.a((JsonObject) objB2, "common_settings", (JsonObject) null);
                    bt btVar = zoVar2.d;
                    yoVar.a = str;
                    yoVar.b = str3;
                    yoVar.c = jsonObjectA;
                    yoVar.d = null;
                    yoVar.g = 4;
                    btVar.getClass();
                    objA = bt.a(btVar, yoVar);
                    if (objA != objBeachfront) {
                        jsonObject = jsonObjectA;
                        objB2 = objA;
                        str4 = str;
                        str5 = str3;
                    }
                }
                return objBeachfront;
            }
            if (i2 == 3) {
                cb1 cb1Var2 = yoVar.d;
                str3 = (String) yoVar.c;
                String str7 = yoVar.b;
                zoVar2 = (zo) yoVar.a;
                p002kotlin.dern.saneness(objB2);
                cb1Var = cb1Var2;
                str = str7;
                cb1Var.getClass();
                jsonObjectA = cb1.a((JsonObject) objB2, "common_settings", (JsonObject) null);
                bt btVar2 = zoVar2.d;
                yoVar.a = str;
                yoVar.b = str3;
                yoVar.c = jsonObjectA;
                yoVar.d = null;
                yoVar.g = 4;
                btVar2.getClass();
                objA = bt.a(btVar2, yoVar);
                if (objA != objBeachfront) {
                    jsonObject = jsonObjectA;
                    objB2 = objA;
                    str4 = str;
                    str5 = str3;
                }
                return objBeachfront;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            JsonObject jsonObject2 = (JsonObject) yoVar.c;
            str5 = yoVar.b;
            String str8 = (String) yoVar.a;
            p002kotlin.dern.saneness(objB2);
            jsonObject = jsonObject2;
            str4 = str8;
        }
        return new tn0(new xo(str4, str5, jsonObject, ((Number) objB2).longValue()));
        String str9 = (String) objB2;
        ug ugVar3 = zoVar.b;
        yoVar.a = zoVar;
        yoVar.b = str9;
        yoVar.g = 2;
        Object objA2 = ugVar3.a(yoVar);
        if (objA2 != objBeachfront) {
            zoVar2 = zoVar;
            str = str9;
            objB2 = objA2;
            str2 = (String) objB2;
            cb1Var = cb1.a;
            ug ugVar4 = zoVar2.b;
            yoVar.a = zoVar2;
            yoVar.b = str;
            yoVar.c = str2;
            yoVar.d = cb1Var;
            yoVar.g = 3;
            ugVar4.getClass();
            objB = ug.b(ugVar4, yoVar);
            if (objB != objBeachfront) {
                str3 = str2;
                objB2 = objB;
                cb1Var.getClass();
                jsonObjectA = cb1.a((JsonObject) objB2, "common_settings", (JsonObject) null);
                bt btVar3 = zoVar2.d;
                yoVar.a = str;
                yoVar.b = str3;
                yoVar.c = jsonObjectA;
                yoVar.d = null;
                yoVar.g = 4;
                btVar3.getClass();
                objA = bt.a(btVar3, yoVar);
                if (objA != objBeachfront) {
                    jsonObject = jsonObjectA;
                    objB2 = objA;
                    str4 = str;
                    str5 = str3;
                    return new tn0(new xo(str4, str5, jsonObject, ((Number) objB2).longValue()));
                }
            }
        }
        return objBeachfront;
    }
}

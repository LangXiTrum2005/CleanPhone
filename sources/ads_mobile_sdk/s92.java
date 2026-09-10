package ads_mobile_sdk;

import android.net.Uri;
import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import formularization.beachfront;
import java.io.Closeable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.arytenoidectomy;
import kotlinx.coroutines.flow.marial;
import kotlinx.coroutines.saran;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$BooleanRef;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import p002kotlin.text.Charsets;
import p002kotlin.text.StringsKt;
import p002kotlin.time.DurationUnit;
import saneness.evenfall;
import saneness.hobby;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public abstract class s92 extends k92 {
    public static final rn0 v = new rn0("The ad has already been shown.", k41.AD_RESPONSE_ALREADY_USED);
    public static final rn0 w = new rn0("The ad format requested does not match the ad format specified when generating a Signal.", k41.INVALID_REQUEST);
    public static final rn0 x = new rn0("The request ID on the ad string does not match the request ID from any valid signal request.", k41.REQUEST_ID_MISMATCH);
    public static final rn0 y = new rn0("The ad response was malformed.", k41.INVALID_AD_RESPONSE);
    public final op2 o;
    public final py p;
    public final String q;
    public final Gson r;
    public final hobby s;
    public final b63 t;
    public final formularization.attabal u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s92(op2 signalGenerationMap, py cryptoUtil, String adResponse, Gson gson, hobby httpClient, b63 urlPinger, saran loadScope, saran backgroundScope, l13 traceMetaSet, jk0 flags, ri2 rootTraceCreator, String requestId, yf2 requestType, String appId, gy0 inspectorAdLifecycleMonitor, arytenoidectomy cancellationChannel) {
        super(loadScope, backgroundScope, traceMetaSet, flags, rootTraceCreator, requestId, requestType, null, false, appId, inspectorAdLifecycleMonitor, cancellationChannel);
        Intrinsics.checkNotNullParameter(signalGenerationMap, "signalGenerationMap");
        Intrinsics.checkNotNullParameter(cryptoUtil, "cryptoUtil");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(urlPinger, "urlPinger");
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(cancellationChannel, "cancellationChannel");
        this.o = signalGenerationMap;
        this.p = cryptoUtil;
        this.q = adResponse;
        this.r = gson;
        this.s = httpClient;
        this.t = urlPinger;
        this.u = beachfront.saneness(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c6 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #3 {, blocks: (B:12:0x0038, B:24:0x00c0, B:26:0x00c6), top: B:64:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bd -> B:24:0x00c0). Please report as a decompilation issue!!! */
    public final Object a(xt0 xt0Var, wretchedly.dern dernVar) {
        o92 o92Var;
        int iMax;
        s92 s92Var;
        int i;
        xt0 xt0Var2;
        w03 w03Var;
        w03 w03VarA;
        Object objSaneness;
        xt0 xt0Var3;
        spartacist spartacistVar;
        if (dernVar instanceof o92) {
            o92Var = (o92) dernVar;
            int i2 = o92Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o92Var.i = i2 - Integer.MIN_VALUE;
            } else {
                o92Var = new o92(this, dernVar);
            }
        } else {
            o92Var = new o92(this, dernVar);
        }
        Object obj = o92Var.g;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i3 = o92Var.i;
        if (i3 == 0) {
            p002kotlin.dern.saneness(obj);
            jk0 jk0Var = this.d;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:gbid_type_two_serving_fetch_retries", X3.i.W);
            iMax = Math.max(1, ((Number) jk0Var.a("gads:gbid_type_two_serving_fetch_retries", 3, zk.f)).intValue());
            s92Var = this;
            i = 0;
            xt0Var2 = xt0Var;
            i++;
            no0 no0Var = no0.CUI_NAME_TYPE2_FETCH;
            WeakHashMap weakHashMap = j13.a;
            w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            hobby hobbyVar = s92Var.s;
            jk0 jk0Var2 = s92Var.d;
            jk0Var2.getClass();
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            long jMolybdenite = p002kotlin.time.dern.molybdenite(60, DurationUnit.SECONDS);
            Intrinsics.checkNotNullParameter("gads:gbid_type_two_serving_fetch_timeout:millis", X3.i.W);
            p002kotlin.time.saneness sanenessVarCutely = p002kotlin.time.saneness.cutely(((p002kotlin.time.saneness) jk0Var2.a("gads:gbid_type_two_serving_fetch_timeout:millis", p002kotlin.time.saneness.cutely(jMolybdenite), zk.j)).getRawValue());
            o92Var.a = s92Var;
            o92Var.b = xt0Var2;
            o92Var.c = w03VarA;
            o92Var.d = w03VarA;
            o92Var.e = i;
            o92Var.f = iMax;
            o92Var.i = 1;
            objSaneness = hobby.saneness(hobbyVar, xt0Var2, sanenessVarCutely, o92Var, 12);
            if (objSaneness == objBeachfront) {
                return objBeachfront;
            }
            xt0Var3 = xt0Var2;
            obj = objSaneness;
            w03Var = w03VarA;
            spartacistVar = (spartacist) obj;
            if (spartacistVar instanceof nn0) {
                y13.a((nn0) spartacistVar, false);
            }
            interaction.saneness.attabal(w03VarA, null);
            if (spartacistVar instanceof tn0) {
            }
            return spartacistVar;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iMax = o92Var.f;
        i = o92Var.e;
        w03VarA = o92Var.d;
        w03Var = o92Var.c;
        xt0Var3 = o92Var.b;
        s92Var = o92Var.a;
        p002kotlin.dern.saneness(obj);
        spartacistVar = (spartacist) obj;
        if (spartacistVar instanceof nn0) {
            y13.a((nn0) spartacistVar, false);
        }
        interaction.saneness.attabal(w03VarA, null);
        if (!(spartacistVar instanceof tn0) || i == iMax || i >= iMax) {
            return spartacistVar;
        }
        try {
            xt0Var2 = xt0Var3;
            i++;
            no0 no0Var2 = no0.CUI_NAME_TYPE2_FETCH;
            WeakHashMap weakHashMap2 = j13.a;
            w03VarA = j13.a(no0Var2, adultoid.formularize(), true);
            hobby hobbyVar2 = s92Var.s;
            jk0 jk0Var3 = s92Var.d;
            jk0Var3.getClass();
            p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
            long jMolybdenite2 = p002kotlin.time.dern.molybdenite(60, DurationUnit.SECONDS);
            Intrinsics.checkNotNullParameter("gads:gbid_type_two_serving_fetch_timeout:millis", X3.i.W);
            p002kotlin.time.saneness sanenessVarCutely2 = p002kotlin.time.saneness.cutely(((p002kotlin.time.saneness) jk0Var3.a("gads:gbid_type_two_serving_fetch_timeout:millis", p002kotlin.time.saneness.cutely(jMolybdenite2), zk.j)).getRawValue());
            o92Var.a = s92Var;
            o92Var.b = xt0Var2;
            o92Var.c = w03VarA;
            o92Var.d = w03VarA;
            o92Var.e = i;
            o92Var.f = iMax;
            o92Var.i = 1;
            objSaneness = hobby.saneness(hobbyVar2, xt0Var2, sanenessVarCutely2, o92Var, 12);
            if (objSaneness == objBeachfront) {
                return objBeachfront;
            }
            xt0Var3 = xt0Var2;
            obj = objSaneness;
            w03Var = w03VarA;
            spartacistVar = (spartacist) obj;
            if (spartacistVar instanceof nn0) {
                y13.a((nn0) spartacistVar, false);
            }
            interaction.saneness.attabal(w03VarA, null);
            if (spartacistVar instanceof tn0) {
            }
            return spartacistVar;
        } catch (Throwable th) {
            th = th;
            w03Var = w03VarA;
            try {
                w03Var.b(th);
                if (th instanceof evenfall) {
                    throw th;
                }
                w03Var.a(th);
                if (th instanceof TimeoutCancellationException) {
                    throw new cp0(th);
                }
                if (th instanceof CancellationException) {
                    throw new bn0(th);
                }
                if (th instanceof yn0) {
                    throw th;
                }
                throw new gn0(th);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    interaction.saneness.attabal(w03VarA, th2);
                    throw th3;
                }
            }
        }
    }

    public abstract Object a(String str, jp2 jp2Var, p92 p92Var);

    public final List a(JsonObject jsonObject) {
        try {
            String strA = cb1.a(jsonObject, "settings", "");
            if (StringsKt.empress(strA)) {
                return adultoid.formularize();
            }
            JsonArray jsonArrayD = cb1.d((JsonObject) this.r.fromJson(strA, JsonObject.class), "nofill_urls");
            ArrayList arrayList = new ArrayList();
            if (jsonArrayD != null) {
                int i = 0;
                for (JsonElement jsonElement : jsonArrayD) {
                    int i2 = i + 1;
                    if (i < 0) {
                        adultoid.dovishness();
                    }
                    JsonElement jsonElement2 = jsonElement;
                    Intrinsics.beachfront(jsonElement2);
                    String asString = jsonElement2.getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                    Uri uri = Uri.parse(asString);
                    if (uri != null) {
                        arrayList.add(uri);
                    }
                    i = i2;
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return adultoid.formularize();
        }
    }

    @Override // ads_mobile_sdk.k92
    public final Object a(w82 w82Var) {
        return a(this, (wretchedly.dern) w82Var);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02c5 A[Catch: all -> 0x02c2, TRY_ENTER, TryCatch #1 {all -> 0x02c2, blocks: (B:96:0x029e, B:98:0x02a6, B:105:0x02c5, B:107:0x02cf, B:109:0x02d6, B:108:0x02d4), top: B:177:0x029e }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02cf A[Catch: all -> 0x02c2, TryCatch #1 {all -> 0x02c2, blocks: (B:96:0x029e, B:98:0x02a6, B:105:0x02c5, B:107:0x02cf, B:109:0x02d6, B:108:0x02d4), top: B:177:0x029e }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02d4 A[Catch: all -> 0x02c2, TryCatch #1 {all -> 0x02c2, blocks: (B:96:0x029e, B:98:0x02a6, B:105:0x02c5, B:107:0x02cf, B:109:0x02d6, B:108:0x02d4), top: B:177:0x029e }] */
    /* JADX WARN: Code duplicated, block: B:112:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:117:0x0307 A[Catch: all -> 0x0062, TryCatch #2 {all -> 0x0062, blocks: (B:140:0x0379, B:142:0x037d, B:19:0x005d, B:123:0x0325, B:125:0x032b, B:126:0x033c, B:128:0x0349, B:130:0x0350, B:132:0x0354, B:134:0x035b, B:133:0x0359, B:129:0x034e, B:115:0x0300, B:117:0x0307, B:119:0x030e, B:118:0x030c, B:149:0x0394, B:150:0x0397), top: B:178:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:118:0x030c A[Catch: all -> 0x0062, TryCatch #2 {all -> 0x0062, blocks: (B:140:0x0379, B:142:0x037d, B:19:0x005d, B:123:0x0325, B:125:0x032b, B:126:0x033c, B:128:0x0349, B:130:0x0350, B:132:0x0354, B:134:0x035b, B:133:0x0359, B:129:0x034e, B:115:0x0300, B:117:0x0307, B:119:0x030e, B:118:0x030c, B:149:0x0394, B:150:0x0397), top: B:178:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0323  */
    /* JADX WARN: Code duplicated, block: B:122:0x0324  */
    /* JADX WARN: Code duplicated, block: B:125:0x032b A[Catch: all -> 0x0062, TryCatch #2 {all -> 0x0062, blocks: (B:140:0x0379, B:142:0x037d, B:19:0x005d, B:123:0x0325, B:125:0x032b, B:126:0x033c, B:128:0x0349, B:130:0x0350, B:132:0x0354, B:134:0x035b, B:133:0x0359, B:129:0x034e, B:115:0x0300, B:117:0x0307, B:119:0x030e, B:118:0x030c, B:149:0x0394, B:150:0x0397), top: B:178:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:126:0x033c A[Catch: all -> 0x0062, TryCatch #2 {all -> 0x0062, blocks: (B:140:0x0379, B:142:0x037d, B:19:0x005d, B:123:0x0325, B:125:0x032b, B:126:0x033c, B:128:0x0349, B:130:0x0350, B:132:0x0354, B:134:0x035b, B:133:0x0359, B:129:0x034e, B:115:0x0300, B:117:0x0307, B:119:0x030e, B:118:0x030c, B:149:0x0394, B:150:0x0397), top: B:178:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0349 A[Catch: all -> 0x0062, TryCatch #2 {all -> 0x0062, blocks: (B:140:0x0379, B:142:0x037d, B:19:0x005d, B:123:0x0325, B:125:0x032b, B:126:0x033c, B:128:0x0349, B:130:0x0350, B:132:0x0354, B:134:0x035b, B:133:0x0359, B:129:0x034e, B:115:0x0300, B:117:0x0307, B:119:0x030e, B:118:0x030c, B:149:0x0394, B:150:0x0397), top: B:178:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:129:0x034e A[Catch: all -> 0x0062, TryCatch #2 {all -> 0x0062, blocks: (B:140:0x0379, B:142:0x037d, B:19:0x005d, B:123:0x0325, B:125:0x032b, B:126:0x033c, B:128:0x0349, B:130:0x0350, B:132:0x0354, B:134:0x035b, B:133:0x0359, B:129:0x034e, B:115:0x0300, B:117:0x0307, B:119:0x030e, B:118:0x030c, B:149:0x0394, B:150:0x0397), top: B:178:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0354 A[Catch: all -> 0x0062, TryCatch #2 {all -> 0x0062, blocks: (B:140:0x0379, B:142:0x037d, B:19:0x005d, B:123:0x0325, B:125:0x032b, B:126:0x033c, B:128:0x0349, B:130:0x0350, B:132:0x0354, B:134:0x035b, B:133:0x0359, B:129:0x034e, B:115:0x0300, B:117:0x0307, B:119:0x030e, B:118:0x030c, B:149:0x0394, B:150:0x0397), top: B:178:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0359 A[Catch: all -> 0x0062, TryCatch #2 {all -> 0x0062, blocks: (B:140:0x0379, B:142:0x037d, B:19:0x005d, B:123:0x0325, B:125:0x032b, B:126:0x033c, B:128:0x0349, B:130:0x0350, B:132:0x0354, B:134:0x035b, B:133:0x0359, B:129:0x034e, B:115:0x0300, B:117:0x0307, B:119:0x030e, B:118:0x030c, B:149:0x0394, B:150:0x0397), top: B:178:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0372  */
    /* JADX WARN: Code duplicated, block: B:142:0x037d A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #2 {all -> 0x0062, blocks: (B:140:0x0379, B:142:0x037d, B:19:0x005d, B:123:0x0325, B:125:0x032b, B:126:0x033c, B:128:0x0349, B:130:0x0350, B:132:0x0354, B:134:0x035b, B:133:0x0359, B:129:0x034e, B:115:0x0300, B:117:0x0307, B:119:0x030e, B:118:0x030c, B:149:0x0394, B:150:0x0397), top: B:178:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:154:0x03a0 A[Catch: all -> 0x03b0, TryCatch #10 {all -> 0x03b0, blocks: (B:152:0x0399, B:154:0x03a0, B:156:0x03a7, B:158:0x03ab, B:160:0x03af, B:163:0x03b3, B:164:0x03b8, B:165:0x03b9, B:166:0x03c0, B:167:0x03c1, B:168:0x03c8, B:169:0x03c9), top: B:191:0x0399 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x03a7 A[Catch: all -> 0x03b0, TryCatch #10 {all -> 0x03b0, blocks: (B:152:0x0399, B:154:0x03a0, B:156:0x03a7, B:158:0x03ab, B:160:0x03af, B:163:0x03b3, B:164:0x03b8, B:165:0x03b9, B:166:0x03c0, B:167:0x03c1, B:168:0x03c8, B:169:0x03c9), top: B:191:0x0399 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x03ab A[Catch: all -> 0x03b0, TryCatch #10 {all -> 0x03b0, blocks: (B:152:0x0399, B:154:0x03a0, B:156:0x03a7, B:158:0x03ab, B:160:0x03af, B:163:0x03b3, B:164:0x03b8, B:165:0x03b9, B:166:0x03c0, B:167:0x03c1, B:168:0x03c8, B:169:0x03c9), top: B:191:0x0399 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x03af A[Catch: all -> 0x03b0, TryCatch #10 {all -> 0x03b0, blocks: (B:152:0x0399, B:154:0x03a0, B:156:0x03a7, B:158:0x03ab, B:160:0x03af, B:163:0x03b3, B:164:0x03b8, B:165:0x03b9, B:166:0x03c0, B:167:0x03c1, B:168:0x03c8, B:169:0x03c9), top: B:191:0x0399 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x03b3 A[Catch: all -> 0x03b0, TryCatch #10 {all -> 0x03b0, blocks: (B:152:0x0399, B:154:0x03a0, B:156:0x03a7, B:158:0x03ab, B:160:0x03af, B:163:0x03b3, B:164:0x03b8, B:165:0x03b9, B:166:0x03c0, B:167:0x03c1, B:168:0x03c8, B:169:0x03c9), top: B:191:0x0399 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x03b9 A[Catch: all -> 0x03b0, TryCatch #10 {all -> 0x03b0, blocks: (B:152:0x0399, B:154:0x03a0, B:156:0x03a7, B:158:0x03ab, B:160:0x03af, B:163:0x03b3, B:164:0x03b8, B:165:0x03b9, B:166:0x03c0, B:167:0x03c1, B:168:0x03c8, B:169:0x03c9), top: B:191:0x0399 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x03c1 A[Catch: all -> 0x03b0, TryCatch #10 {all -> 0x03b0, blocks: (B:152:0x0399, B:154:0x03a0, B:156:0x03a7, B:158:0x03ab, B:160:0x03af, B:163:0x03b3, B:164:0x03b8, B:165:0x03b9, B:166:0x03c0, B:167:0x03c1, B:168:0x03c8, B:169:0x03c9), top: B:191:0x0399 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x03c9 A[Catch: all -> 0x03b0, TRY_LEAVE, TryCatch #10 {all -> 0x03b0, blocks: (B:152:0x0399, B:154:0x03a0, B:156:0x03a7, B:158:0x03ab, B:160:0x03af, B:163:0x03b3, B:164:0x03b8, B:165:0x03b9, B:166:0x03c0, B:167:0x03c1, B:168:0x03c8, B:169:0x03c9), top: B:191:0x0399 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f8 A[Catch: all -> 0x020a, TryCatch #6 {all -> 0x020a, blocks: (B:71:0x01f4, B:73:0x01f8, B:76:0x020f, B:78:0x0215, B:80:0x0227, B:85:0x0240, B:87:0x024e, B:89:0x0252, B:90:0x0256, B:86:0x024a), top: B:184:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x020f A[Catch: all -> 0x020a, TryCatch #6 {all -> 0x020a, blocks: (B:71:0x01f4, B:73:0x01f8, B:76:0x020f, B:78:0x0215, B:80:0x0227, B:85:0x0240, B:87:0x024e, B:89:0x0252, B:90:0x0256, B:86:0x024a), top: B:184:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0215 A[Catch: all -> 0x020a, TryCatch #6 {all -> 0x020a, blocks: (B:71:0x01f4, B:73:0x01f8, B:76:0x020f, B:78:0x0215, B:80:0x0227, B:85:0x0240, B:87:0x024e, B:89:0x0252, B:90:0x0256, B:86:0x024a), top: B:184:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0227 A[Catch: all -> 0x020a, TRY_LEAVE, TryCatch #6 {all -> 0x020a, blocks: (B:71:0x01f4, B:73:0x01f8, B:76:0x020f, B:78:0x0215, B:80:0x0227, B:85:0x0240, B:87:0x024e, B:89:0x0252, B:90:0x0256, B:86:0x024a), top: B:184:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0240 A[Catch: all -> 0x020a, TRY_ENTER, TryCatch #6 {all -> 0x020a, blocks: (B:71:0x01f4, B:73:0x01f8, B:76:0x020f, B:78:0x0215, B:80:0x0227, B:85:0x0240, B:87:0x024e, B:89:0x0252, B:90:0x0256, B:86:0x024a), top: B:184:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x024a A[Catch: all -> 0x020a, TryCatch #6 {all -> 0x020a, blocks: (B:71:0x01f4, B:73:0x01f8, B:76:0x020f, B:78:0x0215, B:80:0x0227, B:85:0x0240, B:87:0x024e, B:89:0x0252, B:90:0x0256, B:86:0x024a), top: B:184:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0252 A[Catch: all -> 0x020a, TryCatch #6 {all -> 0x020a, blocks: (B:71:0x01f4, B:73:0x01f8, B:76:0x020f, B:78:0x0215, B:80:0x0227, B:85:0x0240, B:87:0x024e, B:89:0x0252, B:90:0x0256, B:86:0x024a), top: B:184:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0295  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a6 A[Catch: all -> 0x02c2, TRY_LEAVE, TryCatch #1 {all -> 0x02c2, blocks: (B:96:0x029e, B:98:0x02a6, B:105:0x02c5, B:107:0x02cf, B:109:0x02d6, B:108:0x02d4), top: B:177:0x029e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [T] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [formularization.attabal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v8, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v7, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r1v16, types: [T, ads_mobile_sdk.jp2] */
    /* JADX WARN: Type inference failed for: r1v44, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11, types: [formularization.attabal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r3v36, types: [formularization.attabal] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v46, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v4, types: [ads_mobile_sdk.w03, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2, types: [T] */
    /* JADX WARN: Type inference failed for: r7v25, types: [ads_mobile_sdk.py] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static Object a(s92 s92Var, wretchedly.dern dernVar) {
        p92 p92Var;
        ?? r3;
        ?? r6;
        ?? A;
        ?? asString;
        s92 s92Var2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        formularization.attabal attabalVar;
        ?? r14;
        kotlinx.coroutines.flow.dern dernVarGintrap;
        ?? r13;
        Ref$ObjectRef ref$ObjectRef5;
        Ref$ObjectRef ref$ObjectRef6;
        Ref$ObjectRef ref$ObjectRef7;
        Ref$ObjectRef ref$ObjectRef8;
        ?? r15;
        ?? r16;
        Ref$ObjectRef ref$ObjectRef9;
        s92 s92Var3;
        ?? r17;
        ?? r1;
        ?? r0;
        ?? r2;
        String str;
        int iIntValue;
        Object objA;
        ?? r18;
        ?? r19;
        String str2;
        Ref$ObjectRef ref$ObjectRef10;
        ?? r12;
        spartacist spartacistVarA;
        Object obj;
        ?? r110;
        ?? r111;
        int i;
        Ref$ObjectRef ref$ObjectRef11;
        s92 s92Var4;
        Ref$ObjectRef ref$ObjectRef12;
        op2 op2Var;
        String str3;
        Object obj2;
        jp2 jp2Var;
        s92 s92Var5;
        Ref$ObjectRef ref$ObjectRef13;
        ?? r5;
        ?? r7;
        ?? r8;
        Object obj3;
        String str4;
        Ref$ObjectRef ref$ObjectRef14;
        ?? r9;
        ?? r10;
        spartacist spartacistVar;
        Object obj4;
        String str5;
        Object obj5;
        jp2 jp2Var2;
        ?? r4;
        ?? r11;
        int i2;
        if (!(dernVar instanceof p92) || (A = (i2 = (p92Var = (p92) dernVar).m) & Integer.MIN_VALUE) == 0) {
            p92Var = new p92(s92Var, dernVar);
        } else {
            p92Var.m = i2 - Integer.MIN_VALUE;
        }
        p92 p92Var2 = p92Var;
        Object objA2 = p92Var2.k;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        ?? r20 = p92Var2.m;
        try {
            try {
                switch (r20) {
                    case 0:
                        p002kotlin.dern.saneness(objA2);
                        no0 no0Var = no0.CUI_NAME_SCAR_RENDERING;
                        WeakHashMap weakHashMap = j13.a;
                        A = j13.a(no0Var, adultoid.formularize(), true);
                        try {
                            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                            Ref$ObjectRef ref$ObjectRef15 = new Ref$ObjectRef();
                            ref$ObjectRef15.element = s92Var.q;
                            Ref$ObjectRef ref$ObjectRef16 = new Ref$ObjectRef();
                            try {
                                JsonElement jsonElement = ((JsonObject) s92Var.r.fromJson(s92Var.q, JsonObject.class)).get("request_id");
                                asString = jsonElement != null ? jsonElement.getAsString() : 0;
                                break;
                            } catch (Exception unused) {
                            }
                            ref$ObjectRef16.element = asString;
                            if (asString == 0) {
                                py pyVar = s92Var.p;
                                String str6 = s92Var.q;
                                pyVar.getClass();
                                spartacist spartacistVarA2 = py.a(str6);
                                if (spartacistVarA2 instanceof nn0) {
                                    rn0 rn0Var = y;
                                    y13.a((nn0) rn0Var, false);
                                    dernVarGintrap = marial.gintrap(new Pair(rn0Var, null));
                                    r8 = A;
                                } else {
                                    Intrinsics.competently(spartacistVarA2, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                                    Pair pair = (Pair) ((tn0) spartacistVarA2).b;
                                    ?? r112 = (String) pair.component1();
                                    ref$ObjectRef16.element = (String) pair.component2();
                                    ref$ObjectRef15.element = r112;
                                    ref$BooleanRef2.element = true;
                                }
                                if (dernVarGintrap instanceof nn0) {
                                    y13.a((nn0) dernVarGintrap, false);
                                }
                                interaction.saneness.attabal(r8, null);
                                return dernVarGintrap;
                            }
                            j13.a().a.a.d = (String) ref$ObjectRef16.element;
                            Ref$ObjectRef ref$ObjectRef17 = new Ref$ObjectRef();
                            Ref$ObjectRef ref$ObjectRef18 = new Ref$ObjectRef();
                            formularization.attabal attabalVar2 = s92Var.u;
                            p92Var2.a = s92Var;
                            p92Var2.b = A;
                            p92Var2.c = A;
                            p92Var2.d = ref$BooleanRef2;
                            p92Var2.e = ref$ObjectRef15;
                            p92Var2.f = ref$ObjectRef16;
                            p92Var2.g = ref$ObjectRef18;
                            p92Var2.h = attabalVar2;
                            p92Var2.i = ref$ObjectRef17;
                            p92Var2.m = 1;
                            if (attabalVar2.attabal(null, p92Var2) != objBeachfront) {
                                s92Var2 = s92Var;
                                ref$ObjectRef = ref$ObjectRef17;
                                ref$ObjectRef2 = ref$ObjectRef18;
                                ref$BooleanRef = ref$BooleanRef2;
                                ?? r113 = A;
                                ref$ObjectRef3 = ref$ObjectRef16;
                                ref$ObjectRef4 = ref$ObjectRef15;
                                attabalVar = attabalVar2;
                                r14 = r113;
                                r13 = r113;
                                op2 op2Var2 = s92Var2.o;
                                String str7 = (String) ref$ObjectRef3.element;
                                p92Var2.a = s92Var2;
                                p92Var2.b = r14;
                                p92Var2.c = r13;
                                p92Var2.d = ref$BooleanRef;
                                p92Var2.e = ref$ObjectRef4;
                                p92Var2.f = ref$ObjectRef3;
                                p92Var2.g = ref$ObjectRef2;
                                p92Var2.h = attabalVar;
                                p92Var2.i = ref$ObjectRef;
                                ref$ObjectRef5 = ref$ObjectRef;
                                p92Var2.m = 2;
                                objA2 = op2Var2.a(str7, p92Var2);
                                if (objA2 != objBeachfront) {
                                    ref$ObjectRef6 = ref$ObjectRef4;
                                    ref$ObjectRef7 = ref$ObjectRef2;
                                    ref$ObjectRef8 = ref$ObjectRef5;
                                    r20 = attabalVar;
                                    r16 = r13;
                                    r15 = r14;
                                    ref$ObjectRef9 = ref$ObjectRef3;
                                    A = r16;
                                    s92Var3 = s92Var2;
                                    try {
                                        r1 = (jp2) objA2;
                                        try {
                                            if (r1 == 0) {
                                                rn0 rn0Var2 = x;
                                                y13.a((nn0) rn0Var2, false);
                                                dernVarGintrap = marial.gintrap(new Pair(rn0Var2, null));
                                                obj = null;
                                            } else {
                                                ref$ObjectRef7.element = r1;
                                                if (ref$BooleanRef.element) {
                                                    spartacistVarA = s92Var3.p.a((String) ref$ObjectRef6.element, (String) ref$ObjectRef9.element, r1);
                                                    if (spartacistVarA instanceof nn0) {
                                                        nn0 nn0Var = (nn0) spartacistVarA;
                                                        y13.a(nn0Var, false);
                                                        obj = null;
                                                        dernVarGintrap = marial.gintrap(new Pair(nn0Var, null));
                                                    } else {
                                                        Intrinsics.competently(spartacistVarA, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                                                        r0 = (String) ((tn0) spartacistVarA).b;
                                                    }
                                                } else {
                                                    r0 = (String) ref$ObjectRef6.element;
                                                }
                                                ref$ObjectRef8.element = r0;
                                                r2 = r0;
                                                if (r0 == 0) {
                                                    Intrinsics.preprohormone("decryptedAdResponseBlob");
                                                    r2 = 0;
                                                }
                                                s92Var3.getClass();
                                                Pair pairA = a((String) r2);
                                                str = (String) pairA.component1();
                                                iIntValue = ((Number) pairA.component2()).intValue();
                                                op2 op2Var3 = s92Var3.o;
                                                String str8 = (String) ref$ObjectRef9.element;
                                                p92Var2.a = s92Var3;
                                                p92Var2.b = r15;
                                                p92Var2.c = A;
                                                p92Var2.d = ref$ObjectRef9;
                                                p92Var2.e = ref$ObjectRef7;
                                                p92Var2.f = r20;
                                                p92Var2.g = ref$ObjectRef8;
                                                p92Var2.h = str;
                                                r17 = r20;
                                                try {
                                                    p92Var2.i = null;
                                                    p92Var2.j = iIntValue;
                                                    p92Var2.m = 3;
                                                    objA = op2Var3.a(str8, str, p92Var2);
                                                    if (objA != objBeachfront) {
                                                        r18 = r15;
                                                        r19 = A;
                                                        str2 = str;
                                                        objA2 = objA;
                                                        ref$ObjectRef10 = ref$ObjectRef9;
                                                        r12 = r17;
                                                        i = iIntValue;
                                                        ref$ObjectRef11 = ref$ObjectRef8;
                                                        s92Var4 = s92Var3;
                                                        ref$ObjectRef12 = ref$ObjectRef7;
                                                        try {
                                                            if (((Boolean) objA2).booleanValue()) {
                                                                rn0 rn0Var3 = v;
                                                                y13.a((nn0) rn0Var3, false);
                                                                dernVarGintrap = marial.gintrap(new Pair(rn0Var3, null));
                                                                try {
                                                                    r12.wireman(null);
                                                                    r8 = r19;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    A = r19;
                                                                    r6 = r18;
                                                                    try {
                                                                        r6.b(th);
                                                                        if (!(th instanceof evenfall)) {
                                                                            r6.a(th);
                                                                            if (!(th instanceof TimeoutCancellationException)) {
                                                                                if (!(th instanceof CancellationException)) {
                                                                                    if (th instanceof yn0) {
                                                                                        throw th;
                                                                                    }
                                                                                    throw new gn0(th);
                                                                                }
                                                                                throw new bn0(th);
                                                                            }
                                                                            throw new cp0(th);
                                                                        }
                                                                        throw th;
                                                                    } catch (Throwable th2) {
                                                                        try {
                                                                            throw th2;
                                                                        } catch (Throwable th3) {
                                                                            interaction.saneness.attabal(A, th2);
                                                                            throw th3;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                op2Var = s92Var4.o;
                                                                str3 = (String) ref$ObjectRef10.element;
                                                                obj2 = ref$ObjectRef12.element;
                                                                if (obj2 == null) {
                                                                    Intrinsics.preprohormone("signalGenerationData");
                                                                    jp2Var = null;
                                                                } else {
                                                                    jp2Var = (jp2) obj2;
                                                                }
                                                                p92Var2.a = s92Var4;
                                                                p92Var2.b = r18;
                                                                p92Var2.c = r19;
                                                                p92Var2.d = ref$ObjectRef12;
                                                                p92Var2.e = r12;
                                                                p92Var2.f = ref$ObjectRef11;
                                                                p92Var2.g = null;
                                                                p92Var2.h = null;
                                                                p92Var2.m = 4;
                                                                if (op2Var.a(str3, str2, jp2Var, i, p92Var2) != objBeachfront) {
                                                                    s92Var5 = s92Var4;
                                                                    r3 = r12;
                                                                    ref$ObjectRef13 = ref$ObjectRef12;
                                                                    r5 = r19;
                                                                    r7 = r18;
                                                                    Unit unit = Unit.f29295attabal;
                                                                    r3.wireman(null);
                                                                    obj3 = ref$ObjectRef11.element;
                                                                    if (obj3 == null) {
                                                                        Intrinsics.preprohormone("decryptedAdResponseBlob");
                                                                        str4 = null;
                                                                    } else {
                                                                        str4 = (String) obj3;
                                                                    }
                                                                    p92Var2.a = s92Var5;
                                                                    p92Var2.b = r7;
                                                                    p92Var2.c = r5;
                                                                    p92Var2.d = ref$ObjectRef13;
                                                                    p92Var2.e = ref$ObjectRef11;
                                                                    p92Var2.f = ref$ObjectRef11;
                                                                    p92Var2.m = 5;
                                                                    objA2 = s92Var5.a(str4, p92Var2);
                                                                    if (objA2 != objBeachfront) {
                                                                        ref$ObjectRef14 = ref$ObjectRef11;
                                                                        r10 = r5;
                                                                        r9 = r7;
                                                                        spartacistVar = (spartacist) objA2;
                                                                        if (spartacistVar instanceof nn0) {
                                                                            nn0 nn0Var2 = (nn0) spartacistVar;
                                                                            y13.a(nn0Var2, false);
                                                                            dernVarGintrap = marial.gintrap(new Pair(nn0Var2, null));
                                                                            r8 = r10;
                                                                        } else {
                                                                            Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                                                                            ref$ObjectRef11.element = ((tn0) spartacistVar).b;
                                                                            obj4 = ref$ObjectRef14.element;
                                                                            if (obj4 == null) {
                                                                                Intrinsics.preprohormone("decryptedAdResponseBlob");
                                                                                str5 = null;
                                                                            } else {
                                                                                str5 = (String) obj4;
                                                                            }
                                                                            obj5 = ref$ObjectRef13.element;
                                                                            if (obj5 == null) {
                                                                                Intrinsics.preprohormone("signalGenerationData");
                                                                                jp2Var2 = null;
                                                                            } else {
                                                                                jp2Var2 = (jp2) obj5;
                                                                            }
                                                                            p92Var2.a = r9;
                                                                            p92Var2.b = r10;
                                                                            p92Var2.c = null;
                                                                            p92Var2.d = null;
                                                                            p92Var2.e = null;
                                                                            p92Var2.f = null;
                                                                            p92Var2.m = 6;
                                                                            objA2 = s92Var5.a(str5, jp2Var2, p92Var2);
                                                                            if (objA2 != objBeachfront) {
                                                                                r4 = r10;
                                                                                r11 = r9;
                                                                                dernVarGintrap = (kotlinx.coroutines.flow.dern) objA2;
                                                                                r8 = r4;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (dernVarGintrap instanceof nn0) {
                                                                y13.a((nn0) dernVarGintrap, false);
                                                            }
                                                            interaction.saneness.attabal(r8, null);
                                                            return dernVarGintrap;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            r3 = r12;
                                                            r111 = r19;
                                                            r110 = r18;
                                                            r3.wireman(null);
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    r3 = r17;
                                                    r3.wireman(null);
                                                    throw th;
                                                }
                                            }
                                            r20.wireman(obj);
                                            r8 = A;
                                            if (dernVarGintrap instanceof nn0) {
                                                y13.a((nn0) dernVarGintrap, false);
                                            }
                                            interaction.saneness.attabal(r8, null);
                                            return dernVarGintrap;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            r6 = r15;
                                            r6.b(th);
                                            if (!(th instanceof evenfall)) {
                                                r6.a(th);
                                                if (!(th instanceof TimeoutCancellationException)) {
                                                    if (!(th instanceof CancellationException)) {
                                                        if (th instanceof yn0) {
                                                            throw th;
                                                        }
                                                        throw new gn0(th);
                                                    }
                                                    throw new bn0(th);
                                                }
                                                throw new cp0(th);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        r17 = r20;
                                    }
                                }
                            }
                            return objBeachfront;
                        } catch (Throwable th8) {
                            th = th8;
                            r6 = A;
                            r6.b(th);
                            if (!(th instanceof evenfall)) {
                                r6.a(th);
                                if (!(th instanceof TimeoutCancellationException)) {
                                    if (!(th instanceof CancellationException)) {
                                        if (th instanceof yn0) {
                                            throw th;
                                        }
                                        throw new gn0(th);
                                    }
                                    throw new bn0(th);
                                }
                                throw new cp0(th);
                            }
                            throw th;
                        }
                    case 1:
                        ref$ObjectRef = p92Var2.i;
                        formularization.attabal attabalVar3 = (formularization.attabal) p92Var2.h;
                        ref$ObjectRef2 = p92Var2.g;
                        ref$ObjectRef3 = (Ref$ObjectRef) p92Var2.f;
                        ref$ObjectRef4 = (Ref$ObjectRef) p92Var2.e;
                        ref$BooleanRef = (Ref$BooleanRef) p92Var2.d;
                        Closeable closeable = p92Var2.c;
                        r15 = (w03) p92Var2.b;
                        s92Var2 = (s92) p92Var2.a;
                        try {
                            p002kotlin.dern.saneness(objA2);
                            attabalVar = attabalVar3;
                            r13 = closeable;
                            r14 = r15;
                            op2 op2Var4 = s92Var2.o;
                            String str9 = (String) ref$ObjectRef3.element;
                            p92Var2.a = s92Var2;
                            p92Var2.b = r14;
                            p92Var2.c = r13;
                            p92Var2.d = ref$BooleanRef;
                            p92Var2.e = ref$ObjectRef4;
                            p92Var2.f = ref$ObjectRef3;
                            p92Var2.g = ref$ObjectRef2;
                            p92Var2.h = attabalVar;
                            p92Var2.i = ref$ObjectRef;
                            ref$ObjectRef5 = ref$ObjectRef;
                            p92Var2.m = 2;
                            objA2 = op2Var4.a(str9, p92Var2);
                            if (objA2 != objBeachfront) {
                                ref$ObjectRef6 = ref$ObjectRef4;
                                ref$ObjectRef7 = ref$ObjectRef2;
                                ref$ObjectRef8 = ref$ObjectRef5;
                                r20 = attabalVar;
                                r16 = r13;
                                r15 = r14;
                                ref$ObjectRef9 = ref$ObjectRef3;
                                A = r16;
                                s92Var3 = s92Var2;
                                r1 = (jp2) objA2;
                                if (r1 == 0) {
                                    rn0 rn0Var4 = x;
                                    y13.a((nn0) rn0Var4, false);
                                    dernVarGintrap = marial.gintrap(new Pair(rn0Var4, null));
                                    obj = null;
                                } else {
                                    ref$ObjectRef7.element = r1;
                                    if (ref$BooleanRef.element) {
                                        spartacistVarA = s92Var3.p.a((String) ref$ObjectRef6.element, (String) ref$ObjectRef9.element, r1);
                                        if (spartacistVarA instanceof nn0) {
                                            nn0 nn0Var3 = (nn0) spartacistVarA;
                                            y13.a(nn0Var3, false);
                                            obj = null;
                                            dernVarGintrap = marial.gintrap(new Pair(nn0Var3, null));
                                        } else {
                                            Intrinsics.competently(spartacistVarA, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                                            r0 = (String) ((tn0) spartacistVarA).b;
                                        }
                                    } else {
                                        r0 = (String) ref$ObjectRef6.element;
                                    }
                                    ref$ObjectRef8.element = r0;
                                    r2 = r0;
                                    if (r0 == 0) {
                                        Intrinsics.preprohormone("decryptedAdResponseBlob");
                                        r2 = 0;
                                    }
                                    s92Var3.getClass();
                                    Pair pairA2 = a((String) r2);
                                    str = (String) pairA2.component1();
                                    iIntValue = ((Number) pairA2.component2()).intValue();
                                    op2 op2Var5 = s92Var3.o;
                                    String str10 = (String) ref$ObjectRef9.element;
                                    p92Var2.a = s92Var3;
                                    p92Var2.b = r15;
                                    p92Var2.c = A;
                                    p92Var2.d = ref$ObjectRef9;
                                    p92Var2.e = ref$ObjectRef7;
                                    p92Var2.f = r20;
                                    p92Var2.g = ref$ObjectRef8;
                                    p92Var2.h = str;
                                    r17 = r20;
                                    p92Var2.i = null;
                                    p92Var2.j = iIntValue;
                                    p92Var2.m = 3;
                                    objA = op2Var5.a(str10, str, p92Var2);
                                    if (objA != objBeachfront) {
                                        r18 = r15;
                                        r19 = A;
                                        str2 = str;
                                        objA2 = objA;
                                        ref$ObjectRef10 = ref$ObjectRef9;
                                        r12 = r17;
                                        i = iIntValue;
                                        ref$ObjectRef11 = ref$ObjectRef8;
                                        s92Var4 = s92Var3;
                                        ref$ObjectRef12 = ref$ObjectRef7;
                                        if (((Boolean) objA2).booleanValue()) {
                                            rn0 rn0Var5 = v;
                                            y13.a((nn0) rn0Var5, false);
                                            dernVarGintrap = marial.gintrap(new Pair(rn0Var5, null));
                                            r12.wireman(null);
                                            r8 = r19;
                                        } else {
                                            op2Var = s92Var4.o;
                                            str3 = (String) ref$ObjectRef10.element;
                                            obj2 = ref$ObjectRef12.element;
                                            if (obj2 == null) {
                                                Intrinsics.preprohormone("signalGenerationData");
                                                jp2Var = null;
                                            } else {
                                                jp2Var = (jp2) obj2;
                                            }
                                            p92Var2.a = s92Var4;
                                            p92Var2.b = r18;
                                            p92Var2.c = r19;
                                            p92Var2.d = ref$ObjectRef12;
                                            p92Var2.e = r12;
                                            p92Var2.f = ref$ObjectRef11;
                                            p92Var2.g = null;
                                            p92Var2.h = null;
                                            p92Var2.m = 4;
                                            if (op2Var.a(str3, str2, jp2Var, i, p92Var2) != objBeachfront) {
                                                s92Var5 = s92Var4;
                                                r3 = r12;
                                                ref$ObjectRef13 = ref$ObjectRef12;
                                                r5 = r19;
                                                r7 = r18;
                                                Unit unit2 = Unit.f29295attabal;
                                                r3.wireman(null);
                                                obj3 = ref$ObjectRef11.element;
                                                if (obj3 == null) {
                                                    Intrinsics.preprohormone("decryptedAdResponseBlob");
                                                    str4 = null;
                                                } else {
                                                    str4 = (String) obj3;
                                                }
                                                p92Var2.a = s92Var5;
                                                p92Var2.b = r7;
                                                p92Var2.c = r5;
                                                p92Var2.d = ref$ObjectRef13;
                                                p92Var2.e = ref$ObjectRef11;
                                                p92Var2.f = ref$ObjectRef11;
                                                p92Var2.m = 5;
                                                objA2 = s92Var5.a(str4, p92Var2);
                                                if (objA2 != objBeachfront) {
                                                    ref$ObjectRef14 = ref$ObjectRef11;
                                                    r10 = r5;
                                                    r9 = r7;
                                                    spartacistVar = (spartacist) objA2;
                                                    if (spartacistVar instanceof nn0) {
                                                        nn0 nn0Var4 = (nn0) spartacistVar;
                                                        y13.a(nn0Var4, false);
                                                        dernVarGintrap = marial.gintrap(new Pair(nn0Var4, null));
                                                        r8 = r10;
                                                    } else {
                                                        Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                                                        ref$ObjectRef11.element = ((tn0) spartacistVar).b;
                                                        obj4 = ref$ObjectRef14.element;
                                                        if (obj4 == null) {
                                                            Intrinsics.preprohormone("decryptedAdResponseBlob");
                                                            str5 = null;
                                                        } else {
                                                            str5 = (String) obj4;
                                                        }
                                                        obj5 = ref$ObjectRef13.element;
                                                        if (obj5 == null) {
                                                            Intrinsics.preprohormone("signalGenerationData");
                                                            jp2Var2 = null;
                                                        } else {
                                                            jp2Var2 = (jp2) obj5;
                                                        }
                                                        p92Var2.a = r9;
                                                        p92Var2.b = r10;
                                                        p92Var2.c = null;
                                                        p92Var2.d = null;
                                                        p92Var2.e = null;
                                                        p92Var2.f = null;
                                                        p92Var2.m = 6;
                                                        objA2 = s92Var5.a(str5, jp2Var2, p92Var2);
                                                        if (objA2 != objBeachfront) {
                                                            r4 = r10;
                                                            r11 = r9;
                                                            dernVarGintrap = (kotlinx.coroutines.flow.dern) objA2;
                                                            r8 = r4;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (dernVarGintrap instanceof nn0) {
                                            y13.a((nn0) dernVarGintrap, false);
                                        }
                                        interaction.saneness.attabal(r8, null);
                                        return dernVarGintrap;
                                    }
                                }
                                r20.wireman(obj);
                                r8 = A;
                                if (dernVarGintrap instanceof nn0) {
                                    y13.a((nn0) dernVarGintrap, false);
                                }
                                interaction.saneness.attabal(r8, null);
                                return dernVarGintrap;
                            }
                            return objBeachfront;
                        } catch (Throwable th9) {
                            th = th9;
                            A = closeable;
                            r6 = r15;
                            r6.b(th);
                            if (!(th instanceof evenfall)) {
                                r6.a(th);
                                if (!(th instanceof TimeoutCancellationException)) {
                                    if (!(th instanceof CancellationException)) {
                                        if (th instanceof yn0) {
                                            throw th;
                                        }
                                        throw new gn0(th);
                                    }
                                    throw new bn0(th);
                                }
                                throw new cp0(th);
                            }
                            throw th;
                        }
                    case 2:
                        Ref$ObjectRef ref$ObjectRef19 = p92Var2.i;
                        formularization.attabal attabalVar4 = (formularization.attabal) p92Var2.h;
                        Ref$ObjectRef ref$ObjectRef20 = p92Var2.g;
                        ref$ObjectRef3 = (Ref$ObjectRef) p92Var2.f;
                        Ref$ObjectRef ref$ObjectRef21 = (Ref$ObjectRef) p92Var2.e;
                        ref$BooleanRef = (Ref$BooleanRef) p92Var2.d;
                        Closeable closeable2 = p92Var2.c;
                        w03 w03Var = (w03) p92Var2.b;
                        s92Var2 = (s92) p92Var2.a;
                        p002kotlin.dern.saneness(objA2);
                        ref$ObjectRef8 = ref$ObjectRef19;
                        ref$ObjectRef6 = ref$ObjectRef21;
                        ref$ObjectRef7 = ref$ObjectRef20;
                        r20 = attabalVar4;
                        r16 = closeable2;
                        r15 = w03Var;
                        ref$ObjectRef9 = ref$ObjectRef3;
                        A = r16;
                        s92Var3 = s92Var2;
                        r1 = (jp2) objA2;
                        if (r1 == 0) {
                            rn0 rn0Var6 = x;
                            y13.a((nn0) rn0Var6, false);
                            dernVarGintrap = marial.gintrap(new Pair(rn0Var6, null));
                            obj = null;
                        } else {
                            ref$ObjectRef7.element = r1;
                            if (ref$BooleanRef.element) {
                                spartacistVarA = s92Var3.p.a((String) ref$ObjectRef6.element, (String) ref$ObjectRef9.element, r1);
                                if (spartacistVarA instanceof nn0) {
                                    nn0 nn0Var5 = (nn0) spartacistVarA;
                                    y13.a(nn0Var5, false);
                                    obj = null;
                                    dernVarGintrap = marial.gintrap(new Pair(nn0Var5, null));
                                } else {
                                    Intrinsics.competently(spartacistVarA, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                                    r0 = (String) ((tn0) spartacistVarA).b;
                                }
                            } else {
                                r0 = (String) ref$ObjectRef6.element;
                            }
                            ref$ObjectRef8.element = r0;
                            r2 = r0;
                            if (r0 == 0) {
                                Intrinsics.preprohormone("decryptedAdResponseBlob");
                                r2 = 0;
                            }
                            s92Var3.getClass();
                            Pair pairA3 = a((String) r2);
                            str = (String) pairA3.component1();
                            iIntValue = ((Number) pairA3.component2()).intValue();
                            op2 op2Var6 = s92Var3.o;
                            String str11 = (String) ref$ObjectRef9.element;
                            p92Var2.a = s92Var3;
                            p92Var2.b = r15;
                            p92Var2.c = A;
                            p92Var2.d = ref$ObjectRef9;
                            p92Var2.e = ref$ObjectRef7;
                            p92Var2.f = r20;
                            p92Var2.g = ref$ObjectRef8;
                            p92Var2.h = str;
                            r17 = r20;
                            p92Var2.i = null;
                            p92Var2.j = iIntValue;
                            p92Var2.m = 3;
                            objA = op2Var6.a(str11, str, p92Var2);
                            if (objA != objBeachfront) {
                                r18 = r15;
                                r19 = A;
                                str2 = str;
                                objA2 = objA;
                                ref$ObjectRef10 = ref$ObjectRef9;
                                r12 = r17;
                                i = iIntValue;
                                ref$ObjectRef11 = ref$ObjectRef8;
                                s92Var4 = s92Var3;
                                ref$ObjectRef12 = ref$ObjectRef7;
                                if (((Boolean) objA2).booleanValue()) {
                                    rn0 rn0Var7 = v;
                                    y13.a((nn0) rn0Var7, false);
                                    dernVarGintrap = marial.gintrap(new Pair(rn0Var7, null));
                                    r12.wireman(null);
                                    r8 = r19;
                                } else {
                                    op2Var = s92Var4.o;
                                    str3 = (String) ref$ObjectRef10.element;
                                    obj2 = ref$ObjectRef12.element;
                                    if (obj2 == null) {
                                        Intrinsics.preprohormone("signalGenerationData");
                                        jp2Var = null;
                                    } else {
                                        jp2Var = (jp2) obj2;
                                    }
                                    p92Var2.a = s92Var4;
                                    p92Var2.b = r18;
                                    p92Var2.c = r19;
                                    p92Var2.d = ref$ObjectRef12;
                                    p92Var2.e = r12;
                                    p92Var2.f = ref$ObjectRef11;
                                    p92Var2.g = null;
                                    p92Var2.h = null;
                                    p92Var2.m = 4;
                                    if (op2Var.a(str3, str2, jp2Var, i, p92Var2) != objBeachfront) {
                                        s92Var5 = s92Var4;
                                        r3 = r12;
                                        ref$ObjectRef13 = ref$ObjectRef12;
                                        r5 = r19;
                                        r7 = r18;
                                        Unit unit3 = Unit.f29295attabal;
                                        r3.wireman(null);
                                        obj3 = ref$ObjectRef11.element;
                                        if (obj3 == null) {
                                            Intrinsics.preprohormone("decryptedAdResponseBlob");
                                            str4 = null;
                                        } else {
                                            str4 = (String) obj3;
                                        }
                                        p92Var2.a = s92Var5;
                                        p92Var2.b = r7;
                                        p92Var2.c = r5;
                                        p92Var2.d = ref$ObjectRef13;
                                        p92Var2.e = ref$ObjectRef11;
                                        p92Var2.f = ref$ObjectRef11;
                                        p92Var2.m = 5;
                                        objA2 = s92Var5.a(str4, p92Var2);
                                        if (objA2 != objBeachfront) {
                                            ref$ObjectRef14 = ref$ObjectRef11;
                                            r10 = r5;
                                            r9 = r7;
                                            spartacistVar = (spartacist) objA2;
                                            if (spartacistVar instanceof nn0) {
                                                nn0 nn0Var6 = (nn0) spartacistVar;
                                                y13.a(nn0Var6, false);
                                                dernVarGintrap = marial.gintrap(new Pair(nn0Var6, null));
                                                r8 = r10;
                                            } else {
                                                Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                                                ref$ObjectRef11.element = ((tn0) spartacistVar).b;
                                                obj4 = ref$ObjectRef14.element;
                                                if (obj4 == null) {
                                                    Intrinsics.preprohormone("decryptedAdResponseBlob");
                                                    str5 = null;
                                                } else {
                                                    str5 = (String) obj4;
                                                }
                                                obj5 = ref$ObjectRef13.element;
                                                if (obj5 == null) {
                                                    Intrinsics.preprohormone("signalGenerationData");
                                                    jp2Var2 = null;
                                                } else {
                                                    jp2Var2 = (jp2) obj5;
                                                }
                                                p92Var2.a = r9;
                                                p92Var2.b = r10;
                                                p92Var2.c = null;
                                                p92Var2.d = null;
                                                p92Var2.e = null;
                                                p92Var2.f = null;
                                                p92Var2.m = 6;
                                                objA2 = s92Var5.a(str5, jp2Var2, p92Var2);
                                                if (objA2 != objBeachfront) {
                                                    r4 = r10;
                                                    r11 = r9;
                                                    dernVarGintrap = (kotlinx.coroutines.flow.dern) objA2;
                                                    r8 = r4;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (dernVarGintrap instanceof nn0) {
                                    y13.a((nn0) dernVarGintrap, false);
                                }
                                interaction.saneness.attabal(r8, null);
                                return dernVarGintrap;
                            }
                            return objBeachfront;
                        }
                        r20.wireman(obj);
                        r8 = A;
                        if (dernVarGintrap instanceof nn0) {
                            y13.a((nn0) dernVarGintrap, false);
                        }
                        interaction.saneness.attabal(r8, null);
                        return dernVarGintrap;
                    case 3:
                        iIntValue = p92Var2.j;
                        String str12 = (String) p92Var2.h;
                        ref$ObjectRef8 = p92Var2.g;
                        formularization.attabal attabalVar5 = (formularization.attabal) p92Var2.f;
                        ref$ObjectRef7 = (Ref$ObjectRef) p92Var2.e;
                        Ref$ObjectRef ref$ObjectRef22 = (Ref$ObjectRef) p92Var2.d;
                        Closeable closeable3 = p92Var2.c;
                        w03 w03Var2 = (w03) p92Var2.b;
                        s92Var3 = (s92) p92Var2.a;
                        try {
                            p002kotlin.dern.saneness(objA2);
                            r12 = attabalVar5;
                            str2 = str12;
                            ref$ObjectRef10 = ref$ObjectRef22;
                            r19 = closeable3;
                            r18 = w03Var2;
                            i = iIntValue;
                            ref$ObjectRef11 = ref$ObjectRef8;
                            s92Var4 = s92Var3;
                            ref$ObjectRef12 = ref$ObjectRef7;
                            if (((Boolean) objA2).booleanValue()) {
                                rn0 rn0Var8 = v;
                                y13.a((nn0) rn0Var8, false);
                                dernVarGintrap = marial.gintrap(new Pair(rn0Var8, null));
                                r12.wireman(null);
                                r8 = r19;
                            } else {
                                op2Var = s92Var4.o;
                                str3 = (String) ref$ObjectRef10.element;
                                obj2 = ref$ObjectRef12.element;
                                if (obj2 == null) {
                                    Intrinsics.preprohormone("signalGenerationData");
                                    jp2Var = null;
                                } else {
                                    jp2Var = (jp2) obj2;
                                }
                                p92Var2.a = s92Var4;
                                p92Var2.b = r18;
                                p92Var2.c = r19;
                                p92Var2.d = ref$ObjectRef12;
                                p92Var2.e = r12;
                                p92Var2.f = ref$ObjectRef11;
                                p92Var2.g = null;
                                p92Var2.h = null;
                                p92Var2.m = 4;
                                if (op2Var.a(str3, str2, jp2Var, i, p92Var2) != objBeachfront) {
                                    s92Var5 = s92Var4;
                                    r3 = r12;
                                    ref$ObjectRef13 = ref$ObjectRef12;
                                    r5 = r19;
                                    r7 = r18;
                                    Unit unit4 = Unit.f29295attabal;
                                    r3.wireman(null);
                                    obj3 = ref$ObjectRef11.element;
                                    if (obj3 == null) {
                                        Intrinsics.preprohormone("decryptedAdResponseBlob");
                                        str4 = null;
                                    } else {
                                        str4 = (String) obj3;
                                    }
                                    p92Var2.a = s92Var5;
                                    p92Var2.b = r7;
                                    p92Var2.c = r5;
                                    p92Var2.d = ref$ObjectRef13;
                                    p92Var2.e = ref$ObjectRef11;
                                    p92Var2.f = ref$ObjectRef11;
                                    p92Var2.m = 5;
                                    objA2 = s92Var5.a(str4, p92Var2);
                                    if (objA2 != objBeachfront) {
                                        ref$ObjectRef14 = ref$ObjectRef11;
                                        r10 = r5;
                                        r9 = r7;
                                        spartacistVar = (spartacist) objA2;
                                        if (spartacistVar instanceof nn0) {
                                            nn0 nn0Var7 = (nn0) spartacistVar;
                                            y13.a(nn0Var7, false);
                                            dernVarGintrap = marial.gintrap(new Pair(nn0Var7, null));
                                            r8 = r10;
                                        } else {
                                            Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                                            ref$ObjectRef11.element = ((tn0) spartacistVar).b;
                                            obj4 = ref$ObjectRef14.element;
                                            if (obj4 == null) {
                                                Intrinsics.preprohormone("decryptedAdResponseBlob");
                                                str5 = null;
                                            } else {
                                                str5 = (String) obj4;
                                            }
                                            obj5 = ref$ObjectRef13.element;
                                            if (obj5 == null) {
                                                Intrinsics.preprohormone("signalGenerationData");
                                                jp2Var2 = null;
                                            } else {
                                                jp2Var2 = (jp2) obj5;
                                            }
                                            p92Var2.a = r9;
                                            p92Var2.b = r10;
                                            p92Var2.c = null;
                                            p92Var2.d = null;
                                            p92Var2.e = null;
                                            p92Var2.f = null;
                                            p92Var2.m = 6;
                                            objA2 = s92Var5.a(str5, jp2Var2, p92Var2);
                                            if (objA2 != objBeachfront) {
                                                r4 = r10;
                                                r11 = r9;
                                                dernVarGintrap = (kotlinx.coroutines.flow.dern) objA2;
                                                r8 = r4;
                                            }
                                        }
                                    }
                                }
                                return objBeachfront;
                            }
                            if (dernVarGintrap instanceof nn0) {
                                y13.a((nn0) dernVarGintrap, false);
                            }
                            interaction.saneness.attabal(r8, null);
                            return dernVarGintrap;
                        } catch (Throwable th10) {
                            th = th10;
                            r3 = attabalVar5;
                            r111 = closeable3;
                            r110 = w03Var2;
                            r3.wireman(null);
                            throw th;
                        }
                    case 4:
                        ref$ObjectRef11 = (Ref$ObjectRef) p92Var2.f;
                        r3 = (formularization.attabal) p92Var2.e;
                        ref$ObjectRef13 = (Ref$ObjectRef) p92Var2.d;
                        Closeable closeable4 = p92Var2.c;
                        w03 w03Var3 = (w03) p92Var2.b;
                        s92Var5 = (s92) p92Var2.a;
                        try {
                            p002kotlin.dern.saneness(objA2);
                            r3 = r3;
                            r5 = closeable4;
                            r7 = w03Var3;
                            Unit unit5 = Unit.f29295attabal;
                            r3.wireman(null);
                            obj3 = ref$ObjectRef11.element;
                            if (obj3 == null) {
                                Intrinsics.preprohormone("decryptedAdResponseBlob");
                                str4 = null;
                            } else {
                                str4 = (String) obj3;
                            }
                            p92Var2.a = s92Var5;
                            p92Var2.b = r7;
                            p92Var2.c = r5;
                            p92Var2.d = ref$ObjectRef13;
                            p92Var2.e = ref$ObjectRef11;
                            p92Var2.f = ref$ObjectRef11;
                            p92Var2.m = 5;
                            objA2 = s92Var5.a(str4, p92Var2);
                            if (objA2 != objBeachfront) {
                                ref$ObjectRef14 = ref$ObjectRef11;
                                r10 = r5;
                                r9 = r7;
                                spartacistVar = (spartacist) objA2;
                                if (spartacistVar instanceof nn0) {
                                    nn0 nn0Var8 = (nn0) spartacistVar;
                                    y13.a(nn0Var8, false);
                                    dernVarGintrap = marial.gintrap(new Pair(nn0Var8, null));
                                    r8 = r10;
                                } else {
                                    Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                                    ref$ObjectRef11.element = ((tn0) spartacistVar).b;
                                    obj4 = ref$ObjectRef14.element;
                                    if (obj4 == null) {
                                        Intrinsics.preprohormone("decryptedAdResponseBlob");
                                        str5 = null;
                                    } else {
                                        str5 = (String) obj4;
                                    }
                                    obj5 = ref$ObjectRef13.element;
                                    if (obj5 == null) {
                                        Intrinsics.preprohormone("signalGenerationData");
                                        jp2Var2 = null;
                                    } else {
                                        jp2Var2 = (jp2) obj5;
                                    }
                                    p92Var2.a = r9;
                                    p92Var2.b = r10;
                                    p92Var2.c = null;
                                    p92Var2.d = null;
                                    p92Var2.e = null;
                                    p92Var2.f = null;
                                    p92Var2.m = 6;
                                    objA2 = s92Var5.a(str5, jp2Var2, p92Var2);
                                    if (objA2 != objBeachfront) {
                                        r4 = r10;
                                        r11 = r9;
                                        dernVarGintrap = (kotlinx.coroutines.flow.dern) objA2;
                                        r8 = r4;
                                    }
                                }
                                if (dernVarGintrap instanceof nn0) {
                                    y13.a((nn0) dernVarGintrap, false);
                                }
                                interaction.saneness.attabal(r8, null);
                                return dernVarGintrap;
                            }
                            return objBeachfront;
                        } catch (Throwable th11) {
                            th = th11;
                            r3.wireman(null);
                            throw th;
                        }
                    case 5:
                        ref$ObjectRef11 = (Ref$ObjectRef) p92Var2.f;
                        ref$ObjectRef14 = (Ref$ObjectRef) p92Var2.e;
                        ref$ObjectRef13 = (Ref$ObjectRef) p92Var2.d;
                        Closeable closeable5 = p92Var2.c;
                        w03 w03Var4 = (w03) p92Var2.b;
                        s92Var5 = (s92) p92Var2.a;
                        p002kotlin.dern.saneness(objA2);
                        r10 = closeable5;
                        r9 = w03Var4;
                        spartacistVar = (spartacist) objA2;
                        if (spartacistVar instanceof nn0) {
                            nn0 nn0Var9 = (nn0) spartacistVar;
                            y13.a(nn0Var9, false);
                            dernVarGintrap = marial.gintrap(new Pair(nn0Var9, null));
                            r8 = r10;
                        } else {
                            Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                            ref$ObjectRef11.element = ((tn0) spartacistVar).b;
                            obj4 = ref$ObjectRef14.element;
                            if (obj4 == null) {
                                Intrinsics.preprohormone("decryptedAdResponseBlob");
                                str5 = null;
                            } else {
                                str5 = (String) obj4;
                            }
                            obj5 = ref$ObjectRef13.element;
                            if (obj5 == null) {
                                Intrinsics.preprohormone("signalGenerationData");
                                jp2Var2 = null;
                            } else {
                                jp2Var2 = (jp2) obj5;
                            }
                            p92Var2.a = r9;
                            p92Var2.b = r10;
                            p92Var2.c = null;
                            p92Var2.d = null;
                            p92Var2.e = null;
                            p92Var2.f = null;
                            p92Var2.m = 6;
                            objA2 = s92Var5.a(str5, jp2Var2, p92Var2);
                            if (objA2 != objBeachfront) {
                                r4 = r10;
                                r11 = r9;
                                dernVarGintrap = (kotlinx.coroutines.flow.dern) objA2;
                                r8 = r4;
                            }
                            return objBeachfront;
                        }
                        if (dernVarGintrap instanceof nn0) {
                            y13.a((nn0) dernVarGintrap, false);
                        }
                        interaction.saneness.attabal(r8, null);
                        return dernVarGintrap;
                    case 6:
                        r4 = p92Var2.b;
                        r11 = (w03) p92Var2.a;
                        try {
                            p002kotlin.dern.saneness(objA2);
                            r4 = r4;
                            r11 = r11;
                            dernVarGintrap = (kotlinx.coroutines.flow.dern) objA2;
                            r8 = r4;
                            if (dernVarGintrap instanceof nn0) {
                                y13.a((nn0) dernVarGintrap, false);
                            }
                            interaction.saneness.attabal(r8, null);
                            return dernVarGintrap;
                        } catch (Throwable th12) {
                            th = th12;
                            A = r4;
                            r6 = r11;
                            r6.b(th);
                            if (!(th instanceof evenfall)) {
                                r6.a(th);
                                if (!(th instanceof TimeoutCancellationException)) {
                                    if (!(th instanceof CancellationException)) {
                                        if (th instanceof yn0) {
                                            throw th;
                                        }
                                        throw new gn0(th);
                                    }
                                    throw new bn0(th);
                                }
                                throw new cp0(th);
                            }
                            throw th;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th13) {
                th = th13;
                r3 = r20;
            }
        } catch (Throwable th14) {
            th = th14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, wretchedly.dern dernVar) {
        q92 q92Var;
        String strA;
        List list;
        s92 s92Var;
        if (dernVar instanceof q92) {
            q92Var = (q92) dernVar;
            int i = q92Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                q92Var.f = i - Integer.MIN_VALUE;
            } else {
                q92Var = new q92(this, dernVar);
            }
        } else {
            q92Var = new q92(this, dernVar);
        }
        Object obj = q92Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = q92Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                try {
                    JsonObject jsonObject = (JsonObject) this.r.fromJson(str, JsonObject.class);
                    JsonElement jsonElement = jsonObject.get("fetch_url");
                    String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    if (asString == null) {
                        return new tn0(str);
                    }
                    Intrinsics.beachfront(jsonObject);
                    List listA = a(jsonObject);
                    wt0 wt0Var = new wt0();
                    jk0 jk0Var = this.d;
                    jk0Var.getClass();
                    Intrinsics.checkNotNullParameter("gads:gbid_type_two_serving_post:enabled", X3.i.W);
                    if (((Boolean) jk0Var.a("gads:gbid_type_two_serving_post:enabled", Boolean.TRUE, zk.b)).booleanValue()) {
                        List listSplit$default = StringsKt.split$default(asString, new String[]{"?"}, false, 0, 6, null);
                        if (listSplit$default.size() == 2) {
                            URL url = new URL((String) listSplit$default.get(0));
                            Intrinsics.checkNotNullParameter(url, "url");
                            wt0Var.a = url;
                            byte[] bytes = ((String) listSplit$default.get(1)).getBytes(Charsets.UTF_8);
                            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                            wt0Var.b("text/plain", bytes);
                        } else {
                            URL url2 = new URL(asString);
                            Intrinsics.checkNotNullParameter(url2, "url");
                            wt0Var.a = url2;
                        }
                    } else {
                        URL url3 = new URL(asString);
                        Intrinsics.checkNotNullParameter(url3, "url");
                        wt0Var.a = url3;
                    }
                    xt0 xt0VarA = wt0Var.a();
                    q92Var.a = this;
                    q92Var.b = str;
                    q92Var.c = listA;
                    q92Var.f = 1;
                    Object objA = a(xt0VarA, q92Var);
                    if (objA == objBeachfront) {
                        return objBeachfront;
                    }
                    strA = str;
                    list = listA;
                    obj = objA;
                    s92Var = this;
                } catch (Exception unused) {
                    return new tn0(str);
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = q92Var.c;
                strA = q92Var.b;
                s92Var = q92Var.a;
                p002kotlin.dern.saneness(obj);
            }
            spartacist spartacistVar = (spartacist) obj;
            if (spartacistVar instanceof nn0) {
                saran saranVar = s92Var.b;
                r92 block = new r92(s92Var, spartacistVar, list, null);
                EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
                return spartacistVar;
            }
            if (spartacistVar instanceof tn0) {
                dg2 dg2Var = ((zt0) ((tn0) spartacistVar).b).d;
                if (dg2Var != null) {
                    strA = dg2.a(dg2Var);
                }
                return new tn0(strA);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            return new on0(e, null, null, 6);
        }
    }

    public static Pair a(String str) {
        try {
            JsonElement jsonElement = ((JsonObject) new Gson().fromJson(str, JsonObject.class)).get("render_id");
            String asString = jsonElement != null ? jsonElement.getAsString() : null;
            if (asString == null) {
                asString = "";
            }
            try {
                byte[] bArrDecode = Base64.decode(asString, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                List listHomozygous = StringsKt.homozygous(new String(bArrDecode, Charsets.UTF_8), new char[]{':'}, false, 0, 6, null);
                if (listHomozygous.size() == 2) {
                    return new Pair(listHomozygous.get(0), Integer.valueOf(Integer.parseInt((String) listHomozygous.get(1))));
                }
                return new Pair(null, 0);
            } catch (Exception unused) {
                return new Pair(null, 0);
            }
        } catch (Exception unused2) {
            return new Pair(null, 0);
        }
    }
}

package ads_mobile_sdk;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.ironsource.Ie;
import com.vungle.ads.internal.ui.AdActivity;
import complexometry.formularize;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;
import saneness.fright;
import saneness.hydrofracturing;
import saneness.spartacist;
import saneness.supercargo;

/* JADX INFO: loaded from: classes.dex */
public final class m6 implements fright {
    public final supercargo a;
    public final String b;
    public final jp2 c;
    public final formularize d;
    public final Gson e;

    public m6(supercargo javascriptEngine, String adResponseBlob, jp2 signalGenerationData, formularize baseRequest, Gson gson) {
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        Intrinsics.checkNotNullParameter(adResponseBlob, "adResponseBlob");
        Intrinsics.checkNotNullParameter(signalGenerationData, "signalGenerationData");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.a = javascriptEngine;
        this.b = adResponseBlob;
        this.c = signalGenerationData;
        this.d = baseRequest;
        this.e = gson;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f2 A[Catch: all -> 0x0102, TryCatch #2 {all -> 0x0102, blocks: (B:42:0x00eb, B:44:0x00f2, B:46:0x00f9, B:48:0x00fd, B:50:0x0101, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x0111, B:57:0x0112, B:58:0x0119, B:59:0x011a), top: B:68:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9 A[Catch: all -> 0x0102, TryCatch #2 {all -> 0x0102, blocks: (B:42:0x00eb, B:44:0x00f2, B:46:0x00f9, B:48:0x00fd, B:50:0x0101, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x0111, B:57:0x0112, B:58:0x0119, B:59:0x011a), top: B:68:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fd A[Catch: all -> 0x0102, TryCatch #2 {all -> 0x0102, blocks: (B:42:0x00eb, B:44:0x00f2, B:46:0x00f9, B:48:0x00fd, B:50:0x0101, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x0111, B:57:0x0112, B:58:0x0119, B:59:0x011a), top: B:68:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0101 A[Catch: all -> 0x0102, TryCatch #2 {all -> 0x0102, blocks: (B:42:0x00eb, B:44:0x00f2, B:46:0x00f9, B:48:0x00fd, B:50:0x0101, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x0111, B:57:0x0112, B:58:0x0119, B:59:0x011a), top: B:68:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0104 A[Catch: all -> 0x0102, TryCatch #2 {all -> 0x0102, blocks: (B:42:0x00eb, B:44:0x00f2, B:46:0x00f9, B:48:0x00fd, B:50:0x0101, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x0111, B:57:0x0112, B:58:0x0119, B:59:0x011a), top: B:68:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:55:0x010a A[Catch: all -> 0x0102, TryCatch #2 {all -> 0x0102, blocks: (B:42:0x00eb, B:44:0x00f2, B:46:0x00f9, B:48:0x00fd, B:50:0x0101, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x0111, B:57:0x0112, B:58:0x0119, B:59:0x011a), top: B:68:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0112 A[Catch: all -> 0x0102, TryCatch #2 {all -> 0x0102, blocks: (B:42:0x00eb, B:44:0x00f2, B:46:0x00f9, B:48:0x00fd, B:50:0x0101, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x0111, B:57:0x0112, B:58:0x0119, B:59:0x011a), top: B:68:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:59:0x011a A[Catch: all -> 0x0102, TRY_LEAVE, TryCatch #2 {all -> 0x0102, blocks: (B:42:0x00eb, B:44:0x00f2, B:46:0x00f9, B:48:0x00fd, B:50:0x0101, B:53:0x0104, B:54:0x0109, B:55:0x010a, B:56:0x0111, B:57:0x0112, B:58:0x0119, B:59:0x011a), top: B:68:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // saneness.fright
    public final Object a(wretchedly.dern dernVar) {
        l6 l6Var;
        w03 w03Var;
        w03 w03Var2;
        TimeoutCancellationException th;
        m6 m6Var;
        Object on0Var;
        Object tn0Var;
        if (dernVar instanceof l6) {
            l6Var = (l6) dernVar;
            int i = l6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                l6Var.f = i - Integer.MIN_VALUE;
            } else {
                l6Var = new l6(this, dernVar);
            }
        } else {
            l6Var = new l6(this, dernVar);
        }
        Object obj = l6Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = l6Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            no0 no0Var = no0.CUI_NAME_ADREQUEST_NORMALIZE_RESPONSE;
            WeakHashMap weakHashMap = j13.a;
            w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                JsonObject jsonObjectA = a();
                hydrofracturing hydrofracturingVar = this.a;
                l6Var.a = this;
                l6Var.b = w03VarA;
                l6Var.c = w03VarA;
                l6Var.f = 1;
                hydrofracturingVar.getClass();
                String string = jsonObjectA.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                Object objA = ((cf0) hydrofracturingVar).a("google.afma.response.normalize", string, l6Var);
                if (objA == objBeachfront) {
                    return objBeachfront;
                }
                w03Var = w03VarA;
                w03Var2 = w03Var;
                obj = objA;
                m6Var = this;
            } catch (Throwable th2) {
                w03Var = w03VarA;
                w03Var2 = w03Var;
                th = th2;
                w03Var2.b(th);
                if (!(th instanceof evenfall)) {
                    throw th;
                }
                w03Var2.a(th);
                if (!(th instanceof TimeoutCancellationException)) {
                    throw new cp0(th);
                }
                if (!(th instanceof CancellationException)) {
                    throw new bn0(th);
                }
                if (th instanceof yn0) {
                    throw th;
                }
                throw new gn0(th);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var = l6Var.c;
            w03Var2 = l6Var.b;
            m6Var = l6Var.a;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    w03Var2.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03Var2.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        interaction.saneness.attabal(w03Var, th4);
                        throw th5;
                    }
                }
            }
        }
        spartacist spartacistVar = (spartacist) obj;
        if (spartacistVar instanceof nn0) {
            tn0Var = (nn0) spartacistVar;
        } else {
            Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
            JsonObject json = (JsonObject) ((tn0) spartacistVar).b;
            Intrinsics.checkNotNullParameter(json, "json");
            em2 block = new em2(json);
            Intrinsics.checkNotNullParameter(block, "block");
            try {
                on0Var = new tn0(block.invoke());
            } catch (Exception e) {
                on0Var = new on0(e, null, null, 6);
            }
            if (on0Var instanceof nn0) {
                tn0Var = (nn0) on0Var;
            } else {
                Intrinsics.competently(on0Var, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                fm2 fm2Var = (fm2) ((tn0) on0Var).b;
                j13.a().a.b.b = fm2Var.b.h;
                tn0Var = new tn0(new jm2(new bm2(m6Var.d), fm2Var));
            }
        }
        if (tn0Var instanceof nn0) {
            y13.a((nn0) tn0Var, false);
        }
        interaction.saneness.attabal(w03Var, null);
        return tn0Var;
    }

    public final JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        JsonObject jsonObject3 = new JsonObject();
        jsonObject2.addProperty("base_url", "");
        jsonObject2.add("signals", this.e.toJsonTree(this.c.c).getAsJsonObject());
        jsonObject3.addProperty("body", this.b);
        jsonObject3.add("headers", new JsonObject());
        jsonObject.add(AdActivity.REQUEST_KEY_EXTRA, jsonObject2);
        jsonObject.add(Ie.n, jsonObject3);
        jsonObject.add("flags", new JsonObject());
        return jsonObject;
    }
}

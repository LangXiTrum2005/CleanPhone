package ads_mobile_sdk;

import android.content.Context;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.privatdozent;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;
import saneness.hydrovane;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class vj1 {
    public final Context a;
    public final CoroutineContext b;
    public final hn1 c;
    public final sn1 d;
    public final com.google.android.libraries.ads.mobile.sdk.nativead.dern e;
    public final jk0 f;

    public vj1(Context context, CoroutineContext backgroundContext, hn1 nativeAssetsLoader, sn1 nativeCustomAssetsLoader, com.google.android.libraries.ads.mobile.sdk.nativead.dern nativeRequest, jk0 flags) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundContext, "backgroundContext");
        Intrinsics.checkNotNullParameter(nativeAssetsLoader, "nativeAssetsLoader");
        Intrinsics.checkNotNullParameter(nativeCustomAssetsLoader, "nativeCustomAssetsLoader");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = context;
        this.b = backgroundContext;
        this.c = nativeAssetsLoader;
        this.d = nativeCustomAssetsLoader;
        this.e = nativeRequest;
        this.f = flags;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static final Object a(vj1 vj1Var, hj1 hj1Var, gq0 gq0Var, wretchedly.dern dernVar) {
        tj1 tj1Var;
        ?? r10;
        ?? r7;
        TimeoutCancellationException e;
        w03 w03Var;
        vj1Var.getClass();
        if (dernVar instanceof tj1) {
            tj1Var = (tj1) dernVar;
            int i = tj1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tj1Var.e = i - Integer.MIN_VALUE;
            } else {
                tj1Var = new tj1(vj1Var, dernVar);
            }
        } else {
            tj1Var = new tj1(vj1Var, dernVar);
        }
        Object obj = tj1Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = tj1Var.e;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w03 w03Var2 = tj1Var.b;
                w03 w03Var3 = tj1Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    w03Var = w03Var2;
                    Unit unit = Unit.f29295attabal;
                    interaction.saneness.attabal(w03Var, null);
                    return unit;
                } catch (TimeoutCancellationException e2) {
                    e = e2;
                    throw new yn0(new on0(e, k41.TIMEOUT, "Immersive video media data timed out."));
                }
            }
            p002kotlin.dern.saneness(obj);
            no0 no0Var = no0.CUI_NAME_LOAD_NATIVE_IMMERSIVE_VIDEO_MEDIA_DATA;
            WeakHashMap weakHashMap = j13.a;
            w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                er0 er0VarD = gq0Var.d();
                if (er0VarD == null) {
                    throw new yn0(new rn0("Video controller is null.", k41.INTERNAL_ERROR));
                }
                try {
                    long jI = vj1Var.f.I();
                    uj1 uj1Var = new uj1(er0VarD, hj1Var, null);
                    tj1Var.a = w03VarA;
                    tj1Var.b = w03VarA;
                    tj1Var.e = 1;
                    if (TimeoutKt.wireman(jI, uj1Var, tj1Var) == objBeachfront) {
                        return objBeachfront;
                    }
                    w03Var = w03VarA;
                    Unit unit2 = Unit.f29295attabal;
                    interaction.saneness.attabal(w03Var, null);
                    return unit2;
                } catch (TimeoutCancellationException e3) {
                    e = e3;
                    throw new yn0(new on0(e, k41.TIMEOUT, "Immersive video media data timed out."));
                }
            } catch (Throwable th) {
                th = th;
                r7 = w03VarA;
                r10 = w03VarA;
                try {
                    r10.b(th);
                    if (th instanceof evenfall) {
                        throw th;
                    }
                    r10.a(th);
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
                        interaction.saneness.attabal(r7, th2);
                        throw th3;
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            r10 = hj1Var;
            r7 = vj1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(h1 h1Var, JsonObject jsonObject, a22 a22Var, wretchedly.dern dernVar) {
        jj1 jj1Var;
        hj1 hj1Var;
        if (dernVar instanceof jj1) {
            jj1Var = (jj1) dernVar;
            int i = jj1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jj1Var.d = i - Integer.MIN_VALUE;
            } else {
                jj1Var = new jj1(this, dernVar);
            }
        } else {
            jj1Var = new jj1(this, dernVar);
        }
        Object obj = jj1Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = jj1Var.d;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                hj1 hj1Var2 = new hj1();
                spartacist spartacistVarA = a(this.a, hj1Var2, h1Var, jsonObject);
                if (spartacistVarA instanceof nn0) {
                    return (nn0) spartacistVarA;
                }
                Intrinsics.competently(spartacistVarA, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                sj1 sj1Var = new sj1(a22Var, hj1Var2, this, jsonObject, null);
                jj1Var.a = hj1Var2;
                jj1Var.d = 1;
                if (privatdozent.marial(sj1Var, jj1Var) == objBeachfront) {
                    return objBeachfront;
                }
                hj1Var = hj1Var2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hj1Var = jj1Var.a;
                p002kotlin.dern.saneness(obj);
            }
            return new tn0(hj1Var);
        } catch (yn0 e) {
            return e.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0074 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:31:0x006d, B:33:0x0074, B:35:0x007b, B:37:0x007f, B:39:0x0083, B:42:0x0086, B:43:0x008b, B:44:0x008c, B:45:0x0093, B:46:0x0094, B:47:0x009b, B:48:0x009c), top: B:53:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:35:0x007b A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:31:0x006d, B:33:0x0074, B:35:0x007b, B:37:0x007f, B:39:0x0083, B:42:0x0086, B:43:0x008b, B:44:0x008c, B:45:0x0093, B:46:0x0094, B:47:0x009b, B:48:0x009c), top: B:53:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007f A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:31:0x006d, B:33:0x0074, B:35:0x007b, B:37:0x007f, B:39:0x0083, B:42:0x0086, B:43:0x008b, B:44:0x008c, B:45:0x0093, B:46:0x0094, B:47:0x009b, B:48:0x009c), top: B:53:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0083 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:31:0x006d, B:33:0x0074, B:35:0x007b, B:37:0x007f, B:39:0x0083, B:42:0x0086, B:43:0x008b, B:44:0x008c, B:45:0x0093, B:46:0x0094, B:47:0x009b, B:48:0x009c), top: B:53:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0086 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:31:0x006d, B:33:0x0074, B:35:0x007b, B:37:0x007f, B:39:0x0083, B:42:0x0086, B:43:0x008b, B:44:0x008c, B:45:0x0093, B:46:0x0094, B:47:0x009b, B:48:0x009c), top: B:53:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x008c A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:31:0x006d, B:33:0x0074, B:35:0x007b, B:37:0x007f, B:39:0x0083, B:42:0x0086, B:43:0x008b, B:44:0x008c, B:45:0x0093, B:46:0x0094, B:47:0x009b, B:48:0x009c), top: B:53:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0094 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:31:0x006d, B:33:0x0074, B:35:0x007b, B:37:0x007f, B:39:0x0083, B:42:0x0086, B:43:0x008b, B:44:0x008c, B:45:0x0093, B:46:0x0094, B:47:0x009b, B:48:0x009c), top: B:53:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:31:0x006d, B:33:0x0074, B:35:0x007b, B:37:0x007f, B:39:0x0083, B:42:0x0086, B:43:0x008b, B:44:0x008c, B:45:0x0093, B:46:0x0094, B:47:0x009b, B:48:0x009c), top: B:53:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(h1 h1Var, JsonObject jsonObject, a22 a22Var, wretchedly.dern dernVar) {
        ij1 ij1Var;
        w03 w03VarA;
        TimeoutCancellationException th;
        w03 w03Var;
        w03 w03Var2;
        if (dernVar instanceof ij1) {
            ij1Var = (ij1) dernVar;
            int i = ij1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ij1Var.e = i - Integer.MIN_VALUE;
            } else {
                ij1Var = new ij1(this, dernVar);
            }
        } else {
            ij1Var = new ij1(this, dernVar);
        }
        Object obj = ij1Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ij1Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            no0 no0Var = no0.CUI_NAME_LOAD_NATIVE_ASSETS;
            WeakHashMap weakHashMap = j13.a;
            w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                ij1Var.a = w03VarA;
                ij1Var.b = w03VarA;
                ij1Var.e = 1;
                Object objB = b(h1Var, jsonObject, a22Var, ij1Var);
                if (objB == objBeachfront) {
                    return objBeachfront;
                }
                w03Var2 = w03VarA;
                obj = objB;
                w03Var = w03Var2;
            } catch (Throwable th2) {
                th = th2;
                w03Var = w03VarA;
                w03VarA.b(th);
                if (!(th instanceof evenfall)) {
                    w03VarA.a(th);
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
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var = ij1Var.b;
            w03Var2 = ij1Var.a;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (Throwable th3) {
                th = th3;
                w03VarA = w03Var2;
                try {
                    w03VarA.b(th);
                    if (!(th instanceof evenfall)) {
                        w03VarA.a(th);
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
            y13.a((nn0) spartacistVar, false);
        }
        interaction.saneness.attabal(w03Var, null);
        return spartacistVar;
    }

    public final spartacist a(Context context, hj1 hj1Var, h1 h1Var, JsonObject jsonObject) {
        String asString;
        String asString2;
        String asString3;
        String asString4;
        String asString5;
        int iA = cb1.a(jsonObject, "template_id", -1);
        hj1Var.a = iA;
        if (iA == 3) {
            hj1Var.b = fj1.CUSTOM_NATIVE;
        } else {
            if (iA != 6) {
                return new rn0("Invalid native ad template id!");
            }
            hj1Var.b = fj1.NATIVE;
        }
        JsonElement jsonElement = jsonObject.get("custom_template_id");
        String asString6 = jsonElement != null ? jsonElement.getAsString() : null;
        hj1Var.c = asString6;
        if (hj1Var.b == fj1.CUSTOM_NATIVE && asString6 == null) {
            return new rn0("No custom template id for custom template ad response.");
        }
        hj1Var.e = Double.valueOf(Double.parseDouble(cb1.a(jsonObject, "rating", "-1.0")));
        JsonElement jsonElement2 = jsonObject.get("headline");
        String asString7 = jsonElement2 != null ? jsonElement2.getAsString() : null;
        if (h1Var.a0) {
            int i = bx2.a;
            asString7 = hydrovane.attabal(context) + ": " + asString7;
        }
        if (asString7 != null) {
            hj1Var.d.put("headline", asString7);
        }
        JsonElement jsonElement3 = jsonObject.get("body");
        if (jsonElement3 != null && (asString5 = jsonElement3.getAsString()) != null) {
            hj1Var.d.put("body", asString5);
        }
        JsonElement jsonElement4 = jsonObject.get("call_to_action");
        if (jsonElement4 != null && (asString4 = jsonElement4.getAsString()) != null) {
            hj1Var.d.put("call_to_action", asString4);
        }
        JsonElement jsonElement5 = jsonObject.get(X3.i.U);
        if (jsonElement5 != null && (asString3 = jsonElement5.getAsString()) != null) {
            hj1Var.d.put(X3.i.U, asString3);
        }
        JsonElement jsonElement6 = jsonObject.get("price");
        if (jsonElement6 != null && (asString2 = jsonElement6.getAsString()) != null) {
            hj1Var.d.put("price", asString2);
        }
        JsonElement jsonElement7 = jsonObject.get(X3.i.F0);
        if (jsonElement7 != null && (asString = jsonElement7.getAsString()) != null) {
            hj1Var.d.put(X3.i.F0, asString);
        }
        hj1Var.u = this.e.getAdChoicesPlacement();
        return new tn0(Unit.f29295attabal);
    }
}

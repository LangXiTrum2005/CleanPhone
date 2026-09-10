package ads_mobile_sdk;

import android.net.Uri;
import android.os.Bundle;
import arytenoidectomy.apical;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import java.util.List;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.splinterproof;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.rajahmundry;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class r30 extends arytenoidectomy.dern {
    public final saran a;
    public final amphitheatre b;
    public final jk0 c;
    public final po2 d;
    public final Object e;
    public boolean f;
    public monroe g;
    public long h;
    public long i;
    public String j;
    public apical k;
    public arytenoidectomy.dern l;
    public final JsonArray m;
    public final List n;

    public r30(saran backgroundScope, amphitheatre clock, jk0 flags, po2 signalCache) {
        JsonArray jsonArray;
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(signalCache, "signalCache");
        this.a = backgroundScope;
        this.b = clock;
        this.c = flags;
        this.d = signalCache;
        this.e = new Object();
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.h = companion.dern();
        this.i = companion.dern();
        try {
            jsonArray = (JsonArray) new Gson().fromJson(flags.U(), JsonArray.class);
        } catch (Exception e) {
            y13.a(e);
            jsonArray = null;
        }
        this.m = jsonArray == null ? new JsonArray() : jsonArray;
        this.n = this.c.r();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(r30 r30Var, wretchedly.dern dernVar) {
        l30 l30Var;
        r30Var.getClass();
        if (dernVar instanceof l30) {
            l30Var = (l30) dernVar;
            int i = l30Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l30Var.d = i - Integer.MIN_VALUE;
            } else {
                l30Var = new l30(r30Var, dernVar);
            }
        } else {
            l30Var = new l30(r30Var, dernVar);
        }
        Object obj = l30Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = l30Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            synchronized (r30Var.e) {
                try {
                    if (!r30Var.f) {
                        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                        r30Var.b.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                        if (p002kotlin.time.saneness.formularize(p002kotlin.time.dern.graveside(jCurrentTimeMillis, durationUnit), r30Var.i) <= 0) {
                            apical apicalVar = r30Var.k;
                            if (apicalVar == null) {
                                Intrinsics.preprohormone("session");
                                apicalVar = null;
                            }
                            String str = r30Var.j;
                            if (str == null) {
                                Intrinsics.preprohormone("origin");
                                str = null;
                            }
                            apicalVar.apical(Uri.parse(str));
                            jk0 jk0Var = r30Var.c;
                            jk0Var.getClass();
                            long jMolybdenite = p002kotlin.time.dern.molybdenite(100, durationUnit);
                            Intrinsics.checkNotNullParameter("gads:pact_polling_interval_ms", X3.i.W);
                            long rawValue = ((p002kotlin.time.saneness) jk0Var.a("gads:pact_polling_interval_ms", p002kotlin.time.saneness.cutely(jMolybdenite), zk.j)).getRawValue();
                            l30Var.a = r30Var;
                            l30Var.d = 1;
                            if (splinterproof.saneness(rawValue, l30Var) == objBeachfront) {
                                return objBeachfront;
                            }
                        }
                    }
                    return Unit.f29295attabal;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r30Var = l30Var.a;
        p002kotlin.dern.saneness(obj);
        saran saranVar = r30Var.a;
        m30 block = new m30(r30Var, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        return Unit.f29295attabal;
    }

    @Override // arytenoidectomy.dern
    public final void extraCallback(String callbackName, Bundle bundle) {
        arytenoidectomy.dern dernVar;
        Intrinsics.checkNotNullParameter(callbackName, "callbackName");
        synchronized (this.e) {
            dernVar = this.l;
        }
        if (dernVar != null) {
            dernVar.extraCallback(callbackName, bundle);
        }
    }

    @Override // arytenoidectomy.dern
    public final Bundle extraCallbackWithResult(String callbackName, Bundle bundle) {
        arytenoidectomy.dern dernVar;
        Intrinsics.checkNotNullParameter(callbackName, "callbackName");
        synchronized (this.e) {
            dernVar = this.l;
        }
        if (dernVar != null) {
            return dernVar.extraCallbackWithResult(callbackName, bundle);
        }
        return null;
    }

    @Override // arytenoidectomy.dern
    public final void onActivityResized(int i, int i2, Bundle extras) {
        arytenoidectomy.dern dernVar;
        Intrinsics.checkNotNullParameter(extras, "extras");
        synchronized (this.e) {
            dernVar = this.l;
        }
        if (dernVar != null) {
            dernVar.onActivityResized(i, i2, extras);
        }
    }

    @Override // arytenoidectomy.dern
    public final void onMessageChannelReady(Bundle bundle) {
        synchronized (this.e) {
            try {
                this.f = false;
                arytenoidectomy.dern dernVar = this.l;
                if (dernVar != null) {
                    dernVar.onMessageChannelReady(bundle);
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // arytenoidectomy.dern
    public final void onNavigationEvent(int i, Bundle bundle) {
        long rawValue;
        synchronized (this.e) {
            try {
                this.f = false;
                arytenoidectomy.dern dernVar = this.l;
                if (dernVar != null) {
                    dernVar.onNavigationEvent(i, bundle);
                }
                p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                this.b.getClass();
                this.h = p002kotlin.time.dern.graveside(System.currentTimeMillis(), DurationUnit.MILLISECONDS);
                if (this.n.contains(String.valueOf(i))) {
                    long j = this.h;
                    jk0 jk0Var = this.c;
                    jk0Var.getClass();
                    Intrinsics.checkNotNullParameter("gads:pact_polling_forever:enabled", X3.i.W);
                    if (((Boolean) jk0Var.a("gads:pact_polling_forever:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                        rawValue = companion.attabal();
                    } else {
                        jk0 jk0Var2 = this.c;
                        jk0Var2.getClass();
                        long jMolybdenite = p002kotlin.time.dern.molybdenite(60, DurationUnit.SECONDS);
                        Intrinsics.checkNotNullParameter("gads:pact_polling_duration_ms", X3.i.W);
                        rawValue = ((p002kotlin.time.saneness) jk0Var2.a("gads:pact_polling_duration_ms", p002kotlin.time.saneness.cutely(jMolybdenite), zk.j)).getRawValue();
                    }
                    this.i = p002kotlin.time.saneness.polder(j, rawValue);
                    monroe monroeVar = this.g;
                    if (monroeVar == null || monroeVar.saneness()) {
                        saran saranVar = this.a;
                        o30 block = new o30(this, null);
                        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                        Intrinsics.checkNotNullParameter(saranVar, "<this>");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(block, "block");
                        this.g = cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
                    }
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // arytenoidectomy.dern
    public final void onPostMessage(String message, Bundle bundle) {
        JsonObject jsonObject;
        arytenoidectomy.dern dernVar;
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            jsonObject = (JsonObject) new Gson().fromJson(message, JsonObject.class);
        } catch (Exception e) {
            List list = rajahmundry.attabal(e, "t", e).s;
            String message2 = e.getMessage();
            if (message2 == null) {
                message2 = e.getClass().getName();
            }
            Intrinsics.beachfront(message2);
            list.add(message2);
            jsonObject = null;
        }
        if (jsonObject != null && cb1.a(jsonObject, "gpa", -1) == 0) {
            synchronized (this.e) {
                this.f = true;
                Unit unit = Unit.f29295attabal;
            }
            a(cb1.a(jsonObject, "paw_id", ""));
        }
        synchronized (this.e) {
            dernVar = this.l;
        }
        if (dernVar != null) {
            dernVar.onPostMessage(message, bundle);
        }
    }

    @Override // arytenoidectomy.dern
    public final void onRelationshipValidationResult(int i, Uri requestedOrigin, boolean z, Bundle bundle) {
        arytenoidectomy.dern dernVar;
        Intrinsics.checkNotNullParameter(requestedOrigin, "requestedOrigin");
        synchronized (this.e) {
            dernVar = this.l;
        }
        if (dernVar != null) {
            dernVar.onRelationshipValidationResult(i, requestedOrigin, z, bundle);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(r30 r30Var, String str, wretchedly.dern dernVar) {
        n30 n30Var;
        r30Var.getClass();
        if (dernVar instanceof n30) {
            n30Var = (n30) dernVar;
            int i = n30Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                n30Var.e = i - Integer.MIN_VALUE;
            } else {
                n30Var = new n30(r30Var, dernVar);
            }
        } else {
            n30Var = new n30(r30Var, dernVar);
        }
        Object objB = n30Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = n30Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objB);
            po2 po2Var = r30Var.d;
            n30Var.a = r30Var;
            n30Var.b = str;
            n30Var.e = 1;
            po2Var.getClass();
            objB = po2.b(po2Var, false, n30Var);
            if (objB == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = n30Var.b;
            r30Var = n30Var.a;
            p002kotlin.dern.saneness(objB);
        }
        spartacist spartacistVar = (spartacist) objB;
        if (spartacistVar instanceof tn0) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.add("eids", r30Var.m);
            jsonObject.addProperty("paw_id", str);
            jsonObject.addProperty("sdk_ttl_ms", igo.attabal.marial(r30Var.c.f0() ? p002kotlin.time.saneness.adultoid(r30Var.c.g0()) : 0L));
            jsonObject.addProperty("signal", ((adjudge.attabal) ((tn0) spartacistVar).b).getSignalString());
            synchronized (r30Var.e) {
                try {
                    apical apicalVar = r30Var.k;
                    if (apicalVar == null) {
                        Intrinsics.preprohormone("session");
                        apicalVar = null;
                    }
                    apicalVar.cutely(jsonObject.toString(), null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (spartacistVar instanceof nn0) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.add("eids", r30Var.m);
            jsonObject2.addProperty("paw_id", str);
            jsonObject2.addProperty("sdk_ttl_ms", igo.attabal.marial(r30Var.c.f0() ? p002kotlin.time.saneness.adultoid(r30Var.c.g0()) : 0L));
            jsonObject2.addProperty("error", spartacistVar.toString());
            synchronized (r30Var.e) {
                try {
                    apical apicalVar2 = r30Var.k;
                    if (apicalVar2 == null) {
                        Intrinsics.preprohormone("session");
                        apicalVar2 = null;
                    }
                    apicalVar2.cutely(jsonObject2.toString(), null);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Unit.f29295attabal;
    }

    public final void a(String str) {
        synchronized (this.e) {
            try {
                JsonObject jsonObject = new JsonObject();
                jsonObject.add("eids", this.m);
                jsonObject.addProperty("gsppack", Boolean.TRUE);
                jsonObject.addProperty("fpt", String.valueOf(p002kotlin.time.saneness.adultoid(this.h)));
                apical apicalVar = this.k;
                if (apicalVar == null) {
                    Intrinsics.preprohormone("session");
                    apicalVar = null;
                }
                apicalVar.cutely(jsonObject.toString(), null);
                saran saranVar = this.a;
                q30 block = new q30(this, str, null);
                EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package ads_mobile_sdk;

import android.os.Bundle;
import com.google.android.gms.ads.AdError;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import complexometry.AdSourceResponseInfo;
import complexometry.MediationAdError;
import complexometry.ResponseInfo;
import complexometry.formularize;
import formularization.beachfront;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.basify;
import saneness.metairie;
import saneness.rajahmundry;
import saneness.rockless;

/* JADX INFO: loaded from: classes.dex */
public final class gy0 implements rockless, basify {
    public final wz0 a;
    public final yf2 b;
    public final Optional c;
    public final String d;
    public final boolean e;
    public final amphitheatre f;
    public final Gson g;
    public String h;
    public final formularization.attabal i;
    public yx0 j;
    public boolean k;
    public boolean l;
    public JsonObject m;
    public String n;
    public String o;
    public String p;
    public JsonObject q;
    public JsonObject r;
    public nn0 s;
    public ResponseInfo t;
    public long u;
    public volatile boolean v;

    public gy0(wz0 inspectorManager, yf2 requestType, Optional baseRequest, String requestId, boolean z, amphitheatre clock, Gson gson) {
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.a = inspectorManager;
        this.b = requestType;
        this.c = baseRequest;
        this.d = requestId;
        this.e = z;
        this.f = clock;
        this.g = gson;
        this.i = beachfront.saneness(false, 1, null);
        this.j = yx0.AD_REQUESTED;
        this.m = new JsonObject();
        this.n = "";
        this.o = "";
        this.p = "";
        this.q = new JsonObject();
        this.r = new JsonObject();
        this.u = p002kotlin.time.saneness.INSTANCE.dern();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(wretchedly.dern dernVar) {
        zx0 zx0Var;
        gy0 gy0Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof zx0) {
            zx0Var = (zx0) dernVar;
            int i = zx0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                zx0Var.e = i - Integer.MIN_VALUE;
            } else {
                zx0Var = new zx0(this, dernVar);
            }
        } else {
            zx0Var = new zx0(this, dernVar);
        }
        Object obj = zx0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = zx0Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.i;
            zx0Var.a = this;
            zx0Var.b = attabalVar2;
            zx0Var.e = 1;
            if (attabalVar2.attabal(null, zx0Var) == objBeachfront) {
                return objBeachfront;
            }
            gy0Var = this;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = zx0Var.b;
            gy0Var = zx0Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            gy0Var.l = true;
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    @Override // saneness.rockless
    public final Object b(wretchedly.dern dernVar) {
        return a(this, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(wretchedly.dern dernVar) {
        ey0 ey0Var;
        gy0 gy0Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof ey0) {
            ey0Var = (ey0) dernVar;
            int i = ey0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ey0Var.e = i - Integer.MIN_VALUE;
            } else {
                ey0Var = new ey0(this, dernVar);
            }
        } else {
            ey0Var = new ey0(this, dernVar);
        }
        Object obj = ey0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ey0Var.e;
        boolean z = true;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.i;
            ey0Var.a = this;
            ey0Var.b = attabalVar2;
            ey0Var.e = 1;
            if (attabalVar2.attabal(null, ey0Var) == objBeachfront) {
                return objBeachfront;
            }
            gy0Var = this;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = ey0Var.b;
            gy0Var = ey0Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            if (gy0Var.j == yx0.AD_REQUESTED) {
                z = false;
            }
            return igo.attabal.attabal(z);
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(wretchedly.dern dernVar) {
        fy0 fy0Var;
        gy0 gy0Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof fy0) {
            fy0Var = (fy0) dernVar;
            int i = fy0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fy0Var.e = i - Integer.MIN_VALUE;
            } else {
                fy0Var = new fy0(this, dernVar);
            }
        } else {
            fy0Var = new fy0(this, dernVar);
        }
        Object obj = fy0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = fy0Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.i;
            fy0Var.a = this;
            fy0Var.b = attabalVar2;
            fy0Var.e = 1;
            if (attabalVar2.attabal(null, fy0Var) == objBeachfront) {
                return objBeachfront;
            }
            gy0Var = this;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = fy0Var.b;
            gy0Var = fy0Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("state", gy0Var.j.name());
            String upperCase = gy0Var.b.a.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            jsonObject.addProperty("format", upperCase);
            jsonObject.addProperty("isOutOfContext", igo.attabal.attabal(gy0Var.e));
            if (gy0Var.e) {
                jsonObject.addProperty("shown", igo.attabal.attabal(gy0Var.l));
            }
            ResponseInfo responseInfo = gy0Var.t;
            if (responseInfo != null) {
                jsonObject.add("responseInfo", gy0Var.a(responseInfo));
            }
            return jsonObject;
        } finally {
            attabalVar.wireman(null);
        }
    }

    @Override // saneness.basify
    public final Object a(nn0 nn0Var, ResponseInfo responseInfo, wretchedly.dern dernVar) {
        return a(this, nn0Var, responseInfo, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(gy0 gy0Var, nn0 nn0Var, ResponseInfo responseInfo, wretchedly.dern dernVar) throws Throwable {
        ay0 ay0Var;
        formularization.attabal attabalVar;
        Object objM;
        if (dernVar instanceof ay0) {
            ay0Var = (ay0) dernVar;
            int i = ay0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ay0Var.g = i - Integer.MIN_VALUE;
            } else {
                ay0Var = new ay0(gy0Var, dernVar);
            }
        } else {
            ay0Var = new ay0(gy0Var, dernVar);
        }
        Object obj = ay0Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ay0Var.g;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                if (!gy0Var.v) {
                    return Unit.f29295attabal;
                }
                attabalVar = gy0Var.i;
                ay0Var.a = gy0Var;
                ay0Var.b = nn0Var;
                ay0Var.c = responseInfo;
                ay0Var.d = attabalVar;
                ay0Var.g = 1;
                if (attabalVar.attabal(null, ay0Var) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                formularization.attabal attabalVar2 = ay0Var.d;
                responseInfo = ay0Var.c;
                nn0Var = ay0Var.b;
                gy0 gy0Var2 = ay0Var.a;
                p002kotlin.dern.saneness(obj);
                attabalVar = attabalVar2;
                gy0Var = gy0Var2;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p002kotlin.dern.saneness(obj);
                    return obj;
                }
                gy0Var = ay0Var.a;
                p002kotlin.dern.saneness(obj);
            }
            wz0 wz0Var = gy0Var.a;
            ay0Var.a = null;
            ay0Var.g = 3;
            objM = wz0Var.m(ay0Var);
            if (objM != objBeachfront) {
                return objBeachfront;
            }
            return objM;
            gy0Var.j = yx0.AD_LOAD_FAILED;
            gy0Var.s = nn0Var;
            gy0Var.t = responseInfo;
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            gy0Var.f.getClass();
            gy0Var.u = p002kotlin.time.dern.graveside(System.currentTimeMillis(), DurationUnit.MILLISECONDS);
            Unit unit = Unit.f29295attabal;
            attabalVar.wireman(null);
            wz0 wz0Var2 = gy0Var.a;
            String str = gy0Var.h;
            if (str == null) {
                Intrinsics.preprohormone("adUnitId");
                str = null;
            }
            ay0Var.a = gy0Var;
            ay0Var.b = null;
            ay0Var.c = null;
            ay0Var.d = null;
            ay0Var.g = 2;
            if (wz0Var2.a(str, gy0Var, ay0Var) != objBeachfront) {
                wz0 wz0Var3 = gy0Var.a;
                ay0Var.a = null;
                ay0Var.g = 3;
                objM = wz0Var3.m(ay0Var);
                if (objM != objBeachfront) {
                    return objM;
                }
            }
            return objBeachfront;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    @Override // saneness.basify
    public final Object a(jm2 jm2Var, h1 h1Var, ResponseInfo responseInfo, wretchedly.dern dernVar) {
        return a(this, responseInfo, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(gy0 gy0Var, ResponseInfo responseInfo, wretchedly.dern dernVar) throws Throwable {
        by0 by0Var;
        formularization.attabal attabalVar;
        Object objM;
        if (dernVar instanceof by0) {
            by0Var = (by0) dernVar;
            int i = by0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                by0Var.f = i - Integer.MIN_VALUE;
            } else {
                by0Var = new by0(gy0Var, dernVar);
            }
        } else {
            by0Var = new by0(gy0Var, dernVar);
        }
        Object obj = by0Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = by0Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                if (!gy0Var.v) {
                    return Unit.f29295attabal;
                }
                attabalVar = gy0Var.i;
                by0Var.a = gy0Var;
                by0Var.b = responseInfo;
                by0Var.c = attabalVar;
                by0Var.f = 1;
                if (attabalVar.attabal(null, by0Var) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                formularization.attabal attabalVar2 = by0Var.c;
                responseInfo = by0Var.b;
                gy0 gy0Var2 = by0Var.a;
                p002kotlin.dern.saneness(obj);
                attabalVar = attabalVar2;
                gy0Var = gy0Var2;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p002kotlin.dern.saneness(obj);
                    return obj;
                }
                gy0Var = by0Var.a;
                p002kotlin.dern.saneness(obj);
            }
            wz0 wz0Var = gy0Var.a;
            by0Var.a = null;
            by0Var.f = 3;
            objM = wz0Var.m(by0Var);
            if (objM != objBeachfront) {
                return objBeachfront;
            }
            return objM;
            gy0Var.j = yx0.AD_LOADED;
            gy0Var.t = responseInfo;
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            gy0Var.f.getClass();
            gy0Var.u = p002kotlin.time.dern.graveside(System.currentTimeMillis(), DurationUnit.MILLISECONDS);
            Unit unit = Unit.f29295attabal;
            attabalVar.wireman(null);
            wz0 wz0Var2 = gy0Var.a;
            String str = gy0Var.h;
            if (str == null) {
                Intrinsics.preprohormone("adUnitId");
                str = null;
            }
            by0Var.a = gy0Var;
            by0Var.b = null;
            by0Var.c = null;
            by0Var.f = 2;
            if (wz0Var2.a(str, gy0Var, by0Var) != objBeachfront) {
                wz0 wz0Var3 = gy0Var.a;
                by0Var.a = null;
                by0Var.f = 3;
                objM = wz0Var3.m(by0Var);
                if (objM != objBeachfront) {
                    return objM;
                }
            }
            return objBeachfront;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    @Override // saneness.rockless
    public final Object a(jm2 jm2Var, wretchedly.dern dernVar) {
        return a(this, jm2Var, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ac A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002f, B:31:0x00a4, B:33:0x00ac, B:35:0x00bb, B:34:0x00b9), top: B:44:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002f, B:31:0x00a4, B:33:0x00ac, B:35:0x00bb, B:34:0x00b9), top: B:44:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(gy0 gy0Var, jm2 jm2Var, wretchedly.dern dernVar) throws Throwable {
        cy0 cy0Var;
        formularization.attabal attabalVar;
        formularization.attabal attabalVar2;
        gy0 gy0Var2;
        if (dernVar instanceof cy0) {
            cy0Var = (cy0) dernVar;
            int i = cy0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cy0Var.f = i - Integer.MIN_VALUE;
            } else {
                cy0Var = new cy0(gy0Var, dernVar);
            }
        } else {
            cy0Var = new cy0(gy0Var, dernVar);
        }
        Object obj = cy0Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = cy0Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                if (!gy0Var.v) {
                    return Unit.f29295attabal;
                }
                attabalVar = gy0Var.i;
                cy0Var.a = gy0Var;
                cy0Var.b = jm2Var;
                cy0Var.c = attabalVar;
                cy0Var.f = 1;
                if (attabalVar.attabal(null, cy0Var) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar2 = cy0Var.c;
                jm2Var = cy0Var.b;
                gy0Var2 = cy0Var.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    if (((Boolean) obj).booleanValue()) {
                        ur urVar = jm2Var.b.b;
                        gy0Var2.r = urVar.e;
                        gy0Var2.o = urVar.d;
                    } else {
                        gy0Var2.k = true;
                    }
                    Unit unit = Unit.f29295attabal;
                    attabalVar2.wireman(null);
                    return unit;
                } catch (Throwable th) {
                    th = th;
                    attabalVar2.wireman(null);
                    throw th;
                }
            }
            formularization.attabal attabalVar3 = cy0Var.c;
            jm2Var = cy0Var.b;
            gy0 gy0Var3 = cy0Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar3;
            gy0Var = gy0Var3;
            ur urVar2 = jm2Var.b.b;
            gy0Var.m = urVar2.f;
            gy0Var.n = urVar2.c;
            gy0Var.p = urVar2.b;
            gy0Var.q = urVar2.i;
            wz0 wz0Var = gy0Var.a;
            int length = urVar2.e.toString().length() + jm2Var.b.b.d.length();
            cy0Var.a = gy0Var;
            cy0Var.b = jm2Var;
            cy0Var.c = attabalVar;
            cy0Var.f = 2;
            Object objA = wz0Var.a(length, cy0Var);
            if (objA != objBeachfront) {
                gy0Var2 = gy0Var;
                attabalVar2 = attabalVar;
                obj = objA;
                if (((Boolean) obj).booleanValue()) {
                    ur urVar3 = jm2Var.b.b;
                    gy0Var2.r = urVar3.e;
                    gy0Var2.o = urVar3.d;
                } else {
                    gy0Var2.k = true;
                }
                Unit unit2 = Unit.f29295attabal;
                attabalVar2.wireman(null);
                return unit2;
            }
            return objBeachfront;
        } catch (Throwable th2) {
            th = th2;
            attabalVar2 = attabalVar;
            attabalVar2.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(gy0 gy0Var, wretchedly.dern dernVar) {
        dy0 dy0Var;
        gy0 gy0Var2;
        String str;
        if (dernVar instanceof dy0) {
            dy0Var = (dy0) dernVar;
            int i = dy0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dy0Var.e = i - Integer.MIN_VALUE;
            } else {
                dy0Var = new dy0(gy0Var, dernVar);
            }
        } else {
            dy0Var = new dy0(gy0Var, dernVar);
        }
        Object obj = dy0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = dy0Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularize formularizeVar = (formularize) monocoque.attabal.saneness(gy0Var.c);
            String strTriweekly = formularizeVar != null ? formularizeVar.getAdUnitId() : null;
            wz0 wz0Var = gy0Var.a;
            dy0Var.a = gy0Var;
            dy0Var.b = strTriweekly;
            dy0Var.e = 1;
            wz0Var.getClass();
            Object objA = wz0.a(wz0Var, dy0Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            gy0Var2 = gy0Var;
            str = strTriweekly;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = dy0Var.b;
            gy0Var2 = dy0Var.a;
            p002kotlin.dern.saneness(obj);
        }
        if (((Boolean) obj).booleanValue() && str != null) {
            gy0Var2.h = str;
            gy0Var2.v = true;
        }
        return Unit.f29295attabal;
    }

    public final JsonObject a(ResponseInfo responseInfo) {
        JsonObject jsonObject;
        JsonElement jsonElement;
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("winningAdapterClassName", responseInfo.getAdapterClassName());
        jsonObject2.addProperty("responseSecsSinceEpoch", Long.valueOf(p002kotlin.time.saneness.gintrap(this.u)));
        jsonObject2.addProperty("responseId", responseInfo.getResponseId());
        jsonObject2.addProperty("adRequestUrl", this.n);
        jsonObject2.addProperty("postBody", this.p);
        jsonObject2.addProperty("adResponseBody", this.o);
        jsonObject2.addProperty("hasExceededMemoryLimit", Boolean.valueOf(this.k));
        jsonObject2.add("adResponseHeaders", this.r);
        jsonObject2.add("transactionExtras", this.q);
        jsonObject2.add("biddingData", this.m);
        JsonArray jsonArray = new JsonArray();
        for (AdSourceResponseInfo impromptuVar : responseInfo.attabal()) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("adapterClassName", impromptuVar.getAdapterClassName());
            jsonObject3.addProperty("latencyMillis", Long.valueOf(impromptuVar.getLatencyMillis()));
            Bundle bundleDern = impromptuVar.getCredentials();
            try {
                Gson gson = this.g;
                jsonObject = (JsonObject) gson.fromJson(gson.toJson(bundleDern), JsonObject.class);
            } catch (Exception e) {
                List list = rajahmundry.attabal(e, "t", e).s;
                String message = e.getMessage();
                if (message == null) {
                    message = e.getClass().getName();
                }
                Intrinsics.beachfront(message);
                list.add(message);
                jsonObject = null;
            }
            if (jsonObject == null) {
                jsonObject = new JsonObject();
            }
            jsonObject3.add("credentials", jsonObject);
            MediationAdError arytenoidectomyVarAttabal = impromptuVar.getAdError();
            if (arytenoidectomyVarAttabal == null) {
                jsonElement = JsonNull.INSTANCE;
            } else {
                JsonObject jsonObject4 = new JsonObject();
                jsonObject4.addProperty("errorDomain", arytenoidectomyVarAttabal.getDomain());
                jsonObject4.addProperty(IronSourceConstants.EVENTS_ERROR_CODE, arytenoidectomyVarAttabal.attabal());
                jsonObject4.addProperty("errorDescription", arytenoidectomyVarAttabal.getMessage());
                jsonObject4.add("underlyingError", JsonNull.INSTANCE);
                jsonElement = jsonObject4;
            }
            jsonObject3.add("error", jsonElement);
            jsonArray.add(jsonObject3);
        }
        jsonObject2.add("adNetworks", jsonArray);
        nn0 nn0Var = this.s;
        if (responseInfo.attabal().isEmpty() && nn0Var != null) {
            JsonArray jsonArray2 = new JsonArray();
            JsonObject jsonObject5 = new JsonObject();
            jsonObject5.addProperty("errorDomain", AdError.GOOGLE_MOBILE_ADS_DOMAIN);
            jsonObject5.addProperty(IronSourceConstants.EVENTS_ERROR_CODE, nn0Var.a().a().name());
            jsonObject5.addProperty("errorDescription", metairie.attabal(nn0Var));
            jsonObject5.add("underlyingError", JsonNull.INSTANCE);
            jsonArray2.add(jsonObject5);
            jsonObject2.add("errors", jsonArray2);
        }
        return jsonObject2;
    }
}

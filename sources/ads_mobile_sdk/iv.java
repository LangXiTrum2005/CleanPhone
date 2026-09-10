package ads_mobile_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.webkit.CookieManager;
import com.google.ads.mediation.inmobi.InMobiNetworkKeys;
import com.google.common.io.BaseEncoding;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.ironsource.X3;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.services.core.fid.Constants;
import formularization.beachfront;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cord;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.splinterproof;
import kotlinx.coroutines.walach;
import org.objectweb.asm.Opcodes;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;
import p002kotlin.time.DurationUnit;
import patroclinal.formularize;
import saneness.adultoid;
import saneness.amphitheatre;
import saneness.apologetic;
import saneness.coffeecake;
import saneness.cyrtometer;
import saneness.derbyshire;
import saneness.emodin;
import saneness.evenfall;
import saneness.exaltedly;
import saneness.eyepiece;
import saneness.hydrofracturing;
import saneness.invest;
import saneness.juju;
import saneness.kaif;
import saneness.lampshade;
import saneness.lehua;
import saneness.loun;
import saneness.patriotism;
import saneness.spartacist;
import saneness.stupefactive;
import saneness.supercargo;

/* JADX INFO: loaded from: classes.dex */
public final class iv extends ox0 implements SharedPreferences.OnSharedPreferenceChangeListener, exaltedly {
    public static final Pattern P = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    public static final JsonObject Q;
    public static final JsonObject R;
    public static final Bundle S;
    public final ej1 A;
    public final cord B;
    public CookieManager C;
    public SharedPreferences D;
    public final ej1 E;
    public final formularization.attabal F;
    public monroe G;
    public boolean H;
    public final formularization.attabal I;
    public ln J;
    public walach K;
    public final formularization.attabal L;
    public String M;
    public walach N;
    public long O;
    public final Context c;
    public final saran d;
    public final supercargo e;
    public final loun f;
    public final Gson g;
    public final jk0 h;
    public final ip0 i;
    public final lehua j;
    public final hf k;
    public final a02 l;
    public final l03 m;
    public final ih n;
    public final wg0 o;
    public final amphitheatre p;
    public final ri2 q;
    public final kaif r;
    public final adultoid s;
    public final stupefactive t;
    public final zj0 u;
    public final sj0 v;
    public final formularization.attabal w;
    public Bundle x;
    public final formularization.attabal y;
    public JsonObject z;

    static {
        JsonObject jsonObject = new JsonObject();
        Boolean bool = Boolean.TRUE;
        jsonObject.addProperty("gad_idless", bool);
        Boolean bool2 = Boolean.FALSE;
        jsonObject.addProperty("has_special_purposes", bool2);
        Q = jsonObject;
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("gad_idless", bool2);
        jsonObject2.addProperty("has_special_purposes", bool);
        R = jsonObject2;
        S = claque.wireman.attabal(formularize.attabal("fake_key", "fake_val"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(Context applicationContext, saran backgroundScope, supercargo javascriptEngine, loun traceLogger, Gson gson, jk0 flags, ip0 gmaUtil, lehua advertisingIdClientWrapper, hf appSetIdClientWrapper, a02 paidLifecycleWrapper, l03 topicsApiClient, ih attributionReportingApiClient, wg0 firebaseAnalyticsAdapter, amphitheatre clock, ri2 rootTraceCreator, kaif randomGenerator, coffeecake trustlessTokenClientProvider, stupefactive flagValueProvider, zj0 flagUpdater, sj0 flagDataStore) {
        super(no0.CUI_NAME_SDKINIT_INIT_CONSENT_STATE, 2);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(advertisingIdClientWrapper, "advertisingIdClientWrapper");
        Intrinsics.checkNotNullParameter(appSetIdClientWrapper, "appSetIdClientWrapper");
        Intrinsics.checkNotNullParameter(paidLifecycleWrapper, "paidLifecycleWrapper");
        Intrinsics.checkNotNullParameter(topicsApiClient, "topicsApiClient");
        Intrinsics.checkNotNullParameter(attributionReportingApiClient, "attributionReportingApiClient");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsAdapter, "firebaseAnalyticsAdapter");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(randomGenerator, "randomGenerator");
        Intrinsics.checkNotNullParameter(trustlessTokenClientProvider, "trustlessTokenClientProvider");
        Intrinsics.checkNotNullParameter(flagValueProvider, "flagValueProvider");
        Intrinsics.checkNotNullParameter(flagUpdater, "flagUpdater");
        Intrinsics.checkNotNullParameter(flagDataStore, "flagDataStore");
        this.c = applicationContext;
        this.d = backgroundScope;
        this.e = javascriptEngine;
        this.f = traceLogger;
        this.g = gson;
        this.h = flags;
        this.i = gmaUtil;
        this.j = advertisingIdClientWrapper;
        this.k = appSetIdClientWrapper;
        this.l = paidLifecycleWrapper;
        this.m = topicsApiClient;
        this.n = attributionReportingApiClient;
        this.o = firebaseAnalyticsAdapter;
        this.p = clock;
        this.q = rootTraceCreator;
        this.r = randomGenerator;
        this.s = trustlessTokenClientProvider;
        this.t = flagValueProvider;
        this.u = flagUpdater;
        this.v = flagDataStore;
        this.w = beachfront.saneness(false, 1, null);
        this.x = S;
        this.y = beachfront.saneness(false, 1, null);
        this.z = Q;
        apologetic apologeticVarS = gt.s();
        Intrinsics.checkNotNullExpressionValue(apologeticVarS, "newBuilder(...)");
        this.A = new ej1(emodin.attabal(apologeticVarS).a());
        this.B = JobKt__JobKt.saneness(null, 1, null);
        this.E = new ej1(b());
        this.F = beachfront.saneness(false, 1, null);
        this.I = beachfront.saneness(false, 1, null);
        this.L = beachfront.saneness(false, 1, null);
        this.O = p002kotlin.time.saneness.INSTANCE.dern();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0231  */
    /* JADX WARN: Code duplicated, block: B:115:0x0254  */
    /* JADX WARN: Code duplicated, block: B:120:0x0274  */
    /* JADX WARN: Code duplicated, block: B:124:0x027f  */
    /* JADX WARN: Code duplicated, block: B:126:0x029d  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object a(iv ivVar, boolean z, boolean z2, wretchedly.dern dernVar) {
        vu vuVar;
        Bundle bundle;
        boolean z3;
        formularization.attabal attabalVar;
        iv ivVar2;
        Bundle bundle2;
        formularization.attabal attabalVar2;
        Bundle bundle3;
        formularization.attabal attabalVar3;
        iv ivVar3;
        boolean z4;
        Bundle bundle4;
        formularization.attabal attabalVar4;
        Bundle bundle5;
        formularization.attabal attabalVar5;
        Bundle bundle6;
        iv ivVar4;
        iv ivVar5;
        derbyshire derbyshireVar;
        formularization.attabal attabalVar6;
        iv ivVar6;
        formularization.attabal attabalVar7;
        iv ivVar7 = ivVar;
        ivVar7.getClass();
        if (dernVar instanceof vu) {
            vuVar = (vu) dernVar;
            int i = vuVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                vuVar.i = i - Integer.MIN_VALUE;
            } else {
                vuVar = new vu(ivVar7, dernVar);
            }
        } else {
            vuVar = new vu(ivVar7, dernVar);
        }
        Object objF = vuVar.g;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        switch (vuVar.i) {
            case 0:
                p002kotlin.dern.saneness(objF);
                bundle = new Bundle();
                ri2 ri2Var = ivVar7.q;
                no0 no0Var = no0.CUI_NAME_CONSENT_STRING_READING;
                List listFormularize = p002kotlin.collections.adultoid.formularize();
                l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
                if (j13.b().a == null) {
                    v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                    try {
                        try {
                            try {
                                JsonArray jsonArray = (JsonArray) new Gson().fromJson(ivVar7.h.r.dern(), JsonArray.class);
                                SharedPreferences sharedPreferences = ivVar7.D;
                                if (sharedPreferences == null) {
                                    Intrinsics.preprohormone("sharedPreferences");
                                    sharedPreferences = null;
                                }
                                Map<String, ?> all = sharedPreferences.getAll();
                                for (JsonElement jsonElement : jsonArray) {
                                    Intrinsics.beachfront(all);
                                    Intrinsics.beachfront(jsonElement);
                                    ivVar7.a(all, jsonElement, bundle);
                                }
                            } catch (NullPointerException e) {
                                ((d13) ivVar7.f).a("Failure reading consent strings from shared preferences", e);
                            }
                        } catch (JsonSyntaxException e2) {
                            ((d13) ivVar7.f).a("JSON shared preference consent key set parsing failure", e2);
                        }
                        Unit unit = Unit.f29295attabal;
                        interaction.saneness.attabal(v62VarA, null);
                        break;
                    } catch (Throwable th) {
                        try {
                            v62VarA.b(th);
                            if (th instanceof evenfall) {
                                throw th;
                            }
                            v62VarA.a(th);
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
                                interaction.saneness.attabal(v62VarA, th2);
                                throw th3;
                            }
                        }
                    }
                } else {
                    w03 w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
                    try {
                        try {
                            try {
                                JsonArray jsonArray2 = (JsonArray) new Gson().fromJson(ivVar7.h.r.dern(), JsonArray.class);
                                SharedPreferences sharedPreferences2 = ivVar7.D;
                                if (sharedPreferences2 == null) {
                                    Intrinsics.preprohormone("sharedPreferences");
                                    sharedPreferences2 = null;
                                }
                                Map<String, ?> all2 = sharedPreferences2.getAll();
                                for (JsonElement jsonElement2 : jsonArray2) {
                                    Intrinsics.beachfront(all2);
                                    Intrinsics.beachfront(jsonElement2);
                                    ivVar7.a(all2, jsonElement2, bundle);
                                }
                            } catch (JsonSyntaxException e3) {
                                ((d13) ivVar7.f).a("JSON shared preference consent key set parsing failure", e3);
                            }
                        } catch (NullPointerException e4) {
                            ((d13) ivVar7.f).a("Failure reading consent strings from shared preferences", e4);
                        }
                        Unit unit2 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03VarA, null);
                        break;
                    } catch (Throwable th4) {
                        try {
                            w03VarA.b(th4);
                            if (th4 instanceof evenfall) {
                                throw th4;
                            }
                            w03VarA.a(th4);
                            if (th4 instanceof TimeoutCancellationException) {
                                throw new cp0(th4);
                            }
                            if (th4 instanceof CancellationException) {
                                throw new bn0(th4);
                            }
                            if (th4 instanceof yn0) {
                                throw th4;
                            }
                            throw new gn0(th4);
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                interaction.saneness.attabal(w03VarA, th5);
                                throw th6;
                            }
                        }
                    }
                }
                jk0 jk0Var = ivVar7.h;
                if (!jk0Var.v && jk0Var.w <= 0.0d) {
                    formularization.attabal attabalVar8 = ivVar7.w;
                    vuVar.a = ivVar7;
                    vuVar.b = bundle;
                    vuVar.c = attabalVar8;
                    vuVar.i = 8;
                    if (attabalVar8.attabal(null, vuVar) == objBeachfront) {
                        return objBeachfront;
                    }
                    attabalVar2 = attabalVar8;
                    bundle3 = bundle;
                    try {
                        ivVar7.x = bundle3;
                        Unit unit3 = Unit.f29295attabal;
                        attabalVar2.wireman(null);
                        vuVar.a = null;
                        vuVar.b = null;
                        vuVar.c = null;
                        vuVar.i = 9;
                        if (ivVar7.a(bundle3, vuVar) == objBeachfront) {
                            return objBeachfront;
                        }
                        return Unit.f29295attabal;
                    } catch (Throwable th7) {
                        attabalVar2.wireman(null);
                        throw th7;
                    }
                }
                if (!z) {
                    attabalVar = ivVar7.w;
                    vuVar.a = ivVar7;
                    vuVar.b = bundle;
                    vuVar.c = attabalVar;
                    vuVar.d = ivVar7;
                    vuVar.e = bundle;
                    z3 = z2;
                    vuVar.f = z3;
                    vuVar.i = 1;
                    if (attabalVar.attabal(null, vuVar) == objBeachfront) {
                        return objBeachfront;
                    }
                    ivVar2 = ivVar7;
                    bundle2 = bundle;
                    try {
                        bundle5 = ivVar2.x;
                        attabalVar.wireman(null);
                        ivVar7.getClass();
                        if (!a(bundle, bundle5)) {
                            bundle = bundle2;
                            ivVar7 = ivVar2;
                        }
                        return Unit.f29295attabal;
                    } catch (Throwable th8) {
                        attabalVar.wireman(null);
                        throw th8;
                    }
                }
                z3 = z2;
                attabalVar3 = ivVar7.F;
                vuVar.a = ivVar7;
                vuVar.b = bundle;
                vuVar.c = attabalVar3;
                vuVar.d = null;
                vuVar.e = null;
                vuVar.f = z3;
                vuVar.i = 2;
                if (attabalVar3.attabal(null, vuVar) == objBeachfront) {
                    return objBeachfront;
                }
                ivVar3 = ivVar7;
                z4 = z3;
                bundle4 = bundle;
                attabalVar4 = attabalVar3;
                try {
                    ivVar3.H = true;
                    Unit unit4 = Unit.f29295attabal;
                    attabalVar4.wireman(null);
                    attabalVar5 = ivVar3.w;
                    vuVar.a = ivVar3;
                    vuVar.b = bundle4;
                    vuVar.c = attabalVar5;
                    vuVar.f = z4;
                    vuVar.i = 3;
                    if (attabalVar5.attabal(null, vuVar) == objBeachfront) {
                        return objBeachfront;
                    }
                    bundle6 = bundle4;
                    ivVar4 = ivVar3;
                    try {
                        ivVar4.x = bundle6;
                        Unit unit5 = Unit.f29295attabal;
                        attabalVar5.wireman(null);
                        if (z4) {
                            derbyshireVar = ivVar4.h.r;
                            derbyshireVar.getClass();
                            Intrinsics.checkNotNullParameter("gads:enable_full_consent_fallback_check", X3.i.W);
                            if (((Boolean) derbyshireVar.a("gads:enable_full_consent_fallback_check", Boolean.TRUE, zk.b)).booleanValue()) {
                                vuVar.a = ivVar4;
                                vuVar.b = null;
                                vuVar.c = null;
                                vuVar.i = 4;
                                objF = ivVar4.f(vuVar);
                                if (objF == objBeachfront) {
                                    return objBeachfront;
                                }
                                ivVar5 = ivVar4;
                                if (((Boolean) objF).booleanValue()) {
                                    vuVar.a = ivVar5;
                                    vuVar.i = 5;
                                    if (ivVar5.w(vuVar) == objBeachfront) {
                                        return objBeachfront;
                                    }
                                }
                            } else {
                                ivVar5 = ivVar4;
                            }
                            vuVar.a = ivVar5;
                            vuVar.b = null;
                            vuVar.c = null;
                            vuVar.i = 6;
                            if (ivVar5.v(vuVar) == objBeachfront) {
                                return objBeachfront;
                            }
                        } else {
                            ivVar5 = ivVar4;
                        }
                        attabalVar6 = ivVar5.F;
                        vuVar.a = ivVar5;
                        vuVar.b = attabalVar6;
                        vuVar.c = null;
                        vuVar.i = 7;
                        if (attabalVar6.attabal(null, vuVar) == objBeachfront) {
                            return objBeachfront;
                        }
                        ivVar6 = ivVar5;
                        attabalVar7 = attabalVar6;
                        try {
                            saran saranVar = ivVar6.d;
                            wu block = new wu(ivVar6, null);
                            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                            Intrinsics.checkNotNullParameter(saranVar, "<this>");
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(block, "block");
                            ivVar6.G = cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
                            Unit unit6 = Unit.f29295attabal;
                            return Unit.f29295attabal;
                        } finally {
                            attabalVar7.wireman(null);
                        }
                    } catch (Throwable th9) {
                        attabalVar5.wireman(null);
                        throw th9;
                    }
                } catch (Throwable th10) {
                    attabalVar4.wireman(null);
                    throw th10;
                }
            case 1:
                boolean z5 = vuVar.f;
                bundle = vuVar.e;
                iv ivVar8 = vuVar.d;
                attabalVar = vuVar.c;
                bundle2 = (Bundle) vuVar.b;
                ivVar2 = vuVar.a;
                p002kotlin.dern.saneness(objF);
                z3 = z5;
                ivVar7 = ivVar8;
                bundle5 = ivVar2.x;
                attabalVar.wireman(null);
                ivVar7.getClass();
                if (!a(bundle, bundle5)) {
                    bundle = bundle2;
                    ivVar7 = ivVar2;
                    attabalVar3 = ivVar7.F;
                    vuVar.a = ivVar7;
                    vuVar.b = bundle;
                    vuVar.c = attabalVar3;
                    vuVar.d = null;
                    vuVar.e = null;
                    vuVar.f = z3;
                    vuVar.i = 2;
                    if (attabalVar3.attabal(null, vuVar) == objBeachfront) {
                        return objBeachfront;
                    }
                    ivVar3 = ivVar7;
                    z4 = z3;
                    bundle4 = bundle;
                    attabalVar4 = attabalVar3;
                    ivVar3.H = true;
                    Unit unit7 = Unit.f29295attabal;
                    attabalVar4.wireman(null);
                    attabalVar5 = ivVar3.w;
                    vuVar.a = ivVar3;
                    vuVar.b = bundle4;
                    vuVar.c = attabalVar5;
                    vuVar.f = z4;
                    vuVar.i = 3;
                    if (attabalVar5.attabal(null, vuVar) == objBeachfront) {
                        return objBeachfront;
                    }
                    bundle6 = bundle4;
                    ivVar4 = ivVar3;
                    ivVar4.x = bundle6;
                    Unit unit8 = Unit.f29295attabal;
                    attabalVar5.wireman(null);
                    if (z4) {
                        derbyshireVar = ivVar4.h.r;
                        derbyshireVar.getClass();
                        Intrinsics.checkNotNullParameter("gads:enable_full_consent_fallback_check", X3.i.W);
                        if (((Boolean) derbyshireVar.a("gads:enable_full_consent_fallback_check", Boolean.TRUE, zk.b)).booleanValue()) {
                            vuVar.a = ivVar4;
                            vuVar.b = null;
                            vuVar.c = null;
                            vuVar.i = 4;
                            objF = ivVar4.f(vuVar);
                            if (objF == objBeachfront) {
                                return objBeachfront;
                            }
                            ivVar5 = ivVar4;
                            if (((Boolean) objF).booleanValue()) {
                                vuVar.a = ivVar5;
                                vuVar.i = 5;
                                if (ivVar5.w(vuVar) == objBeachfront) {
                                    return objBeachfront;
                                }
                            }
                        } else {
                            ivVar5 = ivVar4;
                        }
                        vuVar.a = ivVar5;
                        vuVar.b = null;
                        vuVar.c = null;
                        vuVar.i = 6;
                        if (ivVar5.v(vuVar) == objBeachfront) {
                            return objBeachfront;
                        }
                    } else {
                        ivVar5 = ivVar4;
                    }
                    attabalVar6 = ivVar5.F;
                    vuVar.a = ivVar5;
                    vuVar.b = attabalVar6;
                    vuVar.c = null;
                    vuVar.i = 7;
                    if (attabalVar6.attabal(null, vuVar) == objBeachfront) {
                        return objBeachfront;
                    }
                    ivVar6 = ivVar5;
                    attabalVar7 = attabalVar6;
                    saran saranVar2 = ivVar6.d;
                    wu block2 = new wu(ivVar6, null);
                    EmptyCoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
                    Intrinsics.checkNotNullParameter(saranVar2, "<this>");
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter(block2, "block");
                    ivVar6.G = cutely.wireman(saranVar2, context2, null, new x13(block2, null), 2, null);
                    Unit unit9 = Unit.f29295attabal;
                }
                return Unit.f29295attabal;
            case 2:
                z4 = vuVar.f;
                attabalVar4 = vuVar.c;
                bundle4 = (Bundle) vuVar.b;
                ivVar3 = vuVar.a;
                p002kotlin.dern.saneness(objF);
                ivVar3.H = true;
                Unit unit10 = Unit.f29295attabal;
                attabalVar4.wireman(null);
                attabalVar5 = ivVar3.w;
                vuVar.a = ivVar3;
                vuVar.b = bundle4;
                vuVar.c = attabalVar5;
                vuVar.f = z4;
                vuVar.i = 3;
                if (attabalVar5.attabal(null, vuVar) == objBeachfront) {
                    return objBeachfront;
                }
                bundle6 = bundle4;
                ivVar4 = ivVar3;
                ivVar4.x = bundle6;
                Unit unit11 = Unit.f29295attabal;
                attabalVar5.wireman(null);
                if (z4) {
                    derbyshireVar = ivVar4.h.r;
                    derbyshireVar.getClass();
                    Intrinsics.checkNotNullParameter("gads:enable_full_consent_fallback_check", X3.i.W);
                    if (((Boolean) derbyshireVar.a("gads:enable_full_consent_fallback_check", Boolean.TRUE, zk.b)).booleanValue()) {
                        vuVar.a = ivVar4;
                        vuVar.b = null;
                        vuVar.c = null;
                        vuVar.i = 4;
                        objF = ivVar4.f(vuVar);
                        if (objF == objBeachfront) {
                            return objBeachfront;
                        }
                        ivVar5 = ivVar4;
                        if (((Boolean) objF).booleanValue()) {
                            vuVar.a = ivVar5;
                            vuVar.i = 5;
                            if (ivVar5.w(vuVar) == objBeachfront) {
                                return objBeachfront;
                            }
                        }
                    } else {
                        ivVar5 = ivVar4;
                    }
                    vuVar.a = ivVar5;
                    vuVar.b = null;
                    vuVar.c = null;
                    vuVar.i = 6;
                    if (ivVar5.v(vuVar) == objBeachfront) {
                        return objBeachfront;
                    }
                } else {
                    ivVar5 = ivVar4;
                }
                attabalVar6 = ivVar5.F;
                vuVar.a = ivVar5;
                vuVar.b = attabalVar6;
                vuVar.c = null;
                vuVar.i = 7;
                if (attabalVar6.attabal(null, vuVar) == objBeachfront) {
                    return objBeachfront;
                }
                ivVar6 = ivVar5;
                attabalVar7 = attabalVar6;
                saran saranVar3 = ivVar6.d;
                wu block3 = new wu(ivVar6, null);
                EmptyCoroutineContext context3 = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar3, "<this>");
                Intrinsics.checkNotNullParameter(context3, "context");
                Intrinsics.checkNotNullParameter(block3, "block");
                ivVar6.G = cutely.wireman(saranVar3, context3, null, new x13(block3, null), 2, null);
                Unit unit12 = Unit.f29295attabal;
                return Unit.f29295attabal;
            case 3:
                z4 = vuVar.f;
                attabalVar5 = vuVar.c;
                bundle6 = (Bundle) vuVar.b;
                ivVar4 = vuVar.a;
                p002kotlin.dern.saneness(objF);
                ivVar4.x = bundle6;
                Unit unit13 = Unit.f29295attabal;
                attabalVar5.wireman(null);
                if (z4) {
                    derbyshireVar = ivVar4.h.r;
                    derbyshireVar.getClass();
                    Intrinsics.checkNotNullParameter("gads:enable_full_consent_fallback_check", X3.i.W);
                    if (((Boolean) derbyshireVar.a("gads:enable_full_consent_fallback_check", Boolean.TRUE, zk.b)).booleanValue()) {
                        vuVar.a = ivVar4;
                        vuVar.b = null;
                        vuVar.c = null;
                        vuVar.i = 4;
                        objF = ivVar4.f(vuVar);
                        if (objF == objBeachfront) {
                            return objBeachfront;
                        }
                        ivVar5 = ivVar4;
                        if (((Boolean) objF).booleanValue()) {
                            vuVar.a = ivVar5;
                            vuVar.i = 5;
                            if (ivVar5.w(vuVar) == objBeachfront) {
                                return objBeachfront;
                            }
                        }
                    } else {
                        ivVar5 = ivVar4;
                    }
                    vuVar.a = ivVar5;
                    vuVar.b = null;
                    vuVar.c = null;
                    vuVar.i = 6;
                    if (ivVar5.v(vuVar) == objBeachfront) {
                        return objBeachfront;
                    }
                } else {
                    ivVar5 = ivVar4;
                }
                attabalVar6 = ivVar5.F;
                vuVar.a = ivVar5;
                vuVar.b = attabalVar6;
                vuVar.c = null;
                vuVar.i = 7;
                if (attabalVar6.attabal(null, vuVar) == objBeachfront) {
                    return objBeachfront;
                }
                ivVar6 = ivVar5;
                attabalVar7 = attabalVar6;
                saran saranVar4 = ivVar6.d;
                wu block4 = new wu(ivVar6, null);
                EmptyCoroutineContext context4 = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar4, "<this>");
                Intrinsics.checkNotNullParameter(context4, "context");
                Intrinsics.checkNotNullParameter(block4, "block");
                ivVar6.G = cutely.wireman(saranVar4, context4, null, new x13(block4, null), 2, null);
                Unit unit14 = Unit.f29295attabal;
                return Unit.f29295attabal;
            case 4:
                ivVar5 = vuVar.a;
                p002kotlin.dern.saneness(objF);
                if (((Boolean) objF).booleanValue()) {
                    vuVar.a = ivVar5;
                    vuVar.i = 5;
                    if (ivVar5.w(vuVar) == objBeachfront) {
                        return objBeachfront;
                    }
                } else {
                    vuVar.a = ivVar5;
                    vuVar.b = null;
                    vuVar.c = null;
                    vuVar.i = 6;
                    if (ivVar5.v(vuVar) == objBeachfront) {
                        return objBeachfront;
                    }
                }
                attabalVar6 = ivVar5.F;
                vuVar.a = ivVar5;
                vuVar.b = attabalVar6;
                vuVar.c = null;
                vuVar.i = 7;
                if (attabalVar6.attabal(null, vuVar) == objBeachfront) {
                    return objBeachfront;
                }
                ivVar6 = ivVar5;
                attabalVar7 = attabalVar6;
                saran saranVar5 = ivVar6.d;
                wu block5 = new wu(ivVar6, null);
                EmptyCoroutineContext context5 = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar5, "<this>");
                Intrinsics.checkNotNullParameter(context5, "context");
                Intrinsics.checkNotNullParameter(block5, "block");
                ivVar6.G = cutely.wireman(saranVar5, context5, null, new x13(block5, null), 2, null);
                Unit unit15 = Unit.f29295attabal;
                return Unit.f29295attabal;
            case 5:
            case 6:
                ivVar5 = vuVar.a;
                p002kotlin.dern.saneness(objF);
                attabalVar6 = ivVar5.F;
                vuVar.a = ivVar5;
                vuVar.b = attabalVar6;
                vuVar.c = null;
                vuVar.i = 7;
                if (attabalVar6.attabal(null, vuVar) == objBeachfront) {
                    return objBeachfront;
                }
                ivVar6 = ivVar5;
                attabalVar7 = attabalVar6;
                saran saranVar6 = ivVar6.d;
                wu block6 = new wu(ivVar6, null);
                EmptyCoroutineContext context6 = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar6, "<this>");
                Intrinsics.checkNotNullParameter(context6, "context");
                Intrinsics.checkNotNullParameter(block6, "block");
                ivVar6.G = cutely.wireman(saranVar6, context6, null, new x13(block6, null), 2, null);
                Unit unit16 = Unit.f29295attabal;
                return Unit.f29295attabal;
            case 7:
                attabalVar7 = (formularization.attabal) vuVar.b;
                ivVar6 = vuVar.a;
                p002kotlin.dern.saneness(objF);
                saran saranVar7 = ivVar6.d;
                wu block7 = new wu(ivVar6, null);
                EmptyCoroutineContext context7 = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar7, "<this>");
                Intrinsics.checkNotNullParameter(context7, "context");
                Intrinsics.checkNotNullParameter(block7, "block");
                ivVar6.G = cutely.wireman(saranVar7, context7, null, new x13(block7, null), 2, null);
                Unit unit17 = Unit.f29295attabal;
                return Unit.f29295attabal;
            case 8:
                formularization.attabal attabalVar9 = vuVar.c;
                Bundle bundle7 = (Bundle) vuVar.b;
                iv ivVar9 = vuVar.a;
                p002kotlin.dern.saneness(objF);
                bundle3 = bundle7;
                attabalVar2 = attabalVar9;
                ivVar7 = ivVar9;
                ivVar7.x = bundle3;
                Unit unit18 = Unit.f29295attabal;
                attabalVar2.wireman(null);
                vuVar.a = null;
                vuVar.b = null;
                vuVar.c = null;
                vuVar.i = 9;
                if (ivVar7.a(bundle3, vuVar) == objBeachfront) {
                    return objBeachfront;
                }
                return Unit.f29295attabal;
            case 9:
                p002kotlin.dern.saneness(objF);
                return Unit.f29295attabal;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object c(iv ivVar, wretchedly.dern dernVar) {
        yt ytVar;
        formularization.attabal attabalVar;
        if (dernVar instanceof yt) {
            ytVar = (yt) dernVar;
            int i = ytVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ytVar.e = i - Integer.MIN_VALUE;
            } else {
                ytVar = new yt(ivVar, dernVar);
            }
        } else {
            ytVar = new yt(ivVar, dernVar);
        }
        Object obj = ytVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ytVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = ivVar.w;
            ytVar.a = ivVar;
            ytVar.b = attabalVar;
            ytVar.e = 1;
            if (attabalVar.attabal(null, ytVar) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = ytVar.b;
            iv ivVar2 = ytVar.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            ivVar = ivVar2;
        }
        try {
            return ivVar.x;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object d(iv ivVar, wretchedly.dern dernVar) {
        zt ztVar;
        formularization.attabal attabalVar;
        iv ivVar2;
        Gson gson;
        Gson gson2;
        if (dernVar instanceof zt) {
            ztVar = (zt) dernVar;
            int i = ztVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ztVar.g = i - Integer.MIN_VALUE;
            } else {
                ztVar = new zt(ivVar, dernVar);
            }
        } else {
            ztVar = new zt(ivVar, dernVar);
        }
        Object obj = ztVar.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ztVar.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Gson gson3 = ivVar.g;
            attabalVar = ivVar.w;
            ztVar.a = ivVar;
            ztVar.b = attabalVar;
            ztVar.c = gson3;
            ztVar.d = gson3;
            ztVar.g = 1;
            if (attabalVar.attabal(null, ztVar) == objBeachfront) {
                return objBeachfront;
            }
            ivVar2 = ivVar;
            gson = gson3;
            gson2 = gson;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gson = ztVar.d;
            gson2 = ztVar.c;
            attabalVar = ztVar.b;
            ivVar2 = ztVar.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            return gson2.fromJson(gson.toJson(ivVar2.x), JsonObject.class);
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:43:0x010d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0112  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object e(iv ivVar, wretchedly.dern dernVar) {
        au auVar;
        Object obj;
        String str;
        iv ivVar2;
        zj0 zj0Var;
        iv ivVar3;
        spartacist spartacistVar;
        JsonObject jsonObject;
        rv0 rv0Var;
        Object objD;
        iv ivVar4;
        JsonObject jsonObject2;
        mv newConsentState;
        Object objA;
        iv ivVar5;
        if (dernVar instanceof au) {
            auVar = (au) dernVar;
            int i = auVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                auVar.g = i - Integer.MIN_VALUE;
            } else {
                auVar = new au(ivVar, dernVar);
            }
        } else {
            auVar = new au(ivVar, dernVar);
        }
        Object objA2 = auVar.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = auVar.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA2);
            obj = ivVar.e;
            zj0 zj0Var2 = ivVar.u;
            auVar.a = ivVar;
            auVar.b = obj;
            str = "google.afma.sdkConstants.getEcoConfiguration";
            auVar.c = "google.afma.sdkConstants.getEcoConfiguration";
            auVar.d = zj0Var2;
            auVar.g = 1;
            Object objD2 = d(ivVar, auVar);
            if (objD2 != objBeachfront) {
                ivVar2 = ivVar;
                zj0Var = zj0Var2;
                objA2 = objD2;
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            zj0Var = auVar.d;
            str = (String) auVar.c;
            obj = (supercargo) auVar.b;
            ivVar2 = auVar.a;
            p002kotlin.dern.saneness(objA2);
        } else {
            if (i2 == 2) {
                ivVar3 = auVar.a;
                p002kotlin.dern.saneness(objA2);
                spartacistVar = (spartacist) objA2;
                if (spartacistVar instanceof nn0) {
                    return (nn0) spartacistVar;
                }
                Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                jsonObject = (JsonObject) ((tn0) spartacistVar).b;
                rv0Var = rv0.a;
                auVar.a = ivVar3;
                auVar.b = rv0Var;
                auVar.c = jsonObject;
                auVar.g = 3;
                ivVar3.getClass();
                objD = d(ivVar3, auVar);
                if (objD != objBeachfront) {
                    ivVar4 = ivVar3;
                    jsonObject2 = jsonObject;
                    objA2 = objD;
                    Intrinsics.checkNotNullExpressionValue(objA2, "getConsentStringJson(...)");
                    rv0Var.getClass();
                    newConsentState = rv0.a(jsonObject2, (JsonObject) objA2);
                    if (newConsentState == null) {
                        return new rn0("Error parsing consent state from getEcoConfiguration result. ", k41.INTERNAL_ERROR);
                    }
                    sj0 sj0Var = ivVar4.v;
                    auVar.a = ivVar4;
                    auVar.b = newConsentState;
                    auVar.c = null;
                    auVar.g = 4;
                    sj0Var.getClass();
                    objA = sj0.a(sj0Var, newConsentState, null, true, auVar);
                    if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                        objA = Unit.f29295attabal;
                    }
                    if (objA != objBeachfront) {
                        ivVar5 = ivVar4;
                    }
                }
                return objBeachfront;
            }
            if (i2 == 3) {
                jsonObject2 = (JsonObject) auVar.c;
                rv0Var = (rv0) auVar.b;
                ivVar4 = auVar.a;
                p002kotlin.dern.saneness(objA2);
                Intrinsics.checkNotNullExpressionValue(objA2, "getConsentStringJson(...)");
                rv0Var.getClass();
                newConsentState = rv0.a(jsonObject2, (JsonObject) objA2);
                if (newConsentState == null) {
                    return new rn0("Error parsing consent state from getEcoConfiguration result. ", k41.INTERNAL_ERROR);
                }
                sj0 sj0Var2 = ivVar4.v;
                auVar.a = ivVar4;
                auVar.b = newConsentState;
                auVar.c = null;
                auVar.g = 4;
                sj0Var2.getClass();
                objA = sj0.a(sj0Var2, newConsentState, null, true, auVar);
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
                if (objA != objBeachfront) {
                    ivVar5 = ivVar4;
                }
                return objBeachfront;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            newConsentState = (mv) auVar.b;
            ivVar5 = auVar.a;
            p002kotlin.dern.saneness(objA2);
        }
        ik ikVar = (ik) ivVar5.t;
        ikVar.getClass();
        Intrinsics.checkNotNullParameter(newConsentState, "newConsentState");
        ikVar.i.set(newConsentState);
        ikVar.a();
        return new tn0(Unit.f29295attabal);
        Intrinsics.checkNotNullExpressionValue(objA2, "getConsentStringJson(...)");
        JsonObject jsonObjectA = zj0Var.a((JsonObject) objA2);
        auVar.a = ivVar2;
        auVar.b = null;
        auVar.c = null;
        auVar.d = null;
        auVar.g = 2;
        obj.getClass();
        String string = jsonObjectA.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        objA2 = ((cf0) obj).a(str, string, auVar);
        if (objA2 != objBeachfront) {
            ivVar3 = ivVar2;
            spartacistVar = (spartacist) objA2;
            if (spartacistVar instanceof nn0) {
                return (nn0) spartacistVar;
            }
            Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
            jsonObject = (JsonObject) ((tn0) spartacistVar).b;
            rv0Var = rv0.a;
            auVar.a = ivVar3;
            auVar.b = rv0Var;
            auVar.c = jsonObject;
            auVar.g = 3;
            ivVar3.getClass();
            objD = d(ivVar3, auVar);
            if (objD != objBeachfront) {
                ivVar4 = ivVar3;
                jsonObject2 = jsonObject;
                objA2 = objD;
                Intrinsics.checkNotNullExpressionValue(objA2, "getConsentStringJson(...)");
                rv0Var.getClass();
                newConsentState = rv0.a(jsonObject2, (JsonObject) objA2);
                if (newConsentState == null) {
                    return new rn0("Error parsing consent state from getEcoConfiguration result. ", k41.INTERNAL_ERROR);
                }
                sj0 sj0Var3 = ivVar4.v;
                auVar.a = ivVar4;
                auVar.b = newConsentState;
                auVar.c = null;
                auVar.g = 4;
                sj0Var3.getClass();
                objA = sj0.a(sj0Var3, newConsentState, null, true, auVar);
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
                if (objA != objBeachfront) {
                    ivVar5 = ivVar4;
                    ik ikVar2 = (ik) ivVar5.t;
                    ikVar2.getClass();
                    Intrinsics.checkNotNullParameter(newConsentState, "newConsentState");
                    ikVar2.i.set(newConsentState);
                    ikVar2.a();
                    return new tn0(Unit.f29295attabal);
                }
            }
        }
        return objBeachfront;
    }

    public final String b() {
        this.r.getClass();
        return String.valueOf(new Random().nextInt(Integer.MAX_VALUE));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[Catch: JsonSyntaxException -> 0x002e, PHI: r2 r5
  0x0069: PHI (r2v9 java.util.Iterator<com.google.gson.JsonElement>) = (r2v5 java.util.Iterator<com.google.gson.JsonElement>), (r2v10 java.util.Iterator<com.google.gson.JsonElement>) binds: [B:26:0x0067, B:33:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r5v8 ads_mobile_sdk.iv) = (r5v2 ads_mobile_sdk.iv), (r5v9 ads_mobile_sdk.iv) binds: [B:26:0x0067, B:33:0x008b] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {JsonSyntaxException -> 0x002e, blocks: (B:12:0x002a, B:32:0x0085, B:27:0x0069, B:35:0x008e, B:29:0x006f), top: B:43:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006f A[Catch: JsonSyntaxException -> 0x002e, TryCatch #1 {JsonSyntaxException -> 0x002e, blocks: (B:12:0x002a, B:32:0x0085, B:27:0x0069, B:35:0x008e, B:29:0x006f), top: B:43:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:32:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(wretchedly.dern r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.nt
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.nt r0 = (ads_mobile_sdk.nt) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.nt r0 = new ads_mobile_sdk.nt
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.util.Iterator r2 = r0.b
            ads_mobile_sdk.iv r5 = r0.a
            p002kotlin.dern.saneness(r7)     // Catch: com.google.gson.JsonSyntaxException -> L2e
            goto L85
        L2e:
            r7 = move-exception
            goto L96
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            p002kotlin.dern.saneness(r7)
            com.google.gson.Gson r7 = new com.google.gson.Gson     // Catch: com.google.gson.JsonSyntaxException -> L94
            r7.<init>()     // Catch: com.google.gson.JsonSyntaxException -> L94
            ads_mobile_sdk.jk0 r2 = r6.h     // Catch: com.google.gson.JsonSyntaxException -> L94
            saneness.derbyshire r2 = r2.r     // Catch: com.google.gson.JsonSyntaxException -> L94
            java.lang.String r2 = r2.saneness()     // Catch: com.google.gson.JsonSyntaxException -> L94
            java.lang.Class<com.google.gson.JsonArray> r5 = com.google.gson.JsonArray.class
            java.lang.Object r7 = r7.fromJson(r2, r5)     // Catch: com.google.gson.JsonSyntaxException -> L94
            com.google.gson.JsonArray r7 = (com.google.gson.JsonArray) r7     // Catch: com.google.gson.JsonSyntaxException -> L94
            p002kotlin.jvm.internal.Intrinsics.beachfront(r7)     // Catch: com.google.gson.JsonSyntaxException -> L94
            boolean r2 = r7 instanceof java.util.Collection     // Catch: com.google.gson.JsonSyntaxException -> L94
            if (r2 == 0) goto L63
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: com.google.gson.JsonSyntaxException -> L94
            boolean r2 = r2.isEmpty()     // Catch: com.google.gson.JsonSyntaxException -> L94
            if (r2 == 0) goto L63
            r5 = r6
        L61:
            r7 = r3
            goto L8e
        L63:
            java.util.Iterator r7 = r7.iterator()     // Catch: com.google.gson.JsonSyntaxException -> L94
            r5 = r6
            r2 = r7
        L69:
            boolean r7 = r2.hasNext()     // Catch: com.google.gson.JsonSyntaxException -> L2e
            if (r7 == 0) goto L61
            java.lang.Object r7 = r2.next()     // Catch: com.google.gson.JsonSyntaxException -> L2e
            com.google.gson.JsonElement r7 = (com.google.gson.JsonElement) r7     // Catch: com.google.gson.JsonSyntaxException -> L2e
            p002kotlin.jvm.internal.Intrinsics.beachfront(r7)     // Catch: com.google.gson.JsonSyntaxException -> L2e
            r0.a = r5     // Catch: com.google.gson.JsonSyntaxException -> L2e
            r0.b = r2     // Catch: com.google.gson.JsonSyntaxException -> L2e
            r0.e = r4     // Catch: com.google.gson.JsonSyntaxException -> L2e
            java.lang.Object r7 = r5.a(r7, r0)     // Catch: com.google.gson.JsonSyntaxException -> L2e
            if (r7 != r1) goto L85
            return r1
        L85:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: com.google.gson.JsonSyntaxException -> L2e
            boolean r7 = r7.booleanValue()     // Catch: com.google.gson.JsonSyntaxException -> L2e
            if (r7 == 0) goto L69
            r7 = r4
        L8e:
            r7 = r7 ^ r4
            java.lang.Boolean r7 = igo.attabal.attabal(r7)     // Catch: com.google.gson.JsonSyntaxException -> L2e
            return r7
        L94:
            r7 = move-exception
            r5 = r6
        L96:
            saneness.loun r0 = r5.f
            ads_mobile_sdk.d13 r0 = (ads_mobile_sdk.d13) r0
            java.lang.String r1 = "JSON fallback consent keys set parsing failure"
            r0.a(r1, r7)
            java.lang.Boolean r7 = igo.attabal.attabal(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv.f(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(wretchedly.dern dernVar) {
        ot otVar;
        et etVar;
        iv ivVar;
        if (dernVar instanceof ot) {
            otVar = (ot) dernVar;
            int i = otVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                otVar.e = i - Integer.MIN_VALUE;
            } else {
                otVar = new ot(this, dernVar);
            }
        } else {
            otVar = new ot(this, dernVar);
        }
        Object obj = otVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = otVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            et etVar2 = et.API_CLEAR_PER_APP_ID_V1;
            ej1 ej1Var = this.A;
            otVar.a = this;
            otVar.b = etVar2;
            otVar.e = 1;
            Object objA = ej1Var.a(otVar);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            etVar = etVar2;
            obj = objA;
            ivVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            etVar = otVar.b;
            ivVar = otVar.a;
            p002kotlin.dern.saneness(obj);
        }
        if (((gt) obj).p().contains(etVar)) {
            ivVar.l.a();
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(wretchedly.dern dernVar) {
        pt ptVar;
        et etVar;
        iv ivVar;
        if (dernVar instanceof pt) {
            ptVar = (pt) dernVar;
            int i = ptVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ptVar.e = i - Integer.MIN_VALUE;
            } else {
                ptVar = new pt(this, dernVar);
            }
        } else {
            ptVar = new pt(this, dernVar);
        }
        Object obj = ptVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ptVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            et etVar2 = et.API_CLEAR_PER_APP_ID_V2;
            ej1 ej1Var = this.A;
            ptVar.a = this;
            ptVar.b = etVar2;
            ptVar.e = 1;
            Object objA = ej1Var.a(ptVar);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            etVar = etVar2;
            obj = objA;
            ivVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            etVar = ptVar.b;
            ivVar = ptVar.a;
            p002kotlin.dern.saneness(obj);
        }
        if (((gt) obj).p().contains(etVar)) {
            ivVar.l.b();
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r2.h(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(wretchedly.dern r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.qt
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.qt r0 = (ads_mobile_sdk.qt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.qt r0 = new ads_mobile_sdk.qt
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            p002kotlin.dern.saneness(r7)
            goto L69
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            ads_mobile_sdk.iv r2 = r0.a
            p002kotlin.dern.saneness(r7)
            goto L5d
        L3d:
            ads_mobile_sdk.iv r2 = r0.a
            p002kotlin.dern.saneness(r7)
            goto L52
        L43:
            p002kotlin.dern.saneness(r7)
            r0.a = r6
            r0.d = r5
            java.lang.Object r7 = r6.j(r0)
            if (r7 != r1) goto L51
            goto L68
        L51:
            r2 = r6
        L52:
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L5d
            goto L68
        L5d:
            r7 = 0
            r0.a = r7
            r0.d = r3
            java.lang.Object r7 = r2.h(r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv.i(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(wretchedly.dern dernVar) {
        rt rtVar;
        et etVar;
        iv ivVar;
        if (dernVar instanceof rt) {
            rtVar = (rt) dernVar;
            int i = rtVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rtVar.e = i - Integer.MIN_VALUE;
            } else {
                rtVar = new rt(this, dernVar);
            }
        } else {
            rtVar = new rt(this, dernVar);
        }
        Object obj = rtVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = rtVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            et etVar2 = et.API_CLEAR_WEBVIEW_COOKIE;
            ej1 ej1Var = this.A;
            rtVar.a = this;
            rtVar.b = etVar2;
            rtVar.e = 1;
            Object objA = ej1Var.a(rtVar);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            etVar = etVar2;
            obj = objA;
            ivVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            etVar = rtVar.b;
            ivVar = rtVar.a;
            p002kotlin.dern.saneness(obj);
        }
        if (((gt) obj).p().contains(etVar)) {
            CookieManager cookieManager = ivVar.C;
            String cookie = cookieManager != null ? cookieManager.getCookie(ivVar.h.n0()) : null;
            if (cookie != null) {
                Intrinsics.beachfront(cookie);
                List listSplit$default = StringsKt.split$default(cookie, new String[]{";"}, false, 0, 6, null);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listSplit$default) {
                    if (!StringsKt.empress((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = StringsKt.cig((String) it.next(), X3.j.b, null, 2, null) + "=; Max-Age=-1; path=/; domain=.doubleclick.net";
                    CookieManager cookieManager2 = ivVar.C;
                    if (cookieManager2 != null) {
                        cookieManager2.setCookie(ivVar.h.n0(), str);
                    }
                }
            }
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r6 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(wretchedly.dern r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.tt
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.tt r0 = (ads_mobile_sdk.tt) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.tt r0 = new ads_mobile_sdk.tt
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3c
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            p002kotlin.dern.saneness(r6)
            goto L81
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ads_mobile_sdk.et r2 = r0.b
            ads_mobile_sdk.iv r3 = r0.a
            p002kotlin.dern.saneness(r6)
            goto L51
        L3c:
            p002kotlin.dern.saneness(r6)
            ads_mobile_sdk.et r2 = ads_mobile_sdk.et.API_READ_ADVERTISING_ID
            ads_mobile_sdk.ej1 r6 = r5.A
            r0.a = r5
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L50
            goto L80
        L50:
            r3 = r5
        L51:
            ads_mobile_sdk.gt r6 = (ads_mobile_sdk.gt) r6
            ads_mobile_sdk.o21 r6 = r6.p()
            boolean r6 = r6.contains(r2)
            r2 = 0
            if (r6 == 0) goto L84
            saneness.lehua r6 = r3.j
            android.content.Context r3 = r3.c
            r0.a = r2
            r0.b = r2
            r0.e = r4
            r6.getClass()
            ads_mobile_sdk.tn0 r6 = new ads_mobile_sdk.tn0     // Catch: java.lang.Exception -> L75
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r3)     // Catch: java.lang.Exception -> L75
            r6.<init>(r0)     // Catch: java.lang.Exception -> L75
            goto L7e
        L75:
            r6 = move-exception
            ads_mobile_sdk.on0 r0 = new ads_mobile_sdk.on0
            java.lang.String r3 = "Exception caught fetching Ad ID"
            r0.<init>(r6, r2, r3, r4)
            r6 = r0
        L7e:
            if (r6 != r1) goto L81
        L80:
            return r1
        L81:
            saneness.spartacist r6 = (saneness.spartacist) r6
            return r6
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv.k(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(wretchedly.dern dernVar) {
        ut utVar;
        et etVar;
        iv ivVar;
        ContentResolver contentResolver;
        if (dernVar instanceof ut) {
            utVar = (ut) dernVar;
            int i = utVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                utVar.e = i - Integer.MIN_VALUE;
            } else {
                utVar = new ut(this, dernVar);
            }
        } else {
            utVar = new ut(this, dernVar);
        }
        Object obj = utVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = utVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            et etVar2 = et.API_READ_AMAZON_FIRE_AD_ID;
            ej1 ej1Var = this.A;
            utVar.a = this;
            utVar.b = etVar2;
            utVar.e = 1;
            Object objA = ej1Var.a(utVar);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            etVar = etVar2;
            obj = objA;
            ivVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            etVar = utVar.b;
            ivVar = utVar.a;
            p002kotlin.dern.saneness(obj);
        }
        if (!((gt) obj).p().contains(etVar) || (contentResolver = ivVar.c.getContentResolver()) == null) {
            return null;
        }
        Intrinsics.beachfront(contentResolver);
        return Settings.Secure.getString(contentResolver, "advertising_id");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0088 A[Catch: all -> 0x00dd, TryCatch #0 {all -> 0x00dd, blocks: (B:28:0x0084, B:30:0x0088, B:32:0x00ce, B:35:0x00df, B:37:0x00e3, B:39:0x00e9, B:41:0x00ef), top: B:53:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ce A[Catch: all -> 0x00dd, TryCatch #0 {all -> 0x00dd, blocks: (B:28:0x0084, B:30:0x0088, B:32:0x00ce, B:35:0x00df, B:37:0x00e3, B:39:0x00e9, B:41:0x00ef), top: B:53:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00df A[Catch: all -> 0x00dd, TryCatch #0 {all -> 0x00dd, blocks: (B:28:0x0084, B:30:0x0088, B:32:0x00ce, B:35:0x00df, B:37:0x00e3, B:39:0x00e9, B:41:0x00ef), top: B:53:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3 A[Catch: all -> 0x00dd, TryCatch #0 {all -> 0x00dd, blocks: (B:28:0x0084, B:30:0x0088, B:32:0x00ce, B:35:0x00df, B:37:0x00e3, B:39:0x00e9, B:41:0x00ef), top: B:53:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0120  */
    /* JADX WARN: Code duplicated, block: B:52:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012b, code lost:
    
        if (r0 == r3) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(wretchedly.dern r17) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv.m(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(wretchedly.dern dernVar) {
        bu buVar;
        et etVar;
        iv ivVar;
        Object objA;
        if (dernVar instanceof bu) {
            buVar = (bu) dernVar;
            int i = buVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                buVar.e = i - Integer.MIN_VALUE;
            } else {
                buVar = new bu(this, dernVar);
            }
        } else {
            buVar = new bu(this, dernVar);
        }
        Object obj = buVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = buVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            et etVar2 = et.API_READ_FIREBASE_AD_EVENT_ID;
            ej1 ej1Var = this.A;
            buVar.a = this;
            buVar.b = etVar2;
            buVar.e = 1;
            Object objA2 = ej1Var.a(buVar);
            if (objA2 == objBeachfront) {
                return objBeachfront;
            }
            etVar = etVar2;
            obj = objA2;
            ivVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            etVar = buVar.b;
            ivVar = buVar.a;
            p002kotlin.dern.saneness(obj);
        }
        if (!((gt) obj).p().contains(etVar) || (objA = ivVar.o.a("generateEventId")) == null) {
            return null;
        }
        return objA.toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r6 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(wretchedly.dern r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.cu
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.cu r0 = (ads_mobile_sdk.cu) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.cu r0 = new ads_mobile_sdk.cu
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p002kotlin.dern.saneness(r6)
            goto L70
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ads_mobile_sdk.et r2 = r0.b
            ads_mobile_sdk.iv r4 = r0.a
            p002kotlin.dern.saneness(r6)
            goto L51
        L3c:
            p002kotlin.dern.saneness(r6)
            ads_mobile_sdk.et r2 = ads_mobile_sdk.et.API_READ_FIREBASE_APP_ID
            ads_mobile_sdk.ej1 r6 = r5.A
            r0.a = r5
            r0.b = r2
            r0.e = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L50
            goto L6f
        L50:
            r4 = r5
        L51:
            ads_mobile_sdk.gt r6 = (ads_mobile_sdk.gt) r6
            ads_mobile_sdk.o21 r6 = r6.p()
            boolean r6 = r6.contains(r2)
            r2 = 0
            if (r6 == 0) goto L73
            ads_mobile_sdk.wg0 r6 = r4.o
            r0.a = r2
            r0.b = r2
            r0.e = r3
            r6.getClass()
            java.lang.Object r6 = ads_mobile_sdk.wg0.a(r6, r0)
            if (r6 != r1) goto L70
        L6f:
            return r1
        L70:
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv.o(wretchedly.dern):java.lang.Object");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        derbyshire derbyshireVar = this.h.r;
        derbyshireVar.getClass();
        List defaultValue = p002kotlin.collections.adultoid.kowloon("IABTCF_AddtlConsent", "IABConsent_CMPPresent", "IABTCF_CmpSdkID", "IABConsent_ConsentString", "IABTCF_gdprApplies", "IABGPP_HDR_GppString", "IABGPP_GppSID", "gad_has_consent_for_cookies", "IABConsent_ParsedPurposeConsents", "personalized_ad_status", "IABTCF_PolicyVersion", InMobiNetworkKeys.IAB_US_PRIVACY_STRING, "IABTCF_PurposeConsents", "gad_rdp", "IABConsent_SubjectToGDPR", AndroidTcfDataSource.TCF_TCSTRING_KEY, "UPTC_UptcString", "IABConsent_ParsedVendorConsents", "UMP_eids");
        Intrinsics.checkNotNullParameter("gads:sp:consent_keys_list", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (CollectionsKt.permissivist((List) derbyshireVar.a("gads:sp:consent_keys_list", defaultValue, zk.g), str)) {
            saran saranVar = this.d;
            ru block = new ru(this, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(wretchedly.dern dernVar) {
        du duVar;
        et etVar;
        iv ivVar;
        Object objA;
        if (dernVar instanceof du) {
            duVar = (du) dernVar;
            int i = duVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                duVar.e = i - Integer.MIN_VALUE;
            } else {
                duVar = new du(this, dernVar);
            }
        } else {
            duVar = new du(this, dernVar);
        }
        Object obj = duVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = duVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            et etVar2 = et.API_READ_FIREBASE_APP_INSTANCE_ID;
            ej1 ej1Var = this.A;
            duVar.a = this;
            duVar.b = etVar2;
            duVar.e = 1;
            Object objA2 = ej1Var.a(duVar);
            if (objA2 == objBeachfront) {
                return objBeachfront;
            }
            etVar = etVar2;
            obj = objA2;
            ivVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            etVar = duVar.b;
            ivVar = duVar.a;
            p002kotlin.dern.saneness(obj);
        }
        if (!((gt) obj).p().contains(etVar) || (objA = ivVar.o.a(Constants.GET_APP_INSTANCE_ID)) == null) {
            return null;
        }
        return objA.toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(wretchedly.dern dernVar) {
        eu euVar;
        et etVar;
        iv ivVar;
        ir0 ir0VarA;
        if (dernVar instanceof eu) {
            euVar = (eu) dernVar;
            int i = euVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                euVar.e = i - Integer.MIN_VALUE;
            } else {
                euVar = new eu(this, dernVar);
            }
        } else {
            euVar = new eu(this, dernVar);
        }
        Object obj = euVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = euVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            et etVar2 = et.API_PER_APP_ID_V1;
            ej1 ej1Var = this.A;
            euVar.a = this;
            euVar.b = etVar2;
            euVar.e = 1;
            Object objA = ej1Var.a(euVar);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            etVar = etVar2;
            obj = objA;
            ivVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            etVar = euVar.b;
            ivVar = euVar.a;
            p002kotlin.dern.saneness(obj);
        }
        boolean zContains = ((gt) obj).p().contains(etVar);
        k41 k41Var = null;
        byte b = 0;
        if (!zContains) {
            return null;
        }
        a02 a02Var = ivVar.l;
        a02Var.getClass();
        try {
            Object value = a02Var.c.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            derbyshire derbyshireVar = a02Var.a.r;
            derbyshireVar.getClass();
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            long jAdultoid = p002kotlin.time.saneness.adultoid(p002kotlin.time.dern.molybdenite(Opcodes.INVOKEVIRTUAL, DurationUnit.DAYS));
            Intrinsics.checkNotNullParameter("gads:signal:paid_v1_ttl", X3.i.W);
            long jLongValue = ((Number) derbyshireVar.a("gads:signal:paid_v1_ttl", Long.valueOf(jAdultoid), zk.d)).longValue();
            d02 d02Var = (d02) ((lampshade) value);
            d02Var.getClass();
            synchronized (d02.class) {
                ir0VarA = d02Var.a(jLongValue);
            }
            return new tn0(ir0VarA);
        } catch (Exception e) {
            y13.a("Exception while getting PAIDV1", e, 4);
            return new on0(e, k41Var, b == true ? 1 : 0, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(wretchedly.dern dernVar) {
        fu fuVar;
        et etVar;
        iv ivVar;
        ir0 ir0Var;
        if (dernVar instanceof fu) {
            fuVar = (fu) dernVar;
            int i = fuVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fuVar.e = i - Integer.MIN_VALUE;
            } else {
                fuVar = new fu(this, dernVar);
            }
        } else {
            fuVar = new fu(this, dernVar);
        }
        Object obj = fuVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = fuVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            et etVar2 = et.API_PER_APP_ID_V2;
            ej1 ej1Var = this.A;
            fuVar.a = this;
            fuVar.b = etVar2;
            fuVar.e = 1;
            Object objA = ej1Var.a(fuVar);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            etVar = etVar2;
            obj = objA;
            ivVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            etVar = fuVar.b;
            ivVar = fuVar.a;
            p002kotlin.dern.saneness(obj);
        }
        boolean zContains = ((gt) obj).p().contains(etVar);
        k41 k41Var = null;
        byte b = 0;
        if (!zContains) {
            return null;
        }
        a02 a02Var = ivVar.l;
        a02Var.getClass();
        try {
            Object value = a02Var.d.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            derbyshire derbyshireVar = a02Var.a.r;
            derbyshireVar.getClass();
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            long jAdultoid = p002kotlin.time.saneness.adultoid(p002kotlin.time.dern.molybdenite(390, DurationUnit.DAYS));
            Intrinsics.checkNotNullParameter("gads:signal:paid_v2_ttl", X3.i.W);
            long jLongValue = ((Number) derbyshireVar.a("gads:signal:paid_v2_ttl", Long.valueOf(jAdultoid), zk.d)).longValue();
            f02 f02Var = (f02) ((eyepiece) value);
            f02Var.getClass();
            synchronized (f02.class) {
                try {
                    ir0Var = !f02Var.g.a() ? new ir0() : f02Var.a(jLongValue);
                } catch (Throwable th) {
                    throw th;
                }
            }
            Object value2 = a02Var.e.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            boolean zA = ((kr0) ((invest) value2)).a();
            Object value3 = a02Var.e.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            boolean zB = ((kr0) ((invest) value3)).b();
            Intrinsics.beachfront(ir0Var);
            return new tn0(new j12(ir0Var, zA, zB));
        } catch (Exception e) {
            y13.a("Exception while getting PAIDV2", e, 4);
            return new on0(e, k41Var, b == true ? 1 : 0, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01f8 A[Catch: all -> 0x0208, TryCatch #6 {all -> 0x0208, blocks: (B:103:0x01f1, B:105:0x01f8, B:107:0x01ff, B:109:0x0203, B:111:0x0207, B:114:0x020b, B:115:0x0210, B:116:0x0211, B:117:0x0218, B:118:0x0219, B:119:0x0220, B:120:0x0221), top: B:135:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01ff A[Catch: all -> 0x0208, TryCatch #6 {all -> 0x0208, blocks: (B:103:0x01f1, B:105:0x01f8, B:107:0x01ff, B:109:0x0203, B:111:0x0207, B:114:0x020b, B:115:0x0210, B:116:0x0211, B:117:0x0218, B:118:0x0219, B:119:0x0220, B:120:0x0221), top: B:135:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0203 A[Catch: all -> 0x0208, TryCatch #6 {all -> 0x0208, blocks: (B:103:0x01f1, B:105:0x01f8, B:107:0x01ff, B:109:0x0203, B:111:0x0207, B:114:0x020b, B:115:0x0210, B:116:0x0211, B:117:0x0218, B:118:0x0219, B:119:0x0220, B:120:0x0221), top: B:135:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0207 A[Catch: all -> 0x0208, TryCatch #6 {all -> 0x0208, blocks: (B:103:0x01f1, B:105:0x01f8, B:107:0x01ff, B:109:0x0203, B:111:0x0207, B:114:0x020b, B:115:0x0210, B:116:0x0211, B:117:0x0218, B:118:0x0219, B:119:0x0220, B:120:0x0221), top: B:135:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x020b A[Catch: all -> 0x0208, TryCatch #6 {all -> 0x0208, blocks: (B:103:0x01f1, B:105:0x01f8, B:107:0x01ff, B:109:0x0203, B:111:0x0207, B:114:0x020b, B:115:0x0210, B:116:0x0211, B:117:0x0218, B:118:0x0219, B:119:0x0220, B:120:0x0221), top: B:135:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0211 A[Catch: all -> 0x0208, TryCatch #6 {all -> 0x0208, blocks: (B:103:0x01f1, B:105:0x01f8, B:107:0x01ff, B:109:0x0203, B:111:0x0207, B:114:0x020b, B:115:0x0210, B:116:0x0211, B:117:0x0218, B:118:0x0219, B:119:0x0220, B:120:0x0221), top: B:135:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0219 A[Catch: all -> 0x0208, TryCatch #6 {all -> 0x0208, blocks: (B:103:0x01f1, B:105:0x01f8, B:107:0x01ff, B:109:0x0203, B:111:0x0207, B:114:0x020b, B:115:0x0210, B:116:0x0211, B:117:0x0218, B:118:0x0219, B:119:0x0220, B:120:0x0221), top: B:135:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0221 A[Catch: all -> 0x0208, TRY_LEAVE, TryCatch #6 {all -> 0x0208, blocks: (B:103:0x01f1, B:105:0x01f8, B:107:0x01ff, B:109:0x0203, B:111:0x0207, B:114:0x020b, B:115:0x0210, B:116:0x0211, B:117:0x0218, B:118:0x0219, B:119:0x0220, B:120:0x0221), top: B:135:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0142  */
    /* JADX WARN: Code duplicated, block: B:63:0x0177  */
    /* JADX WARN: Code duplicated, block: B:64:0x0178  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v4, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [ads_mobile_sdk.iv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [ads_mobile_sdk.iv] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final Object s(wretchedly.dern dernVar) {
        pu puVar;
        ?? r7;
        w03 w03Var;
        ?? r3;
        w03 w03Var2;
        formularization.attabal attabalVar;
        ?? r5;
        ?? r14;
        w03 w03Var3;
        ?? r4;
        w03 w03Var4;
        ?? r8;
        mv mvVar;
        w03 w03Var5;
        String str;
        formularization.attabal attabalVar2;
        iv ivVar;
        Closeable closeable;
        String strQ;
        formularization.attabal attabalVar3;
        String str2;
        w03 w03Var6;
        Closeable closeable2;
        ej1 ej1Var;
        gt gtVarP;
        if (dernVar instanceof pu) {
            puVar = (pu) dernVar;
            int i = puVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                puVar.i = i - Integer.MIN_VALUE;
            } else {
                puVar = new pu(this, dernVar);
            }
        } else {
            puVar = new pu(this, dernVar);
        }
        Object obj = puVar.g;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = puVar.i;
        ?? r12 = 1;
        ?? r13 = 1;
        try {
            try {
                if (i2 == 0) {
                    p002kotlin.dern.saneness(obj);
                    mv mvVar2 = (mv) ((ik) this.t).i.get();
                    if (mvVar2.p().o() <= 0) {
                        return Unit.f29295attabal;
                    }
                    no0 no0Var = no0.CUI_NAME_LOAD_CONSENT_FROM_DISK;
                    WeakHashMap weakHashMap = j13.a;
                    w03 w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
                    try {
                        String strR = mvVar2.r();
                        formularization.attabal attabalVar4 = this.w;
                        puVar.a = this;
                        puVar.b = mvVar2;
                        puVar.c = w03VarA;
                        puVar.d = w03VarA;
                        puVar.e = strR;
                        puVar.f = attabalVar4;
                        puVar.i = 1;
                        if (attabalVar4.attabal(null, puVar) != objBeachfront) {
                            mvVar = mvVar2;
                            w03 w03Var7 = w03VarA;
                            w03Var5 = w03Var7;
                            str = strR;
                            attabalVar2 = attabalVar4;
                            ivVar = this;
                            closeable = w03Var7;
                            Object objFromJson = new Gson().fromJson(str, (Class<Object>) JsonObject.class);
                            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                            ivVar.x = cb1.b((JsonObject) objFromJson);
                            Unit unit = Unit.f29295attabal;
                            attabalVar2.wireman(null);
                            strQ = mvVar.q();
                            attabalVar3 = ivVar.y;
                            puVar.a = ivVar;
                            puVar.b = mvVar;
                            puVar.c = w03Var5;
                            puVar.d = closeable;
                            puVar.e = strQ;
                            puVar.f = attabalVar3;
                            puVar.i = 2;
                            if (attabalVar3.attabal(null, puVar) != objBeachfront) {
                                str2 = strQ;
                                closeable2 = closeable;
                                w03Var6 = w03Var5;
                                Object objFromJson2 = new Gson().fromJson(str2, (Class<Object>) JsonObject.class);
                                Intrinsics.checkNotNullExpressionValue(objFromJson2, "fromJson(...)");
                                ivVar.z = (JsonObject) objFromJson2;
                                Unit unit2 = Unit.f29295attabal;
                                attabalVar3.wireman(null);
                                ej1Var = ivVar.A;
                                gtVarP = mvVar.p();
                                Intrinsics.checkNotNullExpressionValue(gtVarP, "getConsentAllowlist(...)");
                                puVar.a = ivVar;
                                puVar.b = w03Var6;
                                puVar.c = closeable2;
                                puVar.d = null;
                                puVar.e = null;
                                puVar.f = null;
                                puVar.i = 3;
                                if (ej1Var.a(gtVarP, puVar) == objBeachfront) {
                                    r4 = closeable2;
                                    w03Var3 = w03Var6;
                                    w03Var2 = w03Var3;
                                    r3 = r4;
                                    Unit unit3 = Unit.f29295attabal;
                                    interaction.saneness.attabal(r3, null);
                                    return unit3;
                                }
                            }
                        }
                    } catch (Exception e) {
                        exception = e;
                        r7 = this;
                        w03 w03Var8 = w03VarA;
                        w03Var = w03Var8;
                        r12 = w03Var8;
                        Intrinsics.checkNotNullParameter(exception, "exception");
                        w03 w03VarA2 = j13.a();
                        w03VarA2.e().m = false;
                        w03VarA2.a(exception);
                        attabalVar = r7.w;
                        puVar.a = r7;
                        puVar.b = w03Var;
                        puVar.c = r12;
                        puVar.d = attabalVar;
                        puVar.e = null;
                        puVar.f = null;
                        puVar.i = 4;
                        if (attabalVar.attabal(null, puVar) != objBeachfront) {
                            r5 = r12;
                            r8 = r7;
                            w03Var4 = w03Var;
                            r8.x = S;
                            Unit unit4 = Unit.f29295attabal;
                            attabalVar.wireman(null);
                            puVar.a = w03Var4;
                            puVar.b = r5;
                            puVar.c = null;
                            puVar.d = null;
                            puVar.i = 5;
                            if (r8.v(puVar) != objBeachfront) {
                                r4 = r5;
                                w03Var3 = w03Var4;
                                w03Var2 = w03Var3;
                                r3 = r4;
                                Unit unit5 = Unit.f29295attabal;
                                interaction.saneness.attabal(r3, null);
                                return unit5;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        r13 = w03VarA;
                        r14 = r13;
                        r14.b(th);
                        if (th instanceof evenfall) {
                            throw th;
                        }
                        r14.a(th);
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
                    }
                    return objBeachfront;
                }
                try {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            attabalVar3 = puVar.f;
                            str2 = puVar.e;
                            Closeable closeable3 = (Closeable) puVar.d;
                            w03 w03Var9 = (w03) puVar.c;
                            mvVar = (mv) puVar.b;
                            ivVar = (iv) puVar.a;
                            p002kotlin.dern.saneness(obj);
                            closeable2 = closeable3;
                            w03Var6 = w03Var9;
                            try {
                                Object objFromJson3 = new Gson().fromJson(str2, (Class<Object>) JsonObject.class);
                                Intrinsics.checkNotNullExpressionValue(objFromJson3, "fromJson(...)");
                                ivVar.z = (JsonObject) objFromJson3;
                                Unit unit6 = Unit.f29295attabal;
                                attabalVar3.wireman(null);
                                ej1Var = ivVar.A;
                                gtVarP = mvVar.p();
                                Intrinsics.checkNotNullExpressionValue(gtVarP, "getConsentAllowlist(...)");
                                puVar.a = ivVar;
                                puVar.b = w03Var6;
                                puVar.c = closeable2;
                                puVar.d = null;
                                puVar.e = null;
                                puVar.f = null;
                                puVar.i = 3;
                                if (ej1Var.a(gtVarP, puVar) == objBeachfront) {
                                    return objBeachfront;
                                }
                                r4 = closeable2;
                                w03Var3 = w03Var6;
                                w03Var2 = w03Var3;
                                r3 = r4;
                                Unit unit7 = Unit.f29295attabal;
                                interaction.saneness.attabal(r3, null);
                                return unit7;
                            } catch (Throwable th2) {
                                attabalVar3.wireman(null);
                                throw th2;
                            }
                        }
                        if (i2 == 3) {
                            Closeable closeable4 = puVar.c;
                            w03 w03Var10 = (w03) puVar.b;
                            iv ivVar2 = (iv) puVar.a;
                            try {
                                p002kotlin.dern.saneness(obj);
                                r3 = closeable4;
                                w03Var2 = w03Var10;
                            } catch (Exception e2) {
                                exception = e2;
                                r12 = closeable4;
                                w03Var = w03Var10;
                                r7 = ivVar2;
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                w03 w03VarA3 = j13.a();
                                w03VarA3.e().m = false;
                                w03VarA3.a(exception);
                                attabalVar = r7.w;
                                puVar.a = r7;
                                puVar.b = w03Var;
                                puVar.c = r12;
                                puVar.d = attabalVar;
                                puVar.e = null;
                                puVar.f = null;
                                puVar.i = 4;
                                if (attabalVar.attabal(null, puVar) != objBeachfront) {
                                    r5 = r12;
                                    r8 = r7;
                                    w03Var4 = w03Var;
                                    r8.x = S;
                                    Unit unit8 = Unit.f29295attabal;
                                    attabalVar.wireman(null);
                                    puVar.a = w03Var4;
                                    puVar.b = r5;
                                    puVar.c = null;
                                    puVar.d = null;
                                    puVar.i = 5;
                                    if (r8.v(puVar) != objBeachfront) {
                                        r4 = r5;
                                        w03Var3 = w03Var4;
                                        w03Var2 = w03Var3;
                                        r3 = r4;
                                    }
                                }
                                return objBeachfront;
                            } catch (Throwable th3) {
                                th = th3;
                                r3 = closeable4;
                                w03Var2 = w03Var10;
                                r14 = w03Var2;
                                r13 = r3;
                                r14.b(th);
                                if (th instanceof evenfall) {
                                    throw th;
                                }
                                r14.a(th);
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
                            }
                        } else {
                            if (i2 == 4) {
                                attabalVar = (formularization.attabal) puVar.d;
                                r5 = puVar.c;
                                w03 w03Var11 = (w03) puVar.b;
                                iv ivVar3 = (iv) puVar.a;
                                try {
                                    p002kotlin.dern.saneness(obj);
                                    w03Var4 = w03Var11;
                                    r5 = r5;
                                    r8 = ivVar3;
                                    try {
                                        try {
                                            r8.x = S;
                                            Unit unit9 = Unit.f29295attabal;
                                            attabalVar.wireman(null);
                                            puVar.a = w03Var4;
                                            puVar.b = r5;
                                            try {
                                                puVar.c = null;
                                                puVar.d = null;
                                                puVar.i = 5;
                                                if (r8.v(puVar) != objBeachfront) {
                                                    r4 = r5;
                                                    w03Var3 = w03Var4;
                                                    w03Var2 = w03Var3;
                                                    r3 = r4;
                                                }
                                                return objBeachfront;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r13 = r5;
                                                r14 = w03Var4;
                                                r14.b(th);
                                                if (th instanceof evenfall) {
                                                    throw th;
                                                }
                                                r14.a(th);
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
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            w03Var11 = w03Var4;
                                            r13 = r5;
                                            r14 = w03Var11;
                                            r14.b(th);
                                            if (th instanceof evenfall) {
                                                throw th;
                                            }
                                            r14.a(th);
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
                                        }
                                    } catch (Throwable th6) {
                                        attabalVar.wireman(null);
                                        throw th6;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    r13 = r5;
                                    r14 = w03Var11;
                                    r14.b(th);
                                    if (th instanceof evenfall) {
                                        throw th;
                                    }
                                    r14.a(th);
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
                                }
                            }
                            if (i2 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            r3 = (Closeable) puVar.b;
                            w03Var2 = (w03) puVar.a;
                            try {
                                p002kotlin.dern.saneness(obj);
                                w03Var2 = w03Var2;
                                r3 = r3;
                            } catch (Throwable th8) {
                                th = th8;
                                r14 = w03Var2;
                                r13 = r3;
                                try {
                                    r14.b(th);
                                    if (th instanceof evenfall) {
                                        throw th;
                                    }
                                    r14.a(th);
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
                                } catch (Throwable th9) {
                                    try {
                                        throw th9;
                                    } catch (Throwable th10) {
                                        interaction.saneness.attabal(r13, th9);
                                        throw th10;
                                    }
                                }
                            }
                        }
                        Unit unit10 = Unit.f29295attabal;
                        interaction.saneness.attabal(r3, null);
                        return unit10;
                    }
                    attabalVar2 = puVar.f;
                    String str3 = puVar.e;
                    Closeable closeable5 = (Closeable) puVar.d;
                    w03 w03Var12 = (w03) puVar.c;
                    mvVar = (mv) puVar.b;
                    iv ivVar4 = (iv) puVar.a;
                    try {
                        p002kotlin.dern.saneness(obj);
                        str = str3;
                        ivVar = ivVar4;
                        closeable = closeable5;
                        w03Var5 = w03Var12;
                        try {
                            Object objFromJson4 = new Gson().fromJson(str, (Class<Object>) JsonObject.class);
                            Intrinsics.checkNotNullExpressionValue(objFromJson4, "fromJson(...)");
                            ivVar.x = cb1.b((JsonObject) objFromJson4);
                            Unit unit11 = Unit.f29295attabal;
                            attabalVar2.wireman(null);
                            strQ = mvVar.q();
                            attabalVar3 = ivVar.y;
                            puVar.a = ivVar;
                            puVar.b = mvVar;
                            puVar.c = w03Var5;
                            puVar.d = closeable;
                            puVar.e = strQ;
                            puVar.f = attabalVar3;
                            puVar.i = 2;
                            if (attabalVar3.attabal(null, puVar) != objBeachfront) {
                                str2 = strQ;
                                closeable2 = closeable;
                                w03Var6 = w03Var5;
                                Object objFromJson5 = new Gson().fromJson(str2, (Class<Object>) JsonObject.class);
                                Intrinsics.checkNotNullExpressionValue(objFromJson5, "fromJson(...)");
                                ivVar.z = (JsonObject) objFromJson5;
                                Unit unit12 = Unit.f29295attabal;
                                attabalVar3.wireman(null);
                                ej1Var = ivVar.A;
                                gtVarP = mvVar.p();
                                Intrinsics.checkNotNullExpressionValue(gtVarP, "getConsentAllowlist(...)");
                                puVar.a = ivVar;
                                puVar.b = w03Var6;
                                puVar.c = closeable2;
                                puVar.d = null;
                                puVar.e = null;
                                puVar.f = null;
                                puVar.i = 3;
                                if (ej1Var.a(gtVarP, puVar) == objBeachfront) {
                                    r4 = closeable2;
                                    w03Var3 = w03Var6;
                                    w03Var2 = w03Var3;
                                    r3 = r4;
                                    Unit unit13 = Unit.f29295attabal;
                                    interaction.saneness.attabal(r3, null);
                                    return unit13;
                                }
                            }
                            return objBeachfront;
                        } catch (Throwable th11) {
                            attabalVar2.wireman(null);
                            throw th11;
                        }
                    } catch (Exception e3) {
                        exception = e3;
                        r7 = ivVar4;
                        r12 = closeable5;
                        w03Var = w03Var12;
                        Intrinsics.checkNotNullParameter(exception, "exception");
                        w03 w03VarA4 = j13.a();
                        w03VarA4.e().m = false;
                        w03VarA4.a(exception);
                        attabalVar = r7.w;
                        puVar.a = r7;
                        puVar.b = w03Var;
                        puVar.c = r12;
                        puVar.d = attabalVar;
                        puVar.e = null;
                        puVar.f = null;
                        puVar.i = 4;
                        if (attabalVar.attabal(null, puVar) != objBeachfront) {
                            r5 = r12;
                            r8 = r7;
                            w03Var4 = w03Var;
                            r8.x = S;
                            Unit unit14 = Unit.f29295attabal;
                            attabalVar.wireman(null);
                            puVar.a = w03Var4;
                            puVar.b = r5;
                            puVar.c = null;
                            puVar.d = null;
                            puVar.i = 5;
                            if (r8.v(puVar) != objBeachfront) {
                                r4 = r5;
                                w03Var3 = w03Var4;
                                w03Var2 = w03Var3;
                                r3 = r4;
                                Unit unit15 = Unit.f29295attabal;
                                interaction.saneness.attabal(r3, null);
                                return unit15;
                            }
                        }
                    }
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    w03 w03VarA5 = j13.a();
                    w03VarA5.e().m = false;
                    w03VarA5.a(exception);
                    attabalVar = r7.w;
                    puVar.a = r7;
                    puVar.b = w03Var;
                    puVar.c = r12;
                    puVar.d = attabalVar;
                    puVar.e = null;
                    puVar.f = null;
                    puVar.i = 4;
                    if (attabalVar.attabal(null, puVar) != objBeachfront) {
                        r5 = r12;
                        r8 = r7;
                        w03Var4 = w03Var;
                        r8.x = S;
                        Unit unit16 = Unit.f29295attabal;
                        attabalVar.wireman(null);
                        puVar.a = w03Var4;
                        puVar.b = r5;
                        puVar.c = null;
                        puVar.d = null;
                        puVar.i = 5;
                        if (r8.v(puVar) != objBeachfront) {
                            r4 = r5;
                            w03Var3 = w03Var4;
                            w03Var2 = w03Var3;
                            r3 = r4;
                            Unit unit17 = Unit.f29295attabal;
                            interaction.saneness.attabal(r3, null);
                            return unit17;
                        }
                    }
                    return objBeachfront;
                } catch (Throwable th12) {
                    th = th12;
                    r3 = r12;
                    w03Var2 = w03Var;
                    r14 = w03Var2;
                    r13 = r3;
                    r14.b(th);
                    if (th instanceof evenfall) {
                        throw th;
                    }
                    r14.a(th);
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
                }
            } catch (Exception e4) {
                exception = e4;
                r7 = 5;
            }
        } catch (Throwable th13) {
            th = th13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(wretchedly.dern dernVar) {
        qu quVar;
        et etVar;
        iv ivVar;
        ContentResolver contentResolver;
        if (dernVar instanceof qu) {
            quVar = (qu) dernVar;
            int i = quVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                quVar.e = i - Integer.MIN_VALUE;
            } else {
                quVar = new qu(this, dernVar);
            }
        } else {
            quVar = new qu(this, dernVar);
        }
        Object obj = quVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = quVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            et etVar2 = et.API_READ_AMAZON_FIRE_AD_ID;
            ej1 ej1Var = this.A;
            quVar.a = this;
            quVar.b = etVar2;
            quVar.e = 1;
            Object objA = ej1Var.a(quVar);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            etVar = etVar2;
            obj = objA;
            ivVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            etVar = quVar.b;
            ivVar = quVar.a;
            p002kotlin.dern.saneness(obj);
        }
        if (!((gt) obj).p().contains(etVar) || (contentResolver = ivVar.c.getContentResolver()) == null) {
            return null;
        }
        Intrinsics.beachfront(contentResolver);
        return igo.attabal.attabal(Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        if (r5.v(r0) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v4, types: [ads_mobile_sdk.iv] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(wretchedly.dern r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.su
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.su r0 = (ads_mobile_sdk.su) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.su r0 = new ads_mobile_sdk.su
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.d
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            p002kotlin.dern.saneness(r10)
            goto Lc0
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            formularization.attabal r2 = r0.c
            ads_mobile_sdk.mv r4 = r0.b
            ads_mobile_sdk.iv r5 = r0.a
            p002kotlin.dern.saneness(r10)     // Catch: java.lang.Exception -> L43
            goto L88
        L43:
            r10 = move-exception
            goto Lab
        L45:
            ads_mobile_sdk.mv r2 = r0.b
            ads_mobile_sdk.iv r5 = r0.a
            p002kotlin.dern.saneness(r10)
            r10 = r2
            goto L76
        L4e:
            p002kotlin.dern.saneness(r10)
            saneness.stupefactive r10 = r9.t
            ads_mobile_sdk.ik r10 = (ads_mobile_sdk.ik) r10
            java.util.concurrent.atomic.AtomicReference r10 = r10.i
            java.lang.Object r10 = r10.get()
            ads_mobile_sdk.mv r10 = (ads_mobile_sdk.mv) r10
            ads_mobile_sdk.ej1 r2 = r9.A
            ads_mobile_sdk.gt r7 = r10.p()
            java.lang.String r8 = "getConsentAllowlist(...)"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r0.a = r9
            r0.b = r10
            r0.f = r5
            java.lang.Object r2 = r2.a(r7, r0)
            if (r2 != r1) goto L75
            goto Lbf
        L75:
            r5 = r9
        L76:
            formularization.attabal r2 = r5.y     // Catch: java.lang.Exception -> L43
            r0.a = r5     // Catch: java.lang.Exception -> L43
            r0.b = r10     // Catch: java.lang.Exception -> L43
            r0.c = r2     // Catch: java.lang.Exception -> L43
            r0.f = r4     // Catch: java.lang.Exception -> L43
            java.lang.Object r4 = r2.attabal(r6, r0)     // Catch: java.lang.Exception -> L43
            if (r4 != r1) goto L87
            goto Lbf
        L87:
            r4 = r10
        L88:
            com.google.gson.Gson r10 = new com.google.gson.Gson     // Catch: java.lang.Throwable -> La6
            r10.<init>()     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = r4.q()     // Catch: java.lang.Throwable -> La6
            java.lang.Class<com.google.gson.JsonObject> r7 = com.google.gson.JsonObject.class
            java.lang.Object r10 = r10.fromJson(r4, r7)     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = "fromJson(...)"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r4)     // Catch: java.lang.Throwable -> La6
            com.google.gson.JsonObject r10 = (com.google.gson.JsonObject) r10     // Catch: java.lang.Throwable -> La6
            r5.z = r10     // Catch: java.lang.Throwable -> La6
            kotlin.Unit r10 = p002kotlin.Unit.f29295attabal     // Catch: java.lang.Throwable -> La6
            r2.wireman(r6)     // Catch: java.lang.Exception -> L43
            goto Lc0
        La6:
            r10 = move-exception
            r2.wireman(r6)     // Catch: java.lang.Exception -> L43
            throw r10     // Catch: java.lang.Exception -> L43
        Lab:
            java.lang.String r2 = "Failed to read the updated in memory consent state"
            r4 = 4
            ads_mobile_sdk.y13.a(r2, r10, r4)
            r0.a = r6
            r0.b = r6
            r0.c = r6
            r0.f = r3
            java.lang.Object r10 = r5.v(r0)
            if (r10 != r1) goto Lc0
        Lbf:
            return r1
        Lc0:
            kotlin.Unit r10 = p002kotlin.Unit.f29295attabal
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv.u(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r7.a(r2, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(wretchedly.dern r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.yu
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.yu r0 = (ads_mobile_sdk.yu) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.yu r0 = new ads_mobile_sdk.yu
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p002kotlin.dern.saneness(r7)
            goto L6c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            formularization.attabal r2 = r0.b
            ads_mobile_sdk.iv r4 = r0.a
            p002kotlin.dern.saneness(r7)
            goto L50
        L3d:
            p002kotlin.dern.saneness(r7)
            formularization.attabal r2 = r6.y
            r0.a = r6
            r0.b = r2
            r0.e = r4
            java.lang.Object r7 = r2.attabal(r5, r0)
            if (r7 != r1) goto L4f
            goto L6b
        L4f:
            r4 = r6
        L50:
            com.google.gson.JsonObject r7 = ads_mobile_sdk.iv.Q     // Catch: java.lang.Throwable -> L6f
            r4.z = r7     // Catch: java.lang.Throwable -> L6f
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal     // Catch: java.lang.Throwable -> L6f
            r2.wireman(r5)
            ads_mobile_sdk.ej1 r7 = r4.A
            ads_mobile_sdk.gt r2 = r4.c()
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r7 = p002kotlin.Unit.f29295attabal
            return r7
        L6f:
            r7 = move-exception
            r2.wireman(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv.v(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01b1, code lost:
    
        if (r14.a((ads_mobile_sdk.gt) r2, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(wretchedly.dern r14) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv.w(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object b(iv ivVar, wretchedly.dern dernVar) {
        xt xtVar;
        formularization.attabal attabalVar;
        if (dernVar instanceof xt) {
            xtVar = (xt) dernVar;
            int i = xtVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xtVar.e = i - Integer.MIN_VALUE;
            } else {
                xtVar = new xt(ivVar, dernVar);
            }
        } else {
            xtVar = new xt(ivVar, dernVar);
        }
        Object obj = xtVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = xtVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = ivVar.y;
            xtVar.a = ivVar;
            xtVar.b = attabalVar;
            xtVar.e = 1;
            if (attabalVar.attabal(null, xtVar) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = xtVar.b;
            iv ivVar2 = xtVar.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            ivVar = ivVar2;
        }
        try {
            return ivVar.z;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object i(iv ivVar, wretchedly.dern dernVar) {
        lu luVar;
        iv ivVar2;
        et etVar;
        if (dernVar instanceof lu) {
            luVar = (lu) dernVar;
            int i = luVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                luVar.e = i - Integer.MIN_VALUE;
            } else {
                luVar = new lu(ivVar, dernVar);
            }
        } else {
            luVar = new lu(ivVar, dernVar);
        }
        Object obj = luVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = luVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            et etVar2 = et.API_GET_WEBVIEW_COOKIE;
            ej1 ej1Var = ivVar.A;
            luVar.a = ivVar;
            luVar.b = etVar2;
            luVar.e = 1;
            Object objA = ej1Var.a(luVar);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            ivVar2 = ivVar;
            etVar = etVar2;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            etVar = luVar.b;
            ivVar2 = luVar.a;
            p002kotlin.dern.saneness(obj);
        }
        if (((gt) obj).p().contains(etVar)) {
            CookieManager cookieManager = ivVar2.C;
            String cookie = cookieManager != null ? cookieManager.getCookie(ivVar2.h.n0()) : null;
            if (cookie != null && cookie.length() != 0) {
                Matcher matcher = P.matcher(cookie);
                ArrayList arrayList = new ArrayList();
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (strGroup != null && (dovishness.privatdozent(strGroup, "id=", true) || dovishness.privatdozent(strGroup, "ide=", true))) {
                        arrayList.add(strGroup);
                    }
                }
                return CollectionsKt.preterite(arrayList, "; ", null, null, 0, null, null, 62, null);
            }
        }
        return null;
    }

    public final gt c() {
        apologetic builder = gt.s();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        o21 o21VarWireman = builder.wireman();
        Intrinsics.checkNotNullExpressionValue(o21VarWireman, "getAllowedApisList(...)");
        yd0 yd0Var = new yd0(o21VarWireman);
        derbyshire derbyshireVar = this.h.r;
        derbyshireVar.getClass();
        apologetic builder2 = gt.s();
        Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder2, "builder");
        jt jtVar = new jt(builder2);
        yd0 yd0VarB = jtVar.b();
        et etVar = et.API_READ_SHARED_PREFERENCES_CONSENT_DATA;
        Intrinsics.checkNotNullParameter(yd0VarB, "<this>");
        yd0 yd0VarAttabal = patriotism.attabal(etVar, "value", builder2, etVar, jtVar);
        et etVar2 = et.API_READ_FLAG_VALUES;
        Intrinsics.checkNotNullParameter(yd0VarAttabal, "<this>");
        yd0 yd0VarAttabal2 = patriotism.attabal(etVar2, "value", builder2, etVar2, jtVar);
        et etVar3 = et.API_WRITE_FLAG_VALUES;
        Intrinsics.checkNotNullParameter(yd0VarAttabal2, "<this>");
        yd0 yd0VarAttabal3 = patriotism.attabal(etVar3, "value", builder2, etVar3, jtVar);
        et etVar4 = et.API_READ_CLD_RESPONSE;
        Intrinsics.checkNotNullParameter(yd0VarAttabal3, "<this>");
        yd0 yd0VarAttabal4 = patriotism.attabal(etVar4, "value", builder2, etVar4, jtVar);
        et etVar5 = et.API_CLEAR_WEBVIEW_COOKIE;
        Intrinsics.checkNotNullParameter(yd0VarAttabal4, "<this>");
        yd0 yd0VarAttabal5 = patriotism.attabal(etVar5, "value", builder2, etVar5, jtVar);
        et etVar6 = et.API_READ_ANDROID_ID;
        Intrinsics.checkNotNullParameter(yd0VarAttabal5, "<this>");
        yd0 yd0VarAttabal6 = patriotism.attabal(etVar6, "value", builder2, etVar6, jtVar);
        et etVar7 = et.API_READ_ADVERTISING_ID;
        Intrinsics.checkNotNullParameter(yd0VarAttabal6, "<this>");
        yd0 yd0VarAttabal7 = patriotism.attabal(etVar7, "value", builder2, etVar7, jtVar);
        et etVar8 = et.API_READ_APP_SET_ID;
        Intrinsics.checkNotNullParameter(yd0VarAttabal7, "<this>");
        yd0 yd0VarAttabal8 = patriotism.attabal(etVar8, "value", builder2, etVar8, jtVar);
        et etVar9 = et.API_CLEAR_PER_APP_ID_V1;
        Intrinsics.checkNotNullParameter(yd0VarAttabal8, "<this>");
        yd0 yd0VarAttabal9 = patriotism.attabal(etVar9, "value", builder2, etVar9, jtVar);
        et etVar10 = et.API_CLEAR_PER_APP_ID_V2;
        Intrinsics.checkNotNullParameter(yd0VarAttabal9, "<this>");
        yd0 yd0VarAttabal10 = patriotism.attabal(etVar10, "value", builder2, etVar10, jtVar);
        et etVar11 = et.API_READ_FIREBASE_APP_ID;
        Intrinsics.checkNotNullParameter(yd0VarAttabal10, "<this>");
        yd0 yd0VarAttabal11 = patriotism.attabal(etVar11, "value", builder2, etVar11, jtVar);
        et value = et.API_READ_FIREBASE_APP_INSTANCE_ID;
        Intrinsics.checkNotNullParameter(yd0VarAttabal11, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        builder2.attabal(value);
        yd0 yd0VarB2 = jtVar.b();
        et value2 = et.API_READ_FIREBASE_AD_EVENT_ID;
        Intrinsics.checkNotNullParameter(yd0VarB2, "<this>");
        Intrinsics.checkNotNullParameter(value2, "value");
        builder2.attabal(value2);
        Unit unit = Unit.f29295attabal;
        cyrtometer defaultValue = jtVar.a().q();
        Intrinsics.checkNotNullExpressionValue(defaultValue, "getAllowedApisValueList(...)");
        Intrinsics.checkNotNullParameter("gads:consent_allowlist_default:string", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        List list = (List) derbyshireVar.a("gads:consent_allowlist_default:string", defaultValue, zk.h);
        ArrayList values = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            et etVarA = et.a(((Number) it.next()).intValue());
            if (etVarA != null) {
                values.add(etVarA);
            }
        }
        Intrinsics.checkNotNullParameter(yd0Var, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        builder.dern(values);
        xm0 xm0VarA = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (gt) xm0VarA;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0098 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0031, B:31:0x0092, B:33:0x0098), top: B:63:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:39:0x00ab, B:41:0x00b2, B:43:0x00b9, B:45:0x00bd, B:47:0x00c1, B:50:0x00c4, B:51:0x00c9, B:52:0x00ca, B:53:0x00d1, B:54:0x00d2, B:55:0x00d9, B:56:0x00da), top: B:62:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:39:0x00ab, B:41:0x00b2, B:43:0x00b9, B:45:0x00bd, B:47:0x00c1, B:50:0x00c4, B:51:0x00c9, B:52:0x00ca, B:53:0x00d1, B:54:0x00d2, B:55:0x00d9, B:56:0x00da), top: B:62:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:39:0x00ab, B:41:0x00b2, B:43:0x00b9, B:45:0x00bd, B:47:0x00c1, B:50:0x00c4, B:51:0x00c9, B:52:0x00ca, B:53:0x00d1, B:54:0x00d2, B:55:0x00d9, B:56:0x00da), top: B:62:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:39:0x00ab, B:41:0x00b2, B:43:0x00b9, B:45:0x00bd, B:47:0x00c1, B:50:0x00c4, B:51:0x00c9, B:52:0x00ca, B:53:0x00d1, B:54:0x00d2, B:55:0x00d9, B:56:0x00da), top: B:62:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:39:0x00ab, B:41:0x00b2, B:43:0x00b9, B:45:0x00bd, B:47:0x00c1, B:50:0x00c4, B:51:0x00c9, B:52:0x00ca, B:53:0x00d1, B:54:0x00d2, B:55:0x00d9, B:56:0x00da), top: B:62:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:39:0x00ab, B:41:0x00b2, B:43:0x00b9, B:45:0x00bd, B:47:0x00c1, B:50:0x00c4, B:51:0x00c9, B:52:0x00ca, B:53:0x00d1, B:54:0x00d2, B:55:0x00d9, B:56:0x00da), top: B:62:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:39:0x00ab, B:41:0x00b2, B:43:0x00b9, B:45:0x00bd, B:47:0x00c1, B:50:0x00c4, B:51:0x00c9, B:52:0x00ca, B:53:0x00d1, B:54:0x00d2, B:55:0x00d9, B:56:0x00da), top: B:62:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00da A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:39:0x00ab, B:41:0x00b2, B:43:0x00b9, B:45:0x00bd, B:47:0x00c1, B:50:0x00c4, B:51:0x00c9, B:52:0x00ca, B:53:0x00d1, B:54:0x00d2, B:55:0x00d9, B:56:0x00da), top: B:62:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object g(iv ivVar, wretchedly.dern dernVar) {
        iu iuVar;
        iv ivVar2;
        et etVar;
        TimeoutCancellationException timeoutCancellationException;
        Closeable closeable;
        w03 w03Var;
        w03 w03Var2;
        Closeable closeable2;
        spartacist spartacistVar;
        if (dernVar instanceof iu) {
            iuVar = (iu) dernVar;
            int i = iuVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                iuVar.e = i - Integer.MIN_VALUE;
            } else {
                iuVar = new iu(ivVar, dernVar);
            }
        } else {
            iuVar = new iu(ivVar, dernVar);
        }
        Object objA = iuVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = iuVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            et etVar2 = et.API_READ_TRUSTLESS_TOKEN;
            ej1 ej1Var = ivVar.A;
            iuVar.a = ivVar;
            iuVar.b = etVar2;
            iuVar.e = 1;
            Object objA2 = ej1Var.a(iuVar);
            if (objA2 != objBeachfront) {
                ivVar2 = ivVar;
                etVar = etVar2;
                objA = objA2;
            }
            return objBeachfront;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable2 = (Closeable) iuVar.b;
            w03Var = (w03) iuVar.a;
            try {
                p002kotlin.dern.saneness(objA);
                w03Var = w03Var;
                closeable2 = closeable2;
                spartacistVar = (spartacist) objA;
                if (spartacistVar instanceof nn0) {
                    y13.a((nn0) spartacistVar, false);
                }
                interaction.saneness.attabal(closeable2, null);
                return spartacistVar;
            } catch (Throwable th) {
                closeable = closeable2;
                w03Var2 = w03Var;
                timeoutCancellationException = th;
                try {
                    w03Var2.b(timeoutCancellationException);
                    if (!(timeoutCancellationException instanceof evenfall)) {
                        w03Var2.a(timeoutCancellationException);
                        if (!(timeoutCancellationException instanceof TimeoutCancellationException)) {
                            if (!(timeoutCancellationException instanceof CancellationException)) {
                                if (timeoutCancellationException instanceof yn0) {
                                    throw timeoutCancellationException;
                                }
                                throw new gn0(timeoutCancellationException);
                            }
                            throw new bn0(timeoutCancellationException);
                        }
                        throw new cp0(timeoutCancellationException);
                    }
                    throw timeoutCancellationException;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        interaction.saneness.attabal(closeable, th2);
                        throw th3;
                    }
                }
            }
        }
        etVar = (et) iuVar.b;
        ivVar2 = (iv) iuVar.a;
        p002kotlin.dern.saneness(objA);
        if (!((gt) objA).p().contains(etVar)) {
            return null;
        }
        no0 no0Var = no0.CUI_NAME_GET_TRUSTLESS_TOKEN;
        WeakHashMap weakHashMap = j13.a;
        w03 w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
        try {
            x23 x23Var = (x23) ivVar2.s.get();
            iuVar.a = w03VarA;
            iuVar.b = w03VarA;
            iuVar.e = 2;
            objA = x23Var.a(iuVar);
            if (objA != objBeachfront) {
                w03Var = w03VarA;
                closeable2 = w03VarA;
                spartacistVar = (spartacist) objA;
                if (spartacistVar instanceof nn0) {
                    y13.a((nn0) spartacistVar, false);
                }
                interaction.saneness.attabal(closeable2, null);
                return spartacistVar;
            }
            return objBeachfront;
        } catch (Throwable th4) {
            timeoutCancellationException = th4;
            closeable = w03VarA;
            w03Var2 = w03VarA;
            w03Var2.b(timeoutCancellationException);
            if (!(timeoutCancellationException instanceof evenfall)) {
                w03Var2.a(timeoutCancellationException);
                if (!(timeoutCancellationException instanceof TimeoutCancellationException)) {
                    if (!(timeoutCancellationException instanceof CancellationException)) {
                        if (timeoutCancellationException instanceof yn0) {
                            throw timeoutCancellationException;
                        }
                        throw new gn0(timeoutCancellationException);
                    }
                    throw new bn0(timeoutCancellationException);
                }
                throw new cp0(timeoutCancellationException);
            }
            throw timeoutCancellationException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a8 A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:27:0x008c, B:29:0x00a8, B:32:0x00b5, B:34:0x00b9, B:36:0x00f8, B:37:0x0107, B:39:0x010b, B:41:0x0111, B:43:0x0117), top: B:55:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5 A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:27:0x008c, B:29:0x00a8, B:32:0x00b5, B:34:0x00b9, B:36:0x00f8, B:37:0x0107, B:39:0x010b, B:41:0x0111, B:43:0x0117), top: B:55:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9 A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:27:0x008c, B:29:0x00a8, B:32:0x00b5, B:34:0x00b9, B:36:0x00f8, B:37:0x0107, B:39:0x010b, B:41:0x0111, B:43:0x0117), top: B:55:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8 A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:27:0x008c, B:29:0x00a8, B:32:0x00b5, B:34:0x00b9, B:36:0x00f8, B:37:0x0107, B:39:0x010b, B:41:0x0111, B:43:0x0117), top: B:55:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0107 A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:27:0x008c, B:29:0x00a8, B:32:0x00b5, B:34:0x00b9, B:36:0x00f8, B:37:0x0107, B:39:0x010b, B:41:0x0111, B:43:0x0117), top: B:55:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:39:0x010b A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:27:0x008c, B:29:0x00a8, B:32:0x00b5, B:34:0x00b9, B:36:0x00f8, B:37:0x0107, B:39:0x010b, B:41:0x0111, B:43:0x0117), top: B:55:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0148  */
    /* JADX WARN: Code duplicated, block: B:54:0x0158 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0152, code lost:
    
        if (r1 == r4) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object h(ads_mobile_sdk.iv r17, wretchedly.dern r18) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv.h(ads_mobile_sdk.iv, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        if (r13.starveling(r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(ads_mobile_sdk.iv r12, boolean r13, boolean r14, wretchedly.dern r15) {
        /*
            boolean r0 = r15 instanceof ads_mobile_sdk.tu
            if (r0 == 0) goto L13
            r0 = r15
            ads_mobile_sdk.tu r0 = (ads_mobile_sdk.tu) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.tu r0 = new ads_mobile_sdk.tu
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.e
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            p002kotlin.dern.saneness(r15)
            goto La5
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            boolean r14 = r0.d
            boolean r13 = r0.c
            formularization.attabal r12 = r0.b
            ads_mobile_sdk.iv r2 = r0.a
            p002kotlin.dern.saneness(r15)
            r15 = r12
            r12 = r2
            goto L5a
        L44:
            p002kotlin.dern.saneness(r15)
            formularization.attabal r15 = r12.F
            r0.a = r12
            r0.b = r15
            r0.c = r13
            r0.d = r14
            r0.g = r4
            java.lang.Object r2 = r15.attabal(r5, r0)
            if (r2 != r1) goto L5a
            goto La4
        L5a:
            kotlinx.coroutines.monroe r2 = r12.G     // Catch: java.lang.Throwable -> L62
            if (r2 == 0) goto L65
            kotlinx.coroutines.monroe.attabal.attabal(r2, r5, r4, r5)     // Catch: java.lang.Throwable -> L62
            goto L65
        L62:
            r0 = move-exception
            r12 = r0
            goto La8
        L65:
            boolean r2 = r12.H     // Catch: java.lang.Throwable -> L62
            if (r2 != 0) goto L6d
            if (r13 == 0) goto L6c
            goto L6d
        L6c:
            r4 = 0
        L6d:
            r12.H = r4     // Catch: java.lang.Throwable -> L62
            kotlinx.coroutines.saran r6 = r12.d     // Catch: java.lang.Throwable -> L62
            ads_mobile_sdk.uu r13 = new ads_mobile_sdk.uu     // Catch: java.lang.Throwable -> L62
            r13.<init>(r12, r4, r14, r5)     // Catch: java.lang.Throwable -> L62
            kotlin.coroutines.EmptyCoroutineContext r7 = p002kotlin.coroutines.EmptyCoroutineContext.INSTANCE     // Catch: java.lang.Throwable -> L62
            java.lang.String r14 = "<this>"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r14)     // Catch: java.lang.Throwable -> L62
            java.lang.String r14 = "context"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r14)     // Catch: java.lang.Throwable -> L62
            java.lang.String r14 = "block"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r14)     // Catch: java.lang.Throwable -> L62
            ads_mobile_sdk.x13 r9 = new ads_mobile_sdk.x13     // Catch: java.lang.Throwable -> L62
            r9.<init>(r13, r5)     // Catch: java.lang.Throwable -> L62
            r10 = 2
            r11 = 0
            r8 = 0
            kotlinx.coroutines.monroe r13 = kotlinx.coroutines.impromptu.wireman(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L62
            r12.G = r13     // Catch: java.lang.Throwable -> L62
            r15.wireman(r5)
            r0.a = r5
            r0.b = r5
            r0.g = r3
            java.lang.Object r12 = r13.starveling(r0)
            if (r12 != r1) goto La5
        La4:
            return r1
        La5:
            kotlin.Unit r12 = p002kotlin.Unit.f29295attabal
            return r12
        La8:
            r15.wireman(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv.b(ads_mobile_sdk.iv, boolean, boolean, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00aa A[PHI: r0
  0x00aa: PHI (r0v2 ads_mobile_sdk.iv) = (r0v1 ads_mobile_sdk.iv), (r0v1 ads_mobile_sdk.iv), (r0v7 ads_mobile_sdk.iv) binds: [B:26:0x00a7, B:24:0x009d, B:16:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        if (a(r0, false, (wretchedly.dern) r2, 3) == r3) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object k(ads_mobile_sdk.iv r19, wretchedly.dern r20) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv.k(ads_mobile_sdk.iv, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r7 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object f(ads_mobile_sdk.iv r6, wretchedly.dern r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.gu
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.gu r0 = (ads_mobile_sdk.gu) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.gu r0 = new ads_mobile_sdk.gu
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p002kotlin.dern.saneness(r7)
            goto L70
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            ads_mobile_sdk.et r6 = r0.b
            ads_mobile_sdk.iv r2 = r0.a
            p002kotlin.dern.saneness(r7)
            goto L54
        L3c:
            p002kotlin.dern.saneness(r7)
            ads_mobile_sdk.et r7 = ads_mobile_sdk.et.API_READ_SESSION_ID
            ads_mobile_sdk.ej1 r2 = r6.A
            r0.a = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L50
            goto L6f
        L50:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L54:
            ads_mobile_sdk.gt r7 = (ads_mobile_sdk.gt) r7
            ads_mobile_sdk.o21 r7 = r7.p()
            boolean r6 = r7.contains(r6)
            r7 = 0
            if (r6 == 0) goto L72
            ads_mobile_sdk.ej1 r6 = r2.E
            r0.a = r7
            r0.b = r7
            r0.e = r3
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            java.lang.String r7 = (java.lang.String) r7
        L72:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv.f(ads_mobile_sdk.iv, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object j(iv ivVar, wretchedly.dern dernVar) {
        ou ouVar;
        if (dernVar instanceof ou) {
            ouVar = (ou) dernVar;
            int i = ouVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ouVar.c = i - Integer.MIN_VALUE;
            } else {
                ouVar = new ou(ivVar, dernVar);
            }
        } else {
            ouVar = new ou(ivVar, dernVar);
        }
        Object objA = ouVar.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ouVar.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            ej1 ej1Var = ivVar.A;
            ouVar.c = 1;
            objA = ej1Var.a(ouVar);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objA);
        }
        return igo.attabal.attabal(((gt) objA).p().contains(et.API_READ_TRUSTLESS_TOKEN));
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        return k(this, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c0 A[Catch: all -> 0x01c5, TryCatch #3 {all -> 0x01c5, blocks: (B:95:0x01ae, B:97:0x01b5, B:99:0x01bc, B:101:0x01c0, B:103:0x01c4, B:106:0x01c7, B:107:0x01cc, B:108:0x01cd, B:109:0x01d4, B:110:0x01d5, B:111:0x01dc, B:112:0x01dd), top: B:189:0x01ae }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01c4 A[Catch: all -> 0x01c5, TryCatch #3 {all -> 0x01c5, blocks: (B:95:0x01ae, B:97:0x01b5, B:99:0x01bc, B:101:0x01c0, B:103:0x01c4, B:106:0x01c7, B:107:0x01cc, B:108:0x01cd, B:109:0x01d4, B:110:0x01d5, B:111:0x01dc, B:112:0x01dd), top: B:189:0x01ae }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01c7 A[Catch: all -> 0x01c5, TryCatch #3 {all -> 0x01c5, blocks: (B:95:0x01ae, B:97:0x01b5, B:99:0x01bc, B:101:0x01c0, B:103:0x01c4, B:106:0x01c7, B:107:0x01cc, B:108:0x01cd, B:109:0x01d4, B:110:0x01d5, B:111:0x01dc, B:112:0x01dd), top: B:189:0x01ae }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01cd A[Catch: all -> 0x01c5, TryCatch #3 {all -> 0x01c5, blocks: (B:95:0x01ae, B:97:0x01b5, B:99:0x01bc, B:101:0x01c0, B:103:0x01c4, B:106:0x01c7, B:107:0x01cc, B:108:0x01cd, B:109:0x01d4, B:110:0x01d5, B:111:0x01dc, B:112:0x01dd), top: B:189:0x01ae }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01d5 A[Catch: all -> 0x01c5, TryCatch #3 {all -> 0x01c5, blocks: (B:95:0x01ae, B:97:0x01b5, B:99:0x01bc, B:101:0x01c0, B:103:0x01c4, B:106:0x01c7, B:107:0x01cc, B:108:0x01cd, B:109:0x01d4, B:110:0x01d5, B:111:0x01dc, B:112:0x01dd), top: B:189:0x01ae }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01dd A[Catch: all -> 0x01c5, TRY_LEAVE, TryCatch #3 {all -> 0x01c5, blocks: (B:95:0x01ae, B:97:0x01b5, B:99:0x01bc, B:101:0x01c0, B:103:0x01c4, B:106:0x01c7, B:107:0x01cc, B:108:0x01cd, B:109:0x01d4, B:110:0x01d5, B:111:0x01dc, B:112:0x01dd), top: B:189:0x01ae }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:124:0x0207 A[Catch: all -> 0x0218, TryCatch #13 {all -> 0x0218, blocks: (B:28:0x0071, B:122:0x0201, B:124:0x0207, B:129:0x021b, B:131:0x021f), top: B:204:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0217  */
    /* JADX WARN: Code duplicated, block: B:129:0x021b A[Catch: all -> 0x0218, TryCatch #13 {all -> 0x0218, blocks: (B:28:0x0071, B:122:0x0201, B:124:0x0207, B:129:0x021b, B:131:0x021f), top: B:204:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x021f A[Catch: all -> 0x0218, TRY_LEAVE, TryCatch #13 {all -> 0x0218, blocks: (B:28:0x0071, B:122:0x0201, B:124:0x0207, B:129:0x021b, B:131:0x021f), top: B:204:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0230 A[PHI: r2 r3 r13
  0x0230: PHI (r2v32 ads_mobile_sdk.w03) = (r2v46 ads_mobile_sdk.w03), (r2v47 ads_mobile_sdk.w03), (r2v48 ads_mobile_sdk.w03), (r2v49 ads_mobile_sdk.w03) binds: [B:130:0x021d, B:132:0x022d, B:125:0x0215, B:23:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x0230: PHI (r3v18 ads_mobile_sdk.iv) = (r3v15 ads_mobile_sdk.iv), (r3v15 ads_mobile_sdk.iv), (r3v15 ads_mobile_sdk.iv), (r3v23 ads_mobile_sdk.iv) binds: [B:130:0x021d, B:132:0x022d, B:125:0x0215, B:23:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x0230: PHI (r13v33 java.io.Closeable) = (r13v55 java.io.Closeable), (r13v56 java.io.Closeable), (r13v57 java.io.Closeable), (r13v58 java.io.Closeable) binds: [B:130:0x021d, B:132:0x022d, B:125:0x0215, B:23:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x0246  */
    /* JADX WARN: Code duplicated, block: B:146:0x0263  */
    /* JADX WARN: Code duplicated, block: B:163:0x0286 A[Catch: all -> 0x0296, TryCatch #12 {all -> 0x0296, blocks: (B:161:0x027f, B:163:0x0286, B:165:0x028d, B:167:0x0291, B:169:0x0295, B:172:0x0298, B:173:0x029d, B:174:0x029e, B:175:0x02a5, B:176:0x02a6, B:177:0x02ad, B:178:0x02ae), top: B:203:0x027f }] */
    /* JADX WARN: Code duplicated, block: B:165:0x028d A[Catch: all -> 0x0296, TryCatch #12 {all -> 0x0296, blocks: (B:161:0x027f, B:163:0x0286, B:165:0x028d, B:167:0x0291, B:169:0x0295, B:172:0x0298, B:173:0x029d, B:174:0x029e, B:175:0x02a5, B:176:0x02a6, B:177:0x02ad, B:178:0x02ae), top: B:203:0x027f }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0291 A[Catch: all -> 0x0296, TryCatch #12 {all -> 0x0296, blocks: (B:161:0x027f, B:163:0x0286, B:165:0x028d, B:167:0x0291, B:169:0x0295, B:172:0x0298, B:173:0x029d, B:174:0x029e, B:175:0x02a5, B:176:0x02a6, B:177:0x02ad, B:178:0x02ae), top: B:203:0x027f }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0295 A[Catch: all -> 0x0296, TryCatch #12 {all -> 0x0296, blocks: (B:161:0x027f, B:163:0x0286, B:165:0x028d, B:167:0x0291, B:169:0x0295, B:172:0x0298, B:173:0x029d, B:174:0x029e, B:175:0x02a5, B:176:0x02a6, B:177:0x02ad, B:178:0x02ae), top: B:203:0x027f }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0298 A[Catch: all -> 0x0296, TryCatch #12 {all -> 0x0296, blocks: (B:161:0x027f, B:163:0x0286, B:165:0x028d, B:167:0x0291, B:169:0x0295, B:172:0x0298, B:173:0x029d, B:174:0x029e, B:175:0x02a5, B:176:0x02a6, B:177:0x02ad, B:178:0x02ae), top: B:203:0x027f }] */
    /* JADX WARN: Code duplicated, block: B:174:0x029e A[Catch: all -> 0x0296, TryCatch #12 {all -> 0x0296, blocks: (B:161:0x027f, B:163:0x0286, B:165:0x028d, B:167:0x0291, B:169:0x0295, B:172:0x0298, B:173:0x029d, B:174:0x029e, B:175:0x02a5, B:176:0x02a6, B:177:0x02ad, B:178:0x02ae), top: B:203:0x027f }] */
    /* JADX WARN: Code duplicated, block: B:176:0x02a6 A[Catch: all -> 0x0296, TryCatch #12 {all -> 0x0296, blocks: (B:161:0x027f, B:163:0x0286, B:165:0x028d, B:167:0x0291, B:169:0x0295, B:172:0x0298, B:173:0x029d, B:174:0x029e, B:175:0x02a5, B:176:0x02a6, B:177:0x02ad, B:178:0x02ae), top: B:203:0x027f }] */
    /* JADX WARN: Code duplicated, block: B:178:0x02ae A[Catch: all -> 0x0296, TRY_LEAVE, TryCatch #12 {all -> 0x0296, blocks: (B:161:0x027f, B:163:0x0286, B:165:0x028d, B:167:0x0291, B:169:0x0295, B:172:0x0298, B:173:0x029d, B:174:0x029e, B:175:0x02a5, B:176:0x02a6, B:177:0x02ad, B:178:0x02ae), top: B:203:0x027f }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0138 A[Catch: all -> 0x0149, TryCatch #5 {all -> 0x0149, blocks: (B:46:0x00b5, B:59:0x0132, B:61:0x0138, B:66:0x014c, B:68:0x0150), top: B:192:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0147  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c A[Catch: all -> 0x0149, TryCatch #5 {all -> 0x0149, blocks: (B:46:0x00b5, B:59:0x0132, B:61:0x0138, B:66:0x014c, B:68:0x0150), top: B:192:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0150 A[Catch: all -> 0x0149, TRY_LEAVE, TryCatch #5 {all -> 0x0149, blocks: (B:46:0x00b5, B:59:0x0132, B:61:0x0138, B:66:0x014c, B:68:0x0150), top: B:192:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0161 A[Catch: all -> 0x00a7, PHI: r2 r3 r13
  0x0161: PHI (r2v17 ads_mobile_sdk.w03) = (r2v54 ads_mobile_sdk.w03), (r2v55 ads_mobile_sdk.w03), (r2v56 ads_mobile_sdk.w03), (r2v57 ads_mobile_sdk.w03) binds: [B:67:0x014e, B:69:0x015d, B:62:0x0145, B:41:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x0161: PHI (r3v6 ads_mobile_sdk.iv) = (r3v3 ads_mobile_sdk.iv), (r3v3 ads_mobile_sdk.iv), (r3v3 ads_mobile_sdk.iv), (r3v9 ads_mobile_sdk.iv) binds: [B:67:0x014e, B:69:0x015d, B:62:0x0145, B:41:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x0161: PHI (r13v13 java.io.Closeable) = (r13v64 java.io.Closeable), (r13v65 java.io.Closeable), (r13v66 java.io.Closeable), (r13v67 java.io.Closeable) binds: [B:67:0x014e, B:69:0x015d, B:62:0x0145, B:41:0x00a2] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00a7, blocks: (B:41:0x00a2, B:71:0x0161), top: B:190:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0175  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:82:0x0193  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b5 A[Catch: all -> 0x01c5, TryCatch #3 {all -> 0x01c5, blocks: (B:95:0x01ae, B:97:0x01b5, B:99:0x01bc, B:101:0x01c0, B:103:0x01c4, B:106:0x01c7, B:107:0x01cc, B:108:0x01cd, B:109:0x01d4, B:110:0x01d5, B:111:0x01dc, B:112:0x01dd), top: B:189:0x01ae }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01bc A[Catch: all -> 0x01c5, TryCatch #3 {all -> 0x01c5, blocks: (B:95:0x01ae, B:97:0x01b5, B:99:0x01bc, B:101:0x01c0, B:103:0x01c4, B:106:0x01c7, B:107:0x01cc, B:108:0x01cd, B:109:0x01d4, B:110:0x01d5, B:111:0x01dc, B:112:0x01dd), top: B:189:0x01ae }] */
    public static final Object a(iv ivVar, wretchedly.dern dernVar) {
        gv gvVar;
        ri2 ri2Var;
        no0 no0Var;
        List listFormularize;
        l13 l13Var;
        w03 w03VarA;
        TimeoutCancellationException th;
        Closeable closeable;
        Object objE;
        iv ivVar2;
        w03 w03Var;
        v62 v62VarA;
        TimeoutCancellationException th2;
        Closeable closeable2;
        Object objE2;
        iv ivVar3;
        w03 w03Var2;
        Closeable closeable3;
        spartacist spartacistVar;
        Closeable closeable4;
        w03 w03Var3;
        w03 w03Var4;
        formularization.attabal attabalVar;
        iv ivVar4;
        w03 w03Var5;
        Closeable closeable5;
        formularization.attabal attabalVar2;
        w03 w03Var6;
        Closeable closeable6;
        spartacist spartacistVar2;
        Closeable closeable7;
        w03 w03Var7;
        w03 w03Var8;
        iv ivVar5;
        formularization.attabal attabalVar3;
        w03 w03Var9;
        Closeable closeable8;
        formularization.attabal attabalVar4;
        w03 w03Var10;
        ivVar.getClass();
        if (dernVar instanceof gv) {
            gvVar = (gv) dernVar;
            int i = gvVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                gvVar.g = i - Integer.MIN_VALUE;
            } else {
                gvVar = new gv(ivVar, dernVar);
            }
        } else {
            gvVar = new gv(ivVar, dernVar);
        }
        Object obj = gvVar.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        switch (gvVar.g) {
            case 0:
                p002kotlin.dern.saneness(obj);
                derbyshire derbyshireVar = ivVar.h.r;
                derbyshireVar.getClass();
                p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                long rawValue = ((p002kotlin.time.saneness) derbyshireVar.a("gads:consent_update_delay", juju.attabal(5, DurationUnit.SECONDS, "gads:consent_update_delay", X3.i.W), zk.l)).getRawValue();
                gvVar.a = ivVar;
                gvVar.g = 1;
                if (splinterproof.saneness(rawValue, gvVar) != objBeachfront) {
                    ri2Var = ivVar.q;
                    no0Var = no0.CUI_NAME_CONSENT_UPDATE_FOR_CSRB;
                    listFormularize = p002kotlin.collections.adultoid.formularize();
                    l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
                    if (j13.b().a == null) {
                        v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                        try {
                            gvVar.a = ivVar;
                            gvVar.b = v62VarA;
                            gvVar.c = v62VarA;
                            gvVar.g = 2;
                            objE2 = e(ivVar, gvVar);
                            if (objE2 != objBeachfront) {
                                ivVar3 = ivVar;
                                v62 v62Var = v62VarA;
                                obj = objE2;
                                w03Var2 = v62Var;
                                closeable3 = v62Var;
                                spartacistVar = (spartacist) obj;
                                if (spartacistVar instanceof tn0) {
                                    gvVar.a = ivVar3;
                                    gvVar.b = w03Var2;
                                    gvVar.c = closeable3;
                                    gvVar.g = 3;
                                    if (ivVar3.u(gvVar) == objBeachfront) {
                                        w03Var3 = w03Var2;
                                        closeable4 = closeable3;
                                    } else {
                                        w03Var3 = w03Var2;
                                        closeable4 = closeable3;
                                        w03Var3 = w03Var2;
                                        closeable4 = closeable3;
                                        w03Var3 = w03Var2;
                                        closeable4 = closeable3;
                                        w03Var3 = w03Var2;
                                        closeable4 = closeable3;
                                        attabalVar = ivVar3.F;
                                        gvVar.a = ivVar3;
                                        gvVar.b = w03Var3;
                                        gvVar.c = closeable4;
                                        gvVar.d = attabalVar;
                                        gvVar.g = 5;
                                        if (attabalVar.attabal(null, gvVar) != objBeachfront) {
                                            ivVar4 = ivVar3;
                                            w03Var5 = w03Var3;
                                            closeable5 = closeable4;
                                            attabalVar2 = attabalVar;
                                            try {
                                                ivVar4.H = false;
                                                Unit unit = Unit.f29295attabal;
                                                attabalVar2.wireman(null);
                                                gvVar.a = w03Var5;
                                                try {
                                                    gvVar.b = closeable5;
                                                    gvVar.c = null;
                                                    gvVar.d = null;
                                                    gvVar.g = 6;
                                                    if (ivVar4.i(gvVar) != objBeachfront) {
                                                        closeable4 = closeable5;
                                                        w03Var4 = w03Var5;
                                                        Unit unit2 = Unit.f29295attabal;
                                                        interaction.saneness.attabal(closeable4, null);
                                                        return Unit.f29295attabal;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    th2 = th;
                                                    closeable2 = closeable5;
                                                    w03Var6 = w03Var5;
                                                    try {
                                                        w03Var6.b(th2);
                                                        if (!(th2 instanceof evenfall)) {
                                                            w03Var6.a(th2);
                                                            if (!(th2 instanceof TimeoutCancellationException)) {
                                                                if (!(th2 instanceof CancellationException)) {
                                                                    if (th2 instanceof yn0) {
                                                                        throw th2;
                                                                    }
                                                                    throw new gn0(th2);
                                                                }
                                                                throw new bn0(th2);
                                                            }
                                                            throw new cp0(th2);
                                                        }
                                                        throw th2;
                                                    } catch (Throwable th4) {
                                                        try {
                                                            throw th4;
                                                        } catch (Throwable th5) {
                                                            interaction.saneness.attabal(closeable2, th4);
                                                            throw th5;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th6) {
                                                attabalVar2.wireman(null);
                                                throw th6;
                                            }
                                        }
                                    }
                                } else if (spartacistVar instanceof nn0) {
                                    gvVar.a = ivVar3;
                                    gvVar.b = w03Var2;
                                    gvVar.c = closeable3;
                                    gvVar.g = 4;
                                    if (ivVar3.v(gvVar) != objBeachfront) {
                                        w03Var3 = w03Var2;
                                        closeable4 = closeable3;
                                        w03Var3 = w03Var2;
                                        closeable4 = closeable3;
                                        w03Var3 = w03Var2;
                                        closeable4 = closeable3;
                                        w03Var3 = w03Var2;
                                        closeable4 = closeable3;
                                        attabalVar = ivVar3.F;
                                        gvVar.a = ivVar3;
                                        gvVar.b = w03Var3;
                                        gvVar.c = closeable4;
                                        gvVar.d = attabalVar;
                                        gvVar.g = 5;
                                        if (attabalVar.attabal(null, gvVar) != objBeachfront) {
                                            ivVar4 = ivVar3;
                                            w03Var5 = w03Var3;
                                            closeable5 = closeable4;
                                            attabalVar2 = attabalVar;
                                            ivVar4.H = false;
                                            Unit unit3 = Unit.f29295attabal;
                                            attabalVar2.wireman(null);
                                            gvVar.a = w03Var5;
                                            gvVar.b = closeable5;
                                            gvVar.c = null;
                                            gvVar.d = null;
                                            gvVar.g = 6;
                                            if (ivVar4.i(gvVar) != objBeachfront) {
                                                closeable4 = closeable5;
                                                w03Var4 = w03Var5;
                                                Unit unit4 = Unit.f29295attabal;
                                                interaction.saneness.attabal(closeable4, null);
                                                return Unit.f29295attabal;
                                            }
                                        }
                                    }
                                } else {
                                    w03Var3 = w03Var2;
                                    closeable4 = closeable3;
                                    w03Var3 = w03Var2;
                                    closeable4 = closeable3;
                                    w03Var3 = w03Var2;
                                    closeable4 = closeable3;
                                    w03Var3 = w03Var2;
                                    closeable4 = closeable3;
                                    attabalVar = ivVar3.F;
                                    gvVar.a = ivVar3;
                                    gvVar.b = w03Var3;
                                    gvVar.c = closeable4;
                                    gvVar.d = attabalVar;
                                    gvVar.g = 5;
                                    if (attabalVar.attabal(null, gvVar) != objBeachfront) {
                                        ivVar4 = ivVar3;
                                        w03Var5 = w03Var3;
                                        closeable5 = closeable4;
                                        attabalVar2 = attabalVar;
                                        ivVar4.H = false;
                                        Unit unit5 = Unit.f29295attabal;
                                        attabalVar2.wireman(null);
                                        gvVar.a = w03Var5;
                                        gvVar.b = closeable5;
                                        gvVar.c = null;
                                        gvVar.d = null;
                                        gvVar.g = 6;
                                        if (ivVar4.i(gvVar) != objBeachfront) {
                                            closeable4 = closeable5;
                                            w03Var4 = w03Var5;
                                            Unit unit6 = Unit.f29295attabal;
                                            interaction.saneness.attabal(closeable4, null);
                                            return Unit.f29295attabal;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th7) {
                            v62 v62Var2 = v62VarA;
                            th2 = th7;
                            closeable2 = v62Var2;
                            w03Var6 = v62Var2;
                            w03Var6.b(th2);
                            if (!(th2 instanceof evenfall)) {
                                w03Var6.a(th2);
                                if (!(th2 instanceof TimeoutCancellationException)) {
                                    if (!(th2 instanceof CancellationException)) {
                                        if (th2 instanceof yn0) {
                                            throw th2;
                                        }
                                        throw new gn0(th2);
                                    }
                                    throw new bn0(th2);
                                }
                                throw new cp0(th2);
                            }
                            throw th2;
                        }
                    } else {
                        w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
                        try {
                            gvVar.a = ivVar;
                            gvVar.b = w03VarA;
                            gvVar.c = w03VarA;
                            gvVar.g = 7;
                            objE = e(ivVar, gvVar);
                            if (objE != objBeachfront) {
                                ivVar2 = ivVar;
                                w03 w03Var11 = w03VarA;
                                obj = objE;
                                w03Var = w03Var11;
                                closeable6 = w03Var11;
                                spartacistVar2 = (spartacist) obj;
                                if (spartacistVar2 instanceof tn0) {
                                    gvVar.a = ivVar2;
                                    gvVar.b = w03Var;
                                    gvVar.c = closeable6;
                                    gvVar.g = 8;
                                    if (ivVar2.u(gvVar) == objBeachfront) {
                                        w03Var7 = w03Var;
                                        closeable7 = closeable6;
                                    } else {
                                        w03Var7 = w03Var;
                                        closeable7 = closeable6;
                                        w03Var7 = w03Var;
                                        closeable7 = closeable6;
                                        w03Var7 = w03Var;
                                        closeable7 = closeable6;
                                        w03Var7 = w03Var;
                                        closeable7 = closeable6;
                                        ivVar5 = ivVar2;
                                        attabalVar3 = ivVar5.F;
                                        gvVar.a = ivVar5;
                                        gvVar.b = w03Var7;
                                        gvVar.c = closeable7;
                                        gvVar.d = attabalVar3;
                                        gvVar.g = 10;
                                        if (attabalVar3.attabal(null, gvVar) != objBeachfront) {
                                            w03Var9 = w03Var7;
                                            closeable8 = closeable7;
                                            attabalVar4 = attabalVar3;
                                            try {
                                                ivVar5.H = false;
                                                Unit unit7 = Unit.f29295attabal;
                                                attabalVar4.wireman(null);
                                                gvVar.a = w03Var9;
                                                try {
                                                    gvVar.b = closeable8;
                                                    gvVar.c = null;
                                                    gvVar.d = null;
                                                    gvVar.g = 11;
                                                    if (ivVar5.i(gvVar) != objBeachfront) {
                                                        closeable7 = closeable8;
                                                        w03Var8 = w03Var9;
                                                        Unit unit8 = Unit.f29295attabal;
                                                        interaction.saneness.attabal(closeable7, null);
                                                        return Unit.f29295attabal;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    th = th;
                                                    closeable = closeable8;
                                                    w03Var10 = w03Var9;
                                                    try {
                                                        w03Var10.b(th);
                                                        if (!(th instanceof evenfall)) {
                                                            w03Var10.a(th);
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
                                                    } catch (Throwable th9) {
                                                        try {
                                                            throw th9;
                                                        } catch (Throwable th10) {
                                                            interaction.saneness.attabal(closeable, th9);
                                                            throw th10;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th11) {
                                                attabalVar4.wireman(null);
                                                throw th11;
                                            }
                                        }
                                    }
                                } else if (spartacistVar2 instanceof nn0) {
                                    gvVar.a = ivVar2;
                                    gvVar.b = w03Var;
                                    gvVar.c = closeable6;
                                    gvVar.g = 9;
                                    if (ivVar2.v(gvVar) != objBeachfront) {
                                        w03Var7 = w03Var;
                                        closeable7 = closeable6;
                                        w03Var7 = w03Var;
                                        closeable7 = closeable6;
                                        w03Var7 = w03Var;
                                        closeable7 = closeable6;
                                        w03Var7 = w03Var;
                                        closeable7 = closeable6;
                                        ivVar5 = ivVar2;
                                        attabalVar3 = ivVar5.F;
                                        gvVar.a = ivVar5;
                                        gvVar.b = w03Var7;
                                        gvVar.c = closeable7;
                                        gvVar.d = attabalVar3;
                                        gvVar.g = 10;
                                        if (attabalVar3.attabal(null, gvVar) != objBeachfront) {
                                            w03Var9 = w03Var7;
                                            closeable8 = closeable7;
                                            attabalVar4 = attabalVar3;
                                            ivVar5.H = false;
                                            Unit unit9 = Unit.f29295attabal;
                                            attabalVar4.wireman(null);
                                            gvVar.a = w03Var9;
                                            gvVar.b = closeable8;
                                            gvVar.c = null;
                                            gvVar.d = null;
                                            gvVar.g = 11;
                                            if (ivVar5.i(gvVar) != objBeachfront) {
                                                closeable7 = closeable8;
                                                w03Var8 = w03Var9;
                                                Unit unit10 = Unit.f29295attabal;
                                                interaction.saneness.attabal(closeable7, null);
                                                return Unit.f29295attabal;
                                            }
                                        }
                                    }
                                } else {
                                    w03Var7 = w03Var;
                                    closeable7 = closeable6;
                                    w03Var7 = w03Var;
                                    closeable7 = closeable6;
                                    w03Var7 = w03Var;
                                    closeable7 = closeable6;
                                    w03Var7 = w03Var;
                                    closeable7 = closeable6;
                                    ivVar5 = ivVar2;
                                    attabalVar3 = ivVar5.F;
                                    gvVar.a = ivVar5;
                                    gvVar.b = w03Var7;
                                    gvVar.c = closeable7;
                                    gvVar.d = attabalVar3;
                                    gvVar.g = 10;
                                    if (attabalVar3.attabal(null, gvVar) != objBeachfront) {
                                        w03Var9 = w03Var7;
                                        closeable8 = closeable7;
                                        attabalVar4 = attabalVar3;
                                        ivVar5.H = false;
                                        Unit unit11 = Unit.f29295attabal;
                                        attabalVar4.wireman(null);
                                        gvVar.a = w03Var9;
                                        gvVar.b = closeable8;
                                        gvVar.c = null;
                                        gvVar.d = null;
                                        gvVar.g = 11;
                                        if (ivVar5.i(gvVar) != objBeachfront) {
                                            closeable7 = closeable8;
                                            w03Var8 = w03Var9;
                                            Unit unit12 = Unit.f29295attabal;
                                            interaction.saneness.attabal(closeable7, null);
                                            return Unit.f29295attabal;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th12) {
                            w03 w03Var12 = w03VarA;
                            th = th12;
                            closeable = w03Var12;
                            w03Var10 = w03Var12;
                            w03Var10.b(th);
                            if (!(th instanceof evenfall)) {
                                w03Var10.a(th);
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
                    }
                }
                w03Var3 = w03Var2;
                closeable4 = closeable3;
                w03Var3 = w03Var2;
                closeable4 = closeable3;
                w03Var7 = w03Var;
                closeable7 = closeable6;
                w03Var7 = w03Var;
                closeable7 = closeable6;
                return objBeachfront;
            case 1:
                ivVar = (iv) gvVar.a;
                p002kotlin.dern.saneness(obj);
                ri2Var = ivVar.q;
                no0Var = no0.CUI_NAME_CONSENT_UPDATE_FOR_CSRB;
                listFormularize = p002kotlin.collections.adultoid.formularize();
                l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
                if (j13.b().a == null) {
                    v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                    gvVar.a = ivVar;
                    gvVar.b = v62VarA;
                    gvVar.c = v62VarA;
                    gvVar.g = 2;
                    objE2 = e(ivVar, gvVar);
                    if (objE2 != objBeachfront) {
                        ivVar3 = ivVar;
                        v62 v62Var3 = v62VarA;
                        obj = objE2;
                        w03Var2 = v62Var3;
                        closeable3 = v62Var3;
                        spartacistVar = (spartacist) obj;
                        if (spartacistVar instanceof tn0) {
                            gvVar.a = ivVar3;
                            gvVar.b = w03Var2;
                            gvVar.c = closeable3;
                            gvVar.g = 3;
                            if (ivVar3.u(gvVar) == objBeachfront) {
                                w03Var3 = w03Var2;
                                closeable4 = closeable3;
                            } else {
                                w03Var3 = w03Var2;
                                closeable4 = closeable3;
                                w03Var3 = w03Var2;
                                closeable4 = closeable3;
                                w03Var3 = w03Var2;
                                closeable4 = closeable3;
                                w03Var3 = w03Var2;
                                closeable4 = closeable3;
                                attabalVar = ivVar3.F;
                                gvVar.a = ivVar3;
                                gvVar.b = w03Var3;
                                gvVar.c = closeable4;
                                gvVar.d = attabalVar;
                                gvVar.g = 5;
                                if (attabalVar.attabal(null, gvVar) != objBeachfront) {
                                    ivVar4 = ivVar3;
                                    w03Var5 = w03Var3;
                                    closeable5 = closeable4;
                                    attabalVar2 = attabalVar;
                                    ivVar4.H = false;
                                    Unit unit13 = Unit.f29295attabal;
                                    attabalVar2.wireman(null);
                                    gvVar.a = w03Var5;
                                    gvVar.b = closeable5;
                                    gvVar.c = null;
                                    gvVar.d = null;
                                    gvVar.g = 6;
                                    if (ivVar4.i(gvVar) != objBeachfront) {
                                        closeable4 = closeable5;
                                        w03Var4 = w03Var5;
                                        Unit unit14 = Unit.f29295attabal;
                                        interaction.saneness.attabal(closeable4, null);
                                        return Unit.f29295attabal;
                                    }
                                }
                            }
                        } else if (spartacistVar instanceof nn0) {
                            gvVar.a = ivVar3;
                            gvVar.b = w03Var2;
                            gvVar.c = closeable3;
                            gvVar.g = 4;
                            if (ivVar3.v(gvVar) != objBeachfront) {
                                w03Var3 = w03Var2;
                                closeable4 = closeable3;
                                w03Var3 = w03Var2;
                                closeable4 = closeable3;
                                w03Var3 = w03Var2;
                                closeable4 = closeable3;
                                w03Var3 = w03Var2;
                                closeable4 = closeable3;
                                attabalVar = ivVar3.F;
                                gvVar.a = ivVar3;
                                gvVar.b = w03Var3;
                                gvVar.c = closeable4;
                                gvVar.d = attabalVar;
                                gvVar.g = 5;
                                if (attabalVar.attabal(null, gvVar) != objBeachfront) {
                                    ivVar4 = ivVar3;
                                    w03Var5 = w03Var3;
                                    closeable5 = closeable4;
                                    attabalVar2 = attabalVar;
                                    ivVar4.H = false;
                                    Unit unit15 = Unit.f29295attabal;
                                    attabalVar2.wireman(null);
                                    gvVar.a = w03Var5;
                                    gvVar.b = closeable5;
                                    gvVar.c = null;
                                    gvVar.d = null;
                                    gvVar.g = 6;
                                    if (ivVar4.i(gvVar) != objBeachfront) {
                                        closeable4 = closeable5;
                                        w03Var4 = w03Var5;
                                        Unit unit16 = Unit.f29295attabal;
                                        interaction.saneness.attabal(closeable4, null);
                                        return Unit.f29295attabal;
                                    }
                                }
                            }
                        } else {
                            w03Var3 = w03Var2;
                            closeable4 = closeable3;
                            w03Var3 = w03Var2;
                            closeable4 = closeable3;
                            w03Var3 = w03Var2;
                            closeable4 = closeable3;
                            w03Var3 = w03Var2;
                            closeable4 = closeable3;
                            attabalVar = ivVar3.F;
                            gvVar.a = ivVar3;
                            gvVar.b = w03Var3;
                            gvVar.c = closeable4;
                            gvVar.d = attabalVar;
                            gvVar.g = 5;
                            if (attabalVar.attabal(null, gvVar) != objBeachfront) {
                                ivVar4 = ivVar3;
                                w03Var5 = w03Var3;
                                closeable5 = closeable4;
                                attabalVar2 = attabalVar;
                                ivVar4.H = false;
                                Unit unit17 = Unit.f29295attabal;
                                attabalVar2.wireman(null);
                                gvVar.a = w03Var5;
                                gvVar.b = closeable5;
                                gvVar.c = null;
                                gvVar.d = null;
                                gvVar.g = 6;
                                if (ivVar4.i(gvVar) != objBeachfront) {
                                    closeable4 = closeable5;
                                    w03Var4 = w03Var5;
                                    Unit unit18 = Unit.f29295attabal;
                                    interaction.saneness.attabal(closeable4, null);
                                    return Unit.f29295attabal;
                                }
                            }
                        }
                    }
                } else {
                    w03VarA = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
                    gvVar.a = ivVar;
                    gvVar.b = w03VarA;
                    gvVar.c = w03VarA;
                    gvVar.g = 7;
                    objE = e(ivVar, gvVar);
                    if (objE != objBeachfront) {
                        ivVar2 = ivVar;
                        w03 w03Var13 = w03VarA;
                        obj = objE;
                        w03Var = w03Var13;
                        closeable6 = w03Var13;
                        spartacistVar2 = (spartacist) obj;
                        if (spartacistVar2 instanceof tn0) {
                            gvVar.a = ivVar2;
                            gvVar.b = w03Var;
                            gvVar.c = closeable6;
                            gvVar.g = 8;
                            if (ivVar2.u(gvVar) == objBeachfront) {
                                w03Var7 = w03Var;
                                closeable7 = closeable6;
                            } else {
                                w03Var7 = w03Var;
                                closeable7 = closeable6;
                                w03Var7 = w03Var;
                                closeable7 = closeable6;
                                w03Var7 = w03Var;
                                closeable7 = closeable6;
                                w03Var7 = w03Var;
                                closeable7 = closeable6;
                                ivVar5 = ivVar2;
                                attabalVar3 = ivVar5.F;
                                gvVar.a = ivVar5;
                                gvVar.b = w03Var7;
                                gvVar.c = closeable7;
                                gvVar.d = attabalVar3;
                                gvVar.g = 10;
                                if (attabalVar3.attabal(null, gvVar) != objBeachfront) {
                                    w03Var9 = w03Var7;
                                    closeable8 = closeable7;
                                    attabalVar4 = attabalVar3;
                                    ivVar5.H = false;
                                    Unit unit19 = Unit.f29295attabal;
                                    attabalVar4.wireman(null);
                                    gvVar.a = w03Var9;
                                    gvVar.b = closeable8;
                                    gvVar.c = null;
                                    gvVar.d = null;
                                    gvVar.g = 11;
                                    if (ivVar5.i(gvVar) != objBeachfront) {
                                        closeable7 = closeable8;
                                        w03Var8 = w03Var9;
                                        Unit unit110 = Unit.f29295attabal;
                                        interaction.saneness.attabal(closeable7, null);
                                        return Unit.f29295attabal;
                                    }
                                }
                            }
                        } else if (spartacistVar2 instanceof nn0) {
                            gvVar.a = ivVar2;
                            gvVar.b = w03Var;
                            gvVar.c = closeable6;
                            gvVar.g = 9;
                            if (ivVar2.v(gvVar) != objBeachfront) {
                                w03Var7 = w03Var;
                                closeable7 = closeable6;
                                w03Var7 = w03Var;
                                closeable7 = closeable6;
                                w03Var7 = w03Var;
                                closeable7 = closeable6;
                                w03Var7 = w03Var;
                                closeable7 = closeable6;
                                ivVar5 = ivVar2;
                                attabalVar3 = ivVar5.F;
                                gvVar.a = ivVar5;
                                gvVar.b = w03Var7;
                                gvVar.c = closeable7;
                                gvVar.d = attabalVar3;
                                gvVar.g = 10;
                                if (attabalVar3.attabal(null, gvVar) != objBeachfront) {
                                    w03Var9 = w03Var7;
                                    closeable8 = closeable7;
                                    attabalVar4 = attabalVar3;
                                    ivVar5.H = false;
                                    Unit unit111 = Unit.f29295attabal;
                                    attabalVar4.wireman(null);
                                    gvVar.a = w03Var9;
                                    gvVar.b = closeable8;
                                    gvVar.c = null;
                                    gvVar.d = null;
                                    gvVar.g = 11;
                                    if (ivVar5.i(gvVar) != objBeachfront) {
                                        closeable7 = closeable8;
                                        w03Var8 = w03Var9;
                                        Unit unit112 = Unit.f29295attabal;
                                        interaction.saneness.attabal(closeable7, null);
                                        return Unit.f29295attabal;
                                    }
                                }
                            }
                        } else {
                            w03Var7 = w03Var;
                            closeable7 = closeable6;
                            w03Var7 = w03Var;
                            closeable7 = closeable6;
                            w03Var7 = w03Var;
                            closeable7 = closeable6;
                            w03Var7 = w03Var;
                            closeable7 = closeable6;
                            ivVar5 = ivVar2;
                            attabalVar3 = ivVar5.F;
                            gvVar.a = ivVar5;
                            gvVar.b = w03Var7;
                            gvVar.c = closeable7;
                            gvVar.d = attabalVar3;
                            gvVar.g = 10;
                            if (attabalVar3.attabal(null, gvVar) != objBeachfront) {
                                w03Var9 = w03Var7;
                                closeable8 = closeable7;
                                attabalVar4 = attabalVar3;
                                ivVar5.H = false;
                                Unit unit113 = Unit.f29295attabal;
                                attabalVar4.wireman(null);
                                gvVar.a = w03Var9;
                                gvVar.b = closeable8;
                                gvVar.c = null;
                                gvVar.d = null;
                                gvVar.g = 11;
                                if (ivVar5.i(gvVar) != objBeachfront) {
                                    closeable7 = closeable8;
                                    w03Var8 = w03Var9;
                                    Unit unit114 = Unit.f29295attabal;
                                    interaction.saneness.attabal(closeable7, null);
                                    return Unit.f29295attabal;
                                }
                            }
                        }
                    }
                }
                w03Var3 = w03Var2;
                closeable4 = closeable3;
                w03Var3 = w03Var2;
                closeable4 = closeable3;
                w03Var7 = w03Var;
                closeable7 = closeable6;
                w03Var7 = w03Var;
                closeable7 = closeable6;
                return objBeachfront;
            case 2:
                Closeable closeable9 = gvVar.c;
                w03 w03Var14 = (w03) gvVar.b;
                ivVar3 = (iv) gvVar.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    w03Var2 = w03Var14;
                    closeable3 = closeable9;
                    spartacistVar = (spartacist) obj;
                    if (spartacistVar instanceof tn0) {
                        gvVar.a = ivVar3;
                        gvVar.b = w03Var2;
                        gvVar.c = closeable3;
                        gvVar.g = 3;
                        if (ivVar3.u(gvVar) == objBeachfront) {
                            w03Var3 = w03Var2;
                            closeable4 = closeable3;
                        } else {
                            w03Var3 = w03Var2;
                            closeable4 = closeable3;
                            w03Var3 = w03Var2;
                            closeable4 = closeable3;
                            w03Var3 = w03Var2;
                            closeable4 = closeable3;
                            w03Var3 = w03Var2;
                            closeable4 = closeable3;
                            attabalVar = ivVar3.F;
                            gvVar.a = ivVar3;
                            gvVar.b = w03Var3;
                            gvVar.c = closeable4;
                            gvVar.d = attabalVar;
                            gvVar.g = 5;
                            if (attabalVar.attabal(null, gvVar) != objBeachfront) {
                                ivVar4 = ivVar3;
                                w03Var5 = w03Var3;
                                closeable5 = closeable4;
                                attabalVar2 = attabalVar;
                                ivVar4.H = false;
                                Unit unit115 = Unit.f29295attabal;
                                attabalVar2.wireman(null);
                                gvVar.a = w03Var5;
                                gvVar.b = closeable5;
                                gvVar.c = null;
                                gvVar.d = null;
                                gvVar.g = 6;
                                if (ivVar4.i(gvVar) != objBeachfront) {
                                    closeable4 = closeable5;
                                    w03Var4 = w03Var5;
                                    Unit unit116 = Unit.f29295attabal;
                                    interaction.saneness.attabal(closeable4, null);
                                    return Unit.f29295attabal;
                                }
                            }
                        }
                    } else if (spartacistVar instanceof nn0) {
                        gvVar.a = ivVar3;
                        gvVar.b = w03Var2;
                        gvVar.c = closeable3;
                        gvVar.g = 4;
                        if (ivVar3.v(gvVar) != objBeachfront) {
                            w03Var3 = w03Var2;
                            closeable4 = closeable3;
                            w03Var3 = w03Var2;
                            closeable4 = closeable3;
                            w03Var3 = w03Var2;
                            closeable4 = closeable3;
                            w03Var3 = w03Var2;
                            closeable4 = closeable3;
                            attabalVar = ivVar3.F;
                            gvVar.a = ivVar3;
                            gvVar.b = w03Var3;
                            gvVar.c = closeable4;
                            gvVar.d = attabalVar;
                            gvVar.g = 5;
                            if (attabalVar.attabal(null, gvVar) != objBeachfront) {
                                ivVar4 = ivVar3;
                                w03Var5 = w03Var3;
                                closeable5 = closeable4;
                                attabalVar2 = attabalVar;
                                ivVar4.H = false;
                                Unit unit117 = Unit.f29295attabal;
                                attabalVar2.wireman(null);
                                gvVar.a = w03Var5;
                                gvVar.b = closeable5;
                                gvVar.c = null;
                                gvVar.d = null;
                                gvVar.g = 6;
                                if (ivVar4.i(gvVar) != objBeachfront) {
                                    closeable4 = closeable5;
                                    w03Var4 = w03Var5;
                                    Unit unit118 = Unit.f29295attabal;
                                    interaction.saneness.attabal(closeable4, null);
                                    return Unit.f29295attabal;
                                }
                            }
                        }
                    } else {
                        w03Var3 = w03Var2;
                        closeable4 = closeable3;
                        w03Var3 = w03Var2;
                        closeable4 = closeable3;
                        w03Var3 = w03Var2;
                        closeable4 = closeable3;
                        w03Var3 = w03Var2;
                        closeable4 = closeable3;
                        attabalVar = ivVar3.F;
                        gvVar.a = ivVar3;
                        gvVar.b = w03Var3;
                        gvVar.c = closeable4;
                        gvVar.d = attabalVar;
                        gvVar.g = 5;
                        if (attabalVar.attabal(null, gvVar) != objBeachfront) {
                            ivVar4 = ivVar3;
                            w03Var5 = w03Var3;
                            closeable5 = closeable4;
                            attabalVar2 = attabalVar;
                            ivVar4.H = false;
                            Unit unit119 = Unit.f29295attabal;
                            attabalVar2.wireman(null);
                            gvVar.a = w03Var5;
                            gvVar.b = closeable5;
                            gvVar.c = null;
                            gvVar.d = null;
                            gvVar.g = 6;
                            if (ivVar4.i(gvVar) != objBeachfront) {
                                closeable4 = closeable5;
                                w03Var4 = w03Var5;
                                Unit unit1110 = Unit.f29295attabal;
                                interaction.saneness.attabal(closeable4, null);
                                return Unit.f29295attabal;
                            }
                        }
                    }
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    return objBeachfront;
                } catch (Throwable th13) {
                    th2 = th13;
                    w03Var6 = w03Var14;
                    closeable2 = closeable9;
                    w03Var6.b(th2);
                    if (!(th2 instanceof evenfall)) {
                        w03Var6.a(th2);
                        if (!(th2 instanceof TimeoutCancellationException)) {
                            if (!(th2 instanceof CancellationException)) {
                                if (th2 instanceof yn0) {
                                    throw th2;
                                }
                                throw new gn0(th2);
                            }
                            throw new bn0(th2);
                        }
                        throw new cp0(th2);
                    }
                    throw th2;
                }
            case 3:
            case 4:
                closeable4 = gvVar.c;
                w03Var3 = (w03) gvVar.b;
                ivVar3 = (iv) gvVar.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    w03Var3 = w03Var3;
                    closeable4 = closeable4;
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    attabalVar = ivVar3.F;
                    gvVar.a = ivVar3;
                    gvVar.b = w03Var3;
                    gvVar.c = closeable4;
                    gvVar.d = attabalVar;
                    gvVar.g = 5;
                    if (attabalVar.attabal(null, gvVar) != objBeachfront) {
                        ivVar4 = ivVar3;
                        w03Var5 = w03Var3;
                        closeable5 = closeable4;
                        attabalVar2 = attabalVar;
                        ivVar4.H = false;
                        Unit unit1111 = Unit.f29295attabal;
                        attabalVar2.wireman(null);
                        gvVar.a = w03Var5;
                        gvVar.b = closeable5;
                        gvVar.c = null;
                        gvVar.d = null;
                        gvVar.g = 6;
                        if (ivVar4.i(gvVar) != objBeachfront) {
                            closeable4 = closeable5;
                            w03Var4 = w03Var5;
                            Unit unit1112 = Unit.f29295attabal;
                            interaction.saneness.attabal(closeable4, null);
                            return Unit.f29295attabal;
                        }
                    }
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    return objBeachfront;
                } catch (Throwable th14) {
                    th2 = th14;
                    w03Var4 = w03Var3;
                    w03Var6 = w03Var4;
                    closeable2 = closeable4;
                    w03Var6.b(th2);
                    if (!(th2 instanceof evenfall)) {
                        w03Var6.a(th2);
                        if (!(th2 instanceof TimeoutCancellationException)) {
                            if (!(th2 instanceof CancellationException)) {
                                if (th2 instanceof yn0) {
                                    throw th2;
                                }
                                throw new gn0(th2);
                            }
                            throw new bn0(th2);
                        }
                        throw new cp0(th2);
                    }
                    throw th2;
                }
            case 5:
                attabalVar2 = gvVar.d;
                closeable5 = gvVar.c;
                w03Var5 = (w03) gvVar.b;
                ivVar4 = (iv) gvVar.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    closeable5 = closeable5;
                    w03Var5 = w03Var5;
                    ivVar4.H = false;
                    Unit unit1113 = Unit.f29295attabal;
                    attabalVar2.wireman(null);
                    gvVar.a = w03Var5;
                    gvVar.b = closeable5;
                    gvVar.c = null;
                    gvVar.d = null;
                    gvVar.g = 6;
                    if (ivVar4.i(gvVar) != objBeachfront) {
                        closeable4 = closeable5;
                        w03Var4 = w03Var5;
                        Unit unit1114 = Unit.f29295attabal;
                        interaction.saneness.attabal(closeable4, null);
                        return Unit.f29295attabal;
                    }
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    return objBeachfront;
                } catch (Throwable th15) {
                    th = th15;
                }
                break;
            case 6:
                closeable4 = gvVar.b;
                w03Var4 = (w03) gvVar.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    w03Var4 = w03Var4;
                    closeable4 = closeable4;
                    Unit unit1115 = Unit.f29295attabal;
                    interaction.saneness.attabal(closeable4, null);
                    return Unit.f29295attabal;
                } catch (Throwable th16) {
                    th2 = th16;
                    w03Var6 = w03Var4;
                    closeable2 = closeable4;
                    w03Var6.b(th2);
                    if (!(th2 instanceof evenfall)) {
                        w03Var6.a(th2);
                        if (!(th2 instanceof TimeoutCancellationException)) {
                            if (!(th2 instanceof CancellationException)) {
                                if (th2 instanceof yn0) {
                                    throw th2;
                                }
                                throw new gn0(th2);
                            }
                            throw new bn0(th2);
                        }
                        throw new cp0(th2);
                    }
                    throw th2;
                }
            case 7:
                Closeable closeable10 = gvVar.c;
                w03 w03Var15 = (w03) gvVar.b;
                ivVar2 = (iv) gvVar.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    w03Var = w03Var15;
                    closeable6 = closeable10;
                    spartacistVar2 = (spartacist) obj;
                    if (spartacistVar2 instanceof tn0) {
                        gvVar.a = ivVar2;
                        gvVar.b = w03Var;
                        gvVar.c = closeable6;
                        gvVar.g = 8;
                        if (ivVar2.u(gvVar) == objBeachfront) {
                            w03Var7 = w03Var;
                            closeable7 = closeable6;
                        } else {
                            w03Var7 = w03Var;
                            closeable7 = closeable6;
                            w03Var7 = w03Var;
                            closeable7 = closeable6;
                            w03Var7 = w03Var;
                            closeable7 = closeable6;
                            w03Var7 = w03Var;
                            closeable7 = closeable6;
                            ivVar5 = ivVar2;
                            attabalVar3 = ivVar5.F;
                            gvVar.a = ivVar5;
                            gvVar.b = w03Var7;
                            gvVar.c = closeable7;
                            gvVar.d = attabalVar3;
                            gvVar.g = 10;
                            if (attabalVar3.attabal(null, gvVar) != objBeachfront) {
                                w03Var9 = w03Var7;
                                closeable8 = closeable7;
                                attabalVar4 = attabalVar3;
                                ivVar5.H = false;
                                Unit unit1116 = Unit.f29295attabal;
                                attabalVar4.wireman(null);
                                gvVar.a = w03Var9;
                                gvVar.b = closeable8;
                                gvVar.c = null;
                                gvVar.d = null;
                                gvVar.g = 11;
                                if (ivVar5.i(gvVar) != objBeachfront) {
                                    closeable7 = closeable8;
                                    w03Var8 = w03Var9;
                                    Unit unit1117 = Unit.f29295attabal;
                                    interaction.saneness.attabal(closeable7, null);
                                    return Unit.f29295attabal;
                                }
                            }
                        }
                    } else if (spartacistVar2 instanceof nn0) {
                        gvVar.a = ivVar2;
                        gvVar.b = w03Var;
                        gvVar.c = closeable6;
                        gvVar.g = 9;
                        if (ivVar2.v(gvVar) != objBeachfront) {
                            w03Var7 = w03Var;
                            closeable7 = closeable6;
                            w03Var7 = w03Var;
                            closeable7 = closeable6;
                            w03Var7 = w03Var;
                            closeable7 = closeable6;
                            w03Var7 = w03Var;
                            closeable7 = closeable6;
                            ivVar5 = ivVar2;
                            attabalVar3 = ivVar5.F;
                            gvVar.a = ivVar5;
                            gvVar.b = w03Var7;
                            gvVar.c = closeable7;
                            gvVar.d = attabalVar3;
                            gvVar.g = 10;
                            if (attabalVar3.attabal(null, gvVar) != objBeachfront) {
                                w03Var9 = w03Var7;
                                closeable8 = closeable7;
                                attabalVar4 = attabalVar3;
                                ivVar5.H = false;
                                Unit unit1118 = Unit.f29295attabal;
                                attabalVar4.wireman(null);
                                gvVar.a = w03Var9;
                                gvVar.b = closeable8;
                                gvVar.c = null;
                                gvVar.d = null;
                                gvVar.g = 11;
                                if (ivVar5.i(gvVar) != objBeachfront) {
                                    closeable7 = closeable8;
                                    w03Var8 = w03Var9;
                                    Unit unit1119 = Unit.f29295attabal;
                                    interaction.saneness.attabal(closeable7, null);
                                    return Unit.f29295attabal;
                                }
                            }
                        }
                    } else {
                        w03Var7 = w03Var;
                        closeable7 = closeable6;
                        w03Var7 = w03Var;
                        closeable7 = closeable6;
                        w03Var7 = w03Var;
                        closeable7 = closeable6;
                        w03Var7 = w03Var;
                        closeable7 = closeable6;
                        ivVar5 = ivVar2;
                        attabalVar3 = ivVar5.F;
                        gvVar.a = ivVar5;
                        gvVar.b = w03Var7;
                        gvVar.c = closeable7;
                        gvVar.d = attabalVar3;
                        gvVar.g = 10;
                        if (attabalVar3.attabal(null, gvVar) != objBeachfront) {
                            w03Var9 = w03Var7;
                            closeable8 = closeable7;
                            attabalVar4 = attabalVar3;
                            ivVar5.H = false;
                            Unit unit11110 = Unit.f29295attabal;
                            attabalVar4.wireman(null);
                            gvVar.a = w03Var9;
                            gvVar.b = closeable8;
                            gvVar.c = null;
                            gvVar.d = null;
                            gvVar.g = 11;
                            if (ivVar5.i(gvVar) != objBeachfront) {
                                closeable7 = closeable8;
                                w03Var8 = w03Var9;
                                Unit unit11111 = Unit.f29295attabal;
                                interaction.saneness.attabal(closeable7, null);
                                return Unit.f29295attabal;
                            }
                        }
                    }
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    return objBeachfront;
                } catch (Throwable th17) {
                    th = th17;
                    w03Var10 = w03Var15;
                    closeable = closeable10;
                    w03Var10.b(th);
                    if (!(th instanceof evenfall)) {
                        w03Var10.a(th);
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
            case 8:
            case 9:
                closeable7 = gvVar.c;
                w03Var7 = (w03) gvVar.b;
                ivVar2 = (iv) gvVar.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    w03Var7 = w03Var7;
                    closeable7 = closeable7;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    ivVar5 = ivVar2;
                    attabalVar3 = ivVar5.F;
                    gvVar.a = ivVar5;
                    gvVar.b = w03Var7;
                    gvVar.c = closeable7;
                    gvVar.d = attabalVar3;
                    gvVar.g = 10;
                    if (attabalVar3.attabal(null, gvVar) != objBeachfront) {
                        w03Var9 = w03Var7;
                        closeable8 = closeable7;
                        attabalVar4 = attabalVar3;
                        ivVar5.H = false;
                        Unit unit11112 = Unit.f29295attabal;
                        attabalVar4.wireman(null);
                        gvVar.a = w03Var9;
                        gvVar.b = closeable8;
                        gvVar.c = null;
                        gvVar.d = null;
                        gvVar.g = 11;
                        if (ivVar5.i(gvVar) != objBeachfront) {
                            closeable7 = closeable8;
                            w03Var8 = w03Var9;
                            Unit unit11113 = Unit.f29295attabal;
                            interaction.saneness.attabal(closeable7, null);
                            return Unit.f29295attabal;
                        }
                    }
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    return objBeachfront;
                } catch (Throwable th18) {
                    th = th18;
                    w03Var8 = w03Var7;
                    w03Var10 = w03Var8;
                    closeable = closeable7;
                    w03Var10.b(th);
                    if (!(th instanceof evenfall)) {
                        w03Var10.a(th);
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
            case 10:
                attabalVar4 = gvVar.d;
                closeable8 = gvVar.c;
                w03Var9 = (w03) gvVar.b;
                ivVar5 = (iv) gvVar.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    closeable8 = closeable8;
                    w03Var9 = w03Var9;
                    ivVar5.H = false;
                    Unit unit11114 = Unit.f29295attabal;
                    attabalVar4.wireman(null);
                    gvVar.a = w03Var9;
                    gvVar.b = closeable8;
                    gvVar.c = null;
                    gvVar.d = null;
                    gvVar.g = 11;
                    if (ivVar5.i(gvVar) != objBeachfront) {
                        closeable7 = closeable8;
                        w03Var8 = w03Var9;
                        Unit unit11115 = Unit.f29295attabal;
                        interaction.saneness.attabal(closeable7, null);
                        return Unit.f29295attabal;
                    }
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    w03Var3 = w03Var2;
                    closeable4 = closeable3;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    w03Var7 = w03Var;
                    closeable7 = closeable6;
                    return objBeachfront;
                } catch (Throwable th19) {
                    th = th19;
                    th = th;
                    closeable = closeable8;
                    w03Var10 = w03Var9;
                    w03Var10.b(th);
                    if (!(th instanceof evenfall)) {
                        w03Var10.a(th);
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
            case 11:
                closeable7 = gvVar.b;
                w03Var8 = (w03) gvVar.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    w03Var8 = w03Var8;
                    closeable7 = closeable7;
                    Unit unit11116 = Unit.f29295attabal;
                    interaction.saneness.attabal(closeable7, null);
                    return Unit.f29295attabal;
                } catch (Throwable th20) {
                    th = th20;
                    w03Var10 = w03Var8;
                    closeable = closeable7;
                    w03Var10.b(th);
                    if (!(th instanceof evenfall)) {
                        w03Var10.a(th);
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
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        Set<String> setKeySet2 = bundle2.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet2, "keySet(...)");
        if (!setKeySet.containsAll(setKeySet2)) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                if (!a((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (!Intrinsics.wireman(obj, obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0108  */
    /* JADX WARN: Code duplicated, block: B:65:0x0110  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [ads_mobile_sdk.iv] */
    /* JADX WARN: Type inference failed for: r0v14, types: [ads_mobile_sdk.iv] */
    /* JADX WARN: Type inference failed for: r0v15, types: [ads_mobile_sdk.iv] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ads_mobile_sdk.st, wretchedly.dern] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
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
    public final Object a(JsonElement jsonElement, wretchedly.dern dernVar) {
        iv stVar;
        String asString;
        String str;
        String str2;
        String str3;
        formularization.attabal attabalVar;
        formularization.attabal attabalVar2;
        int i;
        formularization.attabal attabalVar3;
        boolean z;
        if (dernVar instanceof st) {
            st stVar2 = (st) dernVar;
            int i2 = stVar2.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stVar2.g = i2 - Integer.MIN_VALUE;
                stVar = stVar2;
            } else {
                stVar = new st(this, dernVar);
            }
        } else {
            stVar = new st(this, dernVar);
        }
        Object obj = stVar.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i3 = stVar.g;
        boolean z2 = true;
        try {
            if (i3 == 0) {
                p002kotlin.dern.saneness(obj);
                try {
                    JsonObject asJsonObject = jsonElement.getAsJsonObject();
                    asString = asJsonObject.get("consent_key").getAsString();
                    String asString2 = asJsonObject.get("consent_value_match").getAsString();
                    int asInt = asJsonObject.get("consent_value_type").getAsInt();
                    qv qvVar = qv.STRING;
                    if (asInt == 0) {
                        formularization.attabal attabalVar4 = this.w;
                        stVar.a = this;
                        stVar.b = asString;
                        stVar.c = asString2;
                        stVar.d = attabalVar4;
                        stVar.g = 1;
                        if (attabalVar4.attabal(null, stVar) != objBeachfront) {
                            stVar = this;
                            str3 = asString2;
                            attabalVar = attabalVar4;
                            boolean zWireman = Intrinsics.wireman(stVar.x.getString(asString), str3);
                            attabalVar.wireman(null);
                            z2 = zWireman;
                        }
                    } else if (asInt == 1) {
                        formularization.attabal attabalVar5 = this.w;
                        stVar.a = this;
                        stVar.b = asString;
                        stVar.c = asString2;
                        stVar.d = attabalVar5;
                        stVar.g = 2;
                        if (attabalVar5.attabal(null, stVar) != objBeachfront) {
                            stVar = this;
                            str2 = asString2;
                            attabalVar2 = attabalVar5;
                            i = stVar.x.getInt(asString, -1);
                            attabalVar2.wireman(null);
                            Intrinsics.beachfront(str2);
                            if (i == Integer.parseInt(str2)) {
                                z2 = false;
                            }
                        }
                    } else if (asInt == 2) {
                        formularization.attabal attabalVar6 = this.w;
                        stVar.a = this;
                        stVar.b = asString;
                        stVar.c = asString2;
                        stVar.d = attabalVar6;
                        stVar.g = 3;
                        if (attabalVar6.attabal(null, stVar) != objBeachfront) {
                            stVar = this;
                            str = asString2;
                            attabalVar3 = attabalVar6;
                            z = stVar.x.getBoolean(asString);
                            attabalVar3.wireman(null);
                            if (z == Boolean.parseBoolean(str)) {
                                z2 = false;
                            }
                        }
                    } else {
                        z2 = false;
                    }
                    return objBeachfront;
                } catch (Exception e) {
                    e = e;
                    stVar = this;
                    ((d13) stVar.f).a("Error while parsing JSON shared preference key match object", e);
                }
            } else if (i3 == 1) {
                formularization.attabal attabalVar7 = stVar.d;
                str3 = stVar.c;
                asString = stVar.b;
                iv ivVar = stVar.a;
                p002kotlin.dern.saneness(obj);
                stVar = ivVar;
                attabalVar = attabalVar7;
                try {
                    boolean zWireman2 = Intrinsics.wireman(stVar.x.getString(asString), str3);
                    attabalVar.wireman(null);
                    z2 = zWireman2;
                } catch (Throwable th) {
                    attabalVar.wireman(null);
                    throw th;
                }
            } else if (i3 == 2) {
                formularization.attabal attabalVar8 = stVar.d;
                str2 = stVar.c;
                asString = stVar.b;
                iv ivVar2 = stVar.a;
                p002kotlin.dern.saneness(obj);
                stVar = ivVar2;
                attabalVar2 = attabalVar8;
                try {
                    i = stVar.x.getInt(asString, -1);
                    attabalVar2.wireman(null);
                    Intrinsics.beachfront(str2);
                    if (i == Integer.parseInt(str2)) {
                        z2 = false;
                    }
                } catch (Throwable th2) {
                    attabalVar2.wireman(null);
                    throw th2;
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                formularization.attabal attabalVar9 = stVar.d;
                str = stVar.c;
                asString = stVar.b;
                iv ivVar3 = stVar.a;
                p002kotlin.dern.saneness(obj);
                stVar = ivVar3;
                attabalVar3 = attabalVar9;
                try {
                    z = stVar.x.getBoolean(asString);
                    attabalVar3.wireman(null);
                    if (z == Boolean.parseBoolean(str)) {
                        z2 = false;
                    }
                } catch (Throwable th3) {
                    attabalVar3.wireman(null);
                    throw th3;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return igo.attabal.attabal(z2);
    }

    public final void a(Map map, JsonElement jsonElement, Bundle bundle) {
        try {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            JsonElement jsonElement2 = asJsonObject.get("bk");
            String asString = jsonElement2 != null ? jsonElement2.getAsString() : null;
            JsonElement jsonElement3 = asJsonObject.get("sk");
            String asString2 = jsonElement3 != null ? jsonElement3.getAsString() : null;
            JsonElement jsonElement4 = asJsonObject.get("type");
            Integer numValueOf = jsonElement4 != null ? Integer.valueOf(jsonElement4.getAsInt()) : null;
            Object obj = map.get(asString2);
            qv qvVar = qv.STRING;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                if (obj instanceof String) {
                    bundle.putString(asString, (String) obj);
                    return;
                }
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 1) {
                if (obj instanceof Integer) {
                    bundle.putInt(asString, ((Number) obj).intValue());
                    return;
                } else if (obj instanceof Long) {
                    bundle.putLong(asString, ((Number) obj).longValue());
                    return;
                } else {
                    if (obj instanceof Float) {
                        bundle.putFloat(asString, ((Number) obj).floatValue());
                        return;
                    }
                    return;
                }
            }
            if (numValueOf != null && numValueOf.intValue() == 2 && (obj instanceof Boolean)) {
                bundle.putBoolean(asString, ((Boolean) obj).booleanValue());
            }
        } catch (IllegalStateException e) {
            ((d13) this.f).a("JSON shared preference consent key object parsing failure", e);
        } catch (NumberFormatException e2) {
            ((d13) this.f).a("JSON shared preference consent key object parsing failure", e2);
        } catch (UnsupportedOperationException e3) {
            ((d13) this.f).a("JSON shared preference consent key object parsing failure", e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r8 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.iv r6, boolean r7, wretchedly.dern r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.hu
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.hu r0 = (ads_mobile_sdk.hu) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.hu r0 = new ads_mobile_sdk.hu
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p002kotlin.dern.saneness(r8)
            goto L77
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            boolean r7 = r0.c
            ads_mobile_sdk.et r6 = r0.b
            ads_mobile_sdk.iv r2 = r0.a
            p002kotlin.dern.saneness(r8)
            goto L58
        L3e:
            p002kotlin.dern.saneness(r8)
            ads_mobile_sdk.et r8 = ads_mobile_sdk.et.API_GET_TOPICS
            ads_mobile_sdk.ej1 r2 = r6.A
            r0.a = r6
            r0.b = r8
            r0.c = r7
            r0.f = r4
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L54
            goto L76
        L54:
            r5 = r2
            r2 = r6
            r6 = r8
            r8 = r5
        L58:
            ads_mobile_sdk.gt r8 = (ads_mobile_sdk.gt) r8
            ads_mobile_sdk.o21 r8 = r8.p()
            boolean r6 = r8.contains(r6)
            r8 = 0
            if (r6 == 0) goto L79
            ads_mobile_sdk.l03 r6 = r2.m
            r0.a = r8
            r0.b = r8
            r0.f = r3
            r6.getClass()
            java.lang.Object r8 = ads_mobile_sdk.l03.a(r6, r7, r0)
            if (r8 != r1) goto L77
        L76:
            return r1
        L77:
            saneness.spartacist r8 = (saneness.spartacist) r8
        L79:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv.a(ads_mobile_sdk.iv, boolean, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Exception exception, wretchedly.dern dernVar) {
        mu muVar;
        if (dernVar instanceof mu) {
            muVar = (mu) dernVar;
            int i = muVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                muVar.d = i - Integer.MIN_VALUE;
            } else {
                muVar = new mu(this, dernVar);
            }
        } else {
            muVar = new mu(this, dernVar);
        }
        Object obj = muVar.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = muVar.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            gt gtVarC = c();
            muVar.a = exception;
            muVar.d = 1;
            if (a(gtVarC, muVar) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            exception = muVar.a;
            p002kotlin.dern.saneness(obj);
        }
        Intrinsics.checkNotNullParameter(exception, "exception");
        w03 w03VarA = j13.a();
        w03VarA.e().m = false;
        if (exception != null) {
            w03VarA.a(exception);
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nn0 nn0Var, wretchedly.dern dernVar) {
        nu nuVar;
        if (dernVar instanceof nu) {
            nuVar = (nu) dernVar;
            int i = nuVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nuVar.d = i - Integer.MIN_VALUE;
            } else {
                nuVar = new nu(this, dernVar);
            }
        } else {
            nuVar = new nu(this, dernVar);
        }
        Object obj = nuVar.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = nuVar.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            if ((nn0Var instanceof on0) && (((on0) nn0Var).c instanceof CancellationException)) {
                return Unit.f29295attabal;
            }
            gt gtVarC = c();
            nuVar.a = nn0Var;
            nuVar.d = 1;
            if (a(gtVarC, nuVar) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nn0Var = nuVar.a;
            p002kotlin.dern.saneness(obj);
        }
        y13.a(nn0Var, false);
        return Unit.f29295attabal;
    }

    public static Object a(iv ivVar, boolean z, wretchedly.dern dernVar, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        ivVar.getClass();
        return b(ivVar, z, true, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r14 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.iv r11, android.net.Uri r12, android.view.InputEvent r13, wretchedly.dern r14) {
        /*
            boolean r0 = r14 instanceof ads_mobile_sdk.xu
            if (r0 == 0) goto L13
            r0 = r14
            ads_mobile_sdk.xu r0 = (ads_mobile_sdk.xu) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.xu r0 = new ads_mobile_sdk.xu
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.e
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p002kotlin.dern.saneness(r14)
            goto L8e
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            ads_mobile_sdk.et r11 = r0.d
            java.lang.Object r12 = r0.c
            r13 = r12
            android.view.InputEvent r13 = (android.view.InputEvent) r13
            android.net.Uri r12 = r0.b
            ads_mobile_sdk.iv r2 = r0.a
            p002kotlin.dern.saneness(r14)
            goto L5f
        L43:
            p002kotlin.dern.saneness(r14)
            ads_mobile_sdk.et r14 = ads_mobile_sdk.et.API_ATTRIBUTION_REPORTING
            ads_mobile_sdk.ej1 r2 = r11.A
            r0.a = r11
            r0.b = r12
            r0.c = r13
            r0.d = r14
            r0.g = r4
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L5b
            goto L8d
        L5b:
            r10 = r2
            r2 = r11
            r11 = r14
            r14 = r10
        L5f:
            ads_mobile_sdk.gt r14 = (ads_mobile_sdk.gt) r14
            ads_mobile_sdk.o21 r14 = r14.p()
            boolean r11 = r14.contains(r11)
            r14 = 0
            if (r11 == 0) goto L90
            ads_mobile_sdk.ih r11 = r2.n
            r0.a = r14
            r0.b = r14
            r0.c = r14
            r0.d = r14
            r0.g = r3
            kotlinx.coroutines.saran r4 = r11.b
            ads_mobile_sdk.hh r7 = new ads_mobile_sdk.hh
            r7.<init>(r11, r12, r13, r14)
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            kotlinx.coroutines.walach r11 = kotlinx.coroutines.impromptu.saneness(r4, r5, r6, r7, r8, r9)
            java.lang.Object r14 = r11.dent(r0)
            if (r14 != r1) goto L8e
        L8d:
            return r1
        L8e:
            saneness.spartacist r14 = (saneness.spartacist) r14
        L90:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv.a(ads_mobile_sdk.iv, android.net.Uri, android.view.InputEvent, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r13.i(r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        if (b(r13, true, false, r0) == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.gt r13, wretchedly.dern r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof ads_mobile_sdk.dv
            if (r0 == 0) goto L13
            r0 = r14
            ads_mobile_sdk.dv r0 = (ads_mobile_sdk.dv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.dv r0 = new ads_mobile_sdk.dv
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L4b
            if (r2 == r7) goto L45
            if (r2 == r6) goto L41
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            p002kotlin.dern.saneness(r14)
            goto L76
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            ads_mobile_sdk.iv r13 = r0.a
            p002kotlin.dern.saneness(r14)
            goto L6b
        L41:
            p002kotlin.dern.saneness(r14)
            goto L96
        L45:
            ads_mobile_sdk.iv r13 = r0.a
            p002kotlin.dern.saneness(r14)
            goto L87
        L4b:
            p002kotlin.dern.saneness(r14)
            ads_mobile_sdk.jk0 r14 = r12.h
            boolean r2 = r14.v
            if (r2 != 0) goto L79
            double r8 = r14.w
            r10 = 0
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 <= 0) goto L5d
            goto L79
        L5d:
            ads_mobile_sdk.ej1 r14 = r12.A
            r0.a = r12
            r0.d = r5
            java.lang.Object r13 = r14.a(r13, r0)
            if (r13 != r1) goto L6a
            goto L95
        L6a:
            r13 = r12
        L6b:
            r0.a = r3
            r0.d = r4
            java.lang.Object r13 = r13.i(r0)
            if (r13 != r1) goto L76
            goto L95
        L76:
            kotlin.Unit r13 = p002kotlin.Unit.f29295attabal
            return r13
        L79:
            ads_mobile_sdk.ej1 r14 = r12.A
            r0.a = r12
            r0.d = r7
            java.lang.Object r13 = r14.a(r13, r0)
            if (r13 != r1) goto L86
            goto L95
        L86:
            r13 = r12
        L87:
            r0.a = r3
            r0.d = r6
            r13.getClass()
            r14 = 0
            java.lang.Object r13 = b(r13, r7, r14, r0)
            if (r13 != r1) goto L96
        L95:
            return r1
        L96:
            kotlin.Unit r13 = p002kotlin.Unit.f29295attabal
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.iv.a(ads_mobile_sdk.gt, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, wretchedly.dern dernVar) {
        ev evVar;
        String str2;
        et etVar;
        iv ivVar;
        CookieManager cookieManager;
        if (dernVar instanceof ev) {
            evVar = (ev) dernVar;
            int i = evVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                evVar.f = i - Integer.MIN_VALUE;
            } else {
                evVar = new ev(this, dernVar);
            }
        } else {
            evVar = new ev(this, dernVar);
        }
        Object obj = evVar.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = evVar.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            et etVar2 = et.API_SET_WEBVIEW_COOKIE;
            ej1 ej1Var = this.A;
            evVar.a = this;
            evVar.b = str;
            evVar.c = etVar2;
            evVar.f = 1;
            Object objA = ej1Var.a(evVar);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            str2 = str;
            etVar = etVar2;
            obj = objA;
            ivVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            etVar = evVar.c;
            str2 = evVar.b;
            ivVar = evVar.a;
            p002kotlin.dern.saneness(obj);
        }
        if (((gt) obj).p().contains(etVar) && (cookieManager = ivVar.C) != null) {
            cookieManager.setCookie(ivVar.h.n0(), str2);
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0252  */
    /* JADX WARN: Code duplicated, block: B:125:0x0292 A[Catch: all -> 0x02a2, TryCatch #3 {all -> 0x02a2, blocks: (B:123:0x028b, B:125:0x0292, B:127:0x0299, B:129:0x029d, B:131:0x02a1, B:134:0x02a5, B:135:0x02aa, B:136:0x02ab, B:137:0x02b2, B:138:0x02b3, B:139:0x02ba, B:140:0x02bb), top: B:226:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0299 A[Catch: all -> 0x02a2, TryCatch #3 {all -> 0x02a2, blocks: (B:123:0x028b, B:125:0x0292, B:127:0x0299, B:129:0x029d, B:131:0x02a1, B:134:0x02a5, B:135:0x02aa, B:136:0x02ab, B:137:0x02b2, B:138:0x02b3, B:139:0x02ba, B:140:0x02bb), top: B:226:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:129:0x029d A[Catch: all -> 0x02a2, TryCatch #3 {all -> 0x02a2, blocks: (B:123:0x028b, B:125:0x0292, B:127:0x0299, B:129:0x029d, B:131:0x02a1, B:134:0x02a5, B:135:0x02aa, B:136:0x02ab, B:137:0x02b2, B:138:0x02b3, B:139:0x02ba, B:140:0x02bb), top: B:226:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:131:0x02a1 A[Catch: all -> 0x02a2, TryCatch #3 {all -> 0x02a2, blocks: (B:123:0x028b, B:125:0x0292, B:127:0x0299, B:129:0x029d, B:131:0x02a1, B:134:0x02a5, B:135:0x02aa, B:136:0x02ab, B:137:0x02b2, B:138:0x02b3, B:139:0x02ba, B:140:0x02bb), top: B:226:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02a5 A[Catch: all -> 0x02a2, TryCatch #3 {all -> 0x02a2, blocks: (B:123:0x028b, B:125:0x0292, B:127:0x0299, B:129:0x029d, B:131:0x02a1, B:134:0x02a5, B:135:0x02aa, B:136:0x02ab, B:137:0x02b2, B:138:0x02b3, B:139:0x02ba, B:140:0x02bb), top: B:226:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:136:0x02ab A[Catch: all -> 0x02a2, TryCatch #3 {all -> 0x02a2, blocks: (B:123:0x028b, B:125:0x0292, B:127:0x0299, B:129:0x029d, B:131:0x02a1, B:134:0x02a5, B:135:0x02aa, B:136:0x02ab, B:137:0x02b2, B:138:0x02b3, B:139:0x02ba, B:140:0x02bb), top: B:226:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:138:0x02b3 A[Catch: all -> 0x02a2, TryCatch #3 {all -> 0x02a2, blocks: (B:123:0x028b, B:125:0x0292, B:127:0x0299, B:129:0x029d, B:131:0x02a1, B:134:0x02a5, B:135:0x02aa, B:136:0x02ab, B:137:0x02b2, B:138:0x02b3, B:139:0x02ba, B:140:0x02bb), top: B:226:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:140:0x02bb A[Catch: all -> 0x02a2, TRY_LEAVE, TryCatch #3 {all -> 0x02a2, blocks: (B:123:0x028b, B:125:0x0292, B:127:0x0299, B:129:0x029d, B:131:0x02a1, B:134:0x02a5, B:135:0x02aa, B:136:0x02ab, B:137:0x02b2, B:138:0x02b3, B:139:0x02ba, B:140:0x02bb), top: B:226:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:152:0x02f6 A[Catch: all -> 0x039a, TRY_LEAVE, TryCatch #17 {all -> 0x039a, blocks: (B:177:0x037b, B:150:0x02f0, B:152:0x02f6, B:159:0x0314, B:160:0x031d, B:161:0x0336, B:187:0x039d), top: B:249:0x02f0, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x030b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0314 A[Catch: all -> 0x039a, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x039a, blocks: (B:177:0x037b, B:150:0x02f0, B:152:0x02f6, B:159:0x0314, B:160:0x031d, B:161:0x0336, B:187:0x039d), top: B:249:0x02f0, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x034e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0365  */
    /* JADX WARN: Code duplicated, block: B:180:0x038c  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ca A[Catch: all -> 0x03da, TryCatch #18 {all -> 0x03da, blocks: (B:197:0x03c3, B:199:0x03ca, B:201:0x03d1, B:203:0x03d5, B:205:0x03d9, B:208:0x03dd, B:209:0x03e2, B:210:0x03e3, B:211:0x03ea, B:212:0x03eb, B:213:0x03f2, B:214:0x03f3), top: B:251:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x03d1 A[Catch: all -> 0x03da, TryCatch #18 {all -> 0x03da, blocks: (B:197:0x03c3, B:199:0x03ca, B:201:0x03d1, B:203:0x03d5, B:205:0x03d9, B:208:0x03dd, B:209:0x03e2, B:210:0x03e3, B:211:0x03ea, B:212:0x03eb, B:213:0x03f2, B:214:0x03f3), top: B:251:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x03d5 A[Catch: all -> 0x03da, TryCatch #18 {all -> 0x03da, blocks: (B:197:0x03c3, B:199:0x03ca, B:201:0x03d1, B:203:0x03d5, B:205:0x03d9, B:208:0x03dd, B:209:0x03e2, B:210:0x03e3, B:211:0x03ea, B:212:0x03eb, B:213:0x03f2, B:214:0x03f3), top: B:251:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x03d9 A[Catch: all -> 0x03da, TryCatch #18 {all -> 0x03da, blocks: (B:197:0x03c3, B:199:0x03ca, B:201:0x03d1, B:203:0x03d5, B:205:0x03d9, B:208:0x03dd, B:209:0x03e2, B:210:0x03e3, B:211:0x03ea, B:212:0x03eb, B:213:0x03f2, B:214:0x03f3), top: B:251:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x03dd A[Catch: all -> 0x03da, TryCatch #18 {all -> 0x03da, blocks: (B:197:0x03c3, B:199:0x03ca, B:201:0x03d1, B:203:0x03d5, B:205:0x03d9, B:208:0x03dd, B:209:0x03e2, B:210:0x03e3, B:211:0x03ea, B:212:0x03eb, B:213:0x03f2, B:214:0x03f3), top: B:251:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x03e3 A[Catch: all -> 0x03da, TryCatch #18 {all -> 0x03da, blocks: (B:197:0x03c3, B:199:0x03ca, B:201:0x03d1, B:203:0x03d5, B:205:0x03d9, B:208:0x03dd, B:209:0x03e2, B:210:0x03e3, B:211:0x03ea, B:212:0x03eb, B:213:0x03f2, B:214:0x03f3), top: B:251:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x03eb A[Catch: all -> 0x03da, TryCatch #18 {all -> 0x03da, blocks: (B:197:0x03c3, B:199:0x03ca, B:201:0x03d1, B:203:0x03d5, B:205:0x03d9, B:208:0x03dd, B:209:0x03e2, B:210:0x03e3, B:211:0x03ea, B:212:0x03eb, B:213:0x03f2, B:214:0x03f3), top: B:251:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:214:0x03f3 A[Catch: all -> 0x03da, TRY_LEAVE, TryCatch #18 {all -> 0x03da, blocks: (B:197:0x03c3, B:199:0x03ca, B:201:0x03d1, B:203:0x03d5, B:205:0x03d9, B:208:0x03dd, B:209:0x03e2, B:210:0x03e3, B:211:0x03ea, B:212:0x03eb, B:213:0x03f2, B:214:0x03f3), top: B:251:0x03c3 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ba A[Catch: all -> 0x0262, TRY_LEAVE, TryCatch #2 {all -> 0x0262, blocks: (B:103:0x0241, B:77:0x01b4, B:79:0x01ba, B:86:0x01d7, B:87:0x01e0, B:88:0x01fb, B:113:0x0265), top: B:224:0x0036, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d7 A[Catch: all -> 0x0262, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0262, blocks: (B:103:0x0241, B:77:0x01b4, B:79:0x01ba, B:86:0x01d7, B:87:0x01e0, B:88:0x01fb, B:113:0x0265), top: B:224:0x0036, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0215 A[Catch: all -> 0x010d, PHI: r5 r6 r8
  0x0215: PHI (r5v27 ??) = (r5v71 ??), (r5v72 ??) binds: [B:89:0x0211, B:52:0x0108] A[DONT_GENERATE, DONT_INLINE]
  0x0215: PHI (r6v18 ??) = (r6v36 ??), (r6v37 ??) binds: [B:89:0x0211, B:52:0x0108] A[DONT_GENERATE, DONT_INLINE]
  0x0215: PHI (r8v9 ads_mobile_sdk.iv) = (r8v6 ads_mobile_sdk.iv), (r8v11 ads_mobile_sdk.iv) binds: [B:89:0x0211, B:52:0x0108] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x010d, blocks: (B:52:0x0108, B:91:0x0215), top: B:236:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x022b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11, types: [ads_mobile_sdk.w03, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [ads_mobile_sdk.v62, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v54, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v72 */
    /* JADX WARN: Type inference failed for: r5v73 */
    /* JADX WARN: Type inference failed for: r5v74 */
    /* JADX WARN: Type inference failed for: r5v75 */
    /* JADX WARN: Type inference failed for: r5v76 */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r5v78 */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r6v20, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final Object a(Bundle bundle, wretchedly.dern dernVar) {
        fv fvVar;
        ?? r7;
        ?? A;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Object objA;
        iv ivVar;
        iv ivVar2;
        spartacist spartacistVar;
        ?? r4;
        String str8;
        gt gtVarA;
        ?? r5;
        ?? r6;
        String str9;
        formularization.attabal attabalVar;
        Throwable th;
        iv ivVar3;
        formularization.attabal attabalVar2;
        spartacist spartacistVar2;
        ?? r8;
        String str10;
        gt gtVarA2;
        ?? r9;
        ?? r10;
        ?? r11;
        formularization.attabal attabalVar3;
        iv ivVar4;
        Throwable th2;
        formularization.attabal attabalVar4;
        if (dernVar instanceof fv) {
            fvVar = (fv) dernVar;
            int i = fvVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                fvVar.g = i - Integer.MIN_VALUE;
            } else {
                fvVar = new fv(this, dernVar);
            }
        } else {
            fvVar = new fv(this, dernVar);
        }
        Object objA2 = fvVar.e;
        ?? Beachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        ?? A2 = fvVar.g;
        ?? r12 = "The allowlist is not a valid encoded string.";
        try {
            try {
                try {
                    switch (A2) {
                        case 0:
                            p002kotlin.dern.saneness(objA2);
                            ri2 ri2Var = this.q;
                            no0 no0Var = no0.CUI_NAME_CONSENT_ALLOWLIST_UPDATE;
                            List listFormularize = p002kotlin.collections.adultoid.formularize();
                            str = "The allowlist is not a valid encoded string.";
                            str2 = "Allowlist proto deserialization failed.";
                            str3 = "parseFrom(...)";
                            str4 = "getAsString(...)";
                            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
                            if (j13.b().a == null) {
                                A2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                                try {
                                    hydrofracturing hydrofracturingVar = this.e;
                                    String json = this.g.toJson(bundle);
                                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                                    fvVar.a = this;
                                    fvVar.b = A2;
                                    fvVar.c = A2;
                                    fvVar.g = 1;
                                    objA2 = ((cf0) hydrofracturingVar).a("google.afma.request.updateConsentAllowlist", json, fvVar);
                                    if (objA2 != Beachfront) {
                                        ivVar2 = this;
                                        r12 = A2;
                                        A2 = A2;
                                        spartacistVar = (spartacist) objA2;
                                        if (spartacistVar instanceof nn0) {
                                            fvVar.a = r12;
                                            fvVar.b = A2;
                                            fvVar.c = null;
                                            fvVar.g = 2;
                                            if (ivVar2.a((nn0) spartacistVar, fvVar) != Beachfront) {
                                                A2 = A2;
                                                r12 = r12;
                                                r5 = A2;
                                                Unit unit = Unit.f29295attabal;
                                                interaction.saneness.attabal(r5, null);
                                                return unit;
                                            }
                                        } else {
                                            Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                                            JsonObject jsonObject = (JsonObject) ((tn0) spartacistVar).b;
                                            try {
                                                BaseEncoding baseEncodingDern = BaseEncoding.dern();
                                                Intrinsics.checkNotNullParameter(jsonObject, "<this>");
                                                Intrinsics.checkNotNullParameter("allowlist", X3.i.W);
                                                String asString = jsonObject.get("allowlist").getAsString();
                                                Intrinsics.checkNotNullExpressionValue(asString, str4);
                                                try {
                                                    gtVarA = gt.a(baseEncodingDern.wireman(asString));
                                                    Intrinsics.checkNotNullExpressionValue(gtVarA, str3);
                                                    fvVar.a = ivVar2;
                                                    fvVar.b = r12;
                                                    fvVar.c = A2;
                                                    fvVar.g = 4;
                                                    A2 = A2;
                                                    r12 = r12;
                                                    A2 = A2;
                                                    r12 = r12;
                                                    if (ivVar2.a(gtVarA, fvVar) != Beachfront) {
                                                        attabalVar = ivVar2.F;
                                                        fvVar.a = ivVar2;
                                                        fvVar.b = r12;
                                                        fvVar.c = A2;
                                                        fvVar.d = attabalVar;
                                                        fvVar.g = 6;
                                                        th = null;
                                                        A2 = A2;
                                                        r12 = r12;
                                                        if (attabalVar.attabal(null, fvVar) != Beachfront) {
                                                            Beachfront = A2;
                                                            A2 = r12;
                                                            ivVar3 = ivVar2;
                                                            attabalVar2 = attabalVar;
                                                            try {
                                                                ivVar3.H = false;
                                                                Unit unit2 = Unit.f29295attabal;
                                                                attabalVar2.wireman(th);
                                                                interaction.saneness.attabal(Beachfront, th);
                                                                return unit2;
                                                            } catch (Throwable th3) {
                                                                attabalVar2.wireman(th);
                                                                throw th3;
                                                            }
                                                        }
                                                    }
                                                } catch (x81 e) {
                                                    e = e;
                                                    fvVar.a = r12;
                                                    fvVar.b = A2;
                                                    fvVar.c = e;
                                                    fvVar.g = 5;
                                                    A2 = A2;
                                                    r12 = r12;
                                                    if (ivVar2.a(e, fvVar) != Beachfront) {
                                                        r6 = A2;
                                                        str9 = str2;
                                                        y13.a(str9, e, 4);
                                                        Unit unit3 = Unit.f29295attabal;
                                                        interaction.saneness.attabal(r6, null);
                                                        return unit3;
                                                    }
                                                }
                                            } catch (IllegalArgumentException e2) {
                                                e = e2;
                                                fvVar.a = r12;
                                                fvVar.b = A2;
                                                fvVar.c = e;
                                                fvVar.g = 3;
                                                A2 = A2;
                                                r12 = r12;
                                                if (ivVar2.a(e, fvVar) != Beachfront) {
                                                    r4 = A2;
                                                    str8 = str;
                                                    y13.a(str8, e, 4);
                                                    Unit unit4 = Unit.f29295attabal;
                                                    interaction.saneness.attabal(r4, null);
                                                    return unit4;
                                                }
                                            }
                                        }
                                        A2 = A2;
                                        r12 = r12;
                                    }
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r12 = A2;
                                    try {
                                        r12.b(th);
                                        if (!(th instanceof evenfall)) {
                                            r12.a(th);
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
                                    } catch (Throwable th5) {
                                        try {
                                            throw th5;
                                        } catch (Throwable th6) {
                                            interaction.saneness.attabal(A2, th5);
                                            throw th6;
                                        }
                                    }
                                }
                            } else {
                                str5 = str2;
                                str6 = str3;
                                str7 = str4;
                                A = j13.a(no0Var, p002kotlin.collections.adultoid.formularize(), true);
                                try {
                                    hydrofracturing hydrofracturingVar2 = this.e;
                                    String json2 = this.g.toJson(bundle);
                                    Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                                    fvVar.a = this;
                                    fvVar.b = A;
                                    fvVar.c = A;
                                    fvVar.g = 7;
                                    objA = ((cf0) hydrofracturingVar2).a("google.afma.request.updateConsentAllowlist", json2, fvVar);
                                    if (objA != Beachfront) {
                                        ivVar = this;
                                        r7 = A;
                                        A = A;
                                        try {
                                            spartacistVar2 = (spartacist) objA;
                                            if (spartacistVar2 instanceof nn0) {
                                                fvVar.a = r7;
                                                fvVar.b = A;
                                                fvVar.c = null;
                                                fvVar.g = 8;
                                                if (ivVar.a((nn0) spartacistVar2, fvVar) != Beachfront) {
                                                    A = A;
                                                    r7 = r7;
                                                    r10 = A;
                                                    Unit unit5 = Unit.f29295attabal;
                                                    interaction.saneness.attabal(r10, null);
                                                    return unit5;
                                                }
                                            } else {
                                                Intrinsics.competently(spartacistVar2, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                                                JsonObject jsonObject2 = (JsonObject) ((tn0) spartacistVar2).b;
                                                try {
                                                    BaseEncoding baseEncodingDern2 = BaseEncoding.dern();
                                                    Intrinsics.checkNotNullParameter(jsonObject2, "<this>");
                                                    Intrinsics.checkNotNullParameter("allowlist", X3.i.W);
                                                    String asString2 = jsonObject2.get("allowlist").getAsString();
                                                    Intrinsics.checkNotNullExpressionValue(asString2, str7);
                                                    try {
                                                        gtVarA2 = gt.a(baseEncodingDern2.wireman(asString2));
                                                        Intrinsics.checkNotNullExpressionValue(gtVarA2, str6);
                                                        fvVar.a = ivVar;
                                                        fvVar.b = r7;
                                                        fvVar.c = A;
                                                        fvVar.g = 10;
                                                        A = A;
                                                        r7 = r7;
                                                        if (ivVar.a(gtVarA2, fvVar) != Beachfront) {
                                                            r9 = r7;
                                                            A = A;
                                                            attabalVar3 = ivVar.F;
                                                            fvVar.a = ivVar;
                                                            fvVar.b = r9;
                                                            fvVar.c = A;
                                                            fvVar.d = attabalVar3;
                                                            fvVar.g = 12;
                                                            r7 = 0;
                                                            th2 = null;
                                                            A = A;
                                                            if (attabalVar3.attabal(null, fvVar) != Beachfront) {
                                                                Beachfront = A;
                                                                A2 = r9;
                                                                ivVar4 = ivVar;
                                                                attabalVar4 = attabalVar3;
                                                                try {
                                                                    ivVar4.H = false;
                                                                    Unit unit6 = Unit.f29295attabal;
                                                                    attabalVar4.wireman(th2);
                                                                    interaction.saneness.attabal(Beachfront, th2);
                                                                    return unit6;
                                                                } catch (Throwable th7) {
                                                                    attabalVar4.wireman(th2);
                                                                    throw th7;
                                                                }
                                                            }
                                                        }
                                                    } catch (x81 e3) {
                                                        e = e3;
                                                        fvVar.a = r7;
                                                        fvVar.b = A;
                                                        fvVar.c = e;
                                                        fvVar.g = 11;
                                                        A = A;
                                                        r7 = r7;
                                                        if (ivVar.a(e, fvVar) != Beachfront) {
                                                            r11 = A;
                                                            y13.a(str5, e, 4);
                                                            Unit unit7 = Unit.f29295attabal;
                                                            interaction.saneness.attabal(r11, null);
                                                            return unit7;
                                                        }
                                                    }
                                                } catch (IllegalArgumentException e4) {
                                                    e = e4;
                                                    fvVar.a = r7;
                                                    fvVar.b = A;
                                                    fvVar.c = e;
                                                    fvVar.g = 9;
                                                    A = A;
                                                    r7 = r7;
                                                    if (ivVar.a(e, fvVar) != Beachfront) {
                                                        r8 = A;
                                                        str10 = str;
                                                        y13.a(str10, e, 4);
                                                        Unit unit8 = Unit.f29295attabal;
                                                        interaction.saneness.attabal(r8, null);
                                                        return unit8;
                                                    }
                                                }
                                            }
                                            A = A;
                                            r7 = r7;
                                            break;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            try {
                                                r7.b(th);
                                                if (!(th instanceof evenfall)) {
                                                    r7.a(th);
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
                                            } catch (Throwable th9) {
                                                try {
                                                    throw th9;
                                                } catch (Throwable th10) {
                                                    interaction.saneness.attabal(A, th9);
                                                    throw th10;
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    r7 = A;
                                    r7.b(th);
                                    if (!(th instanceof evenfall)) {
                                        r7.a(th);
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
                            }
                            return Beachfront;
                        case 1:
                            A2 = (Closeable) fvVar.c;
                            w03 w03Var = (w03) fvVar.b;
                            iv ivVar5 = (iv) fvVar.a;
                            try {
                                p002kotlin.dern.saneness(objA2);
                                str = "The allowlist is not a valid encoded string.";
                                str2 = "Allowlist proto deserialization failed.";
                                str3 = "parseFrom(...)";
                                str4 = "getAsString(...)";
                                r12 = w03Var;
                                ivVar2 = ivVar5;
                                A2 = A2;
                                spartacistVar = (spartacist) objA2;
                                if (spartacistVar instanceof nn0) {
                                    fvVar.a = r12;
                                    fvVar.b = A2;
                                    fvVar.c = null;
                                    fvVar.g = 2;
                                    if (ivVar2.a((nn0) spartacistVar, fvVar) != Beachfront) {
                                        A2 = A2;
                                        r12 = r12;
                                        r5 = A2;
                                        Unit unit9 = Unit.f29295attabal;
                                        interaction.saneness.attabal(r5, null);
                                        return unit9;
                                    }
                                } else {
                                    Intrinsics.competently(spartacistVar, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                                    JsonObject jsonObject3 = (JsonObject) ((tn0) spartacistVar).b;
                                    BaseEncoding baseEncodingDern3 = BaseEncoding.dern();
                                    Intrinsics.checkNotNullParameter(jsonObject3, "<this>");
                                    Intrinsics.checkNotNullParameter("allowlist", X3.i.W);
                                    String asString3 = jsonObject3.get("allowlist").getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString3, str4);
                                    gtVarA = gt.a(baseEncodingDern3.wireman(asString3));
                                    Intrinsics.checkNotNullExpressionValue(gtVarA, str3);
                                    fvVar.a = ivVar2;
                                    fvVar.b = r12;
                                    fvVar.c = A2;
                                    fvVar.g = 4;
                                    A2 = A2;
                                    r12 = r12;
                                    A2 = A2;
                                    r12 = r12;
                                    if (ivVar2.a(gtVarA, fvVar) != Beachfront) {
                                        attabalVar = ivVar2.F;
                                        fvVar.a = ivVar2;
                                        fvVar.b = r12;
                                        fvVar.c = A2;
                                        fvVar.d = attabalVar;
                                        fvVar.g = 6;
                                        th = null;
                                        A2 = A2;
                                        r12 = r12;
                                        if (attabalVar.attabal(null, fvVar) != Beachfront) {
                                            Beachfront = A2;
                                            A2 = r12;
                                            ivVar3 = ivVar2;
                                            attabalVar2 = attabalVar;
                                            ivVar3.H = false;
                                            Unit unit10 = Unit.f29295attabal;
                                            attabalVar2.wireman(th);
                                            interaction.saneness.attabal(Beachfront, th);
                                            return unit10;
                                        }
                                    }
                                }
                                A2 = A2;
                                r12 = r12;
                                return Beachfront;
                            } catch (Throwable th12) {
                                th = th12;
                                r12 = w03Var;
                                r12.b(th);
                                if (!(th instanceof evenfall)) {
                                    r12.a(th);
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
                            Closeable closeable = fvVar.b;
                            p002kotlin.dern.saneness(objA2);
                            r5 = closeable;
                            Unit unit11 = Unit.f29295attabal;
                            interaction.saneness.attabal(r5, null);
                            return unit11;
                        case 3:
                            e = (IllegalArgumentException) fvVar.c;
                            Closeable closeable2 = fvVar.b;
                            p002kotlin.dern.saneness(objA2);
                            str8 = "The allowlist is not a valid encoded string.";
                            r4 = closeable2;
                            y13.a(str8, e, 4);
                            Unit unit12 = Unit.f29295attabal;
                            interaction.saneness.attabal(r4, null);
                            return unit12;
                        case 4:
                            A2 = (Closeable) fvVar.c;
                            r12 = (w03) fvVar.b;
                            ivVar2 = (iv) fvVar.a;
                            try {
                                try {
                                    p002kotlin.dern.saneness(objA2);
                                    A2 = A2;
                                    r12 = r12;
                                    attabalVar = ivVar2.F;
                                    fvVar.a = ivVar2;
                                    fvVar.b = r12;
                                    fvVar.c = A2;
                                    fvVar.d = attabalVar;
                                    fvVar.g = 6;
                                    th = null;
                                    A2 = A2;
                                    r12 = r12;
                                    if (attabalVar.attabal(null, fvVar) != Beachfront) {
                                        Beachfront = A2;
                                        A2 = r12;
                                        ivVar3 = ivVar2;
                                        attabalVar2 = attabalVar;
                                        ivVar3.H = false;
                                        Unit unit13 = Unit.f29295attabal;
                                        attabalVar2.wireman(th);
                                        interaction.saneness.attabal(Beachfront, th);
                                        return unit13;
                                    }
                                } catch (x81 e5) {
                                    e = e5;
                                    str2 = "Allowlist proto deserialization failed.";
                                    fvVar.a = r12;
                                    fvVar.b = A2;
                                    fvVar.c = e;
                                    fvVar.g = 5;
                                    A2 = A2;
                                    r12 = r12;
                                    if (ivVar2.a(e, fvVar) != Beachfront) {
                                        r6 = A2;
                                        str9 = str2;
                                        y13.a(str9, e, 4);
                                        Unit unit14 = Unit.f29295attabal;
                                        interaction.saneness.attabal(r6, null);
                                        return unit14;
                                    }
                                }
                                A2 = A2;
                                r12 = r12;
                                return Beachfront;
                            } catch (Throwable th13) {
                                th = th13;
                                Beachfront = A2;
                                A2 = r12;
                                r12 = A2;
                                A2 = Beachfront;
                                r12.b(th);
                                if (!(th instanceof evenfall)) {
                                    r12.a(th);
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
                        case 5:
                            e = (x81) fvVar.c;
                            Closeable closeable3 = fvVar.b;
                            p002kotlin.dern.saneness(objA2);
                            str9 = "Allowlist proto deserialization failed.";
                            r6 = closeable3;
                            y13.a(str9, e, 4);
                            Unit unit15 = Unit.f29295attabal;
                            interaction.saneness.attabal(r6, null);
                            return unit15;
                        case 6:
                            attabalVar = fvVar.d;
                            Closeable closeable4 = (Closeable) fvVar.c;
                            w03 w03Var2 = (w03) fvVar.b;
                            ivVar3 = (iv) fvVar.a;
                            p002kotlin.dern.saneness(objA2);
                            th = null;
                            Beachfront = closeable4;
                            A2 = w03Var2;
                            attabalVar2 = attabalVar;
                            ivVar3.H = false;
                            Unit unit16 = Unit.f29295attabal;
                            attabalVar2.wireman(th);
                            interaction.saneness.attabal(Beachfront, th);
                            return unit16;
                        case 7:
                            A = (Closeable) fvVar.c;
                            w03 w03Var3 = (w03) fvVar.b;
                            iv ivVar6 = (iv) fvVar.a;
                            try {
                                p002kotlin.dern.saneness(objA2);
                                ivVar = ivVar6;
                                objA = objA2;
                                str6 = "parseFrom(...)";
                                str = "The allowlist is not a valid encoded string.";
                                str5 = "Allowlist proto deserialization failed.";
                                str7 = "getAsString(...)";
                                r7 = w03Var3;
                                A = A;
                                spartacistVar2 = (spartacist) objA;
                                if (spartacistVar2 instanceof nn0) {
                                    fvVar.a = r7;
                                    fvVar.b = A;
                                    fvVar.c = null;
                                    fvVar.g = 8;
                                    if (ivVar.a((nn0) spartacistVar2, fvVar) != Beachfront) {
                                        A = A;
                                        r7 = r7;
                                        r10 = A;
                                        Unit unit17 = Unit.f29295attabal;
                                        interaction.saneness.attabal(r10, null);
                                        return unit17;
                                    }
                                } else {
                                    Intrinsics.competently(spartacistVar2, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
                                    JsonObject jsonObject4 = (JsonObject) ((tn0) spartacistVar2).b;
                                    BaseEncoding baseEncodingDern4 = BaseEncoding.dern();
                                    Intrinsics.checkNotNullParameter(jsonObject4, "<this>");
                                    Intrinsics.checkNotNullParameter("allowlist", X3.i.W);
                                    String asString4 = jsonObject4.get("allowlist").getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString4, str7);
                                    gtVarA2 = gt.a(baseEncodingDern4.wireman(asString4));
                                    Intrinsics.checkNotNullExpressionValue(gtVarA2, str6);
                                    fvVar.a = ivVar;
                                    fvVar.b = r7;
                                    fvVar.c = A;
                                    fvVar.g = 10;
                                    A = A;
                                    r7 = r7;
                                    if (ivVar.a(gtVarA2, fvVar) != Beachfront) {
                                        r9 = r7;
                                        A = A;
                                        attabalVar3 = ivVar.F;
                                        fvVar.a = ivVar;
                                        fvVar.b = r9;
                                        fvVar.c = A;
                                        fvVar.d = attabalVar3;
                                        fvVar.g = 12;
                                        r7 = 0;
                                        th2 = null;
                                        A = A;
                                        if (attabalVar3.attabal(null, fvVar) != Beachfront) {
                                            Beachfront = A;
                                            A2 = r9;
                                            ivVar4 = ivVar;
                                            attabalVar4 = attabalVar3;
                                            ivVar4.H = false;
                                            Unit unit18 = Unit.f29295attabal;
                                            attabalVar4.wireman(th2);
                                            interaction.saneness.attabal(Beachfront, th2);
                                            return unit18;
                                        }
                                    }
                                }
                                A = A;
                                r7 = r7;
                                return Beachfront;
                            } catch (Throwable th14) {
                                th = th14;
                                r7 = w03Var3;
                                r7.b(th);
                                if (!(th instanceof evenfall)) {
                                    r7.a(th);
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
                        case 8:
                            Closeable closeable5 = fvVar.b;
                            p002kotlin.dern.saneness(objA2);
                            r10 = closeable5;
                            Unit unit19 = Unit.f29295attabal;
                            interaction.saneness.attabal(r10, null);
                            return unit19;
                        case 9:
                            e = (IllegalArgumentException) fvVar.c;
                            Closeable closeable6 = fvVar.b;
                            p002kotlin.dern.saneness(objA2);
                            str10 = "The allowlist is not a valid encoded string.";
                            r8 = closeable6;
                            y13.a(str10, e, 4);
                            Unit unit20 = Unit.f29295attabal;
                            interaction.saneness.attabal(r8, null);
                            return unit20;
                        case 10:
                            A = (Closeable) fvVar.c;
                            r9 = (w03) fvVar.b;
                            ivVar = (iv) fvVar.a;
                            try {
                                try {
                                    p002kotlin.dern.saneness(objA2);
                                    A = A;
                                    r9 = r9;
                                    attabalVar3 = ivVar.F;
                                    fvVar.a = ivVar;
                                    fvVar.b = r9;
                                    fvVar.c = A;
                                    fvVar.d = attabalVar3;
                                    fvVar.g = 12;
                                    r7 = 0;
                                    th2 = null;
                                    A = A;
                                    if (attabalVar3.attabal(null, fvVar) != Beachfront) {
                                        Beachfront = A;
                                        A2 = r9;
                                        ivVar4 = ivVar;
                                        attabalVar4 = attabalVar3;
                                        ivVar4.H = false;
                                        Unit unit110 = Unit.f29295attabal;
                                        attabalVar4.wireman(th2);
                                        interaction.saneness.attabal(Beachfront, th2);
                                        return unit110;
                                    }
                                } catch (x81 e6) {
                                    e = e6;
                                    r7 = r9;
                                    str5 = "Allowlist proto deserialization failed.";
                                    fvVar.a = r7;
                                    fvVar.b = A;
                                    fvVar.c = e;
                                    fvVar.g = 11;
                                    A = A;
                                    r7 = r7;
                                    if (ivVar.a(e, fvVar) != Beachfront) {
                                        r11 = A;
                                        y13.a(str5, e, 4);
                                        Unit unit21 = Unit.f29295attabal;
                                        interaction.saneness.attabal(r11, null);
                                        return unit21;
                                    }
                                }
                                A = A;
                                r7 = r7;
                                return Beachfront;
                            } catch (Throwable th15) {
                                th = th15;
                                Beachfront = A;
                                A2 = r9;
                                r7 = A2;
                                A = Beachfront;
                                r7.b(th);
                                if (!(th instanceof evenfall)) {
                                    r7.a(th);
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
                        case 11:
                            e = (x81) fvVar.c;
                            Closeable closeable7 = fvVar.b;
                            p002kotlin.dern.saneness(objA2);
                            str5 = "Allowlist proto deserialization failed.";
                            r11 = closeable7;
                            y13.a(str5, e, 4);
                            Unit unit22 = Unit.f29295attabal;
                            interaction.saneness.attabal(r11, null);
                            return unit22;
                        case 12:
                            attabalVar3 = fvVar.d;
                            Closeable closeable8 = (Closeable) fvVar.c;
                            w03 w03Var4 = (w03) fvVar.b;
                            ivVar4 = (iv) fvVar.a;
                            p002kotlin.dern.saneness(objA2);
                            th2 = null;
                            Beachfront = closeable8;
                            A2 = w03Var4;
                            attabalVar4 = attabalVar3;
                            ivVar4.H = false;
                            Unit unit111 = Unit.f29295attabal;
                            attabalVar4.wireman(th2);
                            interaction.saneness.attabal(Beachfront, th2);
                            return unit111;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th16) {
                    th = th16;
                    r7 = A2;
                    A = Beachfront;
                    r7.b(th);
                    if (!(th instanceof evenfall)) {
                        r7.a(th);
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
            } catch (Throwable th17) {
                th = th17;
            }
        } catch (Throwable th18) {
            th = th18;
        }
    }
}

package ads_mobile_sdk;

import android.net.Uri;
import android.os.SystemClock;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.ironsource.X3;
import complexometry.taiyuan;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;
import saneness.evenfall;
import saneness.hobby;
import saneness.loun;
import saneness.sequal;

/* JADX INFO: loaded from: classes.dex */
public final class qg2 {
    public final jk0 a;
    public final au1 b;
    public final amphitheatre c;
    public final saran d;
    public final hobby e;
    public final b63 f;
    public final vo g;
    public final ri2 h;
    public final loun i;

    public qg2(jk0 flags, au1 offlineDatabase, amphitheatre clock, saran backgroundScope, hobby httpClient, b63 urlPinger, vo chromeVariationsProvider, ri2 rootTraceCreator, loun traceLogger) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(offlineDatabase, "offlineDatabase");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(urlPinger, "urlPinger");
        Intrinsics.checkNotNullParameter(chromeVariationsProvider, "chromeVariationsProvider");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.a = flags;
        this.b = offlineDatabase;
        this.c = clock;
        this.d = backgroundScope;
        this.e = httpClient;
        this.f = urlPinger;
        this.g = chromeVariationsProvider;
        this.h = rootTraceCreator;
        this.i = traceLogger;
    }

    public static final Map a(qg2 qg2Var, Uri uri) {
        return qg2Var.g.a(uri);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(e2 e2Var, String str, wretchedly.dern dernVar) {
        kg2 kg2Var;
        qg2 qg2Var;
        if (dernVar instanceof kg2) {
            kg2Var = (kg2) dernVar;
            int i = kg2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kg2Var.e = i - Integer.MIN_VALUE;
            } else {
                kg2Var = new kg2(this, dernVar);
            }
        } else {
            kg2Var = new kg2(this, dernVar);
        }
        Object obj = kg2Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = kg2Var.e;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = kg2Var.b;
            qg2Var = kg2Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                return Unit.f29295attabal;
            } catch (JsonSyntaxException e) {
                e = e;
                y13.a(new rn0("Failed to parse ad event value from JSON: " + str), false);
                ((d13) qg2Var.i).a("Failed to parse ad event value from JSON: " + str, e);
                return Unit.f29295attabal;
            } catch (Exception e2) {
                e = e2;
                y13.a(new rn0("Failed while emitting ad paid event for " + str), false);
                ((d13) qg2Var.i).a("Failed while emitting ad paid event for " + str, e);
                return Unit.f29295attabal;
            }
        }
        p002kotlin.dern.saneness(obj);
        if (str != null && str.length() != 0) {
            try {
                JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                Intrinsics.beachfront(asJsonObject);
                k7 k7VarSaneness = sequal.saneness(asJsonObject);
                taiyuan taiyuanVar = new taiyuan(k7VarSaneness.c, k7VarSaneness.b, k7VarSaneness.d);
                kg2Var.a = this;
                kg2Var.b = str;
                kg2Var.e = 1;
                if (e2Var.a(taiyuanVar, kg2Var) == objBeachfront) {
                    return objBeachfront;
                }
                return Unit.f29295attabal;
            } catch (JsonSyntaxException e3) {
                e = e3;
                qg2Var = this;
                y13.a(new rn0("Failed to parse ad event value from JSON: " + str), false);
                ((d13) qg2Var.i).a("Failed to parse ad event value from JSON: " + str, e);
                return Unit.f29295attabal;
            } catch (Exception e4) {
                e = e4;
                qg2Var = this;
                y13.a(new rn0("Failed while emitting ad paid event for " + str), false);
                ((d13) qg2Var.i).a("Failed while emitting ad paid event for " + str, e);
                return Unit.f29295attabal;
            }
        }
        y13.a(new rn0("AdEventValueString is null or empty"), false);
        return Unit.f29295attabal;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6921. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object a(android.net.Uri r31, ads_mobile_sdk.os1 r32, int r33, long r34, java.lang.String r36, java.util.Map r37, ads_mobile_sdk.e2 r38, ads_mobile_sdk.h1 r39, java.lang.Boolean r40, ads_mobile_sdk.l13 r41, wretchedly.dern r42) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qg2.a(android.net.Uri, ads_mobile_sdk.os1, int, long, java.lang.String, java.util.Map, ads_mobile_sdk.e2, ads_mobile_sdk.h1, java.lang.Boolean, ads_mobile_sdk.l13, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d3 A[Catch: all -> 0x00e3, TryCatch #2 {all -> 0x00e3, blocks: (B:43:0x00cc, B:45:0x00d3, B:47:0x00da, B:49:0x00de, B:51:0x00e2, B:54:0x00e6, B:55:0x00eb, B:56:0x00ec, B:57:0x00f3, B:58:0x00f4, B:59:0x00fb, B:60:0x00fc), top: B:105:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00da A[Catch: all -> 0x00e3, TryCatch #2 {all -> 0x00e3, blocks: (B:43:0x00cc, B:45:0x00d3, B:47:0x00da, B:49:0x00de, B:51:0x00e2, B:54:0x00e6, B:55:0x00eb, B:56:0x00ec, B:57:0x00f3, B:58:0x00f4, B:59:0x00fb, B:60:0x00fc), top: B:105:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00de A[Catch: all -> 0x00e3, TryCatch #2 {all -> 0x00e3, blocks: (B:43:0x00cc, B:45:0x00d3, B:47:0x00da, B:49:0x00de, B:51:0x00e2, B:54:0x00e6, B:55:0x00eb, B:56:0x00ec, B:57:0x00f3, B:58:0x00f4, B:59:0x00fb, B:60:0x00fc), top: B:105:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2 A[Catch: all -> 0x00e3, TryCatch #2 {all -> 0x00e3, blocks: (B:43:0x00cc, B:45:0x00d3, B:47:0x00da, B:49:0x00de, B:51:0x00e2, B:54:0x00e6, B:55:0x00eb, B:56:0x00ec, B:57:0x00f3, B:58:0x00f4, B:59:0x00fb, B:60:0x00fc), top: B:105:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6 A[Catch: all -> 0x00e3, TryCatch #2 {all -> 0x00e3, blocks: (B:43:0x00cc, B:45:0x00d3, B:47:0x00da, B:49:0x00de, B:51:0x00e2, B:54:0x00e6, B:55:0x00eb, B:56:0x00ec, B:57:0x00f3, B:58:0x00f4, B:59:0x00fb, B:60:0x00fc), top: B:105:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec A[Catch: all -> 0x00e3, TryCatch #2 {all -> 0x00e3, blocks: (B:43:0x00cc, B:45:0x00d3, B:47:0x00da, B:49:0x00de, B:51:0x00e2, B:54:0x00e6, B:55:0x00eb, B:56:0x00ec, B:57:0x00f3, B:58:0x00f4, B:59:0x00fb, B:60:0x00fc), top: B:105:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4 A[Catch: all -> 0x00e3, TryCatch #2 {all -> 0x00e3, blocks: (B:43:0x00cc, B:45:0x00d3, B:47:0x00da, B:49:0x00de, B:51:0x00e2, B:54:0x00e6, B:55:0x00eb, B:56:0x00ec, B:57:0x00f3, B:58:0x00f4, B:59:0x00fb, B:60:0x00fc), top: B:105:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fc A[Catch: all -> 0x00e3, TRY_LEAVE, TryCatch #2 {all -> 0x00e3, blocks: (B:43:0x00cc, B:45:0x00d3, B:47:0x00da, B:49:0x00de, B:51:0x00e2, B:54:0x00e6, B:55:0x00eb, B:56:0x00ec, B:57:0x00f3, B:58:0x00f4, B:59:0x00fb, B:60:0x00fc), top: B:105:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0151 A[Catch: all -> 0x0161, TryCatch #1 {all -> 0x0161, blocks: (B:80:0x014a, B:82:0x0151, B:84:0x0158, B:86:0x015c, B:88:0x0160, B:91:0x0164, B:92:0x0169, B:93:0x016a, B:94:0x0171, B:95:0x0172, B:96:0x0179, B:97:0x017a), top: B:104:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0158 A[Catch: all -> 0x0161, TryCatch #1 {all -> 0x0161, blocks: (B:80:0x014a, B:82:0x0151, B:84:0x0158, B:86:0x015c, B:88:0x0160, B:91:0x0164, B:92:0x0169, B:93:0x016a, B:94:0x0171, B:95:0x0172, B:96:0x0179, B:97:0x017a), top: B:104:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:86:0x015c A[Catch: all -> 0x0161, TryCatch #1 {all -> 0x0161, blocks: (B:80:0x014a, B:82:0x0151, B:84:0x0158, B:86:0x015c, B:88:0x0160, B:91:0x0164, B:92:0x0169, B:93:0x016a, B:94:0x0171, B:95:0x0172, B:96:0x0179, B:97:0x017a), top: B:104:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0160 A[Catch: all -> 0x0161, TryCatch #1 {all -> 0x0161, blocks: (B:80:0x014a, B:82:0x0151, B:84:0x0158, B:86:0x015c, B:88:0x0160, B:91:0x0164, B:92:0x0169, B:93:0x016a, B:94:0x0171, B:95:0x0172, B:96:0x0179, B:97:0x017a), top: B:104:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0164 A[Catch: all -> 0x0161, TryCatch #1 {all -> 0x0161, blocks: (B:80:0x014a, B:82:0x0151, B:84:0x0158, B:86:0x015c, B:88:0x0160, B:91:0x0164, B:92:0x0169, B:93:0x016a, B:94:0x0171, B:95:0x0172, B:96:0x0179, B:97:0x017a), top: B:104:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:93:0x016a A[Catch: all -> 0x0161, TryCatch #1 {all -> 0x0161, blocks: (B:80:0x014a, B:82:0x0151, B:84:0x0158, B:86:0x015c, B:88:0x0160, B:91:0x0164, B:92:0x0169, B:93:0x016a, B:94:0x0171, B:95:0x0172, B:96:0x0179, B:97:0x017a), top: B:104:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0172 A[Catch: all -> 0x0161, TryCatch #1 {all -> 0x0161, blocks: (B:80:0x014a, B:82:0x0151, B:84:0x0158, B:86:0x015c, B:88:0x0160, B:91:0x0164, B:92:0x0169, B:93:0x016a, B:94:0x0171, B:95:0x0172, B:96:0x0179, B:97:0x017a), top: B:104:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:97:0x017a A[Catch: all -> 0x0161, TRY_LEAVE, TryCatch #1 {all -> 0x0161, blocks: (B:80:0x014a, B:82:0x0151, B:84:0x0158, B:86:0x015c, B:88:0x0160, B:91:0x0164, B:92:0x0169, B:93:0x016a, B:94:0x0171, B:95:0x0172, B:96:0x0179, B:97:0x017a), top: B:104:0x014a }] */
    public final Object a(tn0 tn0Var, e2 e2Var, l13 l13Var, wretchedly.dern dernVar) {
        mg2 mg2Var;
        w03 w03Var;
        w03 w03Var2;
        w03 w03Var3;
        w03 w03Var4;
        tn0 tn0Var2 = tn0Var;
        if (dernVar instanceof mg2) {
            mg2Var = (mg2) dernVar;
            int i = mg2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mg2Var.f = i - Integer.MIN_VALUE;
            } else {
                mg2Var = new mg2(this, dernVar);
            }
        } else {
            mg2Var = new mg2(this, dernVar);
        }
        Object obj = mg2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = mg2Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            ri2 ri2Var = this.h;
            no0 no0Var = no0.CUI_NAME_PING_AND_EMIT_PAID_EVENT;
            List listFormularize = adultoid.formularize();
            l13 l13Var2 = l13Var == null ? new l13(new xb2(), new j71(), new le2(), new o6()) : l13Var;
            if (j13.b().a == null) {
                v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var2);
                try {
                    String str = (String) ((zt0) tn0Var2.b).c.get("X-Afma-Ad-Event-Value");
                    if (str == null) {
                        str = (String) ((zt0) tn0Var2.b).c.get("X-Ad-Event-Value");
                    }
                    mg2Var.a = tn0Var2;
                    mg2Var.b = v62VarA;
                    mg2Var.c = v62VarA;
                    mg2Var.f = 1;
                    if (a(e2Var, str, mg2Var) != objBeachfront) {
                        w03Var3 = v62VarA;
                        w03Var4 = w03Var3;
                        ((zt0) tn0Var2.b).getClass();
                        Unit unit = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var3, null);
                    }
                } catch (Throwable th) {
                    th = th;
                    w03Var3 = v62VarA;
                    w03Var4 = w03Var3;
                    w03Var4.b(th);
                    if (!(th instanceof evenfall)) {
                        w03Var4.a(th);
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
                w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                try {
                    String str2 = (String) ((zt0) tn0Var2.b).c.get("X-Afma-Ad-Event-Value");
                    if (str2 == null) {
                        str2 = (String) ((zt0) tn0Var2.b).c.get("X-Ad-Event-Value");
                    }
                    mg2Var.a = tn0Var2;
                    mg2Var.b = w03VarA;
                    mg2Var.c = w03VarA;
                    mg2Var.f = 2;
                    if (a(e2Var, str2, mg2Var) != objBeachfront) {
                        w03Var = w03VarA;
                        w03Var2 = w03Var;
                        ((zt0) tn0Var2.b).getClass();
                        Unit unit2 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var, null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    w03Var = w03VarA;
                    w03Var2 = w03Var;
                    w03Var2.b(th);
                    if (!(th instanceof evenfall)) {
                        w03Var2.a(th);
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
            return objBeachfront;
        }
        if (i2 == 1) {
            w03Var3 = mg2Var.c;
            w03Var4 = mg2Var.b;
            tn0Var2 = mg2Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                ((zt0) tn0Var2.b).getClass();
                Unit unit3 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var3, null);
            } catch (Throwable th3) {
                th = th3;
                try {
                    w03Var4.b(th);
                    if (!(th instanceof evenfall)) {
                        w03Var4.a(th);
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
                        interaction.saneness.attabal(w03Var3, th4);
                        throw th5;
                    }
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var = mg2Var.c;
            w03Var2 = mg2Var.b;
            tn0Var2 = mg2Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                ((zt0) tn0Var2.b).getClass();
                Unit unit4 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var, null);
            } catch (Throwable th6) {
                th = th6;
                try {
                    w03Var2.b(th);
                    if (!(th instanceof evenfall)) {
                        w03Var2.a(th);
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
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        interaction.saneness.attabal(w03Var, th7);
                        throw th8;
                    }
                }
            }
        }
        return Unit.f29295attabal;
    }

    public final String a(Uri uri, int i) {
        if (this.a.J()) {
            String encodedQuery = uri.getEncodedQuery();
            return uri.buildUpon().clearQuery().appendQueryParameter("pa", String.valueOf(i)).build() + X3.j.c + encodedQuery;
        }
        String string = uri.toString();
        Intrinsics.beachfront(string);
        return string;
    }

    public final void a(Uri uri, h1 adConfiguration, ur commonConfiguration, e2 e2Var, Boolean bool, l13 l13Var) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        jk0 jk0Var = this.a;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:use_retry_strategy:enabled", X3.i.W);
        Boolean bool2 = Boolean.TRUE;
        jk jkVar = zk.b;
        if (((Boolean) jk0Var.a("gads:use_retry_strategy:enabled", bool2, jkVar)).booleanValue() && adConfiguration.t0 != null) {
            cutely.wireman(this.d, null, null, new og2(this, uri, adConfiguration, commonConfiguration, e2Var, bool, l13Var, null), 3, null);
            return;
        }
        if (e2Var != null && Intrinsics.wireman(bool, bool2)) {
            jk0 jk0Var2 = this.a;
            jk0Var2.getClass();
            Intrinsics.checkNotNullParameter("gads:ad_events_for_scar:enabled", X3.i.W);
            if (((Boolean) jk0Var2.a("gads:ad_events_for_scar:enabled", bool2, jkVar)).booleanValue() && adConfiguration.x0) {
                cutely.wireman(this.d, null, null, new ng2(this, uri, e2Var, l13Var, null), 3, null);
                return;
            }
        }
        b63 b63Var = this.f;
        Map mapA = this.g.a(uri);
        b63Var.getClass();
        Intrinsics.checkNotNullParameter(uri, "uri");
        b63Var.e.triweekly(new Pair(uri, mapA));
    }

    public static void a(qg2 qg2Var, List uris, h1 adConfiguration, ur commonConfiguration, e2 e2Var, Boolean bool, int i) {
        if ((i & 8) != 0) {
            e2Var = null;
        }
        e2 e2Var2 = e2Var;
        if ((i & 16) != 0) {
            bool = Boolean.FALSE;
        }
        Boolean bool2 = bool;
        qg2Var.getClass();
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Iterator it = uris.iterator();
        while (it.hasNext()) {
            qg2Var.a((Uri) it.next(), adConfiguration, commonConfiguration, e2Var2, bool2, null);
        }
    }

    public final void a(Uri uri, os1 os1Var, int i, long j, String str, Map map, e2 e2Var, h1 h1Var, Boolean bool, l13 l13Var) {
        if (i < os1Var.a) {
            cutely.wireman(this.d, null, null, new pg2(i, j, uri, h1Var, e2Var, os1Var, l13Var, this, bool, str, map, null), 3, null);
            return;
        }
        if (os1Var.c) {
            au1 au1Var = this.b;
            this.c.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String strA = a(uri, i + 1);
            st1 st1Var = st1.READY_TO_PING;
            tt1 pingRecord = new tt1(jElapsedRealtime, str, strA);
            au1Var.getClass();
            Intrinsics.checkNotNullParameter(pingRecord, "pingRecord");
            cutely.wireman(au1Var.a, null, null, new xt1(au1Var, new wt1(au1Var, pingRecord, null), null), 3, null);
        }
    }
}

package ads_mobile_sdk;

import com.google.gson.JsonObject;
import com.ironsource.X3;
import formularization.beachfront;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.juju;

/* JADX INFO: loaded from: classes.dex */
public final class ug {
    public final CoroutineContext a;
    public final yf b;
    public final amphitheatre c;
    public final jk0 d;
    public final formularization.attabal e;
    public vf f;
    public JsonObject g;

    public ug(CoroutineContext backgroundContext, yf appSettingsDataStore, amphitheatre clock, jk0 flags) {
        Intrinsics.checkNotNullParameter(backgroundContext, "backgroundContext");
        Intrinsics.checkNotNullParameter(appSettingsDataStore, "appSettingsDataStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = backgroundContext;
        this.b = appSettingsDataStore;
        this.c = clock;
        this.d = flags;
        this.e = beachfront.attabal(false);
        this.f = vf.w();
        this.g = new JsonObject();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0090 A[PHI: r9
  0x0090: PHI (r9v3 ads_mobile_sdk.ug) = (r9v1 ads_mobile_sdk.ug), (r9v1 ads_mobile_sdk.ug), (r9v8 ads_mobile_sdk.ug) binds: [B:23:0x007e, B:25:0x008d, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(ug ugVar, wretchedly.dern dernVar) {
        hg hgVar;
        formularization.attabal attabalVar;
        formularization.attabal attabalVar2;
        ug ugVar2;
        formularization.attabal attabalVar3;
        if (dernVar instanceof hg) {
            hgVar = (hg) dernVar;
            int i = hgVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                hgVar.e = i - Integer.MIN_VALUE;
            } else {
                hgVar = new hg(ugVar, dernVar);
            }
        } else {
            hgVar = new hg(ugVar, dernVar);
        }
        Object obj = hgVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = hgVar.e;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = ugVar.e;
                hgVar.a = ugVar;
                hgVar.b = attabalVar;
                hgVar.e = 1;
                if (attabalVar.attabal(null, hgVar) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                formularization.attabal attabalVar4 = hgVar.b;
                ug ugVar3 = hgVar.a;
                p002kotlin.dern.saneness(obj);
                attabalVar = attabalVar4;
                ugVar = ugVar3;
            } else {
                if (i2 == 2) {
                    ugVar = hgVar.a;
                    p002kotlin.dern.saneness(obj);
                    attabalVar2 = ugVar.e;
                    hgVar.a = ugVar;
                    hgVar.b = attabalVar2;
                    hgVar.e = 3;
                    if (attabalVar2.attabal(null, hgVar) != objBeachfront) {
                        ugVar2 = ugVar;
                        attabalVar3 = attabalVar2;
                    }
                    return objBeachfront;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar3 = hgVar.b;
                ugVar2 = hgVar.a;
                p002kotlin.dern.saneness(obj);
            }
            try {
                vf vfVar = ugVar2.f;
                attabalVar3.wireman(null);
                Intrinsics.beachfront(vfVar);
                return vfVar;
            } catch (Throwable th) {
                attabalVar3.wireman(null);
                throw th;
            }
            vf vfVar2 = ugVar.f;
            attabalVar.wireman(null);
            jk0 jk0Var = ugVar.d;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:app_settings_expiry_check_in_getter:enabled", X3.i.W);
            if (((Boolean) jk0Var.a("gads:app_settings_expiry_check_in_getter:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                Intrinsics.beachfront(vfVar2);
                hgVar.a = ugVar;
                hgVar.b = null;
                hgVar.e = 2;
                if (ugVar.a(vfVar2, hgVar) != objBeachfront) {
                    attabalVar2 = ugVar.e;
                    hgVar.a = ugVar;
                    hgVar.b = attabalVar2;
                    hgVar.e = 3;
                    if (attabalVar2.attabal(null, hgVar) != objBeachfront) {
                        ugVar2 = ugVar;
                        attabalVar3 = attabalVar2;
                        vf vfVar3 = ugVar2.f;
                        attabalVar3.wireman(null);
                        Intrinsics.beachfront(vfVar3);
                        return vfVar3;
                    }
                }
            } else {
                attabalVar2 = ugVar.e;
                hgVar.a = ugVar;
                hgVar.b = attabalVar2;
                hgVar.e = 3;
                if (attabalVar2.attabal(null, hgVar) != objBeachfront) {
                    ugVar2 = ugVar;
                    attabalVar3 = attabalVar2;
                    vf vfVar4 = ugVar2.f;
                    attabalVar3.wireman(null);
                    Intrinsics.beachfront(vfVar4);
                    return vfVar4;
                }
            }
            return objBeachfront;
        } catch (Throwable th2) {
            attabalVar.wireman(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0090 A[PHI: r9
  0x0090: PHI (r9v3 ads_mobile_sdk.ug) = (r9v1 ads_mobile_sdk.ug), (r9v1 ads_mobile_sdk.ug), (r9v8 ads_mobile_sdk.ug) binds: [B:23:0x007e, B:25:0x008d, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(ug ugVar, wretchedly.dern dernVar) {
        ig igVar;
        formularization.attabal attabalVar;
        formularization.attabal attabalVar2;
        ug ugVar2;
        formularization.attabal attabalVar3;
        if (dernVar instanceof ig) {
            igVar = (ig) dernVar;
            int i = igVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                igVar.e = i - Integer.MIN_VALUE;
            } else {
                igVar = new ig(ugVar, dernVar);
            }
        } else {
            igVar = new ig(ugVar, dernVar);
        }
        Object obj = igVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = igVar.e;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = ugVar.e;
                igVar.a = ugVar;
                igVar.b = attabalVar;
                igVar.e = 1;
                if (attabalVar.attabal(null, igVar) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                formularization.attabal attabalVar4 = igVar.b;
                ug ugVar3 = igVar.a;
                p002kotlin.dern.saneness(obj);
                attabalVar = attabalVar4;
                ugVar = ugVar3;
            } else {
                if (i2 == 2) {
                    ugVar = igVar.a;
                    p002kotlin.dern.saneness(obj);
                    attabalVar2 = ugVar.e;
                    igVar.a = ugVar;
                    igVar.b = attabalVar2;
                    igVar.e = 3;
                    if (attabalVar2.attabal(null, igVar) != objBeachfront) {
                        ugVar2 = ugVar;
                        attabalVar3 = attabalVar2;
                    }
                    return objBeachfront;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar3 = igVar.b;
                ugVar2 = igVar.a;
                p002kotlin.dern.saneness(obj);
            }
            try {
                return ugVar2.g;
            } finally {
                attabalVar3.wireman(null);
            }
            vf vfVar = ugVar.f;
            attabalVar.wireman(null);
            jk0 jk0Var = ugVar.d;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:app_settings_expiry_check_in_getter:enabled", X3.i.W);
            if (((Boolean) jk0Var.a("gads:app_settings_expiry_check_in_getter:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                Intrinsics.beachfront(vfVar);
                igVar.a = ugVar;
                igVar.b = null;
                igVar.e = 2;
                if (ugVar.a(vfVar, igVar) != objBeachfront) {
                    attabalVar2 = ugVar.e;
                    igVar.a = ugVar;
                    igVar.b = attabalVar2;
                    igVar.e = 3;
                    if (attabalVar2.attabal(null, igVar) != objBeachfront) {
                        ugVar2 = ugVar;
                        attabalVar3 = attabalVar2;
                        return ugVar2.g;
                    }
                }
            } else {
                attabalVar2 = ugVar.e;
                igVar.a = ugVar;
                igVar.b = attabalVar2;
                igVar.e = 3;
                if (attabalVar2.attabal(null, igVar) != objBeachfront) {
                    ugVar2 = ugVar;
                    attabalVar3 = attabalVar2;
                    return ugVar2.g;
                }
            }
            return objBeachfront;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, String str2, wretchedly.dern dernVar) {
        ng ngVar;
        ug ugVar;
        String str3;
        String str4;
        formularization.attabal attabalVar;
        if (dernVar instanceof ng) {
            ngVar = (ng) dernVar;
            int i = ngVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ngVar.g = i - Integer.MIN_VALUE;
            } else {
                ngVar = new ng(this, dernVar);
            }
        } else {
            ngVar = new ng(this, dernVar);
        }
        Object obj = ngVar.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ngVar.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            if (str == null) {
                return seminary.taiyuan();
            }
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            formularization.attabal attabalVar2 = this.e;
            ngVar.a = this;
            ngVar.b = lowerCase;
            ngVar.c = lowerCase2;
            ngVar.d = attabalVar2;
            ngVar.g = 1;
            if (attabalVar2.attabal(null, ngVar) == objBeachfront) {
                return objBeachfront;
            }
            ugVar = this;
            str3 = lowerCase;
            str4 = lowerCase2;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = ngVar.d;
            str4 = ngVar.c;
            str3 = ngVar.b;
            ugVar = ngVar.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            vf vfVar = ugVar.f;
            attabalVar.wireman(null);
            String str5 = str4 + "," + str3;
            ye1 ye1Var = (ye1) vfVar.p().get(str5);
            if (ye1Var == null) {
                Intrinsics.beachfront(vfVar);
                str5 = a(vfVar, str4, str3) + "," + str3;
                ye1Var = (ye1) vfVar.p().get(str5);
                if (ye1Var == null) {
                    return seminary.taiyuan();
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (td1 td1Var : ye1Var.o()) {
                for (String str6 : td1Var.o()) {
                    if (linkedHashMap.containsKey(str6)) {
                        y13.a("Duplicate adapter (" + str6 + ") for ad unit + format " + str5);
                    } else {
                        Intrinsics.beachfront(str6);
                        Map mapP = td1Var.p();
                        Intrinsics.checkNotNullExpressionValue(mapP, "getDataMap(...)");
                        linkedHashMap.put(str6, mapP);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, wretchedly.dern dernVar) {
        mg mgVar;
        ug ugVar;
        String str3;
        String str4;
        formularization.attabal attabalVar;
        if (dernVar instanceof mg) {
            mgVar = (mg) dernVar;
            int i = mgVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                mgVar.g = i - Integer.MIN_VALUE;
            } else {
                mgVar = new mg(this, dernVar);
            }
        } else {
            mgVar = new mg(this, dernVar);
        }
        Object obj = mgVar.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = mgVar.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            if (str == null) {
                return null;
            }
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            formularization.attabal attabalVar2 = this.e;
            mgVar.a = this;
            mgVar.b = lowerCase;
            mgVar.c = lowerCase2;
            mgVar.d = attabalVar2;
            mgVar.g = 1;
            if (attabalVar2.attabal(null, mgVar) == objBeachfront) {
                return objBeachfront;
            }
            ugVar = this;
            str3 = lowerCase;
            str4 = lowerCase2;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = mgVar.d;
            str4 = mgVar.c;
            str3 = mgVar.b;
            ugVar = mgVar.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            vf vfVar = ugVar.f;
            attabalVar.wireman(null);
            String str5 = (String) vfVar.q().get(str4 + "," + str3);
            if (str5 != null) {
                return str5;
            }
            Intrinsics.beachfront(vfVar);
            String strA = a(vfVar, str4, str3);
            return vfVar.q().get(strA + "," + str3);
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(wretchedly.dern dernVar) {
        jg jgVar;
        ug ugVar;
        formularization.attabal attabalVar;
        if (dernVar instanceof jg) {
            jgVar = (jg) dernVar;
            int i = jgVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jgVar.e = i - Integer.MIN_VALUE;
            } else {
                jgVar = new jg(this, dernVar);
            }
        } else {
            jgVar = new jg(this, dernVar);
        }
        Object obj = jgVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = jgVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.e;
            jgVar.a = this;
            jgVar.b = attabalVar2;
            jgVar.e = 1;
            if (attabalVar2.attabal(null, jgVar) == objBeachfront) {
                return objBeachfront;
            }
            ugVar = this;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = jgVar.b;
            ugVar = jgVar.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            String strV = ugVar.f.v();
            if (strV.length() == 0) {
                strV = null;
            }
            return strV;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fb, code lost:
    
        if (r2 == r4) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r17, java.lang.String r18, wretchedly.dern r19) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ug.a(java.lang.String, java.lang.String, wretchedly.dern):java.lang.Object");
    }

    public static String a(vf vfVar, String str, String str2) {
        Regex regex;
        String lowerCase;
        Map mapR = vfVar.r();
        String lowerCase2 = str2.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        z6 z6Var = (z6) mapR.get(lowerCase2);
        if (z6Var == null) {
            return "";
        }
        for (v6 v6Var : z6Var.o()) {
            List<String> listQ = v6Var.q();
            Intrinsics.checkNotNullExpressionValue(listQ, "getIncludingRegexesList(...)");
            if (!(listQ instanceof Collection) || !listQ.isEmpty()) {
                for (String str3 : listQ) {
                    Intrinsics.beachfront(str3);
                    Regex regex2 = new Regex(str3);
                    String lowerCase3 = str.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                    if (regex2.matches(lowerCase3)) {
                        List listP = v6Var.p();
                        Intrinsics.checkNotNullExpressionValue(listP, "getExcludingRegexesList(...)");
                        if (!(listP instanceof Collection) || !listP.isEmpty()) {
                            Iterator it = listP.iterator();
                            do {
                                if (it.hasNext()) {
                                    String str4 = (String) it.next();
                                    Intrinsics.beachfront(str4);
                                    regex = new Regex(str4);
                                    lowerCase = str.toLowerCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                }
                            } while (!regex.matches(lowerCase));
                        }
                        String strO = v6Var.o();
                        Intrinsics.checkNotNullExpressionValue(strO, "getEffectiveAdUnitId(...)");
                        String lowerCase4 = strO.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                        return lowerCase4;
                    }
                }
            }
        }
        return "";
    }

    public final boolean a(vf vfVar) {
        long rawValue;
        String strU = vfVar.u();
        Intrinsics.checkNotNullExpressionValue(strU, "getAppSettingsJson(...)");
        if (strU.length() == 0) {
            return true;
        }
        jk0 jk0Var = this.d;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:use_server_defined_cld_ttl:enabled", X3.i.W);
        if (((Boolean) jk0Var.a("gads:use_server_defined_cld_ttl:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            long jY = vfVar.y();
            DurationUnit durationUnit = DurationUnit.SECONDS;
            rawValue = p002kotlin.time.dern.graveside(jY, durationUnit);
            if (p002kotlin.time.saneness.kowloon(rawValue, companion.dern())) {
                jk0 jk0Var2 = this.d;
                jk0Var2.getClass();
                long jMolybdenite = p002kotlin.time.dern.molybdenite(-1, durationUnit);
                Intrinsics.checkNotNullParameter("gads:sdk_defined_cld_ttl_secs", X3.i.W);
                rawValue = ((p002kotlin.time.saneness) jk0Var2.a("gads:sdk_defined_cld_ttl_secs", p002kotlin.time.saneness.cutely(jMolybdenite), zk.l)).getRawValue();
            }
        } else {
            jk0 jk0Var3 = this.d;
            jk0Var3.getClass();
            p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
            rawValue = ((p002kotlin.time.saneness) jk0Var3.a("gads:sdk_defined_cld_ttl_secs", juju.attabal(-1, DurationUnit.SECONDS, "gads:sdk_defined_cld_ttl_secs", X3.i.W), zk.l)).getRawValue();
        }
        if (p002kotlin.time.saneness.formularize(rawValue, p002kotlin.time.saneness.INSTANCE.dern()) > 0) {
            this.c.getClass();
            if (p002kotlin.time.saneness.formularize(p002kotlin.time.dern.graveside(System.currentTimeMillis() - vfVar.x(), DurationUnit.MILLISECONDS), rawValue) > 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(vf vfVar, wretchedly.dern dernVar) {
        pg pgVar;
        formularization.attabal attabalVar;
        ug ugVar;
        if (dernVar instanceof pg) {
            pgVar = (pg) dernVar;
            int i = pgVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pgVar.e = i - Integer.MIN_VALUE;
            } else {
                pgVar = new pg(this, dernVar);
            }
        } else {
            pgVar = new pg(this, dernVar);
        }
        Object obj = pgVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = pgVar.e;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                if (!a(vfVar)) {
                    attabalVar = this.e;
                    pgVar.a = this;
                    pgVar.b = attabalVar;
                    pgVar.e = 1;
                    if (attabalVar.attabal(null, pgVar) == objBeachfront) {
                        return objBeachfront;
                    }
                    ugVar = this;
                }
                return Unit.f29295attabal;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = pgVar.b;
            ugVar = pgVar.a;
            p002kotlin.dern.saneness(obj);
            ugVar.f = vf.w();
            ugVar.g = new JsonObject();
            Unit unit = Unit.f29295attabal;
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (kotlinx.coroutines.impromptu.competently(r6, r8, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object a(ads_mobile_sdk.ug r5, com.google.gson.JsonObject r6, long r7, wretchedly.dern r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.qg
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.qg r0 = (ads_mobile_sdk.qg) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.qg r0 = new ads_mobile_sdk.qg
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p002kotlin.dern.saneness(r9)
            goto L78
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            ads_mobile_sdk.vf r5 = r0.b
            ads_mobile_sdk.ug r6 = r0.a
            p002kotlin.dern.saneness(r9)
            r7 = r5
            r5 = r6
            goto L63
        L3e:
            p002kotlin.dern.saneness(r9)
            kotlin.Pair r6 = ads_mobile_sdk.rv0.a(r6, r7)
            if (r6 != 0) goto L4a
            kotlin.Unit r5 = p002kotlin.Unit.f29295attabal
            return r5
        L4a:
            java.lang.Object r7 = r6.component1()
            ads_mobile_sdk.vf r7 = (ads_mobile_sdk.vf) r7
            java.lang.Object r6 = r6.component2()
            com.google.gson.JsonObject r6 = (com.google.gson.JsonObject) r6
            r0.a = r5
            r0.b = r7
            r0.e = r4
            java.lang.Object r6 = r5.a(r7, r6, r0)
            if (r6 != r1) goto L63
            goto L77
        L63:
            kotlin.coroutines.CoroutineContext r6 = r5.a
            ads_mobile_sdk.rg r8 = new ads_mobile_sdk.rg
            r9 = 0
            r8.<init>(r5, r7, r9)
            r0.a = r9
            r0.b = r9
            r0.e = r3
            java.lang.Object r5 = kotlinx.coroutines.impromptu.competently(r6, r8, r0)
            if (r5 != r1) goto L78
        L77:
            return r1
        L78:
            kotlin.Unit r5 = p002kotlin.Unit.f29295attabal
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ug.a(ads_mobile_sdk.ug, com.google.gson.JsonObject, long, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(vf vfVar, JsonObject jsonObject, wretchedly.dern dernVar) {
        sg sgVar;
        formularization.attabal attabalVar;
        ug ugVar;
        if (dernVar instanceof sg) {
            sgVar = (sg) dernVar;
            int i = sgVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sgVar.g = i - Integer.MIN_VALUE;
            } else {
                sgVar = new sg(this, dernVar);
            }
        } else {
            sgVar = new sg(this, dernVar);
        }
        Object obj = sgVar.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = sgVar.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = this.e;
            sgVar.a = this;
            sgVar.b = vfVar;
            sgVar.c = jsonObject;
            sgVar.d = attabalVar;
            sgVar.g = 1;
            if (attabalVar.attabal(null, sgVar) == objBeachfront) {
                return objBeachfront;
            }
            ugVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = sgVar.d;
            jsonObject = sgVar.c;
            vf vfVar2 = sgVar.b;
            ugVar = sgVar.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            vfVar = vfVar2;
        }
        try {
            ugVar.f = vfVar;
            ugVar.g = jsonObject;
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }
}

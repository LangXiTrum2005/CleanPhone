package ads_mobile_sdk;

import android.os.SystemClock;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import formularization.beachfront;
import java.util.LinkedHashMap;
import java.util.Locale;
import p002kotlin.Unit;
import p002kotlin.collections.cord;
import p002kotlin.collections.impassible;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;

/* JADX INFO: loaded from: classes.dex */
public final class uf2 {
    public final jk0 a;
    public final amphitheatre b;
    public final formularization.attabal c;
    public final LinkedHashMap d;

    public uf2(jk0 flags, amphitheatre clock) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.a = flags;
        this.b = clock;
        this.c = beachfront.saneness(false, 1, null);
        this.d = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static Object a(uf2 uf2Var, String str, wretchedly.dern dernVar) {
        rf2 rf2Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof rf2) {
            rf2Var = (rf2) dernVar;
            int i = rf2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                rf2Var.f = i - Integer.MIN_VALUE;
            } else {
                rf2Var = new rf2(uf2Var, dernVar);
            }
        } else {
            rf2Var = new rf2(uf2Var, dernVar);
        }
        Object obj = rf2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = rf2Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = uf2Var.c;
            rf2Var.a = uf2Var;
            rf2Var.b = str;
            rf2Var.c = attabalVar;
            rf2Var.f = 1;
            if (attabalVar.attabal(null, rf2Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = rf2Var.c;
            str = rf2Var.b;
            uf2 uf2Var2 = rf2Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            uf2Var = uf2Var2;
        }
        if (str != null) {
            try {
                jk0 jk0Var = uf2Var.a;
                jk0Var.getClass();
                Intrinsics.checkNotNullParameter("gads:ad_mob_ad_unit_pattern", X3.i.W);
                Intrinsics.checkNotNullParameter("^(ca-app-pub-[a-zA-Z0-9\\-]+)\\/([a-zA-Z0-9_\\-]+)(\\/.*)?$", "defaultValue");
                Regex regex = new Regex((String) jk0Var.a("gads:ad_mob_ad_unit_pattern", "^(ca-app-pub-[a-zA-Z0-9\\-]+)\\/([a-zA-Z0-9_\\-]+)(\\/.*)?$", zk.o));
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (regex.matches(lowerCase)) {
                    impassible impassibleVar = (impassible) uf2Var.d.get(str);
                    if (impassibleVar == null) {
                        impassibleVar = new impassible();
                    } else {
                        Intrinsics.beachfront(impassibleVar);
                    }
                    uf2Var.b.getClass();
                    impassibleVar.add(igo.attabal.marial(SystemClock.elapsedRealtime()));
                    while (!impassibleVar.isEmpty()) {
                        uf2Var.b.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Number) impassibleVar.first()).longValue();
                        jk0 jk0Var2 = uf2Var.a;
                        jk0Var2.getClass();
                        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                        long jMolybdenite = p002kotlin.time.dern.molybdenite(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, DurationUnit.MILLISECONDS);
                        Intrinsics.checkNotNullParameter("gads:request_throttler_window_ms", X3.i.W);
                        if (jElapsedRealtime <= p002kotlin.time.saneness.adultoid(((p002kotlin.time.saneness) jk0Var2.a("gads:request_throttler_window_ms", p002kotlin.time.saneness.cutely(jMolybdenite), zk.j)).getRawValue())) {
                            break;
                        }
                        cord.supplicat(impassibleVar);
                    }
                    int size = impassibleVar.size();
                    jk0 jk0Var3 = uf2Var.a;
                    jk0Var3.getClass();
                    Intrinsics.checkNotNullParameter("gads:request_throttler:max_failed_queries", X3.i.W);
                    if (size > ((Number) jk0Var3.a("gads:request_throttler:max_failed_queries", 3, zk.f)).intValue()) {
                        cord.supplicat(impassibleVar);
                    }
                    uf2Var.d.put(str, impassibleVar);
                    return Unit.f29295attabal;
                }
            } finally {
                attabalVar.wireman(null);
            }
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object b(uf2 uf2Var, String str, wretchedly.dern dernVar) {
        sf2 sf2Var;
        uf2 uf2Var2;
        formularization.attabal attabalVar;
        if (dernVar instanceof sf2) {
            sf2Var = (sf2) dernVar;
            int i = sf2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sf2Var.f = i - Integer.MIN_VALUE;
            } else {
                sf2Var = new sf2(uf2Var, dernVar);
            }
        } else {
            sf2Var = new sf2(uf2Var, dernVar);
        }
        Object obj = sf2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = sf2Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = uf2Var.c;
            sf2Var.a = uf2Var;
            sf2Var.b = str;
            sf2Var.c = attabalVar2;
            sf2Var.f = 1;
            if (attabalVar2.attabal(null, sf2Var) == objBeachfront) {
                return objBeachfront;
            }
            uf2Var2 = uf2Var;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = sf2Var.c;
            str = sf2Var.b;
            uf2Var2 = sf2Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            if (str == null) {
                Unit unit = Unit.f29295attabal;
                attabalVar.wireman(null);
                return unit;
            }
            attabalVar.wireman(null);
            return Unit.f29295attabal;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static Object c(uf2 uf2Var, String str, wretchedly.dern dernVar) {
        tf2 tf2Var;
        formularization.attabal attabalVar;
        if (dernVar instanceof tf2) {
            tf2Var = (tf2) dernVar;
            int i = tf2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                tf2Var.f = i - Integer.MIN_VALUE;
            } else {
                tf2Var = new tf2(uf2Var, dernVar);
            }
        } else {
            tf2Var = new tf2(uf2Var, dernVar);
        }
        Object obj = tf2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = tf2Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = uf2Var.c;
            tf2Var.a = uf2Var;
            tf2Var.b = str;
            tf2Var.c = attabalVar;
            tf2Var.f = 1;
            if (attabalVar.attabal(null, tf2Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = tf2Var.c;
            str = tf2Var.b;
            uf2 uf2Var2 = tf2Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            uf2Var = uf2Var2;
        }
        if (str != null) {
            try {
                jk0 jk0Var = uf2Var.a;
                jk0Var.getClass();
                Intrinsics.checkNotNullParameter("gads:ad_mob_ad_unit_pattern", X3.i.W);
                Intrinsics.checkNotNullParameter("^(ca-app-pub-[a-zA-Z0-9\\-]+)\\/([a-zA-Z0-9_\\-]+)(\\/.*)?$", "defaultValue");
                Regex regex = new Regex((String) jk0Var.a("gads:ad_mob_ad_unit_pattern", "^(ca-app-pub-[a-zA-Z0-9\\-]+)\\/([a-zA-Z0-9_\\-]+)(\\/.*)?$", zk.o));
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (regex.matches(lowerCase)) {
                    impassible impassibleVar = (impassible) uf2Var.d.get(str);
                    if (impassibleVar != null && !impassibleVar.isEmpty()) {
                        int size = impassibleVar.size();
                        jk0 jk0Var2 = uf2Var.a;
                        jk0Var2.getClass();
                        Intrinsics.checkNotNullParameter("gads:request_throttler:max_failed_queries", X3.i.W);
                        if (size >= ((Number) jk0Var2.a("gads:request_throttler:max_failed_queries", 3, zk.f)).intValue()) {
                            jk0 jk0Var3 = uf2Var.a;
                            jk0Var3.getClass();
                            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                            long jMolybdenite = p002kotlin.time.dern.molybdenite(5000, DurationUnit.MILLISECONDS);
                            Intrinsics.checkNotNullParameter("gads:request_throttler_timeout_ms", X3.i.W);
                            long jAdultoid = p002kotlin.time.saneness.adultoid(((p002kotlin.time.saneness) jk0Var3.a("gads:request_throttler_timeout_ms", p002kotlin.time.saneness.cutely(jMolybdenite), zk.j)).getRawValue());
                            uf2Var.b.getClass();
                            if (jAdultoid > SystemClock.elapsedRealtime() - ((Number) impassibleVar.last()).longValue()) {
                                return igo.attabal.attabal(true);
                            }
                        }
                        return igo.attabal.attabal(false);
                    }
                    return igo.attabal.attabal(false);
                }
            } finally {
                attabalVar.wireman(null);
            }
        }
        return igo.attabal.attabal(false);
    }

    public final Object a(String str, ct1 ct1Var) {
        return c(this, str, ct1Var);
    }
}

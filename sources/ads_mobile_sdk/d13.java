package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.AdError;
import com.google.common.base.triweekly;
import com.ironsource.X3;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.saran;
import p002kotlin.collections.polder;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.random.Random;
import p002kotlin.text.dovishness;
import patroclinal.formularize;
import saneness.amphitheatre;
import saneness.delouse;
import saneness.interior;
import saneness.loun;
import saneness.sweatshop;

/* JADX INFO: loaded from: classes.dex */
public final class d13 implements loun {
    public final Context a;
    public final jk0 b;
    public final amphitheatre c;
    public final n13 d;
    public final lf0 e;
    public final String f;
    public final String g;
    public final String h;
    public final delouse i;
    public final sc0 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public Map o;

    public d13(Context applicationContext, jk0 flags, amphitheatre clock, n13 traceReporter, lf0 exceptionReporter, String applicationId, String afmaVersionString, String gmaVersion, delouse chromeVariationsProvider, sc0 deviceTierManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(traceReporter, "traceReporter");
        Intrinsics.checkNotNullParameter(exceptionReporter, "exceptionReporter");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(afmaVersionString, "afmaVersionString");
        Intrinsics.checkNotNullParameter(gmaVersion, "gmaVersion");
        Intrinsics.checkNotNullParameter(chromeVariationsProvider, "chromeVariationsProvider");
        Intrinsics.checkNotNullParameter(deviceTierManager, "deviceTierManager");
        this.a = applicationContext;
        this.b = flags;
        this.c = clock;
        this.d = traceReporter;
        this.e = exceptionReporter;
        this.f = applicationId;
        this.g = afmaVersionString;
        this.h = gmaVersion;
        this.i = chromeVariationsProvider;
        this.j = deviceTierManager;
        this.o = seminary.taiyuan();
    }

    public final void a(saran backgroundScope) {
        String value;
        long jDoubleValue;
        PackageInfo packageInfo;
        Double dValueOf = Double.valueOf(0.01d);
        Double dValueOf2 = Double.valueOf(0.2d);
        Double dValueOf3 = Double.valueOf(0.1d);
        Double dValueOf4 = Double.valueOf(1.0d);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        this.j.a();
        x03.a = this;
        String value2 = this.a.getPackageName();
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager == null || (packageInfo = packageManager.getPackageInfo(this.a.getPackageName(), 128)) == null || (value = packageInfo.versionName) == null) {
            value = "";
        }
        interior builder = vo0.o();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(qo0.OS_ANDROID, "value");
        builder.dent();
        String value3 = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(value3, "RELEASE");
        Intrinsics.checkNotNullParameter(value3, "value");
        builder.gusty(value3);
        String value4 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(value4, "MODEL");
        Intrinsics.checkNotNullParameter(value4, "value");
        builder.sensatory(value4);
        int i = Build.VERSION.SDK_INT;
        builder.lotta(i);
        String value5 = this.g;
        Intrinsics.checkNotNullParameter(value5, "value");
        builder.unconsolidated(value5);
        String value6 = this.h;
        Intrinsics.checkNotNullParameter(value6, "value");
        builder.treadless(value6);
        Intrinsics.beachfront(value2);
        Intrinsics.checkNotNullParameter(value2, "value");
        builder.walach(value2);
        Intrinsics.checkNotNullParameter(value, "value");
        builder.clubfoot(value);
        String value7 = this.f;
        Intrinsics.checkNotNullParameter(value7, "value");
        builder.seminary(value7);
        String value8 = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(value8, "getCountry(...)");
        Intrinsics.checkNotNullParameter(value8, "value");
        builder.empress(value8);
        Object obj = this.j.b.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        dc0 value9 = (dc0) obj;
        Intrinsics.checkNotNullParameter(value9, "value");
        builder.impromptu(value9);
        Object obj2 = this.j.c.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        ec0 value10 = (ec0) obj2;
        Intrinsics.checkNotNullParameter(value10, "value");
        builder.taiyuan(value10);
        builder.restrictive(((ik) this.b.a).p);
        builder.oilcan(((ik) this.b.a).n);
        builder.peridotite(((ik) this.b.a).o);
        jk0 jk0Var = this.b;
        jk0Var.getClass();
        String str = X3.i.W;
        Intrinsics.checkNotNullParameter("gads:cui_monitoring_session_sample_rate", X3.i.W);
        String value11 = value;
        lk lkVar = zk.c;
        if (((Number) jk0Var.a("gads:cui_monitoring_session_sample_rate", dValueOf3, lkVar)).doubleValue() > 0.0d) {
            jk0 jk0Var2 = this.b;
            jk0Var2.getClass();
            Intrinsics.checkNotNullParameter("gads:cui_monitoring_session_sample_rate", X3.i.W);
            jDoubleValue = (long) (((double) 1) / ((Number) jk0Var2.a("gads:cui_monitoring_session_sample_rate", dValueOf3, lkVar)).doubleValue());
        } else {
            jDoubleValue = 0;
        }
        builder.overspeculate(jDoubleValue);
        xm0 xm0VarA = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        vo0 baseMessage = (vo0) xm0VarA;
        sweatshop builder2 = co0.p();
        Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder2, "builder");
        Intrinsics.checkNotNullParameter(gc1.OS_ANDROID, "value");
        builder2.preprohormone();
        Intrinsics.checkNotNullExpressionValue(value3, "RELEASE");
        Intrinsics.checkNotNullParameter(value3, "value");
        builder2.restrictive(value3);
        Intrinsics.checkNotNullExpressionValue(value4, "MODEL");
        Intrinsics.checkNotNullParameter(value4, "value");
        builder2.stratoscope(value4);
        builder2.triweekly(i);
        String value12 = this.h;
        Intrinsics.checkNotNullParameter(value12, "value");
        builder2.polder(value12);
        String value13 = this.g;
        Intrinsics.checkNotNullParameter(value13, "value");
        builder2.formularize(value13);
        Intrinsics.checkNotNullParameter(value2, "value");
        builder2.adultoid(value2);
        Intrinsics.checkNotNullParameter(value11, "value");
        builder2.gintrap(value11);
        String value14 = this.f;
        Intrinsics.checkNotNullParameter(value14, "value");
        builder2.monoploid(value14);
        String value15 = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(value15, "getCountry(...)");
        Intrinsics.checkNotNullParameter(value15, "value");
        builder2.cuirassed(value15);
        xm0 xm0VarA2 = builder2.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA2, "build(...)");
        co0 co0Var = (co0) xm0VarA2;
        Random.Companion companion = Random.INSTANCE;
        double dNextDouble = companion.nextDouble(1.0d);
        jk0 jk0Var3 = this.b;
        jk0Var3.getClass();
        Intrinsics.checkNotNullParameter("gads:cui_monitoring_session_sample_rate", X3.i.W);
        this.k = dNextDouble < ((Number) jk0Var3.a("gads:cui_monitoring_session_sample_rate", dValueOf3, lkVar)).doubleValue();
        double dNextDouble2 = companion.nextDouble(1.0d);
        jk0 jk0Var4 = this.b;
        jk0Var4.getClass();
        String str2 = "gads:trapped_exception_monitoring_session_sample_rate";
        Intrinsics.checkNotNullParameter("gads:trapped_exception_monitoring_session_sample_rate", X3.i.W);
        this.l = dNextDouble2 < ((Number) jk0Var4.a("gads:trapped_exception_monitoring_session_sample_rate", dValueOf3, lkVar)).doubleValue();
        double dNextDouble3 = companion.nextDouble(1.0d);
        jk0 jk0Var5 = this.b;
        jk0Var5.getClass();
        Intrinsics.checkNotNullParameter("gads:untrapped_exception_monitoring_session_sample_rate", X3.i.W);
        this.m = dNextDouble3 < ((Number) jk0Var5.a("gads:untrapped_exception_monitoring_session_sample_rate", dValueOf4, lkVar)).doubleValue();
        double dNextDouble4 = companion.nextDouble(1.0d);
        jk0 jk0Var6 = this.b;
        jk0Var6.getClass();
        Intrinsics.checkNotNullParameter("gads:cui_monitoring_trace_failure_stacktrace_rate", X3.i.W);
        this.n = dNextDouble4 < ((Number) jk0Var6.a("gads:cui_monitoring_trace_failure_stacktrace_rate", dValueOf, lkVar)).doubleValue();
        jk0 jk0Var7 = this.b;
        jk0Var7.getClass();
        Map defaultValue = seminary.impassible(formularize.attabal(String.valueOf(no0.CUI_NAME_ADREQUEST.getNumber()), dValueOf2), formularize.attabal(String.valueOf(no0.CUI_NAME_SDKINIT_SDKCORE.getNumber()), dValueOf2), formularize.attabal(String.valueOf(no0.CUI_NAME_WEBVIEW_INITIALIZATION.getNumber()), dValueOf2), formularize.attabal(String.valueOf(no0.CUI_NAME_WEBVIEW_LOAD.getNumber()), dValueOf2), formularize.attabal(String.valueOf(no0.CUI_NAME_INSTALL_REFERRER_DETAILS.getNumber()), dValueOf4), formularize.attabal(String.valueOf(no0.CUI_NAME_INSTALL_REFERRER_TASK.getNumber()), dValueOf4), formularize.attabal(String.valueOf(no0.CUI_NAME_POST_CLICK_LIFECYCLE_MONITORING.getNumber()), dValueOf4));
        Intrinsics.checkNotNullParameter("gads:per_trace_sample_rate_up_sampling", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Map map = (Map) jk0Var7.a("gads:per_trace_sample_rate_up_sampling", defaultValue, zk.q);
        LinkedHashMap linkedHashMap = new LinkedHashMap(polder.marial(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            String str3 = str2;
            linkedHashMap.put(entry.getKey(), Boolean.valueOf(Random.INSTANCE.nextDouble(1.0d) < ((Number) entry.getValue()).doubleValue()));
            str2 = str3;
        }
        String str4 = str2;
        this.o = linkedHashMap;
        vo chromeVariationsProvider = (vo) this.i.get();
        n13 n13Var = this.d;
        Intrinsics.beachfront(chromeVariationsProvider);
        n13Var.getClass();
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(baseMessage, "baseMessage");
        Intrinsics.checkNotNullParameter(chromeVariationsProvider, "chromeVariationsProvider");
        jk0 jk0Var8 = n13Var.c;
        jk0Var8.getClass();
        Map defaultValue2 = seminary.impassible(formularize.attabal(String.valueOf(no0.CUI_NAME_SIGNAL.getNumber()), dValueOf3), formularize.attabal(String.valueOf(no0.CUI_NAME_SIGNAL_UPDATE_SIGNALS.getNumber()), dValueOf));
        Intrinsics.checkNotNullParameter("gads:per_trace_sample_rate_down_sampling", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue2, "defaultValue");
        Map map2 = (Map) jk0Var8.a("gads:per_trace_sample_rate_down_sampling", defaultValue2, zk.q);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(polder.marial(map2.size()));
        for (Map.Entry entry2 : map2.entrySet()) {
            co0 co0Var2 = co0Var;
            String str5 = str;
            linkedHashMap2.put(entry2.getKey(), Boolean.valueOf(Random.INSTANCE.nextDouble(1.0d) < ((Number) entry2.getValue()).doubleValue()));
            str = str5;
            co0Var = co0Var2;
        }
        co0 baseMessage2 = co0Var;
        String str6 = str;
        n13Var.k = linkedHashMap2;
        n13Var.a(backgroundScope, baseMessage, chromeVariationsProvider);
        lf0 lf0Var = this.e;
        lf0Var.getClass();
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(baseMessage2, "baseMessage");
        Intrinsics.checkNotNullParameter(chromeVariationsProvider, "chromeVariationsProvider");
        jk0 jk0Var9 = lf0Var.c;
        jk0Var9.getClass();
        Intrinsics.checkNotNullParameter(str4, str6);
        lk lkVar2 = zk.c;
        if (((Number) jk0Var9.a(str4, dValueOf3, lkVar2)).doubleValue() > 0.0d) {
            jk0 jk0Var10 = lf0Var.c;
            jk0Var10.getClass();
            Intrinsics.checkNotNullParameter(str4, str6);
            lf0Var.k = (long) (((double) 1) / ((Number) jk0Var10.a(str4, dValueOf3, lkVar2)).doubleValue());
        }
        jk0 jk0Var11 = lf0Var.c;
        jk0Var11.getClass();
        Intrinsics.checkNotNullParameter("gads:untrapped_exception_monitoring_session_sample_rate", str6);
        if (((Number) jk0Var11.a("gads:untrapped_exception_monitoring_session_sample_rate", dValueOf4, lkVar2)).doubleValue() > 0.0d) {
            jk0 jk0Var12 = lf0Var.c;
            jk0Var12.getClass();
            Intrinsics.checkNotNullParameter("gads:untrapped_exception_monitoring_session_sample_rate", str6);
            lf0Var.l = (long) (((double) 1) / ((Number) jk0Var12.a("gads:untrapped_exception_monitoring_session_sample_rate", dValueOf4, lkVar2)).doubleValue());
        }
        lf0Var.a(backgroundScope, baseMessage2, chromeVariationsProvider);
    }

    public final void a(String label, Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(label, "label");
        triweekly triweeklyVar = kn0.a;
        kn0.a(new a13(label, exception));
        if (this.l) {
            lf0 lf0Var = this.e;
            w03 w03Var = j13.b().a;
            l13 l13Var = w03Var != null ? w03Var.a : null;
            this.c.getClass();
            lf0Var.a(new nf0(exception, label, l13Var, true, System.currentTimeMillis()));
        }
    }

    public final void a(Throwable exception) throws InterruptedException {
        Intrinsics.checkNotNullParameter(exception, "exception");
        triweekly triweeklyVar = kn0.a;
        kn0.a(new b13(exception));
        if (this.m) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable cause = exception; cause != null; cause = cause.getCause()) {
                StackTraceElement[] stackTrace = cause.getStackTrace();
                Intrinsics.beachfront(stackTrace);
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String className = stackTraceElement.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                    if (dovishness.starveling(className, AdError.GOOGLE_MOBILE_ADS_DOMAIN, false, 2, null)) {
                        z = true;
                    }
                    if (Intrinsics.wireman(stackTraceElement.getClassName(), d13.class.getName()) || Intrinsics.wireman(stackTraceElement.getClassName(), lf0.class.getName())) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (z && !z2) {
                lf0 lf0Var = this.e;
                this.c.getClass();
                lf0Var.a(new nf0(exception, "UNTRAPPED_EXCEPTION", null, false, System.currentTimeMillis()));
            }
        }
        impromptu.marial(dhss.f32190kowloon, new c13(this, null));
    }
}

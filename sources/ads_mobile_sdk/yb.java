package ads_mobile_sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.WindowManager;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.cutely;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.gintrap;
import p002kotlin.text.Charsets;
import p002kotlin.text.StringsKt;
import saneness.amphitheatre;
import saneness.productile;
import saneness.rsp;
import saneness.sweatshop;

/* JADX INFO: loaded from: classes.dex */
public final class yb {
    public final Context a;
    public final amphitheatre b;
    public final iv c;
    public final vo d;
    public final jk0 e;
    public final co0 f;

    public yb(Context context, String applicationId, String afmaVersionString, String gmaVersion, amphitheatre clock, iv consentManager, vo chromeVariationsProvider, jk0 flags) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(afmaVersionString, "afmaVersionString");
        Intrinsics.checkNotNullParameter(gmaVersion, "gmaVersion");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(chromeVariationsProvider, "chromeVariationsProvider");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = context;
        this.b = clock;
        this.c = consentManager;
        this.d = chromeVariationsProvider;
        this.e = flags;
        Rect rectA = a();
        PackageManager packageManager = context.getPackageManager();
        String str = (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 128)) == null || (str = packageInfo.versionName) == null) ? "" : str;
        sweatshop sweatshopVarP = co0.p();
        Intrinsics.checkNotNullExpressionValue(sweatshopVarP, "newBuilder(...)");
        eo0 eo0VarAttabal = rsp.attabal(sweatshopVarP);
        eo0VarAttabal.b();
        eo0VarAttabal.c();
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        eo0VarAttabal.g(RELEASE);
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        eo0VarAttabal.f(MODEL);
        eo0VarAttabal.c(Build.VERSION.SDK_INT);
        eo0VarAttabal.h(gmaVersion);
        eo0VarAttabal.a(afmaVersionString);
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        eo0VarAttabal.c(packageName);
        eo0VarAttabal.d(str);
        eo0VarAttabal.b(applicationId);
        String country = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        eo0VarAttabal.e(country);
        eo0VarAttabal.b(rectA.width());
        eo0VarAttabal.a(rectA.height());
        this.f = eo0VarAttabal.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(wretchedly.dern dernVar) {
        xb xbVar;
        String value;
        yb ybVar;
        mo value2;
        ActivityManager.MemoryInfo memoryInfo;
        eo0 eo0Var;
        eo0 eo0Var2;
        eo0 eo0Var3;
        if (dernVar instanceof xb) {
            xbVar = (xb) dernVar;
            int i = xbVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                xbVar.i = i - Integer.MIN_VALUE;
            } else {
                xbVar = new xb(this, dernVar);
            }
        } else {
            xbVar = new xb(this, dernVar);
        }
        Object objF = xbVar.g;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = xbVar.i;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objF);
            Thread thread = Looper.getMainLooper().getThread();
            Intrinsics.checkNotNullExpressionValue(thread, "getThread(...)");
            StackTraceElement[] stackTrace = thread.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            String value3 = polloi.lerp(stackTrace, "\n", null, null, 0, null, null, 62, null);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] bytes = value3.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                messageDigest.update(bytes);
                gintrap gintrapVar = gintrap.f29390attabal;
                value = String.format(Locale.US, "%032X", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest())}, 1));
                Intrinsics.checkNotNullExpressionValue(value, "format(...)");
            } catch (Exception unused) {
                value = null;
            }
            if (value == null) {
                value = "";
            }
            Object systemService = this.a.getSystemService("activity");
            Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo2);
            vo voVar = this.d;
            no noVar = voVar.j;
            if (noVar == null) {
                cutely.wireman(voVar.c, null, null, new to(voVar, null), 3, null);
            }
            mo moVar = noVar != null ? noVar.b : null;
            vm0 vm0VarN = this.f.n();
            Intrinsics.checkNotNullExpressionValue(vm0VarN, "toBuilder(...)");
            sweatshop builder = (sweatshop) vm0VarN;
            Intrinsics.checkNotNullParameter(builder, "builder");
            eo0 eo0Var4 = new eo0(builder);
            this.b.getClass();
            builder.graveside(System.currentTimeMillis());
            Intrinsics.checkNotNullParameter(value3, "value");
            builder.saran(value3);
            Intrinsics.checkNotNullParameter(value, "value");
            builder.grimness(value);
            iv ivVar = this.c;
            xbVar.a = this;
            xbVar.b = memoryInfo2;
            xbVar.c = moVar;
            xbVar.d = eo0Var4;
            xbVar.e = eo0Var4;
            xbVar.f = eo0Var4;
            xbVar.i = 1;
            ivVar.getClass();
            objF = iv.f(ivVar, xbVar);
            if (objF == objBeachfront) {
                return objBeachfront;
            }
            ybVar = this;
            value2 = moVar;
            memoryInfo = memoryInfo2;
            eo0Var = eo0Var4;
            eo0Var2 = eo0Var;
            eo0Var3 = eo0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eo0Var = xbVar.f;
            eo0Var2 = xbVar.e;
            eo0Var3 = xbVar.d;
            value2 = xbVar.c;
            memoryInfo = xbVar.b;
            ybVar = xbVar.a;
            p002kotlin.dern.saneness(objF);
        }
        String str = (String) objF;
        String value4 = str != null ? str : "";
        eo0Var.getClass();
        Intrinsics.checkNotNullParameter(value4, "value");
        eo0Var.a.seminary(value4);
        eo0Var2.a.molybdenite(Runtime.getRuntime().availableProcessors());
        eo0Var2.a.dovishness(memoryInfo.totalMem);
        eo0Var2.a.dern(memoryInfo.availMem);
        eo0Var2.a.kowloon(memoryInfo.threshold);
        eo0Var2.a.impromptu(memoryInfo.lowMemory);
        if (value2 == null) {
            productile builder2 = mo.o();
            Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder2, "builder");
            xm0 xm0VarA = builder2.a();
            Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
            value2 = (mo) xm0VarA;
        }
        Intrinsics.checkNotNullParameter(value2, "value");
        eo0Var2.a.marial(value2);
        List listPolloi = eo0Var2.a.polloi();
        Intrinsics.checkNotNullExpressionValue(listPolloi, "getExperimentIdList(...)");
        yd0 yd0Var = new yd0(listPolloi);
        List listSplit$default = StringsKt.split$default(ybVar.e.s.dern(), new String[]{","}, false, 0, 6, null);
        ArrayList values = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            Long lGraveside = StringsKt.graveside((String) it.next());
            if (lGraveside != null) {
                values.add(lGraveside);
            }
        }
        Intrinsics.checkNotNullParameter(yd0Var, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        eo0Var2.a.competently(values);
        return eo0Var3.a();
    }

    public final Rect a() {
        Rect bounds;
        Object systemService = this.a.getSystemService("window");
        Intrinsics.competently(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            bounds = windowManager.getMaximumWindowMetrics().getBounds();
        } else {
            Rect rect = new Rect();
            windowManager.getDefaultDisplay().getRectSize(rect);
            bounds = rect;
        }
        Intrinsics.beachfront(bounds);
        return bounds;
    }
}

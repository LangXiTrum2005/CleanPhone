package ads_mobile_sdk;

import com.ironsource.X3;
import formularization.beachfront;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.asbestiform;
import saneness.dudder;
import saneness.hobby;
import saneness.libyan;
import saneness.naomi;
import saneness.observability;
import saneness.pancuronium;
import saneness.rictus;
import saneness.stonecrop;
import saneness.sulfarsenide;
import saneness.undertread;

/* JADX INFO: loaded from: classes.dex */
public final class gk2 implements undertread, observability {
    public final hobby a;
    public final yf2 b;
    public final jk0 c;
    public final ck2 d;
    public final formularization.attabal e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final stonecrop i;
    public final LinkedHashMap j;

    public gk2(String afmaVersion, h1 adConfiguration, ip0 gmaUtil, hobby httpClient, yf2 requestType, jk0 flags) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = httpClient;
        this.b = requestType;
        this.c = flags;
        ck2 ck2Var = adConfiguration.l0;
        this.d = ck2Var;
        this.e = beachfront.saneness(false, 1, null);
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        stonecrop stonecropVarImpromptu = w10.o().impromptu();
        wx0 wx0Var = adConfiguration.H;
        String str3 = "";
        stonecrop stonecropVarCompetently = stonecropVarImpromptu.competently((wx0Var == null || (str2 = wx0Var.b) == null) ? "" : str2);
        wx0 wx0Var2 = adConfiguration.H;
        if (wx0Var2 != null && (str = wx0Var2.b) != null) {
            str3 = str;
        }
        stonecrop stonecropVarBeachfront = stonecropVarCompetently.beachfront(str3);
        rictus rictusVarO = jz.o();
        Intrinsics.checkNotNullExpressionValue(rictusVarO, "newBuilder(...)");
        nq nqVarAttabal = asbestiform.attabal(rictusVarO);
        nqVarAttabal.a(ck2Var.a);
        Unit unit = Unit.f29295attabal;
        stonecrop stonecropVarDern = stonecropVarBeachfront.dern(nqVarAttabal.a());
        sulfarsenide sulfarsenideVarO = f10.o();
        Intrinsics.checkNotNullExpressionValue(sulfarsenideVarO, "newBuilder(...)");
        pq pqVarAttabal = pancuronium.attabal(sulfarsenideVarO);
        pqVarAttabal.a(afmaVersion);
        pqVarAttabal.a(gmaUtil.c());
        this.i = stonecropVarDern.attabal(pqVarAttabal.a());
        this.j = new LinkedHashMap();
    }

    public static Object a(gk2 gk2Var, String str, b10 b10Var, wretchedly.dern dernVar) {
        Map mapTaiyuan = seminary.taiyuan();
        gk2Var.getClass();
        return a(gk2Var, str, b10Var, mapTaiyuan, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
    
        if (saneness.hobby.saneness(r2, r9, null, r0, 14) == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(wretchedly.dern r9) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.gk2.b(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static Object a(gk2 gk2Var, String str, b10 b10Var, Map map, wretchedly.dern dernVar) throws Throwable {
        dk2 dk2Var;
        formularization.attabal attabalVar;
        String str2;
        b10 b10Var2;
        Map map2;
        Object obj;
        gk2 gk2Var2 = gk2Var;
        if (dernVar instanceof dk2) {
            dk2Var = (dk2) dernVar;
            int i = dk2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                dk2Var.h = i - Integer.MIN_VALUE;
            } else {
                dk2Var = new dk2(gk2Var2, dernVar);
            }
        } else {
            dk2Var = new dk2(gk2Var2, dernVar);
        }
        Object obj2 = dk2Var.f;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = dk2Var.h;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj2);
            attabalVar = gk2Var2.e;
            dk2Var.a = gk2Var2;
            str2 = str;
            dk2Var.b = str2;
            b10Var2 = b10Var;
            dk2Var.c = b10Var2;
            map2 = map;
            dk2Var.d = map2;
            dk2Var.e = attabalVar;
            dk2Var.h = 1;
            if (attabalVar.attabal(null, dk2Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = dk2Var.e;
            Map map3 = dk2Var.d;
            b10 b10Var3 = dk2Var.c;
            String str3 = dk2Var.b;
            gk2 gk2Var3 = dk2Var.a;
            p002kotlin.dern.saneness(obj2);
            attabalVar = attabalVar2;
            gk2Var2 = gk2Var3;
            map2 = map3;
            b10Var2 = b10Var3;
            str2 = str3;
        }
        try {
            libyan libyanVar = (libyan) gk2Var2.j.get(str2);
            if (b10Var2 == b10.AD_RESOURCE_AUTO_CLICK_DESTINATION) {
                if (libyanVar != null) {
                    try {
                        libyanVar.dern(b10Var2);
                    } catch (Throwable th) {
                        th = th;
                        obj = null;
                    }
                }
                Unit unit = Unit.f29295attabal;
                attabalVar.wireman(null);
                return unit;
            }
            LinkedHashMap linkedHashMap = gk2Var2.j;
            libyan libyanVarMarial = d10.o().dern(b10Var2).attabal(gk2Var2.j.size()).marial(str2);
            naomi builder = zz.o();
            Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (!gk2Var2.d.e.isEmpty()) {
                for (Map.Entry entry : map2.entrySet()) {
                    String str4 = (String) entry.getKey();
                    String str5 = (String) entry.getValue();
                    List list = gk2Var2.d.e;
                    Locale ENGLISH = Locale.ENGLISH;
                    gk2 gk2Var4 = gk2Var2;
                    Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                    String lowerCase = str4.toLowerCase(ENGLISH);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (list.contains(lowerCase)) {
                        List listDern = builder.dern();
                        Intrinsics.checkNotNullExpressionValue(listDern, "getHeadersList(...)");
                        yd0 yd0Var = new yd0(listDern);
                        dudder builder2 = vz.o();
                        Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
                        Intrinsics.checkNotNullParameter(builder2, "builder");
                        in value = kn.a(str4);
                        Intrinsics.checkNotNullExpressionValue(value, "copyFromUtf8(...)");
                        Intrinsics.checkNotNullParameter(value, "value");
                        builder2.attabal(value);
                        in value2 = kn.a(str5);
                        Intrinsics.checkNotNullExpressionValue(value2, "copyFromUtf8(...)");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        builder2.dern(value2);
                        xm0 xm0VarA = builder2.a();
                        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
                        vz value3 = (vz) xm0VarA;
                        Intrinsics.checkNotNullParameter(yd0Var, "<this>");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        builder.attabal(value3);
                    }
                    gk2Var2 = gk2Var4;
                }
            }
            xm0 xm0VarA2 = builder.a();
            Intrinsics.checkNotNullExpressionValue(xm0VarA2, "build(...)");
            libyan libyanVarWireman = libyanVarMarial.wireman((zz) xm0VarA2);
            Intrinsics.checkNotNullExpressionValue(libyanVarWireman, "setRequest(...)");
            linkedHashMap.put(str2, libyanVarWireman);
            Unit unit2 = Unit.f29295attabal;
            attabalVar.wireman(null);
            return unit2;
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
        attabalVar.wireman(obj);
        throw th;
    }

    public final Object b(String str, wretchedly.dern dernVar) {
        kn0.b("Blocked click action", null);
        this.h.set(true);
        Object objA = a(this, str, b10.AD_RESOURCE_AUTO_CLICK_DESTINATION, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.undertread
    public final Object a(wretchedly.dern dernVar) {
        Object objB = b(dernVar);
        return objB == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objB : Unit.f29295attabal;
    }

    public final Object a(String str, sy1 sy1Var) {
        return a(this, str, sy1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(gk2 gk2Var, String str, wretchedly.dern dernVar) {
        fk2 fk2Var;
        gk2 gk2Var2;
        formularization.attabal attabalVar;
        if (dernVar instanceof fk2) {
            fk2Var = (fk2) dernVar;
            int i = fk2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fk2Var.f = i - Integer.MIN_VALUE;
            } else {
                fk2Var = new fk2(gk2Var, dernVar);
            }
        } else {
            fk2Var = new fk2(gk2Var, dernVar);
        }
        Object obj = fk2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = fk2Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = gk2Var.e;
            fk2Var.a = gk2Var;
            fk2Var.b = str;
            fk2Var.c = attabalVar2;
            fk2Var.f = 1;
            if (attabalVar2.attabal(null, fk2Var) == objBeachfront) {
                return objBeachfront;
            }
            gk2Var2 = gk2Var;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = fk2Var.c;
            str = fk2Var.b;
            gk2Var2 = fk2Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            gk2Var2.i.wireman(str);
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    public final boolean a() {
        yf2 yf2Var;
        jk0 jk0Var = this.c;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:native_click_protection:enabled", X3.i.W);
        return (!((Boolean) jk0Var.a("gads:native_click_protection:enabled", Boolean.FALSE, zk.b)).booleanValue() && ((yf2Var = this.b) == yf2.i || yf2Var == yf2.g)) || !this.d.d || this.g.get();
    }
}

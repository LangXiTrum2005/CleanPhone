package ads_mobile_sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import com.ironsource.L6;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import formularization.beachfront;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.saran;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import patroclinal.formularize;
import saneness.amphitheatre;
import saneness.laky;
import saneness.minuteness;

/* JADX INFO: loaded from: classes.dex */
public final class u20 {
    public final saran a;
    public final jk0 b;
    public final amphitheatre c;
    public final rg2 d;
    public final formularization.attabal e;
    public final Map f;
    public final ArrayList g;
    public final LinkedHashMap h;

    public u20(saran backgroundScope, Context context, jk0 flags, amphitheatre clock, rg2 urlPinger, yf2 requestType, qc0 deviceProperties, ur commonConfiguration) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(urlPinger, "urlPinger");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(deviceProperties, "deviceProperties");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        this.a = backgroundScope;
        this.b = flags;
        this.c = clock;
        this.d = urlPinger;
        this.e = beachfront.saneness(false, 1, null);
        this.f = seminary.kowloon(formularize.attabal("ad_format", requestType.a()), formularize.attabal("api_v", String.valueOf(Build.VERSION.SDK_INT)), formularize.attabal(MBridgeConstans.DYNAMIC_VIEW_WX_APP, context.getPackageName()), formularize.attabal("s", "gmob_sdk"), formularize.attabal("v", "3"), formularize.attabal(X3.i.G, minuteness.saneness()), formularize.attabal("is_bstar", deviceProperties.b() ? "1" : "0"), formularize.attabal("is_lite_sdk", "0"), formularize.attabal("gqi", commonConfiguration.h), formularize.attabal(L6.F, Build.VERSION.RELEASE));
        this.g = new ArrayList();
        this.h = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, List list, wretchedly.dern dernVar) {
        n20 n20Var;
        String strPreterite;
        formularization.attabal attabalVar;
        u20 u20Var;
        String str2;
        if (dernVar instanceof n20) {
            n20Var = (n20) dernVar;
            int i = n20Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                n20Var.g = i - Integer.MIN_VALUE;
            } else {
                n20Var = new n20(this, dernVar);
            }
        } else {
            n20Var = new n20(this, dernVar);
        }
        Object obj = n20Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = n20Var.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                return Unit.f29295attabal;
            }
            strPreterite = CollectionsKt.preterite(arrayList, ",", null, null, 0, null, null, 62, null);
            formularization.attabal attabalVar2 = this.e;
            n20Var.a = this;
            n20Var.b = str;
            n20Var.c = strPreterite;
            n20Var.d = attabalVar2;
            n20Var.g = 1;
            if (attabalVar2.attabal(null, n20Var) == objBeachfront) {
                return objBeachfront;
            }
            attabalVar = attabalVar2;
            u20Var = this;
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = n20Var.d;
            strPreterite = n20Var.c;
            str2 = n20Var.b;
            u20Var = n20Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            String str3 = (String) u20Var.f.get(str2);
            if (str3 == null) {
                u20Var.f.put(str2, strPreterite);
            } else {
                u20Var.f.put(str2, str3 + "," + strPreterite);
            }
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, wretchedly.dern dernVar) {
        o20 o20Var;
        u20 u20Var;
        String str2;
        b03 b03Var;
        formularization.attabal attabalVar;
        b03 b03Var2;
        if (dernVar instanceof o20) {
            o20Var = (o20) dernVar;
            int i = o20Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                o20Var.h = i - Integer.MIN_VALUE;
            } else {
                o20Var = new o20(this, dernVar);
            }
        } else {
            o20Var = new o20(this, dernVar);
        }
        Object obj = o20Var.f;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = o20Var.h;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            this.c.getClass();
            b03 b03Var3 = new b03(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), str);
            formularization.attabal attabalVar2 = this.e;
            o20Var.a = this;
            o20Var.b = str;
            o20Var.c = b03Var3;
            o20Var.d = b03Var3;
            o20Var.e = attabalVar2;
            o20Var.h = 1;
            if (attabalVar2.attabal(null, o20Var) == objBeachfront) {
                return objBeachfront;
            }
            u20Var = this;
            str2 = str;
            b03Var = b03Var3;
            attabalVar = attabalVar2;
            b03Var2 = b03Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = o20Var.e;
            b03Var = o20Var.d;
            b03Var2 = o20Var.c;
            str2 = o20Var.b;
            u20Var = o20Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            u20Var.h.put(str2, b03Var);
            Unit unit = Unit.f29295attabal;
            return b03Var2;
        } finally {
            attabalVar.wireman(null);
        }
    }

    public final Uri a(String str, String str2, Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.b.q()).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return Uri.parse(builderBuildUpon.build().toString() + "&it=" + str + "&blat=" + str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(wretchedly.dern dernVar) {
        q20 q20Var;
        formularization.attabal attabalVar;
        u20 u20Var;
        if (dernVar instanceof q20) {
            q20Var = (q20) dernVar;
            int i = q20Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                q20Var.e = i - Integer.MIN_VALUE;
            } else {
                q20Var = new q20(this, dernVar);
            }
        } else {
            q20Var = new q20(this, dernVar);
        }
        Object obj = q20Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = q20Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.e;
            q20Var.a = this;
            q20Var.b = attabalVar2;
            q20Var.e = 1;
            if (attabalVar2.attabal(null, q20Var) == objBeachfront) {
                return objBeachfront;
            }
            attabalVar = attabalVar2;
            u20Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = q20Var.b;
            u20Var = q20Var.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            Pair pair = new Pair(CollectionsKt.molet(u20Var.g), seminary.rotuma(u20Var.f));
            attabalVar.wireman(null);
            List<l20> list = (List) pair.component1();
            Map map = (Map) pair.component2();
            String strPreterite = CollectionsKt.preterite(list, ",", null, null, 0, null, r20.a, 30, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (l20 l20Var : list) {
                Long lMarial = igo.attabal.marial(p002kotlin.time.saneness.adultoid(l20Var.b.a()));
                Object arrayList = linkedHashMap.get(lMarial);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(lMarial, arrayList);
                }
                ((List) arrayList).add(l20Var.a);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String strPreterite2 = CollectionsKt.preterite((Iterable) entry.getValue(), "+", null, null, 0, null, null, 62, null);
                laky lakyVar = ip0.f;
                arrayList2.add(strPreterite2 + "." + p002kotlin.time.saneness.adultoid(laky.attabal(u20Var.c, ((Number) entry.getKey()).longValue())));
            }
            rg2.a(u20Var.d, u20Var.a(strPreterite, CollectionsKt.preterite(arrayList2, ",", null, null, 0, null, null, 62, null), map));
            return Unit.f29295attabal;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, boolean z, wretchedly.dern dernVar) {
        s20 s20Var;
        formularization.attabal attabalVar;
        u20 u20Var;
        if (dernVar instanceof s20) {
            s20Var = (s20) dernVar;
            int i = s20Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                s20Var.h = i - Integer.MIN_VALUE;
            } else {
                s20Var = new s20(this, dernVar);
            }
        } else {
            s20Var = new s20(this, dernVar);
        }
        Object obj = s20Var.f;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = s20Var.h;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = this.e;
            s20Var.a = this;
            s20Var.b = str;
            s20Var.c = str2;
            s20Var.d = attabalVar;
            s20Var.e = z;
            s20Var.h = 1;
            if (attabalVar.attabal(null, s20Var) == objBeachfront) {
                return objBeachfront;
            }
            u20Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = s20Var.e;
            formularization.attabal attabalVar2 = s20Var.d;
            str2 = s20Var.c;
            String str3 = s20Var.b;
            u20Var = s20Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            str = str3;
        }
        try {
            if (z) {
                u20Var.f.put(str, str2);
                Unit unit = Unit.f29295attabal;
            } else {
                u20Var.f.putIfAbsent(str, str2);
            }
            attabalVar.wireman(null);
            return Unit.f29295attabal;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, long j, wretchedly.dern dernVar) {
        t20 t20Var;
        formularization.attabal attabalVar;
        u20 u20Var;
        if (dernVar instanceof t20) {
            t20Var = (t20) dernVar;
            int i = t20Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                t20Var.h = i - Integer.MIN_VALUE;
            } else {
                t20Var = new t20(this, dernVar);
            }
        } else {
            t20Var = new t20(this, dernVar);
        }
        Object obj = t20Var.f;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = t20Var.h;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = this.e;
            t20Var.a = this;
            t20Var.b = str;
            t20Var.c = str2;
            t20Var.d = attabalVar;
            t20Var.e = j;
            t20Var.h = 1;
            if (attabalVar.attabal(null, t20Var) == objBeachfront) {
                return objBeachfront;
            }
            u20Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = t20Var.e;
            formularization.attabal attabalVar2 = t20Var.d;
            str2 = t20Var.c;
            String str3 = t20Var.b;
            u20Var = t20Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            str = str3;
        }
        try {
            b03 b03Var = (b03) u20Var.h.get(str2);
            if (b03Var != null) {
                igo.attabal.attabal(u20Var.g.add(new l20(str, b03Var, j)));
            }
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }
}

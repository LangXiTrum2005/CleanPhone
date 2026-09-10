package ads_mobile_sdk;

import android.os.SystemClock;
import formularization.beachfront;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.discontentedly;
import saneness.evenfall;
import saneness.monacal;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class op2 {
    public final ri2 a;
    public final amphitheatre b;
    public final long c;
    public final formularization.attabal d;
    public final ArrayList e;
    public final hf0 f;

    public op2(ri2 rootTraceCreator, amphitheatre clock, jk0 flags) {
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = rootTraceCreator;
        this.b = clock;
        int iJ0 = flags.j0();
        this.c = flags.k0();
        this.d = beachfront.saneness(false, 1, null);
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = new hf0(iJ0, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, adjudge.saneness sanenessVar, arytenoidectomy arytenoidectomyVar, wretchedly.dern dernVar) {
        kp2 kp2Var;
        op2 op2Var;
        String str2;
        formularization.attabal attabalVar;
        if (dernVar instanceof kp2) {
            kp2Var = (kp2) dernVar;
            int i = kp2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                kp2Var.h = i - Integer.MIN_VALUE;
            } else {
                kp2Var = new kp2(this, dernVar);
            }
        } else {
            kp2Var = new kp2(this, dernVar);
        }
        Object obj = kp2Var.f;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = kp2Var.h;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            formularization.attabal attabalVar2 = this.d;
            kp2Var.a = this;
            kp2Var.b = str;
            kp2Var.c = sanenessVar;
            kp2Var.d = arytenoidectomyVar;
            kp2Var.e = attabalVar2;
            kp2Var.h = 1;
            if (attabalVar2.attabal(null, kp2Var) == objBeachfront) {
                return objBeachfront;
            }
            op2Var = this;
            str2 = str;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = kp2Var.e;
            arytenoidectomyVar = kp2Var.d;
            sanenessVar = kp2Var.c;
            String str3 = kp2Var.b;
            op2Var = kp2Var.a;
            p002kotlin.dern.saneness(obj);
            str2 = str3;
        }
        adjudge.saneness sanenessVar2 = sanenessVar;
        arytenoidectomy arytenoidectomyVar2 = arytenoidectomyVar;
        try {
            hf0 hf0Var = op2Var.f;
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            op2Var.b.getClass();
            hf0Var.put(str2, new jp2(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), str2, sanenessVar2, arytenoidectomyVar2));
            op2Var.a();
            op2Var.b();
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    public final void b() {
        if (this.e.isEmpty()) {
            return;
        }
        discontentedly builder = qk2.o();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (Pair pair : this.e) {
            nk2 value = (nk2) pair.component1();
            jp2 jp2Var = (jp2) pair.component2();
            List listDern = builder.dern();
            Intrinsics.checkNotNullExpressionValue(listDern, "getEvictionsList(...)");
            yd0 yd0Var = new yd0(listDern);
            monacal builder2 = ok2.o();
            Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder2, "builder");
            Intrinsics.checkNotNullParameter(value, "value");
            builder2.attabal(value);
            String value2 = jp2Var.c.requestId;
            String value3 = "";
            if (value2 == null) {
                value2 = "";
            }
            Intrinsics.checkNotNullParameter(value2, "value");
            builder2.marial(value2);
            String str = jp2Var.c.requestAgent;
            if (str != null) {
                value3 = str;
            }
            Intrinsics.checkNotNullParameter(value3, "value");
            builder2.wireman(value3);
            so0 value4 = jp2Var.b.getF3279impassible();
            Intrinsics.checkNotNullParameter(value4, "value");
            builder2.dern(value4);
            xm0 xm0VarA = builder2.a();
            Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
            ok2 value5 = (ok2) xm0VarA;
            Intrinsics.checkNotNullParameter(yd0Var, "<this>");
            Intrinsics.checkNotNullParameter(value5, "value");
            builder.attabal(value5);
        }
        xm0 xm0VarA2 = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA2, "build(...)");
        qk2 qk2Var = (qk2) xm0VarA2;
        ri2 ri2Var = this.a;
        no0 no0Var = no0.CUI_NAME_SCAR_CACHE_EVICTION;
        l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
        List listFormularize = adultoid.formularize();
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                j13.a().e().u = qk2Var;
                Unit unit = Unit.f29295attabal;
                interaction.saneness.attabal(v62VarA, null);
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
                    if (!(th instanceof yn0)) {
                        throw new gn0(th);
                    }
                    throw th;
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
            w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
            try {
                j13.a().e().u = qk2Var;
                Unit unit2 = Unit.f29295attabal;
                interaction.saneness.attabal(w03VarA, null);
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
                    if (!(th4 instanceof yn0)) {
                        throw new gn0(th4);
                    }
                    throw th4;
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
        this.e.clear();
    }

    public final void a() {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.b.getClass();
        long jGraveside = p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
        Iterator it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            jp2 jp2Var = (jp2) ((Map.Entry) it.next()).getValue();
            if (p002kotlin.time.saneness.formularize(jGraveside, p002kotlin.time.saneness.polder(jp2Var.a, this.c)) <= 0) {
                return;
            }
            it.remove();
            this.e.add(new Pair(nk2.EVICTION_REASON_EXPIRED, jp2Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, wretchedly.dern dernVar) {
        lp2 lp2Var;
        formularization.attabal attabalVar;
        op2 op2Var;
        if (dernVar instanceof lp2) {
            lp2Var = (lp2) dernVar;
            int i = lp2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                lp2Var.f = i - Integer.MIN_VALUE;
            } else {
                lp2Var = new lp2(this, dernVar);
            }
        } else {
            lp2Var = new lp2(this, dernVar);
        }
        Object obj = lp2Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = lp2Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = this.d;
            lp2Var.a = this;
            lp2Var.b = str;
            lp2Var.c = attabalVar;
            lp2Var.f = 1;
            if (attabalVar.attabal(null, lp2Var) == objBeachfront) {
                return objBeachfront;
            }
            op2Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = lp2Var.c;
            String str2 = lp2Var.b;
            op2Var = lp2Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            str = str2;
        }
        try {
            return (jp2) op2Var.f.get(str);
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, String str2, wretchedly.dern dernVar) {
        mp2 mp2Var;
        formularization.attabal attabalVar;
        op2 op2Var;
        LinkedHashSet linkedHashSet;
        if (dernVar instanceof mp2) {
            mp2Var = (mp2) dernVar;
            int i = mp2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                mp2Var.g = i - Integer.MIN_VALUE;
            } else {
                mp2Var = new mp2(this, dernVar);
            }
        } else {
            mp2Var = new mp2(this, dernVar);
        }
        Object obj = mp2Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = mp2Var.g;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = this.d;
            mp2Var.a = this;
            mp2Var.b = str;
            mp2Var.c = str2;
            mp2Var.d = attabalVar;
            mp2Var.g = 1;
            if (attabalVar.attabal(null, mp2Var) == objBeachfront) {
                return objBeachfront;
            }
            op2Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            formularization.attabal attabalVar2 = mp2Var.d;
            str2 = mp2Var.c;
            String str3 = mp2Var.b;
            op2Var = mp2Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            str = str3;
        }
        boolean zContains = false;
        try {
            if (str2 == null) {
                Boolean boolAttabal = igo.attabal.attabal(false);
                attabalVar.wireman(null);
                return boolAttabal;
            }
            jp2 jp2Var = (jp2) op2Var.f.get(str);
            if (jp2Var != null && (linkedHashSet = jp2Var.d) != null) {
                zContains = linkedHashSet.contains(str2);
            }
            Boolean boolAttabal2 = igo.attabal.attabal(zContains);
            attabalVar.wireman(null);
            return boolAttabal2;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, jp2 jp2Var, int i, wretchedly.dern dernVar) {
        np2 np2Var;
        formularization.attabal attabalVar;
        op2 op2Var;
        if (dernVar instanceof np2) {
            np2Var = (np2) dernVar;
            int i2 = np2Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                np2Var.i = i2 - Integer.MIN_VALUE;
            } else {
                np2Var = new np2(this, dernVar);
            }
        } else {
            np2Var = new np2(this, dernVar);
        }
        Object obj = np2Var.g;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i3 = np2Var.i;
        if (i3 == 0) {
            p002kotlin.dern.saneness(obj);
            attabalVar = this.d;
            np2Var.a = this;
            np2Var.b = str;
            np2Var.c = str2;
            np2Var.d = jp2Var;
            np2Var.e = attabalVar;
            np2Var.f = i;
            np2Var.i = 1;
            if (attabalVar.attabal(null, np2Var) == objBeachfront) {
                return objBeachfront;
            }
            op2Var = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = np2Var.f;
            formularization.attabal attabalVar2 = np2Var.e;
            jp2Var = np2Var.d;
            str2 = np2Var.c;
            String str3 = np2Var.b;
            op2Var = np2Var.a;
            p002kotlin.dern.saneness(obj);
            attabalVar = attabalVar2;
            str = str3;
        }
        try {
            if (str2 == null) {
                op2Var.f.remove(str);
                Unit unit = Unit.f29295attabal;
                attabalVar.wireman(null);
                return unit;
            }
            jp2Var.d.add(str2);
            if (jp2Var.d.size() >= i) {
                op2Var.f.remove(str);
            }
            Unit unit2 = Unit.f29295attabal;
            attabalVar.wireman(null);
            return unit2;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }
}

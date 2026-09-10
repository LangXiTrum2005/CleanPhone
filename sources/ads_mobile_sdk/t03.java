package ads_mobile_sdk;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.common.base.formularize;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.util.Map;
import saneness.bochum;
import saneness.counters;
import saneness.kaoline;

/* JADX INFO: loaded from: classes.dex */
public final class t03 extends ys2 {
    public final Map f;
    public final counters g;
    public final DisplayMetrics h;

    public t03(bochum bochumVar, counters countersVar, Map map, DisplayMetrics displayMetrics, u13 u13Var) {
        super("G3vAU9MvXFdTizuxNAhG7EQyTtRFhWNrkWWRkR4eNwd0MUBDcsl4p739B/4Ypmn6", "A6sCdoET7Oe4adhmofX17TQn8pEbBfojM4fsZNm/Ndw=", bochumVar, countersVar, u13Var.a(gf0.EVENT_ID_TOUCH_SIGNALS_TASK));
        this.g = countersVar;
        this.f = map;
        this.h = displayMetrics;
    }

    @Override // ads_mobile_sdk.ys2
    public final void a(Method method, bochum bochumVar) {
        Object[] objArr = (Object[]) formularize.triweekly((Object[]) method.invoke("", (MotionEvent) this.f.get("nv"), this.h));
        kaoline kaolineVarO = oa.o();
        Object obj = objArr[0];
        if (obj != null && objArr[1] != null) {
            kaolineVarO.apical(((Long) obj).longValue());
            kaolineVarO.impassible(((Long) objArr[1]).longValue());
        }
        Object obj2 = objArr[2];
        if (obj2 != null) {
            kaolineVarO.impromptu(((Long) obj2).longValue());
        }
        Object obj3 = objArr[3];
        if (obj3 != null) {
            kaolineVarO.competently(((Long) obj3).longValue());
        }
        Object obj4 = objArr[4];
        if (obj4 != null) {
            kaolineVarO.beachfront(((Long) obj4).longValue());
        }
        Object obj5 = objArr[5];
        if (obj5 != null) {
            kaolineVarO.marial(((Long) obj5).longValue() != 0 ? db.ENUM_TRUE : db.ENUM_FALSE);
        }
        Object obj6 = objArr[6];
        if (obj6 != null) {
            kaolineVarO.wireman(((Long) obj6).longValue());
        }
        Object obj7 = objArr[7];
        if (obj7 != null) {
            kaolineVarO.triweekly(((Long) obj7).longValue());
        }
        Object obj8 = objArr[8];
        if (obj8 != null) {
            kaolineVarO.dern(((Long) obj8).longValue() != 0 ? db.ENUM_TRUE : db.ENUM_FALSE);
        }
        synchronized (bochumVar) {
            try {
                a(bochumVar);
                sf1 sf1Var = (sf1) this.f.get("oe");
                if (sf1Var != null) {
                    long j = sf1Var.a;
                    if (j > 0) {
                        bochumVar.nosophobia(j);
                    }
                    long j2 = sf1Var.b;
                    if (j2 > 0) {
                        bochumVar.lotta(j2);
                    }
                    long j3 = sf1Var.c;
                    if (j3 > 0) {
                        bochumVar.wireman(j3);
                    }
                    long j4 = sf1Var.d;
                    if (j4 > 0) {
                        bochumVar.itchy(j4);
                    }
                }
                a(kaolineVarO);
                bochumVar.dovishness(kaolineVarO);
                b(bochumVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(bochum bochumVar) {
        DisplayMetrics displayMetrics;
        tf1[] tf1VarArr = (tf1[]) this.f.get("ro");
        if (tf1VarArr == null || (displayMetrics = this.h) == null || displayMetrics.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        for (int i = 0; i <= tf1VarArr.length - 2; i++) {
            tf1 tf1Var = tf1VarArr[i];
            bochumVar.molybdenite((oa) oa.o().apical(Math.round(((double) tf1Var.a) / ((double) ((DisplayMetrics) formularize.triweekly(this.h)).density))).impassible(Math.round(((double) tf1Var.b) / ((double) ((DisplayMetrics) formularize.triweekly(this.h)).density))).a());
        }
    }

    public final void a(bochum bochumVar) {
        Object[] objArr = (Object[]) formularize.triweekly((Object[]) ((Method) formularize.triweekly(((mf1) this.g).a("S0i3qFSbAeIoWfYri9AR9vQMi+VM6Oul3D1uJW1/Oy6lsTKdX9fvWHE14aB1Lf+M", "pS1T+MSe/MUMjkAE0NSfXp//5pOY6ws/LxWKej6BBy0="))).invoke("", (MotionEvent) this.f.get("nv"), this.h));
        Object obj = objArr[0];
        if (obj != null) {
            bochumVar.marial(((Long) obj).longValue());
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bochumVar.beachfront(((Long) obj2).longValue());
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            bochumVar.dern(((Long) obj3).longValue());
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            bochumVar.attabal(((Long) obj4).longValue());
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            bochumVar.coffeecake(((Long) obj5).longValue());
        }
    }

    public final void a(kaoline kaolineVar) {
        DisplayMetrics displayMetrics;
        sf1 sf1Var = (sf1) this.f.get("oe");
        if (sf1Var == null || sf1Var.a == 0 || (displayMetrics = this.h) == null || displayMetrics.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        kaolineVar.attabal(Math.round(sf1Var.g / ((double) ((DisplayMetrics) formularize.triweekly(displayMetrics)).density)));
        kaolineVar.polloi(Math.round(((double) (sf1Var.j - sf1Var.h)) / ((double) this.h.density))).molybdenite(Math.round(((double) (sf1Var.k - sf1Var.i)) / ((double) this.h.density))).taiyuan(Math.round(((double) sf1Var.h) / ((double) this.h.density))).formularize(Math.round(((double) sf1Var.i) / ((double) this.h.density)));
        MotionEvent motionEvent = (MotionEvent) this.f.get("nv");
        if (motionEvent == null) {
            return;
        }
        long jRound = Math.round(((double) ((motionEvent.getRawX() + (sf1Var.h - sf1Var.j)) - motionEvent.getX())) / ((double) this.h.density));
        if (jRound != 0) {
            kaolineVar.kowloon(jRound);
        }
        long jRound2 = Math.round(((double) ((motionEvent.getRawY() + (sf1Var.i - sf1Var.k)) - motionEvent.getY())) / ((double) this.h.density));
        if (jRound2 != 0) {
            kaolineVar.monoploid(jRound2);
        }
    }
}

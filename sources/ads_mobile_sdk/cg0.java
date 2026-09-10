package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.arytenoidectomy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import saneness.adultoid;
import saneness.bochum;
import saneness.coffeecake;
import saneness.counters;
import saneness.delouse;
import saneness.glutethimide;
import saneness.sakeen;
import saneness.transformable;

/* JADX INFO: loaded from: classes.dex */
public final class cg0 implements glutethimide {
    public final ExecutorService a;
    public final delouse b;
    public final delouse c;
    public final av2 d;
    public final delouse e;
    public final adultoid f;
    public final j5 g;

    public cg0(ExecutorService executorService, delouse delouseVar, delouse delouseVar2, av2 av2Var, delouse delouseVar3, coffeecake coffeecakeVar, j5 j5Var) {
        this.a = executorService;
        this.b = delouseVar;
        this.c = delouseVar2;
        this.d = av2Var;
        this.e = delouseVar3;
        this.f = coffeecakeVar;
        this.g = j5Var;
    }

    @Override // saneness.glutethimide
    public final void a(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            ((uf1) this.e.get()).a((MotionEvent) inputEvent);
        }
    }

    @Override // saneness.glutethimide
    public final com.google.common.util.concurrent.adultoid b(Context context, String str, View view, Activity activity) {
        av2 av2Var = this.d;
        av2Var.getClass();
        HashMap map = new HashMap();
        Iterator it = av2Var.a.iterator();
        while (it.hasNext()) {
            ((sakeen) it.next()).b(map);
        }
        ((uf1) this.e.get()).a(map);
        l40 l40Var = (l40) ((transformable) this.f.get());
        l40Var.getClass();
        context.getClass();
        l40Var.c = context;
        l40Var.d = view;
        l40Var.e = activity;
        l40Var.f = str;
        l40Var.g = map;
        l40Var.i = yu2.CLICK;
        bochum bochumVarT = ra.t();
        bochumVarT.getClass();
        l40Var.h = bochumVarT;
        return ((br2) l40Var.a().A.get()).b();
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0048: INVOKE (r3 I:ads_mobile_sdk.v03) VIRTUAL call: ads_mobile_sdk.v03.a():void A[Catch: all -> 0x0046, MD:():void (m), TRY_ENTER] (LINE:73), block:B:22:0x0048 */
    public final Void c() {
        v03 v03VarA;
        ((a) this.c.get()).a();
        mf1 mf1Var = (mf1) ((counters) this.b.get());
        synchronized (mf1Var) {
            try {
                u13 u13Var = mf1Var.e;
                v03 v03Var = new v03(gf0.EVENT_ID_FALLBACK_INIT_METHOD_PROVIDER, u13Var.b, u13Var.a);
                try {
                    v03Var.b();
                    mf1Var.a();
                    mf1Var.c();
                    mf1Var.d();
                    mf1Var.j = true;
                } catch (bt2 e) {
                    v03Var.a(e);
                } catch (Throwable th) {
                    v03Var.a(th);
                    throw th;
                }
                v03Var.a();
            } catch (Throwable th2) {
                v03VarA.a();
                throw th2;
            }
        }
        return null;
    }

    @Override // saneness.glutethimide
    public final com.google.common.util.concurrent.adultoid a(Context context) {
        l40 l40Var = (l40) ((transformable) this.f.get());
        l40Var.getClass();
        context.getClass();
        l40Var.c = context;
        av2 av2Var = this.d;
        av2Var.getClass();
        HashMap map = new HashMap();
        Iterator it = av2Var.a.iterator();
        while (it.hasNext()) {
            ((sakeen) it.next()).a(map);
        }
        l40Var.g = map;
        bochum bochumVarT = ra.t();
        bochumVarT.getClass();
        l40Var.h = bochumVarT;
        l40Var.i = yu2.QUERY;
        return ((br2) l40Var.a().A.get()).b();
    }

    @Override // saneness.glutethimide
    public final com.google.common.util.concurrent.adultoid a(Context context, String str, View view, Activity activity) {
        l40 l40Var = (l40) ((transformable) this.f.get());
        l40Var.getClass();
        context.getClass();
        l40Var.c = context;
        l40Var.d = view;
        l40Var.e = activity;
        if (!this.g.y()) {
            str = "";
        }
        l40Var.f = str;
        av2 av2Var = this.d;
        av2Var.getClass();
        HashMap map = new HashMap();
        Iterator it = av2Var.a.iterator();
        while (it.hasNext()) {
            ((sakeen) it.next()).a(map, context, view);
        }
        l40Var.g = map;
        bochum bochumVarT = ra.t();
        bochumVarT.getClass();
        l40Var.h = bochumVarT;
        l40Var.i = yu2.VIEW;
        return ((br2) l40Var.a().A.get()).b();
    }

    @Override // saneness.glutethimide
    public final String b() {
        return "1.869935264";
    }

    @Override // saneness.glutethimide
    public final com.google.common.util.concurrent.adultoid a() {
        return arytenoidectomy.apical(new Callable() { // from class: saneness.linendraper
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37192kowloon.c();
            }
        }, this.a);
    }
}

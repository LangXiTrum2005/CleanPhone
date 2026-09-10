package ads_mobile_sdk;

import ads_mobile_sdk.i72;
import ads_mobile_sdk.w62;
import ads_mobile_sdk.yo2;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.base.marial;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import com.google.common.util.concurrent.cutely;
import com.google.common.util.concurrent.impromptu;
import com.google.common.util.concurrent.rotuma;
import com.ironsource.C3724ra;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import saneness.disciplinal;
import saneness.kamptulicon;
import saneness.resalable;
import saneness.sakeen;

/* JADX INFO: loaded from: classes.dex */
public final class yo2 implements disciplinal {
    public final u73 a;
    public final kamptulicon b;
    public final resalable c;
    public final u13 d;
    public final ExecutorService e;
    public final AtomicReference f = new AtomicReference("2.869935264.-1");

    public yo2(u73 u73Var, kamptulicon kamptuliconVar, resalable resalableVar, u13 u13Var, ExecutorService executorService) {
        this.a = u73Var;
        this.b = kamptuliconVar;
        this.c = resalableVar;
        this.d = u13Var;
        this.e = executorService;
    }

    public static /* synthetic */ i72 a(Throwable th) {
        return null;
    }

    public static /* synthetic */ Void b(Boolean bool) {
        return null;
    }

    public final String c(Context context, String str, View view, Activity activity) {
        String strA;
        xb1 xb1VarA = this.a.a();
        if (xb1VarA == null) {
            this.d.b(gf0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
            return "";
        }
        synchronized (xb1VarA) {
            try {
                gd0 gd0Var = (gd0) xb1VarA.b;
                av2 av2Var = gd0Var.b;
                av2Var.getClass();
                HashMap map = new HashMap();
                Iterator it = av2Var.a.iterator();
                while (it.hasNext()) {
                    ((sakeen) it.next()).b(map);
                }
                gd0Var.a(map);
                map.put("f", "c");
                map.put("ctx", context);
                map.put("cs", str);
                map.put(C3724ra.b, null);
                map.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
                map.put("act", activity);
                byte[] bArrA = xb1VarA.a(map);
                if (xb1VarA.d) {
                    map.clear();
                }
                strA = xb1.a(bArrA);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (strA != null) {
            return strA;
        }
        this.d.b(gf0.EVENT_ID_DG_ENGINE_NULL_CLICK_SIGNALS);
        return "";
    }

    public final String d(Context context, String str, View view, Activity activity) {
        String strA;
        xb1 xb1VarA = this.a.a();
        if (xb1VarA == null) {
            this.d.b(gf0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
            return "";
        }
        synchronized (xb1VarA) {
            try {
                gd0 gd0Var = (gd0) xb1VarA.b;
                av2 av2Var = gd0Var.b;
                Context context2 = gd0Var.a;
                av2Var.getClass();
                HashMap map = new HashMap();
                Iterator it = av2Var.a.iterator();
                while (it.hasNext()) {
                    ((sakeen) it.next()).a(map, context2, null);
                }
                gd0Var.a(map);
                map.put("f", "v");
                map.put("ctx", context);
                map.put(C3724ra.b, null);
                map.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
                map.put("act", activity);
                byte[] bArrA = xb1VarA.a(map);
                if (xb1VarA.d) {
                    map.clear();
                }
                strA = xb1.a(bArrA);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (strA != null) {
            return strA;
        }
        this.d.b(gf0.EVENT_ID_DG_ENGINE_NULL_VIEW_SIGNALS);
        return "";
    }

    @Override // saneness.disciplinal
    public final void a(InputEvent inputEvent) {
        xb1 xb1VarA = this.a.a();
        if (xb1VarA == null) {
            this.d.b(gf0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
            return;
        }
        if (inputEvent instanceof MotionEvent) {
            try {
                xb1VarA.a((MotionEvent) inputEvent);
            } catch (s73 e) {
                u13 u13Var = this.d;
                gf0 gf0Var = gf0.EVENT_ID_UNSPECIFIED;
                ((kc1) u13Var.a).a(15004, -1L, e, null);
            }
        }
    }

    @Override // saneness.disciplinal
    public final adultoid b(final Context context, final String str, final View view, final Activity activity) {
        return arytenoidectomy.apical(new Callable() { // from class: saneness.reversely
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37291kowloon.c(context, str, view, activity);
            }
        }, this.e);
    }

    @Override // saneness.disciplinal
    public final String b() {
        return (String) this.f.get();
    }

    public final String b(Context context) {
        String strA;
        xb1 xb1VarA = this.a.a();
        if (xb1VarA == null) {
            this.d.b(gf0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
            return "";
        }
        synchronized (xb1VarA) {
            try {
                gd0 gd0Var = (gd0) xb1VarA.b;
                av2 av2Var = gd0Var.b;
                av2Var.getClass();
                HashMap map = new HashMap();
                Iterator it = av2Var.a.iterator();
                while (it.hasNext()) {
                    ((sakeen) it.next()).a(map);
                }
                gd0Var.a(map);
                map.put("f", CampaignEx.JSON_KEY_AD_Q);
                map.put("ctx", context);
                map.put(C3724ra.b, null);
                byte[] bArrA = xb1VarA.a(map);
                if (xb1VarA.d) {
                    map.clear();
                }
                strA = xb1.a(bArrA);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (strA != null) {
            return strA;
        }
        this.d.b(gf0.EVENT_ID_DG_ENGINE_NULL_QUERY_SIGNALS);
        return "";
    }

    @Override // saneness.disciplinal
    public final adultoid a(final Context context) {
        return arytenoidectomy.apical(new Callable() { // from class: saneness.nonfarm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37226kowloon.b(context);
            }
        }, this.e);
    }

    @Override // saneness.disciplinal
    public final adultoid a(final Context context, final String str, final View view, final Activity activity) {
        return arytenoidectomy.apical(new Callable() { // from class: saneness.marlene
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37200kowloon.d(context, str, view, activity);
            }
        }, this.e);
    }

    @Override // saneness.disciplinal
    public final adultoid a() {
        return cutely.restrictive(this.b.a()).kattegat(Throwable.class, new marial() { // from class: saneness.mesophilic
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return yo2.a((Throwable) obj);
            }
        }, rotuma.attabal()).merc(new marial() { // from class: saneness.thanatism
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return Boolean.valueOf(this.f37334kowloon.a((i72) obj));
            }
        }, rotuma.attabal()).polder(new impromptu() { // from class: saneness.somerset
            @Override // com.google.common.util.concurrent.impromptu
            public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                return this.f37315attabal.a((Boolean) obj);
            }
        }, rotuma.attabal()).merc(new marial() { // from class: saneness.berberine
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return Boolean.valueOf(this.f37075kowloon.a((w62) obj));
            }
        }, rotuma.attabal()).merc(new marial() { // from class: saneness.slugfest
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return yo2.b((Boolean) obj);
            }
        }, rotuma.attabal());
    }

    public final boolean a(final w62 w62Var) {
        if (w62Var != null) {
            File file = w62Var.b;
            if (Build.VERSION.SDK_INT >= 34) {
                file.setReadOnly();
            }
            this.d.a(gf0.EVENT_ID_DG_ENGINE_INIT_VM_LOAD, new Runnable() { // from class: saneness.abolitionism
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37050kowloon.b(w62Var);
                }
            });
            return true;
        }
        throw new ap2(3);
    }

    public final /* synthetic */ adultoid a(Boolean bool) {
        return this.b.b();
    }

    public final boolean a(i72 i72Var) {
        if (this.c.b(i72Var) && i72Var != null) {
            return true;
        }
        this.d.b(gf0.EVENT_ID_DG_ENGINE_INIT_SKIP_INVALID_METADATA);
        throw new ap2(1);
    }

    public final void b(w62 w62Var) {
        u73 u73Var = this.a;
        u73Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            u73Var.a(u73Var.a(w62Var));
            ((kc1) ((x4) u73Var.c).a).a(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, System.currentTimeMillis() - jCurrentTimeMillis, null, null);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(Boolean.TRUE);
            taskCompletionSource.getTask();
            this.f.set("2.869935264." + w62Var.a.r());
        } catch (s73 e) {
            u73Var.c.a(e.a, System.currentTimeMillis() - jCurrentTimeMillis, e);
            throw new ap2(2);
        } catch (Exception e2) {
            u73Var.c.a(4010, System.currentTimeMillis() - jCurrentTimeMillis, e2);
            throw new ap2(2);
        }
    }
}

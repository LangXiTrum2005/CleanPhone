package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import com.google.common.util.concurrent.gintrap;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import saneness.sakeen;
import saneness.ventriculoatrial;

/* JADX INFO: loaded from: classes.dex */
public final class jm0 implements sakeen, ventriculoatrial {
    public final Context a;
    public final u13 b;
    public final gintrap c;
    public final j5 d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public adultoid f = arytenoidectomy.impromptu(null);

    public jm0(Context context, j5 j5Var, u13 u13Var, gintrap gintrapVar) {
        this.a = context;
        this.b = u13Var;
        this.c = gintrapVar;
        this.d = j5Var;
    }

    @Override // saneness.sakeen
    public final void a(HashMap map) {
        map.put("gs", this.f);
    }

    @Override // saneness.sakeen
    public final void b(HashMap map) {
        map.put("gs", this.f);
    }

    public final ra c() {
        ra raVar;
        Context context = this.a;
        try {
            try {
                raVar = (ra) new im0(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode)).d.poll(5000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                raVar = null;
            }
            if (raVar == null) {
                raVar = (ra) ra.t().timberyard(32768L).a();
            }
            return raVar;
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Override // saneness.sakeen
    public final void a(HashMap map, Context context, View view) {
        map.put("gs", this.f);
    }

    public final void b() {
        this.f = this.b.a(gf0.EVENT_ID_INIT_GASS_TRACKER, this.c.submit(new Callable() { // from class: saneness.aztec
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37068kowloon.c();
            }
        }));
    }

    @Override // saneness.ventriculoatrial
    public final adultoid a() {
        if (!this.e.getAndSet(true) && this.d.v()) {
            return this.c.submit(new Runnable() { // from class: saneness.lai
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37183kowloon.b();
                }
            });
        }
        return arytenoidectomy.taiyuan();
    }
}

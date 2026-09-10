package ads_mobile_sdk;

import android.os.Build;
import java.util.concurrent.ExecutorService;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class st0 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public st0(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new kt0((ExecutorService) this.a.get(), "Mozilla/5.0 (Linux; Android " + Build.VERSION.RELEASE + "; " + Build.MODEL + ")", ((j5) this.b.get()).E());
    }
}

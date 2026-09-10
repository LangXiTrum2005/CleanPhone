package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import saneness.fatness;
import saneness.montera;

/* JADX INFO: loaded from: classes.dex */
public final class of1 {
    public final Context a;
    public final u13 b;
    public final a c;
    public final String d;

    public of1(Context context, u13 u13Var, a aVar, j5 j5Var) {
        this.a = context;
        this.b = u13Var;
        this.c = aVar;
        this.d = j5Var.D();
    }

    public final String a(long j) {
        boolean z;
        montera monteraVarWireman = fb.o().dern(this.d).competently().marial(this.a.getPackageName()).attabal(System.currentTimeMillis() / 1000).wireman((System.currentTimeMillis() - j) / 1000);
        try {
            monteraVarWireman.beachfront(this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            monteraVarWireman.beachfront(-1L);
        }
        a aVar = this.c;
        synchronized (aVar) {
            z = aVar.d;
        }
        if (!z) {
            this.c.a();
        }
        return fatness.attabal(true).competently(((nb) this.c.a((String) null, ((fb) monteraVarWireman.a()).a()).marial().attabal(bb.BITSLICER).a()).a());
    }
}

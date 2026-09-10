package ads_mobile_sdk;

import com.ironsource.X3;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class fu1 implements coi {
    public final coffeecake a;

    public fu1(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        jk0 flags = (jk0) this.a.get();
        Intrinsics.checkNotNullParameter(flags, "flags");
        flags.getClass();
        Intrinsics.checkNotNullParameter("gads:offline_database_version_decagon", X3.i.W);
        return Integer.valueOf(((Number) flags.a("gads:offline_database_version_decagon", 1, zk.f)).intValue());
    }
}

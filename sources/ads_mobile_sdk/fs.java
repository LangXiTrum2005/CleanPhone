package ads_mobile_sdk;

import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.sakeen;
import kotlinx.coroutines.saran;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class fs implements coi {
    public final coffeecake a;

    public fs(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        CoroutineContext context = (CoroutineContext) this.a.get();
        Intrinsics.checkNotNullParameter(context, "context");
        return (saran) vilification.dern(privatdozent.attabal(context.plus(sakeen.saneness(null, 1, null))));
    }
}

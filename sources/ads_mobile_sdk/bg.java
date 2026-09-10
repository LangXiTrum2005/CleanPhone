package ads_mobile_sdk;

import android.content.Context;
import androidx.datastore.core.competently;
import androidx.datastore.core.impromptu;
import kotlinx.coroutines.preterite;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.sakeen;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class bg implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public bg(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        Context context = (Context) this.a.get();
        ns concurrencyObjects = (ns) this.b.get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        return (competently) vilification.dern(impromptu.dern(impromptu.f9573attabal, fg.a, null, null, privatdozent.attabal(preterite.dern(concurrencyObjects.c).plus(sakeen.saneness(null, 1, null)).plus(new s13())), new zf(context), 6, null));
    }
}

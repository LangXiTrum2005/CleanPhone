package ads_mobile_sdk;

import android.content.Context;
import kotlinx.coroutines.saran;
import saneness.blighty;
import saneness.coffeecake;
import saneness.delenda;
import saneness.gemmulation;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public final class l90 {
    public h21 a;
    public h21 b;
    public h21 c;
    public coffeecake d;
    public h21 e;
    public coffeecake f;
    public coffeecake g;

    public l90(Context context, Integer num, Long l, blighty blightyVar, hobby hobbyVar, saran saranVar) {
        a(context, num, l, blightyVar, hobbyVar, saranVar);
    }

    public final void a(Context context, Integer num, Long l, blighty blightyVar, hobby hobbyVar, saran saranVar) {
        this.a = h21.a(context);
        this.b = h21.a(saranVar);
        this.c = h21.a(num);
        delenda delendaVar = gemmulation.f37155attabal;
        Object obj = qd0.c;
        this.d = new qd0(delendaVar);
        this.e = h21.a(l);
        this.f = new qd0(new nu1(this.a, this.c, this.e, h21.a(blightyVar)));
        this.g = new qd0(new bu1(this.a, this.b, this.c, this.d, this.f, new qd0(new c63(this.b, h21.a(hobbyVar)))));
    }
}

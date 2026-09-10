package j1;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import f2.q;
import i2.p;
import java.util.HashMap;
import m0.s1;
import na.r;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f43581b;

    public /* synthetic */ c(Context context, int i10) {
        this.f43580a = i10;
        this.f43581b = context;
    }

    @Override // na.r
    public final Object get() {
        j2.g gVar;
        int i10 = this.f43580a;
        Context context = this.f43581b;
        switch (i10) {
            case 0:
                return f.u(context);
            case 1:
                return new s1(context, 11);
            case 2:
                return new q(new s1(context, 6), new n2.i());
            case 3:
                return new p(context);
            default:
                n1 n1Var = j2.g.f43640p;
                synchronized (j2.g.class) {
                    try {
                        if (j2.g.f43646v == null) {
                            Long lValueOf = Long.valueOf(C.TIME_UNSET);
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, lValueOf);
                            map.put(3, lValueOf);
                            map.put(4, lValueOf);
                            map.put(5, lValueOf);
                            map.put(10, lValueOf);
                            map.put(9, lValueOf);
                            map.put(7, lValueOf);
                            j2.g.f43646v = new j2.g(applicationContext, map);
                        }
                        gVar = j2.g.f43646v;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return gVar;
        }
    }
}

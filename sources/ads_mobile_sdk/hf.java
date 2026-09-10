package ads_mobile_sdk;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import igo.beachfront;
import kotlinx.coroutines.kowloon;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import saneness.amphitheatre;
import saneness.loun;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class hf {
    public final Context a;
    public final loun b;
    public final amphitheatre c;
    public final taiyuan d;

    public hf(Context applicationContext, loun traceLogger, amphitheatre clock) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.a = applicationContext;
        this.b = traceLogger;
        this.c = clock;
        this.d = p002kotlin.saneness.saneness(new ef(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(hf hfVar, wretchedly.dern dernVar) {
        ff ffVar;
        if (dernVar instanceof ff) {
            ffVar = (ff) dernVar;
            int i = ffVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ffVar.d = i - Integer.MIN_VALUE;
            } else {
                ffVar = new ff(hfVar, dernVar);
            }
        } else {
            ffVar = new ff(hfVar, dernVar);
        }
        Object objCuirassed = ffVar.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ffVar.d;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objCuirassed);
                ffVar.a = hfVar;
                ffVar.d = 1;
                kowloon kowloonVar = new kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(ffVar), 1);
                kowloonVar.kattegat();
                ((AppSetIdClient) hfVar.d.getValue()).getAppSetIdInfo().addOnCompleteListener(new gf(hfVar, kowloonVar));
                objCuirassed = kowloonVar.cuirassed();
                if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    beachfront.dern(ffVar);
                }
                if (objCuirassed == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hfVar = ffVar.a;
                p002kotlin.dern.saneness(objCuirassed);
            }
            return (spartacist) objCuirassed;
        } catch (Exception e) {
            ((d13) hfVar.b).a("Exception while getting AppSet Id", e);
            return new on0(e, null, null, 6);
        }
    }
}

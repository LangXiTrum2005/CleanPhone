package ads_mobile_sdk;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.TopicsManager;
import androidx.privacysandbox.ads.adservices.topics.impromptu;
import com.google.android.gms.ads.AdError;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l03 {
    public final Context a;

    public l03(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object a(l03 l03Var, boolean z, wretchedly.dern dernVar) {
        k03 k03Var;
        if (dernVar instanceof k03) {
            k03Var = (k03) dernVar;
            int i = k03Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                k03Var.c = i - Integer.MIN_VALUE;
            } else {
                k03Var = new k03(l03Var, dernVar);
            }
        } else {
            k03Var = new k03(l03Var, dernVar);
        }
        Object objAttabal = k03Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = k03Var.c;
        int i3 = 6;
        k41 k41Var = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objAttabal);
                TopicsManager topicsManagerAttabal = TopicsManager.INSTANCE.attabal(l03Var.a);
                if (topicsManagerAttabal == null) {
                    return new on0(new IllegalStateException(), k41Var, b3 == true ? 1 : 0, i3);
                }
                androidx.privacysandbox.ads.adservices.topics.saneness sanenessVarAttabal = new androidx.privacysandbox.ads.adservices.topics.saneness.attabal().saneness(AdError.GOOGLE_MOBILE_ADS_DOMAIN).dern(z).attabal();
                k03Var.c = 1;
                objAttabal = topicsManagerAttabal.attabal(sanenessVarAttabal, k03Var);
                if (objAttabal == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(objAttabal);
            }
            return new tn0((impromptu) objAttabal);
        } catch (Exception e) {
            return new on0(e, b2 == true ? 1 : 0, b == true ? 1 : 0, i3);
        }
    }
}

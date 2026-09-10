package saneness;

import ads_mobile_sdk.cb1;
import ads_mobile_sdk.qt1;
import ads_mobile_sdk.rt1;
import com.google.gson.JsonObject;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class mucocutaneous {
    public static rt1 attabal(JsonObject json) {
        qt1 qt1Var;
        qt1 qt1Var2;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            foreshot foreshotVar = qt1.a;
            int iA = cb1.a(json, "impression_prerequisite", 0);
            foreshotVar.getClass();
            if (iA == 0) {
                qt1Var = qt1.UNDEFINED;
            } else if (iA != 1) {
                qt1Var = iA != 2 ? qt1.UNDEFINED : qt1.NOTIFICATION_CLICK;
            } else {
                qt1Var = qt1.CLICK;
            }
            int iA2 = cb1.a(json, "click_prerequisite", 0);
            if (iA2 == 0) {
                qt1Var2 = qt1.UNDEFINED;
            } else if (iA2 != 1) {
                qt1Var2 = iA2 != 2 ? qt1.UNDEFINED : qt1.NOTIFICATION_CLICK;
            } else {
                qt1Var2 = qt1.CLICK;
            }
            return new rt1(qt1Var, qt1Var2, cb1.a(json, "notification_flow_enabled", false));
        } catch (Exception e) {
            List list = rajahmundry.attabal(e, "t", e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            Intrinsics.beachfront(message);
            list.add(message);
            return null;
        }
    }
}

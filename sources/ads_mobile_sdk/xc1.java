package ads_mobile_sdk;

import com.unity3d.services.core.fid.Constants;
import saneness.camorrista;
import saneness.curium;

/* JADX INFO: loaded from: classes.dex */
public final class xc1 {
    public static final camorrista b = new camorrista();
    public final curium a;

    public xc1() {
        this(a());
    }

    public static wc1 a() {
        curium curiumVar;
        if (sb.b) {
            curiumVar = b;
        } else {
            try {
                curiumVar = (curium) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
            } catch (Exception unused) {
                curiumVar = b;
            }
        }
        return new wc1(um0.a, curiumVar);
    }

    public xc1(wc1 wc1Var) {
        this.a = (curium) r21.a(wc1Var, "messageInfoFactory");
    }
}

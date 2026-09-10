package sg.bigo.ads.common.l;

import android.content.Context;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static sg.bigo.ads.common.a a(Context context) {
        long jA = r.f47535a.a(15);
        sg.bigo.ads.common.a aVarA = a.a(context);
        if (aVarA == null) {
            try {
                aVarA = c.a(context, jA);
            } catch (Exception unused) {
            }
        }
        return aVarA == null ? new sg.bigo.ads.common.a("", true) : aVarA;
    }
}

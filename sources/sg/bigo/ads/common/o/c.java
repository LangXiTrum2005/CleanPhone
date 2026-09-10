package sg.bigo.ads.common.o;

import android.content.Context;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f47354a = true;

    public static sg.bigo.ads.common.a a(Context context) {
        sg.bigo.ads.common.a aVarA;
        boolean z2;
        if (!f47354a) {
            return new sg.bigo.ads.common.a("", true);
        }
        long jA = r.f47535a.a(15);
        try {
            aVarA = d.a(context, jA);
            z2 = true;
        } catch (b unused) {
            aVarA = null;
            z2 = false;
        }
        if (aVarA != null) {
            return aVarA;
        }
        try {
            aVarA = a.a(context, jA);
        } catch (b unused2) {
            if (!z2) {
                f47354a = false;
            }
        }
        return aVarA != null ? aVarA : new sg.bigo.ads.common.a("", true);
    }
}

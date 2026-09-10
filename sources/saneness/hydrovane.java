package saneness;

import android.content.Context;
import android.content.res.Resources;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class hydrovane {
    public static String attabal(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String string = context.getResources().getString(danae.dern.test_ad);
            Intrinsics.beachfront(string);
            return string;
        } catch (Resources.NotFoundException unused) {
            return "Test Ad";
        }
    }
}

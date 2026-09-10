package saneness;

import com.google.android.gms.ads.AdSize;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class nepali {
    public static AdSize attabal(int i, int i2, String formatString, boolean z, boolean z2, int i3) {
        Intrinsics.checkNotNullParameter(formatString, "formatString");
        return new AdSize(i, i2, formatString, z, z2, i3);
    }
}

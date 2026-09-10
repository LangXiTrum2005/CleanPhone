package milliradian;

import android.content.Context;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AndroidDensity.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "context", "Lmilliradian/wireman;", "attabal", "(Landroid/content/Context;)Lmilliradian/wireman;", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class attabal {
    public static final wireman attabal(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        treadless.attabal attabalVarSaneness = treadless.saneness.f38983attabal.saneness(f);
        if (attabalVarSaneness == null) {
            attabalVarSaneness = new LinearFontScaleConverter(f);
        }
        return new DensityWithConverter(f2, f, attabalVarSaneness);
    }
}

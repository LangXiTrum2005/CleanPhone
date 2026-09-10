package ads_mobile_sdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class kd0 implements portwide {
    public final Context a;

    public kd0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.DISPLAY_COUNT;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        DisplayManager displayManager = (DisplayManager) this.a.getSystemService(DisplayManager.class);
        return displayManager != null ? new tn0(new jd0(displayManager.getDisplays().length)) : new rn0("Unable to get display service", k41.INTERNAL_ERROR);
    }
}

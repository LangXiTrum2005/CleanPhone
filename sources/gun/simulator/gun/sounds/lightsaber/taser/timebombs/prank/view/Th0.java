package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public final class Th0 {
    public static final Th0 INSTANCE = new Th0();

    private Th0() {
    }

    public final int dpToPixels(Context context, int i) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final C4839vT getDeviceWidthAndHeightWithOrientation(Context context, int i) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        Resources resources = context.getApplicationContext().getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i2 = resources.getConfiguration().orientation;
        if (i == 0) {
            i = i2;
        }
        return i == i2 ? new C4839vT(Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density))) : new C4839vT(Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)));
    }

    public final WebView getWebView(Context context) throws InstantiationException {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        try {
            return new WebView(context);
        } catch (Resources.NotFoundException e) {
            throw new InstantiationException("Cannot instantiate WebView due to Resources.NotFoundException: " + e + ".message");
        } catch (Exception e2) {
            throw new InstantiationException(e2.getMessage());
        }
    }
}

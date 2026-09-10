package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.gson.JsonObject;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class h73 implements hemolysin {
    public final Context a;
    public final x b;

    public h73(Context applicationContext, x activityTracker) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        this.a = applicationContext;
        this.b = activityTracker;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        int iWidth;
        int iHeight;
        WindowMetrics currentWindowMetrics;
        JsonObject jsonObject = new JsonObject();
        int[] iArr = new int[2];
        gq0Var.getLocationInWindow(iArr);
        jsonObject.addProperty("xInPixels", igo.attabal.wireman(iArr[0]));
        jsonObject.addProperty("yInPixels", igo.attabal.wireman(iArr[1]));
        Context contextB = this.b.b();
        if (contextB == null) {
            contextB = this.a;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager windowManager = (WindowManager) contextB.getSystemService(WindowManager.class);
            if (windowManager == null || (currentWindowMetrics = windowManager.getCurrentWindowMetrics()) == null) {
                return Unit.f29295attabal;
            }
            iWidth = currentWindowMetrics.getBounds().width();
            iHeight = currentWindowMetrics.getBounds().height();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager2 = (WindowManager) contextB.getSystemService(WindowManager.class);
            Display defaultDisplay = windowManager2 != null ? windowManager2.getDefaultDisplay() : null;
            if (defaultDisplay == null) {
                return Unit.f29295attabal;
            }
            defaultDisplay.getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            iWidth = i;
            iHeight = i2;
        }
        jsonObject.addProperty("windowWidthInPixels", igo.attabal.wireman(iWidth));
        jsonObject.addProperty("windowHeightInPixels", igo.attabal.wireman(iHeight));
        Object objA = gq0Var.a(jsonObject, "locationReady", dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_VIEW_LOCATION;
    }
}

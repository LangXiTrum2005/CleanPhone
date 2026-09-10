package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.gson.JsonObject;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class xn implements hemolysin {
    public final Context a;

    public xn(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            y13.a("CanOpenAppGmsgHandler not enabled on R+ devices.", null, 6);
            return Unit.f29295attabal;
        }
        String str = (String) map.get("package_name");
        if (str == null || str.length() == 0) {
            y13.a("Package name missing in canOpenApp GMSG.", null, 6);
            return Unit.f29295attabal;
        }
        PackageManager packageManager = this.a.getPackageManager();
        boolean z = (packageManager != null ? packageManager.getLaunchIntentForPackage(str) : null) != null;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(str, igo.attabal.attabal(z));
        Object objA = gq0Var.a(jsonObject, "openableApp", dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_CAN_OPEN_APP;
    }
}

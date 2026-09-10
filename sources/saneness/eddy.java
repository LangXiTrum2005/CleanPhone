package saneness;

import ads_mobile_sdk.gq0;
import ads_mobile_sdk.kn0;
import ads_mobile_sdk.po0;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class eddy implements hemolysin {
    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get("urls");
        if (str == null || str.length() == 0) {
            kn0.c("URLs missing in canOpenURLs GMSG.", null);
            return Unit.f29295attabal;
        }
        List<String> listSplit$default = StringsKt.split$default(str, new String[]{","}, false, 0, 6, null);
        JsonObject jsonObject = new JsonObject();
        PackageManager packageManager = gq0Var.getContext().getPackageManager();
        for (String str2 : listSplit$default) {
            List listSplit$default2 = StringsKt.split$default(str2, new String[]{";"}, false, 2, 2, null);
            boolean z = false;
            if (packageManager.resolveActivity(new Intent(listSplit$default2.size() > 1 ? StringsKt.stupefactive((String) listSplit$default2.get(1)).toString() : "android.intent.action.VIEW", Uri.parse(StringsKt.stupefactive((String) listSplit$default2.get(0)).toString())), 65536) != null) {
                z = true;
            }
            jsonObject.addProperty(str2, igo.attabal.attabal(z));
        }
        String str3 = (String) map.get("ad_mid");
        if (str3 != null && !StringsKt.empress(str3)) {
            jsonObject.addProperty("ad_mid", str3);
        }
        Object objA = gq0Var.a(jsonObject, "openableURLs", dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_CAN_OPEN_URLS;
    }
}

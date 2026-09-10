package ads_mobile_sdk;

import android.content.Intent;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class hn2 implements hemolysin {
    public final ip0 a;

    public hn2(ip0 gmaUtil) {
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        this.a = gmaUtil;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get("text");
        String str2 = (String) map.get("title");
        if (str == null || StringsKt.empress(str)) {
            return Unit.f29295attabal;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (str2 != null && !StringsKt.empress(str2)) {
            intent.putExtra("android.intent.extra.TITLE", str2);
        }
        this.a.a(intent);
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_SHARE_SHEET;
    }
}

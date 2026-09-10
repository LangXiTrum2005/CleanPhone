package com.applovin.impl.sdk.network;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.s5;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.l;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9587a;

    public PostbackServiceImpl(l lVar) {
        this.f9587a = lVar;
    }

    private boolean a(e eVar) {
        Map mapI = eVar.i();
        if (mapI == null) {
            return false;
        }
        Object obj = mapI.get(NotificationCompat.CATEGORY_EVENT);
        if ("postinstall".equals(obj)) {
            obj = mapI.get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(obj);
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(e.b(this.f9587a).b(str).a(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(eVar, f6.b.OTHER, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }

    public void dispatchPostbackRequest(e eVar, f6.b bVar, AppLovinPostbackListener appLovinPostbackListener) {
        s5 s5Var = new s5(eVar, bVar, this.f9587a, appLovinPostbackListener);
        s5Var.a(a(eVar));
        this.f9587a.s0().a((k5) s5Var, bVar);
    }
}

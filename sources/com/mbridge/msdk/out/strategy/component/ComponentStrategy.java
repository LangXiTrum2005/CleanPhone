package com.mbridge.msdk.out.strategy.component;

import android.app.Activity;
import com.applovin.impl.ca;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.strategy.IVideoAdStrategy;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ComponentStrategy extends BaseComponentStrategy implements IVideoAdStrategy {
    public ComponentStrategy(String str, String str2, int i10) {
        super(str, str2, i10);
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public boolean isReady() {
        try {
            if (com.mbridge.msdk.config.manager.a.c().e() || com.mbridge.msdk.config.manager.a.c().a(com.mbridge.msdk.config.manager.a.f32820p)) {
                return isReadyWithSyncWait(false);
            }
            return false;
        } catch (Exception e10) {
            q0.b("BaseComponentStrategy", "ComponentBidStrategy isBidReady error: " + e10.getMessage(), e10);
            return false;
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void load() {
        if (com.mbridge.msdk.config.manager.a.c().e() || com.mbridge.msdk.config.manager.a.c().a(com.mbridge.msdk.config.manager.a.f32821q)) {
            HashMap mapN = ca.n("bid_token", "");
            mapN.put("is_hb", 0);
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c1", mapN);
        } else {
            com.mbridge.msdk.config.manager.callback.b bVar = this.mComponentCallbackListener;
            if (bVar != null) {
                bVar.onVideoLoadFail(new MBridgeIds(this.placementId, this.unitId), "Unable to load");
            }
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show() {
        if (!com.mbridge.msdk.config.manager.a.c().e() && !com.mbridge.msdk.config.manager.a.c().a(com.mbridge.msdk.config.manager.a.f32822r)) {
            com.mbridge.msdk.config.manager.callback.b bVar = this.mComponentCallbackListener;
            if (bVar != null) {
                bVar.onShowFail(new MBridgeIds(this.placementId, this.unitId), "Unable to show");
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put("user_id", this.userId);
        map.put("user_extra_data", this.extraData);
        map.put("is_hb", 0);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c2", map);
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity) {
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(String str) {
        this.userId = str;
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity, String str) {
        this.userId = str;
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy, com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void loadFormSelfFilling() {
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity, String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        show();
    }
}

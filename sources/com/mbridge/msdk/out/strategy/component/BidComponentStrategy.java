package com.mbridge.msdk.out.strategy.component;

import android.app.Activity;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.strategy.IBidVideoAdStrategy;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class BidComponentStrategy extends BaseComponentStrategy implements IBidVideoAdStrategy {
    public BidComponentStrategy(String str, String str2, int i10) {
        super(str, str2, i10);
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public boolean isBidReady() {
        try {
            if (com.mbridge.msdk.config.manager.a.c().e() || com.mbridge.msdk.config.manager.a.c().a(com.mbridge.msdk.config.manager.a.f32820p)) {
                return isReadyWithSyncWait(true);
            }
            return false;
        } catch (Exception e10) {
            q0.b("BaseComponentStrategy", "ComponentBidStrategy isBidReady error: " + e10.getMessage(), e10);
            return false;
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void loadFromBid(String str) {
        try {
            if (!com.mbridge.msdk.config.manager.a.c().e() && !com.mbridge.msdk.config.manager.a.c().a(com.mbridge.msdk.config.manager.a.f32821q)) {
                com.mbridge.msdk.config.manager.callback.b bVar = this.mComponentCallbackListener;
                if (bVar != null) {
                    bVar.onVideoLoadFail(new MBridgeIds(this.placementId, this.unitId), "Unable to load");
                    return;
                }
                return;
            }
            this.bidToken = str;
            HashMap map = new HashMap();
            map.put("bid_token", str);
            map.put("is_hb", 1);
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c1", map);
        } catch (Exception e10) {
            q0.b("BaseComponentStrategy", "ComponentBidStrategy loadFromBid error: " + e10.getMessage(), e10);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid() {
        try {
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
            map.put("bid_token", this.bidToken);
            map.put("is_hb", 1);
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c2", map);
        } catch (Exception e10) {
            q0.b("BaseComponentStrategy", "ComponentBidStrategy showFromBid error: " + e10.getMessage(), e10);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity) {
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(String str) {
        this.userId = str;
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity, String str) {
        this.userId = str;
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void loadFormSelfFilling() {
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity, String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        showFromBid();
    }
}

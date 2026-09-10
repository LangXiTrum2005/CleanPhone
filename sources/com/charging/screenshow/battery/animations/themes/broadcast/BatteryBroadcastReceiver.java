package com.charging.screenshow.battery.animations.themes.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.applovin.sdk.AppLovinEventTypes;
import com.charging.screenshow.battery.animations.themes.activity.Charging3DShowAct;
import com.charging.screenshow.battery.animations.themes.activity.ChargingVideoShowAct;
import com.charging.screenshow.battery.animations.themes.entity.BaseMedia;
import com.charging.screenshow.battery.animations.themes.entity.Charging3D;
import com.charging.screenshow.battery.animations.themes.entity.event.EventBatteryChange;
import com.charging.screenshow.battery.animations.themes.entity.event.EventPowerConnected;
import com.charging.screenshow.battery.animations.themes.entity.event.EventPowerDisconnected;
import com.charging.screenshow.battery.animations.themes.network.entity.ChargingVideo;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferences;
import com.charging.screenshow.battery.animations.themes.utils.ActUtils;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/broadcast/BatteryBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BatteryBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13084a = 0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/broadcast/BatteryBroadcastReceiver$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.f(context, "context");
        Intrinsics.f(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1886648615) {
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    EventBus.b().f(new EventPowerDisconnected());
                    return;
                }
                return;
            }
            if (iHashCode == -1538406691) {
                if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                    EventBus.b().f(new EventBatteryChange(intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0), intent.getIntExtra("scale", 0)));
                    return;
                }
                return;
            }
            if (iHashCode == 1019184907 && action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                BaseMedia baseMediaB = AppPreferences.b();
                if (baseMediaB instanceof ChargingVideo) {
                    int i2 = ChargingVideoShowAct.n0;
                    ActUtils.b(AppExt.a(), ChargingVideoShowAct.class);
                } else if (baseMediaB instanceof Charging3D) {
                    int i3 = Charging3DShowAct.n0;
                    ActUtils.b(AppExt.a(), Charging3DShowAct.class);
                }
                EventBus.b().f(new EventPowerConnected());
            }
        }
    }
}

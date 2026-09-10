package com.charging.screenshow.battery.animations.themes.entity.event;

import com.applovin.sdk.AppLovinEventTypes;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/entity/event/EventBatteryChange;", "", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "I", "scale", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EventBatteryChange {
    private final int level;
    private final int scale;

    public EventBatteryChange(int i2, int i3) {
        this.level = i2;
        this.scale = i3;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append((this.level * 100) / this.scale);
        sb.append('%');
        return sb.toString();
    }
}

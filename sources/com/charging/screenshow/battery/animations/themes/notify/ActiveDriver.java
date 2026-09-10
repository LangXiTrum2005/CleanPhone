package com.charging.screenshow.battery.animations.themes.notify;

import com.applovin.impl.Z;
import com.charging.screenshow.battery.animations.themes.MyApp;
import com.charging.screenshow.battery.animations.themes.entity.event.EventNotify;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferencesUtil;
import com.charging.screenshow.battery.animations.themes.utils.async.Async;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.thinkup.core.common.om.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.a;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/notify/ActiveDriver;", "", "Lcom/charging/screenshow/battery/animations/themes/entity/event/EventNotify;", "event", "", "onEvent", "(Lcom/charging/screenshow/battery/animations/themes/entity/event/EventNotify;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActiveDriver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ActiveDriver f13295a = new ActiveDriver();

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(EventNotify event) {
        Intrinsics.f(event, "event");
        MyApp myAppA = AppExt.a();
        AppPreferencesUtil appPreferencesUtil = AppPreferencesUtil.f13313a;
        if (Z.z(appPreferencesUtil, "is_first_check_show_notify", true)) {
            appPreferencesUtil.b("is_first_check_show_notify", false);
            AppPreferencesUtil.d(appPreferencesUtil, AppExt.a()).putLong("last_show_notify", System.currentTimeMillis()).apply();
        } else {
            if (System.currentTimeMillis() - AppPreferencesUtil.a(appPreferencesUtil, AppExt.a()).getLong("last_show_notify", 0L) > 3.0d * n.m) {
                Async.a().f13317c.post(new a(myAppA, 2));
            }
        }
        AlarmUtil.a(AppExt.a());
    }
}

package com.charging.screenshow.battery.animations.themes.manager;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v4.media.a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.e;
import com.charging.screenshow.battery.animations.themes.MyApp;
import com.charging.screenshow.battery.animations.themes.activity.ChargingSettingAct;
import com.charging.screenshow.battery.animations.themes.activity.ChargingVideoAct;
import com.charging.screenshow.battery.animations.themes.activity.ImagePreviewAct;
import com.charging.screenshow.battery.animations.themes.activity.MainAct;
import com.charging.screenshow.battery.animations.themes.activity.PrivacyAct;
import com.charging.screenshow.battery.animations.themes.activity.ResultAct;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.zg.adlib.util.MagicAdUtil;
import java.util.ArrayList;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/manager/ReturnAppManager;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReturnAppManager implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
    public static final Object Z = LazyKt.a(LazyThreadSafetyMode.X, new e(6));
    public static boolean e0;
    public MyApp X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ArrayList f13283Y = new ArrayList();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/manager/ReturnAppManager$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.f(activity, "activity");
        this.f13283Y.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.f(activity, "activity");
        this.f13283Y.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        if (e0) {
            e0 = false;
            return;
        }
        ArrayList arrayList = this.f13283Y;
        Activity activity = arrayList.isEmpty() ? null : (Activity) a.d(1, arrayList);
        if (activity != null) {
            if (((activity instanceof MainAct) || (activity instanceof ImagePreviewAct) || (activity instanceof ResultAct) || (activity instanceof ChargingVideoAct) || (activity instanceof ChargingSettingAct) || (activity instanceof PrivacyAct)) && MagicAdUtil.getInstance(AppExt.a()).canShowAd()) {
                MagicAdUtil.getInstance(AppExt.a()).showInstAd(activity, new ReturnAppManager$showInstAd$1());
            }
        }
    }
}

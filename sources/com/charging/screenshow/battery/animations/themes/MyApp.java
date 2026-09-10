package com.charging.screenshow.battery.animations.themes;

import android.app.NotificationManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.multidex.MultiDexApplication;
import com.charging.screenshow.battery.animations.themes.broadcast.AlarmReceiver;
import com.charging.screenshow.battery.animations.themes.broadcast.BatteryBroadcastReceiver;
import com.charging.screenshow.battery.animations.themes.broadcast.BroadcastManager;
import com.charging.screenshow.battery.animations.themes.manager.BatteryManager;
import com.charging.screenshow.battery.animations.themes.manager.ReturnAppManager;
import com.charging.screenshow.battery.animations.themes.notify.ActiveDriver;
import com.charging.screenshow.battery.animations.themes.notify.AlarmUtil;
import com.charging.screenshow.battery.animations.themes.notify.NotificationConstant;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.kochava.core.log.internal.ClassLoggerApi;
import com.kochava.core.util.internal.TextUtil;
import com.kochava.tracker.Tracker;
import com.kochava.tracker.log.internal.Logger;
import com.nativec.nativetest.util.RemoteMagic;
import com.unity3d.ads.adplayer.b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import p006i.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/MyApp;", "Landroidx/multidex/MultiDexApplication;", "Landroidx/lifecycle/ViewModelStoreOwner;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MyApp extends MultiDexApplication implements ViewModelStoreOwner {
    public static final /* synthetic */ int e0 = 0;
    public ViewModelStore X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ViewModelProvider.AndroidViewModelFactory f13023Y;
    public BatteryManager Z;

    public final ViewModelProvider a() {
        if (this.f13023Y == null) {
            ViewModelProvider.AndroidViewModelFactory androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.d;
            if (ViewModelProvider.AndroidViewModelFactory.d == null) {
                ViewModelProvider.AndroidViewModelFactory.d = new ViewModelProvider.AndroidViewModelFactory(this);
            }
            ViewModelProvider.AndroidViewModelFactory androidViewModelFactory2 = ViewModelProvider.AndroidViewModelFactory.d;
            Intrinsics.c(androidViewModelFactory2);
            this.f13023Y = androidViewModelFactory2;
        }
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory3 = this.f13023Y;
        Intrinsics.d(androidViewModelFactory3, "null cannot be cast to non-null type androidx.lifecycle.ViewModelProvider.Factory");
        return new ViewModelProvider(this, androidViewModelFactory3);
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        ViewModelStore viewModelStore = this.X;
        if (viewModelStore != null) {
            return viewModelStore;
        }
        Intrinsics.m("mAppViewModelStore");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        AppExt.f13318a = this;
        RemoteMagic.b(this, new b(this, 5));
        this.Z = new BatteryManager(this);
        this.X = new ViewModelStore();
        ReturnAppManager returnAppManager = (ReturnAppManager) ReturnAppManager.Z.getX();
        returnAppManager.getClass();
        returnAppManager.X = this;
        ProcessLifecycleOwner.j0.g0.a(returnAppManager);
        MyApp myApp = returnAppManager.X;
        if (myApp == null) {
            Intrinsics.m("mApplication");
            throw null;
        }
        myApp.registerActivityLifecycleCallbacks(returnAppManager);
        if (Tracker.k == null) {
            synchronized (Tracker.j) {
                try {
                    if (Tracker.k == null) {
                        Tracker.k = new Tracker();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Tracker tracker = Tracker.k;
        Context applicationContext = getApplicationContext();
        tracker.getClass();
        synchronized (Tracker.j) {
            try {
                ClassLoggerApi classLoggerApi = Tracker.f28090i;
                Logger.c(classLoggerApi, "Host called API: Start With App GUID kom21-ani4k-anime-wallpaper-hd-2zca3");
                if (TextUtil.b("kom21-ani4k-anime-wallpaper-hd-2zca3")) {
                    classLoggerApi.b("startWithAppGuid failed, invalid app guid");
                } else {
                    tracker.a(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ((BroadcastManager) BroadcastManager.f13085a.getX()).getClass();
        int i2 = BatteryBroadcastReceiver.f13084a;
        MyApp myAppA = AppExt.a();
        BatteryBroadcastReceiver batteryBroadcastReceiver = new BatteryBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            myAppA.registerReceiver(batteryBroadcastReceiver, intentFilter, 4);
        } else {
            myAppA.registerReceiver(batteryBroadcastReceiver, intentFilter);
        }
        int i4 = AlarmReceiver.f13083a;
        MyApp myAppA2 = AppExt.a();
        AlarmReceiver alarmReceiver = new AlarmReceiver();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.anime4k.live.wallpaper.broadcast");
        if (i3 >= 34) {
            myAppA2.registerReceiver(alarmReceiver, intentFilter2, 4);
        } else {
            myAppA2.registerReceiver(alarmReceiver, intentFilter2);
        }
        ArrayList<String> groupIds = NotificationConstant.f13296a;
        Intrinsics.f(groupIds, "groupIds");
        if (i3 >= 26) {
            try {
                Object systemService = getSystemService("notification");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                NotificationManager notificationManager = (NotificationManager) systemService;
                for (String str : groupIds) {
                    try {
                        a.q();
                        notificationManager.createNotificationChannelGroup(a.d(str, str));
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
        }
        ActiveDriver activeDriver = ActiveDriver.f13295a;
        if (!EventBus.b().e(activeDriver)) {
            EventBus.b().j(activeDriver);
        }
        AlarmUtil.a(this);
    }
}

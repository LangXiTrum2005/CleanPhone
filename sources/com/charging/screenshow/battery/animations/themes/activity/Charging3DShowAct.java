package com.charging.screenshow.battery.animations.themes.activity;

import A.ViewOnClickListenerC0885d;
import android.app.KeyguardManager;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import com.applovin.impl.Z;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.ActThreeDShowBinding;
import com.charging.screenshow.battery.animations.themes.download.DownloadUtil;
import com.charging.screenshow.battery.animations.themes.entity.BaseMedia;
import com.charging.screenshow.battery.animations.themes.entity.Charging3D;
import com.charging.screenshow.battery.animations.themes.entity.Layer3D;
import com.charging.screenshow.battery.animations.themes.entity.event.EventBatteryChange;
import com.charging.screenshow.battery.animations.themes.entity.event.EventFinish;
import com.charging.screenshow.battery.animations.themes.entity.event.EventPowerDisconnected;
import com.charging.screenshow.battery.animations.themes.opengl.gl.GLBitmap;
import com.charging.screenshow.battery.animations.themes.opengl.image.RotationMonitor;
import com.charging.screenshow.battery.animations.themes.opengl.image.WallpaperRenderer;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferences;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferencesUtil;
import com.charging.screenshow.battery.animations.themes.utils.BatteryUtils;
import com.charging.screenshow.battery.animations.themes.utils.async.Async;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/Charging3DShowAct;", "Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "<init>", "()V", "Lcom/charging/screenshow/battery/animations/themes/entity/event/EventBatteryChange;", "event", "", "onEventBatteryChange", "(Lcom/charging/screenshow/battery/animations/themes/entity/event/EventBatteryChange;)V", "Lcom/charging/screenshow/battery/animations/themes/entity/event/EventPowerDisconnected;", "onEventPowerDisconnected", "(Lcom/charging/screenshow/battery/animations/themes/entity/event/EventPowerDisconnected;)V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Charging3DShowAct extends BaseAct {
    public static final /* synthetic */ int n0 = 0;
    public ActThreeDShowBinding h0;
    public WallpaperRenderer i0;
    public RotationMonitor j0;
    public Charging3D k0;
    public long l0;
    public PowerManager.WakeLock m0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/Charging3DShowAct$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void g() {
        long j;
        ActThreeDShowBinding actThreeDShowBinding = this.h0;
        if (actThreeDShowBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i2 = 0;
        ViewExt.c(actThreeDShowBinding.f13162e, new Function1(this) { // from class: com.charging.screenshow.battery.animations.themes.activity.g

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ Charging3DShowAct f13046Y;

            {
                this.f13046Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit = Unit.f43263a;
                Charging3DShowAct charging3DShowAct = this.f13046Y;
                View it = (View) obj;
                switch (i2) {
                    case 0:
                        int i3 = Charging3DShowAct.n0;
                        Intrinsics.f(it, "it");
                        int i4 = ChargingSettingAct.m0;
                        ChargingSettingAct.Companion.a(charging3DShowAct);
                        charging3DShowAct.finish();
                        return unit;
                    default:
                        int i5 = Charging3DShowAct.n0;
                        Intrinsics.f(it, "it");
                        ActThreeDShowBinding actThreeDShowBinding2 = charging3DShowAct.h0;
                        if (actThreeDShowBinding2 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actThreeDShowBinding2.g.setVisibility(8);
                        AppPreferencesUtil.f13313a.b("show_tips", false);
                        return unit;
                }
            }
        });
        ActThreeDShowBinding actThreeDShowBinding2 = this.h0;
        if (actThreeDShowBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i3 = 1;
        ViewExt.c(actThreeDShowBinding2.f13164i, new Function1(this) { // from class: com.charging.screenshow.battery.animations.themes.activity.g

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ Charging3DShowAct f13046Y;

            {
                this.f13046Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit = Unit.f43263a;
                Charging3DShowAct charging3DShowAct = this.f13046Y;
                View it = (View) obj;
                switch (i3) {
                    case 0:
                        int i4 = Charging3DShowAct.n0;
                        Intrinsics.f(it, "it");
                        int i5 = ChargingSettingAct.m0;
                        ChargingSettingAct.Companion.a(charging3DShowAct);
                        charging3DShowAct.finish();
                        return unit;
                    default:
                        int i6 = Charging3DShowAct.n0;
                        Intrinsics.f(it, "it");
                        ActThreeDShowBinding actThreeDShowBinding3 = charging3DShowAct.h0;
                        if (actThreeDShowBinding3 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actThreeDShowBinding3.g.setVisibility(8);
                        AppPreferencesUtil.f13313a.b("show_tips", false);
                        return unit;
                }
            }
        });
        AppPreferencesUtil appPreferencesUtil = AppPreferencesUtil.f13313a;
        int i4 = AppPreferencesUtil.a(appPreferencesUtil, AppExt.a()).getInt("charging_show_duration", 0);
        if (i4 == 5) {
            j = 5000;
        } else if (i4 == 10) {
            j = 10000;
        } else if (i4 == 15) {
            j = MBInterstitialActivity.WEB_LOAD_TIME;
        } else if (i4 == 30) {
            j = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        } else if (i4 != 60) {
            j = i4 != 180 ? 0L : 180000L;
        } else {
            j = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
        if (j != 0) {
            Async.b(j, new c0.a(this, 10));
        }
        if (AppPreferences.a() == 2 && Z.z(appPreferencesUtil, "show_tips", true)) {
            ActThreeDShowBinding actThreeDShowBinding3 = this.h0;
            if (actThreeDShowBinding3 != null) {
                actThreeDShowBinding3.g.setVisibility(0);
            } else {
                Intrinsics.m("binding");
                throw null;
            }
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void h() {
        Object systemService = getSystemService("power");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(805306378, "ChargingShow:ActivityWakeLock");
        wakeLockNewWakeLock.acquire(10000L);
        this.m0 = wakeLockNewWakeLock;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
        } else {
            getWindow().addFlags(2621440);
        }
        Object systemService2 = getSystemService("keyguard");
        Intrinsics.d(systemService2, "null cannot be cast to non-null type android.app.KeyguardManager");
        KeyguardManager keyguardManager = (KeyguardManager) systemService2;
        if (i2 >= 26) {
            keyguardManager.requestDismissKeyguard(this, null);
        } else {
            keyguardManager.newKeyguardLock("ChargingShow").disableKeyguard();
        }
        getWindow().addFlags(128);
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void i() {
        Charging3D charging3D;
        getWindow().addFlags(1024);
        getWindow().getDecorView().setSystemUiVisibility(6);
        if (AppPreferences.b() == null) {
            charging3D = null;
        } else {
            BaseMedia baseMediaB = AppPreferences.b();
            Intrinsics.d(baseMediaB, "null cannot be cast to non-null type com.charging.screenshow.battery.animations.themes.entity.Charging3D");
            charging3D = (Charging3D) baseMediaB;
        }
        this.k0 = charging3D;
        if (charging3D == null) {
            finish();
        } else {
            this.f0 = false;
            EventBus.b().f(new EventFinish());
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View l() {
        View viewInflate = getLayoutInflater().inflate(R.layout.act_three_d_show, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i2 = R.id.gl_surface_view;
        GLSurfaceView gLSurfaceView = (GLSurfaceView) ViewBindings.a(R.id.gl_surface_view, viewInflate);
        if (gLSurfaceView != null) {
            i2 = R.id.ivLighting;
            ImageView imageView = (ImageView) ViewBindings.a(R.id.ivLighting, viewInflate);
            if (imageView != null) {
                i2 = R.id.ivSettings;
                ImageView imageView2 = (ImageView) ViewBindings.a(R.id.ivSettings, viewInflate);
                if (imageView2 != null) {
                    i2 = R.id.llChargingText;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.a(R.id.llChargingText, viewInflate);
                    if (linearLayout != null) {
                        i2 = R.id.llTips;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.a(R.id.llTips, viewInflate);
                        if (linearLayout2 != null) {
                            i2 = R.id.tvBattery;
                            TextView textView = (TextView) ViewBindings.a(R.id.tvBattery, viewInflate);
                            if (textView != null) {
                                i2 = R.id.tvClose;
                                TextView textView2 = (TextView) ViewBindings.a(R.id.tvClose, viewInflate);
                                if (textView2 != null) {
                                    i2 = R.id.tvText;
                                    if (((TextView) ViewBindings.a(R.id.tvText, viewInflate)) != null) {
                                        this.h0 = new ActThreeDShowBinding(frameLayout, frameLayout, gLSurfaceView, imageView, imageView2, linearLayout, linearLayout2, textView, textView2);
                                        Intrinsics.e(frameLayout, "getRoot(...)");
                                        return frameLayout;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View m() {
        return null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void o() {
        Layer3D pictures;
        ActThreeDShowBinding actThreeDShowBinding = this.h0;
        if (actThreeDShowBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDShowBinding.f13161c.setEGLContextClientVersion(2);
        ActThreeDShowBinding actThreeDShowBinding2 = this.h0;
        if (actThreeDShowBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDShowBinding2.f13161c.setPreserveEGLContextOnPause(true);
        WallpaperRenderer wallpaperRenderer = new WallpaperRenderer();
        this.i0 = wallpaperRenderer;
        ActThreeDShowBinding actThreeDShowBinding3 = this.h0;
        if (actThreeDShowBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDShowBinding3.f13161c.setRenderer(wallpaperRenderer);
        ActThreeDShowBinding actThreeDShowBinding4 = this.h0;
        if (actThreeDShowBinding4 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDShowBinding4.f13161c.setRenderMode(0);
        Charging3D charging3D = this.k0;
        if (charging3D != null && (pictures = charging3D.getPictures()) != null) {
            String name = charging3D.getName();
            WallpaperRenderer wallpaperRenderer2 = this.i0;
            if (wallpaperRenderer2 != null) {
                wallpaperRenderer2.j0 = (20 * 0.003f) + 0.03f;
                List listI = CollectionsKt.I(DownloadUtil.b(pictures.getLayer1(), name), DownloadUtil.b(pictures.getLayer2(), name), DownloadUtil.b(pictures.getLayer3(), name));
                List listI2 = CollectionsKt.I(Float.valueOf(0.6f), Float.valueOf(-0.6f), Float.valueOf(1.0f));
                List list = listI;
                ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new GLBitmap((String) it.next()));
                }
                List list2 = listI2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Float.valueOf(((Number) it2.next()).floatValue()));
                }
                wallpaperRenderer2.b();
                ArrayList arrayList3 = wallpaperRenderer2.X;
                arrayList3.addAll(arrayList);
                wallpaperRenderer2.h0 = arrayList3.size();
                ArrayList arrayList4 = wallpaperRenderer2.f13312Y;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                wallpaperRenderer2.i0 = arrayList4.size();
                ActThreeDShowBinding actThreeDShowBinding5 = this.h0;
                if (actThreeDShowBinding5 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actThreeDShowBinding5.f13161c.requestRender();
                ActThreeDShowBinding actThreeDShowBinding6 = this.h0;
                if (actThreeDShowBinding6 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actThreeDShowBinding6.f13161c.setOnClickListener(new ViewOnClickListenerC0885d(this, 15));
                RotationMonitor rotationMonitor = this.j0;
                if (rotationMonitor != null) {
                    rotationMonitor.b();
                }
                RotationMonitor rotationMonitor2 = new RotationMonitor(this, new RotationMonitor.RotationChangedListener() { // from class: com.charging.screenshow.battery.animations.themes.activity.Charging3DShowAct$startRotationMonitor$1
                    @Override // com.charging.screenshow.battery.animations.themes.opengl.image.RotationMonitor.RotationChangedListener
                    public final void a(float[] fArr) {
                        Charging3DShowAct charging3DShowAct = this.f13034a;
                        if (charging3DShowAct.getResources().getConfiguration().orientation == 2) {
                            WallpaperRenderer wallpaperRenderer3 = charging3DShowAct.i0;
                            if (wallpaperRenderer3 != null) {
                                wallpaperRenderer3.a(fArr[1], fArr[2]);
                            }
                        } else {
                            WallpaperRenderer wallpaperRenderer4 = charging3DShowAct.i0;
                            if (wallpaperRenderer4 != null) {
                                wallpaperRenderer4.a(fArr[2], fArr[1]);
                            }
                        }
                        ActThreeDShowBinding actThreeDShowBinding7 = charging3DShowAct.h0;
                        if (actThreeDShowBinding7 != null) {
                            actThreeDShowBinding7.f13161c.requestRender();
                        } else {
                            Intrinsics.m("binding");
                            throw null;
                        }
                    }
                });
                this.j0 = rotationMonitor2;
                rotationMonitor2.a();
            }
        }
        ActThreeDShowBinding actThreeDShowBinding7 = this.h0;
        if (actThreeDShowBinding7 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDShowBinding7.d.startAnimation(AnimationUtils.loadAnimation(this, R.anim.ani_scale));
        ActThreeDShowBinding actThreeDShowBinding8 = this.h0;
        if (actThreeDShowBinding8 != null) {
            actThreeDShowBinding8.f13163h.setText(android.support.v4.media.a.p(new StringBuilder(), (int) BatteryUtils.a(this), '%'));
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        RotationMonitor rotationMonitor = this.j0;
        if (rotationMonitor != null) {
            rotationMonitor.b();
        }
        WallpaperRenderer wallpaperRenderer = this.i0;
        if (wallpaperRenderer != null) {
            wallpaperRenderer.b();
            wallpaperRenderer.f13312Y.clear();
        }
        PowerManager.WakeLock wakeLock = this.m0;
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release();
        }
        this.m0 = null;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEventBatteryChange(EventBatteryChange event) {
        if (event != null) {
            AppExt.b(new f(0, this, event));
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEventPowerDisconnected(EventPowerDisconnected event) {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        RotationMonitor rotationMonitor = this.j0;
        if (rotationMonitor != null) {
            rotationMonitor.b();
        }
        ActThreeDShowBinding actThreeDShowBinding = this.h0;
        if (actThreeDShowBinding != null) {
            actThreeDShowBinding.f13161c.onPause();
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        RotationMonitor rotationMonitor = this.j0;
        if (rotationMonitor != null) {
            rotationMonitor.a();
        }
        ActThreeDShowBinding actThreeDShowBinding = this.h0;
        if (actThreeDShowBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDShowBinding.f13161c.onResume();
        ActThreeDShowBinding actThreeDShowBinding2 = this.h0;
        if (actThreeDShowBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actThreeDShowBinding2.f13163h.setText(android.support.v4.media.a.p(new StringBuilder(), (int) BatteryUtils.a(this), '%'));
        if (Z.z(AppPreferencesUtil.f13313a, "charging_show_battery_text", true)) {
            ActThreeDShowBinding actThreeDShowBinding3 = this.h0;
            if (actThreeDShowBinding3 != null) {
                ViewExt.b(actThreeDShowBinding3.f);
                return;
            } else {
                Intrinsics.m("binding");
                throw null;
            }
        }
        ActThreeDShowBinding actThreeDShowBinding4 = this.h0;
        if (actThreeDShowBinding4 != null) {
            ViewExt.a(actThreeDShowBinding4.f);
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }
}

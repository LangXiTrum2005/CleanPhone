package com.charging.screenshow.battery.animations.themes.activity;

import A.ViewOnClickListenerC0885d;
import android.app.KeyguardManager;
import android.graphics.Color;
import android.net.Uri;
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
import com.charging.screenshow.battery.animations.themes.databinding.ActChargingShowBinding;
import com.charging.screenshow.battery.animations.themes.download.DownloadUtil;
import com.charging.screenshow.battery.animations.themes.entity.BaseMedia;
import com.charging.screenshow.battery.animations.themes.entity.event.EventBatteryChange;
import com.charging.screenshow.battery.animations.themes.entity.event.EventFinish;
import com.charging.screenshow.battery.animations.themes.entity.event.EventPowerDisconnected;
import com.charging.screenshow.battery.animations.themes.network.entity.ChargingVideo;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferences;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferencesUtil;
import com.charging.screenshow.battery.animations.themes.utils.BatteryUtils;
import com.charging.screenshow.battery.animations.themes.utils.DeviceUtil;
import com.charging.screenshow.battery.animations.themes.utils.async.Async;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.view.scalablevideoview.ScalableType;
import com.charging.screenshow.battery.animations.themes.view.scalablevideoview.ScalableVideoView;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import es.dmoral.toasty.Toasty;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ChargingVideoShowAct;", "Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "<init>", "()V", "Lcom/charging/screenshow/battery/animations/themes/entity/event/EventBatteryChange;", "event", "", "onEventBatteryChange", "(Lcom/charging/screenshow/battery/animations/themes/entity/event/EventBatteryChange;)V", "Lcom/charging/screenshow/battery/animations/themes/entity/event/EventPowerDisconnected;", "onEventPowerDisconnected", "(Lcom/charging/screenshow/battery/animations/themes/entity/event/EventPowerDisconnected;)V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChargingVideoShowAct extends BaseAct {
    public static final /* synthetic */ int n0 = 0;
    public ActChargingShowBinding h0;
    public ChargingVideo i0;
    public long j0;
    public PowerManager.WakeLock k0;
    public boolean l0;
    public boolean m0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ChargingVideoShowAct$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void g() {
        long j;
        ActChargingShowBinding actChargingShowBinding = this.h0;
        if (actChargingShowBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i2 = 0;
        ViewExt.c(actChargingShowBinding.d, new Function1(this) { // from class: com.charging.screenshow.battery.animations.themes.activity.p

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ ChargingVideoShowAct f13055Y;

            {
                this.f13055Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit = Unit.f43263a;
                ChargingVideoShowAct chargingVideoShowAct = this.f13055Y;
                View it = (View) obj;
                switch (i2) {
                    case 0:
                        int i3 = ChargingVideoShowAct.n0;
                        Intrinsics.f(it, "it");
                        int i4 = ChargingSettingAct.m0;
                        ChargingSettingAct.Companion.a(chargingVideoShowAct);
                        chargingVideoShowAct.finish();
                        return unit;
                    default:
                        int i5 = ChargingVideoShowAct.n0;
                        Intrinsics.f(it, "it");
                        ActChargingShowBinding actChargingShowBinding2 = chargingVideoShowAct.h0;
                        if (actChargingShowBinding2 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actChargingShowBinding2.f.setVisibility(8);
                        AppPreferencesUtil.f13313a.b("show_tips", false);
                        return unit;
                }
            }
        });
        ActChargingShowBinding actChargingShowBinding2 = this.h0;
        if (actChargingShowBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        final int i3 = 1;
        ViewExt.c(actChargingShowBinding2.f13124i, new Function1(this) { // from class: com.charging.screenshow.battery.animations.themes.activity.p

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ ChargingVideoShowAct f13055Y;

            {
                this.f13055Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unit = Unit.f43263a;
                ChargingVideoShowAct chargingVideoShowAct = this.f13055Y;
                View it = (View) obj;
                switch (i3) {
                    case 0:
                        int i4 = ChargingVideoShowAct.n0;
                        Intrinsics.f(it, "it");
                        int i5 = ChargingSettingAct.m0;
                        ChargingSettingAct.Companion.a(chargingVideoShowAct);
                        chargingVideoShowAct.finish();
                        return unit;
                    default:
                        int i6 = ChargingVideoShowAct.n0;
                        Intrinsics.f(it, "it");
                        ActChargingShowBinding actChargingShowBinding3 = chargingVideoShowAct.h0;
                        if (actChargingShowBinding3 == null) {
                            Intrinsics.m("binding");
                            throw null;
                        }
                        actChargingShowBinding3.f.setVisibility(8);
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
            Async.b(j, new c0.a(this, 12));
        }
        if (AppPreferences.a() == 2 && Z.z(appPreferencesUtil, "show_tips", true)) {
            ActChargingShowBinding actChargingShowBinding3 = this.h0;
            if (actChargingShowBinding3 != null) {
                actChargingShowBinding3.f.setVisibility(0);
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
        this.k0 = wakeLockNewWakeLock;
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
        ChargingVideo chargingVideo;
        getWindow().addFlags(1024);
        getWindow().getDecorView().setSystemUiVisibility(6);
        if (AppPreferences.b() == null) {
            chargingVideo = null;
        } else {
            BaseMedia baseMediaB = AppPreferences.b();
            Intrinsics.d(baseMediaB, "null cannot be cast to non-null type com.charging.screenshow.battery.animations.themes.network.entity.ChargingVideo");
            chargingVideo = (ChargingVideo) baseMediaB;
        }
        this.i0 = chargingVideo;
        if (chargingVideo == null) {
            finish();
        } else {
            this.f0 = false;
            EventBus.b().f(new EventFinish());
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View l() {
        View viewInflate = getLayoutInflater().inflate(R.layout.act_charging_show, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i2 = R.id.ivLighting;
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
                        i2 = R.id.svv;
                        ScalableVideoView scalableVideoView = (ScalableVideoView) ViewBindings.a(R.id.svv, viewInflate);
                        if (scalableVideoView != null) {
                            i2 = R.id.tvBattery;
                            TextView textView = (TextView) ViewBindings.a(R.id.tvBattery, viewInflate);
                            if (textView != null) {
                                i2 = R.id.tvClose;
                                TextView textView2 = (TextView) ViewBindings.a(R.id.tvClose, viewInflate);
                                if (textView2 != null) {
                                    i2 = R.id.tvText;
                                    if (((TextView) ViewBindings.a(R.id.tvText, viewInflate)) != null) {
                                        this.h0 = new ActChargingShowBinding(frameLayout, frameLayout, imageView, imageView2, linearLayout, linearLayout2, scalableVideoView, textView, textView2);
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
        try {
            ActChargingShowBinding actChargingShowBinding = this.h0;
            if (actChargingShowBinding == null) {
                Intrinsics.m("binding");
                throw null;
            }
            FrameLayout frameLayout = actChargingShowBinding.f13120b;
            ChargingVideo chargingVideo = this.i0;
            Intrinsics.c(chargingVideo);
            frameLayout.setAlpha(Float.parseFloat(chargingVideo.getAlpha()));
            ChargingVideo chargingVideo2 = this.i0;
            if (chargingVideo2 != null) {
                float f = Float.parseFloat(chargingVideo2.getY()) * (DeviceUtil.a(this) / 2);
                ActChargingShowBinding actChargingShowBinding2 = this.h0;
                if (actChargingShowBinding2 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actChargingShowBinding2.f13122e.setTranslationY(f);
                ActChargingShowBinding actChargingShowBinding3 = this.h0;
                if (actChargingShowBinding3 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actChargingShowBinding3.f13121c.setColorFilter(Color.parseColor(chargingVideo2.getTextColor()));
                ActChargingShowBinding actChargingShowBinding4 = this.h0;
                if (actChargingShowBinding4 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actChargingShowBinding4.f13121c.startAnimation(AnimationUtils.loadAnimation(this, R.anim.ani_scale));
                ActChargingShowBinding actChargingShowBinding5 = this.h0;
                if (actChargingShowBinding5 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actChargingShowBinding5.f13123h.setTextColor(Color.parseColor(chargingVideo2.getTextColor()));
                ActChargingShowBinding actChargingShowBinding6 = this.h0;
                if (actChargingShowBinding6 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actChargingShowBinding6.f13123h.setText(android.support.v4.media.a.p(new StringBuilder(), (int) BatteryUtils.a(this), '%'));
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        PowerManager.WakeLock wakeLock = this.k0;
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release();
        }
        this.k0 = null;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEventBatteryChange(EventBatteryChange event) {
        if (event != null) {
            AppExt.b(new f(5, this, event));
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEventPowerDisconnected(EventPowerDisconnected event) {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            ActChargingShowBinding actChargingShowBinding = this.h0;
            if (actChargingShowBinding == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actChargingShowBinding.g.e0.pause();
            this.l0 = true;
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ActChargingShowBinding actChargingShowBinding = this.h0;
        if (actChargingShowBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actChargingShowBinding.f13123h.setText(android.support.v4.media.a.p(new StringBuilder(), (int) BatteryUtils.a(this), '%'));
        if (Z.z(AppPreferencesUtil.f13313a, "charging_show_battery_text", true)) {
            ActChargingShowBinding actChargingShowBinding2 = this.h0;
            if (actChargingShowBinding2 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            ViewExt.b(actChargingShowBinding2.f13122e);
        } else {
            ActChargingShowBinding actChargingShowBinding3 = this.h0;
            if (actChargingShowBinding3 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            ViewExt.a(actChargingShowBinding3.f13122e);
        }
        if (!this.m0) {
            ChargingVideo chargingVideo = this.i0;
            Intrinsics.c(chargingVideo);
            String url = chargingVideo.k();
            ChargingVideo chargingVideo2 = this.i0;
            Intrinsics.c(chargingVideo2);
            String strH = chargingVideo2.h();
            Intrinsics.f(url, "url");
            File file = new File(DownloadUtil.b(url, strH));
            Uri uriFromFile = (file.isFile() && file.exists()) ? Uri.fromFile(file) : null;
            if (uriFromFile == null) {
                Toasty.b(this, IntExt.c(R.string.video_not_downloaded)).show();
                return;
            }
            try {
                ActChargingShowBinding actChargingShowBinding4 = this.h0;
                if (actChargingShowBinding4 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                ScalableVideoView scalableVideoView = actChargingShowBinding4.g;
                scalableVideoView.a();
                scalableVideoView.e0.setDataSource(this, uriFromFile);
                ActChargingShowBinding actChargingShowBinding5 = this.h0;
                if (actChargingShowBinding5 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actChargingShowBinding5.g.setLooping(true);
                ActChargingShowBinding actChargingShowBinding6 = this.h0;
                if (actChargingShowBinding6 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                ScalableVideoView scalableVideoView2 = actChargingShowBinding6.g;
                scalableVideoView2.e0.setOnPreparedListener(null);
                scalableVideoView2.e0.prepare();
                ActChargingShowBinding actChargingShowBinding7 = this.h0;
                if (actChargingShowBinding7 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actChargingShowBinding7.g.e0.start();
                ActChargingShowBinding actChargingShowBinding8 = this.h0;
                if (actChargingShowBinding8 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actChargingShowBinding8.g.setScalableType(ScalableType.f13335Y);
                ActChargingShowBinding actChargingShowBinding9 = this.h0;
                if (actChargingShowBinding9 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                actChargingShowBinding9.g.e0.setVolume(0.0f, 0.0f);
                this.m0 = true;
                ActChargingShowBinding actChargingShowBinding10 = this.h0;
                if (actChargingShowBinding10 != null) {
                    actChargingShowBinding10.g.setOnClickListener(new ViewOnClickListenerC0885d(this, 17));
                    return;
                } else {
                    Intrinsics.m("binding");
                    throw null;
                }
            } catch (Exception unused) {
                return;
            }
        }
        if (!this.l0) {
            return;
        }
        try {
            ActChargingShowBinding actChargingShowBinding11 = this.h0;
            if (actChargingShowBinding11 == null) {
                Intrinsics.m("binding");
                throw null;
            }
            actChargingShowBinding11.g.e0.start();
            this.l0 = false;
        } catch (Exception unused2) {
        }
    }
}

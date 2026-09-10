package com.codejoy.boom.clap.module.splash;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.MainActivity;
import com.codejoy.boom.clap.helper.CommonHomeSupplement;
import com.codejoy.boom.clap.helper.VersionHelper;
import com.codejoy.boom.clap.helper.impromptu;
import com.codejoy.boom.clap.module.base.BaseActivity;
import com.codejoy.boom.clap.module.guide.LanguageGuideActivity;
import com.yoadx.ad.lib.bean.AdUnitReportInfo;
import com.yoadx.ad.lib.bean.LoadedAdObject;
import com.yoadx.ad.lib.core.YoadAdSdk;
import couple.beachfront;
import igbo.polloi;
import java.util.TimeZone;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import vintage.taiyuan;

/* JADX INFO: compiled from: SplashActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/codejoy/boom/clap/module/splash/SplashActivity;", "Lcom/codejoy/boom/clap/module/base/BaseActivity;", "Lsonnetize/saneness;", "<init>", "()V", "milliradian", "()Lsonnetize/saneness;", "", "privatdozent", "saran", "", "delayMillis", "clubfoot", "(J)V", "", "overspeculate", "()Z", "itchy", "premeiotic", "showInter", "treadless", "(Z)V", "cord", "Z", "isFirstOpen", "cuirassed", "hasHandledSplashNotificationPermission", "Lwireman/dern;", "", "stratoscope", "Lwireman/dern;", "notificationPermissionLauncher", "", "trm", "I", "maxCheckTime", "oilcan", "J", "maxAnimationTime", "yemenite", "checkTimes", "Landroid/os/Handler;", "sealless", "Landroid/os/Handler;", "mHandler", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplashActivity extends BaseActivity<sonnetize.saneness> {

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public boolean isFirstOpen;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public boolean hasHandledSplashNotificationPermission;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public int checkTimes;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final wireman.dern<String> notificationPermissionLauncher = registerForActivityResult(new marial.dern(), new wireman.attabal() { // from class: com.codejoy.boom.clap.module.splash.saneness
        @Override // wireman.attabal
        public final void onActivityResult(Object obj) {
            SplashActivity.timberyard(((Boolean) obj).booleanValue());
        }
    });

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public final int maxCheckTime = 15;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public final long maxAnimationTime = 15000;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public final Handler mHandler = new Handler(Looper.getMainLooper());

    public static final void cultivated(SplashActivity splashActivity) {
        String str = splashActivity.isFirstOpen ? "ad_scenes_first_cold_start_app" : "ad_scenes_cold_start_app";
        couple.saneness.f24112attabal.saneness().triweekly(str, null);
        couple.wireman.f24115attabal.saneness().triweekly(str, null);
        beachfront beachfrontVar = beachfront.f24107attabal;
        beachfrontVar.marial().preprohormone(str);
        if (splashActivity.isFirstOpen) {
            beachfrontVar.marial().restrictive();
        }
    }

    public static /* synthetic */ void dent(SplashActivity splashActivity, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        splashActivity.clubfoot(j);
    }

    public static final void permissivist(SplashActivity splashActivity, long j) {
        splashActivity.checkTimes += (int) (j / 1000);
        boolean zApical = couple.saneness.f24112attabal.saneness().apical();
        if (splashActivity.isFirstOpen && !splashActivity.hasHandledSplashNotificationPermission && (zApical || splashActivity.checkTimes >= 3)) {
            splashActivity.hasHandledSplashNotificationPermission = true;
            if (!splashActivity.overspeculate()) {
                splashActivity.clubfoot(5000L);
                return;
            }
        }
        if (zApical) {
            splashActivity.premeiotic();
        } else if (splashActivity.checkTimes < splashActivity.maxCheckTime) {
            dent(splashActivity, 0L, 1, null);
        } else {
            splashActivity.premeiotic();
        }
    }

    public static final void timberyard(boolean z) {
        if (z) {
            stonecrop.attabal.f38160attabal.attabal();
        } else {
            stonecrop.attabal.f38160attabal.saneness();
        }
    }

    public final void clubfoot(final long delayMillis) {
        this.mHandler.postDelayed(new Runnable() { // from class: com.codejoy.boom.clap.module.splash.wireman
            @Override // java.lang.Runnable
            public final void run() {
                SplashActivity.permissivist(this.f18508kowloon, delayMillis);
            }
        }, delayMillis);
    }

    public final void itchy() {
        com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("NotificationPermission", "启动页发起通知权限申请");
        stonecrop.attabal.f38160attabal.dern();
        this.notificationPermissionLauncher.attabal("android.permission.POST_NOTIFICATIONS");
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    /* JADX INFO: renamed from: milliradian, reason: merged with bridge method [inline-methods] */
    public sonnetize.saneness starveling() {
        sonnetize.saneness sanenessVarDern = sonnetize.saneness.dern(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(sanenessVarDern, "inflate(...)");
        return sanenessVarDern;
    }

    public final boolean overspeculate() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (picketboat.saneness.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
                com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("NotificationPermission", "启动页通知权限已开启");
                return true;
            }
            itchy();
            return false;
        }
        boolean zAttabal = polloi.saneness(this).attabal();
        if (!zAttabal) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("NotificationPermission", "启动页系统通知未开启");
            return zAttabal;
        }
        stonecrop.attabal attabalVar = stonecrop.attabal.f38160attabal;
        attabalVar.dern();
        attabalVar.attabal();
        return zAttabal;
    }

    public final void premeiotic() {
        grimness().f37958dern.cancelAnim();
        String str = this.isFirstOpen ? "ad_scenes_first_cold_start_app" : "ad_scenes_cold_start_app";
        couple.saneness sanenessVar = couple.saneness.f24112attabal;
        if (sanenessVar.saneness().apical()) {
            sanenessVar.saneness().gintrap(this, str, new attabal());
            return;
        }
        tower.attabal attabalVar = tower.attabal.f38900attabal;
        attabalVar.formularize(str, new AdUnitReportInfo("app_open", "", "", "", "", null, 32, null));
        attabalVar.apical(str, new AdUnitReportInfo("app_open", "", "", "", "", null, 32, null));
        treadless(true);
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void privatdozent() {
        stonecrop.wireman.f38163attabal.dern("1a_cold_start_app", TimeZone.getDefault().getID(), jugal.attabal.f29013attabal.beachfront());
        ConstraintLayout root = grimness().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        taiyuan.impassible(root);
        this.isFirstOpen = tau.saneness.f38666attabal.preprohormone();
        VersionHelper.f18244attabal.dern();
        YoadAdSdk.f23874attabal.impassible(new artsy.dern() { // from class: com.codejoy.boom.clap.module.splash.dern
            @Override // artsy.dern
            public final void attabal() {
                SplashActivity.cultivated(this.f18506attabal);
            }
        });
        CommonHomeSupplement.f18243attabal.marial(this, this.isFirstOpen);
        try {
            Object systemService = getSystemService("notification");
            Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancelAll();
        } catch (Exception unused) {
        }
        grimness().f37958dern.startAnim(this.maxAnimationTime);
        if (this.isFirstOpen) {
            stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "1a_start_page_show", null, null, null, null, 30, null);
        }
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void saran() {
        this.checkTimes = 0;
        dent(this, 0L, 1, null);
    }

    public final void treadless(boolean showInter) {
        if (this.isFirstOpen) {
            startActivity(new Intent(this, (Class<?>) LanguageGuideActivity.class));
            if (showInter && !VersionHelper.f18244attabal.wireman()) {
                couple.wireman.f24115attabal.saneness().gintrap(this, "ad_scenes_first_cold_start_app", new saneness());
            }
        } else {
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.putExtras(getIntent());
            startActivity(intent);
            if (showInter && isoparametric.dern.f29008attabal.attabal()) {
                couple.wireman.f24115attabal.saneness().gintrap(this, "ad_scenes_cold_start", new dern());
            }
        }
        finish();
    }

    /* JADX INFO: compiled from: SplashActivity.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/codejoy/boom/clap/module/splash/SplashActivity$attabal", "Lartsy/saneness;", "Lextensimeter/attabal;", "Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "adObject", "", "wireman", "(Lcom/yoadx/ad/lib/bean/LoadedAdObject;)V", "marial", "()V", "dern", "saneness", "Lcomplexometry/taiyuan;", "adValue", "attabal", "(Lcomplexometry/taiyuan;)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements artsy.saneness<extensimeter.attabal> {
        public attabal() {
        }

        @Override // artsy.saneness
        public void attabal(complexometry.taiyuan adValue) {
            Intrinsics.checkNotNullParameter(adValue, "adValue");
            impromptu.f18262attabal.attabal(adValue);
        }

        @Override // artsy.saneness
        public void dern() {
            SplashActivity.this.treadless(false);
        }

        @Override // artsy.saneness
        public void marial() {
            SplashActivity.this.treadless(false);
        }

        @Override // artsy.saneness
        public void saneness() {
        }

        @Override // artsy.saneness
        public void wireman(LoadedAdObject<extensimeter.attabal> adObject) {
        }
    }

    /* JADX INFO: compiled from: SplashActivity.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/codejoy/boom/clap/module/splash/SplashActivity$dern", "Lartsy/saneness;", "Lgargoyle/attabal;", "Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "adObject", "", "wireman", "(Lcom/yoadx/ad/lib/bean/LoadedAdObject;)V", "marial", "()V", "dern", "saneness", "Lcomplexometry/taiyuan;", "adValue", "attabal", "(Lcomplexometry/taiyuan;)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class dern implements artsy.saneness<gargoyle.attabal> {
        @Override // artsy.saneness
        public void attabal(complexometry.taiyuan adValue) {
            Intrinsics.checkNotNullParameter(adValue, "adValue");
            impromptu.f18262attabal.attabal(adValue);
        }

        @Override // artsy.saneness
        public void dern() {
        }

        @Override // artsy.saneness
        public void marial() {
        }

        @Override // artsy.saneness
        public void saneness() {
        }

        @Override // artsy.saneness
        public void wireman(LoadedAdObject<gargoyle.attabal> adObject) {
        }
    }

    /* JADX INFO: compiled from: SplashActivity.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/codejoy/boom/clap/module/splash/SplashActivity$saneness", "Lartsy/saneness;", "Lgargoyle/attabal;", "Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "adObject", "", "wireman", "(Lcom/yoadx/ad/lib/bean/LoadedAdObject;)V", "marial", "()V", "dern", "saneness", "Lcomplexometry/taiyuan;", "adValue", "attabal", "(Lcomplexometry/taiyuan;)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness implements artsy.saneness<gargoyle.attabal> {
        @Override // artsy.saneness
        public void attabal(complexometry.taiyuan adValue) {
            Intrinsics.checkNotNullParameter(adValue, "adValue");
            impromptu.f18262attabal.attabal(adValue);
        }

        @Override // artsy.saneness
        public void dern() {
        }

        @Override // artsy.saneness
        public void marial() {
        }

        @Override // artsy.saneness
        public void saneness() {
        }

        @Override // artsy.saneness
        public void wireman(LoadedAdObject<gargoyle.attabal> adObject) {
        }
    }
}

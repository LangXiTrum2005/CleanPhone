package com.codejoy.boom.clap.module.splash;

import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p000activity.sealless;
import androidx.p000activity.supplicat;
import androidx.p001lifecycle.monoploid;
import com.codejoy.boom.clap.module.base.BaseActivity;
import com.yoadx.ad.lib.bean.AdUnitReportInfo;
import com.yoadx.ad.lib.bean.LoadedAdObject;
import kotlinx.coroutines.cutely;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import sonnetize.beachfront;
import vintage.taiyuan;

/* JADX INFO: compiled from: HotActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u001d\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/codejoy/boom/clap/module/splash/HotActivity;", "Lcom/codejoy/boom/clap/module/base/BaseActivity;", "Lsonnetize/beachfront;", "<init>", "()V", "treadless", "()Lsonnetize/beachfront;", "", "privatdozent", "saran", "cultivated", "coffeecake", "itchy", "timberyard", "premeiotic", "", "cord", "I", "maxCheckTime", "", "cuirassed", "J", "maxAnimationTime", "Landroid/os/Handler;", "stratoscope", "Landroid/os/Handler;", "mHandler", "trm", "checkTimes", "com/codejoy/boom/clap/module/splash/HotActivity$attabal", "oilcan", "Lcom/codejoy/boom/clap/module/splash/HotActivity$attabal;", "countRunnable", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HotActivity extends BaseActivity<beachfront> {

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public int checkTimes;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final int maxCheckTime = 7;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final long maxAnimationTime = 7000;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final Handler mHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public final attabal countRunnable = new attabal();

    /* JADX INFO: compiled from: HotActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/codejoy/boom/clap/module/splash/HotActivity$attabal", "Ljava/lang/Runnable;", "", "run", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements Runnable {
        public attabal() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HotActivity.this.checkTimes++;
            if (!couple.saneness.f24112attabal.saneness().apical()) {
                couple.wireman wiremanVar = couple.wireman.f24115attabal;
                if (!wiremanVar.saneness().apical() || !wiremanVar.saneness().supplicat()) {
                    if (HotActivity.this.checkTimes < 7) {
                        HotActivity.this.mHandler.postDelayed(this, 1000L);
                        return;
                    } else {
                        HotActivity.this.mHandler.removeCallbacks(this);
                        HotActivity.this.timberyard();
                        return;
                    }
                }
            }
            HotActivity.this.mHandler.removeCallbacks(this);
            HotActivity.this.timberyard();
        }
    }

    public static final Unit milliradian(sealless addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        return Unit.f29295attabal;
    }

    public final void coffeecake() {
        this.mHandler.removeCallbacks(this.countRunnable);
        this.mHandler.postDelayed(this.countRunnable, 1000L);
    }

    public final void cultivated() {
        cutely.wireman(monoploid.attabal(this), null, null, new HotActivity$checkAd$1(this, null), 3, null);
    }

    public final void itchy() {
        this.mHandler.removeCallbacks(this.countRunnable);
    }

    public final void premeiotic() {
        finish();
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void privatdozent() {
        ConstraintLayout root = grimness().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        taiyuan.impassible(root);
        supplicat.saneness(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.codejoy.boom.clap.module.splash.attabal
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HotActivity.milliradian((sealless) obj);
            }
        }, 3, null);
        grimness().f37749dern.startAnim(this.maxAnimationTime);
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void saran() {
        cultivated();
    }

    public final void timberyard() {
        grimness().f37749dern.cancelAnim();
        couple.saneness sanenessVar = couple.saneness.f24112attabal;
        if (sanenessVar.saneness().apical()) {
            sanenessVar.saneness().gintrap(this, "ad_scenes_hot_start_app", new saneness());
            return;
        }
        tower.attabal attabalVar = tower.attabal.f38900attabal;
        attabalVar.formularize("ad_scenes_hot_start_app", new AdUnitReportInfo("app_open", "", "", "", "", null, 32, null));
        attabalVar.apical("ad_scenes_hot_start_app", new AdUnitReportInfo("app_open", "", "", "", "", null, 32, null));
        couple.wireman.f24115attabal.saneness().dovishness(this, "ad_scenes_hot_start_app");
        premeiotic();
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    /* JADX INFO: renamed from: treadless, reason: merged with bridge method [inline-methods] */
    public beachfront starveling() {
        beachfront beachfrontVarDern = beachfront.dern(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(beachfrontVarDern, "inflate(...)");
        return beachfrontVarDern;
    }

    /* JADX INFO: compiled from: HotActivity.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/codejoy/boom/clap/module/splash/HotActivity$saneness", "Lartsy/saneness;", "Lextensimeter/attabal;", "Lcom/yoadx/ad/lib/bean/LoadedAdObject;", "adObject", "", "wireman", "(Lcom/yoadx/ad/lib/bean/LoadedAdObject;)V", "marial", "()V", "dern", "saneness", "Lcomplexometry/taiyuan;", "adValue", "attabal", "(Lcomplexometry/taiyuan;)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness implements artsy.saneness<extensimeter.attabal> {
        public saneness() {
        }

        @Override // artsy.saneness
        public void dern() {
            HotActivity.this.premeiotic();
        }

        @Override // artsy.saneness
        public void marial() {
            HotActivity.this.premeiotic();
        }

        @Override // artsy.saneness
        public void saneness() {
        }

        @Override // artsy.saneness
        public void attabal(complexometry.taiyuan adValue) {
        }

        @Override // artsy.saneness
        public void wireman(LoadedAdObject<extensimeter.attabal> adObject) {
        }
    }
}

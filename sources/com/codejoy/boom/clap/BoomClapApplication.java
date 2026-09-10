package com.codejoy.boom.clap;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.blankj.utilcode.util.adultoid;
import com.codejoy.boom.clap.fcm.NotifySettingHelper;
import com.codejoy.boom.clap.helper.CommonHomeSupplement;
import com.codejoy.boom.clap.module.splash.HotActivity;
import com.codejoy.boom.clap.module.splash.SplashActivity;
import com.ironsource.Ua;
import com.yoadx.ad.lib.core.YoadAdSdk;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BoomClapApplication.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/codejoy/boom/clap/BoomClapApplication;", "Landroid/app/Application;", "<init>", "()V", "Landroid/content/Context;", "base", "", "attachBaseContext", "(Landroid/content/Context;)V", "onCreate", "taiyuan", "competently", "context", "", "impromptu", "(Landroid/content/Context;)Ljava/lang/String;", "Landroid/app/Activity;", "activity", "cutely", "(Landroid/app/Activity;)V", "Landroid/os/Handler;", "kowloon", "Landroid/os/Handler;", "recallHandler", "Ljava/lang/Runnable;", "arytenoidectomy", "Ljava/lang/Runnable;", "pendingRecallRunnable", "monoploid", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class BoomClapApplication extends Application {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static Context f18184graveside;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public Runnable pendingRecallRunnable;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Handler recallHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final int f18187polloi = 8;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static boolean f18185molybdenite = true;

    /* JADX INFO: renamed from: com.codejoy.boom.clap.BoomClapApplication$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: BoomClapApplication.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/codejoy/boom/clap/BoomClapApplication$attabal;", "", "<init>", "()V", "", "isShowHotAd", "Z", "saneness", "()Z", "wireman", "(Z)V", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "attabal", "()Landroid/content/Context;", "dern", "(Landroid/content/Context;)V", "", "RECALL_DELAY_MS", "J", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Context attabal() {
            Context context = BoomClapApplication.f18184graveside;
            if (context != null) {
                return context;
            }
            Intrinsics.preprohormone("appContext");
            return null;
        }

        public final void dern(Context context) {
            Intrinsics.checkNotNullParameter(context, "<set-?>");
            BoomClapApplication.f18184graveside = context;
        }

        public final boolean saneness() {
            return BoomClapApplication.f18185molybdenite;
        }

        public final void wireman(boolean z) {
            BoomClapApplication.f18185molybdenite = z;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: BoomClapApplication.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\f"}, d2 = {"com/codejoy/boom/clap/BoomClapApplication$saneness", "Lisoparametric/wireman$saneness;", "Landroid/app/Activity;", "activity", "", "attabal", "(Landroid/app/Activity;)V", "saneness", "()V", "", "Z", "isBack", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness implements isoparametric.wireman.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public boolean isBack;

        public saneness() {
        }

        public static final void wireman(BoomClapApplication boomClapApplication, String str) {
            boomClapApplication.pendingRecallRunnable = null;
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("RecallNotify", "召回通知等待结束，开始复查展示条件：entrance=" + str);
            slurp.attabal attabalVar = slurp.attabal.f37635attabal;
            Context applicationContext = boomClapApplication.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            attabalVar.dern(applicationContext, str);
        }

        @Override // isoparametric.wireman.saneness
        public void attabal(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (BoomClapApplication.this.pendingRecallRunnable != null) {
                com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("RecallNotify", "应用回到前台，取消召回通知等待任务");
            }
            Runnable runnable = BoomClapApplication.this.pendingRecallRunnable;
            if (runnable != null) {
                BoomClapApplication.this.recallHandler.removeCallbacks(runnable);
            }
            BoomClapApplication.this.pendingRecallRunnable = null;
            slurp.attabal attabalVar = slurp.attabal.f37635attabal;
            Context applicationContext = BoomClapApplication.this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            attabalVar.attabal(applicationContext);
            if (this.isBack) {
                this.isBack = false;
                if (activity instanceof SplashActivity) {
                    return;
                }
                Companion companion = BoomClapApplication.INSTANCE;
                if (companion.saneness()) {
                    BoomClapApplication.this.cutely(activity);
                } else {
                    companion.wireman(true);
                }
            }
        }

        @Override // isoparametric.wireman.saneness
        public void saneness() {
            this.isBack = true;
            final String strAttabal = isoparametric.attabal.f29004attabal.attabal();
            if (strAttabal == null) {
                return;
            }
            Runnable runnable = BoomClapApplication.this.pendingRecallRunnable;
            if (runnable != null) {
                BoomClapApplication.this.recallHandler.removeCallbacks(runnable);
            }
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("RecallNotify", "应用进入后台，10 秒后复查召回通知：entrance=" + strAttabal);
            final BoomClapApplication boomClapApplication = BoomClapApplication.this;
            Runnable runnable2 = new Runnable() { // from class: com.codejoy.boom.clap.attabal
                @Override // java.lang.Runnable
                public final void run() {
                    BoomClapApplication.saneness.wireman(boomClapApplication, strAttabal);
                }
            };
            BoomClapApplication.this.recallHandler.postDelayed(runnable2, Ua.s);
            boomClapApplication.pendingRecallRunnable = runnable2;
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        try {
            Result.Companion companion = Result.INSTANCE;
            String strImpromptu = impromptu(base);
            if (strImpromptu.length() > 0 && Build.VERSION.SDK_INT >= 28) {
                WebView.setDataDirectorySuffix(strImpromptu);
            }
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        super.attachBaseContext(jugal.attabal.f29013attabal.attabal(base));
    }

    public final void competently() {
        adultoid.saneness(this);
    }

    public final void cutely(Activity activity) {
        if (YoadAdSdk.f23874attabal.competently() && !com.yoadx.ad.lib.core.marial.f23882attabal.attabal() && MainActivity.INSTANCE.dern()) {
            CommonHomeSupplement.f18243attabal.beachfront(activity);
            activity.startActivity(new Intent(activity, (Class<?>) HotActivity.class));
        }
    }

    public final String impromptu(Context context) {
        String strAttabal;
        Throwable th;
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            Intrinsics.checkNotNullExpressionValue(processName, "getProcessName(...)");
            return processName;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            strAttabal = com.blankj.utilcode.util.arytenoidectomy.attabal();
            Intrinsics.checkNotNullExpressionValue(strAttabal, "getCurrentProcessName(...)");
            try {
                Result.m3351constructorimpl(Unit.f29295attabal);
                return strAttabal;
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion2 = Result.INSTANCE;
                Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
                return strAttabal;
            }
        } catch (Throwable th3) {
            strAttabal = "";
            th = th3;
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Companion companion = INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.dern(applicationContext);
        efficacy.attabal.attabal(this);
        procaine.dern.attabal.competently(procaine.dern.attabal.cutely(new procaine.dern.attabal().arytenoidectomy(this).apical().impromptu(), null, 1, null), new acoelomate.attabal(), null, 2, null).attabal();
        try {
            Result.Companion companion2 = Result.INSTANCE;
            NotifySettingHelper notifySettingHelper = NotifySettingHelper.f18231attabal;
            Context applicationContext2 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            notifySettingHelper.impassible(applicationContext2);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        isoparametric.saneness.f29009attabal.attabal(this);
        if (com.blankj.utilcode.util.arytenoidectomy.marial()) {
            tau.saneness.f38666attabal.dovishness(this);
            iiion.beachfront.polloi(getApplicationContext());
            eia.impromptu.saneness().marial(true);
            dextrorotary.attabal.f25229attabal.wireman("/api/v1/pay/gp");
            taiyuan();
            CommonHomeSupplement.f18243attabal.dern(this);
            shinplaster.attabal.f37629attabal.attabal(this);
        }
    }

    public final void taiyuan() {
        competently();
        isoparametric.wireman.saneness(this, new saneness());
    }
}

package com.codejoy.boom.clap.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.codejoy.boom.clap.BoomClapApplication;
import com.codejoy.boom.clap.data.FunctionMode;
import com.codejoy.boom.clap.fcm.NotifySettingHelper;
import com.codejoy.boom.clap.module.result.FoundPhoneActivity;
import igbo.polloi;
import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.flow.gintrap;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AntiPickPocketService.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007*\u0001\u001d\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J)\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0003R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/codejoy/boom/clap/service/AntiPickPocketService;", "Lcom/codejoy/boom/clap/service/BaseService;", "<init>", "()V", "Landroid/content/Intent;", "p0", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "onCreate", "intent", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "dovishness", "adultoid", "", "kotlin.jvm.PlatformType", "sealless", "Ljava/lang/String;", "TAG", "Lcom/codejoy/boom/clap/service/task/saneness;", "kattegat", "Lcom/codejoy/boom/clap/service/task/saneness;", "preventStealService", "com/codejoy/boom/clap/service/AntiPickPocketService$saneness", "supplicat", "Lcom/codejoy/boom/clap/service/AntiPickPocketService$saneness;", "resultListener", "restrictive", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AntiPickPocketService extends BaseService {

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public static boolean f18580seminary;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public com.codejoy.boom.clap.service.task.saneness preventStealService;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public final String TAG = AntiPickPocketService.class.getSimpleName();

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public final saneness resultListener = new saneness();

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public static final int f18577merc = 8;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public static final formularize<Boolean> f18578polder = gintrap.attabal(Boolean.FALSE);

    /* JADX INFO: renamed from: com.codejoy.boom.clap.service.AntiPickPocketService$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AntiPickPocketService.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/codejoy/boom/clap/service/AntiPickPocketService$attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "saneness", "(Landroid/content/Context;)V", "wireman", "Lkotlinx/coroutines/flow/formularize;", "", "isRunning", "Lkotlinx/coroutines/flow/formularize;", "attabal", "()Lkotlinx/coroutines/flow/formularize;", "isServiceRunning", "Z", "()Z", "dern", "(Z)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final formularize<Boolean> attabal() {
            return AntiPickPocketService.f18578polder;
        }

        public final void dern(boolean z) {
            AntiPickPocketService.f18580seminary = z;
        }

        public final void saneness(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                Result.Companion companion = Result.INSTANCE;
                if (attabal().getValue().booleanValue()) {
                    wireman(context);
                }
                Result.m3351constructorimpl(context.startService(new Intent(context, (Class<?>) AntiPickPocketService.class)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
        }

        public final void wireman(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                Result.Companion companion = Result.INSTANCE;
                context.stopService(new Intent(context, (Class<?>) AntiPickPocketService.class));
                Companion companion2 = AntiPickPocketService.INSTANCE;
                companion2.attabal().setValue(Boolean.FALSE);
                companion2.dern(false);
                Result.m3351constructorimpl(Unit.f29295attabal);
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: AntiPickPocketService.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/codejoy/boom/clap/service/AntiPickPocketService$saneness", "Ljava/lang/Runnable;", "", "run", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness implements Runnable {
        public saneness() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String unused = AntiPickPocketService.this.TAG;
            stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "7b_detect_anti_pickpocket", null, null, null, null, 30, null);
            AntiPickPocketService antiPickPocketService = AntiPickPocketService.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                antiPickPocketService.triweekly(antiPickPocketService.getFunctionMode());
                antiPickPocketService.dovishness();
                if (!com.yoadx.ad.lib.core.marial.f23882attabal.attabal()) {
                    FoundPhoneActivity.INSTANCE.attabal(antiPickPocketService, antiPickPocketService.getFunctionMode());
                }
                Result.m3351constructorimpl(Unit.f29295attabal);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
        }
    }

    public final void adultoid() {
        Object systemService = getSystemService("notification");
        Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(16);
    }

    public final void dovishness() {
        try {
            Result.Companion companion = Result.INSTANCE;
            com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
            String TAG = this.TAG;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            dernVar.saneness(TAG, " showNotification == ");
            if (polloi.saneness(this).attabal()) {
                Notification notificationFormularize = NotifySettingHelper.f18231attabal.formularize(BoomClapApplication.INSTANCE.attabal(), 16);
                Object systemService = getSystemService("notification");
                Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).notify(16, notificationFormularize);
            }
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent p0) {
        return null;
    }

    @Override // com.codejoy.boom.clap.service.BaseService, android.app.Service
    public void onCreate() {
        impassible(FunctionMode.MODE_ANTI_PICKPOCKET);
        super.onCreate();
        com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
        String TAG = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        dernVar.saneness(TAG, " onCreate == ");
        f18578polder.setValue(Boolean.TRUE);
        f18580seminary = true;
        com.codejoy.boom.clap.service.task.saneness sanenessVar = new com.codejoy.boom.clap.service.task.saneness(getApplicationContext(), this.resultListener);
        sanenessVar.wireman();
        this.preventStealService = sanenessVar;
    }

    @Override // com.codejoy.boom.clap.service.BaseService, android.app.Service
    public void onDestroy() {
        adultoid();
        super.onDestroy();
        f18578polder.setValue(Boolean.FALSE);
        f18580seminary = false;
    }

    @Override // com.codejoy.boom.clap.service.BaseService, android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
        String TAG = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        dernVar.saneness(TAG, " onStartCommand == ");
        return 2;
    }
}

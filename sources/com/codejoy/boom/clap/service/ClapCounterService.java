package com.codejoy.boom.clap.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.codejoy.boom.clap.BoomClapApplication;
import com.codejoy.boom.clap.data.FunctionMode;
import com.codejoy.boom.clap.data.bean.SoundSensitivityLevel;
import com.codejoy.boom.clap.fcm.NotifySettingHelper;
import com.codejoy.boom.clap.service.task.CoroutineClapDetector;
import igbo.polloi;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.formularize;
import kotlinx.coroutines.flow.gintrap;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClapCounterService.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J)\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/codejoy/boom/clap/service/ClapCounterService;", "Lcom/codejoy/boom/clap/service/BaseService;", "<init>", "()V", "", "onCreate", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onDestroy", "dovishness", "preprohormone", "rotuma", "", "kotlin.jvm.PlatformType", "sealless", "Ljava/lang/String;", "TAG", "Lcom/codejoy/boom/clap/service/task/CoroutineClapDetector;", "kattegat", "Lcom/codejoy/boom/clap/service/task/CoroutineClapDetector;", "clapDetector", "", "supplicat", "F", "threshold", "Lkotlinx/coroutines/saran;", "restrictive", "Lkotlinx/coroutines/saran;", "globalScope", "merc", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ClapCounterService extends BaseService {

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public static boolean f18603grimness;

    /* JADX INFO: renamed from: merc, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public static final int f18605polder = 8;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public static final formularize<Boolean> f18606seminary = gintrap.attabal(Boolean.FALSE);

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public CoroutineClapDetector clapDetector;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public final String TAG = ClapCounterService.class.getSimpleName();

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public float threshold = 3.0f;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    public final saran globalScope = privatdozent.attabal(premeiotic.attabal());

    /* JADX INFO: renamed from: com.codejoy.boom.clap.service.ClapCounterService$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ClapCounterService.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001f¨\u0006#"}, d2 = {"Lcom/codejoy/boom/clap/service/ClapCounterService$attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "dern", "(Landroid/content/Context;)V", "beachfront", "taiyuan", "", "sensitivityLevel", "wireman", "(Landroid/content/Context;I)V", "impromptu", "", "cutely", "()Z", "Lkotlinx/coroutines/flow/formularize;", "isRunning", "Lkotlinx/coroutines/flow/formularize;", "attabal", "()Lkotlinx/coroutines/flow/formularize;", "isServiceRunning", "Z", "saneness", "competently", "(Z)V", "", "SERVICE_ACTION_PAUSE_DETECT", "Ljava/lang/String;", "SERVICE_ACTION_RESUME_DETECT", "SERVICE_ACTION_STOP_SOUND", "KEY_SENSITIVITY", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void marial(Companion companion, Context context, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = tau.saneness.f38666attabal.arytenoidectomy();
            }
            companion.wireman(context, i);
        }

        public final formularize<Boolean> attabal() {
            return ClapCounterService.f18606seminary;
        }

        public final void beachfront(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (saneness()) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Intent intent = new Intent(context, (Class<?>) ClapCounterService.class);
                    intent.putExtra("intent_action", "resume_detect");
                    Result.m3351constructorimpl(context.startService(intent));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
                }
            }
        }

        public final void competently(boolean z) {
            ClapCounterService.f18603grimness = z;
        }

        public final boolean cutely() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            tau.saneness sanenessVar = tau.saneness.f38666attabal;
            return vintage.wireman.saneness(vintage.dern.attabal(jCurrentTimeMillis), sanenessVar.saneness(), sanenessVar.attabal());
        }

        public final void dern(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (saneness() && com.blankj.utilcode.util.wireman.wireman()) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Intent intent = new Intent(context, (Class<?>) ClapCounterService.class);
                    intent.putExtra("intent_action", "pause_detect");
                    Result.m3351constructorimpl(context.startService(intent));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
                }
            }
        }

        public final void impromptu(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (com.blankj.utilcode.util.wireman.wireman()) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    context.stopService(new Intent(context, (Class<?>) ClapCounterService.class));
                    Companion companion2 = ClapCounterService.INSTANCE;
                    companion2.attabal().setValue(Boolean.FALSE);
                    companion2.competently(false);
                    Result.m3351constructorimpl(Unit.f29295attabal);
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
                }
            }
        }

        public final boolean saneness() {
            return ClapCounterService.f18603grimness;
        }

        public final void taiyuan(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (saneness() && com.blankj.utilcode.util.wireman.wireman()) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Intent intent = new Intent(context, (Class<?>) ClapCounterService.class);
                    intent.putExtra("intent_action", "stop_sound");
                    Result.m3351constructorimpl(context.startService(intent));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
                }
            }
        }

        public final void wireman(Context context, int sensitivityLevel) {
            float f;
            Intrinsics.checkNotNullParameter(context, "context");
            if (attabal().getValue().booleanValue()) {
                impromptu(context);
            }
            if (sensitivityLevel == SoundSensitivityLevel.VERY_HIGH.getLevel()) {
                f = 1.2f;
            } else {
                f = (sensitivityLevel != SoundSensitivityLevel.HIGH.getLevel() && sensitivityLevel == SoundSensitivityLevel.AVERAGE.getLevel()) ? 5.0f : 3.0f;
            }
            if (com.blankj.utilcode.util.wireman.wireman()) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Intent intent = new Intent(context, (Class<?>) ClapCounterService.class);
                    intent.putExtra("sensitivity", f);
                    Result.m3351constructorimpl(context.startService(intent));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
                }
            }
        }

        public Companion() {
        }
    }

    public static final Unit gintrap(ClapCounterService clapCounterService) {
        cutely.wireman(clapCounterService.globalScope, premeiotic.dern(), null, new ClapCounterService$startListener$1$1(clapCounterService, null), 2, null);
        return Unit.f29295attabal;
    }

    public final void dovishness() {
        if (!vintage.attabal.attabal(this, "android.permission.RECORD_AUDIO")) {
            com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
            String TAG = this.TAG;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            dernVar.attabal(TAG, "startListener == hasPermission:false");
            stopSelf();
            return;
        }
        com.codejoy.boom.clap.helper.dern dernVar2 = com.codejoy.boom.clap.helper.dern.f18260attabal;
        String TAG2 = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        dernVar2.attabal(TAG2, "startListener == hasPermission");
        CoroutineClapDetector coroutineClapDetector = this.clapDetector;
        if (coroutineClapDetector != null) {
            coroutineClapDetector.impromptu(new Function0() { // from class: com.codejoy.boom.clap.service.beachfront
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ClapCounterService.gintrap(this.f18619kowloon);
                }
            });
        }
        CoroutineClapDetector coroutineClapDetector2 = this.clapDetector;
        if (coroutineClapDetector2 != null) {
            coroutineClapDetector2.cutely();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.codejoy.boom.clap.service.BaseService, android.app.Service
    public void onCreate() {
        impassible(FunctionMode.MODE_CLAP_FIND_PHONE);
        super.onCreate();
        f18606seminary.setValue(Boolean.TRUE);
        f18603grimness = true;
        com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
        String TAG = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        dernVar.attabal(TAG, "onCreate == ");
        this.clapDetector = new CoroutineClapDetector();
    }

    @Override // com.codejoy.boom.clap.service.BaseService, android.app.Service
    public void onDestroy() {
        com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
        String TAG = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        dernVar.attabal(TAG, " onDestroy ");
        preprohormone();
        Object systemService = getSystemService("notification");
        Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(2);
        f18606seminary.setValue(Boolean.FALSE);
        f18603grimness = false;
        privatdozent.wireman(this.globalScope, null, 1, null);
        super.onDestroy();
        String TAG2 = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        dernVar.saneness(TAG2, " onDestroy == ");
    }

    @Override // com.codejoy.boom.clap.service.BaseService, android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        String stringExtra = intent != null ? intent.getStringExtra("intent_action") : null;
        if (stringExtra != null) {
            int iHashCode = stringExtra.hashCode();
            if (iHashCode != -1006523758) {
                if (iHashCode != 915422965) {
                    if (iHashCode == 1449098508 && stringExtra.equals("pause_detect")) {
                        com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
                        String TAG = this.TAG;
                        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                        dernVar.attabal(TAG, " pause detect");
                        arytenoidectomy();
                        CoroutineClapDetector coroutineClapDetector = this.clapDetector;
                        if (coroutineClapDetector != null) {
                            coroutineClapDetector.competently();
                        }
                        this.clapDetector = null;
                        return 2;
                    }
                } else if (stringExtra.equals("resume_detect")) {
                    com.codejoy.boom.clap.helper.dern dernVar2 = com.codejoy.boom.clap.helper.dern.f18260attabal;
                    String TAG2 = this.TAG;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    dernVar2.attabal(TAG2, " resume detect");
                    CoroutineClapDetector coroutineClapDetector2 = new CoroutineClapDetector();
                    this.clapDetector = coroutineClapDetector2;
                    coroutineClapDetector2.taiyuan(this.threshold);
                    dovishness();
                    return 2;
                }
            } else if (stringExtra.equals("stop_sound")) {
                com.codejoy.boom.clap.helper.dern dernVar3 = com.codejoy.boom.clap.helper.dern.f18260attabal;
                String TAG3 = this.TAG;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                dernVar3.attabal(TAG3, " stop sound");
                arytenoidectomy();
                return 2;
            }
        }
        float floatExtra = intent != null ? intent.getFloatExtra("sensitivity", 3.0f) : 3.0f;
        this.threshold = floatExtra;
        CoroutineClapDetector coroutineClapDetector3 = this.clapDetector;
        if (coroutineClapDetector3 != null) {
            coroutineClapDetector3.taiyuan(floatExtra);
        }
        com.codejoy.boom.clap.helper.dern dernVar4 = com.codejoy.boom.clap.helper.dern.f18260attabal;
        String TAG4 = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
        dernVar4.attabal(TAG4, "onStartCommand == " + this.threshold);
        dovishness();
        return 2;
    }

    public final void preprohormone() {
        CoroutineClapDetector coroutineClapDetector = this.clapDetector;
        if (coroutineClapDetector != null) {
            coroutineClapDetector.competently();
        }
    }

    public final void rotuma() {
        if (polloi.saneness(this).attabal()) {
            Notification notificationTaiyuan = NotifySettingHelper.f18231attabal.taiyuan(BoomClapApplication.INSTANCE.attabal(), 2);
            Object systemService = getSystemService("notification");
            Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).notify(2, notificationTaiyuan);
        }
    }
}

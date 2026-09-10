package com.codejoy.boom.clap.service;

import android.app.Service;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.codejoy.boom.clap.data.FunctionMode;
import com.codejoy.boom.clap.data.SoundData;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseService.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 G2\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J)\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u001c\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0010R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u0016R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010B\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\"\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lcom/codejoy/boom/clap/service/BaseService;", "Landroid/app/Service;", "<init>", "()V", "", "onCreate", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Lcom/codejoy/boom/clap/data/FunctionMode;", "functionMode", "triweekly", "(Lcom/codejoy/boom/clap/data/FunctionMode;)V", "arytenoidectomy", "onDestroy", "", "kotlin.jvm.PlatformType", "kowloon", "Ljava/lang/String;", "TAG", "Lcom/codejoy/boom/clap/data/FunctionMode;", "taiyuan", "()Lcom/codejoy/boom/clap/data/FunctionMode;", "impassible", "Landroid/media/MediaPlayer;", "monoploid", "Landroid/media/MediaPlayer;", "mediaPlayer", "", "polloi", "Z", "isPrepare", "Landroid/os/Vibrator;", "molybdenite", "Landroid/os/Vibrator;", "vibrator", "Landroid/hardware/camera2/CameraManager;", "graveside", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Lkotlinx/coroutines/monroe;", "adultoid", "Lkotlinx/coroutines/monroe;", "flashJop", "dovishness", "cameraId", "Landroid/os/Handler;", "gintrap", "Landroid/os/Handler;", "handler", "Landroid/os/CountDownTimer;", "rotuma", "Landroid/os/CountDownTimer;", "countDownTimer", "preprohormone", "I", "originalVolume", "cord", "cutely", "()Z", "setPlaySound", "(Z)V", "isPlaySound", "Lkotlinx/coroutines/saran;", "cuirassed", "Lkotlinx/coroutines/saran;", "globalScope", "stratoscope", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseService extends Service {

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public static MediaPlayer f18585oilcan;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static final int f18587trm = 8;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public static boolean f18588yemenite;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public monroe flashJop;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public boolean isPlaySound;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public String cameraId;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public CameraManager cameraManager;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public Vibrator vibrator;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public boolean isPrepare;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public CountDownTimer countDownTimer;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final String TAG = BaseService.class.getSimpleName();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public FunctionMode functionMode = FunctionMode.NONE;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final MediaPlayer mediaPlayer = new MediaPlayer();

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public int originalVolume = -1;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final saran globalScope = privatdozent.attabal(premeiotic.attabal());

    /* JADX INFO: renamed from: com.codejoy.boom.clap.service.BaseService$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: BaseService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/codejoy/boom/clap/service/BaseService$attabal;", "", "<init>", "()V", "Landroid/media/MediaPlayer;", "mediaPlayer", "Landroid/media/MediaPlayer;", "attabal", "()Landroid/media/MediaPlayer;", "setMediaPlayer", "(Landroid/media/MediaPlayer;)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MediaPlayer attabal() {
            return BaseService.f18585oilcan;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.codejoy.boom.clap.service.BaseService$onStartCommand$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
    @igo.wireman(c = "com.codejoy.boom.clap.service.BaseService$onStartCommand$1", f = "BaseService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(wretchedly.dern<? super AnonymousClass1> dernVar) {
            super(2, dernVar);
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
            AnonymousClass1 anonymousClass1 = BaseService.this.new AnonymousClass1(dernVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            p002kotlin.coroutines.intrinsics.attabal.beachfront();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            BaseService baseService = BaseService.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                SoundData soundDataAttabal = unbalanced.attabal.f39224attabal.attabal(baseService.getFunctionMode());
                if (soundDataAttabal != null) {
                    baseService.mediaPlayer.reset();
                    AssetFileDescriptor assetFileDescriptorOpenFd = baseService.getAssets().openFd("audio/" + soundDataAttabal.getAudioFile());
                    Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "openFd(...)");
                    baseService.mediaPlayer.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                    baseService.mediaPlayer.prepareAsync();
                    unit = Unit.f29295attabal;
                } else {
                    unit = null;
                }
                Result.m3351constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
            return Unit.f29295attabal;
        }

        @Override // p002kotlin.jvm.functions.Function2
        public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
            return ((AnonymousClass1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
        }
    }

    /* JADX INFO: compiled from: BaseService.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/codejoy/boom/clap/service/BaseService$saneness", "Landroid/os/CountDownTimer;", "", "p0", "", "onTick", "(J)V", "onFinish", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness extends CountDownTimer {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ BaseService f18602attabal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public saneness(long j, BaseService baseService) {
            super(j, 5000L);
            this.f18602attabal = baseService;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Vibrator vibrator = this.f18602attabal.vibrator;
            if (vibrator != null) {
                vibrator.cancel();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long p0) {
            Vibrator vibrator = this.f18602attabal.vibrator;
            if (vibrator != null) {
                vibrator.cancel();
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Vibrator vibrator2 = this.f18602attabal.vibrator;
                if (vibrator2 != null) {
                    vibrator2.vibrate(VibrationEffect.createOneShot(5000L, -1));
                    return;
                }
                return;
            }
            long[] jArr = {0, 10, 5};
            Vibrator vibrator3 = this.f18602attabal.vibrator;
            if (vibrator3 != null) {
                vibrator3.vibrate(jArr, 0);
            }
        }
    }

    public static final void apical(BaseService baseService, MediaPlayer mediaPlayer) {
        baseService.isPrepare = true;
    }

    public static final boolean formularize(MediaPlayer mediaPlayer, int i, int i2) {
        return false;
    }

    public static final void kowloon(BaseService baseService) {
        baseService.arytenoidectomy();
    }

    public final void arytenoidectomy() {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (this.isPlaySound) {
                com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
                String TAG = this.TAG;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                dernVar.attabal(TAG, "stopSound");
                if (this.originalVolume >= 0) {
                    String TAG2 = this.TAG;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    dernVar.dern(TAG2, "stopSound reset volume " + this.originalVolume);
                    com.codejoy.boom.clap.helper.saneness.f18266attabal.attabal(this.originalVolume);
                    this.originalVolume = -1;
                }
                this.isPlaySound = false;
                this.handler.removeCallbacksAndMessages(null);
                try {
                    if (this.mediaPlayer.isPlaying()) {
                        this.mediaPlayer.pause();
                    }
                    Result.m3351constructorimpl(Unit.f29295attabal);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
                }
                CountDownTimer countDownTimer = this.countDownTimer;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                this.countDownTimer = null;
                Vibrator vibrator = this.vibrator;
                if (vibrator != null) {
                    vibrator.cancel();
                }
                this.vibrator = null;
                monroe monroeVar = this.flashJop;
                if (monroeVar != null) {
                    monroe.attabal.attabal(monroeVar, null, 1, null);
                }
                String str = this.cameraId;
                if (str != null) {
                    try {
                        CameraManager cameraManager = this.cameraManager;
                        if (cameraManager != null) {
                            Intrinsics.beachfront(str);
                            cameraManager.setTorchMode(str, false);
                        }
                    } catch (Exception unused) {
                    }
                }
                Result.m3351constructorimpl(Unit.f29295attabal);
            }
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th2));
        }
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final boolean getIsPlaySound() {
        return this.isPlaySound;
    }

    public final void impassible(FunctionMode functionMode) {
        Intrinsics.checkNotNullParameter(functionMode, "<set-?>");
        this.functionMode = functionMode;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        MediaPlayer mediaPlayer = this.mediaPlayer;
        f18585oilcan = mediaPlayer;
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.codejoy.boom.clap.service.wireman
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                BaseService.apical(this.f18653kowloon, mediaPlayer2);
            }
        });
        this.mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.codejoy.boom.clap.service.marial
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return BaseService.formularize(mediaPlayer2, i, i2);
            }
        });
    }

    @Override // android.app.Service
    public void onDestroy() {
        arytenoidectomy();
        this.mediaPlayer.release();
        f18585oilcan = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        cutely.wireman(this.globalScope, premeiotic.saneness(), null, new AnonymousClass1(null), 2, null);
        return super.onStartCommand(intent, flags, startId);
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final FunctionMode getFunctionMode() {
        return this.functionMode;
    }

    public final void triweekly(FunctionMode functionMode) {
        String[] cameraIdList;
        Vibrator defaultVibrator;
        Intrinsics.checkNotNullParameter(functionMode, "functionMode");
        com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
        String TAG = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        dernVar.attabal(TAG, "startSound == " + f18588yemenite + " , " + this.isPlaySound);
        if (f18588yemenite || this.isPlaySound) {
            return;
        }
        if (com.yoadx.ad.lib.core.marial.f23882attabal.attabal()) {
            String TAG2 = this.TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            dernVar.attabal(TAG2, "isShowFullscreenAds");
            return;
        }
        this.isPlaySound = true;
        Object systemService = getSystemService("audio");
        Intrinsics.competently(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        this.originalVolume = audioManager.getStreamVolume(3);
        try {
            Result.Companion companion = Result.INSTANCE;
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int iKowloon = (int) (streamMaxVolume * (tau.saneness.f38666attabal.kowloon() / 100.0f));
            if (iKowloon > streamMaxVolume) {
                iKowloon = streamMaxVolume;
            }
            if (iKowloon < 0) {
                iKowloon = 0;
            }
            String TAG3 = this.TAG;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            dernVar.dern(TAG3, "setting volume " + this.originalVolume + ", " + iKowloon + ", " + streamMaxVolume);
            audioManager.setStreamVolume(3, iKowloon, 0);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        long jTriweekly = ((long) tau.saneness.f38666attabal.triweekly()) * 1000;
        try {
            this.mediaPlayer.setLooping(true);
            if (this.isPrepare && !this.mediaPlayer.isPlaying()) {
                this.mediaPlayer.seekTo(0);
                this.mediaPlayer.start();
            }
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th2));
        }
        tau.saneness sanenessVar = tau.saneness.f38666attabal;
        if (sanenessVar.cuirassed()) {
            if (Build.VERSION.SDK_INT >= 31) {
                Object systemService2 = getSystemService("vibrator_manager");
                Intrinsics.competently(systemService2, "null cannot be cast to non-null type android.os.VibratorManager");
                defaultVibrator = attabal.attabal(systemService2).getDefaultVibrator();
            } else {
                Object systemService3 = getSystemService("vibrator");
                Intrinsics.competently(systemService3, "null cannot be cast to non-null type android.os.Vibrator");
                defaultVibrator = (Vibrator) systemService3;
            }
            this.vibrator = defaultVibrator;
            saneness sanenessVar2 = new saneness(jTriweekly, this);
            this.countDownTimer = sanenessVar2;
            sanenessVar2.start();
        }
        if (sanenessVar.cord()) {
            Object systemService4 = getSystemService("camera");
            Intrinsics.competently(systemService4, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            CameraManager cameraManager = (CameraManager) systemService4;
            this.cameraManager = cameraManager;
            if (cameraManager != null) {
                try {
                    cameraIdList = cameraManager.getCameraIdList();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                cameraIdList = null;
            }
            if (cameraIdList != null && cameraIdList.length != 0) {
                for (String str : cameraIdList) {
                    CameraManager cameraManager2 = this.cameraManager;
                    CameraCharacteristics cameraCharacteristics = cameraManager2 != null ? cameraManager2.getCameraCharacteristics(str) : null;
                    Boolean bool = cameraCharacteristics != null ? (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE) : null;
                    Integer num = cameraCharacteristics != null ? (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING) : null;
                    if (Intrinsics.wireman(bool, Boolean.TRUE) && num != null && num.intValue() == 1) {
                        this.cameraId = str;
                        break;
                    }
                }
                if (this.cameraId != null) {
                    this.flashJop = cutely.wireman(this.globalScope, premeiotic.dern(), null, new BaseService$startSound$4(this, null), 2, null);
                }
            }
        }
        this.handler.postDelayed(new Runnable() { // from class: com.codejoy.boom.clap.service.dern
            @Override // java.lang.Runnable
            public final void run() {
                BaseService.kowloon(this.f18620kowloon);
            }
        }, jTriweekly);
    }
}

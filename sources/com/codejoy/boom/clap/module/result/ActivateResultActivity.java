package com.codejoy.boom.clap.module.result;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p000activity.sealless;
import androidx.p000activity.supplicat;
import androidx.p001lifecycle.mathsort;
import androidx.p001lifecycle.monoploid;
import androidx.p001lifecycle.peridotite;
import androidx.p001lifecycle.walach;
import cig.CreationExtras;
import com.codejoy.boom.clap.MainActivity;
import com.codejoy.boom.clap.data.FunctionMode;
import com.codejoy.boom.clap.helper.VersionHelper;
import com.codejoy.boom.clap.module.base.BaseActivity;
import com.codejoy.boom.clap.service.AntiPickPocketService;
import com.codejoy.boom.clap.service.ClapCounterService;
import com.codejoy.boom.clap.service.NotTouchPhoneService;
import com.codejoy.boom.clap.widget.ParkinsansFontText;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.ironsource.X3;
import kotlinx.coroutines.monroe;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import sonnetize.oilcan;
import sonnetize.yemenite;

/* JADX INFO: compiled from: ActivateResultActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001e\u0010\u0004R\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020.038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/codejoy/boom/clap/module/result/ActivateResultActivity;", "Lcom/codejoy/boom/clap/module/base/BaseActivity;", "Lsonnetize/attabal;", "<init>", "()V", "", "monroe", "underbelly", "", "seconds", "technofreak", "(I)V", "", "activated", "outmarry", "(Z)V", "herdbook", "coffeecake", "nosophobia", "sensatory", "lightstruck", "claque", "lerp", "achondroplasia", "julian", "()Lsonnetize/attabal;", "privatdozent", "saran", X3.i.u0, X3.i.t0, "onDestroy", "Lcom/codejoy/boom/clap/module/result/ActivateResultViewModel;", "cord", "Lpatroclinal/taiyuan;", "czestochowa", "()Lcom/codejoy/boom/clap/module/result/ActivateResultViewModel;", "viewModel", "Lcom/codejoy/boom/clap/data/FunctionMode;", "cuirassed", "coi", "()Lcom/codejoy/boom/clap/data/FunctionMode;", "functionMode", "stratoscope", "picketboat", "()Z", "isActivated", "", "trm", "empress", "()Ljava/lang/String;", "entrance", "Lwireman/dern;", "oilcan", "Lwireman/dern;", "requestPermissionLauncher", "yemenite", "Z", "hasLoadNativeAd", "Lkotlinx/coroutines/monroe;", "sealless", "Lkotlinx/coroutines/monroe;", "job", "kattegat", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActivateResultActivity extends BaseActivity<sonnetize.attabal> {

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public static final int f18392supplicat = 8;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan viewModel;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public monroe job;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public boolean hasLoadNativeAd;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan functionMode = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.result.attabal
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ActivateResultActivity.sayid(this.f18415kowloon);
        }
    });

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan isActivated = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.result.saneness
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(ActivateResultActivity.palmyra(this.f18428kowloon));
        }
    });

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan entrance = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.result.dern
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ActivateResultActivity.lotta(this.f18422kowloon);
        }
    });

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public final wireman.dern<String> requestPermissionLauncher = registerForActivityResult(new marial.dern(), new wireman.attabal() { // from class: com.codejoy.boom.clap.module.result.wireman
        @Override // wireman.attabal
        public final void onActivityResult(Object obj) {
            ActivateResultActivity.hardpan(((Boolean) obj).booleanValue());
        }
    });

    /* JADX INFO: renamed from: com.codejoy.boom.clap.module.result.ActivateResultActivity$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ActivateResultActivity.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/codejoy/boom/clap/module/result/ActivateResultActivity$attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isActivated", "", "entrance", "Lcom/codejoy/boom/clap/data/FunctionMode;", X3.a.t, "", "attabal", "(Landroid/content/Context;ZLjava/lang/String;Lcom/codejoy/boom/clap/data/FunctionMode;)V", "KEY_SOUND", "Ljava/lang/String;", "KEY_IS_ACTIVATED", "entranceKey", "KEY_FUNCTION_MODE", "EntranceNotification", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void attabal(Context context, boolean isActivated, String entrance, FunctionMode mode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
            Intrinsics.checkNotNullParameter(mode, "mode");
            if (mode == FunctionMode.MODE_CLAP_FIND_PHONE) {
                if (ClapCounterService.INSTANCE.attabal().getValue().booleanValue() && isActivated) {
                    Intent intent = new Intent(context, (Class<?>) ClapCounterService.class);
                    intent.setComponent(new ComponentName(context, (Class<?>) ClapCounterService.class));
                    context.stopService(intent);
                }
            } else if (mode == FunctionMode.MODE_NOT_TOUCH_PHONE) {
                if (NotTouchPhoneService.INSTANCE.attabal().getValue().booleanValue() && isActivated) {
                    Intent intent2 = new Intent(context, (Class<?>) NotTouchPhoneService.class);
                    intent2.setComponent(new ComponentName(context, (Class<?>) NotTouchPhoneService.class));
                    context.stopService(intent2);
                }
            } else if (mode == FunctionMode.MODE_ANTI_PICKPOCKET && AntiPickPocketService.INSTANCE.attabal().getValue().booleanValue() && isActivated) {
                Intent intent3 = new Intent(context, (Class<?>) AntiPickPocketService.class);
                intent3.setComponent(new ComponentName(context, (Class<?>) AntiPickPocketService.class));
                context.stopService(intent3);
            }
            com.blankj.utilcode.util.attabal.attabal(ActivateResultActivity.class);
            Intent intent4 = new Intent(context, (Class<?>) ActivateResultActivity.class);
            intent4.putExtra("key_function_mode", mode);
            intent4.putExtra("key_is_activated", isActivated);
            intent4.putExtra("entrance_key", entrance);
            context.startActivity(intent4);
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: ActivateResultActivity.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f18401attabal;

        static {
            int[] iArr = new int[FunctionMode.values().length];
            try {
                iArr[FunctionMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FunctionMode.MODE_CLAP_FIND_PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FunctionMode.MODE_ANTI_PICKPOCKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FunctionMode.MODE_NOT_TOUCH_PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f18401attabal = iArr;
        }
    }

    public ActivateResultActivity() {
        final Function0 function0 = null;
        this.viewModel = new walach(polloi.saneness(ActivateResultViewModel.class), new Function0<mathsort>() { // from class: com.codejoy.boom.clap.module.result.ActivateResultActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final mathsort invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<peridotite.dern>() { // from class: com.codejoy.boom.clap.module.result.ActivateResultActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final peridotite.dern invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.codejoy.boom.clap.module.result.ActivateResultActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                return (function1 == null || (creationExtras = (CreationExtras) function1.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final FunctionMode coi() {
        return (FunctionMode) this.functionMode.getValue();
    }

    public static final Unit gusty(ActivateResultActivity activateResultActivity, sealless addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        activateResultActivity.sensatory();
        return Unit.f29295attabal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hardpan(boolean z) {
        if (z) {
            stonecrop.attabal.f38160attabal.attabal();
        } else {
            stonecrop.attabal.f38160attabal.saneness();
        }
    }

    public static final void igbo(ActivateResultActivity activateResultActivity, View view) {
        activateResultActivity.sensatory();
    }

    private final void lightstruck() {
        if (this.hasLoadNativeAd) {
            claque();
            return;
        }
        this.hasLoadNativeAd = true;
        if (!VersionHelper.f18244attabal.marial()) {
            grimness().f37746dern.changeTemplateType(com.codejoy.boom.clap.triweekly.native_template3_view);
        }
        achondroplasia();
    }

    public static final String lotta(ActivateResultActivity activateResultActivity) {
        String stringExtra = activateResultActivity.getIntent().getStringExtra("entrance_key");
        return stringExtra == null ? "" : stringExtra;
    }

    public static final boolean palmyra(ActivateResultActivity activateResultActivity) {
        return activateResultActivity.getIntent().getBooleanExtra("key_is_activated", true);
    }

    private final boolean picketboat() {
        return ((Boolean) this.isActivated.getValue()).booleanValue();
    }

    public static final void preterite(ActivateResultActivity activateResultActivity, View view) {
        activateResultActivity.sensatory();
    }

    public static final FunctionMode sayid(ActivateResultActivity activateResultActivity) {
        FunctionMode functionMode = (FunctionMode) picketboat.dern.saneness(activateResultActivity.getIntent(), "key_function_mode", FunctionMode.class);
        return functionMode == null ? FunctionMode.MODE_CLAP_FIND_PHONE : functionMode;
    }

    public static final Unit unconsolidated(ActivateResultActivity activateResultActivity, NativeAd it) {
        Intrinsics.checkNotNullParameter(it, "it");
        activateResultActivity.grimness().f37746dern.setStyles(new orometer.saneness.attabal().attabal());
        activateResultActivity.grimness().f37746dern.destroyNativeAdIfNeed();
        activateResultActivity.grimness().f37746dern.setNativeAd(it);
        activateResultActivity.claque();
        return Unit.f29295attabal;
    }

    public static final Unit wostteth(ActivateResultActivity activateResultActivity, sealless addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        activateResultActivity.sensatory();
        return Unit.f29295attabal;
    }

    public final void achondroplasia() {
        couple.beachfront.f24107attabal.marial().sealless(this, "ad_scenes_result_page", this, grimness().f37746dern, new Function1() { // from class: com.codejoy.boom.clap.module.result.marial
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivateResultActivity.unconsolidated(this.f18427kowloon, (NativeAd) obj);
            }
        });
        claque();
    }

    public final void claque() {
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            monroe monroeVar = this.job;
            if (monroeVar != null) {
                monroe.attabal.attabal(monroeVar, null, 1, null);
                unit = Unit.f29295attabal;
            } else {
                unit = null;
            }
            Result.m3351constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        this.job = null;
        try {
            this.job = kotlinx.coroutines.cutely.wireman(monoploid.attabal(this), null, null, new ActivateResultActivity$refreshNativeAd$2$1(this, null), 3, null);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th2));
        }
    }

    public final void coffeecake() {
        if (Build.VERSION.SDK_INT < 33) {
            igbo.polloi.saneness(this).attabal();
            return;
        }
        if (picketboat.saneness.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            if (shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                stonecrop.attabal.f38160attabal.dern();
                this.requestPermissionLauncher.attabal("android.permission.POST_NOTIFICATIONS");
            } else {
                stonecrop.attabal.f38160attabal.dern();
                this.requestPermissionLauncher.attabal("android.permission.POST_NOTIFICATIONS");
            }
        }
    }

    public final ActivateResultViewModel czestochowa() {
        return (ActivateResultViewModel) this.viewModel.getValue();
    }

    public final String empress() {
        return (String) this.entrance.getValue();
    }

    public final void herdbook() {
        if (!isoparametric.dern.f29008attabal.attabal()) {
            czestochowa().apical();
            return;
        }
        couple.wireman wiremanVar = couple.wireman.f24115attabal;
        if (!wiremanVar.saneness().apical() || !wiremanVar.saneness().supplicat()) {
            czestochowa().apical();
            return;
        }
        if (Intrinsics.wireman(empress(), "notification")) {
            veejay.attabal attabalVarSaneness = wiremanVar.saneness();
            Activity activityAttabal = MainActivity.INSTANCE.attabal();
            if (activityAttabal == null) {
                activityAttabal = this;
            }
            attabalVarSaneness.dovishness(activityAttabal, "ad_scenes_notification_enter_deactivate");
            return;
        }
        veejay.attabal attabalVarSaneness2 = wiremanVar.saneness();
        Activity activityAttabal2 = MainActivity.INSTANCE.attabal();
        if (activityAttabal2 == null) {
            activityAttabal2 = this;
        }
        attabalVarSaneness2.dovishness(activityAttabal2, "ad_scenes_result_page");
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    /* JADX INFO: renamed from: julian, reason: merged with bridge method [inline-methods] */
    public sonnetize.attabal starveling() {
        sonnetize.attabal attabalVarDern = sonnetize.attabal.dern(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(attabalVarDern, "inflate(...)");
        return attabalVarDern;
    }

    public final void lerp() {
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            monroe monroeVar = this.job;
            if (monroeVar != null) {
                monroe.attabal.attabal(monroeVar, null, 1, null);
                unit = Unit.f29295attabal;
            } else {
                unit = null;
            }
            Result.m3351constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        this.job = null;
    }

    public final void monroe() {
        kotlinx.coroutines.cutely.wireman(monoploid.attabal(this), null, null, new ActivateResultActivity$observeUiState$1(this, null), 3, null);
    }

    public final void nosophobia() {
        if (coi() == FunctionMode.MODE_CLAP_FIND_PHONE) {
            ClapCounterService.Companion companion = ClapCounterService.INSTANCE;
            if (!companion.attabal().getValue().booleanValue() && picketboat()) {
                ClapCounterService.Companion.marial(companion, this, 0, 2, null);
                return;
            } else {
                if (!companion.attabal().getValue().booleanValue() || picketboat()) {
                    return;
                }
                companion.impromptu(this);
                return;
            }
        }
        if (coi() == FunctionMode.MODE_NOT_TOUCH_PHONE) {
            NotTouchPhoneService.Companion attabalVar = NotTouchPhoneService.INSTANCE;
            if (!attabalVar.attabal().getValue().booleanValue() && picketboat()) {
                attabalVar.saneness(this);
                return;
            } else {
                if (!attabalVar.attabal().getValue().booleanValue() || picketboat()) {
                    return;
                }
                attabalVar.wireman(this);
                return;
            }
        }
        if (coi() == FunctionMode.MODE_ANTI_PICKPOCKET) {
            AntiPickPocketService.Companion attabalVar2 = AntiPickPocketService.INSTANCE;
            if (!attabalVar2.attabal().getValue().booleanValue() && picketboat()) {
                attabalVar2.saneness(this);
            } else {
                if (!attabalVar2.attabal().getValue().booleanValue() || picketboat()) {
                    return;
                }
                attabalVar2.wireman(this);
            }
        }
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        lerp();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        lerp();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        lightstruck();
    }

    public final void outmarry(boolean activated) {
        if (!activated) {
            View childAt = grimness().f37747saneness.getChildAt(0);
            if (childAt != null) {
                Intrinsics.checkNotNullExpressionValue(yemenite.attabal(childAt), "bind(...)");
                int i = saneness.f18401attabal[coi().ordinal()];
                if (i != 1 && i != 2 && i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            return;
        }
        View childAt2 = grimness().f37747saneness.getChildAt(0);
        if (childAt2 != null) {
            oilcan oilcanVarAttabal = oilcan.attabal(childAt2);
            Intrinsics.checkNotNullExpressionValue(oilcanVarAttabal, "bind(...)");
            LinearLayout countdownLayout = oilcanVarAttabal.f37910saneness;
            Intrinsics.checkNotNullExpressionValue(countdownLayout, "countdownLayout");
            countdownLayout.setVisibility(8);
            ParkinsansFontText tvTitle = oilcanVarAttabal.f37899arytenoidectomy;
            Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
            tvTitle.setVisibility(0);
            oilcanVarAttabal.f37907impromptu.setText(getString(com.codejoy.boom.clap.arytenoidectomy.ok));
            int i2 = saneness.f18401attabal[coi().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    oilcanVarAttabal.f37904dern.setImageResource(com.codejoy.boom.clap.formularize.boomclap_ic_activate);
                } else if (i2 == 3) {
                    oilcanVarAttabal.f37904dern.setImageResource(com.codejoy.boom.clap.formularize.boomclap_ic_activate_pocket);
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oilcanVarAttabal.f37904dern.setImageResource(com.codejoy.boom.clap.formularize.boomclap_ic_activate);
                }
            }
        }
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void privatdozent() {
        ConstraintLayout root = grimness().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        vintage.taiyuan.apical(root);
        seminary(ActivateResultActivity.class);
        ActivateResultViewModel.cutely(czestochowa(), coi(), picketboat(), 0, 4, null);
        monroe();
        underbelly();
        herdbook();
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void saran() {
        couple.wireman.f24115attabal.saneness().triweekly("ad_scenes_exit_result", null);
        coffeecake();
    }

    public final void sensatory() {
        MainActivity.INSTANCE.wireman(this, "entrance_result");
        couple.wireman.f24115attabal.saneness().gintrap(this, "ad_scenes_exit_result", new transpositive.attabal(null, null, null, null, 15, null));
        finish();
    }

    public final void technofreak(int seconds) {
        View childAt;
        if (!picketboat() || (childAt = grimness().f37747saneness.getChildAt(0)) == null) {
            return;
        }
        oilcan oilcanVarAttabal = oilcan.attabal(childAt);
        Intrinsics.checkNotNullExpressionValue(oilcanVarAttabal, "bind(...)");
        int i = saneness.f18401attabal[coi().ordinal()];
        if (i == 3 || i == 4) {
            oilcanVarAttabal.f37904dern.setImageResource(com.codejoy.boom.clap.formularize.boomclap_ic_activate_countdown);
        } else {
            oilcanVarAttabal.f37904dern.setImageResource(com.codejoy.boom.clap.formularize.boomclap_ic_activate);
        }
        oilcanVarAttabal.f37912triweekly.setText(String.valueOf(seconds));
        LinearLayout countdownLayout = oilcanVarAttabal.f37910saneness;
        Intrinsics.checkNotNullExpressionValue(countdownLayout, "countdownLayout");
        countdownLayout.setVisibility(0);
        ParkinsansFontText tvTitle = oilcanVarAttabal.f37899arytenoidectomy;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        tvTitle.setVisibility(8);
    }

    public final void underbelly() {
        if (!picketboat()) {
            yemenite yemeniteVarDern = yemenite.dern(getLayoutInflater(), grimness().f37747saneness, false);
            Intrinsics.checkNotNullExpressionValue(yemeniteVarDern, "inflate(...)");
            grimness().f37747saneness.addView(yemeniteVarDern.getRoot());
            ParkinsansFontText closeButton = yemeniteVarDern.f38014saneness;
            Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
            vintage.taiyuan.kowloon(closeButton);
            ParkinsansFontText closeButton2 = yemeniteVarDern.f38014saneness;
            Intrinsics.checkNotNullExpressionValue(closeButton2, "closeButton");
            vintage.taiyuan.competently(closeButton2);
            yemeniteVarDern.f38014saneness.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.result.impromptu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivateResultActivity.igbo(this.f18425kowloon, view);
                }
            });
            supplicat.saneness(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.codejoy.boom.clap.module.result.taiyuan
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ActivateResultActivity.gusty(this.f18429kowloon, (sealless) obj);
                }
            }, 3, null);
            return;
        }
        oilcan oilcanVarDern = oilcan.dern(getLayoutInflater(), grimness().f37747saneness, false);
        Intrinsics.checkNotNullExpressionValue(oilcanVarDern, "inflate(...)");
        grimness().f37747saneness.addView(oilcanVarDern.getRoot());
        int i = saneness.f18401attabal[coi().ordinal()];
        if (i != 1) {
            if (i == 2) {
                ParkinsansFontText tvTip = oilcanVarDern.f37908kowloon;
                Intrinsics.checkNotNullExpressionValue(tvTip, "tvTip");
                tvTip.setVisibility(0);
                ConstraintLayout pocketOrTouchTip = oilcanVarDern.f37902competently;
                Intrinsics.checkNotNullExpressionValue(pocketOrTouchTip, "pocketOrTouchTip");
                pocketOrTouchTip.setVisibility(8);
            } else if (i == 3) {
                ParkinsansFontText tvTip2 = oilcanVarDern.f37908kowloon;
                Intrinsics.checkNotNullExpressionValue(tvTip2, "tvTip");
                tvTip2.setVisibility(8);
                ConstraintLayout pocketOrTouchTip2 = oilcanVarDern.f37902competently;
                Intrinsics.checkNotNullExpressionValue(pocketOrTouchTip2, "pocketOrTouchTip");
                pocketOrTouchTip2.setVisibility(0);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                ParkinsansFontText tvTip3 = oilcanVarDern.f37908kowloon;
                Intrinsics.checkNotNullExpressionValue(tvTip3, "tvTip");
                tvTip3.setVisibility(8);
                ConstraintLayout pocketOrTouchTip3 = oilcanVarDern.f37902competently;
                Intrinsics.checkNotNullExpressionValue(pocketOrTouchTip3, "pocketOrTouchTip");
                pocketOrTouchTip3.setVisibility(0);
            }
        }
        ParkinsansFontText stopOrOkButton = oilcanVarDern.f37907impromptu;
        Intrinsics.checkNotNullExpressionValue(stopOrOkButton, "stopOrOkButton");
        vintage.taiyuan.kowloon(stopOrOkButton);
        ParkinsansFontText stopOrOkButton2 = oilcanVarDern.f37907impromptu;
        Intrinsics.checkNotNullExpressionValue(stopOrOkButton2, "stopOrOkButton");
        vintage.taiyuan.competently(stopOrOkButton2);
        oilcanVarDern.f37907impromptu.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.result.beachfront
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivateResultActivity.preterite(this.f18416kowloon, view);
            }
        });
        supplicat.saneness(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.codejoy.boom.clap.module.result.competently
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivateResultActivity.wostteth(this.f18417kowloon, (sealless) obj);
            }
        }, 3, null);
    }
}

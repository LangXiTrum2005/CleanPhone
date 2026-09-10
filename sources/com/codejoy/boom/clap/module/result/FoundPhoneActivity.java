package com.codejoy.boom.clap.module.result;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.p000activity.sealless;
import androidx.p000activity.supplicat;
import com.codejoy.boom.clap.ad.native_templates.TemplateView;
import com.codejoy.boom.clap.data.FunctionMode;
import com.codejoy.boom.clap.helper.VersionHelper;
import com.codejoy.boom.clap.module.base.BaseActivity;
import com.codejoy.boom.clap.module.dialog.AppReviewDialog;
import com.codejoy.boom.clap.service.ClapCounterService;
import com.codejoy.boom.clap.widget.ParkinsansFontText;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import sonnetize.gintrap;
import sonnetize.rotuma;

/* JADX INFO: compiled from: FoundPhoneActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/codejoy/boom/clap/module/result/FoundPhoneActivity;", "Lcom/codejoy/boom/clap/module/base/BaseActivity;", "Lsonnetize/wireman;", "<init>", "()V", "", "cultivated", "treadless", "()Lsonnetize/wireman;", "privatdozent", "saran", "onDestroy", "lerp", "lotta", "itchy", "Lcom/codejoy/boom/clap/ad/native_templates/TemplateView;", "templateView", "timberyard", "(Lcom/codejoy/boom/clap/ad/native_templates/TemplateView;)V", "Lcom/codejoy/boom/clap/data/FunctionMode;", "cord", "Lpatroclinal/taiyuan;", "permissivist", "()Lcom/codejoy/boom/clap/data/FunctionMode;", "functionMode", "cuirassed", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FoundPhoneActivity extends BaseActivity<sonnetize.wireman> {

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public static final int f18409stratoscope = 8;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static boolean f18410trm;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan functionMode = p002kotlin.saneness.saneness(new Function0() { // from class: com.codejoy.boom.clap.module.result.apical
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FoundPhoneActivity.dent(this.f18413kowloon);
        }
    });

    /* JADX INFO: renamed from: com.codejoy.boom.clap.module.result.FoundPhoneActivity$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FoundPhoneActivity.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/codejoy/boom/clap/module/result/FoundPhoneActivity$attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/codejoy/boom/clap/data/FunctionMode;", X3.a.t, "", "attabal", "(Landroid/content/Context;Lcom/codejoy/boom/clap/data/FunctionMode;)V", "", "KEY_FUNCTION_MODE", "Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void attabal(Context context, FunctionMode mode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mode, "mode");
            com.blankj.utilcode.util.attabal.attabal(FoundPhoneActivity.class);
            Intent intent = new Intent(context, (Class<?>) FoundPhoneActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("key_function_mode", mode);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: FoundPhoneActivity.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f18412attabal;

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
            f18412attabal = iArr;
        }
    }

    public static final void coffeecake(FoundPhoneActivity foundPhoneActivity, View view) {
        foundPhoneActivity.getOnBackPressedDispatcher().formularize();
    }

    public static final FunctionMode dent(FoundPhoneActivity foundPhoneActivity) {
        FunctionMode functionMode = (FunctionMode) picketboat.dern.saneness(foundPhoneActivity.getIntent(), "key_function_mode", FunctionMode.class);
        return functionMode == null ? FunctionMode.MODE_CLAP_FIND_PHONE : functionMode;
    }

    public static final Unit milliradian(TemplateView templateView, NativeAd it) {
        Intrinsics.checkNotNullParameter(it, "it");
        templateView.setStyles(new orometer.saneness.attabal().attabal());
        templateView.destroyNativeAdIfNeed();
        templateView.setNativeAd(it);
        return Unit.f29295attabal;
    }

    public static final void nosophobia(FoundPhoneActivity foundPhoneActivity, View view) {
        foundPhoneActivity.getOnBackPressedDispatcher().formularize();
    }

    private final FunctionMode permissivist() {
        return (FunctionMode) this.functionMode.getValue();
    }

    public static final Unit premeiotic(FoundPhoneActivity foundPhoneActivity, sealless addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        if (!VersionHelper.f18244attabal.marial()) {
            couple.wireman.f24115attabal.saneness().gintrap(foundPhoneActivity, "ad_scenes_exit_found_phone_page", new transpositive.attabal(null, null, null, null, 15, null));
        }
        foundPhoneActivity.finish();
        return Unit.f29295attabal;
    }

    public static final void sayid(FoundPhoneActivity foundPhoneActivity, View view) {
        foundPhoneActivity.getOnBackPressedDispatcher().formularize();
    }

    public final void itchy() {
        rotuma rotumaVarDern = rotuma.dern(getLayoutInflater(), grimness().getRoot(), false);
        Intrinsics.checkNotNullExpressionValue(rotumaVarDern, "inflate(...)");
        grimness().getRoot().addView(rotumaVarDern.getRoot());
        rotumaVarDern.f37951competently.setText(getString(com.codejoy.boom.clap.arytenoidectomy.touched));
        ParkinsansFontText tvLocated = rotumaVarDern.f37951competently;
        Intrinsics.checkNotNullExpressionValue(tvLocated, "tvLocated");
        com.codejoy.boom.clap.helper.apical.marial(tvLocated);
        rotumaVarDern.f37953impromptu.setText(getString(com.codejoy.boom.clap.arytenoidectomy.your_phone_was_pocket));
        ParkinsansFontText closeButton = rotumaVarDern.f37955saneness;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        vintage.taiyuan.competently(closeButton);
        ParkinsansFontText closeButton2 = rotumaVarDern.f37955saneness;
        Intrinsics.checkNotNullExpressionValue(closeButton2, "closeButton");
        vintage.taiyuan.arytenoidectomy(closeButton2);
        rotumaVarDern.f37955saneness.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.result.kowloon
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FoundPhoneActivity.coffeecake(this.f18426kowloon, view);
            }
        });
    }

    public final void lerp() {
        gintrap gintrapVarDern = gintrap.dern(getLayoutInflater(), grimness().getRoot(), false);
        Intrinsics.checkNotNullExpressionValue(gintrapVarDern, "inflate(...)");
        grimness().getRoot().addView(gintrapVarDern.getRoot());
        gintrapVarDern.f37833competently.setText(getString(com.codejoy.boom.clap.arytenoidectomy.located));
        ParkinsansFontText tvLocated = gintrapVarDern.f37833competently;
        Intrinsics.checkNotNullExpressionValue(tvLocated, "tvLocated");
        com.codejoy.boom.clap.helper.apical.dern(tvLocated);
        ParkinsansFontText closeButton = gintrapVarDern.f37837saneness;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        vintage.taiyuan.competently(closeButton);
        ParkinsansFontText closeButton2 = gintrapVarDern.f37837saneness;
        Intrinsics.checkNotNullExpressionValue(closeButton2, "closeButton");
        vintage.taiyuan.kowloon(closeButton2);
        gintrapVarDern.f37837saneness.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.result.triweekly
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FoundPhoneActivity.nosophobia(this.f18430kowloon, view);
            }
        });
        TemplateView templateView = gintrapVarDern.f37836marial;
        Intrinsics.checkNotNullExpressionValue(templateView, "templateView");
        timberyard(templateView);
    }

    public final void lotta() {
        rotuma rotumaVarDern = rotuma.dern(getLayoutInflater(), grimness().getRoot(), false);
        Intrinsics.checkNotNullExpressionValue(rotumaVarDern, "inflate(...)");
        grimness().getRoot().addView(rotumaVarDern.getRoot());
        rotumaVarDern.f37951competently.setText(getString(com.codejoy.boom.clap.arytenoidectomy.touched));
        ParkinsansFontText tvLocated = rotumaVarDern.f37951competently;
        Intrinsics.checkNotNullExpressionValue(tvLocated, "tvLocated");
        com.codejoy.boom.clap.helper.apical.marial(tvLocated);
        rotumaVarDern.f37953impromptu.setText(getString(com.codejoy.boom.clap.arytenoidectomy.your_phone_was_touch));
        ParkinsansFontText closeButton = rotumaVarDern.f37955saneness;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        vintage.taiyuan.competently(closeButton);
        ParkinsansFontText closeButton2 = rotumaVarDern.f37955saneness;
        Intrinsics.checkNotNullExpressionValue(closeButton2, "closeButton");
        vintage.taiyuan.arytenoidectomy(closeButton2);
        rotumaVarDern.f37955saneness.setOnClickListener(new View.OnClickListener() { // from class: com.codejoy.boom.clap.module.result.impassible
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FoundPhoneActivity.sayid(this.f18424kowloon, view);
            }
        });
        TemplateView templateView = rotumaVarDern.f37954marial;
        Intrinsics.checkNotNullExpressionValue(templateView, "templateView");
        timberyard(templateView);
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ClapCounterService.Companion companion = ClapCounterService.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.taiyuan(applicationContext);
        super.onDestroy();
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void privatdozent() {
        supplicat.saneness(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.codejoy.boom.clap.module.result.formularize
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FoundPhoneActivity.premeiotic(this.f18423kowloon, (sealless) obj);
            }
        }, 2, null);
        ConstraintLayout root = grimness().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        vintage.taiyuan.apical(root);
        cultivated();
        int i = saneness.f18412attabal[permissivist().ordinal()];
        if (i != 1) {
            if (i == 2) {
                lerp();
                stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "4c_found_phone_page", null, null, null, null, 30, null);
            } else if (i == 3) {
                itchy();
                stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "7c_anti_pickpocket_result_page", null, null, null, null, 30, null);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                lotta();
                stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "8c_not_touch_result_page", null, null, null, null, 30, null);
            }
        }
        com.blankj.utilcode.util.attabal.attabal(ActivateResultActivity.class);
        couple.wireman.f24115attabal.saneness().triweekly("ad_scenes_found_phone_page", null);
        if (f18410trm || tau.saneness.f38666attabal.marial()) {
            return;
        }
        f18410trm = true;
        AppReviewDialog appReviewDialog = new AppReviewDialog();
        FragmentManager fragmentManagerPolloi = polloi();
        Intrinsics.checkNotNullExpressionValue(fragmentManagerPolloi, "getSupportFragmentManager(...)");
        vintage.saneness.attabal(appReviewDialog, fragmentManagerPolloi);
    }

    public final void timberyard(final TemplateView templateView) {
        couple.beachfront.f24107attabal.marial().sealless(this, "ad_scenes_found_phone_page", this, templateView, new Function1() { // from class: com.codejoy.boom.clap.module.result.arytenoidectomy
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FoundPhoneActivity.milliradian(templateView, (NativeAd) obj);
            }
        });
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    /* JADX INFO: renamed from: treadless, reason: merged with bridge method [inline-methods] */
    public sonnetize.wireman starveling() {
        sonnetize.wireman wiremanVarDern = sonnetize.wireman.dern(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(wiremanVarDern, "inflate(...)");
        return wiremanVarDern;
    }

    private final void cultivated() {
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void saran() {
    }
}

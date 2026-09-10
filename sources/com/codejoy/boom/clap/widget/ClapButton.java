package com.codejoy.boom.clap.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p001lifecycle.arytenoidectomy;
import androidx.p001lifecycle.marial;
import com.blankj.utilcode.util.ToastUtils;
import com.codejoy.boom.clap.data.FunctionMode;
import com.codejoy.boom.clap.formularize;
import com.codejoy.boom.clap.service.ClapCounterService;
import com.codejoy.boom.clap.widget.ClapButton;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import leh.competently;
import leh.impromptu;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;
import sonnetize.sealless;
import vintage.taiyuan;

/* JADX INFO: compiled from: ClapButton.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u000e¢\u0006\u0004\b'\u0010\u0017J\r\u0010(\u001a\u00020\u0012¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u000e¢\u0006\u0004\b*\u0010\u0017J\r\u0010+\u001a\u00020\u000e¢\u0006\u0004\b+\u0010\u0017J\r\u0010,\u001a\u00020\u000e¢\u0006\u0004\b,\u0010\u0017J\u000f\u0010-\u001a\u00020\u000eH\u0014¢\u0006\u0004\b-\u0010\u0017J\u0015\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u0012¢\u0006\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00104R\u0018\u00105\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lcom/codejoy/boom/clap/widget/ClapButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "initView", "Landroid/view/View;", "scanView", "", "restart", "startScanAnim", "(Landroid/view/View;Z)V", "stopScanAnim", "()V", "ivHandGuide", "startHandGuideAnim", "(Landroid/view/View;)V", "stopHandGuideAnim", "Lleh/competently;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setActivateListener", "(Lleh/competently;)V", "Lleh/impromptu;", "setStateChangeListener", "(Lleh/impromptu;)V", "Lcom/codejoy/boom/clap/data/FunctionMode;", X3.a.t, "setup", "(Lcom/codejoy/boom/clap/data/FunctionMode;)V", "enterActivatedAfterPermissionGrant", "isOnActivated", "()Z", "performToActivate", "onUnActivated", "onActivated", "onDetachedFromWindow", "forceCloseDeactivate", "updateActivatedTipText", "(Z)V", "Lcom/codejoy/boom/clap/widget/ClapButtonState;", "currentState", "Lcom/codejoy/boom/clap/widget/ClapButtonState;", "Lleh/competently;", "stateChangeListener", "Lleh/impromptu;", "Lsonnetize/sealless;", "binding", "Lsonnetize/sealless;", "Landroidx/appcompat/widget/AppCompatImageView;", "activateButton", "Landroidx/appcompat/widget/AppCompatImageView;", "getActivateButton", "()Landroidx/appcompat/widget/AppCompatImageView;", "setActivateButton", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "functionMode", "Lcom/codejoy/boom/clap/data/FunctionMode;", "Landroid/animation/ObjectAnimator;", "scanAnimator", "Landroid/animation/ObjectAnimator;", "Landroid/animation/AnimatorSet;", "mAnimatorSet", "Landroid/animation/AnimatorSet;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ClapButton extends FrameLayout {
    public static final int $stable = 8;
    private AppCompatImageView activateButton;
    private sealless binding;
    private ClapButtonState currentState;
    private FunctionMode functionMode;
    private competently listener;
    private AnimatorSet mAnimatorSet;
    private ObjectAnimator scanAnimator;
    private impromptu stateChangeListener;

    /* JADX INFO: compiled from: ClapButton.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f18655attabal;

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
            f18655attabal = iArr;
        }
    }

    /* JADX INFO: compiled from: ClapButton.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/codejoy/boom/clap/widget/ClapButton$saneness", "Landroidx/lifecycle/marial;", "Landroidx/lifecycle/arytenoidectomy;", "owner", "", "monoploid", "(Landroidx/lifecycle/arytenoidectomy;)V", "dovishness", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness implements marial {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ sealless f18656arytenoidectomy;

        public saneness(sealless seallessVar) {
            this.f18656arytenoidectomy = seallessVar;
        }

        @Override // androidx.p001lifecycle.marial
        public /* bridge */ void dern(arytenoidectomy arytenoidectomyVar) {
            super.dern(arytenoidectomyVar);
        }

        @Override // androidx.p001lifecycle.marial
        public void dovishness(arytenoidectomy owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.dovishness(owner);
            ClapButton.this.stopScanAnim();
        }

        @Override // androidx.p001lifecycle.marial
        public void monoploid(arytenoidectomy owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.monoploid(owner);
            if (ClapButton.this.isOnActivated()) {
                ClapButton clapButton = ClapButton.this;
                View lottie = this.f18656arytenoidectomy.f37961beachfront;
                Intrinsics.checkNotNullExpressionValue(lottie, "lottie");
                clapButton.startScanAnim(lottie, false);
            }
        }

        @Override // androidx.p001lifecycle.marial
        public /* bridge */ void onDestroy(arytenoidectomy arytenoidectomyVar) {
            super.onDestroy(arytenoidectomyVar);
        }

        @Override // androidx.p001lifecycle.marial
        public /* bridge */ void onStart(arytenoidectomy arytenoidectomyVar) {
            super.onStart(arytenoidectomyVar);
        }

        @Override // androidx.p001lifecycle.marial
        public /* bridge */ void onStop(arytenoidectomy arytenoidectomyVar) {
            super.onStop(arytenoidectomyVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClapButton(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentState = ClapButtonState.IDLE;
        this.functionMode = FunctionMode.NONE;
        initView(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView(Context context) {
        sealless seallessVarDern = sealless.dern(LayoutInflater.from(context), this, false);
        Intrinsics.checkNotNullExpressionValue(seallessVarDern, "inflate(...)");
        addView(seallessVarDern.getRoot());
        this.binding = seallessVarDern;
        AppCompatImageView activateButton = seallessVarDern.f37966saneness;
        Intrinsics.checkNotNullExpressionValue(activateButton, "activateButton");
        taiyuan.molybdenite(activateButton, true);
        View disableButton = seallessVarDern.f37968wireman;
        Intrinsics.checkNotNullExpressionValue(disableButton, "disableButton");
        taiyuan.molybdenite(disableButton, true);
        this.activateButton = seallessVarDern.f37966saneness;
        if (context instanceof arytenoidectomy) {
            ((arytenoidectomy) context).getLifecycle().attabal(new saneness(seallessVarDern));
        }
        onUnActivated();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivated$lambda$0(ClapButton clapButton, View view) {
        String string;
        Intrinsics.beachfront(view);
        if (taiyuan.taiyuan(view)) {
            return;
        }
        Object tag = view.getTag();
        if (tag == null || (string = tag.toString()) == null) {
            string = "";
        }
        if (Intrinsics.wireman(string, "deactivate")) {
            tau.saneness.f38666attabal.trm(false);
            clapButton.updateActivatedTipText(true);
            ToastUtils.polloi(clapButton.getContext().getString(com.codejoy.boom.clap.arytenoidectomy.turn_off_do_not_disturb), new Object[0]);
        } else {
            competently competentlyVar = clapButton.listener;
            if (competentlyVar == null || !competentlyVar.attabal()) {
                return;
            }
            clapButton.onUnActivated();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUnActivated$lambda$0(sealless seallessVar, ClapButton clapButton) {
        AppCompatImageView appCompatImageView = seallessVar.f37965marial;
        jugal.attabal attabalVar = jugal.attabal.f29013attabal;
        Context context = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!attabalVar.competently(context)) {
            appCompatImageView.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        appCompatImageView.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Context context2 = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        appCompatImageView.setScaleX(attabalVar.competently(context2) ? -1.0f : 1.0f);
        Intrinsics.beachfront(appCompatImageView);
        clapButton.startHandGuideAnim(appCompatImageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUnActivated$lambda$1(ClapButton clapButton, View view) {
        String string;
        Intrinsics.beachfront(view);
        if (taiyuan.taiyuan(view)) {
            return;
        }
        Object tag = view.getTag();
        if (tag == null || (string = tag.toString()) == null) {
            string = "";
        }
        if (Intrinsics.wireman(string, "deactivate")) {
            tau.saneness.f38666attabal.trm(false);
            clapButton.updateActivatedTipText(true);
            ToastUtils.polloi(clapButton.getContext().getString(com.codejoy.boom.clap.arytenoidectomy.turn_off_do_not_disturb), new Object[0]);
        } else {
            competently competentlyVar = clapButton.listener;
            if (competentlyVar == null || !competentlyVar.saneness()) {
                return;
            }
            clapButton.onActivated();
        }
    }

    private final void startHandGuideAnim(View ivHandGuide) {
        stopHandGuideAnim();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(ivHandGuide, "scaleY", 1.0f, 1.2f, 1.0f, 1.0f, 1.2f, 1.0f, 1.2f, 1.0f), ObjectAnimator.ofFloat(ivHandGuide, "scaleX", 1.0f, 1.2f, 1.0f, 1.0f, 1.2f, 1.0f, 1.2f, 1.0f));
        Iterator<Animator> it = animatorSet.getChildAnimations().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Animator next = it.next();
            if (next instanceof ValueAnimator) {
                ValueAnimator valueAnimator = (ValueAnimator) next;
                valueAnimator.setRepeatCount(-1);
                valueAnimator.setRepeatMode(1);
            }
        }
        animatorSet.setDuration(1500L);
        animatorSet.start();
        this.mAnimatorSet = animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startScanAnim(View scanView, boolean restart) {
        ObjectAnimator objectAnimatorOfFloat;
        if (this.scanAnimator != null) {
            return;
        }
        stopScanAnim();
        if (restart) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(scanView, "rotation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f);
        } else {
            float rotation = scanView.getRotation();
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(scanView, "rotation", rotation, 360.0f + rotation);
        }
        objectAnimatorOfFloat.setDuration(1500L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.start();
        this.scanAnimator = objectAnimatorOfFloat;
    }

    private final void stopHandGuideAnim() {
        AnimatorSet animatorSet = this.mAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.mAnimatorSet = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopScanAnim() {
        ObjectAnimator objectAnimator = this.scanAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.scanAnimator = null;
    }

    public final void enterActivatedAfterPermissionGrant() {
        onActivated();
    }

    public final AppCompatImageView getActivateButton() {
        return this.activateButton;
    }

    public final boolean isOnActivated() {
        ConstraintLayout constraintLayout;
        sealless seallessVar = this.binding;
        return (seallessVar == null || (constraintLayout = seallessVar.f37963dern) == null || constraintLayout.getVisibility() != 0) ? false : true;
    }

    public final void onActivated() {
        stopHandGuideAnim();
        sealless seallessVar = this.binding;
        if (seallessVar == null) {
            return;
        }
        ClapButtonState clapButtonState = this.currentState;
        ClapButtonState clapButtonState2 = ClapButtonState.ACTIVATED;
        if (clapButtonState == clapButtonState2) {
            return;
        }
        this.currentState = clapButtonState2;
        seallessVar.f37967taiyuan.setVisibility(4);
        seallessVar.f37963dern.setVisibility(0);
        View lottie = seallessVar.f37961beachfront;
        Intrinsics.checkNotNullExpressionValue(lottie, "lottie");
        startScanAnim(lottie, true);
        View disableButton = seallessVar.f37968wireman;
        Intrinsics.checkNotNullExpressionValue(disableButton, "disableButton");
        taiyuan.marial(disableButton);
        seallessVar.f37968wireman.setOnClickListener(new View.OnClickListener() { // from class: leh.dern
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClapButton.onActivated$lambda$0(this.f32621kowloon, view);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        stopHandGuideAnim();
        super.onDetachedFromWindow();
    }

    public final void onUnActivated() {
        final sealless seallessVar = this.binding;
        if (seallessVar == null) {
            return;
        }
        ClapButtonState clapButtonState = this.currentState;
        ClapButtonState clapButtonState2 = ClapButtonState.UNACTIVATED;
        if (clapButtonState == clapButtonState2) {
            return;
        }
        this.currentState = clapButtonState2;
        seallessVar.f37967taiyuan.setVisibility(0);
        seallessVar.f37963dern.setVisibility(4);
        seallessVar.f37965marial.post(new Runnable() { // from class: leh.attabal
            @Override // java.lang.Runnable
            public final void run() {
                ClapButton.onUnActivated$lambda$0(seallessVar, this);
            }
        });
        AppCompatImageView activateButton = seallessVar.f37966saneness;
        Intrinsics.checkNotNullExpressionValue(activateButton, "activateButton");
        taiyuan.marial(activateButton);
        seallessVar.f37966saneness.setOnClickListener(new View.OnClickListener() { // from class: leh.saneness
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClapButton.onUnActivated$lambda$1(this.f32631kowloon, view);
            }
        });
    }

    public final void performToActivate() {
        AppCompatImageView appCompatImageView;
        sealless seallessVar = this.binding;
        if (seallessVar == null || (appCompatImageView = seallessVar.f37966saneness) == null) {
            return;
        }
        appCompatImageView.performClick();
    }

    public final void setActivateButton(AppCompatImageView appCompatImageView) {
        this.activateButton = appCompatImageView;
    }

    public final void setActivateListener(competently listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void setStateChangeListener(impromptu listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public final void setup(FunctionMode mode) {
        GradientTextView2 gradientTextView2;
        View view;
        GradientTextView2 gradientTextView3;
        View view2;
        GradientTextView2 gradientTextView4;
        View view3;
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.functionMode = mode;
        int i = attabal.f18655attabal[mode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                sealless seallessVar = this.binding;
                if (seallessVar != null && (view = seallessVar.f37968wireman) != null) {
                    view.setBackgroundResource(formularize.boomclap_btn_home_2);
                }
                sealless seallessVar2 = this.binding;
                if (seallessVar2 == null || (gradientTextView2 = seallessVar2.f37962competently) == null) {
                    return;
                }
                gradientTextView2.setText(getContext().getString(com.codejoy.boom.clap.arytenoidectomy.clap_whistle));
                return;
            }
            if (i == 3) {
                sealless seallessVar3 = this.binding;
                if (seallessVar3 != null && (view2 = seallessVar3.f37968wireman) != null) {
                    view2.setBackgroundResource(formularize.boomclap_btn_home_4);
                }
                sealless seallessVar4 = this.binding;
                if (seallessVar4 == null || (gradientTextView3 = seallessVar4.f37962competently) == null) {
                    return;
                }
                gradientTextView3.setText(getContext().getString(com.codejoy.boom.clap.arytenoidectomy.pocket_active_tip));
                return;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            sealless seallessVar5 = this.binding;
            if (seallessVar5 != null && (view3 = seallessVar5.f37968wireman) != null) {
                view3.setBackgroundResource(formularize.boomclap_btn_home_3);
            }
            sealless seallessVar6 = this.binding;
            if (seallessVar6 == null || (gradientTextView4 = seallessVar6.f37962competently) == null) {
                return;
            }
            gradientTextView4.setText(getContext().getString(com.codejoy.boom.clap.arytenoidectomy.touch_active_tip));
        }
    }

    public final void updateActivatedTipText(boolean forceCloseDeactivate) {
        String string;
        sealless seallessVar = this.binding;
        if (seallessVar == null) {
            return;
        }
        if (forceCloseDeactivate || !tau.saneness.f38666attabal.gintrap() || !ClapCounterService.INSTANCE.cutely()) {
            seallessVar.f37966saneness.setTag("");
            seallessVar.f37968wireman.setTag("");
            seallessVar.f37965marial.setVisibility(0);
            seallessVar.f37961beachfront.setVisibility(0);
            seallessVar.f37962competently.setTextSize(1, 21.0f);
            seallessVar.f37964impromptu.setTextSize(1, 26.0f);
            seallessVar.f37964impromptu.setText(getContext().getString(com.codejoy.boom.clap.arytenoidectomy.tap_to_activate));
            seallessVar.f37966saneness.setImageResource(formularize.boomclap_btn_home_off);
            setup(this.functionMode);
            if (this.currentState == ClapButtonState.ACTIVATED) {
                this.currentState = ClapButtonState.IDLE;
                onActivated();
                return;
            } else {
                this.currentState = ClapButtonState.IDLE;
                onUnActivated();
                return;
            }
        }
        stopHandGuideAnim();
        stopScanAnim();
        seallessVar.f37966saneness.setImageResource(formularize.boomclap_btn_home_5);
        seallessVar.f37968wireman.setBackgroundResource(formularize.boomclap_btn_home_5);
        int i = attabal.f18655attabal[this.functionMode.ordinal()];
        if (i == 1 || i == 2) {
            string = getContext().getString(com.codejoy.boom.clap.arytenoidectomy.enable_quit_mode_clap);
        } else if (i == 3) {
            string = getContext().getString(com.codejoy.boom.clap.arytenoidectomy.enable_quit_mode_pocked);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            string = getContext().getString(com.codejoy.boom.clap.arytenoidectomy.enable_quit_mode_touch);
        }
        Intrinsics.beachfront(string);
        seallessVar.f37962competently.setText(string);
        seallessVar.f37964impromptu.setText(string);
        seallessVar.f37965marial.setVisibility(4);
        seallessVar.f37961beachfront.setVisibility(4);
        seallessVar.f37962competently.setTextSize(1, 20.0f);
        seallessVar.f37964impromptu.setTextSize(1, 20.0f);
        seallessVar.f37966saneness.setTag("deactivate");
        seallessVar.f37968wireman.setTag("deactivate");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClapButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentState = ClapButtonState.IDLE;
        this.functionMode = FunctionMode.NONE;
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClapButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentState = ClapButtonState.IDLE;
        this.functionMode = FunctionMode.NONE;
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClapButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentState = ClapButtonState.IDLE;
        this.functionMode = FunctionMode.NONE;
        initView(context);
    }
}

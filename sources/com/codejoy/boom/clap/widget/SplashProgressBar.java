package com.codejoy.boom.clap.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.codejoy.boom.clap.widget.SplashProgressBar;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import leh.cutely;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import sonnetize.seminary;

/* JADX INFO: compiled from: SplashProgressBar.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0013J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/codejoy/boom/clap/widget/SplashProgressBar;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "initView", "", IronSourceConstants.EVENTS_DURATION, "realStartAnim", "(J)V", "", "percent", "updateAnimPercent", "(F)V", "startAnim", "cancelAnim", "()V", "Lsonnetize/seminary;", "binding", "Lsonnetize/seminary;", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplashProgressBar extends FrameLayout {
    public static final int $stable = 8;
    private ValueAnimator animator;
    private seminary binding;

    /* JADX INFO: compiled from: SplashProgressBar.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/codejoy/boom/clap/widget/SplashProgressBar$attabal", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ SplashProgressBar f18752arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ seminary f18753kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ long f18754monoploid;

        public attabal(seminary seminaryVar, SplashProgressBar splashProgressBar, long j) {
            this.f18753kowloon = seminaryVar;
            this.f18752arytenoidectomy = splashProgressBar;
            this.f18754monoploid = j;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f18753kowloon.f37970dern.getWidth() <= 0 || this.f18753kowloon.f37970dern.getHeight() <= 0) {
                return;
            }
            this.f18753kowloon.f37970dern.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f18752arytenoidectomy.realStartAnim(this.f18754monoploid);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashProgressBar(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    private final void initView(Context context) {
        seminary seminaryVarSaneness = seminary.saneness(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(seminaryVarSaneness, "inflate(...)");
        this.binding = seminaryVarSaneness;
        seminaryVarSaneness.f37971saneness.setScaleX(jugal.attabal.f29013attabal.competently(context) ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void realStartAnim(long duration) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 100.0f);
        valueAnimatorOfFloat.setInterpolator(new cutely());
        valueAnimatorOfFloat.setDuration(duration);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: leh.apical
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SplashProgressBar.realStartAnim$lambda$0(this.f32606attabal, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void realStartAnim$lambda$0(SplashProgressBar splashProgressBar, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.competently(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        splashProgressBar.updateAnimPercent(((Float) animatedValue).floatValue());
    }

    private final void updateAnimPercent(float percent) {
        seminary seminaryVar = this.binding;
        if (seminaryVar == null) {
            return;
        }
        int i = (int) percent;
        seminaryVar.f37970dern.setProgress(i);
        jugal.attabal attabalVar = jugal.attabal.f29013attabal;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (attabalVar.competently(context)) {
            seminaryVar.f37971saneness.setTranslationX((percent / 100) * seminaryVar.f37970dern.getWidth() * (-1));
        } else {
            seminaryVar.f37971saneness.setTranslationX((percent / 100) * seminaryVar.f37970dern.getWidth());
        }
        seminaryVar.f37972wireman.setText(i + "%");
    }

    public final void cancelAnim() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animator = null;
        updateAnimPercent(100.0f);
    }

    public final void startAnim(long duration) {
        cancelAnim();
        seminary seminaryVar = this.binding;
        if (seminaryVar == null) {
            return;
        }
        if (seminaryVar.f37970dern.getWidth() <= 0 || seminaryVar.f37970dern.getHeight() <= 0) {
            seminaryVar.f37970dern.getViewTreeObserver().addOnGlobalLayoutListener(new attabal(seminaryVar, this, duration));
        } else {
            realStartAnim(duration);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }
}

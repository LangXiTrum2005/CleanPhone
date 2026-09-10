package com.codejoy.boom.clap.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.codejoy.boom.clap.widget.Switch;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import eia.impromptu;
import leh.taiyuan;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 P2\u00020\u0001:\u0001QB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0019¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010 \u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b \u0010\u001bR\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00104R\u0016\u0010?\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00104R\u0016\u0010B\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010F\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010AR\u0016\u0010H\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010+R\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR$\u0010O\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010\u001b\"\u0004\bN\u0010\"¨\u0006R"}, d2 = {"Lcom/codejoy/boom/clap/widget/Switch;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lleh/taiyuan;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnCheckedChangeListener", "(Lleh/taiyuan;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "performClick", "()Z", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "isOn", "setState", "(Z)V", "setCheckedImmediately", "impromptu", "()V", "kowloon", "Lleh/taiyuan;", "onCheckedChangeListener", "value", "arytenoidectomy", "Z", "Landroid/graphics/Paint;", "monoploid", "Landroid/graphics/Paint;", "mPaint", "polloi", "mTextPaint", "", "molybdenite", "F", "mWidth", "graveside", "mHeight", "Landroid/graphics/Rect;", "adultoid", "Landroid/graphics/Rect;", "textRect", "dovishness", "mControlBarX", "gintrap", "mTextX", "rotuma", "I", "foregroundColor", "preprohormone", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "cord", "controlBarBackgroundColor", "cuirassed", "isInAnimation", "Landroid/animation/AnimatorSet;", "stratoscope", "Landroid/animation/AnimatorSet;", "animatorSet", "competently", "setChecked", "isChecked", "trm", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Switch extends View {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public final Rect textRect;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public boolean isOn;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public int controlBarBackgroundColor;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public boolean isInAnimation;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public float mControlBarX;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public float mTextX;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public float mHeight;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public taiyuan onCheckedChangeListener;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public float mWidth;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public Paint mPaint;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public Paint mTextPaint;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public int backgroundColor;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public int foregroundColor;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final AnimatorSet animatorSet;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public static final int f18755oilcan = 8;

    public Switch(Context context) {
        super(context);
        this.mPaint = new Paint();
        this.mTextPaint = new Paint();
        this.mWidth = getWidth();
        this.mHeight = getHeight();
        this.textRect = new Rect();
        float f = this.mWidth;
        boolean z = this.isOn;
        this.mControlBarX = f + (z ? -70.0f : (-f) + 70.0f);
        this.mTextX = z ? 0.4f : 0.85f;
        this.foregroundColor = Color.parseColor(z ? "#49C041" : "#E5701D");
        this.backgroundColor = Color.parseColor(this.isOn ? "#25991D" : "#9B450A");
        this.controlBarBackgroundColor = Color.parseColor(this.isOn ? "#80B339" : "#D5BE71");
        this.animatorSet = new AnimatorSet();
    }

    public static final void apical(Switch r1, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.competently(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        r1.foregroundColor = ((Integer) animatedValue).intValue();
        r1.postInvalidate();
    }

    public static final void cutely(Switch r1, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.competently(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        r1.mTextX = ((Float) animatedValue).floatValue();
        r1.postInvalidate();
    }

    public static final void formularize(Switch r1, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.competently(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        r1.backgroundColor = ((Integer) animatedValue).intValue();
        r1.postInvalidate();
    }

    public static final void impassible(Switch r1, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.competently(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        r1.controlBarBackgroundColor = ((Integer) animatedValue).intValue();
        r1.postInvalidate();
    }

    public static final void taiyuan(Switch r1, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.competently(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        r1.mControlBarX = ((Float) animatedValue).floatValue();
        r1.postInvalidate();
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final boolean getIsOn() {
        return this.isOn;
    }

    public final void impromptu() {
        Object objM3351constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            this.animatorSet.cancel();
            this.isInAnimation = true;
            this.animatorSet.addListener(new saneness());
            float f = this.mWidth;
            float f2 = 0.25f * f;
            float f3 = this.mControlBarX;
            if (this.isOn) {
                f2 = f - f2;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, f2);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: leh.formularize
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Switch.taiyuan(this.f32622attabal, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.mTextX, this.isOn ? 0.4f : 0.85f);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: leh.impassible
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Switch.cutely(this.f32623attabal, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.foregroundColor, Color.parseColor(this.isOn ? "#49C041" : "#E5701D"));
            valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: leh.triweekly
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Switch.apical(this.f32632attabal, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(this.backgroundColor, Color.parseColor(this.isOn ? "#25991D" : "#9B450A"));
            valueAnimatorOfArgb2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: leh.kowloon
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Switch.formularize(this.f32624attabal, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(this.controlBarBackgroundColor, Color.parseColor(this.isOn ? "#80B339" : "#D5BE71"));
            valueAnimatorOfArgb3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: leh.arytenoidectomy
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Switch.impassible(this.f32607attabal, valueAnimator);
                }
            });
            this.animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfArgb, valueAnimatorOfArgb2, valueAnimatorOfArgb3);
            this.animatorSet.start();
            objM3351constructorimpl = Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            this.isInAnimation = false;
            impromptu.saneness().wireman(thM3354exceptionOrNullimpl);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object objM3351constructorimpl;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        try {
            Result.Companion companion = Result.INSTANCE;
            float f = this.mHeight;
            float f2 = f * 0.9f;
            float f3 = this.mWidth;
            float f4 = f * 1.0f;
            float f5 = f * 0.45f;
            float f6 = f * 0.45f;
            Paint paint = this.mPaint;
            paint.setColor(this.backgroundColor);
            Unit unit = Unit.f29295attabal;
            canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f4, f5, f6, paint);
            float f7 = this.mWidth;
            float f8 = this.mHeight;
            Paint paint2 = this.mPaint;
            paint2.setColor(this.foregroundColor);
            canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, f2, f8 * 0.45f, f8 * 0.45f, paint2);
            Paint paint3 = this.mTextPaint;
            paint3.setTextSize(f2 * 0.4f);
            paint3.setTypeface(Typeface.DEFAULT_BOLD);
            paint3.setColor(Color.parseColor("#FFF6E0"));
            paint3.setShadowLayer(15.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Color.parseColor("#4D000000"));
            String str = this.isOn ? "ON" : "OFF";
            paint3.getTextBounds(str, 0, str.length(), this.textRect);
            float f9 = f2 / 2;
            canvas.drawText(str, (this.mWidth * this.mTextX) - this.textRect.width(), (this.textRect.height() / 2) + f9, paint3);
            float f10 = 0.032f * f2;
            float f11 = this.mHeight * 0.3f;
            Paint paint4 = this.mPaint;
            paint4.setColor(this.controlBarBackgroundColor);
            canvas.drawCircle(this.mControlBarX, f9 + f10, f11, paint4);
            float f12 = this.mControlBarX;
            float f13 = f9 - f10;
            float f14 = this.mHeight * 0.3f;
            Paint paint5 = this.mPaint;
            paint5.setColor(Color.parseColor("#FFF6E0"));
            canvas.drawCircle(f12, f13, f14, paint5);
            objM3351constructorimpl = Result.m3351constructorimpl(canvas);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            impromptu.saneness().wireman(thM3354exceptionOrNullimpl);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
        this.mWidth = View.MeasureSpec.getSize(widthMeasureSpec);
        this.mHeight = View.MeasureSpec.getSize(heightMeasureSpec);
        float f = this.mWidth;
        float f2 = 0.25f * f;
        if (this.isOn) {
            f2 = f - f2;
        }
        this.mControlBarX = f2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Object objM3351constructorimpl;
        boolean z;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (event != null) {
                float x = event.getX();
                float y = event.getY();
                z = true;
                if (event.getAction() == 1 && x + getLeft() < getRight() && y + getTop() < getBottom()) {
                    setState(!this.isOn);
                    impromptu();
                    performClick();
                }
            } else {
                z = false;
            }
            objM3351constructorimpl = Result.m3351constructorimpl(Boolean.valueOf(z));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            impromptu.saneness().wireman(thM3354exceptionOrNullimpl);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3356isFailureimpl(objM3351constructorimpl)) {
            objM3351constructorimpl = bool;
        }
        return ((Boolean) objM3351constructorimpl).booleanValue();
    }

    @Override // android.view.View
    public boolean performClick() {
        Object objM3351constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(Boolean.valueOf(super.performClick()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            impromptu.saneness().wireman(thM3354exceptionOrNullimpl);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3356isFailureimpl(objM3351constructorimpl)) {
            objM3351constructorimpl = bool;
        }
        return ((Boolean) objM3351constructorimpl).booleanValue();
    }

    public final void setChecked(boolean z) {
        Object objM3351constructorimpl;
        Object objM3351constructorimpl2;
        Unit unit;
        if (this.isOn != z) {
            setCheckedImmediately(z);
            try {
                Result.Companion companion = Result.INSTANCE;
                taiyuan taiyuanVar = this.onCheckedChangeListener;
                if (taiyuanVar != null) {
                    taiyuanVar.attabal(this, z);
                    unit = Unit.f29295attabal;
                } else {
                    unit = null;
                }
                objM3351constructorimpl = Result.m3351constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(dern.attabal(th));
            }
            Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
            if (thM3354exceptionOrNullimpl != null) {
                impromptu.saneness().wireman(thM3354exceptionOrNullimpl);
            }
            try {
                objM3351constructorimpl2 = Result.m3351constructorimpl(Boolean.valueOf(performClick()));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                objM3351constructorimpl2 = Result.m3351constructorimpl(dern.attabal(th2));
            }
            Throwable thM3354exceptionOrNullimpl2 = Result.m3354exceptionOrNullimpl(objM3351constructorimpl2);
            if (thM3354exceptionOrNullimpl2 != null) {
                impromptu.saneness().wireman(thM3354exceptionOrNullimpl2);
            }
        }
    }

    public final void setCheckedImmediately(boolean isOn) {
        this.isOn = isOn;
        float f = this.mWidth;
        float f2 = 0.25f * f;
        if (isOn) {
            f2 = f - f2;
        }
        this.mControlBarX = f2;
        this.mTextX = isOn ? 0.4f : 0.85f;
        this.foregroundColor = Color.parseColor(isOn ? "#49C041" : "#E5701D");
        this.backgroundColor = Color.parseColor(isOn ? "#25991D" : "#9B450A");
        this.controlBarBackgroundColor = Color.parseColor(isOn ? "#80B339" : "#D5BE71");
        invalidate();
    }

    public final void setOnCheckedChangeListener(taiyuan listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onCheckedChangeListener = listener;
    }

    public final void setState(boolean isOn) {
        Object objM3351constructorimpl;
        Unit unit;
        if (this.isOn == isOn) {
            return;
        }
        this.isOn = isOn;
        try {
            Result.Companion companion = Result.INSTANCE;
            taiyuan taiyuanVar = this.onCheckedChangeListener;
            if (taiyuanVar != null) {
                taiyuanVar.attabal(this, isOn);
                unit = Unit.f29295attabal;
            } else {
                unit = null;
            }
            objM3351constructorimpl = Result.m3351constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            impromptu.saneness().wireman(thM3354exceptionOrNullimpl);
        }
    }

    public Switch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPaint = new Paint();
        this.mTextPaint = new Paint();
        this.mWidth = getWidth();
        this.mHeight = getHeight();
        this.textRect = new Rect();
        float f = this.mWidth;
        boolean z = this.isOn;
        this.mControlBarX = f + (z ? -70.0f : (-f) + 70.0f);
        this.mTextX = z ? 0.4f : 0.85f;
        this.foregroundColor = Color.parseColor(z ? "#49C041" : "#E5701D");
        this.backgroundColor = Color.parseColor(this.isOn ? "#25991D" : "#9B450A");
        this.controlBarBackgroundColor = Color.parseColor(this.isOn ? "#80B339" : "#D5BE71");
        this.animatorSet = new AnimatorSet();
    }

    /* JADX INFO: compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness implements Animator.AnimatorListener {
        public saneness() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Switch.this.isInAnimation = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public Switch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPaint = new Paint();
        this.mTextPaint = new Paint();
        this.mWidth = getWidth();
        this.mHeight = getHeight();
        this.textRect = new Rect();
        float f = this.mWidth;
        boolean z = this.isOn;
        this.mControlBarX = f + (z ? -70.0f : (-f) + 70.0f);
        this.mTextX = z ? 0.4f : 0.85f;
        this.foregroundColor = Color.parseColor(z ? "#49C041" : "#E5701D");
        this.backgroundColor = Color.parseColor(this.isOn ? "#25991D" : "#9B450A");
        this.controlBarBackgroundColor = Color.parseColor(this.isOn ? "#80B339" : "#D5BE71");
        this.animatorSet = new AnimatorSet();
    }
}

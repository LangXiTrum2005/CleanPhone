package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback.AnonymousClass1;
import com.charging.screenshow.battery.animations.themes.R;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class AnimatedVectorDrawableCompat extends VectorDrawableCommon implements Animatable2Compat {
    public final Context Z;
    public Animator.AnimatorListener e0 = null;
    public ArrayList f0 = null;
    public final Drawable.Callback g0 = new Drawable.Callback() { // from class: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.1
        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            AnimatedVectorDrawableCompat.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
        }
    };

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final AnimatedVectorDrawableCompatState f8473Y = new AnimatedVectorDrawableCompatState();

    public static class AnimatedVectorDrawableCompatState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public VectorDrawableCompat f8474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AnimatorSet f8475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f8476c;
        public ArrayMap d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public AnimatedVectorDrawableCompat(Context context) {
        this.Z = context;
    }

    public static AnimatedVectorDrawableCompat a(Context context) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        Drawable drawableB = ResourcesCompat.b(context.getResources(), R.drawable.mtrl_checkbox_button_checked_unchecked, context.getTheme());
        animatedVectorDrawableCompat.X = drawableB;
        drawableB.setCallback(animatedVectorDrawableCompat.g0);
        new AnimatedVectorDrawableDelegateState(animatedVectorDrawableCompat.X.getConstantState());
        return animatedVectorDrawableCompat;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.X;
        if (drawable != null) {
            DrawableCompat.a(drawable, theme);
        }
    }

    public final void b(Animatable2Compat.AnimationCallback animationCallback) {
        Drawable drawable = this.X;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            if (animationCallback.f8471a == null) {
                animationCallback.f8471a = animationCallback.new AnonymousClass1();
            }
            animatedVectorDrawable.registerAnimationCallback(animationCallback.f8471a);
            return;
        }
        if (animationCallback == null) {
            return;
        }
        if (this.f0 == null) {
            this.f0 = new ArrayList();
        }
        if (this.f0.contains(animationCallback)) {
            return;
        }
        this.f0.add(animationCallback);
        if (this.e0 == null) {
            this.e0 = new AnimatorListenerAdapter() { // from class: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.this;
                    ArrayList arrayList = new ArrayList(animatedVectorDrawableCompat.f0);
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((Animatable2Compat.AnimationCallback) arrayList.get(i2)).a(animatedVectorDrawableCompat);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.this;
                    ArrayList arrayList = new ArrayList(animatedVectorDrawableCompat.f0);
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((Animatable2Compat.AnimationCallback) arrayList.get(i2)).b(animatedVectorDrawableCompat);
                    }
                }
            };
        }
        this.f8473Y.f8475b.addListener(this.e0);
    }

    public final boolean c(Animatable2Compat.AnimationCallback animationCallback) {
        Animator.AnimatorListener animatorListener;
        Drawable drawable = this.X;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            if (animationCallback.f8471a == null) {
                animationCallback.f8471a = animationCallback.new AnonymousClass1();
            }
            animatedVectorDrawable.unregisterAnimationCallback(animationCallback.f8471a);
        }
        ArrayList arrayList = this.f0;
        if (arrayList == null || animationCallback == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(animationCallback);
        if (this.f0.size() == 0 && (animatorListener = this.e0) != null) {
            this.f8473Y.f8475b.removeListener(animatorListener);
            this.e0 = null;
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return DrawableCompat.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState = this.f8473Y;
        animatedVectorDrawableCompatState.f8474a.draw(canvas);
        if (animatedVectorDrawableCompatState.f8475b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.getAlpha() : this.f8473Y.f8474a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f8473Y.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.X;
        return drawable != null ? DrawableCompat.c(drawable) : this.f8473Y.f8474a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.X != null) {
            return new AnimatedVectorDrawableDelegateState(this.X.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f8473Y.f8474a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f8473Y.f8474a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.getOpacity() : this.f8473Y.f8474a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState;
        Drawable drawable = this.X;
        if (drawable != null) {
            DrawableCompat.e(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            animatedVectorDrawableCompatState = this.f8473Y;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayC = TypedArrayUtils.c(resources, theme, attributeSet, AndroidResources.f8470e);
                    int resourceId = typedArrayC.getResourceId(0, 0);
                    if (resourceId != 0) {
                        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
                        vectorDrawableCompat.X = ResourcesCompat.b(resources, resourceId, theme);
                        new VectorDrawableCompat.VectorDrawableDelegateState(vectorDrawableCompat.X.getConstantState());
                        vectorDrawableCompat.g0 = false;
                        vectorDrawableCompat.setCallback(this.g0);
                        VectorDrawableCompat vectorDrawableCompat2 = animatedVectorDrawableCompatState.f8474a;
                        if (vectorDrawableCompat2 != null) {
                            vectorDrawableCompat2.setCallback(null);
                        }
                        animatedVectorDrawableCompatState.f8474a = vectorDrawableCompat;
                    }
                    typedArrayC.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AndroidResources.f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.Z;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(animatedVectorDrawableCompatState.f8474a.f8479Y.f8504b.o.get(string));
                        if (animatedVectorDrawableCompatState.f8476c == null) {
                            animatedVectorDrawableCompatState.f8476c = new ArrayList();
                            animatedVectorDrawableCompatState.d = new ArrayMap(0);
                        }
                        animatedVectorDrawableCompatState.f8476c.add(animatorLoadAnimator);
                        animatedVectorDrawableCompatState.d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (animatedVectorDrawableCompatState.f8475b == null) {
            animatedVectorDrawableCompatState.f8475b = new AnimatorSet();
        }
        animatedVectorDrawableCompatState.f8475b.playTogether(animatedVectorDrawableCompatState.f8476c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.isAutoMirrored() : this.f8473Y.f8474a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.X;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f8473Y.f8475b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.X;
        return drawable != null ? drawable.isStateful() : this.f8473Y.f8474a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f8473Y.f8474a.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.X;
        return drawable != null ? drawable.setLevel(i2) : this.f8473Y.f8474a.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.X;
        return drawable != null ? drawable.setState(iArr) : this.f8473Y.f8474a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f8473Y.f8474a.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f8473Y.f8474a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f8473Y.f8474a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.X;
        if (drawable != null) {
            DrawableCompat.i(drawable, i2);
        } else {
            this.f8473Y.f8474a.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.X;
        if (drawable != null) {
            DrawableCompat.j(drawable, colorStateList);
        } else {
            this.f8473Y.f8474a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.X;
        if (drawable != null) {
            DrawableCompat.k(drawable, mode);
        } else {
            this.f8473Y.f8474a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f8473Y.f8474a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.X;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState = this.f8473Y;
        if (animatedVectorDrawableCompatState.f8475b.isStarted()) {
            return;
        }
        animatedVectorDrawableCompatState.f8475b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.X;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f8473Y.f8475b.end();
        }
    }

    public static class AnimatedVectorDrawableDelegateState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f8477a;

        public AnimatedVectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.f8477a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f8477a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f8477a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null);
            Drawable drawableNewDrawable = this.f8477a.newDrawable();
            animatedVectorDrawableCompat.X = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.g0);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null);
            Drawable drawableNewDrawable = this.f8477a.newDrawable(resources);
            animatedVectorDrawableCompat.X = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.g0);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null);
            Drawable drawableNewDrawable = this.f8477a.newDrawable(resources, theme);
            animatedVectorDrawableCompat.X = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.g0);
            return animatedVectorDrawableCompat;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

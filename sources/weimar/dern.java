package weimar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.ArrayList;
import lightstruck.apical;
import lightstruck.impromptu;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class dern extends beachfront implements Animatable {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public ArrayList<weimar.saneness> f39692adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public C0821dern f39693arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final Drawable.Callback f39694dovishness;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public Animator.AnimatorListener f39695graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public wireman f39696molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public Context f39697monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public ArgbEvaluator f39698polloi;

    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    public class attabal implements Drawable.Callback {
        public attabal() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            dern.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            dern.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            dern.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: weimar.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    public static class C0821dern extends Drawable.ConstantState {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f39700attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public AnimatorSet f39701dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public androidx.collection.attabal<Animator, String> f39702marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public competently f39703saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public ArrayList<Animator> f39704wireman;

        public C0821dern(Context context, C0821dern c0821dern, Drawable.Callback callback, Resources resources) {
            if (c0821dern != null) {
                this.f39700attabal = c0821dern.f39700attabal;
                competently competentlyVar = c0821dern.f39703saneness;
                if (competentlyVar != null) {
                    Drawable.ConstantState constantState = competentlyVar.getConstantState();
                    if (resources != null) {
                        this.f39703saneness = (competently) constantState.newDrawable(resources);
                    } else {
                        this.f39703saneness = (competently) constantState.newDrawable();
                    }
                    competently competentlyVar2 = (competently) this.f39703saneness.mutate();
                    this.f39703saneness = competentlyVar2;
                    competentlyVar2.setCallback(callback);
                    this.f39703saneness.setBounds(c0821dern.f39703saneness.getBounds());
                    this.f39703saneness.competently(false);
                }
                ArrayList<Animator> arrayList = c0821dern.f39704wireman;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f39704wireman = new ArrayList<>(size);
                    this.f39702marial = new androidx.collection.attabal<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = c0821dern.f39704wireman.get(i);
                        Animator animatorClone = animator.clone();
                        String str = c0821dern.f39702marial.get(animator);
                        animatorClone.setTarget(this.f39703saneness.dern(str));
                        this.f39704wireman.add(animatorClone);
                        this.f39702marial.put(animatorClone, str);
                    }
                    attabal();
                }
            }
        }

        public void attabal() {
            if (this.f39701dern == null) {
                this.f39701dern = new AnimatorSet();
            }
            this.f39701dern.playTogether(this.f39704wireman);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f39700attabal;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    public class saneness extends AnimatorListenerAdapter {
        public saneness() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(dern.this.f39692adultoid);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((weimar.saneness) arrayList.get(i)).saneness(dern.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(dern.this.f39692adultoid);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((weimar.saneness) arrayList.get(i)).dern(dern.this);
            }
        }
    }

    public dern() {
        this(null, null, null);
    }

    public static dern attabal(Context context, int i) {
        dern dernVar = new dern(context);
        Drawable drawableMarial = impromptu.marial(context.getResources(), i, context.getTheme());
        dernVar.f39622kowloon = drawableMarial;
        drawableMarial.setCallback(dernVar.f39694dovishness);
        dernVar.f39696molybdenite = new wireman(dernVar.f39622kowloon.getConstantState());
        return dernVar;
    }

    public static boolean competently(AnimatedVectorDrawable animatedVectorDrawable, weimar.saneness sanenessVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(sanenessVar.attabal());
    }

    public static void dern(AnimatedVectorDrawable animatedVectorDrawable, weimar.saneness sanenessVar) {
        animatedVectorDrawable.registerAnimationCallback(sanenessVar.attabal());
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            DrawableCompat.applyTheme(drawable, theme);
        }
    }

    public boolean beachfront(weimar.saneness sanenessVar) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            competently((AnimatedVectorDrawable) drawable, sanenessVar);
        }
        ArrayList<weimar.saneness> arrayList = this.f39692adultoid;
        if (arrayList == null || sanenessVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(sanenessVar);
        if (this.f39692adultoid.size() == 0) {
            wireman();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            return DrawableCompat.canApplyTheme(drawable);
        }
        return false;
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f39693arytenoidectomy.f39703saneness.draw(canvas);
        if (this.f39693arytenoidectomy.f39701dern.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? DrawableCompat.getAlpha(drawable) : this.f39693arytenoidectomy.f39703saneness.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f39693arytenoidectomy.f39700attabal;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? DrawableCompat.getColorFilter(drawable) : this.f39693arytenoidectomy.f39703saneness.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f39622kowloon != null) {
            return new wireman(this.f39622kowloon.getConstantState());
        }
        return null;
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f39693arytenoidectomy.f39703saneness.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f39693arytenoidectomy.f39703saneness.getIntrinsicWidth();
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? drawable.getOpacity() : this.f39693arytenoidectomy.f39703saneness.getOpacity();
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            DrawableCompat.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayApical = apical.apical(resources, theme, attributeSet, weimar.attabal.f39618marial);
                    int resourceId = typedArrayApical.getResourceId(0, 0);
                    if (resourceId != 0) {
                        competently competentlyVarSaneness = competently.saneness(resources, resourceId, theme);
                        competentlyVarSaneness.competently(false);
                        competentlyVarSaneness.setCallback(this.f39694dovishness);
                        competently competentlyVar = this.f39693arytenoidectomy.f39703saneness;
                        if (competentlyVar != null) {
                            competentlyVar.setCallback(null);
                        }
                        this.f39693arytenoidectomy.f39703saneness = competentlyVarSaneness;
                    }
                    typedArrayApical.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, weimar.attabal.f39612beachfront);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f39697monoploid;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        marial(string, marial.attabal(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f39693arytenoidectomy.attabal();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? DrawableCompat.isAutoMirrored(drawable) : this.f39693arytenoidectomy.f39703saneness.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f39693arytenoidectomy.f39701dern.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? drawable.isStateful() : this.f39693arytenoidectomy.f39703saneness.isStateful();
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final void marial(String str, Animator animator) {
        animator.setTarget(this.f39693arytenoidectomy.f39703saneness.dern(str));
        C0821dern c0821dern = this.f39693arytenoidectomy;
        if (c0821dern.f39704wireman == null) {
            c0821dern.f39704wireman = new ArrayList<>();
            this.f39693arytenoidectomy.f39702marial = new androidx.collection.attabal<>();
        }
        this.f39693arytenoidectomy.f39704wireman.add(animator);
        this.f39693arytenoidectomy.f39702marial.put(animator, str);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f39693arytenoidectomy.f39703saneness.setBounds(rect);
        }
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? drawable.setLevel(i) : this.f39693arytenoidectomy.f39703saneness.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f39622kowloon;
        return drawable != null ? drawable.setState(iArr) : this.f39693arytenoidectomy.f39703saneness.setState(iArr);
    }

    public void saneness(weimar.saneness sanenessVar) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            dern((AnimatedVectorDrawable) drawable, sanenessVar);
            return;
        }
        if (sanenessVar == null) {
            return;
        }
        if (this.f39692adultoid == null) {
            this.f39692adultoid = new ArrayList<>();
        }
        if (this.f39692adultoid.contains(sanenessVar)) {
            return;
        }
        this.f39692adultoid.add(sanenessVar);
        if (this.f39695graveside == null) {
            this.f39695graveside = new saneness();
        }
        this.f39693arytenoidectomy.f39701dern.addListener(this.f39695graveside);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f39693arytenoidectomy.f39703saneness.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            DrawableCompat.setAutoMirrored(drawable, z);
        } else {
            this.f39693arytenoidectomy.f39703saneness.setAutoMirrored(z);
        }
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // weimar.beachfront, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            DrawableCompat.setTint(drawable, i);
        } else {
            this.f39693arytenoidectomy.f39703saneness.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        } else {
            this.f39693arytenoidectomy.f39703saneness.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
        } else {
            this.f39693arytenoidectomy.f39703saneness.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f39693arytenoidectomy.f39703saneness.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f39693arytenoidectomy.f39701dern.isStarted()) {
                return;
            }
            this.f39693arytenoidectomy.f39701dern.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f39693arytenoidectomy.f39701dern.end();
        }
    }

    public final void wireman() {
        Animator.AnimatorListener animatorListener = this.f39695graveside;
        if (animatorListener != null) {
            this.f39693arytenoidectomy.f39701dern.removeListener(animatorListener);
            this.f39695graveside = null;
        }
    }

    public dern(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f39622kowloon;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f39693arytenoidectomy.f39703saneness.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    public static class wireman extends Drawable.ConstantState {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Drawable.ConstantState f39706attabal;

        public wireman(Drawable.ConstantState constantState) {
            this.f39706attabal = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f39706attabal.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f39706attabal.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            dern dernVar = new dern();
            Drawable drawableNewDrawable = this.f39706attabal.newDrawable();
            dernVar.f39622kowloon = drawableNewDrawable;
            drawableNewDrawable.setCallback(dernVar.f39694dovishness);
            return dernVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            dern dernVar = new dern();
            Drawable drawableNewDrawable = this.f39706attabal.newDrawable(resources);
            dernVar.f39622kowloon = drawableNewDrawable;
            drawableNewDrawable.setCallback(dernVar.f39694dovishness);
            return dernVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            dern dernVar = new dern();
            Drawable drawableNewDrawable = this.f39706attabal.newDrawable(resources, theme);
            dernVar.f39622kowloon = drawableNewDrawable;
            drawableNewDrawable.setCallback(dernVar.f39694dovishness);
            return dernVar;
        }
    }

    public dern(Context context, C0821dern c0821dern, Resources resources) {
        this.f39698polloi = null;
        this.f39695graveside = null;
        this.f39692adultoid = null;
        attabal attabalVar = new attabal();
        this.f39694dovishness = attabalVar;
        this.f39697monoploid = context;
        if (c0821dern != null) {
            this.f39693arytenoidectomy = c0821dern;
        } else {
            this.f39693arytenoidectomy = new C0821dern(context, c0821dern, attabalVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

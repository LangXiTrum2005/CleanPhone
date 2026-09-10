package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.manager.ImageAssetManager;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.layer.CompositionLayer;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final b s0 = new b();
    public final d e0;
    public final LottieListener f0;
    public LottieListener g0;
    public int h0;
    public final LottieDrawable i0;
    public String j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public final HashSet o0;
    public final HashSet p0;
    public LottieTask q0;
    public LottieComposition r0;

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$2, reason: invalid class name */
    class AnonymousClass2 extends LottieValueCallback<Object> {
        @Override // com.airbnb.lottie.value.LottieValueCallback
        public final Object a(LottieFrameInfo lottieFrameInfo) {
            throw null;
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f9512Y;
        public float Z;
        public boolean e0;
        public String f0;
        public int g0;
        public int h0;

        /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.X = parcel.readString();
                savedState.Z = parcel.readFloat();
                savedState.e0 = parcel.readInt() == 1;
                savedState.f0 = parcel.readString();
                savedState.g0 = parcel.readInt();
                savedState.h0 = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.X);
            parcel.writeFloat(this.Z);
            parcel.writeInt(this.e0 ? 1 : 0);
            parcel.writeString(this.f0);
            parcel.writeInt(this.g0);
            parcel.writeInt(this.h0);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class UserActionTaken {
        public static final UserActionTaken X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final UserActionTaken f9513Y;
        public static final UserActionTaken Z;
        public static final UserActionTaken e0;
        public static final UserActionTaken f0;
        public static final UserActionTaken g0;
        public static final /* synthetic */ UserActionTaken[] h0;

        static {
            UserActionTaken userActionTaken = new UserActionTaken("SET_ANIMATION", 0);
            X = userActionTaken;
            UserActionTaken userActionTaken2 = new UserActionTaken("SET_PROGRESS", 1);
            f9513Y = userActionTaken2;
            UserActionTaken userActionTaken3 = new UserActionTaken("SET_REPEAT_MODE", 2);
            Z = userActionTaken3;
            UserActionTaken userActionTaken4 = new UserActionTaken("SET_REPEAT_COUNT", 3);
            e0 = userActionTaken4;
            UserActionTaken userActionTaken5 = new UserActionTaken("SET_IMAGE_ASSETS", 4);
            f0 = userActionTaken5;
            UserActionTaken userActionTaken6 = new UserActionTaken("PLAY_OPTION", 5);
            g0 = userActionTaken6;
            h0 = new UserActionTaken[]{userActionTaken, userActionTaken2, userActionTaken3, userActionTaken4, userActionTaken5, userActionTaken6};
        }

        public static UserActionTaken valueOf(String str) {
            return (UserActionTaken) Enum.valueOf(UserActionTaken.class, str);
        }

        public static UserActionTaken[] values() {
            return (UserActionTaken[]) h0.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [com.airbnb.lottie.d] */
    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        String string;
        super(context, attributeSet);
        this.e0 = new LottieListener() { // from class: com.airbnb.lottie.d
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                this.f9682a.setComposition((LottieComposition) obj);
            }
        };
        this.f0 = new LottieListener<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                int i2 = lottieAnimationView.h0;
                if (i2 != 0) {
                    lottieAnimationView.setImageResource(i2);
                }
                LottieListener lottieListener = lottieAnimationView.g0;
                if (lottieListener == null) {
                    lottieListener = LottieAnimationView.s0;
                }
                lottieListener.onResult(th);
            }
        };
        this.h0 = 0;
        LottieDrawable lottieDrawable = new LottieDrawable();
        this.i0 = lottieDrawable;
        this.l0 = false;
        this.m0 = false;
        this.n0 = true;
        this.o0 = new HashSet();
        this.p0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f9556a, com.charging.screenshow.battery.animations.themes.R.attr.lottieAnimationViewStyle, 0);
        this.n0 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(11);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(6);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(16);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(11, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(6);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(16)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(5, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
            this.m0 = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(9, false)) {
            lottieDrawable.f9524Y.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(14, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(13, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(15, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(2, true));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(8));
        setProgress(typedArrayObtainStyledAttributes.getFloat(10, 0.0f));
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        if (lottieDrawable.o0 != z2) {
            lottieDrawable.o0 = z2;
            if (lottieDrawable.X != null) {
                lottieDrawable.c();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            lottieDrawable.a(new KeyPath("**"), LottieProperty.f9532F, new LottieValueCallback(new SimpleColorFilter(ContextCompat.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(3, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(12, 0);
            setRenderMode(RenderMode.values()[i2 >= RenderMode.values().length ? 0 : i2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(7, false));
        typedArrayObtainStyledAttributes.recycle();
        Context context2 = getContext();
        ThreadLocal threadLocal = Utils.f9946a;
        lottieDrawable.Z = Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    private void setCompositionTask(LottieTask<LottieComposition> lottieTask) {
        this.o0.add(UserActionTaken.X);
        this.r0 = null;
        this.i0.d();
        c();
        lottieTask.b(this.e0);
        lottieTask.a(this.f0);
        this.q0 = lottieTask;
    }

    public final void c() {
        LottieTask lottieTask = this.q0;
        if (lottieTask != null) {
            d dVar = this.e0;
            synchronized (lottieTask) {
                lottieTask.f9550a.remove(dVar);
            }
            LottieTask lottieTask2 = this.q0;
            LottieListener lottieListener = this.f0;
            synchronized (lottieTask2) {
                lottieTask2.f9551b.remove(lottieListener);
            }
        }
    }

    public boolean getClipToCompositionBounds() {
        return this.i0.q0;
    }

    public LottieComposition getComposition() {
        return this.r0;
    }

    public long getDuration() {
        LottieComposition lottieComposition = this.r0;
        if (lottieComposition != null) {
            return (long) lottieComposition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.i0.f9524Y.g0;
    }

    public String getImageAssetsFolder() {
        return this.i0.j0;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.i0.p0;
    }

    public float getMaxFrame() {
        return this.i0.f9524Y.f();
    }

    public float getMinFrame() {
        return this.i0.f9524Y.g();
    }

    public PerformanceTracker getPerformanceTracker() {
        LottieComposition lottieComposition = this.i0.X;
        if (lottieComposition != null) {
            return lottieComposition.f9514a;
        }
        return null;
    }

    public float getProgress() {
        return this.i0.f9524Y.e();
    }

    public RenderMode getRenderMode() {
        return this.i0.x0 ? RenderMode.Z : RenderMode.f9557Y;
    }

    public int getRepeatCount() {
        return this.i0.f9524Y.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.i0.f9524Y.getRepeatMode();
    }

    public float getSpeed() {
        return this.i0.f9524Y.Z;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof LottieDrawable) {
            boolean z2 = ((LottieDrawable) drawable).x0;
            RenderMode renderMode = RenderMode.Z;
            if ((z2 ? renderMode : RenderMode.f9557Y) == renderMode) {
                this.i0.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.i0;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.m0) {
            return;
        }
        this.i0.i();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.j0 = savedState.X;
        HashSet hashSet = this.o0;
        UserActionTaken userActionTaken = UserActionTaken.X;
        if (!hashSet.contains(userActionTaken) && !TextUtils.isEmpty(this.j0)) {
            setAnimation(this.j0);
        }
        this.k0 = savedState.f9512Y;
        if (!hashSet.contains(userActionTaken) && (i2 = this.k0) != 0) {
            setAnimation(i2);
        }
        if (!hashSet.contains(UserActionTaken.f9513Y)) {
            setProgress(savedState.Z);
        }
        UserActionTaken userActionTaken2 = UserActionTaken.g0;
        if (!hashSet.contains(userActionTaken2) && savedState.e0) {
            hashSet.add(userActionTaken2);
            this.i0.i();
        }
        if (!hashSet.contains(UserActionTaken.f0)) {
            setImageAssetsFolder(savedState.f0);
        }
        if (!hashSet.contains(UserActionTaken.Z)) {
            setRepeatMode(savedState.g0);
        }
        if (hashSet.contains(UserActionTaken.e0)) {
            return;
        }
        setRepeatCount(savedState.h0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.X = this.j0;
        savedState.f9512Y = this.k0;
        LottieDrawable lottieDrawable = this.i0;
        savedState.Z = lottieDrawable.f9524Y.e();
        boolean zIsVisible = lottieDrawable.isVisible();
        LottieValueAnimator lottieValueAnimator = lottieDrawable.f9524Y;
        if (zIsVisible) {
            z2 = lottieValueAnimator.l0;
        } else {
            LottieDrawable.OnVisibleAction onVisibleAction = lottieDrawable.g0;
            z2 = onVisibleAction == LottieDrawable.OnVisibleAction.f9525Y || onVisibleAction == LottieDrawable.OnVisibleAction.Z;
        }
        savedState.e0 = z2;
        savedState.f0 = lottieDrawable.j0;
        savedState.g0 = lottieValueAnimator.getRepeatMode();
        savedState.h0 = lottieValueAnimator.getRepeatCount();
        return savedState;
    }

    public void setAnimation(final int i2) {
        LottieTask<LottieComposition> lottieTaskA;
        this.k0 = i2;
        final String str = null;
        this.j0 = null;
        if (isInEditMode()) {
            lottieTaskA = new LottieTask<>(new Callable() { // from class: com.airbnb.lottie.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.X;
                    boolean z2 = lottieAnimationView.n0;
                    int i3 = i2;
                    if (!z2) {
                        return LottieCompositionFactory.e(i3, lottieAnimationView.getContext(), null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return LottieCompositionFactory.e(i3, context, LottieCompositionFactory.h(context, i3));
                }
            }, true);
        } else if (this.n0) {
            Context context = getContext();
            final String strH = LottieCompositionFactory.h(context, i2);
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            lottieTaskA = LottieCompositionFactory.a(strH, new Callable() { // from class: com.airbnb.lottie.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    HashMap map = LottieCompositionFactory.f9522a;
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    return LottieCompositionFactory.e(i2, context2, strH);
                }
            });
        } else {
            Context context2 = getContext();
            HashMap map = LottieCompositionFactory.f9522a;
            final WeakReference weakReference2 = new WeakReference(context2);
            final Context applicationContext2 = context2.getApplicationContext();
            lottieTaskA = LottieCompositionFactory.a(null, new Callable() { // from class: com.airbnb.lottie.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    HashMap map2 = LottieCompositionFactory.f9522a;
                    Context context3 = (Context) weakReference2.get();
                    if (context3 == null) {
                        context3 = applicationContext2;
                    }
                    return LottieCompositionFactory.e(i2, context3, str);
                }
            });
        }
        setCompositionTask(lottieTaskA);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(LottieCompositionFactory.a(null, new f(new ByteArrayInputStream(str.getBytes()), 0)));
    }

    public void setAnimationFromUrl(String str) {
        LottieTask<LottieComposition> lottieTaskA;
        int i2 = 0;
        if (this.n0) {
            Context context = getContext();
            HashMap map = LottieCompositionFactory.f9522a;
            String strC = android.support.v4.media.a.C("url_", str);
            lottieTaskA = LottieCompositionFactory.a(strC, new e(context, str, i2, strC));
        } else {
            lottieTaskA = LottieCompositionFactory.a(null, new e(getContext(), str, i2, null));
        }
        setCompositionTask(lottieTaskA);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z2) {
        this.i0.v0 = z2;
    }

    public void setCacheComposition(boolean z2) {
        this.n0 = z2;
    }

    public void setClipToCompositionBounds(boolean z2) {
        LottieDrawable lottieDrawable = this.i0;
        if (z2 != lottieDrawable.q0) {
            lottieDrawable.q0 = z2;
            CompositionLayer compositionLayer = lottieDrawable.r0;
            if (compositionLayer != null) {
                compositionLayer.H = z2;
            }
            lottieDrawable.invalidateSelf();
        }
    }

    public void setComposition(LottieComposition lottieComposition) {
        LottieDrawable lottieDrawable = this.i0;
        lottieDrawable.setCallback(this);
        this.r0 = lottieComposition;
        boolean z2 = true;
        this.l0 = true;
        LottieComposition lottieComposition2 = lottieDrawable.X;
        LottieValueAnimator lottieValueAnimator = lottieDrawable.f9524Y;
        if (lottieComposition2 == lottieComposition) {
            z2 = false;
        } else {
            lottieDrawable.K0 = true;
            lottieDrawable.d();
            lottieDrawable.X = lottieComposition;
            lottieDrawable.c();
            boolean z3 = lottieValueAnimator.k0 == null;
            lottieValueAnimator.k0 = lottieComposition;
            if (z3) {
                lottieValueAnimator.l(Math.max(lottieValueAnimator.i0, lottieComposition.k), Math.min(lottieValueAnimator.j0, lottieComposition.f9520l));
            } else {
                lottieValueAnimator.l((int) lottieComposition.k, (int) lottieComposition.f9520l);
            }
            float f = lottieValueAnimator.g0;
            lottieValueAnimator.g0 = 0.0f;
            lottieValueAnimator.k((int) f);
            lottieValueAnimator.c();
            lottieDrawable.r(lottieValueAnimator.getAnimatedFraction());
            ArrayList arrayList = lottieDrawable.h0;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                LottieDrawable.LazyCompositionTask lazyCompositionTask = (LottieDrawable.LazyCompositionTask) it.next();
                if (lazyCompositionTask != null) {
                    lazyCompositionTask.run();
                }
                it.remove();
            }
            arrayList.clear();
            lottieComposition.f9514a.f9553a = lottieDrawable.t0;
            lottieDrawable.e();
            Drawable.Callback callback = lottieDrawable.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(lottieDrawable);
            }
        }
        this.l0 = false;
        if (getDrawable() != lottieDrawable || z2) {
            if (!z2) {
                boolean z4 = lottieValueAnimator != null ? lottieValueAnimator.l0 : false;
                setImageDrawable(null);
                setImageDrawable(lottieDrawable);
                if (z4) {
                    lottieDrawable.k();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.p0.iterator();
            while (it2.hasNext()) {
                ((LottieOnCompositionLoadedListener) it2.next()).a();
            }
        }
    }

    public void setFailureListener(LottieListener<Throwable> lottieListener) {
        this.g0 = lottieListener;
    }

    public void setFallbackResource(int i2) {
        this.h0 = i2;
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        this.i0.m0 = fontAssetDelegate;
    }

    public void setFrame(int i2) {
        this.i0.l(i2);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z2) {
        this.i0.e0 = z2;
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        LottieDrawable lottieDrawable = this.i0;
        lottieDrawable.k0 = imageAssetDelegate;
        ImageAssetManager imageAssetManager = lottieDrawable.i0;
        if (imageAssetManager != null) {
            imageAssetManager.f9710c = imageAssetDelegate;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.i0.j0 = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        c();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        c();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i2) {
        c();
        super.setImageResource(i2);
    }

    public void setMaintainOriginalImageBounds(boolean z2) {
        this.i0.p0 = z2;
    }

    public void setMaxFrame(int i2) {
        this.i0.m(i2);
    }

    public void setMaxProgress(float f) {
        LottieDrawable lottieDrawable = this.i0;
        LottieComposition lottieComposition = lottieDrawable.X;
        if (lottieComposition == null) {
            lottieDrawable.h0.add(new j(lottieDrawable, f, 0));
            return;
        }
        float fD = MiscUtils.d(lottieComposition.k, lottieComposition.f9520l, f);
        LottieValueAnimator lottieValueAnimator = lottieDrawable.f9524Y;
        lottieValueAnimator.l(lottieValueAnimator.i0, fD);
    }

    public void setMinAndMaxFrame(String str) {
        this.i0.o(str);
    }

    public void setMinFrame(int i2) {
        this.i0.p(i2);
    }

    public void setMinProgress(float f) {
        LottieDrawable lottieDrawable = this.i0;
        LottieComposition lottieComposition = lottieDrawable.X;
        if (lottieComposition == null) {
            lottieDrawable.h0.add(new j(lottieDrawable, f, 1));
        } else {
            lottieDrawable.p((int) MiscUtils.d(lottieComposition.k, lottieComposition.f9520l, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z2) {
        LottieDrawable lottieDrawable = this.i0;
        if (lottieDrawable.u0 == z2) {
            return;
        }
        lottieDrawable.u0 = z2;
        CompositionLayer compositionLayer = lottieDrawable.r0;
        if (compositionLayer != null) {
            compositionLayer.r(z2);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z2) {
        LottieDrawable lottieDrawable = this.i0;
        lottieDrawable.t0 = z2;
        LottieComposition lottieComposition = lottieDrawable.X;
        if (lottieComposition != null) {
            lottieComposition.f9514a.f9553a = z2;
        }
    }

    public void setProgress(float f) {
        this.o0.add(UserActionTaken.f9513Y);
        this.i0.r(f);
    }

    public void setRenderMode(RenderMode renderMode) {
        LottieDrawable lottieDrawable = this.i0;
        lottieDrawable.w0 = renderMode;
        lottieDrawable.e();
    }

    public void setRepeatCount(int i2) {
        this.o0.add(UserActionTaken.e0);
        this.i0.f9524Y.setRepeatCount(i2);
    }

    public void setRepeatMode(int i2) {
        this.o0.add(UserActionTaken.Z);
        this.i0.f9524Y.setRepeatMode(i2);
    }

    public void setSafeMode(boolean z2) {
        this.i0.f0 = z2;
    }

    public void setSpeed(float f) {
        this.i0.f9524Y.Z = f;
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.i0.n0 = textDelegate;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        LottieValueAnimator lottieValueAnimator;
        LottieDrawable lottieDrawable2;
        boolean z2 = this.l0;
        if (!z2 && drawable == (lottieDrawable2 = this.i0)) {
            LottieValueAnimator lottieValueAnimator2 = lottieDrawable2.f9524Y;
            if (lottieValueAnimator2 == null ? false : lottieValueAnimator2.l0) {
                this.m0 = false;
                lottieDrawable2.h();
            } else if (!z2) {
                lottieDrawable = (LottieDrawable) drawable;
                lottieValueAnimator = lottieDrawable.f9524Y;
                if (lottieValueAnimator != null ? lottieValueAnimator.l0 : false) {
                    lottieDrawable.h();
                }
            }
        } else if (!z2 && (drawable instanceof LottieDrawable)) {
            lottieDrawable = (LottieDrawable) drawable;
            lottieValueAnimator = lottieDrawable.f9524Y;
            if (lottieValueAnimator != null ? lottieValueAnimator.l0 : false) {
                lottieDrawable.h();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.i0.n(str);
    }

    public void setMinFrame(String str) {
        this.i0.q(str);
    }

    public void setAnimation(final String str) {
        LottieTask<LottieComposition> lottieTaskA;
        int i2 = 1;
        this.j0 = str;
        this.k0 = 0;
        if (isInEditMode()) {
            lottieTaskA = new LottieTask<>(new Callable() { // from class: com.airbnb.lottie.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.X;
                    boolean z2 = lottieAnimationView.n0;
                    String str2 = str;
                    if (!z2) {
                        return LottieCompositionFactory.b(lottieAnimationView.getContext(), str2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    HashMap map = LottieCompositionFactory.f9522a;
                    return LottieCompositionFactory.b(context, str2, "asset_" + str2);
                }
            }, true);
        } else if (this.n0) {
            Context context = getContext();
            HashMap map = LottieCompositionFactory.f9522a;
            String strC = android.support.v4.media.a.C("asset_", str);
            lottieTaskA = LottieCompositionFactory.a(strC, new e(context.getApplicationContext(), str, i2, strC));
        } else {
            Context context2 = getContext();
            HashMap map2 = LottieCompositionFactory.f9522a;
            lottieTaskA = LottieCompositionFactory.a(null, new e(context2.getApplicationContext(), str, i2, null));
        }
        setCompositionTask(lottieTaskA);
    }
}

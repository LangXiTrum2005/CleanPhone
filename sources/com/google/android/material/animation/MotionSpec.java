package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.collection.SimpleArrayMap;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class MotionSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap f19086a = new SimpleArrayMap(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SimpleArrayMap f19087b = new SimpleArrayMap(0);

    public static MotionSpec a(Context context, int i2) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return b(arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i2), e2);
            return null;
        }
    }

    public static MotionSpec b(ArrayList arrayList) {
        MotionSpec motionSpec = new MotionSpec();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            motionSpec.f19087b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AnimationUtils.f19079b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AnimationUtils.f19080c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AnimationUtils.d;
            }
            MotionTiming motionTiming = new MotionTiming();
            motionTiming.d = 0;
            motionTiming.f19091e = 1;
            motionTiming.f19088a = startDelay;
            motionTiming.f19089b = duration;
            motionTiming.f19090c = interpolator;
            motionTiming.d = objectAnimator.getRepeatCount();
            motionTiming.f19091e = objectAnimator.getRepeatMode();
            motionSpec.f19086a.put(propertyName, motionTiming);
        }
        return motionSpec;
    }

    public final MotionTiming c(String str) {
        SimpleArrayMap simpleArrayMap = this.f19086a;
        if (simpleArrayMap.get(str) != null) {
            return (MotionTiming) simpleArrayMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MotionSpec) {
            return this.f19086a.equals(((MotionSpec) obj).f19086a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19086a.hashCode();
    }

    public final String toString() {
        return IOUtils.LINE_SEPARATOR_UNIX + getClass().getName() + AbstractJsonLexerKt.BEGIN_OBJ + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f19086a + "}\n";
    }
}

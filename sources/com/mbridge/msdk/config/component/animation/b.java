package com.mbridge.msdk.config.component.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f31790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int[] f31792c;

        public a(int i10, int[] iArr) {
            this.f31791b = i10;
            this.f31792c = iArr;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f31790a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f31790a) {
                return;
            }
            int i10 = this.f31791b;
            if (i10 == -1 || this.f31792c[0] > 0) {
                if (i10 != -1) {
                    int[] iArr = this.f31792c;
                    iArr[0] = iArr[0] - 1;
                }
                animator.start();
            }
        }
    }

    private Animator f(e eVar, View view) {
        Map<String, Object> mapB = eVar.b();
        if (!a(mapB, "alpha") && !a(mapB, "fromAlpha")) {
            return null;
        }
        float fA = a(mapB.get("alpha"), view.getAlpha());
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, a(mapB.get("fromAlpha"), view.getAlpha()), fA);
    }

    private Animator g(e eVar, View view) {
        Animator animatorB;
        Animator animatorD;
        Animator animatorC;
        Animator animatorA;
        Map<String, Object> mapB = eVar.b();
        ArrayList arrayList = new ArrayList();
        if (a(mapB, TtmlNode.ATTR_TTS_BACKGROUND_COLOR) && (animatorA = a(view, d(mapB.get(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)))) != null) {
            arrayList.add(animatorA);
        }
        if (a(mapB, "textColor") && (animatorC = c(view, d(mapB.get("textColor")))) != null) {
            arrayList.add(animatorC);
        }
        if (a(mapB, "tintColor") && (animatorD = d(view, d(mapB.get("tintColor")))) != null) {
            arrayList.add(animatorD);
        }
        if (a(mapB, "borderColor") && (animatorB = b(view, d(mapB.get("borderColor")))) != null) {
            arrayList.add(animatorB);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (Animator) arrayList.get(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    private Animator h(e eVar, View view) {
        Map<String, Object> mapB = eVar.b();
        a(view, mapB);
        ArrayList arrayList = new ArrayList();
        if (a(mapB, "rotation") || a(mapB, "fromRotation")) {
            float fA = a(mapB.get("rotation"), view.getRotation());
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.ROTATION, a(mapB.get("fromRotation"), view.getRotation()), fA));
        }
        if (a(mapB, "rotationX") || a(mapB, "fromRotationX")) {
            float fA2 = a(mapB.get("rotationX"), view.getRotationX());
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.ROTATION_X, a(mapB.get("fromRotationX"), view.getRotationX()), fA2));
        }
        if (a(mapB, "rotationY") || a(mapB, "fromRotationY")) {
            float fA3 = a(mapB.get("rotationY"), view.getRotationY());
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.ROTATION_Y, a(mapB.get("fromRotationY"), view.getRotationY()), fA3));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return ObjectAnimator.ofPropertyValuesHolder(view, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
    }

    private Animator i(e eVar, View view) {
        Map<String, Object> mapB = eVar.b();
        a(view, mapB);
        ArrayList arrayList = new ArrayList();
        float fA = a(mapB, "scaleX", "scale", view.getScaleX());
        float fA2 = a(mapB, "scaleY", "scale", view.getScaleY());
        if (a(mapB, "scaleX") || a(mapB, "scale") || a(mapB, "fromScaleX") || a(mapB, "fromScale")) {
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, a(mapB, "fromScaleX", "fromScale", view.getScaleX()), fA));
        }
        if (a(mapB, "scaleY") || a(mapB, "scale") || a(mapB, "fromScaleY") || a(mapB, "fromScale")) {
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, a(mapB, "fromScaleY", "fromScale", view.getScaleY()), fA2));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return ObjectAnimator.ofPropertyValuesHolder(view, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
    }

    private Animator j(e eVar, View view) {
        Map<String, Object> mapB = eVar.b();
        ArrayList arrayList = new ArrayList();
        if (a(mapB, "x") || a(mapB, "fromX")) {
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, a(mapB, "fromX") ? a(view, mapB, "fromX", true) : view.getTranslationX(), a(view, mapB, "x", true)));
        }
        if (a(mapB, "y") || a(mapB, "fromY")) {
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, a(mapB, "fromY") ? a(view, mapB, "fromY", false) : view.getTranslationY(), a(view, mapB, "y", false)));
        }
        if (a(mapB, "z") || a(mapB, "fromZ")) {
            arrayList.add(PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Z, a(mapB, "fromZ") ? a(mapB.get("fromZ"), view.getTranslationZ()) : view.getTranslationZ(), a(mapB.get("z"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return ObjectAnimator.ofPropertyValuesHolder(view, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
    }

    public Animator a(g gVar, View view) {
        if (gVar == null || view == null || gVar.b() == null || gVar.b().isEmpty()) {
            return null;
        }
        return b(gVar.b().get(0), view);
    }

    private Animator b(e eVar, View view) {
        if (eVar != null && view != null && !TextUtils.isEmpty(eVar.c())) {
            String strC = eVar.c();
            View viewB = b(view, eVar.b());
            if ("animation".equals(strC)) {
                Animator animatorA = a(eVar, viewB);
                a(animatorA, eVar.b());
                return animatorA;
            }
            if ("parallel".equals(strC)) {
                Animator animatorC = c(eVar, viewB);
                a(animatorC, eVar.b());
                return animatorC;
            }
            if ("sequence".equals(strC)) {
                Animator animatorD = d(eVar, viewB);
                a(animatorD, eVar.b());
                return animatorD;
            }
            if ("stagger".equals(strC)) {
                Animator animatorE = e(eVar, viewB);
                a(animatorE, eVar.b());
                return animatorE;
            }
            if ("translate".equals(strC)) {
                Animator animatorJ = j(eVar, viewB);
                a(animatorJ, eVar.b());
                return animatorJ;
            }
            if ("scale".equals(strC)) {
                Animator animatorI = i(eVar, viewB);
                a(animatorI, eVar.b());
                return animatorI;
            }
            if ("rotate".equals(strC)) {
                Animator animatorH = h(eVar, viewB);
                a(animatorH, eVar.b());
                return animatorH;
            }
            if ("alpha".equals(strC)) {
                Animator animatorF = f(eVar, viewB);
                a(animatorF, eVar.b());
                return animatorF;
            }
            if ("color".equals(strC)) {
                Animator animatorG = g(eVar, viewB);
                a(animatorG, eVar.b());
                return animatorG;
            }
        }
        return null;
    }

    private Animator c(e eVar, View view) {
        List<Animator> listA = a(eVar.a(), view);
        if (listA.isEmpty()) {
            return a(eVar.b());
        }
        if (listA.size() == 1) {
            return listA.get(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(listA);
        return animatorSet;
    }

    private Animator d(e eVar, View view) {
        List<Animator> listA = a(eVar.a(), view);
        if (listA.isEmpty()) {
            return a(eVar.b());
        }
        ArrayList arrayList = new ArrayList();
        long jA = a(eVar.b().get("gap"), 0L);
        for (int i10 = 0; i10 < listA.size(); i10++) {
            arrayList.add(listA.get(i10));
            if (jA > 0 && i10 < listA.size() - 1) {
                arrayList.add(a(jA));
            }
        }
        if (arrayList.size() == 1) {
            return (Animator) arrayList.get(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(arrayList);
        return animatorSet;
    }

    private Animator e(e eVar, View view) {
        List<Animator> listA = a(eVar.a(), view);
        if (listA.isEmpty()) {
            return a(eVar.b());
        }
        if ("BACKWARD".equalsIgnoreCase(d(eVar.b().get("direction")))) {
            Collections.reverse(listA);
        }
        long jA = a(eVar.b().get("stagger"), 0L);
        for (int i10 = 0; i10 < listA.size(); i10++) {
            Animator animator = listA.get(i10);
            animator.setStartDelay((((long) i10) * jA) + animator.getStartDelay());
        }
        if (listA.size() == 1) {
            return listA.get(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(listA);
        return animatorSet;
    }

    private Animator a(e eVar, View view) {
        List<Animator> listA = a(eVar.a(), view);
        if (listA.isEmpty()) {
            return a(eVar.b());
        }
        if (listA.size() == 1) {
            return listA.get(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(listA);
        return animatorSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View f(View view, String str) {
        View viewFindViewWithTag;
        View viewResolveAnimationTarget;
        if ((view instanceof h) && (viewResolveAnimationTarget = ((h) view).resolveAnimationTarget(str)) != null) {
            return viewResolveAnimationTarget;
        }
        View viewE = e(view, str);
        if (viewE != null) {
            return viewE;
        }
        if ((view instanceof ViewGroup) && (viewFindViewWithTag = ((ViewGroup) view).findViewWithTag(str)) != null) {
            return viewFindViewWithTag;
        }
        View rootView = view.getRootView();
        if (rootView == null || rootView == view) {
            return null;
        }
        return rootView.findViewWithTag(str);
    }

    private Animator c(View view, String str) {
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        int iA = a(str, textView.getCurrentTextColor());
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(iA));
        valueAnimatorOfObject.addUpdateListener(new j(textView, 1));
        return valueAnimatorOfObject;
    }

    private List<Animator> a(List<e> list, View view) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<e> it = list.iterator();
            while (it.hasNext()) {
                Animator animatorB = b(it.next(), view);
                if (animatorB != null) {
                    arrayList.add(animatorB);
                }
            }
        }
        return arrayList;
    }

    private Animator a(View view, String str) {
        int iA = a(str, 0);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(view.getBackground() instanceof ColorDrawable ? ((ColorDrawable) view.getBackground()).getColor() : iA), Integer.valueOf(iA));
        valueAnimatorOfObject.addUpdateListener(new j(view, 3));
        return valueAnimatorOfObject;
    }

    private int c(Map<String, Object> map) {
        if (map == null) {
            return 0;
        }
        if (b(map.get("infinite"))) {
            return -1;
        }
        return a(map.get("count"), 0);
    }

    private Animator d(View view, String str) {
        if (!(view instanceof ImageView)) {
            return null;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), 0, Integer.valueOf(a(str, 0)));
        valueAnimatorOfObject.addUpdateListener(new j((ImageView) view, 2));
        return valueAnimatorOfObject;
    }

    private View e(View view, String str) {
        if (view != null && !TextUtils.isEmpty(str)) {
            String name = view.getClass().getName();
            if (!name.endsWith("BaitClickView") && !name.endsWith("MBridgeBaitClickView")) {
                return null;
            }
            String strA = a(str);
            if (TextUtils.isEmpty(strA)) {
                return null;
            }
            try {
                Field fieldA = a(view.getClass(), strA);
                if (fieldA == null) {
                    return null;
                }
                fieldA.setAccessible(true);
                Object obj = fieldA.get(view);
                if (obj instanceof View) {
                    return (View) obj;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private int c(Object obj) {
        return "REVERSE".equalsIgnoreCase(d(obj)) ? 2 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(View view, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            view.setBackgroundColor(((Integer) animatedValue).intValue());
        }
    }

    private String d(Object obj) {
        return obj == null ? "" : String.valueOf(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(TextView textView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            textView.setTextColor(((Integer) animatedValue).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(ImageView imageView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            imageView.setColorFilter(((Integer) animatedValue).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(GradientDrawable gradientDrawable, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            gradientDrawable.setStroke(1, ((Integer) animatedValue).intValue());
        }
    }

    private Animator a(Map<String, Object> map) {
        Map<String, Object> mapA = a(map.get(IronSourceConstants.EVENTS_DURATION));
        long jB = mapA != null ? b(mapA, IronSourceConstants.EVENTS_DURATION) : 0L;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimatorOfFloat.setDuration(jB);
        return valueAnimatorOfFloat;
    }

    private Animator b(View view, String str) {
        Drawable background = view.getBackground();
        if (!(background instanceof GradientDrawable)) {
            return null;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) background.mutate();
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), 0, Integer.valueOf(a(str, 0)));
        valueAnimatorOfObject.addUpdateListener(new j(gradientDrawable, 0));
        return valueAnimatorOfObject;
    }

    private Animator a(long j10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimatorOfFloat.setDuration(j10);
        return valueAnimatorOfFloat;
    }

    private String a(String str) {
        String lowerCase = d(str).trim().toLowerCase();
        if (!"hand".equals(lowerCase) && !"finger".equals(lowerCase) && !"baithand".equals(lowerCase)) {
            if (!"ripple".equals(lowerCase) && !"circle".equals(lowerCase) && !"baitripple".equals(lowerCase)) {
                if (!"text".equals(lowerCase) && !"label".equals(lowerCase) && !"baittext".equals(lowerCase)) {
                    return "";
                }
                return "mClickTextView";
            }
            return "mCircleImageView";
        }
        return "mHandImageView";
    }

    private View b(View view, Map<String, Object> map) {
        View viewF;
        if (view != null && a(map, "target")) {
            Object obj = map.get("target");
            if (obj instanceof View) {
                return (View) obj;
            }
            String strTrim = d(obj).trim();
            if (!TextUtils.isEmpty(strTrim) && !strTrim.equals(String.valueOf(view.getTag())) && (viewF = f(view, strTrim)) != null) {
                return viewF;
            }
        }
        return view;
    }

    private Field a(Class<?> cls, String str) {
        while (cls != null) {
            try {
                return cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    private void b(Animator animator, Map<String, Object> map) {
        if (animator == null || map == null) {
            return;
        }
        int iC = c(map);
        int iC2 = c(map.get(X3.a.f27684t));
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(iC);
            valueAnimator.setRepeatMode(iC2);
        } else {
            if (iC == 0) {
                return;
            }
            a(animator, iC);
        }
    }

    private void a(Animator animator, Map<String, Object> map) {
        TimeInterpolator timeInterpolatorB;
        if (animator == null || map == null) {
            return;
        }
        Map<String, Object> mapA = a(map.get(IronSourceConstants.EVENTS_DURATION));
        if (mapA != null) {
            animator.setDuration(b(mapA, IronSourceConstants.EVENTS_DURATION));
        }
        Map<String, Object> mapA2 = a(map.get("delay"));
        if (mapA2 != null) {
            animator.setStartDelay(b(mapA2, "delay"));
        }
        Map<String, Object> mapA3 = a(map.get("interpolator"));
        if (mapA3 != null && (timeInterpolatorB = b(mapA3)) != null) {
            animator.setInterpolator(timeInterpolatorB);
        }
        Map<String, Object> mapA4 = a(map.get("repeat"));
        if (mapA4 != null) {
            b(animator, mapA4);
        }
    }

    private TimeInterpolator b(Map<String, Object> map) {
        String strD = d(map.get("type"));
        if (TextUtils.isEmpty(strD)) {
            strD = d(map.get("interpolatorType"));
        }
        if (TextUtils.isEmpty(strD)) {
            return null;
        }
        if (!"Linear".equalsIgnoreCase(strD) && !"LinearInterpolator".equalsIgnoreCase(strD)) {
            if (!"AccelerateInterpolator".equalsIgnoreCase(strD) && !"easeIn".equalsIgnoreCase(strD)) {
                if (!"DecelerateInterpolator".equalsIgnoreCase(strD) && !"easeOut".equalsIgnoreCase(strD)) {
                    if (!"BounceInterpolator".equalsIgnoreCase(strD) && !"bounce".equalsIgnoreCase(strD)) {
                        if ("OvershootInterpolator".equalsIgnoreCase(strD)) {
                            Map<String, Object> mapA = a(map.get("parameters"));
                            float fA = 2.0f;
                            if (mapA != null && mapA.containsKey("tension")) {
                                fA = a(mapA.get("tension"), 2.0f);
                            }
                            return new OvershootInterpolator(fA);
                        }
                        return new AccelerateDecelerateInterpolator();
                    }
                    return new BounceInterpolator();
                }
                return new DecelerateInterpolator();
            }
            return new AccelerateInterpolator();
        }
        return new LinearInterpolator();
    }

    private void a(Animator animator, int i10) {
        animator.addListener(new a(i10, new int[]{i10}));
    }

    private void a(View view, Map<String, Object> map) {
        if (view == null || map == null) {
            return;
        }
        if (a(map, "pivotX")) {
            view.setPivotX(a(view.getWidth(), map.get("pivotX")));
        }
        if (a(map, "pivotY")) {
            view.setPivotY(a(view.getHeight(), map.get("pivotY")));
        }
    }

    private float a(int i10, Object obj) {
        float fA = a(obj, 0.5f);
        return (fA < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fA > 1.0f || i10 <= 0) ? fA : fA * i10;
    }

    private float a(Map<String, Object> map, String str, String str2, float f10) {
        if (a(map, str)) {
            return a(map.get(str), f10);
        }
        return a(map, str2) ? a(map.get(str2), f10) : f10;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    private float a(View view, Map<String, Object> map, String str, boolean z10) {
        View viewA;
        int height;
        float fA = a(map.get(str), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        String strD = d(map.get("relativeTo"));
        if (TextUtils.isEmpty(strD)) {
            strD = "ABSOLUTE";
        }
        if ("RELATIVE_TO_SELF".equalsIgnoreCase(strD)) {
            height = z10 ? view.getWidth() : view.getHeight();
        } else if ("RELATIVE_TO_PARENT".equalsIgnoreCase(strD)) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                height = z10 ? view2.getWidth() : view2.getHeight();
            } else {
                if (("RELATIVE_TO_REFERENCE".equalsIgnoreCase(strD) && !"REFERENCE_VIEW".equalsIgnoreCase(strD)) || (viewA = a(view, map.get("referenceView"))) == null) {
                    return fA;
                }
                if (z10) {
                    height = viewA.getWidth();
                } else {
                    height = viewA.getHeight();
                }
            }
        } else {
            if ("RELATIVE_TO_REFERENCE".equalsIgnoreCase(strD)) {
            }
            if (z10) {
                height = viewA.getWidth();
            } else {
                height = viewA.getHeight();
            }
        }
        return fA * height;
    }

    private long b(Map<String, Object> map, String str) {
        long jA = a(map.get(str), 0L);
        return "SECONDS".equalsIgnoreCase(d(map.get("timeUnit"))) ? jA * 1000 : jA;
    }

    private boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        String strD = d(obj);
        return "1".equals(strD) || com.ironsource.mediationsdk.metadata.a.f29610g.equalsIgnoreCase(strD) || "yes".equalsIgnoreCase(strD);
    }

    private View a(View view, Object obj) {
        View rootView;
        if (obj instanceof View) {
            return (View) obj;
        }
        if (!(obj instanceof String) || TextUtils.isEmpty((String) obj) || (rootView = view.getRootView()) == null) {
            return null;
        }
        return rootView.findViewWithTag(obj);
    }

    private Map<String, Object> a(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    private boolean a(Map<String, Object> map, String str) {
        return (map == null || !map.containsKey(str) || map.get(str) == null) ? false : true;
    }

    private float a(Object obj, float f10) {
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        try {
            return Float.parseFloat(String.valueOf(obj));
        } catch (Exception unused) {
            return f10;
        }
    }

    private int a(Object obj, int i10) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        try {
            return Integer.parseInt(String.valueOf(obj));
        } catch (Exception unused) {
            return i10;
        }
    }

    private long a(Object obj, long j10) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        try {
            return Long.parseLong(String.valueOf(obj));
        } catch (Exception unused) {
            return j10;
        }
    }

    private int a(String str, int i10) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i10;
        }
    }
}

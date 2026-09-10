package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class sensatory {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public marial f9417attabal;

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    public static class dern extends marial {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final Interpolator f9420beachfront = new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public static final Interpolator f9421competently = new fastrack.attabal();

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public static final Interpolator f9422impromptu = new DecelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public static final Interpolator f9423taiyuan = new AccelerateInterpolator(1.5f);

        /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
        public static class attabal implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final saneness f9424attabal;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public hardpan f9425saneness;

            /* JADX INFO: renamed from: androidx.core.view.sensatory$dern$attabal$attabal, reason: collision with other inner class name */
            /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
            public class C0062attabal implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: attabal, reason: collision with root package name */
                public final /* synthetic */ sensatory f9426attabal;

                /* JADX INFO: renamed from: dern, reason: collision with root package name */
                public final /* synthetic */ hardpan f9428dern;

                /* JADX INFO: renamed from: marial, reason: collision with root package name */
                public final /* synthetic */ View f9429marial;

                /* JADX INFO: renamed from: saneness, reason: collision with root package name */
                public final /* synthetic */ hardpan f9430saneness;

                /* JADX INFO: renamed from: wireman, reason: collision with root package name */
                public final /* synthetic */ int f9431wireman;

                public C0062attabal(sensatory sensatoryVar, hardpan hardpanVar, hardpan hardpanVar2, int i, View view) {
                    this.f9426attabal = sensatoryVar;
                    this.f9430saneness = hardpanVar;
                    this.f9428dern = hardpanVar2;
                    this.f9431wireman = i;
                    this.f9429marial = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f9426attabal.beachfront(valueAnimator.getAnimatedFraction());
                    dern.formularize(this.f9429marial, dern.arytenoidectomy(this.f9430saneness, this.f9428dern, this.f9426attabal.dern(), this.f9431wireman), Collections.singletonList(this.f9426attabal));
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.sensatory$dern$attabal$dern, reason: collision with other inner class name */
            /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
            public class RunnableC0063dern implements Runnable {

                /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
                public final /* synthetic */ sensatory f9432arytenoidectomy;

                /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
                public final /* synthetic */ View f9433kowloon;

                /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
                public final /* synthetic */ attabal f9435monoploid;

                /* JADX INFO: renamed from: polloi, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f9436polloi;

                public RunnableC0063dern(View view, sensatory sensatoryVar, attabal attabalVar, ValueAnimator valueAnimator) {
                    this.f9433kowloon = view;
                    this.f9432arytenoidectomy = sensatoryVar;
                    this.f9435monoploid = attabalVar;
                    this.f9436polloi = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    dern.impassible(this.f9433kowloon, this.f9432arytenoidectomy, this.f9435monoploid);
                    this.f9436polloi.start();
                }
            }

            /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
            public class saneness extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: attabal, reason: collision with root package name */
                public final /* synthetic */ sensatory f9437attabal;

                /* JADX INFO: renamed from: saneness, reason: collision with root package name */
                public final /* synthetic */ View f9439saneness;

                public saneness(sensatory sensatoryVar, View view) {
                    this.f9437attabal = sensatoryVar;
                    this.f9439saneness = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f9437attabal.beachfront(1.0f);
                    dern.cutely(this.f9439saneness, this.f9437attabal);
                }
            }

            public attabal(View view, saneness sanenessVar) {
                this.f9424attabal = sanenessVar;
                hardpan hardpanVarKattegat = premeiotic.kattegat(view);
                this.f9425saneness = hardpanVarKattegat != null ? new hardpan.attabal(hardpanVarKattegat).attabal() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f9425saneness = hardpan.cord(windowInsets, view);
                    return dern.triweekly(view, windowInsets);
                }
                hardpan hardpanVarCord = hardpan.cord(windowInsets, view);
                if (this.f9425saneness == null) {
                    this.f9425saneness = premeiotic.kattegat(view);
                }
                if (this.f9425saneness == null) {
                    this.f9425saneness = hardpanVarCord;
                    return dern.triweekly(view, windowInsets);
                }
                saneness sanenessVarKowloon = dern.kowloon(view);
                if (sanenessVarKowloon != null && Objects.equals(sanenessVarKowloon.f9445attabal, hardpanVarCord)) {
                    return dern.triweekly(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                dern.beachfront(hardpanVarCord, this.f9425saneness, iArr, iArr2);
                int i = iArr[0];
                int i2 = iArr2[0];
                int i3 = i | i2;
                if (i3 == 0) {
                    this.f9425saneness = hardpanVarCord;
                    return dern.triweekly(view, windowInsets);
                }
                hardpan hardpanVar = this.f9425saneness;
                sensatory sensatoryVar = new sensatory(i3, dern.impromptu(i, i2), (hardpan.triweekly.saneness() & i3) != 0 ? 160L : 250L);
                sensatoryVar.beachfront(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ValueAnimator duration = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(sensatoryVar.saneness());
                attabal attabalVarCompetently = dern.competently(hardpanVarCord, hardpanVar, i3);
                dern.apical(view, sensatoryVar, hardpanVarCord, false);
                duration.addUpdateListener(new C0062attabal(sensatoryVar, hardpanVarCord, hardpanVar, i3, view));
                duration.addListener(new saneness(sensatoryVar, view));
                polder.attabal(view, new RunnableC0063dern(view, sensatoryVar, attabalVarCompetently, duration));
                this.f9425saneness = hardpanVarCord;
                return dern.triweekly(view, windowInsets);
            }
        }

        public dern(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        public static void apical(View view, sensatory sensatoryVar, hardpan hardpanVar, boolean z) {
            saneness sanenessVarKowloon = kowloon(view);
            if (sanenessVarKowloon != null) {
                sanenessVarKowloon.f9445attabal = hardpanVar;
                if (!z) {
                    sanenessVarKowloon.dern(sensatoryVar);
                    z = sanenessVarKowloon.attabal() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    apical(viewGroup.getChildAt(i), sensatoryVar, hardpanVar, z);
                }
            }
        }

        public static hardpan arytenoidectomy(hardpan hardpanVar, hardpan hardpanVar2, float f, int i) {
            hardpan.attabal attabalVar = new hardpan.attabal(hardpanVar);
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) == 0) {
                    attabalVar.saneness(i2, hardpanVar.beachfront(i2));
                } else {
                    monroe.wireman wiremanVarBeachfront = hardpanVar.beachfront(i2);
                    monroe.wireman wiremanVarBeachfront2 = hardpanVar2.beachfront(i2);
                    float f2 = 1.0f - f;
                    attabalVar.saneness(i2, hardpan.arytenoidectomy(wiremanVarBeachfront, (int) (((double) ((wiremanVarBeachfront.f33604attabal - wiremanVarBeachfront2.f33604attabal) * f2)) + 0.5d), (int) (((double) ((wiremanVarBeachfront.f33606saneness - wiremanVarBeachfront2.f33606saneness) * f2)) + 0.5d), (int) (((double) ((wiremanVarBeachfront.f33605dern - wiremanVarBeachfront2.f33605dern) * f2)) + 0.5d), (int) (((double) ((wiremanVarBeachfront.f33607wireman - wiremanVarBeachfront2.f33607wireman) * f2)) + 0.5d)));
                }
            }
            return attabalVar.attabal();
        }

        public static void beachfront(hardpan hardpanVar, hardpan hardpanVar2, int[] iArr, int[] iArr2) {
            for (int i = 1; i <= 512; i <<= 1) {
                monroe.wireman wiremanVarBeachfront = hardpanVar.beachfront(i);
                monroe.wireman wiremanVarBeachfront2 = hardpanVar2.beachfront(i);
                int i2 = wiremanVarBeachfront.f33604attabal;
                int i3 = wiremanVarBeachfront2.f33604attabal;
                boolean z = i2 > i3 || wiremanVarBeachfront.f33606saneness > wiremanVarBeachfront2.f33606saneness || wiremanVarBeachfront.f33605dern > wiremanVarBeachfront2.f33605dern || wiremanVarBeachfront.f33607wireman > wiremanVarBeachfront2.f33607wireman;
                if (z != (i2 < i3 || wiremanVarBeachfront.f33606saneness < wiremanVarBeachfront2.f33606saneness || wiremanVarBeachfront.f33605dern < wiremanVarBeachfront2.f33605dern || wiremanVarBeachfront.f33607wireman < wiremanVarBeachfront2.f33607wireman)) {
                    if (z) {
                        iArr[0] = iArr[0] | i;
                    } else {
                        iArr2[0] = iArr2[0] | i;
                    }
                }
            }
        }

        public static attabal competently(hardpan hardpanVar, hardpan hardpanVar2, int i) {
            monroe.wireman wiremanVarBeachfront = hardpanVar.beachfront(i);
            monroe.wireman wiremanVarBeachfront2 = hardpanVar2.beachfront(i);
            return new attabal(monroe.wireman.dern(Math.min(wiremanVarBeachfront.f33604attabal, wiremanVarBeachfront2.f33604attabal), Math.min(wiremanVarBeachfront.f33606saneness, wiremanVarBeachfront2.f33606saneness), Math.min(wiremanVarBeachfront.f33605dern, wiremanVarBeachfront2.f33605dern), Math.min(wiremanVarBeachfront.f33607wireman, wiremanVarBeachfront2.f33607wireman)), monroe.wireman.dern(Math.max(wiremanVarBeachfront.f33604attabal, wiremanVarBeachfront2.f33604attabal), Math.max(wiremanVarBeachfront.f33606saneness, wiremanVarBeachfront2.f33606saneness), Math.max(wiremanVarBeachfront.f33605dern, wiremanVarBeachfront2.f33605dern), Math.max(wiremanVarBeachfront.f33607wireman, wiremanVarBeachfront2.f33607wireman)));
        }

        public static void cutely(View view, sensatory sensatoryVar) {
            saneness sanenessVarKowloon = kowloon(view);
            if (sanenessVarKowloon != null) {
                sanenessVarKowloon.saneness(sensatoryVar);
                if (sanenessVarKowloon.attabal() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    cutely(viewGroup.getChildAt(i), sensatoryVar);
                }
            }
        }

        public static void formularize(View view, hardpan hardpanVar, List<sensatory> list) {
            saneness sanenessVarKowloon = kowloon(view);
            if (sanenessVarKowloon != null) {
                hardpanVar = sanenessVarKowloon.wireman(hardpanVar, list);
                if (sanenessVarKowloon.attabal() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    formularize(viewGroup.getChildAt(i), hardpanVar, list);
                }
            }
        }

        public static void impassible(View view, sensatory sensatoryVar, attabal attabalVar) {
            saneness sanenessVarKowloon = kowloon(view);
            if (sanenessVarKowloon != null) {
                sanenessVarKowloon.marial(sensatoryVar, attabalVar);
                if (sanenessVarKowloon.attabal() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    impassible(viewGroup.getChildAt(i), sensatoryVar, attabalVar);
                }
            }
        }

        public static Interpolator impromptu(int i, int i2) {
            if ((hardpan.triweekly.saneness() & i) != 0) {
                return f9420beachfront;
            }
            if ((hardpan.triweekly.saneness() & i2) != 0) {
                return f9421competently;
            }
            if ((i & hardpan.triweekly.competently()) != 0) {
                return f9422impromptu;
            }
            if ((hardpan.triweekly.competently() & i2) != 0) {
                return f9423taiyuan;
            }
            return null;
        }

        public static saneness kowloon(View view) {
            Object tag = view.getTag(wostteth.marial.tag_window_insets_animation_callback);
            if (tag instanceof attabal) {
                return ((attabal) tag).f9424attabal;
            }
            return null;
        }

        public static void monoploid(View view, saneness sanenessVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerTaiyuan = sanenessVar != null ? taiyuan(view, sanenessVar) : null;
            view.setTag(wostteth.marial.tag_window_insets_animation_callback, onApplyWindowInsetsListenerTaiyuan);
            if (view.getTag(wostteth.marial.tag_compat_insets_dispatch) == null && view.getTag(wostteth.marial.tag_on_apply_window_listener) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerTaiyuan);
            }
        }

        public static View.OnApplyWindowInsetsListener taiyuan(View view, saneness sanenessVar) {
            return new attabal(view, sanenessVar);
        }

        public static WindowInsets triweekly(View view, WindowInsets windowInsets) {
            return view.getTag(wostteth.marial.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    public static class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f9440attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Interpolator f9441dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public float f9442marial = 1.0f;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float f9443saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final long f9444wireman;

        public marial(int i, Interpolator interpolator, long j) {
            this.f9440attabal = i;
            this.f9441dern = interpolator;
            this.f9444wireman = j;
        }

        public float attabal() {
            return this.f9442marial;
        }

        public float dern() {
            Interpolator interpolator = this.f9441dern;
            return interpolator != null ? interpolator.getInterpolation(this.f9443saneness) : this.f9443saneness;
        }

        public void marial(float f) {
            this.f9443saneness = f;
        }

        public long saneness() {
            return this.f9444wireman;
        }

        public int wireman() {
            return this.f9440attabal;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    public static abstract class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public hardpan f9445attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f9446saneness;

        public saneness(int i) {
            this.f9446saneness = i;
        }

        public final int attabal() {
            return this.f9446saneness;
        }

        public abstract void dern(sensatory sensatoryVar);

        public abstract attabal marial(sensatory sensatoryVar, attabal attabalVar);

        public abstract void saneness(sensatory sensatoryVar);

        public abstract hardpan wireman(hardpan hardpanVar, List<sensatory> list);
    }

    public sensatory(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f9417attabal = new wireman(i, interpolator, j);
        } else {
            this.f9417attabal = new dern(i, interpolator, j);
        }
    }

    public static sensatory competently(WindowInsetsAnimation windowInsetsAnimation) {
        return new sensatory(windowInsetsAnimation);
    }

    public static void marial(View view, saneness sanenessVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            wireman.taiyuan(view, sanenessVar);
        } else {
            dern.monoploid(view, sanenessVar);
        }
    }

    public float attabal() {
        return this.f9417attabal.attabal();
    }

    public void beachfront(float f) {
        this.f9417attabal.marial(f);
    }

    public float dern() {
        return this.f9417attabal.dern();
    }

    public long saneness() {
        return this.f9417attabal.saneness();
    }

    public int wireman() {
        return this.f9417attabal.wireman();
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    public static class wireman extends marial {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final WindowInsetsAnimation f9447beachfront;

        /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
        public static class attabal extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final saneness f9448attabal;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public ArrayList<sensatory> f9449dern;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public List<sensatory> f9450saneness;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, sensatory> f9451wireman;

            public attabal(saneness sanenessVar) {
                super(sanenessVar.attabal());
                this.f9451wireman = new HashMap<>();
                this.f9448attabal = sanenessVar;
            }

            public final sensatory attabal(WindowInsetsAnimation windowInsetsAnimation) {
                sensatory sensatoryVar = this.f9451wireman.get(windowInsetsAnimation);
                if (sensatoryVar != null) {
                    return sensatoryVar;
                }
                sensatory sensatoryVarCompetently = sensatory.competently(windowInsetsAnimation);
                this.f9451wireman.put(windowInsetsAnimation, sensatoryVarCompetently);
                return sensatoryVarCompetently;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f9448attabal.saneness(attabal(windowInsetsAnimation));
                this.f9451wireman.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f9448attabal.dern(attabal(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<sensatory> arrayList = this.f9449dern;
                if (arrayList == null) {
                    ArrayList<sensatory> arrayList2 = new ArrayList<>(list.size());
                    this.f9449dern = arrayList2;
                    this.f9450saneness = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationAttabal = unconsolidated.attabal(list.get(size));
                    sensatory sensatoryVarAttabal = attabal(windowInsetsAnimationAttabal);
                    sensatoryVarAttabal.beachfront(windowInsetsAnimationAttabal.getFraction());
                    this.f9449dern.add(sensatoryVarAttabal);
                }
                return this.f9448attabal.wireman(hardpan.preprohormone(windowInsets), this.f9450saneness).rotuma();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f9448attabal.marial(attabal(windowInsetsAnimation), attabal.wireman(bounds)).dern();
            }
        }

        public wireman(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f9447beachfront = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds beachfront(attabal attabalVar) {
            monroe.attabal();
            return lightstruck.attabal(attabalVar.attabal().beachfront(), attabalVar.saneness().beachfront());
        }

        public static monroe.wireman competently(WindowInsetsAnimation.Bounds bounds) {
            return monroe.wireman.marial(bounds.getUpperBound());
        }

        public static monroe.wireman impromptu(WindowInsetsAnimation.Bounds bounds) {
            return monroe.wireman.marial(bounds.getLowerBound());
        }

        public static void taiyuan(View view, saneness sanenessVar) {
            view.setWindowInsetsAnimationCallback(sanenessVar != null ? new attabal(sanenessVar) : null);
        }

        @Override // androidx.core.view.sensatory.marial
        public float attabal() {
            return this.f9447beachfront.getAlpha();
        }

        @Override // androidx.core.view.sensatory.marial
        public float dern() {
            return this.f9447beachfront.getInterpolatedFraction();
        }

        @Override // androidx.core.view.sensatory.marial
        public void marial(float f) {
            this.f9447beachfront.setFraction(f);
        }

        @Override // androidx.core.view.sensatory.marial
        public long saneness() {
            return this.f9447beachfront.getDurationMillis();
        }

        @Override // androidx.core.view.sensatory.marial
        public int wireman() {
            return this.f9447beachfront.getTypeMask();
        }

        public wireman(int i, Interpolator interpolator, long j) {
            this(palmyra.attabal(i, interpolator, j));
        }
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final monroe.wireman f9418attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final monroe.wireman f9419saneness;

        public attabal(monroe.wireman wiremanVar, monroe.wireman wiremanVar2) {
            this.f9418attabal = wiremanVar;
            this.f9419saneness = wiremanVar2;
        }

        public static attabal wireman(WindowInsetsAnimation.Bounds bounds) {
            return new attabal(bounds);
        }

        public monroe.wireman attabal() {
            return this.f9418attabal;
        }

        public WindowInsetsAnimation.Bounds dern() {
            return wireman.beachfront(this);
        }

        public monroe.wireman saneness() {
            return this.f9419saneness;
        }

        public String toString() {
            return "Bounds{lower=" + this.f9418attabal + " upper=" + this.f9419saneness + "}";
        }

        public attabal(WindowInsetsAnimation.Bounds bounds) {
            this.f9418attabal = wireman.impromptu(bounds);
            this.f9419saneness = wireman.competently(bounds);
        }
    }

    public sensatory(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f9417attabal = new wireman(windowInsetsAnimation);
        }
    }
}

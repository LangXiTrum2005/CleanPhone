package androidx.fragment.app;

import A.U;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import com.charging.screenshow.battery.animations.themes.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "AnimationInfo", "SpecialEffectsInfo", "TransitionInfo", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnimationInfo extends SpecialEffectsInfo {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f5079c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public FragmentAnim.AnimationOrAnimator f5080e;

        public AnimationInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal, boolean z2) {
            super(operation, cancellationSignal);
            this.f5079c = z2;
        }

        /* JADX WARN: Code duplicated, block: B:74:0x00f5 A[Catch: RuntimeException -> 0x00fb, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00fb, blocks: (B:72:0x00ef, B:74:0x00f5), top: B:85:0x00ef }] */
        public final FragmentAnim.AnimationOrAnimator c(Context context) {
            int enterAnim;
            FragmentAnim.AnimationOrAnimator animationOrAnimator;
            Animator animatorLoadAnimator;
            int iA;
            if (this.d) {
                return this.f5080e;
            }
            SpecialEffectsController.Operation operation = this.f5081a;
            boolean z2 = operation.f5191a == SpecialEffectsController.Operation.State.f5196Y;
            Fragment fragment = operation.f5193c;
            int nextTransition = fragment.getNextTransition();
            if (this.f5079c) {
                enterAnim = z2 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
            } else {
                enterAnim = z2 ? fragment.getEnterAnim() : fragment.getExitAnim();
            }
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            FragmentAnim.AnimationOrAnimator animationOrAnimator2 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z2, enterAnim);
                if (animationOnCreateAnimation != null) {
                    animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z2, enterAnim);
                    if (animatorOnCreateAnimator != null) {
                        animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(animatorOnCreateAnimator);
                    } else {
                        if (enterAnim == 0 && nextTransition != 0) {
                            if (nextTransition == 4097) {
                                iA = z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                            } else if (nextTransition == 8194) {
                                iA = z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                            } else if (nextTransition == 8197) {
                                iA = z2 ? FragmentAnim.a(context, android.R.attr.activityCloseEnterAnimation) : FragmentAnim.a(context, android.R.attr.activityCloseExitAnimation);
                            } else if (nextTransition == 4099) {
                                iA = z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                            } else if (nextTransition != 4100) {
                                iA = -1;
                            } else {
                                iA = z2 ? FragmentAnim.a(context, android.R.attr.activityOpenEnterAnimation) : FragmentAnim.a(context, android.R.attr.activityOpenExitAnimation);
                            }
                            enterAnim = iA;
                        }
                        if (enterAnim != 0) {
                            boolean zEquals = com.smartdigimkt.v0.k.g.equals(context.getResources().getResourceTypeName(enterAnim));
                            if (zEquals) {
                                try {
                                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation != null) {
                                        animationOrAnimator = new FragmentAnim.AnimationOrAnimator(animationLoadAnimation);
                                        animationOrAnimator2 = animationOrAnimator;
                                    }
                                } catch (Resources.NotFoundException e2) {
                                    throw e2;
                                } catch (RuntimeException unused) {
                                    try {
                                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                        if (animatorLoadAnimator != null) {
                                            animationOrAnimator = new FragmentAnim.AnimationOrAnimator(animatorLoadAnimator);
                                            animationOrAnimator2 = animationOrAnimator;
                                        }
                                    } catch (RuntimeException e3) {
                                        if (zEquals) {
                                            throw e3;
                                        }
                                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                        if (animationLoadAnimation2 != null) {
                                            animationOrAnimator2 = new FragmentAnim.AnimationOrAnimator(animationLoadAnimation2);
                                        }
                                    }
                                }
                            } else {
                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                if (animatorLoadAnimator != null) {
                                    animationOrAnimator = new FragmentAnim.AnimationOrAnimator(animatorLoadAnimator);
                                    animationOrAnimator2 = animationOrAnimator;
                                }
                            }
                        }
                    }
                }
            }
            this.f5080e = animationOrAnimator2;
            this.d = true;
            return animationOrAnimator2;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class SpecialEffectsInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SpecialEffectsController.Operation f5081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellationSignal f5082b;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal) {
            this.f5081a = operation;
            this.f5082b = cancellationSignal;
        }

        public final void a() {
            SpecialEffectsController.Operation operation = this.f5081a;
            CancellationSignal cancellationSignal = this.f5082b;
            LinkedHashSet linkedHashSet = operation.f5194e;
            if (linkedHashSet.remove(cancellationSignal) && linkedHashSet.isEmpty()) {
                operation.b();
            }
        }

        public final boolean b() {
            SpecialEffectsController.Operation operation = this.f5081a;
            View view = operation.f5193c.mView;
            Intrinsics.e(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State stateA = SpecialEffectsController.Operation.State.Companion.a(view);
            SpecialEffectsController.Operation.State state = operation.f5191a;
            if (stateA == state) {
                return true;
            }
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.f5196Y;
            return (stateA == state2 || state == state2) ? false : true;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransitionInfo extends SpecialEffectsInfo {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f5083c;
        public final boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f5084e;

        public TransitionInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal, boolean z2, boolean z3) {
            super(operation, cancellationSignal);
            SpecialEffectsController.Operation.State state = operation.f5191a;
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.f5196Y;
            Fragment fragment = operation.f5193c;
            this.f5083c = state == state2 ? z2 ? fragment.getReenterTransition() : fragment.getEnterTransition() : z2 ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.d = operation.f5191a == state2 ? z2 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.f5084e = z3 ? z2 ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        public final FragmentTransitionImpl c() {
            Object obj = this.f5083c;
            FragmentTransitionImpl fragmentTransitionImplD = d(obj);
            Object obj2 = this.f5084e;
            FragmentTransitionImpl fragmentTransitionImplD2 = d(obj2);
            if (fragmentTransitionImplD == null || fragmentTransitionImplD2 == null || fragmentTransitionImplD == fragmentTransitionImplD2) {
                return fragmentTransitionImplD == null ? fragmentTransitionImplD2 : fragmentTransitionImplD;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f5081a.f5193c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final FragmentTransitionImpl d(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.f5171a;
            if (obj instanceof Transition) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.f5172b;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.e(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f5081a.f5193c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public static void i(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (ViewGroupCompat.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                i(childAt, arrayList);
            }
        }
    }

    public static void j(ArrayMap arrayMap, View view) {
        String strO = ViewCompat.o(view);
        if (strO != null) {
            arrayMap.put(strO, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    j(arrayMap, childAt);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:263:0x0813  */
    /* JADX WARN: Code duplicated, block: B:265:0x081f  */
    /* JADX WARN: Code duplicated, block: B:266:0x0823  */
    /* JADX WARN: Code duplicated, block: B:268:0x082c  */
    /* JADX WARN: Code duplicated, block: B:269:0x0830  */
    /* JADX WARN: Code duplicated, block: B:271:0x0834  */
    /* JADX WARN: Code duplicated, block: B:272:0x0838  */
    /* JADX WARN: Code duplicated, block: B:274:0x0848  */
    /* JADX WARN: Code duplicated, block: B:276:0x084e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0869  */
    /* JADX WARN: Code duplicated, block: B:281:0x086d  */
    /* JADX WARN: Code duplicated, block: B:282:0x0870  */
    /* JADX WARN: Code duplicated, block: B:285:0x0875  */
    /* JADX WARN: Code duplicated, block: B:288:0x089b  */
    /* JADX WARN: Code duplicated, block: B:293:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:297:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:302:0x0901  */
    /* JADX WARN: Code duplicated, block: B:306:0x0926  */
    /* JADX WARN: Code duplicated, block: B:308:0x092a  */
    /* JADX WARN: Code duplicated, block: B:310:0x0930  */
    /* JADX WARN: Code duplicated, block: B:311:0x0937  */
    /* JADX WARN: Code duplicated, block: B:313:0x0950  */
    /* JADX WARN: Code duplicated, block: B:322:0x0986 A[LOOP:10: B:320:0x0980->B:322:0x0986, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:325:0x09a4  */
    /* JADX WARN: Code duplicated, block: B:365:0x08f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x08db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x0919 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x08fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x0976 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x0970 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:276:0x084e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:288:0x089b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:297:0x08e1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:302:0x0901, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:313:0x0950, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:325:0x09a4, please report this as an issue */
    @Override // androidx.fragment.app.SpecialEffectsController
    public final void b(ArrayList arrayList, boolean z2) {
        SpecialEffectsController.Operation.State state;
        String str;
        Object next;
        Object objPrevious;
        ArrayList<AnimationInfo> arrayList2;
        String str2;
        ArrayList<SpecialEffectsController.Operation> arrayList3;
        LinkedHashMap linkedHashMap;
        SpecialEffectsController.Operation.State state2;
        String str3;
        SpecialEffectsController.Operation operation;
        boolean z3;
        ArrayList arrayList4;
        SimpleArrayMap simpleArrayMap;
        int i2;
        String str4;
        Object obj;
        SpecialEffectsController.Operation.State state3;
        View view;
        ArrayList arrayList5;
        SpecialEffectsController.Operation.State state4;
        String str5;
        String str6;
        Rect rect;
        View view2;
        int i3;
        boolean zContainsValue;
        Context context;
        ArrayList<AnimationInfo> arrayList6;
        boolean z4;
        boolean z5;
        final SpecialEffectsController.Operation operation2;
        Fragment fragment;
        final View view3;
        FragmentAnim.AnimationOrAnimator animationOrAnimatorC;
        Animation animation;
        FragmentAnim.AnimationOrAnimator animationOrAnimatorC2;
        final Animator animator;
        final SpecialEffectsController.Operation operation3;
        boolean zA;
        Fragment fragment2;
        final boolean z6;
        ArrayList arrayList7;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            state = SpecialEffectsController.Operation.State.f5196Y;
            str = "operation.fragment.mView";
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) next;
            View view4 = operation4.f5193c.mView;
            Intrinsics.e(view4, "operation.fragment.mView");
            if (SpecialEffectsController.Operation.State.Companion.a(view4) == state && operation4.f5191a != state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation5 = (SpecialEffectsController.Operation) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            SpecialEffectsController.Operation operation6 = (SpecialEffectsController.Operation) objPrevious;
            View view5 = operation6.f5193c.mView;
            Intrinsics.e(view5, "operation.fragment.mView");
            if (SpecialEffectsController.Operation.State.Companion.a(view5) != state && operation6.f5191a == state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation7 = (SpecialEffectsController.Operation) objPrevious;
        String str7 = "FragmentManager";
        if (FragmentManager.I(2)) {
            Log.v("FragmentManager", "Executing operations from " + operation5 + " to " + operation7);
        }
        ArrayList arrayList8 = new ArrayList();
        ArrayList<TransitionInfo> arrayList9 = new ArrayList();
        ArrayList arrayListJ0 = CollectionsKt.j0(arrayList);
        Fragment fragment3 = ((SpecialEffectsController.Operation) CollectionsKt.F(arrayList)).f5193c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Fragment.AnimationInfo animationInfo = ((SpecialEffectsController.Operation) it2.next()).f5193c.mAnimationInfo;
            Fragment.AnimationInfo animationInfo2 = fragment3.mAnimationInfo;
            animationInfo.f5095b = animationInfo2.f5095b;
            animationInfo.f5096c = animationInfo2.f5096c;
            animationInfo.d = animationInfo2.d;
            animationInfo.f5097e = animationInfo2.f5097e;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            SpecialEffectsController.Operation operation8 = (SpecialEffectsController.Operation) it3.next();
            CancellationSignal cancellationSignal = new CancellationSignal();
            operation8.d();
            LinkedHashSet linkedHashSet = operation8.f5194e;
            linkedHashSet.add(cancellationSignal);
            arrayList8.add(new AnimationInfo(operation8, cancellationSignal, z2));
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            operation8.d();
            linkedHashSet.add(cancellationSignal2);
            arrayList9.add(new TransitionInfo(operation8, cancellationSignal2, z2, !z2 ? operation8 != operation7 : operation8 != operation5));
            operation8.d.add(new a(arrayListJ0, operation8, this));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList10 = new ArrayList();
        for (Object obj2 : arrayList9) {
            if (!((TransitionInfo) obj2).b()) {
                arrayList10.add(obj2);
            }
        }
        ArrayList<TransitionInfo> arrayList11 = new ArrayList();
        for (Object obj3 : arrayList10) {
            if (((TransitionInfo) obj3).c() != null) {
                arrayList11.add(obj3);
            }
        }
        FragmentTransitionImpl fragmentTransitionImpl = null;
        for (TransitionInfo transitionInfo : arrayList11) {
            FragmentTransitionImpl fragmentTransitionImplC = transitionInfo.c();
            if (fragmentTransitionImpl != null && fragmentTransitionImplC != fragmentTransitionImpl) {
                StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(transitionInfo.f5081a.f5193c);
                sb.append(" returned Transition ");
                throw new IllegalArgumentException(android.support.v4.media.a.q(sb, transitionInfo.f5083c, " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl = fragmentTransitionImplC;
        }
        SpecialEffectsController.Operation.State state5 = SpecialEffectsController.Operation.State.Z;
        ViewGroup viewGroup = this.f5186a;
        if (fragmentTransitionImpl == null) {
            for (TransitionInfo transitionInfo2 : arrayList9) {
                linkedHashMap2.put(transitionInfo2.f5081a, Boolean.FALSE);
                transitionInfo2.a();
            }
            arrayList2 = arrayList8;
            arrayList3 = arrayListJ0;
            operation = operation7;
            str2 = " to ";
            str3 = "FragmentManager";
            state2 = state5;
            linkedHashMap = linkedHashMap2;
        } else {
            View view6 = new View(viewGroup.getContext());
            Rect rect2 = new Rect();
            arrayList2 = arrayList8;
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = new ArrayList();
            str2 = " to ";
            SpecialEffectsController.Operation.State state6 = state;
            ArrayMap arrayMap = new ArrayMap(0);
            Iterator it4 = arrayList9.iterator();
            Object objR = null;
            boolean z7 = false;
            View view7 = null;
            while (it4.hasNext()) {
                Object obj4 = objR;
                Object obj5 = ((TransitionInfo) it4.next()).f5084e;
                if (obj5 == null || operation5 == null || operation7 == null) {
                    arrayList5 = arrayListJ0;
                    state4 = state5;
                    str5 = str;
                    str6 = str7;
                    view6 = view6;
                    rect2 = rect2;
                    arrayList13 = arrayList13;
                    linkedHashMap2 = linkedHashMap2;
                    objR = obj4;
                    arrayListJ0 = arrayList5;
                    state5 = state4;
                    str = str5;
                    str7 = str6;
                } else {
                    objR = fragmentTransitionImpl.r(fragmentTransitionImpl.f(obj5));
                    arrayList5 = arrayListJ0;
                    Fragment fragment4 = operation7.f5193c;
                    state4 = state5;
                    ArrayList<String> sharedElementSourceNames = fragment4.getSharedElementSourceNames();
                    str5 = str;
                    Intrinsics.e(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    Fragment fragment5 = operation5.f5193c;
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    ArrayList<String> sharedElementSourceNames2 = fragment5.getSharedElementSourceNames();
                    View view8 = view6;
                    Intrinsics.e(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames = fragment5.getSharedElementTargetNames();
                    Rect rect3 = rect2;
                    Intrinsics.e(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames.size();
                    ArrayList arrayList14 = arrayList13;
                    int i4 = 0;
                    while (i4 < size) {
                        int i5 = size;
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i4));
                        ArrayList<String> arrayList15 = sharedElementTargetNames;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i4));
                        }
                        i4++;
                        size = i5;
                        sharedElementTargetNames = arrayList15;
                    }
                    ArrayList<String> sharedElementTargetNames2 = fragment4.getSharedElementTargetNames();
                    Intrinsics.e(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                    Pair pair = !z2 ? new Pair(fragment5.getExitTransitionCallback(), fragment4.getEnterTransitionCallback()) : new Pair(fragment5.getEnterTransitionCallback(), fragment4.getExitTransitionCallback());
                    SharedElementCallback sharedElementCallback = (SharedElementCallback) pair.X;
                    SharedElementCallback sharedElementCallback2 = (SharedElementCallback) pair.f43249Y;
                    int size2 = sharedElementSourceNames.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        arrayMap.put(sharedElementSourceNames.get(i6), sharedElementTargetNames2.get(i6));
                        i6++;
                        sharedElementCallback2 = sharedElementCallback2;
                    }
                    SharedElementCallback sharedElementCallback3 = sharedElementCallback2;
                    if (FragmentManager.I(2)) {
                        Log.v(str7, ">>> entering view names <<<");
                        for (Iterator<String> it5 = sharedElementTargetNames2.iterator(); it5.hasNext(); it5 = it5) {
                            Log.v(str7, "Name: " + it5.next());
                        }
                        Log.v(str7, ">>> exiting view names <<<");
                        for (Iterator<String> it6 = sharedElementSourceNames.iterator(); it6.hasNext(); it6 = it6) {
                            Log.v(str7, "Name: " + it6.next());
                        }
                    }
                    ArrayMap arrayMap2 = new ArrayMap(0);
                    View view9 = fragment5.mView;
                    Intrinsics.e(view9, "firstOut.fragment.mView");
                    j(arrayMap2, view9);
                    arrayMap2.m(sharedElementSourceNames);
                    if (sharedElementCallback != null) {
                        if (FragmentManager.I(2)) {
                            Log.v(str7, "Executing exit callback for operation " + operation5);
                        }
                        int size3 = sharedElementSourceNames.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i7 = size3 - 1;
                                String str8 = sharedElementSourceNames.get(size3);
                                View view10 = (View) arrayMap2.get(str8);
                                if (view10 == null) {
                                    arrayMap.remove(str8);
                                    i3 = i7;
                                } else {
                                    i3 = i7;
                                    if (!Intrinsics.a(str8, ViewCompat.o(view10))) {
                                        arrayMap.put(ViewCompat.o(view10), (String) arrayMap.remove(str8));
                                    }
                                }
                                if (i3 < 0) {
                                    break;
                                } else {
                                    size3 = i3;
                                }
                            }
                        }
                    } else {
                        arrayMap.m(arrayMap2.keySet());
                    }
                    ArrayMap arrayMap3 = new ArrayMap(0);
                    View view11 = fragment4.mView;
                    FragmentTransitionImpl fragmentTransitionImpl2 = fragmentTransitionImpl;
                    Intrinsics.e(view11, "lastIn.fragment.mView");
                    j(arrayMap3, view11);
                    arrayMap3.m(sharedElementTargetNames2);
                    arrayMap3.m(arrayMap.values());
                    if (sharedElementCallback3 != null) {
                        if (FragmentManager.I(2)) {
                            Log.v(str7, "Executing enter callback for operation " + operation7);
                        }
                        int size4 = sharedElementTargetNames2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i8 = size4 - 1;
                                String name = sharedElementTargetNames2.get(size4);
                                View view12 = (View) arrayMap3.get(name);
                                if (view12 == null) {
                                    Intrinsics.e(name, "name");
                                    String strB = FragmentTransition.b(arrayMap, name);
                                    if (strB != null) {
                                        arrayMap.remove(strB);
                                    }
                                    str6 = str7;
                                } else {
                                    str6 = str7;
                                    if (!Intrinsics.a(name, ViewCompat.o(view12))) {
                                        Intrinsics.e(name, "name");
                                        String strB2 = FragmentTransition.b(arrayMap, name);
                                        if (strB2 != null) {
                                            arrayMap.put(strB2, ViewCompat.o(view12));
                                        }
                                    }
                                }
                                if (i8 < 0) {
                                    break;
                                }
                                size4 = i8;
                                str7 = str6;
                            }
                        } else {
                            str6 = str7;
                        }
                    } else {
                        str6 = str7;
                        FragmentTransitionImpl fragmentTransitionImpl3 = FragmentTransition.f5171a;
                        for (int i9 = arrayMap.Z - 1; -1 < i9; i9--) {
                            if (!arrayMap3.containsKey((String) arrayMap.j(i9))) {
                                arrayMap.h(i9);
                            }
                        }
                    }
                    final Set setKeySet = arrayMap.keySet();
                    CollectionsKt.U(arrayMap2.entrySet(), new Function1<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            Map.Entry entry = (Map.Entry) obj6;
                            Intrinsics.f(entry, "entry");
                            return Boolean.valueOf(CollectionsKt.o(setKeySet, ViewCompat.o((View) entry.getValue())));
                        }
                    });
                    final Collection collectionValues = arrayMap.values();
                    CollectionsKt.U(arrayMap3.entrySet(), new Function1<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            Map.Entry entry = (Map.Entry) obj6;
                            Intrinsics.f(entry, "entry");
                            return Boolean.valueOf(CollectionsKt.o(collectionValues, ViewCompat.o((View) entry.getValue())));
                        }
                    });
                    if (arrayMap.isEmpty()) {
                        arrayList12.clear();
                        arrayList14.clear();
                        fragmentTransitionImpl = fragmentTransitionImpl2;
                        arrayList13 = arrayList14;
                        arrayListJ0 = arrayList5;
                        state5 = state4;
                        str = str5;
                        linkedHashMap2 = linkedHashMap3;
                        view6 = view8;
                        rect2 = rect3;
                        str7 = str6;
                        objR = null;
                    } else {
                        FragmentTransition.a(fragment4, fragment5, z2, arrayMap2);
                        OneShotPreDrawListener.a(viewGroup, new U(operation7, operation5, z2, arrayMap3));
                        arrayList12.addAll(arrayMap2.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            fragmentTransitionImpl = fragmentTransitionImpl2;
                        } else {
                            View view13 = (View) arrayMap2.get(sharedElementSourceNames.get(0));
                            fragmentTransitionImpl = fragmentTransitionImpl2;
                            fragmentTransitionImpl.m(view13, objR);
                            view7 = view13;
                        }
                        arrayList14.addAll(arrayMap3.values());
                        if (sharedElementTargetNames2.isEmpty() || (view2 = (View) arrayMap3.get(sharedElementTargetNames2.get(0))) == null) {
                            rect = rect3;
                        } else {
                            rect = rect3;
                            OneShotPreDrawListener.a(viewGroup, new e(fragmentTransitionImpl, view2, rect));
                            z7 = true;
                        }
                        fragmentTransitionImpl.p(objR, view8, arrayList12);
                        fragmentTransitionImpl.l(objR, null, null, objR, arrayList14);
                        Boolean bool = Boolean.TRUE;
                        linkedHashMap3.put(operation5, bool);
                        linkedHashMap3.put(operation7, bool);
                        view6 = view8;
                        rect2 = rect;
                        arrayList13 = arrayList14;
                        linkedHashMap2 = linkedHashMap3;
                        arrayListJ0 = arrayList5;
                        state5 = state4;
                        str = str5;
                        str7 = str6;
                    }
                }
            }
            Object obj6 = objR;
            arrayList3 = arrayListJ0;
            SpecialEffectsController.Operation.State state7 = state5;
            String str9 = str;
            String str10 = str7;
            ArrayList arrayList16 = arrayList13;
            linkedHashMap = linkedHashMap2;
            Rect rect4 = rect2;
            View view14 = view6;
            ArrayList arrayList17 = new ArrayList();
            Iterator it7 = arrayList9.iterator();
            Object objJ = null;
            Object objJ2 = null;
            while (it7.hasNext()) {
                TransitionInfo transitionInfo3 = (TransitionInfo) it7.next();
                boolean zB = transitionInfo3.b();
                it7 = it7;
                SpecialEffectsController.Operation operation9 = transitionInfo3.f5081a;
                if (zB) {
                    linkedHashMap.put(operation9, Boolean.FALSE);
                    transitionInfo3.a();
                } else {
                    Object objF = fragmentTransitionImpl.f(transitionInfo3.f5083c);
                    boolean z8 = obj6 != null && (operation9 == operation5 || operation9 == operation7);
                    if (objF != null) {
                        ArrayMap arrayMap4 = arrayMap;
                        ArrayList arrayList18 = new ArrayList();
                        ArrayList arrayList19 = arrayList12;
                        Fragment fragment6 = operation9.f5193c;
                        ArrayList arrayList20 = arrayList16;
                        View view15 = fragment6.mView;
                        SpecialEffectsController.Operation operation10 = operation7;
                        String str11 = str9;
                        Intrinsics.e(view15, str11);
                        i(view15, arrayList18);
                        if (z8) {
                            if (operation9 == operation5) {
                                arrayList18.removeAll(CollectionsKt.l0(arrayList19));
                            } else {
                                arrayList18.removeAll(CollectionsKt.l0(arrayList20));
                            }
                        }
                        if (arrayList18.isEmpty()) {
                            fragmentTransitionImpl.a(view14, objF);
                            str9 = str11;
                            obj = objF;
                            state3 = state7;
                        } else {
                            fragmentTransitionImpl.b(objF, arrayList18);
                            fragmentTransitionImpl.l(objF, objF, arrayList18, null, null);
                            obj = objF;
                            str9 = str11;
                            state3 = state7;
                            if (operation9.f5191a == state3) {
                                arrayList3.remove(operation9);
                                ArrayList arrayList21 = new ArrayList(arrayList18);
                                arrayList21.remove(fragment6.mView);
                                fragmentTransitionImpl.k(obj, fragment6.mView, arrayList21);
                                OneShotPreDrawListener.a(viewGroup, new d(arrayList18, 0));
                            }
                        }
                        SpecialEffectsController.Operation.State state8 = state6;
                        if (operation9.f5191a == state8) {
                            arrayList17.addAll(arrayList18);
                            if (z7) {
                                fragmentTransitionImpl.n(obj, rect4);
                            }
                            view = view7;
                        } else {
                            view = view7;
                            fragmentTransitionImpl.m(view, obj);
                        }
                        linkedHashMap.put(operation9, Boolean.TRUE);
                        if (transitionInfo3.d) {
                            objJ = fragmentTransitionImpl.j(objJ, obj);
                        } else {
                            objJ2 = fragmentTransitionImpl.j(objJ2, obj);
                        }
                        view7 = view;
                        state6 = state8;
                        state7 = state3;
                        view14 = view14;
                        arrayMap = arrayMap4;
                        arrayList12 = arrayList19;
                        arrayList16 = arrayList20;
                        operation7 = operation10;
                    } else if (!z8) {
                        linkedHashMap.put(operation9, Boolean.FALSE);
                        transitionInfo3.a();
                    }
                }
            }
            ArrayList arrayList22 = arrayList12;
            ArrayList arrayList23 = arrayList16;
            SpecialEffectsController.Operation operation11 = operation7;
            SimpleArrayMap simpleArrayMap2 = arrayMap;
            state2 = state7;
            Object objI = fragmentTransitionImpl.i(objJ, objJ2, obj6);
            if (objI != null) {
                ArrayList<TransitionInfo> arrayList24 = new ArrayList();
                for (Object obj7 : arrayList9) {
                    if (!((TransitionInfo) obj7).b()) {
                        arrayList24.add(obj7);
                    }
                }
                for (TransitionInfo transitionInfo4 : arrayList24) {
                    Object obj8 = transitionInfo4.f5083c;
                    SpecialEffectsController.Operation operation12 = transitionInfo4.f5081a;
                    SpecialEffectsController.Operation operation13 = operation11;
                    boolean z9 = obj6 != null && (operation12 == operation5 || operation12 == operation13);
                    if (obj8 != null || z9) {
                        WeakHashMap weakHashMap = ViewCompat.f4466a;
                        if (viewGroup.isLaidOut()) {
                            str4 = str10;
                            fragmentTransitionImpl.o(objI, transitionInfo4.f5082b, new e(transitionInfo4, operation12));
                        } else {
                            if (FragmentManager.I(2)) {
                                str4 = str10;
                                Log.v(str4, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + operation12);
                            } else {
                                str4 = str10;
                            }
                            transitionInfo4.a();
                        }
                    } else {
                        str4 = str10;
                    }
                    operation11 = operation13;
                    str10 = str4;
                }
                str3 = str10;
                operation = operation11;
                WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                if (viewGroup.isLaidOut()) {
                    FragmentTransition.c(4, arrayList17);
                    ArrayList arrayList25 = new ArrayList();
                    int size5 = arrayList23.size();
                    for (int i10 = 0; i10 < size5; i10++) {
                        View view16 = (View) arrayList23.get(i10);
                        arrayList25.add(ViewCompat.o(view16));
                        ViewCompat.L(view16, null);
                    }
                    if (FragmentManager.I(2)) {
                        Log.v(str3, ">>>>> Beginning transition <<<<<");
                        Log.v(str3, ">>>>> SharedElementFirstOutViews <<<<<");
                        for (Iterator it8 = arrayList22.iterator(); it8.hasNext(); it8 = it8) {
                            Object sharedElementFirstOutViews = it8.next();
                            Intrinsics.e(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                            View view17 = (View) sharedElementFirstOutViews;
                            Log.v(str3, "View: " + view17 + " Name: " + ViewCompat.o(view17));
                        }
                        Log.v(str3, ">>>>> SharedElementLastInViews <<<<<");
                        for (Iterator it9 = arrayList23.iterator(); it9.hasNext(); it9 = it9) {
                            Object sharedElementLastInViews = it9.next();
                            Intrinsics.e(sharedElementLastInViews, "sharedElementLastInViews");
                            View view18 = (View) sharedElementLastInViews;
                            Log.v(str3, "View: " + view18 + " Name: " + ViewCompat.o(view18));
                        }
                    }
                    fragmentTransitionImpl.c(viewGroup, objI);
                    int size6 = arrayList23.size();
                    ArrayList arrayList26 = new ArrayList();
                    int i11 = 0;
                    while (i11 < size6) {
                        ArrayList arrayList27 = arrayList22;
                        View view19 = (View) arrayList27.get(i11);
                        int i12 = i11;
                        String strO = ViewCompat.o(view19);
                        arrayList26.add(strO);
                        if (strO == null) {
                            i2 = size6;
                            arrayList4 = arrayList26;
                            arrayList22 = arrayList27;
                            simpleArrayMap = simpleArrayMap2;
                        } else {
                            arrayList4 = arrayList26;
                            ViewCompat.L(view19, null);
                            simpleArrayMap = simpleArrayMap2;
                            String str12 = (String) simpleArrayMap.get(strO);
                            arrayList22 = arrayList27;
                            int i13 = 0;
                            while (true) {
                                i2 = size6;
                                if (i13 >= size6) {
                                    break;
                                }
                                if (str12.equals(arrayList25.get(i13))) {
                                    ViewCompat.L((View) arrayList23.get(i13), strO);
                                    break;
                                } else {
                                    i13++;
                                    size6 = i2;
                                }
                            }
                        }
                        i11 = i12 + 1;
                        simpleArrayMap2 = simpleArrayMap;
                        size6 = i2;
                        arrayList26 = arrayList4;
                    }
                    ArrayList arrayList28 = arrayList22;
                    OneShotPreDrawListener.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.FragmentTransitionImpl.1
                        public final /* synthetic */ int X;

                        /* JADX INFO: renamed from: Y */
                        public final /* synthetic */ ArrayList f5182Y;
                        public final /* synthetic */ ArrayList Z;
                        public final /* synthetic */ ArrayList e0;
                        public final /* synthetic */ ArrayList f0;

                        public AnonymousClass1() {
                            i = size6;
                            arrayList = arrayList23;
                            arrayList = arrayList25;
                            arrayList = arrayList28;
                            arrayList = arrayList26;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            for (int i14 = 0; i14 < i; i14++) {
                                ViewCompat.L((View) arrayList.get(i14), (String) arrayList.get(i14));
                                ViewCompat.L((View) arrayList.get(i14), (String) arrayList.get(i14));
                            }
                        }
                    });
                    z3 = false;
                    FragmentTransition.c(0, arrayList17);
                    fragmentTransitionImpl.q(obj6, arrayList28, arrayList23);
                }
                zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
                context = viewGroup.getContext();
                arrayList6 = new ArrayList();
                z4 = z3;
                for (final AnimationInfo animationInfo3 : arrayList2) {
                    if (animationInfo3.b()) {
                        animationInfo3.a();
                    } else {
                        Intrinsics.e(context, "context");
                        animationOrAnimatorC2 = animationInfo3.c(context);
                        if (animationOrAnimatorC2 == null) {
                            animationInfo3.a();
                        } else {
                            animator = animationOrAnimatorC2.f5105b;
                            if (animator == null) {
                                arrayList6.add(animationInfo3);
                            } else {
                                operation3 = animationInfo3.f5081a;
                                zA = Intrinsics.a(linkedHashMap.get(operation3), Boolean.TRUE);
                                fragment2 = operation3.f5193c;
                                if (zA) {
                                    if (FragmentManager.I(2)) {
                                        Log.v(str3, "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                                    }
                                    animationInfo3.a();
                                } else {
                                    if (operation3.f5191a == state2) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    arrayList7 = arrayList3;
                                    if (z6) {
                                        arrayList7.remove(operation3);
                                    }
                                    final View view20 = fragment2.mView;
                                    viewGroup.startViewTransition(view20);
                                    arrayList3 = arrayList7;
                                    boolean z10 = zContainsValue;
                                    animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$1
                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public final void onAnimationEnd(Animator anim) {
                                            Intrinsics.f(anim, "anim");
                                            ViewGroup viewGroup2 = this.X.f5186a;
                                            View viewToAnimate = view20;
                                            viewGroup2.endViewTransition(viewToAnimate);
                                            boolean z11 = z6;
                                            SpecialEffectsController.Operation operation14 = operation3;
                                            if (z11) {
                                                SpecialEffectsController.Operation.State state9 = operation14.f5191a;
                                                Intrinsics.e(viewToAnimate, "viewToAnimate");
                                                state9.a(viewToAnimate);
                                            }
                                            animationInfo3.a();
                                            if (FragmentManager.I(2)) {
                                                Log.v("FragmentManager", "Animator from operation " + operation14 + " has ended.");
                                            }
                                        }
                                    });
                                    animator.setTarget(view20);
                                    animator.start();
                                    if (FragmentManager.I(2)) {
                                        Log.v(str3, "Animator from operation " + operation3 + " has started.");
                                    }
                                    animationInfo3.f5082b.b(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.b
                                        @Override // androidx.core.os.CancellationSignal.OnCancelListener
                                        public final void onCancel() {
                                            SpecialEffectsController.Operation operation14 = operation3;
                                            Intrinsics.f(operation14, "$operation");
                                            animator.end();
                                            if (FragmentManager.I(2)) {
                                                Log.v("FragmentManager", "Animator from operation " + operation14 + " has been canceled.");
                                            }
                                        }
                                    });
                                    zContainsValue = z10;
                                    z4 = true;
                                }
                            }
                        }
                    }
                }
                z5 = zContainsValue;
                for (final AnimationInfo animationInfo4 : arrayList6) {
                    operation2 = animationInfo4.f5081a;
                    fragment = operation2.f5193c;
                    if (z5) {
                        if (FragmentManager.I(2)) {
                            Log.v(str3, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Transitions.");
                        }
                        animationInfo4.a();
                    } else if (z4) {
                        if (FragmentManager.I(2)) {
                            Log.v(str3, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Animators.");
                        }
                        animationInfo4.a();
                    } else {
                        view3 = fragment.mView;
                        Intrinsics.e(context, "context");
                        animationOrAnimatorC = animationInfo4.c(context);
                        if (animationOrAnimatorC != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animation = animationOrAnimatorC.f5104a;
                        if (animation != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (operation2.f5191a != SpecialEffectsController.Operation.State.X) {
                            view3.startAnimation(animation);
                            animationInfo4.a();
                        } else {
                            viewGroup.startViewTransition(view3);
                            FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation, viewGroup, view3);
                            endViewTransitionAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$3
                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationEnd(Animation animation2) {
                                    Intrinsics.f(animation2, "animation");
                                    DefaultSpecialEffectsController defaultSpecialEffectsController = this;
                                    defaultSpecialEffectsController.f5186a.post(new a(defaultSpecialEffectsController, view3, animationInfo4));
                                    if (FragmentManager.I(2)) {
                                        Log.v("FragmentManager", "Animation from operation " + operation2 + " has ended.");
                                    }
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationRepeat(Animation animation2) {
                                    Intrinsics.f(animation2, "animation");
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public final void onAnimationStart(Animation animation2) {
                                    Intrinsics.f(animation2, "animation");
                                    if (FragmentManager.I(2)) {
                                        Log.v("FragmentManager", "Animation from operation " + operation2 + " has reached onAnimationStart.");
                                    }
                                }
                            });
                            view3.startAnimation(endViewTransitionAnimation);
                            if (FragmentManager.I(2)) {
                                Log.v(str3, "Animation from operation " + operation2 + " has started.");
                            }
                        }
                        animationInfo4.f5082b.b(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.c
                            @Override // androidx.core.os.CancellationSignal.OnCancelListener
                            public final void onCancel() {
                                DefaultSpecialEffectsController this$0 = this;
                                Intrinsics.f(this$0, "this$0");
                                DefaultSpecialEffectsController.AnimationInfo animationInfo5 = animationInfo4;
                                Intrinsics.f(animationInfo5, "$animationInfo");
                                SpecialEffectsController.Operation operation14 = operation2;
                                Intrinsics.f(operation14, "$operation");
                                View view21 = view3;
                                view21.clearAnimation();
                                this$0.f5186a.endViewTransition(view21);
                                animationInfo5.a();
                                if (FragmentManager.I(2)) {
                                    Log.v("FragmentManager", "Animation from operation " + operation14 + " has been cancelled.");
                                }
                            }
                        });
                    }
                }
                for (SpecialEffectsController.Operation operation14 : arrayList3) {
                    View view21 = operation14.f5193c.mView;
                    SpecialEffectsController.Operation.State state9 = operation14.f5191a;
                    Intrinsics.e(view21, "view");
                    state9.a(view21);
                }
                arrayList3.clear();
                if (FragmentManager.I(2)) {
                    Log.v(str3, "Completed executing operations from " + operation5 + str2 + operation);
                }
            }
            str3 = str10;
            operation = operation11;
        }
        z3 = false;
        zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        context = viewGroup.getContext();
        arrayList6 = new ArrayList();
        z4 = z3;
        while (r17.hasNext()) {
            if (animationInfo3.b()) {
                animationInfo3.a();
            } else {
                Intrinsics.e(context, "context");
                animationOrAnimatorC2 = animationInfo3.c(context);
                if (animationOrAnimatorC2 == null) {
                    animationInfo3.a();
                } else {
                    animator = animationOrAnimatorC2.f5105b;
                    if (animator == null) {
                        arrayList6.add(animationInfo3);
                    } else {
                        operation3 = animationInfo3.f5081a;
                        zA = Intrinsics.a(linkedHashMap.get(operation3), Boolean.TRUE);
                        fragment2 = operation3.f5193c;
                        if (zA) {
                            if (FragmentManager.I(2)) {
                                Log.v(str3, "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                            }
                            animationInfo3.a();
                        } else {
                            if (operation3.f5191a == state2) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            arrayList7 = arrayList3;
                            if (z6) {
                                arrayList7.remove(operation3);
                            }
                            final View view22 = fragment2.mView;
                            viewGroup.startViewTransition(view22);
                            arrayList3 = arrayList7;
                            boolean z11 = zContainsValue;
                            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$1
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator anim) {
                                    Intrinsics.f(anim, "anim");
                                    ViewGroup viewGroup2 = this.X.f5186a;
                                    View viewToAnimate = view22;
                                    viewGroup2.endViewTransition(viewToAnimate);
                                    boolean z12 = z6;
                                    SpecialEffectsController.Operation operation15 = operation3;
                                    if (z12) {
                                        SpecialEffectsController.Operation.State state10 = operation15.f5191a;
                                        Intrinsics.e(viewToAnimate, "viewToAnimate");
                                        state10.a(viewToAnimate);
                                    }
                                    animationInfo3.a();
                                    if (FragmentManager.I(2)) {
                                        Log.v("FragmentManager", "Animator from operation " + operation15 + " has ended.");
                                    }
                                }
                            });
                            animator.setTarget(view22);
                            animator.start();
                            if (FragmentManager.I(2)) {
                                Log.v(str3, "Animator from operation " + operation3 + " has started.");
                            }
                            animationInfo3.f5082b.b(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.b
                                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                                public final void onCancel() {
                                    SpecialEffectsController.Operation operation15 = operation3;
                                    Intrinsics.f(operation15, "$operation");
                                    animator.end();
                                    if (FragmentManager.I(2)) {
                                        Log.v("FragmentManager", "Animator from operation " + operation15 + " has been canceled.");
                                    }
                                }
                            });
                            zContainsValue = z11;
                            z4 = true;
                        }
                    }
                }
            }
        }
        z5 = zContainsValue;
        while (r0.hasNext()) {
            operation2 = animationInfo4.f5081a;
            fragment = operation2.f5193c;
            if (z5) {
                if (FragmentManager.I(2)) {
                    Log.v(str3, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Transitions.");
                }
                animationInfo4.a();
            } else if (z4) {
                if (FragmentManager.I(2)) {
                    Log.v(str3, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Animators.");
                }
                animationInfo4.a();
            } else {
                view3 = fragment.mView;
                Intrinsics.e(context, "context");
                animationOrAnimatorC = animationInfo4.c(context);
                if (animationOrAnimatorC != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                animation = animationOrAnimatorC.f5104a;
                if (animation != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (operation2.f5191a != SpecialEffectsController.Operation.State.X) {
                    view3.startAnimation(animation);
                    animationInfo4.a();
                } else {
                    viewGroup.startViewTransition(view3);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation2 = new FragmentAnim.EndViewTransitionAnimation(animation, viewGroup, view3);
                    endViewTransitionAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$3
                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation2) {
                            Intrinsics.f(animation2, "animation");
                            DefaultSpecialEffectsController defaultSpecialEffectsController = this;
                            defaultSpecialEffectsController.f5186a.post(new a(defaultSpecialEffectsController, view3, animationInfo4));
                            if (FragmentManager.I(2)) {
                                Log.v("FragmentManager", "Animation from operation " + operation2 + " has ended.");
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationRepeat(Animation animation2) {
                            Intrinsics.f(animation2, "animation");
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationStart(Animation animation2) {
                            Intrinsics.f(animation2, "animation");
                            if (FragmentManager.I(2)) {
                                Log.v("FragmentManager", "Animation from operation " + operation2 + " has reached onAnimationStart.");
                            }
                        }
                    });
                    view3.startAnimation(endViewTransitionAnimation2);
                    if (FragmentManager.I(2)) {
                        Log.v(str3, "Animation from operation " + operation2 + " has started.");
                    }
                }
                animationInfo4.f5082b.b(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.c
                    @Override // androidx.core.os.CancellationSignal.OnCancelListener
                    public final void onCancel() {
                        DefaultSpecialEffectsController this$0 = this;
                        Intrinsics.f(this$0, "this$0");
                        DefaultSpecialEffectsController.AnimationInfo animationInfo5 = animationInfo4;
                        Intrinsics.f(animationInfo5, "$animationInfo");
                        SpecialEffectsController.Operation operation15 = operation2;
                        Intrinsics.f(operation15, "$operation");
                        View view23 = view3;
                        view23.clearAnimation();
                        this$0.f5186a.endViewTransition(view23);
                        animationInfo5.a();
                        if (FragmentManager.I(2)) {
                            Log.v("FragmentManager", "Animation from operation " + operation15 + " has been cancelled.");
                        }
                    }
                });
            }
        }
        while (r0.hasNext()) {
            View view23 = operation14.f5193c.mView;
            SpecialEffectsController.Operation.State state10 = operation14.f5191a;
            Intrinsics.e(view23, "view");
            state10.a(view23);
        }
        arrayList3.clear();
        if (FragmentManager.I(2)) {
            Log.v(str3, "Completed executing operations from " + operation5 + str2 + operation);
        }
    }
}

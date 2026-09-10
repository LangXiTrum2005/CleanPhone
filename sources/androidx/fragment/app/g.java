package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.storage.androidcleaner.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m0 f4320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c2 operation, boolean z10) {
        super(operation);
        kotlin.jvm.internal.n.f(operation, "operation");
        this.f4318b = z10;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00f3 A[Catch: RuntimeException -> 0x00f9, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00f9, blocks: (B:72:0x00ed, B:74:0x00f3), top: B:85:0x00ed }] */
    public final m0 b(Context context) {
        int enterAnim;
        m0 m0Var;
        Animator animatorLoadAnimator;
        int iA;
        if (this.f4319c) {
            return this.f4320d;
        }
        c2 c2Var = this.f4379a;
        Fragment fragment = c2Var.f4273c;
        boolean z10 = c2Var.f4271a == 2;
        int nextTransition = fragment.getNextTransition();
        if (this.f4318b) {
            enterAnim = z10 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
        } else {
            enterAnim = z10 ? fragment.getEnterAnim() : fragment.getExitAnim();
        }
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        m0 m0Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, enterAnim);
            if (animationOnCreateAnimation != null) {
                m0Var2 = new m0(animationOnCreateAnimation);
            } else {
                Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, enterAnim);
                if (animatorOnCreateAnimator != null) {
                    m0Var2 = new m0(animatorOnCreateAnimator);
                } else {
                    if (enterAnim == 0 && nextTransition != 0) {
                        if (nextTransition == 4097) {
                            iA = z10 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        } else if (nextTransition == 8194) {
                            iA = z10 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                        } else if (nextTransition == 8197) {
                            iA = z10 ? t9.e.A(context, android.R.attr.activityCloseEnterAnimation) : t9.e.A(context, android.R.attr.activityCloseExitAnimation);
                        } else if (nextTransition == 4099) {
                            iA = z10 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                        } else if (nextTransition != 4100) {
                            iA = -1;
                        } else {
                            iA = z10 ? t9.e.A(context, android.R.attr.activityOpenEnterAnimation) : t9.e.A(context, android.R.attr.activityOpenExitAnimation);
                        }
                        enterAnim = iA;
                    }
                    if (enterAnim != 0) {
                        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                        if (zEquals) {
                            try {
                                Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                if (animationLoadAnimation != null) {
                                    m0Var = new m0(animationLoadAnimation);
                                    m0Var2 = m0Var;
                                }
                            } catch (Resources.NotFoundException e10) {
                                throw e10;
                            } catch (RuntimeException unused) {
                                try {
                                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                    if (animatorLoadAnimator != null) {
                                        m0Var = new m0(animatorLoadAnimator);
                                        m0Var2 = m0Var;
                                    }
                                } catch (RuntimeException e11) {
                                    if (zEquals) {
                                        throw e11;
                                    }
                                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation2 != null) {
                                        m0Var2 = new m0(animationLoadAnimation2);
                                    }
                                }
                            }
                        } else {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                            if (animatorLoadAnimator != null) {
                                m0Var = new m0(animatorLoadAnimator);
                                m0Var2 = m0Var;
                            }
                        }
                    }
                }
            }
        }
        this.f4320d = m0Var2;
        this.f4319c = true;
        return m0Var2;
    }
}

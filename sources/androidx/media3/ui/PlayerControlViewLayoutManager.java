package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class PlayerControlViewLayoutManager {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f7702A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f7703B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerControlView f7704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f7705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f7706c;
    public final ViewGroup d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f7707e;
    public final ViewGroup f;
    public final ViewGroup g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewGroup f7708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewGroup f7709i;
    public final View j;
    public final View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AnimatorSet f7710l;
    public final AnimatorSet m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AnimatorSet f7711n;
    public final AnimatorSet o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AnimatorSet f7712p;
    public final ValueAnimator q;
    public final ValueAnimator r;
    public final e s = new e(this, 0);
    public final e t = new e(this, 3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e f7713u = new e(this, 4);
    public final e v = new e(this, 5);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f7714w = new e(this, 6);
    public final g x = new g(this, 0);
    public boolean C = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f7715z = 0;
    public final ArrayList y = new ArrayList();

    public PlayerControlViewLayoutManager(final PlayerControlView playerControlView) {
        this.f7704a = playerControlView;
        int i2 = 3;
        this.f7705b = playerControlView.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_controls_background);
        this.f7706c = (ViewGroup) playerControlView.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_center_controls);
        this.f7707e = (ViewGroup) playerControlView.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_bottom_bar);
        this.d = viewGroup;
        this.f7709i = (ViewGroup) playerControlView.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_time);
        View viewFindViewById = playerControlView.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_progress);
        this.j = viewFindViewById;
        this.f = (ViewGroup) playerControlView.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_basic_controls);
        this.g = (ViewGroup) playerControlView.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_extra_controls);
        this.f7708h = (ViewGroup) playerControlView.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = playerControlView.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_overflow_show);
        this.k = viewFindViewById2;
        View viewFindViewById3 = playerControlView.findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new b(this, i2));
            viewFindViewById3.setOnClickListener(new b(this, i2));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new f(this, 3));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
                View view = playerControlViewLayoutManager.f7705b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup2 = playerControlViewLayoutManager.f7706c;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                ViewGroup viewGroup3 = playerControlViewLayoutManager.f7707e;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
                View view = playerControlViewLayoutManager.j;
                if (!(view instanceof DefaultTimeBar) || playerControlViewLayoutManager.f7702A) {
                    return;
                }
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                ValueAnimator valueAnimator = defaultTimeBar.I0;
                if (valueAnimator.isStarted()) {
                    valueAnimator.cancel();
                }
                valueAnimator.setFloatValues(defaultTimeBar.J0, 0.0f);
                valueAnimator.setDuration(250L);
                valueAnimator.start();
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new f(this, 0));
        valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
                View view = playerControlViewLayoutManager.f7705b;
                if (view != null) {
                    view.setVisibility(0);
                }
                ViewGroup viewGroup2 = playerControlViewLayoutManager.f7706c;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                ViewGroup viewGroup3 = playerControlViewLayoutManager.f7707e;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(playerControlViewLayoutManager.f7702A ? 0 : 4);
                }
                View view2 = playerControlViewLayoutManager.j;
                if (!(view2 instanceof DefaultTimeBar) || playerControlViewLayoutManager.f7702A) {
                    return;
                }
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
                ValueAnimator valueAnimator = defaultTimeBar.I0;
                if (valueAnimator.isStarted()) {
                    valueAnimator.cancel();
                }
                defaultTimeBar.K0 = false;
                valueAnimator.setFloatValues(defaultTimeBar.J0, 1.0f);
                valueAnimator.setDuration(250L);
                valueAnimator.start();
            }
        });
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(com.charging.screenshow.battery.animations.themes.R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(com.charging.screenshow.battery.animations.themes.R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(com.charging.screenshow.battery.animations.themes.R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7710l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
                playerControlViewLayoutManager.i(1);
                if (playerControlViewLayoutManager.f7703B) {
                    playerControlView.post(playerControlViewLayoutManager.s);
                    playerControlViewLayoutManager.f7703B = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.i(3);
            }
        });
        animatorSet.play(valueAnimatorOfFloat).with(d(0.0f, dimension, viewFindViewById)).with(d(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
                playerControlViewLayoutManager.i(2);
                if (playerControlViewLayoutManager.f7703B) {
                    playerControlView.post(playerControlViewLayoutManager.s);
                    playerControlViewLayoutManager.f7703B = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.i(3);
            }
        });
        animatorSet2.play(d(dimension, dimension2, viewFindViewById)).with(d(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f7711n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
                playerControlViewLayoutManager.i(2);
                if (playerControlViewLayoutManager.f7703B) {
                    playerControlView.post(playerControlViewLayoutManager.s);
                    playerControlViewLayoutManager.f7703B = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.i(3);
            }
        });
        animatorSet3.play(valueAnimatorOfFloat).with(d(0.0f, dimension2, viewFindViewById)).with(d(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager.this.i(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.i(4);
            }
        });
        animatorSet4.play(valueAnimatorOfFloat2).with(d(dimension, 0.0f, viewFindViewById)).with(d(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f7712p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager.this.i(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.i(4);
            }
        });
        animatorSet5.play(valueAnimatorOfFloat2).with(d(dimension2, 0.0f, viewFindViewById)).with(d(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new f(this, 1));
        valueAnimatorOfFloat3.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ViewGroup viewGroup2 = PlayerControlViewLayoutManager.this.f;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager playerControlViewLayoutManager = PlayerControlViewLayoutManager.this;
                ViewGroup viewGroup2 = playerControlViewLayoutManager.f7708h;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                    ViewGroup viewGroup3 = playerControlViewLayoutManager.f7708h;
                    viewGroup3.setTranslationX(viewGroup3.getWidth());
                    ViewGroup viewGroup4 = playerControlViewLayoutManager.f7708h;
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new f(this, 2));
        valueAnimatorOfFloat4.addListener(new AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ViewGroup viewGroup2 = PlayerControlViewLayoutManager.this.f7708h;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                ViewGroup viewGroup2 = PlayerControlViewLayoutManager.this.f;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
            }
        });
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator d(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    public static boolean j(View view) {
        int id = view.getId();
        return id == com.charging.screenshow.battery.animations.themes.R.id.exo_bottom_bar || id == com.charging.screenshow.battery.animations.themes.R.id.exo_prev || id == com.charging.screenshow.battery.animations.themes.R.id.exo_next || id == com.charging.screenshow.battery.animations.themes.R.id.exo_rew || id == com.charging.screenshow.battery.animations.themes.R.id.exo_rew_with_amount || id == com.charging.screenshow.battery.animations.themes.R.id.exo_ffwd || id == com.charging.screenshow.battery.animations.themes.R.id.exo_ffwd_with_amount;
    }

    public final void a(float f) {
        ViewGroup viewGroup = this.f7708h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f7709i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final boolean b(View view) {
        return view != null && this.y.contains(view);
    }

    public final void e(long j, Runnable runnable) {
        if (j >= 0) {
            this.f7704a.postDelayed(runnable, j);
        }
    }

    public final void f() {
        e eVar = this.f7714w;
        PlayerControlView playerControlView = this.f7704a;
        playerControlView.removeCallbacks(eVar);
        playerControlView.removeCallbacks(this.t);
        playerControlView.removeCallbacks(this.v);
        playerControlView.removeCallbacks(this.f7713u);
    }

    public final void g() {
        if (this.f7715z == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.f7704a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                e(showTimeoutMs, this.f7714w);
            } else if (this.f7715z == 1) {
                e(2000L, this.f7713u);
            } else {
                e(showTimeoutMs, this.v);
            }
        }
    }

    public final void h(View view, boolean z2) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.y;
        if (!z2) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f7702A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i2) {
        int i3 = this.f7715z;
        this.f7715z = i2;
        PlayerControlView playerControlView = this.f7704a;
        if (i2 == 2) {
            playerControlView.setVisibility(8);
        } else if (i3 == 2) {
            playerControlView.setVisibility(0);
        }
        if (i3 != i2) {
            Iterator it = playerControlView.h0.iterator();
            while (it.hasNext()) {
                ((PlayerControlView.VisibilityListener) it.next()).m(playerControlView.getVisibility());
            }
        }
    }

    public final void k() {
        if (!this.C) {
            i(0);
            g();
            return;
        }
        int i2 = this.f7715z;
        if (i2 == 1) {
            this.o.start();
        } else if (i2 == 2) {
            this.f7712p.start();
        } else if (i2 == 3) {
            this.f7703B = true;
        } else if (i2 == 4) {
            return;
        }
        g();
    }
}

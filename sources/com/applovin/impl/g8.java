package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g8 {
    public static void a(View view, long j10, Runnable runnable) {
        view.setVisibility(4);
        view.bringToFront();
        AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        alphaAnimation.setDuration(j10);
        alphaAnimation.setAnimationListener(new a(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    public static void c(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static boolean b(int i10) {
        return i10 == 0;
    }

    public static void b(View view, long j10, Runnable runnable) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation.setDuration(j10);
        alphaAnimation.setAnimationListener(new b(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    public static boolean a(int i10, int i11) {
        return b(i10) != b(i11);
    }

    public static Activity b(View view, com.applovin.impl.sdk.l lVar) {
        if (view == null) {
            return null;
        }
        for (int i10 = 0; i10 < 1000; i10++) {
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } catch (Throwable th2) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("ViewUtils", "Encountered error while retrieving activity from view", th2);
                }
            }
        }
        return null;
    }

    public static String a(int i10) {
        if (i10 == 0) {
            return "VISIBLE";
        }
        if (i10 == 4) {
            return "INVISIBLE";
        }
        if (i10 == 8) {
            return "GONE";
        }
        return String.valueOf(i10);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    public static int[] a(int i10, int i11, int i12) {
        if (i10 == 0) {
            return new int[]{i11, i12};
        }
        if ((i10 & 119) == 119) {
            return new int[]{13};
        }
        if ((i10 & InterfaceC0435l1.d.b.f29113j) == 112) {
            i11 = 15;
        } else if ((i10 & 48) == 48) {
            i11 = 10;
        } else if ((i10 & 80) == 80) {
            i11 = 12;
        } else if ((i10 & 16) == 16) {
            i11 = 15;
        }
        if ((i10 & 7) == 7) {
            i12 = 14;
        } else if ((i10 & 8388611) == 8388611) {
            i12 = 20;
        } else if ((i10 & 3) == 3) {
            i12 = 9;
        } else if ((i10 & 8388613) == 8388613) {
            i12 = 21;
        } else if ((i10 & 5) == 5) {
            i12 = 11;
        } else if ((i10 & 1) == 1) {
            i12 = 14;
        }
        return new int[]{i12, i11};
    }

    public static View b(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View viewFindViewById = rootView.findViewById(R.id.content);
        return viewFindViewById != null ? viewFindViewById : rootView;
    }

    public static void a(View view, final com.applovin.impl.sdk.l lVar) {
        if (view == null || lVar == null || !p0.b()) {
            return;
        }
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.applovin.impl.g9
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return g8.a(lVar, view2, windowInsets);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsets a(com.applovin.impl.sdk.l lVar, View view, WindowInsets windowInsets) {
        Insets insets = windowInsets.getInsets(((Integer) lVar.a(z4.f10289y2)).intValue());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsets.CONSUMED;
    }

    public static boolean a(View view, Activity activity) {
        if (activity != null && view != null) {
            Window window = activity.getWindow();
            if (window != null) {
                return a(view, window.getDecorView());
            }
            View viewFindViewById = activity.findViewById(R.id.content);
            if (viewFindViewById != null) {
                return a(view, viewFindViewById.getRootView());
            }
        }
        return false;
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (a(view, viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f8043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f8044b;

        public a(View view, Runnable runnable) {
            this.f8043a = view;
            this.f8044b = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Runnable runnable = this.f8044b;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f8043a.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f8045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f8046b;

        public b(View view, Runnable runnable) {
            this.f8045a = view;
            this.f8046b = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f8045a.setVisibility(4);
            Runnable runnable = this.f8046b;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f8045a.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    public static String a(View view) {
        return view.getClass().getName() + '@' + Integer.toHexString(view.hashCode());
    }
}

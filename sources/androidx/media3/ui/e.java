package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ PlayerControlViewLayoutManager f7756Y;

    public /* synthetic */ e(PlayerControlViewLayoutManager playerControlViewLayoutManager, int i2) {
        this.X = i2;
        this.f7756Y = playerControlViewLayoutManager;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc A[LOOP:3: B:39:0x00b6->B:41:0x00bc, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.X) {
            case 0:
                this.f7756Y.k();
                break;
            case 1:
                PlayerControlViewLayoutManager playerControlViewLayoutManager = this.f7756Y;
                ViewGroup viewGroup2 = playerControlViewLayoutManager.f7707e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(playerControlViewLayoutManager.f7702A ? 0 : 4);
                }
                View view = playerControlViewLayoutManager.j;
                if (view != null) {
                    int dimensionPixelSize = playerControlViewLayoutManager.f7704a.getResources().getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (playerControlViewLayoutManager.f7702A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof DefaultTimeBar) {
                        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                        boolean z2 = playerControlViewLayoutManager.f7702A;
                        Rect rect = defaultTimeBar.e0;
                        if (z2) {
                            ValueAnimator valueAnimator = defaultTimeBar.I0;
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            defaultTimeBar.K0 = true;
                            defaultTimeBar.J0 = 0.0f;
                            defaultTimeBar.invalidate(rect);
                        } else {
                            int i2 = playerControlViewLayoutManager.f7715z;
                            if (i2 == 1) {
                                ValueAnimator valueAnimator2 = defaultTimeBar.I0;
                                if (valueAnimator2.isStarted()) {
                                    valueAnimator2.cancel();
                                }
                                defaultTimeBar.K0 = false;
                                defaultTimeBar.J0 = 0.0f;
                                defaultTimeBar.invalidate(rect);
                            } else if (i2 != 3) {
                                ValueAnimator valueAnimator3 = defaultTimeBar.I0;
                                if (valueAnimator3.isStarted()) {
                                    valueAnimator3.cancel();
                                }
                                defaultTimeBar.K0 = false;
                                defaultTimeBar.J0 = 1.0f;
                                defaultTimeBar.invalidate(rect);
                            }
                        }
                    }
                }
                for (View view2 : playerControlViewLayoutManager.y) {
                    view2.setVisibility((playerControlViewLayoutManager.f7702A && PlayerControlViewLayoutManager.j(view2)) ? 4 : 0);
                }
                break;
            case 2:
                PlayerControlViewLayoutManager playerControlViewLayoutManager2 = this.f7756Y;
                ViewGroup viewGroup3 = playerControlViewLayoutManager2.f;
                if (viewGroup3 != null && (viewGroup = playerControlViewLayoutManager2.g) != null) {
                    PlayerControlView playerControlView = playerControlViewLayoutManager2.f7704a;
                    int width = (playerControlView.getWidth() - playerControlView.getPaddingLeft()) - playerControlView.getPaddingRight();
                    while (true) {
                        if (viewGroup.getChildCount() <= 1) {
                            View view3 = playerControlViewLayoutManager2.k;
                            if (view3 != null) {
                                view3.setVisibility(8);
                            }
                            int iC = PlayerControlViewLayoutManager.c(playerControlViewLayoutManager2.f7709i);
                            int childCount = viewGroup3.getChildCount() - 1;
                            for (int i3 = 0; i3 < childCount; i3++) {
                                iC += PlayerControlViewLayoutManager.c(viewGroup3.getChildAt(i3));
                            }
                            if (iC > width) {
                                if (view3 != null) {
                                    view3.setVisibility(0);
                                    iC += PlayerControlViewLayoutManager.c(view3);
                                }
                                ArrayList arrayList = new ArrayList();
                                for (int i4 = 0; i4 < childCount; i4++) {
                                    View childAt = viewGroup3.getChildAt(i4);
                                    iC -= PlayerControlViewLayoutManager.c(childAt);
                                    arrayList.add(childAt);
                                    if (iC <= width) {
                                        if (!arrayList.isEmpty()) {
                                            viewGroup3.removeViews(0, arrayList.size());
                                            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                                viewGroup.addView((View) arrayList.get(i5), viewGroup.getChildCount() - 1);
                                            }
                                        }
                                    }
                                    break;
                                }
                                if (!arrayList.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList.size());
                                    while (i5 < arrayList.size()) {
                                        viewGroup.addView((View) arrayList.get(i5), viewGroup.getChildCount() - 1);
                                    }
                                }
                                break;
                            } else {
                                ViewGroup viewGroup4 = playerControlViewLayoutManager2.f7708h;
                                if (viewGroup4 != null && viewGroup4.getVisibility() == 0) {
                                    ValueAnimator valueAnimator4 = playerControlViewLayoutManager2.r;
                                    if (!valueAnimator4.isStarted()) {
                                        playerControlViewLayoutManager2.q.cancel();
                                        valueAnimator4.start();
                                    }
                                    break;
                                }
                            }
                        } else {
                            int childCount2 = viewGroup.getChildCount() - 2;
                            View childAt2 = viewGroup.getChildAt(childCount2);
                            viewGroup.removeViewAt(childCount2);
                            viewGroup3.addView(childAt2, 0);
                        }
                    }
                }
                break;
            case 3:
                this.f7756Y.f7711n.start();
                break;
            case 4:
                this.f7756Y.m.start();
                break;
            case 5:
                PlayerControlViewLayoutManager playerControlViewLayoutManager3 = this.f7756Y;
                playerControlViewLayoutManager3.f7710l.start();
                playerControlViewLayoutManager3.e(2000L, playerControlViewLayoutManager3.f7713u);
                break;
            default:
                this.f7756Y.i(2);
                break;
        }
    }
}

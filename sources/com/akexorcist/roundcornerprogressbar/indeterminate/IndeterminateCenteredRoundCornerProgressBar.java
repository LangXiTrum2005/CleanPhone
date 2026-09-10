package com.akexorcist.roundcornerprogressbar.indeterminate;

import android.view.View;
import android.widget.LinearLayout;
import com.akexorcist.roundcornerprogressbar.CenteredRoundCornerProgressBar;

/* JADX INFO: loaded from: classes.dex */
public class IndeterminateCenteredRoundCornerProgressBar extends CenteredRoundCornerProgressBar {
    @Override // com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar, com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public final void initView() {
        super.initView();
        setMax(100.0f);
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar
    public final void onProgressChangeAnimationEnd(LinearLayout linearLayout) {
        if (isShown()) {
            disableAnimation();
            setProgress(0);
            enableAnimation();
            setProgress(100);
        }
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar
    public final void onProgressChangeAnimationUpdate(LinearLayout linearLayout, float f, float f2) {
        super.onProgressChangeAnimationUpdate(linearLayout, f, f2);
        if (isShown()) {
            return;
        }
        super.stopProgressAnimationImmediately();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 == 0) {
            disableAnimation();
            setProgress(0);
            enableAnimation();
            setProgress(100);
        }
    }
}

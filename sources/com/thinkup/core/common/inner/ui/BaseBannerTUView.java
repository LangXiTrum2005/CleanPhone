package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.thinkup.core.common.inner.oo.oo;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.ooo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseBannerTUView extends BaseTUView {
    public final String TAG;
    protected CloseImageView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected com.thinkup.core.common.inner.ui.oo.o f41834n;
    protected com.thinkup.core.common.inner.oo.o o;

    public BaseBannerTUView(Context context) {
        super(context);
        this.TAG = getClass().getSimpleName();
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public final void a_() {
        if (this.o != null) {
            new oo();
        }
    }

    public final void m() {
        CloseImageView closeImageView = this.m;
        if (closeImageView != null) {
            closeImageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.thinkup.core.common.inner.ui.BaseBannerTUView.1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    com.thinkup.core.common.inner.oo.o oVar;
                    if (motionEvent.getAction() != 0 || (oVar = BaseBannerTUView.this.o) == null) {
                        return true;
                    }
                    oVar.m();
                    return true;
                }
            });
        }
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public final void o(oo ooVar) {
    }

    @Override // com.thinkup.core.common.inner.ui.BaseTUView
    public final void o(boolean z2) {
    }

    public BaseBannerTUView(Context context, oom oomVar, ooo oooVar, com.thinkup.core.common.inner.oo.o oVar) {
        super(context, oomVar, oooVar);
        this.TAG = getClass().getSimpleName();
        this.o = oVar;
    }
}

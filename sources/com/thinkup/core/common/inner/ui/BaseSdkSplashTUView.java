package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.widget.ImageView;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ui.component.RoundImageView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseSdkSplashTUView extends BaseSplashTUView {
    ImageView m0;
    protected boolean mo;
    protected MuteImageView om;
    ImageView on;
    protected RoundImageView oo;

    public BaseSdkSplashTUView(Context context) {
        super(context);
        this.mo = false;
    }

    public abstract void m();

    public void n() {
        this.mo = true;
    }

    public void o0() {
        m();
        this.oo = (RoundImageView) findViewById(o00.o(getContext(), "myoffer_ad_logo", "id"));
        this.on = (ImageView) findViewById(o00.o(getContext(), "myoffer_player_view_cover_img_id", "id"));
        this.m0 = (ImageView) findViewById(o00.o(getContext(), "myoffer_player_view_cover_icon_id", "id"));
        n();
    }

    public BaseSdkSplashTUView(Context context, oom oomVar, ooo oooVar, com.thinkup.core.common.inner.oo.o oVar) {
        super(context, oomVar, oooVar, oVar);
        this.mo = false;
    }
}

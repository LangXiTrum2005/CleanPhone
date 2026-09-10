package com.mbridge.msdk.newreward.player.view;

import android.content.Context;
import androidx.annotation.NonNull;
import com.mbridge.msdk.newreward.player.presenter.PlayTemplePresenter;

/* JADX INFO: loaded from: classes2.dex */
public class Template302 extends BaseTemplate {
    public Template302(@NonNull Context context) {
        super(context);
        PlayTemplePresenter playTemplePresenter = new PlayTemplePresenter(this);
        this.presenter = playTemplePresenter;
        playTemplePresenter.getView();
    }
}

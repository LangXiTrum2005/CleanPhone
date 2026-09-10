package com.mbridge.msdk.newreward.player.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.newreward.player.presenter.PlayTemplePresenter;

/* JADX INFO: loaded from: classes2.dex */
public class Template904 extends BaseTemplate {
    public Template904(@NonNull Context context) {
        super(context);
        PlayTemplePresenter playTemplePresenter = new PlayTemplePresenter(this);
        this.presenter = playTemplePresenter;
        playTemplePresenter.getView();
    }

    @Override // com.mbridge.msdk.newreward.player.view.BaseTemplate, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public Template904(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

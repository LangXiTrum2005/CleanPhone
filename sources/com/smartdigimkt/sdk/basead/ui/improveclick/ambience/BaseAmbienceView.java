package com.smartdigimkt.sdk.basead.ui.improveclick.ambience;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.smartdigimkt.v6.a;
import com.smartdigimkt.w5.c;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseAmbienceView extends RelativeLayout {
    protected c.a e0;

    public BaseAmbienceView(Context context) {
        super(context);
        initView();
    }

    public abstract void initSetting(a aVar, c.a aVar2);

    public abstract void initView();

    public abstract void onPause();

    public abstract void onResume();

    public abstract void release();

    public BaseAmbienceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    public BaseAmbienceView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        initView();
    }
}

package com.smartdigimkt.expressad.video.module;

import android.content.Context;
import android.util.AttributeSet;
import com.smartdigimkt.y2.b;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkPlayableView extends AnythinkH5EndCardView {
    public AnythinkPlayableView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView
    public String getURL() {
        return super.getURL();
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView, com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        super.init(context);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView
    public void onBackPress() {
        super.onBackPress();
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView, com.smartdigimkt.x2.f
    public void preLoadData(b bVar) {
        super.preLoadData(bVar);
        super.setLoadPlayable(true);
    }

    public AnythinkPlayableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

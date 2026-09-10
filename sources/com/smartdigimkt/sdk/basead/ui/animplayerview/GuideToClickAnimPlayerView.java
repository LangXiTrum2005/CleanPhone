package com.smartdigimkt.sdk.basead.ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.smartdigimkt.k5.d;
import com.smartdigimkt.sdk.basead.ui.GuideToClickView;
import com.smartdigimkt.v6.a;
import com.smartdigimkt.w6.f;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class GuideToClickAnimPlayerView extends BaseAnimPlayerView {
    private GuideToClickView G0;

    public GuideToClickAnimPlayerView(Context context) {
        super(context);
    }

    private void a(Context context) {
        Bitmap bitmap;
        e();
        GuideToClickView guideToClickView = new GuideToClickView(context);
        this.G0 = guideToClickView;
        addView(guideToClickView, -1, -1);
        List<Bitmap> list = this.A0;
        if (list == null || list.size() <= 0 || (bitmap = this.A0.get(0)) == null || bitmap.isRecycled()) {
            return;
        }
        this.G0.setFingerImageResource(bitmap);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void c() {
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void d() {
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void f() {
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void h() {
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView, com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void init(f fVar, a aVar, boolean z2, List<Bitmap> list, d dVar) {
        super.init(fVar, aVar, z2, list, dVar);
        a(getContext().getApplicationContext());
    }

    public GuideToClickAnimPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GuideToClickAnimPlayerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}

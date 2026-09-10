package com.smartdigimkt.sdk.basead.ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.smartdigimkt.k5.d;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.animplayerview.redpacket.RedPacketAnimatorView;
import com.smartdigimkt.v6.a;
import com.smartdigimkt.w6.f;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class RedPacketAnimPlayerView extends BaseMainAnimPlayerView {
    private List<Bitmap> G0;
    private RedPacketAnimatorView H0;

    public RedPacketAnimPlayerView(Context context) {
        this(context, null);
    }

    private ViewGroup.LayoutParams getLayoutParamsByOrientation() {
        if (!h.g(getContext())) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(getContext().getResources().getDisplayMetrics().heightPixels, -1);
        layoutParams.addRule(13);
        return layoutParams;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseMainAnimPlayerView
    public void a(Context context) {
        super.a(context);
        RedPacketAnimatorView redPacketAnimatorView = new RedPacketAnimatorView(context);
        this.H0 = redPacketAnimatorView;
        redPacketAnimatorView.setLayoutParams(getLayoutParamsByOrientation());
        this.H0.setBitmapResources(this.G0);
        addView(this.H0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void c() {
        RedPacketAnimatorView redPacketAnimatorView = this.H0;
        if (redPacketAnimatorView != null) {
            redPacketAnimatorView.pause();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void d() {
        RedPacketAnimatorView redPacketAnimatorView = this.H0;
        if (redPacketAnimatorView != null) {
            redPacketAnimatorView.release();
            this.H0 = null;
        }
        List<Bitmap> list = this.G0;
        if (list != null) {
            for (Bitmap bitmap : list) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void f() {
        RedPacketAnimatorView redPacketAnimatorView = this.H0;
        if (redPacketAnimatorView != null) {
            redPacketAnimatorView.start();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void h() {
        RedPacketAnimatorView redPacketAnimatorView = this.H0;
        if (redPacketAnimatorView != null) {
            redPacketAnimatorView.stop();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseMainAnimPlayerView, com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView, com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void init(f fVar, a aVar, boolean z2, List<Bitmap> list, d dVar) {
        this.G0 = list;
        super.init(fVar, aVar, z2, list, dVar);
    }

    public RedPacketAnimPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RedPacketAnimPlayerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}

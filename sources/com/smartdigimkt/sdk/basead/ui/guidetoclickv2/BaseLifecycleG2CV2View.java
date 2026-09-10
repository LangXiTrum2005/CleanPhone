package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.smartdigimkt.w5.c;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseLifecycleG2CV2View extends BaseG2CV2View {
    private GTCV2InnerCountDownView l0;

    public class a implements GTCV2InnerCountDownView.g {
        public a() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.g
        public void a() {
            BaseLifecycleG2CV2View baseLifecycleG2CV2View = BaseLifecycleG2CV2View.this;
            c.a aVar = baseLifecycleG2CV2View.i0;
            if (aVar != null) {
                aVar.a(11, baseLifecycleG2CV2View.getClickArea());
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.GTCV2InnerCountDownView.g
        public void onClose() {
            BaseLifecycleG2CV2View.this.a();
        }
    }

    public BaseLifecycleG2CV2View(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void b() {
        GTCV2InnerCountDownView gTCV2InnerCountDownView = this.l0;
        if (gTCV2InnerCountDownView != null) {
            gTCV2InnerCountDownView.onPause();
        } else {
            super.b();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void c() throws Throwable {
        GTCV2InnerCountDownView gTCV2InnerCountDownView = this.l0;
        if (gTCV2InnerCountDownView != null) {
            gTCV2InnerCountDownView.onResume();
        } else {
            super.c();
        }
    }

    public void d() throws Throwable {
        if (this.l0 == null) {
            this.l0 = new GTCV2InnerCountDownView(getContext());
            addView(this.l0, new ViewGroup.MarginLayoutParams(-1, -1));
            this.l0.initSetting(new a());
        }
        com.smartdigimkt.l7.b.a().a(this.h0);
    }

    public abstract int getClickArea();

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void init(long j, int i2, int i3, c.a aVar, BaseG2CV2View.c cVar) {
        super.init(j, i2, i3, aVar, cVar);
        c.a aVar2 = this.i0;
        if (aVar2 instanceof c.b) {
            ((c.b) aVar2).a();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void pauseAnimPlay() {
        GTCV2InnerCountDownView gTCV2InnerCountDownView = this.l0;
        if (gTCV2InnerCountDownView != null) {
            gTCV2InnerCountDownView.onPause();
        } else {
            super.pauseAnimPlay();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        GTCV2InnerCountDownView gTCV2InnerCountDownView = this.l0;
        if (gTCV2InnerCountDownView != null) {
            gTCV2InnerCountDownView.release();
        }
        c.a aVar = this.i0;
        if (aVar instanceof c.b) {
            ((c.b) aVar).b();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void resumeAnimPlay() throws Throwable {
        GTCV2InnerCountDownView gTCV2InnerCountDownView = this.l0;
        if (gTCV2InnerCountDownView != null) {
            gTCV2InnerCountDownView.onResume();
        } else {
            super.resumeAnimPlay();
        }
    }

    public BaseLifecycleG2CV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseLifecycleG2CV2View(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}

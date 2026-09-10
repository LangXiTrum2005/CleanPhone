package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.smartdigimkt.sdk.basead.ui.GuideToClickView;
import com.smartdigimkt.w5.c;

/* JADX INFO: loaded from: classes6.dex */
public class FingerG2CV2View extends BaseG2CV2View {
    GuideToClickView l0;
    int m0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.a aVar = FingerG2CV2View.this.i0;
            if (aVar != null) {
                aVar.a(11, 20);
            }
        }
    }

    public FingerG2CV2View(Context context) {
        super(context);
        this.m0 = 501;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void a(int i2, int i3) {
        setGravity(17);
        GuideToClickView guideToClickView = new GuideToClickView(getContext());
        this.l0 = guideToClickView;
        guideToClickView.setFingerViewMode(this.m0);
        addView(this.l0, -2, -2);
        setClipChildren(false);
        if (this.i0 != null) {
            setOnClickListener(new a());
        }
    }

    public void setFingerViewMode(int i2) {
        if (i2 == 503) {
            setBackgroundColor(Color.parseColor("#66000000"));
        }
        this.m0 = i2;
        GuideToClickView guideToClickView = this.l0;
        if (guideToClickView != null) {
            guideToClickView.setFingerViewMode(i2);
        }
    }
}

package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.content.Context;
import android.view.View;
import com.smartdigimkt.sdk.basead.ui.GuideToClickV2View;
import com.smartdigimkt.w5.c;

/* JADX INFO: loaded from: classes6.dex */
public class FingerNewG2CV2View extends BaseG2CV2View {
    GuideToClickV2View l0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.a aVar = FingerNewG2CV2View.this.i0;
            if (aVar != null) {
                aVar.a(11, 47);
            }
        }
    }

    public FingerNewG2CV2View(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void a(int i2, int i3) {
        setGravity(17);
        GuideToClickV2View guideToClickV2View = new GuideToClickV2View(getContext());
        this.l0 = guideToClickV2View;
        guideToClickV2View.setFingerViewType(i2);
        addView(this.l0, -1, -1);
        setClipChildren(false);
        if (this.i0 != null) {
            setOnClickListener(new a());
        }
    }
}

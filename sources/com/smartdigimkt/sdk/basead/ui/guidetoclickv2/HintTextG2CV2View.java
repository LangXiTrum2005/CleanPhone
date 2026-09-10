package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.w5.c;

/* JADX INFO: loaded from: classes6.dex */
public class HintTextG2CV2View extends BaseG2CV2View {

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.a aVar = HintTextG2CV2View.this.i0;
            if (aVar != null) {
                aVar.a(11, 18);
            }
        }
    }

    public HintTextG2CV2View(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void a(int i2, int i3) {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_g2c_v2_hint_text", "layout"), this);
        View viewFindViewById = findViewById(h.a(getContext(), "myoffer_g2c_click_text", "id"));
        View viewFindViewById2 = findViewById(h.a(getContext(), "myoffer_g2c_hint_text", "id"));
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new a());
        }
        if (i2 != 2) {
            if (i3 == 2) {
                if (viewFindViewById != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams();
                    layoutParams.addRule(11, 0);
                    layoutParams.addRule(14);
                    layoutParams.setMargins(0, h.a(getContext(), 12.0f), 0, 0);
                    viewFindViewById.setLayoutParams(layoutParams);
                }
                if (viewFindViewById2 == null || !(viewFindViewById2 instanceof TextView)) {
                    return;
                }
                ((TextView) viewFindViewById2).setGravity(17);
                return;
            }
            return;
        }
        if (viewFindViewById != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams();
            layoutParams2.addRule(11, 0);
            layoutParams2.addRule(14);
            layoutParams2.setMargins(0, h.a(getContext(), 12.0f), 0, 0);
            viewFindViewById.setLayoutParams(layoutParams2);
        }
        if (viewFindViewById2 != null) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) viewFindViewById2.getLayoutParams();
            layoutParams3.setMargins(h.a(getContext(), 60.0f), h.a(getContext(), 18.0f), h.a(getContext(), 60.0f), 0);
            viewFindViewById2.setLayoutParams(layoutParams3);
            if (viewFindViewById2 instanceof TextView) {
                TextView textView = (TextView) viewFindViewById2;
                textView.setGravity(17);
                textView.setTextSize(1, 14.0f);
            }
        }
    }
}

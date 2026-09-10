package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w5.c;

/* JADX INFO: loaded from: classes6.dex */
public class JumpConfirmG2CV2View extends BaseG2CV2View {
    private TextView l0;
    private LinearLayout m0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.a aVar = JumpConfirmG2CV2View.this.i0;
            if (aVar != null) {
                aVar.a(11, 19);
            }
        }
    }

    public JumpConfirmG2CV2View(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void a(int i2, int i3) {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_g2c_v2_jump_confirm", "layout"), this);
        setBackgroundResource(h.a(getContext(), "myoffer_g2c_jump_confirm_bg", k.d));
        this.m0 = (LinearLayout) findViewById(h.a(getContext(), "myoffer_ll_jump_confirm_container", "id"));
        TextView textView = (TextView) findViewById(h.a(getContext(), "myoffer_g2c_jump_confirm_ignore", "id"));
        this.l0 = textView;
        textView.setOnClickListener(new a());
        if (i2 != 2) {
            this.m0.setPadding(h.a(getContext(), 18.0f), 0, 0, 0);
        }
    }
}

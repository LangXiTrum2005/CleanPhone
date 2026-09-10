package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes6.dex */
public class ClickToReLoadView extends LinearLayout {
    private ImageView e0;
    private TextView f0;
    private b g0;
    private int h0;

    public class a implements View.OnClickListener {
        long X;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.X > 1000) {
                this.X = jCurrentTimeMillis;
                if (ClickToReLoadView.this.g0 != null) {
                    ClickToReLoadView.this.g0.a();
                }
            }
        }
    }

    public interface b {
        void a();
    }

    public ClickToReLoadView(Context context) {
        super(context);
        a(context);
        a();
    }

    private void b() {
        try {
            this.e0.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f0.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.topMargin = 0;
                this.f0.setLayoutParams(layoutParams);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (getHeight() < h.a(getContext(), 100.0f)) {
            b();
        }
    }

    public void setListener(b bVar) {
        this.g0 = bVar;
    }

    private void a(Context context) {
        setOrientation(1);
        setGravity(17);
        this.h0 = h.a(context, 10.0f);
        ImageView imageView = new ImageView(context);
        this.e0 = imageView;
        imageView.setImageResource(h.a(context, "myoffer_webview_reload_icon", k.d));
        int iA = h.a(context, 30.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iA, iA);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = this.h0;
        TextView textView = new TextView(context);
        this.f0 = textView;
        textView.setText(getResources().getText(h.a(context, "myoffer_webview_reload", k.f38992h)));
        this.f0.setTextColor(getResources().getColor(h.a(context, "color_reload_button", "color")));
        this.f0.setBackgroundResource(h.a(context, "myoffer_webview_bg_reload_button", k.d));
        int iA2 = h.a(context, 9.0f);
        int iA3 = h.a(context, 5.0f);
        this.f0.setPadding(iA2, iA3, iA2, iA3);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = this.h0;
        addView(this.e0, layoutParams);
        addView(this.f0, layoutParams2);
    }

    private void a() {
        this.f0.setOnClickListener(new a());
    }
}

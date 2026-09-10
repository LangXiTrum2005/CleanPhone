package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes6.dex */
public class CloseHeaderView extends RelativeLayout {
    private ViewGroup e0;
    private CloseImageView f0;
    private TextView g0;
    private String h0;
    private String i0;
    private long j0;
    private long k0;

    public CloseHeaderView(Context context) {
        super(context);
        this.h0 = "";
        this.i0 = "";
        a();
    }

    private void a() {
        setBackgroundColor(Color.parseColor("#000000"));
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_close_header_view", "layout"), this);
        this.e0 = (ViewGroup) findViewById(h.a(getContext(), "myoffer_feedback_ll_nobg_id", "id"));
        this.f0 = (CloseImageView) findViewById(h.a(getContext(), "myoffer_btn_close_ch_id", "id"));
        this.g0 = (TextView) findViewById(h.a(getContext(), "myoffer_tv_countdown_text", "id"));
        this.h0 = getContext().getString(h.a(getContext(), "myoffer_count_down_to_rewarded", k.f38992h));
        this.i0 = getContext().getString(h.a(getContext(), "myoffer_count_down_finish_rewarded", k.f38992h));
    }

    public CloseImageView getCloseImageView() {
        return this.f0;
    }

    public ViewGroup getFeedbackButton() {
        return this.e0;
    }

    public void refresh(long j) {
        this.k0 = j;
        long j2 = this.j0;
        if (j >= j2) {
            this.g0.setText(this.i0);
            this.g0.setTextColor(-1);
        } else {
            this.g0.setText(Html.fromHtml(String.format(this.h0, Integer.valueOf((int) Math.ceil((j2 - j) / 1000.0d)))));
        }
    }

    public void setDuration(long j) {
        this.j0 = j;
    }

    public CloseHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h0 = "";
        this.i0 = "";
        a();
    }

    public CloseHeaderView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h0 = "";
        this.i0 = "";
        a();
    }
}

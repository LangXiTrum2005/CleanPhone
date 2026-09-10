package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GradientDrawable f8611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Button f8612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.a f8613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f8614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxAdFormat f8615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f8616f;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    private int a(b bVar) {
        if (b.LOAD == bVar) {
            return getContext().getColor(R.color.applovin_sdk_brand_color);
        }
        return b.LOADING == bVar ? getContext().getColor(R.color.applovin_sdk_brand_color) : getContext().getColor(R.color.applovin_sdk_adControlbutton_brightBlueColor);
    }

    private String b(b bVar) {
        if (b.LOAD == bVar) {
            return "Load";
        }
        return b.LOADING == bVar ? "" : "Show";
    }

    private void c(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.f8613c.a();
        } else {
            setEnabled(true);
            this.f8613c.b();
        }
        this.f8612b.setText(b(bVar));
        this.f8611a.setColor(a(bVar));
    }

    public b getControlState() {
        return this.f8614d;
    }

    public MaxAdFormat getFormat() {
        return this.f8615e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f8616f;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.f8614d != bVar) {
            c(bVar);
        }
        this.f8614d = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f8615e = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f8616f = aVar;
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f8611a = gradientDrawable;
        Button button = new Button(getContext());
        this.f8612b = button;
        com.applovin.impl.a aVar = new com.applovin.impl.a(getContext(), 20, android.R.attr.progressBarStyleSmall);
        this.f8613c = aVar;
        b bVar = b.LOAD;
        this.f8614d = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        aVar.setColor(-1);
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
        c(bVar);
    }

    private void a() {
        this.f8612b.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{getContext().getColor(R.color.applovin_sdk_highlightTextColor), -1}));
    }
}

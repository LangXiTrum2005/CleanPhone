package com.facebook.ads.redexgen.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1967e3 extends RelativeLayout {
    public final Paint A00;
    public final RectF A01;

    public C1967e3(C2131gi c2131gi, String str) {
        super(c2131gi);
        float f = c2131gi.getResources().getDisplayMetrics().density;
        TextView textView = new TextView(c2131gi);
        textView.setTextColor(-16777216);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        float density = 6.0f * f;
        int i = (int) density;
        textView.setPadding(i, i, i, i);
        addView(textView);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        this.A00.setColor(-1);
        this.A01 = new RectF();
        YB.A0N(this, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.A01.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight());
        canvas.drawRoundRect(this.A01, f * 10.0f, 10.0f * f, this.A00);
        super.onDraw(canvas);
    }
}

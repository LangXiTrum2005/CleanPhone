package com.smartdigimkt.expressad.video.dynview.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.smartdigimkt.v0.k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class AnyThinkSegmentsProgressBar extends LinearLayout {
    private final String e0;
    private int f0;
    private int g0;
    private int h0;
    private int i0;
    private int j0;
    private int k0;
    private int l0;
    private List<ProgressBar> m0;
    private TextView n0;
    private String o0;
    private boolean p0;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AnyThinkSegmentsProgressBar.this.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public AnyThinkSegmentsProgressBar(Context context) {
        super(context);
        this.e0 = "AnyThinkSegmentsProgressBar";
        this.g0 = 1;
        this.h0 = 20;
        this.i0 = 10;
        this.j0 = 1;
        this.k0 = -1711276033;
        this.l0 = -1;
        this.m0 = new ArrayList();
        this.p0 = false;
    }

    private void a() {
        Drawable drawable;
        try {
            if (this.g0 == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.o0)) {
                    this.o0 = getContext().getString(k.a(getContext(), "sdm_cm_segment_process_bar_hint_text", k.f38992h));
                }
            }
            if (this.g0 == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.o0)) {
                    this.o0 = getContext().getString(k.a(getContext(), "sdm_cm_segment_process_bar_hint_text_lite", k.f38992h));
                }
            }
            this.m0.clear();
            removeAllViews();
            setBackgroundDrawable(getBackgroundDrawable());
            TextView textView = new TextView(getContext());
            this.n0 = textView;
            textView.setTextColor(-1);
            this.n0.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.n0.setLayoutParams(layoutParams);
            if (this.g0 == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.n0;
                int i2 = this.h0;
                textView2.setPadding(i2 / 2, 15, i2 / 2, 5);
            }
            if (this.g0 == 2) {
                this.n0.setGravity(16);
                TextView textView3 = this.n0;
                int i3 = this.h0;
                textView3.setPadding(i3 / 2, 0, i3 / 2, 0);
            }
            try {
                int iA = k.a(getContext(), "sdm_reward_video_icon", k.d);
                if (iA != 0 && (drawable = getContext().getResources().getDrawable(iA)) != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.n0.setCompoundDrawables(drawable, null, null, null);
                    this.n0.setCompoundDrawablePadding(5);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            this.n0.setText(a(this.j0));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i4 = 0; i4 < this.f0; i4++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(getSegmentLayerDrawable());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i5 = this.h0;
                layoutParams3.leftMargin = i5 / 2;
                layoutParams3.rightMargin = i5 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.m0.add(progressBar);
            }
            int i6 = this.g0;
            if (i6 == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.n0);
                addView(linearLayout);
            } else {
                if (i6 != 2) {
                    addView(linearLayout);
                    return;
                }
                setPadding(15, 0, 15, 25);
                layoutParams2.gravity = 16;
                layoutParams2.weight = 1.0f;
                addView(linearLayout);
                addView(this.n0);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private GradientDrawable getBackgroundDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setDither(true);
        try {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setColors(new int[]{0, 1291845632});
        } catch (Throwable unused) {
        }
        return gradientDrawable;
    }

    private LayerDrawable getSegmentLayerDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.i0);
        gradientDrawable.setColor(this.k0);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.i0);
        gradientDrawable2.setColor(this.l0);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimationE = androidx.media3.extractor.text.ttml.a.e(1.0f, 0.0f, 1000L);
        alphaAnimationE.setAnimationListener(new a());
        startAnimation(alphaAnimationE);
    }

    public void init(int i2, int i3) {
        this.f0 = i2;
        this.g0 = i3;
        a();
    }

    public void setIndicatorText(String str) {
        this.o0 = str;
    }

    public void setProgress(int i2, int i3) {
        try {
            if (this.m0.size() == 0) {
                return;
            }
            if (i3 < this.m0.size()) {
                this.m0.get(i3).setProgress(i2);
            }
            int i4 = i3 + 1;
            if (i4 > this.j0) {
                this.j0 = i4;
                TextView textView = this.n0;
                if (textView != null) {
                    textView.setText(a(i4));
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void init(int i2, int i3, int i4, int i5) {
        this.f0 = i2;
        this.g0 = i3;
        this.l0 = i4;
        this.k0 = i5;
        a();
    }

    public void init(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f0 = i2;
        this.g0 = i3;
        this.l0 = i4;
        this.k0 = i5;
        this.h0 = i6;
        this.i0 = i7;
        a();
    }

    public AnyThinkSegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = "AnyThinkSegmentsProgressBar";
        this.g0 = 1;
        this.h0 = 20;
        this.i0 = 10;
        this.j0 = 1;
        this.k0 = -1711276033;
        this.l0 = -1;
        this.m0 = new ArrayList();
        this.p0 = false;
    }

    public AnyThinkSegmentsProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = "AnyThinkSegmentsProgressBar";
        this.g0 = 1;
        this.h0 = 20;
        this.i0 = 10;
        this.j0 = 1;
        this.k0 = -1711276033;
        this.l0 = -1;
        this.m0 = new ArrayList();
        this.p0 = false;
    }

    public AnyThinkSegmentsProgressBar(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.e0 = "AnyThinkSegmentsProgressBar";
        this.g0 = 1;
        this.h0 = 20;
        this.i0 = 10;
        this.j0 = 1;
        this.k0 = -1711276033;
        this.l0 = -1;
        this.m0 = new ArrayList();
        this.p0 = false;
    }

    private StringBuilder a(int i2) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format(this.o0, Integer.valueOf(i2), Integer.valueOf(this.f0)));
            return sb;
        } catch (Throwable th) {
            androidx.datastore.preferences.protobuf.a.y(sb, this.f0, "videos, the", i2, " is playing.");
            th.getMessage();
            return sb;
        }
    }
}

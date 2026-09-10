package com.mbridge.msdk.dycreator.baseview.cusview;

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
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBridgeSegmentsProgressBar extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<ProgressBar> f33025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f33026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f33027k;
    private boolean l;

    public MBridgeSegmentsProgressBar(Context context) {
        super(context);
        this.f33017a = "MBridgeSegmentsProgressBar";
        this.f33019c = 1;
        this.f33020d = 20;
        this.f33021e = 10;
        this.f33022f = 1;
        this.f33023g = -1711276033;
        this.f33024h = -1;
        this.f33025i = new ArrayList();
        this.l = false;
    }

    private void a() {
        Drawable drawable;
        try {
            this.l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
        try {
            if (this.f33019c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f33027k)) {
                    this.f33027k = this.l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
                }
            }
            if (this.f33019c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f33027k)) {
                    this.f33027k = this.l ? "广告 %s/%s" : "ADS %s/%s";
                }
            }
            this.f33025i.clear();
            removeAllViews();
            setBackground(getBackgroundDrawable());
            TextView textView = new TextView(getContext());
            this.f33026j = textView;
            textView.setTextColor(-1);
            this.f33026j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f33026j.setLayoutParams(layoutParams);
            if (this.f33019c == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.f33026j;
                int i10 = this.f33020d;
                textView2.setPadding(i10 / 2, 15, i10 / 2, 5);
            }
            if (this.f33019c == 2) {
                this.f33026j.setGravity(16);
                TextView textView3 = this.f33026j;
                int i11 = this.f33020d;
                textView3.setPadding(i11 / 2, 0, i11 / 2, 0);
            }
            try {
                int iA = i0.a(getContext(), "mbridge_reward_video_icon", "drawable");
                if (i0.a(iA) && (drawable = getContext().getResources().getDrawable(iA)) != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f33026j.setCompoundDrawables(drawable, null, null, null);
                    this.f33026j.setCompoundDrawablePadding(5);
                }
            } catch (Throwable th3) {
                q0.b("MBridgeSegmentsProgressBar", th3.getMessage());
            }
            this.f33026j.setText(a(this.f33022f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i12 = 0; i12 < this.f33018b; i12++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(getSegmentLayerDrawable());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i13 = this.f33020d;
                layoutParams3.leftMargin = i13 / 2;
                layoutParams3.rightMargin = i13 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.f33025i.add(progressBar);
            }
            int i14 = this.f33019c;
            if (i14 == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.f33026j);
                addView(linearLayout);
            } else {
                if (i14 != 2) {
                    addView(linearLayout);
                    return;
                }
                setPadding(15, 0, 15, 25);
                layoutParams2.gravity = 16;
                layoutParams2.weight = 1.0f;
                addView(linearLayout);
                addView(this.f33026j);
            }
        } catch (Throwable th4) {
            q0.b("MBridgeSegmentsProgressBar", th4.getMessage());
        }
    }

    private GradientDrawable getBackgroundDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setDither(true);
        gradientDrawable.setColors(new int[]{0, 1291845632});
        return gradientDrawable;
    }

    private LayerDrawable getSegmentLayerDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f33021e);
        gradientDrawable.setColor(this.f33023g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f33021e);
        gradientDrawable2.setColor(this.f33024h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeSegmentsProgressBar.this.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(alphaAnimation);
    }

    public void init(int i10, int i11) {
        this.f33018b = i10;
        this.f33019c = i11;
        a();
    }

    public void setIndicatorText(String str) {
        this.f33027k = str;
    }

    public void setProgress(int i10, int i11) {
        try {
            if (this.f33025i.size() == 0) {
                return;
            }
            if (i11 < this.f33025i.size()) {
                this.f33025i.get(i11).setProgress(i10);
            }
            int i12 = i11 + 1;
            if (i12 > this.f33022f) {
                this.f33022f = i12;
                TextView textView = this.f33026j;
                if (textView != null) {
                    textView.setText(a(i12));
                }
            }
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
    }

    public void init(int i10, int i11, int i12, int i13) {
        this.f33018b = i10;
        this.f33019c = i11;
        this.f33024h = i12;
        this.f33023g = i13;
        a();
    }

    public void init(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f33018b = i10;
        this.f33019c = i11;
        this.f33024h = i12;
        this.f33023g = i13;
        this.f33020d = i14;
        this.f33021e = i15;
        a();
    }

    public MBridgeSegmentsProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33017a = "MBridgeSegmentsProgressBar";
        this.f33019c = 1;
        this.f33020d = 20;
        this.f33021e = 10;
        this.f33022f = 1;
        this.f33023g = -1711276033;
        this.f33024h = -1;
        this.f33025i = new ArrayList();
        this.l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f33017a = "MBridgeSegmentsProgressBar";
        this.f33019c = 1;
        this.f33020d = 20;
        this.f33021e = 10;
        this.f33022f = 1;
        this.f33023g = -1711276033;
        this.f33024h = -1;
        this.f33025i = new ArrayList();
        this.l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f33017a = "MBridgeSegmentsProgressBar";
        this.f33019c = 1;
        this.f33020d = 20;
        this.f33021e = 10;
        this.f33022f = 1;
        this.f33023g = -1711276033;
        this.f33024h = -1;
        this.f33025i = new ArrayList();
        this.l = false;
    }

    private StringBuilder a(int i10) {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append(String.format(this.f33027k, Integer.valueOf(i10), Integer.valueOf(this.f33018b)));
            return sb2;
        } catch (Throwable th2) {
            d.o(sb2, this.f33018b, "videos, the", i10, " is playing.");
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
            return sb2;
        }
    }
}

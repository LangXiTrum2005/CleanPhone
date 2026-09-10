package com.mbridge.msdk.config.dynamic.baseview.cusview;

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
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class SegmentsProgressBar extends ComponentLinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<ProgressBar> f32600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f32601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f32602k;
    private boolean l;

    public SegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32592a = "MBridgeSegmentsProgressBar";
        this.f32594c = 1;
        this.f32595d = 20;
        this.f32596e = 10;
        this.f32597f = 1;
        this.f32598g = -1711276033;
        this.f32599h = -1;
        this.f32600i = new ArrayList();
        this.l = false;
    }

    private void a() {
        Drawable drawable;
        try {
            this.l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
        int i10 = this.f32594c;
        if (i10 == 1) {
            setOrientation(1);
            if (TextUtils.isEmpty(this.f32602k)) {
                this.f32602k = this.l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
            }
        } else if (i10 == 2) {
            setOrientation(0);
            if (TextUtils.isEmpty(this.f32602k)) {
                this.f32602k = this.l ? "广告 %s/%s" : "ADS %s/%s";
            }
        }
        this.f32600i.clear();
        removeAllViews();
        setBackground(getBackgroundDrawable());
        TextView textView = new TextView(getContext());
        this.f32601j = textView;
        textView.setTextColor(-1);
        this.f32601j.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.f32601j.setLayoutParams(layoutParams);
        int i11 = this.f32594c;
        if (i11 == 1) {
            layoutParams.gravity = 5;
            TextView textView2 = this.f32601j;
            int i12 = this.f32595d / 2;
            textView2.setPadding(i12, 15, i12, 5);
        } else if (i11 == 2) {
            this.f32601j.setGravity(16);
            TextView textView3 = this.f32601j;
            int i13 = this.f32595d / 2;
            textView3.setPadding(i13, 0, i13, 0);
        }
        try {
            int iA = i0.a(getContext(), "mbridge_reward_video_icon", "drawable");
            if (i0.a(iA) && (drawable = getContext().getResources().getDrawable(iA)) != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                this.f32601j.setCompoundDrawables(drawable, null, null, null);
                this.f32601j.setCompoundDrawablePadding(5);
            }
        } catch (Throwable th3) {
            q0.b("MBridgeSegmentsProgressBar", th3.getMessage());
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
        linearLayout.setLayoutParams(layoutParams2);
        for (int i14 = 0; i14 < this.f32593b; i14++) {
            ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
            progressBar.setMax(100);
            progressBar.setProgress(0);
            progressBar.setProgressDrawable(getSegmentLayerDrawable());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
            int i15 = this.f32595d / 2;
            layoutParams3.leftMargin = i15;
            layoutParams3.rightMargin = i15;
            progressBar.setLayoutParams(layoutParams3);
            linearLayout.addView(progressBar);
            this.f32600i.add(progressBar);
        }
        int i16 = this.f32594c;
        if (i16 == 1) {
            setPadding(15, 10, 15, 25);
            addView(this.f32601j);
            addView(linearLayout);
        } else {
            if (i16 != 2) {
                addView(linearLayout);
                return;
            }
            setPadding(15, 0, 15, 25);
            layoutParams2.gravity = 16;
            layoutParams2.weight = 1.0f;
            addView(linearLayout);
            addView(this.f32601j);
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
        gradientDrawable.setCornerRadius(this.f32596e);
        gradientDrawable.setColor(this.f32598g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f32596e);
        gradientDrawable2.setColor(this.f32599h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new a());
        startAnimation(alphaAnimation);
    }

    public void init(int i10, int i11) {
        this.f32593b = i10;
        this.f32594c = i11;
        a();
    }

    public void setIndicatorText(String str) {
        this.f32602k = str;
    }

    public void setProgress(int i10, int i11) {
        try {
            if (this.f32600i.isEmpty()) {
                return;
            }
            if (i11 < this.f32600i.size()) {
                this.f32600i.get(i11).setProgress(i10);
            }
            int i12 = i11 + 1;
            if (i12 > this.f32597f) {
                this.f32597f = i12;
                TextView textView = this.f32601j;
                if (textView != null) {
                    textView.setText(a(i12));
                }
            }
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            this.f32593b = Integer.parseInt(String.valueOf(map.get("count")));
        } catch (Throwable th2) {
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
            this.f32593b = 1;
        }
        try {
            this.f32594c = Integer.parseInt(String.valueOf(map.get(TtmlNode.TAG_STYLE)));
        } catch (Throwable th3) {
            q0.b("MBridgeSegmentsProgressBar", th3.getMessage());
            this.f32594c = 0;
        }
        init(this.f32593b, this.f32594c);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String lowerCase = str.toLowerCase();
        String strValueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(strValueOf) || strValueOf.equalsIgnoreCase("null")) {
            return;
        }
        int i11 = 0;
        try {
            if (lowerCase.contains("percent") || lowerCase.contains(NotificationCompat.CATEGORY_PROGRESS)) {
                i10 = strValueOf.contains(".") ? (int) (Double.parseDouble(strValueOf) * 100.0d) : Integer.parseInt(strValueOf);
            } else {
                i10 = 0;
            }
            try {
                if (lowerCase.contains("index")) {
                    i11 = Integer.parseInt(strValueOf);
                }
            } catch (Throwable th2) {
                th = th2;
                q0.b("MBridgeSegmentsProgressBar", th.getMessage());
            }
        } catch (Throwable th3) {
            th = th3;
            i10 = 0;
        }
        setProgress(i10, i11);
    }

    public void init(int i10, int i11, int i12, int i13) {
        this.f32593b = i10;
        this.f32594c = i11;
        this.f32599h = i12;
        this.f32598g = i13;
        a();
    }

    public void init(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f32593b = i10;
        this.f32594c = i11;
        this.f32599h = i12;
        this.f32598g = i13;
        this.f32595d = i14;
        this.f32596e = i15;
        a();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SegmentsProgressBar.this.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    private StringBuilder a(int i10) {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append(String.format(this.f32602k, Integer.valueOf(i10), Integer.valueOf(this.f32593b)));
            return sb2;
        } catch (Throwable th2) {
            d.o(sb2, this.f32593b, "videos, the", i10, " is playing.");
            q0.b("MBridgeSegmentsProgressBar", th2.getMessage());
            return sb2;
        }
    }
}

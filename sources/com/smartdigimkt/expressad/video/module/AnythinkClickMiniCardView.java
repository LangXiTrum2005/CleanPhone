package com.smartdigimkt.expressad.video.module;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.impl.Z;
import com.smartdigimkt.c3.i;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.n.h;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.d;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkClickMiniCardView extends AnythinkH5EndCardView {
    private static final float j1 = 0.7f;
    private boolean i1;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String string = "";
            try {
                try {
                    int[] iArr = new int[2];
                    AnythinkClickMiniCardView.this.v0.getLocationOnScreen(iArr);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", v.b(b.p().k(), iArr[0]));
                    jSONObject.put("startY", v.b(b.p().k(), iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    th.getMessage();
                }
                h.a().a((WebView) AnythinkClickMiniCardView.this.v0, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public AnythinkClickMiniCardView(Context context) {
        super(context);
        this.i1 = false;
    }

    private void setContentLayoutParams(View view) {
        int iG = v.g(this.e0);
        int iF = v.f(this.e0);
        int i2 = (int) ((iG * j1) + 0.5f);
        int i3 = (int) ((iF * j1) + 0.5f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView
    public RelativeLayout.LayoutParams getContentLayoutParams() {
        return Z.g(-2, -2, 13, -1);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView
    public String getURL() {
        d dVar = this.f0;
        String strD = null;
        if (dVar != null) {
            d.c cVarU1 = dVar.U1();
            strD = cVarU1 != null ? cVarU1.d() : null;
            if (!TextUtils.isEmpty(strD) && strD.contains(".zip")) {
                String strC = i.a().c(strD);
                if (!TextUtils.isEmpty(strC)) {
                    return strC;
                }
            }
        }
        return strD;
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView
    public void i() {
        super.i();
        if (this.j0) {
            setBackgroundResource(findColor("sdm_reward_minicard_bg"));
            setContentLayoutParams(this.s0);
            setClickable(true);
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView, com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        if (this.j0) {
            setContentLayoutParams(this.s0);
        }
        super.onSelfConfigurationChanged(configuration);
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView, com.smartdigimkt.x2.f
    public void preLoadData(com.smartdigimkt.y2.b bVar) {
        super.preLoadData(bVar);
        setCloseVisible(0);
    }

    public void resizeMiniCard(int i2, int i3) {
        View viewFindViewById = ((Activity) this.e0).getWindow().findViewById(R.id.content);
        int width = viewFindViewById.getWidth();
        int height = viewFindViewById.getHeight();
        if (i2 <= 0 || i3 <= 0 || i2 > width || i3 > height) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.s0.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        this.s0.setLayoutParams(layoutParams);
    }

    public void setAnythinkClickMiniCardViewClickable(boolean z2) {
        setClickable(z2);
    }

    public void setAnythinkClickMiniCardViewTransparent() {
        setBackgroundColor(0);
    }

    public void setMiniCardLocation(int i2, int i3, int i4, int i5) {
        this.i1 = true;
        resizeMiniCard(i4, i5);
    }

    public void setRadius(int i2) {
        if (i2 > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(v.a(getContext(), i2));
            gradientDrawable.setColor(-1);
            this.v0.setBackground(gradientDrawable);
            this.v0.setClipToOutline(true);
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkH5EndCardView, com.smartdigimkt.x2.h
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.v0;
        if (windVaneWebView != null) {
            windVaneWebView.post(new a());
        }
    }

    public AnythinkClickMiniCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i1 = false;
    }
}

package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.video.bt.component.d;
import com.mbridge.msdk.videocommon.setting.c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static int f37152n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static int f37153o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f37154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected CampaignEx f37155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f37156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f37157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected c f37158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected LayoutInflater f37159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f37160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f37161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected float f37162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected float f37163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected Rect f37164k;
    protected int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f37165m;

    public BTBaseView(Context context) {
        this(context, null);
    }

    public JSONObject a(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(a.f33722h, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37162i));
                jSONObject2.put(a.f33723i, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37163j));
                jSONObject2.put(a.f33726m, i10);
                try {
                    this.f37160g = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                jSONObject2.put(a.f33725k, this.f37160g);
                jSONObject2.put(a.l, v0.d(getContext()));
                return jSONObject2;
            } catch (JSONException e11) {
                e = e11;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e12) {
            e = e12;
        }
    }

    public void defaultShow() {
        q0.a(TAG, "defaultShow");
    }

    public int findColor(String str) {
        return i0.a(this.f37154a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return i0.a(this.f37154a.getApplicationContext(), str, "drawable");
    }

    public int findID(String str) {
        return i0.a(this.f37154a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(this.f37154a.getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public CampaignEx getCampaign() {
        return this.f37155b;
    }

    public String getInstanceId() {
        return this.f37157d;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public Rect getRect() {
        return this.f37164k;
    }

    public String getUnitId() {
        return this.f37156c;
    }

    public int getViewHeight() {
        return this.f37165m;
    }

    public int getViewWidth() {
        return this.l;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.f37154a.getResources().getConfiguration().orientation == 2;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            if (viewArr[i10] == null) {
                return false;
            }
            i10++;
            z10 = true;
        }
        return z10;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f37160g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public abstract void onDestory();

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f37162i = motionEvent.getRawX();
        this.f37163j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f37160g = configuration.orientation;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f37155b = campaignEx;
    }

    public void setInstanceId(String str) {
        this.f37157d = str;
    }

    public void setLayout(int i10, int i11) {
        this.l = i10;
        this.f37165m = i11;
    }

    public void setLayoutCenter(int i10, int i11) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i10 != -999) {
                parentRelativeLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentRelativeLayoutParams.height = i11;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i10 != -999) {
                parentLinearLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentLinearLayoutParams.height = i11;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i10 != -999) {
                parentFrameLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentFrameLayoutParams.height = i11;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i11;
            parentRelativeLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentRelativeLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentRelativeLayoutParams.height = i13;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i11;
            parentLinearLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentLinearLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentLinearLayoutParams.height = i13;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i11;
            parentFrameLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentFrameLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentFrameLayoutParams.height = i13;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setRect(Rect rect) {
        this.f37164k = rect;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f37158e = cVar;
    }

    public void setUnitId(String str) {
        this.f37156c = str;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
    }

    public BTBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37157d = "";
        this.f37160g = 1;
        this.f37161h = false;
        this.f37154a = context;
        this.f37159f = LayoutInflater.from(context);
        init(context);
    }

    public static void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f37152n);
            jSONObject.put("id", str2);
            jSONObject.put("data", new JSONObject());
            f.a().a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            d.c().a(webView, e10.getMessage());
            q0.a(TAG, e10.getMessage());
        }
    }

    public void b() {
    }
}

package com.smartdigimkt.expressad.video.bt.module;

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
import com.smartdigimkt.b0.a;
import com.smartdigimkt.n.h;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.d;
import com.smartdigimkt.z1.c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";
    private static final int r0 = -999;
    protected static int s0 = 0;
    protected static int t0 = 1;
    protected Context e0;
    protected d f0;
    protected String g0;
    protected String h0;
    protected com.smartdigimkt.f3.d i0;
    protected LayoutInflater j0;
    protected int k0;
    protected boolean l0;
    protected float m0;
    protected float n0;
    protected Rect o0;
    protected int p0;
    protected int q0;

    public BTBaseView(Context context) {
        this(context, null);
    }

    public String a() {
        return a(0).toString();
    }

    public void b() {
    }

    public void defaultShow() {
    }

    public int findColor(String str) {
        return k.a(this.e0.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return k.a(this.e0.getApplicationContext(), str, k.d);
    }

    public int findID(String str) {
        return k.a(this.e0.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return k.a(this.e0.getApplicationContext(), str, "layout");
    }

    public d getCampaign() {
        return this.f0;
    }

    public String getInstanceId() {
        return this.h0;
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
        return this.o0;
    }

    public String getUnitId() {
        return this.g0;
    }

    public int getViewHeight() {
        return this.q0;
    }

    public int getViewWidth() {
        return this.p0;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.e0.getResources().getConfiguration().orientation == 2;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            if (viewArr[i2] == null) {
                return false;
            }
            i2++;
            z2 = true;
        }
        return z2;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.k0 = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public abstract void onDestory();

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.m0 = motionEvent.getRawX();
        this.n0 = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.k0 = configuration.orientation;
    }

    public void setCampaign(d dVar) {
        this.f0 = dVar;
    }

    public void setInstanceId(String str) {
        this.h0 = str;
    }

    public void setLayout(int i2, int i3) {
        this.p0 = i2;
        this.q0 = i3;
    }

    public void setLayoutCenter(int i2, int i3) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i2 != -999) {
                parentRelativeLayoutParams.width = i2;
            }
            if (i3 != -999) {
                parentRelativeLayoutParams.height = i3;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i2 != -999) {
                parentLinearLayoutParams.width = i2;
            }
            if (i3 != -999) {
                parentLinearLayoutParams.height = i3;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i2 != -999) {
                parentFrameLayoutParams.width = i2;
            }
            if (i3 != -999) {
                parentFrameLayoutParams.height = i3;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i2, int i3, int i4, int i5) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i3;
            parentRelativeLayoutParams.leftMargin = i2;
            if (i4 != -999) {
                parentRelativeLayoutParams.width = i4;
            }
            if (i5 != -999) {
                parentRelativeLayoutParams.height = i5;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i3;
            parentLinearLayoutParams.leftMargin = i2;
            if (i4 != -999) {
                parentLinearLayoutParams.width = i4;
            }
            if (i5 != -999) {
                parentLinearLayoutParams.height = i5;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i3;
            parentFrameLayoutParams.leftMargin = i2;
            if (i4 != -999) {
                parentFrameLayoutParams.width = i4;
            }
            if (i5 != -999) {
                parentFrameLayoutParams.height = i5;
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
        this.o0 = rect;
    }

    public void setRewardUnitSetting(com.smartdigimkt.f3.d dVar) {
        this.i0 = dVar;
    }

    public void setUnitId(String str) {
        this.g0 = str;
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
        this.h0 = "";
        this.k0 = 1;
        this.l0 = false;
        this.e0 = context;
        this.j0 = LayoutInflater.from(context);
        init(context);
    }

    public JSONObject a(int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(a.g2, v.b(com.smartdigimkt.u.a.f().d(), this.m0));
                jSONObject2.put(a.h2, v.b(com.smartdigimkt.u.a.f().d(), this.n0));
                jSONObject2.put(a.j2, i2);
                try {
                    this.k0 = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                jSONObject2.put(a.k2, this.k0);
                jSONObject2.put(a.l2, v.d(getContext()));
                return jSONObject2;
            } catch (JSONException e3) {
                e = e3;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e4) {
            e = e4;
        }
    }

    public static void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", s0);
            jSONObject.put("id", str2);
            jSONObject.put("data", new JSONObject());
            h.a().a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            c.c().a(webView, e2.getMessage());
            e2.getMessage();
        }
    }
}

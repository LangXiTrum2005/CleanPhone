package com.smartdigimkt.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.t2.a;
import com.smartdigimkt.u2.f;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.x.d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AnythinkBaseView extends RelativeLayout {
    public static final String TAG = "AnythinkBaseView";
    private static final int r0 = -999;
    protected Context e0;
    protected d f0;
    protected LayoutInflater g0;
    protected int h0;
    protected a i0;
    protected boolean j0;
    protected float k0;
    protected float l0;
    protected boolean m0;
    protected int n0;
    protected boolean o0;
    protected int p0;
    protected int q0;

    public AnythinkBaseView(Context context) {
        this(context, null);
    }

    public JSONObject a(int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(com.smartdigimkt.b0.a.g2, v.b(b.p().k(), this.k0));
                jSONObject2.put(com.smartdigimkt.b0.a.h2, v.b(b.p().k(), this.l0));
                jSONObject2.put(com.smartdigimkt.b0.a.j2, i2);
                try {
                    this.h0 = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                jSONObject2.put(com.smartdigimkt.b0.a.k2, this.h0);
                jSONObject2.put(com.smartdigimkt.b0.a.l2, v.d(getContext()));
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

    public String b() {
        return a(0).toString();
    }

    public void c() {
    }

    public void defaultShow() {
    }

    public int filterFindViewId(boolean z2, String str) {
        return z2 ? findDyID(str) : findID(str);
    }

    public int findColor(String str) {
        return k.a(this.e0.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return k.a(this.e0.getApplicationContext(), str, k.d);
    }

    public int findDyID(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
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
        this.h0 = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.k0 = motionEvent.getRawX();
        this.l0 = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.h0 = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setCampaign(d dVar) {
        this.f0 = dVar;
    }

    public void setLayoutCenter(int i2, int i3) {
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
        }
    }

    public void setLayoutParam(int i2, int i3, int i4, int i5) {
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

    public void setNotifyListener(a aVar) {
        this.i0 = aVar;
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

    public AnythinkBaseView(Context context, AttributeSet attributeSet, boolean z2, int i2, boolean z3, int i3, int i4) {
        super(context, attributeSet);
        this.h0 = 1;
        this.i0 = new f();
        this.j0 = false;
        this.p0 = 1;
        this.q0 = 0;
        this.e0 = context;
        this.g0 = LayoutInflater.from(context);
        this.m0 = z2;
        this.n0 = i2;
        this.o0 = z3;
        this.p0 = i3;
        this.q0 = i4;
        init(context);
    }

    public AnythinkBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h0 = 1;
        this.i0 = new f();
        this.j0 = false;
        this.p0 = 1;
        this.q0 = 0;
        this.e0 = context;
        this.g0 = LayoutInflater.from(context);
        init(context);
    }
}

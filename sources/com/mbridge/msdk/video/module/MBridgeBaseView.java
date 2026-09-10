package com.mbridge.msdk.video.module;

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
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.video.module.listener.a;
import com.mbridge.msdk.video.module.listener.impl.f;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class MBridgeBaseView extends RelativeLayout {
    public static final String TAG = "MBridgeBaseView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f37559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected CampaignEx f37560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected LayoutInflater f37561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f37562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f37563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected float f37564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected float f37565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f37566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f37567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f37568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f37569k;
    protected int l;
    public a notifyListener;

    public MBridgeBaseView(Context context) {
        this(context, null);
    }

    public JSONObject a(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f33722h, v0.b(c.n().d(), this.f37564f));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f33723i, v0.b(c.n().d(), this.f37565g));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f33726m, i10);
                try {
                    this.f37562d = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f33725k, this.f37562d);
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.l, v0.d(getContext()));
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

    public String c() {
        return a(0).toString();
    }

    public void defaultShow() {
        q0.a(TAG, "defaultShow");
    }

    public int filterFindViewId(boolean z10, String str) {
        return z10 ? findDyID(str) : findID(str);
    }

    public int findColor(String str) {
        return i0.a(this.f37559a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return i0.a(this.f37559a.getApplicationContext(), str, "drawable");
    }

    public int findDyID(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    public int findID(String str) {
        return i0.a(this.f37559a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(this.f37559a.getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public CampaignEx getCampaign() {
        return this.f37560b;
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
        return this.f37559a.getResources().getConfiguration().orientation == 2;
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
        this.f37562d = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f37564f = motionEvent.getRawX();
        this.f37565g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f37562d = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f37560b = campaignEx;
    }

    public void setLayoutCenter(int i10, int i11) {
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
        }
    }

    public void setLayoutParam(int i10, int i11, int i12, int i13) {
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
        this.notifyListener = aVar;
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

    public MBridgeBaseView(Context context, AttributeSet attributeSet, boolean z10, int i10, boolean z11, int i11, int i12) {
        super(context, attributeSet);
        this.f37562d = 1;
        this.notifyListener = new f();
        this.f37563e = false;
        this.f37569k = 1;
        this.l = 0;
        this.f37559a = context;
        this.f37561c = LayoutInflater.from(context);
        this.f37566h = z10;
        this.f37567i = i10;
        this.f37568j = z11;
        this.f37569k = i11;
        this.l = i12;
        init(context);
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37562d = 1;
        this.notifyListener = new f();
        this.f37563e = false;
        this.f37569k = 1;
        this.l = 0;
        this.f37559a = context;
        this.f37561c = LayoutInflater.from(context);
        init(context);
    }

    public void d() {
    }
}

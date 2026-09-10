package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class XMLView extends ComponentRelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, View> f32605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.style.inter.a f32606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.config.dynamic.baseview.touch.a f32608d;

    public XMLView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32605a = new HashMap();
        this.f32607c = "";
        this.f32608d = new com.mbridge.msdk.config.dynamic.baseview.touch.a();
        a();
    }

    private void a() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f32608d.c();
                this.f32608d.d(motionEvent);
            } else if (action == 1) {
                this.f32608d.f(motionEvent);
            } else if (action == 2) {
                this.f32608d.e(motionEvent);
            } else if (action == 3) {
                this.f32608d.c(motionEvent);
            }
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("处理触摸事件异常: "), "RenderView");
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Map<String, View> getRenderMap() {
        return this.f32605a;
    }

    public String getSelfTag() {
        return this.f32607c;
    }

    public com.mbridge.msdk.config.dynamic.baseview.touch.a getTouchEventData() {
        return this.f32608d;
    }

    public com.mbridge.msdk.config.component.style.inter.a getXmlViewActionListener() {
        return this.f32606b;
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f32607c = SameMD5.getMD5(str);
    }

    public void setXmlViewActionListener(com.mbridge.msdk.config.component.style.inter.a aVar) {
        this.f32606b = aVar;
    }

    public void updateTouchView(View view) {
        com.mbridge.msdk.config.dynamic.baseview.touch.a aVar = this.f32608d;
        if (aVar != null) {
            aVar.c(view);
        }
    }
}

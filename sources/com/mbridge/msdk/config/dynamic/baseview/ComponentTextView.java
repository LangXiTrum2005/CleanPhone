package com.mbridge.msdk.config.dynamic.baseview;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.a;
import com.mbridge.msdk.config.dynamic.baseview.inter.b;
import com.mbridge.msdk.config.dynamic.utils.d;
import com.mbridge.msdk.config.dynamic.utils.f;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ComponentTextView extends TextView implements a, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animator f32512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32513b;
    public XMLView xmlView;

    public ComponentTextView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
    }

    private void b() {
        Animator animator = this.f32512a;
        if (animator != null) {
            try {
                animator.cancel();
            } catch (Exception e10) {
                f2.q(e10, new StringBuilder("停止动画失败: "), "MBTextView");
            }
        }
    }

    private Map<String, Object> getDataMap() {
        HashMap map = new HashMap();
        map.put("text", getText().toString());
        return map;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.b
    public Map<String, Object> getOutData() {
        Object tag;
        if (TextUtils.isEmpty(this.f32513b) || (tag = getTag()) == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(String.valueOf(tag), getDataMap());
        return map;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = d.a(this);
            a();
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("onAttachedToWindow异常: "), "MBTextView");
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            b();
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("onDetachedFromWindow异常: "), "MBTextView");
        }
    }

    public void setOutDataScope(String str) {
        this.f32513b = str;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    public void setViewClickListener() {
        setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 13));
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals(com.ironsource.mediationsdk.metadata.a.f29610g)) {
                setViewClickListener();
            }
            Object obj = map.get("data");
            if (obj instanceof String) {
                setText(String.valueOf(obj));
            }
            if (map.get("saveContent") instanceof String) {
                setOutDataScope("saveContent");
            }
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("setXmlData异常: "), "MBTextView");
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof String) {
                setText(String.valueOf(obj));
            }
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("updateBindData异常: "), "MBTextView");
        }
    }

    private void a() {
        Animator animator = this.f32512a;
        if (animator != null) {
            try {
                animator.start();
            } catch (Exception e10) {
                f2.q(e10, new StringBuilder("启动动画失败: "), "MBTextView");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        Map<String, Object> dataMap = getDataMap();
        dataMap.put("property", getDataMap());
        f.a(this.xmlView, view.getTag(), dataMap);
    }
}

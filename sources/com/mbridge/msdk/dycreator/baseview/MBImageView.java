package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.dycreator.utils.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBImageView extends ImageView implements InterBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Boolean> f32859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f32861c;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBImageView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32862a;

        static {
            int[] iArr = new int[c.values().length];
            f32862a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32862a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32862a[c.visibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MBImageView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f32860b = "";
        if (context != null && attributeSet != null) {
            try {
                this.f32861c = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            } catch (Exception e10) {
                q0.b("MBImageView", e10.getMessage());
                return;
            }
        }
        a.a(this, attributeSet);
        setLayoutParams(generateLayoutParams(context, attributeSet));
        com.mbridge.msdk.dycreator.utils.c.a(this.f32861c, this);
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f32862a[cVar.ordinal()];
                if (i11 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (attributeValue.startsWith("f") || attributeValue.startsWith("m")) {
                        layoutParams.width = -1;
                    } else if (attributeValue.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = b.a().a(attributeValue);
                    }
                } else if (i11 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (attributeValue2.startsWith("f") || attributeValue2.startsWith("m")) {
                        layoutParams.height = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = b.a().a(attributeValue2);
                    }
                } else if (i11 == 3) {
                    String attributeValue3 = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue3)) {
                        if (attributeValue3.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue3.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f32861c;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f32861c.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f32861c;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f32861c.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f32861c;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f32861c.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f32861c;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f32861c.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f32861c;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f32861c.get("mbridgeStrategy");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f32859a;
        if (map != null && map.containsKey("mbridgeAttached") && this.f32859a.get("mbridgeAttached").booleanValue()) {
            f2.h("mbridgeAttached").b(this.f32860b);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f32859a;
        if (map != null && map.containsKey("mbridgeDetached") && this.f32859a.get("mbridgeDetached").booleanValue()) {
            f2.h("mbridgeDetached").b(this.f32860b);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f32859a = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.f32860b = campaignEx.getCampaignUnitId();
        }
    }
}

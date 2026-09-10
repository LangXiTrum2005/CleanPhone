package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.utils.a;
import com.mbridge.msdk.dycreator.utils.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBButton extends Button implements InterBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f32838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f32839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32840c;

    public MBButton(Context context) {
        super(context);
        this.f32840c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f32838a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f32838a.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f32838a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f32838a.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f32838a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f32838a.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f32838a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f32838a.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f32838a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f32838a.get("mbridgeStrategy");
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f32839b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f32839b.get("mbridgeAttached").booleanValue()) {
            f2.h("mbridgeAttached").b(this.f32840c);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f32839b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f32839b.get("mbridgeDetached").booleanValue()) {
            f2.h("mbridgeDetached").b(this.f32840c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f32839b = c.a(str);
        if (campaignEx != null) {
            this.f32840c = campaignEx.getCampaignUnitId();
        }
    }

    public MBButton(Context context, AttributeSet attributeSet) {
        super(context);
        this.f32840c = "";
        this.f32838a = c.a(context, attributeSet);
        a.a(this, attributeSet);
        c.a(this.f32838a, this);
    }

    public MBButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32840c = "";
    }
}

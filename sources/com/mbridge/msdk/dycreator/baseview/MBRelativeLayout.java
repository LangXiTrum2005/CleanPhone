package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
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
public class MBRelativeLayout extends RelativeLayout implements InterBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f32883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f32884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f32885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f32886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f32887e;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBRelativeLayout$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32888a;

        static {
            int[] iArr = new int[c.values().length];
            f32888a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32888a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32888a[c.layout_centerHorizontal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32888a[c.layout_alignParentBottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32888a[c.layout_alignParentTop.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32888a[c.layout_centerVertical.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32888a[c.layout_below.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32888a[c.layout_above.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32888a[c.layout_toLeftOf.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32888a[c.layout_toRightOf.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32888a[c.layout_toEndOf.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32888a[c.layout_margin.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32888a[c.layout_marginLeft.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f32888a[c.layout_marginRight.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f32888a[c.layout_marginTop.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f32888a[c.layout_marginBottom.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f32888a[c.layout_alignParentRight.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f32888a[c.layout_alignParentLeft.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f32888a[c.layout_alignTop.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f32888a[c.layout_alignLeft.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f32888a[c.layout_alignRight.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f32888a[c.layout_alignBottom.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f32888a[c.layout_centerInParent.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f32888a[c.layout_alignParentEnd.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    public MBRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32887e = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f32885c;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f32885c.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f32885c;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f32885c.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f32885c;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f32885c.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f32885c;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f32885c.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f32885c;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f32885c.get("mbridgeStrategy");
    }

    public float getxInScreen() {
        return this.f32883a;
    }

    public float getyInScreen() {
        return this.f32884b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f32886d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f32886d.get("mbridgeAttached").booleanValue()) {
            f2.h("mbridgeAttached").b(this.f32887e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f32886d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f32886d.get("mbridgeDetached").booleanValue()) {
            f2.h("mbridgeDetached").b(this.f32887e);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f32883a = motionEvent.getRawX();
        this.f32884b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            try {
                View childAt = getChildAt(i14);
                if (childAt instanceof MBLinearLayout) {
                    MBLinearLayout mBLinearLayout = (MBLinearLayout) childAt;
                    for (int i15 = 0; i15 < mBLinearLayout.getChildCount(); i15++) {
                    }
                }
            } catch (Exception e10) {
                q0.b("MBRelativeLayouts", e10.getMessage());
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f32886d = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.f32887e = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        HashMap mapB = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) mapB.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.f32888a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith("fill") || attributeValue.startsWith("match")) {
                            layoutParams.width = -1;
                        } else if (attributeValue.startsWith("w")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = b.a().a(attributeValue);
                        }
                        break;
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (attributeValue2.startsWith("fill") || attributeValue2.startsWith("match")) {
                            layoutParams.height = -1;
                        } else if (attributeValue2.startsWith("wrap")) {
                            layoutParams.height = -2;
                        } else {
                            layoutParams.height = b.a().a(attributeValue2);
                        }
                        break;
                    case 3:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(14, -1);
                        }
                        break;
                    case 4:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(12, -1);
                        }
                        break;
                    case 5:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(10, -1);
                        }
                        break;
                    case 6:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(15, -1);
                        }
                        break;
                    case 7:
                        String attributeValue3 = attributeSet.getAttributeValue(i10);
                        if (attributeValue3.startsWith("@+id")) {
                            f2.r(attributeValue3, 5, layoutParams, 3);
                        }
                        break;
                    case 8:
                        String attributeValue4 = attributeSet.getAttributeValue(i10);
                        if (attributeValue4.startsWith("@+id")) {
                            f2.r(attributeValue4, 5, layoutParams, 2);
                        }
                        break;
                    case 9:
                        String attributeValue5 = attributeSet.getAttributeValue(i10);
                        if (attributeValue5.startsWith("@+id")) {
                            f2.r(attributeValue5, 5, layoutParams, 0);
                        }
                        break;
                    case 10:
                        String attributeValue6 = attributeSet.getAttributeValue(i10);
                        if (attributeValue6.startsWith("@+id")) {
                            f2.r(attributeValue6, 5, layoutParams, 1);
                        }
                        break;
                    case 11:
                        String attributeValue7 = attributeSet.getAttributeValue(i10);
                        if (attributeValue7.startsWith("@+id")) {
                            f2.r(attributeValue7, 5, layoutParams, 17);
                        }
                        break;
                    case 12:
                        int iA = b.a().a(attributeSet.getAttributeValue(i10));
                        layoutParams.setMargins(iA, iA, iA, iA);
                        break;
                    case 13:
                        layoutParams.leftMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 14:
                        layoutParams.rightMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 15:
                        layoutParams.topMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 16:
                        layoutParams.bottomMargin = b.a().a(attributeSet.getAttributeValue(i10));
                        break;
                    case 17:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(11, -1);
                        }
                        break;
                    case 18:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(9, -1);
                        }
                        break;
                    case 19:
                        String attributeValue8 = attributeSet.getAttributeValue(i10);
                        if (attributeValue8.startsWith("@+id")) {
                            f2.r(attributeValue8, 5, layoutParams, 6);
                        }
                        break;
                    case 20:
                        String attributeValue9 = attributeSet.getAttributeValue(i10);
                        if (attributeValue9.startsWith("@+id")) {
                            f2.r(attributeValue9, 5, layoutParams, 5);
                        }
                        break;
                    case 21:
                        String attributeValue10 = attributeSet.getAttributeValue(i10);
                        if (attributeValue10.startsWith("@+id")) {
                            f2.r(attributeValue10, 5, layoutParams, 7);
                        }
                        break;
                    case 22:
                        String attributeValue11 = attributeSet.getAttributeValue(i10);
                        if (attributeValue11.startsWith("@+id")) {
                            f2.r(attributeValue11, 5, layoutParams, 8);
                        }
                        break;
                    case 23:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(13, -1);
                        }
                        break;
                    case 24:
                        if (attributeSet.getAttributeBooleanValue(i10, false)) {
                            layoutParams.addRule(21, -1);
                        }
                        break;
                }
            }
        }
        return layoutParams;
    }

    public MBRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.f32887e = "";
        try {
            this.f32885c = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.utils.c.a(this.f32885c, this);
        } catch (Exception e10) {
            q0.b("MBRelativeLayouts", e10.getMessage());
        }
    }

    public MBRelativeLayout(Context context) {
        super(context);
        this.f32887e = "";
    }
}

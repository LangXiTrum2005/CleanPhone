package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBExtMBridgeTextView extends MBridgeTextView implements InterBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f33059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Boolean> f33060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33061d;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtMBridgeTextView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33062a;

        static {
            int[] iArr = new int[c.values().length];
            f33062a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33062a[c.text.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33062a[c.ellipsize.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33062a[c.singleLine.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33062a[c.lines.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33062a[c.drawableLeft.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33062a[c.drawablePadding.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33062a[c.fadingEdge.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33062a[c.scrollHorizontally.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33062a[c.textColor.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f33062a[c.textSize.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f33062a[c.visibility.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f33062a[c.background.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f33062a[c.textStyle.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f33062a[c.style.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f33062a[c.contentDescription.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f33062a[c.tag.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f33062a[c.gravity.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f33062a[c.padding.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f33062a[c.paddingTop.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f33062a[c.paddingBottom.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f33062a[c.paddingLeft.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f33062a[c.paddingRight.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f33062a[c.paddingStart.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f33062a[c.paddingEnd.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f33062a[c.maxLength.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f33062a[c.layout_width.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f33062a[c.layout_height.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
        }
    }

    public MBExtMBridgeTextView(Context context) {
        super(context);
        this.f33061d = "";
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap mapB = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = (c) mapB.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f33062a[cVar.ordinal()];
                if (i11 == 27) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (attributeValue.startsWith("f") || attributeValue.startsWith("m")) {
                        layoutParams.width = -1;
                    } else if (attributeValue.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = b.a().a(attributeValue);
                    }
                } else if (i11 == 28) {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (attributeValue2.startsWith("f") || attributeValue2.startsWith("m")) {
                        layoutParams.height = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = b.a().a(attributeValue2);
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f33059b;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f33059b.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f33059b;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f33059b.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f33059b;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f33059b.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f33059b;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f33059b.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f33059b;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f33059b.get("mbridgeStrategy");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f33060c;
        if (map != null && map.containsKey("mbridgeAttached") && this.f33060c.get("mbridgeAttached").booleanValue()) {
            f2.h("mbridgeAttached").b(this.f33061d);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f33060c;
        if (map != null && map.containsKey("mbridgeDetached") && this.f33060c.get("mbridgeDetached").booleanValue()) {
            f2.h("mbridgeDetached").b(this.f33061d);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArrSplit;
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        int iA = 0;
        int iA2 = 0;
        int iA3 = 0;
        int iA4 = 0;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                Log.d("setupview", cVar.toString());
                switch (AnonymousClass1.f33062a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                        }
                        break;
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue2)) {
                            if (attributeValue2.startsWith("@string/")) {
                                setText(b.a().f(attributeSet.getAttributeValue(i10)));
                            } else {
                                setText(attributeValue2);
                            }
                        }
                        break;
                    case 3:
                        String attributeValue3 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            if (attributeValue3.equals(TtmlNode.END)) {
                                setEllipsize(TextUtils.TruncateAt.END);
                            }
                            if (attributeValue3.equals("start")) {
                                setEllipsize(TextUtils.TruncateAt.START);
                            }
                            if (attributeValue3.equals("middle")) {
                                setEllipsize(TextUtils.TruncateAt.MIDDLE);
                            }
                            if (attributeValue3.equals("marquee")) {
                                setEllipsize(TextUtils.TruncateAt.MARQUEE);
                            }
                        }
                        break;
                    case 4:
                        setSingleLine(attributeSet.getAttributeBooleanValue(i10, false));
                        break;
                    case 5:
                        setLines(attributeSet.getAttributeIntValue(i10, 1));
                        break;
                    case 6:
                        String attributeValue4 = attributeSet.getAttributeValue(i10);
                        String strSubstring = attributeValue4.startsWith("@drawable/") ? attributeValue4.substring(10) : "";
                        if (!TextUtils.isEmpty(strSubstring)) {
                            Drawable drawable = getResources().getDrawable(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), strSubstring, "drawable"));
                            drawable.setBounds(0, 0, v0.a(getContext(), 14.0f), v0.a(getContext(), 14.0f));
                            setCompoundDrawables(drawable, null, null, null);
                        }
                        break;
                    case 7:
                        setCompoundDrawablePadding(b.a().a(attributeSet.getAttributeValue(i10)));
                        break;
                    case 8:
                        setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i10, false));
                        break;
                    case 9:
                        setHorizontallyScrolling(attributeSet.getAttributeBooleanValue(i10, false));
                        break;
                    case 10:
                        setTextColor(b.a().d(attributeSet.getAttributeValue(i10)));
                        break;
                    case 11:
                        String attributeValue5 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue5)) {
                            setTextSize(b.a().a(attributeValue5));
                        }
                        break;
                    case 12:
                        String attributeValue6 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue6)) {
                            if (attributeValue6.equals("invisible")) {
                                setVisibility(4);
                            } else if (attributeValue6.equalsIgnoreCase("gone")) {
                                setVisibility(8);
                            }
                        }
                        break;
                    case 13:
                        String attributeValue7 = attributeSet.getAttributeValue(i10);
                        if (attributeValue7.startsWith("#")) {
                            try {
                                strArrSplit = attributeValue7.split("-");
                            } catch (Exception unused) {
                                strArrSplit = null;
                            }
                            if (strArrSplit != null && strArrSplit.length <= 2) {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                            } else if (strArrSplit == null || strArrSplit.length != 3) {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                            } else {
                                try {
                                    GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArrSplit[2]), new int[]{Color.parseColor(strArrSplit[0]), Color.parseColor(strArrSplit[1])});
                                    gradientDrawable.setGradientType(0);
                                    setBackground(gradientDrawable);
                                } catch (Exception unused2) {
                                    setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                                }
                            }
                        } else {
                            if (attributeValue7.startsWith("@drawable/")) {
                                attributeValue7 = attributeValue7.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue7, "drawable", getContext().getPackageName()));
                        }
                        break;
                    case 14:
                        if (TtmlNode.BOLD.equalsIgnoreCase(attributeSet.getAttributeValue(i10))) {
                            setTypeface(Typeface.defaultFromStyle(1));
                        }
                        break;
                    case 15:
                        String attributeValue8 = attributeSet.getAttributeValue(i10);
                        String strSubstring2 = attributeValue8.substring(attributeValue8.indexOf("/") + 1);
                        setTextAppearance(getContext(), b.a().c("R.style." + strSubstring2));
                        break;
                    case 16:
                        String attributeValue9 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue9)) {
                            CharSequence charSequence = (String) com.mbridge.msdk.dycreator.utils.b.f33289a.get(attributeValue9.substring(8));
                            if (!TextUtils.isEmpty(charSequence)) {
                                setContentDescription(charSequence);
                            }
                        }
                        break;
                    case 17:
                        String attributeValue10 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue10)) {
                            String str = com.mbridge.msdk.dycreator.utils.b.f33289a.get(attributeValue10.substring(8));
                            if (!TextUtils.isEmpty(str)) {
                                setTag(str);
                            }
                        }
                        break;
                    case 18:
                        setGravity(b.a().b(attributeSet.getAttributeValue(i10)));
                        break;
                    case 19:
                        int iA5 = b.a().a(attributeSet.getAttributeValue(i10));
                        setPadding(iA5, iA5, iA5, iA5);
                        break;
                    case 20:
                        iA4 = b.a().a(attributeSet.getAttributeValue(i10));
                        setPadding(iA, iA4, iA2, iA3);
                        break;
                    case 21:
                        iA3 = b.a().a(attributeSet.getAttributeValue(i10));
                        setPadding(iA, iA4, iA2, iA3);
                        break;
                    case 22:
                        iA = b.a().a(attributeSet.getAttributeValue(i10));
                        setPadding(iA, iA4, iA2, iA3);
                        break;
                    case 23:
                        iA2 = b.a().a(attributeSet.getAttributeValue(i10));
                        setPadding(iA, iA4, iA2, iA3);
                        break;
                    case 24:
                        setPadding(b.a().a(attributeSet.getAttributeValue(i10)), iA4, iA2, iA3);
                        break;
                    case 25:
                        setPadding(iA, iA4, b.a().a(attributeSet.getAttributeValue(i10)), iA3);
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                        setFilters(new InputFilter[]{new InputFilter.LengthFilter(b.a().a(attributeSet.getAttributeValue(i10)))});
                        break;
                }
            }
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f33060c = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.f33061d = campaignEx.getCampaignUnitId();
        }
    }

    public MBExtMBridgeTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context);
        this.f33061d = "";
        try {
            this.f33059b = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.utils.c.a(this.f33059b, this);
        } catch (Exception e10) {
            q0.b("MBExtMBridgeTextView", e10.getMessage());
        }
    }

    public MBExtMBridgeTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f33061d = "";
    }
}

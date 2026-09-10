package com.mbridge.msdk.config.dynamic.utils;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import d5.u;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.utils.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class C0110a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32717a;

        static {
            int[] iArr = new int[c.values().length];
            f32717a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32717a[c.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32717a[c.visibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32717a[c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32717a[c.padding.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32717a[c.paddingTop.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32717a[c.paddingBottom.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32717a[c.paddingLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32717a[c.paddingRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32717a[c.paddingStart.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32717a[c.paddingEnd.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32717a[c.alpha.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32717a[c.rotation.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f32717a[c.scaleX.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f32717a[c.scaleY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f32717a[c.translationX.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f32717a[c.translationY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f32717a[c.tag.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f32717a[c.text.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f32717a[c.textColor.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f32717a[c.textSize.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f32717a[c.textStyle.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f32717a[c.maxLines.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f32717a[c.minLines.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f32717a[c.lines.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f32717a[c.ellipsize.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f32717a[c.gravity.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f32717a[c.drawablePadding.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f32717a[c.drawableStart.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f32717a[c.drawableEnd.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f32717a[c.drawableTop.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f32717a[c.drawableBottom.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f32717a[c.singleLine.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f32717a[c.marqueeRepeatLimit.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f32717a[c.includeFontPadding.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f32717a[c.lineSpacingExtra.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f32717a[c.lineSpacingMultiplier.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f32717a[c.hint.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f32717a[c.inputType.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f32717a[c.textIsSelectable.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f32717a[c.cursorVisible.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f32717a[c.allCaps.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f32717a[c.src.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f32717a[c.scaleType.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f32717a[c.adjustViewBounds.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f32717a[c.maxWidth.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f32717a[c.maxHeight.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f32717a[c.tint.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f32717a[c.divider.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f32717a[c.dividerHeight.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f32717a[c.scrollbars.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f32717a[c.listSelector.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f32717a[c.stackFromBottom.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f32717a[c.transcriptMode.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f32717a[c.numColumns.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f32717a[c.verticalSpacing.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f32717a[c.horizontalSpacing.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f32717a[c.stretchMode.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f32717a[c.columnWidth.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f32717a[c.fillViewport.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f32717a[c.scrollbarStyle.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f32717a[c.orientation.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f32717a[c.weightSum.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f32717a[c.baselineAligned.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f32717a[c.ignoreGravity.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f32717a[c.foregroundGravity.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f32717a[c.measureAllChildren.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f32717a[c.progress.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f32717a[c.max.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f32717a[c.progressDrawable.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
        }
    }

    public static void a(View view, AttributeSet attributeSet, ViewGroup viewGroup, String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (view == null || attributeSet == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParamsA = a(viewGroup);
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = attributeSet.getAttributeName(i10);
            String attributeValue = attributeSet.getAttributeValue(i10);
            if (attributeName.startsWith("mbridge_")) {
                com.mbridge.msdk.config.dynamic.binddata.a.a(attributeValue, view, str, aVar);
            } else {
                Object objA = d.a(attributeName, attributeValue, view, aVar);
                if (objA != null) {
                    a(view, attributeName, attributeSet.getAttributeValue(i10), objA);
                    b.a(attributeName, objA, layoutParamsA);
                }
            }
        }
        if (viewGroup != null) {
            viewGroup.addView(view, layoutParamsA);
        }
    }

    private static void b(View view, Object obj) {
        if (obj instanceof String) {
            view.setContentDescription((String) obj);
        }
    }

    private static void c(View view, Object obj) {
        if (obj instanceof Integer) {
            view.setId(((Integer) obj).intValue());
        }
    }

    private static void d(View view, Object obj) {
        try {
            if (obj instanceof Integer) {
                view.setPadding(((Integer) obj).intValue(), ((Integer) obj).intValue(), ((Integer) obj).intValue(), ((Integer) obj).intValue());
            } else {
                q0.b("AttributeUtil", "padding 无效");
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void e(View view, Object obj) {
        int iIntValue;
        try {
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                q0.b("AttributeUtil", "bottomPadding 无效");
                iIntValue = 0;
            }
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iIntValue);
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void f(View view, Object obj) {
        int iIntValue;
        try {
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                q0.b("AttributeUtil", "endPadding 无效");
                iIntValue = 0;
            }
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), iIntValue, view.getPaddingBottom());
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void g(View view, Object obj) {
        int iIntValue;
        try {
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                q0.b("AttributeUtil", "leftPadding 无效");
                iIntValue = 0;
            }
            view.setPadding(iIntValue, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void h(View view, Object obj) {
        int iIntValue;
        try {
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                q0.b("AttributeUtil", "rightPadding 无效");
                iIntValue = 0;
            }
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), iIntValue, view.getPaddingBottom());
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void i(View view, Object obj) {
        int iIntValue;
        try {
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                q0.b("AttributeUtil", "startPadding 无效");
                iIntValue = 0;
            }
            view.setPaddingRelative(iIntValue, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void j(View view, Object obj) {
        int iIntValue;
        try {
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                q0.b("AttributeUtil", "parsePaddingTop 无效");
                iIntValue = 0;
            }
            view.setPadding(view.getPaddingLeft(), iIntValue, view.getPaddingRight(), view.getPaddingBottom());
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void k(View view, Object obj) {
        try {
            if (obj instanceof String) {
                view.setRotation(Float.parseFloat((String) obj));
                return;
            }
            if (obj instanceof Float) {
                view.setRotation(((Float) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                view.setRotation(((Double) obj).floatValue());
            } else if (obj instanceof Integer) {
                view.setRotation(((Integer) obj).floatValue());
            } else {
                q0.b("AttributeUtil", "rotation 无效");
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void l(View view, Object obj) {
        try {
            if (obj instanceof String) {
                view.setScaleX(Float.parseFloat((String) obj));
                return;
            }
            if (obj instanceof Float) {
                view.setScaleX(((Float) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                view.setScaleX(((Double) obj).floatValue());
            } else if (obj instanceof Integer) {
                view.setScaleX(((Integer) obj).floatValue());
            } else {
                q0.b("AttributeUtil", "scaleX 无效");
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void m(View view, Object obj) {
        try {
            if (obj instanceof String) {
                view.setScaleY(Float.parseFloat((String) obj));
                return;
            }
            if (obj instanceof Float) {
                view.setScaleY(((Float) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                view.setScaleY(((Double) obj).floatValue());
            } else if (obj instanceof Integer) {
                view.setScaleY(((Integer) obj).floatValue());
            } else {
                q0.b("AttributeUtil", "scaleY 无效");
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void n(View view, Object obj) {
        if (!(obj instanceof String) || TextUtils.isEmpty((String) obj)) {
            return;
        }
        view.setTag(obj);
    }

    private static void o(View view, Object obj) {
        try {
            if (obj instanceof String) {
                view.setTranslationX(Float.parseFloat((String) obj));
                return;
            }
            if (obj instanceof Float) {
                view.setTranslationX(((Float) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                view.setTranslationX(((Double) obj).floatValue());
            } else if (obj instanceof Integer) {
                view.setTranslationX(((Integer) obj).floatValue());
            } else {
                q0.b("AttributeUtil", "translationX 无效");
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void p(View view, Object obj) {
        try {
            if (obj instanceof String) {
                view.setTranslationY(Float.parseFloat((String) obj));
                return;
            }
            if (obj instanceof Float) {
                view.setTranslationY(((Float) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                view.setTranslationY(((Double) obj).floatValue());
            } else if (obj instanceof Integer) {
                view.setTranslationY(((Integer) obj).floatValue());
            } else {
                q0.b("AttributeUtil", "translationY 无效");
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void q(View view, Object obj) {
        try {
            if (obj instanceof String) {
                if ("gone".equalsIgnoreCase((String) obj)) {
                    view.setVisibility(8);
                } else if ("invisible".equalsIgnoreCase((String) obj)) {
                    view.setVisibility(4);
                } else {
                    view.setVisibility(0);
                }
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static ImageView.ScaleType b(String str) {
        if (TextUtils.isEmpty(str)) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitend":
                return ImageView.ScaleType.FIT_END;
            case "matrix":
                return ImageView.ScaleType.MATRIX;
            case "fitstart":
                return ImageView.ScaleType.FIT_START;
            case "fitxy":
                return ImageView.ScaleType.FIT_XY;
            case "centerinside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "centercrop":
                return ImageView.ScaleType.CENTER_CROP;
            case "fitcenter":
                return ImageView.ScaleType.FIT_CENTER;
            default:
                return ImageView.ScaleType.FIT_CENTER;
        }
    }

    private static int c(String str) {
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "insideinset":
                return 16777216;
            case "outsideinset":
                return 50331648;
            case "outsideoverlay":
                return 33554432;
            default:
                return 0;
        }
    }

    private static int d(String str) {
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "spacing":
                return 1;
            case "columnwidth":
                return 2;
            case "spacinguniform":
                return 3;
            default:
                return 0;
        }
    }

    private static int e(String str) {
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        if (lowerCase.equals(Constants.NORMAL)) {
            return 1;
        }
        return !lowerCase.equals("alwaysscroll") ? 0 : 2;
    }

    public static void a(View view, String str, String str2, Object obj) {
        c cVar;
        HashMap<String, c> mapC = com.mbridge.msdk.config.dynamic.c.a().c();
        if (mapC == null || mapC.isEmpty() || (cVar = mapC.get(str)) == null) {
            return;
        }
        try {
            switch (C0110a.f32717a[cVar.ordinal()]) {
                case 1:
                    c(view, obj);
                    break;
                case 2:
                    a(view, obj, str2);
                    break;
                case 3:
                    q(view, obj);
                    break;
                case 4:
                    b(view, obj);
                    break;
                case 5:
                    d(view, obj);
                    break;
                case 6:
                    j(view, obj);
                    break;
                case 7:
                    e(view, obj);
                    break;
                case 8:
                    g(view, obj);
                    break;
                case 9:
                    h(view, obj);
                    break;
                case 10:
                    i(view, obj);
                    break;
                case 11:
                    f(view, obj);
                    break;
                case 12:
                    a(view, obj);
                    break;
                case 13:
                    k(view, obj);
                    break;
                case 14:
                    l(view, obj);
                    break;
                case 15:
                    m(view, obj);
                    break;
                case 16:
                    o(view, obj);
                    break;
                case 17:
                    p(view, obj);
                    break;
                case 18:
                    n(view, obj);
                    break;
                default:
                    if (view instanceof EditText) {
                        a((EditText) view, cVar, obj);
                    } else if (view instanceof Button) {
                        a((Button) view, cVar, obj);
                    } else if (view instanceof TextView) {
                        a((TextView) view, cVar, obj);
                    } else if (view instanceof ImageView) {
                        a((ImageView) view, cVar, obj);
                    } else if (view instanceof ListView) {
                        a((ListView) view, cVar, obj, str2);
                    } else if (view instanceof GridView) {
                        a((GridView) view, cVar, obj);
                    } else if (view instanceof ScrollView) {
                        a((ScrollView) view, cVar, obj);
                    } else if (view instanceof LinearLayout) {
                        a((LinearLayout) view, cVar, obj);
                    } else if (view instanceof RelativeLayout) {
                        a((RelativeLayout) view, cVar, obj);
                    } else if (view instanceof FrameLayout) {
                        a((FrameLayout) view, cVar, obj);
                    } else if (view instanceof ProgressBar) {
                        a((ProgressBar) view, cVar, obj);
                    }
                    break;
            }
        } catch (Exception e10) {
            f2.q(e10, u.k("Error setting common attribute ", str, ": "), "AttributeUtil");
        }
    }

    private static void a(View view, Object obj, String str) {
        if (obj instanceof Integer) {
            if (str.startsWith("#")) {
                view.setBackgroundColor(((Integer) obj).intValue());
            } else if (str.startsWith("@drawable/")) {
                view.setBackgroundResource(((Integer) obj).intValue());
            }
        }
    }

    private static void a(View view, Object obj) {
        try {
            if (obj instanceof String) {
                float f10 = Float.parseFloat((String) obj);
                if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 > 1.0f) {
                    return;
                }
                view.setAlpha(f10);
                return;
            }
            if (obj instanceof Float) {
                float fFloatValue = ((Float) obj).floatValue();
                if (fFloatValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fFloatValue > 1.0f) {
                    return;
                }
                view.setAlpha(fFloatValue);
                return;
            }
            if (obj instanceof Double) {
                float fFloatValue2 = ((Double) obj).floatValue();
                if (fFloatValue2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fFloatValue2 > 1.0f) {
                    return;
                }
                view.setAlpha(fFloatValue2);
                return;
            }
            q0.b("AttributeUtil", "alpha 无效");
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(TextView textView, c cVar, Object obj) {
        try {
            switch (C0110a.f32717a[cVar.ordinal()]) {
                case 19:
                    if (obj instanceof String) {
                        textView.setText(obj.toString());
                        return;
                    }
                    return;
                case 20:
                    if (obj instanceof Integer) {
                        textView.setTextColor(((Integer) obj).intValue());
                        return;
                    }
                    return;
                case 21:
                    try {
                        if (obj instanceof Integer) {
                            textView.setTextSize(0, ((Integer) obj).intValue());
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        q0.b("AttributeUtil", "Failed to set textSize: " + e10.getMessage());
                        return;
                    }
                case 22:
                    if ((obj instanceof String) && TtmlNode.BOLD.equalsIgnoreCase(obj.toString())) {
                        textView.setTypeface(Typeface.defaultFromStyle(1));
                        return;
                    }
                    return;
                case 23:
                    if (obj instanceof String) {
                        textView.setMaxLines(Integer.parseInt(obj.toString()));
                        return;
                    }
                    return;
                case 24:
                    if (obj instanceof String) {
                        textView.setMinLines(Integer.parseInt(obj.toString()));
                        return;
                    }
                    return;
                case 25:
                    if (obj instanceof String) {
                        textView.setLines(Integer.parseInt(obj.toString()));
                        return;
                    }
                    return;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    if (obj instanceof String) {
                        if (TtmlNode.END.equalsIgnoreCase(obj.toString())) {
                            textView.setEllipsize(TextUtils.TruncateAt.END);
                            return;
                        }
                        if ("start".equalsIgnoreCase(obj.toString())) {
                            textView.setEllipsize(TextUtils.TruncateAt.START);
                            return;
                        } else if ("middle".equalsIgnoreCase(obj.toString())) {
                            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                            return;
                        } else {
                            if ("marquee".equalsIgnoreCase(obj.toString())) {
                                textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                case 27:
                    if (obj instanceof String) {
                        textView.setGravity(com.mbridge.msdk.config.dynamic.c.a().c(obj.toString()));
                        return;
                    }
                    return;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    if (obj instanceof Integer) {
                        textView.setCompoundDrawablePadding(((Integer) obj).intValue());
                        return;
                    }
                    return;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                case 31:
                case 32:
                default:
                    return;
                case 33:
                    if (obj instanceof String) {
                        textView.setSingleLine(Boolean.parseBoolean(obj.toString()));
                        return;
                    }
                    return;
                case 34:
                    if (obj instanceof String) {
                        textView.setMarqueeRepeatLimit(Integer.parseInt(obj.toString()));
                        return;
                    }
                    return;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    if (obj instanceof String) {
                        textView.setIncludeFontPadding(Boolean.parseBoolean(obj.toString()));
                        return;
                    }
                    return;
                case 36:
                    if (obj instanceof String) {
                        textView.setLineSpacing(Integer.parseInt(obj.toString()), 1.0f);
                        return;
                    }
                    return;
                case 37:
                    if (obj instanceof String) {
                        textView.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.parseFloat(obj.toString()));
                        return;
                    }
                    return;
            }
        } catch (Exception e11) {
            q0.b("AttributeUtil", e11.getMessage());
        }
        q0.b("AttributeUtil", e11.getMessage());
    }

    private static void a(EditText editText, c cVar, Object obj) {
        try {
            if (!(obj instanceof String)) {
                q0.b("AttributeUtil", cVar + "无效");
            }
            String string = obj.toString();
            int i10 = C0110a.f32717a[cVar.ordinal()];
            switch (i10) {
                case 23:
                    editText.setMaxLines(Integer.parseInt(string));
                    break;
                case 24:
                    editText.setMinLines(Integer.parseInt(string));
                    break;
                case 25:
                    editText.setLines(Integer.parseInt(string));
                    break;
                default:
                    switch (i10) {
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                            editText.setHint(obj.toString());
                            break;
                        case 39:
                            editText.setInputType(a(string));
                            break;
                        case 40:
                            editText.setTextIsSelectable(Boolean.parseBoolean(string));
                            break;
                        case 41:
                            editText.setCursorVisible(Boolean.parseBoolean(string));
                            break;
                    }
                    break;
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(Button button, c cVar, Object obj) {
        try {
            int i10 = C0110a.f32717a[cVar.ordinal()];
            if (i10 != 42) {
                switch (i10) {
                    case 19:
                        if (obj instanceof String) {
                            button.setText(obj.toString());
                        }
                        break;
                    case 20:
                        if (obj instanceof Integer) {
                            button.setTextColor(((Integer) obj).intValue());
                        }
                        break;
                    case 21:
                        if (obj instanceof Integer) {
                            button.setTextSize(((Integer) obj).intValue());
                        }
                        break;
                    case 22:
                        if ((obj instanceof String) && TtmlNode.BOLD.equalsIgnoreCase(obj.toString())) {
                            button.setTypeface(Typeface.defaultFromStyle(1));
                            break;
                        }
                        break;
                    default:
                        break;
                }
            }
            if (obj instanceof String) {
                button.setAllCaps(Boolean.parseBoolean(obj.toString()));
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(ImageView imageView, c cVar, Object obj) {
        try {
            switch (C0110a.f32717a[cVar.ordinal()]) {
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    if (obj instanceof Integer) {
                        imageView.setImageResource(((Integer) obj).intValue());
                    }
                    break;
                case 44:
                    if (obj instanceof String) {
                        imageView.setScaleType(b(obj.toString()));
                    }
                    break;
                case 45:
                    if (obj instanceof String) {
                        imageView.setAdjustViewBounds(Boolean.parseBoolean(obj.toString()));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    if (obj instanceof Integer) {
                        imageView.setMaxWidth(((Integer) obj).intValue());
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    if (obj instanceof Integer) {
                        imageView.setMaxHeight(((Integer) obj).intValue());
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    if (obj instanceof Integer) {
                        imageView.setColorFilter(((Integer) obj).intValue());
                    }
                    break;
                default:
                    break;
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(ListView listView, c cVar, Object obj, String str) {
        try {
            switch (C0110a.f32717a[cVar.ordinal()]) {
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    if (!TextUtils.isEmpty(str) && str.startsWith("@null")) {
                        listView.setDivider(null);
                        break;
                    }
                    break;
                case 50:
                    if (obj instanceof Integer) {
                        listView.setDividerHeight(((Integer) obj).intValue());
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (obj instanceof String) {
                        if ("none".equalsIgnoreCase(obj.toString())) {
                            listView.setVerticalScrollBarEnabled(false);
                        }
                        if ("false".equalsIgnoreCase(obj.toString())) {
                            listView.setScrollbarFadingEnabled(false);
                        }
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (obj instanceof Integer) {
                        listView.setSelector(((Integer) obj).intValue());
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (obj instanceof String) {
                        listView.setStackFromBottom(Boolean.parseBoolean(obj.toString()));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (!TextUtils.isEmpty(str)) {
                        listView.setTranscriptMode(e(str));
                    }
                    break;
                default:
                    break;
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(GridView gridView, c cVar, Object obj) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                switch (C0110a.f32717a[cVar.ordinal()]) {
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                        gridView.setNumColumns(Integer.parseInt(str));
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                        gridView.setVerticalSpacing(com.mbridge.msdk.config.dynamic.c.a().a(str));
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                        gridView.setHorizontalSpacing(com.mbridge.msdk.config.dynamic.c.a().a(str));
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                        if (!TextUtils.isEmpty(str)) {
                            gridView.setStretchMode(d(str));
                        }
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                        gridView.setColumnWidth(com.mbridge.msdk.config.dynamic.c.a().a(str));
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(ScrollView scrollView, c cVar, Object obj) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                int i10 = C0110a.f32717a[cVar.ordinal()];
                if (i10 != 51) {
                    if (i10 != 60) {
                        if (i10 == 61 && !TextUtils.isEmpty(str)) {
                            scrollView.setScrollBarStyle(c(str));
                            return;
                        }
                        return;
                    }
                    scrollView.setFillViewport(Boolean.parseBoolean(str));
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if ("none".equalsIgnoreCase(str)) {
                    scrollView.setVerticalScrollBarEnabled(false);
                }
                if ("false".equalsIgnoreCase(str)) {
                    scrollView.setScrollbarFadingEnabled(false);
                }
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(LinearLayout linearLayout, c cVar, Object obj) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                int i10 = C0110a.f32717a[cVar.ordinal()];
                if (i10 != 27) {
                    switch (i10) {
                        case 62:
                            if ("horizontal".equalsIgnoreCase(str)) {
                                linearLayout.setOrientation(0);
                            } else {
                                linearLayout.setOrientation(1);
                            }
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                            linearLayout.setWeightSum(Float.parseFloat(str));
                            break;
                        case 64:
                            linearLayout.setBaselineAligned(Boolean.parseBoolean(str));
                            break;
                    }
                }
                linearLayout.setGravity(com.mbridge.msdk.config.dynamic.c.a().c(str));
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(RelativeLayout relativeLayout, c cVar, Object obj) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                int i10 = C0110a.f32717a[cVar.ordinal()];
                if (i10 == 27) {
                    relativeLayout.setGravity(com.mbridge.msdk.config.dynamic.c.a().c(str));
                } else {
                    if (i10 != 65) {
                        return;
                    }
                    relativeLayout.setIgnoreGravity(com.mbridge.msdk.config.dynamic.c.a().d(str));
                }
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(FrameLayout frameLayout, c cVar, Object obj) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                int i10 = C0110a.f32717a[cVar.ordinal()];
                if (i10 == 66) {
                    frameLayout.setForegroundGravity(com.mbridge.msdk.config.dynamic.c.a().c(str));
                } else {
                    if (i10 != 67) {
                        return;
                    }
                    frameLayout.setMeasureAllChildren(Boolean.parseBoolean(str));
                }
            }
        } catch (Exception e10) {
            q0.b("AttributeUtil", e10.getMessage());
        }
    }

    private static void a(ProgressBar progressBar, c cVar, Object obj) {
        try {
            switch (C0110a.f32717a[cVar.ordinal()]) {
                case 68:
                    try {
                        if (obj instanceof String) {
                            progressBar.setProgress(Integer.parseInt(obj.toString()));
                            return;
                        } else {
                            if (obj instanceof Integer) {
                                progressBar.setProgress(((Integer) obj).intValue());
                                return;
                            }
                            return;
                        }
                    } catch (Exception e10) {
                        q0.b("AttributeUtil", "Failed to set progress: " + e10.getMessage());
                        return;
                    }
                case 69:
                    try {
                        if (obj instanceof String) {
                            progressBar.setMax(Integer.parseInt(obj.toString()));
                            return;
                        } else {
                            if (obj instanceof Integer) {
                                progressBar.setMax(((Integer) obj).intValue());
                                return;
                            }
                            return;
                        }
                    } catch (Exception e11) {
                        q0.b("AttributeUtil", "Failed to set max: " + e11.getMessage());
                        return;
                    }
                case 70:
                    try {
                        Drawable drawable = obj instanceof Integer ? com.mbridge.msdk.foundation.controller.c.n().d().getResources().getDrawable(((Integer) obj).intValue(), com.mbridge.msdk.foundation.controller.c.n().d().getTheme()) : null;
                        if (drawable != null) {
                            progressBar.setProgressDrawable(drawable);
                            return;
                        }
                        return;
                    } catch (Exception e12) {
                        q0.b("AttributeUtil", "Failed to set progressDrawable: " + e12.getMessage());
                        return;
                    }
                default:
                    return;
            }
        } catch (Throwable th2) {
            q0.b("AttributeUtil", th2.getMessage());
        }
        q0.b("AttributeUtil", th2.getMessage());
    }

    private static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "number":
                return 2;
            case "date":
                return 20;
            case "time":
                return 36;
            case "phone":
                return 3;
            case "textpassword":
                return TsExtractor.TS_STREAM_TYPE_AC3;
            case "datetime":
                return 4;
            default:
                return 1;
        }
    }

    private static ViewGroup.LayoutParams a(ViewGroup viewGroup) {
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof GridLayout) {
            return new GridLayout.LayoutParams();
        }
        return new ViewGroup.LayoutParams(-1, -1);
    }
}

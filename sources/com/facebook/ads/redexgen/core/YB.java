package com.facebook.ads.redexgen.core;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class YB {
    public static byte[] A00;
    public static String[] A01 = {"aXQ8cQ350VCAT2mitcvykUGHubvGx6C9", "NAK0YApfoevBcA8nU2", "YHwKc8bJ3fYIczYaga21kucMEh7K8adi", "qYAOAoZ496ND8", "6pHjubFxbGGqNA8P9d", "3r9qhhsI1oDbETggKvxV5tdwn", "sRn13xQSljRP603ULBb8dNJbjS", "vNgqutu69Vtz3tnibxv52jRaXo"};
    public static final int A02;
    public static final int A03;
    public static final ConcurrentHashMap<Integer, Integer> A04;
    public static final AtomicInteger A05;

    public static String A0C(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A00 = new byte[]{118, -127, -123, 125, 118, -35, -37, -26, -26, -33, -20, -50, -13, -22, -33, -127, -118, -121, -127, -119, 125, -111, -115, -109, -112, -127, -125, -43, -40, -37, -29, -44, -31, -44, -45, -50, -46, -37, -40, -46, -38, -50, -45, -44, -37, -48, -24, -50, -36, -30, -39, -34, -28, -43, -30, -29, -28, -39, -28, -39, -47, -36, -125, -115, 121, 125, 123, 125, 121, -128, -125, -122, -114, AbstractJsonLexerKt.TC_INVALID, -116, 121, 125, -122, -125, 125, -123, -115, 121, -119, -120, 121, 125, -114, 123, -99, -89, -109, -105, -90, -103, -107, -88, -99, -86, -103, -109, -107, -89, -109, -105, -88, -107, -109, -86, 102, -50, -63, -45, -67, -50, -64, -63, -64, -69, -46, -59, -64, -63, -53, -12, -15, -28, -15, -10, -15, -81, -17, -25, -26, -21, -9, -17, -38, -56, -43, -38, -108, -38, -52, -39, -48, -51, -108, -44, -52, -53, -48, -36, -44, -66, -73, -78, -70, -66, -82, -110, -83, -42, -44, -58, -45, -60, -51, -54, -60, -52};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A0i(C2300gi c2300gi, EnumC1549Mq enumC1549Mq, Map<String, String> map) {
        String str = map.get(A0C(89, 21, 37));
        boolean z2 = str != null && str.equals(Boolean.TRUE.toString());
        if (z2 && (A0h(c2300gi, enumC1549Mq) || A0f(enumC1549Mq, map))) {
            return true;
        }
        String str2 = map.get(A0C(62, 27, 11));
        return z2 && (str2 != null && str2.equals(Boolean.TRUE.toString())) && A0g(enumC1549Mq, map);
    }

    static {
        A0D();
        A03 = P3.A02(-1, 0);
        A02 = P3.A02(-16777216, 115);
        A05 = new AtomicInteger(1);
        A04 = new ConcurrentHashMap<>();
    }

    public static int A00() {
        int i2;
        int newValue;
        do {
            i2 = A05.get();
            newValue = i2 + 1;
            if (newValue > 16777215) {
                newValue = 1;
            }
        } while (!A05.compareAndSet(i2, newValue));
        return i2;
    }

    public static int A01(int i2) {
        return (int) TypedValue.applyDimension(2, i2, XX.A04);
    }

    public static int A02(int i2) {
        if (A0e(i2)) {
            return P3.A05(i2, -1, 0.4f);
        }
        return P3.A05(i2, -16777216, 0.2f);
    }

    public static int A03(TextView textView) {
        Layout layout;
        int lineCount;
        if (textView == null || textView.getLayout() == null || (lineCount = (layout = textView.getLayout()).getLineCount()) <= 0) {
            return 0;
        }
        double ellipsisCount = layout.getEllipsisCount(lineCount - 1);
        double ellipsisCount2 = ellipsisCount / (((double) textView.getText().length()) - ellipsisCount);
        if (A01[3].length() == 20) {
            throw new RuntimeException();
        }
        A01[3] = "IkK7ljd8WWfE470H6O9Fo";
        return (int) Math.ceil(ellipsisCount2);
    }

    public static int A04(TextView textView, int i2) {
        int lineHeightTitle = A03(textView);
        int lines = 0;
        int extraLinesRequired = textView.getLineHeight();
        while (i2 > extraLinesRequired && lines < lineHeightTitle) {
            lines++;
            i2 -= extraLinesRequired;
        }
        return lines;
    }

    public static Drawable A05(int i2, int i3) {
        return A08(i2, A02(i2), i3);
    }

    public static Drawable A06(int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(i3);
        return gradientDrawable;
    }

    public static Drawable A07(int i2, int i3) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, i3);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(i2);
        return shapeDrawable;
    }

    public static Drawable A08(int i2, int i3, int i4) {
        return A09(i2, i3, i2, i4);
    }

    public static Drawable A09(int i2, int i3, int i4, int i5) {
        return new RippleDrawable(ColorStateList.valueOf(i3), A06(i2, i5), A07(i4, i5));
    }

    public static Drawable A0A(int i2, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadii(fArr);
        return gradientDrawable;
    }

    public static TextView A0B(ViewGroup viewGroup) {
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (A01[3].length() == 20) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[0] = "6RJtTYzLBnUcHRvsTatmkmWKIun16hlE";
                strArr[2] = "BwINbhkVgYMYeGJED3O8k6L5SNrYNN6g";
                return textView;
            }
            if (childAt instanceof ViewGroup) {
                A0B((ViewGroup) childAt);
            }
        }
        return null;
    }

    public static void A0E(float f, LinearLayout linearLayout) {
        linearLayout.setOutlineProvider(new Y9(f));
        linearLayout.setClipToOutline(true);
    }

    public static void A0F(int i2, View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i2 / 3);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration((i2 / 3) * 2);
        scaleAnimation2.setInterpolator(new BounceInterpolator());
        scaleAnimation.setAnimationListener(new QA(view, scaleAnimation2));
        view.startAnimation(scaleAnimation);
    }

    public static void A0G(int i2, View view) {
        Integer viewId = A04.get(Integer.valueOf(i2));
        if (viewId != null) {
            view.setId(viewId.intValue());
        } else {
            A0K(view);
        }
    }

    public static void A0H(View view) {
        A0O(view, 8);
    }

    public static void A0I(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            A0W((ViewGroup) parent);
        }
    }

    public static void A0J(View view) {
        if (view == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (A01[3].length() == 20) {
            throw new RuntimeException();
        }
        A01[3] = "DU33ZJN3ug5gIBKNKyYbqVVAVCFz";
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public static void A0K(View view) {
        if (view == null) {
            return;
        }
        view.setId(View.generateViewId());
    }

    public static void A0L(View view) {
        A0O(view, 0);
    }

    public static void A0M(View view, float f, float f2, int i2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, A0C(0, 5, 6), f, f2);
        objectAnimatorOfFloat.setDuration(i2);
        objectAnimatorOfFloat.start();
    }

    public static void A0N(View view, int i2) {
        view.setBackground(new ColorDrawable(i2));
    }

    public static void A0O(View view, int i2) {
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    public static void A0P(View view, int i2, int i3) {
        A0V(view, A06(i2, i3));
    }

    public static void A0Q(View view, int i2, int i3) {
        A0V(view, A08(i2, A02(i2), i3));
    }

    public static void A0R(View view, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(i2);
        gradientDrawable.setStroke(i3, i4);
        A0V(view, gradientDrawable);
    }

    public static void A0S(View view, int i2, int i3, int i4) {
        A0V(view, A09(i2, A02(i2), i3, i4));
    }

    public static void A0T(View view, int i2, float[] fArr) {
        A0V(view, A0A(i2, fArr));
    }

    public static void A0U(View view, Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(0.0f);
        A0V(view, gradientDrawable);
    }

    public static void A0V(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void A0W(ViewGroup viewGroup) {
        A0X(viewGroup, 200);
    }

    public static void A0X(ViewGroup viewGroup, int i2) {
        A0Y(viewGroup, new AutoTransition(), i2);
    }

    public static void A0Y(ViewGroup viewGroup, Transition transition, int i2) {
        transition.setDuration(i2);
        transition.setInterpolator(new AccelerateDecelerateInterpolator());
        TransitionManager.beginDelayedTransition(viewGroup, transition);
    }

    public static void A0Z(Button button) {
        Typeface typeface = Typeface.create(A0C(124, 13, 115), 0);
        button.setTypeface(typeface);
    }

    public static void A0a(TextView textView, boolean z2, int i2) {
        Typeface typeface;
        if (z2) {
            typeface = Typeface.create(A0C(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 17, 88), 0);
        } else {
            Typeface typeface2 = Typeface.SANS_SERIF;
            typeface = Typeface.create(typeface2, 0);
        }
        textView.setTypeface(typeface);
        if (A01[5].length() != 25) {
            throw new RuntimeException();
        }
        A01[3] = "EYVeEO4Fu";
        textView.setTextSize(2, i2);
    }

    public static void A0b(Toast toast, String str, int i2, int i3, int i4) {
        if (toast == null) {
            return;
        }
        toast.setGravity(i2, i3, i4);
        TextView textViewA0B = A0B((ViewGroup) toast.getView());
        if (textViewA0B != null) {
            textViewA0B.setText(str);
            textViewA0B.setGravity(17);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x006c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0076  */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    public static void A0c(Map<String, String> map, AbstractC2465jd abstractC2465jd) {
        byte b2;
        String strA0C;
        if (abstractC2465jd == null) {
            return;
        }
        String strA10 = abstractC2465jd.A10();
        switch (strA10.hashCode()) {
            case -1364000502:
                if (strA10.equals(A0C(110, 14, 77))) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                strA0C = A0C(5, 10, 107);
                switch (b2) {
                    case 0:
                        map.put(strA0C, AdPlacementType.INTERSTITIAL.name());
                        break;
                    case 1:
                        map.put(strA0C, AdPlacementType.REWARDED_VIDEO.name());
                        break;
                }
                map.put(A0C(154, 8, 58), abstractC2465jd.A0u());
                map.put(A0C(89, 21, 37), String.valueOf(abstractC2465jd.A1e()));
                map.put(A0C(62, 27, 11), String.valueOf(abstractC2465jd.A1Y()));
                map.put(A0C(27, 23, 96), String.valueOf(abstractC2465jd.A0q()));
                return;
            case 604727084:
                String strA0C2 = A0C(50, 12, 97);
                if (A01[3].length() == 20) {
                    throw new RuntimeException();
                }
                A01[3] = "p9FB";
                if (strA10.equals(strA0C2)) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                strA0C = A0C(5, 10, 107);
                switch (b2) {
                    case 0:
                        map.put(strA0C, AdPlacementType.INTERSTITIAL.name());
                        break;
                    case 1:
                        map.put(strA0C, AdPlacementType.REWARDED_VIDEO.name());
                        break;
                }
                map.put(A0C(154, 8, 58), abstractC2465jd.A0u());
                map.put(A0C(89, 21, 37), String.valueOf(abstractC2465jd.A1e()));
                map.put(A0C(62, 27, 11), String.valueOf(abstractC2465jd.A1Y()));
                map.put(A0C(27, 23, 96), String.valueOf(abstractC2465jd.A0q()));
                return;
            default:
                b2 = -1;
                strA0C = A0C(5, 10, 107);
                switch (b2) {
                    case 0:
                        map.put(strA0C, AdPlacementType.INTERSTITIAL.name());
                        break;
                    case 1:
                        map.put(strA0C, AdPlacementType.REWARDED_VIDEO.name());
                        break;
                }
                map.put(A0C(154, 8, 58), abstractC2465jd.A0u());
                map.put(A0C(89, 21, 37), String.valueOf(abstractC2465jd.A1e()));
                map.put(A0C(62, 27, 11), String.valueOf(abstractC2465jd.A1Y()));
                map.put(A0C(27, 23, 96), String.valueOf(abstractC2465jd.A0q()));
                return;
        }
    }

    public static void A0d(View... viewArr) {
        for (View view : viewArr) {
            A0J(view);
        }
    }

    public static boolean A0e(int i2) {
        return P3.A00(i2) < 0.5d;
    }

    public static boolean A0f(EnumC1549Mq enumC1549Mq, Map<String, String> extraData) {
        boolean nonIabDestination = !A0C(162, 9, 82).equals(extraData.get(A0C(15, 12, 15)));
        boolean nonCtaClick = enumC1549Mq != EnumC1549Mq.A08;
        return nonIabDestination && nonCtaClick;
    }

    public static boolean A0g(EnumC1549Mq enumC1549Mq, Map<String, String> extraData) {
        boolean zEquals = A0C(162, 9, 82).equals(extraData.get(A0C(15, 12, 15)));
        boolean ctaClick = enumC1549Mq != EnumC1549Mq.A08;
        return zEquals && ctaClick;
    }

    public static boolean A0h(C2300gi c2300gi, EnumC1549Mq enumC1549Mq) {
        return enumC1549Mq == EnumC1549Mq.A08 && C1750Up.A2w(c2300gi);
    }
}

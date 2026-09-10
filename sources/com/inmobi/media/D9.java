package com.inmobi.media;

import A.RunnableC0905n;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.inmobi.commons.core.configs.AdConfig;
import com.squareup.picasso.Callback;
import com.squareup.picasso.RequestCreator;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class D9 {
    public static volatile WeakReference d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f22778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f22775c = MapsKt.g(new Pair(J8.class, (byte) 0), new Pair(Sc.class, (byte) 1), new Pair(Rc.class, (byte) 2), new Pair(C3081j8.class, (byte) 3), new Pair(ImageView.class, (byte) 6), new Pair(C3130m9.class, (byte) 7), new Pair(C3178p9.class, (byte) 4), new Pair(Button.class, (byte) 5), new Pair(T8.class, (byte) 8), new Pair(GestureDetectorOnGestureListenerC3005ec.class, (byte) 9), new Pair(K4.class, (byte) 10));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static WeakReference f22776e = new WeakReference(null);
    public static int f = 1;
    public static int g = 1;

    public D9(Context context) {
        f22776e = new WeakReference(context);
        this.f22778b = MapsKt.g(new Pair((byte) 0, new C3289w9(this)), new Pair((byte) 3, new C3225s9(this)), new Pair((byte) 1, new B9(this)), new Pair((byte) 2, new C3305x9(this)), new Pair((byte) 6, new C3273v9(this)), new Pair((byte) 10, new C3257u9(this)), new Pair((byte) 7, new A9(this)), new Pair((byte) 4, new C3321y9(this)), new Pair((byte) 5, new C3241t9(this)), new Pair((byte) 8, new C3337z9(this)), new Pair((byte) 9, new C9(this)));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    public final View a(Context context, C2984d8 asset, AdConfig adConfig) {
        byte b2;
        AbstractC3209r9 abstractC3209r9;
        View viewA;
        Intrinsics.f(context, "context");
        Intrinsics.f(asset, "asset");
        Intrinsics.f(adConfig, "adConfig");
        if (!(asset instanceof C3049h8)) {
            switch (asset.f23515c) {
                case "CTA":
                    b2 = 5;
                    break;
                case "GIF":
                    b2 = 10;
                    break;
                case "ICON":
                    b2 = 6;
                    break;
                case "TEXT":
                    b2 = 4;
                    break;
                case "IMAGE":
                    b2 = 6;
                    break;
                case "TIMER":
                    b2 = 8;
                    break;
                case "VIDEO":
                    b2 = 7;
                    break;
                case "WEBVIEW":
                    b2 = 9;
                    break;
                default:
                    b2 = -1;
                    break;
            }
        } else {
            C3049h8 c3049h8 = (C3049h8) asset;
            if (c3049h8.C) {
                b2 = 0;
            } else if (c3049h8.D) {
                byte b3 = c3049h8.f23661z;
                b2 = (b3 != 0 && b3 == 1) ? (byte) 2 : (byte) 1;
            } else {
                b2 = 3;
            }
        }
        if (-1 == b2 || (abstractC3209r9 = (AbstractC3209r9) this.f22778b.get(Byte.valueOf(b2))) == null) {
            return null;
        }
        f22776e = new WeakReference(context);
        if (abstractC3209r9.f23958a.isEmpty()) {
            abstractC3209r9.f23959b++;
            viewA = abstractC3209r9.a(context);
        } else {
            abstractC3209r9.f23960c++;
            viewA = (View) CollectionsKt.R(abstractC3209r9.f23958a);
            abstractC3209r9.d.f22777a--;
        }
        if (viewA != null) {
            abstractC3209r9.a(viewA, asset, adConfig);
        }
        return viewA;
    }

    public final void b(View view) {
        Byte b2 = (Byte) f22775c.get(view.getClass());
        byte bByteValue = b2 != null ? b2.byteValue() : (byte) -1;
        if (-1 == bByteValue) {
            view.toString();
            return;
        }
        AbstractC3209r9 abstractC3209r9 = (AbstractC3209r9) this.f22778b.get(Byte.valueOf(bByteValue));
        if (abstractC3209r9 == null) {
            return;
        }
        if (this.f22777a >= 300) {
            Iterator it = this.f22778b.entrySet().iterator();
            int size = 0;
            AbstractC3209r9 abstractC3209r10 = null;
            while (it.hasNext()) {
                AbstractC3209r9 abstractC3209r11 = (AbstractC3209r9) ((Map.Entry) it.next()).getValue();
                if (abstractC3209r11.f23958a.size() > size) {
                    size = abstractC3209r11.f23958a.size();
                    abstractC3209r10 = abstractC3209r11;
                }
            }
            if (abstractC3209r10 != null && abstractC3209r10.f23958a.size() > 0) {
                CollectionsKt.R(abstractC3209r10.f23958a);
            }
        }
        abstractC3209r9.a(view);
    }

    public static final void a(D9 d9, Button button, C2984d8 c2984d8) {
        d9.getClass();
        C3001e8 c3001e8 = c2984d8.d;
        Intrinsics.d(c3001e8, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeCtaAsset.NativeCtaAssetStyle");
        C3097k8 c3097k8 = (C3097k8) c3001e8;
        button.setLayoutParams(new ViewGroup.LayoutParams(C3146n9.a(c3097k8.f23552a.x), C3146n9.a(c3097k8.f23552a.y)));
        Object obj = c2984d8.f23516e;
        button.setText(obj instanceof CharSequence ? (CharSequence) obj : null);
        button.setTextSize(1, C3146n9.a(c3097k8.f22978l));
        int color = Color.parseColor("#ff000000");
        try {
            String str = c3097k8.f22979n;
            Locale US = Locale.US;
            Intrinsics.e(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            color = Color.parseColor(lowerCase);
        } catch (IllegalArgumentException e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        }
        button.setTextColor(color);
        int color2 = Color.parseColor("#00000000");
        try {
            color2 = Color.parseColor(c3097k8.a());
        } catch (IllegalArgumentException e3) {
            S5 s6 = S5.f23167a;
            S5.d.a(new C3011f2(e3));
        }
        button.setBackgroundColor(color2);
        button.setTextAlignment(4);
        button.setGravity(17);
        C3146n9.a(button, c3097k8.o);
        C3146n9.a(button, c3097k8);
    }

    public static final void a(D9 d9, ImageView imageView, C2984d8 c2984d8) {
        int i2;
        int i3;
        int i4;
        String str;
        d9.getClass();
        Object obj = c2984d8.f23516e;
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 != null) {
            int iA = C3146n9.a(c2984d8.d.f23552a.x);
            int iA2 = C3146n9.a(c2984d8.d.f23552a.y);
            String str3 = c2984d8.d.g;
            if (Intrinsics.a(str3, "aspectFit")) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (Intrinsics.a(str3, "aspectFill")) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            Context context = (Context) f22776e.get();
            int i5 = 0;
            if (context != null && iA > 0 && iA2 > 0) {
                int length = str2.length() - 1;
                int i6 = 0;
                boolean z2 = false;
                while (i6 <= length) {
                    boolean z3 = Intrinsics.h(str2.charAt(!z2 ? i6 : length), 32) <= 0;
                    if (z2) {
                        if (!z3) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z3) {
                        i6++;
                    } else {
                        z2 = true;
                    }
                }
                if (str2.subSequence(i6, length + 1).toString().length() > 0) {
                    C3322ya c3322ya = C3322ya.f24129a;
                    RequestCreator requestCreatorLoad = c3322ya.a(context).load(str2);
                    Object objA = c3322ya.a(new C3194q9(context, imageView, c2984d8));
                    Intrinsics.d(objA, "null cannot be cast to non-null type com.squareup.picasso.Callback");
                    requestCreatorLoad.into(imageView, (Callback) objA);
                    if ("cross_button".equalsIgnoreCase(c2984d8.f23514b) && ((str = c2984d8.f23521p) == null || str.length() == 0)) {
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3162o9(context, imageView), 2000L);
                    }
                }
            }
            C3049h8 c3049h8 = c2984d8.r;
            if (c3049h8 == null || !"line".equals(c3049h8.d.f23555e)) {
                i2 = 0;
                i3 = 0;
                i4 = 0;
            } else {
                C3001e8 c3001e8 = c3049h8.d;
                int i7 = c3001e8.f23554c.x == c2984d8.d.f23554c.x ? 1 : 0;
                i3 = C3146n9.a(c3001e8.f23552a.x) == C3146n9.a(c2984d8.d.f23552a.x) + c2984d8.d.f23554c.x ? 1 : 0;
                i4 = C3146n9.a(c3049h8.d.f23554c.y) == C3146n9.a(c2984d8.d.f23554c.y) ? 1 : 0;
                i5 = C3146n9.a(c3049h8.d.f23552a.y) == C3146n9.a(c2984d8.d.f23554c.y) + C3146n9.a(c2984d8.d.f23552a.y) ? 1 : 0;
                if (C3146n9.a(c3049h8.d.f23552a.x) == C3146n9.a(c2984d8.d.f23552a.x)) {
                    i2 = i5;
                    i3 = 1;
                    i5 = 1;
                } else {
                    i2 = i5;
                    i5 = i7;
                }
            }
            imageView.setPaddingRelative(i5, i4, i3, i2);
            C3146n9.a(imageView, c2984d8.d);
        }
    }

    public static final void a(D9 d9, TextView textView, C2984d8 c2984d8) {
        d9.getClass();
        C3001e8 c3001e8 = c2984d8.d;
        Intrinsics.d(c3001e8, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeTextAsset.NativeTextAssetStyle");
        M8 m8 = (M8) c3001e8;
        textView.setLayoutParams(new ViewGroup.LayoutParams(C3146n9.a(m8.f23552a.x), C3146n9.a(m8.f23552a.y)));
        Object obj = c2984d8.f23516e;
        textView.setText(obj instanceof CharSequence ? (CharSequence) obj : null);
        textView.setTypeface(Typeface.DEFAULT);
        byte b2 = m8.m;
        if (b2 == 0) {
            textView.setGravity(8388627);
        } else if (b2 == 1) {
            textView.setGravity(8388629);
        } else if (b2 == 2) {
            textView.setGravity(17);
        } else {
            textView.setGravity(8388627);
        }
        textView.setTextSize(1, C3146n9.a(m8.f22978l));
        int color = Color.parseColor("#ff000000");
        try {
            String str = m8.f22979n;
            Locale US = Locale.US;
            Intrinsics.e(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            color = Color.parseColor(lowerCase);
        } catch (IllegalArgumentException e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        }
        textView.setTextColor(color);
        int color2 = Color.parseColor("#00000000");
        try {
            color2 = Color.parseColor(m8.a());
        } catch (IllegalArgumentException e3) {
            S5 s6 = S5.f23167a;
            S5.d.a(new C3011f2(e3));
        }
        textView.setBackgroundColor(color2);
        textView.setTextAlignment(1);
        C3146n9.a(textView, m8.o);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setHorizontallyScrolling(true);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        C3146n9.a(textView, m8);
    }

    public final void a(View view) {
        Intrinsics.f(view, "view");
        if (!(view instanceof J8) && !(view instanceof C3081j8)) {
            b(view);
            return;
        }
        C3081j8 c3081j8 = (C3081j8) view;
        if (c3081j8.getChildCount() == 0) {
            b(view);
            return;
        }
        Stack stack = new Stack();
        stack.push(c3081j8);
        while (!stack.isEmpty()) {
            C3081j8 c3081j9 = (C3081j8) stack.pop();
            int childCount = c3081j9.getChildCount();
            while (true) {
                childCount--;
                if (-1 < childCount) {
                    View childAt = c3081j9.getChildAt(childCount);
                    c3081j9.removeViewAt(childCount);
                    if (childAt instanceof C3081j8) {
                        stack.push(childAt);
                    } else {
                        Intrinsics.c(childAt);
                        b(childAt);
                    }
                }
            }
            b(c3081j9);
        }
    }

    public static void a(T8 t8, C2984d8 c2984d8) {
        long jA;
        t8.setVisibility(4);
        Intrinsics.d(c2984d8, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeTimerAsset");
        Q8 q8 = (Q8) c2984d8;
        P8 p8 = q8.x;
        O8 o8 = p8.f23068a;
        O8 o9 = p8.f23069b;
        if (o8 != null) {
            try {
                jA = o8.a();
            } catch (Exception e2) {
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e2, "event"));
                return;
            }
        } else {
            jA = 0;
        }
        long jA2 = o9 != null ? o9.a() : 0L;
        if (jA2 >= 0) {
            t8.setTimerValue(jA2);
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0905n(0, q8, t8), jA * ((long) 1000));
        }
    }

    public static final void a(Q8 timerAsset, T8 timerView) {
        Intrinsics.f(timerAsset, "$timerAsset");
        Intrinsics.f(timerView, "$timerView");
        if (f22776e.get() != null) {
            if (timerAsset.y) {
                timerView.setVisibility(0);
            }
            timerView.d();
        }
    }
}

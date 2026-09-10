package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class le {
    private static final Object JVA = new Object();
    private static int JXs = -1;
    private static int LD = -1;
    private static float Lxb = -1.0f;
    private static int OY = -1;
    private static float QAg = -1.0f;
    private static int ZU = -1;
    private static ViewConfiguration ebl = null;
    private static WindowManager lc = null;
    private static float lk = -1.0f;
    private static Boolean nBu = null;
    private static boolean sLN = true;

    public static boolean IeN(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static boolean JVA(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(clsLoadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static float JXs(Context context) {
        Lxb(context, true);
        return Lxb;
    }

    private static boolean Lxb(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    public static boolean NXR(Context context) {
        String str = Build.MODEL;
        return str.equals("IN2010") || str.equals("IN2020") || str.equals("KB2000") || str.startsWith("ONEPLUS");
    }

    public static Pair<Integer, Integer> OY(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.kqm.Lxb();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static int QAg(Context context) {
        return ((Integer) OY(context).second).intValue();
    }

    public static boolean STP(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", TypedValues.Custom.S_STRING, "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            return (string == null || TextUtils.isEmpty(string)) ? false : true;
        } catch (Exception unused) {
        }
    }

    public static int ZU(Context context, float f) {
        Lxb(context, true);
        float fJXs = JXs(context);
        if (fJXs <= 0.0f) {
            fJXs = 1.0f;
        }
        return (int) ((f / fJXs) + 0.5f);
    }

    public static int ebl(Context context) {
        Lxb(context);
        return LD;
    }

    public static float lc(Context context) {
        Lxb(context);
        return lk;
    }

    private static boolean lk() {
        return Lxb < 0.0f || LD < 0 || lk < 0.0f || ZU < 0 || JXs < 0;
    }

    public static int nBu(Context context) {
        return ((Integer) OY(context).first).intValue();
    }

    public static boolean sLN(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static int LD(Context context, float f) {
        Lxb(context);
        float fLc = lc(context);
        if (fLc <= 0.0f) {
            fLc = 1.0f;
        }
        return (int) ((f / fLc) + 0.5f);
    }

    public static void Lxb(Context context) {
        Lxb(context, false);
    }

    public static int lk(Context context, float f) {
        return Float.valueOf(Lxb(context, f, true)).intValue();
    }

    public static void JXs(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.le.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    le.Lxb(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    public static void Lxb(Context context, boolean z) {
        Context contextLxb = context == null ? com.bytedance.sdk.openadsdk.core.kqm.Lxb() : context;
        if (contextLxb == null) {
            return;
        }
        lc = (WindowManager) contextLxb.getSystemService("window");
        if (lk() || z) {
            DisplayMetrics displayMetrics = contextLxb.getResources().getDisplayMetrics();
            Lxb = displayMetrics.density;
            LD = displayMetrics.densityDpi;
            lk = displayMetrics.scaledDensity;
            ZU = displayMetrics.widthPixels;
            JXs = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            int i = ZU;
            int i2 = JXs;
            if (i > i2) {
                ZU = i2;
                JXs = i;
                return;
            }
            return;
        }
        int i3 = ZU;
        int i4 = JXs;
        if (i3 < i4) {
            ZU = i4;
            JXs = i3;
        }
    }

    public static int ZU(Context context) {
        Lxb(context);
        return JXs;
    }

    public static void ebl(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static void lc(View view) {
        if (view == null) {
            return;
        }
        Lxb(view, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.le.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                onAnimationEnd(animator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    public static int lk(Context context) {
        Lxb(context);
        return ZU;
    }

    public static int[] LD(Context context) {
        if (context == null) {
            return null;
        }
        if (lc == null) {
            lc = (WindowManager) com.bytedance.sdk.openadsdk.core.kqm.Lxb().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = lc;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i = point.x;
                i2 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i;
            iArr[1] = i2;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static boolean ZU(View view) {
        return view != null && view.getVisibility() == 0;
    }

    @Nullable
    public static int[] lk(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static boolean ZU(Activity activity) {
        DisplayCutout displayCutout;
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
                sLN = false;
            } else {
                displayCutout = null;
            }
            return displayCutout != null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("UIUtils", e.getMessage());
            return false;
        }
    }

    public static boolean lk(Activity activity) {
        if (nBu == null) {
            synchronized (JVA) {
                try {
                    if (nBu == null) {
                        String strLxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("cutout_devices", "");
                        String str = Build.MODEL;
                        if (!TextUtils.isEmpty(strLxb) && !TextUtils.isEmpty(str)) {
                            try {
                                JSONArray jSONArray = new JSONArray(strLxb);
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    if (str.equals(jSONArray.getString(i))) {
                                        nBu = Boolean.TRUE;
                                        return true;
                                    }
                                }
                            } catch (Exception e) {
                                Sfi.LD("UIUtils", e.getMessage());
                            }
                        }
                        nBu = Boolean.valueOf(ZU(activity) || Lxb("ro.miui.notch", activity) == 1 || JVA(activity) || IeN(activity) || sLN(activity) || NXR(activity) || STP(activity));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nBu.booleanValue();
    }

    public static float Lxb(Context context, float f) {
        Lxb(context);
        return lc(context) * f;
    }

    public static float Lxb(Context context, float f, boolean z) {
        Lxb(context);
        return (JXs(context) * f) + (z ? 0.5f : 0.0f);
    }

    public static int[] LD(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    @Nullable
    public static int[] Lxb(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static void LD(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    public static void Lxb(View view, int i) {
        if (view == null || view.getVisibility() == i || !Lxb(i)) {
            return;
        }
        view.setVisibility(i);
    }

    public static boolean LD() {
        return sLN && Build.VERSION.SDK_INT >= 28;
    }

    private static Bitmap LD(com.bytedance.sdk.component.QAg.ZU zu) {
        if (zu == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zu.getWidth(), zu.getHeight(), Bitmap.Config.RGB_565);
            zu.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void Lxb(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lk(final com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str, String str2, final Bitmap bitmap, final String str3, final long j) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(System.currentTimeMillis(), tDVar, str, str2, new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.utils.le.4
                        @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                        public JSONObject Lxb() {
                            try {
                                int iLxb = le.Lxb(bitmap);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("url", str3);
                                long j2 = j;
                                if (j2 != -1) {
                                    jSONObject.put("page_id", j2);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", iLxb == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.eK.LD(tDVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(tDVar) ? 1 : 0);
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                                    return jSONObject2;
                                } catch (JSONException unused) {
                                    return jSONObject2;
                                }
                            } catch (JSONException unused2) {
                                return null;
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.Lxb("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th)));
            }
        }
    }

    public static void Lxb(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        Lxb(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
    }

    private static ArrayList<Integer> LD(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i3) >> 16, (65280 & i3) >> 8, i3 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void Lxb(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4) {
            return;
        }
        if (i != -3) {
            marginLayoutParams.leftMargin = i;
        }
        if (i2 != -3) {
            marginLayoutParams.topMargin = i2;
        }
        if (i3 != -3) {
            marginLayoutParams.rightMargin = i3;
        }
        if (i4 != -3) {
            marginLayoutParams.bottomMargin = i4;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    private static Bitmap Lxb(WebView webView) {
        Bitmap bitmapCreateBitmap = null;
        try {
            Picture pictureCapturePicture = webView.capturePicture();
            bitmapCreateBitmap = Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            pictureCapturePicture.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("UIUtils", th.getMessage());
            return bitmapCreateBitmap;
        }
    }

    public static void LD(View view, final float f) {
        if (view != null && f > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.le.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f);
                }
            });
            view.setClipToOutline(true);
        }
    }

    public static float Lxb() {
        float f = QAg;
        if (f > 0.0f) {
            return f;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.kqm.Lxb().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        QAg = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void Lxb(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("UIUtils", e.getMessage());
        }
    }

    public static int Lxb(String str, Activity activity) {
        if (!CSn.JXs()) {
            return 0;
        }
        try {
            Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
            return ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), 0)).intValue();
        } catch (ClassNotFoundException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("UIUtils", e.getMessage());
            return 0;
        } catch (IllegalAccessException e2) {
            com.bytedance.sdk.component.utils.sLN.Lxb("UIUtils", e2.getMessage());
            return 0;
        } catch (IllegalArgumentException e3) {
            com.bytedance.sdk.component.utils.sLN.Lxb("UIUtils", e3.getMessage());
            return 0;
        } catch (NoSuchMethodException e4) {
            com.bytedance.sdk.component.utils.sLN.Lxb("UIUtils", e4.getMessage());
            return 0;
        } catch (InvocationTargetException e5) {
            com.bytedance.sdk.component.utils.sLN.Lxb("UIUtils", e5.getMessage());
            return 0;
        }
    }

    public static void Lxb(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.sLN.Lxb("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void Lxb(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.sLN.Lxb("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void Lxb(View view, float f) {
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    public static void Lxb(TextView textView, com.bytedance.sdk.openadsdk.core.widget.VVE vve, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        Lxb(textView, vve, tDVar, 14);
    }

    public static void Lxb(TextView textView, com.bytedance.sdk.openadsdk.core.widget.VVE vve, com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i) {
        Lxb(textView, vve, (tDVar == null || tDVar.MGT() == null) ? -1.0d : tDVar.MGT().ZU(), i);
    }

    public static void Lxb(TextView textView, com.bytedance.sdk.openadsdk.core.widget.VVE vve, double d, int i) {
        if (d == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            vve.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d)));
            }
            Lxb(vve, d, i);
        }
    }

    public static void Lxb(com.bytedance.sdk.openadsdk.core.widget.VVE vve, double d, int i) {
        if (d < 0.0d) {
            vve.setVisibility(8);
        } else {
            vve.setVisibility(0);
            vve.Lxb(d, i);
        }
    }

    public static Bitmap Lxb(com.bytedance.sdk.component.QAg.ZU zu) {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        WebView webView = zu.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap bitmapLD = LD(zu);
        if (bitmapLD == null) {
            bitmapLD = Lxb(webView);
        }
        webView.setLayerType(layerType, null);
        if (bitmapLD == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.ZU.Lxb(bitmapLD, bitmapLD.getWidth() / 6, bitmapLD.getHeight() / 6);
    }

    public static void Lxb(final com.bytedance.sdk.openadsdk.core.model.tD tDVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j) {
        hg.LD(new com.bytedance.sdk.component.OY.OY("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.le.3
            @Override // java.lang.Runnable
            public void run() {
                le.lk(tDVar, str, str2, bitmap, str3, j);
            }
        }, 10);
    }

    public static int Lxb(Bitmap bitmap) {
        try {
            ArrayList<Integer> arrayListLD = LD(bitmap);
            if (arrayListLD == null) {
                return -1;
            }
            HashMap map = new HashMap();
            for (Integer num : arrayListLD) {
                if (map.containsKey(num)) {
                    Integer numValueOf = Integer.valueOf(((Integer) map.get(num)).intValue() + 1);
                    map.remove(num);
                    map.put(num, numValueOf);
                } else {
                    map.put(num, 1);
                }
            }
            int iIntValue = 0;
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (i < iIntValue2) {
                    iIntValue = ((Integer) entry.getKey()).intValue();
                    i = iIntValue2;
                }
            }
            if (iIntValue == 0) {
                return -1;
            }
            return (int) ((i / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean Lxb(float f, float f2, Context context) {
        if (f != -1.0f && f2 != -1.0f) {
            if (ebl == null) {
                ebl = ViewConfiguration.get(context);
            }
            if (OY == -1) {
                OY = ebl.getScaledTouchSlop();
            }
            if (f - f2 > OY) {
                return true;
            }
        }
        return false;
    }

    public static void Lxb(boolean z) {
        nBu = Boolean.valueOf(z);
    }
}

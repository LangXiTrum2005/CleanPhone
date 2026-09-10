package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
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
import com.unity3d.services.UnityAdsConstants;
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
public class qd {
    private static boolean aw = true;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private static final Object f18173co = new Object();
    private static int di = -1;
    private static int fi = -1;
    private static float ik = -1.0f;
    private static int jbs = -1;
    private static int ka = -1;
    private static int lr = -1;
    private static ViewConfiguration mj = null;
    private static float qt = -1.0f;
    private static float ri = -1.0f;
    private static Boolean sf;
    private static WindowManager xha;

    public static int aw(Context context) {
        return ((Integer) sf(context).first).intValue();
    }

    public static boolean bgr(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean bu(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            return (string == null || TextUtils.isEmpty(string)) ? false : true;
        } catch (Exception unused) {
        }
    }

    public static int co(Context context) {
        return ((Integer) sf(context).second).intValue();
    }

    public static int di(Context context) {
        if (context == null) {
            com.bytedance.sdk.openadsdk.core.nr.ri();
        }
        if (context == null) {
            return di;
        }
        if (context.getResources() != null && context.getResources().getConfiguration() != null) {
            di = context.getResources().getConfiguration().smallestScreenWidthDp;
        }
        return di;
    }

    public static int fi(Context context) {
        ri(context);
        return fi;
    }

    private static boolean ik() {
        return ri < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || lr < 0 || ik < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ka < 0 || fi < 0;
    }

    public static float jbs(Context context) {
        ri(context);
        return ik;
    }

    public static int ka(Context context) {
        ri(context);
        return ik(context, ka);
    }

    public static float mj(Context context) {
        ri(context, true);
        return ri;
    }

    public static boolean nr(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static int qt(Context context) {
        ri(context);
        return lr;
    }

    private static boolean ri(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    public static Pair<Integer, Integer> sf(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.nr.ri();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static boolean slm(Context context) {
        String str = Build.MODEL;
        return str.equals("IN2010") || str.equals("IN2020") || str.equals("KB2000") || str.startsWith("ONEPLUS");
    }

    public static boolean vr(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static int xha(Context context) {
        ri(context);
        return ik(context, fi);
    }

    public static int ik(Context context, float f) {
        ri(context, true);
        float fMj = mj(context);
        if (fMj <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fMj = 1.0f;
        }
        return (int) ((f / fMj) + 0.5f);
    }

    public static int lr(Context context, float f) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        return Float.valueOf(ri(context, f, true)).intValue();
    }

    public static void ri(Context context) {
        ri(context, false);
    }

    public static void fi(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.qd.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    qd.ri(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    public static boolean ka(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static int[] lr(Context context) {
        if (context == null) {
            return null;
        }
        if (xha == null) {
            xha = (WindowManager) com.bytedance.sdk.openadsdk.core.nr.ri().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = xha;
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

    public static void ri(Context context, boolean z) {
        Context contextRi = context == null ? com.bytedance.sdk.openadsdk.core.nr.ri() : context;
        if (contextRi == null) {
            return;
        }
        xha = (WindowManager) contextRi.getSystemService("window");
        if (ik() || z) {
            DisplayMetrics displayMetrics = contextRi.getResources().getDisplayMetrics();
            ri = displayMetrics.density;
            lr = displayMetrics.densityDpi;
            ik = displayMetrics.scaledDensity;
            ka = displayMetrics.widthPixels;
            fi = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.orientation == 1) {
            int i = ka;
            int i2 = fi;
            if (i > i2) {
                ka = i2;
                fi = i;
            }
        } else {
            int i3 = ka;
            int i4 = fi;
            if (i3 < i4) {
                ka = i4;
                fi = i3;
            }
        }
        di = configuration.smallestScreenWidthDp;
    }

    public static void xha(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static int ik(Context context) {
        ri(context);
        return ka;
    }

    public static boolean ka(Activity activity) {
        DisplayCutout displayCutout;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    displayCutout = rootWindowInsets.getDisplayCutout();
                    aw = false;
                } else {
                    displayCutout = null;
                }
                if (displayCutout != null) {
                    return true;
                }
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.ac.ik("UIUtils", e.getMessage());
            }
        }
        return false;
    }

    public static int[] ik(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static void di(View view) {
        if (view == null) {
            return;
        }
        ri(view, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.qd.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    public static boolean ik(Activity activity) {
        if (sf == null) {
            synchronized (f18173co) {
                try {
                    if (sf == null) {
                        String strRi = com.bytedance.sdk.openadsdk.wjv.fi.ri("cutout_devices", "");
                        String str = Build.MODEL;
                        if (!TextUtils.isEmpty(strRi) && !TextUtils.isEmpty(str)) {
                            try {
                                JSONArray jSONArray = new JSONArray(strRi);
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    if (str.equals(jSONArray.getString(i))) {
                                        sf = Boolean.TRUE;
                                        return true;
                                    }
                                }
                            } catch (Exception e) {
                                com.bytedance.sdk.component.utils.ac.ik("UIUtils", e.getMessage());
                            }
                        }
                        sf = Boolean.valueOf(ka(activity) || ri("ro.miui.notch", activity) == 1 || bgr(activity) || nr(activity) || vr(activity) || slm(activity) || bu(activity));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sf.booleanValue();
    }

    public static int[] lr(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static float ri(Context context, float f) {
        ri(context);
        return f * jbs(context);
    }

    public static void lr(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    public static float ri(Context context, float f, boolean z) {
        ri(context);
        return (f * mj(context)) + (z ? 0.5f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static int[] ri(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static boolean lr() {
        return aw && Build.VERSION.SDK_INT >= 28;
    }

    private static Bitmap lr(com.bytedance.sdk.component.jbs.di diVar) {
        if (diVar == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(diVar.getWidth(), diVar.getHeight(), Bitmap.Config.RGB_565);
            diVar.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void ri(View view, int i) {
        if (view == null || view.getVisibility() == i || !ri(i)) {
            return;
        }
        view.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ik(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, String str2, final Bitmap bitmap, final String str3, final long j) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVar, str, str2, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.utils.qd.4
                        @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                        public JSONObject ik() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                int iRi = qd.ri(bitmap);
                                jSONObject.put("url", str3);
                                long j2 = j;
                                if (j2 != -1) {
                                    jSONObject.put("page_id", j2);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", iRi == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.dw.lr(wjvVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri().ri(wjvVar) ? 1 : 0);
                            } catch (JSONException unused) {
                            }
                            return jSONObject;
                        }
                    });
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ac.ik("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th)));
            }
        }
    }

    public static void ri(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    private static ArrayList<Integer> lr(Bitmap bitmap) {
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

    public static void ri(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ri(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
    }

    private static void ri(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
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

    public static void lr(View view, final float f) {
        if (view != null && f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.qd.5
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

    private static Bitmap ri(WebView webView) {
        Bitmap bitmapCreateBitmap = null;
        try {
            Picture pictureCapturePicture = webView.capturePicture();
            bitmapCreateBitmap = Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            pictureCapturePicture.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("UIUtils", th.getMessage());
            return bitmapCreateBitmap;
        }
    }

    public static float ri() {
        float f = qt;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.nr.ri().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        qt = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void ri(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ik("UIUtils", e.getMessage());
        }
    }

    public static int ri(String str, Activity activity) {
        if (igq.fi()) {
            try {
                Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), 0)).intValue();
            } catch (ClassNotFoundException e) {
                com.bytedance.sdk.component.utils.ac.ik("UIUtils", e.getMessage());
            } catch (IllegalAccessException e2) {
                com.bytedance.sdk.component.utils.ac.ik("UIUtils", e2.getMessage());
            } catch (IllegalArgumentException e3) {
                com.bytedance.sdk.component.utils.ac.ik("UIUtils", e3.getMessage());
            } catch (NoSuchMethodException e4) {
                com.bytedance.sdk.component.utils.ac.ik("UIUtils", e4.getMessage());
            } catch (InvocationTargetException e5) {
                com.bytedance.sdk.component.utils.ac.ik("UIUtils", e5.getMessage());
            }
        }
        return 0;
    }

    public static void ri(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.ac.ik("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void ri(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.ac.ik("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void ri(View view, float f) {
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    public static void ri(TextView textView, com.bytedance.sdk.openadsdk.core.widget.slm slmVar, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        ri(textView, slmVar, wjvVar, 14);
    }

    public static void ri(TextView textView, com.bytedance.sdk.openadsdk.core.widget.slm slmVar, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i) {
        ri(textView, slmVar, (wjvVar == null || wjvVar.tyz() == null) ? -1.0d : wjvVar.tyz().ka(), i);
    }

    public static void ri(TextView textView, com.bytedance.sdk.openadsdk.core.widget.slm slmVar, double d, int i) {
        if (d == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            slmVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d)));
            }
            ri(slmVar, d, i);
        }
    }

    public static void ri(com.bytedance.sdk.openadsdk.core.widget.slm slmVar, double d, int i) {
        if (d < 0.0d) {
            slmVar.setVisibility(8);
        } else {
            slmVar.setVisibility(0);
            slmVar.ri(d, i);
        }
    }

    public static Bitmap ri(com.bytedance.sdk.component.jbs.di diVar) {
        WebView webView = diVar.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap bitmapLr = lr(diVar);
        if (bitmapLr == null) {
            bitmapLr = ri(webView);
        }
        webView.setLayerType(layerType, null);
        if (bitmapLr == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.ka.ri(bitmapLr, bitmapLr.getWidth() / 6, bitmapLr.getHeight() / 6);
    }

    public static void ri(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j) {
        dzy.lr(new com.bytedance.sdk.component.mj.lr.ik("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.qd.3
            @Override // java.lang.Runnable
            public void run() {
                qd.ik(wjvVar, str, str2, bitmap, str3, j);
            }
        }, 10);
    }

    public static int ri(Bitmap bitmap) {
        try {
            ArrayList<Integer> arrayListLr = lr(bitmap);
            if (arrayListLr == null) {
                return -1;
            }
            HashMap map = new HashMap();
            for (Integer num : arrayListLr) {
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

    public static boolean ri(float f, float f2, Context context) {
        if (f != -1.0f && f2 != -1.0f) {
            if (mj == null) {
                mj = ViewConfiguration.get(context);
            }
            if (jbs == -1) {
                jbs = mj.getScaledTouchSlop();
            }
            if (f - f2 > jbs) {
                return true;
            }
        }
        return false;
    }

    public static void ri(boolean z) {
        sf = Boolean.valueOf(z);
    }
}

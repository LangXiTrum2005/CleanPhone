package com.inmobi.media;

import A.RunnableC0905n;
import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.hardware.display.DisplayManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class U3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f23255c;
    public static JSONObject f;
    public static Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Float f23257h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V3 f23253a = new V3(0, 2.0f, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T3 f23254b = new T3(0, 0);
    public static float d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f23256e = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f23258i = L3.f22938a.F();

    public static String a() {
        Display displayA;
        Context contextD = Uc.d();
        if (contextD == null || (displayA = a(contextD)) == null) {
            return "0x0";
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append('x');
        sb.append(i3);
        return sb.toString();
    }

    public static float b() {
        Display displayA;
        if (d == -1.0f) {
            Context contextD = Uc.d();
            if (contextD == null || (displayA = a(contextD)) == null) {
                return 2.0f;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayA.getMetrics(displayMetrics);
            float f2 = displayMetrics.density;
            if (f2 == 0.0f) {
                return 2.0f;
            }
            d = f2;
        }
        return d;
    }

    public static HashMap c() {
        HashMap map = new HashMap();
        try {
            map.put("d-device-screen-density", String.valueOf(b()));
            V3 v3D = d();
            StringBuilder sb = new StringBuilder();
            sb.append(v3D.f23292a);
            sb.append('X');
            sb.append(v3D.f23293b);
            map.put("d-device-screen-size", sb.toString());
            map.put("d-density-dependent-screen-size", a());
            map.put("d-orientation", String.valueOf((int) g()));
            Float f2 = f23257h;
            map.put("d-textsize", String.valueOf(f2 != null ? f2.floatValue() : 37.0f));
        } catch (Exception unused) {
        }
        return map;
    }

    public static V3 d() {
        Context contextD = Uc.d();
        if (contextD == null) {
            return f23253a;
        }
        Display displayA = a(contextD);
        if (displayA == null) {
            return f23253a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getMetrics(displayMetrics);
        float f2 = displayMetrics.density;
        return new V3((int) (displayMetrics.widthPixels / f2), f2, (int) (displayMetrics.heightPixels / f2));
    }

    public static String e() {
        String string = null;
        if (f23256e) {
            return null;
        }
        String str = f23255c;
        if (str != null) {
            return str;
        }
        Context contextD = Uc.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = C6.f22734b;
            string = B6.a(contextD, "display_info_store").f22735a.getString("gesture_margin", null);
        }
        f23255c = string;
        return string;
    }

    public static Integer f() {
        Context contextD = Uc.d();
        if (contextD == null) {
            return null;
        }
        int i2 = Settings.Secure.getInt(contextD.getContentResolver(), "navigation_mode", -1);
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return i2 != 2 ? null : 1;
    }

    public static byte g() {
        Display displayA;
        Context contextD = Uc.d();
        if (contextD == null || (displayA = a(contextD)) == null) {
            return (byte) 1;
        }
        int rotation = displayA.getRotation();
        if (rotation == 1) {
            return (byte) 3;
        }
        if (rotation != 2) {
            return rotation != 3 ? (byte) 1 : (byte) 4;
        }
        return (byte) 2;
    }

    public static V3 h() {
        Context contextD = Uc.d();
        if (contextD == null) {
            return f23253a;
        }
        Display displayA = a(contextD);
        if (displayA == null) {
            return f23253a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getRealMetrics(displayMetrics);
        float f2 = displayMetrics.density;
        return new V3((int) (displayMetrics.widthPixels / f2), f2, (int) (displayMetrics.heightPixels / f2));
    }

    public static final void b(Context context) {
        Window window;
        WindowInsets rootWindowInsets;
        if (f23256e || !(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return;
        }
        a(rootWindowInsets, context);
    }

    public static void a(WindowInsets insets, Context context) {
        Intrinsics.f(insets, "insets");
        if (f23256e) {
            return;
        }
        Uc.a(new RunnableC0905n(13, insets, context));
    }

    public static Display a(Context context) {
        if (L3.f22938a.E()) {
            Object systemService = context.getSystemService(com.ironsource.d9.h.d);
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            if (displayManager != null) {
                return displayManager.getDisplay(0);
            }
        } else {
            Object systemService2 = context.getSystemService("window");
            WindowManager windowManager = systemService2 instanceof WindowManager ? (WindowManager) systemService2 : null;
            if (windowManager != null) {
                return windowManager.getDefaultDisplay();
            }
        }
        return null;
    }

    public static final void b(WindowInsets insets, Context context) {
        Intrinsics.f(insets, "$insets");
        try {
            String string = insets.getSystemGestureInsets().toString();
            Intrinsics.e(string, "toString(...)");
            String[] strArr = (String[]) new Regex("Insets").f(string, 0).toArray(new String[0]);
            StringBuffer stringBuffer = new StringBuffer();
            if (strArr.length > 1) {
                String[] strArr2 = (String[]) new Regex(",").f(new Regex("[^0-9,=a-zA-Z]*").c("", strArr[1]), 0).toArray(new String[0]);
                stringBuffer.append("{");
                int length = strArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    String[] strArr3 = (String[]) new Regex(com.ironsource.d9.i.f24747b).f(strArr2[i2], 0).toArray(new String[0]);
                    if (strArr3.length == 2) {
                        stringBuffer.append(AbstractJsonLexerKt.STRING + strArr3[0] + AbstractJsonLexerKt.STRING);
                        stringBuffer.append(":");
                        stringBuffer.append(B2.b(((float) Integer.parseInt(strArr3[1])) / b()));
                        if (i2 < strArr2.length - 1) {
                            stringBuffer.append(", ");
                        }
                    }
                }
                stringBuffer.append("}");
            }
            if (stringBuffer.length() > 0) {
                f23255c = stringBuffer.toString();
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                Intrinsics.c(context);
                C6.a(B6.a(context, "display_info_store"), "gesture_margin", stringBuffer.toString(), false, 4, (Object) null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    public static int a(WindowInsets insets) {
        Intrinsics.f(insets, "insets");
        if (!L3.f22938a.z()) {
            return 0;
        }
        EnumC3179pa enumC3179paA = AbstractC3195qa.a(g());
        Insets insets2 = insets.getInsets(16);
        Intrinsics.e(insets2, "getInsets(...)");
        int iOrdinal = enumC3179paA.ordinal();
        if (iOrdinal == 0) {
            if (insets2.left != 0 && insets2.right == 0) {
                return 0;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    if (insets2.right == 0 && insets2.bottom == 0) {
                        return 0;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (insets2.left != 0) {
            }
        } else if (insets2.left == 0 && insets2.bottom == 0) {
            return 0;
        }
        return 1;
    }

    public static void a(LinkedHashMap value) {
        Intrinsics.f(value, "value");
        Context contextD = Uc.d();
        if (contextD == null) {
            return;
        }
        Uc.a(new RunnableC0905n(14, value, contextD));
    }

    public static final void a(Map value, Context context) throws JSONException {
        Intrinsics.f(value, "$value");
        Intrinsics.f(context, "$context");
        Objects.toString(value);
        if (f == null) {
            f = new JSONObject();
        }
        Iterator it = value.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            JSONObject jSONObject = f;
            if (jSONObject != null) {
                jSONObject.put(String.valueOf(iIntValue), value.get(Integer.valueOf(iIntValue)));
            }
        }
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        C6 c6A = B6.a(context, "display_info_store");
        JSONObject jSONObject2 = f;
        C6.a(c6A, "safe_area", jSONObject2 != null ? jSONObject2.toString() : null, false, 4, (Object) null);
    }

    public static void a(Integer num) {
        Context contextD = Uc.d();
        if (contextD == null) {
            return;
        }
        Uc.a(new RunnableC0905n(12, num, contextD));
    }

    public static final void a(Integer num, Context context) {
        Intrinsics.f(context, "$context");
        g = num;
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        C6.a(B6.a(context, "display_info_store"), "nav_bar_type", num != null ? num.intValue() : -1, false, 4, (Object) null);
    }
}

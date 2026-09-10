package com.p004ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import com.smartdigimkt.a6.d;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class jy {

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2811 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2812;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f2813;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2814;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static byte[] f2815;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2816;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject f2817;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2818;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject f2819;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2820;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2821;

    static {
        m2699();
        f2817 = null;
        int i2 = f2811 + 9;
        f2816 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static synchronized JSONObject m2693() {
        try {
            f2811 = (f2816 + 107) % 128;
            if (f2817 == null) {
                JSONObject jSONObject = new JSONObject();
                f2817 = jSONObject;
                try {
                    jSONObject.put(m2711((byte) ((-113) - TextUtils.getTrimmedLength("")), (short) (153 - AndroidCharacter.getMirror('0')), AndroidCharacter.getMirror('0') - 144, (-322500771) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) - 76068208).intern(), -1);
                    f2817.put(m2710((byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8), "q", TextUtils.getOffsetAfter("", 0) + 1).intern(), -1);
                    f2811 = (f2816 + 5) % 128;
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2817;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static JSONObject m2694() {
        int i2 = f2811 + 29;
        f2816 = i2 % 128;
        if (i2 % 2 != 0) {
            kc.m2767(m2695());
            throw null;
        }
        JSONObject jSONObjectM2767 = kc.m2767(m2695());
        int i3 = f2811 + 113;
        f2816 = i3 % 128;
        if (i3 % 2 == 0) {
            return jSONObjectM2767;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static synchronized JSONObject m2695() {
        JSONObject jSONObject;
        int i2 = (f2816 + 67) % 128;
        f2811 = i2;
        jSONObject = f2819;
        int i3 = i2 + 101;
        f2816 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2698(JSONObject jSONObject) {
        f2816 = (f2811 + 85) % 128;
        try {
            jSONObject.put(m2710((byte) (8 - ExpandableListView.getPackedPositionType(0L)), "\u0001\u0002\u0003\u0004", TextUtils.getOffsetAfter("", 0) + 4).intern(), m2712());
            int i2 = f2811 + 7;
            f2816 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 60 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2699() {
        f2820 = (char) 6;
        f2818 = new char[]{'s', 'i', 'z', 'e', 'h', 'w', 'n', 'd', 'o', 'D', 'v', 'c', 'U', 't', 'l', 'E', 'r', ' ', 'g', 'p', 'a', 'y', 'M', 'f', 'm', 'x', 'b', 'j', AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.UNICODE_ESC, AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ, '~', 127, 128};
        f2821 = 322500770;
        f2814 = 95;
        f2812 = 76068327;
        f2815 = new byte[]{-94, -47, 24, -23, -28, 24, -1, -63, 19, 22, -31, 16, -35, 66, -98, -23, -24, 23, 81, -72, -5, -27, -30, -23, 26, 3, -63, 19, 22, -31, 16, -35, 66, -92, -28, 16, -32, 11, 26, -23, 82, -99, 16, 84, -71, 14, -24, 11, 56, -87, -32, -42, 110, -40, 112, -52, -33, -91, -103, -6, -122, -91, 52, -127, -120, -91, -126, -119, -126, -67, 36, -15, 28, -60, 44, 28, 113, 99, -61, -65, -64, -58, 22, -119, 85, 21, -63, 17, -66, -53, 28, -125, 108, -65, 25, -66, -23, -60, -123, -35, 117, -123, 42, 74, 126, -40, AbstractJsonLexerKt.TC_INVALID, -40, -44, -116, 21, 67, -115, -46, 22, 48, -38, -46, 24, 62, 126, -38, -118, -41, -44, -123, 28, 53, -40, -126, -41, -78, -91, -66, -82, 82, -91, 102, 4, 93, -90, 5, 1, -99, -7, -91, 102, -118, 110, -91, 4, 18, -6, -91, 92, -78, 78, -62, 3, 4, -22, 12, 64, -84, -10, 81, -84, 4, -11, 0, 68, -74, -12, -2, 2, -18, -1, 72, -76, -12, 0, 0, -3, -2, 60, -85, -2, -8, -3, 40, -59, 108, 10, -120, 28, 111, 13, 26, 120, 105, 115, 39, 27, 37, 25, 27, 25, 10, 91, 118, 29, 109, 27, 33, 119, 114, 40, 112, -39, 97, 114, 113, 120, 37, 109, 40, -91, 72, 10, 25, -91, 74, 70, 100, -91, -16, -11, -110, -88, -124, -123, 31, -111, 22, -125, -91, -31, -31, 119, -90, -24, -106, -21, -15};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX WARN: Code duplicated, block: B:14:0x002b A[RETURN] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m2706(int i2, int i3) {
        if (i2 >= 0) {
            int i4 = f2811 + 33;
            f2816 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 76 / 0;
                if (i3 >= 0) {
                    if (i2 <= m2702()) {
                        f2816 = (f2811 + 91) % 128;
                        if (i3 <= m2696()) {
                            return true;
                        }
                    }
                }
            } else if (i3 >= 0) {
                if (i2 <= m2702()) {
                    f2816 = (f2811 + 91) % 128;
                    if (i3 <= m2696()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m2707() {
        f2816 = (f2811 + 111) % 128;
        String str = Build.VERSION.RELEASE;
        f2811 = (f2816 + 51) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m2712() {
        int i2 = f2811 + 39;
        f2816 = i2 % 128;
        if (i2 % 2 != 0) {
            kc.m2767(m2693());
            throw null;
        }
        JSONObject jSONObjectM2767 = kc.m2767(m2693());
        int i3 = f2816 + 71;
        f2811 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 80 / 0;
        }
        return jSONObjectM2767;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized void m2700(Activity activity) {
        try {
            f2816 = (f2811 + 17) % 128;
            if (activity != null) {
                m2708(activity.getApplicationContext());
            }
            int i2 = f2811 + 67;
            f2816 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int m2702() {
        f2816 = (f2811 + 45) % 128;
        int iOptInt = m2712().optInt(m2711((byte) (TextUtils.lastIndexOf("", '0', 0, 0) - 112), (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 105), (-95) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-322500771) - MotionEvent.axisFromString(""), (-76068208) - Color.argb(0, 0, 0, 0)).intern());
        int i2 = f2811 + 103;
        f2816 = i2 % 128;
        if (i2 % 2 == 0) {
            return iOptInt;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #1 {all -> 0x006a, blocks: (B:20:0x0053, B:22:0x005d), top: B:45:0x0053, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006c A[Catch: all -> 0x0075, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:10:0x0037, B:27:0x006c, B:39:0x00db, B:8:0x0014, B:12:0x0043, B:31:0x0078, B:17:0x004d, B:32:0x00ca, B:34:0x00d0, B:38:0x00da), top: B:44:0x0003, inners: #2 }] */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static synchronized void m2708(Context context) {
        Rect bounds;
        int i2 = f2811 + 93;
        f2816 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                throw null;
            }
            if (context != null) {
                WindowManager windowManager = (WindowManager) context.getSystemService(m2710((byte) (95 - TextUtils.getOffsetBefore("", 0)), "\u0000\u0002\u0007\b\u000b\u0002", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7).intern());
                if (windowManager != null) {
                    int i3 = f2811 + 121;
                    f2816 = i3 % 128;
                    if (i3 % 2 != 0) {
                        if (Build.VERSION.SDK_INT >= 43) {
                            try {
                                bounds = windowManager.getCurrentWindowMetrics().getBounds();
                                if (bounds != null) {
                                    m2713(bounds.height(), bounds.width());
                                    return;
                                }
                                f2811 = (f2816 + 105) % 128;
                            } catch (Throwable th) {
                                n.m2832(m2710((byte) ((ViewConfiguration.getTapTimeout() >> 16) + 41), "\u000f\t\u0007\u0004\t\u0005\r\u000e\u0002\r\u009c", View.MeasureSpec.makeMeasureSpec(0, 0) + 11).intern(), m2711((byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 16), (short) (MotionEvent.axisFromString("") + 6), (-97) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1935 - AndroidCharacter.getMirror('0'), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 76068257).intern(), th);
                            }
                        }
                    } else if (Build.VERSION.SDK_INT >= 30) {
                        bounds = windowManager.getCurrentWindowMetrics().getBounds();
                        if (bounds != null) {
                            m2713(bounds.height(), bounds.width());
                            return;
                        }
                        f2811 = (f2816 + 105) % 128;
                    }
                }
                Resources resources = context.getResources();
                if (resources != null) {
                    m2704(resources.getDisplayMetrics());
                }
            }
        } catch (Throwable th2) {
            n.m2832(m2710((byte) (41 - View.MeasureSpec.makeMeasureSpec(0, 0)), "\u000f\t\u0007\u0004\t\u0005\r\u000e\u0002\r\u009c", Drawable.resolveOpacity(0, 0) + 11).intern(), m2710((byte) (22 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u0010\u0011\u000e\n\u0011\f\u0000\u0007\f\u0017\u0001\u000f\u0013\u0007\f\u0018\u000f\u000b\u0002\u0001\u0014\r\u0015\u0016\u0015\u0004\u000e\u0011\u0005\u0007\u0005\f\u0016\u0011\u0006\u001a\u0017\u0011\t\u0007\u000f\u0001\u001f\u0013", (-16777172) - Color.rgb(0, 0, 0)).intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2713(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        f2811 = (f2816 + 11) % 128;
        try {
            JSONObject jSONObjectM2693 = m2693();
            jSONObjectM2693.put(m2711((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) - 113), (short) (KeyEvent.keyCodeFromString("") + 105), (ViewConfiguration.getTouchSlop() >> 8) - 96, (-322500770) - (ViewConfiguration.getEdgeSlop() >> 16), (-76068208) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), i3);
            jSONObjectM2693.put(m2710((byte) (9 - (ViewConfiguration.getTouchSlop() >> 8)), "q", View.combineMeasuredStates(0, 0) + 1).intern(), i2);
            f2811 = (f2816 + 115) % 128;
        } catch (Throwable th) {
            n.m2832(m2710((byte) (41 - (ViewConfiguration.getEdgeSlop() >> 16)), "\u000f\t\u0007\u0004\t\u0005\r\u000e\u0002\r\u009c", 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), m2710((byte) (69 - (Process.myPid() >> 22)), "\u0010\u0011\u000e\n\u0011\f\u0001\u0004¹¹\u0000\u0007\u0017\f\u0005\u0006\u000f\u0004\u0000\t\f\u0005\u0002\u0003ª", 24 - ExpandableListView.getPackedPositionChild(0L)).intern(), th);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2701(Context context, JSONObject jSONObject) {
        String strIntern;
        boolean z2;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(m2711((byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 57), (short) (Color.red(0) + 92), View.resolveSizeAndState(0, 0, 0) - 96, TextUtils.getTrimmedLength("") - 322500721, (-76068230) - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            jSONObject.put(m2711((byte) (View.MeasureSpec.makeMeasureSpec(0, 0) - 63), (short) (59 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 96, Drawable.resolveOpacity(0, 0) - 322500713, ExpandableListView.getPackedPositionChild(0L) - 76068217).intern(), memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            jSONObject.put(m2711((byte) ((-88) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (short) (MotionEvent.axisFromString("") + 32), (-96) - ((Process.getThreadPriority(0) + 20) >> 6), Color.alpha(0) - 322500709, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 76068218).intern(), memoryInfo.threshold / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            if (memoryInfo.lowMemory) {
                int i2 = f2811 + 41;
                f2816 = i2 % 128;
                if (i2 % 2 != 0) {
                    strIntern = m2710((byte) (20 >> (PointF.length(0.0f, 1.0f) > 2.0f ? 1 : (PointF.length(0.0f, 1.0f) == 2.0f ? 0 : -1))), "¿¿\u0011\u0002", 5 / (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern();
                    z2 = memoryInfo.lowMemory;
                } else {
                    strIntern = m2710((byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 82), "¿¿\u0011\u0002", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3).intern();
                    z2 = memoryInfo.lowMemory;
                }
                jSONObject.put(strIntern, z2);
            }
            jSONObject.put(m2711((byte) (ImageFormat.getBitsPerPixel(0) - 63), (short) (62 - View.MeasureSpec.getSize(0)), (-96) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 322500705, ExpandableListView.getPackedPositionChild(0L) - 76068217).intern(), memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            f2816 = (f2811 + 123) % 128;
        } catch (Throwable th) {
            String strIntern2 = m2710((byte) (TextUtils.getCapsMode("", 0, 0) + 41), "\u000f\t\u0007\u0004\t\u0005\r\u000e\u0002\r\u009c", TextUtils.lastIndexOf("", '0', 0, 0) + 12).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m2711((byte) ((-47) - Color.red(0)), (short) (19 - Drawable.resolveOpacity(0, 0)), (-96) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-322500701) - TextUtils.indexOf("", "", 0, 0), (-76068259) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
            sb.append(th.getLocalizedMessage());
            n.m2835(strIntern2, sb.toString());
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int m2696() {
        f2816 = (f2811 + 9) % 128;
        int iOptInt = m2712().optInt(m2710((byte) (8 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "q", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
        int i2 = f2816 + 19;
        f2811 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 40 / 0;
        }
        return iOptInt;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2703(Application application) {
        int i2 = f2816;
        int i3 = i2 + 107;
        f2811 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
            if (application == null) {
                return;
            }
        } else if (application == null) {
            return;
        }
        f2811 = (i2 + 37) % 128;
        m2708(application.getApplicationContext());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2697(Context context, JSONObject jSONObject, boolean z2) {
        f2816 = (f2811 + 15) % 128;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(m2710((byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 74), "\u0006\t¸¸\u0005\t\u0013\u0007\u0007\u0004\u000f\u0013", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11).intern());
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(m2710((byte) (120 - Color.red(0)), "\u0016\u0001\t\u0007Ý", TextUtils.getTrimmedLength("") + 5).intern());
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            if (networkInfo != null) {
                f2811 = (f2816 + 71) % 128;
                jSONObject.put(m2711((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 49), (short) (114 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 96, (-322500638) - Color.green(0), (-76068219) - ImageFormat.getBitsPerPixel(0)).intern(), networkInfo.getState());
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    f2811 = (f2816 + 21) % 128;
                    jSONObject.put(m2710((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), "\u0019\u001b\u0013\u0019i", 5 - KeyEvent.normalizeMetaState(0)).intern(), networkInfo.getType());
                    jSONObject.put(m2711((byte) (69 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (short) (83 - Color.green(0)), (-96) - KeyEvent.getDeadChar(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) - 322500634, (-76068218) - TextUtils.getCapsMode("", 0, 0)).intern(), networkInfo.getTypeName());
                    jSONObject.put(m2711((byte) (TextUtils.indexOf("", "", 0, 0) + 68), (short) ((-72) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), View.resolveSize(0, 0) - 96, (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 322500630, (-76068218) - (Process.myPid() >> 22)).intern(), networkInfo.getSubtype());
                    jSONObject.put(m2711((byte) (TextUtils.lastIndexOf("", '0') + d.o), (short) ((-2) - (ViewConfiguration.getPressedStateDuration() >> 16)), (-96) - (ViewConfiguration.getScrollBarSize() >> 8), (-322500625) - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) - 76068218).intern(), networkInfo.getSubtypeName());
                    jSONObject.put(m2710((byte) (120 - ExpandableListView.getPackedPositionType(0L)), "\u0019\u001b\u0007\t", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4).intern(), telephonyManager.getNetworkOperator());
                    jSONObject.put(m2711((byte) (5 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (short) (KeyEvent.keyCodeFromString("") - 10), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 96, ((Process.getThreadPriority(0) + 20) >> 6) - 322500621, (-76068218) - TextUtils.getOffsetBefore("", 0)).intern(), telephonyManager.getNetworkOperatorName());
                    jSONObject.put(m2710((byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1), "\u0019\u001bdd", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 4).intern(), telephonyManager.getNetworkCountryIso());
                    if (z2) {
                        f2811 = (f2816 + 113) % 128;
                        jSONObject.put(m2710((byte) (View.combineMeasuredStates(0, 0) + 77), "\u0019\u001b\u0002\u0006", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5).intern(), telephonyManager.getSimOperator());
                        jSONObject.put(m2711((byte) (36 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (short) ((KeyEvent.getMaxKeyCode() >> 16) - 125), ((byte) KeyEvent.getModifierMetaStateMask()) - 95, TextUtils.getOffsetBefore("", 0) - 322500617, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 76068217).intern(), telephonyManager.getSimOperatorName());
                    }
                }
            }
        } catch (Throwable th) {
            n.m2832(m2710((byte) (41 - View.resolveSize(0, 0)), "\u000f\t\u0007\u0004\t\u0005\r\u000e\u0002\r\u009c", 11 - Color.blue(0)).intern(), m2711((byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 127), (short) (TextUtils.indexOf((CharSequence) "", '0', 0) - 123), (-96) - ((Process.getThreadPriority(0) + 20) >> 6), (-322500613) - Color.red(0), (KeyEvent.getMaxKeyCode() >> 16) - 76068258).intern(), th);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2714(Context context, JSONObject jSONObject) {
        f2811 = (f2816 + 113) % 128;
        try {
            if (jw.m2674(context, m2711((byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 47), (short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 73), (-96) - (ViewConfiguration.getFadingEdgeLength() >> 16), (-322500580) - (Process.myPid() >> 22), Color.red(0) - 76068230).intern())) {
                f2811 = (f2816 + 113) % 128;
                WifiInfo connectionInfo = ((WifiManager) context.getSystemService(m2711((byte) (29 - ((Process.getThreadPriority(0) + 20) >> 6)), (short) ((-43) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 96, (Process.myPid() >> 22) - 322500544, (-76068208) - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())).getConnectionInfo();
                jSONObject.put(m2711((byte) (TextUtils.indexOf((CharSequence) "", '0', 0) - 5), (short) (TextUtils.indexOf("", "", 0) - 79), (-95) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 322500540, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 76068208).intern(), connectionInfo.getSupplicantState());
                if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                    f2816 = (f2811 + 105) % 128;
                    jSONObject.put(m2711((byte) (ImageFormat.getBitsPerPixel(0) + 56), (short) (70 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 96, (-322500536) - Color.blue(0), (-92845424) - Color.rgb(0, 0, 0)).intern(), connectionInfo.getRssi());
                    jSONObject.put(m2710((byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 85), "\u000b\u001d\u0001\u0012", (KeyEvent.getMaxKeyCode() >> 16) + 4).intern(), connectionInfo.getLinkSpeed());
                }
            }
        } catch (Throwable th) {
            n.m2832(m2710((byte) (41 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u000f\t\u0007\u0004\t\u0005\r\u000e\u0002\r\u009c", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10).intern(), m2710((byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 81), "\u0010\u0011\u000e\n\u0011\f\u0013\b\r\u0007\f\u0018\u0017\u000b\u0005\u0013\u0005\r\u0000\u0007\u0014\u000b\f\u000e\u000b\u000e\u0004\t\u0000\tÅ", 31 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), th);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2704(DisplayMetrics displayMetrics) {
        int i2 = f2811 + 67;
        f2816 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
            if (displayMetrics == null) {
                return;
            }
        } else if (displayMetrics == null) {
            return;
        }
        m2713(displayMetrics.heightPixels, displayMetrics.widthPixels);
        f2816 = (f2811 + 85) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2705(JSONObject jSONObject) {
        int i2 = f2811 + 117;
        f2816 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                long totalRxBytes = TrafficStats.getTotalRxBytes();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (totalRxBytes != -1) {
                    long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                    jSONObject.put(m2710((byte) (87 - View.resolveSize(0, 0)), "\u000b\u0000\u0001\u0012", 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), Math.round((1000.0f / (jCurrentTimeMillis2 - jCurrentTimeMillis)) * (totalRxBytes2 - totalRxBytes)));
                    jSONObject.put(m2710((byte) (117 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u000b\u0000\r\u001c", TextUtils.indexOf((CharSequence) "", '0', 0) + 5).intern(), totalRxBytes2);
                }
                f2816 = (f2811 + 27) % 128;
                return;
            }
            TrafficStats.getTotalRxBytes();
            System.currentTimeMillis();
            System.currentTimeMillis();
            throw null;
        } catch (Throwable th) {
            n.m2832(m2710((byte) (Gravity.getAbsoluteGravity(0, 0) + 41), "\u000f\t\u0007\u0004\t\u0005\r\u000e\u0002\r\u009c", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10).intern(), m2711((byte) ((-87) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (short) ((-45) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 96, TextUtils.getOffsetBefore("", 0) - 322500673, (ViewConfiguration.getScrollDefaultDelay() >> 16) - 76068258).intern(), th);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2709(JSONObject jSONObject) {
        int i2 = f2811 + 9;
        f2816 = i2 % 128;
        if (i2 % 2 == 0) {
            JSONObject jSONObjectM2694 = m2694();
            if (jSONObjectM2694 != null) {
                kc.m2759(jSONObject, jSONObjectM2694);
            }
            int i3 = f2811 + 123;
            f2816 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        m2694();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2715(Intent intent) {
        int intExtra;
        int intExtra2;
        JSONObject jSONObject = new JSONObject();
        if (intent != null) {
            try {
                if (intent.hasExtra(m2711((byte) ((Process.myPid() >> 22) + 77), (short) (TextUtils.getTrimmedLength("") + 46), View.resolveSize(0, 0) - 96, (-322500532) - Color.blue(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 76068216).intern())) {
                    intExtra = intent.getIntExtra(m2711((byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 77), (short) (46 - Gravity.getAbsoluteGravity(0, 0)), View.MeasureSpec.getSize(0) - 96, (-322500532) - TextUtils.getOffsetAfter("", 0), TextUtils.indexOf((CharSequence) "", '0') - 76068214).intern(), -1);
                    f2811 = (f2816 + 89) % 128;
                } else {
                    intExtra = -1;
                }
                jSONObject.put(m2711((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 65), (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 37), (-96) - Color.green(0), (-322500524) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-76068228) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), intExtra);
                if (!intent.hasExtra(m2710((byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 41), "\u000f\u0002\t\u0004\u0095", 5 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    intExtra2 = -1;
                } else {
                    f2816 = (f2811 + 15) % 128;
                    intExtra2 = intent.getIntExtra(m2710((byte) (View.getDefaultSize(0, 0) + 41), "\u000f\u0002\t\u0004\u0095", TextUtils.indexOf("", "") + 5).intern(), -1);
                }
                jSONObject.put(m2710((byte) (8 - ImageFormat.getBitsPerPixel(0)), "\u0019\u000e\u0010\b", Drawable.resolveOpacity(0, 0) + 4).intern(), Math.round((intExtra2 * 100.0f) / (intent.hasExtra(m2711((byte) (91 - TextUtils.indexOf("", "", 0)), (short) ((-70) - (ViewConfiguration.getTouchSlop() >> 8)), View.MeasureSpec.makeMeasureSpec(0, 0) + (-96), KeyEvent.keyCodeFromString("") + (-322500521), TextUtils.indexOf("", "") + (-76068212)).intern()) ? intent.getIntExtra(m2711((byte) (91 - Color.red(0)), (short) ((-70) - Color.green(0)), (-96) - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getScrollBarSize() >> 8) - 322500521, (-76068213) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), -1) : -1)));
            } catch (Throwable th) {
                String strIntern = m2710((byte) (TextUtils.indexOf("", "") + 41), "\u000f\t\u0007\u0004\t\u0005\r\u000e\u0002\r\u009c", AndroidCharacter.getMirror('0') - '%').intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m2710((byte) (107 - TextUtils.lastIndexOf("", '0')), "\u0010\u0011\u000e\n\u0011\f\u0013\b\r\u0007\f\u0018\u000e\u001d\u0013\u000e\u000f\u0001\u000f\u0016\f\u000f\u0004\t\u0002\u000f\u0005\f\u000e\u0007\u000f\u001d\u0002\u0006\n\u0018\u008c", 37 - Color.blue(0)).intern());
                sb.append(th.getLocalizedMessage());
                n.m2835(strIntern, sb.toString());
            }
        }
        m2716(jSONObject);
        f2816 = (f2811 + 115) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static synchronized void m2716(JSONObject jSONObject) {
        int i2 = f2811;
        f2819 = jSONObject;
        int i3 = i2 + 79;
        f2816 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 72 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2710(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f2818;
                char c2 = f2820;
                char[] cArr3 = new char[i2];
                if (i2 % 2 != 0) {
                    i2--;
                    cArr3[i2] = (char) (cArr[i2] - b2);
                }
                if (i2 > 1) {
                    i.f2348 = 0;
                    while (true) {
                        int i3 = i.f2348;
                        if (i3 >= i2) {
                            break;
                        }
                        i.f2347 = cArr[i3];
                        i.f2345 = cArr[i.f2348 + 1];
                        if (i.f2347 == i.f2345) {
                            cArr3[i.f2348] = (char) (i.f2347 - b2);
                            cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                        } else {
                            i.f2346 = i.f2347 / c2;
                            i.f2342 = i.f2347 % c2;
                            i.f2344 = i.f2345 / c2;
                            i.f2341 = i.f2345 % c2;
                            if (i.f2342 == i.f2341) {
                                i.f2346 = a.b(i.f2346, c2, 1, c2);
                                i.f2344 = a.b(i.f2344, c2, 1, c2);
                                int i4 = (i.f2346 * c2) + i.f2342;
                                int i5 = (i.f2344 * c2) + i.f2341;
                                int i6 = i.f2348;
                                cArr3[i6] = cArr2[i4];
                                cArr3[i6 + 1] = cArr2[i5];
                            } else if (i.f2346 == i.f2344) {
                                i.f2342 = a.b(i.f2342, c2, 1, c2);
                                i.f2341 = a.b(i.f2341, c2, 1, c2);
                                int i7 = (i.f2346 * c2) + i.f2342;
                                int i8 = (i.f2344 * c2) + i.f2341;
                                int i9 = i.f2348;
                                cArr3[i9] = cArr2[i7];
                                cArr3[i9 + 1] = cArr2[i8];
                            } else {
                                int i10 = (i.f2346 * c2) + i.f2341;
                                int i11 = (i.f2344 * c2) + i.f2342;
                                int i12 = i.f2348;
                                cArr3[i12] = cArr2[i10];
                                cArr3[i12 + 1] = cArr2[i11];
                            }
                        }
                        i.f2348 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2711(byte b2, short s, int i2, int i3, int i4) {
        String string;
        synchronized (k.f2833) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = f2814;
                int i6 = i2 + i5;
                int i7 = i6 == -1 ? 1 : 0;
                if (i7 != 0) {
                    byte[] bArr = f2815;
                    if (bArr != null) {
                        i6 = (byte) (bArr[f2821 + i3] + i5);
                    } else {
                        i6 = (short) (f2813[f2821 + i3] + i5);
                    }
                }
                if (i6 > 0) {
                    k.f2836 = ((i3 + i6) - 2) + f2821 + i7;
                    k.f2834 = b2;
                    char c2 = (char) (i4 + f2812);
                    k.f2837 = c2;
                    sb.append(c2);
                    k.f2835 = k.f2837;
                    k.f2838 = 1;
                    while (k.f2838 < i6) {
                        byte[] bArr2 = f2815;
                        if (bArr2 != null) {
                            int i8 = k.f2836;
                            k.f2836 = i8 - 1;
                            k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                        } else {
                            short[] sArr = f2813;
                            int i9 = k.f2836;
                            k.f2836 = i9 - 1;
                            k.f2837 = (char) (k.f2835 + (((short) (sArr[i9] + s)) ^ k.f2834));
                        }
                        sb.append(k.f2837);
                        k.f2835 = k.f2837;
                        k.f2838++;
                    }
                }
                string = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends x<Activity> implements jr {

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f3227 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f3228;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f3229;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String f3230;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private d f3231;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean f3232;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean f3233;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f3234;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Class f3235;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f3236;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private jr f3237;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d extends x.a {

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f3266 = 1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f3269;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f3271 = false;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f3272;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private int f3273;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean f3274;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f3275;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int[] f3270 = {-852163485, -1125105571, -1440975003, 619328023, -252060312, -276171825, -671503758, -907598879, 1219605790, -1902362907, -2046409988, -293022139, 1121195018, -1423746227, 1453036898, -794478035, 1062161163, -661969778};

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static char f3268 = 6;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static char[] f3267 = {'w', 'e', 'b', 'V', 'i', 'I', 'd', 'a', 'c', 't', 'C', 'l', 'k', 's', 'N', 'o', 'D', 'y', 'j', 'T', 'n', 'u', 'r', 'P', 'f', 'x', 'm', 'p', 'O', 'v', 'g', 'z', '{', '|', '}', '~'};

        public d(y yVar, JSONObject jSONObject) {
            m3159(jSONObject.optString(m3160(new int[]{110861797, 1873315360, 228774982, -294014984, -688991972, -831075650, -373437540, 2139413457}, 14 - Color.blue(0)).intern()));
            m3156(jSONObject.optString(m3160(new int[]{-1752479271, -1042432582, 664075875, 1091981003, 1984091575, 1163054, 643777341, 1366410695, -770897417, 545996799, -1044474678, 1491461728}, 21 - ImageFormat.getBitsPerPixel(0)).intern()));
            m3154(jSONObject.optInt(m3157((byte) (45 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), ExpandableListView.getPackedPositionGroup(0L) + 9, "\u0001\u0002\u0003\u0004\u0005\u0002\u0001\u0000\u0091").intern(), -1));
            m3150(jSONObject.optBoolean(m3160(new int[]{1923435107, 1222916028, 1159168648, 1170524044, 1536218711, -1088404685, -1457568720, -1023689468, -590260993, 967750160}, Color.blue(0) + 17).intern()));
            m3151(jSONObject.optBoolean(m3157((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + InterfaceC0435l1.d.b.f29114k), View.combineMeasuredStates(0, 0) + 19, "\b\t\n\u000b\b\u0006\b\u0005\b\t\r\u000e\u000f\u0010\r\u0004\u0006\bê").intern()));
            m3113(jSONObject.optString(m3157((byte) (View.resolveSizeAndState(0, 0, 0) + 26), 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0013\f\u0015\r\u0002\u0017\u0013\u0000\t\n").intern()));
            boolean z10 = true;
            m3117(TextUtils.isEmpty(jSONObject.optString(m3157((byte) (57 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 10 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0016\u0017\u0011\u001d\u0013\u0004\u001c\u0000±").intern())) ? null : Arrays.asList(jSONObject.optString(m3157((byte) (57 - Color.green(0)), 9 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u0016\u0017\u0011\u001d\u0013\u0004\u001c\u0000±").intern()).split(m3160(new int[]{-1141725306, 1355340037}, 1 - TextUtils.indexOf("", "", 0)).intern())));
            m3116(jSONObject.optBoolean(m3160(new int[]{-1698729061, 276156775, 1415576551, 347999924, 259954383, 961576448, -231447354, 2054643204}, 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern()));
            m3115(jSONObject.optBoolean(m3160(new int[]{1379343212, 1582308888, -1069536053, 1630375662, 1830789992, -1659271692, -2128320065, 952894960}, 13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), true));
            if (TextUtils.isEmpty(jSONObject.optString(m3157((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25), 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0013\f\u0015\r\u0002\u0017\u0013\u0000\t\n").intern())) && !jSONObject.optBoolean(m3160(new int[]{-1698729061, 276156775, 1415576551, 347999924, 1073619481, -213202403, 819488008, 945135485}, 16 - View.MeasureSpec.getMode(0)).intern()) && !jSONObject.optBoolean(m3160(new int[]{-1698729061, 276156775, 1419651812, 2046204233, -1368412158, -120072843, -2062066468, -1489483628, -338339342, -1817397070}, 17 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                z10 = false;
            }
            m3112(z10);
            m3118(jSONObject.optBoolean(m3160(new int[]{-1698729061, 276156775, 1415576551, 347999924, 1073619481, -213202403, 819488008, 945135485}, Color.argb(0, 0, 0, 0) + 16).intern()));
            m3109(jSONObject.optBoolean(m3160(new int[]{-908856246, 199068797, -1839323357, 847500965, -1693961333, -2019971432}, Color.rgb(0, 0, 0) + 16777226).intern()));
            m3119(jSONObject.optBoolean(m3160(new int[]{1564242106, 1799551898, 1846526607, -1018900792, -1969434006, -101790165, 1415576551, 347999924, -1244815100, -1199297533}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19).intern()));
            m3111(jSONObject.optBoolean(m3157((byte) (73 - MotionEvent.axisFromString("")), 17 - (ViewConfiguration.getScrollBarSize() >> 8), "\u001b\u0014\u0006\n\u0003\u001c\u0007\u0005\u0002\u0017\u000f\u0007\b\u0013\u0007\u0002½").intern()));
            m3110(jSONObject.optBoolean(m3157((byte) (102 - (Process.myPid() >> 22)), Drawable.resolveOpacity(0, 0) + 9, "\u0002\u001c\u001c\u001d\u0015\u0012\u0010\u000eÚ").intern()));
            m3114(kj.m2852(jSONObject.optJSONArray(m3157((byte) (TextUtils.getOffsetBefore("", 0) + 108), 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u001c\u0005\u0002\u0001\u0013\u0019\u0011\u0003 \u0012\u0010\u0015Ñ").intern())));
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private d m3150(boolean z10) {
            int i10 = (f3266 + 19) % 128;
            f3269 = i10;
            this.f3274 = z10;
            f3266 = (i10 + InterfaceC0435l1.d.b.f29109f) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private d m3151(boolean z10) {
            int i10 = f3266 + 9;
            int i11 = i10 % 128;
            f3269 = i11;
            if (i10 % 2 != 0) {
                this.f3271 = z10;
                int i12 = 52 / 0;
            } else {
                this.f3271 = z10;
            }
            f3266 = (i11 + 33) % 128;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ String m3152(d dVar) {
            int i10 = (f3269 + 115) % 128;
            f3266 = i10;
            String str = dVar.f3275;
            int i11 = i10 + 3;
            f3269 = i11 % 128;
            if (i11 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ int m3153(d dVar) {
            int i10 = (f3266 + 57) % 128;
            f3269 = i10;
            int i11 = dVar.f3273;
            f3266 = (i10 + 5) % 128;
            return i11;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ String m3155(d dVar) {
            int i10 = (f3266 + 57) % 128;
            f3269 = i10;
            String str = dVar.f3272;
            int i11 = i10 + 35;
            f3266 = i11 % 128;
            if (i11 % 2 != 0) {
                return str;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ boolean m3158(d dVar) {
            int i10 = f3266 + 11;
            f3269 = i10 % 128;
            int i11 = i10 % 2;
            boolean z10 = dVar.f3271;
            if (i11 == 0) {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ boolean m3161(d dVar) {
            int i10 = f3269 + 41;
            f3266 = i10 % 128;
            int i11 = i10 % 2;
            boolean z10 = dVar.f3274;
            if (i11 != 0) {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private d m3154(int i10) {
            int i11 = f3266 + 1;
            f3269 = i11 % 128;
            if (i11 % 2 == 0) {
                this.f3273 = i10;
                return this;
            }
            this.f3273 = i10;
            int i12 = 95 / 0;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private d m3156(String str) {
            int i10 = f3266 + 93;
            f3269 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f3275 = str;
                return this;
            }
            this.f3275 = str;
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private d m3159(String str) {
            int i10 = f3269;
            this.f3272 = str;
            int i11 = i10 + 65;
            f3266 = i11 % 128;
            if (i11 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m3157(byte b10, int i10, String str) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (j.f2647) {
                try {
                    char[] cArr2 = f3267;
                    char c4 = f3268;
                    char[] cArr3 = new char[i10];
                    if (i10 % 2 != 0) {
                        i10--;
                        cArr3[i10] = (char) (cArr[i10] - b10);
                    }
                    if (i10 > 1) {
                        j.f2654 = 0;
                        while (true) {
                            int i11 = j.f2654;
                            if (i11 >= i10) {
                                break;
                            }
                            j.f2653 = cArr[i11];
                            j.f2650 = cArr[j.f2654 + 1];
                            if (j.f2653 == j.f2650) {
                                cArr3[j.f2654] = (char) (j.f2653 - b10);
                                cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                            } else {
                                j.f2652 = j.f2653 / c4;
                                j.f2649 = j.f2653 % c4;
                                j.f2651 = j.f2650 / c4;
                                j.f2648 = j.f2650 % c4;
                                if (j.f2649 == j.f2648) {
                                    j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                    j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                    int i12 = (j.f2652 * c4) + j.f2649;
                                    int i13 = (j.f2651 * c4) + j.f2648;
                                    int i14 = j.f2654;
                                    cArr3[i14] = cArr2[i12];
                                    cArr3[i14 + 1] = cArr2[i13];
                                } else if (j.f2652 == j.f2651) {
                                    j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                    j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                    int i15 = (j.f2652 * c4) + j.f2649;
                                    int i16 = (j.f2651 * c4) + j.f2648;
                                    int i17 = j.f2654;
                                    cArr3[i17] = cArr2[i15];
                                    cArr3[i17 + 1] = cArr2[i16];
                                } else {
                                    int i18 = (j.f2652 * c4) + j.f2648;
                                    int i19 = (j.f2651 * c4) + j.f2649;
                                    int i20 = j.f2654;
                                    cArr3[i20] = cArr2[i18];
                                    cArr3[i20 + 1] = cArr2[i19];
                                }
                            }
                            j.f2654 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m3160(int[] iArr, int i10) {
            String str;
            synchronized (a.f61) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f3270.clone();
                    a.f58 = 0;
                    while (true) {
                        int i11 = a.f58;
                        if (i11 < iArr.length) {
                            int i12 = iArr[i11];
                            char c4 = (char) (i12 >> 16);
                            cArr[0] = c4;
                            char c5 = (char) i12;
                            cArr[1] = c5;
                            char c10 = (char) (iArr[i11 + 1] >> 16);
                            cArr[2] = c10;
                            char c11 = (char) iArr[i11 + 1];
                            cArr[3] = c11;
                            a.f59 = (c4 << 16) + c5;
                            a.f60 = (c10 << 16) + c11;
                            a.m199(iArr2);
                            for (int i13 = 0; i13 < 16; i13++) {
                                int i14 = a.f59 ^ iArr2[i13];
                                a.f59 = i14;
                                int iM200 = a.m200(i14) ^ a.f60;
                                int i15 = a.f59;
                                a.f59 = iM200;
                                a.f60 = i15;
                            }
                            int i16 = a.f59;
                            int i17 = a.f60;
                            a.f59 = i17;
                            a.f60 = i16;
                            int i18 = i16 ^ iArr2[16];
                            a.f60 = i18;
                            int i19 = i17 ^ iArr2[17];
                            a.f59 = i19;
                            cArr[0] = (char) (i19 >>> 16);
                            cArr[1] = (char) i19;
                            cArr[2] = (char) (i18 >>> 16);
                            cArr[3] = (char) i18;
                            a.m199(iArr2);
                            int i20 = a.f58;
                            cArr2[i20 << 1] = cArr[0];
                            cArr2[(i20 << 1) + 1] = cArr[1];
                            cArr2[(i20 << 1) + 2] = cArr[2];
                            cArr2[(i20 << 1) + 3] = cArr[3];
                            a.f58 = i20 + 2;
                        } else {
                            str = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }
    }

    static {
        m3125();
        f3230 = m3139((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 38, 8 - Color.argb(0, 0, 0, 0), "ￊ\uffdd\u0000\uffef\u0004\u000b\u0013\n\uffff\u000b\tￊ\u0005\u000e\u000b\n\u000f\u000b\u0011\u000e\uffff\u0001ￊ�\u0000\r\u0011�\b\u0005\u0010\u0015\u000f\u0000\u0007ￊ\u000f\u0000\u0007", false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + ModuleDescriptor.MODULE_VERSION).intern();
        int i10 = f3227 + 57;
        f3229 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public y(JSONObject jSONObject, ja jaVar) {
        super(jaVar);
        this.f3234 = false;
        this.f3236 = false;
        this.f3232 = false;
        this.f3233 = false;
        m3147(jSONObject);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m3120() {
        int i10 = f3227;
        String str = f3230;
        f3229 = (i10 + 97) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3122(y yVar) {
        int i10 = f3227;
        f3229 = (i10 + 37) % 128;
        boolean z10 = yVar.f3232;
        int i11 = i10 + 59;
        f3229 = i11 % 128;
        if (i11 % 2 == 0) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean m3123(Activity activity) {
        int i10 = f3229 + 89;
        f3227 = i10 % 128;
        if (i10 % 2 == 0) {
            activity.getClass();
            throw null;
        }
        Class<?> cls = activity.getClass();
        if (this.f3235 == null) {
            return false;
        }
        if (d.m3161(this.f3231)) {
            f3229 = (f3227 + 3) % 128;
            return this.f3235.equals(cls);
        }
        boolean zIsAssignableFrom = this.f3235.isAssignableFrom(cls);
        f3227 = (f3229 + InterfaceC0435l1.d.b.f29107d) % 128;
        return zIsAssignableFrom;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static void m3125() {
        f3228 = 86;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m3130(Activity activity) {
        int i10 = f3227 + 119;
        f3229 = i10 % 128;
        int i11 = i10 % 2;
        String strM3124 = m3124(activity);
        if (i11 != 0) {
            int i12 = 35 / 0;
        }
        return strM3124;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ jr m3136(y yVar) {
        f3229 = (f3227 + 83) % 128;
        jr jrVarM3121 = yVar.m3121();
        int i10 = f3227 + 89;
        f3229 = i10 % 128;
        if (i10 % 2 == 0) {
            return jrVarM3121;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Class m3138(y yVar, Class cls) {
        int i10 = f3229;
        int i11 = i10 + 51;
        f3227 = i11 % 128;
        int i12 = i11 % 2;
        yVar.f3235 = cls;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i10 + 63;
        f3227 = i13 % 128;
        if (i13 % 2 != 0) {
            return cls;
        }
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        m3128(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                if (y.m3141(y.this, activity)) {
                    y.m3136(y.this).onActivityCreated(activity, bundle);
                    y.m3134();
                    y.m3129(y.this, false);
                    Bundle bundle2 = bundle;
                    if (bundle2 == null) {
                        y.m3132(y.this, false);
                        return;
                    }
                    y.m3132(y.this, bundle2.getBoolean(y.m3120()));
                    if (y.m3135(y.this)) {
                        y.m3129(y.this, true);
                    }
                    y.m3137(y.this, true);
                }
            }
        });
        f3227 = (f3229 + 27) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(final Activity activity) {
        m3128(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.1
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                if (y.m3141(y.this, activity)) {
                    p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.1.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            y.m3136(y.this).onActivityDestroyed(activity);
                        }
                    });
                    if (y.m3131(y.this) && y.m3135(y.this) && activity.isFinishing()) {
                        y.this.m3144(activity);
                    }
                }
            }
        });
        int i10 = f3229 + 51;
        f3227 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.10
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                if (y.m3141(y.this, activity)) {
                    y.m3136(y.this).onActivityPaused(activity);
                }
            }
        });
        int i10 = f3229 + 99;
        f3227 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        m3128(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.8
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                if (y.m3141(y.this, activity)) {
                    p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.8.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            y.m3136(y.this).onActivityResumed(activity);
                        }
                    });
                    y.m3142(y.this, false);
                    y.m3129(y.this, true);
                    if ((!y.m3135(y.this) || y.m3140(y.this)) && !activity.isFinishing()) {
                        y yVar = y.this;
                        Activity activity2 = activity;
                        yVar.m3145(activity2, y.m3130(activity2));
                    }
                    y.m3137(y.this, false);
                }
            }
        });
        f3227 = (f3229 + 67) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        m3128(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.9
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                if (y.m3141(y.this, activity)) {
                    y.m3136(y.this).onActivitySaveInstanceState(activity, bundle);
                    Bundle bundle2 = bundle;
                    if (bundle2 != null) {
                        bundle2.putBoolean(y.m3120(), y.m3135(y.this));
                    }
                    y.m3142(y.this, true);
                }
            }
        });
        f3227 = (f3229 + 71) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity activity) {
        p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.7
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                if (y.m3141(y.this, activity)) {
                    y.m3136(y.this).onActivityStarted(activity);
                }
            }
        });
        int i10 = f3229 + 15;
        f3227 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final Activity activity) {
        m3128(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.6
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                if (y.m3141(y.this, activity)) {
                    p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.6.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            y.m3136(y.this).onActivityStopped(activity);
                        }
                    });
                    if (y.m3131(y.this) && !y.m3122(y.this) && activity.isFinishing()) {
                        y.this.m3144(activity);
                    }
                }
            }
        });
        f3227 = (f3229 + 19) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* JADX INFO: renamed from: ﻐ */
    public final /* synthetic */ View mo209(Activity activity) {
        f3227 = (f3229 + InterfaceC0435l1.d.b.f29112i) % 128;
        View viewM3133 = m3133(activity);
        int i10 = f3229 + 65;
        f3227 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 69 / 0;
        }
        return viewM3133;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* JADX INFO: renamed from: ｋ */
    public final /* synthetic */ void mo3096(Activity activity) {
        int i10 = f3229 + 19;
        f3227 = i10 % 128;
        int i11 = i10 % 2;
        m3144(activity);
        if (i11 == 0) {
            int i12 = 57 / 0;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private jr m3121() {
        int i10 = f3229;
        jr jrVar = this.f3237;
        int i11 = i10 + 41;
        f3227 = i11 % 128;
        if (i11 % 2 != 0) {
            return jrVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m3124(Activity activity) {
        int i10 = f3229 + InterfaceC0435l1.d.b.f29110g;
        f3227 = i10 % 128;
        int i11 = i10 % 2;
        int iHashCode = activity.hashCode();
        if (i11 != 0) {
            return Integer.toHexString(iHashCode);
        }
        Integer.toHexString(iHashCode);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ d m3126(y yVar) {
        int i10 = f3229 + 117;
        int i11 = i10 % 128;
        f3227 = i11;
        int i12 = i10 % 2;
        d dVar = yVar.f3231;
        if (i12 == 0) {
            int i13 = 98 / 0;
        }
        f3229 = (i11 + 107) % 128;
        return dVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3131(y yVar) {
        int i10 = f3229;
        f3227 = (i10 + 31) % 128;
        boolean z10 = yVar.f3236;
        int i11 = i10 + 87;
        f3227 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 69 / 0;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3134() {
        f3229 = (f3227 + 45) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3140(y yVar) {
        int i10 = (f3227 + 57) % 128;
        f3229 = i10;
        boolean z10 = yVar.f3233;
        f3227 = (i10 + 23) % 128;
        return z10;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* JADX INFO: renamed from: ﾇ */
    public final /* synthetic */ void mo3097(Activity activity, String str) {
        int i10 = f3227 + 29;
        f3229 = i10 % 128;
        int i11 = i10 % 2;
        m3145(activity, str);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3129(y yVar, boolean z10) {
        int i10 = f3227 + 63;
        int i11 = i10 % 128;
        f3229 = i11;
        int i12 = i10 % 2;
        yVar.f3236 = z10;
        if (i12 != 0) {
            throw null;
        }
        f3227 = (i11 + 29) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3132(y yVar, boolean z10) {
        int i10 = f3229 + 67;
        int i11 = i10 % 128;
        f3227 = i11;
        int i12 = i10 % 2;
        yVar.f3234 = z10;
        if (i12 == 0) {
            int i13 = 1 / 0;
        }
        f3229 = (i11 + 79) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3135(y yVar) {
        int i10 = (f3227 + 29) % 128;
        f3229 = i10;
        boolean z10 = yVar.f3234;
        int i11 = i10 + 69;
        f3227 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 51 / 0;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3141(y yVar, Activity activity) {
        int i10 = f3227 + 97;
        f3229 = i10 % 128;
        if (i10 % 2 != 0) {
            yVar.m3123(activity);
            throw null;
        }
        boolean zM3123 = yVar.m3123(activity);
        f3229 = (f3227 + 75) % 128;
        return zM3123;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* JADX INFO: renamed from: ﾇ */
    public final /* synthetic */ void mo215(Activity activity, List list) {
        int i10 = f3229 + 85;
        f3227 = i10 % 128;
        int i11 = i10 % 2;
        m3127(activity, (List<WebView>) list);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f3227 + 69;
        f3229 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3137(y yVar, boolean z10) {
        int i10 = (f3227 + 117) % 128;
        f3229 = i10;
        yVar.f3233 = z10;
        int i11 = i10 + 15;
        f3227 = i11 % 128;
        if (i11 % 2 != 0) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m3142(y yVar, boolean z10) {
        int i10 = f3229 + 31;
        f3227 = i10 % 128;
        int i11 = i10 % 2;
        yVar.f3232 = z10;
        if (i11 == 0) {
            int i12 = 97 / 0;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m3143() {
        f3229 = (f3227 + InterfaceC0435l1.d.b.f29107d) % 128;
        jt.m2734().m2736(this);
        f3227 = (f3229 + 121) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m3146() {
        int i10 = f3227 + 99;
        f3229 = i10 % 128;
        if (i10 % 2 == 0) {
            m3075((t) null);
            m3148((jr) null);
            jt.m2734().m2740(this);
            int i11 = f3229 + InterfaceC0435l1.d.b.f29112i;
            f3227 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return;
        }
        m3075((t) null);
        m3148((jr) null);
        jt.m2734().m2740(this);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m3147(JSONObject jSONObject) {
        d dVar = new d(this, jSONObject);
        m3095(dVar);
        this.f3231 = dVar;
        p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.4

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f3248 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f3249 = 0;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f3250 = -2838240577808161197L;

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                try {
                    y yVar = y.this;
                    y.m3138(yVar, Class.forName(d.m3155(y.m3126(yVar))));
                    p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.4.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            y.this.m3143();
                        }
                    });
                    f3248 = (f3249 + 63) % 128;
                } catch (ClassNotFoundException e10) {
                    String strIntern = m3149("詌歔訍䵤殜❎\uf416蚆፶풢踚\uf82a뢕㏛ᓪ処䇆餇獺쪮\uef0e", -((byte) KeyEvent.getModifierMetaStateMask())).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m3149("퐺℅푿ܤ\ue887ꑓ᪦栰䴄麺ങᚊ\ue6d1禚韜뽙ᾷ퍜\uf06a\u245b녾ꫩ奱싪⨰֯ꏋ殧䎁鼾ಆခ\ue50e", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern());
                    sb2.append(d.m3155(y.m3126(y.this)));
                    sb2.append(m3149("\ue524ლ\ue51e㚩⬾噫", 1 - Drawable.resolveOpacity(0, 0)).intern());
                    sb2.append(e10.getLocalizedMessage());
                    m.m2972(strIntern, sb2.toString());
                }
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m3149(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2127) {
                    try {
                        char[] cArrM2229 = g.m2229(f3250, cArr, i10);
                        g.f2129 = 4;
                        while (true) {
                            int i11 = g.f2129;
                            if (i11 < cArrM2229.length) {
                                int i12 = i11 - 4;
                                g.f2128 = i12;
                                cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f3250));
                                g.f2129 = i11 + 1;
                            } else {
                                str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        });
        f3229 = (f3227 + 83) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m3128(je jeVar) {
        f3229 = (f3227 + 37) % 128;
        if (d.m3158(this.f3231)) {
            f3229 = (f3227 + 7) % 128;
            p.m2998(jeVar);
            return;
        }
        p.m2994(jeVar);
        int i10 = f3229 + 107;
        f3227 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 29 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* JADX INFO: renamed from: ﾇ */
    public final t<WebView, Activity> mo214() {
        int i10 = (f3229 + 25) % 128;
        f3227 = i10;
        int i11 = i10 + 11;
        f3229 = i11 % 128;
        if (i11 % 2 == 0) {
            return this;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m3148(jr jrVar) {
        int i10 = (f3227 + 93) % 128;
        f3229 = i10;
        this.f3237 = jrVar;
        int i11 = i10 + InterfaceC0435l1.d.b.f29109f;
        f3227 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 33 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jr
    /* JADX INFO: renamed from: ﾇ */
    public final void mo396(final Activity activity) {
        p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.5
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                if (y.m3141(y.this, activity)) {
                    y.m3136(y.this).mo396(activity);
                }
            }
        });
        f3229 = (f3227 + 61) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jr
    /* JADX INFO: renamed from: ﾒ */
    public final void mo397(final Activity activity) {
        p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.y.2
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                if (y.m3141(y.this, activity)) {
                    y.m3136(y.this).mo397(activity);
                }
            }
        });
        f3227 = (f3229 + 41) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* JADX INFO: renamed from: ﾒ */
    public final z mo216() {
        ab abVar = new ab();
        int i10 = f3227 + 61;
        f3229 = i10 % 128;
        if (i10 % 2 == 0) {
            return abVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: avoid collision after fix types in other method and contains not printable characters */
    private static View m3133(Activity activity) {
        f3229 = (f3227 + 3) % 128;
        View viewFindViewById = activity.findViewById(R.id.content);
        int i10 = f3229 + 29;
        f3227 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 41 / 0;
        }
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m3139(int i10, int i11, String str, boolean z10, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1625) {
            try {
                char[] cArr2 = new char[i10];
                com.ironsource.adqualitysdk.sdk.i.d.f1622 = 0;
                while (true) {
                    int i13 = com.ironsource.adqualitysdk.sdk.i.d.f1622;
                    if (i13 >= i10) {
                        break;
                    }
                    com.ironsource.adqualitysdk.sdk.i.d.f1624 = cArr[i13];
                    cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1622] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1624 + i12);
                    int i14 = com.ironsource.adqualitysdk.sdk.i.d.f1622;
                    cArr2[i14] = (char) (cArr2[i14] - f3228);
                    com.ironsource.adqualitysdk.sdk.i.d.f1622 = i14 + 1;
                }
                if (i11 > 0) {
                    com.ironsource.adqualitysdk.sdk.i.d.f1623 = i11;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = com.ironsource.adqualitysdk.sdk.i.d.f1623;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = com.ironsource.adqualitysdk.sdk.i.d.f1623;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    com.ironsource.adqualitysdk.sdk.i.d.f1622 = 0;
                    while (true) {
                        int i17 = com.ironsource.adqualitysdk.sdk.i.d.f1622;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        com.ironsource.adqualitysdk.sdk.i.d.f1622 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m3127(Activity activity, List<WebView> list) {
        f3227 = (f3229 + 57) % 128;
        kq.m2961(activity, WebView.class, d.m3153(this.f3231), d.m3152(this.f3231), false, false, null, this.f3231.f3224, list);
        f3229 = (f3227 + 5) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m3145(Activity activity, String str) {
        int i10 = (f3229 + 19) % 128;
        f3227 = i10;
        if (!this.f3234) {
            int i11 = i10 + 83;
            f3229 = i11 % 128;
            int i12 = i11 % 2;
            this.f3234 = true;
            super.mo3097(activity, str);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(is.f2561, true);
        } catch (JSONException e10) {
            String strIntern = m3139(Color.argb(0, 0, 0, 0) + 17, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u000e\uffdd\uffff\u0010\u0005\u0012\u0005\u0010\u0015\uffdd\u0000￤�\n\u0000\b\u0001", false, (KeyEvent.getMaxKeyCode() >> 16) + 186).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3139((Process.myTid() >> 22) + 32, (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 11, "\u0013\u000e\t\t\u0006ￅ\u0017\u0014\u0017\u0017￪ￅ\uffdf\u0013\u0014\u0018\u000fￅ\u0014\u0019ￅ\t\u0013\n\ufff8\u0019\u0014\ufff3\u0014\tￅ\f", true, 177 - Color.blue(0)).intern());
            sb2.append(e10.getLocalizedMessage());
            m.m2972(strIntern, sb2.toString());
        }
        m3094(jSONObject, activity, str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: avoid collision after fix types in other method and contains not printable characters */
    public final void m3144(Activity activity) {
        boolean z10;
        int i10 = f3227 + 81;
        f3229 = i10 % 128;
        if (i10 % 2 != 0) {
            super.mo3096(activity);
            z10 = true;
        } else {
            super.mo3096(activity);
            z10 = false;
        }
        this.f3234 = z10;
        int i11 = f3227 + 37;
        f3229 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }
}

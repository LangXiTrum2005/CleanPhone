package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class aw {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f412 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f413 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f415 = 2477149463289313586L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> f416;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f417;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private b f418;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f414 = {22938, 32546, 4484, 14137, 23744, 25186, 35605, 2695, 11300, 18377, 31088, 36867, 'b', 9925, 19756, 29583, 39671, 'C', 9935, 19758, 29582, 39653, 49475, 59316, 3599, 13682, 23524, 33321, 43155, 53217, 63042, 7340, 17157, 27203, 37071, 46894, 56710, 1257, 11079};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f411 = -5725047594273200480L;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.aw$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static final /* synthetic */ int[] f419;

        static {
            int[] iArr = new int[b.valuesCustom().length];
            f419 = iArr;
            try {
                iArr[b.f427.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f419[b.f428.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f419[b.f429.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f419[b.f425.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        f427,
        f425,
        f429,
        f428;


        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f420 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f421 = 0;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static long f422 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f423 = 1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f424;

        static {
            m566();
            f423 = (f421 + 115) % 128;
        }

        public static b valueOf(String str) {
            int i2 = f421 + 37;
            f423 = i2 % 128;
            if (i2 % 2 != 0) {
                return (b) Enum.valueOf(b.class, str);
            }
            Enum.valueOf(b.class, str);
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArr;
            int i2 = f421 + 87;
            f423 = i2 % 128;
            if (i2 % 2 == 0) {
                bVarArr = (b[]) values().clone();
                int i3 = 71 / 0;
            } else {
                bVarArr = (b[]) values().clone();
            }
            int i4 = f423 + 27;
            f421 = i4 % 128;
            if (i4 % 2 == 0) {
                return bVarArr;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static void m566() {
            f422 = 0L;
            f420 = 0;
            f424 = (char) 34238;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m565(int i2, char c2, String str, String str2, String str3) {
            String str4;
            Object charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str2;
            if (str2 != null) {
                charArray2 = str2.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object charArray3 = str;
            if (str != null) {
                charArray3 = str.toCharArray();
            }
            char[] cArr3 = (char[]) charArray3;
            synchronized (j.f2569) {
                try {
                    char[] cArr4 = (char[]) cArr3.clone();
                    char[] cArr5 = (char[]) cArr.clone();
                    cArr4[0] = (char) (c2 ^ cArr4[0]);
                    cArr5[2] = (char) (cArr5[2] + ((char) i2));
                    int length = cArr2.length;
                    char[] cArr6 = new char[length];
                    j.f2567 = 0;
                    while (true) {
                        int i3 = j.f2567;
                        if (i3 < length) {
                            int i4 = (i3 + 2) % 4;
                            int i5 = (i3 + 3) % 4;
                            int i6 = cArr4[i3 % 4] * 32718;
                            char c3 = cArr5[i4];
                            char c4 = (char) ((i6 + c3) % 65535);
                            j.f2568 = c4;
                            cArr5[i5] = (char) (((cArr4[i5] * 32718) + c3) / 65535);
                            cArr4[i5] = c4;
                            int i7 = j.f2567;
                            cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f422) ^ ((long) f420)) ^ ((long) f424));
                            j.f2567 = i7 + 1;
                        } else {
                            str4 = new String(cArr6);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str4;
        }
    }

    public aw(JSONObject jSONObject) {
        this.f418 = m560(jSONObject.optString(m558("륆\ud9f0破魦", (ViewConfiguration.getWindowTouchSlop() >> 8) + 24763).intern()));
        this.f416 = m559(jSONObject.optString(m561((ViewConfiguration.getWindowTouchSlop() >> 8) + 2, ExpandableListView.getPackedPositionType(0L), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 23020)).intern()));
        this.f417 = m562(jSONObject.optString(m558("륀ᓶ\ue211놢࿙\udd79", Color.green(0) + 44449).intern()));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List<String> m559(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        f413 = (f412 + 61) % 128;
        List<String> listAsList = Arrays.asList(str.split(m558("뤞", (ViewConfiguration.getEdgeSlop() >> 16) + 35671).intern()));
        f412 = (f413 + 51) % 128;
        return listAsList;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b6  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static b m560(String str) {
        byte b2;
        f412 = (f413 + 19) % 128;
        int iHashCode = str.hashCode();
        if (iHashCode != 92611485) {
            if (iHashCode != 93621297) {
                if (iHashCode != 96946943) {
                    b2 = -1;
                } else {
                    b2 = 0;
                    if (str.equals(m561(Color.argb(0, 0, 0, 0) + 5, 2 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (View.getDefaultSize(0, 0) + 4577)).intern())) {
                        f412 = (f413 + 57) % 128;
                    } else {
                        b2 = -1;
                    }
                }
            } else if (str.equals(m561((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4, 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                int i2 = f413 + 91;
                f412 = i2 % 128;
                b2 = i2 % 2 != 0 ? (byte) 4 : (byte) 2;
            } else {
                b2 = -1;
            }
        } else if (str.equals(m561(5 - (ViewConfiguration.getFadingEdgeLength() >> 16), 8 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (2791 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern())) {
            f412 = (f413 + 47) % 128;
            b2 = 1;
        } else {
            b2 = -1;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                return b2 != 2 ? b.f427 : b.f429;
            }
            return b.f425;
        }
        b bVar = b.f428;
        f412 = (f413 + 67) % 128;
        return bVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m562(String str) {
        if (!TextUtils.isEmpty(str)) {
            f413 = (f412 + 67) % 128;
            if (!str.equals(m558("륜媂绔ሑ", 58308 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                return str;
            }
        }
        int i2 = f412 + 53;
        f413 = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m563() {
        int i2 = (f413 + 3) % 128;
        f412 = i2;
        String str = this.f417;
        int i3 = i2 + 97;
        f413 = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m564(String str) {
        try {
            int i2 = AnonymousClass2.f419[this.f418.ordinal()];
            if (i2 == 1) {
                int i3 = f412 + 97;
                f413 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 24 / 0;
                }
                return true;
            }
            if (i2 == 2) {
                return this.f416.contains(str);
            }
            if (i2 != 3) {
                if (i2 != 4) {
                }
                f413 = (f412 + 65) % 128;
                return false;
            }
            if (this.f416.size() > 0) {
                if (kd.m2781(str, this.f416.get(0)) >= 0) {
                    return false;
                }
                f413 = (f412 + 7) % 128;
                return true;
            }
            if (this.f416.size() > 0) {
                f412 = (f413 + 9) % 128;
                if (kd.m2781(str, this.f416.get(0)) < 0) {
                    return false;
                }
                int i5 = (f412 + 49) % 128;
                f413 = i5;
                int i6 = i5 + 11;
                f412 = i6 % 128;
                if (i6 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            f413 = (f412 + 65) % 128;
            return false;
        } catch (Exception e2) {
            kb.m2752(m561(22 - (Process.myPid() >> 22), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), m558("륷遡\ueb02숾᷄璷依ꚻ\uf01a쭨∐紶哋꿳蚘톙⭋ɰ崁됣迊\ue6e2", 10529 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), (Throwable) e2, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m558(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2055) {
            try {
                g.f2056 = i2;
                char[] cArr2 = new char[cArr.length];
                g.f2054 = 0;
                while (true) {
                    int i3 = g.f2054;
                    if (i3 < cArr.length) {
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f415);
                        g.f2054++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m561(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f414[i3 + i4]) ^ (((long) i4) * f411)) ^ ((long) c2));
                        a.f69 = i4 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}

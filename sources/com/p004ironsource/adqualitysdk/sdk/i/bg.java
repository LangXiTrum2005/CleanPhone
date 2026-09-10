package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class bg extends cz implements ck {

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f746 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f747 = 0;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f748 = 20;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f750 = null;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f751 = 1685001878;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f753 = 1237197900;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, b> f754;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f755;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f756;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f757;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static byte[] f749 = {70, -65, 79, -72, -76, -74, 82, -66, -88, 94, -71, 78, -106, 107, -74, 75, -102, -121, 112, 106, -109, 99, -108, -104, -102, 126, -110, -124, 114, -107, 98, -70, 70, -97, -123, -105, 112, -84, 74, -118, 123, -2, -8, 11, 0, -14, 8, 22, 24, -21, -22, 22, -23, 18, -21, -70, 69, -20, -24, -89, 85, 28, -18, 29, -26, 17, -92, 15, -6, -31, 28, 17, 93, 87, -69, 125, 124, 120, -118, 56, 55, -56, -57, -120, 98, -53, -49, -128, 2, -75, -7, 30, -77, 77, -80, -99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static long f752 = 6197488243105965917L;

    public interface b {
        /* JADX INFO: renamed from: ﾒ */
        Object mo710(List<Object> list, ch chVar);
    }

    public bg(String str) {
        this.f755 = str;
    }

    /* JADX INFO: renamed from: Ꮭ, reason: contains not printable characters */
    public static /* synthetic */ Object m780(List list, Class cls) {
        int i2 = f746 + 71;
        f747 = i2 % 128;
        int i3 = i2 % 2;
        Object objM1785 = cz.m1785(list, 0, cls);
        int i4 = f746 + 23;
        f747 = i4 % 128;
        if (i4 % 2 == 0) {
            return objM1785;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m782(bg bgVar) {
        int i2 = (f747 + 5) % 128;
        f746 = i2;
        String str = bgVar.f757;
        int i3 = i2 + 81;
        f747 = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Class m783(bg bgVar, String str) {
        int i2 = f747 + 27;
        f746 = i2 % 128;
        int i3 = i2 % 2;
        return bgVar.m781(str, false);
    }

    /* JADX INFO: renamed from: ﱟ */
    public boolean mo776() {
        f747 = (f746 + 29) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m786() {
        if (this.f757 != null) {
            f747 = (f746 + 17) % 128;
            return true;
        }
        int i2 = f747 + 65;
        f746 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻏ */
    public boolean mo777() {
        int i2 = f747 + 7;
        f746 = i2 % 128;
        return i2 % 2 == 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Class m789(String str) {
        try {
            if (!Prode.m220()) {
                f747 = (f746 + 55) % 128;
                return m781(str, false);
            }
            Class clsMo708 = mo708(str);
            f747 = (f746 + 15) % 128;
            return clsMo708;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public abstract Map<String, b> mo707();

    /* JADX INFO: renamed from: ｋ */
    public abstract Class mo708(String str);

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m791() {
        Map<String, b> mapMo707 = mo707();
        this.f754 = mapMo707;
        mapMo707.put(m784((byte) ((-70) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (short) TextUtils.getTrimmedLength(""), (ViewConfiguration.getWindowTouchSlop() >> 8) - 3, View.getDefaultSize(0, 0) - 1237197900, Drawable.resolveOpacity(0, 0) - 1685001763).intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.bg.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bg.this.m788((String) bg.m780(list, String.class));
                return bg.m782(bg.this);
            }
        });
        this.f754.put(m784((byte) ((-106) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (short) View.getDefaultSize(0, 0), -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-1237197884) - View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1685001773).intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.bg.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Boolean.valueOf(bg.this.m786());
            }
        });
        this.f754.put(m784((byte) ((-123) - Color.green(0)), (short) View.combineMeasuredStates(0, 0), (-13) - ImageFormat.getBitsPerPixel(0), (-1237197866) - TextUtils.indexOf("", ""), Color.red(0) - 1685001775).intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.bg.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bg.m783(bg.this, (String) list.get(0));
            }
        });
        f746 = (f747 + 69) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Class m794(String str) {
        f746 = (f747 + 47) % 128;
        Class clsM781 = m781(str, true);
        f747 = (f746 + 35) % 128;
        return clsM781;
    }

    /* JADX INFO: renamed from: ﾒ */
    public abstract String mo709();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m785(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f752, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f752));
                        f.f1954 = i3 + 1;
                    } else {
                        str2 = new String(cArrM2116, 4, cArrM2116.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized String m787() {
        try {
            if (TextUtils.isEmpty(this.f756)) {
                this.f756 = mo709();
                f747 = (f746 + 33) % 128;
            } else {
                f746 = (f747 + 33) % 128;
                if (this.f756.equals(m784((byte) (1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (short) TextUtils.indexOf("", "", 0), (-13) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-1237197859) - KeyEvent.getDeadChar(0, 0), (-1685001809) - Drawable.resolveOpacity(0, 0)).intern())) {
                    this.f756 = mo709();
                    f747 = (f746 + 33) % 128;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f756;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public String mo793() {
        int i2 = f746 + 21;
        int i3 = i2 % 128;
        f747 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.f757;
        if (str == null) {
            return m787();
        }
        int i4 = i3 + 121;
        f746 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m790(hg hgVar, ch chVar, String str, Object... objArr) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, hgVar);
            chVar.mo1479(str, arrayList);
            int i2 = f746 + 49;
            f747 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 56 / 0;
            }
        } catch (Throwable th) {
            String str2 = this.f755;
            StringBuilder sb = new StringBuilder();
            sb.append(m784((byte) (TextUtils.getTrimmedLength("") - 80), (short) Gravity.getAbsoluteGravity(0, 0), (-11) - Color.red(0), (-1237197812) - TextUtils.indexOf("", ""), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1685001810).intern());
            sb.append(this);
            cq.m1676(str2, sb.toString(), th);
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ck
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object mo792(String str, List<Object> list, ch chVar) {
        f747 = (f746 + 19) % 128;
        b bVar = this.f754.get(str);
        try {
            if (bVar != null) {
                f747 = (f746 + 77) % 128;
                return bVar.mo710(list, chVar);
            }
            String str2 = this.f755;
            StringBuilder sb = new StringBuilder();
            sb.append(m785("妉姌紏\ud8c2䙖\uda20阊뀮쒏㧾㒉향挄鼩儕盝膼˘ﾳ蠅ⰷ恃᰼ⷘ䪻쟋뤜你\ue954╮⟘\ue0f6េ袦䐃", 1 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
            sb.append(str);
            sb.append(m784((byte) (TextUtils.indexOf("", "") - 23), (short) KeyEvent.getDeadChar(0, 0), (-16777213) - Color.rgb(0, 0, 0), (-1237197854) - Process.getGidForName(""), View.MeasureSpec.makeMeasureSpec(0, 0) - 1685001839).intern());
            cq.m1676(str2, sb.toString(), null);
            f747 = (f746 + 79) % 128;
            return null;
        } catch (Exception e2) {
            String str3 = this.f755;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m785("妉姌紏\ud8c2䙖\uda20阊뀮쒏㧾㒉향挄鼩儕盝膼˘ﾳ蠅ⰷ恃᰼ⷘ䪻쟋뤜你\ue954╮⟘\ue0f6េ袦䐃", 1 - TextUtils.indexOf("", "", 0, 0)).intern());
            sb2.append(str);
            sb2.append(m785("竒竵䣁䦥¶", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
            cq.m1676(str3, sb2.toString(), e2);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m788(String str) {
        int i2 = (f747 + 67) % 128;
        f746 = i2;
        this.f757 = str;
        f747 = (i2 + 33) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0099  */
    /* JADX WARN: Code duplicated, block: B:48:0x0197  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Class m781(String str, boolean z2) {
        byte b2;
        try {
            if (str.contains(m785("쀔쀺䅚쵡喿", (Process.myTid() >> 22) + 1).intern())) {
                Class clsM2724 = jz.m2724(str, z2);
                int i2 = f746 + 103;
                f747 = i2 % 128;
                if (i2 % 2 == 0) {
                    return clsM2724;
                }
                throw null;
            }
            switch (str.hashCode()) {
                case -1325958191:
                    if (str.equals(m785("ཁ༥ڍ\uea95좪ꆿꑚ㻟鉙䈹", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 104431:
                    if (!str.equals(m785("ໜີ鯿焽ꏃ㳌㿳", -Process.getGidForName("")).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 3029738:
                    if (!str.equals(m784((byte) (28 - View.MeasureSpec.getSize(0)), (short) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.getTrimmedLength("") - 16, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1237197830, TextUtils.lastIndexOf("", '0', 0) - 1685001779).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                case 3039496:
                    if (!str.equals(m784((byte) ((-84) - TextUtils.indexOf("", "")), (short) (ViewConfiguration.getPressedStateDuration() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 16, (-1237197828) - ExpandableListView.getPackedPositionGroup(0L), (-1685001780) - KeyEvent.keyCodeFromString("")).intern())) {
                        b2 = -1;
                    } else {
                        int i3 = f746 + 75;
                        f747 = i3 % 128;
                        b2 = i3 % 2 != 0 ? 'V' : (char) 6;
                    }
                    break;
                case 3052374:
                    if (!str.equals(m785("\ueeeb\uee88跁訡컏⫴쓺㢪", ((Process.getThreadPriority(0) + 20) >> 6) + 1).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 5;
                    }
                    break;
                case 3327612:
                    if (!str.equals(m785("㴀㵬㾓艱\ue0e1颡첥ᚑ", KeyEvent.keyCodeFromString("") + 1).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case 3625364:
                    if (!str.equals(m785("嵉崿桗\uf666胮콥뢵皝", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 7;
                    }
                    break;
                case 97526364:
                    if (!str.equals(m785("\uf54b\uf52dŒ䣯儺ꙣغꝌ桋", TextUtils.getCapsMode("", 0, 0) + 1).intern())) {
                        b2 = -1;
                    } else {
                        int i4 = f746 + 25;
                        f747 = i4 % 128;
                        if (i4 % 2 == 0) {
                            b2 = 3;
                        } else {
                            b2 = 2;
                        }
                    }
                    break;
                case 109413500:
                    if (!str.equals(m784((byte) (TextUtils.getOffsetBefore("", 0) + 127), (short) TextUtils.getTrimmedLength(""), (-15) - Color.alpha(0), Drawable.resolveOpacity(0, 0) - 1237197825, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1685001764).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 8;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    return Integer.TYPE;
                case 1:
                    return Long.TYPE;
                case 2:
                    return Double.TYPE;
                case 3:
                    return Float.TYPE;
                case 4:
                    Class cls = Boolean.TYPE;
                    int i5 = f746 + 93;
                    f747 = i5 % 128;
                    if (i5 % 2 == 0) {
                        return cls;
                    }
                    throw null;
                case 5:
                    return Character.TYPE;
                case 6:
                    return Byte.TYPE;
                case 7:
                    Class cls2 = Void.TYPE;
                    f747 = (f746 + 77) % 128;
                    return cls2;
                case 8:
                    return Short.TYPE;
                default:
                    return mo708(str);
            }
        } catch (Throwable th) {
            if (z2) {
                String str2 = this.f755;
                StringBuilder sb = new StringBuilder();
                sb.append(m785("價傺暮ꗈ冓솟\ueb13ꟷ췾≟", (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern());
                sb.append(str);
                sb.append(m784((byte) (ExpandableListView.getPackedPositionChild(0L) - 49), (short) TextUtils.indexOf("", ""), (-10) - Drawable.resolveOpacity(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 1237197821, (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1685001846).intern());
                cq.m1676(str2, sb.toString(), th);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m784(byte b2, short s, int i2, int i3, int i4) {
        String string;
        synchronized (k.f2833) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = f748;
                int i6 = i2 + i5;
                int i7 = i6 == -1 ? 1 : 0;
                if (i7 != 0) {
                    byte[] bArr = f749;
                    if (bArr != null) {
                        i6 = (byte) (bArr[f753 + i3] + i5);
                    } else {
                        i6 = (short) (f750[f753 + i3] + i5);
                    }
                }
                if (i6 > 0) {
                    k.f2836 = ((i3 + i6) - 2) + f753 + i7;
                    k.f2834 = b2;
                    char c2 = (char) (i4 + f751);
                    k.f2837 = c2;
                    sb.append(c2);
                    k.f2835 = k.f2837;
                    k.f2838 = 1;
                    while (k.f2838 < i6) {
                        byte[] bArr2 = f749;
                        if (bArr2 != null) {
                            int i8 = k.f2836;
                            k.f2836 = i8 - 1;
                            k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                        } else {
                            short[] sArr = f750;
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

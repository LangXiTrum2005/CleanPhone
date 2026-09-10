package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class be extends cw implements ch {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f733 = 1;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static byte[] f734 = {85, 72, -65, -91, 92, -84, 91, 87, 85, -79, 93, 75, -67, 90, -83, 117, -119, 80, -125, -111, 118, -86, 76, -116, 125, -94, -30, 30, -18, -28, 9, -27, -10, 8, 94, -96, -30, 24, 26, -22, 76, -75, 24, -26, 27, 54, 62, 70, -75, 82, -71, -76, -30, 3, -14, -9, 123, 116, -117, -124, -53, 33, -120, -116, -61, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static short[] f735 = null;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f736 = 0;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f737 = -1300890105;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f738 = 9674;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f739 = 81033498;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f740 = 35;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f741;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f742;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f743;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<String, c> f744;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f745;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f746;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface c {
        /* JADX INFO: renamed from: ﾇ */
        Object mo796(List<Object> list, ck ckVar);
    }

    public be(String str) {
        this.f746 = str;
    }

    /* JADX INFO: renamed from: ᓮ, reason: contains not printable characters */
    public static /* synthetic */ Object m808(List list, Class cls) {
        f736 = (f733 + InterfaceC0435l1.d.b.f29105b) % 128;
        Object objM1805 = cw.m1805(list, 0, cls);
        int i10 = f736 + 11;
        f733 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 6 / 0;
        }
        return objM1805;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m809(be beVar) {
        int i10 = f733 + 117;
        int i11 = i10 % 128;
        f736 = i11;
        int i12 = i10 % 2;
        String str = beVar.f743;
        if (i12 != 0) {
            int i13 = 34 / 0;
        }
        f733 = (i11 + 119) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Class m811(be beVar, String str) {
        int i10 = f736 + 13;
        f733 = i10 % 128;
        Class clsM812 = beVar.m812(str, i10 % 2 == 0);
        int i11 = f733 + 97;
        f736 = i11 % 128;
        if (i11 % 2 == 0) {
            return clsM812;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ */
    public boolean mo807() {
        f733 = (f736 + 77) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public boolean mo814() {
        int i10 = f733 + 3;
        f736 = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m815() {
        int i10 = f736;
        f733 = (i10 + 79) % 128;
        if (this.f743 == null) {
            return false;
        }
        f733 = (i10 + 87) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﻐ */
    public abstract String mo793();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public String mo818() {
        int i10 = (f736 + 89) % 128;
        f733 = i10;
        String str = this.f743;
        if (str == null) {
            return m819();
        }
        f736 = (i10 + 41) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ｋ */
    public abstract Class mo794(String str);

    /* JADX INFO: renamed from: ﾇ */
    public abstract Map<String, c> mo795();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m820(String str) {
        int i10 = f736 + 89;
        f733 = i10 % 128;
        int i11 = i10 % 2;
        this.f743 = str;
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m822() {
        Map<String, c> mapMo795 = mo795();
        this.f744 = mapMo795;
        mapMo795.put(m810((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 21398), "\u0000\u0000\u0000\u0000", "麺麭閶婓", "ꕙ\udb2a嘜䙃뙪쇋韑ٶꌺ戈\udad0盎錌쁵ꇗฦ鼥", ExpandableListView.getPackedPositionGroup(0L) - 1231114850).intern(), new c() { // from class: com.ironsource.adqualitysdk.sdk.i.be.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                be.this.m820((String) be.m808(list, String.class));
                return be.m809(be.this);
            }
        });
        this.f744.put(m813((short) ('0' - AndroidCharacter.getMirror('0')), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 81033394, (-16) - ((Process.getThreadPriority(0) + 20) >> 6), 1300890105 - (Process.myPid() >> 22), (byte) (90 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern(), new c() { // from class: com.ironsource.adqualitysdk.sdk.i.be.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Boolean.valueOf(be.this.m815());
            }
        });
        this.f744.put(m813((short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-81033395) - Color.argb(0, 0, 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 27, 1300890122 - MotionEvent.axisFromString(""), (byte) ((-125) - View.getDefaultSize(0, 0))).intern(), new c() { // from class: com.ironsource.adqualitysdk.sdk.i.be.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return be.m811(be.this, (String) list.get(0));
            }
        });
        f736 = (f733 + 81) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b5, code lost:
    
        if (r13.equals(m810((char) (64270 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), "\u0000\u0000\u0000\u0000", "㵤坃ຏ\uaafb", "쀴큲㟛", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) - 1890106564).intern()) != false) goto L49;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Class m812(java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.be.m812(java.lang.String, boolean):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Class m816(String str) {
        f733 = (f736 + 13) % 128;
        try {
            if (Prode.m198()) {
                return mo794(str);
            }
            int i10 = f733 + 107;
            f736 = i10 % 128;
            return i10 % 2 != 0 ? m812(str, true) : m812(str, false);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026 A[Catch: all -> 0x001c, TryCatch #2 {all -> 0x001c, blocks: (B:3:0x0001, B:5:0x000e, B:18:0x0051, B:19:0x0057, B:25:0x0068, B:16:0x0026, B:11:0x001b, B:14:0x001e, B:21:0x0064, B:7:0x0016), top: B:34:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[Catch: all -> 0x001c, TryCatch #2 {all -> 0x001c, blocks: (B:3:0x0001, B:5:0x000e, B:18:0x0051, B:19:0x0057, B:25:0x0068, B:16:0x0026, B:11:0x001b, B:14:0x001e, B:21:0x0064, B:7:0x0016), top: B:34:0x0001, inners: #0, #1 }] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized String m819() {
        try {
            int i10 = f736 + 1;
            f733 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 58 / 0;
                if (TextUtils.isEmpty(this.f745)) {
                    this.f745 = mo793();
                } else if (this.f745.equals(m810((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "铑学멡軞", "ց뺌\ue5ed\udf6d䝤玲池", 1633379988 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    this.f745 = mo793();
                }
            } else if (TextUtils.isEmpty(this.f745)) {
                this.f745 = mo793();
            } else if (this.f745.equals(m810((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "铑学멡軞", "ց뺌\ue5ed\udf6d䝤玲池", 1633379988 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                this.f745 = mo793();
            }
            String str = this.f745;
            int i12 = f736 + 59;
            f733 = i12 % 128;
            if (i12 % 2 != 0) {
                return str;
            }
            int i13 = 2 / 0;
            return str;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Class m817(String str) {
        f736 = (f733 + 99) % 128;
        Class clsM812 = m812(str, true);
        int i10 = f736 + 11;
        f733 = i10 % 128;
        if (i10 % 2 != 0) {
            return clsM812;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m810(char c4, String str, String str2, String str3, int i10) {
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
        synchronized (f.f2016) {
            try {
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr3.clone();
                cArr4[0] = (char) (c4 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr.length;
                char[] cArr6 = new char[length];
                f.f2015 = 0;
                while (true) {
                    int i11 = f.f2015;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c5 = cArr5[i12];
                        char c10 = (char) ((i14 + c5) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2017 = c10;
                        cArr5[i13] = (char) d5.u.d(cArr4[i13], 32718, c5, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c10;
                        int i15 = f.f2015;
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f742) ^ ((long) f741)) ^ ((long) f738));
                        f.f2015 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object mo821(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
        f733 = (f736 + 31) % 128;
        c cVar = this.f744.get(str);
        try {
            if (cVar != null) {
                f733 = (f736 + 93) % 128;
                Object objMo796 = cVar.mo796(list, ckVar);
                f736 = (f733 + 77) % 128;
                return objMo796;
            }
            new ds(clVar, eeVar, this.f746, str).m2034(this.f746);
            return null;
        } catch (Exception e10) {
            String str2 = this.f746;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m813((short) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getWindowTouchSlop() >> 8) - 81033429, (-13) - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1300890130, (byte) (27 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern());
            sb2.append(this.f746);
            sb2.append(m813((short) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 81033466, (KeyEvent.getMaxKeyCode() >> 16) - 33, 1300890151 - Color.red(0), (byte) (Color.rgb(0, 0, 0) + 16777273)).intern());
            sb2.append(str);
            sb2.append(m813((short) View.getDefaultSize(0, 0), View.MeasureSpec.getMode(0) - 81033459, ((Process.getThreadPriority(0) + 20) >> 6) - 34, 1300890152 - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 127)).intern());
            cn.m1708(str2, sb2.toString(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m823(hj hjVar, ck ckVar, String str, Object... objArr) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, hjVar);
            ckVar.mo1592(str, arrayList);
            f736 = (f733 + 121) % 128;
        } catch (Throwable th2) {
            String str2 = this.f746;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m810((char) KeyEvent.getDeadChar(0, 0), "\u0000\u0000\u0000\u0000", "먫\u2072瞜돸", "훊㙰ᦈꎉ䴾\uf3f5㷧춪績", (-1675595078) - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
            sb2.append(this);
            cn.m1708(str2, sb2.toString(), th2);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m813(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f740;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f734;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f737 + i12] + i13);
                    } else {
                        i14 = (short) (f735[f737 + i12] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f737 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f739);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f734;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f735;
                            int i17 = n.f3072;
                            n.f3072 = i17 - 1;
                            n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                        }
                        sb2.append(n.f3074);
                        n.f3075 = n.f3074;
                        n.f3071++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }
}

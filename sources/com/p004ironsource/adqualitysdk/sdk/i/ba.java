package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ba {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f675 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f678 = 13527;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f679 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f680;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static long f681;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String f683;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f685;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f686;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f687;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f688;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f689;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char[] f677 = {20922, 6249, 49873, 59199, 44735, 29806, 14888, 49609, 38775, 23859, 'A', 18902, 37685, 56675, 9897, 28694, 47685, 938, 19945, 38673, 57520, 10989, 'M', 18903, 37655, 56677, 9897, 28701, 47689, 996, 19888, ' ', '-', 18847, 37705, 56635, 9957, 28759, 47617, 1011, 19901, 38767, 57561, 10891, 29813, 48679, 59573, 41254, 31723, 13773, 52821, 39140, 21155, 60230, 42243, 32732, 2155, 34961, 49488, 7057, 21996, 44633, 63677, 13048, 35613, 50514, 8090, 26666, 41593, 64723, 13979, 40939, 54868, 3215, 'F', 18899, 37645, 56698, 9901, 28702, 47628, 938, 19967, 38754, 57501, 10952, 29745, 48766, 2005, 20751, 39756, 58555, 12030, 30803, 49608, 3065, 21795, 40592, 59614, 12807, 31863, 50610, 3863, 22872};

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static long f676 = 8876893355069163954L;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private c f684 = c.f711;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private b f682 = b.f699;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ba$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        static final /* synthetic */ int[] f690;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static final /* synthetic */ int[] f691;

        static {
            int[] iArr = new int[b.valuesCustom().length];
            f691 = iArr;
            try {
                iArr[b.f696.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f691[b.f702.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f691[b.f701.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f691[b.f700.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f691[b.f698.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[c.valuesCustom().length];
            f690 = iArr2;
            try {
                iArr2[c.f713.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f690[c.f714.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f690[c.f715.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f690[c.f709.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f690[c.f712.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum b {
        f699,
        f702,
        f701,
        f700,
        f698,
        f696;


        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f692 = 1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static char f693;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static char[] f694;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f697;

        static {
            m755();
            f697 = (f692 + 105) % 128;
        }

        public static b valueOf(String str) {
            f692 = (f697 + 55) % 128;
            b bVar = (b) Enum.valueOf(b.class, str);
            int i2 = f692 + 91;
            f697 = i2 % 128;
            if (i2 % 2 == 0) {
                return bVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            f692 = (f697 + 55) % 128;
            b[] bVarArr = (b[]) values().clone();
            f692 = (f697 + 43) % 128;
            return bVarArr;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static void m755() {
            f693 = (char) 5;
            f694 = new char[]{'N', 'O', 'E', 'W', 'R', '_', 'A', 'G', 'T', 'Q', 'U', 'I', 'D', 'S', 'P', 'K', 'V', 'L', 'Z', 'F', 'C', 'X', 'Y', AbstractJsonLexerKt.BEGIN_LIST, '\\'};
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m756(byte b2, String str, int i2) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (i.f2343) {
                try {
                    char[] cArr2 = f694;
                    char c2 = f693;
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
    }

    public enum c {
        f711,
        f713,
        f714,
        f715,
        f712,
        f709;


        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f703 = 1;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f704;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private static char f705;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static char f706;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static char f707;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f710;

        static {
            m757();
            f704 = (f703 + 9) % 128;
        }

        public static c valueOf(String str) {
            f704 = (f703 + 45) % 128;
            c cVar = (c) Enum.valueOf(c.class, str);
            int i2 = f704 + 3;
            f703 = i2 % 128;
            if (i2 % 2 != 0) {
                return cVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            f704 = (f703 + 61) % 128;
            c[] cVarArr = (c[]) values().clone();
            int i2 = f703 + 63;
            f704 = i2 % 128;
            if (i2 % 2 == 0) {
                return cVarArr;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static void m757() {
            f707 = (char) 3580;
            f706 = (char) 18894;
            f705 = (char) 40909;
            f710 = (char) 9148;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m758(String str, int i2) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (m.f2870) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    m.f2869 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i3 = m.f2869;
                        if (i3 < cArr.length) {
                            cArr3[0] = cArr[i3];
                            cArr3[1] = cArr[i3 + 1];
                            int i4 = 58224;
                            for (int i5 = 0; i5 < 16; i5++) {
                                char c2 = cArr3[1];
                                char c3 = cArr3[0];
                                char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f707)) ^ ((c3 >>> 5) + f705)));
                                cArr3[1] = c4;
                                cArr3[0] = (char) (c3 - (((c4 >>> 5) + f706) ^ ((c4 + i4) ^ ((c4 << 4) + f710))));
                                i4 -= 40503;
                            }
                            int i6 = m.f2869;
                            cArr2[i6] = cArr3[0];
                            cArr2[i6 + 1] = cArr3[1];
                            m.f2869 = i6 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }
    }

    public ba(String str) {
        this.f689 = str;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m742() {
        f675 = (f679 + 33) % 128;
        String strName = this.f684.name();
        f675 = (f679 + 115) % 128;
        return strName;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m743() {
        int i2 = f679;
        f675 = (i2 + 77) % 128;
        if (this.f686 == null) {
            return null;
        }
        f675 = (i2 + 15) % 128;
        if (this.f688 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m744((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), "ᥪ矇\u0adc㒑", "ⅸ䖿잿콺៕댷\u2029逹ﷺⰵ\udb95⯑☑ᇯ䎾כֿ洋㗖\uea13퀀ᖺ⣚翨㣪", "\u0000\u0000\u0000\u0000").intern());
        sb.append(this.f686);
        sb.append(m747((ViewConfiguration.getJumpTapTimeout() >> 16) + 3, View.resolveSize(0, 0) + 71, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 40908)).intern());
        sb.append(this.f688);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m746() {
        String strIntern;
        if (this.f689 == null || (strIntern = this.f687) == null) {
            return null;
        }
        if (strIntern.equals(m747(3 - (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0', 0) + 1, (char) (20980 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern()) && this.f684 != c.f712) {
            f679 = (f675 + 105) % 128;
            strIntern = m747((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, (ViewConfiguration.getJumpTapTimeout() >> 16) + 46, (char) (59643 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f689);
        String strN = a.n(sb, m747(14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 58 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (34993 - Color.red(0))), strIntern);
        f679 = (f675 + 13) % 128;
        return strN;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m748() {
        StringBuilder sb = new StringBuilder();
        sb.append(m744((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 537516034, (char) (38749 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "˭\u09d8尠窗", "勖愔亃瞮꒒みዡ搖\uf51e崢桵ꆰ藷쿩戜", "\u0000\u0000\u0000\u0000").intern());
        sb.append(this.f689);
        String strC = a.C(sb, m744(Color.green(0) + 1011439912, (char) View.MeasureSpec.makeMeasureSpec(0, 0), "⡏䥙娼ˌ", "㤭昕闋䉍虣箼ᱏ迳욦\ud81c\udbac", "\u0000\u0000\u0000\u0000"));
        if (this.f685 != null) {
            StringBuilder sbW = android.support.v4.media.a.w(strC);
            sbW.append(this.f685);
            strC = a.C(sbW, m747((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 30, (char) View.MeasureSpec.getMode(0)));
            f679 = (f675 + 13) % 128;
        }
        String strC2 = a.C(android.support.v4.media.a.w(strC), m747((ViewConfiguration.getEdgeSlop() >> 16) + 14, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 32, (char) TextUtils.getOffsetBefore("", 0)));
        int i2 = f679 + 35;
        f675 = i2 % 128;
        if (i2 % 2 == 0) {
            return strC2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m750(c cVar) {
        f675 = (f679 + 17) % 128;
        this.f684 = cVar;
        if (cVar != c.f709) {
            int i2 = f679 + 93;
            f675 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f682 = b.f699;
                int i3 = 2 / 0;
            } else {
                this.f682 = b.f699;
            }
        }
        int i4 = AnonymousClass2.f690[cVar.ordinal()];
        if (i4 == 3 || i4 == 4 || i4 == 5) {
            m745();
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m752(cn cnVar) {
        f679 = (f675 + 19) % 128;
        cnVar.m1557();
        this.f689 = cnVar.m1553();
        this.f685 = cnVar.m1552();
        this.f687 = cnVar.m1547();
        if (m744(((Process.getThreadPriority(0) + 20) >> 6) + 1592379763, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "現\ue9c9橞㈆", "潒僶鰰莐紋ꔆ稚", "\u0000\u0000\u0000\u0000").intern().equals(this.f687) || m744(ViewConfiguration.getPressedStateDuration() >> 16, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "鉢륋쩓羺", "蕣\udf01鵤샠愃䭿аﲮ", "\u0000\u0000\u0000\u0000").intern().equals(this.f687)) {
            this.f687 = m747(Color.rgb(0, 0, 0) + 16777219, 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (20980 - TextUtils.indexOf("", "", 0, 0))).intern();
            f675 = (f679 + 95) % 128;
        }
        this.f686 = cnVar.m1549();
        this.f688 = cnVar.m1548();
        this.f683 = cnVar.m1551();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m754() {
        int i2 = f679 + 97;
        f675 = i2 % 128;
        if (i2 % 2 == 0) {
            return m749(this.f682);
        }
        m749(this.f682);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m747(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f677[i3 + i4]) ^ (((long) i4) * f676)) ^ ((long) c2));
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0122, code lost:
    
        if (r1 == com.ironsource.adqualitysdk.sdk.i.ba.c.f712) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0127, code lost:
    
        if (r1 == com.ironsource.adqualitysdk.sdk.i.ba.c.f712) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012a, code lost:
    
        r1 = m749(r13.f682);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0130, code lost:
    
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0132, code lost:
    
        r4 = new java.lang.StringBuilder();
        r4.append(m747(android.view.View.MeasureSpec.getMode(0) + 9, 22 - android.graphics.Color.alpha(0), (char) android.view.Gravity.getAbsoluteGravity(0, 0)).intern());
        r4.append(r1);
        r0.append(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x015d, code lost:
    
        com.p004ironsource.adqualitysdk.sdk.i.n.m2828(m747(13 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 9 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0184, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m745() {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.ba.m745():void");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m751(b bVar) {
        int i2 = f679 + 109;
        f675 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f682 = bVar;
            m750(c.f709);
        } else {
            this.f682 = bVar;
            m750(c.f709);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m753() {
        c cVar = this.f684;
        if (cVar == c.f713 || cVar == c.f714) {
            return true;
        }
        int i2 = f675 + 47;
        f679 = i2 % 128;
        if (i2 % 2 == 0) {
            c cVar2 = c.f711;
            throw null;
        }
        if (cVar == c.f711) {
            return true;
        }
        int i3 = f679 + 27;
        f675 = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m749(b bVar) {
        if (bVar != null) {
            int i2 = AnonymousClass2.f691[bVar.ordinal()];
            if (i2 == 1) {
                return m744(Process.getGidForName("") + 1, (char) View.combineMeasuredStates(0, 0), "\ue9b5嚪\ue0fd\ue4ff", "篑蓚䜪怑\ue1b4甆촻㍎怊Ἤ尷⹕Ɒ씌呛퉋\uf78d\ue4cf競쐖銥裨", "\u0000\u0000\u0000\u0000").intern();
            }
            if (i2 == 2) {
                return String.format(m744(ViewConfiguration.getWindowTouchSlop() >> 8, (char) (ViewConfiguration.getLongPressTimeout() >> 16), "ꀆ廼ⶰᝆ", "㩊饵交扰칰품례璌\ue5ad\uf316뎋戧㙿\uf00fᇺ\u0ef0ᕁ掯ṣ〃ෆＸ\uf7de즛靚懊夀蒐촜뫪⭼읗\ufe6d\ue2b9隲氍ꄊ\ua4cd\uf0c7퐞\uf594濕\ueed5멓緀\u0604봈ෳ즉녷뀠ﭢঈ穌ᓵ嫡骟欙\ue1a0扂贻ᝋ", "\u0000\u0000\u0000\u0000").intern(), this.f689, this.f687, this.f683);
            }
            if (i2 == 3) {
                return String.format(m744(811298963 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 53744), "鍽孰\uf030泑", "⚱벽鬵ᄪ鉪㡥츲뫘␚抱최瀍隊蘕嚸ᓳꅃ難鱅聨꣤⪔䔪鈱ぽ沴\ued06沠绦\udd6f鏷껿䎥絒꠳搳㛳샹ꐉ樯\udf17쌑ᮿݏ璣测䑥\u0097\uf4bb\ufbc5ꄙ⍾쿉\udb95盛", "\u0000\u0000\u0000\u0000").intern(), this.f689, this.f687);
            }
            if (i2 == 4) {
                return m747((ViewConfiguration.getEdgeSlop() >> 16) + 30, View.resolveSizeAndState(0, 0, 0) + 74, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern();
            }
            if (i2 == 5) {
                String strIntern = m744((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) (38969 - View.MeasureSpec.getSize(0)), "ꟃ羗㧘쾘", "閍\u0f6e쐟Ⱂ븣維\ueddaᡝ\udc4c\uf238䗯喴ᇻ㶩⫆뙀\ud803蚻蘐३柯\ude1f冕ࢣઃ⼃", "\u0000\u0000\u0000\u0000").intern();
                int i3 = f675 + 21;
                f679 = i3 % 128;
                if (i3 % 2 != 0) {
                    return strIntern;
                }
                throw null;
            }
        }
        int i4 = f679 + 65;
        f675 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m744(int i2, char c2, String str, String str2, String str3) {
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
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f681) ^ ((long) f680)) ^ ((long) f678));
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

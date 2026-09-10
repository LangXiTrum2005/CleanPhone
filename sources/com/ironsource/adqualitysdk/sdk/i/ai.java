package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ai {

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    private static int f178 = 51;

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    private static char f179 = 19016;

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    private static int f180 = 0;

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    private static int f181 = 1;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static char f182 = 11385;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static char f183 = 32646;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static char f184 = 60735;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private String f185;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private r f186;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private ju f187;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private jb f188;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private Context f189;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private af f191;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f194;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private boolean f195;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Handler f196;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f197;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private al f198;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ah f199;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jj f200;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private jk f201;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private List<ae> f193 = new ArrayList();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private List<jm.d> f192 = new ArrayList();

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private Thread.UncaughtExceptionHandler f190 = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ai$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class AnonymousClass5 implements ah.d {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        final /* synthetic */ List f230;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final /* synthetic */ ji f231;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ JSONArray f233;

        public AnonymousClass5(JSONArray jSONArray, List list, ji jiVar) {
            this.f233 = jSONArray;
            this.f230 = list;
            this.f231 = jiVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ah.d
        public void onEventGenerated(JSONObject jSONObject) {
            ai.m365(ai.this).m302(jSONObject);
            ai.m332(ai.this).m2630(ai.m335(ai.this).m433(ai.m339(ai.this)), jSONObject, new ji() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.5.1

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static char[] f234 = {'A', 'n', 'a', 'l', 'y', 't', 'i', 'c', 's', 'G', 'o', ' ', 'u', 'e', 'r', 'p', 'f', 'd', 'E', 'v', '!', 'S', 'm', 'h', 'g', 'w', '.', ':', 'B', 'C', 'D', 'F', 'H', 'I', 'J', 'K'};

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static int f235 = 0;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static int f236 = 1;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static char f237 = 6;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static String m403(byte b10, int i10, String str) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (j.f2647) {
                        try {
                            char[] cArr2 = f234;
                            char c4 = f237;
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

                @Override // com.ironsource.adqualitysdk.sdk.i.ji
                /* JADX INFO: renamed from: ﾇ */
                public final void mo399(final jd jdVar) {
                    final int iM2576 = jdVar.m2571().m2576();
                    final String strM2575 = jdVar.m2571().m2575();
                    if (iM2576 >= 200 && iM2576 <= 299) {
                        m.m2973(m403((byte) (34 - TextUtils.indexOf("", "", 0)), 9 - View.getDefaultSize(0, 0), "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0095").intern(), m403((byte) (111 - TextUtils.getCapsMode("", 0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 37, "\n\u000b\u000b\u0011\u0005\b\u0006\u000eÒÒ\u000e\u0007\t\u0006\u000f\u000e\t\u000e\u0007\u0004\u0007\u000e\n\u0011\b\u0010\u0006\t\u0013\u0007\f\u0017\u0019\u0013\u0002\u0000\u0090").intern(), AnonymousClass5.this.f233);
                        Iterator it = AnonymousClass5.this.f230.iterator();
                        while (it.hasNext()) {
                            ai.m341(ai.this).m2648(((ag) it.next()).m312());
                        }
                        p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.5.1.4
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* JADX INFO: renamed from: ｋ */
                            public final void mo254() {
                                AnonymousClass5.this.f231.mo399(jdVar);
                            }
                        });
                        return;
                    }
                    if (iM2576 == 403) {
                        synchronized (ai.this) {
                            try {
                                for (final jm.d dVar : ai.m333(ai.this)) {
                                    p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.5.1.3
                                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                                        /* JADX INFO: renamed from: ｋ */
                                        public final void mo254() {
                                            dVar.mo2681();
                                        }
                                    });
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        String strIntern = m403((byte) (34 - TextUtils.getCapsMode("", 0, 0)), Process.getGidForName("") + 10, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0095").intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m403((byte) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 116), (KeyEvent.getMaxKeyCode() >> 16) + 51, "\u0016\t\u0013\u0010\u000b\u001d\u0007\u0000\u001d\u0006\u001f\u0013\u0002\u0000\u0007\u001d\u0010\b\u0000\u0019\u0007\u001d\u000b\u0000\u001d\u0011\u0007\u000e\u0005\r\u0013\u0014\u0013\u0007\u0002\u001d\u0006\n\u000b\u0004\b\u0011\u000e\u0007\u0010\t\u0002\u0007\u000f\u0019\u0094").intern());
                        sb2.append(iM2576);
                        sb2.append(m403((byte) (32 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, "@").intern());
                        sb2.append(strM2575);
                        m.m2963(strIntern, sb2.toString());
                    }
                    p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.5.1.1

                        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
                        private static int f239 = 1;

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static byte[] f240 = {6, 106, 89, 118, -119, -125, -125, -127, -110, 119, -42, 48, -119, -84, -85, 118, 62, -118, -115, 115, -75, 101, 122, -115, 118, -41, 60, 120, -113, 118, -37, 61, 125, -125, -127, 127, -37, 48, -118, -115, 114, -37, 61, 125, -119, -123, 120, -109, 124, -126, -96, -44};

                        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                        private static short[] f241 = null;

                        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                        private static int f242 = 45;

                        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                        private static int f243 = 0;

                        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                        private static int f244 = -1481371320;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f245 = -170201685;

                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            ji jiVar = AnonymousClass5.this.f231;
                            jd jdVar2 = jdVar;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m404((byte) (ViewConfiguration.getPressedStateDuration() >> 16), 170201685 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1481371403, (short) (125 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (-47) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
                            sb3.append(iM2576);
                            sb3.append(m404((byte) View.MeasureSpec.getMode(0), 170201736 - View.resolveSizeAndState(0, 0, 0), Color.blue(0) + 1481371352, (short) (10 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (-45) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
                            sb3.append(strM2575);
                            jiVar.mo400(jdVar2, sb3.toString());
                            int i10 = f243 + 91;
                            f239 = i10 % 128;
                            if (i10 % 2 == 0) {
                                throw null;
                            }
                        }

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static String m404(byte b10, int i10, int i11, short s10, int i12) {
                            String string;
                            synchronized (n.f3070) {
                                try {
                                    StringBuilder sb3 = new StringBuilder();
                                    int i13 = f242;
                                    int i14 = i12 + i13;
                                    int i15 = i14 == -1 ? 1 : 0;
                                    if (i15 != 0) {
                                        byte[] bArr = f240;
                                        i14 = bArr != null ? (byte) (bArr[f245 + i10] + i13) : (short) (f241[f245 + i10] + i13);
                                    }
                                    if (i14 > 0) {
                                        n.f3072 = ((i10 + i14) - 2) + f245 + i15;
                                        n.f3073 = b10;
                                        char c4 = (char) (i11 + f244);
                                        n.f3074 = c4;
                                        sb3.append(c4);
                                        n.f3075 = n.f3074;
                                        n.f3071 = 1;
                                        while (n.f3071 < i14) {
                                            byte[] bArr2 = f240;
                                            if (bArr2 != null) {
                                                int i16 = n.f3072;
                                                n.f3072 = i16 - 1;
                                                n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                                            } else {
                                                short[] sArr = f241;
                                                int i17 = n.f3072;
                                                n.f3072 = i17 - 1;
                                                n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                                            }
                                            sb3.append(n.f3074);
                                            n.f3075 = n.f3074;
                                            n.f3071++;
                                        }
                                    }
                                    string = sb3.toString();
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            return string;
                        }
                    });
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.ji
                /* JADX INFO: renamed from: ﾒ */
                public final void mo400(final jd jdVar, final String str) {
                    p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.5.1.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            AnonymousClass5.this.f231.mo400(jdVar, str);
                        }
                    });
                    int i10 = f236 + 21;
                    f235 = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                }
            });
        }
    }

    public ai(Context context, as asVar, al alVar, boolean z10, String str, r rVar) {
        this.f186 = rVar;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.4

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f226 = 162;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f227 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f228;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m402(int i10, String str2, boolean z11, int i11, int i12) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (d.f1625) {
                    try {
                        char[] cArr2 = new char[i11];
                        d.f1622 = 0;
                        while (true) {
                            int i13 = d.f1622;
                            if (i13 >= i11) {
                                break;
                            }
                            d.f1624 = cArr[i13];
                            cArr2[d.f1622] = (char) (d.f1624 + i12);
                            int i14 = d.f1622;
                            cArr2[i14] = (char) (cArr2[i14] - f226);
                            d.f1622 = i14 + 1;
                        }
                        if (i10 > 0) {
                            d.f1623 = i10;
                            char[] cArr3 = new char[i11];
                            System.arraycopy(cArr2, 0, cArr3, 0, i11);
                            int i15 = d.f1623;
                            System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                            int i16 = d.f1623;
                            System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                        }
                        if (z11) {
                            char[] cArr4 = new char[i11];
                            d.f1622 = 0;
                            while (true) {
                                int i17 = d.f1622;
                                if (i17 >= i11) {
                                    break;
                                }
                                cArr4[i17] = cArr2[(i11 - i17) - 1];
                                d.f1622 = i17 + 1;
                            }
                            cArr2 = cArr4;
                        }
                        str3 = new String(cArr2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str3;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                f228 = (f227 + 63) % 128;
                kl.m2892(m402(View.resolveSizeAndState(0, 0, 0) + 4, "\f\u0001\ufffb\u000b\uffd9\u0006\ufff9\u0004\u0011", false, 9 - (ViewConfiguration.getTouchSlop() >> 8), 267 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m402(Color.green(0) + 14, "\n\uffff�\u0012\uffffﾺ\u000e\u0002\u0001\u000f\ufffb�\b\uffef\b\t\u0003\u000e", true, 18 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 264).intern(), m402(8 - TextUtils.lastIndexOf("", '0'), "\b\u0000\ufffe\uffff\u0002\u0000\ufffe\u000f\ufff1", true, (-16777207) - Color.rgb(0, 0, 0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 261).intern(), th2);
                ai.this.m384();
                if (ai.m369(ai.this) != null) {
                    ai.m369(ai.this).uncaughtException(thread, th2);
                    return;
                }
                try {
                    Process.killProcess(Process.myPid());
                    System.exit(10);
                    f227 = (f228 + InterfaceC0435l1.d.b.f29109f) % 128;
                } catch (SecurityException unused) {
                }
            }
        });
        this.f198 = alVar;
        this.f189 = context;
        jm jmVar = new jm(context, m368("넁ᒋ늠Ӂ眾\uf0e2늠Ӂ䊾堒\u2e9a껔牛\uf637⬴\ueab9異䠵賒༳ᙖ쳗ԛ\ue04e杴偫", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 25).intern(), m373(3 - View.resolveSize(0, 0), "\u000b\u000b\u000f\u000f\uffff\u0005\u0010\u0015\b�\n�\uffd0\uffc9\u0010\u0001\u000e\uffff\u0001\u000f\uffc9�\b\t", true, 24 - TextUtils.getCapsMode("", 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 151).intern());
        this.f201 = new jk(m373(5 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0003\u0014￣\ufff5￦\u0011\u0012\f", true, 8 - View.MeasureSpec.makeMeasureSpec(0, 0), 149 - View.MeasureSpec.getSize(0)).intern(), m373(5 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0012\f\u0003\u0014\u0003ￌ", true, (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 5, 149 - View.resolveSizeAndState(0, 0, 0)).intern(), jmVar);
        int iM352 = m352(jmVar);
        this.f199 = new ah(context, asVar, iM352, m374(jmVar), ar.m468().mo476());
        this.f200 = new jj(context);
        this.f197 = false;
        HandlerThread handlerThread = new HandlerThread(m368("砦㢢\ue6f5阿东ꢧ㥟튝妣ꤗ\ue55d숱䉵䄍", 14 - (Process.myPid() >> 22)).intern());
        handlerThread.start();
        this.f196 = new Handler(handlerThread.getLooper());
        this.f191 = new af(iM352);
        this.f194 = !z10;
        this.f185 = str;
        m359(true);
        m343();
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private String m330() {
        if (ar.m468().mo490()) {
            String strM453 = m338().m453();
            int i10 = f180 + InterfaceC0435l1.d.b.f29114k;
            f181 = i10 % 128;
            if (i10 % 2 != 0) {
                return strM453;
            }
            throw null;
        }
        f181 = (f180 + 63) % 128;
        String strM455 = m338().m455();
        int i11 = f181 + 5;
        f180 = i11 % 128;
        if (i11 % 2 == 0) {
            return strM455;
        }
        throw null;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private int m331() {
        f180 = (f181 + 39) % 128;
        if (m338() == null || ar.m468().mo490()) {
            return 100;
        }
        f181 = (f180 + 81) % 128;
        int iM460 = m338().m460();
        f180 = (f181 + 9) % 128;
        return iM460;
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public static /* synthetic */ jj m332(ai aiVar) {
        int i10 = f180;
        f181 = (i10 + 75) % 128;
        jj jjVar = aiVar.f200;
        int i11 = i10 + 75;
        f181 = i11 % 128;
        if (i11 % 2 != 0) {
            return jjVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static /* synthetic */ List m333(ai aiVar) {
        int i10 = f181 + 63;
        f180 = i10 % 128;
        int i11 = i10 % 2;
        List<jm.d> list = aiVar.f192;
        if (i11 != 0) {
            int i12 = 65 / 0;
        }
        return list;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static /* synthetic */ al m335(ai aiVar) {
        int i10 = f181;
        f180 = (i10 + InterfaceC0435l1.d.b.f29109f) % 128;
        al alVar = aiVar.f198;
        f180 = (i10 + 97) % 128;
        return alVar;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static /* synthetic */ ah m337(ai aiVar) {
        int i10 = f180;
        int i11 = i10 + 117;
        f181 = i11 % 128;
        int i12 = i11 % 2;
        ah ahVar = aiVar.f199;
        if (i12 == 0) {
            int i13 = 84 / 0;
        }
        int i14 = i10 + InterfaceC0435l1.d.b.f29107d;
        f181 = i14 % 128;
        if (i14 % 2 != 0) {
            return ahVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ String m339(ai aiVar) {
        int i10 = f180 + 41;
        f181 = i10 % 128;
        if (i10 % 2 == 0) {
            aiVar.m330();
            throw null;
        }
        String strM330 = aiVar.m330();
        f181 = (f180 + 49) % 128;
        return strM330;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static /* synthetic */ jk m341(ai aiVar) {
        int i10 = f181 + 7;
        f180 = i10 % 128;
        int i11 = i10 % 2;
        jk jkVar = aiVar.f201;
        if (i11 == 0) {
            return jkVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ void m344(ai aiVar) {
        f180 = (f181 + 117) % 128;
        aiVar.m371(false);
        f180 = (f181 + 31) % 128;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ void m346(ai aiVar) {
        int i10 = f180 + 89;
        f181 = i10 % 128;
        int i11 = i10 % 2;
        aiVar.m340();
        if (i11 == 0) {
            throw null;
        }
        f180 = (f181 + 41) % 128;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ void m348(ai aiVar) {
        f181 = (f180 + 53) % 128;
        aiVar.m345();
        int i10 = f181 + 59;
        f180 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ int m349(ai aiVar) {
        f181 = (f180 + InterfaceC0435l1.d.b.f29105b) % 128;
        int iM331 = aiVar.m331();
        int i10 = f181 + 47;
        f180 = i10 % 128;
        if (i10 % 2 == 0) {
            return iM331;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ void m351(ai aiVar) {
        int i10 = f181 + 17;
        f180 = i10 % 128;
        if (i10 % 2 != 0) {
            aiVar.m362(false);
        } else {
            aiVar.m362(true);
        }
        int i11 = f180 + 23;
        f181 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 98 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m354(ai aiVar) {
        int i10 = f180 + 87;
        f181 = i10 % 128;
        int i11 = i10 % 2;
        aiVar.m350();
        if (i11 == 0) {
            int i12 = 51 / 0;
        }
        f181 = (f180 + 69) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ r m360(ai aiVar) {
        int i10 = f180;
        f181 = (i10 + 59) % 128;
        r rVar = aiVar.f186;
        int i11 = i10 + 57;
        f181 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 64 / 0;
        }
        return rVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ af m365(ai aiVar) {
        int i10 = f181;
        f180 = (i10 + 57) % 128;
        af afVar = aiVar.f191;
        int i11 = i10 + 43;
        f180 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 5 / 0;
        }
        return afVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Thread.UncaughtExceptionHandler m369(ai aiVar) {
        int i10 = (f181 + 23) % 128;
        f180 = i10;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = aiVar.f190;
        f181 = (i10 + 53) % 128;
        return uncaughtExceptionHandler;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m376(ai aiVar) {
        f181 = (f180 + 23) % 128;
        aiVar.m359(false);
        int i10 = f180 + 49;
        f181 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized boolean m334() {
        boolean z10;
        int i10 = f180;
        z10 = this.f195;
        f181 = (i10 + 73) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private void m336() {
        f180 = (f181 + 15) % 128;
        m375(0);
        int i10 = f180 + 23;
        f181 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private synchronized ap m338() {
        int i10 = f181 + 5;
        f180 = i10 % 128;
        if (i10 % 2 != 0) {
            ar.m468().mo484();
            throw null;
        }
        return ar.m468().mo484();
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private synchronized void m340() {
        try {
            if (m342() && !TextUtils.isEmpty(this.f199.m2776().m549())) {
                f180 = (f181 + 99) % 128;
                if (!m334()) {
                    m371(true);
                    m.m2963(m373(TextUtils.indexOf("", "", 0, 0) + 9, "\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb\u000b", false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8, 156 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), m368("\uddfa䧾쀌藇嬣₅\udeb7꩐嚦뀠鬅岰栐㒣ꙗ쐔㥟튝꯲꣭ă郭\ue6f5阿鍽孲", 25 - ExpandableListView.getPackedPositionType(0L)).intern());
                    this.f201.m2647(m338().m461(), new AnonymousClass3());
                }
            }
            f180 = (f181 + 9) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private synchronized boolean m342() {
        int i10 = f181 + 95;
        f180 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return this.f197;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m343() {
        this.f188 = new jb() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.8
            @Override // com.ironsource.adqualitysdk.sdk.i.jb
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo407() {
                ai.m354(ai.this);
            }
        };
        this.f200.m2628().m2603(this.f188);
        this.f187 = new ju(new jx() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.10

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static long f206 = 1367593066776841753L;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f207 = 0;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f208 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public static /* synthetic */ JSONObject m389(Activity activity) {
                int i10 = f208 + 59;
                f207 = i10 % 128;
                if (i10 % 2 != 0) {
                    m391(activity);
                    throw null;
                }
                JSONObject jSONObjectM391 = m391(activity);
                int i11 = f207 + 75;
                f208 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 18 / 0;
                }
                return jSONObjectM391;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static JSONObject m391(Activity activity) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(m390("Ꮲᎃិ姍ຟ鋙甃⯧\udfdd鼆\uda6c", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), activity.getClass().getName());
                    f208 = (f207 + 61) % 128;
                } catch (JSONException unused) {
                    m.m2972(m390("漺潻ꙥ\ue812쎍忞\udf47圧減㕠ᝲឬᾁ", (ViewConfiguration.getEdgeSlop() >> 16) + 1).intern(), m390("ᔨᕭ㙥砎쒋壋櫪ⴾ\ufe53胎ၼꈅ斄욆젟\udbba밤輪膶Ꮝ\uf4d1埑뤠䭡ಥဣ狃蒐䜝\ud81a", -ExpandableListView.getPackedPositionChild(0L)).intern());
                }
                int i10 = f207 + 1;
                f208 = i10 % 128;
                if (i10 % 2 != 0) {
                    return jSONObject;
                }
                throw null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jx
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo392(final Activity activity) {
                p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.10.4

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int f215 = 0;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static long f216 = -685941845773049503L;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f217 = 1;

                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        f215 = (f217 + 115) % 128;
                        ai.m360(ai.this).onEvent(m395("ℇ拉Ꚍ\uea41⸎珝랹ﭵ㼪䃪蓈좞\u0c50倞", 17351 - Drawable.resolveOpacity(0, 0)).intern());
                        ai.this.m385(m395("ℇ拉Ꚍ\uea41⸎珝랹ﭵ㼪䃪蓈좞\u0c50倞", ((byte) KeyEvent.getModifierMetaStateMask()) + 17352).intern(), AnonymousClass10.m389(activity));
                        int i10 = f215 + 49;
                        f217 = i10 % 128;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                    }

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static String m395(String str, int i10) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (i.f2435) {
                            try {
                                i.f2436 = i10;
                                char[] cArr2 = new char[cArr.length];
                                i.f2434 = 0;
                                while (true) {
                                    int i11 = i.f2434;
                                    if (i11 < cArr.length) {
                                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f216);
                                        i.f2434++;
                                    } else {
                                        str2 = new String(cArr2);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return str2;
                    }
                });
                int i10 = f208 + 83;
                f207 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 32 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jx
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo393(final Activity activity) {
                p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.10.2

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int[] f210 = {-1158473971, 161436391, 913501415, 1598249512, 1541415918, 1899371733, -108521647, 697692150, 866476346, -1512944352, 2065516738, 21743659, -2110784006, -1655559257, 116784982, 1520133213, 1106918845, -231818547};

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f211 = 0;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static int f212 = 1;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static String m394(int[] iArr, int i10) {
                        String str;
                        synchronized (a.f61) {
                            try {
                                char[] cArr = new char[4];
                                char[] cArr2 = new char[iArr.length << 1];
                                int[] iArr2 = (int[]) f210.clone();
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        f211 = (f212 + 85) % 128;
                        ai.m360(ai.this).onEvent(m394(new int[]{-167356785, 473306100, 1522588597, -723332714, 1618864549, 1842860760}, 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern());
                        ai.this.m385(m394(new int[]{-167356785, 473306100, 1522588597, -723332714, 1618864549, 1842860760}, (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 10).intern(), AnonymousClass10.m389(activity));
                        f212 = (f211 + 61) % 128;
                    }
                });
                int i10 = f207 + InterfaceC0435l1.d.b.f29109f;
                f208 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m390(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2127) {
                    try {
                        char[] cArrM2229 = g.m2229(f206, cArr, i10);
                        g.f2129 = 4;
                        while (true) {
                            int i11 = g.f2129;
                            if (i11 < cArrM2229.length) {
                                int i12 = i11 - 4;
                                g.f2128 = i12;
                                cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f206));
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
        jt.m2734().m2736(new js() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.13
            @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo396(Activity activity) {
                ai.this.m384();
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo397(Activity activity) {
                ai.m348(ai.this);
            }
        });
        ar.m468().mo498(new ax() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.11
            @Override // com.ironsource.adqualitysdk.sdk.i.ax
            /* JADX INFO: renamed from: ﾇ */
            public final void mo304() {
                ai.m351(ai.this);
            }
        });
        int i10 = f180 + 79;
        f181 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 49 / 0;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m345() {
        int i10 = f180;
        f181 = (i10 + 75) % 128;
        if (this.f194) {
            int i11 = i10 + 117;
            f181 = i11 % 128;
            if (i11 % 2 == 0) {
                m382();
                throw null;
            }
            m382();
            f180 = (f181 + 107) % 128;
        }
        this.f194 = false;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m347() {
        int i10 = f181 + 77;
        f180 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.f188 != null) {
            this.f200.m2628().m2606(this.f188);
        }
        this.f187.m2751();
        this.f187 = null;
        f180 = (f181 + 115) % 128;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m350() {
        int i10 = f181 + InterfaceC0435l1.d.b.f29112i;
        f180 = i10 % 128;
        int i11 = i10 % 2;
        m359(false);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m355(ai aiVar, int i10) {
        f181 = (f180 + 21) % 128;
        aiVar.m375(i10);
        int i11 = f181 + 43;
        f180 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 54 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m364(ai aiVar, ag agVar) {
        int i10 = f181 + 53;
        f180 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM363 = aiVar.m363(agVar);
        if (i11 != 0) {
            int i12 = 1 / 0;
        }
        return zM363;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m367(ai aiVar, int i10) {
        int i11 = f181 + 79;
        f180 = i11 % 128;
        int i12 = i11 % 2;
        boolean zM372 = aiVar.m372(i10);
        if (i12 != 0) {
            int i13 = 97 / 0;
        }
        int i14 = f180 + 43;
        f181 = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 31 / 0;
        }
        return zM372;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String m378() {
        String strM374 = m374(new jm(this.f189, m368("넁ᒋ늠Ӂ眾\uf0e2늠Ӂ䊾堒\u2e9a껔牛\uf637⬴\ueab9異䠵賒༳ᙖ쳗ԛ\ue04e杴偫", (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 25).intern(), m373(2 - ImageFormat.getBitsPerPixel(0), "\u000b\u000b\u000f\u000f\uffff\u0005\u0010\u0015\b�\n�\uffd0\uffc9\u0010\u0001\u000e\uffff\u0001\u000f\uffc9�\b\t", true, Drawable.resolveOpacity(0, 0) + 24, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 151).intern()));
        int i10 = f181 + 31;
        f180 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM374;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m384() {
        f181 = (f180 + 31) % 128;
        try {
            this.f194 = true;
            m379();
            m386();
            f180 = (f181 + 9) % 128;
        } catch (Exception e10) {
            kl.m2899(m373(9 - View.combineMeasuredStates(0, 0), "\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb\u000b", false, 8 - ImageFormat.getBitsPerPixel(0), 155 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), m373(22 - Color.green(0), "\u0011\uffbf\b\r\uffbf\u000e\r￠\u000f\u000f\ufff3\u000e￡\u0000\u0002\n\u0006\u0011\u000e\u0014\r\u0003￤\u0011\u0011\u000e", false, (ViewConfiguration.getTouchSlop() >> 8) + 26, 148 - View.resolveSizeAndState(0, 0, 0)).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m387(jm.d dVar) {
        f180 = (f181 + 97) % 128;
        this.f192.add(dVar);
        f181 = (f180 + 7) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m356(ai aiVar, List list, ji jiVar) {
        int i10 = f180 + 7;
        f181 = i10 % 128;
        int i11 = i10 % 2;
        aiVar.m361((List<ag>) list, jiVar);
        if (i11 == 0) {
            int i12 = 31 / 0;
        }
        int i13 = f181 + 61;
        f180 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m362(boolean z10) {
        try {
            int i10 = f181 + 15;
            f180 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f197 = true;
                m359(false);
            } else {
                this.f197 = true;
                m359(true);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m383() {
        try {
            int i10 = f180 + 43;
            f181 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f197 = true;
                if (this.f196 != null) {
                    this.f196.removeCallbacksAndMessages(null);
                    f181 = (f180 + 125) % 128;
                }
            } else {
                this.f197 = false;
                if (this.f196 != null) {
                    this.f196.removeCallbacksAndMessages(null);
                    f181 = (f180 + 125) % 128;
                }
            }
            this.f200.m2629();
            m347();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m386() {
        synchronized (this) {
            try {
                Handler handler = this.f196;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                m359(true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m357(ai aiVar, JSONObject jSONObject, je jeVar) {
        int i10 = f181 + 9;
        f180 = i10 % 128;
        int i11 = i10 % 2;
        aiVar.m377(jSONObject, jeVar);
        if (i11 != 0) {
            int i12 = 43 / 0;
        }
        f180 = (f181 + 53) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m380(ae aeVar) {
        f181 = (f180 + 69) % 128;
        this.f193.add(aeVar);
        int i10 = f181 + 71;
        f180 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 76 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m379() {
        p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.6

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f256 = 1;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f257 = 0;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f258 = {216, 212, 195, 215, 201, 210, 200};

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static boolean f259 = true;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static boolean f260 = true;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f261 = 100;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m405(int[] iArr, String str, int i10, String str2) throws UnsupportedEncodingException {
                Object bytes = str2;
                if (str2 != null) {
                    bytes = str2.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (k.f2932) {
                    try {
                        char[] cArr2 = f258;
                        int i11 = f261;
                        if (f260) {
                            int length = bArr.length;
                            k.f2931 = length;
                            char[] cArr3 = new char[length];
                            k.f2933 = 0;
                            while (k.f2933 < k.f2931) {
                                int i12 = k.f2933;
                                int i13 = k.f2931 - 1;
                                int i14 = k.f2933;
                                cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                                k.f2933 = i14 + 1;
                            }
                            return new String(cArr3);
                        }
                        if (f259) {
                            int length2 = cArr.length;
                            k.f2931 = length2;
                            char[] cArr4 = new char[length2];
                            k.f2933 = 0;
                            while (k.f2933 < k.f2931) {
                                int i15 = k.f2933;
                                int i16 = k.f2931 - 1;
                                int i17 = k.f2933;
                                cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                                k.f2933 = i17 + 1;
                            }
                            return new String(cArr4);
                        }
                        int length3 = iArr.length;
                        k.f2931 = length3;
                        char[] cArr5 = new char[length3];
                        k.f2933 = 0;
                        while (k.f2933 < k.f2931) {
                            int i18 = k.f2933;
                            int i19 = k.f2931 - 1;
                            int i20 = k.f2933;
                            cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                            k.f2933 = i20 + 1;
                        }
                        return new String(cArr5);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                ai.m360(ai.this).onEvent(m405(null, null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, "\u0087\u0086\u0085\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081").intern());
                ai.this.m385(m405(null, null, 126 - Process.getGidForName(""), "\u0087\u0086\u0085\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081").intern(), new JSONObject());
                f256 = (f257 + 77) % 128;
            }
        });
        int i10 = f180 + 51;
        f181 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static JSONObject m353(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(m373((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1, "\ufff7�\ufffb\b\n", false, 5 - TextUtils.getOffsetBefore("", 0), 157 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), str);
            jSONObject2.put(m373(1 - Color.red(0), "\ufffb\ufff9\u0006\u0001\u0007", false, TextUtils.indexOf((CharSequence) "", '0', 0) + 6, Process.getGidForName("") + 160).intern(), str2);
            jSONObject2.put(m373(1 - TextUtils.lastIndexOf("", '0'), "\n��￼\u0007\ufffb", true, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5, 155 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), str3);
            if (!TextUtils.isEmpty(str4)) {
                int i10 = f180 + 59;
                f181 = i10 % 128;
                jSONObject2.put((i10 % 2 == 0 ? m368("ﳲᓹ蘌\udb48ࡵ︤", 2 >> Color.red(0)) : m368("ﳲᓹ蘌\udb48ࡵ︤", 5 - Color.red(0))).intern(), str4);
            }
            if (jSONObject != null) {
                f181 = (f180 + 69) % 128;
                kj.m2869(jSONObject2, jSONObject);
            }
            return jSONObject2;
        } catch (JSONException e10) {
            m.m2983(m373(Gravity.getAbsoluteGravity(0, 0) + 9, "\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb\u000b", false, TextUtils.lastIndexOf("", '0') + 10, 156 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), m368("ჴ滳㥟튝\uedf1妏抻\uf86fࡨ緃颻囥房ᰟ\uea4d\ue694䉵䄍Ɪ\uddde⾼争龦쮉ꃦ\ue875", 27 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), e10);
            return jSONObject2;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m385(String str, JSONObject jSONObject) {
        f180 = (f181 + 115) % 128;
        m370(str, jSONObject, null);
        int i10 = f181 + 19;
        f180 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m370(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        int i10 = f180 + 63;
        f181 = i10 % 128;
        int i11 = i10 % 2;
        m381(str, jSONObject, jSONObject2, null);
        if (i11 == 0) {
            int i12 = 63 / 0;
        }
        int i13 = f181 + 33;
        f180 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m374(jm jmVar) {
        String strM2674 = jmVar.m2674(m368("蘌\udb48Ꝉ蹧颻囥﵈䑢㺠剻霹Ꟍᵠ삎엻\u1cff", (ViewConfiguration.getTapTimeout() >> 16) + 16).intern());
        if (!TextUtils.isEmpty(strM2674)) {
            return strM2674;
        }
        f181 = (f180 + 49) % 128;
        String string = UUID.randomUUID().toString();
        jmVar.m2680(m368("蘌\udb48Ꝉ蹧颻囥﵈䑢㺠剻霹Ꟍᵠ삎엻\u1cff", ((byte) KeyEvent.getModifierMetaStateMask()) + 17).intern(), string);
        f180 = (f181 + 21) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m382() {
        p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.9

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f271 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f272 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static long f273 = -3574256835476527303L;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m408(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (i.f2435) {
                    try {
                        i.f2436 = i10;
                        char[] cArr2 = new char[cArr.length];
                        i.f2434 = 0;
                        while (true) {
                            int i11 = i.f2434;
                            if (i11 < cArr.length) {
                                cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f273);
                                i.f2434++;
                            } else {
                                str2 = new String(cArr2);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                ai.m360(ai.this).onEvent(m408("\ue74d쮆뻸愧呠݁\ueb90\udecf脲琊❎மﻹ", MotionEvent.axisFromString("") + 11472).intern());
                ai.this.m385(m408("\ue74d쮆뻸愧呠݁\ueb90\udecf脲琊❎மﻹ", 11471 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new JSONObject());
                f272 = (f271 + 77) % 128;
            }
        });
        f180 = (f181 + 95) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean m363(ag agVar) {
        boolean zMo496;
        int i10 = f181 + 123;
        f180 = i10 % 128;
        if (i10 % 2 != 0) {
            zMo496 = ar.m468().mo496(agVar.m315(), this.f185);
            int i11 = 93 / 0;
        } else {
            zMo496 = ar.m468().mo496(agVar.m315(), this.f185);
        }
        int i12 = f181 + 5;
        f180 = i12 % 128;
        if (i12 % 2 == 0) {
            return zMo496;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m371(boolean z10) {
        int i10 = f180;
        this.f195 = z10;
        f181 = (i10 + 33) % 128;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m361(List<ag> list, ji jiVar) {
        String strIntern;
        String str;
        JSONArray jSONArray = new JSONArray();
        f181 = (f180 + 89) % 128;
        for (ag agVar : list) {
            f180 = (f181 + 65) % 128;
            JSONObject jSONObjectM317 = agVar.m317();
            if (!jSONObjectM317.has(m368("ﯞ\u1289杴偫", (ViewConfiguration.getPressedStateDuration() >> 16) + 3).intern())) {
                int i10 = f180 + 125;
                f181 = i10 % 128;
                if (i10 % 2 == 0) {
                    try {
                        strIntern = m368("ﯞ\u1289杴偫", KeyEvent.keyCodeFromString("") * 2).intern();
                        str = is.f2604;
                    } catch (JSONException unused) {
                    }
                } else {
                    strIntern = m368("ﯞ\u1289杴偫", 3 - KeyEvent.keyCodeFromString("")).intern();
                    str = is.f2604;
                }
                jSONObjectM317.put(strIntern, jSONObjectM317.optLong(str));
            }
            if (this.f191.m302(jSONObjectM317)) {
                this.f201.m2649(agVar.m312(), (je) null);
                f180 = (f181 + 45) % 128;
            }
            jSONArray.put(jSONObjectM317);
        }
        this.f199.m325(jSONArray, this.f200.m2628().m2604(), new AnonymousClass5(jSONArray, list, jiVar));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m372(int i10) {
        if (i10 < m338().m461()) {
            return false;
        }
        int i11 = f181 + 19;
        f180 = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m368(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f182)) ^ ((c5 >>> 5) + f179)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f183) ^ ((c10 + i12) ^ ((c10 << 4) + f184))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m366(JSONObject jSONObject) {
        Iterator<String> it = m338().m462().iterator();
        f180 = (f181 + 61) % 128;
        while (it.hasNext()) {
            f181 = (f180 + 33) % 128;
            jSONObject.remove(it.next());
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m375(int i10) {
        this.f196.removeCallbacksAndMessages(null);
        this.f196.postDelayed(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.1

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f202 = 0;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f203 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static long f204 = -8717769940922722460L;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m388(String str, int i11) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2127) {
                    try {
                        char[] cArrM2229 = g.m2229(f204, cArr, i11);
                        g.f2129 = 4;
                        while (true) {
                            int i12 = g.f2129;
                            if (i12 < cArrM2229.length) {
                                int i13 = i12 - 4;
                                g.f2128 = i13;
                                cArrM2229[i12] = (char) (((long) (cArrM2229[i12] ^ cArrM2229[i12 % 4])) ^ (((long) i13) * f204));
                                g.f2129 = i12 + 1;
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

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v5, types: [int] */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                int i11 = f202 + 7;
                f203 = i11 % 128;
                try {
                    if (i11 % 2 == 0) {
                        ai.m346(ai.this);
                        int i12 = 8 / 0;
                    } else {
                        ai.m346(ai.this);
                    }
                    int i13 = f203 + 115;
                    f202 = i13 % 128;
                    this = i13 % 2;
                    if (this != 0) {
                        int i14 = 21 / 0;
                    }
                } catch (Throwable th2) {
                    m.m2977(m388("ᰔ\ud977᱕휎볪칽獵着䇽귷嬿ἵꝇ", Color.rgb(0, 0, 0) + 16777216).intern(), m388("ᚕ眍ᛐ耼䄭怛꺆ݮ䭷ϙగ\ue2f4귛ꗭ榽䀏โ䜹육ᾇ悰難╀ﴲ앥鱟苖墾➘㿩\ue077㛀順턱㷡", Process.myPid() >> 22).intern(), th2);
                    ai.m344(ai.this);
                }
            }
        }, i10);
        f180 = (f181 + InterfaceC0435l1.d.b.f29110g) % 128;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ai$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class AnonymousClass3 implements ji, jk.c {
        public AnonymousClass3() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ji
        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void mo399(jd jdVar) {
            ai.m344(ai.this);
            ai.m376(ai.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jk.c
        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void mo401(List<jn> list) {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        PriorityQueue priorityQueue = new PriorityQueue();
                        Iterator<jn> it = list.iterator();
                        while (it.hasNext()) {
                            priorityQueue.add(new ag(it.next()));
                        }
                        ArrayList arrayList = new ArrayList();
                        for (ag agVar = (ag) priorityQueue.poll(); agVar != null; agVar = (ag) priorityQueue.poll()) {
                            if (ai.m364(ai.this, agVar)) {
                                if (TextUtils.isEmpty(agVar.m313())) {
                                    agVar.m314(ai.m337(ai.this).m2776().m549());
                                }
                                arrayList.add(agVar);
                            } else {
                                ai.m341(ai.this).m2648(agVar.m312());
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        ai.m356(ai.this, arrayList, this);
                        return;
                    }
                } catch (Exception unused) {
                    ai.m344(ai.this);
                    return;
                }
            }
            ai.m344(ai.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ji
        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void mo400(jd jdVar, String str) {
            ai.m344(ai.this);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m377(JSONObject jSONObject, je jeVar) {
        m366(jSONObject);
        ag agVar = new ag(jk.m2638(jSONObject));
        agVar.m316(m338().m458());
        this.f201.m2649(agVar.m312(), jeVar);
        m358(agVar.m317());
        p.m2998(jeVar);
        f181 = (f180 + 123) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m381(String str, JSONObject jSONObject, JSONObject jSONObject2, final je jeVar) {
        String strIntern = m373(TextUtils.indexOf("", "", 0) + 9, "\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb\u000b", false, (ViewConfiguration.getFadingEdgeLength() >> 16) + 9, TextUtils.indexOf((CharSequence) "", '0', 0) + 156).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m368("\uf092䀂楅㏁颻囥㝃ﭻఇ脶䯛魮쀌藇房ᰟዚ\udcdfﶶ器귽䠬", 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
        sb2.append(str);
        sb2.append(m368("檸ᱴᜦ崳赏匟Ό쫵넁ᒋ\ud90a锬嬣₅嗩䨴ࢠ閆", View.MeasureSpec.makeMeasureSpec(0, 0) + 17).intern());
        m.m2973(strIntern, sb2.toString(), jSONObject);
        try {
            if (m338().m459().contains(str)) {
                String strIntern2 = m373((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8, "\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb\u000b", false, 9 - TextUtils.indexOf("", "", 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 155).intern();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m368("˒鯦闼툈䯛魮쀌藇嬣₅\udeb7꩐嚦뀠鬅岰闼툈릋盺䥾蟓唔쳙瓴\uf5d7ޕ妱ᆝ팊", 29 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
                sb3.append(str);
                sb3.append(m368("옻\ude88Ό쫵綑⮋掔瘁蓳눁앞犣\u244b孓䯛魮鄡쓙ﳲᓹ믭荚", 21 - ExpandableListView.getPackedPositionGroup(0L)).intern());
                m.m2963(strIntern2, sb3.toString());
                int i10 = f181 + 29;
                f180 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 77 / 0;
                    return;
                }
                return;
            }
            String strIntern3 = m373((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 9, "\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb\u000b", false, ExpandableListView.getPackedPositionGroup(0L) + 9, 154 - ImageFormat.getBitsPerPixel(0)).intern();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m368("\uf092䀂楅㏁颻囥㝃ﭻఇ脶䯛魮쀌藇房ᰟዚ\udcdfﶶ器檸ᱴᜦ崳赏匟ᇒ䲩\u2e60\u1fdc귽䠬", (ViewConfiguration.getJumpTapTimeout() >> 16) + 32).intern());
            sb4.append(str);
            m.m2963(strIntern3, sb4.toString());
            this.f199.m327(str, jSONObject, jSONObject2, this.f200.m2628().m2604(), new ah.d() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.7
                @Override // com.ironsource.adqualitysdk.sdk.i.ah.d
                public void onEventGenerated(JSONObject jSONObject3) {
                    ai.m365(ai.this).m302(jSONObject3);
                    ai.m357(ai.this, jSONObject3, new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.7.2

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static int f265 = 1;

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static char[] f266 = {'A', 30477, 61095, 26181, 56821, 21659, 52283, 17366, 47979, 'E', 30481, 61108, 26182, 56830, 21711, 52283, 17371, 47928, 12808, 43451, 8495, 39104, 4162, 34588, 65192, 30302, 60903, 25804, 56441, 21459, 52081, 17089, 47498, 12581, 43227, 8290, 38676, 3744, 34398, 65013, 29843};

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static long f267 = 6268091576278218595L;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f268;

                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            f268 = (f265 + 95) % 128;
                            ai.m376(ai.this);
                            je jeVar2 = jeVar;
                            if (jeVar2 != null) {
                                f268 = (f265 + 71) % 128;
                                try {
                                    jeVar2.mo254();
                                } catch (Exception e10) {
                                    kl.m2893(m406(Gravity.getAbsoluteGravity(0, 0) + 9, (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) View.resolveSizeAndState(0, 0, 0)).intern(), m406((Process.myPid() >> 22) + 32, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 8, (char) (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), e10, false, false, true);
                                }
                            }
                        }

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static String m406(int i12, int i13, char c4) {
                            String str2;
                            synchronized (c.f1153) {
                                try {
                                    char[] cArr = new char[i12];
                                    c.f1154 = 0;
                                    while (true) {
                                        int i14 = c.f1154;
                                        if (i14 < i12) {
                                            cArr[i14] = (char) ((((long) f266[i13 + i14]) ^ (((long) i14) * f267)) ^ ((long) c4));
                                            c.f1154 = i14 + 1;
                                        } else {
                                            str2 = new String(cArr);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return str2;
                        }
                    });
                }
            });
        } catch (Exception e10) {
            kl.m2893(m373(((Process.getThreadPriority(0) + 20) >> 6) + 9, "\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb\u000b", false, 9 - (KeyEvent.getMaxKeyCode() >> 16), 155 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), m373(10 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0013\uffc0\u000e\t\uffc0\u0012\u000f\u0012\u0012￥\u0014\u000e\u0005\u0016￥\u0004\u000e\u0005", true, 17 - ((byte) KeyEvent.getModifierMetaStateMask()), Drawable.resolveOpacity(0, 0) + 147).intern(), e10, false, false, true);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m373(int i10, String str, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (d.f1625) {
            try {
                char[] cArr2 = new char[i11];
                d.f1622 = 0;
                while (true) {
                    int i13 = d.f1622;
                    if (i13 >= i11) {
                        break;
                    }
                    d.f1624 = cArr[i13];
                    cArr2[d.f1622] = (char) (d.f1624 + i12);
                    int i14 = d.f1622;
                    cArr2[i14] = (char) (cArr2[i14] - f178);
                    d.f1622 = i14 + 1;
                }
                if (i10 > 0) {
                    d.f1623 = i10;
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr2, 0, cArr3, 0, i11);
                    int i15 = d.f1623;
                    System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                    int i16 = d.f1623;
                    System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    d.f1622 = 0;
                    while (true) {
                        int i17 = d.f1622;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i11 - i17) - 1];
                        d.f1622 = i17 + 1;
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
    private static int m352(jm jmVar) {
        f181 = (f180 + 85) % 128;
        String strM2674 = jmVar.m2674(m373(8 - TextUtils.indexOf("", ""), "\u0011ￋ\u0010\u0002\u0010\u0010￦\u0001\u0006\u000b", false, 10 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.getOffsetBefore("", 0) + 150).intern());
        int i10 = 1;
        if (!TextUtils.isEmpty(strM2674)) {
            i10 = 1 + Integer.parseInt(strM2674);
            f180 = (f181 + 15) % 128;
        }
        jmVar.m2680(m373(8 - (ViewConfiguration.getTapTimeout() >> 16), "\u0011ￋ\u0010\u0002\u0010\u0010￦\u0001\u0006\u000b", false, TextUtils.getTrimmedLength("") + 10, 151 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), String.valueOf(i10));
        return i10;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m359(boolean z10) {
        int i10 = f181;
        f180 = (i10 + 17) % 128;
        if (!z10) {
            this.f201.m2646(new jk.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.14
                @Override // com.ironsource.adqualitysdk.sdk.i.jk.b
                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                public final void mo398(int i11) {
                    ai.m355(ai.this, ai.m367(ai.this, i11) ? 0 : ai.m349(ai.this));
                }
            });
            return;
        }
        f180 = (i10 + 83) % 128;
        m336();
        f180 = (f181 + InterfaceC0435l1.d.b.f29110g) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m358(final JSONObject jSONObject) {
        final ArrayList arrayList;
        if (s.m3035().m3059()) {
            synchronized (this) {
                arrayList = new ArrayList(this.f193);
            }
            p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.2
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ae) it.next()).onEventReceived(jSONObject);
                    }
                }
            });
        }
    }
}

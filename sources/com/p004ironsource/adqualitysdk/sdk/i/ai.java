package com.p004ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import com.google.firebase.crashlytics.internal.model.a;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ai {

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    private static short[] f172 = null;

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    private static int f173 = 0;

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    private static byte[] f174 = {-67, 36, 47, -51, -9, -52, 45, 45, 34, -35, 38, -48, 39, -45, -39, -60, 8, -64, 63, -37, -12, 8, 36, -108, 105, -34, -110, 117, -40, 38, -37, -10, 7, -43, -43, -47, -48, -16, 48, 63, -39, 71, 115, -86, -32, 63, -28, -123, -89, -19, -126, -81, -17, 51, -26, 49, 72, 125, 39, 69, 48, 39, 58, -39, -115, 29, -22, 120, 53, 43, 69, 35, 35, 65, 25, -9, 36, -58, -49, 45, -41, 39, 22, -49, 26, 121, 90, -61, -113, 110, -55, 27, -56, -21, -109, -68, -100, -99, -105, -106, -56, -108, 13, -113, -111, -51, -97, -106, -55, -65, -105, -110, -66, 81, 1, -66, -65, -112, 86, -17, -67, -106, -117, -83, -93, 87, -5, -69, -105, -105, -58, -117, -94, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    private static int f175 = 150247227;

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    private static int f176 = 1;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static long f177 = -3754559011066112028L;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static int f178 = 10;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int f179 = -358631162;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private String f180;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private q f181;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Context f182;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private jm f183;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private ah f184;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private ir f185;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private boolean f187;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Handler f188;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private boolean f190;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ja f192;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ae f193;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f194;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private aj f195;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private iw f196;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private List<ag> f189 = new ArrayList();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private List<je.e> f191 = new ArrayList();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private Thread.UncaughtExceptionHandler f186 = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ai$4, reason: invalid class name */
    public class AnonymousClass4 implements ae.b {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        final /* synthetic */ List f213;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ iy f214;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ JSONArray f215;

        public AnonymousClass4(JSONArray jSONArray, List list, iy iyVar) {
            this.f215 = jSONArray;
            this.f213 = list;
            this.f214 = iyVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ae.b
        public void onEventGenerated(JSONObject jSONObject) {
            ai.m352(ai.this).m317(jSONObject);
            ai.m322(ai.this).m2472(ai.m331(ai.this).m403(ai.m330(ai.this)), jSONObject, new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.4.5

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static int f217 = 1;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static int f218 = 0;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static boolean f219 = true;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static boolean f220 = true;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static int f221 = 96;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static char[] f222 = {161, 206, 193, 204, 217, 212, 201, 195, 211, 167, 207, 128, 213, 197, 210, 208, 198, 196, 165, 214, 129, 179, 205, 200, 199, 215, 142, 154};

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static String m383(int i2, int[] iArr, String str, String str2) throws UnsupportedEncodingException {
                    Object bytes = str2;
                    if (str2 != null) {
                        bytes = str2.getBytes(CharEncoding.ISO_8859_1);
                    }
                    byte[] bArr = (byte[]) bytes;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (o.f2877) {
                        try {
                            char[] cArr2 = f222;
                            int i3 = f221;
                            if (f220) {
                                int length = bArr.length;
                                o.f2878 = length;
                                char[] cArr3 = new char[length];
                                o.f2879 = 0;
                                while (o.f2879 < o.f2878) {
                                    int i4 = o.f2879;
                                    int i5 = o.f2878 - 1;
                                    int i6 = o.f2879;
                                    cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                                    o.f2879 = i6 + 1;
                                }
                                return new String(cArr3);
                            }
                            if (f219) {
                                int length2 = cArr.length;
                                o.f2878 = length2;
                                char[] cArr4 = new char[length2];
                                o.f2879 = 0;
                                while (o.f2879 < o.f2878) {
                                    int i7 = o.f2879;
                                    int i8 = o.f2878 - 1;
                                    int i9 = o.f2879;
                                    cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                                    o.f2879 = i9 + 1;
                                }
                                return new String(cArr4);
                            }
                            int length3 = iArr.length;
                            o.f2878 = length3;
                            char[] cArr5 = new char[length3];
                            o.f2879 = 0;
                            while (o.f2879 < o.f2878) {
                                int i10 = o.f2879;
                                int i11 = o.f2878 - 1;
                                int i12 = o.f2879;
                                cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                                o.f2879 = i12 + 1;
                            }
                            return new String(cArr5);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }

                @Override // com.p004ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻛ */
                public final void mo381(final iu iuVar) {
                    final int iM2450 = iuVar.m2449().m2450();
                    final String strM2451 = iuVar.m2449().m2451();
                    if (iM2450 >= 200 && iM2450 <= 299) {
                        n.m2845(m383(126 - TextUtils.indexOf((CharSequence) "", '0'), null, null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m383(TextUtils.getOffsetBefore("", 0) + 127, null, null, "\u0095\u0086\u0082\u008e\u0094\u0093\u0092\u0082\u008e\u0089\u008c\u008f\u008b\u0091\u008c\u008e\u0089\u0082\u008b\u0090\u0089\u008e\u008f\u008c\u0089\u0089\u008e\u0088\u0088\u008d\u0089\u008c\u0083\u008c\u0086\u008b\u008a").intern(), AnonymousClass4.this.f215);
                        Iterator it = AnonymousClass4.this.f213.iterator();
                        while (it.hasNext()) {
                            ai.m323(ai.this).m2522(((af) it.next()).m299());
                        }
                        s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.4.5.1
                            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                AnonymousClass4.this.f214.mo381(iuVar);
                            }
                        });
                        return;
                    }
                    if (iM2450 == 403) {
                        synchronized (ai.this) {
                            try {
                                for (final je.e eVar : ai.m320(ai.this)) {
                                    s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.4.5.5
                                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                                        /* JADX INFO: renamed from: ﾒ */
                                        public final void mo276() {
                                            eVar.mo2570();
                                        }
                                    });
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        String strIntern = m383(Color.red(0) + 127, null, null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
                        StringBuilder sb = new StringBuilder();
                        sb.append(m383((ViewConfiguration.getTapTimeout() >> 16) + 127, null, null, "\u008c\u009c\u008e\u0089\u0082\u008b\u0090\u0089\u008e\u008f\u008c\u0086\u008b\u008a\u008c\u009b\u0086\u0082\u008e\u0094\u0093\u0092\u0082\u008e\u0089\u008c\u0098\u0086\u0087\u009a\u008c\u0099\u0082\u008b\u008f\u009a\u008c\u0086\u0082\u008e\u009a\u008c\u0099\u0082\u0087\u0098\u0086\u008e\u0097\u008b\u0096").intern());
                        sb.append(iM2450);
                        sb.append(m383((ViewConfiguration.getLongPressTimeout() >> 16) + 127, null, null, "\u008c").intern());
                        sb.append(strM2451);
                        n.m2844(strIntern, sb.toString());
                    }
                    s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.4.5.2

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static char f226 = 57418;

                        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                        private static int f227 = 0;

                        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                        private static int f228 = 0;

                        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                        private static int f229 = 1;

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static long f230;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static String m384(String str, String str2, char c2, String str3, int i2) {
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
                                    char[] cArr4 = (char[]) cArr.clone();
                                    char[] cArr5 = (char[]) cArr2.clone();
                                    cArr4[0] = (char) (c2 ^ cArr4[0]);
                                    cArr5[2] = (char) (cArr5[2] + ((char) i2));
                                    int length = cArr3.length;
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
                                            cArr6[i7] = (char) (((((long) (c4 ^ cArr3[i7])) ^ f230) ^ ((long) f227)) ^ ((long) f226));
                                            j.f2567 = i7 + 1;
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

                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            iy iyVar = AnonymousClass4.this.f214;
                            iu iuVar2 = iuVar;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m384("▊娘颵ꯗ❾\uf273䱔唏ﭭ樿愌\uf11a頻状鄦\ueca3化씃㢳猥㜁ᠪ䑀ꓹユ숢佪ᐬ慇\ue1a5艖㋵䵞屫庀쟺龺钸哋䡗\ue2dbꎟ짹딣弆ੋ䴊瞧㘦ʂ긥", "\u0000\u0000\u0000\u0000", (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), "椖\u0017钚綒", (-1711270039) - TextUtils.indexOf("", "", 0, 0)).intern());
                            sb2.append(iM2450);
                            sb2.append(m384("쉳", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 37577), "ࢼ阀쩽\uec92", 2106982408 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
                            sb2.append(strM2451);
                            iyVar.mo382(iuVar2, sb2.toString());
                            f229 = (f228 + 103) % 128;
                        }
                    });
                }

                @Override // com.p004ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻛ */
                public final void mo382(final iu iuVar, final String str) {
                    s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.4.5.4
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            AnonymousClass4.this.f214.mo382(iuVar, str);
                        }
                    });
                    int i2 = f218 + 105;
                    f217 = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 96 / 0;
                    }
                }
            });
        }
    }

    public ai(Context context, ao aoVar, aj ajVar, boolean z2, String str, q qVar) {
        this.f181 = qVar;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.2

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f207 = 0;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char[] f208 = {'A', 'n', 'a', 'l', 'y', 't', 'i', 'c', 's', 'U', AbstractJsonLexerKt.UNICODE_ESC, 'g', 'h', ' ', 'e', 'x', 'p', 'o', 'T', 'r', 'b', 'k', 'B', 'C', 'D'};

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f209 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char f210 = 5;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m379(byte b2, int i2, String str2) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (i.f2343) {
                    try {
                        char[] cArr2 = f208;
                        char c2 = f210;
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
                        str3 = new String(cArr3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str3;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                f209 = (f207 + 21) % 128;
                kb.m2748(m379((byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 67), 10 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b¶").intern(), m379((byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3), KeyEvent.keyCodeFromString("") + 18, "\u0006\u0004\f\u0007\u000b\f\n\u0007\u000e\n\u0011\u0005\u000b\u0013\u0006\u0007\u0010\u0002").intern(), m379((byte) (TextUtils.getCapsMode("", 0, 0) + 80), (ViewConfiguration.getScrollBarSize() >> 8) + 9, "\u0013\u000f\u0007\f\n\u0018\u0007\f»").intern(), th);
                ai.this.m368();
                ai.m358(ai.this).uncaughtException(thread, th);
                f207 = (f209 + 51) % 128;
            }
        });
        this.f195 = ajVar;
        this.f182 = context;
        je jeVar = new je(context, m343("鞐\udf37ۇ乤딅ﲣ⑃毠튇ᩣ䇅襹\uf046➭潈횥ᶕ䔻賗\uf47b㬉报\uaa5bᇰ墏", 18593 - (Process.myTid() >> 22)).intern(), m343("鞗屖1\uf41e룼泔僧Ҝ쥩뵂愴嗾\u19cc췰뇆晶⩚Ḩ숂뛺竔⺬፹음", (ViewConfiguration.getScrollBarSize() >> 8) + 52189).intern());
        this.f192 = new ja(m344((ViewConfiguration.getWindowTouchSlop() >> 8) + 358631162, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 150247156, (short) (ImageFormat.getBitsPerPixel(0) + 15), (-2) - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (52 - TextUtils.getOffsetBefore("", 0))).intern(), m343("鞁鉛鰓蛑肴謧", 1481 - TextUtils.getOffsetBefore("", 0)).intern(), jeVar);
        int iM351 = m351(jeVar);
        this.f193 = new ae(context, aoVar, iM351, m345(jeVar), as.m467().mo472());
        this.f196 = new iw(context);
        this.f194 = false;
        HandlerThread handlerThread = new HandlerThread(m343("鞧깘\ue43d㨛烵뛥첸ʀ奯齄픵\uebe8⇗枯", 14813 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
        handlerThread.start();
        this.f188 = new Handler(handlerThread.getLooper());
        this.f184 = new ah(iM351);
        this.f187 = !z2;
        this.f180 = str;
        m360(true);
        m334();
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static /* synthetic */ List m320(ai aiVar) {
        int i2 = (f173 + 39) % 128;
        f176 = i2;
        List<je.e> list = aiVar.f191;
        f173 = (i2 + 103) % 128;
        return list;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private String m321() {
        f173 = (f176 + 57) % 128;
        if (!as.m467().mo483()) {
            return m326().m461();
        }
        String strM459 = m326().m459();
        int i2 = f173 + 75;
        f176 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return strM459;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static /* synthetic */ iw m322(ai aiVar) {
        int i2 = (f173 + 63) % 128;
        f176 = i2;
        iw iwVar = aiVar.f196;
        int i3 = i2 + 83;
        f173 = i3 % 128;
        if (i3 % 2 == 0) {
            return iwVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static /* synthetic */ ja m323(ai aiVar) {
        int i2 = f173;
        f176 = (i2 + 65) % 128;
        ja jaVar = aiVar.f192;
        f176 = (i2 + 73) % 128;
        return jaVar;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static /* synthetic */ ae m325(ai aiVar) {
        int i2 = (f173 + 29) % 128;
        f176 = i2;
        ae aeVar = aiVar.f193;
        int i3 = i2 + 29;
        f173 = i3 % 128;
        if (i3 % 2 == 0) {
            return aeVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static /* synthetic */ int m327(ai aiVar) {
        int i2 = f173 + 33;
        f176 = i2 % 128;
        if (i2 % 2 == 0) {
            aiVar.m329();
            throw null;
        }
        int iM329 = aiVar.m329();
        int i3 = f176 + 1;
        f173 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 92 / 0;
        }
        return iM329;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ String m330(ai aiVar) {
        int i2 = f176 + 41;
        f173 = i2 % 128;
        if (i2 % 2 != 0) {
            aiVar.m321();
            throw null;
        }
        String strM321 = aiVar.m321();
        f173 = (f176 + 5) % 128;
        return strM321;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static /* synthetic */ aj m331(ai aiVar) {
        int i2 = f176;
        f173 = (i2 + 59) % 128;
        aj ajVar = aiVar.f195;
        int i3 = i2 + 23;
        f173 = i3 % 128;
        if (i3 % 2 == 0) {
            return ajVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ Handler m333(ai aiVar) {
        int i2 = f176;
        f173 = (i2 + 63) % 128;
        Handler handler = aiVar.f188;
        f173 = (i2 + 71) % 128;
        return handler;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ void m336(ai aiVar) {
        int i2 = f176 + 67;
        f173 = i2 % 128;
        int i3 = i2 % 2;
        aiVar.m337();
        if (i3 != 0) {
            throw null;
        }
        f173 = (f176 + 119) % 128;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ void m338(ai aiVar) {
        int i2 = f173 + 35;
        f176 = i2 % 128;
        if (i2 % 2 == 0) {
            aiVar.m350(false);
        } else {
            aiVar.m350(true);
        }
        int i3 = f176 + 11;
        f173 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 81 / 0;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ void m340(ai aiVar) {
        int i2 = f173 + 91;
        f176 = i2 % 128;
        int i3 = i2 % 2;
        aiVar.m324();
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ void m341(ai aiVar) {
        int i2 = f176 + 7;
        f173 = i2 % 128;
        int i3 = i2 % 2;
        aiVar.m356(false);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ q m342(ai aiVar) {
        int i2 = f173 + 119;
        f176 = i2 % 128;
        int i3 = i2 % 2;
        q qVar = aiVar.f181;
        if (i3 != 0) {
            return qVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m346(ai aiVar) {
        f176 = (f173 + 17) % 128;
        aiVar.m335();
        f176 = (f173 + 61) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ ah m352(ai aiVar) {
        int i2 = f173;
        f176 = (i2 + 79) % 128;
        ah ahVar = aiVar.f184;
        int i3 = i2 + 55;
        f176 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 33 / 0;
        }
        return ahVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Thread.UncaughtExceptionHandler m358(ai aiVar) {
        int i2 = f176 + 61;
        int i3 = i2 % 128;
        f173 = i3;
        int i4 = i2 % 2;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = aiVar.f186;
        if (i4 != 0) {
            int i5 = 92 / 0;
        }
        f176 = (i3 + 3) % 128;
        return uncaughtExceptionHandler;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m361(ai aiVar) {
        f173 = (f176 + 89) % 128;
        aiVar.m360(false);
        f176 = (f173 + 17) % 128;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ai$3, reason: invalid class name */
    public class AnonymousClass3 implements iy, ja.d {
        public AnonymousClass3() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ja.d
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void mo380(List<jd> list) {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        PriorityQueue priorityQueue = new PriorityQueue();
                        Iterator<jd> it = list.iterator();
                        while (it.hasNext()) {
                            priorityQueue.add(new af(it.next()));
                        }
                        ArrayList arrayList = new ArrayList();
                        for (af afVar = (af) priorityQueue.poll(); afVar != null; afVar = (af) priorityQueue.poll()) {
                            if (ai.m365(ai.this, afVar)) {
                                if (TextUtils.isEmpty(afVar.m302())) {
                                    afVar.m301(ai.m325(ai.this).m2652().m440());
                                }
                                arrayList.add(afVar);
                            } else {
                                ai.m323(ai.this).m2522(afVar.m299());
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        ai.m347(ai.this, arrayList, this);
                        return;
                    }
                } catch (Exception unused) {
                    ai.m341(ai.this);
                    return;
                }
            }
            ai.m341(ai.this);
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.iy
        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void mo381(iu iuVar) {
            ai.m341(ai.this);
            ai.m361(ai.this);
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.iy
        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void mo382(iu iuVar, String str) {
            ai.m341(ai.this);
        }
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized void m324() {
        try {
            if (m328()) {
                f176 = (f173 + 109) % 128;
                if (!TextUtils.isEmpty(this.f193.m2652().m440()) && !m332()) {
                    m356(true);
                    n.m2844(m343("鞥\udc27ß璏뤩\uedf1冃蘼쫿", 19374 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), m344(358631271 - (ViewConfiguration.getDoubleTapTimeout() >> 16), View.resolveSize(0, 0) - 150247144, (short) ((-41) - (ViewConfiguration.getEdgeSlop() >> 16)), 15 - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (107 - Color.argb(0, 0, 0, 0))).intern());
                    this.f192.m2519(m326().m466(), new AnonymousClass3());
                    f173 = (f176 + 5) % 128;
                }
            }
            f176 = (f173 + 21) % 128;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private synchronized ar m326() {
        int i2 = f173 + 31;
        f176 = i2 % 128;
        if (i2 % 2 == 0) {
            as.m467().mo481();
            throw null;
        }
        return as.m467().mo481();
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private synchronized boolean m328() {
        boolean z2;
        try {
            int i2 = f173 + 99;
            int i3 = i2 % 128;
            f176 = i3;
            if (i2 % 2 == 0) {
                z2 = this.f194;
                int i4 = 41 / 0;
            } else {
                z2 = this.f194;
            }
            f173 = (i3 + 83) % 128;
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private int m329() {
        int i2 = f173 + 55;
        f176 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
            if (m326() == null) {
                return 100;
            }
        } else if (m326() == null) {
            return 100;
        }
        if (as.m467().mo483()) {
            return 100;
        }
        int i4 = f176 + 107;
        f173 = i4 % 128;
        if (i4 % 2 == 0) {
            return m326().m465();
        }
        m326().m465();
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private synchronized boolean m332() {
        int i2 = f173 + 15;
        f176 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        return this.f190;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m334() {
        this.f185 = new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.10
            @Override // com.p004ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo376() {
                ai.m346(ai.this);
            }
        };
        this.f196.m2471().m2503(this.f185);
        this.f183 = new jm(new jo() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.7

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f247 = 0;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static long f248 = 799436707019204526L;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f249 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public static /* synthetic */ JSONObject m388(Activity activity) {
                int i2 = f249 + 23;
                f247 = i2 % 128;
                if (i2 % 2 == 0) {
                    return m389(activity);
                }
                m389(activity);
                throw null;
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static JSONObject m389(Activity activity) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(m387("\ue5d9\ue5b8彋屖\uf886덹\u137e笀뺍ﴏ䐽", (-1) - ImageFormat.getBitsPerPixel(0)).intern(), activity.getClass().getName());
                    f249 = (f247 + 111) % 128;
                    return jSONObject;
                } catch (JSONException unused) {
                    n.m2835(m387("韵鞴ȣ蕋ꗣࢄ쩶ऴ\ue3f1␋橃￢꫶", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), m387("鱁鰄䫺忍\ued26獫უʋꭠﺖᆨ萎ꅕࡑ鱁뀓䁉溑㬄坈\ue6c8쿞\udab6\uf590薠ⱀ硹铍⑼늽", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1).intern());
                    return jSONObject;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.jo
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo390(final Activity activity) {
                s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.7.4

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static char f256 = 40980;

                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                    private static int f257 = 1;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f258 = 0;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static char f259 = 2472;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static char f260 = 23007;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static char f261 = 62074;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static String m393(String str, int i2) {
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
                                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f261)) ^ ((c3 >>> 5) + f256)));
                                            cArr3[1] = c4;
                                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f259) ^ ((c4 + i4) ^ ((c4 << 4) + f260))));
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

                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        f258 = (f257 + 95) % 128;
                        ai.m342(ai.this).onEvent(m393("১⤆\ue650췧澙鳛ᝦ涗\ua6fa\udadc", 10 - View.resolveSize(0, 0)).intern());
                        ai.this.m374(m393("১⤆\ue650췧澙鳛ᝦ涗\ua6fa\udadc", TextUtils.getTrimmedLength("") + 10).intern(), AnonymousClass7.m388(activity));
                        int i2 = f257 + 43;
                        f258 = i2 % 128;
                        if (i2 % 2 != 0) {
                            throw null;
                        }
                    }
                });
                f249 = (f247 + 29) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.jo
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo391(final Activity activity) {
                s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.7.1

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static int f251 = 0;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f252 = 1;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static int f253 = 138;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static String m392(String str, boolean z2, int i2, int i3, int i4) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (b.f672) {
                            try {
                                char[] cArr2 = new char[i2];
                                b.f673 = 0;
                                while (true) {
                                    int i5 = b.f673;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    b.f671 = cArr[i5];
                                    cArr2[b.f673] = (char) (b.f671 + i3);
                                    int i6 = b.f673;
                                    cArr2[i6] = (char) (cArr2[i6] - f253);
                                    b.f673 = i6 + 1;
                                }
                                if (i4 > 0) {
                                    b.f674 = i4;
                                    char[] cArr3 = new char[i2];
                                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                                    int i7 = b.f674;
                                    System.arraycopy(cArr3, 0, cArr2, i2 - i7, i7);
                                    int i8 = b.f674;
                                    System.arraycopy(cArr3, i8, cArr2, 0, i2 - i8);
                                }
                                if (z2) {
                                    char[] cArr4 = new char[i2];
                                    b.f673 = 0;
                                    while (true) {
                                        int i9 = b.f673;
                                        if (i9 >= i2) {
                                            break;
                                        }
                                        cArr4[i9] = cArr2[(i2 - i9) - 1];
                                        b.f673 = i9 + 1;
                                    }
                                    cArr2 = cArr4;
                                }
                                str2 = new String(cArr2);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return str2;
                    }

                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        f252 = (f251 + 79) % 128;
                        ai.m342(ai.this).onEvent(m392("\b\ufff4\u0007\ufffa\b\t\u0004\u0007\ufffa\ufff9\ufffb\u0004\ufff8\n", false, 14 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 244, View.resolveSize(0, 0) + 10).intern());
                        ai.this.m374(m392("\b\ufff4\u0007\ufffa\b\t\u0004\u0007\ufffa\ufff9\ufffb\u0004\ufff8\n", false, 14 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 245, TextUtils.getOffsetAfter("", 0) + 10).intern(), AnonymousClass7.m388(activity));
                        f251 = (f252 + 21) % 128;
                    }
                });
                f249 = (f247 + 63) % 128;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m387(String str, int i2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (f.f1955) {
                    try {
                        char[] cArrM2116 = f.m2116(f248, cArr, i2);
                        f.f1954 = 4;
                        while (true) {
                            int i3 = f.f1954;
                            if (i3 < cArrM2116.length) {
                                int i4 = i3 - 4;
                                f.f1953 = i4;
                                cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f248));
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
        });
        ji.m2594().m2597(new jf() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.8
            @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, com.p004ironsource.adqualitysdk.sdk.i.jh
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo394(Activity activity) {
                ai.m336(ai.this);
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, com.p004ironsource.adqualitysdk.sdk.i.jh
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo395(Activity activity) {
                ai.this.m368();
            }
        });
        as.m467().mo495(new at() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.14
            @Override // com.p004ironsource.adqualitysdk.sdk.i.at
            /* JADX INFO: renamed from: ﾒ */
            public final void mo319() {
                ai.m338(ai.this);
            }
        });
        int i2 = f176 + 105;
        f173 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m335() {
        int i2 = f176 + 43;
        f173 = i2 % 128;
        m360(i2 % 2 != 0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m337() {
        int i2 = f173 + 75;
        f176 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
            if (this.f187) {
                m373();
                f173 = (f176 + 97) % 128;
            }
        } else if (this.f187) {
            m373();
            f173 = (f176 + 97) % 128;
        }
        this.f187 = false;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m339() {
        f176 = (f173 + 27) % 128;
        if (this.f185 != null) {
            this.f196.m2471().m2506(this.f185);
        }
        this.f183.m2631();
        this.f183 = null;
        f176 = (f173 + 79) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m347(ai aiVar, List list, iy iyVar) {
        int i2 = f176 + 105;
        f173 = i2 % 128;
        int i3 = i2 % 2;
        aiVar.m362((List<af>) list, iyVar);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m354(ai aiVar, JSONObject jSONObject, it itVar) {
        int i2 = f173 + 17;
        f176 = i2 % 128;
        int i3 = i2 % 2;
        aiVar.m349(jSONObject, itVar);
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        f173 = (f176 + 17) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m365(ai aiVar, af afVar) {
        f176 = (f173 + 23) % 128;
        boolean zM364 = aiVar.m364(afVar);
        f176 = (f173 + 71) % 128;
        return zM364;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String m366() {
        String strM345 = m345(new je(this.f182, m343("鞐\udf37ۇ乤딅ﲣ⑃毠튇ᩣ䇅襹\uf046➭潈횥ᶕ䔻賗\uf47b㬉报\uaa5bᇰ墏", 18592 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), m343("鞗屖1\uf41e룼泔僧Ҝ쥩뵂愴嗾\u19cc췰뇆晶⩚Ḩ숂뛺竔⺬፹음", 52189 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()));
        f176 = (f173 + 119) % 128;
        return strM345;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m367() {
        synchronized (this) {
            try {
                Handler handler = this.f188;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                m360(true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m373() {
        s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.6

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int[] f243 = {1474598743, 1914610265, 1634236885, 1574818424, 947208223, -2080604357, 1174119990, 1367281495, -641165346, 157301556, -1596801094, 101247352, -1717506258, 1114522566, -839232188, -1927796726, -473849871, -272674303};

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f244 = 0;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f245 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m386(int[] iArr, int i2) {
                String str;
                synchronized (d.f1586) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f243.clone();
                        d.f1584 = 0;
                        while (true) {
                            int i3 = d.f1584;
                            if (i3 < iArr.length) {
                                int i4 = iArr[i3];
                                char c2 = (char) (i4 >> 16);
                                cArr[0] = c2;
                                char c3 = (char) i4;
                                cArr[1] = c3;
                                char c4 = (char) (iArr[i3 + 1] >> 16);
                                cArr[2] = c4;
                                char c5 = (char) iArr[i3 + 1];
                                cArr[3] = c5;
                                d.f1587 = (c2 << 16) + c3;
                                d.f1585 = (c4 << 16) + c5;
                                d.m1788(iArr2);
                                for (int i5 = 0; i5 < 16; i5++) {
                                    int i6 = d.f1587 ^ iArr2[i5];
                                    d.f1587 = i6;
                                    int iM1787 = d.m1787(i6) ^ d.f1585;
                                    int i7 = d.f1587;
                                    d.f1587 = iM1787;
                                    d.f1585 = i7;
                                }
                                int i8 = d.f1587;
                                int i9 = d.f1585;
                                d.f1587 = i9;
                                d.f1585 = i8;
                                int i10 = i8 ^ iArr2[16];
                                d.f1585 = i10;
                                int i11 = i9 ^ iArr2[17];
                                d.f1587 = i11;
                                cArr[0] = (char) (i11 >>> 16);
                                cArr[1] = (char) i11;
                                cArr[2] = (char) (i10 >>> 16);
                                cArr[3] = (char) i10;
                                d.m1788(iArr2);
                                int i12 = d.f1584;
                                cArr2[i12 << 1] = cArr[0];
                                cArr2[(i12 << 1) + 1] = cArr[1];
                                cArr2[(i12 << 1) + 2] = cArr[2];
                                cArr2[(i12 << 1) + 3] = cArr[3];
                                d.f1584 = i12 + 2;
                            } else {
                                str = new String(cArr2, 0, i2);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                ai.m342(ai.this).onEvent(m386(new int[]{-1125590518, 1805723236, 460382547, 1536734548, -769832624, 1604549817, 778288372, 1590502897}, 13 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
                ai.this.m374(m386(new int[]{-1125590518, 1805723236, 460382547, 1536734548, -769832624, 1604549817, 778288372, 1590502897}, Color.red(0) + 13).intern(), new JSONObject());
                f244 = (f245 + 65) % 128;
            }
        });
        f176 = (f173 + 5) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m350(boolean z2) {
        try {
            int i2 = f176 + 19;
            f173 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f194 = true;
                m360(false);
            } else {
                this.f194 = true;
                m360(true);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m357(ai aiVar, int i2) {
        f176 = (f173 + 9) % 128;
        boolean zM363 = aiVar.m363(i2);
        f176 = (f173 + 1) % 128;
        return zM363;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m374(String str, JSONObject jSONObject) {
        int i2 = f176 + 101;
        f173 = i2 % 128;
        int i3 = i2 % 2;
        m348(str, jSONObject, (JSONObject) null);
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m375() {
        s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.5

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f239 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f240 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f241 = -452148896423034100L;

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                ai.m342(ai.this).onEvent(m385("瞑ᮗ知\ud8eb졐燐丗낹範퓘婫곥澔삕噌", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1).intern());
                ai.this.m374(m385("瞑ᮗ知\ud8eb졐燐丗낹範퓘婫곥澔삕噌", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), new JSONObject());
                f239 = (f240 + 85) % 128;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m385(String str, int i2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (f.f1955) {
                    try {
                        char[] cArrM2116 = f.m2116(f241, cArr, i2);
                        f.f1954 = 4;
                        while (true) {
                            int i3 = f.f1954;
                            if (i3 < cArrM2116.length) {
                                int i4 = i3 - 4;
                                f.f1953 = i4;
                                cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f241));
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
        });
        f176 = (f173 + 67) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m360(final boolean z2) {
        this.f192.m2520(new ja.e() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.13
            @Override // com.ironsource.adqualitysdk.sdk.i.ja.e
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo377(int i2) {
                ai.m333(ai.this).removeCallbacksAndMessages(null);
                ai.m333(ai.this).postDelayed(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.13.3

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static int f202 = 0;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static long f203 = 3457255484627974385L;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static int f204 = 1;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static String m378(String str, int i3) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (f.f1955) {
                            try {
                                char[] cArrM2116 = f.m2116(f203, cArr, i3);
                                f.f1954 = 4;
                                while (true) {
                                    int i4 = f.f1954;
                                    if (i4 < cArrM2116.length) {
                                        int i5 = i4 - 4;
                                        f.f1953 = i5;
                                        cArrM2116[i4] = (char) (((long) (cArrM2116[i4] ^ cArrM2116[i4 % 4])) ^ (((long) i5) * f203));
                                        f.f1954 = i4 + 1;
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

                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        int i3 = f204 + 93;
                        f202 = i3 % 128;
                        try {
                            if (i3 % 2 != 0) {
                                ai.m340(ai.this);
                                throw null;
                            }
                            ai.m340(ai.this);
                            f202 = (f204 + 33) % 128;
                        } catch (Throwable th) {
                            n.m2847(m378("혜홝뉬ゔ쫳섗⧟䍠㖡防ᓘ末ᇧ", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), m378("惴悱翴偍ݷꇝʀ格荂寢琈䱲꜒䝪ᣞサ쯟⍪㲖ᓩ\uef81༘⅛\ufb10ሀ\uecd4씙\udf48㘁죞\ue9c4쎊嫋둒趆", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1).intern(), th);
                            ai.m341(ai.this);
                        }
                    }
                }, (ai.m357(ai.this, i2) || z2) ? 0L : ai.m327(ai.this));
            }
        });
        f173 = (f176 + 71) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m363(int i2) {
        int i3 = f173 + 13;
        f176 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 87 / 0;
            if (i2 >= m326().m466()) {
                return true;
            }
        } else if (i2 >= m326().m466()) {
            return true;
        }
        f176 = (f173 + 119) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m371() {
        try {
            this.f194 = false;
            Handler handler = this.f188;
            if (handler != null) {
                int i2 = f173 + 31;
                f176 = i2 % 128;
                if (i2 % 2 == 0) {
                    handler.removeCallbacksAndMessages(null);
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                throw th;
            }
            this.f196.m2470();
            m339();
            int i3 = f176 + 51;
            f173 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 63 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m359(JSONObject jSONObject) {
        f176 = (f173 + 11) % 128;
        Iterator<String> it = m326().m463().iterator();
        while (it.hasNext()) {
            int i2 = f176 + 73;
            f173 = i2 % 128;
            if (i2 % 2 != 0) {
                jSONObject.remove(it.next());
                throw null;
            }
            jSONObject.remove(it.next());
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m364(af afVar) {
        f176 = (f173 + 85) % 128;
        boolean zMo491 = as.m467().mo491(afVar.m298(), this.f180);
        f173 = (f176 + 101) % 128;
        return zMo491;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d A[EXC_TOP_SPLITTER, PHI: r2 r6
  0x005d: PHI (r2v9 com.ironsource.adqualitysdk.sdk.i.af) = (r2v8 com.ironsource.adqualitysdk.sdk.i.af), (r2v13 com.ironsource.adqualitysdk.sdk.i.af) binds: [B:11:0x005b, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r6v1 org.json.JSONObject) = (r6v0 org.json.JSONObject), (r6v3 org.json.JSONObject) binds: [B:11:0x005b, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
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
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m362(List<af> list, iy iyVar) {
        af next;
        JSONObject jSONObjectM297;
        JSONArray jSONArray = new JSONArray();
        Iterator<af> it = list.iterator();
        while (it.hasNext()) {
            int i2 = f176 + 57;
            f173 = i2 % 128;
            if (i2 % 2 != 0) {
                next = it.next();
                jSONObjectM297 = next.m297();
                if (!jSONObjectM297.has(m343("鞀\ue321绵", 2082 >>> KeyEvent.getDeadChar(1, 1)).intern())) {
                    try {
                        jSONObjectM297.put(m343("鞀\ue321绵", View.combineMeasuredStates(0, 0) + 29873).intern(), jSONObjectM297.optLong(ik.f2465));
                    } catch (JSONException unused) {
                    }
                }
            } else {
                next = it.next();
                jSONObjectM297 = next.m297();
                if (!jSONObjectM297.has(m343("鞀\ue321绵", KeyEvent.getDeadChar(0, 0) + 29873).intern())) {
                    jSONObjectM297.put(m343("鞀\ue321绵", View.combineMeasuredStates(0, 0) + 29873).intern(), jSONObjectM297.optLong(ik.f2465));
                }
            }
            if (this.f184.m317(jSONObjectM297)) {
                f176 = (f173 + 7) % 128;
                this.f192.m2521(next.m299(), null);
            }
            jSONArray.put(jSONObjectM297);
        }
        this.f193.m286(jSONArray, this.f196.m2471().m2507(), new AnonymousClass4(jSONArray, list, iyVar));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m343(String str, int i2) {
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
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f177);
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
    public final synchronized void m369(ag agVar) {
        int i2 = f173 + 125;
        f176 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f189.add(agVar);
            throw null;
        }
        this.f189.add(agVar);
        f176 = (f173 + 35) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m368() {
        f176 = (f173 + 13) % 128;
        try {
            this.f187 = true;
            m375();
            m367();
            int i2 = f173 + 101;
            f176 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Exception e2) {
            kb.m2752(m343("鞥\udc27ß璏뤩\uedf1冃蘼쫿", 19373 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m344((ViewConfiguration.getKeyRepeatDelay() >> 16) + 358631169, View.MeasureSpec.makeMeasureSpec(0, 0) - 150247158, (short) ((-128) - (ViewConfiguration.getEdgeSlop() >> 16)), 15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (Gravity.getAbsoluteGravity(0, 0) + 91)).intern(), (Throwable) e2, false);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m372(je.e eVar) {
        f173 = (f176 + 75) % 128;
        this.f191.add(eVar);
        f173 = (f176 + 51) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static JSONObject m353(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(m343("鞁̣뻺⦚앗", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 38068).intern(), str);
            jSONObject2.put(m343("鞁㨷쳋齴ℇ", 44449 - TextUtils.indexOf("", "", 0, 0)).intern(), str2);
            jSONObject2.put(m343("鞁쇧㭥铘칄➴", 22129 - View.MeasureSpec.getSize(0)).intern(), str3);
            if (!TextUtils.isEmpty(str4)) {
                f173 = (f176 + 103) % 128;
                jSONObject2.put(m344((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 358631193, (-150247126) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) ((-106) - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.indexOf((CharSequence) "", '0') - 4, (byte) (105 - ExpandableListView.getPackedPositionChild(0L))).intern(), str4);
                f176 = (f173 + 77) % 128;
            }
            if (jSONObject != null) {
                f176 = (f173 + 45) % 128;
                kc.m2759(jSONObject2, jSONObject);
                f176 = (f173 + 103) % 128;
            }
        } catch (JSONException e2) {
            n.m2832(m343("鞥\udc27ß璏뤩\uedf1冃蘼쫿", (ViewConfiguration.getWindowTouchSlop() >> 8) + 19373).intern(), m343("鞡⛯\uf564菠割\ue099뽓䷏᱈\uaacc礰㞰왨钤⌈\uf181耛废\ued46뱲䫵\u197aퟱ晚㓛썐", 45433 - TextUtils.getOffsetBefore("", 0)).intern(), e2);
        }
        f176 = (f173 + 123) % 128;
        return jSONObject2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m348(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        f176 = (f173 + 89) % 128;
        m370(str, jSONObject, jSONObject2, null);
        f173 = (f176 + 117) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m370(String str, JSONObject jSONObject, JSONObject jSONObject2, final it itVar) {
        String strIntern = m343("鞥\udc27ß璏뤩\uedf1冃蘼쫿", 19373 - View.MeasureSpec.getMode(0)).intern();
        StringBuilder sb = new StringBuilder();
        sb.append(m344(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 358631199, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 150247144, (short) (ExpandableListView.getPackedPositionGroup(0L) + 112), 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) - 89)).intern());
        sb.append(str);
        sb.append(m343("韄\ueb46渧\ue1ef擘\ue7ed筿﹏焸\uf4eb矗쫣乱셛䐤쟰媎", ExpandableListView.getPackedPositionType(0L) + 31957).intern());
        n.m2845(strIntern, sb.toString(), jSONObject);
        try {
            if (m326().m462().contains(str)) {
                String strIntern2 = m343("鞥\udc27ß璏뤩\uedf1冃蘼쫿", 19373 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m343("鞪歠湆愅搻朖稈緭烕珉皭䧝䲅䁽䍛䙏夠屟引勼嗌⣋⯶⺗\u218d╺㡟㬗㹰", View.resolveSizeAndState(0, 0, 0) + 64747).intern());
                sb2.append(str);
                sb2.append(m344(358631219 - View.getDefaultSize(0, 0), (-150247196) - ((byte) KeyEvent.getModifierMetaStateMask()), (short) ((-49) - Color.red(0)), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((-6) - MotionEvent.axisFromString(""))).intern());
                n.m2844(strIntern2, sb2.toString());
                return;
            }
            String strIntern3 = m343("鞥\udc27ß璏뤩\uedf1冃蘼쫿", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19372).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m343("鞰⤛\uea87갪涾⽂\ue08aꉋ揣┱\ue615ꞎ礖㪩ﱲ뷂罂ボ\uf260돧瓀㘂\uf793褻䪴ఁ췘轚䃥ɸ썘蓗", 48781 - KeyEvent.keyCodeFromString("")).intern());
            sb3.append(str);
            n.m2844(strIntern3, sb3.toString());
            this.f193.m287(str, jSONObject, jSONObject2, this.f196.m2471().m2507(), new ae.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.9
                @Override // com.ironsource.adqualitysdk.sdk.i.ae.b
                public void onEventGenerated(JSONObject jSONObject3) {
                    ai.m352(ai.this).m317(jSONObject3);
                    ai.m354(ai.this, jSONObject3, new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.9.3

                        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                        private static int f267 = 1;

                        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                        private static int f268 = 0;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static boolean f269 = true;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static int f270 = 229;

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static char[] f271 = {294, 339, 326, 337, 350, 345, 334, 328, 344, 298, 343, 340, 261, 330, 329, 347, 287, 296, 338, 341};

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static boolean f272 = true;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static String m396(int i2, int[] iArr, String str2, String str3) throws UnsupportedEncodingException {
                            Object bytes = str3;
                            if (str3 != null) {
                                bytes = str3.getBytes(CharEncoding.ISO_8859_1);
                            }
                            byte[] bArr = (byte[]) bytes;
                            Object charArray = str2;
                            if (str2 != null) {
                                charArray = str2.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (o.f2877) {
                                try {
                                    char[] cArr2 = f271;
                                    int i3 = f270;
                                    if (f269) {
                                        int length = bArr.length;
                                        o.f2878 = length;
                                        char[] cArr3 = new char[length];
                                        o.f2879 = 0;
                                        while (o.f2879 < o.f2878) {
                                            int i4 = o.f2879;
                                            int i5 = o.f2878 - 1;
                                            int i6 = o.f2879;
                                            cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                                            o.f2879 = i6 + 1;
                                        }
                                        return new String(cArr3);
                                    }
                                    if (f272) {
                                        int length2 = cArr.length;
                                        o.f2878 = length2;
                                        char[] cArr4 = new char[length2];
                                        o.f2879 = 0;
                                        while (o.f2879 < o.f2878) {
                                            int i7 = o.f2879;
                                            int i8 = o.f2878 - 1;
                                            int i9 = o.f2879;
                                            cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                                            o.f2879 = i9 + 1;
                                        }
                                        return new String(cArr4);
                                    }
                                    int length3 = iArr.length;
                                    o.f2878 = length3;
                                    char[] cArr5 = new char[length3];
                                    o.f2879 = 0;
                                    while (o.f2879 < o.f2878) {
                                        int i10 = o.f2879;
                                        int i11 = o.f2878 - 1;
                                        int i12 = o.f2879;
                                        cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                                        o.f2879 = i12 + 1;
                                    }
                                    return new String(cArr5);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }

                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            ai.m361(ai.this);
                            it itVar2 = itVar;
                            if (itVar2 != null) {
                                int i2 = f268 + 13;
                                f267 = i2 % 128;
                                try {
                                    if (i2 % 2 != 0) {
                                        itVar2.mo276();
                                        return;
                                    } else {
                                        itVar2.mo276();
                                        int i3 = 57 / 0;
                                        return;
                                    }
                                } catch (Exception e2) {
                                    kb.m2755(m396(127 - (ViewConfiguration.getPressedStateDuration() >> 16), null, null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m396(127 - Gravity.getAbsoluteGravity(0, 0), null, null, "\u0082\u008c\u0087\u0086\u008e\u0084\u0094\u0093\u008c\u0092\u0082\u008c\u008d\u0091\u0086\u0082\u008e\u0090\u008a\u008f\u0082\u008e\u0089\u008d\u0082\u0087\u008d\u008b\u008c\u008b\u008b\u008a").intern(), e2, false, false, true);
                                }
                            }
                            f267 = (f268 + 19) % 128;
                        }
                    });
                }
            });
            int i2 = f173 + 59;
            f176 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Exception e2) {
            kb.m2755(m343("鞥\udc27ß璏뤩\uedf1冃蘼쫿", 19374 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), m344(358631239 - View.MeasureSpec.getMode(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 150247158, (short) (14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 8 - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((ViewConfiguration.getEdgeSlop() >> 16) - 43)).intern(), e2, false, false, true);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m345(je jeVar) {
        f173 = (f176 + 103) % 128;
        String strM2562 = jeVar.m2562(m344(358631257 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 150247112, (short) ((ViewConfiguration.getPressedStateDuration() >> 16) - 48), (ViewConfiguration.getScrollBarSize() >> 8) + 6, (byte) ((-105) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern());
        if (!TextUtils.isEmpty(strM2562)) {
            return strM2562;
        }
        f173 = (f176 + 53) % 128;
        String string = UUID.randomUUID().toString();
        jeVar.m2568(m344(358631255 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-150247112) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) ((-49) - TextUtils.lastIndexOf("", '0')), 6 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 104)).intern(), string);
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int m351(je jeVar) {
        String strM2562 = jeVar.m2562(m343("鞍ꤳ\ueae2⯡浳긜\uefc1ₘ扥ꌁ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16057).intern());
        int i2 = 1;
        if (!TextUtils.isEmpty(strM2562)) {
            int i3 = f173 + 107;
            f176 = i3 % 128;
            i2 = i3 % 2 == 0 ? Integer.parseInt(strM2562) : 1 + Integer.parseInt(strM2562);
        }
        jeVar.m2568(m343("鞍ꤳ\ueae2⯡浳긜\uefc1ₘ扥ꌁ", 16057 - TextUtils.getTrimmedLength("")).intern(), String.valueOf(i2));
        f173 = (f176 + 119) % 128;
        return i2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m349(JSONObject jSONObject, it itVar) {
        m359(jSONObject);
        af afVar = new af(ja.m2516(jSONObject));
        afVar.m300(m326().m464());
        this.f192.m2521(afVar.m299(), itVar);
        m355(afVar.m297());
        s.m2922(itVar);
        f173 = (f176 + 13) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m356(boolean z2) {
        int i2 = f176 + 31;
        f173 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f190 = z2;
            throw null;
        }
        this.f190 = z2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m355(final JSONObject jSONObject) {
        final ArrayList arrayList;
        if (r.m2874().m2907()) {
            synchronized (this) {
                arrayList = new ArrayList(this.f189);
            }
            s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ai.1
                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ag) it.next()).onEventReceived(jSONObject);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m344(int i2, int i3, short s, int i4, byte b2) {
        String string;
        synchronized (k.f2833) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = f178;
                int i6 = i4 + i5;
                int i7 = i6 == -1 ? 1 : 0;
                if (i7 != 0) {
                    byte[] bArr = f174;
                    if (bArr != null) {
                        i6 = (byte) (bArr[f179 + i2] + i5);
                    } else {
                        i6 = (short) (f172[f179 + i2] + i5);
                    }
                }
                if (i6 > 0) {
                    k.f2836 = ((i2 + i6) - 2) + f179 + i7;
                    k.f2834 = b2;
                    char c2 = (char) (i3 + f175);
                    k.f2837 = c2;
                    sb.append(c2);
                    k.f2835 = k.f2837;
                    k.f2838 = 1;
                    while (k.f2838 < i6) {
                        byte[] bArr2 = f174;
                        if (bArr2 != null) {
                            int i8 = k.f2836;
                            k.f2836 = i8 - 1;
                            k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                        } else {
                            short[] sArr = f172;
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

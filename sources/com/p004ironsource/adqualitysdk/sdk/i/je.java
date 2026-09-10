package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class je {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2645 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2646 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2647 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Handler f2648 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2649 = 29763;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2650;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private id f2651;

    public interface c {
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        void mo2569(String str);
    }

    public interface e {
        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        void mo2570();
    }

    public je(Context context, String str, String str2) {
        this.f2651 = new id(context, str, str2);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Handler m2554() {
        Handler handler;
        synchronized (je.class) {
            try {
                if (f2648 == null) {
                    HandlerThread handlerThread = new HandlerThread(m2556((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1071110201, (char) (21829 - (ViewConfiguration.getLongPressTimeout() >> 16)), "㫣ퟘ䔿払", "㖄\u008c※쬶\ue7beᙘ냢\ueb0fꅆ人麷嗋अ兩ｻ", "\u0000\u0000\u0000\u0000").intern());
                    handlerThread.start();
                    f2648 = new Handler(handlerThread.getLooper());
                }
                handler = f2648;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2557(String str) {
        String strC = a.C(android.support.v4.media.a.w(str), m2556(1271534036 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) View.MeasureSpec.makeMeasureSpec(0, 0), "풒쨑퉋榤", "茂홣㑕碋猛\uf04f⻯줌鳹\u05cf娋", "\u0000\u0000\u0000\u0000"));
        int i2 = f2646 + 53;
        f2645 = i2 % 128;
        if (i2 % 2 != 0) {
            return strC;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m2558(je jeVar, e eVar) {
        int i2 = f2646 + 115;
        f2645 = i2 % 128;
        int i3 = i2 % 2;
        jeVar.m2555(eVar);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2560(final String str, final String str2, final e eVar) {
        m2554().post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.je.4
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                je.this.m2561(str, str2);
                je.m2558(je.this, eVar);
            }
        });
        int i2 = f2645 + 119;
        f2646 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap<String, String> m2566(String str, int i2) {
        int i3 = f2646 + 55;
        f2645 = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f2651.m2401(str, i2);
        }
        this.f2651.m2401(str, i2);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2555(e eVar) {
        int i2 = f2646 + 63;
        f2645 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (eVar != null) {
            s.m2922(new it(eVar) { // from class: com.ironsource.adqualitysdk.sdk.i.je.3
                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                }
            });
        }
        int i3 = f2646 + 65;
        f2645 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 95 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2562(String str) {
        f2646 = (f2645 + 37) % 128;
        String strM2402 = this.f2651.m2402(str);
        f2646 = (f2645 + 57) % 128;
        return strM2402;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2567(String str) {
        int i2 = f2645 + 5;
        f2646 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f2651.m2400(str);
            throw null;
        }
        this.f2651.m2400(str);
        f2645 = (f2646 + 119) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2563(final String str, final c cVar) {
        m2554().post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.je.1
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                final String strM2562 = je.this.m2562(str);
                s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.je.1.1
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        cVar.mo2569(strM2562);
                    }
                });
            }
        });
        int i2 = f2646 + 95;
        f2645 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2568(String str, String str2) {
        int i2 = f2645 + 23;
        f2646 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f2651.m2403(str, str2);
        } else {
            this.f2651.m2403(str, str2);
            int i3 = 89 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2564(String str, String str2) {
        f2646 = (f2645 + 73) % 128;
        m2565(str, str2, null);
        f2645 = (f2646 + 47) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2565(final String str, final String str2, final e eVar) {
        m2554().post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.je.2
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                je.this.m2568(str, str2);
                je.m2558(je.this, eVar);
            }
        });
        int i2 = f2645 + 23;
        f2646 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m2559(String str) {
        f2646 = (f2645 + 7) % 128;
        int iM2399 = this.f2651.m2399(str);
        f2645 = (f2646 + 87) % 128;
        return iM2399;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2561(String str, String str2) {
        f2645 = (f2646 + 119) % 128;
        m2568(str, str2);
        m2568(m2557(str), Long.toString(ju.m2666()));
        int i2 = f2646 + 123;
        f2645 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 67 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2556(int i2, char c2, String str, String str2, String str3) {
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
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f2647) ^ ((long) f2650)) ^ ((long) f2649));
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

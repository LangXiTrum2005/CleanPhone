package com.ironsource.adqualitysdk.sdk.i;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ir {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2540 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f2541;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2542;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2543;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final String[] f2544;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2545;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final SQLiteDatabase f2546;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final d f2547;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2548 = 1;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2549 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f2550 = -1398363326624545998L;

        public d(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2548(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2127) {
                try {
                    char[] cArrM2229 = g.m2229(f2550, cArr, i10);
                    g.f2129 = 4;
                    while (true) {
                        int i11 = g.f2129;
                        if (i11 < cArrM2229.length) {
                            int i12 = i11 - 4;
                            g.f2128 = i12;
                            cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f2550));
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

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            f2549 = (f2548 + InterfaceC0435l1.d.b.f29110g) % 128;
            if (!sQLiteDatabase.isReadOnly()) {
                sQLiteDatabase.execSQL(m2548("\udd2d\udd7d䑭쁀܍䙥瑲붣톨\u0bd6卌ꉊ쓒ᣝ忑霽\ufb12ⶉ沣鯷\uee68㉆秹袋\ue28b", (-1) - TextUtils.lastIndexOf("", '0')).intern());
                f2548 = (f2549 + 95) % 128;
            }
            sQLiteDatabase.execSQL(m2548("噘嘛䛿䚮֟삏ᰝ헊嫄ी햢쨗侉᩿\ud916ｾ瀠⼼\uea54\uf3d3收モｾ\ue08b槵얽肫ᔰ᪼쥎閚ਰབ\uda0a餁㽧ぷ\uefffꩯ㏣┻\uf0a0뾻₣⧜薸䃂唯\udae0襥吀䩺콵騬夸纲\uf050꿮橧珺\ue484냽羌惺\ue98c䐵æ锖骀䤙ᑣ", View.getDefaultSize(0, 0)).intern());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            f2549 = (f2548 + 63) % 128;
        }
    }

    static {
        m2541();
        f2544 = new String[]{m2542((char) (54913 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "\u0000\u0000\u0000\u0000", "ᅘ胲脪賖", "\uf117欀噾", KeyEvent.getDeadChar(0, 0) + 713093649).intern(), m2542((char) (View.resolveSize(0, 0) + 10845), "\u0000\u0000\u0000\u0000", "짯\ue0a0巯砪", "ꗍ\uf08aﮁ", Drawable.resolveOpacity(0, 0) - 270491447).intern()};
        int i10 = f2540 + InterfaceC0435l1.d.b.f29110g;
        f2542 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public ir(Context context, String str) {
        d dVar = new d(context, str);
        this.f2547 = dVar;
        this.f2546 = dVar.getWritableDatabase();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2541() {
        f2543 = 0L;
        f2545 = 0;
        f2541 = (char) 15369;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2544(String str) {
        f2542 = (f2540 + 1) % 128;
        this.f2546.delete(m2542((char) (Process.myPid() >> 22), "\u0000\u0000\u0000\u0000", "ᱎ将\ue171誻", "몇䙸쫍ꓵ摦⡖œ춸", View.combineMeasuredStates(0, 0)).intern(), m2542((char) (48896 - (ViewConfiguration.getWindowTouchSlop() >> 8)), "\u0000\u0000\u0000\u0000", "색ܬÉ䖿", "쬫莢꒝軲헟", View.MeasureSpec.makeMeasureSpec(0, 0) - 922276672).intern(), new String[]{str});
        int i10 = f2542 + 17;
        f2540 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m2547(String str, String str2) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(m2542((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 10845), "\u0000\u0000\u0000\u0000", "짯\ue0a0巯砪", "ꗍ\uf08aﮁ", (-270491447) - ExpandableListView.getPackedPositionType(0L)).intern(), str2);
            if (this.f2546.update(m2542((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), "\u0000\u0000\u0000\u0000", "ᱎ将\ue171誻", "몇䙸쫍ꓵ摦⡖œ춸", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), contentValues, m2542((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "쥜懋䣆缸", "\ue03a\ueadc湀ꦊ鴗떀쀺", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 966669368).intern(), new String[]{str}) == 0) {
                f2540 = (f2542 + 29) % 128;
                contentValues.put(m2542((char) (54914 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "ᅘ胲脪賖", "\uf117欀噾", 713093649 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), str);
                this.f2546.replace(m2542((char) TextUtils.indexOf("", "", 0), "\u0000\u0000\u0000\u0000", "ᱎ将\ue171誻", "몇䙸쫍ꓵ摦⡖œ춸", ViewConfiguration.getScrollDefaultDelay() >> 16).intern(), null, contentValues);
            }
            int i10 = f2540 + 47;
            f2542 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 96 / 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized HashMap<String, String> m2543(String str, int i10) {
        String string;
        HashMap<String, String> map;
        Cursor cursor = null;
        try {
            try {
                String strReplace = str.replace('*', '%');
                String strIntern = m2542((char) (MotionEvent.axisFromString("") + 1), "\u0000\u0000\u0000\u0000", "湊一⎩벟", "郹異\uedab竾튑繫춝ە\ue429๘", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern();
                String[] strArr = {strReplace};
                if (i10 <= 0) {
                    int i11 = f2542 + 83;
                    f2540 = i11 % 128;
                    if (i11 % 2 == 0) {
                        throw null;
                    }
                    string = null;
                } else {
                    string = Integer.toString(i10);
                }
                Cursor cursorQuery = this.f2546.query(m2542((char) (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0000\u0000\u0000\u0000", "ᱎ将\ue171誻", "몇䙸쫍ꓵ摦⡖œ춸", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1).intern(), f2544, strIntern, strArr, null, null, null, string);
                try {
                    map = new HashMap<>();
                    while (cursorQuery != null) {
                        f2542 = (f2540 + 17) % 128;
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                        try {
                            map.put(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m2542((char) (54913 - View.resolveSize(0, 0)), "\u0000\u0000\u0000\u0000", "ᅘ胲脪賖", "\uf117欀噾", (ViewConfiguration.getTouchSlop() >> 8) + 713093649).intern())), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m2542((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10846), "\u0000\u0000\u0000\u0000", "짯\ue0a0巯砪", "ꗍ\uf08aﮁ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 270491448).intern())));
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    int i12 = f2542 + 15;
                    f2540 = i12 % 128;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized int m2545(String str) {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f2546.query(m2542((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0000\u0000\u0000\u0000", "ᱎ将\ue171誻", "몇䙸쫍ꓵ摦⡖œ춸", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1).intern(), new String[]{m2542((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", "⠘⥬鎑䍉", "̞⍫㜂\ue9a4︯탏ࡽ倓꛰溆", View.getDefaultSize(0, 0)).intern()}, m2542((char) TextUtils.getTrimmedLength(""), "\u0000\u0000\u0000\u0000", "湊一⎩벟", "郹異\uedab竾튑繫춝ە\ue429๘", ViewConfiguration.getScrollBarSize() >> 8).intern(), new String[]{str.replace('*', '%')}, null, null, null);
            if (cursorQuery != null) {
                f2542 = (f2540 + 99) % 128;
                try {
                    if (cursorQuery.moveToFirst()) {
                        int i10 = cursorQuery.getInt(0);
                        cursorQuery.close();
                        return i10;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                int i11 = f2540 + 85;
                f2542 = i11 % 128;
                if (i11 % 2 != 0) {
                    cursorQuery.close();
                    throw null;
                }
                cursorQuery.close();
            }
            return 0;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized String m2546(String str) {
        f2542 = (f2540 + 9) % 128;
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f2546.query(m2542((char) (ViewConfiguration.getScrollBarSize() >> 8), "\u0000\u0000\u0000\u0000", "ᱎ将\ue171誻", "몇䙸쫍ꓵ摦⡖œ춸", View.getDefaultSize(0, 0)).intern(), f2544, m2542((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", "쥜懋䣆缸", "\ue03a\ueadc湀ꦊ鴗떀쀺", Color.argb(0, 0, 0, 0) - 966669367).intern(), new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m2542((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 10845), "\u0000\u0000\u0000\u0000", "짯\ue0a0巯砪", "ꗍ\uf08aﮁ", (-270491447) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                f2542 = (f2540 + 107) % 128;
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2542(char c4, String str, String str2, String str3, int i10) {
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
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f2543) ^ ((long) f2545)) ^ ((long) f2541));
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
}

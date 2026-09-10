package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.dc;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ii {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2401 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2402 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2403;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static final String[] f2404;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2405;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final d f2406;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final SQLiteDatabase f2407;

    public static class d extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2408 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f2409 = {151, 301, 303, 299, 298, 301, 308, 288, 267, 275, 276, 278, 270, 265, 271, 268, 245, 264, 303, 309, 304, 20, '>', 'V', 'N', 'L', AbstractJsonLexerKt.COLON, 'F', 'f', 'k', 'K', '&', 'B', 'O', 'H', '5', '<', 'U', 'I', 'G', 'K', 'M', 'Q', '8', AbstractJsonLexerKt.COLON, 'V', 'N', 'L', AbstractJsonLexerKt.COLON, 'L', 'o', 'h', 'I', 'F', 'k', 'p', 'q', 's', 'i', 'j', 'p', 'E', '9', 'S', 'S', 'N', 'P', 'N', '2', AbstractJsonLexerKt.COLON, 'Q', 'N', '7', '3', 'G', '4', '2', 'H', 'G', 'A', 'J', AbstractJsonLexerKt.COLON, '2', 'L', 'J', 'C', 'K', 'J'};

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2410 = 1;

        public d(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2433(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
            String str2;
            Object bytes = str;
            if (str != null) {
                bytes = str.getBytes(CharEncoding.ISO_8859_1);
            }
            byte[] bArr = (byte[]) bytes;
            synchronized (h.f2186) {
                try {
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    char[] cArr = new char[i3];
                    System.arraycopy(f2409, i2, cArr, 0, i3);
                    if (bArr != null) {
                        char[] cArr2 = new char[i3];
                        h.f2185 = 0;
                        char c2 = 0;
                        while (true) {
                            int i6 = h.f2185;
                            if (i6 >= i3) {
                                break;
                            }
                            if (bArr[i6] == 1) {
                                cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                            } else {
                                cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                            }
                            c2 = cArr2[i6];
                            h.f2185 = i6 + 1;
                        }
                        cArr = cArr2;
                    }
                    if (i5 > 0) {
                        char[] cArr3 = new char[i3];
                        System.arraycopy(cArr, 0, cArr3, 0, i3);
                        int i7 = i3 - i5;
                        System.arraycopy(cArr3, 0, cArr, i7, i5);
                        System.arraycopy(cArr3, i5, cArr, 0, i7);
                    }
                    if (z2) {
                        char[] cArr4 = new char[i3];
                        h.f2185 = 0;
                        while (true) {
                            int i8 = h.f2185;
                            if (i8 >= i3) {
                                break;
                            }
                            cArr4[i8] = cArr[(i3 - i8) - 1];
                            h.f2185 = i8 + 1;
                        }
                        cArr = cArr4;
                    }
                    if (i4 > 0) {
                        h.f2185 = 0;
                        while (true) {
                            int i9 = h.f2185;
                            if (i9 >= i3) {
                                break;
                            }
                            cArr[i9] = (char) (cArr[i9] - iArr[2]);
                            h.f2185 = i9 + 1;
                        }
                    }
                    str2 = new String(cArr);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (!sQLiteDatabase.isReadOnly()) {
                int i2 = f2408 + 95;
                f2410 = i2 % 128;
                sQLiteDatabase.execSQL((i2 % 2 == 0 ? m2433(false, new int[]{0, 21, 197, 10}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001") : m2433(false, new int[]{0, 21, 197, 10}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001")).intern());
            }
            sQLiteDatabase.execSQL(m2433(true, new int[]{21, 67, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001").intern());
            int i3 = f2410 + 121;
            f2408 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            int i4 = f2410 + 123;
            f2408 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        m2426();
        f2404 = new String[]{m2427((byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 16), "\u0004\u0000\u0089", 3 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), m2427((byte) (61 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0001\u0002©", 3 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern()};
        int i2 = f2401 + 119;
        f2402 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public ii(Context context, String str) {
        d dVar = new d(context, str);
        this.f2406 = dVar;
        this.f2407 = dVar.getWritableDatabase();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2426() {
        f2405 = (char) 5;
        f2403 = new char[]{'v', 'a', 'l', 'k', 'e', 'y', ' ', dc.T, '?', '_', 's', 't', 'o', 'r', 'L', 'I', 'K', 'E', 'C', 'O', 'U', 'N', 'T', '(', ')'};
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2428(String str, String str2) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(m2427((byte) (60 - TextUtils.lastIndexOf("", '0', 0)), "\u0001\u0002©", View.getDefaultSize(0, 0) + 3).intern(), str2);
            if (this.f2407.update(m2427((byte) (33 - KeyEvent.keyCodeFromString("")), "\u0004\u0001\u0005\u000e\f\r\u000e\u0003", 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), contentValues, m2427((byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 110), "\u0004\u0000\u0006\u0007\b\u0007\u00ad", 7 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), new String[]{str}) == 0) {
                f2402 = (f2401 + 7) % 128;
                contentValues.put(m2427((byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 16), "\u0004\u0000\u0089", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4).intern(), str);
                this.f2407.replace(m2427((byte) ((Process.myPid() >> 22) + 33), "\u0004\u0001\u0005\u000e\f\r\u000e\u0003", View.MeasureSpec.getMode(0) + 8).intern(), null, contentValues);
            }
            int i2 = f2402 + 75;
            f2401 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 40 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized HashMap<String, String> m2431(String str, int i2) {
        String string;
        HashMap<String, String> map;
        Cursor cursorQuery = null;
        try {
            try {
                String strReplace = str.replace('*', '%');
                String strIntern = m2427((byte) (TextUtils.lastIndexOf("", '0') + 26), "\u0004\u0000\u0006\u0007\n\u0013\u0011\u0012\u0007\t", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9).intern();
                String[] strArr = {strReplace};
                if (i2 <= 0) {
                    int i3 = f2402 + 95;
                    f2401 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 5 / 0;
                    }
                    string = null;
                } else {
                    string = Integer.toString(i2);
                }
                cursorQuery = this.f2407.query(m2427((byte) (View.resolveSize(0, 0) + 33), "\u0004\u0001\u0005\u000e\f\r\u000e\u0003", 7 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), f2404, strIntern, strArr, null, null, null, string);
                map = new HashMap<>();
                while (cursorQuery != null && cursorQuery.moveToNext()) {
                    try {
                        map.put(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m2427((byte) (16 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0004\u0000\u0089", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3).intern())), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m2427((byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 61), "\u0001\u0002©", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3).intern())));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                f2402 = (f2401 + 31) % 128;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized String m2432(String str) {
        f2402 = (f2401 + 119) % 128;
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f2407.query(m2427((byte) (AndroidCharacter.getMirror('0') - 15), "\u0004\u0001\u0005\u000e\f\r\u000e\u0003", TextUtils.indexOf((CharSequence) "", '0') + 9).intern(), f2404, m2427((byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 110), "\u0004\u0000\u0006\u0007\b\u0007\u00ad", 8 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToNext()) {
                        int i2 = f2402 + 55;
                        f2401 = i2 % 128;
                        String string = cursorQuery.getString(i2 % 2 != 0 ? cursorQuery.getColumnIndexOrThrow(m2427((byte) ((ViewConfiguration.getDoubleTapTimeout() << 35) * 59), "\u0001\u0002©", 4 >> ExpandableListView.getPackedPositionType(1L)).intern()) : cursorQuery.getColumnIndexOrThrow(m2427((byte) (61 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "\u0001\u0002©", ExpandableListView.getPackedPositionType(0L) + 3).intern()));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m2429(String str) {
        f2402 = (f2401 + 73) % 128;
        this.f2407.delete(m2427((byte) (32 - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0004\u0001\u0005\u000e\f\r\u000e\u0003", Process.getGidForName("") + 9).intern(), m2427((byte) (82 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u0004\u0000\u0006\b\u0090", AndroidCharacter.getMirror('0') - '+').intern(), new String[]{str});
        int i2 = f2402 + 115;
        f2401 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2427(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f2403;
                char c2 = f2405;
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized int m2430(String str) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.f2407.query(m2427((byte) (33 - View.MeasureSpec.getSize(0)), "\u0004\u0001\u0005\u000e\f\r\u000e\u0003", 8 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), new String[]{m2427((byte) (70 - Color.green(0)), "\u0013\u000f\u0015\u0016\u0017\u0018\u0001\u0002\u0004\u0016", 10 - Color.argb(0, 0, 0, 0)).intern()}, m2427((byte) (TextUtils.indexOf("", "", 0) + 25), "\u0004\u0000\u0006\u0007\n\u0013\u0011\u0012\u0007\t", 10 - View.resolveSize(0, 0)).intern(), new String[]{str.replace('*', '%')}, null, null, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return 0;
            }
            f2402 = (f2401 + 21) % 128;
            int i2 = cursorQuery.getInt(0);
            f2402 = (f2401 + 21) % 128;
            cursorQuery.close();
            return i2;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
                throw th;
            }
            throw th;
        }
    }
}

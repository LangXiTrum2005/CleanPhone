package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.androidx.media3.common.StreamKey;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.v0.p;
import com.unity3d.mediation.LevelPlayAdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9w, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C9w implements InterfaceC2716nw {
    public static byte[] A05;
    public static String[] A06 = {"xDo36q5CJhNrWsOc4rgAzQVAx", "Zg", "PxE083d5zJ8aaIHABfFNAkkkdmyhAK0f", "IKBV5UeodpiHWCvQ4", "aq", "Dab1stL8zsyR1UyyOB", "bulzcqFjtxPyO4baGqsDfIFqn", "1F8Ca2LGZvQNSSWsKAWhpLL3JBdOfpqY"};
    public static final String A07;
    public static final String[] A08;
    public boolean A00;
    public final C5O A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1262Bk A01(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        C8 c8A02 = new C8((String) AbstractC10843y.A01(cursor.getString(0)), Uri.parse((String) AbstractC10843y.A01(cursor.getString(2)))).A01(cursor.getString(1)).A02(A09(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest downloadRequestA05 = c8A02.A04(blob).A00(cursor.getString(4)).A03(cursor.getBlob(5)).A05();
        C6 c6 = new C6();
        c6.A01 = cursor.getLong(13);
        c6.A00 = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        return new C1262Bk(downloadRequestA05, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i2 == 4 ? cursor.getInt(11) : 0, c6);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1262Bk A02(Cursor cursor) {
        DownloadRequest downloadRequestA05 = new C8((String) AbstractC10843y.A01(cursor.getString(0)), Uri.parse((String) AbstractC10843y.A01(cursor.getString(2)))).A01(A05(cursor.getString(1))).A02(A09(cursor.getString(3))).A00(cursor.getString(4)).A03(cursor.getBlob(5)).A05();
        C6 c6 = new C6();
        c6.A01 = cursor.getLong(13);
        c6.A00 = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        return new C1262Bk(downloadRequestA05, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i2 == 4 ? cursor.getInt(11) : 0, c6);
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A05 = new byte[]{51, 66, 35, 44, 38, 66, 77, 36, 35, 77, 69, 78, 15, 2, 70, 50, 35, 62, 50, 70, 54, 52, 47, 43, 39, 52, 63, 70, 45, 35, 63, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 11, 15, 11, 3, 57, 18, 31, 22, 3, 70, 50, 35, 62, 50, 74, 19, 20, 15, 70, 50, 35, 62, 50, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 21, 18, 20, 3, 7, 11, 57, 13, 3, 31, 21, 70, 50, 35, 62, 50, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 5, 19, 21, 18, 9, 11, 57, 5, 7, 5, 14, 3, 57, 13, 3, 31, 70, 50, 35, 62, 50, 74, 2, 7, 18, 7, 70, 36, 42, 41, 36, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 21, 18, 7, 18, 3, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 21, 18, 7, 20, 18, 57, 18, 15, 11, 3, 57, 11, 21, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 19, 22, 2, 7, 18, 3, 57, 18, 15, 11, 3, 57, 11, 21, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 5, 9, 8, 18, 3, 8, 18, 57, 10, 3, 8, 1, 18, 14, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 21, 18, 9, 22, 57, 20, 3, 7, 21, 9, 8, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 0, 7, 15, 10, 19, 20, 3, 57, 20, 3, 7, 21, 9, 8, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 22, 3, 20, 5, 3, 8, 18, 57, 2, 9, 17, 8, 10, 9, 7, 2, 3, 2, 70, 52, 35, 39, 42, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 4, 31, 18, 3, 21, 57, 2, 9, 17, 8, 10, 9, 7, 2, 3, 2, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 13, 3, 31, 57, 21, 3, 18, 57, 15, 2, 70, 36, 42, 41, 36, 70, 40, 41, 50, 70, 40, 51, 42, 42, 79, 25, 11, 118, 103, 112, 116, 97, 112, 21, 97, 116, 119, 121, 112, 21, 115, 101, 120, 103, 23, 99, 118, 117, 123, 114, 23, 126, 113, 23, 114, 111, 126, 100, 99, 100, 23, 49, 12, 27, 36, 24, 21, 13, 17, 6, 48, 27, 3, 26, 24, 27, 21, 16, 7, 106, 24, 50, 35, 35, 63, 58, 48, 50, 39, 58, 60, 61, 124, 55, 50, 32, 59, 120, 43, 62, 63, 121, 104, 104, 116, 113, 123, 121, 108, 113, 119, 118, 55, 110, 118, 124, 54, 117, 107, 53, 107, 107, 108, 106, 51, 96, 117, 116, 117, 100, 100, 120, 125, 119, 117, 96, 125, 123, 122, 59, 108, 57, 121, 100, 113, 115, 65, 70, 88, 70, 93, 80, 65, 87, 123, 64, 75, 83, 74, 72, 75, 69, 64, 65, 64, 70, 74, 75, 81, 64, 75, 81, 122, 73, 64, 75, 66, 81, 77, 115, 101, 99, 100, AbstractJsonLexerKt.TC_INVALID, 125, 79, 115, 113, 115, 120, 117, 79, 123, 117, 105, 20, 17, 3, 24, 121, 124, 105, 124, 102, 97, 105, 108, 117, 114, 101, 95, 114, 101, 97, 115, 111, 110, 52, 48, 47, 42, 39, 52, 57, 125, 96, 125, 98, 70, 72, 84, 114, 94, 72, 89, 114, 68, 73, 53, 49, 53, 61, 7, 44, 33, 40, 61, AbstractJsonLexerKt.TC_INVALID, 106, 125, 108, 106, 97, 123, 80, 107, 96, 120, 97, 99, 96, 110, 107, 106, 107, 119, 119, 22, 17, 4, 23, 17, 58, 17, 12, 8, 0, 58, 8, 22, 36, 35, 54, 37, 35, 8, 35, 62, 58, 50, 8, 58, 36, 119, 22, 4, 20, 109, 106, AbstractJsonLexerKt.TC_INVALID, 106, 123, 99, 100, 113, 100, 117, 48, 45, 48, 34, 51, 52, 47, 48, 31, 50, 37, 33, 51, 47, 46, 70, 65, 71, 80, 84, 88, 106, 94, 80, 76, 70, 79, 82, 79, 87, 94, 73, 76, 88, 93, 72, 89, 99, 72, 85, 81, 89, 99, 81, 79, 77, 74, 81, 38, 57, 52, 53, 63, AbstractJsonLexerKt.TC_INVALID, 40, 125, 37, 62, 59, 62, 63, 39, 62};
    }

    static {
        A0B();
        A07 = A07(3, 4);
        A08 = new String[]{A04(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, 2, 119), A04(LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, 9, 108), A04(739, 3, 12), A04(709, 11, 1), A04(566, 16, 36), A04(586, 4, 41), A04(684, 5, 42), A04(654, 13, 81), A04(725, 14, 8), A04(552, 14, 17), A04(698, 11, 116), A04(590, 14, 52), A04(634, 18, 59), A04(536, 16, 16), A04(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 10, 25)};
    }

    public C9w(C5O c5o) {
        this(c5o, A04(0, 0, 21));
    }

    public C9w(C5O c5o, String str) {
        this.A03 = str;
        this.A01 = c5o;
        this.A04 = A04(p.e.f39014a, 18, 64) + str;
        this.A02 = new Object();
    }

    private Cursor A00(String str, String[] strArr) throws C5N {
        try {
            String sortOrder = A04(667, 17, 99);
            return this.A01.getReadableDatabase().query(this.A04, A08, str, strArr, null, null, sortOrder);
        } catch (SQLiteException e2) {
            throw new C5N(e2);
        }
    }

    public static String A05(String str) {
        if (A04(582, 4, 68).equals(str)) {
            return A04(468, 20, 103);
        }
        if (A04(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, 3, 104).equals(str)) {
            return A04(515, 21, 32);
        }
        if (A04(652, 2, 48).equals(str)) {
            return A04(488, 27, 44);
        }
        return A04(742, 15, 100);
    }

    public static String A06(List<StreamKey> streamKeys) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < streamKeys.size(); i2++) {
            StreamKey streamKey = streamKeys.get(i2);
            StringBuilder stringBuilder = sb.append(streamKey.A01);
            stringBuilder.append('.').append(streamKey.A00).append('.').append(streamKey.A02).append(AbstractJsonLexerKt.COMMA);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String A07(int... iArr) {
        if (iArr.length == 0) {
            return A04(TTAdConstant.VIDEO_INFO_CODE, 1, 14);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A04(684, 5, 42)).append(A04(6, 5, 89));
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 > 0) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            int i3 = iArr[i2];
            int i4 = A06[5].length();
            if (i4 == 4) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[1] = "Jd";
            strArr[4] = "Ze";
            sb.append(i3);
        }
        sb.append(')');
        String string = sb.toString();
        String[] strArr2 = A06;
        if (strArr2[0].length() != strArr2[6].length()) {
            return string;
        }
        String[] strArr3 = A06;
        strArr3[1] = "5c";
        strArr3[4] = "cS";
        return string;
    }

    private List<C1262Bk> A08(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!C5C.A19(sQLiteDatabase, this.A04)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(this.A04, new String[]{A04(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, 2, 119), A04(720, 5, 15), A04(739, 3, 12), A04(709, 11, 1), A04(566, 16, 36), A04(586, 4, 41), A04(684, 5, 42), A04(654, 13, 81), A04(725, 14, 8), A04(552, 14, 17), A04(698, 11, 116), A04(590, 14, 52), A04(634, 18, 59), A04(536, 16, 16)}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(A02(cursorQuery));
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public static List<StreamKey> A09(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        String[] strArr = A06;
        if (strArr[7].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[0] = "JZKSAdXCo0Lu0XCPfhbdJS2vI";
        strArr2[6] = "3oo0vy2N0OZaC0WsxvSOxloxy";
        for (String str2 : C5C.A1O(str, A04(TTAdConstant.IMAGE_URL_CODE, 1, 1))) {
            String[] strArrA1O = C5C.A1O(str2, A04(466, 2, 2));
            AbstractC10843y.A08(strArrA1O.length == 3);
            arrayList.add(new StreamKey(Integer.parseInt(strArrA1O[0]), Integer.parseInt(strArrA1O[1]), Integer.parseInt(strArrA1O[2])));
        }
        return arrayList;
    }

    private void A0A() throws C5N {
        synchronized (this.A02) {
            if (this.A00) {
                return;
            }
            try {
                SQLiteDatabase readableDatabase = this.A01.getReadableDatabase();
                int iA00 = C5Q.A00(readableDatabase, 0, this.A03);
                if (iA00 != 3) {
                    SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        C5Q.A04(writableDatabase, 0, this.A03, 3);
                        List<C1262Bk> listA08 = iA00 == 2 ? A08(writableDatabase) : new ArrayList<>();
                        writableDatabase.execSQL(A04(427, 21, 3) + this.A04);
                        writableDatabase.execSQL(A04(TTAdConstant.VIDEO_URL_CODE, 13, 1) + this.A04 + A04(0, 1, 39) + A04(11, 401, 82));
                        Iterator<C1262Bk> it = listA08.iterator();
                        while (it.hasNext()) {
                            A0C(it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.A00 = true;
            } catch (SQLException e2) {
                throw new C5N(e2);
            }
        }
    }

    private void A0C(C1262Bk c1262Bk, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = c1262Bk.A07.A06 == null ? C5C.A07 : c1262Bk.A07.A06;
        ContentValues contentValues = new ContentValues();
        contentValues.put(A04(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, 2, 119), c1262Bk.A07.A02);
        contentValues.put(A04(LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, 9, 108), c1262Bk.A07.A03);
        contentValues.put(A04(739, 3, 12), c1262Bk.A07.A00.toString());
        contentValues.put(A04(709, 11, 1), A06(c1262Bk.A07.A04));
        contentValues.put(A04(566, 16, 36), c1262Bk.A07.A01);
        contentValues.put(A04(586, 4, 41), c1262Bk.A07.A05);
        contentValues.put(A04(684, 5, 42), Integer.valueOf(c1262Bk.A02));
        contentValues.put(A04(654, 13, 81), Long.valueOf(c1262Bk.A05));
        contentValues.put(A04(725, 14, 8), Long.valueOf(c1262Bk.A06));
        contentValues.put(A04(552, 14, 17), Long.valueOf(c1262Bk.A04));
        contentValues.put(A04(698, 11, 116), Integer.valueOf(c1262Bk.A03));
        contentValues.put(A04(590, 14, 52), Integer.valueOf(c1262Bk.A01));
        contentValues.put(A04(634, 18, 59), Float.valueOf(c1262Bk.A00()));
        contentValues.put(A04(536, 16, 16), Long.valueOf(c1262Bk.A01()));
        contentValues.put(A04(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 10, 25), bArr);
        sQLiteDatabase.replaceOrThrow(this.A04, null, contentValues);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1275Bx
    public final C1262Bk A7q(String str) throws C5N {
        A0A();
        try {
            Cursor cursorA00 = A00(A04(IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 6, 105), new String[]{str});
            try {
                if (cursorA00.getCount() == 0) {
                    if (cursorA00 != null) {
                        cursorA00.close();
                        return null;
                    }
                    return null;
                }
                cursorA00.moveToNext();
                C1262Bk c1262BkA01 = A01(cursorA00);
                if (cursorA00 != null) {
                    cursorA00.close();
                }
                return c1262BkA01;
            } catch (Throwable th) {
                if (cursorA00 != null) {
                    try {
                        cursorA00.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            throw new C5N(e2);
        }
        throw new C5N(e2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1275Bx
    public final C2723o4 A7r(int... iArr) throws C5N {
        A0A();
        return new C2723o4(A00(A07(iArr), null));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2716nw
    public final void AHF(C1262Bk c1262Bk) throws C5N {
        A0A();
        try {
            SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            A0C(c1262Bk, writableDatabase);
        } catch (SQLiteException e2) {
            throw new C5N(e2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2716nw
    public final void AIR(String str) throws C5N {
        A0A();
        try {
            this.A01.getWritableDatabase().delete(this.A04, A04(IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 6, 105), new String[]{str});
        } catch (SQLiteException e2) {
            throw new C5N(e2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2716nw
    public final void AJO() throws C5N {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(684, 5, 42), (Integer) 0);
            this.A01.getWritableDatabase().update(this.A04, contentValues, A04(689, 9, 36), null);
        } catch (SQLException e2) {
            throw new C5N(e2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2716nw
    public final void AJp() throws C5N {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(684, 5, 42), (Integer) 5);
            contentValues.put(A04(590, 14, 52), (Integer) 0);
            this.A01.getWritableDatabase().update(this.A04, contentValues, null, null);
        } catch (SQLException e2) {
            throw new C5N(e2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2716nw
    public final void AJq(int i2) throws C5N {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(698, 11, 116), Integer.valueOf(i2));
            this.A01.getWritableDatabase().update(this.A04, contentValues, A07, null);
        } catch (SQLException e2) {
            throw new C5N(e2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2716nw
    public final void AJr(String str, int i2) throws C5N {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(698, 11, 116), Integer.valueOf(i2));
            this.A01.getWritableDatabase().update(this.A04, contentValues, A07 + A04(1, 5, 86) + A04(IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 6, 105), new String[]{str});
        } catch (SQLException e2) {
            throw new C5N(e2);
        }
    }
}

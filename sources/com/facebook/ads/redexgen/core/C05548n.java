package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.badlogic.gdx.graphics.GL20;
import com.google.android.exoplayer2.StreamKey;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05548n implements RD {
    public static byte[] A05;
    public static String[] A06 = {"Jqmq4K7tB1gxG7Iw0FV8okMjCBaswkAi", "mef8JBr3Hcq3sRpElAFpZe43WV2TXs9w", "bN1b7Gf3PoFRsQJCeGsl", "gdb6fO9ZgIgG8mbJvImLiEt5CtXJnYC2", "lXlc2rIAvkbpRa0BRQU0heSQwvNyId3B", "hXMG3StQcVJrpui8xT3mDM7hCAg", "o40O5nfJDfxESYNhtB4Qydwq2yTmP4ik", "kxcCwldLHNrCwNefChPDCSGAO9aKxkjj"};
    public static final String A07;
    public static final String[] A08;
    public boolean A00;
    public final InterfaceC1027Sb A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1207Zk A01(Cursor cursor) {
        int i;
        byte[] blob = cursor.getBlob(14);
        C1230a8 c1230a8A02 = new C1230a8((String) AbstractC1517es.A01(cursor.getString(0)), Uri.parse((String) AbstractC1517es.A01(cursor.getString(2)))).A01(cursor.getString(1)).A02(A09(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest downloadRequestA05 = c1230a8A02.A04(blob).A00(cursor.getString(4)).A03(cursor.getBlob(5)).A05();
        C1228a6 c1228a6 = new C1228a6();
        c1228a6.A01 = cursor.getLong(13);
        c1228a6.A00 = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        if (i2 == 4) {
            String[] strArr = A06;
            if (strArr[4].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[1] = "AXklNJvpHFZUkioBcybrObdVZur9PlbK";
            strArr2[7] = "z2bqzLo9H68WlOTcEa2Y7muSAoCikYTa";
            i = cursor.getInt(11);
        } else {
            i = 0;
        }
        return new C1207Zk(downloadRequestA05, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i, c1228a6);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1207Zk A02(Cursor cursor) {
        DownloadRequest downloadRequestA05 = new C1230a8((String) AbstractC1517es.A01(cursor.getString(0)), Uri.parse((String) AbstractC1517es.A01(cursor.getString(2)))).A01(A05(cursor.getString(1))).A02(A09(cursor.getString(3))).A00(cursor.getString(4)).A03(cursor.getBlob(5)).A05();
        C1228a6 c1228a6 = new C1228a6();
        c1228a6.A01 = cursor.getLong(13);
        c1228a6.A00 = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new C1207Zk(downloadRequestA05, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, c1228a6);
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 47);
            String[] strArr = A06;
            if (strArr[4].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "8CZbeSODnHgjBTsw9Wu5QxwJLWGymZVt";
            strArr2[3] = "3nFdO4l5q8gTk0WeAd6FUscygdeEUCFJ";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A05 = new byte[]{103, -60, -27, -14, -24, -60, -74, -33, -28, -74, -66, 95, -96, -101, 87, -117, 124, -113, -117, 87, -121, -119, -128, -124, 120, -119, -112, 87, -126, 124, -112, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -92, -96, -92, -100, -106, -85, -80, -89, -100, 87, -117, 124, -113, -117, 99, -84, -87, -96, 87, -117, 124, -113, -117, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -86, -85, -87, -100, -104, -92, -106, -94, -100, -80, -86, 87, -117, 124, -113, -117, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -102, -84, -86, -85, -90, -92, -106, -102, -104, -102, -97, -100, -106, -94, -100, -80, 87, -117, 124, -113, -117, 99, -101, -104, -85, -104, 87, 121, -125, -122, 121, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -86, -85, -104, -85, -100, 87, -128, -123, -117, 124, 126, 124, -119, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -86, -85, -104, -87, -85, -106, -85, -96, -92, -100, -106, -92, -86, 87, -128, -123, -117, 124, 126, 124, -119, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -84, -89, -101, -104, -85, -100, -106, -85, -96, -92, -100, -106, -92, -86, 87, -128, -123, -117, 124, 126, 124, -119, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -102, -90, -91, -85, -100, -91, -85, -106, -93, -100, -91, -98, -85, -97, 87, -128, -123, -117, 124, 126, 124, -119, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -86, -85, -90, -89, -106, -87, -100, -104, -86, -90, -91, 87, -128, -123, -117, 124, 126, 124, -119, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -99, -104, -96, -93, -84, -87, -100, -106, -87, -100, -104, -86, -90, -91, 87, -128, -123, -117, 124, 126, 124, -119, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -89, -100, -87, -102, -100, -91, -85, -106, -101, -90, -82, -91, -93, -90, -104, -101, -100, -101, 87, -119, 124, 120, -125, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -103, -80, -85, -100, -86, -106, -101, -90, -82, -91, -93, -90, -104, -101, -100, -101, 87, -128, -123, -117, 124, 126, 124, -119, 87, -123, -122, -117, 87, -123, -116, -125, -125, 99, -94, -100, -80, -106, -86, -100, -85, -106, -96, -101, 87, 121, -125, -122, 121, 87, -123, -122, -117, 87, -123, -116, -125, -125, 96, -127, -101, -99, -84, -97, -101, -82, -97, 122, -82, -101, -100, -90, -97, 122, -109, -95, -98, -97, 111, -93, -112, -111, -101, -108, 111, -104, -107, 111, -108, -89, -104, -94, -93, -94, 111, -73, -22, -31, -62, -34, -45, -21, -41, -28, -74, -31, -23, -32, -34, -31, -45, -42, -27, -12, -58, -18, -3, -3, -7, -10, -16, -18, 1, -10, -4, -5, -68, -15, -18, 0, -11, -72, 5, -6, -7, -72, -57, -57, -61, -64, -70, -72, -53, -64, -58, -59, -122, -51, -59, -69, -123, -60, -54, -124, -54, -54, -53, -55, -126, -49, -60, -61, -31, -16, -16, -20, -23, -29, -31, -12, -23, -17, -18, -81, -8, -83, -19, -16, -27, -25, -43, -46, -52, -53, -30, -35, -50, -36, -56, -51, -40, -32, -41, -43, -40, -54, -51, -50, -51, -101, -89, -90, -84, -99, -90, -84, -105, -92, -99, -90, -97, -84, -96, -104, -86, -88, -87, -92, -94, -108, -104, -106, -104, -99, -102, -108, -96, -102, -82, -104, -107, -89, -100, -3, -6, cw.k, -6, -33, -38, -30, -27, -18, -21, -34, -40, -21, -34, -38, -20, -24, -25, 1, 5, 12, 2, -3, -51, -56, -124, -95, -124, -93, 4, -2, 18, -8, 12, -2, cw.k, -8, 2, -3, 2, -2, 2, -6, -12, 9, cw.l, 5, -6, -11, -22, -9, -24, -22, -13, -7, -28, -23, -12, -4, -13, -15, -12, -26, -23, -22, -23, -27, -27, -23, -22, -41, -24, -22, -43, -22, -33, -29, -37, -43, -29, -23, cw.n, 17, -2, cw.m, 17, -4, 17, 6, 10, 2, -4, 10, cw.n, -67, -34, -16, -32, -46, -45, -64, -45, -60, -54, -53, -72, -53, -68, 119, -108, 119, -119, 11, 12, 7, 8, -9, 10, -3, -7, 11, 7, 6, -86, -85, -87, -100, -104, -92, -106, -94, -100, -80, -86, -74, -85, -74, -82, -89, -81, -86, -98, -101, -82, -97, -103, -82, -93, -89, -97, -103, -89, -83, 25, 22, cw.k, -24, -37, -42, -41, -31, -95, -22, -97, -25, -32, -35, -32, -31, -23, -32};
    }

    static {
        A0B();
        A07 = A07(3, 4);
        A08 = new String[]{A04(TypedValues.MotionType.TYPE_PATHMOTION_ARC, 2, 106), A04(625, 9, 102), A04(739, 3, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE), A04(709, 11, 8), A04(566, 16, 6), A04(586, 4, 106), A04(684, 5, 48), A04(654, 13, 71), A04(725, 14, 11), A04(552, 14, 9), A04(698, 11, 105), A04(590, 14, 74), A04(634, 18, 86), A04(536, 16, 58), A04(615, 10, 106)};
    }

    public C05548n(InterfaceC1027Sb interfaceC1027Sb) {
        this(interfaceC1027Sb, A04(0, 0, 67));
    }

    public C05548n(InterfaceC1027Sb interfaceC1027Sb, String str) {
        this.A03 = str;
        this.A01 = interfaceC1027Sb;
        this.A04 = A04(448, 18, 67) + str;
        this.A02 = new Object();
    }

    private Cursor A00(String str, String[] strArr) throws C1026Sa {
        try {
            String sortOrder = A04(667, 17, 110);
            return this.A01.getReadableDatabase().query(this.A04, A08, str, strArr, null, null, sortOrder);
        } catch (SQLiteException e) {
            throw new C1026Sa(e);
        }
    }

    public static String A05(String str) {
        if (A04(582, 4, 5).equals(str)) {
            return A04(468, 20, 94);
        }
        if (A04(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, 3, 106).equals(str)) {
            return A04(GL20.GL_LEQUAL, 21, 81);
        }
        if (A04(652, 2, 67).equals(str)) {
            return A04(488, 27, 40);
        }
        return A04(742, 15, 67);
    }

    public static String A06(List<StreamKey> streamKeys) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < streamKeys.size(); i++) {
            StreamKey streamKey = streamKeys.get(i);
            StringBuilder stringBuilder = sb.append(streamKey.A01);
            stringBuilder.append('.').append(streamKey.A00).append('.').append(streamKey.A02).append(',');
        }
        if (sb.length() > 0) {
            int length = sb.length();
            String[] strArr = A06;
            if (strArr[0].charAt(10) != strArr[3].charAt(10)) {
                throw new RuntimeException();
            }
            A06[5] = "OBhHwsnIHSm5CTtMxj8nCSc";
            sb.setLength(length - 1);
        }
        return sb.toString();
    }

    public static String A07(int... iArr) {
        if (iArr.length == 0) {
            return A04(413, 1, 59);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A04(684, 5, 48)).append(A04(6, 5, 103));
        int i = 0;
        while (true) {
            int length = iArr.length;
            int i2 = A06[2].length();
            if (i2 == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[4] = "2sOMjeNiZo7mfHMBf8EmhmjelhbwcN4x";
            strArr[6] = "07cXHkkLLeQgahpU3qByDqhyHXoJHxGL";
            if (i < length) {
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(iArr[i]);
                i++;
            } else {
                sb.append(')');
                return sb.toString();
            }
        }
    }

    private List<C1207Zk> A08(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!AbstractC1600gE.A19(sQLiteDatabase, this.A04)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(this.A04, new String[]{A04(TypedValues.MotionType.TYPE_PATHMOTION_ARC, 2, 106), A04(720, 5, 19), A04(739, 3, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE), A04(709, 11, 8), A04(566, 16, 6), A04(586, 4, 106), A04(684, 5, 48), A04(654, 13, 71), A04(725, 14, 11), A04(552, 14, 9), A04(698, 11, 105), A04(590, 14, 74), A04(634, 18, 86), A04(536, 16, 58)}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(A02(cursorQuery));
            } catch (Throwable th) {
                String[] strArr = A06;
                if (strArr[1].charAt(8) != strArr[7].charAt(8)) {
                    throw new RuntimeException();
                }
                A06[5] = "RiUITzzlchERRNucmsrty5lb";
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
        for (String str2 : AbstractC1600gE.A1O(str, A04(412, 1, 38))) {
            String[] strArr = A06;
            if (strArr[4].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            A06[5] = "Hcuezu4I7Lq46LB6";
            String[] strArrA1O = AbstractC1600gE.A1O(str2, A04(466, 2, 105));
            AbstractC1517es.A08(strArrA1O.length == 3);
            arrayList.add(new StreamKey(Integer.parseInt(strArrA1O[0]), Integer.parseInt(strArrA1O[1]), Integer.parseInt(strArrA1O[2])));
        }
        return arrayList;
    }

    private void A0A() throws C1026Sa {
        synchronized (this.A02) {
            if (this.A00) {
                return;
            }
            try {
                SQLiteDatabase readableDatabase = this.A01.getReadableDatabase();
                int iA00 = AbstractC1029Sd.A00(readableDatabase, 0, this.A03);
                if (iA00 != 3) {
                    SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        AbstractC1029Sd.A04(writableDatabase, 0, this.A03, 3);
                        List<C1207Zk> listA08 = iA00 == 2 ? A08(writableDatabase) : new ArrayList<>();
                        writableDatabase.execSQL(A04(427, 21, 32) + this.A04);
                        writableDatabase.execSQL(A04(414, 13, 43) + this.A04 + A04(0, 1, 24) + A04(11, 401, 8));
                        Iterator<C1207Zk> it = listA08.iterator();
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
            } catch (SQLException e) {
                throw new C1026Sa(e);
            }
        }
    }

    private void A0C(C1207Zk c1207Zk, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = c1207Zk.A07.A06 == null ? AbstractC1600gE.A07 : c1207Zk.A07.A06;
        ContentValues contentValues = new ContentValues();
        contentValues.put(A04(TypedValues.MotionType.TYPE_PATHMOTION_ARC, 2, 106), c1207Zk.A07.A02);
        contentValues.put(A04(625, 9, 102), c1207Zk.A07.A03);
        contentValues.put(A04(739, 3, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE), c1207Zk.A07.A00.toString());
        contentValues.put(A04(709, 11, 8), A06(c1207Zk.A07.A04));
        contentValues.put(A04(566, 16, 6), c1207Zk.A07.A01);
        contentValues.put(A04(586, 4, 106), c1207Zk.A07.A05);
        contentValues.put(A04(684, 5, 48), Integer.valueOf(c1207Zk.A02));
        contentValues.put(A04(654, 13, 71), Long.valueOf(c1207Zk.A05));
        contentValues.put(A04(725, 14, 11), Long.valueOf(c1207Zk.A06));
        contentValues.put(A04(552, 14, 9), Long.valueOf(c1207Zk.A04));
        contentValues.put(A04(698, 11, 105), Integer.valueOf(c1207Zk.A03));
        contentValues.put(A04(590, 14, 74), Integer.valueOf(c1207Zk.A01));
        contentValues.put(A04(634, 18, 86), Float.valueOf(c1207Zk.A00()));
        contentValues.put(A04(536, 16, 58), Long.valueOf(c1207Zk.A01()));
        contentValues.put(A04(615, 10, 106), bArr);
        sQLiteDatabase.replaceOrThrow(this.A04, null, contentValues);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1219Zx
    public final C1207Zk A7g(String str) throws C1026Sa {
        A0A();
        try {
            Cursor cursorA00 = A00(A04(TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 6, 53), new String[]{str});
            try {
                if (cursorA00.getCount() == 0) {
                    if (cursorA00 != null) {
                        cursorA00.close();
                        return null;
                    }
                    return null;
                }
                cursorA00.moveToNext();
                C1207Zk c1207ZkA01 = A01(cursorA00);
                if (cursorA00 != null) {
                    cursorA00.close();
                }
                return c1207ZkA01;
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
        } catch (SQLiteException e) {
            throw new C1026Sa(e);
        }
        throw new C1026Sa(e);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1219Zx
    public final RO A7h(int... iArr) throws C1026Sa {
        A0A();
        return new RO(A00(A07(iArr), null));
    }

    @Override // com.facebook.ads.redexgen.core.RD
    public final void AGN(C1207Zk c1207Zk) throws C1026Sa {
        A0A();
        try {
            SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            A0C(c1207Zk, writableDatabase);
        } catch (SQLiteException e) {
            throw new C1026Sa(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.RD
    public final void AHX(String str) throws C1026Sa {
        A0A();
        try {
            this.A01.getWritableDatabase().delete(this.A04, A04(TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 6, 53), new String[]{str});
        } catch (SQLiteException e) {
            throw new C1026Sa(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.RD
    public final void AIU() throws C1026Sa {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(684, 5, 48), (Integer) 0);
            this.A01.getWritableDatabase().update(this.A04, contentValues, A04(689, 9, 40), null);
        } catch (SQLException e) {
            throw new C1026Sa(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.RD
    public final void AIv() throws C1026Sa {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(684, 5, 48), (Integer) 5);
            contentValues.put(A04(590, 14, 74), (Integer) 0);
            this.A01.getWritableDatabase().update(this.A04, contentValues, null, null);
        } catch (SQLException e) {
            throw new C1026Sa(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.RD
    public final void AIw(int i) throws C1026Sa {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(698, 11, 105), Integer.valueOf(i));
            this.A01.getWritableDatabase().update(this.A04, contentValues, A07, null);
        } catch (SQLException e) {
            throw new C1026Sa(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.RD
    public final void AIx(String str, int i) throws C1026Sa {
        A0A();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(A04(698, 11, 105), Integer.valueOf(i));
            this.A01.getWritableDatabase().update(this.A04, contentValues, A07 + A04(1, 5, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE) + A04(TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 6, 53), new String[]{str});
        } catch (SQLException e) {
            throw new C1026Sa(e);
        }
    }
}

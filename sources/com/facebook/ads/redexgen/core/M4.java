package com.facebook.ads.redexgen.core;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class M4 extends AbstractC1824jx<String> {
    public static byte[] A08;
    public static String[] A09 = {"ZKW0rplATEIsE5gjt8qXTQnY", "r6HJdeSoORQdJfGxA0AnZWlkU33wQIlK", "lLZOtDHAe6uwMhK1fYaqg", "CFnqFcdcZfU1FaRsph1ThokBMpi4uqZk", "TONJvFd", "LRRDDC4", "oqOd7Km", ExifInterface.LONGITUDE_EAST};
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C8E A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {56, 53, 72, 53, 54, 53, 71, 57};
        if (A09[2].length() == 32) {
            throw new RuntimeException();
        }
        A09[2] = "0lpDBp9tBU8jLddyd5eWZp";
        A08 = bArr;
    }

    static {
        A02();
    }

    public M4(C8E c8e, String str, String str2, int i, double d, double d2, String str3, Map map) {
        this.A03 = c8e;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i;
        this.A01 = d;
        this.A00 = d2;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C8H
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String A03() {
        String eventId = A01(0, 8, 90);
        this.A03.A01.A08().A9t(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        C8E.A07.lock();
        SQLiteDatabase sQLiteDatabaseA0E = null;
        try {
            try {
                sQLiteDatabaseA0E = this.A03.A0E();
                sQLiteDatabaseA0E.beginTransaction();
                String strA0E = this.A03.A02.A0E(this.A03.A03.A0C(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabaseA0E.setTransactionSuccessful();
                if (sQLiteDatabaseA0E != null && sQLiteDatabaseA0E.isOpen()) {
                    try {
                        if (sQLiteDatabaseA0E.inTransaction()) {
                            sQLiteDatabaseA0E.endTransaction();
                        }
                    } catch (Exception e) {
                        this.A03.A01.A08().AAu(eventId, AbstractC05418a.A0z, new C05428b(e));
                    }
                }
                C8E.A07.unlock();
                return strA0E;
            } catch (Exception e2) {
                A01(C8G.A05);
                this.A03.A01.A08().AAu(eventId, AbstractC05418a.A0y, new C05428b(e2));
                if (sQLiteDatabaseA0E != null && sQLiteDatabaseA0E.isOpen()) {
                    try {
                        if (sQLiteDatabaseA0E.inTransaction()) {
                            sQLiteDatabaseA0E.endTransaction();
                        }
                    } catch (Exception e3) {
                        this.A03.A01.A08().AAu(eventId, AbstractC05418a.A0z, new C05428b(e3));
                    }
                }
                C8E.A07.unlock();
                return null;
            }
        } catch (Throwable th) {
            if (sQLiteDatabaseA0E != null) {
                boolean zIsOpen = sQLiteDatabaseA0E.isOpen();
                if (A09[5].length() != 7) {
                    throw new RuntimeException();
                }
                A09[2] = "rWG930h";
                if (zIsOpen) {
                    try {
                        if (sQLiteDatabaseA0E.inTransaction()) {
                            sQLiteDatabaseA0E.endTransaction();
                        }
                    } catch (Exception e4) {
                        this.A03.A01.A08().AAu(eventId, AbstractC05418a.A0z, new C05428b(e4));
                    }
                }
            }
            C8E.A07.unlock();
            throw th;
        }
    }
}

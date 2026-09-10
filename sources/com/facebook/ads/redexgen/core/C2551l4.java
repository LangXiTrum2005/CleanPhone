package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.applovin.shadow.okio.Segment;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2551l4 implements L8 {
    public static String[] A05 = {"ueDbV1wfakHSWIQF7BEzGoLlZXsjLXAz", "DUk", "o0l", "JXBQRCbHgV51hCMTPiBs95yrGLtJ9vRB", "UUCtZFjpq77XJSMaCIYouODFHgisrwF4", "OUp13aafPcRzH6W84Z44X0AbLYnCU3jN", "RRsP4MaHzu2rfmisltpPpgYoVzHnYDNm", "WbSPhlBTq3Mh8neaDCFEdYJRI0JZWypJ"};
    public final int A00;
    public final /* synthetic */ C2550l3 A04;
    public final C11064u A03 = new C11064u(new byte[5]);
    public final SparseArray<LH> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Code duplicated, block: B:45:0x0176  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.L8
    public final void A5A(C11074v c11074v) {
        AnonymousClass53 anonymousClass53;
        if (c11074v.A0I() != 2) {
            return;
        }
        if (this.A04.A09 == 1 || this.A04.A09 == 2 || this.A04.A02 == 1) {
            anonymousClass53 = (AnonymousClass53) this.A04.A0I.get(0);
        } else {
            anonymousClass53 = new AnonymousClass53(((AnonymousClass53) this.A04.A0I.get(0)).A02());
            this.A04.A0I.add(anonymousClass53);
        }
        if ((c11074v.A0I() & 128) == 0) {
            return;
        }
        c11074v.A0g(1);
        int iA0M = c11074v.A0M();
        int i2 = 3;
        c11074v.A0g(3);
        c11074v.A0h(this.A03, 2);
        this.A03.A09(3);
        int i3 = 13;
        this.A04.A01 = this.A03.A04(13);
        c11074v.A0h(this.A03, 2);
        int i4 = 4;
        this.A03.A09(4);
        c11074v.A0g(this.A03.A04(12));
        int i5 = 21;
        if (this.A04.A09 == 2 && this.A04.A05 == null) {
            this.A04.A05 = this.A04.A0H.A5V(21, new LD(21, null, null, C5C.A07));
            if (this.A04.A05 != null) {
                this.A04.A05.AAA(anonymousClass53, this.A04.A03, new LG(iA0M, 21, Segment.SIZE));
            }
        }
        this.A01.clear();
        this.A02.clear();
        int iA07 = c11074v.A07();
        while (iA07 > 0) {
            c11074v.A0h(this.A03, 5);
            int iA04 = this.A03.A04(8);
            this.A03.A09(i2);
            int iA05 = this.A03.A04(i3);
            this.A03.A09(i4);
            int iA06 = this.A03.A04(12);
            LD ldA00 = A00(c11074v, iA06);
            if (iA04 == 6 || iA04 == 5) {
                iA04 = ldA00.A00;
            }
            iA07 -= iA06 + 5;
            int i6 = this.A04.A09 == 2 ? iA04 : iA05;
            if (!this.A04.A0C.get(i6)) {
                LH lhA5V = (this.A04.A09 == 2 && iA04 == i5) ? this.A04.A05 : this.A04.A0H.A5V(iA04, ldA00);
                if (this.A04.A09 == 2) {
                    SparseIntArray sparseIntArray = this.A02;
                    String[] strArr = A05;
                    if (strArr[0].charAt(21) == strArr[3].charAt(21)) {
                        throw new RuntimeException();
                    }
                    A05[7] = "JJxGvbQzsWrYD5XHKTSp80Ux1McJryio";
                    if (iA05 < sparseIntArray.get(i6, Segment.SIZE)) {
                        this.A02.put(i6, iA05);
                        this.A01.put(i6, lhA5V);
                    }
                } else {
                    this.A02.put(i6, iA05);
                    this.A01.put(i6, lhA5V);
                }
            }
            i5 = 21;
            i2 = 3;
            i4 = 4;
            i3 = 13;
        }
        int size = this.A02.size();
        for (int i7 = 0; i7 < size; i7++) {
            int iKeyAt = this.A02.keyAt(i7);
            int iValueAt = this.A02.valueAt(i7);
            this.A04.A0C.put(iKeyAt, true);
            this.A04.A0D.put(iValueAt, true);
            LH lhValueAt = this.A01.valueAt(i7);
            if (lhValueAt != null) {
                if (lhValueAt != this.A04.A05) {
                    lhValueAt.AAA(anonymousClass53, this.A04.A03, new LG(iA0M, iKeyAt, Segment.SIZE));
                }
                this.A04.A0B.put(iValueAt, lhValueAt);
            }
        }
        if (this.A04.A09 != 2) {
            this.A04.A0B.remove(this.A00);
            this.A04.A02 = this.A04.A09 != 1 ? this.A04.A02 - 1 : 0;
            if (this.A04.A02 == 0) {
                this.A04.A03.A6O();
                this.A04.A08 = true;
                return;
            }
            return;
        }
        if (this.A04.A08) {
            return;
        }
        HA ha = this.A04.A03;
        String[] strArr2 = A05;
        if (strArr2[1].length() != strArr2[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A05;
        strArr3[0] = "hBvWu7G0FYrLQDeafFD7KKlceKy2jgRX";
        strArr3[3] = "VoSHbxg0JUdlXnrGoiizfFeUaWFRK7d9";
        ha.A6O();
        this.A04.A02 = 0;
        this.A04.A08 = true;
    }

    public C2551l4(C2550l3 c2550l3, int i2) {
        this.A04 = c2550l3;
        this.A00 = i2;
    }

    private LD A00(C11074v c11074v, int i2) {
        int descriptorTag = c11074v.A09();
        int descriptorLength = descriptorTag + i2;
        int i3 = -1;
        String strTrim = null;
        ArrayList arrayList = null;
        while (c11074v.A09() < descriptorLength) {
            int positionOfNextDescriptor = c11074v.A0I();
            int iA09 = c11074v.A09() + c11074v.A0I();
            if (iA09 > descriptorLength) {
                break;
            }
            if (positionOfNextDescriptor == 5) {
                long jA0Q = c11074v.A0Q();
                if (jA0Q == 1094921523) {
                    i3 = 129;
                } else if (jA0Q == 1161904947) {
                    i3 = 135;
                } else if (jA0Q == 1094921524) {
                    i3 = 172;
                } else if (jA0Q == 1212503619) {
                    i3 = 36;
                }
            } else if (positionOfNextDescriptor == 106) {
                i3 = 129;
            } else if (positionOfNextDescriptor == 122) {
                i3 = 135;
            } else {
                String[] strArr = A05;
                String str = strArr[1];
                String str2 = strArr[2];
                int descriptorsStartPosition = str.length();
                if (descriptorsStartPosition != str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "GzIOqzBb8TAh93bRV2CN08O62ZCaAqRX";
                strArr2[3] = "fp9XAk3ifz38aVsym619EhTf04al4HEa";
                if (positionOfNextDescriptor == 127) {
                    int descriptorsStartPosition2 = c11074v.A0I();
                    if (descriptorsStartPosition2 == 21) {
                        i3 = 172;
                    }
                } else if (positionOfNextDescriptor == 123) {
                    i3 = 138;
                } else {
                    String[] strArr3 = A05;
                    String str3 = strArr3[1];
                    String str4 = strArr3[2];
                    int descriptorsStartPosition3 = str3.length();
                    if (descriptorsStartPosition3 != str4.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A05;
                    strArr4[5] = "wqYpRyaK4cDMDpt9hZQKwXCqV01Ydwf6";
                    strArr4[4] = "1qKbohas3rI7JmruTyrxsTuTEMq9fdbm";
                    if (positionOfNextDescriptor == 10) {
                        String strA0W = c11074v.A0W(3);
                        String[] strArr5 = A05;
                        String str5 = strArr5[1];
                        String str6 = strArr5[2];
                        int descriptorsStartPosition4 = str5.length();
                        if (descriptorsStartPosition4 != str6.length()) {
                            strTrim = strA0W.trim();
                        } else {
                            A05[6] = "aW10g0SpfKclE3j5mqsPv8AasgcB3Ji3";
                            strTrim = strA0W.trim();
                        }
                    } else if (positionOfNextDescriptor == 89) {
                        i3 = 89;
                        arrayList = new ArrayList();
                        while (c11074v.A09() < iA09) {
                            String strTrim2 = c11074v.A0W(3).trim();
                            int iA0I = c11074v.A0I();
                            byte[] bArr = new byte[4];
                            c11074v.A0k(bArr, 0, 4);
                            arrayList.add(new LC(strTrim2, iA0I, bArr));
                        }
                    } else if (positionOfNextDescriptor == 111) {
                        i3 = 257;
                    }
                }
            }
            c11074v.A0g(iA09 - c11074v.A09());
        }
        c11074v.A0f(descriptorLength);
        return new LD(i3, strTrim, arrayList, Arrays.copyOfRange(c11074v.A0l(), descriptorTag, descriptorLength));
    }

    @Override // com.facebook.ads.redexgen.core.L8
    public final void AAA(AnonymousClass53 anonymousClass53, HA ha, LG lg) {
    }
}

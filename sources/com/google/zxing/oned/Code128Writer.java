package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CType {
        public static final CType X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final CType f21372Y;
        public static final CType Z;
        public static final CType e0;
        public static final /* synthetic */ CType[] f0;

        static {
            CType cType = new CType("UNCODABLE", 0);
            X = cType;
            CType cType2 = new CType("ONE_DIGIT", 1);
            f21372Y = cType2;
            CType cType3 = new CType("TWO_DIGITS", 2);
            Z = cType3;
            CType cType4 = new CType("FNC_1", 3);
            e0 = cType4;
            f0 = new CType[]{cType, cType2, cType3, cType4};
        }

        public static CType valueOf(String str) {
            return (CType) Enum.valueOf(CType.class, str);
        }

        public static CType[] values() {
            return (CType[]) f0.clone();
        }
    }

    public static CType e(int i2, String str) {
        char cCharAt;
        int length = str.length();
        CType cType = CType.X;
        if (i2 < length) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 == 241) {
                return CType.e0;
            }
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                int i3 = i2 + 1;
                cType = CType.f21372Y;
                if (i3 < length && (cCharAt = str.charAt(i3)) >= '0' && cCharAt <= '9') {
                    return CType.Z;
                }
            }
        }
        return cType;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(BarcodeFormat.f21331Y)));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] c(String str) {
        int i2;
        int i3;
        CType cTypeE;
        char cCharAt;
        int i4;
        int iCharAt;
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt2 = str.charAt(i5);
            switch (cCharAt2) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (cCharAt2 > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt2)));
                    }
                    break;
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[][] iArr = Code128Reader.f21371a;
            if (i7 >= length) {
                arrayList.add(iArr[i8 % 103]);
                arrayList.add(iArr[106]);
                int i10 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i11 : iArr2) {
                        i10 += i11;
                    }
                }
                boolean[] zArr = new boolean[i10];
                Iterator it = arrayList.iterator();
                int iB = 0;
                while (it.hasNext()) {
                    iB += OneDimensionalCodeWriter.b(zArr, iB, (int[]) it.next(), true);
                }
                return zArr;
            }
            CType cTypeE2 = e(i7, str);
            CType cType = CType.f21372Y;
            if (cTypeE2 == cType) {
                i3 = 100;
                i2 = 103;
            } else {
                i2 = 103;
                CType cType2 = CType.X;
                if (cTypeE2 == cType2) {
                    i3 = (i7 >= str.length() || ((cCharAt = str.charAt(i7)) >= ' ' && (i9 != 101 || cCharAt >= '`'))) ? 100 : 101;
                } else {
                    i3 = 99;
                    if (i9 != 99) {
                        CType cType3 = CType.e0;
                        CType cType4 = CType.Z;
                        if (i9 != 100) {
                            if (cTypeE2 == cType3) {
                                cTypeE2 = e(i7 + 1, str);
                            }
                            if (cTypeE2 == cType4) {
                                i3 = 99;
                            }
                        } else if (cTypeE2 != cType3 && (cTypeE = e(i7 + 2, str)) != cType2 && cTypeE != cType) {
                            if (cTypeE != cType3) {
                                int i12 = i7 + 4;
                                while (true) {
                                    CType cTypeE3 = e(i12, str);
                                    if (cTypeE3 == cType4) {
                                        i12 += 2;
                                    } else if (cTypeE3 != cType) {
                                        i3 = 99;
                                    }
                                }
                            } else if (e(i7 + 3, str) == cType4) {
                                i3 = 99;
                            }
                        }
                    }
                }
            }
            if (i3 == i9) {
                switch (str.charAt(i7)) {
                    case 241:
                        iCharAt = 102;
                        break;
                    case 242:
                        iCharAt = 97;
                        break;
                    case 243:
                        iCharAt = 96;
                        break;
                    case 244:
                        iCharAt = i9 == 101 ? 101 : 100;
                        break;
                    default:
                        if (i9 == 100) {
                            iCharAt = str.charAt(i7) - ' ';
                        } else if (i9 != 101) {
                            iCharAt = Integer.parseInt(str.substring(i7, i7 + 2));
                            i7++;
                        } else {
                            char cCharAt3 = str.charAt(i7);
                            iCharAt = cCharAt3 - ' ';
                            if (iCharAt < 0) {
                                iCharAt = cCharAt3 + '@';
                            }
                        }
                        break;
                }
                i7++;
            } else {
                if (i9 != 0) {
                    i4 = i3;
                } else if (i3 != 100) {
                    i4 = i3 != 101 ? 105 : i2;
                } else {
                    i4 = 104;
                }
                iCharAt = i4;
                i9 = i3;
            }
            arrayList.add(iArr[iCharAt]);
            i8 += iCharAt * i6;
            if (i7 != 0) {
                i6++;
            }
        }
    }
}

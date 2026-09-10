package oe;

import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.InterfaceC0435l1;
import d5.u;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f47399c = {1, 1, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f47400d = {3, 1, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[][] f47401e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47402b;

    public /* synthetic */ g(int i10) {
        this.f47402b = i10;
    }

    public static void L(boolean[] zArr, int i10, int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            zArr[i10] = iArr[i11] != 0;
            i11++;
            i10 = i12;
        }
    }

    public static int M(int i10, String str) {
        int iIndexOf = 0;
        int i11 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i11;
            i11++;
            if (i11 > i10) {
                i11 = 1;
            }
        }
        return iIndexOf % 47;
    }

    public static int N(int i10, String str) {
        char cCharAt;
        int length = str.length();
        if (i10 < length) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 == 241) {
                return 4;
            }
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                int i11 = i10 + 1;
                return (i11 < length && (cCharAt = str.charAt(i11)) >= '0' && cCharAt <= '9') ? 3 : 2;
            }
        }
        return 1;
    }

    public static void O(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    public static void P(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) == 0) {
                i12 = 0;
            }
            iArr[i11] = i12;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.q1, he.d
    public final ke.b i(String str, int i10, EnumMap enumMap) {
        switch (this.f47402b) {
            case 0:
                if (i10 == 9) {
                    return super.i(str, i10, enumMap);
                }
                throw new IllegalArgumentException("Can only encode ITF, but got ".concat(u.A(i10)));
            case 1:
                if (i10 == 5) {
                    return super.i(str, i10, enumMap);
                }
                throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(u.A(i10)));
            case 2:
                if (i10 == 3) {
                    return super.i(str, i10, enumMap);
                }
                throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(u.A(i10)));
            default:
                if (i10 == 4) {
                    return super.i(str, i10, enumMap);
                }
                throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(u.A(i10)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0260  */
    /* JADX WARN: Code duplicated, block: B:134:0x029c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0186  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c7 A[LOOP:4: B:82:0x01c5->B:83:0x01c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x01e8 A[LOOP:5: B:86:0x01e6->B:87:0x01e8, LOOP_END] */
    @Override // com.google.android.gms.internal.play_billing.q1
    public final boolean[] l(String str) {
        int i10;
        int i11;
        int iN;
        char cCharAt;
        int i12;
        int iCharAt;
        int[] iArr;
        int i13;
        int i14;
        boolean[] zArr;
        int[] iArr2;
        int iA;
        int i15;
        int i16;
        String string = str;
        switch (this.f47402b) {
            case 0:
                int length = string.length();
                if (length % 2 != 0) {
                    throw new IllegalArgumentException("The length of the input should be even");
                }
                if (length > 80) {
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
                }
                boolean[] zArr2 = new boolean[(length * 9) + 9];
                int iA2 = q1.a(zArr2, 0, f47399c, true);
                for (int i17 = 0; i17 < length; i17 += 2) {
                    int iDigit = Character.digit(string.charAt(i17), 10);
                    int iDigit2 = Character.digit(string.charAt(i17 + 1), 10);
                    int[] iArr3 = new int[10];
                    for (int i18 = 0; i18 < 5; i18++) {
                        int i19 = i18 * 2;
                        int[][] iArr4 = f47401e;
                        iArr3[i19] = iArr4[iDigit][i18];
                        iArr3[i19 + 1] = iArr4[iDigit2][i18];
                    }
                    iA2 += q1.a(zArr2, iA2, iArr3, true);
                }
                q1.a(zArr2, iA2, f47400d, true);
                return zArr2;
            case 1:
                int[][] iArr5 = c.f47393e;
                int length2 = string.length();
                if (length2 <= 0 || length2 > 80) {
                    throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length2)));
                }
                for (int i20 = 0; i20 < length2; i20++) {
                    char cCharAt2 = string.charAt(i20);
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
                int i21 = 1;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < length2) {
                    int iN2 = N(i22, string);
                    if (iN2 == 2) {
                        i11 = 100;
                        i10 = InterfaceC0435l1.d.b.f29107d;
                    } else if (iN2 == 1) {
                        if (i22 >= string.length() || ((cCharAt = string.charAt(i22)) >= ' ' && (i24 != 101 || cCharAt >= '`'))) {
                            i11 = 100;
                        } else {
                            i11 = 101;
                        }
                        i10 = InterfaceC0435l1.d.b.f29107d;
                    } else {
                        i10 = InterfaceC0435l1.d.b.f29107d;
                        i11 = 99;
                        if (i24 != 99) {
                            if (i24 == 100) {
                                if (iN2 != 4 && (iN = N(i22 + 2, string)) != 1 && iN != 2) {
                                    if (iN != 4) {
                                        int i25 = i22 + 4;
                                        while (true) {
                                            int iN3 = N(i25, string);
                                            if (iN3 == 3) {
                                                i25 += 2;
                                            } else if (iN3 != 2) {
                                                i11 = 99;
                                            }
                                        }
                                    } else if (N(i22 + 3, string) == 3) {
                                        i11 = 99;
                                    }
                                }
                                i11 = 100;
                            } else {
                                if (iN2 == 4) {
                                    iN2 = N(i22 + 1, string);
                                }
                                if (iN2 == 3) {
                                    i11 = 99;
                                } else {
                                    i11 = 100;
                                }
                            }
                        }
                    }
                    if (i11 == i24) {
                        switch (string.charAt(i22)) {
                            case 241:
                                iCharAt = InterfaceC0435l1.d.b.f29106c;
                                break;
                            case 242:
                                iCharAt = 97;
                                break;
                            case 243:
                                iCharAt = 96;
                                break;
                            case 244:
                                iCharAt = i24 == 101 ? 101 : 100;
                                break;
                            default:
                                if (i24 == 100) {
                                    iCharAt = string.charAt(i22) - ' ';
                                } else if (i24 != 101) {
                                    iCharAt = Integer.parseInt(string.substring(i22, i22 + 2));
                                    i22++;
                                } else {
                                    char cCharAt3 = string.charAt(i22);
                                    iCharAt = cCharAt3 - ' ';
                                    if (iCharAt < 0) {
                                        iCharAt = cCharAt3 + '@';
                                    }
                                }
                                break;
                        }
                        i22++;
                    } else {
                        if (i24 != 0) {
                            i12 = i11;
                        } else if (i11 != 100) {
                            i12 = i11 != 101 ? InterfaceC0435l1.d.b.f29109f : i10;
                        } else {
                            i12 = InterfaceC0435l1.d.b.f29108e;
                        }
                        iCharAt = i12;
                        i24 = i11;
                    }
                    arrayList.add(iArr5[iCharAt]);
                    i23 += iCharAt * i21;
                    if (i22 != 0) {
                        i21++;
                    }
                }
                arrayList.add(iArr5[i23 % InterfaceC0435l1.d.b.f29107d]);
                arrayList.add(iArr5[106]);
                int i26 = 0;
                for (int[] iArr6 : arrayList) {
                    for (int i27 : iArr6) {
                        i26 += i27;
                    }
                }
                boolean[] zArr3 = new boolean[i26];
                Iterator it = arrayList.iterator();
                int iA3 = 0;
                while (it.hasNext()) {
                    iA3 += q1.a(zArr3, iA3, (int[]) it.next(), true);
                }
                return zArr3;
            case 2:
                int[] iArr7 = c.f47394f;
                int length3 = string.length();
                if (length3 > 80) {
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length3)));
                }
                for (int i28 = 0; i28 < length3; i28++) {
                    if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i28)) < 0) {
                        int length4 = string.length();
                        StringBuilder sb2 = new StringBuilder();
                        for (int i29 = 0; i29 < length4; i29++) {
                            char cCharAt4 = string.charAt(i29);
                            if (cCharAt4 == 0) {
                                sb2.append("%U");
                            } else if (cCharAt4 == ' ') {
                                sb2.append(cCharAt4);
                            } else if (cCharAt4 == '@') {
                                sb2.append("%V");
                            } else if (cCharAt4 == '`') {
                                sb2.append("%W");
                            } else if (cCharAt4 == '-' || cCharAt4 == '.') {
                                sb2.append(cCharAt4);
                            } else if (cCharAt4 <= 26) {
                                sb2.append('$');
                                sb2.append((char) (cCharAt4 + '@'));
                            } else if (cCharAt4 < ' ') {
                                sb2.append('%');
                                sb2.append((char) (cCharAt4 + '&'));
                            } else if (cCharAt4 <= ',' || cCharAt4 == '/' || cCharAt4 == ':') {
                                sb2.append('/');
                                sb2.append((char) (cCharAt4 + ' '));
                            } else if (cCharAt4 <= '9') {
                                sb2.append(cCharAt4);
                            } else if (cCharAt4 <= '?') {
                                sb2.append('%');
                                sb2.append((char) (cCharAt4 + 11));
                            } else if (cCharAt4 <= 'Z') {
                                sb2.append(cCharAt4);
                            } else if (cCharAt4 <= '_') {
                                sb2.append('%');
                                sb2.append((char) (cCharAt4 - 16));
                            } else if (cCharAt4 <= 'z') {
                                sb2.append('+');
                                sb2.append((char) (cCharAt4 - ' '));
                            } else {
                                if (cCharAt4 > 127) {
                                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + string.charAt(i29) + "'");
                                }
                                sb2.append('%');
                                sb2.append((char) (cCharAt4 - '+'));
                            }
                        }
                        string = sb2.toString();
                        length3 = string.length();
                        if (length3 > 80) {
                            throw new IllegalArgumentException(defpackage.e.h(length3, "Requested contents should be less than 80 digits long, but got ", " (extended full ASCII mode)"));
                        }
                        iArr = new int[9];
                        i13 = length3 + 25;
                        for (i14 = 0; i14 < length3; i14++) {
                            O(iArr7["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i14))], iArr);
                            for (i16 = 0; i16 < 9; i16++) {
                                i13 += iArr[i16];
                            }
                        }
                        zArr = new boolean[i13];
                        O(148, iArr);
                        int iA4 = q1.a(zArr, 0, iArr, true);
                        iArr2 = new int[]{1};
                        iA = q1.a(zArr, iA4, iArr2, false) + iA4;
                        for (i15 = 0; i15 < length3; i15++) {
                            O(iArr7["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i15))], iArr);
                            int iA5 = q1.a(zArr, iA, iArr, true) + iA;
                            iA = q1.a(zArr, iA5, iArr2, false) + iA5;
                        }
                        O(148, iArr);
                        q1.a(zArr, iA, iArr, true);
                        return zArr;
                    }
                }
                iArr = new int[9];
                i13 = length3 + 25;
                while (i14 < length3) {
                    O(iArr7["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i14))], iArr);
                    while (i16 < 9) {
                        i13 += iArr[i16];
                    }
                }
                zArr = new boolean[i13];
                O(148, iArr);
                int iA6 = q1.a(zArr, 0, iArr, true);
                iArr2 = new int[]{1};
                iA = q1.a(zArr, iA6, iArr2, false) + iA6;
                while (i15 < length3) {
                    O(iArr7["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(string.charAt(i15))], iArr);
                    int iA7 = q1.a(zArr, iA, iArr, true) + iA;
                    iA = q1.a(zArr, iA7, iArr2, false) + iA7;
                }
                O(148, iArr);
                q1.a(zArr, iA, iArr, true);
                return zArr;
            default:
                int length5 = string.length();
                if (length5 > 80) {
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length5)));
                }
                int i30 = 9;
                int[] iArr8 = new int[9];
                int length6 = ((string.length() + 4) * 9) + 1;
                P(d.f47395e[47], iArr8);
                boolean[] zArr4 = new boolean[length6];
                L(zArr4, 0, iArr8);
                for (int i31 = 0; i31 < length5; i31++) {
                    P(d.f47395e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(string.charAt(i31))], iArr8);
                    L(zArr4, i30, iArr8);
                    i30 += 9;
                }
                int iM = M(20, string);
                int[] iArr9 = d.f47395e;
                P(iArr9[iM], iArr8);
                L(zArr4, i30, iArr8);
                StringBuilder sbI = u.i(string);
                sbI.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iM));
                P(iArr9[M(15, sbI.toString())], iArr8);
                L(zArr4, i30 + 9, iArr8);
                P(iArr9[47], iArr8);
                L(zArr4, i30 + 18, iArr8);
                zArr4[i30 + 27] = true;
                return zArr4;
        }
    }
}

package com.thinkup.core.common.o0m.o;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
final class mn implements com.thinkup.core.common.o0m.o.o.m<Set<String>> {
    static final mn o = new mn();

    private mn() {
    }

    private static Set<String> m(byte[] bArr, int i2, int i3) {
        int i4;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i3 > 0) {
            om omVar = new om(bArr, i2);
            int i5 = i2 + i3;
            while (true) {
                i4 = omVar.m;
                if (i4 >= i5) {
                    break;
                }
                byte[] bArr2 = omVar.o;
                int i6 = i4 + 1;
                omVar.m = i6;
                int i7 = bArr2[i4];
                if ((i7 >> 7) != 0) {
                    int i8 = i4 + 2;
                    omVar.m = i8;
                    i7 = (i7 & 127) | (bArr2[i6] << 7);
                    if ((i7 >> 14) != 0) {
                        int i9 = i7 & 16383;
                        int i10 = i4 + 3;
                        omVar.m = i10;
                        int i11 = i9 | (bArr2[i8] << 14);
                        if ((i11 >> 21) == 0) {
                            i7 = i11;
                        } else {
                            int i12 = i4 + 4;
                            omVar.m = i12;
                            i7 = (bArr2[i10] << 21) | (i11 & 2097151);
                            if ((i7 >> 28) != 0) {
                                omVar.m = i4 + 5;
                                i7 = (268435455 & i7) | (bArr2[i12] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(omVar.o0(i7));
            }
            if (i4 != i5) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    @Override // com.thinkup.core.common.o0m.o.o.m
    public final /* synthetic */ byte[] o(Set<String> set) {
        int i2;
        Set<String> set2 = set;
        if (set2.isEmpty()) {
            return new byte[0];
        }
        int size = set2.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i3 = 0;
        int i4 = 0;
        for (String str : set2) {
            if (str == null) {
                i3 += 5;
                iArr[i4] = -1;
            } else {
                int iM = om.m(str);
                strArr[i4] = str;
                iArr[i4] = iM;
                if ((iM >> 7) == 0) {
                    i2 = 1;
                } else if ((iM >> 14) == 0) {
                    i2 = 2;
                } else if ((iM >> 21) == 0) {
                    i2 = 3;
                } else {
                    i2 = (iM >> 28) == 0 ? 4 : 5;
                }
                i3 = i2 + iM + i3;
            }
            i4++;
        }
        om omVar = new om(i3);
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = iArr[i5];
            int i7 = omVar.m;
            int i8 = i6;
            while ((i8 & (-128)) != 0) {
                omVar.o[i7] = (byte) ((i8 & 127) | 128);
                i8 >>>= 7;
                i7++;
            }
            omVar.o[i7] = (byte) i8;
            omVar.m = i7 + 1;
            if (i6 >= 0) {
                omVar.o(strArr[i5]);
            }
        }
        return omVar.o;
    }

    @Override // com.thinkup.core.common.o0m.o.o.m
    public final String o() {
        return "StringSet";
    }

    /* JADX INFO: renamed from: o, reason: avoid collision after fix types in other method */
    private static byte[] o2(Set<String> set) {
        int i2;
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i3 = 0;
        int i4 = 0;
        for (String str : set) {
            if (str == null) {
                i3 += 5;
                iArr[i4] = -1;
            } else {
                int iM = om.m(str);
                strArr[i4] = str;
                iArr[i4] = iM;
                if ((iM >> 7) == 0) {
                    i2 = 1;
                } else if ((iM >> 14) == 0) {
                    i2 = 2;
                } else if ((iM >> 21) == 0) {
                    i2 = 3;
                } else {
                    i2 = (iM >> 28) == 0 ? 4 : 5;
                }
                i3 = i2 + iM + i3;
            }
            i4++;
        }
        om omVar = new om(i3);
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = iArr[i5];
            int i7 = omVar.m;
            int i8 = i6;
            while ((i8 & (-128)) != 0) {
                omVar.o[i7] = (byte) ((i8 & 127) | 128);
                i8 >>>= 7;
                i7++;
            }
            omVar.o[i7] = (byte) i8;
            omVar.m = i7 + 1;
            if (i6 >= 0) {
                omVar.o(strArr[i5]);
            }
        }
        return omVar.o;
    }

    @Override // com.thinkup.core.common.o0m.o.o.m
    public final /* synthetic */ Set<String> o(byte[] bArr, int i2, int i3) {
        int i4;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i3 > 0) {
            om omVar = new om(bArr, i2);
            int i5 = i2 + i3;
            while (true) {
                i4 = omVar.m;
                if (i4 >= i5) {
                    break;
                }
                byte[] bArr2 = omVar.o;
                int i6 = i4 + 1;
                omVar.m = i6;
                int i7 = bArr2[i4];
                if ((i7 >> 7) != 0) {
                    int i8 = i4 + 2;
                    omVar.m = i8;
                    i7 = (i7 & 127) | (bArr2[i6] << 7);
                    if ((i7 >> 14) != 0) {
                        int i9 = i7 & 16383;
                        int i10 = i4 + 3;
                        omVar.m = i10;
                        int i11 = i9 | (bArr2[i8] << 14);
                        if ((i11 >> 21) == 0) {
                            i7 = i11;
                        } else {
                            int i12 = i4 + 4;
                            omVar.m = i12;
                            i7 = (bArr2[i10] << 21) | (i11 & 2097151);
                            if ((i7 >> 28) != 0) {
                                omVar.m = i4 + 5;
                                i7 = (268435455 & i7) | (bArr2[i12] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(omVar.o0(i7));
            }
            if (i4 != i5) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }
}

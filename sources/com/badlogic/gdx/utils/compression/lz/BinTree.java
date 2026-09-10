package com.badlogic.gdx.utils.compression.lz;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class BinTree extends InWindow {
    private static final int[] CrcTable = new int[256];
    static final int kBT2HashSize = 65536;
    static final int kEmptyHashValue = 0;
    static final int kHash2Size = 1024;
    static final int kHash3Offset = 1024;
    static final int kHash3Size = 65536;
    static final int kMaxValForNormalize = 1073741823;
    static final int kStartMaxLen = 1;
    int _cyclicBufferPos;
    int[] _hash;
    int _hashMask;
    int _matchMaxLen;
    int[] _son;
    int _cyclicBufferSize = 0;
    int _cutValue = 255;
    int _hashSizeSum = 0;
    boolean HASH_ARRAY = true;
    int kNumHashDirectBytes = 0;
    int kMinMatchCheck = 4;
    int kFixHashSize = 66560;

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                i2 = (i2 & 1) != 0 ? (i2 >>> 1) ^ (-306674912) : i2 >>> 1;
            }
            CrcTable[i] = i2;
        }
    }

    public boolean Create(int i, int i2, int i3, int i4) {
        int i5;
        if (i > 1073741567) {
            return false;
        }
        this._cutValue = (i3 >> 1) + 16;
        int i6 = i2 + i;
        super.Create(i6, i4 + i3, (((i6 + i3) + i4) / 2) + 256);
        this._matchMaxLen = i3;
        int i7 = i + 1;
        if (this._cyclicBufferSize != i7) {
            this._cyclicBufferSize = i7;
            this._son = new int[i7 * 2];
        }
        if (this.HASH_ARRAY) {
            int i8 = i - 1;
            int i9 = i8 | (i8 >> 1);
            int i10 = i9 | (i9 >> 2);
            int i11 = i10 | (i10 >> 4);
            int i12 = ((i11 | (i11 >> 8)) >> 1) | 65535;
            if (i12 > 16777216) {
                i12 >>= 1;
            }
            this._hashMask = i12;
            i5 = i12 + 1 + this.kFixHashSize;
        } else {
            i5 = 65536;
        }
        if (i5 != this._hashSizeSum) {
            this._hashSizeSum = i5;
            this._hash = new int[i5];
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    public int GetMatches(int[] iArr) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this._pos;
        int i9 = this._matchMaxLen;
        int i10 = i8 + i9;
        int i11 = this._streamPos;
        if (i10 > i11 && (i9 = i11 - i8) < this.kMinMatchCheck) {
            MovePos();
            return 0;
        }
        int i12 = this._cyclicBufferSize;
        int i13 = i8 > i12 ? i8 - i12 : 0;
        int i14 = this._bufferOffset;
        int i15 = i14 + i8;
        boolean z = this.HASH_ARRAY;
        if (z) {
            int[] iArr2 = CrcTable;
            byte[] bArr = this._bufferBase;
            int i16 = iArr2[bArr[i15] & 255] ^ (bArr[i15 + 1] & 255);
            i2 = i16 & 1023;
            int i17 = i16 ^ ((bArr[i15 + 2] & 255) << 8);
            i3 = 65535 & i17;
            i = ((iArr2[bArr[i15 + 3] & 255] << 5) ^ i17) & this._hashMask;
        } else {
            byte[] bArr2 = this._bufferBase;
            i = ((bArr2[i15 + 1] & 255) << 8) ^ (bArr2[i15] & 255);
            i2 = 0;
            i3 = 0;
        }
        int[] iArr3 = this._hash;
        int i18 = this.kFixHashSize;
        int i19 = iArr3[i18 + i];
        if (z) {
            int i20 = iArr3[i2];
            int i21 = i3 + 1024;
            int i22 = iArr3[i21];
            iArr3[i2] = i8;
            iArr3[i21] = i8;
            if (i20 > i13) {
                byte[] bArr3 = this._bufferBase;
                if (bArr3[i14 + i20] == bArr3[i15]) {
                    iArr[0] = 2;
                    iArr[1] = (i8 - i20) - 1;
                    i4 = 2;
                    i5 = 2;
                } else {
                    i4 = 1;
                    i5 = 0;
                }
            } else {
                i4 = 1;
                i5 = 0;
            }
            if (i22 > i13) {
                byte[] bArr4 = this._bufferBase;
                if (bArr4[i14 + i22] == bArr4[i15]) {
                    if (i22 == i20) {
                        i5 -= 2;
                    }
                    int i23 = i5 + 1;
                    iArr[i5] = 3;
                    i5 += 2;
                    iArr[i23] = (i8 - i22) - 1;
                    i20 = i22;
                    i4 = 3;
                }
            }
            if (i5 != 0 && i20 == i19) {
                i5 -= 2;
                i4 = 1;
            }
        } else {
            i4 = 1;
            i5 = 0;
        }
        iArr3[i18 + i] = i8;
        int i24 = this._cyclicBufferPos;
        int i25 = (i24 << 1) + 1;
        int i26 = i24 << 1;
        int i27 = this.kNumHashDirectBytes;
        if (i27 != 0 && i19 > i13) {
            byte[] bArr5 = this._bufferBase;
            if (bArr5[i14 + i19 + i27] != bArr5[i15 + i27]) {
                int i28 = i5 + 1;
                iArr[i5] = i27;
                i5 += 2;
                iArr[i28] = (i8 - i19) - 1;
                i4 = i27;
            }
        }
        int i29 = this._cutValue;
        int i30 = i27;
        while (i19 > i13) {
            int i31 = i29 - 1;
            if (i29 == 0) {
                break;
            }
            int i32 = this._pos - i19;
            int i33 = this._cyclicBufferPos;
            int i34 = (i32 <= i33 ? i33 - i32 : (i33 - i32) + this._cyclicBufferSize) << 1;
            int i35 = this._bufferOffset + i19;
            int iMin = Math.min(i27, i30);
            byte[] bArr6 = this._bufferBase;
            int i36 = i13;
            if (bArr6[i35 + iMin] == bArr6[i15 + iMin]) {
                while (true) {
                    i7 = iMin + 1;
                    if (i7 == i9) {
                        i6 = i30;
                        break;
                    }
                    byte[] bArr7 = this._bufferBase;
                    i6 = i30;
                    if (bArr7[i35 + i7] != bArr7[i15 + i7]) {
                        break;
                    }
                    iMin = i7;
                    i30 = i6;
                }
                if (i4 < i7) {
                    int i37 = i5 + 1;
                    iArr[i5] = i7;
                    i5 += 2;
                    iArr[i37] = i32 - 1;
                    if (i7 == i9) {
                        int[] iArr4 = this._son;
                        iArr4[i26] = iArr4[i34];
                        iArr4[i25] = iArr4[i34 + 1];
                    } else {
                        i4 = i7;
                        iMin = i4;
                    }
                } else {
                    iMin = i7;
                }
            } else {
                i6 = i30;
            }
            byte[] bArr8 = this._bufferBase;
            if ((bArr8[i35 + iMin] & 255) < (bArr8[i15 + iMin] & 255)) {
                int[] iArr5 = this._son;
                iArr5[i26] = i19;
                int i38 = i34 + 1;
                i19 = iArr5[i38];
                i26 = i38;
                i30 = iMin;
            } else {
                int[] iArr6 = this._son;
                iArr6[i25] = i19;
                i19 = iArr6[i34];
                i25 = i34;
                i27 = iMin;
                i30 = i6;
            }
            i29 = i31;
            i13 = i36;
            MovePos();
            return i5;
        }
        int[] iArr7 = this._son;
        iArr7[i26] = 0;
        iArr7[i25] = 0;
        MovePos();
        return i5;
    }

    @Override // com.badlogic.gdx.utils.compression.lz.InWindow
    public void Init() throws IOException {
        super.Init();
        for (int i = 0; i < this._hashSizeSum; i++) {
            this._hash[i] = 0;
        }
        this._cyclicBufferPos = 0;
        ReduceOffsets(-1);
    }

    @Override // com.badlogic.gdx.utils.compression.lz.InWindow
    public void MovePos() throws IOException {
        int i = this._cyclicBufferPos + 1;
        this._cyclicBufferPos = i;
        if (i >= this._cyclicBufferSize) {
            this._cyclicBufferPos = 0;
        }
        super.MovePos();
        if (this._pos == kMaxValForNormalize) {
            Normalize();
        }
    }

    public void Normalize() {
        int i = this._pos;
        int i2 = this._cyclicBufferSize;
        int i3 = i - i2;
        NormalizeLinks(this._son, i2 * 2, i3);
        NormalizeLinks(this._hash, this._hashSizeSum, i3);
        ReduceOffsets(i3);
    }

    public void NormalizeLinks(int[] iArr, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            iArr[i3] = i4 <= i2 ? 0 : i4 - i2;
        }
    }

    public void SetCutValue(int i) {
        this._cutValue = i;
    }

    public void SetType(int i) {
        boolean z = i > 2;
        this.HASH_ARRAY = z;
        if (z) {
            this.kNumHashDirectBytes = 0;
            this.kMinMatchCheck = 4;
            this.kFixHashSize = 66560;
        } else {
            this.kNumHashDirectBytes = 2;
            this.kMinMatchCheck = 3;
            this.kFixHashSize = 0;
        }
    }

    public void Skip(int i) throws IOException {
        int i2;
        byte[] bArr;
        int i3 = i;
        do {
            int i4 = this._pos;
            int i5 = this._matchMaxLen;
            int i6 = i4 + i5;
            int i7 = this._streamPos;
            if (i6 > i7 && (i5 = i7 - i4) < this.kMinMatchCheck) {
                MovePos();
            } else {
                int i8 = this._cyclicBufferSize;
                int i9 = i4 > i8 ? i4 - i8 : 0;
                int i10 = this._bufferOffset + i4;
                if (this.HASH_ARRAY) {
                    int[] iArr = CrcTable;
                    byte[] bArr2 = this._bufferBase;
                    int i11 = iArr[bArr2[i10] & 255] ^ (bArr2[i10 + 1] & 255);
                    int[] iArr2 = this._hash;
                    iArr2[i11 & 1023] = i4;
                    int i12 = i11 ^ ((bArr2[i10 + 2] & 255) << 8);
                    iArr2[(65535 & i12) + 1024] = i4;
                    i2 = ((iArr[bArr2[i10 + 3] & 255] << 5) ^ i12) & this._hashMask;
                } else {
                    byte[] bArr3 = this._bufferBase;
                    i2 = ((bArr3[i10 + 1] & 255) << 8) ^ (bArr3[i10] & 255);
                }
                int[] iArr3 = this._hash;
                int i13 = this.kFixHashSize;
                int i14 = iArr3[i13 + i2];
                iArr3[i13 + i2] = i4;
                int i15 = this._cyclicBufferPos;
                int i16 = (i15 << 1) + 1;
                int i17 = i15 << 1;
                int i18 = this.kNumHashDirectBytes;
                int i19 = i14;
                int i20 = this._cutValue;
                int i21 = i18;
                while (true) {
                    if (i19 > i9) {
                        int i22 = i20 - 1;
                        if (i20 != 0) {
                            int i23 = this._pos - i19;
                            int i24 = this._cyclicBufferPos;
                            int i25 = (i23 <= i24 ? i24 - i23 : (i24 - i23) + this._cyclicBufferSize) << 1;
                            int i26 = this._bufferOffset + i19;
                            int iMin = Math.min(i18, i21);
                            byte[] bArr4 = this._bufferBase;
                            if (bArr4[i26 + iMin] == bArr4[i10 + iMin]) {
                                do {
                                    iMin++;
                                    if (iMin == i5) {
                                        break;
                                    } else {
                                        bArr = this._bufferBase;
                                    }
                                } while (bArr[i26 + iMin] == bArr[i10 + iMin]);
                                if (iMin == i5) {
                                    int[] iArr4 = this._son;
                                    iArr4[i17] = iArr4[i25];
                                    iArr4[i16] = iArr4[i25 + 1];
                                    break;
                                }
                            }
                            byte[] bArr5 = this._bufferBase;
                            if ((bArr5[i26 + iMin] & 255) < (bArr5[i10 + iMin] & 255)) {
                                int[] iArr5 = this._son;
                                iArr5[i17] = i19;
                                int i27 = i25 + 1;
                                i19 = iArr5[i27];
                                i17 = i27;
                                i21 = iMin;
                            } else {
                                int[] iArr6 = this._son;
                                iArr6[i16] = i19;
                                i19 = iArr6[i25];
                                i16 = i25;
                                i18 = iMin;
                            }
                            i20 = i22;
                        }
                    }
                    int[] iArr7 = this._son;
                    iArr7[i17] = 0;
                    iArr7[i16] = 0;
                    break;
                }
                MovePos();
            }
            i3--;
        } while (i3 != 0);
    }
}

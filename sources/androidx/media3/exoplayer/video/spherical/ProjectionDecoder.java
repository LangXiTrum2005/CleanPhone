package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
final class ProjectionDecoder {
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    public static ArrayList a(ParsableByteArray parsableByteArray) {
        char c2;
        ArrayList arrayList;
        boolean z2;
        int i2;
        Object mesh;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        ArrayList arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        if (parsableByteArray2.u() == 0) {
            char c3 = 7;
            parsableByteArray2.H(7);
            int iG = parsableByteArray2.g();
            boolean z3 = true;
            if (iG == 1684433976) {
                ParsableByteArray parsableByteArray3 = new ParsableByteArray();
                Inflater inflater = new Inflater(true);
                try {
                    if (!Util.D(parsableByteArray2, parsableByteArray3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    parsableByteArray2 = parsableByteArray3;
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            } else if (iG == 1918990112) {
            }
            ArrayList arrayList3 = new ArrayList();
            int i3 = parsableByteArray2.f5668b;
            int i4 = parsableByteArray2.f5669c;
            while (i3 < i4) {
                int iG2 = parsableByteArray2.g() + i3;
                if (iG2 > i3 && iG2 <= i4) {
                    if (parsableByteArray2.g() == 1835365224) {
                        int iG3 = parsableByteArray2.g();
                        if (iG3 > 10000) {
                            c2 = c3;
                            ArrayList arrayList4 = arrayList2;
                            arrayList = arrayList4;
                            z2 = z3;
                            i2 = i4;
                            mesh = arrayList4;
                        } else {
                            float[] fArr = new float[iG3];
                            for (int i5 = 0; i5 < iG3; i5++) {
                                fArr[i5] = Float.intBitsToFloat(parsableByteArray2.g());
                            }
                            int iG4 = parsableByteArray2.g();
                            if (iG4 > 32000) {
                                c2 = c3;
                                ArrayList arrayList5 = arrayList2;
                                arrayList = arrayList5;
                                z2 = z3;
                                i2 = i4;
                                mesh = arrayList5;
                            } else {
                                double dLog = Math.log(2.0d);
                                c2 = c3;
                                ArrayList arrayList6 = arrayList2;
                                int iCeil = (int) Math.ceil(Math.log(((double) iG3) * 2.0d) / dLog);
                                z2 = z3;
                                byte[] bArr = parsableByteArray2.f5667a;
                                ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, bArr.length);
                                parsableBitArray.m(parsableByteArray2.f5668b * 8);
                                float[] fArr2 = new float[iG4 * 5];
                                int i6 = 5;
                                int[] iArr = new int[5];
                                ArrayList arrayList7 = arrayList6;
                                int i7 = 0;
                                int i8 = 0;
                                while (true) {
                                    if (i7 < iG4) {
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 < i6) {
                                                int i10 = iArr[i9];
                                                int iG5 = parsableBitArray.g(iCeil);
                                                int i11 = i10 + ((iG5 >> 1) ^ (-(iG5 & 1)));
                                                if (i11 < iG3 && i11 >= 0) {
                                                    fArr2[i8] = fArr[i11];
                                                    iArr[i9] = i11;
                                                    i9++;
                                                    i8++;
                                                    i6 = 5;
                                                }
                                            } else {
                                                i7++;
                                                i6 = 5;
                                            }
                                        }
                                    } else {
                                        parsableBitArray.m((parsableBitArray.e() + 7) & (-8));
                                        int i12 = 32;
                                        int iG6 = parsableBitArray.g(32);
                                        Projection.SubMesh[] subMeshArr = new Projection.SubMesh[iG6];
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < iG6) {
                                                int iG7 = parsableBitArray.g(8);
                                                int iG8 = parsableBitArray.g(8);
                                                int iG9 = parsableBitArray.g(i12);
                                                if (iG9 <= 128000) {
                                                    int i14 = iG6;
                                                    float[] fArr3 = fArr2;
                                                    int iCeil2 = (int) Math.ceil(Math.log(((double) iG4) * 2.0d) / dLog);
                                                    float[] fArr4 = new float[iG9 * 3];
                                                    float[] fArr5 = new float[iG9 * 2];
                                                    i2 = i4;
                                                    int i15 = 0;
                                                    int i16 = 0;
                                                    while (true) {
                                                        if (i15 < iG9) {
                                                            int iG10 = parsableBitArray.g(iCeil2);
                                                            ParsableBitArray parsableBitArray2 = parsableBitArray;
                                                            int i17 = i16 + ((iG10 >> 1) ^ (-(iG10 & 1)));
                                                            if (i17 >= 0 && i17 < iG4) {
                                                                int i18 = i15 * 3;
                                                                int i19 = i17 * 5;
                                                                fArr4[i18] = fArr3[i19];
                                                                fArr4[i18 + 1] = fArr3[i19 + 1];
                                                                fArr4[i18 + 2] = fArr3[i19 + 2];
                                                                int i20 = i15 * 2;
                                                                fArr5[i20] = fArr3[i19 + 3];
                                                                fArr5[i20 + 1] = fArr3[i19 + 4];
                                                                i15++;
                                                                i16 = i17;
                                                                parsableBitArray = parsableBitArray2;
                                                            }
                                                        } else {
                                                            subMeshArr[i13] = new Projection.SubMesh(iG7, fArr4, fArr5, iG8);
                                                            i13++;
                                                            iG6 = i14;
                                                            fArr2 = fArr3;
                                                            i4 = i2;
                                                            parsableBitArray = parsableBitArray;
                                                            i12 = 32;
                                                        }
                                                    }
                                                }
                                                mesh = arrayList7;
                                                arrayList = arrayList7;
                                            } else {
                                                i2 = i4;
                                                mesh = new Projection.Mesh(subMeshArr);
                                                arrayList = arrayList7;
                                            }
                                        }
                                    }
                                    i2 = i4;
                                    mesh = arrayList7;
                                    arrayList = arrayList7;
                                }
                            }
                        }
                        if (mesh == null) {
                            return arrayList;
                        }
                        arrayList3.add(mesh);
                    } else {
                        c2 = c3;
                        arrayList = arrayList2;
                        z2 = z3;
                        i2 = i4;
                    }
                    parsableByteArray2.G(iG2);
                    i3 = iG2;
                    c3 = c2;
                    z3 = z2;
                    arrayList2 = arrayList;
                    i4 = i2;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }
}

package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.l90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3940l90 implements InterfaceC2508Ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f4637a;
    public final C3692iN c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public final int[] j;
    public int k;
    public C2715Qx l;
    public Bitmap m;
    public final boolean n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public Boolean s;
    public final int[] b = new int[256];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public C3940l90(C3692iN c3692iN, C2715Qx c2715Qx, ByteBuffer byteBuffer, int i) {
        this.c = c3692iN;
        this.l = new C2715Qx();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.o = 0;
                this.l = c2715Qx;
                this.k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator it = c2715Qx.e.iterator();
                while (it.hasNext()) {
                    if (((C2585Lx) it.next()).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = iHighestOneBit;
                int i2 = c2715Qx.f;
                this.r = i2 / iHighestOneBit;
                int i3 = c2715Qx.g;
                this.q = i3 / iHighestOneBit;
                this.i = this.c.H(i2 * i3);
                C3692iN c3692iN2 = this.c;
                int i4 = this.r * this.q;
                Object obj = c3692iN2.c;
                this.j = ((C4391qK) obj) == null ? new int[i4] : (int[]) ((C4391qK) obj).d(i4, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.s;
        Bitmap bitmapE = ((InterfaceC2459Ha) this.c.b).e(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        bitmapE.setHasAlpha(true);
        return bitmapE;
    }

    public final synchronized Bitmap b() {
        try {
            if (this.l.c <= 0 || this.k < 0) {
                if (Log.isLoggable("l90", 3)) {
                    int i = this.l.c;
                }
                this.o = 1;
            }
            int i2 = this.o;
            if (i2 != 1 && i2 != 2) {
                this.o = 0;
                if (this.e == null) {
                    this.e = this.c.H(255);
                }
                C2585Lx c2585Lx = (C2585Lx) this.l.e.get(this.k);
                int i3 = this.k - 1;
                C2585Lx c2585Lx2 = i3 >= 0 ? (C2585Lx) this.l.e.get(i3) : null;
                int[] iArr = c2585Lx.k;
                if (iArr == null) {
                    iArr = this.l.f3634a;
                }
                this.f4637a = iArr;
                if (iArr == null) {
                    this.o = 1;
                    return null;
                }
                if (c2585Lx.f) {
                    System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                    int[] iArr2 = this.b;
                    this.f4637a = iArr2;
                    iArr2[c2585Lx.h] = 0;
                    if (c2585Lx.g == 2 && this.k == 0) {
                        this.s = Boolean.TRUE;
                    }
                }
                return d(c2585Lx, c2585Lx2);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v32, types: [short] */
    /* JADX WARN: Type inference failed for: r5v34 */
    public final Bitmap d(C2585Lx c2585Lx, C2585Lx c2585Lx2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        short s;
        int i9;
        Bitmap bitmap;
        int i10;
        int[] iArr = this.j;
        C3692iN c3692iN = this.c;
        if (c2585Lx2 == null) {
            Bitmap bitmap2 = this.m;
            if (bitmap2 != null) {
                ((InterfaceC2459Ha) c3692iN.b).a(bitmap2);
            }
            this.m = null;
            Arrays.fill(iArr, 0);
        }
        if (c2585Lx2 != null && c2585Lx2.g == 3 && this.m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c2585Lx2 != null && (i9 = c2585Lx2.g) > 0) {
            if (i9 == 2) {
                if (c2585Lx.f) {
                    i10 = 0;
                } else {
                    C2715Qx c2715Qx = this.l;
                    i10 = c2715Qx.k;
                    if (c2585Lx.k != null && c2715Qx.j == c2585Lx.h) {
                        i10 = 0;
                    }
                }
                int i11 = c2585Lx2.d;
                int i12 = this.p;
                int i13 = i11 / i12;
                int i14 = c2585Lx2.b / i12;
                int i15 = c2585Lx2.c / i12;
                int i16 = c2585Lx2.f3381a / i12;
                int i17 = this.r;
                int i18 = (i14 * i17) + i16;
                int i19 = (i13 * i17) + i18;
                while (i18 < i19) {
                    int i20 = i18 + i15;
                    for (int i21 = i18; i21 < i20; i21++) {
                        iArr[i21] = i10;
                    }
                    i18 += this.r;
                }
            } else if (i9 == 3 && (bitmap = this.m) != null) {
                int i22 = this.r;
                bitmap.getPixels(iArr, 0, i22, 0, 0, i22, this.q);
            }
        }
        this.d.position(c2585Lx.j);
        int i23 = c2585Lx.c * c2585Lx.d;
        byte[] bArr = this.i;
        if (bArr == null || bArr.length < i23) {
            this.i = c3692iN.H(i23);
        }
        byte[] bArr2 = this.i;
        if (this.f == null) {
            this.f = new short[4096];
        }
        short[] sArr = this.f;
        if (this.g == null) {
            this.g = new byte[4096];
        }
        byte[] bArr3 = this.g;
        if (this.h == null) {
            this.h = new byte[4097];
        }
        byte[] bArr4 = this.h;
        int i24 = this.d.get() & 255;
        int i25 = 1 << i24;
        int i26 = i25 + 1;
        int i27 = i25 + 2;
        int i28 = i24 + 1;
        int i29 = (1 << i28) - 1;
        for (int i30 = 0; i30 < i25; i30++) {
            sArr[i30] = 0;
            bArr3[i30] = (byte) i30;
        }
        byte[] bArr5 = this.e;
        int i31 = i28;
        int i32 = i27;
        int i33 = i29;
        int i34 = 0;
        int i35 = -1;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        while (i34 < i23) {
            if (i36 == 0) {
                int i43 = this.d.get() & 255;
                if (i43 > 0) {
                    ByteBuffer byteBuffer = this.d;
                    byteBuffer.get(this.e, 0, Math.min(i43, byteBuffer.remaining()));
                }
                if (i43 <= 0) {
                    this.o = 3;
                    break;
                }
                i36 = i43;
                i37 = 0;
            } else {
                i28 = i28;
                i34 = i34;
            }
            i39 += (bArr5[i37] & 255) << i38;
            i37++;
            i36--;
            i35 = i35;
            int i44 = i38 + 8;
            i32 = i32;
            i31 = i31;
            i34 = i34;
            bArr5 = bArr5;
            i41 = i41;
            while (true) {
                if (i44 < i31) {
                    i38 = i44;
                    break;
                }
                iArr = iArr;
                int i45 = i39 & i33;
                i39 >>= i31;
                i44 -= i31;
                if (i45 == i25) {
                    i32 = i27;
                    i33 = i29;
                    i31 = i28;
                    i35 = -1;
                } else {
                    if (i45 == i26) {
                        iArr = iArr;
                        i38 = i44;
                        break;
                    }
                    if (i35 == -1) {
                        bArr2[i40] = bArr3[i45];
                        i40++;
                        i34++;
                        i41 = i45;
                        i35 = i41;
                        i44 = i44;
                    } else {
                        if (i45 >= i32) {
                            bArr4[i42] = (byte) i41;
                            i42++;
                            s = i35;
                        } else {
                            s = i45;
                        }
                        while (s >= i25) {
                            bArr4[i42] = bArr3[s];
                            i42++;
                            s = sArr[s];
                        }
                        int i46 = bArr3[s] & 255;
                        byte b = (byte) i46;
                        bArr2[i40] = b;
                        while (true) {
                            i40++;
                            i34++;
                            if (i42 <= 0) {
                                break;
                            }
                            i42--;
                            bArr2[i40] = bArr4[i42];
                        }
                        if (i32 < 4096) {
                            sArr[i32] = (short) i35;
                            bArr3[i32] = b;
                            i32++;
                            if ((i32 & i33) == 0 && i32 < 4096) {
                                i31++;
                                i33 += i32;
                            }
                        }
                        i35 = i45;
                        i44 = i44;
                        i41 = i46;
                    }
                }
            }
        }
        int[] iArr2 = iArr;
        Arrays.fill(bArr2, i40, i23, (byte) 0);
        if (c2585Lx.e || this.p != 1) {
            int[] iArr3 = this.j;
            int i47 = c2585Lx.d;
            int i48 = this.p;
            int i49 = i47 / i48;
            int i50 = c2585Lx.b / i48;
            int i51 = c2585Lx.c / i48;
            int i52 = c2585Lx.f3381a / i48;
            boolean z = this.k == 0;
            int i53 = this.r;
            int i54 = this.q;
            byte[] bArr6 = this.i;
            int[] iArr4 = this.f4637a;
            Boolean bool = this.s;
            int i55 = 0;
            int i56 = 0;
            int i57 = 1;
            int i58 = 8;
            while (i55 < i49) {
                Boolean bool2 = bool;
                if (c2585Lx.e) {
                    if (i56 >= i49) {
                        int i59 = i57 + 1;
                        i = i49;
                        if (i59 == 2) {
                            i57 = i59;
                            i56 = 4;
                        } else if (i59 == 3) {
                            i57 = i59;
                            i56 = 2;
                            i58 = 4;
                        } else if (i59 != 4) {
                            i57 = i59;
                        } else {
                            i57 = i59;
                            i56 = 1;
                            i58 = 2;
                        }
                    } else {
                        i = i49;
                    }
                    i2 = i56 + i58;
                } else {
                    i = i49;
                    i2 = i56;
                    i56 = i55;
                }
                int i60 = i56 + i50;
                boolean z2 = i48 == 1;
                if (i60 < i54) {
                    int i61 = i60 * i53;
                    int i62 = i61 + i52;
                    int i63 = i62 + i51;
                    int i64 = i61 + i53;
                    if (i64 < i63) {
                        i63 = i64;
                    }
                    int i65 = i55 * i48 * c2585Lx.c;
                    if (z2) {
                        bool = bool2;
                        int i66 = i62;
                        while (i66 < i63) {
                            int i67 = i51;
                            int i68 = iArr4[bArr6[i65] & 255];
                            if (i68 != 0) {
                                iArr3[i66] = i68;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i65 += i48;
                            i66++;
                            i51 = i67;
                        }
                        i3 = i51;
                    } else {
                        i3 = i51;
                        int i69 = ((i63 - i62) * i48) + i65;
                        bool = bool2;
                        int i70 = i62;
                        while (i70 < i63) {
                            int i71 = i63;
                            int i72 = c2585Lx.c;
                            int i73 = i52;
                            int i74 = i53;
                            int i75 = i65;
                            int i76 = 0;
                            int i77 = 0;
                            int i78 = 0;
                            int i79 = 0;
                            int i80 = 0;
                            while (true) {
                                if (i75 >= this.p + i65) {
                                    i7 = i54;
                                    break;
                                }
                                byte[] bArr7 = this.i;
                                i7 = i54;
                                if (i75 >= bArr7.length || i75 >= i69) {
                                    break;
                                }
                                int i81 = this.f4637a[bArr7[i75] & 255];
                                if (i81 != 0) {
                                    i76 += (i81 >> 24) & 255;
                                    i77 += (i81 >> 16) & 255;
                                    i78 += (i81 >> 8) & 255;
                                    i79 += i81 & 255;
                                    i80++;
                                }
                                i75++;
                                i54 = i7;
                            }
                            int i82 = i72 + i65;
                            for (int i83 = i82; i83 < this.p + i82; i83++) {
                                byte[] bArr8 = this.i;
                                if (i83 >= bArr8.length || i83 >= i69) {
                                    break;
                                }
                                int i84 = this.f4637a[bArr8[i83] & 255];
                                if (i84 != 0) {
                                    i76 += (i84 >> 24) & 255;
                                    i77 += (i84 >> 16) & 255;
                                    i78 += (i84 >> 8) & 255;
                                    i79 += i84 & 255;
                                    i80++;
                                }
                            }
                            int i85 = i80 == 0 ? 0 : ((i76 / i80) << 24) | ((i77 / i80) << 16) | ((i78 / i80) << 8) | (i79 / i80);
                            if (i85 != 0) {
                                iArr3[i70] = i85;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i65 += i48;
                            i70++;
                            i63 = i71;
                            i52 = i73;
                            i53 = i74;
                            i54 = i7;
                        }
                    }
                    i4 = i52;
                    i5 = i53;
                    i6 = i54;
                } else {
                    i3 = i51;
                    i4 = i52;
                    i5 = i53;
                    i6 = i54;
                    bool = bool2;
                }
                i55++;
                i49 = i;
                i56 = i2;
                i50 = i50;
                i51 = i3;
                i52 = i4;
                i53 = i5;
                i54 = i6;
            }
            Boolean bool3 = bool;
            if (this.s == null) {
                this.s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
            }
        } else {
            int[] iArr5 = this.j;
            int i86 = c2585Lx.d;
            int i87 = c2585Lx.b;
            int i88 = c2585Lx.c;
            int i89 = c2585Lx.f3381a;
            boolean z3 = this.k == 0;
            int i90 = this.r;
            byte[] bArr9 = this.i;
            int[] iArr6 = this.f4637a;
            byte b2 = -1;
            for (int i91 = 0; i91 < i86; i91++) {
                int i92 = (i91 + i87) * i90;
                int i93 = i92 + i89;
                int i94 = i93 + i88;
                int i95 = i92 + i90;
                if (i95 < i94) {
                    i94 = i95;
                }
                int i96 = c2585Lx.c * i91;
                while (i93 < i94) {
                    int i97 = i86;
                    byte b3 = bArr9[i96];
                    int i98 = i87;
                    int i99 = b3 & 255;
                    if (i99 != b2) {
                        int i100 = iArr6[i99];
                        if (i100 != 0) {
                            iArr5[i93] = i100;
                        } else {
                            b2 = b3;
                        }
                    }
                    i96++;
                    i93++;
                    i86 = i97;
                    i87 = i98;
                }
            }
            Boolean bool4 = this.s;
            this.s = Boolean.valueOf((bool4 != null && bool4.booleanValue()) || (this.s == null && z3 && b2 != -1));
        }
        if (this.n && ((i8 = c2585Lx.g) == 0 || i8 == 1)) {
            if (this.m == null) {
                this.m = a();
            }
            Bitmap bitmap3 = this.m;
            int i101 = this.r;
            bitmap3.setPixels(iArr2, 0, i101, 0, 0, i101, this.q);
        }
        Bitmap bitmapA = a();
        int i102 = this.r;
        bitmapA.setPixels(iArr2, 0, i102, 0, 0, i102, this.q);
        return bitmapA;
    }
}

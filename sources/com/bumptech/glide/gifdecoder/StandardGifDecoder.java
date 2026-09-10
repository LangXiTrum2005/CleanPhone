package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class StandardGifDecoder implements GifDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f12341a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GifDecoder.BitmapProvider f12343c;
    public ByteBuffer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f12344e;
    public short[] f;
    public byte[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f12345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f12346i;
    public final int[] j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public GifHeader f12347l;
    public Bitmap m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f12348n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f12349p;
    public final int q;
    public final int r;
    public Boolean s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f12342b = new int[256];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i2) {
        this.f12343c = bitmapProvider;
        this.f12347l = new GifHeader();
        synchronized (this) {
            try {
                if (i2 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
                }
                int iHighestOneBit = Integer.highestOneBit(i2);
                this.o = 0;
                this.f12347l = gifHeader;
                this.k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.f12348n = false;
                Iterator it = gifHeader.f12335e.iterator();
                while (it.hasNext()) {
                    if (((GifFrame) it.next()).g == 3) {
                        this.f12348n = true;
                        break;
                    }
                }
                this.f12349p = iHighestOneBit;
                int i3 = gifHeader.f;
                this.r = i3 / iHighestOneBit;
                int i4 = gifHeader.g;
                this.q = i4 / iHighestOneBit;
                this.f12346i = this.f12343c.b(i3 * i4);
                this.j = this.f12343c.d(this.r * this.q);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public final synchronized Bitmap a() {
        try {
            if (this.f12347l.f12334c <= 0 || this.k < 0) {
                if (Log.isLoggable("StandardGifDecoder", 3)) {
                    Log.d("StandardGifDecoder", "Unable to decode frame, frameCount=" + this.f12347l.f12334c + ", framePointer=" + this.k);
                }
                this.o = 1;
            }
            int i2 = this.o;
            if (i2 != 1 && i2 != 2) {
                this.o = 0;
                if (this.f12344e == null) {
                    this.f12344e = this.f12343c.b(255);
                }
                GifFrame gifFrame = (GifFrame) this.f12347l.f12335e.get(this.k);
                int i3 = this.k - 1;
                GifFrame gifFrame2 = i3 >= 0 ? (GifFrame) this.f12347l.f12335e.get(i3) : null;
                int[] iArr = gifFrame.k;
                if (iArr == null) {
                    iArr = this.f12347l.f12332a;
                }
                this.f12341a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("StandardGifDecoder", 3)) {
                        Log.d("StandardGifDecoder", "No valid color table found for frame #" + this.k);
                    }
                    this.o = 1;
                    return null;
                }
                if (gifFrame.f) {
                    System.arraycopy(iArr, 0, this.f12342b, 0, iArr.length);
                    int[] iArr2 = this.f12342b;
                    this.f12341a = iArr2;
                    iArr2[gifFrame.f12330h] = 0;
                    if (gifFrame.g == 2 && this.k == 0) {
                        this.s = Boolean.TRUE;
                    }
                }
                return f(gifFrame, gifFrame2);
            }
            if (Log.isLoggable("StandardGifDecoder", 3)) {
                Log.d("StandardGifDecoder", "Unable to decode frame, status=" + this.o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        this.k = (this.k + 1) % this.f12347l.f12334c;
    }

    public final Bitmap c() {
        Boolean bool = this.s;
        Bitmap bitmapC = this.f12343c.c(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        bitmapC.setHasAlpha(true);
        return bitmapC;
    }

    public final int d() {
        int i2;
        GifHeader gifHeader = this.f12347l;
        int i3 = gifHeader.f12334c;
        if (i3 <= 0 || (i2 = this.k) < 0) {
            return 0;
        }
        if (i2 < 0 || i2 >= i3) {
            return -1;
        }
        return ((GifFrame) gifHeader.f12335e.get(i2)).f12331i;
    }

    public final void e(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v19, types: [short] */
    /* JADX WARN: Type inference failed for: r6v21 */
    public final Bitmap f(GifFrame gifFrame, GifFrame gifFrame2) {
        byte b2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        short s;
        int i8;
        Bitmap bitmap;
        int i9;
        int[] iArr2 = this.j;
        GifDecoder.BitmapProvider bitmapProvider = this.f12343c;
        byte b3 = 0;
        if (gifFrame2 == null) {
            Bitmap bitmap2 = this.m;
            if (bitmap2 != null) {
                bitmapProvider.a(bitmap2);
            }
            this.m = null;
            Arrays.fill(iArr2, 0);
        }
        if (gifFrame2 != null && gifFrame2.g == 3 && this.m == null) {
            Arrays.fill(iArr2, 0);
        }
        if (gifFrame2 != null && (i8 = gifFrame2.g) > 0) {
            if (i8 == 2) {
                if (gifFrame.f) {
                    i9 = 0;
                } else {
                    GifHeader gifHeader = this.f12347l;
                    i9 = gifHeader.k;
                    if (gifFrame.k != null && gifHeader.j == gifFrame.f12330h) {
                        i9 = 0;
                    }
                }
                int i10 = gifFrame2.d;
                int i11 = this.f12349p;
                int i12 = i10 / i11;
                int i13 = gifFrame2.f12327b / i11;
                int i14 = gifFrame2.f12328c / i11;
                int i15 = gifFrame2.f12326a / i11;
                int i16 = this.r;
                int i17 = (i13 * i16) + i15;
                int i18 = (i12 * i16) + i17;
                while (i17 < i18) {
                    int i19 = i17 + i14;
                    for (int i20 = i17; i20 < i19; i20++) {
                        iArr2[i20] = i9;
                    }
                    i17 += this.r;
                }
            } else if (i8 == 3 && (bitmap = this.m) != null) {
                int i21 = this.r;
                bitmap.getPixels(iArr2, 0, i21, 0, 0, i21, this.q);
            }
        }
        int[] iArr3 = iArr2;
        this.d.position(gifFrame.j);
        int i22 = gifFrame.f12328c * gifFrame.d;
        byte[] bArr = this.f12346i;
        if (bArr == null || bArr.length < i22) {
            this.f12346i = bitmapProvider.b(i22);
        }
        byte[] bArr2 = this.f12346i;
        if (this.f == null) {
            this.f = new short[4096];
        }
        short[] sArr = this.f;
        if (this.g == null) {
            this.g = new byte[4096];
        }
        byte[] bArr3 = this.g;
        if (this.f12345h == null) {
            this.f12345h = new byte[4097];
        }
        byte[] bArr4 = this.f12345h;
        int i23 = this.d.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i24 = 1;
        int i25 = 1 << i23;
        int i26 = i25 + 1;
        int i27 = i25 + 2;
        int i28 = i23 + 1;
        int i29 = (1 << i28) - 1;
        int i30 = 0;
        while (i30 < i25) {
            sArr[i30] = 0;
            bArr3[i30] = (byte) i30;
            i30++;
            i24 = i24;
        }
        int i31 = i24;
        byte[] bArr5 = this.f12344e;
        int i32 = i28;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = i27;
        int i42 = i29;
        int i43 = -1;
        while (true) {
            if (i33 >= i22) {
                iArr3 = iArr3;
                b2 = b3;
                break;
            }
            if (i34 == 0) {
                i7 = -1;
                int i44 = this.d.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i44 > 0) {
                    ByteBuffer byteBuffer = this.d;
                    byteBuffer.get(this.f12344e, 0, Math.min(i44, byteBuffer.remaining()));
                }
                if (i44 <= 0) {
                    this.o = 3;
                    b2 = 0;
                    break;
                }
                i34 = i44;
                i35 = 0;
            } else {
                iArr3 = iArr3;
                sArr = sArr;
                i7 = -1;
            }
            i37 += (bArr5[i35] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i36;
            i35++;
            i34--;
            i36 += 8;
            i41 = i41;
            i32 = i32;
            i43 = i43;
            i39 = i39;
            while (true) {
                i36 = i36;
                if (i36 < i32) {
                    b3 = 0;
                    break;
                }
                int i45 = i37 & i42;
                i37 >>= i32;
                i36 -= i32;
                if (i45 == i25) {
                    i32 = i28;
                    i41 = i27;
                    i42 = i29;
                    i36 = i36;
                    i43 = i7;
                } else {
                    if (i45 == i26) {
                        b3 = 0;
                        break;
                    }
                    int i46 = i33;
                    if (i43 == i7) {
                        bArr2[i38] = bArr3[i45];
                        i38++;
                        i33 = i46 + 1;
                        i43 = i45;
                        i39 = i43;
                    } else {
                        if (i45 >= i41) {
                            bArr4[i40] = (byte) i39;
                            i40++;
                            s = i43;
                        } else {
                            s = i45;
                        }
                        while (s >= i25) {
                            bArr4[i40] = bArr3[s];
                            i40++;
                            s = sArr[s];
                        }
                        i39 = bArr3[s] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        byte b4 = (byte) i39;
                        bArr2[i38] = b4;
                        while (true) {
                            i38++;
                            i46++;
                            if (i40 <= 0) {
                                break;
                            }
                            i40--;
                            bArr2[i38] = bArr4[i40];
                        }
                        if (i41 < 4096) {
                            sArr[i41] = (short) i43;
                            bArr3[i41] = b4;
                            i41++;
                            if ((i41 & i42) == 0 && i41 < 4096) {
                                i32++;
                                i42 += i41;
                            }
                        }
                        i33 = i46;
                        i43 = i45;
                    }
                    i7 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i38, i22, b2);
        if (gifFrame.f12329e || this.f12349p != i31) {
            int[] iArr4 = this.j;
            int i47 = gifFrame.d;
            int i48 = this.f12349p;
            int i49 = i47 / i48;
            int i50 = gifFrame.f12327b / i48;
            int i51 = gifFrame.f12328c / i48;
            int i52 = gifFrame.f12326a / i48;
            boolean z2 = this.k == 0;
            int i53 = this.r;
            int i54 = this.q;
            byte[] bArr6 = this.f12346i;
            int[] iArr5 = this.f12341a;
            Boolean bool = this.s;
            int i55 = 8;
            int i56 = 0;
            int i57 = 1;
            int i58 = 0;
            while (i58 < i49) {
                int[] iArr6 = iArr4;
                if (gifFrame.f12329e) {
                    if (i56 >= i49) {
                        i57++;
                        if (i57 == 2) {
                            i56 = 4;
                        } else if (i57 == 3) {
                            i55 = 4;
                            i56 = 2;
                        } else if (i57 == 4) {
                            i56 = 1;
                            i55 = 2;
                        }
                    }
                    i2 = i56 + i55;
                } else {
                    i2 = i56;
                    i56 = i58;
                }
                int i59 = i56 + i50;
                int i60 = i2;
                boolean z3 = i48 == 1;
                if (i59 < i54) {
                    int i61 = i59 * i53;
                    int i62 = i61 + i52;
                    boolean z4 = z3;
                    int i63 = i62 + i51;
                    int i64 = i61 + i53;
                    if (i64 < i63) {
                        i63 = i64;
                    }
                    i3 = i49;
                    int i65 = i58 * i48 * gifFrame.f12328c;
                    if (z4) {
                        int i66 = i62;
                        while (i66 < i63) {
                            int i67 = i66;
                            int i68 = iArr5[bArr6[i65] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
                            if (i68 != 0) {
                                iArr6[i67] = i68;
                            } else if (z2 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i65 += i48;
                            i66 = i67 + 1;
                        }
                    } else {
                        int i69 = ((i63 - i62) * i48) + i65;
                        i4 = i48;
                        int i70 = i62;
                        while (i70 < i63) {
                            int i71 = i63;
                            int i72 = gifFrame.f12328c;
                            int i73 = i70;
                            int i74 = i65;
                            int i75 = 0;
                            int i76 = 0;
                            int i77 = 0;
                            int i78 = 0;
                            int i79 = 0;
                            while (true) {
                                if (i74 >= this.f12349p + i65) {
                                    i5 = i50;
                                    break;
                                }
                                byte[] bArr7 = this.f12346i;
                                i5 = i50;
                                if (i74 >= bArr7.length || i74 >= i69) {
                                    break;
                                }
                                int i80 = this.f12341a[bArr7[i74] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
                                if (i80 != 0) {
                                    i75 += (i80 >> 24) & 255;
                                    i76 += (i80 >> 16) & 255;
                                    i77 += (i80 >> 8) & 255;
                                    i78 += i80 & 255;
                                    i79++;
                                }
                                i74++;
                                i50 = i5;
                            }
                            int i81 = i65 + i72;
                            int i82 = i81;
                            while (i82 < this.f12349p + i81) {
                                byte[] bArr8 = this.f12346i;
                                int i83 = i81;
                                if (i82 >= bArr8.length || i82 >= i69) {
                                    break;
                                }
                                int i84 = this.f12341a[bArr8[i82] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
                                if (i84 != 0) {
                                    i75 += (i84 >> 24) & 255;
                                    i76 += (i84 >> 16) & 255;
                                    i77 += (i84 >> 8) & 255;
                                    i78 += i84 & 255;
                                    i79++;
                                }
                                i82++;
                                i81 = i83;
                            }
                            int i85 = i79 == 0 ? 0 : ((i75 / i79) << 24) | ((i76 / i79) << 16) | ((i77 / i79) << 8) | (i78 / i79);
                            if (i85 != 0) {
                                iArr6[i73] = i85;
                            } else if (z2 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i65 += i4;
                            i70 = i73 + 1;
                            i63 = i71;
                            i50 = i5;
                        }
                    }
                    i58++;
                    iArr4 = iArr6;
                    i56 = i60;
                    i48 = i4;
                    i49 = i3;
                    i50 = i50;
                } else {
                    i3 = i49;
                }
                i4 = i48;
                i58++;
                iArr4 = iArr6;
                i56 = i60;
                i48 = i4;
                i49 = i3;
                i50 = i50;
            }
            if (this.s == null) {
                this.s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int[] iArr7 = this.j;
            int i86 = gifFrame.d;
            int i87 = gifFrame.f12327b;
            int i88 = gifFrame.f12328c;
            int i89 = gifFrame.f12326a;
            byte b5 = this.k == 0 ? (byte) 1 : b2;
            int i90 = this.r;
            byte[] bArr9 = this.f12346i;
            int[] iArr8 = this.f12341a;
            byte b6 = -1;
            for (int i91 = b2; i91 < i86; i91++) {
                int i92 = (i91 + i87) * i90;
                int i93 = i92 + i89;
                int i94 = i93 + i88;
                int i95 = i92 + i90;
                if (i95 < i94) {
                    i94 = i95;
                }
                int i96 = gifFrame.f12328c * i91;
                while (i93 < i94) {
                    int[] iArr9 = iArr7;
                    byte b7 = bArr9[i96];
                    int i97 = i86;
                    int i98 = b7 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    if (i98 != b6) {
                        int i99 = iArr8[i98];
                        if (i99 != 0) {
                            iArr9[i93] = i99;
                        } else {
                            b6 = b7;
                        }
                    }
                    i96++;
                    i93++;
                    iArr7 = iArr9;
                    i86 = i97;
                }
            }
            Boolean bool2 = this.s;
            this.s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.s != null || b5 == 0 || b6 == -1));
        }
        if (this.f12348n && ((i6 = gifFrame.g) == 0 || i6 == 1)) {
            if (this.m == null) {
                this.m = c();
            }
            Bitmap bitmap3 = this.m;
            int i100 = this.r;
            iArr = iArr3;
            bitmap3.setPixels(iArr, 0, i100, 0, 0, i100, this.q);
        } else {
            iArr = iArr3;
        }
        Bitmap bitmapC = c();
        int i101 = this.r;
        bitmapC.setPixels(iArr, 0, i101, 0, 0, i101, this.q);
        return bitmapC;
    }
}

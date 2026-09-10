package com.smartdigimkt.o8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.smartdigimkt.i7.d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    public class a implements Runnable {
        final /* synthetic */ Context X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ Bitmap f37472Y;
        final /* synthetic */ InterfaceC0563b Z;

        /* JADX INFO: renamed from: com.smartdigimkt.o8.b$a$a, reason: collision with other inner class name */
        public class RunnableC0562a implements Runnable {
            final /* synthetic */ Bitmap X;

            public RunnableC0562a(Bitmap bitmap) {
                this.X = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC0563b interfaceC0563b = a.this.Z;
                if (interfaceC0563b != null) {
                    Bitmap bitmap = this.X;
                    if (bitmap != null) {
                        interfaceC0563b.a(bitmap);
                    } else {
                        interfaceC0563b.a();
                    }
                }
            }
        }

        public a(Context context, Bitmap bitmap, InterfaceC0563b interfaceC0563b) {
            this.X = context;
            this.f37472Y = bitmap;
            this.Z = interfaceC0563b;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.l7.b.a().e(new RunnableC0562a(b.a(this.X, this.f37472Y)));
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.o8.b$b, reason: collision with other inner class name */
    public interface InterfaceC0563b {
        void a();

        void a(Bitmap bitmap);
    }

    public static int[] a(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            return new int[]{options.outWidth, options.outHeight};
        } catch (OutOfMemoryError unused) {
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static Bitmap a(String str, int i2, int i3) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = a(options.outWidth, options.outHeight, i2, i3);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError unused) {
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static Bitmap a(FileDescriptor fileDescriptor, int i2, int i3) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            options.inSampleSize = a(options.outWidth, options.outHeight, i2, i3);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static Bitmap a(Context context, int i2, int i3, int i4) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(context.getResources(), i2, options);
            options.inSampleSize = a(options.outWidth, options.outHeight, i3, i4);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeResource(context.getResources(), i2, options);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static int a(int i2, int i3, int i4, int i5) {
        int i6 = 1;
        if (i4 <= 0 && i5 <= 0) {
            return 1;
        }
        while (i2 / i6 > i4 && i3 / i6 > i5) {
            i6 *= 2;
        }
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x00b4 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x00b9 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8 A[ADDED_TO_REGION, DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0 A[Catch: all -> 0x00d3, DONT_GENERATE, TRY_LEAVE, TryCatch #10 {all -> 0x00d3, blocks: (B:54:0x00ca, B:56:0x00d0), top: B:109:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:89:0x00be A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00c3 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Bitmap a(Context context, Bitmap bitmap) {
        RenderScript renderScriptCreate;
        Bitmap bitmapCreateScaledBitmap;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate;
        Allocation allocationCreateFromBitmap;
        Allocation allocationCreateFromBitmap2;
        if (context == null || bitmap == null) {
            return null;
        }
        if (bitmap.isRecycled()) {
            d.a("Error", "Error, cannot access an invalid/free'd bitmap here!", com.smartdigimkt.m6.b.p().q());
            return null;
        }
        try {
            double d = 500;
            double dMax = Math.max(Math.max(((double) bitmap.getWidth()) / d, ((double) bitmap.getHeight()) / d), 1.0d);
            int width = (int) (((double) bitmap.getWidth()) / dMax);
            int height = (int) (((double) bitmap.getHeight()) / dMax);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
            try {
                renderScriptCreate = RenderScript.create(context);
                try {
                    scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    try {
                        allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                        try {
                            allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                            try {
                                scriptIntrinsicBlurCreate.setRadius(25.0f);
                                scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                                scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                                allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                                new Canvas(bitmapCreateBitmap).drawColor(855638016);
                                try {
                                    allocationCreateFromBitmap2.destroy();
                                } catch (Throwable unused) {
                                }
                                if (allocationCreateFromBitmap != null) {
                                    try {
                                        allocationCreateFromBitmap.destroy();
                                    } catch (Throwable unused2) {
                                    }
                                }
                                try {
                                    scriptIntrinsicBlurCreate.destroy();
                                } catch (Throwable unused3) {
                                }
                                if (renderScriptCreate != null) {
                                    try {
                                        renderScriptCreate.destroy();
                                    } catch (Throwable unused4) {
                                    }
                                }
                                if (bitmapCreateScaledBitmap != null && bitmapCreateScaledBitmap != bitmap) {
                                    try {
                                        if (!bitmapCreateScaledBitmap.isRecycled()) {
                                            bitmapCreateScaledBitmap.recycle();
                                        }
                                    } catch (Throwable unused5) {
                                    }
                                }
                                return bitmapCreateBitmap;
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    th.printStackTrace();
                                    return null;
                                } finally {
                                    if (allocationCreateFromBitmap2 != null) {
                                        try {
                                            allocationCreateFromBitmap2.destroy();
                                        } catch (Throwable unused6) {
                                        }
                                    }
                                    if (allocationCreateFromBitmap != null) {
                                        try {
                                            allocationCreateFromBitmap.destroy();
                                        } catch (Throwable unused7) {
                                        }
                                    }
                                    if (scriptIntrinsicBlurCreate != null) {
                                        try {
                                            scriptIntrinsicBlurCreate.destroy();
                                        } catch (Throwable unused8) {
                                        }
                                    }
                                    if (renderScriptCreate != null) {
                                        try {
                                            renderScriptCreate.destroy();
                                        } catch (Throwable unused9) {
                                        }
                                    }
                                    if (bitmapCreateScaledBitmap != null && bitmapCreateScaledBitmap != bitmap) {
                                        try {
                                            if (!bitmapCreateScaledBitmap.isRecycled()) {
                                                bitmapCreateScaledBitmap.recycle();
                                            }
                                        } catch (Throwable unused10) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            allocationCreateFromBitmap2 = null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        allocationCreateFromBitmap = null;
                        allocationCreateFromBitmap2 = allocationCreateFromBitmap;
                        th.printStackTrace();
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    scriptIntrinsicBlurCreate = null;
                    allocationCreateFromBitmap = scriptIntrinsicBlurCreate;
                    allocationCreateFromBitmap2 = allocationCreateFromBitmap;
                    th.printStackTrace();
                    return null;
                }
            } catch (Throwable th5) {
                th = th5;
                renderScriptCreate = null;
                scriptIntrinsicBlurCreate = null;
            }
        } catch (Throwable th6) {
            th = th6;
            renderScriptCreate = null;
            bitmapCreateScaledBitmap = null;
            scriptIntrinsicBlurCreate = null;
        }
    }

    public static void a(Context context, Bitmap bitmap, InterfaceC0563b interfaceC0563b) {
        com.smartdigimkt.l7.b.a().g(new a(context, bitmap, interfaceC0563b));
    }

    private static Bitmap a(Bitmap bitmap, int i2, boolean z2) {
        int i3;
        int i4 = i2;
        Bitmap bitmapCopy = z2 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i4 < 1) {
            return null;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i5 = width * height;
        int[] iArr = new int[i5];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i6 = width - 1;
        int i7 = height - 1;
        int i8 = i4 + i4;
        int i9 = i8 + 1;
        int[] iArr2 = new int[i5];
        int[] iArr3 = new int[i5];
        int[] iArr4 = new int[i5];
        int[] iArr5 = new int[Math.max(width, height)];
        int i10 = (i8 + 2) >> 1;
        int i11 = i10 * i10;
        int i12 = i11 * 256;
        int[] iArr6 = new int[i12];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            iArr6[i14] = i14 / i11;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i9, 3);
        int i15 = i4 + 1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < height) {
            int[] iArr8 = iArr6;
            int i19 = -i4;
            int i20 = i13;
            int i21 = i20;
            int i22 = i21;
            int i23 = i22;
            int i24 = i23;
            int i25 = i24;
            int i26 = i25;
            int i27 = i26;
            int i28 = i27;
            while (i19 <= i4) {
                int[] iArr9 = iArr4;
                Bitmap bitmap2 = bitmapCopy;
                int i29 = i13;
                int i30 = iArr[Math.min(i6, Math.max(i19, i29)) + i17];
                int[] iArr10 = iArr7[i19 + i4];
                iArr10[i29] = (i30 & 16711680) >> 16;
                iArr10[1] = (i30 & 65280) >> 8;
                iArr10[2] = i30 & 255;
                int iAbs = i15 - Math.abs(i19);
                int i31 = iArr10[i29];
                i21 = (i31 * iAbs) + i21;
                int i32 = iArr10[1];
                i20 = (i32 * iAbs) + i20;
                int i33 = iArr10[2];
                i28 = (iAbs * i33) + i28;
                if (i19 > 0) {
                    i25 += i31;
                    i26 += i32;
                    i27 += i33;
                } else {
                    i24 += i31;
                    i23 += i32;
                    i22 += i33;
                }
                i19++;
                iArr4 = iArr9;
                bitmapCopy = bitmap2;
                i13 = 0;
            }
            int[] iArr11 = iArr4;
            Bitmap bitmap3 = bitmapCopy;
            int i34 = i4;
            int i35 = 0;
            while (i35 < width) {
                iArr2[i17] = iArr8[i21];
                iArr3[i17] = iArr8[i20];
                iArr11[i17] = iArr8[i28];
                int i36 = i21 - i24;
                int i37 = i20 - i23;
                int i38 = i28 - i22;
                int[] iArr12 = iArr7[((i34 - i4) + i9) % i9];
                int i39 = i24 - iArr12[0];
                int i40 = i23 - iArr12[1];
                int i41 = i22 - iArr12[2];
                if (i16 == 0) {
                    i3 = i35;
                    iArr5[i3] = Math.min(i35 + i4 + 1, i6);
                } else {
                    i3 = i35;
                }
                int i42 = iArr[i18 + iArr5[i3]];
                int i43 = (i42 & 16711680) >> 16;
                iArr12[0] = i43;
                int i44 = (i42 & 65280) >> 8;
                iArr12[1] = i44;
                int i45 = i42 & 255;
                iArr12[2] = i45;
                int i46 = i25 + i43;
                int i47 = i26 + i44;
                int i48 = i27 + i45;
                i21 = i36 + i46;
                i20 = i37 + i47;
                i28 = i38 + i48;
                i34 = (i34 + 1) % i9;
                int[] iArr13 = iArr7[i34 % i9];
                int i49 = iArr13[0];
                i24 = i39 + i49;
                int i50 = iArr13[1];
                i23 = i40 + i50;
                int i51 = iArr13[2];
                i22 = i41 + i51;
                i25 = i46 - i49;
                i26 = i47 - i50;
                i27 = i48 - i51;
                i17++;
                i35 = i3 + 1;
            }
            i18 += width;
            i16++;
            iArr6 = iArr8;
            iArr4 = iArr11;
            bitmapCopy = bitmap3;
            i13 = 0;
        }
        int[] iArr14 = iArr6;
        int[] iArr15 = iArr4;
        Bitmap bitmap4 = bitmapCopy;
        int i52 = 0;
        while (i52 < width) {
            int i53 = -i4;
            int i54 = i52;
            int i55 = i53 * width;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            int i64 = 0;
            while (i53 <= i4) {
                int iMax = Math.max(0, i55) + i54;
                int[] iArr16 = iArr7[i53 + i2];
                iArr16[0] = iArr2[iMax];
                iArr16[1] = iArr3[iMax];
                iArr16[2] = iArr15[iMax];
                int iAbs2 = i15 - Math.abs(i53);
                i57 = (iArr2[iMax] * iAbs2) + i57;
                i56 = (iArr3[iMax] * iAbs2) + i56;
                i64 = (iArr15[iMax] * iAbs2) + i64;
                if (i53 > 0) {
                    i61 += iArr16[0];
                    i62 += iArr16[1];
                    i63 += iArr16[2];
                } else {
                    i60 += iArr16[0];
                    i59 += iArr16[1];
                    i58 += iArr16[2];
                }
                if (i53 < i7) {
                    i55 += width;
                }
                i53++;
                i4 = i2;
            }
            int i65 = i2;
            int i66 = i64;
            int i67 = i54;
            for (int i68 = 0; i68 < height; i68++) {
                iArr[i67] = (iArr[i67] & (-16777216)) | (iArr14[i57] << 16) | (iArr14[i56] << 8) | iArr14[i66];
                int i69 = i57 - i60;
                int i70 = i56 - i59;
                int i71 = i66 - i58;
                int[] iArr17 = iArr7[((i65 - i2) + i9) % i9];
                int i72 = i60 - iArr17[0];
                int i73 = i59 - iArr17[1];
                int i74 = i58 - iArr17[2];
                int i75 = i65;
                if (i54 == 0) {
                    iArr5[i68] = Math.min(i68 + i15, i7) * width;
                }
                int i76 = i54 + iArr5[i68];
                int i77 = iArr2[i76];
                iArr17[0] = i77;
                int i78 = iArr3[i76];
                iArr17[1] = i78;
                int i79 = iArr15[i76];
                iArr17[2] = i79;
                int i80 = i61 + i77;
                int i81 = i62 + i78;
                int i82 = i63 + i79;
                i57 = i69 + i80;
                i56 = i70 + i81;
                i66 = i71 + i82;
                i65 = (i75 + 1) % i9;
                int[] iArr18 = iArr7[i65];
                int i83 = iArr18[0];
                i60 = i72 + i83;
                int i84 = iArr18[1];
                i59 = i73 + i84;
                int i85 = iArr18[2];
                i58 = i74 + i85;
                i61 = i80 - i83;
                i62 = i81 - i84;
                i63 = i82 - i85;
                i67 += width;
            }
            i52 = i54 + 1;
            i4 = i2;
        }
        bitmap4.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap4;
    }

    public static InputStream a(Bitmap bitmap) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused) {
                }
                return byteArrayInputStream;
            } catch (Exception unused2) {
                if (byteArrayOutputStream == null) {
                    return null;
                }
                try {
                    byteArrayOutputStream.close();
                    return null;
                } catch (Exception unused3) {
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream2 = byteArrayOutputStream;
                if (byteArrayOutputStream2 != null) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

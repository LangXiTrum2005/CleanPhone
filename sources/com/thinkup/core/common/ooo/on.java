package com.thinkup.core.common.ooo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes6.dex */
public final class on {

    public interface o {
        void o();

        void o(Bitmap bitmap);
    }

    private static InputStream m(Bitmap bitmap) throws Throwable {
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

    public static int[] o(String str) {
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

    private static Bitmap o(String str, int i2, int i3) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = o(options.outWidth, options.outHeight, i2, i3);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError unused) {
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static Bitmap o(FileDescriptor fileDescriptor, int i2, int i3) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            options.inSampleSize = o(options.outWidth, options.outHeight, i2, i3);
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

    private static Bitmap o(Context context, int i2, int i3, int i4) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(context.getResources(), i2, options);
            options.inSampleSize = o(options.outWidth, options.outHeight, i3, i4);
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

    private static int o(int i2, int i3, int i4, int i5) {
        int i6 = 1;
        if (i4 <= 0 && i5 <= 0) {
            return 1;
        }
        while (i2 / i6 > i4 && i3 / i6 > i5) {
            i6 *= 2;
        }
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00c5 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x00b6 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00bb A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca A[ADDED_TO_REGION, DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d2 A[Catch: all -> 0x00d5, DONT_GENERATE, TRY_LEAVE, TryCatch #13 {all -> 0x00d5, blocks: (B:54:0x00cc, B:56:0x00d2), top: B:115:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:95:0x00c0 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Bitmap o(Context context, Bitmap bitmap) {
        RenderScript renderScriptCreate;
        Bitmap bitmapCreateScaledBitmap;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate;
        Allocation allocationCreateFromBitmap;
        Allocation allocationCreateFromBitmap2;
        if (context == null || bitmap == null) {
            return null;
        }
        if (bitmap.isRecycled()) {
            com.thinkup.core.common.oo0.oo.m("Error", "Error, cannot access an invalid/free'd bitmap here!", com.thinkup.core.common.n.o0n.m().o0m());
            return null;
        }
        try {
            double dMax = Math.max(Math.max(((double) bitmap.getWidth()) / 500.0d, ((double) bitmap.getHeight()) / 500.0d), 1.0d);
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

    public static void o(final Context context, final Bitmap bitmap, final o oVar) {
        com.thinkup.core.common.n.o0n.m();
        com.thinkup.core.common.n.o0n.n(new Runnable() { // from class: com.thinkup.core.common.ooo.on.1
            @Override // java.lang.Runnable
            public final void run() {
                final Bitmap bitmapO = on.o(context, bitmap);
                com.thinkup.core.common.n.o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.ooo.on.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2;
                        o oVar2 = oVar;
                        if (oVar2 == null || (bitmap2 = bitmapO) == null) {
                            return;
                        }
                        oVar2.o(bitmap2);
                    }
                });
            }
        });
    }

    private static Bitmap o(Bitmap bitmap) {
        char c2;
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = width * height;
        int[] iArr = new int[i3];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int[] iArr2 = new int[i3];
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[Math.max(width, height)];
        int[] iArr6 = new int[173056];
        int i6 = 0;
        for (int i7 = 0; i7 < 173056; i7++) {
            iArr6[i7] = i7 / 676;
        }
        char c3 = 2;
        char c4 = 1;
        char c5 = '3';
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 51, 3);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            c2 = c3;
            i2 = 25;
            if (i8 >= height) {
                break;
            }
            int i11 = i6;
            int i12 = i11;
            int i13 = i12;
            int i14 = i13;
            int i15 = i14;
            int i16 = i15;
            int i17 = i16;
            int i18 = i17;
            char c6 = c4;
            int i19 = -25;
            int i20 = i18;
            while (i19 <= 25) {
                char c7 = c5;
                int i21 = iArr[Math.min(i4, Math.max(i19, i6)) + i9];
                int[] iArr8 = iArr7[i19 + 25];
                iArr8[i6] = (i21 & 16711680) >> 16;
                iArr8[c6] = (i21 & 65280) >> 8;
                iArr8[c2] = i21 & 255;
                int iAbs = 26 - Math.abs(i19);
                int i22 = iArr8[i6];
                i20 = (i22 * iAbs) + i20;
                int i23 = iArr8[c6];
                i11 = (i23 * iAbs) + i11;
                int i24 = iArr8[c2];
                i12 = (iAbs * i24) + i12;
                if (i19 > 0) {
                    i16 += i22;
                    i17 += i23;
                    i18 += i24;
                } else {
                    i13 += i22;
                    i14 += i23;
                    i15 += i24;
                }
                i19++;
                c5 = c7;
            }
            char c8 = c5;
            int i25 = i6;
            while (i25 < width) {
                iArr2[i9] = iArr6[i20];
                iArr3[i9] = iArr6[i11];
                iArr4[i9] = iArr6[i12];
                int i26 = i20 - i13;
                int i27 = i11 - i14;
                int i28 = i12 - i15;
                int[] iArr9 = iArr7[(i2 + 26) % 51];
                int i29 = i13 - iArr9[i6];
                int i30 = i14 - iArr9[c6];
                int i31 = i15 - iArr9[c2];
                if (i8 == 0) {
                    iArr5[i25] = Math.min(i25 + 26, i4);
                }
                int i32 = iArr[i10 + iArr5[i25]];
                int i33 = (i32 & 16711680) >> 16;
                iArr9[i6] = i33;
                int i34 = (i32 & 65280) >> 8;
                iArr9[c6] = i34;
                int i35 = i32 & 255;
                iArr9[c2] = i35;
                int i36 = i16 + i33;
                int i37 = i17 + i34;
                int i38 = i18 + i35;
                i20 = i26 + i36;
                i11 = i27 + i37;
                i12 = i28 + i38;
                i2 = (i2 + 1) % 51;
                int[] iArr10 = iArr7[i2 % 51];
                int i39 = iArr10[i6];
                i13 = i29 + i39;
                int i40 = iArr10[c6];
                i14 = i30 + i40;
                int i41 = iArr10[c2];
                i15 = i31 + i41;
                i16 = i36 - i39;
                i17 = i37 - i40;
                i18 = i38 - i41;
                i9++;
                i25++;
                i6 = i6;
            }
            i10 += width;
            i8++;
            c3 = c2;
            c4 = c6;
            c5 = c8;
        }
        int i42 = i6;
        char c9 = c4;
        int i43 = i42;
        while (i43 < width) {
            int i44 = width * (-25);
            int i45 = i43;
            int i46 = -25;
            int i47 = i42;
            int i48 = i47;
            int i49 = i48;
            int i50 = i49;
            int i51 = i50;
            int i52 = i51;
            int i53 = i52;
            int i54 = i53;
            int i55 = i54;
            while (i46 <= i2) {
                int i56 = i42;
                int iMax = Math.max(i56, i44) + i45;
                int[] iArr11 = iArr7[i46 + 25];
                iArr11[i56] = iArr2[iMax];
                iArr11[c9] = iArr3[iMax];
                iArr11[c2] = iArr4[iMax];
                int iAbs2 = 26 - Math.abs(i46);
                i47 = (iArr2[iMax] * iAbs2) + i47;
                i48 = (iArr3[iMax] * iAbs2) + i48;
                i49 = (iArr4[iMax] * iAbs2) + i49;
                if (i46 > 0) {
                    i53 += iArr11[0];
                    i54 += iArr11[c9];
                    i55 += iArr11[c2];
                } else {
                    i50 += iArr11[0];
                    i51 += iArr11[c9];
                    i52 += iArr11[c2];
                }
                if (i46 < i5) {
                    i44 += width;
                }
                i46++;
                i2 = 25;
                i42 = 0;
            }
            int i57 = i45;
            int i58 = 25;
            for (int i59 = 0; i59 < height; i59++) {
                iArr[i57] = (iArr[i57] & (-16777216)) | (iArr6[i47] << 16) | (iArr6[i48] << 8) | iArr6[i49];
                int i60 = i47 - i50;
                int i61 = i48 - i51;
                int i62 = i49 - i52;
                int[] iArr12 = iArr7[(i58 + 26) % 51];
                int i63 = i50 - iArr12[0];
                int i64 = i51 - iArr12[c9];
                int i65 = i52 - iArr12[c2];
                if (i45 == 0) {
                    iArr5[i59] = Math.min(i59 + 26, i5) * width;
                }
                int i66 = i45 + iArr5[i59];
                int i67 = iArr2[i66];
                iArr12[0] = i67;
                int i68 = iArr3[i66];
                iArr12[c9] = i68;
                int i69 = iArr4[i66];
                iArr12[c2] = i69;
                int i70 = i53 + i67;
                int i71 = i54 + i68;
                int i72 = i55 + i69;
                i47 = i60 + i70;
                i48 = i61 + i71;
                i49 = i62 + i72;
                i58 = (i58 + 1) % 51;
                int[] iArr13 = iArr7[i58];
                int i73 = iArr13[0];
                i50 = i63 + i73;
                int i74 = iArr13[c9];
                i51 = i64 + i74;
                int i75 = iArr13[c2];
                i52 = i65 + i75;
                i53 = i70 - i73;
                i54 = i71 - i74;
                i55 = i72 - i75;
                i57 += width;
            }
            i42 = 0;
            i43 = i45 + 1;
            i2 = 25;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap;
    }
}

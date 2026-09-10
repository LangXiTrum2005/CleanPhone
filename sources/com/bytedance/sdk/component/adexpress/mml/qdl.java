package com.bytedance.sdk.component.adexpress.mml;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.vungle.ads.internal.ui.a;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    public static Bitmap qdl(Context context, Bitmap bitmap, int i2) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            if (com.bytedance.sdk.component.adexpress.mml.mml() == 0) {
                return ud(context, bitmapCreateScaledBitmap, i2);
            }
            return com.bytedance.sdk.component.adexpress.mml.mml() == 1 ? qdl(bitmapCreateScaledBitmap, i2) : ud(bitmapCreateScaledBitmap, i2);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0089 A[Catch: all -> 0x0095, DONT_GENERATE, TryCatch #3 {all -> 0x0095, blocks: (B:45:0x007f, B:47:0x0089, B:50:0x0091, B:54:0x0099, B:56:0x009e, B:58:0x00a3), top: B:86:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008f A[DONT_GENERATE, DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0091 A[Catch: all -> 0x0095, DONT_GENERATE, TryCatch #3 {all -> 0x0095, blocks: (B:45:0x007f, B:47:0x0089, B:50:0x0091, B:54:0x0099, B:56:0x009e, B:58:0x00a3), top: B:86:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0099 A[Catch: all -> 0x0095, DONT_GENERATE, TryCatch #3 {all -> 0x0095, blocks: (B:45:0x007f, B:47:0x0089, B:50:0x0091, B:54:0x0099, B:56:0x009e, B:58:0x00a3), top: B:86:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:56:0x009e A[Catch: all -> 0x0095, DONT_GENERATE, TryCatch #3 {all -> 0x0095, blocks: (B:45:0x007f, B:47:0x0089, B:50:0x0091, B:54:0x0099, B:56:0x009e, B:58:0x00a3), top: B:86:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3 A[Catch: all -> 0x0095, DONT_GENERATE, TRY_LEAVE, TryCatch #3 {all -> 0x0095, blocks: (B:45:0x007f, B:47:0x0089, B:50:0x0091, B:54:0x0099, B:56:0x009e, B:58:0x00a3), top: B:86:0x007f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.renderscript.Allocation] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.renderscript.Allocation] */
    public static Bitmap ud(Context context, Bitmap bitmap, int i2) {
        RenderScript renderScriptCreate;
        Allocation allocationCreateFromBitmap;
        ?? Create;
        ?? CreateFromBitmap;
        com.bytedance.sdk.component.adexpress.qdl.qdl.lnr lnrVarLnr;
        boolean zYt;
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
            renderScriptCreate = RenderScript.create(context);
            if (renderScriptCreate == null) {
                try {
                    com.bytedance.sdk.component.adexpress.qdl.qdl.lnr lnrVarLnr2 = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr();
                    if (lnrVarLnr2 != null && lnrVarLnr2.yt() && renderScriptCreate != null) {
                        RenderScript.releaseAllContexts();
                        return null;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
                return null;
            }
            try {
                Create = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                try {
                    allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
                    try {
                        CreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                        try {
                            Create.setRadius(i2);
                            Create.setInput(allocationCreateFromBitmap);
                            Create.forEach(CreateFromBitmap);
                            CreateFromBitmap.copyTo(bitmapCreateBitmap);
                            try {
                                com.bytedance.sdk.component.adexpress.qdl.qdl.lnr lnrVarLnr3 = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr();
                                if (lnrVarLnr3 != null && lnrVarLnr3.yt()) {
                                    RenderScript.releaseAllContexts();
                                    if (allocationCreateFromBitmap != null) {
                                        allocationCreateFromBitmap.destroy();
                                    }
                                    CreateFromBitmap.destroy();
                                    Create.destroy();
                                }
                            } catch (Throwable th2) {
                                th2.getMessage();
                            }
                            return bitmapCreateBitmap;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                th.getMessage();
                                try {
                                    if (lnrVarLnr != null) {
                                        return null;
                                    }
                                    if (zYt) {
                                        return null;
                                    }
                                    if (Create != 0) {
                                        return null;
                                    }
                                    return null;
                                } catch (Throwable th4) {
                                    return null;
                                }
                            } finally {
                                try {
                                    lnrVarLnr = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr();
                                    if (lnrVarLnr != null && lnrVarLnr.yt()) {
                                        if (renderScriptCreate != null) {
                                            RenderScript.releaseAllContexts();
                                        }
                                        if (allocationCreateFromBitmap != null) {
                                            allocationCreateFromBitmap.destroy();
                                        }
                                        if (CreateFromBitmap != 0) {
                                            CreateFromBitmap.destroy();
                                        }
                                        if (Create != 0) {
                                            Create.destroy();
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th5.getMessage();
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        CreateFromBitmap = 0;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    allocationCreateFromBitmap = null;
                    CreateFromBitmap = 0;
                }
            } catch (Throwable th8) {
                th = th8;
                allocationCreateFromBitmap = null;
                Create = allocationCreateFromBitmap;
                CreateFromBitmap = Create;
                th.getMessage();
                if (lnrVarLnr != null) {
                    return null;
                }
                if (zYt) {
                    return null;
                }
                if (Create != 0) {
                    return null;
                }
                return null;
            }
        } catch (Throwable th9) {
            th = th9;
            renderScriptCreate = null;
            allocationCreateFromBitmap = null;
        }
    }

    public static Bitmap qdl(Bitmap bitmap, int i2) {
        int i3;
        int i4;
        int i5 = i2;
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i6 = width * height;
            int[] iArr = new int[i6];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int[] iArr2 = iArr;
            int i7 = width - 1;
            int i8 = height - 1;
            int i9 = i5 + i5;
            int i10 = i9 + 1;
            char c2 = 2;
            int i11 = (i9 + 2) >> 1;
            int i12 = i11 * i11;
            int[] iArr3 = new int[Math.max(width, height)];
            int i13 = i12 * 256;
            int[] iArr4 = new int[i13];
            int[] iArr5 = new int[i6];
            int[] iArr6 = new int[i6];
            int[] iArr7 = new int[i6];
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                iArr4[i15] = i15 / i12;
            }
            int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, 3);
            int i16 = i5 + 1;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i17 < height) {
                char c3 = c2;
                int i20 = -i5;
                int i21 = i14;
                int i22 = i21;
                int i23 = i22;
                int i24 = i23;
                int i25 = i24;
                int i26 = i25;
                int i27 = i26;
                int i28 = i27;
                int i29 = i28;
                while (i20 <= i5) {
                    int[] iArr9 = iArr2;
                    int[][] iArr10 = iArr8;
                    int i30 = iArr9[i18 + Math.min(i7, Math.max(i20, i14))];
                    int[] iArr11 = iArr10[i20 + i5];
                    iArr11[0] = (i30 & 16711680) >> 16;
                    iArr11[1] = (i30 & 65280) >> 8;
                    iArr11[c3] = i30 & 255;
                    int iAbs = i16 - Math.abs(i20);
                    int i31 = iArr11[0];
                    i21 = (i31 * iAbs) + i21;
                    int i32 = iArr11[1];
                    i22 = (i32 * iAbs) + i22;
                    int i33 = iArr11[c3];
                    i23 = (iAbs * i33) + i23;
                    if (i20 <= 0) {
                        i25 += i31;
                        i27 += i32;
                        i29 += i33;
                    } else {
                        i24 += i31;
                        i26 += i32;
                        i28 += i33;
                    }
                    i20++;
                    iArr2 = iArr9;
                    iArr8 = iArr10;
                    i14 = 0;
                }
                int[] iArr12 = iArr2;
                int[][] iArr13 = iArr8;
                int i34 = i5;
                int i35 = 0;
                while (i35 < width) {
                    iArr5[i18] = iArr4[i21];
                    iArr6[i18] = iArr4[i22];
                    iArr7[i18] = iArr4[i23];
                    int[] iArr14 = iArr13[((i34 - i5) + i10) % i10];
                    int i36 = i21 - i25;
                    int i37 = i22 - i27;
                    int i38 = i23 - i29;
                    int i39 = i25 - iArr14[0];
                    int i40 = i27 - iArr14[1];
                    int i41 = i29 - iArr14[c3];
                    if (i17 == 0) {
                        i4 = i35;
                        iArr3[i4] = Math.min(i35 + i5 + 1, i7);
                    } else {
                        i4 = i35;
                    }
                    int i42 = iArr12[i19 + iArr3[i4]];
                    int i43 = (i42 & 16711680) >> 16;
                    iArr14[0] = i43;
                    int i44 = (i42 & 65280) >> 8;
                    iArr14[1] = i44;
                    int i45 = i42 & 255;
                    iArr14[c3] = i45;
                    int i46 = i24 + i43;
                    int i47 = i26 + i44;
                    int i48 = i28 + i45;
                    i34 = (i34 + 1) % i10;
                    int[] iArr15 = iArr13[i34 % i10];
                    i21 = i36 + i46;
                    i22 = i37 + i47;
                    i23 = i38 + i48;
                    int i49 = iArr15[0];
                    i24 = i46 - i49;
                    int i50 = iArr15[1];
                    i26 = i47 - i50;
                    int i51 = iArr15[c3];
                    i28 = i48 - i51;
                    i25 = i39 + i49;
                    i27 = i40 + i50;
                    i29 = i41 + i51;
                    i18++;
                    i35 = i4 + 1;
                }
                i19 += width;
                i17++;
                c2 = c3;
                iArr2 = iArr12;
                iArr8 = iArr13;
                i14 = 0;
            }
            int[] iArr16 = iArr2;
            int[][] iArr17 = iArr8;
            char c4 = c2;
            int i52 = 0;
            while (i52 < width) {
                int i53 = -i5;
                int i54 = i53 * width;
                int i55 = 0;
                int i56 = 0;
                int i57 = 0;
                int i58 = 0;
                int i59 = 0;
                int i60 = 0;
                int i61 = 0;
                int i62 = 0;
                int i63 = 0;
                while (i53 <= i5) {
                    int[] iArr18 = iArr17[i53 + i5];
                    int iMax = Math.max(0, i54) + i52;
                    int iAbs2 = i16 - Math.abs(i53);
                    int i64 = iArr5[iMax];
                    i55 = (i64 * iAbs2) + i55;
                    i56 = (iArr6[iMax] * iAbs2) + i56;
                    i57 = (iArr7[iMax] * iAbs2) + i57;
                    iArr18[0] = i64;
                    int i65 = iArr6[iMax];
                    iArr18[1] = i65;
                    int i66 = iArr7[iMax];
                    iArr18[c4] = i66;
                    if (i53 <= 0) {
                        i59 += i64;
                        i61 += i65;
                        i63 += i66;
                    } else {
                        i58 += i64;
                        i60 += i65;
                        i62 += i66;
                    }
                    if (i53 < i8) {
                        i54 += width;
                    }
                    i53++;
                    i5 = i2;
                }
                int i67 = i2;
                int i68 = i52;
                int i69 = 0;
                while (i69 < height) {
                    iArr16[i68] = (iArr16[i68] & (-16777216)) | (iArr4[i55] << 16) | (iArr4[i56] << 8) | iArr4[i57];
                    int[] iArr19 = iArr17[((i67 - i2) + i10) % i10];
                    int i70 = i55 - i59;
                    int i71 = i56 - i61;
                    int i72 = i57 - i63;
                    int i73 = i59 - iArr19[0];
                    int i74 = i61 - iArr19[1];
                    int i75 = i63 - iArr19[c4];
                    if (i52 == 0) {
                        i3 = i69;
                        iArr3[i3] = Math.min(i3 + i16, i8) * width;
                    } else {
                        i3 = i69;
                    }
                    int i76 = iArr3[i3] + i52;
                    int i77 = iArr5[i76];
                    iArr19[0] = i77;
                    int i78 = iArr6[i76];
                    iArr19[1] = i78;
                    int i79 = iArr7[i76];
                    iArr19[c4] = i79;
                    int i80 = i58 + i77;
                    int i81 = i60 + i78;
                    int i82 = i62 + i79;
                    i55 = i70 + i80;
                    i56 = i71 + i81;
                    i57 = i72 + i82;
                    i67 = (i67 + 1) % i10;
                    int[] iArr20 = iArr17[i67];
                    int i83 = iArr20[0];
                    i58 = i80 - i83;
                    int i84 = iArr20[1];
                    i60 = i81 - i84;
                    int i85 = iArr20[c4];
                    i62 = i82 - i85;
                    i59 = i73 + i83;
                    i61 = i74 + i84;
                    i63 = i75 + i85;
                    i68 += width;
                    i69 = i3 + 1;
                }
                i52++;
                i5 = i2;
            }
            bitmap.setPixels(iArr16, 0, width, 0, 0, width, height);
            return bitmap;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static Bitmap ud(Bitmap bitmap, int i2) {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
                a.j();
                RenderNode renderNodeH = a.h();
                a.u();
                HardwareRenderer hardwareRendererD = a.d();
                hardwareRendererD.setSurface(imageReaderNewInstance.getSurface());
                hardwareRendererD.setContentRoot(renderNodeH);
                renderNodeH.setPosition(0, 0, imageReaderNewInstance.getWidth(), imageReaderNewInstance.getHeight());
                float f = i2;
                Shader.TileMode tileMode = Shader.TileMode.MIRROR;
                renderNodeH.setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR));
                renderNodeH.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                renderNodeH.endRecording();
                hardwareRendererD.createRenderRequest().setWaitForPresent(true).syncAndDraw();
                Image imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
                HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
                Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
                hardwareBuffer.close();
                imageAcquireNextImage.close();
                imageReaderNewInstance.close();
                renderNodeH.discardDisplayList();
                hardwareRendererD.destroy();
                return bitmapWrapHardwareBuffer;
            }
            return qdl(bitmap, i2);
        } catch (Throwable th) {
            th.getMessage();
            return qdl(bitmap, i2);
        }
    }
}

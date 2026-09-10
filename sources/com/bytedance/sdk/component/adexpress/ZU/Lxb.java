package com.bytedance.sdk.component.adexpress.ZU;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bytedance.sdk.component.utils.sLN;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.renderscript.Allocation] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.renderscript.Allocation] */
    public static Bitmap Lxb(Context context, Bitmap bitmap, int i) {
        RenderScript renderScriptCreate;
        Allocation allocationCreateFromBitmap;
        ?? Create;
        ?? CreateFromBitmap;
        com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk lkVarLk;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (com.bytedance.sdk.component.adexpress.ZU.LD() && i2 < 26) {
                try {
                    com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk lkVarLk2 = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk();
                    if (lkVarLk2 != null) {
                        lkVarLk2.kqm();
                    }
                } catch (Throwable th) {
                    sLN.Lxb("BlurUtils", "gaussianBlur destrot error: " + th.getMessage());
                }
                return null;
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
            renderScriptCreate = RenderScript.create(context);
            if (renderScriptCreate == null) {
                try {
                    com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk lkVarLk3 = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk();
                    if (lkVarLk3 != null && lkVarLk3.kqm() && renderScriptCreate != null) {
                        if (i2 >= 23) {
                            RenderScript.releaseAllContexts();
                        } else {
                            renderScriptCreate.destroy();
                        }
                    }
                } catch (Throwable th2) {
                    sLN.Lxb("BlurUtils", "gaussianBlur destrot error: " + th2.getMessage());
                }
                return null;
            }
            try {
                Create = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                try {
                    allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                    try {
                        CreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                        try {
                            Create.setRadius(i);
                            Create.setInput(allocationCreateFromBitmap);
                            Create.forEach(CreateFromBitmap);
                            CreateFromBitmap.copyTo(bitmapCreateBitmap);
                            try {
                                com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk lkVarLk4 = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk();
                                if (lkVarLk4 != null && lkVarLk4.kqm()) {
                                    if (i2 >= 23) {
                                        RenderScript.releaseAllContexts();
                                    } else {
                                        renderScriptCreate.destroy();
                                    }
                                    if (allocationCreateFromBitmap != null) {
                                        allocationCreateFromBitmap.destroy();
                                    }
                                    CreateFromBitmap.destroy();
                                    Create.destroy();
                                }
                            } catch (Throwable th3) {
                                sLN.Lxb("BlurUtils", "gaussianBlur destrot error: " + th3.getMessage());
                            }
                            return bitmapCreateBitmap;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        CreateFromBitmap = 0;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    allocationCreateFromBitmap = null;
                    CreateFromBitmap = 0;
                }
            } catch (Throwable th7) {
                th = th7;
                allocationCreateFromBitmap = null;
                Create = allocationCreateFromBitmap;
                CreateFromBitmap = Create;
            }
        } catch (Throwable th8) {
            th = th8;
            renderScriptCreate = null;
            allocationCreateFromBitmap = null;
        }
        Create = allocationCreateFromBitmap;
        CreateFromBitmap = Create;
        try {
            sLN.Lxb("BlurUtils", "gaussianBlur error: " + th.getMessage());
            try {
                if (lkVarLk == null) {
                    return null;
                }
                return null;
            } catch (Throwable th9) {
                return null;
            }
        } finally {
            try {
                lkVarLk = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk();
                if (lkVarLk != null && lkVarLk.kqm()) {
                    if (renderScriptCreate != null) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            RenderScript.releaseAllContexts();
                        } else {
                            renderScriptCreate.destroy();
                        }
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
            } catch (Throwable th10) {
                sLN.Lxb("BlurUtils", "gaussianBlur destrot error: " + th10.getMessage());
            }
        }
    }
}

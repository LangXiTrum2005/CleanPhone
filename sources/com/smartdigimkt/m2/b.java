package com.smartdigimkt.m2;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f36553a;

    public static b a() {
        if (f36553a == null) {
            synchronized (b.class) {
                try {
                    if (f36553a == null) {
                        f36553a = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36553a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public Bitmap a(Bitmap bitmap, int i2) {
        Allocation allocationCreateFromBitmap;
        RenderScript renderScriptCreate;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate;
        Allocation allocationCreateFromBitmap2;
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            renderScriptCreate = RenderScript.create(com.smartdigimkt.m6.b.p().k());
            try {
                scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                try {
                    allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
                    try {
                        allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                        try {
                            scriptIntrinsicBlurCreate.setRadius(18.0f);
                            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                            if (renderScriptCreate != null) {
                                try {
                                    renderScriptCreate.destroy();
                                } catch (Throwable unused) {
                                }
                            }
                            try {
                                scriptIntrinsicBlurCreate.destroy();
                            } catch (Throwable unused2) {
                            }
                            if (allocationCreateFromBitmap != null) {
                                try {
                                    allocationCreateFromBitmap.destroy();
                                } catch (Throwable unused3) {
                                }
                            }
                            try {
                                allocationCreateFromBitmap2.destroy();
                            } catch (Throwable unused4) {
                            }
                            return bitmapCreateBitmap;
                        } catch (Throwable unused5) {
                            if (renderScriptCreate != null) {
                                try {
                                    renderScriptCreate.destroy();
                                } catch (Throwable unused6) {
                                }
                            }
                            if (scriptIntrinsicBlurCreate != null) {
                                try {
                                    scriptIntrinsicBlurCreate.destroy();
                                } catch (Throwable unused7) {
                                }
                            }
                            if (allocationCreateFromBitmap != null) {
                                try {
                                    allocationCreateFromBitmap.destroy();
                                } catch (Throwable unused8) {
                                }
                            }
                            if (allocationCreateFromBitmap2 != null) {
                                try {
                                    allocationCreateFromBitmap2.destroy();
                                } catch (Throwable unused9) {
                                }
                            }
                            return null;
                        }
                    } catch (Throwable unused10) {
                        allocationCreateFromBitmap2 = null;
                    }
                } catch (Throwable unused11) {
                    allocationCreateFromBitmap = null;
                    allocationCreateFromBitmap2 = null;
                }
            } catch (Throwable unused12) {
                allocationCreateFromBitmap = null;
                scriptIntrinsicBlurCreate = null;
                allocationCreateFromBitmap2 = scriptIntrinsicBlurCreate;
                if (renderScriptCreate != null) {
                    renderScriptCreate.destroy();
                }
                if (scriptIntrinsicBlurCreate != null) {
                    scriptIntrinsicBlurCreate.destroy();
                }
                if (allocationCreateFromBitmap != null) {
                    allocationCreateFromBitmap.destroy();
                }
                if (allocationCreateFromBitmap2 != null) {
                    allocationCreateFromBitmap2.destroy();
                }
                return null;
            }
        } catch (Throwable unused13) {
            allocationCreateFromBitmap = null;
            renderScriptCreate = null;
            scriptIntrinsicBlurCreate = null;
        }
    }

    private static Bitmap a(int i2) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_4444);
            if (i2 == 1) {
                bitmapCreateBitmap.eraseColor(Color.parseColor("#FF0000"));
                return bitmapCreateBitmap;
            }
            bitmapCreateBitmap.eraseColor(Color.parseColor("#FFFFFF"));
            return bitmapCreateBitmap;
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
            return null;
        }
    }
}

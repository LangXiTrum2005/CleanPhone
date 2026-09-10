package com.mbridge.msdk.newreward.function.utils;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.function.utils.a$a, reason: collision with other inner class name */
    public class RunnableC0216a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f1723a;
        final /* synthetic */ Bitmap b;

        public RunnableC0216a(b bVar, Bitmap bitmap) {
            this.f1723a = bVar;
            this.b = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1723a == null) {
                return;
            }
            try {
                Bitmap bitmapB = a.b(this.b);
                if (bitmapB == null || bitmapB.isRecycled()) {
                    this.f1723a.blurFailCallBack();
                } else {
                    this.f1723a.blurSuccessCallBack(bitmapB);
                }
            } catch (Exception unused) {
                this.f1723a.blurFailCallBack();
            }
        }
    }

    public interface b {
        void blurFailCallBack();

        void blurSuccessCallBack(Bitmap bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(17)
    public static Bitmap b(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript renderScriptCreate = RenderScript.create(com.mbridge.msdk.foundation.controller.c.n().d());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(25.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            renderScriptCreate.destroy();
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(Bitmap bitmap, b bVar) {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC0216a(bVar, bitmap));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}

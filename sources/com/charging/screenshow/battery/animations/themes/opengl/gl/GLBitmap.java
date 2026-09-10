package com.charging.screenshow.battery.animations.themes.opengl.gl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.renderscript.Matrix4f;
import androidx.exifinterface.media.ExifInterface;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class GLBitmap {
    public static final float[] g = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float[] f13300h = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f13301i;
    public static int j;
    public static int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f13302l;
    public static int m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f13303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatBuffer f13304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FloatBuffer f13305c;
    public final float[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13306e = -1;
    public final float f = 0.2f;

    public GLBitmap(String str) {
        ExifInterface exifInterface;
        float[] fArr = g;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        int i2 = 0;
        floatBufferAsFloatBuffer.position(0);
        this.f13304b = floatBufferAsFloatBuffer;
        float[] fArr2 = f13300h;
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer2.put(fArr2);
        floatBufferAsFloatBuffer2.position(0);
        this.f13305c = floatBufferAsFloatBuffer2;
        this.d = new Matrix4f().getArray();
        try {
            exifInterface = new ExifInterface(str);
        } catch (Throwable th) {
            th.printStackTrace();
            exifInterface = null;
        }
        if (exifInterface != null) {
            int iC = exifInterface.c();
            if (iC == 3) {
                i2 = 180;
            } else if (iC == 6) {
                i2 = 90;
            } else if (iC == 8) {
                i2 = 270;
            }
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        if (i2 != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(i2);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
            bitmapDecodeFile.recycle();
            bitmapDecodeFile = bitmapCreateBitmap;
        }
        this.f13303a = bitmapDecodeFile;
    }

    public final void a(float f, float f2, int i2, int i3) {
        int i4 = this.f13306e;
        FloatBuffer floatBuffer = this.f13304b;
        if (i4 == -1) {
            Bitmap bitmap = this.f13303a;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new NullPointerException("bitmap == null");
            }
            int[] iArr = new int[1];
            GLES20.glActiveTexture(33984);
            GLES20.glGenTextures(1, iArr, 0);
            GLUtil.b();
            int i5 = iArr[0];
            GLES20.glBindTexture(3553, i5);
            GLUtil.b();
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, 6408, this.f13303a, 5121, 0);
            GLUtil.b();
            this.f13306e = i5;
            float f3 = i2;
            float width = bitmap.getWidth();
            float f4 = i3;
            float height = bitmap.getHeight();
            float fMax = Math.max(f3 / width, f4 / height) + this.f;
            float f5 = (((int) (width * fMax)) * 1.0f) / f3;
            float f6 = (((int) (height * fMax)) * 1.0f) / f4;
            float f7 = -f5;
            float f8 = -f6;
            floatBuffer.position(0);
            floatBuffer.put(new float[]{f7, f8, f5, f8, f7, f6, f5, f6});
        }
        GLES20.glActiveTexture(33984);
        GLES20.glUseProgram(f13301i);
        GLES20.glUniform1i(f13302l, 0);
        float[] fArr = this.d;
        fArr[12] = f;
        fArr[13] = f2;
        fArr[14] = 0.0f;
        GLES20.glUniformMatrix4fv(m, 1, false, fArr, 0);
        GLUtil.b();
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(j, 2, 5126, false, 8, (Buffer) this.f13304b);
        GLES20.glEnableVertexAttribArray(j);
        this.f13305c.position(0);
        GLES20.glVertexAttribPointer(k, 2, 5126, false, 8, (Buffer) this.f13305c);
        GLES20.glEnableVertexAttribArray(k);
        GLES20.glBindTexture(3553, this.f13306e);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(j);
        GLES20.glDisableVertexAttribArray(k);
    }
}

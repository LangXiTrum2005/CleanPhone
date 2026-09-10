package com.charging.screenshow.battery.animations.themes.opengl.image;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.util.Log;
import com.charging.screenshow.battery.animations.themes.opengl.gl.GLBitmap;
import com.charging.screenshow.battery.animations.themes.opengl.gl.GLUtil;
import com.charging.screenshow.battery.animations.themes.opengl.gl.Renderer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public class WallpaperRenderer implements Renderer {
    public int Z;
    public int e0;
    public final ArrayList X = new ArrayList();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ArrayList f13312Y = new ArrayList();
    public float f0 = 0.0f;
    public float g0 = 0.0f;
    public int h0 = 0;
    public int i0 = 0;
    public float j0 = (20 * 0.003f) + 0.03f;

    public final void a(float f, float f2) {
        this.f0 = (float) (Math.sin(f) * ((double) this.j0));
        this.g0 = (float) (Math.sin(f2) * ((double) this.j0));
    }

    public final void b() {
        Bitmap bitmap;
        ArrayList<GLBitmap> arrayList = this.X;
        for (GLBitmap gLBitmap : arrayList) {
            if (gLBitmap != null && (bitmap = gLBitmap.f13303a) != null) {
                bitmap.recycle();
            }
        }
        arrayList.clear();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        int i2 = this.h0;
        int i3 = this.i0;
        int i4 = 0;
        while (i4 < i2) {
            try {
                GLBitmap gLBitmap = (GLBitmap) this.X.get(i4);
                float fFloatValue = i4 < i3 ? ((Float) this.f13312Y.get(i4)).floatValue() : 1.0f;
                gLBitmap.a(this.f0 / fFloatValue, this.g0 / fFloatValue, this.Z, this.e0);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            i4++;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        if (i3 == 0) {
            i3 = 1;
        }
        GLES20.glViewport(0, 0, i2, i3);
        this.Z = i2;
        this.e0 = i3;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int iA;
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 1);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        int iA2 = GLUtil.a(35633, "attribute vec4 position;\nattribute vec2 texCoords;\nvarying vec2 outTexCoords;\nuniform mat4 projection;\nvoid main(void) {\n    outTexCoords = texCoords;\n    gl_Position = projection * position;\n}\n");
        int i2 = 0;
        if (iA2 != 0 && (iA = GLUtil.a(35632, "precision mediump float;\nvarying vec2 outTexCoords;\nuniform sampler2D texture;\nvoid main(void) {\n    gl_FragColor = texture2D(texture, outTexCoords);\n}\n")) != 0) {
            int iGlCreateProgram = GLES20.glCreateProgram();
            GLES20.glAttachShader(iGlCreateProgram, iA2);
            GLES20.glAttachShader(iGlCreateProgram, iA);
            GLES20.glLinkProgram(iGlCreateProgram);
            GLUtil.b();
            GLES20.glDeleteShader(iA2);
            GLES20.glDeleteShader(iA);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                Log.d("GLUtil", "Error while linking program:\n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                GLES20.glDeleteProgram(iGlCreateProgram);
            } else {
                i2 = iGlCreateProgram;
            }
        }
        GLBitmap.f13301i = i2;
        GLBitmap.j = GLES20.glGetAttribLocation(i2, "position");
        GLBitmap.k = GLES20.glGetAttribLocation(GLBitmap.f13301i, "texCoords");
        GLBitmap.f13302l = GLES20.glGetUniformLocation(GLBitmap.f13301i, "texture");
        GLBitmap.m = GLES20.glGetUniformLocation(GLBitmap.f13301i, "projection");
        GLUtil.b();
    }
}

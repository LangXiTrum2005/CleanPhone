package com.charging.screenshow.battery.animations.themes.opengl.gl;

import android.opengl.GLES20;
import android.util.Log;
import androidx.datastore.preferences.protobuf.a;

/* JADX INFO: loaded from: classes3.dex */
public class GLUtil {
    public static int a(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        b();
        GLES20.glCompileShader(iGlCreateShader);
        b();
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateShader;
        }
        Log.d("GLUtil", "Error while compiling shader:\n" + GLES20.glGetShaderInfoLog(iGlCreateShader));
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static void b() {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.w("GLUtil", a.h(iGlGetError, new StringBuilder("GL error = 0x")), new Throwable());
        }
    }
}

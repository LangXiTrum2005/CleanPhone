package androidx.media3.common.util;

import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class GlUtil {

    public static final class GlException extends Exception {
    }

    public static void a(int i2, int i3) throws GlException {
        GLES20.glBindTexture(i2, i3);
        b();
        GLES20.glTexParameteri(i2, 10240, 9729);
        b();
        GLES20.glTexParameteri(i2, 10241, 9729);
        b();
        GLES20.glTexParameteri(i2, 10242, 33071);
        b();
        GLES20.glTexParameteri(i2, 10243, 33071);
        b();
    }

    public static void b() throws GlException {
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z2) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = androidx.datastore.preferences.protobuf.a.h(iGlGetError, new StringBuilder("error code: 0x"));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z2 = true;
        }
        if (z2) {
            throw new GlException(sb.toString());
        }
    }

    public static void c(String str, boolean z2) throws GlException {
        if (!z2) {
            throw new GlException(str);
        }
    }

    public static FloatBuffer d(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }
}

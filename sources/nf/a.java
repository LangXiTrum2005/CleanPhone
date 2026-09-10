package nf;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.util.Log;
import d5.u;
import kotlin.jvm.internal.n;
import pf.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f46733a;

    static {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        f46733a = fArr;
    }

    public static final void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == d.f48355d) {
            return;
        }
        StringBuilder sbK = u.k("Error during ", str, ": EGL error 0x");
        String hexString = Integer.toHexString(iEglGetError);
        n.e(hexString, "toHexString(value)");
        sbK.append(hexString);
        String string = sbK.toString();
        Log.e("Egloo", string);
        throw new RuntimeException(string);
    }

    public static final void b(String opName) {
        n.f(opName, "opName");
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbK = u.k("Error during ", opName, ": glError 0x");
        String hexString = Integer.toHexString(iGlGetError);
        n.e(hexString, "toHexString(value)");
        sbK.append(hexString);
        sbK.append(": ");
        String strGluErrorString = GLU.gluErrorString(iGlGetError);
        n.e(strGluErrorString, "gluErrorString(value)");
        sbK.append(strGluErrorString);
        String string = sbK.toString();
        Log.e("Egloo", string);
        throw new RuntimeException(string);
    }
}

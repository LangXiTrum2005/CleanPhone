package androidx.media3.common.util;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: GlProgram.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f11320attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final C0079saneness[] f11321dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Map<String, C0079saneness> f11322marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal[] f11323saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Map<String, attabal> f11324wireman;

    /* JADX INFO: compiled from: GlProgram.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f11325attabal;
        public final String name;

        public attabal(String str, int i) {
            this.name = str;
            this.f11325attabal = i;
        }

        public static attabal attabal(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, saneness.impromptu(bArr));
            return new attabal(str, saneness.beachfront(i, str));
        }
    }

    /* JADX INFO: renamed from: androidx.media3.common.util.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GlProgram.java */
    public static final class C0079saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f11326attabal;
        public final String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f11328saneness;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final float[] f11327dern = new float[16];

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int[] f11329wireman = new int[4];

        public C0079saneness(String str, int i, int i2) {
            this.name = str;
            this.f11326attabal = i;
            this.f11328saneness = i2;
        }

        public static C0079saneness attabal(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, saneness.impromptu(bArr));
            return new C0079saneness(str, saneness.taiyuan(i, str), iArr2[0]);
        }
    }

    public saneness(String str, String str2) throws GlUtil.GlException {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f11320attabal = iGlCreateProgram;
        GlUtil.saneness();
        wireman(iGlCreateProgram, 35633, str);
        wireman(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        GlUtil.dern(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f11324wireman = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f11323saneness = new attabal[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            attabal attabalVarAttabal = attabal.attabal(this.f11320attabal, i);
            this.f11323saneness[i] = attabalVarAttabal;
            this.f11324wireman.put(attabalVarAttabal.name, attabalVarAttabal);
        }
        this.f11322marial = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f11320attabal, 35718, iArr3, 0);
        this.f11321dern = new C0079saneness[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            C0079saneness c0079sanenessAttabal = C0079saneness.attabal(this.f11320attabal, i2);
            this.f11321dern[i2] = c0079sanenessAttabal;
            this.f11322marial.put(c0079sanenessAttabal.name, c0079sanenessAttabal);
        }
        GlUtil.saneness();
    }

    public static int beachfront(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    public static int impromptu(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    public static int taiyuan(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    public static void wireman(int i, int i2, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        GlUtil.dern(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.saneness();
    }

    public final int competently(String str) {
        return beachfront(this.f11320attabal, str);
    }

    public int cutely(String str) {
        return taiyuan(this.f11320attabal, str);
    }

    public int marial(String str) throws GlUtil.GlException {
        int iCompetently = competently(str);
        GLES20.glEnableVertexAttribArray(iCompetently);
        GlUtil.saneness();
        return iCompetently;
    }
}

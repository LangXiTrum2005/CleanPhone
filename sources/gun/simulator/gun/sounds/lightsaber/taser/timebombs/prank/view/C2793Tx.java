package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.opengl.GLES20;
import com.badlogic.gdx.graphics.GL20;
import java.util.HashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Tx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2793Tx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3801a;
    public final C3129c[] b;
    public final VC[] c;
    public final HashMap d;
    public final HashMap e;

    public C2793Tx(String str, String str2) throws C2819Ux {
        byte[] bArr;
        byte[] bArr2;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f3801a = iGlCreateProgram;
        AbstractC2845Vx.N();
        a(iGlCreateProgram, GL20.GL_VERTEX_SHADER, str);
        a(iGlCreateProgram, GL20.GL_FRAGMENT_SHADER, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int i = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, GL20.GL_LINK_STATUS, iArr, 0);
        int i2 = 1;
        AbstractC2845Vx.O("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, GL20.GL_ACTIVE_ATTRIBUTES, iArr2, 0);
        this.b = new C3129c[iArr2[0]];
        int i3 = 0;
        while (i3 < iArr2[0]) {
            int i4 = this.f3801a;
            int[] iArr3 = new int[i2];
            GLES20.glGetProgramiv(i4, GL20.GL_ACTIVE_ATTRIBUTE_MAX_LENGTH, iArr3, 0);
            int i5 = iArr3[0];
            byte[] bArr3 = new byte[i5];
            GLES20.glGetActiveAttrib(i4, i3, i5, new int[i2], 0, new int[i2], 0, new int[i2], 0, bArr3, 0);
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    bArr2 = bArr3;
                    i6 = i5;
                    break;
                } else {
                    bArr2 = bArr3;
                    if (bArr2[i6] == 0) {
                        break;
                    }
                    i6++;
                    bArr3 = bArr2;
                }
            }
            String str3 = new String(bArr2, 0, i6);
            C3129c c3129c = new C3129c(str3, i3, GLES20.glGetAttribLocation(i4, str3));
            this.b[i3] = c3129c;
            this.d.put(str3, c3129c);
            i3++;
            i2 = 1;
        }
        this.e = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f3801a, GL20.GL_ACTIVE_UNIFORMS, iArr4, 0);
        this.c = new VC[iArr4[0]];
        for (int i7 = 0; i7 < iArr4[i]; i7++) {
            int i8 = this.f3801a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i8, GL20.GL_ACTIVE_UNIFORM_MAX_LENGTH, iArr5, i);
            int[] iArr6 = new int[1];
            int i9 = iArr5[i];
            byte[] bArr4 = new byte[i9];
            GLES20.glGetActiveUniform(i8, i7, i9, new int[1], 0, new int[1], 0, iArr6, 0, bArr4, 0);
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    bArr = bArr4;
                    i10 = i9;
                    break;
                } else {
                    bArr = bArr4;
                    if (bArr[i10] == 0) {
                        break;
                    }
                    i10++;
                    bArr4 = bArr;
                }
            }
            i = 0;
            String str4 = new String(bArr, 0, i10);
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i8, str4);
            int i11 = iArr6[0];
            VC vc = new VC();
            vc.c = str4;
            vc.f3864a = iGlGetUniformLocation;
            vc.b = i11;
            vc.d = new float[16];
            this.c[i7] = vc;
            this.e.put(str4, vc);
        }
        AbstractC2845Vx.N();
    }

    public static void a(int i, int i2, String str) throws C2819Ux {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, GL20.GL_COMPILE_STATUS, iArr, 0);
        AbstractC2845Vx.O(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        AbstractC2845Vx.N();
    }

    public final int b(String str) throws C2819Ux {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f3801a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        AbstractC2845Vx.N();
        return iGlGetAttribLocation;
    }
}

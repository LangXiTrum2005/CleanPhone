package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.badlogic.gdx.graphics.GL20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ph0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4334ph0 implements GLSurfaceView.Renderer {
    public static final String[] h = {"y_tex", "u_tex", "v_tex"};
    public static final FloatBuffer i = AbstractC2845Vx.T(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GLSurfaceView f4845a;
    public final int[] b = new int[3];
    public final int[] c = new int[3];
    public final int[] d = new int[3];
    public final int[] e = new int[3];
    public final AtomicReference f = new AtomicReference();
    public C2793Tx g;

    public C4334ph0(GLSurfaceView gLSurfaceView) {
        this.f4845a = gLSurfaceView;
        for (int i2 = 0; i2 < 3; i2++) {
            int[] iArr = this.d;
            this.e[i2] = -1;
            iArr[i2] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        AbstractC3950lJ.z(this.f.getAndSet(null));
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        GLES20.glViewport(0, 0, i2, i3);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.c;
        try {
            C2793Tx c2793Tx = new C2793Tx("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.g = c2793Tx;
            GLES20.glVertexAttribPointer(c2793Tx.b("in_pos"), 2, GL20.GL_FLOAT, false, 0, (Buffer) i);
            iArr[0] = this.g.b("in_tc_y");
            iArr[1] = this.g.b("in_tc_u");
            iArr[2] = this.g.b("in_tc_v");
            GLES20.glGetUniformLocation(this.g.f3801a, "mColorConversion");
            AbstractC2845Vx.N();
            int[] iArr2 = this.b;
            try {
                GLES20.glGenTextures(3, iArr2, 0);
                for (int i2 = 0; i2 < 3; i2++) {
                    C2793Tx c2793Tx2 = this.g;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(c2793Tx2.f3801a, h[i2]), i2);
                    GLES20.glActiveTexture(GL20.GL_TEXTURE0 + i2);
                    AbstractC2845Vx.K(GL20.GL_TEXTURE_2D, iArr2[i2]);
                }
                AbstractC2845Vx.N();
            } catch (C2819Ux unused) {
            }
            AbstractC2845Vx.N();
        } catch (C2819Ux unused2) {
        }
    }
}

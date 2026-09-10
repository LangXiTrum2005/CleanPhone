package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import androidx.media3.common.util.GlProgram;
import androidx.media3.common.util.GlUtil;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements VideoDecoderOutputBufferRenderer {
    public final Renderer e0;

    public static final class Renderer implements GLSurfaceView.Renderer {
        public static final float[] k0 = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        public static final String[] l0 = {"y_tex", "u_tex", "v_tex"};
        public static final FloatBuffer m0 = GlUtil.d(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        public final VideoDecoderGLSurfaceView X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int[] f6640Y = new int[3];
        public final int[] Z = new int[3];
        public final int[] e0 = new int[3];
        public final int[] f0 = new int[3];
        public final AtomicReference g0 = new AtomicReference();
        public GlProgram h0;
        public int i0;
        public VideoDecoderOutputBuffer j0;

        public Renderer(VideoDecoderGLSurfaceView videoDecoderGLSurfaceView) {
            this.X = videoDecoderGLSurfaceView;
            for (int i2 = 0; i2 < 3; i2++) {
                int[] iArr = this.e0;
                this.f0[i2] = -1;
                iArr[i2] = -1;
            }
        }

        public final void a() {
            int[] iArr = this.f6640Y;
            try {
                GLES20.glGenTextures(3, iArr, 0);
                for (int i2 = 0; i2 < 3; i2++) {
                    GlProgram glProgram = this.h0;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(glProgram.f5636a, l0[i2]), i2);
                    GLES20.glActiveTexture(33984 + i2);
                    GlUtil.a(3553, iArr[i2]);
                }
                GlUtil.b();
            } catch (GlUtil.GlException e2) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e2);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) this.g0.getAndSet(null);
            if (videoDecoderOutputBuffer == null && this.j0 == null) {
                return;
            }
            if (videoDecoderOutputBuffer != null) {
                VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.j0;
                if (videoDecoderOutputBuffer2 != null) {
                    videoDecoderOutputBuffer2.getClass();
                    throw null;
                }
                this.j0 = videoDecoderOutputBuffer;
            }
            this.j0.getClass();
            GLES20.glUniformMatrix3fv(this.i0, 1, false, k0, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.Z;
            try {
                GlProgram glProgram = new GlProgram("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.h0 = glProgram;
                GLES20.glVertexAttribPointer(glProgram.b("in_pos"), 2, 5126, false, 0, (Buffer) m0);
                iArr[0] = this.h0.b("in_tc_y");
                iArr[1] = this.h0.b("in_tc_u");
                iArr[2] = this.h0.b("in_tc_v");
                this.i0 = GLES20.glGetUniformLocation(this.h0.f5636a, "mColorConversion");
                GlUtil.b();
                a();
                GlUtil.b();
            } catch (GlUtil.GlException e2) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e2);
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        super(context, null);
        Renderer renderer = new Renderer(this);
        this.e0 = renderer;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setRenderMode(0);
    }

    @Deprecated
    public VideoDecoderOutputBufferRenderer getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        Renderer renderer = this.e0;
        if (((VideoDecoderOutputBuffer) renderer.g0.getAndSet(videoDecoderOutputBuffer)) != null) {
            throw null;
        }
        renderer.X.requestRender();
    }
}

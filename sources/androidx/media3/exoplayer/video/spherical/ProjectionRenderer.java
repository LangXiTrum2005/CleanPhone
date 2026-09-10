package androidx.media3.exoplayer.video.spherical;

import android.opengl.GLES20;
import android.util.Log;
import androidx.media3.common.util.GlProgram;
import androidx.media3.common.util.GlUtil;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
final class ProjectionRenderer {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f6684i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MeshData f6686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GlProgram f6687c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6688e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6689h;

    public static class MeshData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FloatBuffer f6691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FloatBuffer f6692c;
        public final int d;

        public MeshData(Projection.SubMesh subMesh) {
            float[] fArr = subMesh.f6683c;
            this.f6690a = fArr.length / 3;
            this.f6691b = GlUtil.d(fArr);
            this.f6692c = GlUtil.d(subMesh.d);
            int i2 = subMesh.f6682b;
            if (i2 == 1) {
                this.d = 5;
            } else if (i2 != 2) {
                this.d = 4;
            } else {
                this.d = 6;
            }
        }
    }

    public static boolean b(Projection projection) {
        Projection.SubMesh[] subMeshArr = projection.f6677a.f6680a;
        if (subMeshArr.length == 1 && subMeshArr[0].f6681a == 0) {
            Projection.SubMesh[] subMeshArr2 = projection.f6678b.f6680a;
            if (subMeshArr2.length == 1 && subMeshArr2[0].f6681a == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            GlProgram glProgram = new GlProgram("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f6687c = glProgram;
            this.d = GLES20.glGetUniformLocation(glProgram.f5636a, "uMvpMatrix");
            this.f6688e = GLES20.glGetUniformLocation(this.f6687c.f5636a, "uTexMatrix");
            this.f = this.f6687c.b("aPosition");
            this.g = this.f6687c.b("aTexCoords");
            this.f6689h = GLES20.glGetUniformLocation(this.f6687c.f5636a, "uTexture");
        } catch (GlUtil.GlException e2) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e2);
        }
    }
}

package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.opengl.GLES20;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4051mW {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4697a;
    public VC b;
    public C2793Tx c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public static boolean b(C3963lW c3963lW) {
        VC[] vcArr = c3963lW.f4648a.f4601a;
        if (vcArr.length != 1 || vcArr[0].f3864a != 0) {
            return false;
        }
        VC[] vcArr2 = c3963lW.b.f4601a;
        return vcArr2.length == 1 && vcArr2[0].f3864a == 0;
    }

    public final void a() {
        try {
            C2793Tx c2793Tx = new C2793Tx("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.c = c2793Tx;
            this.d = GLES20.glGetUniformLocation(c2793Tx.f3801a, "uMvpMatrix");
            this.e = GLES20.glGetUniformLocation(this.c.f3801a, "uTexMatrix");
            this.f = this.c.b("aPosition");
            this.g = this.c.b("aTexCoords");
            this.h = GLES20.glGetUniformLocation(this.c.f3801a, "uTexture");
        } catch (C2819Ux unused) {
        }
    }
}

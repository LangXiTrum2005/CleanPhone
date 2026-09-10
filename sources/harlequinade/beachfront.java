package harlequinade;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import com.unity3d.services.UnityAdsConstants;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: ProjectionRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f27541attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f27542beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f27543competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public attabal f27544dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f27545impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f27546marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public attabal f27547saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f27548taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public androidx.media3.common.util.saneness f27549wireman;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final float[] f27537cutely = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f};

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final float[] f27536apical = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final float[] f27538formularize = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f};

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final float[] f27539impassible = {0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f};

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final float[] f27540triweekly = {0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: compiled from: ProjectionRenderer.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f27550attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final FloatBuffer f27551dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final FloatBuffer f27552saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f27553wireman;

        public attabal(wireman.saneness sanenessVar) {
            this.f27550attabal = sanenessVar.attabal();
            this.f27552saneness = GlUtil.marial(sanenessVar.f27586dern);
            this.f27551dern = GlUtil.marial(sanenessVar.f27588wireman);
            int i = sanenessVar.f27587saneness;
            if (i == 1) {
                this.f27553wireman = 5;
            } else if (i != 2) {
                this.f27553wireman = 4;
            } else {
                this.f27553wireman = 6;
            }
        }
    }

    public static boolean dern(wireman wiremanVar) {
        wireman.attabal attabalVar = wiremanVar.f27580attabal;
        wireman.attabal attabalVar2 = wiremanVar.f27582saneness;
        return attabalVar.saneness() == 1 && attabalVar.attabal(0).f27585attabal == 0 && attabalVar2.saneness() == 1 && attabalVar2.attabal(0).f27585attabal == 0;
    }

    public void attabal(int i, float[] fArr, boolean z) {
        float[] fArr2;
        attabal attabalVar = z ? this.f27544dern : this.f27547saneness;
        if (attabalVar == null) {
            return;
        }
        int i2 = this.f27541attabal;
        if (i2 == 1) {
            fArr2 = z ? f27538formularize : f27536apical;
        } else if (i2 == 2) {
            fArr2 = z ? f27540triweekly : f27539impassible;
        } else {
            fArr2 = f27537cutely;
        }
        GLES20.glUniformMatrix3fv(this.f27542beachfront, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f27546marial, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.f27548taiyuan, 0);
        try {
            GlUtil.saneness();
        } catch (GlUtil.GlException unused) {
        }
        GLES20.glVertexAttribPointer(this.f27543competently, 3, 5126, false, 12, (Buffer) attabalVar.f27552saneness);
        try {
            GlUtil.saneness();
        } catch (GlUtil.GlException unused2) {
        }
        GLES20.glVertexAttribPointer(this.f27545impromptu, 2, 5126, false, 8, (Buffer) attabalVar.f27551dern);
        try {
            GlUtil.saneness();
        } catch (GlUtil.GlException unused3) {
        }
        GLES20.glDrawArrays(attabalVar.f27553wireman, 0, attabalVar.f27550attabal);
        try {
            GlUtil.saneness();
        } catch (GlUtil.GlException unused4) {
        }
    }

    public void saneness() {
        try {
            androidx.media3.common.util.saneness sanenessVar = new androidx.media3.common.util.saneness("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f27549wireman = sanenessVar;
            this.f27546marial = sanenessVar.cutely("uMvpMatrix");
            this.f27542beachfront = this.f27549wireman.cutely("uTexMatrix");
            this.f27543competently = this.f27549wireman.marial("aPosition");
            this.f27545impromptu = this.f27549wireman.marial("aTexCoords");
            this.f27548taiyuan = this.f27549wireman.cutely("uTexture");
        } catch (GlUtil.GlException unused) {
        }
    }

    public void wireman(wireman wiremanVar) {
        if (dern(wiremanVar)) {
            this.f27541attabal = wiremanVar.f27581dern;
            attabal attabalVar = new attabal(wiremanVar.f27580attabal.attabal(0));
            this.f27547saneness = attabalVar;
            if (!wiremanVar.f27583wireman) {
                attabalVar = new attabal(wiremanVar.f27582saneness.attabal(0));
            }
            this.f27544dern = attabalVar;
        }
    }
}

package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
final class Projection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mesh f6677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mesh f6678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6679c;
    public final boolean d;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    public static final class Mesh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SubMesh[] f6680a;

        public Mesh(SubMesh... subMeshArr) {
            this.f6680a = subMeshArr;
        }
    }

    public static final class SubMesh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f6683c;
        public final float[] d;

        public SubMesh(int i2, float[] fArr, float[] fArr2, int i3) {
            this.f6681a = i2;
            Assertions.b(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f6683c = fArr;
            this.d = fArr2;
            this.f6682b = i3;
        }
    }

    public Projection(Mesh mesh, Mesh mesh2, int i2) {
        this.f6677a = mesh;
        this.f6678b = mesh2;
        this.f6679c = i2;
        this.d = mesh == mesh2;
    }
}

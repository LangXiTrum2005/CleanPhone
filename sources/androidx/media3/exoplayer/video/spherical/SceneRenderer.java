package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.Format;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class SceneRenderer implements VideoFrameMetadataListener, CameraMotionListener {
    public int j0;
    public SurfaceTexture k0;
    public byte[] n0;
    public final AtomicBoolean X = new AtomicBoolean();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final AtomicBoolean f6693Y = new AtomicBoolean(true);
    public final ProjectionRenderer Z = new ProjectionRenderer();
    public final FrameRotationQueue e0 = new FrameRotationQueue();
    public final TimedValueQueue f0 = new TimedValueQueue();
    public final TimedValueQueue g0 = new TimedValueQueue();
    public final float[] h0 = new float[16];
    public final float[] i0 = new float[16];
    public volatile int l0 = 0;
    public int m0 = -1;

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public final void a(float[] fArr, long j) {
        this.e0.f6675c.a(j, fArr);
    }

    public final SurfaceTexture b() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.b();
            this.Z.a();
            GlUtil.b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GlUtil.b();
            int i2 = iArr[0];
            GlUtil.a(36197, i2);
            this.j0 = i2;
        } catch (GlUtil.GlException e2) {
            Log.d("SceneRenderer", "Failed to initialize the renderer", e2);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.j0);
        this.k0 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: androidx.media3.exoplayer.video.spherical.a
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.X.X.set(true);
            }
        });
        return this.k0;
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public final void c() {
        this.f0.b();
        FrameRotationQueue frameRotationQueue = this.e0;
        frameRotationQueue.f6675c.b();
        frameRotationQueue.d = false;
        this.f6693Y.set(true);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public final void f(long j, long j2, Format format, MediaFormat mediaFormat) {
        int i2;
        ArrayList arrayListA;
        this.f0.a(j2, Long.valueOf(j));
        byte[] bArr = format.x;
        int i3 = format.y;
        byte[] bArr2 = this.n0;
        int i4 = this.m0;
        this.n0 = bArr;
        if (i3 == -1) {
            i3 = this.l0;
        }
        this.m0 = i3;
        if (i4 == i3 && Arrays.equals(bArr2, this.n0)) {
            return;
        }
        byte[] bArr3 = this.n0;
        Projection projection = null;
        if (bArr3 != null) {
            int i5 = this.m0;
            ParsableByteArray parsableByteArray = new ParsableByteArray(bArr3);
            try {
                parsableByteArray.H(4);
                int iG = parsableByteArray.g();
                parsableByteArray.G(0);
                if (iG == 1886547818) {
                    parsableByteArray.H(8);
                    int i6 = parsableByteArray.f5668b;
                    int i7 = parsableByteArray.f5669c;
                    while (true) {
                        if (i6 < i7) {
                            int iG2 = parsableByteArray.g() + i6;
                            if (iG2 > i6 && iG2 <= i7) {
                                int iG3 = parsableByteArray.g();
                                if (iG3 != 2037673328 && iG3 != 1836279920) {
                                    parsableByteArray.G(iG2);
                                    i6 = iG2;
                                }
                                parsableByteArray.F(iG2);
                                arrayListA = ProjectionDecoder.a(parsableByteArray);
                            }
                        }
                        arrayListA = null;
                    }
                } else {
                    arrayListA = ProjectionDecoder.a(parsableByteArray);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListA != null) {
                int size = arrayListA.size();
                if (size == 1) {
                    Projection.Mesh mesh = (Projection.Mesh) arrayListA.get(0);
                    projection = new Projection(mesh, mesh, i5);
                } else if (size == 2) {
                    projection = new Projection((Projection.Mesh) arrayListA.get(0), (Projection.Mesh) arrayListA.get(1), i5);
                }
            }
        }
        if (projection == null || !ProjectionRenderer.b(projection)) {
            int i8 = this.m0;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f = radians / 36;
            float f2 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 36; i9 < i12; i12 = 36) {
                float f3 = radians / 2.0f;
                float f4 = (i9 * f) - f3;
                int i13 = i9 + 1;
                float f5 = (i13 * f) - f3;
                int i14 = 0;
                while (i14 < 73) {
                    float f6 = f5;
                    int i15 = i13;
                    float f7 = radians;
                    int i16 = i10;
                    int i17 = i11;
                    int i18 = 2;
                    int i19 = 0;
                    while (i19 < i18) {
                        float f8 = i19 == 0 ? f4 : f6;
                        float f9 = radians2;
                        float f10 = i14 * f2;
                        float f11 = f4;
                        float f12 = f;
                        double d = 50.0f;
                        double d2 = (f10 + 3.1415927f) - (f9 / 2.0f);
                        double dSin = Math.sin(d2) * d;
                        double d3 = f8;
                        fArr[i16] = -((float) (Math.cos(d3) * dSin));
                        fArr[i16 + 1] = (float) (Math.sin(d3) * d);
                        int i20 = i16 + 3;
                        fArr[i16 + 2] = (float) (Math.cos(d2) * d * Math.cos(d3));
                        fArr2[i17] = f10 / f9;
                        int i21 = i17 + 2;
                        fArr2[i17 + 1] = ((i9 + i19) * f12) / f7;
                        if ((i14 == 0 && i19 == 0) || (i14 == 72 && i19 == 1)) {
                            System.arraycopy(fArr, i16, fArr, i20, 3);
                            i16 += 6;
                            i2 = 2;
                            System.arraycopy(fArr2, i17, fArr2, i21, 2);
                            i17 += 4;
                        } else {
                            i2 = 2;
                            i16 = i20;
                            i17 = i21;
                        }
                        i19++;
                        i18 = i2;
                        radians2 = f9;
                        f4 = f11;
                        f = f12;
                    }
                    i14++;
                    i10 = i16;
                    i11 = i17;
                    f5 = f6;
                    i13 = i15;
                    radians = f7;
                    f = f;
                }
                i9 = i13;
            }
            Projection.Mesh mesh2 = new Projection.Mesh(new Projection.SubMesh(0, fArr, fArr2, 1));
            projection = new Projection(mesh2, mesh2, i8);
        }
        this.g0.a(j2, projection);
    }
}

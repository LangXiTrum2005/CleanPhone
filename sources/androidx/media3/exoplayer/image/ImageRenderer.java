package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import com.inmobi.commons.core.configs.CrashConfig;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public class ImageRenderer extends BaseRenderer {
    public int A0;
    public int B0;
    public Format C0;
    public ImageDecoder D0;
    public DecoderInputBuffer E0;
    public ImageOutput F0;
    public Bitmap G0;
    public boolean H0;
    public TileInfo I0;
    public TileInfo J0;
    public int K0;
    public final BitmapFactoryImageDecoder.Factory s0;
    public final DecoderInputBuffer t0;
    public final ArrayDeque u0;
    public boolean v0;
    public boolean w0;
    public OutputStreamInfo x0;
    public long y0;
    public long z0;

    public static final class OutputStreamInfo {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final OutputStreamInfo f6255c = new OutputStreamInfo(-9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6257b;

        public OutputStreamInfo(long j, long j2) {
            this.f6256a = j;
            this.f6257b = j2;
        }
    }

    public static class TileInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap f6260c;

        public TileInfo(int i2, long j) {
            this.f6258a = i2;
            this.f6259b = j;
        }
    }

    public ImageRenderer(BitmapFactoryImageDecoder.Factory factory) {
        super(4);
        this.s0 = factory;
        this.F0 = ImageOutput.f6254a;
        this.t0 = new DecoderInputBuffer(0);
        this.x0 = OutputStreamInfo.f6255c;
        this.u0 = new ArrayDeque();
        this.z0 = -9223372036854775807L;
        this.y0 = -9223372036854775807L;
        this.A0 = 0;
        this.B0 = 1;
    }

    public final void A() throws ExoPlaybackException {
        Format format = this.C0;
        BitmapFactoryImageDecoder.Factory factory = this.s0;
        int iA = factory.a(format);
        if (iA != RendererCapabilities.h(4, 0, 0, 0) && iA != RendererCapabilities.h(3, 0, 0, 0)) {
            throw o(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.C0, false, 4005);
        }
        ImageDecoder imageDecoder = this.D0;
        if (imageDecoder != null) {
            imageDecoder.release();
        }
        this.D0 = new BitmapFactoryImageDecoder(factory.f6252b);
    }

    public final void B() {
        this.E0 = null;
        this.A0 = 0;
        this.z0 = -9223372036854775807L;
        ImageDecoder imageDecoder = this.D0;
        if (imageDecoder != null) {
            imageDecoder.release();
            this.D0 = null;
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format) {
        return this.s0.a(format);
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void handleMessage(int i2, Object obj) {
        if (i2 != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.f6254a;
        }
        this.F0 = imageOutput;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final boolean isEnded() {
        return this.w0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        int i2 = this.B0;
        if (i2 != 3) {
            return i2 == 0 && this.H0;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void p() {
        this.C0 = null;
        this.x0 = OutputStreamInfo.f6255c;
        this.u0.clear();
        B();
        this.F0.a();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void q(boolean z2, boolean z3) {
        this.B0 = z3 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void r(long j, boolean z2) {
        this.B0 = Math.min(this.B0, 1);
        this.w0 = false;
        this.v0 = false;
        this.G0 = null;
        this.I0 = null;
        this.J0 = null;
        this.H0 = false;
        this.E0 = null;
        ImageDecoder imageDecoder = this.D0;
        if (imageDecoder != null) {
            imageDecoder.flush();
        }
        this.u0.clear();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void render(long j, long j2) throws ExoPlaybackException {
        if (this.w0) {
            return;
        }
        if (this.C0 == null) {
            FormatHolder formatHolder = this.Z;
            formatHolder.a();
            DecoderInputBuffer decoderInputBuffer = this.t0;
            decoderInputBuffer.d();
            int iX = x(formatHolder, decoderInputBuffer, 2);
            if (iX != -5) {
                if (iX == -4) {
                    Assertions.e(decoderInputBuffer.b(4));
                    this.v0 = true;
                    this.w0 = true;
                    return;
                }
                return;
            }
            Format format = formatHolder.f5911b;
            Assertions.f(format);
            this.C0 = format;
            A();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (y(j)) {
            }
            while (z(j)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e2) {
            throw o(e2, null, false, 4003);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void s() {
        B();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void t() {
        B();
        this.B0 = Math.min(this.B0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r7) goto L15;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(androidx.media3.common.Format[] r6, long r7, long r9) {
        /*
            r5 = this;
            androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo r6 = r5.x0
            long r6 = r6.f6257b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L31
            java.util.ArrayDeque r6 = r5.u0
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L26
            long r7 = r5.z0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L31
            long r2 = r5.y0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L26
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L26
            goto L31
        L26:
            androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo r7 = new androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo
            long r0 = r5.z0
            r7.<init>(r0, r9)
            r6.add(r7)
            return
        L31:
            androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo r6 = new androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo
            r6.<init>(r0, r9)
            r5.x0 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.image.ImageRenderer.w(androidx.media3.common.Format[], long, long):void");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0104  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0146  */
    public final boolean y(long j) throws ExoPlaybackException {
        boolean z2;
        TileInfo tileInfo;
        Bitmap bitmap;
        long j2;
        boolean z3;
        int i2;
        boolean z4;
        TileInfo tileInfo2;
        Format format;
        Format format2;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap2 = this.G0;
        if ((bitmap2 == null || this.I0 != null) && (this.B0 != 0 || this.i0 == 2)) {
            ArrayDeque arrayDeque = this.u0;
            if (bitmap2 == null) {
                Assertions.f(this.D0);
                ImageOutputBuffer imageOutputBufferDequeueOutputBuffer = this.D0.dequeueOutputBuffer();
                if (imageOutputBufferDequeueOutputBuffer != null) {
                    if (!imageOutputBufferDequeueOutputBuffer.b(4)) {
                        Bitmap bitmap3 = imageOutputBufferDequeueOutputBuffer.f0;
                        if (bitmap3 == null) {
                            throw new IllegalStateException("Non-EOS buffer came back from the decoder without bitmap.");
                        }
                        this.G0 = bitmap3;
                        imageOutputBufferDequeueOutputBuffer.f();
                        if (this.H0 && this.G0 != null && this.I0 != null) {
                            Assertions.f(this.C0);
                            Format format3 = this.C0;
                            int i3 = format3.H;
                            int i4 = format3.f5404I;
                            z2 = ((i3 != 1 && i4 == 1) || i3 == -1 || i4 == -1) ? false : true;
                            tileInfo = this.I0;
                            if (tileInfo.f6260c == null) {
                                if (z2) {
                                    Assertions.f(this.G0);
                                    int width = this.G0.getWidth();
                                    Format format4 = this.C0;
                                    Assertions.f(format4);
                                    int i5 = width / format4.H;
                                    int height = this.G0.getHeight();
                                    Format format5 = this.C0;
                                    Assertions.f(format5);
                                    int i6 = height / format5.f5404I;
                                    int i7 = this.C0.H;
                                    int i8 = tileInfo.f6258a;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.G0, (i8 % i7) * i5, (i8 / i7) * i6, i5, i6);
                                } else {
                                    bitmapCreateBitmap = this.G0;
                                    Assertions.f(bitmapCreateBitmap);
                                }
                                tileInfo.f6260c = bitmapCreateBitmap;
                            }
                            bitmap = this.I0.f6260c;
                            Assertions.f(bitmap);
                            j2 = this.I0.f6259b;
                            long j3 = j2 - j;
                            if (this.i0 == 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            i2 = this.B0;
                            if (i2 != 0) {
                                if (i2 != 1) {
                                    z3 = true;
                                } else {
                                    if (i2 == 3) {
                                        throw new IllegalStateException();
                                    }
                                    z3 = false;
                                }
                            }
                            if (!z3 || j3 < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                                this.F0.onImageAvailable(j2 - this.x0.f6257b, bitmap);
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                TileInfo tileInfo3 = this.I0;
                                Assertions.f(tileInfo3);
                                long j4 = tileInfo3.f6259b;
                                this.y0 = j4;
                                while (!arrayDeque.isEmpty() && j4 >= ((OutputStreamInfo) arrayDeque.peek()).f6256a) {
                                    this.x0 = (OutputStreamInfo) arrayDeque.removeFirst();
                                }
                                this.B0 = 3;
                                if (z2) {
                                    tileInfo2 = this.I0;
                                    Assertions.f(tileInfo2);
                                    format = this.C0;
                                    Assertions.f(format);
                                    format2 = this.C0;
                                    Assertions.f(format2);
                                    if (tileInfo2.f6258a == (format.f5404I * format2.H) - 1) {
                                        this.G0 = null;
                                    }
                                } else {
                                    this.G0 = null;
                                }
                                this.I0 = this.J0;
                                this.J0 = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.A0 == 3) {
                            B();
                            Assertions.f(this.C0);
                            A();
                            return false;
                        }
                        imageOutputBufferDequeueOutputBuffer.f();
                        if (arrayDeque.isEmpty()) {
                            this.w0 = true;
                            return false;
                        }
                    }
                }
            } else if (this.H0) {
                Assertions.f(this.C0);
                Format format6 = this.C0;
                int i9 = format6.H;
                int i10 = format6.f5404I;
                if (i9 != 1) {
                }
                tileInfo = this.I0;
                if (tileInfo.f6260c == null) {
                    if (z2) {
                        Assertions.f(this.G0);
                        int width2 = this.G0.getWidth();
                        Format format7 = this.C0;
                        Assertions.f(format7);
                        int i11 = width2 / format7.H;
                        int height2 = this.G0.getHeight();
                        Format format8 = this.C0;
                        Assertions.f(format8);
                        int i12 = height2 / format8.f5404I;
                        int i13 = this.C0.H;
                        int i14 = tileInfo.f6258a;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.G0, (i14 % i13) * i11, (i14 / i13) * i12, i11, i12);
                    } else {
                        bitmapCreateBitmap = this.G0;
                        Assertions.f(bitmapCreateBitmap);
                    }
                    tileInfo.f6260c = bitmapCreateBitmap;
                }
                bitmap = this.I0.f6260c;
                Assertions.f(bitmap);
                j2 = this.I0.f6259b;
                long j5 = j2 - j;
                if (this.i0 == 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i2 = this.B0;
                if (i2 != 0) {
                    if (i2 != 1) {
                        z3 = true;
                    } else {
                        if (i2 == 3) {
                            throw new IllegalStateException();
                        }
                        z3 = false;
                    }
                }
                if (z3) {
                    this.F0.onImageAvailable(j2 - this.x0.f6257b, bitmap);
                    z4 = true;
                } else {
                    this.F0.onImageAvailable(j2 - this.x0.f6257b, bitmap);
                    z4 = true;
                }
                if (z4) {
                    TileInfo tileInfo4 = this.I0;
                    Assertions.f(tileInfo4);
                    long j6 = tileInfo4.f6259b;
                    this.y0 = j6;
                    while (!arrayDeque.isEmpty()) {
                        this.x0 = (OutputStreamInfo) arrayDeque.removeFirst();
                    }
                    this.B0 = 3;
                    if (z2) {
                        tileInfo2 = this.I0;
                        Assertions.f(tileInfo2);
                        format = this.C0;
                        Assertions.f(format);
                        format2 = this.C0;
                        Assertions.f(format2);
                        if (tileInfo2.f6258a == (format.f5404I * format2.H) - 1) {
                            this.G0 = null;
                        }
                    } else {
                        this.G0 = null;
                    }
                    this.I0 = this.J0;
                    this.J0 = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00da  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:82:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x011c  */
    /* JADX WARN: Code duplicated, block: B:86:0x012d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:90:0x013c  */
    public final boolean z(long j) {
        int iX;
        ByteBuffer byteBuffer;
        boolean z2;
        DecoderInputBuffer decoderInputBuffer;
        long j2;
        boolean z3;
        TileInfo tileInfo;
        boolean z4;
        Format format;
        boolean z5;
        boolean z6;
        Format format2;
        int i2;
        DecoderInputBuffer decoderInputBuffer2;
        DecoderInputBuffer decoderInputBuffer3;
        if (!this.H0 || this.I0 == null) {
            FormatHolder formatHolder = this.Z;
            formatHolder.a();
            ImageDecoder imageDecoder = this.D0;
            if (imageDecoder != null && this.A0 != 3 && !this.v0) {
                if (this.E0 == null) {
                    DecoderInputBuffer decoderInputBuffer4 = (DecoderInputBuffer) imageDecoder.dequeueInputBuffer();
                    this.E0 = decoderInputBuffer4;
                    if (decoderInputBuffer4 != null) {
                        if (this.A0 == 2) {
                            Assertions.f(this.E0);
                            this.E0.X = 4;
                            ImageDecoder imageDecoder2 = this.D0;
                            Assertions.f(imageDecoder2);
                            imageDecoder2.queueInputBuffer(this.E0);
                            this.E0 = null;
                            this.A0 = 3;
                            return false;
                        }
                        iX = x(formatHolder, this.E0, 0);
                        if (iX != -5) {
                            Format format3 = formatHolder.f5911b;
                            Assertions.f(format3);
                            this.C0 = format3;
                            this.A0 = 2;
                            return true;
                        }
                        if (iX != -4) {
                            this.E0.h();
                            byteBuffer = this.E0.e0;
                            Assertions.f(byteBuffer);
                            if (byteBuffer.remaining() <= 0) {
                                decoderInputBuffer3 = this.E0;
                                Assertions.f(decoderInputBuffer3);
                                if (decoderInputBuffer3.b(4)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                ImageDecoder imageDecoder3 = this.D0;
                                Assertions.f(imageDecoder3);
                                DecoderInputBuffer decoderInputBuffer5 = this.E0;
                                Assertions.f(decoderInputBuffer5);
                                imageDecoder3.queueInputBuffer(decoderInputBuffer5);
                                this.K0 = 0;
                            }
                            decoderInputBuffer = this.E0;
                            Assertions.f(decoderInputBuffer);
                            if (decoderInputBuffer.b(4)) {
                                this.H0 = true;
                            } else {
                                int i3 = this.K0;
                                j2 = decoderInputBuffer.g0;
                                this.J0 = new TileInfo(i3, j2);
                                this.K0 = i3 + 1;
                                if (this.H0) {
                                    this.I0 = this.J0;
                                    this.J0 = null;
                                } else {
                                    if (j2 - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL <= j || j > CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL + j2) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    tileInfo = this.I0;
                                    if (tileInfo != null || tileInfo.f6259b > j || j >= j2) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    format = this.C0;
                                    Assertions.f(format);
                                    if (format.H != -1 || (i2 = (format2 = this.C0).f5404I) == -1 || i3 == (i2 * format2.H) - 1) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (!z3 || z4 || z5) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    this.H0 = z6;
                                    if (z4 || z3) {
                                        this.I0 = this.J0;
                                        this.J0 = null;
                                    }
                                }
                            }
                            decoderInputBuffer2 = this.E0;
                            Assertions.f(decoderInputBuffer2);
                            if (decoderInputBuffer2.b(4)) {
                                this.v0 = true;
                                this.E0 = null;
                                return false;
                            }
                            long j3 = this.z0;
                            DecoderInputBuffer decoderInputBuffer6 = this.E0;
                            Assertions.f(decoderInputBuffer6);
                            this.z0 = Math.max(j3, decoderInputBuffer6.g0);
                            if (z2) {
                                this.E0 = null;
                            } else {
                                DecoderInputBuffer decoderInputBuffer7 = this.E0;
                                Assertions.f(decoderInputBuffer7);
                                decoderInputBuffer7.d();
                            }
                            return !this.H0;
                        }
                        if (iX != -3) {
                            throw new IllegalStateException();
                        }
                    }
                } else {
                    if (this.A0 == 2) {
                        Assertions.f(this.E0);
                        this.E0.X = 4;
                        ImageDecoder imageDecoder4 = this.D0;
                        Assertions.f(imageDecoder4);
                        imageDecoder4.queueInputBuffer(this.E0);
                        this.E0 = null;
                        this.A0 = 3;
                        return false;
                    }
                    iX = x(formatHolder, this.E0, 0);
                    if (iX != -5) {
                        Format format4 = formatHolder.f5911b;
                        Assertions.f(format4);
                        this.C0 = format4;
                        this.A0 = 2;
                        return true;
                    }
                    if (iX != -4) {
                        this.E0.h();
                        byteBuffer = this.E0.e0;
                        Assertions.f(byteBuffer);
                        if (byteBuffer.remaining() <= 0) {
                            decoderInputBuffer3 = this.E0;
                            Assertions.f(decoderInputBuffer3);
                            if (decoderInputBuffer3.b(4)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            ImageDecoder imageDecoder5 = this.D0;
                            Assertions.f(imageDecoder5);
                            DecoderInputBuffer decoderInputBuffer8 = this.E0;
                            Assertions.f(decoderInputBuffer8);
                            imageDecoder5.queueInputBuffer(decoderInputBuffer8);
                            this.K0 = 0;
                        }
                        decoderInputBuffer = this.E0;
                        Assertions.f(decoderInputBuffer);
                        if (decoderInputBuffer.b(4)) {
                            this.H0 = true;
                        } else {
                            int i4 = this.K0;
                            j2 = decoderInputBuffer.g0;
                            this.J0 = new TileInfo(i4, j2);
                            this.K0 = i4 + 1;
                            if (this.H0) {
                                this.I0 = this.J0;
                                this.J0 = null;
                            } else {
                                if (j2 - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL <= j) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                tileInfo = this.I0;
                                if (tileInfo != null) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                format = this.C0;
                                Assertions.f(format);
                                if (format.H != -1) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                if (z3) {
                                    z6 = true;
                                } else {
                                    z6 = true;
                                }
                                this.H0 = z6;
                                if (z4) {
                                    this.I0 = this.J0;
                                    this.J0 = null;
                                } else {
                                    this.I0 = this.J0;
                                    this.J0 = null;
                                }
                            }
                        }
                        decoderInputBuffer2 = this.E0;
                        Assertions.f(decoderInputBuffer2);
                        if (decoderInputBuffer2.b(4)) {
                            this.v0 = true;
                            this.E0 = null;
                            return false;
                        }
                        long j4 = this.z0;
                        DecoderInputBuffer decoderInputBuffer9 = this.E0;
                        Assertions.f(decoderInputBuffer9);
                        this.z0 = Math.max(j4, decoderInputBuffer9.g0);
                        if (z2) {
                            this.E0 = null;
                        } else {
                            DecoderInputBuffer decoderInputBuffer10 = this.E0;
                            Assertions.f(decoderInputBuffer10);
                            decoderInputBuffer10.d();
                        }
                        return !this.H0;
                    }
                    if (iX != -3) {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return false;
    }
}

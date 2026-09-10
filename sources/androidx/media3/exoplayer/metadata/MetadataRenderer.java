package androidx.media3.exoplayer.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.metadata.MetadataDecoder;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class MetadataRenderer extends BaseRenderer implements Handler.Callback {
    public Metadata A0;
    public long B0;
    public final MetadataDecoderFactory s0;
    public final MetadataOutput t0;
    public final Handler u0;
    public final MetadataInputBuffer v0;
    public MetadataDecoder w0;
    public boolean x0;
    public boolean y0;
    public long z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper) {
        super(5);
        MetadataDecoderFactory metadataDecoderFactory = MetadataDecoderFactory.f6323a;
        this.t0 = metadataOutput;
        this.u0 = looper == null ? null : new Handler(looper, this);
        this.s0 = metadataDecoderFactory;
        this.v0 = new MetadataInputBuffer(1);
        this.B0 = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format) {
        if (((MetadataDecoderFactory.AnonymousClass1) this.s0).b(format)) {
            return RendererCapabilities.h(format.f5405J == 0 ? 4 : 2, 0, 0, 0);
        }
        return RendererCapabilities.h(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        this.t0.onMetadata((Metadata) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final boolean isEnded() {
        return this.y0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void p() {
        this.A0 = null;
        this.w0 = null;
        this.B0 = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void r(long j, boolean z2) {
        this.A0 = null;
        this.x0 = false;
        this.y0 = false;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void render(long j, long j2) {
        boolean z2 = true;
        while (z2) {
            if (!this.x0 && this.A0 == null) {
                MetadataInputBuffer metadataInputBuffer = this.v0;
                metadataInputBuffer.d();
                FormatHolder formatHolder = this.Z;
                formatHolder.a();
                int iX = x(formatHolder, metadataInputBuffer, 0);
                if (iX == -4) {
                    if (metadataInputBuffer.b(4)) {
                        this.x0 = true;
                    } else if (metadataInputBuffer.g0 >= this.m0) {
                        metadataInputBuffer.j0 = this.z0;
                        metadataInputBuffer.h();
                        MetadataDecoder metadataDecoder = this.w0;
                        int i2 = Util.f5683a;
                        Metadata metadataA = metadataDecoder.a(metadataInputBuffer);
                        if (metadataA != null) {
                            ArrayList arrayList = new ArrayList(metadataA.X.length);
                            y(metadataA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.A0 = new Metadata(z(metadataInputBuffer.g0), (Metadata.Entry[]) arrayList.toArray(new Metadata.Entry[0]));
                            }
                        }
                    }
                } else if (iX == -5) {
                    Format format = formatHolder.f5911b;
                    format.getClass();
                    this.z0 = format.r;
                }
            }
            Metadata metadata = this.A0;
            if (metadata == null || metadata.f5487Y > z(j)) {
                z2 = false;
            } else {
                Metadata metadata2 = this.A0;
                Handler handler = this.u0;
                if (handler != null) {
                    handler.obtainMessage(1, metadata2).sendToTarget();
                } else {
                    this.t0.onMetadata(metadata2);
                }
                this.A0 = null;
                z2 = true;
            }
            if (this.x0 && this.A0 == null) {
                this.y0 = true;
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void w(Format[] formatArr, long j, long j2) {
        this.w0 = ((MetadataDecoderFactory.AnonymousClass1) this.s0).a(formatArr[0]);
        Metadata metadata = this.A0;
        if (metadata != null) {
            long j3 = this.B0;
            long j4 = metadata.f5487Y;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                metadata = new Metadata(j5, metadata.X);
            }
            this.A0 = metadata;
        }
        this.B0 = j2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    public final void y(Metadata metadata, ArrayList arrayList) {
        int i2 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.X;
            if (i2 >= entryArr.length) {
                return;
            }
            Format formatG = entryArr[i2].G();
            if (formatG != null) {
                MetadataDecoderFactory.AnonymousClass1 anonymousClass1 = (MetadataDecoderFactory.AnonymousClass1) this.s0;
                if (anonymousClass1.b(formatG)) {
                    SimpleMetadataDecoder simpleMetadataDecoderA = anonymousClass1.a(formatG);
                    byte[] bArrH = entryArr[i2].H();
                    bArrH.getClass();
                    MetadataInputBuffer metadataInputBuffer = this.v0;
                    metadataInputBuffer.d();
                    metadataInputBuffer.g(bArrH.length);
                    ByteBuffer byteBuffer = metadataInputBuffer.e0;
                    int i3 = Util.f5683a;
                    byteBuffer.put(bArrH);
                    metadataInputBuffer.h();
                    Metadata metadataA = simpleMetadataDecoderA.a(metadataInputBuffer);
                    if (metadataA != null) {
                        y(metadataA, arrayList);
                    }
                } else {
                    arrayList.add(entryArr[i2]);
                }
            } else {
                arrayList.add(entryArr[i2]);
            }
            i2++;
        }
    }

    public final long z(long j) {
        Assertions.e(j != -9223372036854775807L);
        Assertions.e(this.B0 != -9223372036854775807L);
        return j - this.B0;
    }
}

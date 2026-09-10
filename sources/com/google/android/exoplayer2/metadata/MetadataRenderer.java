package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class MetadataRenderer extends BaseRenderer implements Handler.Callback {
    public final MetadataDecoderFactory n0;
    public final MetadataOutput o0;
    public final Handler p0;
    public final MetadataInputBuffer q0;
    public MetadataDecoder r0;
    public boolean s0;
    public boolean t0;
    public long u0;
    public Metadata v0;
    public long w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataRenderer(MetadataOutput metadataOutput, Looper looper) {
        Handler handler;
        super(5);
        MetadataDecoderFactory metadataDecoderFactory = MetadataDecoderFactory.f18198a;
        this.o0 = metadataOutput;
        if (looper == null) {
            handler = null;
        } else {
            int i2 = Util.f18979a;
            handler = new Handler(looper, this);
        }
        this.p0 = handler;
        this.n0 = metadataDecoderFactory;
        this.q0 = new MetadataInputBuffer(1);
        this.w0 = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int a(Format format) {
        if (((MetadataDecoderFactory.AnonymousClass1) this.n0).b(format)) {
            return RendererCapabilities.c(format.H0 == 0 ? 4 : 2, 0, 0);
        }
        return RendererCapabilities.c(0, 0, 0);
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.o0.onMetadata((Metadata) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public final boolean isEnded() {
        return this.t0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void j() {
        this.v0 = null;
        this.r0 = null;
        this.w0 = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void l(long j, boolean z2) {
        this.v0 = null;
        this.s0 = false;
        this.t0 = false;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void p(Format[] formatArr, long j, long j2) {
        this.r0 = ((MetadataDecoderFactory.AnonymousClass1) this.n0).a(formatArr[0]);
        Metadata metadata = this.v0;
        if (metadata != null) {
            long j3 = this.w0;
            long j4 = metadata.f18197Y;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                metadata = new Metadata(j5, metadata.X);
            }
            this.v0 = metadata;
        }
        this.w0 = j2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    public final void r(Metadata metadata, ArrayList arrayList) {
        int i2 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.X;
            if (i2 >= entryArr.length) {
                return;
            }
            Format formatG = entryArr[i2].G();
            if (formatG != null) {
                MetadataDecoderFactory.AnonymousClass1 anonymousClass1 = (MetadataDecoderFactory.AnonymousClass1) this.n0;
                if (anonymousClass1.b(formatG)) {
                    SimpleMetadataDecoder simpleMetadataDecoderA = anonymousClass1.a(formatG);
                    byte[] bArrH = entryArr[i2].H();
                    bArrH.getClass();
                    MetadataInputBuffer metadataInputBuffer = this.q0;
                    metadataInputBuffer.d();
                    metadataInputBuffer.g(bArrH.length);
                    ByteBuffer byteBuffer = metadataInputBuffer.Z;
                    int i3 = Util.f18979a;
                    byteBuffer.put(bArrH);
                    metadataInputBuffer.h();
                    Metadata metadataA = simpleMetadataDecoderA.a(metadataInputBuffer);
                    if (metadataA != null) {
                        r(metadataA, arrayList);
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

    @Override // com.google.android.exoplayer2.Renderer
    public final void render(long j, long j2) {
        boolean z2 = true;
        while (z2) {
            if (!this.s0 && this.v0 == null) {
                MetadataInputBuffer metadataInputBuffer = this.q0;
                metadataInputBuffer.d();
                FormatHolder formatHolder = this.f16996Y;
                formatHolder.a();
                int iQ = q(formatHolder, metadataInputBuffer, 0);
                if (iQ == -4) {
                    if (metadataInputBuffer.b(4)) {
                        this.s0 = true;
                    } else {
                        metadataInputBuffer.i0 = this.u0;
                        metadataInputBuffer.h();
                        MetadataDecoder metadataDecoder = this.r0;
                        int i2 = Util.f18979a;
                        Metadata metadataA = metadataDecoder.a(metadataInputBuffer);
                        if (metadataA != null) {
                            ArrayList arrayList = new ArrayList(metadataA.X.length);
                            r(metadataA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.v0 = new Metadata(s(metadataInputBuffer.f0), (Metadata.Entry[]) arrayList.toArray(new Metadata.Entry[0]));
                            }
                        }
                    }
                } else if (iQ == -5) {
                    Format format = formatHolder.f17094b;
                    format.getClass();
                    this.u0 = format.q0;
                }
            }
            Metadata metadata = this.v0;
            if (metadata == null || metadata.f18197Y > s(j)) {
                z2 = false;
            } else {
                Metadata metadata2 = this.v0;
                Handler handler = this.p0;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    this.o0.onMetadata(metadata2);
                }
                this.v0 = null;
                z2 = true;
            }
            if (this.s0 && this.v0 == null) {
                this.t0 = true;
            }
        }
    }

    public final long s(long j) {
        Assertions.d(j != -9223372036854775807L);
        Assertions.d(this.w0 != -9223372036854775807L);
        return j - this.w0;
    }
}

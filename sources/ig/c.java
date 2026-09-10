package ig;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import wf.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ec.a f43010i = new ec.a("DefaultDataSink");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaMuxer f43012b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f43011a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f43013c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f43014d = new e((Object) null, (Object) null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f43015e = new e((Object) null, (Object) null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f43016f = new e((Object) null, (Object) null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f43017g = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final od.c f43018h = new od.c(20);

    public c(String str) {
        try {
            this.f43012b = new MediaMuxer(str, 0);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // ig.a
    public final void a(vf.c cVar, MediaFormat mediaFormat) {
        String strH;
        ec.a aVar = f43010i;
        aVar.a("setTrackFormat(" + cVar + ") format=" + mediaFormat);
        e eVar = this.f43014d;
        Object objL = eVar.l(cVar);
        vf.b bVar = vf.b.f52575d;
        vf.c cVar2 = vf.c.AUDIO;
        vf.c cVar3 = vf.c.VIDEO;
        if (objL == bVar) {
            this.f43017g.getClass();
            if (cVar == cVar3) {
                ec.a aVar2 = d.f43019a;
                String string = mediaFormat.getString("mime");
                if (!"video/avc".equals(string)) {
                    throw new aa.b(defpackage.e.n("Video codecs other than AVC is not supported, actual mime type: ", string), 12);
                }
                ByteBuffer byteBufferAsReadOnlyBuffer = mediaFormat.getByteBuffer("csd-0").asReadOnlyBuffer();
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(byteBufferAsReadOnlyBuffer.limit()).order(byteBufferAsReadOnlyBuffer.order());
                byteBufferOrder.put(byteBufferAsReadOnlyBuffer);
                byteBufferOrder.flip();
                byte[] bArr = new byte[3];
                byteBufferOrder.get(bArr);
                if (!Arrays.equals(bArr, eg.a.f40037a)) {
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, 4);
                    bArrCopyOf[3] = byteBufferOrder.get();
                    if (!Arrays.equals(bArrCopyOf, eg.a.f40038b)) {
                        throw new IllegalStateException("AVC NAL start code not found in csd.");
                    }
                }
                byte b10 = byteBufferOrder.get();
                if (b10 != 103 && b10 != 39 && b10 != 71) {
                    throw new IllegalStateException("Got non SPS NAL data.");
                }
                byte b11 = byteBufferOrder.slice().get(0);
                if (b11 == 66) {
                    strH = "Baseline Profile";
                } else if (b11 == 77) {
                    strH = "Main Profile";
                } else if (b11 != 88) {
                    strH = b11 != 100 ? defpackage.e.h(b11, "Unknown Profile (", ")") : "High Profile";
                } else {
                    strH = "Extended Profile";
                }
                if (b11 == 66) {
                    aVar2.a("Output H.264 profile: " + strH);
                } else {
                    aVar2.b(2, null, defpackage.e.o("Output H.264 profile: ", strH, ". This might not be supported."));
                }
            } else if (cVar == cVar2) {
                String string2 = mediaFormat.getString("mime");
                if (!MimeTypes.AUDIO_AAC.equals(string2)) {
                    throw new aa.b(defpackage.e.n("Audio codecs other than AAC is not supported, actual mime type: ", string2), 12);
                }
            }
        }
        e eVar2 = this.f43015e;
        eVar2.b(cVar, mediaFormat);
        if (this.f43011a) {
            return;
        }
        boolean zD = ((vf.b) eVar.l(cVar3)).d();
        boolean zD2 = ((vf.b) eVar.l(cVar2)).d();
        MediaFormat mediaFormat2 = (MediaFormat) eg.a.a(eVar2, cVar3);
        MediaFormat mediaFormat3 = (MediaFormat) eg.a.a(eVar2, cVar2);
        boolean z10 = (mediaFormat2 == null && zD) ? false : true;
        boolean z11 = (mediaFormat3 == null && zD2) ? false : true;
        if (z10 && z11) {
            e eVar3 = this.f43016f;
            MediaMuxer mediaMuxer = this.f43012b;
            if (zD) {
                int iAddTrack = mediaMuxer.addTrack(mediaFormat2);
                Integer numValueOf = Integer.valueOf(iAddTrack);
                eVar3.getClass();
                eVar3.b(cVar3, numValueOf);
                aVar.c("Added track #" + iAddTrack + " with " + mediaFormat2.getString("mime") + " to muxer");
            }
            if (zD2) {
                int iAddTrack2 = mediaMuxer.addTrack(mediaFormat3);
                Integer numValueOf2 = Integer.valueOf(iAddTrack2);
                eVar3.getClass();
                eVar3.b(cVar2, numValueOf2);
                aVar.c("Added track #" + iAddTrack2 + " with " + mediaFormat3.getString("mime") + " to muxer");
            }
            mediaMuxer.start();
            this.f43011a = true;
            ArrayList<b> arrayList = this.f43013c;
            if (arrayList.isEmpty()) {
                return;
            }
            aVar.a("Output format determined, writing pending data into the muxer. samples:" + arrayList.size());
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            for (b bVar2 : arrayList) {
                bufferInfo.set(0, bVar2.f43007c, bVar2.f43008d, bVar2.f43009e);
                bVar2.f43006b.position(0);
                c(bVar2.f43005a, bVar2.f43006b, bufferInfo);
                bVar2.f43006b = null;
            }
            arrayList.clear();
        }
    }

    @Override // ig.a
    public final void c(vf.c cVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f43011a) {
            long j10 = bufferInfo.presentationTimeUs;
            if (j10 != 0) {
                bufferInfo.presentationTimeUs = this.f43018h.b(cVar, j10);
            }
            this.f43012b.writeSampleData(((Integer) this.f43016f.l(cVar)).intValue(), byteBuffer, bufferInfo);
            return;
        }
        f43010i.c("enqueue(" + cVar + "): offset=" + bufferInfo.offset + "\trealOffset=" + byteBuffer.position() + "\tsize=" + bufferInfo.size + "\trealSize=" + byteBuffer.remaining());
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(bufferInfo.size).order(ByteOrder.nativeOrder());
        byteBufferOrder.put(byteBuffer);
        this.f43013c.add(new b(cVar, byteBufferOrder, bufferInfo));
    }

    @Override // ig.a
    public final void release() {
        try {
            this.f43012b.release();
        } catch (Exception e10) {
            f43010i.b(2, e10, "Failed to release the muxer.");
        }
    }

    @Override // ig.a
    public final void stop() {
        this.f43012b.stop();
    }
}

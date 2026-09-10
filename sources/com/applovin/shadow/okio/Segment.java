package com.applovin.shadow.okio;

import com.adjust.sdk.Constants;
import com.ironsource.D1;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0003J\u001d\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006#"}, d2 = {"Lcom/applovin/shadow/okio/Segment;", "", "<init>", "()V", "", "data", "", "pos", "limit", "", "shared", "owner", "([BIIZZ)V", "sharedCopy", "()Lcom/applovin/shadow/okio/Segment;", "unsharedCopy", "pop", D1.f25924i, Constants.PUSH, "(Lcom/applovin/shadow/okio/Segment;)Lcom/applovin/shadow/okio/Segment;", "byteCount", "split", "(I)Lcom/applovin/shadow/okio/Segment;", "Lwj/r;", "compact", "sink", "writeTo", "(Lcom/applovin/shadow/okio/Segment;I)V", "[B", "I", "Z", "next", "Lcom/applovin/shadow/okio/Segment;", "prev", "Companion", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Segment {
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    public final byte[] data;
    public int limit;
    public Segment next;
    public boolean owner;
    public int pos;
    public Segment prev;
    public boolean shared;

    public Segment() {
        this.data = new byte[SIZE];
        this.owner = true;
        this.shared = false;
    }

    public final void compact() {
        int i10;
        Segment segment = this.prev;
        if (segment == this) {
            throw new IllegalStateException("cannot compact");
        }
        n.c(segment);
        if (segment.owner) {
            int i11 = this.limit - this.pos;
            Segment segment2 = this.prev;
            n.c(segment2);
            int i12 = 8192 - segment2.limit;
            Segment segment3 = this.prev;
            n.c(segment3);
            if (segment3.shared) {
                i10 = 0;
            } else {
                Segment segment4 = this.prev;
                n.c(segment4);
                i10 = segment4.pos;
            }
            if (i11 > i12 + i10) {
                return;
            }
            Segment segment5 = this.prev;
            n.c(segment5);
            writeTo(segment5, i11);
            pop();
            SegmentPool.recycle(this);
        }
    }

    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        n.c(segment2);
        segment2.next = this.next;
        Segment segment3 = this.next;
        n.c(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final Segment push(Segment segment) {
        n.f(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        n.c(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    public final Segment split(int byteCount) {
        Segment segmentTake;
        if (byteCount <= 0 || byteCount > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (byteCount >= 1024) {
            segmentTake = sharedCopy();
        } else {
            segmentTake = SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = segmentTake.data;
            int i10 = this.pos;
            k.g0(bArr, 0, i10, bArr2, i10 + byteCount);
        }
        segmentTake.limit = segmentTake.pos + byteCount;
        this.pos += byteCount;
        Segment segment = this.prev;
        n.c(segment);
        segment.push(segmentTake);
        return segmentTake;
    }

    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        n.e(bArrCopyOf, "copyOf(this, size)");
        return new Segment(bArrCopyOf, this.pos, this.limit, false, true);
    }

    public final void writeTo(Segment sink, int byteCount) {
        n.f(sink, "sink");
        if (!sink.owner) {
            throw new IllegalStateException("only owner can write");
        }
        int i10 = sink.limit;
        int i11 = i10 + byteCount;
        if (i11 > 8192) {
            if (sink.shared) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.pos;
            if (i11 - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            k.g0(bArr, 0, i12, bArr, i10);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i13 = sink.limit;
        int i14 = this.pos;
        k.g0(bArr2, i13, i14, bArr3, i14 + byteCount);
        sink.limit += byteCount;
        this.pos += byteCount;
    }

    public Segment(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        n.f(data, "data");
        this.data = data;
        this.pos = i10;
        this.limit = i11;
        this.shared = z10;
        this.owner = z11;
    }
}

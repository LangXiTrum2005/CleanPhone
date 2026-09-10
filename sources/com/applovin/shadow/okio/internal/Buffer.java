package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.C0231SegmentedByteString;
import com.applovin.shadow.okio.Options;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.SegmentPool;
import com.applovin.shadow.okio.SegmentedByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Utf8;
import com.applovin.shadow.okio._JvmPlatformKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.D1;
import com.ironsource.Xa;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import d5.u;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.EOFException;
import java.io.IOException;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l1.d;
import xj.k;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-Buffer, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a,\u0010\u0019\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0014\u0010\u001b\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0014\u0010\u001e\u001a\u00020\u001d*\u00020\u000bH\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0014\u0010!\u001a\u00020 *\u00020\u000bH\u0080\b¢\u0006\u0004\b!\u0010\"\u001a\u0014\u0010#\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010%\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b%\u0010\u001c\u001a\u001c\u0010'\u001a\u00020\u001d*\u00020\u000b2\u0006\u0010&\u001a\u00020\fH\u0080\b¢\u0006\u0004\b'\u0010(\u001a\u0014\u0010*\u001a\u00020)*\u00020\u000bH\u0080\b¢\u0006\u0004\b*\u0010+\u001a\u001c\u0010,\u001a\u00020)*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b,\u0010-\u001a0\u00100\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010/\u001a\u00020.2\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b0\u00101\u001a\u001c\u00103\u001a\u00020\u000b*\u00020\u000b2\u0006\u00102\u001a\u00020\fH\u0080\b¢\u0006\u0004\b3\u00104\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\u000b2\u0006\u00102\u001a\u00020\fH\u0080\b¢\u0006\u0004\b5\u00104\u001a\u001c\u00107\u001a\u00020\u0000*\u00020\u000b2\u0006\u00106\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b7\u00108\u001a\u001c\u00100\u001a\u00020\u000b*\u00020\u000b2\u0006\u00109\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b0\u0010:\u001a,\u00100\u001a\u00020\u000b*\u00020\u000b2\u0006\u00109\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b0\u0010;\u001a\u0014\u0010<\u001a\u00020\u0004*\u00020\u000bH\u0080\b¢\u0006\u0004\b<\u0010=\u001a\u001c\u0010<\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b<\u0010>\u001a\u001c\u0010@\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010?\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b@\u0010A\u001a\u001c\u0010B\u001a\u00020)*\u00020\u000b2\u0006\u0010?\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\bB\u0010C\u001a,\u0010@\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b@\u0010D\u001a\u0014\u0010E\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bE\u0010\u001c\u001a\u0014\u0010F\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bF\u0010\u001c\u001a\u0014\u0010G\u001a\u00020.*\u00020\u000bH\u0080\b¢\u0006\u0004\bG\u0010H\u001a\u001c\u0010G\u001a\u00020.*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\bG\u0010I\u001a\u001c\u0010J\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0080\b¢\u0006\u0004\bJ\u0010K\u001a$\u0010B\u001a\u00020)*\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\bB\u0010L\u001a\u001c\u0010N\u001a\u00020\f*\u00020\u000b2\u0006\u0010?\u001a\u00020MH\u0080\b¢\u0006\u0004\bN\u0010O\u001a\u001c\u0010P\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\bP\u0010\u0010\u001a\u0016\u0010Q\u001a\u0004\u0018\u00010\u000e*\u00020\u000bH\u0080\b¢\u0006\u0004\bQ\u0010R\u001a\u001c\u0010T\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010S\u001a\u00020\fH\u0080\b¢\u0006\u0004\bT\u0010\u0010\u001a\u0014\u0010U\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\bU\u0010$\u001a,\u0010Y\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010V\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\u00022\u0006\u0010X\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bY\u0010Z\u001a\u001c\u0010\\\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010[\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\\\u0010]\u001a\u001c\u0010_\u001a\u00020\f*\u00020\u000b2\u0006\u00109\u001a\u00020^H\u0080\b¢\u0006\u0004\b_\u0010`\u001a$\u00100\u001a\u00020\u000b*\u00020\u000b2\u0006\u00109\u001a\u00020^2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b0\u0010a\u001a\u001c\u0010c\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010b\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bc\u0010]\u001a\u001c\u0010e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010d\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\be\u0010]\u001a\u001c\u0010g\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010f\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bg\u0010]\u001a\u001c\u0010h\u001a\u00020\u000b*\u00020\u000b2\u0006\u00102\u001a\u00020\fH\u0080\b¢\u0006\u0004\bh\u00104\u001a$\u00100\u001a\u00020)*\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b0\u0010L\u001a$\u0010@\u001a\u00020\f*\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b@\u0010i\u001a,\u0010l\u001a\u00020\f*\u00020\u000b2\u0006\u0010b\u001a\u00020\u001d2\u0006\u0010j\u001a\u00020\f2\u0006\u0010k\u001a\u00020\fH\u0080\b¢\u0006\u0004\bl\u0010m\u001a$\u0010l\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020.2\u0006\u0010j\u001a\u00020\fH\u0080\b¢\u0006\u0004\bl\u0010n\u001a$\u0010p\u001a\u00020\f*\u00020\u000b2\u0006\u0010o\u001a\u00020.2\u0006\u0010j\u001a\u00020\fH\u0080\b¢\u0006\u0004\bp\u0010n\u001a4\u0010q\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020.2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bq\u0010r\u001a\u001e\u0010u\u001a\u00020\b*\u00020\u000b2\b\u0010t\u001a\u0004\u0018\u00010sH\u0080\b¢\u0006\u0004\bu\u0010v\u001a\u0014\u0010w\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\bw\u0010$\u001a\u0014\u0010x\u001a\u00020\u000b*\u00020\u000bH\u0080\b¢\u0006\u0004\bx\u0010y\u001a\u0014\u0010z\u001a\u00020.*\u00020\u000bH\u0080\b¢\u0006\u0004\bz\u0010H\u001a\u001c\u0010z\u001a\u00020.*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bz\u0010{\u001a\u001b\u0010~\u001a\u00020|*\u00020\u000b2\u0006\u0010}\u001a\u00020|H\u0000¢\u0006\u0004\b~\u0010\u007f\u001a\u001d\u0010\u0080\u0001\u001a\u00020|*\u00020\u000b2\u0006\u0010}\u001a\u00020|H\u0000¢\u0006\u0005\b\u0080\u0001\u0010\u007f\u001a\u0017\u0010\u0081\u0001\u001a\u00020\u0002*\u00020|H\u0080\b¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u001f\u0010\u0083\u0001\u001a\u00020\u0002*\u00020|2\u0006\u0010\u0017\u001a\u00020\fH\u0080\b¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a \u0010\u0086\u0001\u001a\u00020\f*\u00020|2\u0007\u0010\u0085\u0001\u001a\u00020\fH\u0080\b¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a \u0010\u0089\u0001\u001a\u00020\f*\u00020|2\u0007\u0010\u0088\u0001\u001a\u00020\u0002H\u0080\b¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0017\u0010\u008b\u0001\u001a\u00020)*\u00020|H\u0080\b¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001aG\u0010\u0090\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u008d\u0001*\u00020\u000b2\u0006\u0010j\u001a\u00020\f2\u001c\u0010\u008f\u0001\u001a\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u008e\u0001H\u0080\bø\u0001\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\"'\u0010\u0092\u0001\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u0012\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0017\u0010\u0098\u0001\u001a\u00020\u00028\u0000X\u0080T¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0017\u0010\u009a\u0001\u001a\u00020\f8\u0000X\u0080T¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0017\u0010\u009c\u0001\u001a\u00020\f8\u0000X\u0080T¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009b\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u009d\u0001"}, d2 = {"Lcom/applovin/shadow/okio/Segment;", D1.f25924i, "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "rangeEquals", "(Lcom/applovin/shadow/okio/Segment;I[BII)Z", "Lcom/applovin/shadow/okio/Buffer;", "", "newline", "", "readUtf8Line", "(Lcom/applovin/shadow/okio/Buffer;J)Ljava/lang/String;", "Lcom/applovin/shadow/okio/Options;", "options", "selectTruncated", "selectPrefix", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Options;Z)I", "out", "offset", "byteCount", "commonCopyTo", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Buffer;JJ)Lcom/applovin/shadow/okio/Buffer;", "commonCompleteSegmentByteCount", "(Lcom/applovin/shadow/okio/Buffer;)J", "", "commonReadByte", "(Lcom/applovin/shadow/okio/Buffer;)B", "", "commonReadShort", "(Lcom/applovin/shadow/okio/Buffer;)S", "commonReadInt", "(Lcom/applovin/shadow/okio/Buffer;)I", "commonReadLong", "pos", "commonGet", "(Lcom/applovin/shadow/okio/Buffer;J)B", "Lwj/r;", "commonClear", "(Lcom/applovin/shadow/okio/Buffer;)V", "commonSkip", "(Lcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okio/ByteString;", "byteString", "commonWrite", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/ByteString;II)Lcom/applovin/shadow/okio/Buffer;", "v", "commonWriteDecimalLong", "(Lcom/applovin/shadow/okio/Buffer;J)Lcom/applovin/shadow/okio/Buffer;", "commonWriteHexadecimalUnsignedLong", "minimumCapacity", "commonWritableSegment", "(Lcom/applovin/shadow/okio/Buffer;I)Lcom/applovin/shadow/okio/Segment;", "source", "(Lcom/applovin/shadow/okio/Buffer;[B)Lcom/applovin/shadow/okio/Buffer;", "(Lcom/applovin/shadow/okio/Buffer;[BII)Lcom/applovin/shadow/okio/Buffer;", "commonReadByteArray", "(Lcom/applovin/shadow/okio/Buffer;)[B", "(Lcom/applovin/shadow/okio/Buffer;J)[B", "sink", "commonRead", "(Lcom/applovin/shadow/okio/Buffer;[B)I", "commonReadFully", "(Lcom/applovin/shadow/okio/Buffer;[B)V", "(Lcom/applovin/shadow/okio/Buffer;[BII)I", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonReadByteString", "(Lcom/applovin/shadow/okio/Buffer;)Lcom/applovin/shadow/okio/ByteString;", "(Lcom/applovin/shadow/okio/Buffer;J)Lcom/applovin/shadow/okio/ByteString;", "commonSelect", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Options;)I", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okio/Sink;", "commonReadAll", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Sink;)J", "commonReadUtf8", "commonReadUtf8Line", "(Lcom/applovin/shadow/okio/Buffer;)Ljava/lang/String;", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", "string", "beginIndex", "endIndex", "commonWriteUtf8", "(Lcom/applovin/shadow/okio/Buffer;Ljava/lang/String;II)Lcom/applovin/shadow/okio/Buffer;", "codePoint", "commonWriteUtf8CodePoint", "(Lcom/applovin/shadow/okio/Buffer;I)Lcom/applovin/shadow/okio/Buffer;", "Lcom/applovin/shadow/okio/Source;", "commonWriteAll", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Source;)J", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Source;J)Lcom/applovin/shadow/okio/Buffer;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "commonWriteByte", "s", "commonWriteShort", "i", "commonWriteInt", "commonWriteLong", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Buffer;J)J", "fromIndex", "toIndex", "commonIndexOf", "(Lcom/applovin/shadow/okio/Buffer;BJJ)J", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/ByteString;J)J", "targetBytes", "commonIndexOfElement", "commonRangeEquals", "(Lcom/applovin/shadow/okio/Buffer;JLcom/applovin/shadow/okio/ByteString;II)Z", "", "other", "commonEquals", "(Lcom/applovin/shadow/okio/Buffer;Ljava/lang/Object;)Z", "commonHashCode", "commonCopy", "(Lcom/applovin/shadow/okio/Buffer;)Lcom/applovin/shadow/okio/Buffer;", "commonSnapshot", "(Lcom/applovin/shadow/okio/Buffer;I)Lcom/applovin/shadow/okio/ByteString;", "Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "unsafeCursor", "commonReadUnsafe", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;)Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "commonReadAndWriteUnsafe", "commonNext", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;)I", "commonSeek", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;J)I", "newSize", "commonResizeBuffer", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;J)J", "minByteCount", "commonExpandBuffer", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;I)J", "commonClose", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function2;", "lambda", "seek", "(Llo/e;JLjk/c;)Ljava/lang/Object;", "HEX_DIGIT_BYTES", "[B", "getHEX_DIGIT_BYTES", "()[B", "getHEX_DIGIT_BYTES$annotations", "()V", "SEGMENTING_THRESHOLD", "I", "OVERFLOW_ZONE", "J", "OVERFLOW_DIGIT_START", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Buffer {
    private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        n.f(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonClose(com.applovin.shadow.okio.Buffer.UnsafeCursor unsafeCursor) {
        n.f(unsafeCursor, "<this>");
        if (unsafeCursor.buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonCompleteSegmentByteCount(com.applovin.shadow.okio.Buffer buffer) {
        n.f(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        n.c(segment);
        Segment segment2 = segment.prev;
        n.c(segment2);
        int i10 = segment2.limit;
        return (i10 >= 8192 || !segment2.owner) ? size : size - ((long) (i10 - segment2.pos));
    }

    public static final com.applovin.shadow.okio.Buffer commonCopy(com.applovin.shadow.okio.Buffer buffer) {
        n.f(buffer, "<this>");
        com.applovin.shadow.okio.Buffer buffer2 = new com.applovin.shadow.okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        n.c(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer2.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            n.c(segment3);
            n.c(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    public static final com.applovin.shadow.okio.Buffer commonCopyTo(com.applovin.shadow.okio.Buffer buffer, com.applovin.shadow.okio.Buffer out, long j10, long j11) {
        n.f(buffer, "<this>");
        n.f(out, "out");
        long j12 = j10;
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j12, j11);
        if (j11 != 0) {
            out.setSize$okio(out.size() + j11);
            Segment segment = buffer.head;
            while (true) {
                n.c(segment);
                int i10 = segment.limit;
                int i11 = segment.pos;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j13 = j11;
            while (j13 > 0) {
                n.c(segment2);
                Segment segmentSharedCopy = segment2.sharedCopy();
                int i12 = segmentSharedCopy.pos + ((int) j12);
                segmentSharedCopy.pos = i12;
                segmentSharedCopy.limit = Math.min(i12 + ((int) j13), segmentSharedCopy.limit);
                Segment segment3 = out.head;
                if (segment3 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    out.head = segmentSharedCopy;
                } else {
                    n.c(segment3);
                    Segment segment4 = segment3.prev;
                    n.c(segment4);
                    segment4.push(segmentSharedCopy);
                }
                j13 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
                segment2 = segment2.next;
                j12 = 0;
            }
        }
        return buffer;
    }

    public static final boolean commonEquals(com.applovin.shadow.okio.Buffer buffer, Object obj) {
        n.f(buffer, "<this>");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.shadow.okio.Buffer)) {
            return false;
        }
        com.applovin.shadow.okio.Buffer buffer2 = (com.applovin.shadow.okio.Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        Segment segment = buffer.head;
        n.c(segment);
        Segment segment2 = buffer2.head;
        n.c(segment2);
        int i10 = segment.pos;
        int i11 = segment2.pos;
        long j10 = 0;
        while (j10 < buffer.size()) {
            long jMin = Math.min(segment.limit - i10, segment2.limit - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (segment.data[i10] != segment2.data[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == segment.limit) {
                segment = segment.next;
                n.c(segment);
                i10 = segment.pos;
            }
            if (i11 == segment2.limit) {
                segment2 = segment2.next;
                n.c(segment2);
                i11 = segment2.pos;
            }
            j10 += jMin;
        }
        return true;
    }

    public static final long commonExpandBuffer(com.applovin.shadow.okio.Buffer.UnsafeCursor unsafeCursor, int i10) {
        n.f(unsafeCursor, "<this>");
        if (i10 <= 0) {
            throw new IllegalArgumentException(d.e(i10, "minByteCount <= 0: ").toString());
        }
        if (i10 > 8192) {
            throw new IllegalArgumentException(d.e(i10, "minByteCount > Segment.SIZE: ").toString());
        }
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i10);
        int i11 = 8192 - segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = Segment.SIZE;
        long j10 = i11;
        buffer.setSize$okio(size + j10);
        unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = segmentWritableSegment$okio.data;
        unsafeCursor.start = 8192 - i11;
        unsafeCursor.end = Segment.SIZE;
        return j10;
    }

    public static final byte commonGet(com.applovin.shadow.okio.Buffer buffer, long j10) {
        n.f(buffer, "<this>");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j10, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            n.c(null);
            throw null;
        }
        if (buffer.size() - j10 < j10) {
            long size = buffer.size();
            while (size > j10) {
                segment = segment.prev;
                n.c(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            return segment.data[(int) ((((long) segment.pos) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            int i10 = segment.limit;
            int i11 = segment.pos;
            long j12 = ((long) (i10 - i11)) + j11;
            if (j12 > j10) {
                return segment.data[(int) ((((long) i11) + j10) - j11)];
            }
            segment = segment.next;
            n.c(segment);
            j11 = j12;
        }
    }

    public static final int commonHashCode(com.applovin.shadow.okio.Buffer buffer) {
        n.f(buffer, "<this>");
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = segment.limit;
            for (int i12 = segment.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + segment.data[i12];
            }
            segment = segment.next;
            n.c(segment);
        } while (segment != buffer.head);
        return i10;
    }

    public static final long commonIndexOf(com.applovin.shadow.okio.Buffer buffer, byte b10, long j10, long j11) {
        Segment segment;
        int i10;
        n.f(buffer, "<this>");
        long size = 0;
        if (0 > j10 || j10 > j11) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(buffer.size());
            sb2.append(" fromIndex=");
            sb2.append(j10);
            throw new IllegalArgumentException(e.s(sb2, " toIndex=", j11).toString());
        }
        if (j11 > buffer.size()) {
            j11 = buffer.size();
        }
        if (j10 == j11 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j10 < j10) {
            size = buffer.size();
            while (size > j10) {
                segment = segment.prev;
                n.c(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            while (size < j11) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + j11) - size);
                i10 = (int) ((((long) segment.pos) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                n.c(segment);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (segment.limit - segment.pos)) + size;
            if (j12 > j10) {
                break;
            }
            segment = segment.next;
            n.c(segment);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + j11) - size);
            i10 = (int) ((((long) segment.pos) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            n.c(segment);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - segment.pos)) + size;
    }

    public static final long commonIndexOfElement(com.applovin.shadow.okio.Buffer buffer, ByteString targetBytes, long j10) {
        int i10;
        int i11;
        n.f(buffer, "<this>");
        n.f(targetBytes, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(e.i(j10, "fromIndex < 0: ").toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j10 < j10) {
            size = buffer.size();
            while (size > j10) {
                segment = segment.prev;
                n.c(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (targetBytes.size() == 2) {
                byte b10 = targetBytes.getByte(0);
                byte b11 = targetBytes.getByte(1);
                while (size < buffer.size()) {
                    byte[] bArr = segment.data;
                    i10 = (int) ((((long) segment.pos) + j10) - size);
                    int i12 = segment.limit;
                    while (true) {
                        if (i10 >= i12) {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            n.c(segment);
                            j10 = size;
                        } else {
                            byte b12 = bArr[i10];
                            if (b12 == b10 || b12 == b11) {
                                i11 = segment.pos;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i10 = (int) ((((long) segment.pos) + j10) - size);
                    int i13 = segment.limit;
                    while (true) {
                        if (i10 < i13) {
                            byte b13 = bArr2[i10];
                            int length = bArrInternalArray$okio.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    i10++;
                                } else if (b13 == bArrInternalArray$okio[i14]) {
                                    i11 = segment.pos;
                                } else {
                                    i14++;
                                }
                            }
                        } else {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            n.c(segment);
                            j10 = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (segment.limit - segment.pos)) + size;
            if (j11 > j10) {
                break;
            }
            segment = segment.next;
            n.c(segment);
            size = j11;
        }
        if (targetBytes.size() == 2) {
            byte b14 = targetBytes.getByte(0);
            byte b15 = targetBytes.getByte(1);
            while (size < buffer.size()) {
                byte[] bArr3 = segment.data;
                i10 = (int) ((((long) segment.pos) + j10) - size);
                int i15 = segment.limit;
                while (true) {
                    if (i10 >= i15) {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        n.c(segment);
                        j10 = size;
                    } else {
                        byte b16 = bArr3[i10];
                        if (b16 == b14 || b16 == b15) {
                            i11 = segment.pos;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < buffer.size()) {
                byte[] bArr4 = segment.data;
                i10 = (int) ((((long) segment.pos) + j10) - size);
                int i16 = segment.limit;
                while (true) {
                    if (i10 < i16) {
                        byte b17 = bArr4[i10];
                        int length2 = bArrInternalArray$okio2.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                i10++;
                            } else if (b17 == bArrInternalArray$okio2[i17]) {
                                i11 = segment.pos;
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        n.c(segment);
                        j10 = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    public static final int commonNext(com.applovin.shadow.okio.Buffer.UnsafeCursor unsafeCursor) {
        n.f(unsafeCursor, "<this>");
        long j10 = unsafeCursor.offset;
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        n.c(buffer);
        if (j10 == buffer.size()) {
            throw new IllegalStateException("no more bytes");
        }
        long j11 = unsafeCursor.offset;
        return unsafeCursor.seek(j11 == -1 ? 0L : j11 + ((long) (unsafeCursor.end - unsafeCursor.start)));
    }

    public static final boolean commonRangeEquals(com.applovin.shadow.okio.Buffer buffer, long j10, ByteString bytes, int i10, int i11) {
        n.f(buffer, "<this>");
        n.f(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || buffer.size() - j10 < i11 || bytes.size() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (buffer.getByte(((long) i12) + j10) != bytes.getByte(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(com.applovin.shadow.okio.Buffer buffer, byte[] sink) {
        n.f(buffer, "<this>");
        n.f(sink, "sink");
        return buffer.read(sink, 0, sink.length);
    }

    public static final long commonReadAll(com.applovin.shadow.okio.Buffer buffer, Sink sink) throws IOException {
        n.f(buffer, "<this>");
        n.f(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    public static final com.applovin.shadow.okio.Buffer.UnsafeCursor commonReadAndWriteUnsafe(com.applovin.shadow.okio.Buffer buffer, com.applovin.shadow.okio.Buffer.UnsafeCursor unsafeCursor) {
        n.f(buffer, "<this>");
        n.f(unsafeCursor, "unsafeCursor");
        com.applovin.shadow.okio.Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = true;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final byte commonReadByte(com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        n.f(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        n.c(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        int i12 = i10 + 1;
        byte b10 = segment.data[i10];
        buffer.setSize$okio(buffer.size() - 1);
        if (i12 != i11) {
            segment.pos = i12;
            return b10;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return b10;
    }

    public static final byte[] commonReadByteArray(com.applovin.shadow.okio.Buffer buffer) {
        n.f(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    public static final ByteString commonReadByteString(com.applovin.shadow.okio.Buffer buffer) {
        n.f(buffer, "<this>");
        return buffer.readByteString(buffer.size());
    }

    public static final long commonReadDecimalLong(com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        long j10;
        byte b10;
        n.f(buffer, "<this>");
        long j11 = 0;
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j12 = 0;
        long j13 = -7;
        boolean z11 = false;
        loop0: while (true) {
            Segment segment = buffer.head;
            n.c(segment);
            byte[] bArr = segment.data;
            int i11 = segment.pos;
            int i12 = segment.limit;
            while (true) {
                if (i11 >= i12) {
                    j10 = j11;
                    break;
                }
                b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j12 < OVERFLOW_ZONE) {
                        break loop0;
                    }
                    j10 = j11;
                    if (j12 == OVERFLOW_ZONE && i13 < j13) {
                        break loop0;
                    }
                    j12 = (j12 * 10) + ((long) i13);
                } else {
                    j10 = j11;
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j13--;
                    z10 = true;
                }
                i11++;
                i10++;
                j11 = j10;
            }
            if (i11 == i12) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i11;
            }
            if (z11 || buffer.head == null) {
                buffer.setSize$okio(buffer.size() - ((long) i10));
                if (i10 >= (z10 ? 2 : 1)) {
                    return z10 ? j12 : -j12;
                }
                if (buffer.size() == j10) {
                    throw new EOFException();
                }
                StringBuilder sbJ = u.j(z10 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                sbJ.append(SegmentedByteString.toHexString(buffer.getByte(j10)));
                throw new NumberFormatException(sbJ.toString());
            }
            j11 = j10;
        }
        com.applovin.shadow.okio.Buffer bufferWriteByte = new com.applovin.shadow.okio.Buffer().writeDecimalLong(j12).writeByte((int) b10);
        if (!z10) {
            bufferWriteByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + bufferWriteByte.readUtf8());
    }

    public static final void commonReadFully(com.applovin.shadow.okio.Buffer buffer, byte[] sink) throws EOFException {
        n.f(buffer, "<this>");
        n.f(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = buffer.read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        int i10;
        n.f(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            Segment segment = buffer.head;
            n.c(segment);
            byte[] bArr = segment.data;
            int i12 = segment.pos;
            int i13 = segment.limit;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 != 0) {
                            z10 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + SegmentedByteString.toHexString(b10));
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new com.applovin.shadow.okio.Buffer().writeHexadecimalUnsignedLong(j10).writeByte((int) b10).readUtf8());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i12;
            }
            if (z10) {
                break;
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - ((long) i11));
        return j10;
    }

    public static final int commonReadInt(com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        n.f(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        n.c(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 4) {
            return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        buffer.setSize$okio(buffer.size() - 4);
        if (i14 != i11) {
            segment.pos = i14;
            return i15;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return i15;
    }

    public static final long commonReadLong(com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        n.f(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        n.c(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 8) {
            return ((((long) buffer.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) buffer.readInt()));
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i13 != i11) {
            segment.pos = i13;
            return j11;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return j11;
    }

    public static final short commonReadShort(com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        n.f(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        n.c(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 2) {
            return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        buffer.setSize$okio(buffer.size() - 2);
        if (i14 == i11) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i14;
        }
        return (short) i15;
    }

    public static final com.applovin.shadow.okio.Buffer.UnsafeCursor commonReadUnsafe(com.applovin.shadow.okio.Buffer buffer, com.applovin.shadow.okio.Buffer.UnsafeCursor unsafeCursor) {
        n.f(buffer, "<this>");
        n.f(unsafeCursor, "unsafeCursor");
        com.applovin.shadow.okio.Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = false;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final String commonReadUtf8(com.applovin.shadow.okio.Buffer buffer, long j10) throws EOFException {
        n.f(buffer, "<this>");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(e.i(j10, "byteCount: ").toString());
        }
        if (buffer.size() < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        Segment segment = buffer.head;
        n.c(segment);
        int i10 = segment.pos;
        if (((long) i10) + j10 > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j10), 0, 0, 3, null);
        }
        int i11 = (int) j10;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i10, i10 + i11);
        segment.pos += i11;
        buffer.setSize$okio(buffer.size() - j10);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        int i10;
        int i11;
        int i12;
        n.f(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b10 = buffer.getByte(0L);
        if ((b10 & 128) == 0) {
            i10 = b10 & 127;
            i12 = 0;
            i11 = 1;
        } else if ((b10 & 224) == 192) {
            i10 = b10 & 31;
            i11 = 2;
            i12 = 128;
        } else if ((b10 & 240) == 224) {
            i10 = b10 & 15;
            i11 = 3;
            i12 = a.f29616n;
        } else {
            if ((b10 & 248) != 240) {
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = b10 & 7;
            i11 = 4;
            i12 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        long j10 = i11;
        if (buffer.size() < j10) {
            StringBuilder sbU = e.u(i11, "size < ", ": ");
            sbU.append(buffer.size());
            sbU.append(" (to read code point prefixed 0x");
            sbU.append(SegmentedByteString.toHexString(b10));
            sbU.append(')');
            throw new EOFException(sbU.toString());
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte b11 = buffer.getByte(j11);
            if ((b11 & 192) != 128) {
                buffer.skip(j11);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = (i10 << 6) | (b11 & Utf8.REPLACEMENT_BYTE);
        }
        buffer.skip(j10);
        if (i10 > 1114111) {
            return Utf8.REPLACEMENT_CODE_POINT;
        }
        return ((55296 > i10 || i10 >= 57344) && i10 >= i12) ? i10 : Utf8.REPLACEMENT_CODE_POINT;
    }

    public static final String commonReadUtf8Line(com.applovin.shadow.okio.Buffer buffer) {
        n.f(buffer, "<this>");
        long jIndexOf = buffer.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(com.applovin.shadow.okio.Buffer buffer, long j10) throws EOFException {
        n.f(buffer, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(e.i(j10, "limit < 0: ").toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jIndexOf = buffer.indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (j11 < buffer.size() && buffer.getByte(j11 - 1) == 13 && buffer.getByte(j11) == 10) {
            return readUtf8Line(buffer, j11);
        }
        com.applovin.shadow.okio.Buffer buffer2 = new com.applovin.shadow.okio.Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j10) + " content=" + buffer2.readByteString().hex() + (char) 8230);
    }

    public static final long commonResizeBuffer(com.applovin.shadow.okio.Buffer.UnsafeCursor unsafeCursor, long j10) {
        n.f(unsafeCursor, "<this>");
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        if (j10 <= size) {
            if (j10 < 0) {
                throw new IllegalArgumentException(e.i(j10, "newSize < 0: ").toString());
            }
            long j11 = size - j10;
            while (j11 > 0) {
                Segment segment = buffer.head;
                n.c(segment);
                Segment segment2 = segment.prev;
                n.c(segment2);
                int i10 = segment2.limit;
                long j12 = i10 - segment2.pos;
                if (j12 > j11) {
                    segment2.limit = i10 - ((int) j11);
                    break;
                }
                buffer.head = segment2.pop();
                SegmentPool.recycle(segment2);
                j11 -= j12;
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j10;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j10 > size) {
            long j13 = j10 - size;
            boolean z10 = true;
            while (j13 > 0) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                int iMin = (int) Math.min(j13, 8192 - segmentWritableSegment$okio.limit);
                segmentWritableSegment$okio.limit += iMin;
                j13 -= (long) iMin;
                if (z10) {
                    unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = segmentWritableSegment$okio.data;
                    int i11 = segmentWritableSegment$okio.limit;
                    unsafeCursor.start = i11 - iMin;
                    unsafeCursor.end = i11;
                    z10 = false;
                }
            }
        }
        buffer.setSize$okio(j10);
        return size;
    }

    public static final int commonSeek(com.applovin.shadow.okio.Buffer.UnsafeCursor unsafeCursor, long j10) {
        Segment segmentPush;
        n.f(unsafeCursor, "<this>");
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j10 < -1 || j10 > buffer.size()) {
            StringBuilder sbL = wi.d.l(j10, "offset=", " > size=");
            sbL.append(buffer.size());
            throw new ArrayIndexOutOfBoundsException(sbL.toString());
        }
        if (j10 == -1 || j10 == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j10;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segment = buffer.head;
        long j11 = 0;
        if (unsafeCursor.getSegment() != null) {
            long j12 = unsafeCursor.offset;
            int i10 = unsafeCursor.start;
            Segment segment2 = unsafeCursor.getSegment();
            n.c(segment2);
            long j13 = j12 - ((long) (i10 - segment2.pos));
            if (j13 > j10) {
                segmentPush = segment;
                segment = unsafeCursor.getSegment();
                size = j13;
            } else {
                segmentPush = unsafeCursor.getSegment();
                j11 = j13;
            }
        } else {
            segmentPush = segment;
        }
        if (size - j10 > j10 - j11) {
            while (true) {
                n.c(segmentPush);
                int i11 = segmentPush.limit;
                int i12 = segmentPush.pos;
                if (j10 < ((long) (i11 - i12)) + j11) {
                    break;
                }
                j11 += (long) (i11 - i12);
                segmentPush = segmentPush.next;
            }
        } else {
            while (size > j10) {
                n.c(segment);
                segment = segment.prev;
                n.c(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            j11 = size;
            segmentPush = segment;
        }
        if (unsafeCursor.readWrite) {
            n.c(segmentPush);
            if (segmentPush.shared) {
                Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                if (buffer.head == segmentPush) {
                    buffer.head = segmentUnsharedCopy;
                }
                segmentPush = segmentPush.push(segmentUnsharedCopy);
                Segment segment3 = segmentPush.prev;
                n.c(segment3);
                segment3.pop();
            }
        }
        unsafeCursor.setSegment$okio(segmentPush);
        unsafeCursor.offset = j10;
        n.c(segmentPush);
        unsafeCursor.data = segmentPush.data;
        int i13 = segmentPush.pos + ((int) (j10 - j11));
        unsafeCursor.start = i13;
        int i14 = segmentPush.limit;
        unsafeCursor.end = i14;
        return i14 - i13;
    }

    public static final int commonSelect(com.applovin.shadow.okio.Buffer buffer, Options options) throws EOFException {
        n.f(buffer, "<this>");
        n.f(options, "options");
        int iSelectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonSkip(com.applovin.shadow.okio.Buffer buffer, long j10) throws EOFException {
        n.f(buffer, "<this>");
        while (j10 > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            long j11 = iMin;
            buffer.setSize$okio(buffer.size() - j11);
            j10 -= j11;
            int i10 = segment.pos + iMin;
            segment.pos = i10;
            if (i10 == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public static final ByteString commonSnapshot(com.applovin.shadow.okio.Buffer buffer) {
        n.f(buffer, "<this>");
        if (buffer.size() <= 2147483647L) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    public static final Segment commonWritableSegment(com.applovin.shadow.okio.Buffer buffer, int i10) {
        n.f(buffer, "<this>");
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = buffer.head;
        if (segment != null) {
            n.c(segment);
            Segment segment2 = segment.prev;
            n.c(segment2);
            return (segment2.limit + i10 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        buffer.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    public static final com.applovin.shadow.okio.Buffer commonWrite(com.applovin.shadow.okio.Buffer buffer, ByteString byteString, int i10, int i11) {
        n.f(buffer, "<this>");
        n.f(byteString, "byteString");
        byteString.write$okio(buffer, i10, i11);
        return buffer;
    }

    public static /* synthetic */ com.applovin.shadow.okio.Buffer commonWrite$default(com.applovin.shadow.okio.Buffer buffer, ByteString byteString, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = byteString.size();
        }
        n.f(buffer, "<this>");
        n.f(byteString, "byteString");
        byteString.write$okio(buffer, i10, i11);
        return buffer;
    }

    public static final long commonWriteAll(com.applovin.shadow.okio.Buffer buffer, Source source) throws IOException {
        n.f(buffer, "<this>");
        n.f(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(buffer, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteByte(com.applovin.shadow.okio.Buffer buffer, int i10) {
        n.f(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i11 + 1;
        bArr[i11] = (byte) i10;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteDecimalLong(com.applovin.shadow.okio.Buffer buffer, long j10) {
        boolean z10;
        n.f(buffer, "<this>");
        if (j10 == 0) {
            return buffer.writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 < 100000000) {
            if (j10 < Xa.f27908s) {
                if (j10 >= 100) {
                    i10 = j10 < 1000 ? 3 : 4;
                } else if (j10 >= 10) {
                    i10 = 2;
                }
            } else if (j10 < 1000000) {
                i10 = j10 < 100000 ? 5 : 6;
            } else {
                i10 = j10 < 10000000 ? 7 : 8;
            }
        } else if (j10 < 1000000000000L) {
            if (j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i10 = j10 < C.NANOS_PER_SECOND ? 9 : 10;
            } else {
                i10 = j10 < 100000000000L ? 11 : 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i10 = 13;
            } else {
                i10 = j10 < 100000000000000L ? 14 : 15;
            }
        } else if (j10 < 100000000000000000L) {
            i10 = j10 < 10000000000000000L ? 16 : 17;
        } else {
            i10 = j10 < 1000000000000000000L ? 18 : 19;
        }
        if (z10) {
            i10++;
        }
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i10);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = getHEX_DIGIT_BYTES()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i10;
        buffer.setSize$okio(buffer.size() + ((long) i10));
        return buffer;
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteHexadecimalUnsignedLong(com.applovin.shadow.okio.Buffer buffer, long j10) {
        n.f(buffer, "<this>");
        if (j10 == 0) {
            return buffer.writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i10);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = getHEX_DIGIT_BYTES()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i10;
        buffer.setSize$okio(buffer.size() + ((long) i10));
        return buffer;
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteInt(com.applovin.shadow.okio.Buffer buffer, int i10) {
        n.f(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        segmentWritableSegment$okio.limit = i11 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteLong(com.applovin.shadow.okio.Buffer buffer, long j10) {
        n.f(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        segmentWritableSegment$okio.limit = i10 + 8;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteShort(com.applovin.shadow.okio.Buffer buffer, int i10) {
        n.f(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        segmentWritableSegment$okio.limit = i11 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteUtf8(com.applovin.shadow.okio.Buffer buffer, String string, int i10, int i11) {
        char cCharAt;
        n.f(buffer, "<this>");
        n.f(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(d.e(i10, "beginIndex < 0: ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(e.g(i11, i10, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i11 > string.length()) {
            StringBuilder sbU = e.u(i11, "endIndex > string.length: ", " > ");
            sbU.append(string.length());
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i12 = segmentWritableSegment$okio.limit - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = segmentWritableSegment$okio.limit;
                int i15 = (i12 + i10) - i14;
                segmentWritableSegment$okio.limit = i14 + i15;
                buffer.setSize$okio(buffer.size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i16 = segmentWritableSegment$okio2.limit;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit = i16 + 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i17 = segmentWritableSegment$okio3.limit;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit = i17 + 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        buffer.writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i20 = segmentWritableSegment$okio4.limit;
                        bArr4[i20] = (byte) ((i19 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i20 + 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return buffer;
    }

    public static final com.applovin.shadow.okio.Buffer commonWriteUtf8CodePoint(com.applovin.shadow.okio.Buffer buffer, int i10) {
        n.f(buffer, "<this>");
        if (i10 < 128) {
            buffer.writeByte(i10);
            return buffer;
        }
        if (i10 < 2048) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i11 = segmentWritableSegment$okio.limit;
            bArr[i11] = (byte) ((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            segmentWritableSegment$okio.limit = i11 + 2;
            buffer.setSize$okio(buffer.size() + 2);
            return buffer;
        }
        if (55296 <= i10 && i10 < 57344) {
            buffer.writeByte(63);
            return buffer;
        }
        if (i10 < 65536) {
            Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i12 = segmentWritableSegment$okio2.limit;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            segmentWritableSegment$okio2.limit = i12 + 3;
            buffer.setSize$okio(buffer.size() + 3);
            return buffer;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i10));
        }
        Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i13 = segmentWritableSegment$okio3.limit;
        bArr3[i13] = (byte) ((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        segmentWritableSegment$okio3.limit = i13 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(Segment segment, int i10, byte[] bytes, int i11, int i12) {
        n.f(segment, "segment");
        n.f(bytes, "bytes");
        int i13 = segment.limit;
        byte[] bArr = segment.data;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.next;
                n.c(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i10 = segment.pos;
                i13 = segment.limit;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String readUtf8Line(com.applovin.shadow.okio.Buffer buffer, long j10) throws EOFException {
        n.f(buffer, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (buffer.getByte(j11) == 13) {
                String utf8 = buffer.readUtf8(j11);
                buffer.skip(2L);
                return utf8;
            }
        }
        String utf9 = buffer.readUtf8(j10);
        buffer.skip(1L);
        return utf9;
    }

    public static final <T> T seek(com.applovin.shadow.okio.Buffer buffer, long j10, c lambda) {
        n.f(buffer, "<this>");
        n.f(lambda, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return (T) lambda.invoke(null, -1L);
        }
        if (buffer.size() - j10 < j10) {
            long size = buffer.size();
            while (size > j10) {
                segment = segment.prev;
                n.c(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            return (T) lambda.invoke(segment, Long.valueOf(size));
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (segment.limit - segment.pos)) + j11;
            if (j12 > j10) {
                return (T) lambda.invoke(segment, Long.valueOf(j11));
            }
            segment = segment.next;
            n.c(segment);
            j11 = j12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4 A[SYNTHETIC] */
    public static final int selectPrefix(com.applovin.shadow.okio.Buffer buffer, Options options, boolean z10) {
        int i10;
        int i11;
        Segment segment;
        int i12;
        int i13;
        n.f(buffer, "<this>");
        n.f(options, "options");
        Segment segment2 = buffer.head;
        if (segment2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = segment2.data;
        int i14 = segment2.pos;
        int i15 = segment2.limit;
        int[] trie$okio = options.getTrie();
        Segment segment3 = segment2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = trie$okio[i17];
            int i20 = i17 + 2;
            int i21 = trie$okio[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (segment3 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == trie$okio[i20]) {
                        i11 = trie$okio[i20 + i19];
                        if (i10 == i15) {
                            segment3 = segment3.next;
                            n.c(segment3);
                            i10 = segment3.pos;
                            bArr = segment3.data;
                            i15 = segment3.limit;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        }
                        if (i11 >= 0) {
                            return i11;
                        }
                        i17 = -i11;
                        i14 = i10;
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = (i19 * (-1)) + i20;
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & 255) == trie$okio[i20]) {
                    boolean z11 = i26 == i24;
                    if (i25 == i15) {
                        n.c(segment3);
                        Segment segment4 = segment3.next;
                        n.c(segment4);
                        i13 = segment4.pos;
                        byte[] bArr2 = segment4.data;
                        i12 = segment4.limit;
                        if (segment4 != segment2) {
                            segment = segment4;
                            bArr = bArr2;
                        } else {
                            if (!z11) {
                                break loop0;
                            }
                            bArr = bArr2;
                            segment = null;
                        }
                    } else {
                        segment = segment3;
                        i12 = i15;
                        i13 = i25;
                    }
                    if (z11) {
                        i11 = trie$okio[i26];
                        i10 = i13;
                        i15 = i12;
                        segment3 = segment;
                        break;
                    }
                    i14 = i13;
                    i15 = i12;
                    segment3 = segment;
                    i20 = i26;
                }
                return i16;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }

    public static /* synthetic */ int selectPrefix$default(com.applovin.shadow.okio.Buffer buffer, Options options, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return selectPrefix(buffer, options, z10);
    }

    public static final int commonRead(com.applovin.shadow.okio.Buffer buffer, byte[] sink, int i10, int i11) {
        n.f(buffer, "<this>");
        n.f(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, i10, i11);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i11, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i12 = segment.pos;
        k.g0(bArr, i10, i12, sink, i12 + iMin);
        segment.pos += iMin;
        buffer.setSize$okio(buffer.size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public static final byte[] commonReadByteArray(com.applovin.shadow.okio.Buffer buffer, long j10) throws EOFException {
        n.f(buffer, "<this>");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(e.i(j10, "byteCount: ").toString());
        }
        if (buffer.size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        buffer.readFully(bArr);
        return bArr;
    }

    public static final ByteString commonReadByteString(com.applovin.shadow.okio.Buffer buffer, long j10) throws EOFException {
        n.f(buffer, "<this>");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(e.i(j10, "byteCount: ").toString());
        }
        if (buffer.size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new ByteString(buffer.readByteArray(j10));
        }
        ByteString byteStringSnapshot = buffer.snapshot((int) j10);
        buffer.skip(j10);
        return byteStringSnapshot;
    }

    public static final com.applovin.shadow.okio.Buffer commonWrite(com.applovin.shadow.okio.Buffer buffer, byte[] source) {
        n.f(buffer, "<this>");
        n.f(source, "source");
        return buffer.write(source, 0, source.length);
    }

    public static final com.applovin.shadow.okio.Buffer commonWrite(com.applovin.shadow.okio.Buffer buffer, byte[] source, int i10, int i11) {
        n.f(buffer, "<this>");
        n.f(source, "source");
        long j10 = i11;
        SegmentedByteString.checkOffsetAndCount(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = Math.min(i12 - i10, 8192 - segmentWritableSegment$okio.limit);
            int i13 = i10 + iMin;
            k.g0(source, segmentWritableSegment$okio.limit, i10, segmentWritableSegment$okio.data, i13);
            segmentWritableSegment$okio.limit += iMin;
            i10 = i13;
        }
        buffer.setSize$okio(buffer.size() + j10);
        return buffer;
    }

    public static final void commonReadFully(com.applovin.shadow.okio.Buffer buffer, com.applovin.shadow.okio.Buffer sink, long j10) throws EOFException {
        n.f(buffer, "<this>");
        n.f(sink, "sink");
        if (buffer.size() >= j10) {
            sink.write(buffer, j10);
        } else {
            sink.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    public static final ByteString commonSnapshot(com.applovin.shadow.okio.Buffer buffer, int i10) {
        n.f(buffer, "<this>");
        if (i10 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i10);
        Segment segment = buffer.head;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            n.c(segment);
            int i14 = segment.limit;
            int i15 = segment.pos;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        Segment segment2 = buffer.head;
        int i16 = 0;
        while (i11 < i10) {
            n.c(segment2);
            bArr[i16] = segment2.data;
            i11 += segment2.limit - segment2.pos;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = segment2.pos;
            segment2.shared = true;
            i16++;
            segment2 = segment2.next;
        }
        return new C0231SegmentedByteString(bArr, iArr);
    }

    public static final com.applovin.shadow.okio.Buffer commonWrite(com.applovin.shadow.okio.Buffer buffer, Source source, long j10) throws IOException {
        n.f(buffer, "<this>");
        n.f(source, "source");
        while (j10 > 0) {
            long j11 = source.read(buffer, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
        }
        return buffer;
    }

    public static final long commonRead(com.applovin.shadow.okio.Buffer buffer, com.applovin.shadow.okio.Buffer sink, long j10) {
        n.f(buffer, "<this>");
        n.f(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(e.i(j10, "byteCount < 0: ").toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j10 > buffer.size()) {
            j10 = buffer.size();
        }
        sink.write(buffer, j10);
        return j10;
    }

    public static final void commonWrite(com.applovin.shadow.okio.Buffer buffer, com.applovin.shadow.okio.Buffer source, long j10) {
        Segment segment;
        n.f(buffer, "<this>");
        n.f(source, "source");
        if (source != buffer) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j10);
            while (j10 > 0) {
                Segment segment2 = source.head;
                n.c(segment2);
                int i10 = segment2.limit;
                Segment segment3 = source.head;
                n.c(segment3);
                if (j10 < i10 - segment3.pos) {
                    Segment segment4 = buffer.head;
                    if (segment4 != null) {
                        n.c(segment4);
                        segment = segment4.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((((long) segment.limit) + j10) - ((long) (segment.shared ? 0 : segment.pos)) <= 8192) {
                            Segment segment5 = source.head;
                            n.c(segment5);
                            segment5.writeTo(segment, (int) j10);
                            source.setSize$okio(source.size() - j10);
                            buffer.setSize$okio(buffer.size() + j10);
                            return;
                        }
                    }
                    Segment segment6 = source.head;
                    n.c(segment6);
                    source.head = segment6.split((int) j10);
                }
                Segment segment7 = source.head;
                n.c(segment7);
                long j11 = segment7.limit - segment7.pos;
                source.head = segment7.pop();
                Segment segment8 = buffer.head;
                if (segment8 == null) {
                    buffer.head = segment7;
                    segment7.prev = segment7;
                    segment7.next = segment7;
                } else {
                    n.c(segment8);
                    Segment segment9 = segment8.prev;
                    n.c(segment9);
                    segment9.push(segment7).compact();
                }
                source.setSize$okio(source.size() - j11);
                buffer.setSize$okio(buffer.size() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
    }

    public static final long commonIndexOf(com.applovin.shadow.okio.Buffer buffer, ByteString bytes, long j10) {
        int i10;
        long j11 = j10;
        n.f(buffer, "<this>");
        n.f(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j11 >= 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                return -1L;
            }
            if (buffer.size() - j11 < j11) {
                size = buffer.size();
                while (size > j11) {
                    segment = segment.prev;
                    n.c(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b10 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (buffer.size() - ((long) size2)) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                    i10 = (int) ((((long) segment.pos) + j11) - size);
                    while (i10 < iMin) {
                        if (bArr[i10] != b10 || !rangeEquals(segment, i10 + 1, bArrInternalArray$okio, 1, size2)) {
                            i10++;
                        }
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    n.c(segment);
                    j11 = size;
                }
                return -1L;
            }
            while (true) {
                long j12 = ((long) (segment.limit - segment.pos)) + size;
                if (j12 > j11) {
                    break;
                }
                segment = segment.next;
                n.c(segment);
                size = j12;
            }
            byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
            byte b11 = bArrInternalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (buffer.size() - ((long) size4)) + 1;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                long j13 = size5;
                int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - size);
                i10 = (int) ((((long) segment.pos) + j11) - size);
                while (i10 < iMin2) {
                    if (bArr2[i10] == b11 && rangeEquals(segment, i10 + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i10++;
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                n.c(segment);
                size5 = j13;
                j11 = size;
            }
            return -1L;
            return ((long) (i10 - segment.pos)) + size;
        }
        throw new IllegalArgumentException(e.i(j11, "fromIndex < 0: ").toString());
    }
}

package duvetyn;

import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.applovin.shadow.okio.Utf8;
import com.applovin.shadow.okio.internal.Buffer;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.A5;
import com.ironsource.C3414a2;
import com.ironsource.D1;
import com.ironsource.Ua;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;
import okio.SegmentedByteString;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001^B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0018\u0010-\u001a\u00020)2\u0006\u0010,\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u0010(J\u000f\u00106\u001a\u00020/H\u0016¢\u0006\u0004\b6\u00101J\u000f\u00107\u001a\u000202H\u0016¢\u0006\u0004\b7\u00104J\u000f\u00108\u001a\u00020\tH\u0016¢\u0006\u0004\b8\u0010(J\u000f\u00109\u001a\u00020\tH\u0016¢\u0006\u0004\b9\u0010(J\u000f\u0010:\u001a\u00020\tH\u0016¢\u0006\u0004\b:\u0010(J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010<\u001a\u00020;2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010>J\u0017\u0010A\u001a\u0002022\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\t2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010H\u001a\u00020G2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bH\u0010JJ\u0017\u0010M\u001a\u00020G2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u001f\u0010M\u001a\u00020G2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010OJ\u0011\u0010P\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bP\u0010IJ\u000f\u0010Q\u001a\u00020GH\u0016¢\u0006\u0004\bQ\u0010IJ\u0017\u0010Q\u001a\u00020G2\u0006\u0010R\u001a\u00020\tH\u0016¢\u0006\u0004\bQ\u0010JJ\u000f\u0010S\u001a\u000202H\u0016¢\u0006\u0004\bS\u00104J\u000f\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010U\u001a\u00020T2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bU\u0010WJ\u0017\u0010X\u001a\u00020\r2\u0006\u0010D\u001a\u00020TH\u0016¢\u0006\u0004\bX\u0010YJ'\u0010Z\u001a\u0002022\u0006\u0010D\u001a\u00020T2\u0006\u0010\"\u001a\u0002022\u0006\u0010\n\u001a\u000202H\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010Z\u001a\u0002022\u0006\u0010D\u001a\u00020\\H\u0016¢\u0006\u0004\bZ\u0010]J\r\u0010^\u001a\u00020\r¢\u0006\u0004\b^\u0010\u0006J\u0017\u0010_\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b_\u0010\u001aJ\u0017\u0010a\u001a\u00020\u00002\u0006\u0010`\u001a\u00020;H\u0016¢\u0006\u0004\ba\u0010bJ\u0017\u0010d\u001a\u00020\u00002\u0006\u0010c\u001a\u00020GH\u0016¢\u0006\u0004\bd\u0010eJ'\u0010h\u001a\u00020\u00002\u0006\u0010c\u001a\u00020G2\u0006\u0010f\u001a\u0002022\u0006\u0010g\u001a\u000202H\u0016¢\u0006\u0004\bh\u0010iJ\u0017\u0010k\u001a\u00020\u00002\u0006\u0010j\u001a\u000202H\u0016¢\u0006\u0004\bk\u0010lJ\u001f\u0010m\u001a\u00020\u00002\u0006\u0010c\u001a\u00020G2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bm\u0010nJ/\u0010o\u001a\u00020\u00002\u0006\u0010c\u001a\u00020G2\u0006\u0010f\u001a\u0002022\u0006\u0010g\u001a\u0002022\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020\u00002\u0006\u0010q\u001a\u00020TH\u0016¢\u0006\u0004\br\u0010sJ'\u0010t\u001a\u00020\u00002\u0006\u0010q\u001a\u00020T2\u0006\u0010\"\u001a\u0002022\u0006\u0010\n\u001a\u000202H\u0016¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u0002022\u0006\u0010q\u001a\u00020\\H\u0016¢\u0006\u0004\bv\u0010]J\u0017\u0010x\u001a\u00020\t2\u0006\u0010q\u001a\u00020wH\u0016¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\u00002\u0006\u0010z\u001a\u000202H\u0016¢\u0006\u0004\b{\u0010lJ\u0017\u0010}\u001a\u00020\u00002\u0006\u0010|\u001a\u000202H\u0016¢\u0006\u0004\b}\u0010lJ\u0017\u0010\u007f\u001a\u00020\u00002\u0006\u0010~\u001a\u000202H\u0016¢\u0006\u0004\b\u007f\u0010lJ\u0019\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u000202H\u0016¢\u0006\u0005\b\u0080\u0001\u0010lJ\u001b\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001b\u0010\u0084\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0083\u0001J\u001c\u0010\u0087\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0085\u0001\u001a\u000202H\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\"\u0010\u0089\u0001\u001a\u00020\r2\u0006\u0010q\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J \u0010Z\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0005\bZ\u0010\u008b\u0001J\u001a\u0010\u008c\u0001\u001a\u00020\t2\u0006\u0010z\u001a\u00020)H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J,\u0010\u008c\u0001\u001a\u00020\t2\u0006\u0010z\u001a\u00020)2\u0007\u0010\u008e\u0001\u001a\u00020\t2\u0007\u0010\u008f\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u0090\u0001J\u001b\u0010\u0092\u0001\u001a\u00020\t2\u0007\u0010\u0091\u0001\u001a\u00020;H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J$\u0010\u0094\u0001\u001a\u00020\t2\u0007\u0010\u0091\u0001\u001a\u00020;2\u0007\u0010\u008e\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001b\u0010\u0097\u0001\u001a\u00020\t2\u0007\u0010\u0096\u0001\u001a\u00020;H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0093\u0001J$\u0010\u0098\u0001\u001a\u00020\t2\u0007\u0010\u0096\u0001\u001a\u00020;2\u0007\u0010\u008e\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0095\u0001J#\u0010\u0099\u0001\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\t2\u0007\u0010\u0091\u0001\u001a\u00020;H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J4\u0010\u009c\u0001\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\t2\u0007\u0010\u0091\u0001\u001a\u00020;2\u0007\u0010\u009b\u0001\u001a\u0002022\u0006\u0010\n\u001a\u000202H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0011\u0010\u009e\u0001\u001a\u00020\rH\u0016¢\u0006\u0005\b\u009e\u0001\u0010\u0006J\u0011\u0010\u009f\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u009f\u0001\u0010\u0018J\u0011\u0010 \u0001\u001a\u00020\rH\u0016¢\u0006\u0005\b \u0001\u0010\u0006J\u0013\u0010¢\u0001\u001a\u00030¡\u0001H\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001f\u0010¦\u0001\u001a\u00020\u000b2\n\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u0001H\u0096\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0011\u0010¨\u0001\u001a\u000202H\u0016¢\u0006\u0005\b¨\u0001\u00104J\u0011\u0010©\u0001\u001a\u00020GH\u0016¢\u0006\u0005\b©\u0001\u0010IJ\u000f\u0010ª\u0001\u001a\u00020\u0000¢\u0006\u0005\bª\u0001\u0010\u0011J\u0011\u0010«\u0001\u001a\u00020\u0000H\u0016¢\u0006\u0005\b«\u0001\u0010\u0011J\u000f\u0010¬\u0001\u001a\u00020;¢\u0006\u0005\b¬\u0001\u0010=J\u0018\u0010\u00ad\u0001\u001a\u00020;2\u0006\u0010\n\u001a\u000202¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001R\u001c\u0010±\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R0\u0010µ\u0001\u001a\u00020\t2\u0007\u0010²\u0001\u001a\u00020\t8G@@X\u0086\u000e¢\u0006\u0016\n\u0006\b³\u0001\u0010´\u0001\u001a\u0005\bµ\u0001\u0010(\"\u0005\b¶\u0001\u0010\u001aR\u0015\u0010\u0010\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b·\u0001\u0010\u0011¨\u0006¸\u0001"}, d2 = {"Lduvetyn/wireman;", "Lduvetyn/beachfront;", "Lduvetyn/marial;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "Ljava/io/InputStream;", "input", "", "byteCount", "", "forever", "", "saran", "(Ljava/io/InputStream;JZ)V", "buffer", "()Lduvetyn/wireman;", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "rotuma", "dovishness", "exhausted", "()Z", "require", "(J)V", AdActivity.REQUEST_KEY_EXTRA, "(J)Z", "peek", "()Lduvetyn/beachfront;", "inputStream", "()Ljava/io/InputStream;", "out", "offset", "monoploid", "(Lduvetyn/wireman;JJ)Lduvetyn/wireman;", "seminary", "(Ljava/io/InputStream;)Lduvetyn/wireman;", "marial", "()J", "", "readByte", "()B", "pos", "cuirassed", "(J)B", "", "readShort", "()S", "", "readInt", "()I", "readLong", "readShortLe", "readIntLe", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "Lokio/ByteString;", "readByteString", "()Lokio/ByteString;", "(J)Lokio/ByteString;", "Lduvetyn/rotuma;", "options", "splinterproof", "(Lduvetyn/rotuma;)I", "Lduvetyn/sealless;", "sink", "clubfoot", "(Lduvetyn/sealless;)J", "", "readUtf8", "()Ljava/lang/String;", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", A5.N, "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "readUtf8Line", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "", "readByteArray", "()[B", "(J)[B", "readFully", "([B)V", "read", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "attabal", "skip", "byteString", "itchy", "(Lokio/ByteString;)Lduvetyn/wireman;", "string", "palmyra", "(Ljava/lang/String;)Lduvetyn/wireman;", "beginIndex", "endIndex", "lightstruck", "(Ljava/lang/String;II)Lduvetyn/wireman;", "codePoint", "monroe", "(I)Lduvetyn/wireman;", "picketboat", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lduvetyn/wireman;", "gusty", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lduvetyn/wireman;", "source", "nosophobia", "([B)Lduvetyn/wireman;", "sayid", "([BII)Lduvetyn/wireman;", "write", "Lduvetyn/supplicat;", "impromptu", "(Lduvetyn/supplicat;)J", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "coi", "s", "igbo", "i", "preterite", "wostteth", "v", "czestochowa", "(J)Lduvetyn/wireman;", "underbelly", "minimumCapacity", "Lduvetyn/oilcan;", "milliradian", "(I)Lduvetyn/oilcan;", "supplicat", "(Lduvetyn/wireman;J)V", "(Lduvetyn/wireman;J)J", "indexOf", "(B)J", "fromIndex", "toIndex", "(BJJ)J", "bytes", "molybdenite", "(Lokio/ByteString;)J", "restrictive", "(Lokio/ByteString;J)J", "targetBytes", "gintrap", "merc", "trm", "(JLokio/ByteString;)Z", "bytesOffset", "polder", "(JLokio/ByteString;II)Z", "flush", "isOpen", "close", "Lduvetyn/restrictive;", "timeout", "()Lduvetyn/restrictive;", "", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "formularize", "dern", "dent", "timberyard", "(I)Lokio/ByteString;", "kowloon", "Lduvetyn/oilcan;", TtmlNode.TAG_HEAD, "<set-?>", "arytenoidectomy", "J", "size", "starveling", "getBuffer", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class wireman implements beachfront, marial, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public long size;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public oilcan head;

    /* JADX INFO: compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c¨\u0006 "}, d2 = {"Lduvetyn/wireman$attabal;", "Ljava/io/Closeable;", "<init>", "()V", "", "close", "Lduvetyn/wireman;", "kowloon", "Lduvetyn/wireman;", "buffer", "Lduvetyn/oilcan;", "arytenoidectomy", "Lduvetyn/oilcan;", "getSegment$okio", "()Lduvetyn/oilcan;", "attabal", "(Lduvetyn/oilcan;)V", D1.i, "", "monoploid", "J", "offset", "", "polloi", "[B", "data", "", "molybdenite", "I", "start", "graveside", TtmlNode.END, "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class attabal implements Closeable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public oilcan segment;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public wireman buffer;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public byte[] data;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public long offset = -1;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
        public int start = -1;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
        public int end = -1;

        public final void attabal(oilcan oilcanVar) {
            this.segment = oilcanVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            attabal(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }
    }

    /* JADX INFO: compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"duvetyn/wireman$dern", "Ljava/io/OutputStream;", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "write", "(I)V", "", "data", "offset", "byteCount", "([BII)V", "flush", "()V", "close", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class dern extends OutputStream {
        public dern() {
        }

        public String toString() {
            return wireman.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int b) {
            wireman.this.writeByte(b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int offset, int byteCount) {
            Intrinsics.checkNotNullParameter(data, "data");
            wireman.this.write(data, offset, byteCount);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    public final void attabal() throws EOFException {
        skip(getSize());
    }

    @Override // duvetyn.beachfront
    public long clubfoot(sealless sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = getSize();
        if (size > 0) {
            sink.supplicat(this, size);
        }
        return size;
    }

    @Override // duvetyn.marial
    /* JADX INFO: renamed from: coi, reason: merged with bridge method [inline-methods] */
    public wireman writeByte(int b) {
        oilcan oilcanVarMilliradian = milliradian(1);
        byte[] bArr = oilcanVarMilliradian.data;
        int i = oilcanVarMilliradian.limit;
        oilcanVarMilliradian.limit = i + 1;
        bArr[i] = (byte) b;
        starveling(getSize() + 1);
        return this;
    }

    public final byte cuirassed(long pos) {
        duvetyn.attabal.saneness(getSize(), pos, 1L);
        oilcan oilcanVar = this.head;
        if (oilcanVar == null) {
            Intrinsics.beachfront(null);
            throw null;
        }
        if (getSize() - pos < pos) {
            long size = getSize();
            while (size > pos) {
                oilcanVar = oilcanVar.prev;
                Intrinsics.beachfront(oilcanVar);
                size -= (long) (oilcanVar.limit - oilcanVar.pos);
            }
            Intrinsics.beachfront(oilcanVar);
            return oilcanVar.data[(int) ((((long) oilcanVar.pos) + pos) - size)];
        }
        long j = 0;
        while (true) {
            long j2 = ((long) (oilcanVar.limit - oilcanVar.pos)) + j;
            if (j2 > pos) {
                Intrinsics.beachfront(oilcanVar);
                return oilcanVar.data[(int) ((((long) oilcanVar.pos) + pos) - j)];
            }
            oilcanVar = oilcanVar.next;
            Intrinsics.beachfront(oilcanVar);
            j = j2;
        }
    }

    @Override // duvetyn.marial
    /* JADX INFO: renamed from: czestochowa, reason: merged with bridge method [inline-methods] */
    public wireman writeDecimalLong(long v) {
        boolean z;
        if (v == 0) {
            return writeByte(48);
        }
        int i = 1;
        if (v < 0) {
            v = -v;
            if (v < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (v < 100000000) {
            if (v < Ua.s) {
                if (v >= 100) {
                    i = v < 1000 ? 3 : 4;
                } else if (v >= 10) {
                    i = 2;
                }
            } else if (v < 1000000) {
                i = v < 100000 ? 5 : 6;
            } else {
                i = v < 10000000 ? 7 : 8;
            }
        } else if (v < 1000000000000L) {
            if (v < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i = v < C.NANOS_PER_SECOND ? 9 : 10;
            } else {
                i = v < 100000000000L ? 11 : 12;
            }
        } else if (v < 1000000000000000L) {
            if (v < 10000000000000L) {
                i = 13;
            } else {
                i = v < 100000000000000L ? 14 : 15;
            }
        } else if (v < 100000000000000000L) {
            i = v < 10000000000000000L ? 16 : 17;
        } else {
            i = v < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        oilcan oilcanVarMilliradian = milliradian(i);
        byte[] bArr = oilcanVarMilliradian.data;
        int i2 = oilcanVarMilliradian.limit + i;
        while (v != 0) {
            long j = 10;
            i2--;
            bArr[i2] = okio.internal.attabal.attabal()[(int) (v % j)];
            v /= j;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        oilcanVarMilliradian.limit += i;
        starveling(getSize() + ((long) i));
        return this;
    }

    public final ByteString dent() {
        if (getSize() <= 2147483647L) {
            return timberyard((int) getSize());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + getSize()).toString());
    }

    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public wireman clone() {
        return formularize();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof wireman)) {
            return false;
        }
        wireman wiremanVar = (wireman) other;
        if (getSize() != wiremanVar.getSize()) {
            return false;
        }
        if (getSize() == 0) {
            return true;
        }
        oilcan oilcanVar = this.head;
        Intrinsics.beachfront(oilcanVar);
        oilcan oilcanVar2 = wiremanVar.head;
        Intrinsics.beachfront(oilcanVar2);
        int i = oilcanVar.pos;
        int i2 = oilcanVar2.pos;
        long j = 0;
        while (j < getSize()) {
            long jMin = Math.min(oilcanVar.limit - i, oilcanVar2.limit - i2);
            long j2 = 0;
            while (j2 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (oilcanVar.data[i] != oilcanVar2.data[i2]) {
                    return false;
                }
                j2++;
                i = i3;
                i2 = i4;
            }
            if (i == oilcanVar.limit) {
                oilcanVar = oilcanVar.next;
                Intrinsics.beachfront(oilcanVar);
                i = oilcanVar.pos;
            }
            if (i2 == oilcanVar2.limit) {
                oilcanVar2 = oilcanVar2.next;
                Intrinsics.beachfront(oilcanVar2);
                i2 = oilcanVar2.pos;
            }
            j += jMin;
        }
        return true;
    }

    @Override // duvetyn.beachfront
    public boolean exhausted() {
        return this.size == 0;
    }

    public final wireman formularize() {
        wireman wiremanVar = new wireman();
        if (getSize() == 0) {
            return wiremanVar;
        }
        oilcan oilcanVar = this.head;
        Intrinsics.beachfront(oilcanVar);
        oilcan oilcanVarWireman = oilcanVar.wireman();
        wiremanVar.head = oilcanVarWireman;
        oilcanVarWireman.prev = oilcanVarWireman;
        oilcanVarWireman.next = oilcanVarWireman;
        for (oilcan oilcanVar2 = oilcanVar.next; oilcanVar2 != oilcanVar; oilcanVar2 = oilcanVar2.next) {
            oilcan oilcanVar3 = oilcanVarWireman.prev;
            Intrinsics.beachfront(oilcanVar3);
            Intrinsics.beachfront(oilcanVar2);
            oilcanVar3.dern(oilcanVar2.wireman());
        }
        wiremanVar.starveling(getSize());
        return wiremanVar;
    }

    @Override // duvetyn.beachfront
    public long gintrap(ByteString targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return merc(targetBytes, 0L);
    }

    public wireman gusty(String string, int beginIndex, int endIndex, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        if (Intrinsics.wireman(charset, Charsets.UTF_8)) {
            return writeUtf8(string, beginIndex, endIndex);
        }
        String strSubstring = string.substring(beginIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    public int hashCode() {
        oilcan oilcanVar = this.head;
        if (oilcanVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = oilcanVar.limit;
            for (int i3 = oilcanVar.pos; i3 < i2; i3++) {
                i = (i * 31) + oilcanVar.data[i3];
            }
            oilcanVar = oilcanVar.next;
            Intrinsics.beachfront(oilcanVar);
        } while (oilcanVar != this.head);
        return i;
    }

    @Override // duvetyn.marial
    /* JADX INFO: renamed from: igbo, reason: merged with bridge method [inline-methods] */
    public wireman writeShort(int s) {
        oilcan oilcanVarMilliradian = milliradian(2);
        byte[] bArr = oilcanVarMilliradian.data;
        int i = oilcanVarMilliradian.limit;
        bArr[i] = (byte) ((s >>> 8) & 255);
        bArr[i + 1] = (byte) (s & 255);
        oilcanVarMilliradian.limit = i + 2;
        starveling(getSize() + 2);
        return this;
    }

    @Override // duvetyn.marial
    public long impromptu(supplicat source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long j2 = source.read(this, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    public long indexOf(byte b) {
        return indexOf(b, 0L, Long.MAX_VALUE);
    }

    @Override // duvetyn.beachfront
    public InputStream inputStream() {
        return new saneness();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // duvetyn.marial
    /* JADX INFO: renamed from: itchy, reason: merged with bridge method [inline-methods] */
    public wireman sensatory(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @Override // duvetyn.marial
    /* JADX INFO: renamed from: lightstruck, reason: merged with bridge method [inline-methods] */
    public wireman writeUtf8(String string, int beginIndex, int endIndex) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        while (beginIndex < endIndex) {
            char cCharAt2 = string.charAt(beginIndex);
            if (cCharAt2 < 128) {
                oilcan oilcanVarMilliradian = milliradian(1);
                byte[] bArr = oilcanVarMilliradian.data;
                int i = oilcanVarMilliradian.limit - beginIndex;
                int iMin = Math.min(endIndex, 8192 - i);
                int i2 = beginIndex + 1;
                bArr[beginIndex + i] = (byte) cCharAt2;
                while (true) {
                    beginIndex = i2;
                    if (beginIndex >= iMin || (cCharAt = string.charAt(beginIndex)) >= 128) {
                        break;
                    }
                    i2 = beginIndex + 1;
                    bArr[beginIndex + i] = (byte) cCharAt;
                }
                int i3 = oilcanVarMilliradian.limit;
                int i4 = (i + beginIndex) - i3;
                oilcanVarMilliradian.limit = i3 + i4;
                starveling(getSize() + ((long) i4));
            } else {
                if (cCharAt2 < 2048) {
                    oilcan oilcanVarMilliradian2 = milliradian(2);
                    byte[] bArr2 = oilcanVarMilliradian2.data;
                    int i5 = oilcanVarMilliradian2.limit;
                    bArr2[i5] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i5 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    oilcanVarMilliradian2.limit = i5 + 2;
                    starveling(getSize() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    oilcan oilcanVarMilliradian3 = milliradian(3);
                    byte[] bArr3 = oilcanVarMilliradian3.data;
                    int i6 = oilcanVarMilliradian3.limit;
                    bArr3[i6] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i6 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i6 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    oilcanVarMilliradian3.limit = i6 + 3;
                    starveling(getSize() + 3);
                } else {
                    int i7 = beginIndex + 1;
                    char cCharAt3 = i7 < endIndex ? string.charAt(i7) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        beginIndex = i7;
                    } else {
                        int i8 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        oilcan oilcanVarMilliradian4 = milliradian(4);
                        byte[] bArr4 = oilcanVarMilliradian4.data;
                        int i9 = oilcanVarMilliradian4.limit;
                        bArr4[i9] = (byte) ((i8 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                        bArr4[i9 + 1] = (byte) (((i8 >> 12) & 63) | 128);
                        bArr4[i9 + 2] = (byte) (((i8 >> 6) & 63) | 128);
                        bArr4[i9 + 3] = (byte) ((i8 & 63) | 128);
                        oilcanVarMilliradian4.limit = i9 + 4;
                        starveling(getSize() + 4);
                        beginIndex += 2;
                    }
                }
                beginIndex++;
            }
        }
        return this;
    }

    public final long marial() {
        long size = getSize();
        if (size == 0) {
            return 0L;
        }
        oilcan oilcanVar = this.head;
        Intrinsics.beachfront(oilcanVar);
        oilcan oilcanVar2 = oilcanVar.prev;
        Intrinsics.beachfront(oilcanVar2);
        int i = oilcanVar2.limit;
        return (i >= 8192 || !oilcanVar2.owner) ? size : size - ((long) (i - oilcanVar2.pos));
    }

    public long merc(ByteString targetBytes, long fromIndex) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (fromIndex < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + fromIndex).toString());
        }
        oilcan oilcanVar = this.head;
        if (oilcanVar == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                oilcanVar = oilcanVar.prev;
                Intrinsics.beachfront(oilcanVar);
                size -= (long) (oilcanVar.limit - oilcanVar.pos);
            }
            if (targetBytes.size() == 2) {
                byte b = targetBytes.getByte(0);
                byte b2 = targetBytes.getByte(1);
                while (size < getSize()) {
                    byte[] bArr = oilcanVar.data;
                    i = (int) ((((long) oilcanVar.pos) + fromIndex) - size);
                    int i3 = oilcanVar.limit;
                    while (true) {
                        if (i >= i3) {
                            size += (long) (oilcanVar.limit - oilcanVar.pos);
                            oilcanVar = oilcanVar.next;
                            Intrinsics.beachfront(oilcanVar);
                            fromIndex = size;
                        } else {
                            byte b3 = bArr[i];
                            if (b3 == b || b3 == b2) {
                                i2 = oilcanVar.pos;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < getSize()) {
                    byte[] bArr2 = oilcanVar.data;
                    i = (int) ((((long) oilcanVar.pos) + fromIndex) - size);
                    int i4 = oilcanVar.limit;
                    while (true) {
                        if (i < i4) {
                            byte b4 = bArr2[i];
                            int length = bArrInternalArray$okio.length;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= length) {
                                    i++;
                                } else if (b4 == bArrInternalArray$okio[i5]) {
                                    i2 = oilcanVar.pos;
                                } else {
                                    i5++;
                                }
                            }
                        } else {
                            size += (long) (oilcanVar.limit - oilcanVar.pos);
                            oilcanVar = oilcanVar.next;
                            Intrinsics.beachfront(oilcanVar);
                            fromIndex = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j = ((long) (oilcanVar.limit - oilcanVar.pos)) + size;
            if (j > fromIndex) {
                break;
            }
            oilcanVar = oilcanVar.next;
            Intrinsics.beachfront(oilcanVar);
            size = j;
        }
        if (targetBytes.size() == 2) {
            byte b5 = targetBytes.getByte(0);
            byte b6 = targetBytes.getByte(1);
            while (size < getSize()) {
                byte[] bArr3 = oilcanVar.data;
                i = (int) ((((long) oilcanVar.pos) + fromIndex) - size);
                int i6 = oilcanVar.limit;
                while (true) {
                    if (i >= i6) {
                        size += (long) (oilcanVar.limit - oilcanVar.pos);
                        oilcanVar = oilcanVar.next;
                        Intrinsics.beachfront(oilcanVar);
                        fromIndex = size;
                    } else {
                        byte b7 = bArr3[i];
                        if (b7 == b5 || b7 == b6) {
                            i2 = oilcanVar.pos;
                        } else {
                            i++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < getSize()) {
                byte[] bArr4 = oilcanVar.data;
                i = (int) ((((long) oilcanVar.pos) + fromIndex) - size);
                int i7 = oilcanVar.limit;
                while (true) {
                    if (i < i7) {
                        byte b8 = bArr4[i];
                        int length2 = bArrInternalArray$okio2.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length2) {
                                i++;
                            } else if (b8 == bArrInternalArray$okio2[i8]) {
                                i2 = oilcanVar.pos;
                            } else {
                                i8++;
                            }
                        }
                    } else {
                        size += (long) (oilcanVar.limit - oilcanVar.pos);
                        oilcanVar = oilcanVar.next;
                        Intrinsics.beachfront(oilcanVar);
                        fromIndex = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + size;
    }

    public final oilcan milliradian(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        oilcan oilcanVar = this.head;
        if (oilcanVar != null) {
            Intrinsics.beachfront(oilcanVar);
            oilcan oilcanVar2 = oilcanVar.prev;
            Intrinsics.beachfront(oilcanVar2);
            return (oilcanVar2.limit + minimumCapacity > 8192 || !oilcanVar2.owner) ? oilcanVar2.dern(yemenite.dern()) : oilcanVar2;
        }
        oilcan oilcanVarDern = yemenite.dern();
        this.head = oilcanVarDern;
        oilcanVarDern.prev = oilcanVarDern;
        oilcanVarDern.next = oilcanVarDern;
        return oilcanVarDern;
    }

    @Override // duvetyn.beachfront
    public long molybdenite(ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return restrictive(bytes, 0L);
    }

    public final wireman monoploid(wireman out, long offset, long byteCount) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j = offset;
        duvetyn.attabal.saneness(getSize(), j, byteCount);
        if (byteCount != 0) {
            out.starveling(out.getSize() + byteCount);
            oilcan oilcanVar = this.head;
            while (true) {
                Intrinsics.beachfront(oilcanVar);
                int i = oilcanVar.limit;
                int i2 = oilcanVar.pos;
                if (j < i - i2) {
                    break;
                }
                j -= (long) (i - i2);
                oilcanVar = oilcanVar.next;
            }
            oilcan oilcanVar2 = oilcanVar;
            long j2 = byteCount;
            while (j2 > 0) {
                Intrinsics.beachfront(oilcanVar2);
                oilcan oilcanVarWireman = oilcanVar2.wireman();
                int i3 = oilcanVarWireman.pos + ((int) j);
                oilcanVarWireman.pos = i3;
                oilcanVarWireman.limit = Math.min(i3 + ((int) j2), oilcanVarWireman.limit);
                oilcan oilcanVar3 = out.head;
                if (oilcanVar3 == null) {
                    oilcanVarWireman.prev = oilcanVarWireman;
                    oilcanVarWireman.next = oilcanVarWireman;
                    out.head = oilcanVarWireman;
                } else {
                    Intrinsics.beachfront(oilcanVar3);
                    oilcan oilcanVar4 = oilcanVar3.prev;
                    Intrinsics.beachfront(oilcanVar4);
                    oilcanVar4.dern(oilcanVarWireman);
                }
                j2 -= (long) (oilcanVarWireman.limit - oilcanVarWireman.pos);
                oilcanVar2 = oilcanVar2.next;
                j = 0;
            }
        }
        return this;
    }

    public wireman monroe(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
            return this;
        }
        if (codePoint < 2048) {
            oilcan oilcanVarMilliradian = milliradian(2);
            byte[] bArr = oilcanVarMilliradian.data;
            int i = oilcanVarMilliradian.limit;
            bArr[i] = (byte) ((codePoint >> 6) | 192);
            bArr[i + 1] = (byte) ((codePoint & 63) | 128);
            oilcanVarMilliradian.limit = i + 2;
            starveling(getSize() + 2);
            return this;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            writeByte(63);
            return this;
        }
        if (codePoint < 65536) {
            oilcan oilcanVarMilliradian2 = milliradian(3);
            byte[] bArr2 = oilcanVarMilliradian2.data;
            int i2 = oilcanVarMilliradian2.limit;
            bArr2[i2] = (byte) ((codePoint >> 12) | 224);
            bArr2[i2 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i2 + 2] = (byte) ((codePoint & 63) | 128);
            oilcanVarMilliradian2.limit = i2 + 3;
            starveling(getSize() + 3);
            return this;
        }
        if (codePoint > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + duvetyn.attabal.cutely(codePoint));
        }
        oilcan oilcanVarMilliradian3 = milliradian(4);
        byte[] bArr3 = oilcanVarMilliradian3.data;
        int i3 = oilcanVarMilliradian3.limit;
        bArr3[i3] = (byte) ((codePoint >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        bArr3[i3 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
        bArr3[i3 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
        bArr3[i3 + 3] = (byte) ((codePoint & 63) | 128);
        oilcanVarMilliradian3.limit = i3 + 4;
        starveling(getSize() + 4);
        return this;
    }

    @Override // duvetyn.marial
    /* JADX INFO: renamed from: nosophobia, reason: merged with bridge method [inline-methods] */
    public wireman write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // duvetyn.marial
    public OutputStream outputStream() {
        return new dern();
    }

    @Override // duvetyn.marial
    /* JADX INFO: renamed from: palmyra, reason: merged with bridge method [inline-methods] */
    public wireman writeUtf8(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    @Override // duvetyn.beachfront
    public beachfront peek() {
        return adultoid.wireman(new cuirassed(this));
    }

    public wireman picketboat(String string, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return gusty(string, 0, string.length(), charset);
    }

    public boolean polder(long offset, ByteString bytes, int bytesOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || getSize() - offset < byteCount || bytes.size() - bytesOffset < byteCount) {
            return false;
        }
        for (int i = 0; i < byteCount; i++) {
            if (cuirassed(((long) i) + offset) != bytes.getByte(bytesOffset + i)) {
                return false;
            }
        }
        return true;
    }

    @Override // duvetyn.marial
    /* JADX INFO: renamed from: preterite, reason: merged with bridge method [inline-methods] */
    public wireman writeInt(int i) {
        oilcan oilcanVarMilliradian = milliradian(4);
        byte[] bArr = oilcanVarMilliradian.data;
        int i2 = oilcanVarMilliradian.limit;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        oilcanVarMilliradian.limit = i2 + 4;
        starveling(getSize() + 4);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        oilcan oilcanVar = this.head;
        if (oilcanVar == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), oilcanVar.limit - oilcanVar.pos);
        sink.put(oilcanVar.data, oilcanVar.pos, iMin);
        int i = oilcanVar.pos + iMin;
        oilcanVar.pos = i;
        this.size -= (long) iMin;
        if (i == oilcanVar.limit) {
            this.head = oilcanVar.saneness();
            yemenite.saneness(oilcanVar);
        }
        return iMin;
    }

    @Override // duvetyn.beachfront
    public byte readByte() throws EOFException {
        if (getSize() == 0) {
            throw new EOFException();
        }
        oilcan oilcanVar = this.head;
        Intrinsics.beachfront(oilcanVar);
        int i = oilcanVar.pos;
        int i2 = oilcanVar.limit;
        int i3 = i + 1;
        byte b = oilcanVar.data[i];
        starveling(getSize() - 1);
        if (i3 != i2) {
            oilcanVar.pos = i3;
            return b;
        }
        this.head = oilcanVar.saneness();
        yemenite.saneness(oilcanVar);
        return b;
    }

    @Override // duvetyn.beachfront
    public byte[] readByteArray() {
        return readByteArray(getSize());
    }

    @Override // duvetyn.beachfront
    public ByteString readByteString() {
        return readByteString(getSize());
    }

    @Override // duvetyn.beachfront
    public long readDecimalLong() throws EOFException {
        long j;
        byte b;
        long j2 = 0;
        if (getSize() == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            oilcan oilcanVar = this.head;
            Intrinsics.beachfront(oilcanVar);
            byte[] bArr = oilcanVar.data;
            int i2 = oilcanVar.pos;
            int i3 = oilcanVar.limit;
            while (true) {
                if (i2 >= i3) {
                    j = j2;
                    break;
                }
                b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j3 < Buffer.OVERFLOW_ZONE) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == Buffer.OVERFLOW_ZONE && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + ((long) i4);
                } else {
                    j = j2;
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            if (i2 == i3) {
                this.head = oilcanVar.saneness();
                yemenite.saneness(oilcanVar);
            } else {
                oilcanVar.pos = i2;
            }
            if (z2 || this.head == null) {
                starveling(getSize() - ((long) i));
                if (i >= (z ? 2 : 1)) {
                    return z ? j3 : -j3;
                }
                if (getSize() == j) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + duvetyn.attabal.taiyuan(cuirassed(j)));
            }
            j2 = j;
        }
        wireman wiremanVarWriteByte = new wireman().writeDecimalLong(j3).writeByte(b);
        if (!z) {
            wiremanVarWriteByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + wiremanVarWriteByte.readUtf8());
    }

    public void readFully(byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int i2 = read(sink, i, sink.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // duvetyn.beachfront
    public long readHexadecimalUnsignedLong() throws EOFException {
        int i;
        if (getSize() == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            oilcan oilcanVar = this.head;
            Intrinsics.beachfront(oilcanVar);
            byte[] bArr = oilcanVar.data;
            int i3 = oilcanVar.pos;
            int i4 = oilcanVar.limit;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 != 0) {
                            z = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + duvetyn.attabal.taiyuan(b));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    throw new NumberFormatException("Number too large: " + new wireman().writeHexadecimalUnsignedLong(j).writeByte(b).readUtf8());
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.head = oilcanVar.saneness();
                yemenite.saneness(oilcanVar);
            } else {
                oilcanVar.pos = i3;
            }
            if (z) {
                break;
            }
        } while (this.head != null);
        starveling(getSize() - ((long) i2));
        return j;
    }

    @Override // duvetyn.beachfront
    public int readInt() throws EOFException {
        if (getSize() < 4) {
            throw new EOFException();
        }
        oilcan oilcanVar = this.head;
        Intrinsics.beachfront(oilcanVar);
        int i = oilcanVar.pos;
        int i2 = oilcanVar.limit;
        if (i2 - i < 4) {
            return ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        byte[] bArr = oilcanVar.data;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i4;
        starveling(getSize() - 4);
        if (i5 != i2) {
            oilcanVar.pos = i5;
            return i6;
        }
        this.head = oilcanVar.saneness();
        yemenite.saneness(oilcanVar);
        return i6;
    }

    @Override // duvetyn.beachfront
    public int readIntLe() throws EOFException {
        return duvetyn.attabal.beachfront(readInt());
    }

    public long readLong() throws EOFException {
        if (getSize() < 8) {
            throw new EOFException();
        }
        oilcan oilcanVar = this.head;
        Intrinsics.beachfront(oilcanVar);
        int i = oilcanVar.pos;
        int i2 = oilcanVar.limit;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = oilcanVar.data;
        int i3 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (((long) bArr[i3]) & 255);
        starveling(getSize() - 8);
        if (i4 != i2) {
            oilcanVar.pos = i4;
            return j2;
        }
        this.head = oilcanVar.saneness();
        yemenite.saneness(oilcanVar);
        return j2;
    }

    @Override // duvetyn.beachfront
    public long readLongLe() throws EOFException {
        return duvetyn.attabal.competently(readLong());
    }

    @Override // duvetyn.beachfront
    public short readShort() throws EOFException {
        if (getSize() < 2) {
            throw new EOFException();
        }
        oilcan oilcanVar = this.head;
        Intrinsics.beachfront(oilcanVar);
        int i = oilcanVar.pos;
        int i2 = oilcanVar.limit;
        if (i2 - i < 2) {
            return (short) (((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        byte[] bArr = oilcanVar.data;
        int i3 = i + 1;
        int i4 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i4;
        starveling(getSize() - 2);
        if (i5 == i2) {
            this.head = oilcanVar.saneness();
            yemenite.saneness(oilcanVar);
        } else {
            oilcanVar.pos = i5;
        }
        return (short) i6;
    }

    @Override // duvetyn.beachfront
    public short readShortLe() throws EOFException {
        return duvetyn.attabal.impromptu(readShort());
    }

    @Override // duvetyn.beachfront
    public String readString(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return readString(this.size, charset);
    }

    public String readUtf8() {
        return readString(this.size, Charsets.UTF_8);
    }

    public int readUtf8CodePoint() throws EOFException {
        int i;
        int i2;
        int i3;
        if (getSize() == 0) {
            throw new EOFException();
        }
        byte bCuirassed = cuirassed(0L);
        if ((bCuirassed & 128) == 0) {
            i = bCuirassed & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bCuirassed & 224) == 192) {
            i = bCuirassed & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bCuirassed & 240) == 224) {
            i = bCuirassed & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bCuirassed & 248) != 240) {
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i = bCuirassed & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (getSize() < j) {
            throw new EOFException("size < " + i2 + ": " + getSize() + " (to read code point prefixed 0x" + duvetyn.attabal.taiyuan(bCuirassed) + ')');
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bCuirassed2 = cuirassed(j2);
            if ((bCuirassed2 & 192) != 128) {
                skip(j2);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i = (i << 6) | (bCuirassed2 & Utf8.REPLACEMENT_BYTE);
        }
        skip(j);
        if (i > 1114111) {
            return Utf8.REPLACEMENT_CODE_POINT;
        }
        return ((55296 > i || i >= 57344) && i >= i3) ? i : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Override // duvetyn.beachfront
    public String readUtf8Line() throws EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return okio.internal.attabal.dern(this, jIndexOf);
        }
        if (getSize() != 0) {
            return readUtf8(getSize());
        }
        return null;
    }

    @Override // duvetyn.beachfront
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // duvetyn.beachfront
    public boolean request(long byteCount) {
        return this.size >= byteCount;
    }

    @Override // duvetyn.beachfront
    public void require(long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    public long restrictive(ByteString bytes, long fromIndex) throws IOException {
        int i;
        long j = fromIndex;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        oilcan oilcanVar = this.head;
        if (oilcanVar == null) {
            return -1L;
        }
        if (getSize() - j >= j) {
            while (true) {
                long j2 = ((long) (oilcanVar.limit - oilcanVar.pos)) + size;
                if (j2 > j) {
                    break;
                }
                oilcanVar = oilcanVar.next;
                Intrinsics.beachfront(oilcanVar);
                size = j2;
            }
            byte[] bArrInternalArray$okio = bytes.internalArray$okio();
            byte b = bArrInternalArray$okio[0];
            int size2 = bytes.size();
            long size3 = (getSize() - ((long) size2)) + 1;
            while (size < size3) {
                byte[] bArr = oilcanVar.data;
                int iMin = (int) Math.min(oilcanVar.limit, (((long) oilcanVar.pos) + size3) - size);
                i = (int) ((((long) oilcanVar.pos) + j) - size);
                while (i < iMin) {
                    if (bArr[i] == b && okio.internal.attabal.saneness(oilcanVar, i + 1, bArrInternalArray$okio, 1, size2)) {
                    }
                    i++;
                }
                size += (long) (oilcanVar.limit - oilcanVar.pos);
                oilcanVar = oilcanVar.next;
                Intrinsics.beachfront(oilcanVar);
                j = size;
            }
            return -1L;
        }
        size = getSize();
        while (size > j) {
            oilcanVar = oilcanVar.prev;
            Intrinsics.beachfront(oilcanVar);
            size -= (long) (oilcanVar.limit - oilcanVar.pos);
        }
        byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
        byte b2 = bArrInternalArray$okio2[0];
        int size4 = bytes.size();
        long size5 = (getSize() - ((long) size4)) + 1;
        while (size < size5) {
            byte[] bArr2 = oilcanVar.data;
            long j3 = size5;
            int iMin2 = (int) Math.min(oilcanVar.limit, (((long) oilcanVar.pos) + size5) - size);
            i = (int) ((((long) oilcanVar.pos) + j) - size);
            while (i < iMin2) {
                if (bArr2[i] != b2 || !okio.internal.attabal.saneness(oilcanVar, i + 1, bArrInternalArray$okio2, 1, size4)) {
                    i++;
                }
            }
            size += (long) (oilcanVar.limit - oilcanVar.pos);
            oilcanVar = oilcanVar.next;
            Intrinsics.beachfront(oilcanVar);
            j = size;
            size5 = j3;
        }
        return -1L;
        return ((long) (i - oilcanVar.pos)) + size;
    }

    public final void saran(InputStream input, long byteCount, boolean forever) throws IOException {
        while (true) {
            if (byteCount <= 0 && !forever) {
                return;
            }
            oilcan oilcanVarMilliradian = milliradian(1);
            int i = input.read(oilcanVarMilliradian.data, oilcanVarMilliradian.limit, (int) Math.min(byteCount, 8192 - oilcanVarMilliradian.limit));
            if (i == -1) {
                if (oilcanVarMilliradian.pos == oilcanVarMilliradian.limit) {
                    this.head = oilcanVarMilliradian.saneness();
                    yemenite.saneness(oilcanVarMilliradian);
                }
                if (!forever) {
                    throw new EOFException();
                }
                return;
            }
            oilcanVarMilliradian.limit += i;
            long j = i;
            this.size += j;
            byteCount -= j;
        }
    }

    @Override // duvetyn.marial
    /* JADX INFO: renamed from: sayid, reason: merged with bridge method [inline-methods] */
    public wireman write(byte[] source, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = byteCount;
        duvetyn.attabal.saneness(source.length, offset, j);
        int i = byteCount + offset;
        while (offset < i) {
            oilcan oilcanVarMilliradian = milliradian(1);
            int iMin = Math.min(i - offset, 8192 - oilcanVarMilliradian.limit);
            int i2 = offset + iMin;
            p002kotlin.collections.arytenoidectomy.marial(source, oilcanVarMilliradian.data, oilcanVarMilliradian.limit, offset, i2);
            oilcanVarMilliradian.limit += iMin;
            offset = i2;
        }
        starveling(getSize() + j);
        return this;
    }

    public final wireman seminary(InputStream input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        saran(input, Long.MAX_VALUE, true);
        return this;
    }

    /* JADX INFO: renamed from: size, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // duvetyn.beachfront
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0) {
            oilcan oilcanVar = this.head;
            if (oilcanVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(byteCount, oilcanVar.limit - oilcanVar.pos);
            long j = iMin;
            starveling(getSize() - j);
            byteCount -= j;
            int i = oilcanVar.pos + iMin;
            oilcanVar.pos = i;
            if (i == oilcanVar.limit) {
                this.head = oilcanVar.saneness();
                yemenite.saneness(oilcanVar);
            }
        }
    }

    @Override // duvetyn.beachfront
    public int splinterproof(rotuma options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iMarial = okio.internal.attabal.marial(this, options, false, 2, null);
        if (iMarial == -1) {
            return -1;
        }
        skip(options.getByteStrings()[iMarial].size());
        return iMarial;
    }

    public final void starveling(long j) {
        this.size = j;
    }

    @Override // duvetyn.sealless
    public void supplicat(wireman source, long byteCount) {
        oilcan oilcanVar;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        duvetyn.attabal.saneness(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            oilcan oilcanVar2 = source.head;
            Intrinsics.beachfront(oilcanVar2);
            int i = oilcanVar2.limit;
            oilcan oilcanVar3 = source.head;
            Intrinsics.beachfront(oilcanVar3);
            if (byteCount < i - oilcanVar3.pos) {
                oilcan oilcanVar4 = this.head;
                if (oilcanVar4 != null) {
                    Intrinsics.beachfront(oilcanVar4);
                    oilcanVar = oilcanVar4.prev;
                } else {
                    oilcanVar = null;
                }
                if (oilcanVar != null && oilcanVar.owner) {
                    if ((((long) oilcanVar.limit) + byteCount) - ((long) (oilcanVar.shared ? 0 : oilcanVar.pos)) <= 8192) {
                        oilcan oilcanVar5 = source.head;
                        Intrinsics.beachfront(oilcanVar5);
                        oilcanVar5.beachfront(oilcanVar, (int) byteCount);
                        source.starveling(source.getSize() - byteCount);
                        starveling(getSize() + byteCount);
                        return;
                    }
                }
                oilcan oilcanVar6 = source.head;
                Intrinsics.beachfront(oilcanVar6);
                source.head = oilcanVar6.marial((int) byteCount);
            }
            oilcan oilcanVar7 = source.head;
            Intrinsics.beachfront(oilcanVar7);
            long j = oilcanVar7.limit - oilcanVar7.pos;
            source.head = oilcanVar7.saneness();
            oilcan oilcanVar8 = this.head;
            if (oilcanVar8 == null) {
                this.head = oilcanVar7;
                oilcanVar7.prev = oilcanVar7;
                oilcanVar7.next = oilcanVar7;
            } else {
                Intrinsics.beachfront(oilcanVar8);
                oilcan oilcanVar9 = oilcanVar8.prev;
                Intrinsics.beachfront(oilcanVar9);
                oilcanVar9.dern(oilcanVar7).attabal();
            }
            source.starveling(source.getSize() - j);
            starveling(getSize() + j);
            byteCount -= j;
        }
    }

    public final ByteString timberyard(int byteCount) {
        if (byteCount == 0) {
            return ByteString.EMPTY;
        }
        duvetyn.attabal.saneness(getSize(), 0L, byteCount);
        oilcan oilcanVar = this.head;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < byteCount) {
            Intrinsics.beachfront(oilcanVar);
            int i4 = oilcanVar.limit;
            int i5 = oilcanVar.pos;
            if (i4 == i5) {
                throw new AssertionError("s.limit == s.pos");
            }
            i2 += i4 - i5;
            i3++;
            oilcanVar = oilcanVar.next;
        }
        byte[][] bArr = new byte[i3][];
        int[] iArr = new int[i3 * 2];
        oilcan oilcanVar2 = this.head;
        int i6 = 0;
        while (i < byteCount) {
            Intrinsics.beachfront(oilcanVar2);
            bArr[i6] = oilcanVar2.data;
            i += oilcanVar2.limit - oilcanVar2.pos;
            iArr[i6] = Math.min(i, byteCount);
            iArr[i6 + i3] = oilcanVar2.pos;
            oilcanVar2.shared = true;
            i6++;
            oilcanVar2 = oilcanVar2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // duvetyn.supplicat
    public restrictive timeout() {
        return restrictive.f25446marial;
    }

    public String toString() {
        return dent().toString();
    }

    @Override // duvetyn.beachfront
    public boolean trm(long offset, ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return polder(offset, bytes, 0, bytes.size());
    }

    @Override // duvetyn.marial
    /* JADX INFO: renamed from: underbelly, reason: merged with bridge method [inline-methods] */
    public wireman writeHexadecimalUnsignedLong(long v) {
        if (v == 0) {
            return writeByte(48);
        }
        long j = (v >>> 1) | v;
        long j2 = j | (j >>> 2);
        long j3 = j2 | (j2 >>> 4);
        long j4 = j3 | (j3 >>> 8);
        long j5 = j4 | (j4 >>> 16);
        long j6 = j5 | (j5 >>> 32);
        long j7 = j6 - ((j6 >>> 1) & 6148914691236517205L);
        long j8 = ((j7 >>> 2) & 3689348814741910323L) + (j7 & 3689348814741910323L);
        long j9 = ((j8 >>> 4) + j8) & 1085102592571150095L;
        long j10 = j9 + (j9 >>> 8);
        long j11 = j10 + (j10 >>> 16);
        int i = (int) ((((j11 & 63) + ((j11 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        oilcan oilcanVarMilliradian = milliradian(i);
        byte[] bArr = oilcanVarMilliradian.data;
        int i2 = oilcanVarMilliradian.limit;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = okio.internal.attabal.attabal()[(int) (15 & v)];
            v >>>= 4;
        }
        oilcanVarMilliradian.limit += i;
        starveling(getSize() + ((long) i));
        return this;
    }

    public wireman wostteth(int i) {
        return writeInt(duvetyn.attabal.beachfront(i));
    }

    /* JADX INFO: compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"duvetyn/wireman$saneness", "Ljava/io/InputStream;", "", "read", "()I", "", "sink", "offset", "byteCount", "([BII)I", "available", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class saneness extends InputStream {
        public saneness() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(wireman.this.getSize(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (wireman.this.getSize() > 0) {
                return wireman.this.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }
            return -1;
        }

        public String toString() {
            return wireman.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int offset, int byteCount) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return wireman.this.read(sink, offset, byteCount);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public long indexOf(byte b, long fromIndex, long toIndex) {
        oilcan oilcanVar;
        int i;
        long size = 0;
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("size=" + getSize() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        if (toIndex > getSize()) {
            toIndex = getSize();
        }
        if (fromIndex == toIndex || (oilcanVar = this.head) == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                oilcanVar = oilcanVar.prev;
                Intrinsics.beachfront(oilcanVar);
                size -= (long) (oilcanVar.limit - oilcanVar.pos);
            }
            while (size < toIndex) {
                byte[] bArr = oilcanVar.data;
                int iMin = (int) Math.min(oilcanVar.limit, (((long) oilcanVar.pos) + toIndex) - size);
                i = (int) ((((long) oilcanVar.pos) + fromIndex) - size);
                while (i < iMin) {
                    if (bArr[i] != b) {
                        i++;
                    }
                }
                size += (long) (oilcanVar.limit - oilcanVar.pos);
                oilcanVar = oilcanVar.next;
                Intrinsics.beachfront(oilcanVar);
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j = ((long) (oilcanVar.limit - oilcanVar.pos)) + size;
            if (j > fromIndex) {
                break;
            }
            oilcanVar = oilcanVar.next;
            Intrinsics.beachfront(oilcanVar);
            size = j;
        }
        while (size < toIndex) {
            byte[] bArr2 = oilcanVar.data;
            int iMin2 = (int) Math.min(oilcanVar.limit, (((long) oilcanVar.pos) + toIndex) - size);
            i = (int) ((((long) oilcanVar.pos) + fromIndex) - size);
            while (i < iMin2) {
                if (bArr2[i] != b) {
                    i++;
                }
            }
            size += (long) (oilcanVar.limit - oilcanVar.pos);
            oilcanVar = oilcanVar.next;
            Intrinsics.beachfront(oilcanVar);
            fromIndex = size;
        }
        return -1L;
        return ((long) (i - oilcanVar.pos)) + size;
    }

    @Override // duvetyn.beachfront
    public byte[] readByteArray(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    @Override // duvetyn.beachfront
    public ByteString readByteString(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        if (byteCount < 4096) {
            return new ByteString(readByteArray(byteCount));
        }
        ByteString byteStringTimberyard = timberyard((int) byteCount);
        skip(byteCount);
        return byteStringTimberyard;
    }

    public String readString(long byteCount, Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        oilcan oilcanVar = this.head;
        Intrinsics.beachfront(oilcanVar);
        int i = oilcanVar.pos;
        if (((long) i) + byteCount > oilcanVar.limit) {
            return new String(readByteArray(byteCount), charset);
        }
        int i2 = (int) byteCount;
        String str = new String(oilcanVar.data, i, i2, charset);
        int i3 = oilcanVar.pos + i2;
        oilcanVar.pos = i3;
        this.size -= byteCount;
        if (i3 == oilcanVar.limit) {
            this.head = oilcanVar.saneness();
            yemenite.saneness(oilcanVar);
        }
        return str;
    }

    @Override // duvetyn.beachfront
    public String readUtf8(long byteCount) throws EOFException {
        return readString(byteCount, Charsets.UTF_8);
    }

    @Override // duvetyn.beachfront
    public String readUtf8LineStrict(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j);
        if (jIndexOf != -1) {
            return okio.internal.attabal.dern(this, jIndexOf);
        }
        if (j < getSize() && cuirassed(j - 1) == 13 && cuirassed(j) == 10) {
            return okio.internal.attabal.dern(this, j);
        }
        wireman wiremanVar = new wireman();
        monoploid(wiremanVar, 0L, Math.min(32, getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(getSize(), limit) + " content=" + wiremanVar.readByteString().hex() + (char) 8230);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            oilcan oilcanVarMilliradian = milliradian(1);
            int iMin = Math.min(i, 8192 - oilcanVarMilliradian.limit);
            source.get(oilcanVarMilliradian.data, oilcanVarMilliradian.limit, iMin);
            i -= iMin;
            oilcanVarMilliradian.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    public int read(byte[] sink, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        duvetyn.attabal.saneness(sink.length, offset, byteCount);
        oilcan oilcanVar = this.head;
        if (oilcanVar == null) {
            return -1;
        }
        int iMin = Math.min(byteCount, oilcanVar.limit - oilcanVar.pos);
        byte[] bArr = oilcanVar.data;
        int i = oilcanVar.pos;
        p002kotlin.collections.arytenoidectomy.marial(bArr, sink, offset, i, i + iMin);
        oilcanVar.pos += iMin;
        starveling(getSize() - ((long) iMin));
        if (oilcanVar.pos == oilcanVar.limit) {
            this.head = oilcanVar.saneness();
            yemenite.saneness(oilcanVar);
        }
        return iMin;
    }

    @Override // duvetyn.beachfront
    public wireman buffer() {
        return this;
    }

    @Override // duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // duvetyn.marial
    /* JADX INFO: renamed from: dovishness, reason: merged with bridge method [inline-methods] */
    public wireman emit() {
        return this;
    }

    @Override // duvetyn.marial, duvetyn.sealless, java.io.Flushable
    public void flush() {
    }

    @Override // duvetyn.beachfront
    public wireman getBuffer() {
        return this;
    }

    @Override // duvetyn.supplicat
    public long read(wireman sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (getSize() == 0) {
            return -1L;
        }
        if (byteCount > getSize()) {
            byteCount = getSize();
        }
        sink.supplicat(this, byteCount);
        return byteCount;
    }

    @Override // duvetyn.marial
    /* JADX INFO: renamed from: rotuma, reason: merged with bridge method [inline-methods] */
    public wireman emitCompleteSegments() {
        return this;
    }
}

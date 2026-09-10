package formularism;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$IntRef;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: Http2Connection.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\bÃ\u0001Ä\u0001Å\u0001Æ\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\"\u0010#J/\u0010'\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u001a¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010-\u001a\u00020)H\u0000¢\u0006\u0004\b.\u0010,J\u001f\u00100\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u001aH\u0000¢\u0006\u0004\b0\u00101J%\u00105\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0012¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u00122\u0006\u0010-\u001a\u00020)¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0012H\u0016¢\u0006\u0004\b;\u00108J)\u0010?\u001a\u00020\u00122\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020)2\b\u0010>\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b?\u0010@J#\u0010D\u001a\u00020\u00122\b\b\u0002\u0010A\u001a\u00020\u000b2\b\b\u0002\u0010C\u001a\u00020BH\u0007¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u001a¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0012H\u0000¢\u0006\u0004\bI\u00108J\u0017\u0010J\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0000¢\u0006\u0004\bJ\u0010KJ%\u0010L\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\bL\u0010MJ-\u0010O\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010N\u001a\u00020\u000bH\u0000¢\u0006\u0004\bO\u0010PJ/\u0010S\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010R\u001a\u00020Q2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u000bH\u0000¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\bU\u0010,R\u001a\u0010Z\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010`\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R&\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010l\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\"\u0010s\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010w\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bt\u0010n\u001a\u0004\bu\u0010p\"\u0004\bv\u0010rR\u0016\u0010y\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010WR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u0081\u0001\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010~R\u0016\u0010\u0083\u0001\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010~R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0089\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0089\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0089\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0089\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0089\u0001R\u001d\u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R*\u0010\u009f\u0001\u001a\u00030\u0095\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u0097\u0001\u001a\u0006\b\u009c\u0001\u0010\u0099\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010¤\u0001\u001a\u00020\u001a2\u0007\u0010 \u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u0089\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R*\u0010§\u0001\u001a\u00020\u001a2\u0007\u0010 \u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¥\u0001\u0010\u0089\u0001\u001a\u0006\b¦\u0001\u0010£\u0001R*\u0010ª\u0001\u001a\u00020\u001a2\u0007\u0010 \u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¨\u0001\u0010\u0089\u0001\u001a\u0006\b©\u0001\u0010£\u0001R*\u0010\u00ad\u0001\u001a\u00020\u001a2\u0007\u0010 \u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b«\u0001\u0010\u0089\u0001\u001a\u0006\b¬\u0001\u0010£\u0001R \u0010³\u0001\u001a\u00030®\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R\u001d\u0010¹\u0001\u001a\u00030´\u00018\u0006¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R!\u0010¿\u0001\u001a\u00070º\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R\u001d\u0010Â\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060À\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b?\u0010Á\u0001¨\u0006Ç\u0001"}, d2 = {"Lformularism/wireman;", "Ljava/io/Closeable;", "Lformularism/wireman$attabal;", "builder", "<init>", "(Lformularism/wireman$attabal;)V", "", "associatedStreamId", "", "Lformularism/attabal;", "requestHeaders", "", "out", "Lformularism/competently;", "picketboat", "(ILjava/util/List;Z)Lformularism/competently;", "Ljava/io/IOException;", "e", "", "starveling", "(Ljava/io/IOException;)V", "id", "czestochowa", "(I)Lformularism/competently;", "streamId", "claque", "", "read", "mastfed", "(J)V", "palmyra", "(Ljava/util/List;Z)Lformularism/competently;", "outFinished", "alternating", "homozygous", "(IZLjava/util/List;)V", "Lduvetyn/wireman;", "buffer", "byteCount", "attendance", "(IZLduvetyn/wireman;J)V", "Lokhttp3/internal/http2/ErrorCode;", IronSourceConstants.EVENTS_ERROR_CODE, "deadwork", "(ILokhttp3/internal/http2/ErrorCode;)V", "statusCode", "libyan", "unacknowledgedBytesRead", "molet", "(IJ)V", "reply", "payload1", "payload2", "lampshade", "(ZII)V", "flush", "()V", "dhss", "(Lokhttp3/internal/http2/ErrorCode;)V", "close", "connectionCode", "streamCode", "cause", "creditor", "(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "sendConnectionPreface", "Lgold/marial;", "taskRunner", "vesuvio", "(ZLgold/marial;)V", "nowNs", "gusty", "(J)Z", "hardpan", "unconsolidated", "(I)Z", "julian", "(ILjava/util/List;)V", "inFinished", "monroe", "(ILjava/util/List;Z)V", "Lduvetyn/beachfront;", "source", "lightstruck", "(ILduvetyn/beachfront;IZ)V", "achondroplasia", "kowloon", "Z", "dent", "()Z", "client", "Lformularism/wireman$dern;", "arytenoidectomy", "Lformularism/wireman$dern;", "itchy", "()Lformularism/wireman$dern;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "monoploid", "Ljava/util/Map;", "underbelly", "()Ljava/util/Map;", "streams", "", "polloi", "Ljava/lang/String;", "timberyard", "()Ljava/lang/String;", "connectionName", "molybdenite", "I", "milliradian", "()I", "herdbook", "(I)V", "lastGoodStreamId", "graveside", "lerp", "technofreak", "nextStreamId", "adultoid", "isShutdown", "dovishness", "Lgold/marial;", "Lgold/wireman;", "gintrap", "Lgold/wireman;", "writerQueue", "rotuma", "pushQueue", "preprohormone", "settingsListenerQueue", "Lformularism/cutely;", "cord", "Lformularism/cutely;", "pushObserver", "cuirassed", "J", "intervalPingsSent", "stratoscope", "intervalPongsReceived", "trm", "degradedPingsSent", "oilcan", "degradedPongsReceived", "yemenite", "awaitPongsReceived", "sealless", "degradedPongDeadlineNs", "Lformularism/apical;", "kattegat", "Lformularism/apical;", "nosophobia", "()Lformularism/apical;", "okHttpSettings", "supplicat", "sayid", "outmarry", "(Lformularism/apical;)V", "peerSettings", "<set-?>", "restrictive", "getReadBytesTotal", "()J", "readBytesTotal", "merc", "getReadBytesAcknowledged", "readBytesAcknowledged", "polder", "wostteth", "writeBytesTotal", "seminary", "preterite", "writeBytesMaximum", "Ljava/net/Socket;", "grimness", "Ljava/net/Socket;", "coi", "()Ljava/net/Socket;", "socket", "Lformularism/impromptu;", "saran", "Lformularism/impromptu;", "igbo", "()Lformularism/impromptu;", "writer", "Lformularism/wireman$wireman;", "privatdozent", "Lformularism/wireman$wireman;", "getReaderRunnable", "()Lformularism/wireman$wireman;", "readerRunnable", "", "Ljava/util/Set;", "currentPushRequests", "attabal", "saneness", "dern", "wireman", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class wireman implements Closeable {

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public static final formularism.apical f26406hydrovane;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public boolean isShutdown;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final dern listener;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final formularism.cutely pushObserver;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name and from kotlin metadata */
    public final Set<Integer> currentPushRequests;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public long intervalPingsSent;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public final gold.marial taskRunner;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public final gold.wireman writerQueue;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public int nextStreamId;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name and from kotlin metadata */
    public final Socket socket;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public final formularism.apical okHttpSettings;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final boolean client;

    /* JADX INFO: renamed from: merc, reason: collision with root package name and from kotlin metadata */
    public long readBytesAcknowledged;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public int lastGoodStreamId;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final Map<Integer, formularism.competently> streams;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public long degradedPongsReceived;

    /* JADX INFO: renamed from: polder, reason: collision with root package name and from kotlin metadata */
    public long writeBytesTotal;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final String connectionName;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public final gold.wireman settingsListenerQueue;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name and from kotlin metadata */
    public final C0611wireman readerRunnable;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    public long readBytesTotal;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final gold.wireman pushQueue;

    /* JADX INFO: renamed from: saran, reason: collision with root package name and from kotlin metadata */
    public final formularism.impromptu writer;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public long degradedPongDeadlineNs;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name and from kotlin metadata */
    public long writeBytesMaximum;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public long intervalPongsReceived;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public formularism.apical peerSettings;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public long degradedPingsSent;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public long awaitPongsReceived;

    /* JADX INFO: compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"gold/dern", "Lgold/attabal;", "", "beachfront", "()J", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class apical extends gold.attabal {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ wireman f26436beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final /* synthetic */ int f26437competently;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final /* synthetic */ ErrorCode f26438impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ boolean f26439marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ String f26440wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public apical(String str, boolean z, wireman wiremanVar, int i, ErrorCode errorCode) {
            super(str, z);
            this.f26440wireman = str;
            this.f26439marial = z;
            this.f26436beachfront = wiremanVar;
            this.f26437competently = i;
            this.f26438impromptu = errorCode;
        }

        @Override // gold.attabal
        public long beachfront() {
            try {
                this.f26436beachfront.libyan(this.f26437competently, this.f26438impromptu);
                return -1L;
            } catch (IOException e) {
                this.f26436beachfront.starveling(e);
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00100\u001a\u00020\n8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b%\u0010-\"\u0004\b.\u0010/R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010=\u001a\u0004\b+\u0010>\"\u0004\b?\u0010@R\"\u0010F\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010B\u001a\u0004\b7\u0010C\"\u0004\bD\u0010ER\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010G\u001a\u0004\b1\u0010H\"\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lformularism/wireman$attabal;", "", "", "client", "Lgold/marial;", "taskRunner", "<init>", "(ZLgold/marial;)V", "Ljava/net/Socket;", "socket", "", "peerName", "Lduvetyn/beachfront;", "source", "Lduvetyn/marial;", "sink", "molybdenite", "(Ljava/net/Socket;Ljava/lang/String;Lduvetyn/beachfront;Lduvetyn/marial;)Lformularism/wireman$attabal;", "Lformularism/wireman$dern;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "apical", "(Lformularism/wireman$dern;)Lformularism/wireman$attabal;", "", "pingIntervalMillis", "formularize", "(I)Lformularism/wireman$attabal;", "Lformularism/wireman;", "attabal", "()Lformularism/wireman;", "Z", "saneness", "()Z", "setClient$okhttp", "(Z)V", "Lgold/marial;", "cutely", "()Lgold/marial;", "dern", "Ljava/net/Socket;", "impromptu", "()Ljava/net/Socket;", "monoploid", "(Ljava/net/Socket;)V", "wireman", "Ljava/lang/String;", "()Ljava/lang/String;", "impassible", "(Ljava/lang/String;)V", "connectionName", "marial", "Lduvetyn/beachfront;", "taiyuan", "()Lduvetyn/beachfront;", "polloi", "(Lduvetyn/beachfront;)V", "beachfront", "Lduvetyn/marial;", "competently", "()Lduvetyn/marial;", "arytenoidectomy", "(Lduvetyn/marial;)V", "Lformularism/wireman$dern;", "()Lformularism/wireman$dern;", "triweekly", "(Lformularism/wireman$dern;)V", "Lformularism/cutely;", "Lformularism/cutely;", "()Lformularism/cutely;", "setPushObserver$okhttp", "(Lformularism/cutely;)V", "pushObserver", "I", "()I", "kowloon", "(I)V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public boolean client;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public duvetyn.marial sink;

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public dern listener;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public Socket socket;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public formularism.cutely pushObserver;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public duvetyn.beachfront source;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final gold.marial taskRunner;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
        public int pingIntervalMillis;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public String connectionName;

        public attabal(boolean z, gold.marial taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.client = z;
            this.taskRunner = taskRunner;
            this.listener = dern.f26465saneness;
            this.pushObserver = formularism.cutely.f26354saneness;
        }

        public final attabal apical(dern listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            triweekly(listener);
            return this;
        }

        public final void arytenoidectomy(duvetyn.marial marialVar) {
            Intrinsics.checkNotNullParameter(marialVar, "<set-?>");
            this.sink = marialVar;
        }

        public final wireman attabal() {
            return new wireman(this);
        }

        /* JADX INFO: renamed from: beachfront, reason: from getter */
        public final formularism.cutely getPushObserver() {
            return this.pushObserver;
        }

        public final duvetyn.marial competently() {
            duvetyn.marial marialVar = this.sink;
            if (marialVar != null) {
                return marialVar;
            }
            Intrinsics.preprohormone("sink");
            return null;
        }

        /* JADX INFO: renamed from: cutely, reason: from getter */
        public final gold.marial getTaskRunner() {
            return this.taskRunner;
        }

        public final String dern() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            Intrinsics.preprohormone("connectionName");
            return null;
        }

        public final attabal formularize(int pingIntervalMillis) {
            kowloon(pingIntervalMillis);
            return this;
        }

        public final void impassible(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.connectionName = str;
        }

        public final Socket impromptu() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            Intrinsics.preprohormone("socket");
            return null;
        }

        public final void kowloon(int i) {
            this.pingIntervalMillis = i;
        }

        /* JADX INFO: renamed from: marial, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        public final attabal molybdenite(Socket socket, String peerName, duvetyn.beachfront source, duvetyn.marial sink) throws IOException {
            String strArytenoidectomy;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            monoploid(socket);
            if (getClient()) {
                strArytenoidectomy = hereditist.wireman.f27724taiyuan + ' ' + peerName;
            } else {
                strArytenoidectomy = Intrinsics.arytenoidectomy("MockWebServer ", peerName);
            }
            impassible(strArytenoidectomy);
            polloi(source);
            arytenoidectomy(sink);
            return this;
        }

        public final void monoploid(Socket socket) {
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.socket = socket;
        }

        public final void polloi(duvetyn.beachfront beachfrontVar) {
            Intrinsics.checkNotNullParameter(beachfrontVar, "<set-?>");
            this.source = beachfrontVar;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        public final duvetyn.beachfront taiyuan() {
            duvetyn.beachfront beachfrontVar = this.source;
            if (beachfrontVar != null) {
                return beachfrontVar;
            }
            Intrinsics.preprohormone("source");
            return null;
        }

        public final void triweekly(dern dernVar) {
            Intrinsics.checkNotNullParameter(dernVar, "<set-?>");
            this.listener = dernVar;
        }

        /* JADX INFO: renamed from: wireman, reason: from getter */
        public final dern getListener() {
            return this.listener;
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"gold/dern", "Lgold/attabal;", "", "beachfront", "()J", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class beachfront extends gold.attabal {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ wireman f26450beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final /* synthetic */ int f26451competently;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final /* synthetic */ List f26452impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ boolean f26453marial;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final /* synthetic */ boolean f26454taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ String f26455wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public beachfront(String str, boolean z, wireman wiremanVar, int i, List list, boolean z2) {
            super(str, z);
            this.f26455wireman = str;
            this.f26453marial = z;
            this.f26450beachfront = wiremanVar;
            this.f26451competently = i;
            this.f26452impromptu = list;
            this.f26454taiyuan = z2;
        }

        @Override // gold.attabal
        public long beachfront() {
            boolean zOnHeaders = this.f26450beachfront.pushObserver.onHeaders(this.f26451competently, this.f26452impromptu, this.f26454taiyuan);
            if (zOnHeaders) {
                try {
                    this.f26450beachfront.getWriter().cuirassed(this.f26451competently, ErrorCode.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zOnHeaders && !this.f26454taiyuan) {
                return -1L;
            }
            synchronized (this.f26450beachfront) {
                this.f26450beachfront.currentPushRequests.remove(Integer.valueOf(this.f26451competently));
            }
            return -1L;
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"gold/dern", "Lgold/attabal;", "", "beachfront", "()J", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class competently extends gold.attabal {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ wireman f26456beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final /* synthetic */ int f26457competently;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final /* synthetic */ List f26458impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ boolean f26459marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ String f26460wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public competently(String str, boolean z, wireman wiremanVar, int i, List list) {
            super(str, z);
            this.f26460wireman = str;
            this.f26459marial = z;
            this.f26456beachfront = wiremanVar;
            this.f26457competently = i;
            this.f26458impromptu = list;
        }

        @Override // gold.attabal
        public long beachfront() {
            if (!this.f26456beachfront.pushObserver.onRequest(this.f26457competently, this.f26458impromptu)) {
                return -1L;
            }
            try {
                this.f26456beachfront.getWriter().cuirassed(this.f26457competently, ErrorCode.CANCEL);
                synchronized (this.f26456beachfront) {
                    this.f26456beachfront.currentPushRequests.remove(Integer.valueOf(this.f26457competently));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"formularism/wireman$cutely", "Lgold/attabal;", "", "beachfront", "()J", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class cutely extends gold.attabal {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ long f26461beachfront;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ wireman f26462marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ String f26463wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public cutely(String str, wireman wiremanVar, long j) {
            super(str, false, 2, null);
            this.f26463wireman = str;
            this.f26462marial = wiremanVar;
            this.f26461beachfront = j;
        }

        @Override // gold.attabal
        public long beachfront() {
            boolean z;
            synchronized (this.f26462marial) {
                if (this.f26462marial.intervalPongsReceived < this.f26462marial.intervalPingsSent) {
                    z = true;
                } else {
                    this.f26462marial.intervalPingsSent++;
                    z = false;
                }
            }
            if (z) {
                this.f26462marial.starveling(null);
                return -1L;
            }
            this.f26462marial.lampshade(false, 1, 0);
            return this.f26461beachfront;
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \r2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lformularism/wireman$dern;", "", "<init>", "()V", "Lformularism/competently;", "stream", "", "saneness", "(Lformularism/competently;)V", "Lformularism/wireman;", "connection", "Lformularism/apical;", "settings", "attabal", "(Lformularism/wireman;Lformularism/apical;)V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class dern {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final dern f26465saneness = new attabal();

        /* JADX INFO: compiled from: Http2Connection.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"formularism/wireman$dern$attabal", "Lformularism/wireman$dern;", "Lformularism/competently;", "stream", "", "saneness", "(Lformularism/competently;)V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class attabal extends dern {
            @Override // formularism.wireman.dern
            public void saneness(formularism.competently stream) throws IOException {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.wireman(ErrorCode.REFUSED_STREAM, null);
            }
        }

        public void attabal(wireman connection, formularism.apical settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void saneness(formularism.competently stream) throws IOException;
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"gold/dern", "Lgold/attabal;", "", "beachfront", "()J", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class formularize extends gold.attabal {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ wireman f26466beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final /* synthetic */ int f26467competently;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final /* synthetic */ long f26468impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ boolean f26469marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ String f26470wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public formularize(String str, boolean z, wireman wiremanVar, int i, long j) {
            super(str, z);
            this.f26470wireman = str;
            this.f26469marial = z;
            this.f26466beachfront = wiremanVar;
            this.f26467competently = i;
            this.f26468impromptu = j;
        }

        @Override // gold.attabal
        public long beachfront() {
            try {
                this.f26466beachfront.getWriter().restrictive(this.f26467competently, this.f26468impromptu);
                return -1L;
            } catch (IOException e) {
                this.f26466beachfront.starveling(e);
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"gold/dern", "Lgold/attabal;", "", "beachfront", "()J", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class impromptu extends gold.attabal {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ wireman f26471beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final /* synthetic */ int f26472competently;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final /* synthetic */ ErrorCode f26473impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ boolean f26474marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ String f26475wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public impromptu(String str, boolean z, wireman wiremanVar, int i, ErrorCode errorCode) {
            super(str, z);
            this.f26475wireman = str;
            this.f26474marial = z;
            this.f26471beachfront = wiremanVar;
            this.f26472competently = i;
            this.f26473impromptu = errorCode;
        }

        @Override // gold.attabal
        public long beachfront() {
            this.f26471beachfront.pushObserver.saneness(this.f26472competently, this.f26473impromptu);
            synchronized (this.f26471beachfront) {
                this.f26471beachfront.currentPushRequests.remove(Integer.valueOf(this.f26472competently));
                Unit unit = Unit.f29295attabal;
            }
            return -1L;
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"gold/dern", "Lgold/attabal;", "", "beachfront", "()J", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class marial extends gold.attabal {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ wireman f26476beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final /* synthetic */ int f26477competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public final /* synthetic */ boolean f26478cutely;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final /* synthetic */ duvetyn.wireman f26479impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ boolean f26480marial;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final /* synthetic */ int f26481taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ String f26482wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public marial(String str, boolean z, wireman wiremanVar, int i, duvetyn.wireman wiremanVar2, int i2, boolean z2) {
            super(str, z);
            this.f26482wireman = str;
            this.f26480marial = z;
            this.f26476beachfront = wiremanVar;
            this.f26477competently = i;
            this.f26479impromptu = wiremanVar2;
            this.f26481taiyuan = i2;
            this.f26478cutely = z2;
        }

        @Override // gold.attabal
        public long beachfront() {
            try {
                boolean zAttabal = this.f26476beachfront.pushObserver.attabal(this.f26477competently, this.f26479impromptu, this.f26481taiyuan, this.f26478cutely);
                if (zAttabal) {
                    this.f26476beachfront.getWriter().cuirassed(this.f26477competently, ErrorCode.CANCEL);
                }
                if (!zAttabal && !this.f26478cutely) {
                    return -1L;
                }
                synchronized (this.f26476beachfront) {
                    this.f26476beachfront.currentPushRequests.remove(Integer.valueOf(this.f26477competently));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: formularism.wireman$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lformularism/wireman$saneness;", "", "<init>", "()V", "Lformularism/apical;", "DEFAULT_SETTINGS", "Lformularism/apical;", "attabal", "()Lformularism/apical;", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final formularism.apical attabal() {
            return wireman.f26406hydrovane;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"gold/dern", "Lgold/attabal;", "", "beachfront", "()J", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class taiyuan extends gold.attabal {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ wireman f26483beachfront;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ boolean f26484marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ String f26485wireman;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public taiyuan(String str, boolean z, wireman wiremanVar) {
            super(str, z);
            this.f26485wireman = str;
            this.f26484marial = z;
            this.f26483beachfront = wiremanVar;
        }

        @Override // gold.attabal
        public long beachfront() {
            this.f26483beachfront.lampshade(false, 2, 0);
            return -1L;
        }
    }

    static {
        formularism.apical apicalVar = new formularism.apical();
        apicalVar.impromptu(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        apicalVar.impromptu(5, 16384);
        f26406hydrovane = apicalVar;
    }

    public wireman(attabal builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean client = builder.getClient();
        this.client = client;
        this.listener = builder.getListener();
        this.streams = new LinkedHashMap();
        String strDern = builder.dern();
        this.connectionName = strDern;
        this.nextStreamId = builder.getClient() ? 3 : 2;
        gold.marial taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner;
        gold.wireman wiremanVarTaiyuan = taskRunner.taiyuan();
        this.writerQueue = wiremanVarTaiyuan;
        this.pushQueue = taskRunner.taiyuan();
        this.settingsListenerQueue = taskRunner.taiyuan();
        this.pushObserver = builder.getPushObserver();
        formularism.apical apicalVar = new formularism.apical();
        if (builder.getClient()) {
            apicalVar.impromptu(7, 16777216);
        }
        this.okHttpSettings = apicalVar;
        formularism.apical apicalVar2 = f26406hydrovane;
        this.peerSettings = apicalVar2;
        this.writeBytesMaximum = apicalVar2.dern();
        this.socket = builder.impromptu();
        this.writer = new formularism.impromptu(builder.competently(), client);
        this.readerRunnable = new C0611wireman(this, new formularism.beachfront(builder.taiyuan(), client));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis());
            wiremanVarTaiyuan.taiyuan(new cutely(Intrinsics.arytenoidectomy(strDern, " ping"), this, nanos), nanos);
        }
    }

    public static /* synthetic */ void setterwort(wireman wiremanVar, boolean z, gold.marial marialVar, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            marialVar = gold.marial.f27337taiyuan;
        }
        wiremanVar.vesuvio(z, marialVar);
    }

    public final void achondroplasia(int streamId, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.pushQueue.taiyuan(new impromptu(this.connectionName + '[' + streamId + "] onReset", true, this, streamId, errorCode), 0L);
    }

    public final void attendance(int streamId, boolean outFinished, duvetyn.wireman buffer, long byteCount) throws IOException {
        int iMin;
        long j;
        if (byteCount == 0) {
            this.writer.dern(outFinished, streamId, buffer, 0);
            return;
        }
        while (byteCount > 0) {
            synchronized (this) {
                while (getWriteBytesTotal() >= getWriteBytesMaximum()) {
                    try {
                        try {
                            if (!underbelly().containsKey(Integer.valueOf(streamId))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(byteCount, getWriteBytesMaximum() - getWriteBytesTotal()), getWriter().getMaxFrameSize());
                j = iMin;
                this.writeBytesTotal = getWriteBytesTotal() + j;
                Unit unit = Unit.f29295attabal;
            }
            byteCount -= j;
            this.writer.dern(outFinished && byteCount == 0, streamId, buffer, iMin);
        }
    }

    public final synchronized formularism.competently claque(int streamId) {
        formularism.competently competentlyVarRemove;
        competentlyVarRemove = this.streams.remove(Integer.valueOf(streamId));
        notifyAll();
        return competentlyVarRemove;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        creditor(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    /* JADX INFO: renamed from: coi, reason: from getter */
    public final Socket getSocket() {
        return this.socket;
    }

    public final void creditor(ErrorCode connectionCode, ErrorCode streamCode, IOException cause) {
        int i;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (hereditist.wireman.f27721impromptu && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        try {
            dhss(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (underbelly().isEmpty()) {
                    array = null;
                } else {
                    array = underbelly().values().toArray(new formularism.competently[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    underbelly().clear();
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
        formularism.competently[] competentlyVarArr = (formularism.competently[]) array;
        if (competentlyVarArr != null) {
            for (formularism.competently competentlyVar : competentlyVarArr) {
                try {
                    competentlyVar.wireman(streamCode, cause);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            getWriter().close();
        } catch (IOException unused3) {
        }
        try {
            getSocket().close();
        } catch (IOException unused4) {
        }
        this.writerQueue.kowloon();
        this.pushQueue.kowloon();
        this.settingsListenerQueue.kowloon();
    }

    public final synchronized formularism.competently czestochowa(int id) {
        return this.streams.get(Integer.valueOf(id));
    }

    public final void deadwork(int streamId, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.writerQueue.taiyuan(new apical(this.connectionName + '[' + streamId + "] writeSynReset", true, this, streamId, errorCode), 0L);
    }

    /* JADX INFO: renamed from: dent, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    public final void dhss(ErrorCode statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.writer) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                ref$IntRef.element = getLastGoodStreamId();
                Unit unit = Unit.f29295attabal;
                getWriter().formularize(ref$IntRef.element, statusCode, hereditist.wireman.f27717attabal);
            }
        }
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final synchronized boolean gusty(long nowNs) {
        if (this.isShutdown) {
            return false;
        }
        return this.degradedPongsReceived >= this.degradedPingsSent || nowNs < this.degradedPongDeadlineNs;
    }

    public final void hardpan() {
        synchronized (this) {
            long j = this.degradedPongsReceived;
            long j2 = this.degradedPingsSent;
            if (j < j2) {
                return;
            }
            this.degradedPingsSent = j2 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
            Unit unit = Unit.f29295attabal;
            this.writerQueue.taiyuan(new taiyuan(Intrinsics.arytenoidectomy(this.connectionName, " ping"), true, this), 0L);
        }
    }

    public final void herdbook(int i) {
        this.lastGoodStreamId = i;
    }

    public final void homozygous(int streamId, boolean outFinished, List<formularism.attabal> alternating) throws IOException {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.writer.arytenoidectomy(outFinished, streamId, alternating);
    }

    /* JADX INFO: renamed from: igbo, reason: from getter */
    public final formularism.impromptu getWriter() {
        return this.writer;
    }

    /* JADX INFO: renamed from: itchy, reason: from getter */
    public final dern getListener() {
        return this.listener;
    }

    public final void julian(int streamId, List<formularism.attabal> requestHeaders) throws Throwable {
        Throwable th;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (!this.currentPushRequests.contains(Integer.valueOf(streamId))) {
                    this.currentPushRequests.add(Integer.valueOf(streamId));
                    this.pushQueue.taiyuan(new competently(this.connectionName + '[' + streamId + "] onRequest", true, this, streamId, requestHeaders), 0L);
                    return;
                }
                try {
                    deadwork(streamId, ErrorCode.PROTOCOL_ERROR);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            throw th;
        }
    }

    public final void lampshade(boolean reply, int payload1, int payload2) {
        try {
            this.writer.dovishness(reply, payload1, payload2);
        } catch (IOException e) {
            starveling(e);
        }
    }

    /* JADX INFO: renamed from: lerp, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    public final void libyan(int streamId, ErrorCode statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.writer.cuirassed(streamId, statusCode);
    }

    public final void lightstruck(int streamId, duvetyn.beachfront source, int byteCount, boolean inFinished) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        duvetyn.wireman wiremanVar = new duvetyn.wireman();
        long j = byteCount;
        source.require(j);
        source.read(wiremanVar, j);
        this.pushQueue.taiyuan(new marial(this.connectionName + '[' + streamId + "] onData", true, this, streamId, wiremanVar, byteCount, inFinished), 0L);
    }

    public final synchronized void mastfed(long read) {
        long j = this.readBytesTotal + read;
        this.readBytesTotal = j;
        long j2 = j - this.readBytesAcknowledged;
        if (j2 >= this.okHttpSettings.dern() / 2) {
            molet(0, j2);
            this.readBytesAcknowledged += j2;
        }
    }

    /* JADX INFO: renamed from: milliradian, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    public final void molet(int streamId, long unacknowledgedBytesRead) {
        this.writerQueue.taiyuan(new formularize(this.connectionName + '[' + streamId + "] windowUpdate", true, this, streamId, unacknowledgedBytesRead), 0L);
    }

    public final void monroe(int streamId, List<formularism.attabal> requestHeaders, boolean inFinished) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        this.pushQueue.taiyuan(new beachfront(this.connectionName + '[' + streamId + "] onHeaders", true, this, streamId, requestHeaders, inFinished), 0L);
    }

    /* JADX INFO: renamed from: nosophobia, reason: from getter */
    public final formularism.apical getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final void outmarry(formularism.apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<set-?>");
        this.peerSettings = apicalVar;
    }

    public final formularism.competently palmyra(List<formularism.attabal> requestHeaders, boolean out) throws IOException {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return picketboat(0, requestHeaders, out);
    }

    public final formularism.competently picketboat(int associatedStreamId, List<formularism.attabal> requestHeaders, boolean out) throws Throwable {
        Throwable th;
        boolean z = !out;
        synchronized (this.writer) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (getNextStreamId() > 1073741823) {
                                try {
                                    dhss(ErrorCode.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            try {
                                if (this.isShutdown) {
                                    throw new ConnectionShutdownException();
                                }
                                int nextStreamId = getNextStreamId();
                                technofreak(getNextStreamId() + 2);
                                formularism.competently competentlyVar = new formularism.competently(nextStreamId, this, z, false, null);
                                boolean z2 = !out || getWriteBytesTotal() >= getWriteBytesMaximum() || competentlyVar.getWriteBytesTotal() >= competentlyVar.getWriteBytesMaximum();
                                if (competentlyVar.adultoid()) {
                                    underbelly().put(Integer.valueOf(nextStreamId), competentlyVar);
                                }
                                Unit unit = Unit.f29295attabal;
                                if (associatedStreamId == 0) {
                                    getWriter().arytenoidectomy(z, nextStreamId, requestHeaders);
                                } else {
                                    if (getClient()) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    getWriter().rotuma(associatedStreamId, nextStreamId, requestHeaders);
                                }
                                if (z2) {
                                    this.writer.flush();
                                }
                                return competentlyVar;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        th = th;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: preterite, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* JADX INFO: renamed from: sayid, reason: from getter */
    public final formularism.apical getPeerSettings() {
        return this.peerSettings;
    }

    public final void starveling(IOException e) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        creditor(errorCode, errorCode, e);
    }

    public final void technofreak(int i) {
        this.nextStreamId = i;
    }

    /* JADX INFO: renamed from: timberyard, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    public final boolean unconsolidated(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    public final Map<Integer, formularism.competently> underbelly() {
        return this.streams;
    }

    public final void vesuvio(boolean sendConnectionPreface, gold.marial taskRunner) throws IOException {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        if (sendConnectionPreface) {
            this.writer.saneness();
            this.writer.kattegat(this.okHttpSettings);
            int iDern = this.okHttpSettings.dern();
            if (iDern != 65535) {
                this.writer.restrictive(0, iDern - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        taskRunner.taiyuan().taiyuan(new gold.dern(this.connectionName, true, this.readerRunnable), 0L);
    }

    /* JADX INFO: renamed from: wostteth, reason: from getter */
    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    /* JADX INFO: renamed from: formularism.wireman$wireman, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\tJ'\u0010'\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J'\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J/\u00105\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u00106J-\u00109\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lformularism/wireman$wireman;", "Lformularism/beachfront$dern;", "Lkotlin/Function0;", "", "Lformularism/beachfront;", "reader", "<init>", "(Lformularism/wireman;Lformularism/beachfront;)V", "beachfront", "()V", "", "inFinished", "", "streamId", "Lduvetyn/beachfront;", "source", "length", "dern", "(ZILduvetyn/beachfront;I)V", "associatedStreamId", "", "Lformularism/attabal;", "headerBlock", "headers", "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/ErrorCode;", IronSourceConstants.EVENTS_ERROR_CODE, "saneness", "(ILokhttp3/internal/http2/ErrorCode;)V", "clearPrevious", "Lformularism/apical;", "settings", "attabal", "(ZLformularism/apical;)V", "marial", "ackSettings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "Lokio/ByteString;", "debugData", "wireman", "(ILokhttp3/internal/http2/ErrorCode;Lokio/ByteString;)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "streamDependency", "weight", "exclusive", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "(IIIZ)V", "promisedStreamId", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "kowloon", "Lformularism/beachfront;", "getReader$okhttp", "()Lformularism/beachfront;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class C0611wireman implements formularism.beachfront.dern, Function0<Unit> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ wireman f26486arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final formularism.beachfront reader;

        /* JADX INFO: renamed from: formularism.wireman$wireman$attabal */
        /* JADX INFO: compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"gold/dern", "Lgold/attabal;", "", "beachfront", "()J", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class attabal extends gold.attabal {

            /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
            public final /* synthetic */ wireman f26488beachfront;

            /* JADX INFO: renamed from: competently, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef f26489competently;

            /* JADX INFO: renamed from: marial, reason: collision with root package name */
            public final /* synthetic */ boolean f26490marial;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public final /* synthetic */ String f26491wireman;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public attabal(String str, boolean z, wireman wiremanVar, Ref$ObjectRef ref$ObjectRef) {
                super(str, z);
                this.f26491wireman = str;
                this.f26490marial = z;
                this.f26488beachfront = wiremanVar;
                this.f26489competently = ref$ObjectRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // gold.attabal
            public long beachfront() {
                this.f26488beachfront.getListener().attabal(this.f26488beachfront, (formularism.apical) this.f26489competently.element);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: formularism.wireman$wireman$dern */
        /* JADX INFO: compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"gold/dern", "Lgold/attabal;", "", "beachfront", "()J", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class dern extends gold.attabal {

            /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
            public final /* synthetic */ wireman f26492beachfront;

            /* JADX INFO: renamed from: competently, reason: collision with root package name */
            public final /* synthetic */ int f26493competently;

            /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
            public final /* synthetic */ int f26494impromptu;

            /* JADX INFO: renamed from: marial, reason: collision with root package name */
            public final /* synthetic */ boolean f26495marial;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public final /* synthetic */ String f26496wireman;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public dern(String str, boolean z, wireman wiremanVar, int i, int i2) {
                super(str, z);
                this.f26496wireman = str;
                this.f26495marial = z;
                this.f26492beachfront = wiremanVar;
                this.f26493competently = i;
                this.f26494impromptu = i2;
            }

            @Override // gold.attabal
            public long beachfront() {
                this.f26492beachfront.lampshade(true, this.f26493competently, this.f26494impromptu);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: formularism.wireman$wireman$saneness */
        /* JADX INFO: compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"gold/dern", "Lgold/attabal;", "", "beachfront", "()J", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class saneness extends gold.attabal {

            /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
            public final /* synthetic */ wireman f26497beachfront;

            /* JADX INFO: renamed from: competently, reason: collision with root package name */
            public final /* synthetic */ formularism.competently f26498competently;

            /* JADX INFO: renamed from: marial, reason: collision with root package name */
            public final /* synthetic */ boolean f26499marial;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public final /* synthetic */ String f26500wireman;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public saneness(String str, boolean z, wireman wiremanVar, formularism.competently competentlyVar) {
                super(str, z);
                this.f26500wireman = str;
                this.f26499marial = z;
                this.f26497beachfront = wiremanVar;
                this.f26498competently = competentlyVar;
            }

            @Override // gold.attabal
            public long beachfront() {
                try {
                    this.f26497beachfront.getListener().saneness(this.f26498competently);
                    return -1L;
                } catch (IOException e) {
                    elusion.impromptu.INSTANCE.competently().apical(Intrinsics.arytenoidectomy("Http2Connection.Listener failure for ", this.f26497beachfront.getConnectionName()), 4, e);
                    try {
                        this.f26498competently.wireman(ErrorCode.PROTOCOL_ERROR, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: formularism.wireman$wireman$wireman, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"gold/dern", "Lgold/attabal;", "", "beachfront", "()J", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class C0612wireman extends gold.attabal {

            /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
            public final /* synthetic */ C0611wireman f26501beachfront;

            /* JADX INFO: renamed from: competently, reason: collision with root package name */
            public final /* synthetic */ boolean f26502competently;

            /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
            public final /* synthetic */ formularism.apical f26503impromptu;

            /* JADX INFO: renamed from: marial, reason: collision with root package name */
            public final /* synthetic */ boolean f26504marial;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public final /* synthetic */ String f26505wireman;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0612wireman(String str, boolean z, C0611wireman c0611wireman, boolean z2, formularism.apical apicalVar) {
                super(str, z);
                this.f26505wireman = str;
                this.f26504marial = z;
                this.f26501beachfront = c0611wireman;
                this.f26502competently = z2;
                this.f26503impromptu = apicalVar;
            }

            @Override // gold.attabal
            public long beachfront() {
                this.f26501beachfront.marial(this.f26502competently, this.f26503impromptu);
                return -1L;
            }
        }

        public C0611wireman(wireman this$0, formularism.beachfront reader) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f26486arytenoidectomy = this$0;
            this.reader = reader;
        }

        @Override // formularism.beachfront.dern
        public void attabal(boolean clearPrevious, formularism.apical settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f26486arytenoidectomy.writerQueue.taiyuan(new C0612wireman(Intrinsics.arytenoidectomy(this.f26486arytenoidectomy.getConnectionName(), " applyAndAckSettings"), true, this, clearPrevious, settings), 0L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [formularism.beachfront, java.io.Closeable] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void beachfront() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.reader.dern(this);
                    while (this.reader.saneness(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        this.f26486arytenoidectomy.creditor(errorCode3, ErrorCode.CANCEL, null);
                        errorCode = errorCode3;
                    } catch (IOException e2) {
                        e = e2;
                        ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                        wireman wiremanVar = this.f26486arytenoidectomy;
                        wiremanVar.creditor(errorCode4, errorCode4, e);
                        errorCode = wiremanVar;
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (Throwable th) {
                    th = th;
                    errorCode = errorCode2;
                    this.f26486arytenoidectomy.creditor(errorCode, errorCode2, e);
                    hereditist.wireman.impassible(this.reader);
                    throw th;
                }
                errorCode2 = this.reader;
                hereditist.wireman.impassible(errorCode2);
            } catch (Throwable th2) {
                th = th2;
                this.f26486arytenoidectomy.creditor(errorCode, errorCode2, e);
                hereditist.wireman.impassible(this.reader);
                throw th;
            }
        }

        @Override // formularism.beachfront.dern
        public void dern(boolean inFinished, int streamId, duvetyn.beachfront source, int length) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f26486arytenoidectomy.unconsolidated(streamId)) {
                this.f26486arytenoidectomy.lightstruck(streamId, source, length, inFinished);
                return;
            }
            formularism.competently competentlyVarCzestochowa = this.f26486arytenoidectomy.czestochowa(streamId);
            if (competentlyVarCzestochowa == null) {
                this.f26486arytenoidectomy.deadwork(streamId, ErrorCode.PROTOCOL_ERROR);
                long j = length;
                this.f26486arytenoidectomy.mastfed(j);
                source.skip(j);
                return;
            }
            competentlyVarCzestochowa.gintrap(source, length);
            if (inFinished) {
                competentlyVarCzestochowa.rotuma(hereditist.wireman.f27723saneness, true);
            }
        }

        @Override // formularism.beachfront.dern
        public void headers(boolean inFinished, int streamId, int associatedStreamId, List<formularism.attabal> headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f26486arytenoidectomy.unconsolidated(streamId)) {
                this.f26486arytenoidectomy.monroe(streamId, headerBlock, inFinished);
                return;
            }
            wireman wiremanVar = this.f26486arytenoidectomy;
            synchronized (wiremanVar) {
                formularism.competently competentlyVarCzestochowa = wiremanVar.czestochowa(streamId);
                if (competentlyVarCzestochowa != null) {
                    Unit unit = Unit.f29295attabal;
                    competentlyVarCzestochowa.rotuma(hereditist.wireman.starveling(headerBlock), inFinished);
                    return;
                }
                if (wiremanVar.isShutdown) {
                    return;
                }
                if (streamId <= wiremanVar.getLastGoodStreamId()) {
                    return;
                }
                if (streamId % 2 == wiremanVar.getNextStreamId() % 2) {
                    return;
                }
                formularism.competently competentlyVar = new formularism.competently(streamId, wiremanVar, false, inFinished, hereditist.wireman.starveling(headerBlock));
                wiremanVar.herdbook(streamId);
                wiremanVar.underbelly().put(Integer.valueOf(streamId), competentlyVar);
                wiremanVar.taskRunner.taiyuan().taiyuan(new saneness(wiremanVar.getConnectionName() + '[' + streamId + "] onStream", true, wiremanVar, competentlyVar), 0L);
            }
        }

        @Override // p002kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            beachfront();
            return Unit.f29295attabal;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, formularism.apical] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void marial(boolean clearPrevious, formularism.apical settings) {
            ?? r13;
            long jDern;
            int i;
            formularism.competently[] competentlyVarArr;
            Intrinsics.checkNotNullParameter(settings, "settings");
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            formularism.impromptu writer = this.f26486arytenoidectomy.getWriter();
            wireman wiremanVar = this.f26486arytenoidectomy;
            synchronized (writer) {
                synchronized (wiremanVar) {
                    try {
                        formularism.apical peerSettings = wiremanVar.getPeerSettings();
                        if (clearPrevious) {
                            r13 = settings;
                        } else {
                            formularism.apical apicalVar = new formularism.apical();
                            apicalVar.competently(peerSettings);
                            apicalVar.competently(settings);
                            r13 = apicalVar;
                        }
                        ref$ObjectRef.element = r13;
                        jDern = ((long) r13.dern()) - ((long) peerSettings.dern());
                        i = 0;
                        if (jDern == 0 || wiremanVar.underbelly().isEmpty()) {
                            competentlyVarArr = null;
                        } else {
                            Object[] array = wiremanVar.underbelly().values().toArray(new formularism.competently[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            }
                            competentlyVarArr = (formularism.competently[]) array;
                        }
                        wiremanVar.outmarry((formularism.apical) ref$ObjectRef.element);
                        wiremanVar.settingsListenerQueue.taiyuan(new attabal(Intrinsics.arytenoidectomy(wiremanVar.getConnectionName(), " onSettings"), true, wiremanVar, ref$ObjectRef), 0L);
                        Unit unit = Unit.f29295attabal;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    wiremanVar.getWriter().attabal((formularism.apical) ref$ObjectRef.element);
                } catch (IOException e) {
                    wiremanVar.starveling(e);
                }
                Unit unit2 = Unit.f29295attabal;
            }
            if (competentlyVarArr != null) {
                int length = competentlyVarArr.length;
                while (i < length) {
                    formularism.competently competentlyVar = competentlyVarArr[i];
                    i++;
                    synchronized (competentlyVar) {
                        competentlyVar.attabal(jDern);
                        Unit unit3 = Unit.f29295attabal;
                    }
                }
            }
        }

        @Override // formularism.beachfront.dern
        public void ping(boolean ack, int payload1, int payload2) {
            if (!ack) {
                this.f26486arytenoidectomy.writerQueue.taiyuan(new dern(Intrinsics.arytenoidectomy(this.f26486arytenoidectomy.getConnectionName(), " ping"), true, this.f26486arytenoidectomy, payload1, payload2), 0L);
                return;
            }
            wireman wiremanVar = this.f26486arytenoidectomy;
            synchronized (wiremanVar) {
                try {
                    if (payload1 == 1) {
                        wiremanVar.intervalPongsReceived++;
                    } else if (payload1 != 2) {
                        if (payload1 == 3) {
                            wiremanVar.awaitPongsReceived++;
                            wiremanVar.notifyAll();
                        }
                        Unit unit = Unit.f29295attabal;
                    } else {
                        wiremanVar.degradedPongsReceived++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // formularism.beachfront.dern
        public void pushPromise(int streamId, int promisedStreamId, List<formularism.attabal> requestHeaders) throws Throwable {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.f26486arytenoidectomy.julian(promisedStreamId, requestHeaders);
        }

        @Override // formularism.beachfront.dern
        public void saneness(int streamId, ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.f26486arytenoidectomy.unconsolidated(streamId)) {
                this.f26486arytenoidectomy.achondroplasia(streamId, errorCode);
                return;
            }
            formularism.competently competentlyVarClaque = this.f26486arytenoidectomy.claque(streamId);
            if (competentlyVarClaque == null) {
                return;
            }
            competentlyVarClaque.preprohormone(errorCode);
        }

        @Override // formularism.beachfront.dern
        public void windowUpdate(int streamId, long windowSizeIncrement) {
            if (streamId == 0) {
                wireman wiremanVar = this.f26486arytenoidectomy;
                synchronized (wiremanVar) {
                    wiremanVar.writeBytesMaximum = wiremanVar.getWriteBytesMaximum() + windowSizeIncrement;
                    wiremanVar.notifyAll();
                    Unit unit = Unit.f29295attabal;
                }
                return;
            }
            formularism.competently competentlyVarCzestochowa = this.f26486arytenoidectomy.czestochowa(streamId);
            if (competentlyVarCzestochowa != null) {
                synchronized (competentlyVarCzestochowa) {
                    competentlyVarCzestochowa.attabal(windowSizeIncrement);
                    Unit unit2 = Unit.f29295attabal;
                }
            }
        }

        @Override // formularism.beachfront.dern
        public void wireman(int lastGoodStreamId, ErrorCode errorCode, ByteString debugData) {
            int i;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.size();
            wireman wiremanVar = this.f26486arytenoidectomy;
            synchronized (wiremanVar) {
                i = 0;
                array = wiremanVar.underbelly().values().toArray(new formularism.competently[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                wiremanVar.isShutdown = true;
                Unit unit = Unit.f29295attabal;
            }
            formularism.competently[] competentlyVarArr = (formularism.competently[]) array;
            int length = competentlyVarArr.length;
            while (i < length) {
                formularism.competently competentlyVar = competentlyVarArr[i];
                i++;
                if (competentlyVar.getId() > lastGoodStreamId && competentlyVar.graveside()) {
                    competentlyVar.preprohormone(ErrorCode.REFUSED_STREAM);
                    this.f26486arytenoidectomy.claque(competentlyVar.getId());
                }
            }
        }

        @Override // formularism.beachfront.dern
        public void ackSettings() {
        }

        @Override // formularism.beachfront.dern
        public void priority(int streamId, int streamDependency, int weight, boolean exclusive) {
        }
    }
}

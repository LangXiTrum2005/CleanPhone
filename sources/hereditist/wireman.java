package hereditist;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.unity3d.ads.BuildConfig;
import duvetyn.beachfront;
import duvetyn.rotuma;
import duvetyn.sealless;
import duvetyn.supplicat;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okhttp3.cord;
import okhttp3.cuirassed;
import okhttp3.graveside;
import okhttp3.marial;
import okhttp3.molybdenite;
import okhttp3.monoploid;
import okhttp3.stratoscope;
import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.kattegat;
import p002kotlin.collections.polloi;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.gintrap;
import p002kotlin.ranges.IntRange;
import p002kotlin.text.Charsets;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0007*\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001c\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010\"\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#\u001a%\u0010$\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b$\u0010#\u001a%\u0010%\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&\u001a-\u0010(\u001a\u00020\u001b*\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)\u001a-\u0010,\u001a\u00020\u001b*\u00020\u00072\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b,\u0010-\u001a\u0011\u0010.\u001a\u00020\u001b*\u00020\u0007¢\u0006\u0004\b.\u0010/\u001a\u0011\u00100\u001a\u00020\t*\u00020\u0007¢\u0006\u0004\b0\u00101\u001a\u0015\u00102\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b2\u00101\u001a)\u00106\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0012\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u0002040\u000e\"\u000204¢\u0006\u0004\b6\u00107\u001a\u0019\u0010;\u001a\u000209*\u0002082\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<\u001a'\u0010@\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010A\u001a\u0011\u0010B\u001a\u00020\u001b*\u00020*¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010G\u001a\u00020F*\b\u0012\u0004\u0012\u00020E0D¢\u0006\u0004\bG\u0010H\u001a\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020E0D*\u00020F¢\u0006\u0004\bI\u0010J\u001a\u0019\u0010K\u001a\u00020\t*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\bK\u0010L\u001a\u0011\u0010O\u001a\u00020N*\u00020M¢\u0006\u0004\bO\u0010P\u001a\u001c\u0010S\u001a\u00020\u001b*\u00020Q2\u0006\u0010R\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bS\u0010T\u001a\u001c\u0010V\u001a\u00020\u001b*\u00020U2\u0006\u0010R\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bV\u0010W\u001a\u001c\u0010X\u001a\u00020\u0000*\u00020\u001b2\u0006\u0010R\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\bX\u0010Y\u001a\u0019\u0010\\\u001a\u00020\u0004*\u00020Z2\u0006\u0010[\u001a\u00020\u001b¢\u0006\u0004\b\\\u0010]\u001a\u0011\u0010^\u001a\u00020\u001b*\u000208¢\u0006\u0004\b^\u0010_\u001a!\u0010b\u001a\u00020\t*\u00020`2\u0006\u0010=\u001a\u00020\u001b2\u0006\u0010a\u001a\u00020>¢\u0006\u0004\bb\u0010c\u001a!\u0010e\u001a\u00020\t*\u00020`2\u0006\u0010d\u001a\u00020\u001b2\u0006\u0010a\u001a\u00020>¢\u0006\u0004\be\u0010c\u001a\u0019\u0010h\u001a\u00020\t*\u00020f2\u0006\u0010g\u001a\u000208¢\u0006\u0004\bh\u0010i\u001a\u0019\u0010l\u001a\u00020\u001b*\u00020j2\u0006\u0010k\u001a\u00020Q¢\u0006\u0004\bl\u0010m\u001a\u001b\u0010n\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\bn\u0010o\u001a\u0011\u0010q\u001a\u00020\u0000*\u00020p¢\u0006\u0004\bq\u0010r\u001a\u0019\u0010t\u001a\u00020\u0000*\u00020\u00072\u0006\u0010s\u001a\u00020\u0000¢\u0006\u0004\bt\u0010u\u001a\u001b\u0010v\u001a\u00020\u001b*\u0004\u0018\u00010\u00072\u0006\u0010s\u001a\u00020\u001b¢\u0006\u0004\bv\u0010o\u001a#\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\u0004\b\u0000\u0010w*\b\u0012\u0004\u0012\u00028\u00000D¢\u0006\u0004\bx\u0010y\u001a/\u0010{\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\u0004\b\u0000\u0010w2\u0012\u0010z\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000H\u0007¢\u0006\u0004\b{\u0010|\u001a8\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u007f\"\u0004\b\u0000\u0010}\"\u0004\b\u0001\u0010~*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u007f¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0015\u0010\u0083\u0001\u001a\u00020\u0004*\u00030\u0082\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0014\u0010\u0085\u0001\u001a\u00020\u0004*\u00020f¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u001f\u0010\u008a\u0001\u001a\u00020\t*\u00030\u0087\u00012\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a-\u0010\u008f\u0001\u001a\u00020\u0004\"\u0005\b\u0000\u0010\u008c\u0001*\t\u0012\u0004\u0012\u00028\u00000\u008d\u00012\u0007\u0010\u008e\u0001\u001a\u00028\u0000H\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a0\u0010\u0095\u0001\u001a\u00030\u0094\u0001*\b0\u0091\u0001j\u0003`\u0092\u00012\u0013\u0010\u0093\u0001\u001a\u000e\u0012\n\u0012\b0\u0091\u0001j\u0003`\u0092\u00010D¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0017\u0010\u009d\u0001\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0018\u0010 \u0001\u001a\u00030\u009e\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u009f\u0001\"\u0017\u0010£\u0001\u001a\u00030¡\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bS\u0010¢\u0001\"\u0017\u0010¦\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bV\u0010¥\u0001\"\u0017\u0010©\u0001\u001a\u00030§\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bX\u0010¨\u0001\"\u0017\u0010¬\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bO\u0010«\u0001\"\u0017\u0010¯\u0001\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001\"\u0016\u0010±\u0001\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b0\u0010°\u0001¨\u0006²\u0001"}, d2 = {"", "arrayLength", "offset", "count", "", "formularize", "(JJJ)V", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "saran", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "", C3414a2.d, "Ljava/util/Comparator;", "comparator", "yemenite", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "adultoid", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/graveside;", "includeDefaultPort", "hydrovane", "(Lokhttp3/graveside;Z)Ljava/lang/String;", "value", "", "rotuma", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "kowloon", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "cord", "(Ljava/lang/String;II)I", "stratoscope", "clubfoot", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "monoploid", "(Ljava/lang/String;Ljava/lang/String;II)I", "", "delimiter", "arytenoidectomy", "(Ljava/lang/String;CII)I", "preprohormone", "(Ljava/lang/String;)I", "taiyuan", "(Ljava/lang/String;)Z", "supplicat", "format", "", "args", "graveside", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lduvetyn/beachfront;", "Ljava/nio/charset/Charset;", BuildConfig.FLAVOR, "merc", "(Lduvetyn/beachfront;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", IronSourceConstants.EVENTS_DURATION, "Ljava/util/concurrent/TimeUnit;", "unit", "apical", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "restrictive", "(C)I", "", "Lformularism/attabal;", "Lokhttp3/molybdenite;", "starveling", "(Ljava/util/List;)Lokhttp3/molybdenite;", "creditor", "(Lokhttp3/molybdenite;)Ljava/util/List;", "cutely", "(Lokhttp3/graveside;Lokhttp3/graveside;)Z", "Lokhttp3/monoploid;", "Lokhttp3/monoploid$dern;", "competently", "(Lokhttp3/monoploid;)Lokhttp3/monoploid$dern;", "", "mask", "wireman", "(BI)I", "", "marial", "(SI)I", "beachfront", "(IJ)J", "Lduvetyn/marial;", "medium", "cultivated", "(Lduvetyn/marial;I)V", "polder", "(Lduvetyn/beachfront;)I", "Lduvetyn/supplicat;", "timeUnit", "grimness", "(Lduvetyn/supplicat;ILjava/util/concurrent/TimeUnit;)Z", "timeout", "molybdenite", "Ljava/net/Socket;", "source", "kattegat", "(Ljava/net/Socket;Lduvetyn/beachfront;)Z", "Lduvetyn/wireman;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "seminary", "(Lduvetyn/wireman;B)I", "oilcan", "(Ljava/lang/String;I)I", "Lokhttp3/cuirassed;", "dovishness", "(Lokhttp3/cuirassed;)J", "defaultValue", "splinterproof", "(Ljava/lang/String;J)J", "overspeculate", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "peridotite", "(Ljava/util/List;)Ljava/util/List;", "elements", "gintrap", "([Ljava/lang/Object;)Ljava/util/List;", "K", "V", "", "mathsort", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/io/Closeable;", "impassible", "(Ljava/io/Closeable;)V", "triweekly", "(Ljava/net/Socket;)V", "Lgraunch/attabal;", "Ljava/io/File;", X3.i.b, "sealless", "(Lgraunch/attabal;Ljava/io/File;)Z", "E", "", "element", "dern", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "permissivist", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "", "attabal", "[B", "EMPTY_BYTE_ARRAY", "saneness", "Lokhttp3/molybdenite;", "EMPTY_HEADERS", "Lokhttp3/stratoscope;", "Lokhttp3/stratoscope;", "EMPTY_RESPONSE", "Lokhttp3/cord;", "Lokhttp3/cord;", "EMPTY_REQUEST", "Lduvetyn/rotuma;", "Lduvetyn/rotuma;", "UNICODE_BOMS", "Ljava/util/TimeZone;", "Ljava/util/TimeZone;", "UTC", "Lkotlin/text/Regex;", "Lkotlin/text/Regex;", "VERIFY_AS_IP_ADDRESS", "impromptu", "Z", "assertionsEnabled", "Ljava/lang/String;", "okHttpName", "okhttp"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final byte[] f27717attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final TimeZone f27718beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Regex f27719competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final stratoscope f27720dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final boolean f27721impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final rotuma f27722marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final molybdenite f27723saneness = molybdenite.INSTANCE.impromptu(new String[0]);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final String f27724taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final cord f27725wireman;

    static {
        byte[] bArr = new byte[0];
        f27717attabal = bArr;
        f27720dern = stratoscope.Companion.taiyuan(stratoscope.INSTANCE, bArr, null, 1, null);
        f27725wireman = cord.Companion.kowloon(cord.INSTANCE, bArr, null, 0, 0, 7, null);
        rotuma.Companion companion = rotuma.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        f27722marial = companion.wireman(companion2.saneness("efbbbf"), companion2.saneness("feff"), companion2.saneness("fffe"), companion2.saneness("0000ffff"), companion2.saneness("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.beachfront(timeZone);
        f27718beachfront = timeZone;
        f27719competently = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f27721impromptu = false;
        String name = okhttp3.rotuma.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f27724taiyuan = StringsKt.herdbook(StringsKt.hardpan(name, "okhttp3."), "Client");
    }

    public static final boolean adultoid(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                i++;
                Iterator itAttabal = p002kotlin.jvm.internal.saneness.attabal(strArr2);
                while (itAttabal.hasNext()) {
                    if (comparator.compare(str, (String) itAttabal.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int apical(String name, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j < 0) {
            throw new IllegalStateException(Intrinsics.arytenoidectomy(name, " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(Intrinsics.arytenoidectomy(name, " too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(Intrinsics.arytenoidectomy(name, " too small.").toString());
    }

    public static final int arytenoidectomy(String str, char c, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            if (str.charAt(i) == c) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static final long beachfront(int i, long j) {
        return ((long) i) & j;
    }

    public static final String clubfoot(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iCord = cord(str, i, i2);
        String strSubstring = str.substring(iCord, stratoscope(str, iCord, i2));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final monoploid.dern competently(final monoploid monoploidVar) {
        Intrinsics.checkNotNullParameter(monoploidVar, "<this>");
        return new monoploid.dern() { // from class: hereditist.saneness
            @Override // okhttp3.monoploid.dern
            public final monoploid attabal(marial marialVar) {
                return wireman.impromptu(monoploidVar, marialVar);
            }
        };
    }

    public static final int cord(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static final List<formularism.attabal> creditor(molybdenite molybdeniteVar) {
        Intrinsics.checkNotNullParameter(molybdeniteVar, "<this>");
        IntRange intRangeMonoploid = p002kotlin.ranges.wireman.monoploid(0, molybdeniteVar.size());
        ArrayList arrayList = new ArrayList(dovishness.gintrap(intRangeMonoploid, 10));
        Iterator<Integer> it = intRangeMonoploid.iterator();
        while (it.hasNext()) {
            int iNextInt = ((kattegat) it).nextInt();
            arrayList.add(new formularism.attabal(molybdeniteVar.wireman(iNextInt), molybdeniteVar.impromptu(iNextInt)));
        }
        return arrayList;
    }

    public static /* synthetic */ int cuirassed(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return cord(str, i, i2);
    }

    public static final void cultivated(duvetyn.marial marialVar, int i) throws IOException {
        Intrinsics.checkNotNullParameter(marialVar, "<this>");
        marialVar.writeByte((i >>> 16) & 255);
        marialVar.writeByte((i >>> 8) & 255);
        marialVar.writeByte(i & 255);
    }

    public static final boolean cutely(graveside gravesideVar, graveside other) {
        Intrinsics.checkNotNullParameter(gravesideVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.wireman(gravesideVar.getHost(), other.getHost()) && gravesideVar.getOrg.jacoco.core.runtime.AgentOptions.PORT java.lang.String() == other.getOrg.jacoco.core.runtime.AgentOptions.PORT java.lang.String() && Intrinsics.wireman(gravesideVar.getScheme(), other.getScheme());
    }

    public static /* synthetic */ String dent(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return clubfoot(str, i, i2);
    }

    public static final <E> void dern(List<E> list, E e) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(e)) {
            return;
        }
        list.add(e);
    }

    public static final long dovishness(cuirassed cuirassedVar) {
        Intrinsics.checkNotNullParameter(cuirassedVar, "<this>");
        String strSaneness = cuirassedVar.getHeaders().saneness("Content-Length");
        if (strSaneness == null) {
            return -1L;
        }
        return splinterproof(strSaneness, -1L);
    }

    public static final void formularize(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @SafeVarargs
    public static final <T> List<T> gintrap(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(adultoid.kowloon(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final String graveside(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        gintrap gintrapVar = gintrap.f29390attabal;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean grimness(supplicat supplicatVar, int i, TimeUnit timeUnit) throws IOException {
        Intrinsics.checkNotNullParameter(supplicatVar, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDern = supplicatVar.getF25466kowloon().getHasDeadline() ? supplicatVar.getF25466kowloon().dern() - jNanoTime : Long.MAX_VALUE;
        supplicatVar.getF25466kowloon().wireman(Math.min(jDern, timeUnit.toNanos(i)) + jNanoTime);
        try {
            duvetyn.wireman wiremanVar = new duvetyn.wireman();
            while (supplicatVar.read(wiremanVar, 8192L) != -1) {
                wiremanVar.attabal();
            }
            if (jDern == Long.MAX_VALUE) {
                supplicatVar.getF25466kowloon().attabal();
                return true;
            }
            supplicatVar.getF25466kowloon().wireman(jNanoTime + jDern);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDern == Long.MAX_VALUE) {
                supplicatVar.getF25466kowloon().attabal();
                return false;
            }
            supplicatVar.getF25466kowloon().wireman(jNanoTime + jDern);
            return false;
        } catch (Throwable th) {
            if (jDern == Long.MAX_VALUE) {
                supplicatVar.getF25466kowloon().attabal();
            } else {
                supplicatVar.getF25466kowloon().wireman(jNanoTime + jDern);
            }
            throw th;
        }
    }

    public static final String hydrovane(graveside gravesideVar, boolean z) {
        String strTaiyuan;
        Intrinsics.checkNotNullParameter(gravesideVar, "<this>");
        if (StringsKt.overspeculate(gravesideVar.getHost(), ":", false, 2, null)) {
            strTaiyuan = '[' + gravesideVar.getHost() + ']';
        } else {
            strTaiyuan = gravesideVar.getHost();
        }
        if (!z && gravesideVar.getOrg.jacoco.core.runtime.AgentOptions.PORT java.lang.String() == graveside.INSTANCE.dern(gravesideVar.getScheme())) {
            return strTaiyuan;
        }
        return strTaiyuan + ':' + gravesideVar.getOrg.jacoco.core.runtime.AgentOptions.PORT java.lang.String();
    }

    public static final void impassible(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final monoploid impromptu(monoploid this_asFactory, marial it) {
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    public static final boolean kattegat(Socket socket, beachfront source) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.exhausted();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final String[] kowloon(String[] strArr, String value) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[polloi.walach(strArr2)] = value;
        return strArr2;
    }

    public static final int marial(short s, int i) {
        return s & i;
    }

    public static final <K, V> Map<K, V> mathsort(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return seminary.taiyuan();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final Charset merc(beachfront beachfrontVar, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iSplinterproof = beachfrontVar.splinterproof(f27722marial);
        if (iSplinterproof == -1) {
            return charset;
        }
        if (iSplinterproof == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iSplinterproof == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iSplinterproof == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iSplinterproof == 3) {
            return Charsets.f31996attabal.attabal();
        }
        if (iSplinterproof == 4) {
            return Charsets.f31996attabal.saneness();
        }
        throw new AssertionError();
    }

    public static final boolean molybdenite(supplicat supplicatVar, int i, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(supplicatVar, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return grimness(supplicatVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final int monoploid(String str, String delimiters, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i < i2) {
            int i3 = i + 1;
            if (StringsKt.splinterproof(delimiters, str.charAt(i), false, 2, null)) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static final int oilcan(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i = i2;
        }
        return str.length();
    }

    public static final int overspeculate(String str, int i) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
            }
        }
        if (lValueOf == null) {
            return i;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final <T> List<T> peridotite(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.basify(list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final Throwable permissivist(Exception exc, List<? extends Exception> suppressed) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.getClass();
        }
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            patroclinal.marial.attabal(exc, it.next());
        }
        return exc;
    }

    public static final int polder(beachfront beachfrontVar) throws IOException {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        return wireman(beachfrontVar.readByte(), 255) | (wireman(beachfrontVar.readByte(), 255) << 16) | (wireman(beachfrontVar.readByte(), 255) << 8);
    }

    public static /* synthetic */ int polloi(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return arytenoidectomy(str, c, i, i2);
    }

    public static final int preprohormone(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (Intrinsics.taiyuan(cCharAt, 31) <= 0 || Intrinsics.taiyuan(cCharAt, 127) >= 0) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public static final Thread privatdozent(String name, boolean z, Runnable runnable) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z);
        return thread;
    }

    public static final int restrictive(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int rotuma(String[] strArr, String value, Comparator<String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], value) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final ThreadFactory saran(final String name, final boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: hereditist.dern
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return wireman.privatdozent(name, z, runnable);
            }
        };
    }

    public static final boolean sealless(graunch.attabal attabalVar, File file) throws IOException {
        Intrinsics.checkNotNullParameter(attabalVar, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        sealless seallessVarSink = attabalVar.sink(file);
        try {
            try {
                attabalVar.delete(file);
                interaction.saneness.attabal(seallessVarSink, null);
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    interaction.saneness.attabal(seallessVarSink, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            Unit unit = Unit.f29295attabal;
            interaction.saneness.attabal(seallessVarSink, null);
            attabalVar.delete(file);
            return false;
        }
    }

    public static final int seminary(duvetyn.wireman wiremanVar, byte b) throws EOFException {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        int i = 0;
        while (!wiremanVar.exhausted() && wiremanVar.cuirassed(0L) == b) {
            i++;
            wiremanVar.readByte();
        }
        return i;
    }

    public static final long splinterproof(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final molybdenite starveling(List<formularism.attabal> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        molybdenite.attabal attabalVar = new molybdenite.attabal();
        for (formularism.attabal attabalVar2 : list) {
            attabalVar.wireman(attabalVar2.getName().utf8(), attabalVar2.getValue().utf8());
        }
        return attabalVar.marial();
    }

    public static final int stratoscope(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                int i4 = i3 - 1;
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3 = i4;
                }
            }
        }
        return i;
    }

    public static final boolean supplicat(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return p002kotlin.text.dovishness.stratoscope(name, "Authorization", true) || p002kotlin.text.dovishness.stratoscope(name, "Cookie", true) || p002kotlin.text.dovishness.stratoscope(name, "Proxy-Authorization", true) || p002kotlin.text.dovishness.stratoscope(name, "Set-Cookie", true);
    }

    public static final boolean taiyuan(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f27719competently.matches(str);
    }

    public static final void triweekly(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!Intrinsics.wireman(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ int trm(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return stratoscope(str, i, i2);
    }

    public static /* synthetic */ String walach(graveside gravesideVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return hydrovane(gravesideVar, z);
    }

    public static final int wireman(byte b, int i) {
        return b & i;
    }

    public static final String[] yemenite(String[] strArr, String[] other, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            int length2 = other.length;
            int i2 = 0;
            while (i2 < length2) {
                String str2 = other[i2];
                i2++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}

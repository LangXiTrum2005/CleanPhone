package kotlin.text;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/Charsets;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Charsets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f44691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f44692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Charset f44693c;
    public static volatile Charset d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.e(charsetForName, "forName(...)");
        f44691a = charsetForName;
        Intrinsics.e(Charset.forName("UTF-16"), "forName(...)");
        Intrinsics.e(Charset.forName(CharEncoding.UTF_16BE), "forName(...)");
        Intrinsics.e(Charset.forName(CharEncoding.UTF_16LE), "forName(...)");
        Intrinsics.e(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName2 = Charset.forName(CharEncoding.ISO_8859_1);
        Intrinsics.e(charsetForName2, "forName(...)");
        f44692b = charsetForName2;
    }
}

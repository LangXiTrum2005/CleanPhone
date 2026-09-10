package an;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f3768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f3769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Charset f3770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Charset f3771d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.n.e(charsetForName, "forName(...)");
        f3768a = charsetForName;
        kotlin.jvm.internal.n.e(Charset.forName(C.UTF16_NAME), "forName(...)");
        kotlin.jvm.internal.n.e(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.n.e(Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.n.e(Charset.forName(C.ASCII_NAME), "forName(...)");
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.n.e(charsetForName2, "forName(...)");
        f3769b = charsetForName2;
    }
}

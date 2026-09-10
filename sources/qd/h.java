package qd;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f48973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f48974f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f48975a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f48976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f48977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f48978d;

    static {
        Charset.forName("UTF-8");
        f48973e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f48974f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public h(Executor executor, b bVar, b bVar2) {
        this.f48976b = executor;
        this.f48977c = bVar;
        this.f48978d = bVar2;
    }

    public static HashSet a(b bVar) {
        HashSet hashSet = new HashSet();
        c cVarC = bVar.c();
        if (cVarC != null) {
            Iterator<String> itKeys = cVarC.f48946b.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }
}

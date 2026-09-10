package r8;

import android.content.Context;
import ea.f4;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import r1.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile j f49505e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9.a f49506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a9.a f49507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w8.b f49508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.d f49509d;

    public p(a9.a aVar, a9.a aVar2, w8.b bVar, com.google.android.gms.internal.consent_sdk.d dVar, k5.g gVar) {
        this.f49506a = aVar;
        this.f49507b = aVar2;
        this.f49508c = bVar;
        this.f49509d = dVar;
        ((Executor) gVar.f44325a).execute(new q1.c(gVar, 11));
    }

    public static p a() {
        j jVar = f49505e;
        if (jVar != null) {
            return (p) jVar.f49497f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f49505e == null) {
            synchronized (p.class) {
                try {
                    if (f49505e == null) {
                        f4 f4Var = new f4();
                        context.getClass();
                        f4Var.f39414b = context;
                        f49505e = f4Var.f();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final o c(k kVar) {
        byte[] bytes;
        Set setUnmodifiableSet = kVar != null ? Collections.unmodifiableSet(p8.a.f48266d) : Collections.singleton(new o8.c("proto"));
        s sVarA = i.a();
        kVar.getClass();
        sVarA.f49338b = "cct";
        p8.a aVar = (p8.a) kVar;
        String str = aVar.f48269a;
        String str2 = aVar.f48270b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = l1.d.g("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        sVarA.f49339c = bytes;
        return new o(setUnmodifiableSet, sVarA.c(), this);
    }
}

package paddywack;

import com.ironsource.C3460cc;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HttpMethod.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lpaddywack/beachfront;", "", "<init>", "()V", "", "method", "", "marial", "(Ljava/lang/String;)Z", "saneness", "attabal", "wireman", "dern", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final beachfront f34994attabal = new beachfront();

    public static final boolean marial(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.wireman(method, C3460cc.b) || Intrinsics.wireman(method, "PUT") || Intrinsics.wireman(method, "PATCH") || Intrinsics.wireman(method, "PROPPATCH") || Intrinsics.wireman(method, "REPORT");
    }

    public static final boolean saneness(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.wireman(method, C3460cc.a) || Intrinsics.wireman(method, "HEAD")) ? false : true;
    }

    public final boolean attabal(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.wireman(method, C3460cc.b) || Intrinsics.wireman(method, "PATCH") || Intrinsics.wireman(method, "PUT") || Intrinsics.wireman(method, "DELETE") || Intrinsics.wireman(method, "MOVE");
    }

    public final boolean dern(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return !Intrinsics.wireman(method, "PROPFIND");
    }

    public final boolean wireman(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.wireman(method, "PROPFIND");
    }
}

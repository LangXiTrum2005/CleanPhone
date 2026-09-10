package irreclaimable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.adultoid;
import okhttp3.rotuma;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HttpUtilInterceptor.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"Lirreclaimable/attabal;", "", "<init>", "()V", "Lokhttp3/rotuma$attabal;", "builder", "saneness", "(Lokhttp3/rotuma$attabal;)Lokhttp3/rotuma$attabal;", "", "Lirreclaimable/saneness;", "interceptors", "", "attabal", "(Ljava/util/List;)V", "Ljava/util/List;", "INTERCEPTOR_LIST", "dern", "NETWORK_INTERCEPTOR_LIST", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f29000attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final List<saneness> INTERCEPTOR_LIST = new ArrayList();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final List<saneness> NETWORK_INTERCEPTOR_LIST = new ArrayList();

    public static final rotuma.attabal saneness(rotuma.attabal builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Iterator<saneness> it = INTERCEPTOR_LIST.iterator();
        while (it.hasNext()) {
            adultoid adultoidVarAttabal = it.next().attabal();
            if (adultoidVarAttabal != null) {
                builder.attabal(adultoidVarAttabal);
            }
        }
        Iterator<saneness> it2 = NETWORK_INTERCEPTOR_LIST.iterator();
        while (it2.hasNext()) {
            adultoid adultoidVarAttabal2 = it2.next().attabal();
            if (adultoidVarAttabal2 != null) {
                builder.saneness(adultoidVarAttabal2);
            }
        }
        return builder;
    }

    public final void attabal(List<saneness> interceptors) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        if (interceptors.isEmpty()) {
            return;
        }
        for (saneness sanenessVar : INTERCEPTOR_LIST) {
            for (saneness sanenessVar2 : interceptors) {
                if (Intrinsics.wireman(sanenessVar, sanenessVar2)) {
                    interceptors.remove(sanenessVar2);
                    break;
                }
            }
        }
        List<saneness> list = interceptors;
        if (list.isEmpty()) {
            return;
        }
        INTERCEPTOR_LIST.addAll(list);
    }
}

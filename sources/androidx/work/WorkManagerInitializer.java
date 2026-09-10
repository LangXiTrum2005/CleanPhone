package androidx.work;

import android.content.Context;
import com.google.android.gms.internal.ads.j60;
import d5.o;
import e5.l;
import java.util.Collections;
import java.util.List;
import m4.b;
import rc.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5008a = o.i("WrkMgrInitializer");

    @Override // m4.b
    public final Object create(Context context) {
        o.g().e(f5008a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        l.c(context, new j60(new d(9)));
        return l.b(context);
    }

    @Override // m4.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}

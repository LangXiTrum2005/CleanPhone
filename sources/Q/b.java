package q;

import android.os.Handler;
import com.google.android.gms.internal.play_billing.q1;
import eg.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48510b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f48511c = Executors.newFixedThreadPool(4, new c(1));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Handler f48512d;
}

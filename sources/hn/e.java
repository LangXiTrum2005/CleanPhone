package hn;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collection f42425a;

    static {
        try {
            f42425a = zm.l.W(zm.l.M(Arrays.asList(new dn.b()).iterator()));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}

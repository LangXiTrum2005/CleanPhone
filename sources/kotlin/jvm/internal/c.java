package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f44759a = new c();

    private Object readResolve() throws ObjectStreamException {
        return f44759a;
    }
}

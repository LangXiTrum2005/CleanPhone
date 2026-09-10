package y1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f54121a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f54122b = new g();

    @Override // y1.t
    public int a(Object obj) {
        String str = ((m) obj).f54127a;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }

    public List b(String str, boolean z10, boolean z11) {
        return u.e(str, z10, z11);
    }
}

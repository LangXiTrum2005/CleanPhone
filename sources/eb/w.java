package eb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lb.a f40016b = lb.a.a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f40017a;

    public w(HashMap map) {
        this.f40017a = map;
    }

    public final Iterable a(byte[] bArr) {
        List list;
        lb.a aVar = f40016b;
        HashMap map = this.f40017a;
        List list2 = (List) map.get(aVar);
        if (bArr.length >= 5) {
            list = (List) map.get(new lb.a(bArr, 5 > bArr.length ? bArr.length : 5));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        return list == null ? list2 : new u(list, list2);
    }
}

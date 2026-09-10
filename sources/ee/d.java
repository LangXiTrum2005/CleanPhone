package ee;

import com.google.gson.t;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f40030b = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f40031a;

    public d(t tVar) {
        this.f40031a = tVar;
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) {
        Date date = (Date) this.f40031a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) {
        this.f40031a.c(bVar, (Timestamp) obj);
    }
}

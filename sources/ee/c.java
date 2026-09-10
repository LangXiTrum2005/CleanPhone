package ee;

import com.google.gson.t;
import com.google.gson.u;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements u {
    @Override // com.google.gson.u
    public final t create(com.google.gson.d dVar, fe.a aVar) {
        if (aVar.f40809a != Timestamp.class) {
            return null;
        }
        dVar.getClass();
        return new d(dVar.c(new fe.a(Date.class)));
    }
}

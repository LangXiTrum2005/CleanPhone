package ee;

import com.google.gson.m;
import com.google.gson.t;
import com.google.gson.u;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0227a f40026b = new C0227a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f40027a;

    /* JADX INFO: renamed from: ee.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0227a implements u {
        @Override // com.google.gson.u
        public final t create(com.google.gson.d dVar, fe.a aVar) {
            if (aVar.f40809a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public /* synthetic */ a(int i10) {
        this();
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        Date date;
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        String strF = aVar.F();
        synchronized (this) {
            TimeZone timeZone = this.f40027a.getTimeZone();
            try {
                try {
                    date = new Date(this.f40027a.parse(strF).getTime());
                    this.f40027a.setTimeZone(timeZone);
                } catch (ParseException e10) {
                    throw new m("Failed parsing '" + strF + "' as SQL Date; at path " + aVar.t(), e10);
                }
            } catch (Throwable th2) {
                this.f40027a.setTimeZone(timeZone);
                throw th2;
            }
        }
        return date;
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.s();
            return;
        }
        synchronized (this) {
            str = this.f40027a.format((java.util.Date) date);
        }
        bVar.B(str);
    }

    private a() {
        this.f40027a = new SimpleDateFormat("MMM d, yyyy");
    }
}

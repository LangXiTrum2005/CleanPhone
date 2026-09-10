package ee;

import com.google.gson.m;
import com.google.gson.t;
import com.google.gson.u;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40028b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f40029a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements u {
        @Override // com.google.gson.u
        public final t create(com.google.gson.d dVar, fe.a aVar) {
            if (aVar.f40809a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public /* synthetic */ b(int i10) {
        this();
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        Time time;
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        String strF = aVar.F();
        synchronized (this) {
            TimeZone timeZone = this.f40029a.getTimeZone();
            try {
                try {
                    time = new Time(this.f40029a.parse(strF).getTime());
                    this.f40029a.setTimeZone(timeZone);
                } catch (ParseException e10) {
                    throw new m("Failed parsing '" + strF + "' as SQL Time; at path " + aVar.t(), e10);
                }
            } catch (Throwable th2) {
                this.f40029a.setTimeZone(timeZone);
                throw th2;
            }
        }
        return time;
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            bVar.s();
            return;
        }
        synchronized (this) {
            str = this.f40029a.format((Date) time);
        }
        bVar.B(str);
    }

    private b() {
        this.f40029a = new SimpleDateFormat("hh:mm:ss a");
    }
}

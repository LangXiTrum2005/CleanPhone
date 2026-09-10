package be;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class w0 extends com.google.gson.t {
    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        aVar.h();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (aVar.H() == 4) {
                aVar.p();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }
            String strB = aVar.B();
            int iZ = aVar.z();
            strB.getClass();
            switch (strB) {
                case "dayOfMonth":
                    i12 = iZ;
                    break;
                case "minute":
                    i14 = iZ;
                    break;
                case "second":
                    i15 = iZ;
                    break;
                case "year":
                    i10 = iZ;
                    break;
                case "month":
                    i11 = iZ;
                    break;
                case "hourOfDay":
                    i13 = iZ;
                    break;
            }
        }
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            bVar.s();
            return;
        }
        bVar.k();
        bVar.q("year");
        bVar.y(calendar.get(1));
        bVar.q("month");
        bVar.y(calendar.get(2));
        bVar.q("dayOfMonth");
        bVar.y(calendar.get(5));
        bVar.q("hourOfDay");
        bVar.y(calendar.get(11));
        bVar.q("minute");
        bVar.y(calendar.get(12));
        bVar.q("second");
        bVar.y(calendar.get(13));
        bVar.p();
    }
}

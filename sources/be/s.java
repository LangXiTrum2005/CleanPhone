package be;

import com.ironsource.X3;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements com.google.gson.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5673b;

    public /* synthetic */ s(Object obj, int i10) {
        this.f5672a = i10;
        this.f5673b = obj;
    }

    @Override // com.google.gson.u
    public final com.google.gson.t create(com.google.gson.d dVar, fe.a aVar) {
        switch (this.f5672a) {
            case 0:
                if (aVar.f40809a == Number.class) {
                    return (t) this.f5673b;
                }
                return null;
            case 1:
                if (aVar.f40809a == Object.class) {
                    return new u(dVar, (com.google.gson.r) this.f5673b);
                }
                return null;
            default:
                Class cls = aVar.f40809a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (w0) this.f5673b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f5672a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((w0) this.f5673b) + X3.j.f27836e;
            default:
                return super.toString();
        }
    }
}

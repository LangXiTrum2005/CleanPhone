package hd;

import java.util.Iterator;
import java.util.Map;
import nd.r0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fd.a f42320d = fd.a.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f42321c;

    public d(r0 r0Var) {
        this.f42321c = r0Var;
    }

    public static boolean d(r0 r0Var, int i10) {
        if (r0Var != null) {
            fd.a aVar = f42320d;
            if (i10 > 1) {
                aVar.f("Exceed MAX_SUBTRACE_DEEP:1");
                return false;
            }
            for (Map.Entry entry : r0Var.s().entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    String strTrim = str.trim();
                    if (strTrim.isEmpty()) {
                        aVar.f("counterId is empty");
                    } else if (strTrim.length() > 100) {
                        aVar.f("counterId exceeded max length 100");
                    } else if (((Long) entry.getValue()) == null) {
                        aVar.f("invalid CounterValue:" + entry.getValue());
                        return false;
                    }
                }
                aVar.f("invalid CounterId:" + ((String) entry.getKey()));
                return false;
            }
            Iterator<E> it = r0Var.x().iterator();
            while (it.hasNext()) {
                if (!d((r0) it.next(), i10 + 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean e(r0 r0Var, int i10) {
        Long l;
        fd.a aVar = f42320d;
        if (r0Var == null) {
            aVar.f("TraceMetric is null");
            return false;
        }
        if (i10 > 1) {
            aVar.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        String name = r0Var.getName();
        if (name != null) {
            String strTrim = name.trim();
            if (!strTrim.isEmpty() && strTrim.length() <= 100) {
                if (r0Var.v() <= 0) {
                    aVar.f("invalid TraceDuration:" + r0Var.v());
                    return false;
                }
                if (!r0Var.y()) {
                    aVar.f("clientStartTimeUs is null.");
                    return false;
                }
                if (r0Var.getName().startsWith("_st_") && ((l = (Long) r0Var.s().get("_fr_tot")) == null || l.compareTo((Long) 0L) <= 0)) {
                    aVar.f("non-positive totalFrames in screen trace " + r0Var.getName());
                    return false;
                }
                Iterator<E> it = r0Var.x().iterator();
                while (it.hasNext()) {
                    if (!e((r0) it.next(), i10 + 1)) {
                        return false;
                    }
                }
                for (Map.Entry entry : r0Var.t().entrySet()) {
                    try {
                        e.b((String) entry.getKey(), (String) entry.getValue());
                    } catch (IllegalArgumentException e10) {
                        aVar.f(e10.getLocalizedMessage());
                        return false;
                    }
                }
                return true;
            }
        }
        aVar.f("invalid TraceId:" + r0Var.getName());
        return false;
    }

    @Override // hd.e
    public final boolean a() {
        r0 r0Var = this.f42321c;
        boolean zE = e(r0Var, 0);
        fd.a aVar = f42320d;
        if (!zE) {
            aVar.f("Invalid Trace:" + r0Var.getName());
            return false;
        }
        if (r0Var.r() <= 0) {
            Iterator<E> it = r0Var.x().iterator();
            while (it.hasNext()) {
                if (((r0) it.next()).r() > 0) {
                }
            }
            return true;
        }
        if (d(r0Var, 0)) {
            return true;
        }
        aVar.f("Invalid Counters for Trace:" + r0Var.getName());
        return false;
    }
}

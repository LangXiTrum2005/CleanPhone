package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import com.google.common.base.formularize;
import com.google.common.base.kowloon;
import com.google.common.io.BaseEncoding;
import com.google.common.util.concurrent.adultoid;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import saneness.bochum;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class qd extends ys2 {
    public final Map f;
    public final Context g;
    public final yu2 h;
    public final long i;
    public final long j;

    public qd(bochum bochumVar, counters countersVar, Map map, Context context, yu2 yu2Var, j5 j5Var, u13 u13Var) {
        super("X6PYAHB3QDCIIFFKUvwZN/vdvPXxC6iVOoTsytQlsz1vYdSmOjKFrswH1AfMhU/c", "su0DPM17bvbGmaHGc5qQXsCVBRdTKeQuGXgvmLNLEOo=", bochumVar, countersVar, u13Var.a(gf0.EVENT_ID_APP_INFO_SIGNALS_TASK));
        this.g = context;
        this.f = map;
        this.h = yu2Var;
        this.i = j5Var.B();
        this.j = j5Var.F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.ys2
    public final void a(Method method, bochum bochumVar) {
        ra raVar;
        Object[] objArr = (Object[]) formularize.triweekly((Object[]) method.invoke("", this.g, Integer.valueOf(this.h.ordinal())));
        String strP = "E";
        try {
            adultoid adultoidVar = (adultoid) this.f.get("gs");
            if (adultoidVar != null && ((Build.VERSION.SDK_INT < 31 || adultoidVar.isDone()) && (raVar = (ra) adultoidVar.get(this.i, TimeUnit.MILLISECONDS)) != null && raVar.p().length() > 1)) {
                strP = raVar.p();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strP.equals("E")) {
            try {
                adultoid adultoidVar2 = (adultoid) this.f.get("ai");
                if (adultoidVar2 != null) {
                    String str = (String) adultoidVar2.get(this.j, TimeUnit.MILLISECONDS);
                    if (!kowloon.saneness(str)) {
                        strP = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (bochumVar) {
            try {
                bochumVar.triweekly(((Long) objArr[0]).longValue()).hydrovane((String) objArr[1]).trm((String) objArr[2]).merc((String) objArr[3]).yemenite(BaseEncoding.attabal().apical().competently((byte[]) objArr[4])).grimness(strP);
                if (bool != null) {
                    bochumVar.rotuma(bool.booleanValue() ? db.ENUM_TRUE : db.ENUM_FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

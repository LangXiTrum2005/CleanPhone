package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import com.google.common.base.kowloon;
import com.google.common.util.concurrent.adultoid;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import saneness.madbrain;

/* JADX INFO: loaded from: classes.dex */
public final class gd0 implements madbrain {
    public final Context a;
    public final av2 b;
    public final String c;
    public final long d;
    public final long e;

    public gd0(Context context, j5 j5Var, av2 av2Var) {
        this.a = context;
        this.c = j5Var.D();
        this.d = j5Var.B();
        this.e = j5Var.F();
        this.b = av2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(HashMap map) {
        String strP;
        ra raVar;
        map.put("v", this.c);
        map.put("t", new Throwable());
        try {
            adultoid adultoidVar = (adultoid) map.get("gs");
            strP = (adultoidVar == null || (Build.VERSION.SDK_INT >= 31 && !adultoidVar.isDone()) || (raVar = (ra) adultoidVar.get(this.d, TimeUnit.MILLISECONDS)) == null || raVar.p().length() <= 1) ? "E" : raVar.p();
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strP.equals("E")) {
            try {
                adultoid adultoidVar2 = (adultoid) map.get("ai");
                if (adultoidVar2 != null) {
                    String str = (String) adultoidVar2.get(this.e, TimeUnit.MILLISECONDS);
                    if (!kowloon.saneness(str)) {
                        strP = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strP);
    }
}

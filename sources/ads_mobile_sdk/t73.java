package ads_mobile_sdk;

import java.util.Locale;
import java.util.Optional;
import saneness.sanitaria;

/* JADX INFO: loaded from: classes.dex */
public final class t73 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public t73(r73 r73Var, y62 y62Var, long j) {
        int iAttabal = sanitaria.attabal(((~2143124030) & 85005376) | 430547086, (2143124030 & 878451808) | 1894615585, -1294155075, 737454769) ^ (1747844822 % 1617876982);
        Locale locale = Locale.US;
        Object[] objArr = new Object[iAttabal];
        objArr[0] = Long.valueOf(r73Var.a());
        objArr[1] = Long.valueOf(y62Var.b());
        Long lValueOf = Long.valueOf(j);
        objArr[2] = lValueOf;
        super(String.format(locale, bc3.a("bk3t6gFTc30="), objArr));
        Optional.of(y62Var);
        Optional.of(lValueOf);
    }

    public t73(r73 r73Var, Exception exc) {
        super(String.format(Locale.US, bc3.a("bk0="), Long.valueOf(r73Var.a())), exc);
        Optional.empty();
        Optional.empty();
    }
}

package neurotropism;

/* JADX INFO: compiled from: Retries.java */
/* JADX INFO: loaded from: classes2.dex */
public final class saneness {
    public static <TInput, TResult, TException extends Throwable> TResult attabal(int i, TInput tinput, attabal<TInput, TResult, TException> attabalVar, dern<TInput, TResult> dernVar) throws Throwable {
        TResult tresultApply;
        if (i < 1) {
            return attabalVar.apply(tinput);
        }
        do {
            tresultApply = attabalVar.apply(tinput);
            tinput = dernVar.attabal(tinput, tresultApply);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return tresultApply;
    }
}

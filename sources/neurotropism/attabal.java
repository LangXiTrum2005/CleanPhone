package neurotropism;

import java.lang.Throwable;

/* JADX INFO: compiled from: Function.java */
/* JADX INFO: loaded from: classes2.dex */
public interface attabal<TInput, TResult, TException extends Throwable> {
    TResult apply(TInput tinput) throws Throwable;
}

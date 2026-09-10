package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class TinkBugException extends RuntimeException {

    public interface attabal {
        void run() throws Exception;
    }

    public interface saneness<T> {
        T get() throws Exception;
    }

    public TinkBugException(String str) {
        super(str);
    }

    public static <T> T exceptionIsBug(saneness<T> sanenessVar) {
        try {
            return sanenessVar.get();
        } catch (Exception e) {
            throw new TinkBugException(e);
        }
    }

    public TinkBugException(String str, Throwable th) {
        super(str, th);
    }

    public TinkBugException(Throwable th) {
        super(th);
    }

    public static void exceptionIsBug(attabal attabalVar) {
        try {
            attabalVar.run();
        } catch (Exception e) {
            throw new TinkBugException(e);
        }
    }
}

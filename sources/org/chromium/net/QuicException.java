package org.chromium.net;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class QuicException extends NetworkException {
    public QuicException(String str, Throwable th2) {
        super(str, th2);
    }

    public abstract int getQuicDetailedErrorCode();
}

package com.google.android.gms.internal.auth;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends IOException {
    public static q0 d() {
        return new q0("Protocol message had invalid UTF-8.");
    }

    public static q0 g() {
        return new q0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static q0 h() {
        return new q0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class g0 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4081a;

    public static g0 d() {
        return new g0("Protocol message had invalid UTF-8.");
    }

    public static f0 g() {
        return new f0("Protocol message tag had invalid wire type.");
    }

    public static g0 h() {
        return new g0("CodedInputStream encountered a malformed varint.");
    }

    public static g0 i() {
        return new g0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static g0 j() {
        return new g0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

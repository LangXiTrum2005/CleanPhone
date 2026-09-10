package ads_mobile_sdk;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class x81 extends IOException {
    public static final /* synthetic */ int b = 0;
    public boolean a;

    public x81(w81 w81Var) {
        super("Unable to parse map entry.", w81Var);
    }

    public static x81 a() {
        return new x81("Protocol message had invalid UTF-8.");
    }

    public static x81 b() {
        return new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static x81 c() {
        return new x81("Failed to parse the message.");
    }

    public static x81 d() {
        return new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public x81(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public x81(String str) {
        super(str);
    }
}

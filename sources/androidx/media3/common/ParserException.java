package androidx.media3.common;

import android.support.v4.media.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ParserException extends IOException {
    public final boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f5492Y;

    public ParserException(String str, RuntimeException runtimeException, boolean z2, int i2) {
        super(str, runtimeException);
        this.X = z2;
        this.f5492Y = i2;
    }

    public static ParserException a(RuntimeException runtimeException, String str) {
        return new ParserException(str, runtimeException, true, 1);
    }

    public static ParserException b(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.X);
        sb.append(", dataType=");
        return a.i(this.f5492Y, "}", sb);
    }
}

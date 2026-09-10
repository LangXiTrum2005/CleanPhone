package postform;

import duvetyn.wireman;
import java.io.EOFException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: utf8.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lduvetyn/wireman;", "", "attabal", "(Lduvetyn/wireman;)Z", "okhttp-logging-interceptor"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class attabal {
    public static final boolean attabal(wireman wiremanVar) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        try {
            wireman wiremanVar2 = new wireman();
            wiremanVar.monoploid(wiremanVar2, 0L, p002kotlin.ranges.wireman.impromptu(wiremanVar.getSize(), 64L));
            int i = 0;
            while (i < 16) {
                i++;
                if (wiremanVar2.exhausted()) {
                    return true;
                }
                int utf8CodePoint = wiremanVar2.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}

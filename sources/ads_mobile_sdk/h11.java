package ads_mobile_sdk;

import androidx.datastore.core.molybdenite;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h11 implements molybdenite {
    public static final h11 a = new h11();
    public static final b11 b = b11.p();

    @Override // androidx.datastore.core.molybdenite
    public final Object getDefaultValue() {
        return b;
    }

    @Override // androidx.datastore.core.molybdenite
    public final Object readFrom(InputStream inputStream, wretchedly.dern dernVar) {
        try {
            b11 b11VarA = b11.a(inputStream);
            Intrinsics.beachfront(b11VarA);
            return b11VarA;
        } catch (Exception unused) {
            kn0.c("Stored data has been corrupted", null);
            b11 b11Var = b;
            Intrinsics.beachfront(b11Var);
            return b11Var;
        }
    }

    @Override // androidx.datastore.core.molybdenite
    public final Object writeTo(Object obj, OutputStream outputStream, wretchedly.dern dernVar) throws IOException {
        ((b11) obj).a(outputStream);
        return Unit.f29295attabal;
    }
}

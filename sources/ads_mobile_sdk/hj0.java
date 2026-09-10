package ads_mobile_sdk;

import androidx.datastore.core.molybdenite;
import com.google.common.base.triweekly;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hj0 implements molybdenite {
    public static final hj0 a = new hj0();
    public static final gj0 b = gj0.q();

    @Override // androidx.datastore.core.molybdenite
    public final Object getDefaultValue() {
        return b;
    }

    @Override // androidx.datastore.core.molybdenite
    public final Object readFrom(InputStream inputStream, wretchedly.dern dernVar) {
        try {
            gj0 gj0VarA = gj0.a(inputStream);
            Intrinsics.beachfront(gj0VarA);
            return gj0VarA;
        } catch (Exception e) {
            triweekly triweeklyVar = kn0.a;
            kn0.c("Stored data has been corrupted: " + e, null);
            gj0 gj0Var = b;
            Intrinsics.beachfront(gj0Var);
            return gj0Var;
        }
    }

    @Override // androidx.datastore.core.molybdenite
    public final Object writeTo(Object obj, OutputStream outputStream, wretchedly.dern dernVar) throws IOException {
        ((gj0) obj).a(outputStream);
        return Unit.f29295attabal;
    }
}

package ads_mobile_sdk;

import androidx.datastore.core.molybdenite;
import com.google.common.base.triweekly;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kl1 implements molybdenite {
    public static final kl1 a = new kl1();
    public static final xk1 b = xk1.q();

    @Override // androidx.datastore.core.molybdenite
    public final Object getDefaultValue() {
        return b;
    }

    @Override // androidx.datastore.core.molybdenite
    public final Object readFrom(InputStream inputStream, wretchedly.dern dernVar) {
        try {
            xk1 xk1VarA = xk1.a(inputStream);
            Intrinsics.beachfront(xk1VarA);
            return xk1VarA;
        } catch (Exception e) {
            triweekly triweeklyVar = kn0.a;
            kn0.c("Stored data has been corrupted: " + e, null);
            xk1 xk1Var = b;
            Intrinsics.beachfront(xk1Var);
            return xk1Var;
        }
    }

    @Override // androidx.datastore.core.molybdenite
    public final Object writeTo(Object obj, OutputStream outputStream, wretchedly.dern dernVar) throws IOException {
        ((xk1) obj).a(outputStream);
        return Unit.f29295attabal;
    }
}

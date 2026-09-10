package ads_mobile_sdk;

import androidx.datastore.core.molybdenite;
import com.google.common.base.triweekly;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xn2 implements molybdenite {
    public static final xn2 a = new xn2();
    public static final on2 b = on2.o();

    @Override // androidx.datastore.core.molybdenite
    public final Object getDefaultValue() {
        return b;
    }

    @Override // androidx.datastore.core.molybdenite
    public final Object readFrom(InputStream inputStream, wretchedly.dern dernVar) {
        try {
            on2 on2VarA = on2.a(inputStream);
            Intrinsics.beachfront(on2VarA);
            return on2VarA;
        } catch (Exception e) {
            triweekly triweeklyVar = kn0.a;
            kn0.c("Stored shared settings data has been corrupted: " + e, null);
            on2 on2Var = b;
            Intrinsics.beachfront(on2Var);
            return on2Var;
        }
    }

    @Override // androidx.datastore.core.molybdenite
    public final Object writeTo(Object obj, OutputStream outputStream, wretchedly.dern dernVar) throws IOException {
        ((on2) obj).a(outputStream);
        return Unit.f29295attabal;
    }
}

package ads_mobile_sdk;

import androidx.datastore.core.molybdenite;
import com.google.common.base.triweekly;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gl2 implements molybdenite {
    public static final gl2 a = new gl2();
    public static final fl2 b = fl2.p();

    @Override // androidx.datastore.core.molybdenite
    public final Object getDefaultValue() {
        return b;
    }

    @Override // androidx.datastore.core.molybdenite
    public final Object readFrom(InputStream inputStream, wretchedly.dern dernVar) {
        try {
            fl2 fl2VarA = fl2.a(inputStream);
            Intrinsics.beachfront(fl2VarA);
            return fl2VarA;
        } catch (Exception e) {
            triweekly triweeklyVar = kn0.a;
            kn0.c("Stored data has been corrupted: " + e, null);
            fl2 fl2Var = b;
            Intrinsics.beachfront(fl2Var);
            return fl2Var;
        }
    }

    @Override // androidx.datastore.core.molybdenite
    public final Object writeTo(Object obj, OutputStream outputStream, wretchedly.dern dernVar) throws IOException {
        ((fl2) obj).a(outputStream);
        return Unit.f29295attabal;
    }
}

package ads_mobile_sdk;

import androidx.datastore.core.molybdenite;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kc implements molybdenite {
    public static final kc a = new kc();
    public static final cc b = cc.o();

    @Override // androidx.datastore.core.molybdenite
    public final Object getDefaultValue() {
        return b;
    }

    @Override // androidx.datastore.core.molybdenite
    public final Object readFrom(InputStream inputStream, wretchedly.dern dernVar) {
        try {
            cc ccVarA = cc.a(inputStream);
            Intrinsics.beachfront(ccVarA);
            return ccVarA;
        } catch (Exception unused) {
            cc ccVar = b;
            Intrinsics.beachfront(ccVar);
            return ccVar;
        }
    }

    @Override // androidx.datastore.core.molybdenite
    public final Object writeTo(Object obj, OutputStream outputStream, wretchedly.dern dernVar) throws IOException {
        ((cc) obj).a(outputStream);
        return Unit.f29295attabal;
    }
}

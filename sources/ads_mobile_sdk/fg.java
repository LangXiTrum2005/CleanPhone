package ads_mobile_sdk;

import androidx.datastore.core.molybdenite;
import com.google.common.base.triweekly;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fg implements molybdenite {
    public static final fg a = new fg();
    public static final vf b = vf.w();

    @Override // androidx.datastore.core.molybdenite
    public final Object getDefaultValue() {
        return b;
    }

    @Override // androidx.datastore.core.molybdenite
    public final Object readFrom(InputStream inputStream, wretchedly.dern dernVar) {
        try {
            vf vfVarA = vf.a(inputStream);
            Intrinsics.beachfront(vfVarA);
            return vfVarA;
        } catch (Exception e) {
            triweekly triweeklyVar = kn0.a;
            kn0.c("Stored data has been corrupted: " + e, null);
            vf vfVar = b;
            Intrinsics.beachfront(vfVar);
            return vfVar;
        }
    }

    @Override // androidx.datastore.core.molybdenite
    public final Object writeTo(Object obj, OutputStream outputStream, wretchedly.dern dernVar) throws IOException {
        ((vf) obj).a(outputStream);
        return Unit.f29295attabal;
    }
}

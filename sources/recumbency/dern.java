package recumbency;

import java.io.InputStream;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import p002kotlin.reflect.jvm.internal.impl.protobuf.beachfront;
import patroclinal.formularize;

/* JADX INFO: compiled from: readPackageFragment.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern {
    public static final Pair<ProtoBuf$PackageFragment, attabal> attabal(InputStream inputStream) {
        ProtoBuf$PackageFragment from;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        try {
            attabal attabalVarAttabal = attabal.f36069competently.attabal(inputStream);
            if (attabalVarAttabal.impromptu()) {
                beachfront beachfrontVarWireman = beachfront.wireman();
                saneness.attabal(beachfrontVarWireman);
                from = ProtoBuf$PackageFragment.parseFrom(inputStream, beachfrontVarWireman);
            } else {
                from = null;
            }
            Pair<ProtoBuf$PackageFragment, attabal> pairAttabal = formularize.attabal(from, attabalVarAttabal);
            interaction.saneness.attabal(inputStream, null);
            return pairAttabal;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                interaction.saneness.attabal(inputStream, th);
                throw th2;
            }
        }
    }
}

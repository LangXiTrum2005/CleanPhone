package androidx.datastore.preferences;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreferencesMapCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/preferences/saneness;", "", "attabal", "datastore-preferences-proto"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.datastore.preferences.saneness$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PreferencesMapCompat.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/datastore/preferences/saneness$attabal;", "", "<init>", "()V", "Ljava/io/InputStream;", "input", "Landroidx/datastore/preferences/wireman;", "attabal", "(Ljava/io/InputStream;)Landroidx/datastore/preferences/wireman;", "datastore-preferences-proto"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wireman attabal(InputStream input) throws IOException {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                wireman wiremanVarMathsort = wireman.mathsort(input);
                Intrinsics.checkNotNullExpressionValue(wiremanVarMathsort, "{\n                Prefer…From(input)\n            }");
                return wiremanVarMathsort;
            } catch (InvalidProtocolBufferException e) {
                throw new CorruptionException("Unable to parse preferences proto.", e);
            }
        }

        public Companion() {
        }
    }
}

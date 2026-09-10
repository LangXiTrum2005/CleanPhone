package androidx.datastore.preferences.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\n\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\tH&¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/datastore/preferences/core/dern;", "", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/preferences/core/dern$attabal;", X3.i.W, "saneness", "(Landroidx/datastore/preferences/core/dern$attabal;)Ljava/lang/Object;", "", "attabal", "()Ljava/util/Map;", "Landroidx/datastore/preferences/core/MutablePreferences;", "dern", "()Landroidx/datastore/preferences/core/MutablePreferences;", "wireman", "()Landroidx/datastore/preferences/core/dern;", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class dern {

    /* JADX INFO: compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/datastore/preferences/core/dern$attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "name", "<init>", "(Ljava/lang/String;)V", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "attabal", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal<T> {
        private final String name;

        public attabal(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (other instanceof attabal) {
                return Intrinsics.wireman(this.name, ((attabal) other).name);
            }
            return false;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\b\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/datastore/preferences/core/dern$saneness;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/datastore/preferences/core/dern$attabal;", "attabal", "Landroidx/datastore/preferences/core/dern$attabal;", "()Landroidx/datastore/preferences/core/dern$attabal;", X3.i.W, "value", "Ljava/lang/Object;", "saneness", "()Ljava/lang/Object;", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final attabal<T> key;
        private final T value;

        public final attabal<T> attabal() {
            return this.key;
        }

        public final T saneness() {
            return this.value;
        }
    }

    public abstract Map<attabal<?>, Object> attabal();

    public final MutablePreferences dern() {
        return new MutablePreferences(seminary.stratoscope(attabal()), false);
    }

    public abstract <T> T saneness(attabal<T> key);

    public final dern wireman() {
        return new MutablePreferences(seminary.stratoscope(attabal()), true);
    }
}

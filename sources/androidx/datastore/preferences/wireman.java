package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.privatdozent;
import androidx.datastore.preferences.protobuf.splinterproof;
import androidx.datastore.preferences.protobuf.supplicat;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PreferencesProto.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman extends GeneratedMessageLite<wireman, attabal> implements privatdozent {
    private static final wireman DEFAULT_INSTANCE;
    private static volatile splinterproof<wireman> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite<String, PreferencesProto$Value> preferences_ = MapFieldLite.emptyMapField();

    /* JADX INFO: compiled from: PreferencesProto.java */
    public static final class attabal extends GeneratedMessageLite.attabal<wireman, attabal> implements privatdozent {
        public /* synthetic */ attabal(dern dernVar) {
            this();
        }

        public attabal adultoid(String str, PreferencesProto$Value preferencesProto$Value) {
            str.getClass();
            preferencesProto$Value.getClass();
            formularize();
            ((wireman) this.f9655arytenoidectomy).creditor().put(str, preferencesProto$Value);
            return this;
        }

        public attabal() {
            super(wireman.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: PreferencesProto.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final supplicat<String, PreferencesProto$Value> f9903attabal = supplicat.wireman(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, PreferencesProto$Value.dent());
    }

    static {
        wireman wiremanVar = new wireman();
        DEFAULT_INSTANCE = wiremanVar;
        GeneratedMessageLite.polder(wireman.class, wiremanVar);
    }

    public static wireman mathsort(InputStream inputStream) throws IOException {
        return (wireman) GeneratedMessageLite.restrictive(DEFAULT_INSTANCE, inputStream);
    }

    public static attabal peridotite() {
        return DEFAULT_INSTANCE.arytenoidectomy();
    }

    public final Map<String, PreferencesProto$Value> creditor() {
        return hydrovane();
    }

    public final MapFieldLite<String, PreferencesProto$Value> hydrovane() {
        if (!this.preferences_.isMutable()) {
            this.preferences_ = this.preferences_.mutableCopy();
        }
        return this.preferences_;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object molybdenite(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        splinterproof sanenessVar;
        dern dernVar = null;
        switch (dern.f9618attabal[methodToInvoke.ordinal()]) {
            case 1:
                return new wireman();
            case 2:
                return new attabal(dernVar);
            case 3:
                return GeneratedMessageLite.sealless(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", saneness.f9903attabal});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                splinterproof<wireman> splinterproofVar = PARSER;
                if (splinterproofVar != null) {
                    return splinterproofVar;
                }
                synchronized (wireman.class) {
                    try {
                        sanenessVar = PARSER;
                        if (sanenessVar == null) {
                            sanenessVar = new GeneratedMessageLite.saneness(DEFAULT_INSTANCE);
                            PARSER = sanenessVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return sanenessVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Map<String, PreferencesProto$Value> starveling() {
        return Collections.unmodifiableMap(walach());
    }

    public final MapFieldLite<String, PreferencesProto$Value> walach() {
        return this.preferences_;
    }
}

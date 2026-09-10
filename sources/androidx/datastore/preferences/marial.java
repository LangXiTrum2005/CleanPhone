package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.gintrap;
import androidx.datastore.preferences.protobuf.privatdozent;
import androidx.datastore.preferences.protobuf.splinterproof;
import java.util.List;

/* JADX INFO: compiled from: PreferencesProto.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial extends GeneratedMessageLite<marial, attabal> implements privatdozent {
    private static final marial DEFAULT_INSTANCE;
    private static volatile splinterproof<marial> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private gintrap.beachfront<String> strings_ = GeneratedMessageLite.graveside();

    /* JADX INFO: compiled from: PreferencesProto.java */
    public static final class attabal extends GeneratedMessageLite.attabal<marial, attabal> implements privatdozent {
        public /* synthetic */ attabal(dern dernVar) {
            this();
        }

        public attabal adultoid(Iterable<String> iterable) {
            formularize();
            ((marial) this.f9655arytenoidectomy).creditor(iterable);
            return this;
        }

        public attabal() {
            super(marial.DEFAULT_INSTANCE);
        }
    }

    static {
        marial marialVar = new marial();
        DEFAULT_INSTANCE = marialVar;
        GeneratedMessageLite.polder(marial.class, marialVar);
    }

    public static marial hydrovane() {
        return DEFAULT_INSTANCE;
    }

    public static attabal peridotite() {
        return DEFAULT_INSTANCE.arytenoidectomy();
    }

    public final void creditor(Iterable<String> iterable) {
        starveling();
        androidx.datastore.preferences.protobuf.attabal.dern(iterable, this.strings_);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object molybdenite(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        splinterproof sanenessVar;
        dern dernVar = null;
        switch (dern.f9618attabal[methodToInvoke.ordinal()]) {
            case 1:
                return new marial();
            case 2:
                return new attabal(dernVar);
            case 3:
                return GeneratedMessageLite.sealless(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                splinterproof<marial> splinterproofVar = PARSER;
                if (splinterproofVar != null) {
                    return splinterproofVar;
                }
                synchronized (marial.class) {
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

    public final void starveling() {
        gintrap.beachfront<String> beachfrontVar = this.strings_;
        if (beachfrontVar.isModifiable()) {
            return;
        }
        this.strings_ = GeneratedMessageLite.oilcan(beachfrontVar);
    }

    public List<String> walach() {
        return this.strings_;
    }
}

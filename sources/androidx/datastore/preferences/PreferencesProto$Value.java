package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.privatdozent;
import androidx.datastore.preferences.protobuf.splinterproof;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesProto$Value extends GeneratedMessageLite<PreferencesProto$Value, attabal> implements privatdozent {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final PreferencesProto$Value DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile splinterproof<PreferencesProto$Value> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public enum ValueCase {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);

        private final int value;

        ValueCase(int i) {
            this.value = i;
        }

        public static ValueCase forNumber(int i) {
            switch (i) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ValueCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class attabal extends GeneratedMessageLite.attabal<PreferencesProto$Value, attabal> implements privatdozent {
        public /* synthetic */ attabal(dern dernVar) {
            this();
        }

        public attabal adultoid(boolean z) {
            formularize();
            ((PreferencesProto$Value) this.f9655arytenoidectomy).lerp(z);
            return this;
        }

        public attabal cord(long j) {
            formularize();
            ((PreferencesProto$Value) this.f9655arytenoidectomy).coi(j);
            return this;
        }

        public attabal cuirassed(String str) {
            formularize();
            ((PreferencesProto$Value) this.f9655arytenoidectomy).czestochowa(str);
            return this;
        }

        public attabal dovishness(ByteString byteString) {
            formularize();
            ((PreferencesProto$Value) this.f9655arytenoidectomy).nosophobia(byteString);
            return this;
        }

        public attabal gintrap(double d) {
            formularize();
            ((PreferencesProto$Value) this.f9655arytenoidectomy).lotta(d);
            return this;
        }

        public attabal preprohormone(int i) {
            formularize();
            ((PreferencesProto$Value) this.f9655arytenoidectomy).empress(i);
            return this;
        }

        public attabal rotuma(float f) {
            formularize();
            ((PreferencesProto$Value) this.f9655arytenoidectomy).sayid(f);
            return this;
        }

        public attabal stratoscope(marial.attabal attabalVar) {
            formularize();
            ((PreferencesProto$Value) this.f9655arytenoidectomy).sensatory(attabalVar.build());
            return this;
        }

        public attabal() {
            super(PreferencesProto$Value.DEFAULT_INSTANCE);
        }
    }

    static {
        PreferencesProto$Value preferencesProto$Value = new PreferencesProto$Value();
        DEFAULT_INSTANCE = preferencesProto$Value;
        GeneratedMessageLite.polder(PreferencesProto$Value.class, preferencesProto$Value);
    }

    public static attabal coffeecake() {
        return DEFAULT_INSTANCE.arytenoidectomy();
    }

    public static PreferencesProto$Value dent() {
        return DEFAULT_INSTANCE;
    }

    public ByteString clubfoot() {
        return this.valueCase_ == 8 ? (ByteString) this.value_ : ByteString.EMPTY;
    }

    public final void coi(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    public float cultivated() {
        return this.valueCase_ == 2 ? ((Float) this.value_).floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void czestochowa(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void empress(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    public ValueCase itchy() {
        return ValueCase.forNumber(this.valueCase_);
    }

    public final void lerp(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    public final void lotta(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    public String milliradian() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object molybdenite(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        splinterproof sanenessVar;
        dern dernVar = null;
        switch (dern.f9618attabal[methodToInvoke.ordinal()]) {
            case 1:
                return new PreferencesProto$Value();
            case 2:
                return new attabal(dernVar);
            case 3:
                return GeneratedMessageLite.sealless(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", marial.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                splinterproof<PreferencesProto$Value> splinterproofVar = PARSER;
                if (splinterproofVar != null) {
                    return splinterproofVar;
                }
                synchronized (PreferencesProto$Value.class) {
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

    public final void nosophobia(ByteString byteString) {
        byteString.getClass();
        this.valueCase_ = 8;
        this.value_ = byteString;
    }

    public boolean overspeculate() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double permissivist() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public int premeiotic() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final void sayid(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }

    public final void sensatory(marial marialVar) {
        marialVar.getClass();
        this.value_ = marialVar;
        this.valueCase_ = 6;
    }

    public long timberyard() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public marial treadless() {
        return this.valueCase_ == 6 ? (marial) this.value_ : marial.hydrovane();
    }
}

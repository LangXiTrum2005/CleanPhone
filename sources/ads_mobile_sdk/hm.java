package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum hm implements salutatory {
    NO_ERROR(0),
    ADAPTER_CREATION_FAILURE(1),
    SIGNAL_COLLECTION_FAILURE(2),
    SIGNAL_COLLECTION_TIMEOUT(3),
    UNKNOWN_ERROR(4),
    ADAPTER_PROTOCOL_CONFORMANCE_FAILURE(5),
    COLLECTOR_FUNCTION_TIMEDOUT(100),
    COLLECTOR_NOT_REGISTERED(101),
    INVALID_COLLECTOR_ID(102),
    UNKNOWN_COLLECTOR(103),
    COLLECTOR_THROTTLED(104),
    INVALID_COLLECTOR_FUNCTION(105),
    COLLECTOR_FUNCTION_REJECTED(106),
    COLLECTOR_FUNCTION_FAILED(107),
    SIGNAL_EXCEEDS_MAX_LENGTH(108),
    COLLECTOR_SCRIPT_LOAD_FAILED(109),
    UNDEFINED_PROVIDER(110),
    INVALID_PROVIDER_TYPE(112),
    SIGNAL_NULL_OR_UNDEFINED(111),
    SIGNAL_INVALID_TYPE(113),
    COLLECTOR_ENDPOINT_LOAD_FAILED(114),
    URL_PARAM_SECURE_SIGNALS_PARSING_FAILED(200),
    URL_PARAM_SECURE_SIGNALS_JSON_PARSING_FAILED(201);

    public final int a;

    hm(int i) {
        this.a = i;
    }

    public static hm a(int i) {
        if (i == 200) {
            return URL_PARAM_SECURE_SIGNALS_PARSING_FAILED;
        }
        if (i == 201) {
            return URL_PARAM_SECURE_SIGNALS_JSON_PARSING_FAILED;
        }
        if (i == 0) {
            return NO_ERROR;
        }
        if (i == 1) {
            return ADAPTER_CREATION_FAILURE;
        }
        if (i == 2) {
            return SIGNAL_COLLECTION_FAILURE;
        }
        if (i == 3) {
            return SIGNAL_COLLECTION_TIMEOUT;
        }
        if (i == 4) {
            return UNKNOWN_ERROR;
        }
        if (i == 5) {
            return ADAPTER_PROTOCOL_CONFORMANCE_FAILURE;
        }
        switch (i) {
            case 100:
                return COLLECTOR_FUNCTION_TIMEDOUT;
            case 101:
                return COLLECTOR_NOT_REGISTERED;
            case 102:
                return INVALID_COLLECTOR_ID;
            case 103:
                return UNKNOWN_COLLECTOR;
            case 104:
                return COLLECTOR_THROTTLED;
            case 105:
                return INVALID_COLLECTOR_FUNCTION;
            case 106:
                return COLLECTOR_FUNCTION_REJECTED;
            case 107:
                return COLLECTOR_FUNCTION_FAILED;
            case 108:
                return SIGNAL_EXCEEDS_MAX_LENGTH;
            case 109:
                return COLLECTOR_SCRIPT_LOAD_FAILED;
            case 110:
                return UNDEFINED_PROVIDER;
            case 111:
                return SIGNAL_NULL_OR_UNDEFINED;
            case 112:
                return INVALID_PROVIDER_TYPE;
            case 113:
                return SIGNAL_INVALID_TYPE;
            case 114:
                return COLLECTOR_ENDPOINT_LOAD_FAILED;
            default:
                return null;
        }
    }

    @Override // saneness.salutatory
    public final int getNumber() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        cyclery.attabal(hm.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.a);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}

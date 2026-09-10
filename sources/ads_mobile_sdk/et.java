package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum et implements salutatory {
    API_UNKNOWN(0),
    API_READ_SHARED_PREFERENCES_CONSENT_DATA(1),
    API_READ_FLAG_VALUES(2),
    API_WRITE_FLAG_VALUES(3),
    API_READ_CLD_RESPONSE(4),
    API_WRITE_CLD_RESPONSE(5),
    API_GET_WEBVIEW_COOKIE(6),
    API_SET_WEBVIEW_COOKIE(7),
    API_CLEAR_WEBVIEW_COOKIE(8),
    API_READ_SESSION_ID(9),
    API_READ_ANDROID_ID(10),
    API_READ_ADVERTISING_ID(11),
    API_READ_APP_SET_ID(12),
    API_PER_APP_ID_V1(13),
    API_PER_APP_ID_V2(14),
    API_CLEAR_PER_APP_ID_V1(15),
    API_CLEAR_PER_APP_ID_V2(16),
    API_GET_TOPICS(17),
    API_ATTRIBUTION_REPORTING(18),
    API_READ_FIREBASE_APP_ID(19),
    API_READ_FIREBASE_APP_INSTANCE_ID(20),
    API_READ_FIREBASE_AD_EVENT_ID(21),
    API_READ_TRUSTLESS_TOKEN(22),
    API_READ_AMAZON_FIRE_AD_ID(23),
    UNRECOGNIZED(-1);

    public final int a;

    et(int i) {
        this.a = i;
    }

    public static et a(int i) {
        switch (i) {
            case 0:
                return API_UNKNOWN;
            case 1:
                return API_READ_SHARED_PREFERENCES_CONSENT_DATA;
            case 2:
                return API_READ_FLAG_VALUES;
            case 3:
                return API_WRITE_FLAG_VALUES;
            case 4:
                return API_READ_CLD_RESPONSE;
            case 5:
                return API_WRITE_CLD_RESPONSE;
            case 6:
                return API_GET_WEBVIEW_COOKIE;
            case 7:
                return API_SET_WEBVIEW_COOKIE;
            case 8:
                return API_CLEAR_WEBVIEW_COOKIE;
            case 9:
                return API_READ_SESSION_ID;
            case 10:
                return API_READ_ANDROID_ID;
            case 11:
                return API_READ_ADVERTISING_ID;
            case 12:
                return API_READ_APP_SET_ID;
            case 13:
                return API_PER_APP_ID_V1;
            case 14:
                return API_PER_APP_ID_V2;
            case 15:
                return API_CLEAR_PER_APP_ID_V1;
            case 16:
                return API_CLEAR_PER_APP_ID_V2;
            case 17:
                return API_GET_TOPICS;
            case 18:
                return API_ATTRIBUTION_REPORTING;
            case 19:
                return API_READ_FIREBASE_APP_ID;
            case 20:
                return API_READ_FIREBASE_APP_INSTANCE_ID;
            case 21:
                return API_READ_FIREBASE_AD_EVENT_ID;
            case 22:
                return API_READ_TRUSTLESS_TOKEN;
            case 23:
                return API_READ_AMAZON_FIRE_AD_ID;
            default:
                return null;
        }
    }

    @Override // saneness.salutatory
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        cyclery.attabal(et.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(getNumber());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}

package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum ga implements salutatory {
    /* JADX INFO: Fake field, exist only in values array */
    PSN_INVALID_ERROR_CODE(1),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_UNKNOWN(3),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_NO_SIGNALS(5),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_BLANK_VALUE(7),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_MEMORY(9),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_SERVICE(11),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_SERVICE(13),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_WEB64_FAIL(15),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_COLLECTION_TIMEOUT(17),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_MD5_CHECK_FAIL(19),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_WEB64_FAIL(2),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_DECRYPT_SIZE_FAIL(4),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_MD5_CHECK_FAIL(8),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_MD5_SIZE_FAIL(16),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_BLANK_VALUE(32),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_INVALID_ERROR_CODE(64),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_BLANK_VALUE(128),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_INVALID_ERROR_CODE(256),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_BLANK_VALUE(512),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_INVALID_ERROR_CODE(1024),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_BLANK_VALUE(2048),
    PSN_ENCODE_SIZE_FAIL(4096),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_BLANK_VALUE(8192),
    PSN_INITIALIZATION_FAIL(16384),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_GASS_CLIENT_FAIL(32768),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_SIGNALS_TIMEOUT(65536),
    /* JADX INFO: Fake field, exist only in values array */
    PSN_TINK_FAIL(131072);

    public final int a;

    ga(int i) {
        this.a = i;
    }

    @Override // saneness.salutatory
    public final int getNumber() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        cyclery.attabal(ga.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.a);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}

package com.zg.adlib.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b2\b\u0086\u0081\u0002\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1¨\u00063"}, d2 = {"Lcom/zg/adlib/util/ApiCodeError;", "", "<init>", "(Ljava/lang/String;I)V", "ACCESS_DISALLOWED", "INTERNAL_ERROR", "NOT_FOUND", "FORBIDDEN", "UNKNOWN_ERROR", "NOT_AUTH", "INVALID_PARAMETER", "INVALID_METHOD", "INVALID_ORG_USER", "UNKNOWN_ORG", "INVALID_REQUEST_NO_AUTH", "SERVICE_PAUSED", "THIRD_INTERFACE_REQUEST_ERROR", "THIRD_INTERFACE_DATA_ERROR", "LOGGED_OUT_BY_ANOTHER_DEVICE", "CAPTCHA_FAILED", "FREQUENT_OPERATION", "SYSTEM_BUSY", "OUTDATED_API_VERSION", "USER_NAME_OR_PASSWORD_ERROR", "ACCOUNT_DISABLED", "OUT_OF_DEVICE", "INVALID_USERNAME_OR_EMAIL_FORMAT", "USERNAME_OR_EMAIL_ALREADY_EXISTS", "INVALID_PASSWORD_FORMAT", "USER_ALREADY_REGISTERED", "USER_UNREGISTERED_UNBOUND_EMAIL", "OLD_PASSWORD_ERROR", "REPEATED_PASSWORDS_NOT_MATCH", "EMAIL_VERIFIED", "UNKNOWN_EMAIL", "INVALID_OR_EXPIRED_QR_CODE", "TOKEN_INVALID_OR_EXPIRED", "QR_CODE_CONFIRMATION_FAILED", "CONNECTION_SESSION_TERMINATED", "LINE_REMOVED", "MEMBERSHIP_EXPIRED", "LINE_REACHED_MAXIMUM_NUMBER_OF_PEOPLE", "LINE_FORWARDING_FAILED", "LINE_INTERACTION_SECRET_EXPIRED_OR_ILLEGAL_PUB_KEY", "PRODUCT_NOT_EXIST", "THIRD_PARTY_ORDER_ALREADY_EXISTS", "THIRD_PARTY_ORDER_ILLEGAL", "USER_NOT_EXIST", "VERIFICATION_CODE_OR_TOKEN_INVALID_OR_EXPIRED", "BIND_EMAIL_OR_PHONE_NUMBER", "Companion", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum ApiCodeError {
    ACCESS_DISALLOWED,
    INTERNAL_ERROR,
    NOT_FOUND,
    FORBIDDEN,
    UNKNOWN_ERROR,
    NOT_AUTH,
    INVALID_PARAMETER,
    INVALID_METHOD,
    INVALID_ORG_USER,
    UNKNOWN_ORG,
    INVALID_REQUEST_NO_AUTH,
    SERVICE_PAUSED,
    THIRD_INTERFACE_REQUEST_ERROR,
    THIRD_INTERFACE_DATA_ERROR,
    LOGGED_OUT_BY_ANOTHER_DEVICE,
    CAPTCHA_FAILED,
    FREQUENT_OPERATION,
    SYSTEM_BUSY,
    OUTDATED_API_VERSION,
    USER_NAME_OR_PASSWORD_ERROR,
    ACCOUNT_DISABLED,
    OUT_OF_DEVICE,
    INVALID_USERNAME_OR_EMAIL_FORMAT,
    USERNAME_OR_EMAIL_ALREADY_EXISTS,
    INVALID_PASSWORD_FORMAT,
    USER_ALREADY_REGISTERED,
    USER_UNREGISTERED_UNBOUND_EMAIL,
    OLD_PASSWORD_ERROR,
    REPEATED_PASSWORDS_NOT_MATCH,
    EMAIL_VERIFIED,
    UNKNOWN_EMAIL,
    INVALID_OR_EXPIRED_QR_CODE,
    TOKEN_INVALID_OR_EXPIRED,
    QR_CODE_CONFIRMATION_FAILED,
    CONNECTION_SESSION_TERMINATED,
    LINE_REMOVED,
    MEMBERSHIP_EXPIRED,
    LINE_REACHED_MAXIMUM_NUMBER_OF_PEOPLE,
    LINE_FORWARDING_FAILED,
    LINE_INTERACTION_SECRET_EXPIRED_OR_ILLEGAL_PUB_KEY,
    PRODUCT_NOT_EXIST,
    THIRD_PARTY_ORDER_ALREADY_EXISTS,
    THIRD_PARTY_ORDER_ILLEGAL,
    USER_NOT_EXIST,
    VERIFICATION_CODE_OR_TOKEN_INVALID_OR_EXPIRED,
    BIND_EMAIL_OR_PHONE_NUMBER;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/zg/adlib/util/ApiCodeError$Companion;", "", "<init>", "()V", "toError", "Lcom/zg/adlib/util/ApiCodeError;", "code", "", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ApiCodeError toError(int code) {
            if (code == -4) {
                return ApiCodeError.FORBIDDEN;
            }
            if (code == -3) {
                return ApiCodeError.NOT_FOUND;
            }
            if (code == -2) {
                return ApiCodeError.INTERNAL_ERROR;
            }
            if (code == -1) {
                return ApiCodeError.ACCESS_DISALLOWED;
            }
            if (code == 40017) {
                return ApiCodeError.QR_CODE_CONFIRMATION_FAILED;
            }
            switch (code) {
                case 20000:
                    return ApiCodeError.UNKNOWN_ERROR;
                case AD_SERVER_ERROR_VALUE:
                    return ApiCodeError.NOT_AUTH;
                case 20002:
                    return ApiCodeError.INVALID_PARAMETER;
                case 20003:
                    return ApiCodeError.INVALID_METHOD;
                case 20004:
                    return ApiCodeError.INVALID_ORG_USER;
                case 20005:
                    return ApiCodeError.UNKNOWN_ORG;
                case 20006:
                    return ApiCodeError.INVALID_REQUEST_NO_AUTH;
                case 20007:
                    return ApiCodeError.SERVICE_PAUSED;
                case 20008:
                    return ApiCodeError.THIRD_INTERFACE_REQUEST_ERROR;
                case 20009:
                    return ApiCodeError.THIRD_INTERFACE_DATA_ERROR;
                case 20010:
                    return ApiCodeError.LOGGED_OUT_BY_ANOTHER_DEVICE;
                case 20011:
                    return ApiCodeError.CAPTCHA_FAILED;
                case 20012:
                    return ApiCodeError.FREQUENT_OPERATION;
                case 20013:
                    return ApiCodeError.SYSTEM_BUSY;
                case 20014:
                    return ApiCodeError.OUTDATED_API_VERSION;
                default:
                    switch (code) {
                        case 40001:
                            return ApiCodeError.USER_NAME_OR_PASSWORD_ERROR;
                        case 40002:
                            return ApiCodeError.ACCOUNT_DISABLED;
                        case 40003:
                            return ApiCodeError.OUT_OF_DEVICE;
                        case 40004:
                            return ApiCodeError.INVALID_USERNAME_OR_EMAIL_FORMAT;
                        case 40005:
                            return ApiCodeError.USERNAME_OR_EMAIL_ALREADY_EXISTS;
                        case 40006:
                            return ApiCodeError.INVALID_PASSWORD_FORMAT;
                        case 40007:
                            return ApiCodeError.USER_ALREADY_REGISTERED;
                        case 40008:
                            return ApiCodeError.USER_UNREGISTERED_UNBOUND_EMAIL;
                        case 40009:
                            return ApiCodeError.OLD_PASSWORD_ERROR;
                        case 40010:
                            return ApiCodeError.REPEATED_PASSWORDS_NOT_MATCH;
                        case 40011:
                            return ApiCodeError.EMAIL_VERIFIED;
                        case 40012:
                            return ApiCodeError.UNKNOWN_EMAIL;
                        default:
                            switch (code) {
                                case 40014:
                                    return ApiCodeError.INVALID_OR_EXPIRED_QR_CODE;
                                case 40015:
                                    return ApiCodeError.TOKEN_INVALID_OR_EXPIRED;
                                default:
                                    switch (code) {
                                        case 40019:
                                            return ApiCodeError.CONNECTION_SESSION_TERMINATED;
                                        case 40020:
                                            return ApiCodeError.LINE_REMOVED;
                                        case 40021:
                                            return ApiCodeError.MEMBERSHIP_EXPIRED;
                                        case 40022:
                                            return ApiCodeError.LINE_REACHED_MAXIMUM_NUMBER_OF_PEOPLE;
                                        case 40023:
                                            return ApiCodeError.LINE_FORWARDING_FAILED;
                                        case 40024:
                                            return ApiCodeError.LINE_INTERACTION_SECRET_EXPIRED_OR_ILLEGAL_PUB_KEY;
                                        default:
                                            switch (code) {
                                                case 40030:
                                                    return ApiCodeError.PRODUCT_NOT_EXIST;
                                                case 40031:
                                                    return ApiCodeError.THIRD_PARTY_ORDER_ALREADY_EXISTS;
                                                case 40032:
                                                    return ApiCodeError.THIRD_PARTY_ORDER_ILLEGAL;
                                                default:
                                                    switch (code) {
                                                        case 40050:
                                                            return ApiCodeError.USER_NOT_EXIST;
                                                        case 40051:
                                                            return ApiCodeError.VERIFICATION_CODE_OR_TOKEN_INVALID_OR_EXPIRED;
                                                        case 40052:
                                                            return ApiCodeError.BIND_EMAIL_OR_PHONE_NUMBER;
                                                        default:
                                                            return ApiCodeError.UNKNOWN_ERROR;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }

        private Companion() {
        }
    }

    public static EnumEntries<ApiCodeError> getEntries() {
        return $ENTRIES;
    }
}

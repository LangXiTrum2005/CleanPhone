package com.zg.adlib.resource;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.zg.adlib.R;
import com.zg.adlib.model.ApiError;
import com.zg.adlib.util.ApiCodeError;
import com.zg.adlib.util.Error;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 3*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00013B\u007f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010/J\u008f\u0001\u00100\u001a\b\u0012\u0004\u0012\u0002H10\u0000\"\u0004\b\u0001\u001012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u0001H12\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u00102R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b,\u0010\u0018¨\u00064"}, d2 = {"Lcom/zg/adlib/resource/Resource;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "success", "", "data", "code", "", "headers", "Lokhttp3/Headers;", "error", "Lcom/zg/adlib/util/Error;", "apiError", "Lcom/zg/adlib/model/ApiError;", "errorsMsg", "", "", "status", "errorMsg", "apiCodeError", "Lcom/zg/adlib/util/ApiCodeError;", "<init>", "(ZLjava/lang/Object;Ljava/lang/Integer;Lokhttp3/Headers;Lcom/zg/adlib/util/Error;Lcom/zg/adlib/model/ApiError;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zg/adlib/util/ApiCodeError;)V", "getSuccess", "()Z", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeaders", "()Lokhttp3/Headers;", "getError", "()Lcom/zg/adlib/util/Error;", "getApiError", "()Lcom/zg/adlib/model/ApiError;", "getErrorsMsg", "()Ljava/util/List;", "getStatus", "()Ljava/lang/String;", "getErrorMsg", "getApiCodeError", "()Lcom/zg/adlib/util/ApiCodeError;", "isInvalidToken", "getErrorMessage", "context", "Landroid/content/Context;", "copy", "R", "(ZLjava/lang/Object;Ljava/lang/Integer;Lokhttp3/Headers;Lcom/zg/adlib/util/Error;Lcom/zg/adlib/model/ApiError;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zg/adlib/util/ApiCodeError;)Lcom/zg/adlib/resource/Resource;", "Companion", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Resource<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Headers defaultHeaders = new Headers.Builder().build();
    private final ApiCodeError apiCodeError;
    private final ApiError apiError;
    private final Integer code;
    private final T data;
    private final Error error;
    private final String errorMsg;
    private final List<String> errorsMsg;
    private final Headers headers;
    private final String status;
    private final boolean success;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\b2\b\u0010\t\u001a\u0004\u0018\u0001H\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\b2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/zg/adlib/resource/Resource$Companion;", "", "<init>", "()V", "defaultHeaders", "Lokhttp3/Headers;", "success", "Lcom/zg/adlib/resource/Resource;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "data", "code", "", "headers", "(Ljava/lang/Object;Ljava/lang/Integer;Lokhttp3/Headers;)Lcom/zg/adlib/resource/Resource;", "error", "httpError", "Lcom/zg/adlib/util/Error;", "apiError", "Lcom/zg/adlib/model/ApiError;", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Resource success$default(Companion companion, Object obj, Integer num, Headers headers, int i2, Object obj2) {
            if ((i2 & 2) != 0) {
                num = null;
            }
            if ((i2 & 4) != 0) {
                headers = Resource.defaultHeaders;
            }
            return companion.success(obj, num, headers);
        }

        public final <T> Resource<T> error(Error httpError) {
            Intrinsics.f(httpError, "httpError");
            return new Resource<>(false, null, null, null, httpError, null, null, null, null, null, 1006, null);
        }

        public final <T> Resource<T> success(T data, Integer code, Headers headers) {
            Intrinsics.f(headers, "headers");
            return new Resource<>(true, data, code, headers, null, null, null, null, null, null, 1008, null);
        }

        private Companion() {
        }

        public final <T> Resource<T> error(ApiError apiError) {
            Intrinsics.f(apiError, "apiError");
            return new Resource<>(false, null, null, null, Error.REMOTE_MESSAGE, apiError, null, null, null, null, 974, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Error.values().length];
            try {
                iArr[Error.REMOTE_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Error.LOCAL_UNKNOWN_HOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Error.LOCAL_TIME_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Error.LOCAL_NET_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Error.LOCAL_PARSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Error.LOCAL_UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Error.REMOTE_TOKEN_INVALID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Error.LOCAL_DEFAULT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private Resource(boolean z2, T t, Integer num, Headers headers, Error error, ApiError apiError, List<String> list, String str, String str2, ApiCodeError apiCodeError) {
        this.success = z2;
        this.data = t;
        this.code = num;
        this.headers = headers;
        this.error = error;
        this.apiError = apiError;
        this.errorsMsg = list;
        this.status = str;
        this.errorMsg = str2;
        this.apiCodeError = apiCodeError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Resource copy$default(Resource resource, boolean z2, Object obj, Integer num, Headers headers, Error error, ApiError apiError, List list, String str, String str2, ApiCodeError apiCodeError, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            z2 = resource.success;
        }
        if ((i2 & 2) != 0) {
            obj = null;
        }
        if ((i2 & 4) != 0) {
            num = resource.code;
        }
        if ((i2 & 8) != 0) {
            headers = resource.headers;
        }
        if ((i2 & 16) != 0) {
            error = resource.error;
        }
        if ((i2 & 32) != 0) {
            apiError = resource.apiError;
        }
        if ((i2 & 64) != 0) {
            list = resource.errorsMsg;
        }
        if ((i2 & 128) != 0) {
            str = resource.status;
        }
        if ((i2 & 256) != 0) {
            str2 = resource.errorMsg;
        }
        if ((i2 & 512) != 0) {
            apiCodeError = resource.apiCodeError;
        }
        String str3 = str2;
        ApiCodeError apiCodeError2 = apiCodeError;
        List list2 = list;
        String str4 = str;
        Error error2 = error;
        ApiError apiError2 = apiError;
        return resource.copy(z2, obj, num, headers, error2, apiError2, list2, str4, str3, apiCodeError2);
    }

    public final <R> Resource<R> copy(boolean success, R data, Integer code, Headers headers, Error error, ApiError apiError, List<String> errorsMsg, String status, String errorMsg, ApiCodeError apiCodeError) {
        Intrinsics.f(headers, "headers");
        Intrinsics.f(error, "error");
        return new Resource<>(success, data, code, headers, error, apiError, errorsMsg, status, errorMsg, apiCodeError);
    }

    public final ApiCodeError getApiCodeError() {
        return this.apiCodeError;
    }

    public final ApiError getApiError() {
        return this.apiError;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public final Error getError() {
        return this.error;
    }

    public final String getErrorMessage(Context context) {
        int i2;
        if (context == null) {
            return "";
        }
        String str = this.errorMsg;
        if (str != null) {
            if (this.apiCodeError != ApiCodeError.UNKNOWN_ERROR) {
                return str;
            }
            String string = context.getString(R.string.error_unknown_server_error);
            Intrinsics.c(string);
            return string;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[this.error.ordinal()]) {
            case 1:
                ApiError apiError = this.apiError;
                return String.valueOf(apiError != null ? apiError.getError() : null);
            case 2:
                i2 = R.string.error_http_unknown_host;
                break;
            case 3:
                i2 = R.string.error_http_time_out;
                break;
            case 4:
                i2 = R.string.error_http_net_state_error;
                break;
            case 5:
                i2 = R.string.error_http_parse_error;
                break;
            case 6:
                i2 = R.string.error_http_unknown_error;
                break;
            case 7:
                i2 = R.string.error_http_invalid_token;
                break;
            case 8:
                i2 = R.string.error_http_unknown_error;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string2 = context.getString(i2);
        Intrinsics.e(string2, "getString(...)");
        return string2;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final List<String> getErrorsMsg() {
        return this.errorsMsg;
    }

    public final Headers getHeaders() {
        return this.headers;
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final boolean isInvalidToken() {
        return this.error == Error.REMOTE_TOKEN_INVALID;
    }

    public /* synthetic */ Resource(boolean z2, Object obj, Integer num, Headers headers, Error error, ApiError apiError, List list, String str, String str2, ApiCodeError apiCodeError, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, (i2 & 2) != 0 ? null : obj, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? defaultHeaders : headers, (i2 & 16) != 0 ? Error.LOCAL_DEFAULT : error, (i2 & 32) != 0 ? null : apiError, (i2 & 64) != 0 ? null : list, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? null : str2, (i2 & 512) != 0 ? null : apiCodeError);
    }
}

package nsa;

import com.yolo.networklibrary.common.model.HttpResult;
import java.util.Map;
import observability.kowloon;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: FcmApi.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lnsa/saneness;", "", "", "", "params", "Lkotlinx/coroutines/flow/dern;", "Lcom/yolo/networklibrary/common/model/HttpResult;", "attabal", "(Ljava/util/Map;)Lkotlinx/coroutines/flow/dern;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface saneness {
    @kowloon("/api/v1/fcm/register_token")
    kotlinx.coroutines.flow.dern<HttpResult<Object>> attabal(@observability.attabal Map<String, Object> params);
}

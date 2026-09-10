package nsa;

import ammonoid.VipStatusResponse;
import com.yolo.networklibrary.common.model.HttpResult;
import java.util.Map;
import observability.kowloon;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SubscriptionApi.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lnsa/dern;", "", "", "", "params", "Lkotlinx/coroutines/flow/dern;", "Lcom/yolo/networklibrary/common/model/HttpResult;", "Lammonoid/attabal;", "attabal", "(Ljava/util/Map;)Lkotlinx/coroutines/flow/dern;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface dern {
    @kowloon("/api/v1/vip/status")
    kotlinx.coroutines.flow.dern<HttpResult<VipStatusResponse>> attabal(@observability.attabal Map<String, Object> params);
}

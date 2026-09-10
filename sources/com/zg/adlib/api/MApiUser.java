package com.zg.adlib.api;

import com.zg.adlib.model.ApiBaseResponse;
import com.zg.adlib.model.MLogRequestM;
import io.reactivex.Observable;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/zg/adlib/api/MApiUser;", "", "uploadMLog", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Lcom/zg/adlib/model/ApiBaseResponse;", "request", "Lcom/zg/adlib/model/MLogRequestM;", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MApiUser {
    @POST("api/2/log")
    Observable<Response<ApiBaseResponse>> uploadMLog(@Body MLogRequestM request);
}

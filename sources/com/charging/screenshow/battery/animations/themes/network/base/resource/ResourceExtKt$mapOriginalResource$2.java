package com.charging.screenshow.battery.animations.themes.network.base.resource;

import io.reactivex.functions.Function;
import kotlin.Metadata;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001¨\u0006\u0004"}, d2 = {"com/charging/screenshow/battery/animations/themes/network/base/resource/ResourceExtKt$mapOriginalResource$2", "Lio/reactivex/functions/Function;", "Lretrofit2/Response;", "Lcom/charging/screenshow/battery/animations/themes/network/base/resource/Resource;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResourceExtKt$mapOriginalResource$2 implements Function<Response<Object>, Resource<Object>> {
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        throw null;
     */
    @Override // io.reactivex.functions.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.charging.screenshow.battery.animations.themes.network.base.resource.Resource<java.lang.Object> apply(retrofit2.Response<java.lang.Object> r3) throws java.io.IOException {
        /*
            r2 = this;
            retrofit2.Response r3 = (retrofit2.Response) r3
            java.lang.String r0 = "t"
            kotlin.jvm.internal.Intrinsics.f(r3, r0)
            boolean r0 = r3.isSuccessful()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r3.body()
            okhttp3.Headers r3 = r3.headers()
            okhttp3.Headers r1 = com.charging.screenshow.battery.animations.themes.network.base.resource.Resource.f13284i
            kotlin.jvm.internal.Intrinsics.c(r3)
            com.charging.screenshow.battery.animations.themes.network.base.resource.Resource r3 = com.charging.screenshow.battery.animations.themes.network.base.resource.Resource.Companion.a(r0, r3)
            return r3
        L1f:
            okhttp3.ResponseBody r3 = r3.errorBody()
            if (r3 == 0) goto L28
            r3.string()
        L28:
            r3 = 0
            throw r3     // Catch: java.lang.Exception -> L2a
        L2a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.charging.screenshow.battery.animations.themes.network.base.resource.ResourceExtKt$mapOriginalResource$2.apply(java.lang.Object):java.lang.Object");
    }
}

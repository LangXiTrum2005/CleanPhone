package com.efs.sdk.base.core.util.a;

import androidx.annotation.Nullable;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements com.efs.sdk.base.core.util.concurrent.c<HttpResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f422a;
    Map<String, String> b;
    public byte[] c;
    public File d;
    public String e;
    public Map<String, String> f;
    public boolean g = false;

    @Override // com.efs.sdk.base.core.util.concurrent.c
    @Nullable
    public final /* synthetic */ HttpResponse a() {
        String str = this.e;
        str.getClass();
        if (str.equals("get")) {
            return HttpEnv.getInstance().getHttpUtil().get(this.f422a, this.b);
        }
        if (str.equals("post")) {
            byte[] bArr = this.c;
            if (bArr == null || bArr.length <= 0) {
                return HttpEnv.getInstance().getHttpUtil().post(this.f422a, this.b, this.d);
            }
            return this.g ? HttpEnv.getInstance().getHttpUtil().postAsFile(this.f422a, this.b, this.c) : HttpEnv.getInstance().getHttpUtil().post(this.f422a, this.b, this.c);
        }
        Log.e("efs.util.http", "request not support method '" + this.e + "'");
        return null;
    }
}

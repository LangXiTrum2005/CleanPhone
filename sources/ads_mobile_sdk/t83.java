package ads_mobile_sdk;

import http.kowloon;
import http.polloi;
import kotlinx.coroutines.impassible;
import p002kotlin.Result;

/* JADX INFO: loaded from: classes.dex */
public final class t83 implements kowloon.dern {
    public final /* synthetic */ impassible a;

    public t83(kotlinx.coroutines.kowloon kowloonVar) {
        this.a = kowloonVar;
    }

    @Override // http.kowloon.dern
    public final void onSuccess(polloi polloiVar) {
        impassible impassibleVar = this.a;
        Result.Companion companion = Result.INSTANCE;
        impassibleVar.resumeWith(Result.m3351constructorimpl(new tn0(polloiVar)));
    }
}

package com.codejoy.boom.clap.network;

import com.vungle.ads.internal.ui.AdActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.preprohormone;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FlowInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/codejoy/boom/clap/network/attabal;", "Lcom/codejoy/boom/clap/network/saneness;", "<init>", "()V", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "Lkotlin/Result;", "", "result", "", "attabal", "(Lokhttp3/preprohormone;Ljava/lang/Object;)V", "", "saneness", "Ljava/util/List;", "INTERCEPTOR_LIST", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class attabal implements saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f18570attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final List<saneness> INTERCEPTOR_LIST = new ArrayList();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f18571dern = 8;

    @Override // com.codejoy.boom.clap.network.saneness
    public void attabal(preprohormone request, Object result) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator<saneness> it = INTERCEPTOR_LIST.iterator();
            while (it.hasNext()) {
                it.next().attabal(request, result);
            }
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }
}

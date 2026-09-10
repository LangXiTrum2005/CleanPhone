package com.codejoy.boom.clap.network;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Type;
import kotlinx.coroutines.flow.marial;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import retrofit2.rotuma;

/* JADX INFO: compiled from: ResponseCallAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00030\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/codejoy/boom/clap/network/ResponseCallAdapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lretrofit2/dern;", "Lkotlinx/coroutines/flow/dern;", "Lretrofit2/rotuma;", "Ljava/lang/reflect/Type;", "responseType", "<init>", "(Ljava/lang/reflect/Type;)V", "attabal", "()Ljava/lang/reflect/Type;", "Lretrofit2/saneness;", NotificationCompat.CATEGORY_CALL, "dern", "(Lretrofit2/saneness;)Lkotlinx/coroutines/flow/dern;", "Ljava/lang/reflect/Type;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResponseCallAdapter<T> implements retrofit2.dern<T, kotlinx.coroutines.flow.dern<? extends rotuma<T>>> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Type responseType;

    public ResponseCallAdapter(Type responseType) {
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        this.responseType = responseType;
    }

    @Override // retrofit2.dern
    /* JADX INFO: renamed from: attabal, reason: from getter */
    public Type getResponseType() {
        return this.responseType;
    }

    @Override // retrofit2.dern
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.flow.dern<rotuma<T>> saneness(retrofit2.saneness<T> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return marial.adultoid(new ResponseCallAdapter$adapt$1(call, null));
    }
}

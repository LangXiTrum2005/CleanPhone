package com.codejoy.boom.clap.network;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Type;
import kotlinx.coroutines.flow.marial;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ResponseCallAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/codejoy/boom/clap/network/BodyCallAdapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lretrofit2/dern;", "Lkotlinx/coroutines/flow/dern;", "Ljava/lang/reflect/Type;", "responseType", "<init>", "(Ljava/lang/reflect/Type;)V", "Lretrofit2/saneness;", NotificationCompat.CATEGORY_CALL, "dern", "(Lretrofit2/saneness;)Lkotlinx/coroutines/flow/dern;", "attabal", "()Ljava/lang/reflect/Type;", "Ljava/lang/reflect/Type;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BodyCallAdapter<T> implements retrofit2.dern<T, kotlinx.coroutines.flow.dern<? extends T>> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Type responseType;

    public BodyCallAdapter(Type responseType) {
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
    public kotlinx.coroutines.flow.dern<T> saneness(retrofit2.saneness<T> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return marial.adultoid(new BodyCallAdapter$adapt$1(call, null));
    }
}

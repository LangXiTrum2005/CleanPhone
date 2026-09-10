package kotlinx.coroutines.flow.internal;

import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;

/* JADX INFO: compiled from: SendingCollector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/internal/monoploid;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/wireman;", "Lkotlinx/coroutines/channels/polloi;", AppsFlyerProperties.CHANNEL, "<init>", "(Lkotlinx/coroutines/channels/polloi;)V", "value", "", "emit", "(Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "kowloon", "Lkotlinx/coroutines/channels/polloi;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class monoploid<T> implements kotlinx.coroutines.flow.wireman<T> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.channels.polloi<T> channel;

    /* JADX WARN: Multi-variable type inference failed */
    public monoploid(kotlinx.coroutines.channels.polloi<? super T> polloiVar) {
        this.channel = polloiVar;
    }

    @Override // kotlinx.coroutines.flow.wireman
    public Object emit(T t, wretchedly.dern<? super Unit> dernVar) {
        Object objWireman = this.channel.wireman(t, dernVar);
        return objWireman == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objWireman : Unit.f29295attabal;
    }
}

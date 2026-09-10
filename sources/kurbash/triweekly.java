package kurbash;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u000eJ\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\t\u0010\u0007R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lkurbash/triweekly;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Lkurbash/formularize;", "Lkotlin/Function1;", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "getDelegate", "Lkurbash/triweekly$attabal;", "getGetter", "()Lkurbash/triweekly$attabal;", "getter", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface triweekly<T, V> extends formularize<V>, Function1<T, V> {

    /* JADX INFO: compiled from: KProperty.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\u0005"}, d2 = {"Lkurbash/triweekly$attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Lkurbash/formularize$saneness;", "Lkotlin/Function1;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface attabal<T, V> extends formularize.saneness<V>, Function1<T, V> {
    }

    V get(T receiver);

    Object getDelegate(T receiver);

    @Override // kurbash.formularize
    attabal<T, V> getGetter();
}

package kurbash;

import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u000fJ!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H'¢\u0006\u0004\b\t\u0010\nR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lkurbash/kowloon;", "D", "E", "V", "Lkurbash/formularize;", "Lkotlin/Function2;", "receiver1", "receiver2", "", "getDelegate", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkurbash/kowloon$attabal;", "getGetter", "()Lkurbash/kowloon$attabal;", "getter", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface kowloon<D, E, V> extends formularize<V>, Function2<D, E, V> {

    /* JADX INFO: compiled from: KProperty.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005¨\u0006\u0006"}, d2 = {"Lkurbash/kowloon$attabal;", "D", "E", "V", "Lkurbash/formularize$saneness;", "Lkotlin/Function2;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface attabal<D, E, V> extends formularize.saneness<V>, Function2<D, E, V> {
    }

    Object getDelegate(D receiver1, E receiver2);

    @Override // kurbash.formularize
    attabal<D, E, V> getGetter();
}

package p002kotlin.reflect.jvm.internal;

import kurbash.kowloon;
import kurbash.taiyuan;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.full.IllegalCallableAccessException;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.saneness;
import tetrahedral.triweekly;

/* JADX INFO: compiled from: KProperty2Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lkotlin/reflect/jvm/internal/cutely;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "receiver1", "receiver2", "value", "", "grimness", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lpatroclinal/taiyuan;", "Lkotlin/reflect/jvm/internal/cutely$attabal;", "oilcan", "Lpatroclinal/taiyuan;", "_setter", "seminary", "()Lkotlin/reflect/jvm/internal/cutely$attabal;", "setter", "attabal", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class cutely<D, E, V> extends KProperty2Impl<D, E, V> implements kowloon, taiyuan {

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan<attabal<D, E, V>> _setter;

    /* JADX INFO: compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u00042\u0006\u0010\f\u001a\u00028\u0005H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/cutely$attabal;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "", "Lkotlin/reflect/jvm/internal/cutely;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/cutely;)V", "receiver1", "receiver2", "value", "", "kattegat", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "rotuma", "Lkotlin/reflect/jvm/internal/cutely;", "sealless", "()Lkotlin/reflect/jvm/internal/cutely;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class attabal<D, E, V> extends KPropertyImpl.Setter<V> implements taiyuan.attabal, triweekly {

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
        public final cutely<D, E, V> property;

        public attabal(cutely<D, E, V> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.property = property;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tetrahedral.triweekly
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
            kattegat(obj, obj2, obj3);
            return Unit.f29295attabal;
        }

        public void kattegat(D receiver1, E receiver2, V value) throws IllegalCallableAccessException {
            oilcan().grimness(receiver1, receiver2, value);
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.attabal
        /* JADX INFO: renamed from: sealless, reason: merged with bridge method [inline-methods] */
        public cutely<D, E, V> oilcan() {
            return this.property;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cutely(KDeclarationContainerImpl container, saran descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this._setter = saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<attabal<Object, Object, Object>>(this) { // from class: kotlin.reflect.jvm.internal.KMutableProperty2Impl$_setter$1
            final /* synthetic */ cutely<Object, Object, Object> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final cutely.attabal<Object, Object, Object> invoke() {
                return new cutely.attabal<>(this.this$0);
            }
        });
    }

    public void grimness(D receiver1, E receiver2, V value) throws IllegalCallableAccessException {
        getSetter().call(receiver1, receiver2, value);
    }

    @Override // kurbash.taiyuan
    /* JADX INFO: renamed from: seminary, reason: merged with bridge method [inline-methods] */
    public attabal<D, E, V> getSetter() {
        return this._setter.getValue();
    }
}

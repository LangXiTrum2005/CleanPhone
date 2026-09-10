package p002kotlin.reflect.jvm.internal;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Member;
import kurbash.kowloon;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.CallableReference;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: KProperty2Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\"B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000fJ\u001f\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J \u0010\u0016\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0013R,\u0010\u001b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR&\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl;", "D", "E", "V", "Lkurbash/kowloon;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", InAppPurchaseMetaData.KEY_SIGNATURE, "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;)V", "receiver1", "receiver2", "merc", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "getDelegate", "invoke", "Lpatroclinal/taiyuan;", "Lkotlin/reflect/jvm/internal/KProperty2Impl$attabal;", "stratoscope", "Lpatroclinal/taiyuan;", "_getter", "Ljava/lang/reflect/Member;", "trm", "delegateSource", "polder", "()Lkotlin/reflect/jvm/internal/KProperty2Impl$attabal;", "getter", "attabal", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class KProperty2Impl<D, E, V> extends KPropertyImpl<V> implements kowloon<D, E, V> {

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final taiyuan<attabal<D, E, V>> _getter;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public final taiyuan<Member> delegateSource;

    /* JADX INFO: compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00028\u00052\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl$attabal;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkurbash/kowloon$attabal;", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty2Impl;)V", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "rotuma", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "sealless", "()Lkotlin/reflect/jvm/internal/KProperty2Impl;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class attabal<D, E, V> extends KPropertyImpl.Getter<V> implements kowloon.attabal<D, E, V> {

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
        public final KProperty2Impl<D, E, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(KProperty2Impl<D, E, ? extends V> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.property = property;
        }

        @Override // p002kotlin.jvm.functions.Function2
        public V invoke(D receiver1, E receiver2) {
            return oilcan().merc(receiver1, receiver2);
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.attabal
        /* JADX INFO: renamed from: sealless, reason: merged with bridge method [inline-methods] */
        public KProperty2Impl<D, E, V> oilcan() {
            return this.property;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(KDeclarationContainerImpl container, String name, String signature) {
        super(container, name, signature, CallableReference.NO_RECEIVER);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this._getter = saneness.attabal(lazyThreadSafetyMode, new Function0<attabal<D, E, ? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$_getter$1
            final /* synthetic */ KProperty2Impl<D, E, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final KProperty2Impl.attabal<D, E, V> invoke() {
                return new KProperty2Impl.attabal<>(this.this$0);
            }
        });
        this.delegateSource = saneness.attabal(lazyThreadSafetyMode, new Function0<Member>(this) { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$delegateSource$1
            final /* synthetic */ KProperty2Impl<D, E, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Member invoke() {
                return this.this$0.trm();
            }
        });
    }

    @Override // kurbash.kowloon
    public Object getDelegate(D receiver1, E receiver2) {
        return yemenite(this.delegateSource.getValue(), receiver1, receiver2);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public V invoke(D receiver1, E receiver2) {
        return merc(receiver1, receiver2);
    }

    public V merc(D receiver1, E receiver2) {
        return kattegat().call(receiver1, receiver2);
    }

    @Override // p002kotlin.reflect.jvm.internal.KPropertyImpl
    /* JADX INFO: renamed from: polder, reason: merged with bridge method [inline-methods] */
    public attabal<D, E, V> kattegat() {
        return this._getter.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(KDeclarationContainerImpl container, saran descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this._getter = saneness.attabal(lazyThreadSafetyMode, new Function0<attabal<D, E, ? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$_getter$1
            final /* synthetic */ KProperty2Impl<D, E, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final KProperty2Impl.attabal<D, E, V> invoke() {
                return new KProperty2Impl.attabal<>(this.this$0);
            }
        });
        this.delegateSource = saneness.attabal(lazyThreadSafetyMode, new Function0<Member>(this) { // from class: kotlin.reflect.jvm.internal.KProperty2Impl$delegateSource$1
            final /* synthetic */ KProperty2Impl<D, E, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Member invoke() {
                return this.this$0.trm();
            }
        });
    }
}

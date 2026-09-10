package p002kotlin.reflect.jvm.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kurbash.apical;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.full.IllegalCallableAccessException;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: KProperty1Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "Lkurbash/apical;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", InAppPurchaseMetaData.KEY_SIGNATURE, "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "value", "", "seminary", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lpatroclinal/taiyuan;", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$attabal;", "oilcan", "Lpatroclinal/taiyuan;", "_setter", "polder", "()Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$attabal;", "setter", "attabal", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KMutableProperty1Impl<T, V> extends KProperty1Impl<T, V> implements apical<T, V> {

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public final taiyuan<attabal<T, V>> _setter;

    /* JADX INFO: compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010\n\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkurbash/apical$attabal;", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;)V", "receiver", "value", "", "kattegat", "(Ljava/lang/Object;Ljava/lang/Object;)V", "rotuma", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "sealless", "()Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class attabal<T, V> extends KPropertyImpl.Setter<V> implements apical.attabal<T, V> {

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
        public final KMutableProperty1Impl<T, V> property;

        public attabal(KMutableProperty1Impl<T, V> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.property = property;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) throws IllegalCallableAccessException {
            kattegat(obj, obj2);
            return Unit.f29295attabal;
        }

        public void kattegat(T receiver, V value) throws IllegalCallableAccessException {
            oilcan().seminary(receiver, value);
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.attabal
        /* JADX INFO: renamed from: sealless, reason: merged with bridge method [inline-methods] */
        public KMutableProperty1Impl<T, V> oilcan() {
            return this.property;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this._setter = saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<attabal<T, V>>(this) { // from class: kotlin.reflect.jvm.internal.KMutableProperty1Impl$_setter$1
            final /* synthetic */ KMutableProperty1Impl<T, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final KMutableProperty1Impl.attabal<T, V> invoke() {
                return new KMutableProperty1Impl.attabal<>(this.this$0);
            }
        });
    }

    @Override // kurbash.taiyuan
    /* JADX INFO: renamed from: polder, reason: merged with bridge method [inline-methods] */
    public attabal<T, V> getSetter() {
        return this._setter.getValue();
    }

    public void seminary(T receiver, V value) throws IllegalCallableAccessException {
        getSetter().call(receiver, value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl container, saran descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this._setter = saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<attabal<T, V>>(this) { // from class: kotlin.reflect.jvm.internal.KMutableProperty1Impl$_setter$1
            final /* synthetic */ KMutableProperty1Impl<T, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final KMutableProperty1Impl.attabal<T, V> invoke() {
                return new KMutableProperty1Impl.attabal<>(this.this$0);
            }
        });
    }
}

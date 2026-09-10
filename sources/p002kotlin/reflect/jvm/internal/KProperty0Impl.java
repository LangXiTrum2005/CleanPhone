package p002kotlin.reflect.jvm.internal;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kurbash.impassible;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: KProperty0Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0011R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl;", "V", "Lkurbash/impassible;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", InAppPurchaseMetaData.KEY_SIGNATURE, "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "merc", "()Ljava/lang/Object;", "getDelegate", "invoke", "Lpatroclinal/taiyuan;", "Lkotlin/reflect/jvm/internal/KProperty0Impl$attabal;", "stratoscope", "Lpatroclinal/taiyuan;", "_getter", "trm", "delegateValue", "polder", "()Lkotlin/reflect/jvm/internal/KProperty0Impl$attabal;", "getter", "attabal", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class KProperty0Impl<V> extends KPropertyImpl<V> implements impassible<V> {

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final taiyuan<attabal<V>> _getter;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public final taiyuan<Object> delegateValue;

    /* JADX INFO: compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl$attabal;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkurbash/impassible$attabal;", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty0Impl;)V", "invoke", "()Ljava/lang/Object;", "rotuma", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "sealless", "()Lkotlin/reflect/jvm/internal/KProperty0Impl;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class attabal<R> extends KPropertyImpl.Getter<R> implements impassible.attabal<R> {

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
        public final KProperty0Impl<R> property;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(KProperty0Impl<? extends R> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.property = property;
        }

        @Override // p002kotlin.jvm.functions.Function0
        public R invoke() {
            return competently().merc();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.attabal
        /* JADX INFO: renamed from: sealless, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public KProperty0Impl<R> oilcan() {
            return this.property;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl container, saran descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this._getter = saneness.attabal(lazyThreadSafetyMode, new Function0<attabal<? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$_getter$1
            final /* synthetic */ KProperty0Impl<V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final KProperty0Impl.attabal<V> invoke() {
                return new KProperty0Impl.attabal<>(this.this$0);
            }
        });
        this.delegateValue = saneness.attabal(lazyThreadSafetyMode, new Function0<Object>(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$delegateValue$1
            final /* synthetic */ KProperty0Impl<V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                KPropertyImpl kPropertyImpl = this.this$0;
                return kPropertyImpl.yemenite(kPropertyImpl.trm(), null, null);
            }
        });
    }

    @Override // kurbash.impassible
    public Object getDelegate() {
        return this.delegateValue.getValue();
    }

    @Override // p002kotlin.jvm.functions.Function0
    public V invoke() {
        return merc();
    }

    public V merc() {
        return getGetter().call(new Object[0]);
    }

    @Override // p002kotlin.reflect.jvm.internal.KPropertyImpl
    /* JADX INFO: renamed from: polder, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public attabal<V> kattegat() {
        return this._getter.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this._getter = saneness.attabal(lazyThreadSafetyMode, new Function0<attabal<? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$_getter$1
            final /* synthetic */ KProperty0Impl<V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final KProperty0Impl.attabal<V> invoke() {
                return new KProperty0Impl.attabal<>(this.this$0);
            }
        });
        this.delegateValue = saneness.attabal(lazyThreadSafetyMode, new Function0<Object>(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$delegateValue$1
            final /* synthetic */ KProperty0Impl<V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                KPropertyImpl kPropertyImpl = this.this$0;
                return kPropertyImpl.yemenite(kPropertyImpl.trm(), null, null);
            }
        });
    }
}

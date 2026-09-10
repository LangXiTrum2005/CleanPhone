package p002kotlin.reflect.jvm.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Member;
import kurbash.triweekly;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: KProperty1Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001!B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0013R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Lkurbash/triweekly;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", InAppPurchaseMetaData.KEY_SIGNATURE, "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getDelegate", "invoke", "Lpatroclinal/taiyuan;", "Lkotlin/reflect/jvm/internal/KProperty1Impl$attabal;", "stratoscope", "Lpatroclinal/taiyuan;", "_getter", "Ljava/lang/reflect/Member;", "trm", "delegateSource", "merc", "()Lkotlin/reflect/jvm/internal/KProperty1Impl$attabal;", "getter", "attabal", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class KProperty1Impl<T, V> extends KPropertyImpl<V> implements triweekly<T, V> {

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final taiyuan<attabal<T, V>> _getter;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public final taiyuan<Member> delegateSource;

    /* JADX INFO: compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl$attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkurbash/triweekly$attabal;", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty1Impl;)V", "receiver", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "rotuma", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "sealless", "()Lkotlin/reflect/jvm/internal/KProperty1Impl;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class attabal<T, V> extends KPropertyImpl.Getter<V> implements triweekly.attabal<T, V> {

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
        public final KProperty1Impl<T, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(KProperty1Impl<T, ? extends V> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.property = property;
        }

        @Override // p002kotlin.jvm.functions.Function1
        public V invoke(T receiver) {
            return oilcan().get(receiver);
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.attabal
        /* JADX INFO: renamed from: sealless, reason: merged with bridge method [inline-methods] */
        public KProperty1Impl<T, V> oilcan() {
            return this.property;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this._getter = saneness.attabal(lazyThreadSafetyMode, new Function0<attabal<T, ? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$_getter$1
            final /* synthetic */ KProperty1Impl<T, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final KProperty1Impl.attabal<T, V> invoke() {
                return new KProperty1Impl.attabal<>(this.this$0);
            }
        });
        this.delegateSource = saneness.attabal(lazyThreadSafetyMode, new Function0<Member>(this) { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$delegateSource$1
            final /* synthetic */ KProperty1Impl<T, V> this$0;

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

    @Override // kurbash.triweekly
    public V get(T receiver) {
        return kattegat().call(receiver);
    }

    @Override // kurbash.triweekly
    public Object getDelegate(T receiver) {
        return yemenite(this.delegateSource.getValue(), receiver, null);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public V invoke(T receiver) {
        return get(receiver);
    }

    @Override // p002kotlin.reflect.jvm.internal.KPropertyImpl
    /* JADX INFO: renamed from: merc, reason: merged with bridge method [inline-methods] */
    public attabal<T, V> kattegat() {
        return this._getter.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl container, saran descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this._getter = saneness.attabal(lazyThreadSafetyMode, new Function0<attabal<T, ? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$_getter$1
            final /* synthetic */ KProperty1Impl<T, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final KProperty1Impl.attabal<T, V> invoke() {
                return new KProperty1Impl.attabal<>(this.this$0);
            }
        });
        this.delegateSource = saneness.attabal(lazyThreadSafetyMode, new Function0<Member>(this) { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$delegateSource$1
            final /* synthetic */ KProperty1Impl<T, V> this$0;

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

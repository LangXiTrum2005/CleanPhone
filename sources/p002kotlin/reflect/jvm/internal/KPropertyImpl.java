package p002kotlin.reflect.jvm.internal;

import com.ironsource.C3414a2;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kurbash.formularize;
import kurbash.impromptu;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.CallableReference;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import p002kotlin.reflect.jvm.internal.calls.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.creditor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.grimness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.privatdozent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.load.java.beachfront;
import p002kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p002kotlin.reflect.jvm.internal.impl.resolve.wireman;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: KPropertyImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u0000 L*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004MNOPB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0010B+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010#R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010#R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010,R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00106\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00060\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0013\u0010>\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0018\u0010E\u001a\u0006\u0012\u0002\b\u00030C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010DR\u001a\u0010F\u001a\b\u0012\u0002\b\u0003\u0018\u00010C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010DR\u0014\u0010G\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010:R\u0014\u0010H\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010:R\u0014\u0010I\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006Q"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", "V", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkurbash/formularize;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", InAppPurchaseMetaData.KEY_SIGNATURE, "descriptorInitialValue", "", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/reflect/Member;", "trm", "()Ljava/lang/reflect/Member;", "fieldOrMethod", "receiver1", "receiver2", "yemenite", "(Ljava/lang/reflect/Member;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "adultoid", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "gintrap", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Ljava/lang/String;", "getName", "dovishness", "restrictive", "Ljava/lang/Object;", "Lpatroclinal/taiyuan;", "Ljava/lang/reflect/Field;", "rotuma", "Lpatroclinal/taiyuan;", "_javaField", "Lkotlin/reflect/jvm/internal/triweekly$attabal;", "kotlin.jvm.PlatformType", "preprohormone", "Lkotlin/reflect/jvm/internal/triweekly$attabal;", "_descriptor", "oilcan", "()Ljava/lang/Object;", "stratoscope", "()Z", "isBound", "supplicat", "()Ljava/lang/reflect/Field;", "javaField", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "kattegat", "()Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getter", "Lkotlin/reflect/jvm/internal/calls/dern;", "()Lkotlin/reflect/jvm/internal/calls/dern;", "caller", "defaultCaller", "isLateinit", "isConst", "isSuspend", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "cord", "attabal", "saneness", "Getter", "Setter", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class KPropertyImpl<V> extends KCallableImpl<V> implements formularize<V> {

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public static final Object f29525cuirassed = new Object();

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public final KDeclarationContainerImpl container;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public final String signature;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public final Object rawBoundReceiver;
    private final String name;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public final triweekly.attabal<saran> _descriptor;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final taiyuan<Field> _javaField;

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\b¨\u0006\u001e"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$attabal;", "Lkurbash/formularize$saneness;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/reflect/jvm/internal/impl/descriptors/privatdozent;", "adultoid", "Lkotlin/reflect/jvm/internal/triweekly$attabal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/calls/dern;", "dovishness", "Lpatroclinal/taiyuan;", "()Lkotlin/reflect/jvm/internal/calls/dern;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Getter<V> extends attabal<V, V> implements formularize.saneness<V> {

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public static final /* synthetic */ formularize<Object>[] f29531gintrap = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(Getter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal descriptor = triweekly.dern(new Function0<privatdozent>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Getter$descriptor$2
            final /* synthetic */ KPropertyImpl.Getter<V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final privatdozent invoke() {
                privatdozent getter = this.this$0.oilcan().trm().getGetter();
                return getter == null ? wireman.wireman(this.this$0.oilcan().trm(), marial.f29950impromptu.saneness()) : getter;
            }
        });

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
        public final taiyuan caller = saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<dern<?>>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Getter$caller$2
            final /* synthetic */ KPropertyImpl.Getter<V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final dern<?> invoke() {
                return apical.saneness(this.this$0, true);
            }
        });

        @Override // p002kotlin.reflect.jvm.internal.KCallableImpl
        public dern<?> dovishness() {
            return (dern) this.caller.getValue();
        }

        public boolean equals(Object other) {
            return (other instanceof Getter) && Intrinsics.wireman(oilcan(), ((Getter) other).oilcan());
        }

        @Override // kurbash.dern
        public String getName() {
            return "<get-" + oilcan().getName() + '>';
        }

        public int hashCode() {
            return oilcan().hashCode();
        }

        public String toString() {
            return "getter of " + oilcan();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.attabal
        /* JADX INFO: renamed from: yemenite, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public privatdozent trm() {
            T tSaneness = this.descriptor.saneness(this, f29531gintrap[0]);
            Intrinsics.checkNotNullExpressionValue(tSaneness, "getValue(...)");
            return (privatdozent) tSaneness;
        }
    }

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\t¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$attabal;", "", "Lkurbash/taiyuan$attabal;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/reflect/jvm/internal/impl/descriptors/creditor;", "adultoid", "Lkotlin/reflect/jvm/internal/triweekly$attabal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/calls/dern;", "dovishness", "Lpatroclinal/taiyuan;", "()Lkotlin/reflect/jvm/internal/calls/dern;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Setter<V> extends attabal<V, Unit> implements kurbash.taiyuan.attabal<V> {

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public static final /* synthetic */ formularize<Object>[] f29534gintrap = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(Setter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
        public final triweekly.attabal descriptor = triweekly.dern(new Function0<creditor>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Setter$descriptor$2
            final /* synthetic */ KPropertyImpl.Setter<V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final creditor invoke() {
                creditor setter = this.this$0.oilcan().trm().getSetter();
                if (setter != null) {
                    return setter;
                }
                saran saranVarTrm = this.this$0.oilcan().trm();
                marial.attabal attabalVar = marial.f29950impromptu;
                return wireman.marial(saranVarTrm, attabalVar.saneness(), attabalVar.saneness());
            }
        });

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
        public final taiyuan caller = saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<dern<?>>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Setter$caller$2
            final /* synthetic */ KPropertyImpl.Setter<V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final dern<?> invoke() {
                return apical.saneness(this.this$0, false);
            }
        });

        @Override // p002kotlin.reflect.jvm.internal.KCallableImpl
        public dern<?> dovishness() {
            return (dern) this.caller.getValue();
        }

        public boolean equals(Object other) {
            return (other instanceof Setter) && Intrinsics.wireman(oilcan(), ((Setter) other).oilcan());
        }

        @Override // kurbash.dern
        public String getName() {
            return "<set-" + oilcan().getName() + '>';
        }

        public int hashCode() {
            return oilcan().hashCode();
        }

        public String toString() {
            return "setter of " + oilcan();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.attabal
        /* JADX INFO: renamed from: yemenite, reason: merged with bridge method [inline-methods] */
        public creditor trm() {
            T tSaneness = this.descriptor.saneness(this, f29534gintrap[0]);
            Intrinsics.checkNotNullExpressionValue(tSaneness, "getValue(...)");
            return (creditor) tSaneness;
        }
    }

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$attabal;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkurbash/formularize$attabal;", "Lkurbash/impromptu;", "<init>", "()V", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "oilcan", "()Lkotlin/reflect/jvm/internal/KPropertyImpl;", "property", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "gintrap", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/calls/dern;", "rotuma", "()Lkotlin/reflect/jvm/internal/calls/dern;", "defaultCaller", "", "stratoscope", "()Z", "isBound", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "Lkotlin/reflect/jvm/internal/impl/descriptors/grimness;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class attabal<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements impromptu<ReturnType>, formularize.attabal<PropertyType> {
        @Override // p002kotlin.reflect.jvm.internal.KCallableImpl
        /* JADX INFO: renamed from: gintrap */
        public KDeclarationContainerImpl getContainer() {
            return oilcan().getContainer();
        }

        @Override // kurbash.impromptu
        public boolean isExternal() {
            return trm().isExternal();
        }

        @Override // kurbash.impromptu
        public boolean isInfix() {
            return trm().isInfix();
        }

        @Override // kurbash.impromptu
        public boolean isInline() {
            return trm().isInline();
        }

        @Override // kurbash.impromptu
        public boolean isOperator() {
            return trm().isOperator();
        }

        @Override // kurbash.dern
        public boolean isSuspend() {
            return trm().isSuspend();
        }

        public abstract KPropertyImpl<PropertyType> oilcan();

        @Override // p002kotlin.reflect.jvm.internal.KCallableImpl
        public dern<?> rotuma() {
            return null;
        }

        @Override // p002kotlin.reflect.jvm.internal.KCallableImpl
        public boolean stratoscope() {
            return oilcan().stratoscope();
        }

        public abstract grimness trm();
    }

    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, saran saranVar, Object obj) {
        this.container = kDeclarationContainerImpl;
        this.name = str;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this._javaField = saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<Field>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$_javaField$1
            final /* synthetic */ KPropertyImpl<V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Field invoke() {
                Class<?> enclosingClass;
                competently competentlyVarBeachfront = arytenoidectomy.f29551attabal.beachfront(this.this$0.trm());
                if (!(competentlyVarBeachfront instanceof competently.dern)) {
                    if (competentlyVarBeachfront instanceof competently.attabal) {
                        return ((competently.attabal) competentlyVarBeachfront).getField();
                    }
                    if ((competentlyVarBeachfront instanceof competently.saneness) || (competentlyVarBeachfront instanceof competently.wireman)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                competently.dern dernVar = (competently.dern) competentlyVarBeachfront;
                saran descriptor = dernVar.getDescriptor();
                foreshot.wireman.attabal attabalVarWireman = foreshot.taiyuan.wireman(foreshot.taiyuan.f26288attabal, dernVar.getProto(), dernVar.getNameResolver(), dernVar.getTypeTable(), false, 8, null);
                if (attabalVarWireman == null) {
                    return null;
                }
                KCallableImpl kCallableImpl = this.this$0;
                if (beachfront.marial(descriptor) || foreshot.taiyuan.beachfront(dernVar.getProto())) {
                    enclosingClass = kCallableImpl.getContainer().competently().getEnclosingClass();
                } else {
                    apical apicalVarSaneness = descriptor.saneness();
                    enclosingClass = apicalVarSaneness instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman ? molybdenite.monoploid((p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) apicalVarSaneness) : kCallableImpl.getContainer().competently();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(attabalVarWireman.dern());
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            }
        });
        triweekly.attabal<saran> attabalVarSaneness = triweekly.saneness(saranVar, new Function0<saran>(this) { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$_descriptor$1
            final /* synthetic */ KPropertyImpl<V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final saran invoke() {
                return this.this$0.getContainer().graveside(this.this$0.getName(), this.this$0.getSignature());
            }
        });
        Intrinsics.checkNotNullExpressionValue(attabalVarSaneness, "lazySoft(...)");
        this._descriptor = attabalVarSaneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.KCallableImpl
    public dern<?> dovishness() {
        return kattegat().dovishness();
    }

    public boolean equals(Object other) {
        KPropertyImpl<?> kPropertyImplWireman = molybdenite.wireman(other);
        return kPropertyImplWireman != null && Intrinsics.wireman(getContainer(), kPropertyImplWireman.getContainer()) && Intrinsics.wireman(getName(), kPropertyImplWireman.getName()) && Intrinsics.wireman(this.signature, kPropertyImplWireman.signature) && Intrinsics.wireman(this.rawBoundReceiver, kPropertyImplWireman.rawBoundReceiver);
    }

    @Override // kurbash.dern
    public String getName() {
        return this.name;
    }

    @Override // p002kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: gintrap, reason: from getter */
    public KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    @Override // kurbash.formularize
    public boolean isConst() {
        return trm().isConst();
    }

    @Override // kurbash.formularize
    public boolean isLateinit() {
        return trm().picketboat();
    }

    @Override // kurbash.dern
    public boolean isSuspend() {
        return false;
    }

    public abstract Getter<V> kattegat();

    public final Object oilcan() {
        return p002kotlin.reflect.jvm.internal.calls.impromptu.competently(this.rawBoundReceiver, trm());
    }

    /* JADX INFO: renamed from: restrictive, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    @Override // p002kotlin.reflect.jvm.internal.KCallableImpl
    public dern<?> rotuma() {
        return kattegat().rotuma();
    }

    @Override // p002kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: sealless, reason: merged with bridge method [inline-methods] */
    public saran trm() {
        saran saranVarInvoke = this._descriptor.invoke();
        Intrinsics.checkNotNullExpressionValue(saranVarInvoke, "invoke(...)");
        return saranVarInvoke;
    }

    @Override // p002kotlin.reflect.jvm.internal.KCallableImpl
    public boolean stratoscope() {
        return !Intrinsics.wireman(this.rawBoundReceiver, CallableReference.NO_RECEIVER);
    }

    public final Field supplicat() {
        return this._javaField.getValue();
    }

    public String toString() {
        return ReflectionObjectRenderer.f29548attabal.competently(trm());
    }

    public final Member trm() {
        if (!trm().rotuma()) {
            return null;
        }
        competently competentlyVarBeachfront = arytenoidectomy.f29551attabal.beachfront(trm());
        if (competentlyVarBeachfront instanceof competently.dern) {
            competently.dern dernVar = (competently.dern) competentlyVarBeachfront;
            if (dernVar.getSignature().hasDelegateMethod()) {
                JvmProtoBuf.JvmMethodSignature delegateMethod = dernVar.getSignature().getDelegateMethod();
                if (!delegateMethod.hasName() || !delegateMethod.hasDesc()) {
                    return null;
                }
                return getContainer().molybdenite(dernVar.getNameResolver().getString(delegateMethod.getName()), dernVar.getNameResolver().getString(delegateMethod.getDesc()));
            }
        }
        return supplicat();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object yemenite(Member fieldOrMethod, Object receiver1, Object receiver2) throws IllegalPropertyDelegateAccessException {
        try {
            Object obj = f29525cuirassed;
            if ((receiver1 == obj || receiver2 == obj) && trm().polder() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objOilcan = stratoscope() ? oilcan() : receiver1;
            if (objOilcan == obj) {
                objOilcan = null;
            }
            if (!stratoscope()) {
                receiver1 = receiver2;
            }
            if (receiver1 == obj) {
                receiver1 = null;
            }
            AccessibleObject accessibleObject = fieldOrMethod instanceof AccessibleObject ? (AccessibleObject) fieldOrMethod : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(emmesh.attabal.attabal(this));
            }
            if (fieldOrMethod == 0) {
                return null;
            }
            if (fieldOrMethod instanceof Field) {
                return ((Field) fieldOrMethod).get(objOilcan);
            }
            if (!(fieldOrMethod instanceof Method)) {
                throw new AssertionError("delegate field/method " + fieldOrMethod + " neither field nor method");
            }
            int length = ((Method) fieldOrMethod).getParameterTypes().length;
            if (length == 0) {
                return ((Method) fieldOrMethod).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) fieldOrMethod;
                if (objOilcan == null) {
                    Class<?> cls = ((Method) fieldOrMethod).getParameterTypes()[0];
                    Intrinsics.checkNotNullExpressionValue(cls, "get(...)");
                    objOilcan = molybdenite.competently(cls);
                }
                return method.invoke(null, objOilcan);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + fieldOrMethod + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) fieldOrMethod;
            if (receiver1 == null) {
                Class<?> cls2 = ((Method) fieldOrMethod).getParameterTypes()[1];
                Intrinsics.checkNotNullExpressionValue(cls2, "get(...)");
                receiver1 = molybdenite.competently(cls2);
            }
            return method2.invoke(null, objOilcan, receiver1);
        } catch (IllegalAccessException e) {
            throw new IllegalPropertyDelegateAccessException(e);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KPropertyImpl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KPropertyImpl(KDeclarationContainerImpl container, saran descriptor) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String strDern = descriptor.getName().dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        this(container, strDern, arytenoidectomy.f29551attabal.beachfront(descriptor).getString(), descriptor, CallableReference.NO_RECEIVER);
    }
}

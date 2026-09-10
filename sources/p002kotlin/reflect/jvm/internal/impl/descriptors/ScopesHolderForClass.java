package p002kotlin.reflect.jvm.internal.impl.descriptors;

import kurbash.formularize;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import yeast.apical;
import yeast.impromptu;

/* JADX INFO: compiled from: ScopesHolderForClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ScopesHolderForClass<T extends MemberScope> {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f29907beachfront = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(ScopesHolderForClass.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final attabal f29908marial = new attabal(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final wireman f29909attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final beachfront f29910dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Function1<beachfront, T> f29911saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final impromptu f29912wireman;

    /* JADX INFO: compiled from: ScopesHolderForClass.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends MemberScope> ScopesHolderForClass<T> attabal(wireman classDescriptor, yeast.formularize storageManager, beachfront kotlinTypeRefinerForOwnerModule, Function1<? super beachfront, ? extends T> scopeFactory) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            Intrinsics.checkNotNullParameter(scopeFactory, "scopeFactory");
            return new ScopesHolderForClass<>(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }

        public attabal() {
        }
    }

    public /* synthetic */ ScopesHolderForClass(wireman wiremanVar, yeast.formularize formularizeVar, Function1 function1, beachfront beachfrontVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(wiremanVar, formularizeVar, function1, beachfrontVar);
    }

    public final T dern(final beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!kotlinTypeRefiner.wireman(DescriptorUtilsKt.arytenoidectomy(this.f29909attabal))) {
            return (T) wireman();
        }
        permissivist permissivistVarImpromptu = this.f29909attabal.impromptu();
        Intrinsics.checkNotNullExpressionValue(permissivistVarImpromptu, "getTypeConstructor(...)");
        return !kotlinTypeRefiner.marial(permissivistVarImpromptu) ? (T) wireman() : (T) kotlinTypeRefiner.dern(this.f29909attabal, new Function0<T>(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$getScope$1
            final /* synthetic */ ScopesHolderForClass<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // p002kotlin.jvm.functions.Function0
            public final MemberScope invoke() {
                return (MemberScope) this.this$0.f29911saneness.invoke(kotlinTypeRefiner);
            }
        });
    }

    public final T wireman() {
        return (T) apical.attabal(this.f29912wireman, this, f29907beachfront[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScopesHolderForClass(wireman wiremanVar, yeast.formularize formularizeVar, Function1<? super beachfront, ? extends T> function1, beachfront beachfrontVar) {
        this.f29909attabal = wiremanVar;
        this.f29911saneness = function1;
        this.f29910dern = beachfrontVar;
        this.f29912wireman = formularizeVar.dern(new Function0<T>(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$scopeForOwnerModule$2
            final /* synthetic */ ScopesHolderForClass<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // p002kotlin.jvm.functions.Function0
            public final MemberScope invoke() {
                return (MemberScope) this.this$0.f29911saneness.invoke(this.this$0.f29910dern);
            }
        });
    }
}

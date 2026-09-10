package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PolymorphismValidator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2 \u0010\u000f\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u0018\u001a\u00020\u0010\"\b\b\u0000\u0010\u0013*\u00020\b\"\b\b\u0001\u0010\u0014*\u00028\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010\u001c\u001a\u00020\u0010\"\b\b\u0000\u0010\u0013*\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a0\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0012JE\u0010\u001f\u001a\u00020\u0010\"\b\b\u0000\u0010\u0013*\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u001c\u0010\u001e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d0\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0012J#\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010&¨\u0006'"}, d2 = {"Lkotlinx/serialization/json/internal/saran;", "Lcerebral/beachfront;", "", "useArrayPolymorphism", "", "discriminator", "<init>", "(ZLjava/lang/String;)V", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkurbash/wireman;", "kClass", "Lkotlin/Function1;", "", "Lasosan/wireman;", IronSourceConstants.EVENTS_PROVIDER, "", "wireman", "(Lkurbash/wireman;Lkotlin/jvm/functions/Function1;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "dern", "(Lkurbash/wireman;Lkurbash/wireman;Lasosan/wireman;)V", "Lasosan/impassible;", "defaultSerializerProvider", "saneness", "Lasosan/dern;", "defaultDeserializerProvider", "attabal", "Lbristol/beachfront;", "descriptor", "competently", "(Lbristol/beachfront;Lkurbash/wireman;)V", "beachfront", "Z", "Ljava/lang/String;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class saran implements cerebral.beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final boolean useArrayPolymorphism;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final String discriminator;

    public saran(boolean z, String discriminator) {
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        this.useArrayPolymorphism = z;
        this.discriminator = discriminator;
    }

    @Override // cerebral.beachfront
    public <Base> void attabal(kurbash.wireman<Base> baseClass, Function1<? super String, ? extends asosan.dern<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    public final void beachfront(bristol.beachfront descriptor, kurbash.wireman<?> actualClass) {
        int elementsCount = descriptor.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            String strMarial = descriptor.marial(i);
            if (Intrinsics.wireman(strMarial, this.discriminator)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + actualClass + " has property '" + strMarial + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    public final void competently(bristol.beachfront descriptor, kurbash.wireman<?> actualClass) {
        bristol.impassible kind = descriptor.getKind();
        if ((kind instanceof bristol.wireman) || Intrinsics.wireman(kind, bristol.impassible.attabal.f15155attabal)) {
            throw new IllegalArgumentException("Serializer for " + actualClass.taiyuan() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.useArrayPolymorphism) {
            return;
        }
        if (Intrinsics.wireman(kind, bristol.triweekly.saneness.f15181attabal) || Intrinsics.wireman(kind, bristol.triweekly.dern.f15180attabal) || (kind instanceof bristol.marial) || (kind instanceof bristol.impassible.saneness)) {
            throw new IllegalArgumentException("Serializer for " + actualClass.taiyuan() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    @Override // cerebral.beachfront
    public <Base, Sub extends Base> void dern(kurbash.wireman<Base> baseClass, kurbash.wireman<Sub> actualClass, asosan.wireman<Sub> actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        bristol.beachfront descriptor = actualSerializer.getDescriptor();
        competently(descriptor, actualClass);
        if (this.useArrayPolymorphism) {
            return;
        }
        beachfront(descriptor, actualClass);
    }

    @Override // cerebral.beachfront
    public <T> void marial(kurbash.wireman<T> wiremanVar, asosan.wireman<T> wiremanVar2) {
        cerebral.beachfront.attabal.saneness(this, wiremanVar, wiremanVar2);
    }

    @Override // cerebral.beachfront
    public <Base> void saneness(kurbash.wireman<Base> baseClass, Function1<? super Base, ? extends asosan.impassible<? super Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // cerebral.beachfront
    public <T> void wireman(kurbash.wireman<T> kClass, Function1<? super List<? extends asosan.wireman<?>>, ? extends asosan.wireman<?>> provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}

package asosan;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.annotation.Annotation;
import java.util.List;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lasosan/impromptu;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lvinyl/saneness;", "Lkurbash/wireman;", "baseClass", "<init>", "(Lkurbash/wireman;)V", "", "toString", "()Ljava/lang/String;", "attabal", "Lkurbash/wireman;", "marial", "()Lkurbash/wireman;", "", "", "saneness", "Ljava/util/List;", "_annotations", "Lbristol/beachfront;", "dern", "Lpatroclinal/taiyuan;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class impromptu<T> extends vinyl.saneness<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final kurbash.wireman<T> baseClass;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan descriptor;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public List<? extends Annotation> _annotations;

    public impromptu(kurbash.wireman<T> baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.baseClass = baseClass;
        this._annotations = p002kotlin.collections.adultoid.formularize();
        this.descriptor = p002kotlin.saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: asosan.beachfront
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return impromptu.impromptu(this.f14483kowloon);
            }
        });
    }

    public static final bristol.beachfront impromptu(final impromptu impromptuVar) {
        return bristol.saneness.dern(bristol.formularize.wireman("kotlinx.serialization.Polymorphic", bristol.wireman.attabal.f15183attabal, new bristol.beachfront[0], new Function1() { // from class: asosan.competently
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return impromptu.taiyuan(this.f14484kowloon, (bristol.attabal) obj);
            }
        }), impromptuVar.marial());
    }

    public static final Unit taiyuan(impromptu impromptuVar, bristol.attabal buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        bristol.attabal.saneness(buildSerialDescriptor, "type", defendable.attabal.oilcan(p002kotlin.jvm.internal.gintrap.f29390attabal).getDescriptor(), null, false, 12, null);
        bristol.attabal.saneness(buildSerialDescriptor, "value", bristol.formularize.marial("kotlinx.serialization.Polymorphic<" + impromptuVar.marial().taiyuan() + '>', bristol.impassible.attabal.f15155attabal, new bristol.beachfront[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.impromptu(impromptuVar._annotations);
        return Unit.f29295attabal;
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return (bristol.beachfront) this.descriptor.getValue();
    }

    @Override // vinyl.saneness
    public kurbash.wireman<T> marial() {
        return this.baseClass;
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + marial() + ')';
    }
}

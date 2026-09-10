package cerebral;

import asosan.impassible;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SerializersModuleCollector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJI\u0010\r\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032 \u0010\f\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\nH&¢\u0006\u0004\b\r\u0010\u000eJM\u0010\u0014\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020\u0001\"\b\b\u0001\u0010\u0010*\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0018\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00160\nH&¢\u0006\u0004\b\u0018\u0010\u000eJE\u0010\u001c\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001c\u0010\u001b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a0\nH&¢\u0006\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcerebral/beachfront;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkurbash/wireman;", "kClass", "Lasosan/wireman;", "serializer", "", "marial", "(Lkurbash/wireman;Lasosan/wireman;)V", "Lkotlin/Function1;", "", IronSourceConstants.EVENTS_PROVIDER, "wireman", "(Lkurbash/wireman;Lkotlin/jvm/functions/Function1;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "dern", "(Lkurbash/wireman;Lkurbash/wireman;Lasosan/wireman;)V", "Lasosan/impassible;", "defaultSerializerProvider", "saneness", "", "Lasosan/dern;", "defaultDeserializerProvider", "attabal", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface beachfront {

    /* JADX INFO: compiled from: SerializersModuleCollector.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class attabal {
        public static asosan.wireman dern(asosan.wireman wiremanVar, List it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return wiremanVar;
        }

        public static <T> void saneness(beachfront beachfrontVar, kurbash.wireman<T> kClass, final asosan.wireman<T> serializer) {
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            beachfrontVar.wireman(kClass, new Function1() { // from class: cerebral.marial
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return beachfront.attabal.dern(serializer, (List) obj);
                }
            });
        }
    }

    <Base> void attabal(kurbash.wireman<Base> baseClass, Function1<? super String, ? extends asosan.dern<? extends Base>> defaultDeserializerProvider);

    <Base, Sub extends Base> void dern(kurbash.wireman<Base> baseClass, kurbash.wireman<Sub> actualClass, asosan.wireman<Sub> actualSerializer);

    <T> void marial(kurbash.wireman<T> kClass, asosan.wireman<T> serializer);

    <Base> void saneness(kurbash.wireman<Base> baseClass, Function1<? super Base, ? extends impassible<? super Base>> defaultSerializerProvider);

    <T> void wireman(kurbash.wireman<T> kClass, Function1<? super List<? extends asosan.wireman<?>>, ? extends asosan.wireman<?>> provider);
}

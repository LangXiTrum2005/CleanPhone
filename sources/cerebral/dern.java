package cerebral;

import asosan.impassible;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\b\u0002\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\b\b\u0000\u0010\u0004*\u00020\u00012\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00052\u0006\u0010\r\u001a\u00028\u0000H'¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013\"\b\b\u0000\u0010\u0004*\u00020\u00012\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8 X¡\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001d\u0082\u0001\u0001 ¨\u0006!"}, d2 = {"Lcerebral/dern;", "", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkurbash/wireman;", "kClass", "", "Lasosan/wireman;", "typeArgumentsSerializers", "saneness", "(Lkurbash/wireman;Ljava/util/List;)Lasosan/wireman;", "baseClass", "value", "Lasosan/impassible;", "beachfront", "(Lkurbash/wireman;Ljava/lang/Object;)Lasosan/impassible;", "", "serializedClassName", "Lasosan/dern;", "marial", "(Lkurbash/wireman;Ljava/lang/String;)Lasosan/dern;", "Lcerebral/beachfront;", "collector", "", "attabal", "(Lcerebral/beachfront;)V", "", "wireman", "()Z", "getHasInterfaceContextualSerializers$kotlinx_serialization_core$annotations", "hasInterfaceContextualSerializers", "Lcerebral/saneness;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class dern {
    public /* synthetic */ dern(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ asosan.wireman dern(dern dernVar, kurbash.wireman wiremanVar, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i & 2) != 0) {
            list = adultoid.formularize();
        }
        return dernVar.saneness(wiremanVar, list);
    }

    public abstract void attabal(beachfront collector);

    public abstract <T> impassible<T> beachfront(kurbash.wireman<? super T> baseClass, T value);

    public abstract <T> asosan.dern<T> marial(kurbash.wireman<? super T> baseClass, String serializedClassName);

    public abstract <T> asosan.wireman<T> saneness(kurbash.wireman<T> kClass, List<? extends asosan.wireman<?>> typeArgumentsSerializers);

    public abstract boolean wireman();

    public dern() {
    }
}

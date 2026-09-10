package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u000b*\u00020\n*\b\u0012\u0004\u0012\u00028\u00000\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"(\u0010\u0012\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"", "serialName", "Lbristol/marial;", "kind", "Lbristol/beachfront;", "attabal", "(Ljava/lang/String;Lbristol/marial;)Lbristol/beachfront;", "", "dern", "(Ljava/lang/String;)V", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkurbash/wireman;", "Lasosan/wireman;", "saneness", "(Lkurbash/wireman;)Lasosan/wireman;", "", "Ljava/util/Map;", "BUILTIN_SERIALIZERS", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class deadwork {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Map<kurbash.wireman<?>, asosan.wireman<?>> f39382attabal = unconsolidated.taiyuan();

    public static final bristol.beachfront attabal(String serialName, bristol.marial kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        dern(serialName);
        return new PrimitiveDescriptor(serialName, kind);
    }

    public static final void dern(String str) {
        for (asosan.wireman<?> wiremanVar : f39382attabal.values()) {
            if (Intrinsics.wireman(str, wiremanVar.getDescriptor().getSerialName())) {
                throw new IllegalArgumentException(p002kotlin.text.arytenoidectomy.cutely("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + p002kotlin.jvm.internal.polloi.saneness(wiremanVar.getClass()).taiyuan() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }

    public static final <T> asosan.wireman<T> saneness(kurbash.wireman<T> wiremanVar) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        return (asosan.wireman) f39382attabal.get(wiremanVar);
    }
}

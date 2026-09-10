package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SchemaCache.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012R<\u0010\u0016\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u0013j\b\u0012\u0004\u0012\u00020\u0001`\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkotlinx/serialization/json/internal/dovishness;", "", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lbristol/beachfront;", "descriptor", "Lkotlinx/serialization/json/internal/dovishness$attabal;", X3.i.W, "value", "", "dern", "(Lbristol/beachfront;Lkotlinx/serialization/json/internal/dovishness$attabal;Ljava/lang/Object;)V", "Lkotlin/Function0;", "defaultValue", "saneness", "(Lbristol/beachfront;Lkotlinx/serialization/json/internal/dovishness$attabal;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "attabal", "(Lbristol/beachfront;Lkotlinx/serialization/json/internal/dovishness$attabal;)Ljava/lang/Object;", "", "Lkotlinx/serialization/json/internal/DescriptorData;", "Ljava/util/Map;", "map", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Map<bristol.beachfront, Map<attabal<Object>, Object>> map = adultoid.attabal(16);

    /* JADX INFO: compiled from: SchemaCache.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/internal/dovishness$attabal;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal<T> {
    }

    public final <T> T attabal(bristol.beachfront descriptor, attabal<T> key) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map<attabal<Object>, Object> map = this.map.get(descriptor);
        T t = map != null ? (T) map.get(key) : null;
        if (t == null) {
            return null;
        }
        return t;
    }

    public final <T> void dern(bristol.beachfront descriptor, attabal<T> key, T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map<bristol.beachfront, Map<attabal<Object>, Object>> map = this.map;
        Map<attabal<Object>, Object> mapAttabal = map.get(descriptor);
        if (mapAttabal == null) {
            mapAttabal = adultoid.attabal(2);
            map.put(descriptor, mapAttabal);
        }
        mapAttabal.put(key, value);
    }

    public final <T> T saneness(bristol.beachfront descriptor, attabal<T> key, Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = (T) attabal(descriptor, key);
        if (t != null) {
            return t;
        }
        T tInvoke = defaultValue.invoke();
        dern(descriptor, key, tInvoke);
        return tInvoke;
    }
}

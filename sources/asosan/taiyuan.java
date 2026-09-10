package asosan;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lvinyl/saneness;", "Lfastidiously/dern;", "decoder", "", "klassName", "Lasosan/dern;", "attabal", "(Lvinyl/saneness;Lfastidiously/dern;Ljava/lang/String;)Lasosan/dern;", "Lfastidiously/beachfront;", "encoder", "value", "Lasosan/impassible;", "saneness", "(Lvinyl/saneness;Lfastidiously/beachfront;Ljava/lang/Object;)Lasosan/impassible;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class taiyuan {
    public static final <T> dern<T> attabal(vinyl.saneness<T> sanenessVar, fastidiously.dern decoder, String str) {
        Intrinsics.checkNotNullParameter(sanenessVar, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        dern<T> dernVarDern = sanenessVar.dern(decoder, str);
        if (dernVarDern != null) {
            return dernVarDern;
        }
        vinyl.dern.attabal(str, sanenessVar.marial());
        throw new KotlinNothingValueException();
    }

    public static final <T> impassible<T> saneness(vinyl.saneness<T> sanenessVar, fastidiously.beachfront encoder, T value) {
        Intrinsics.checkNotNullParameter(sanenessVar, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        impassible<T> impassibleVarWireman = sanenessVar.wireman(encoder, value);
        if (impassibleVarWireman != null) {
            return impassibleVarWireman;
        }
        vinyl.dern.saneness(p002kotlin.jvm.internal.polloi.saneness(value.getClass()), sanenessVar.marial());
        throw new KotlinNothingValueException();
    }
}

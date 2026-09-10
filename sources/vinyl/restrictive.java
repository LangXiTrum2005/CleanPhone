package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u001b\u0010!\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lvinyl/restrictive;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/wireman;", "", "serialName", "", "values", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "Lfastidiously/beachfront;", "encoder", "value", "", "marial", "(Lfastidiously/beachfront;Ljava/lang/Enum;)V", "Lfastidiously/marial;", "decoder", "wireman", "(Lfastidiously/marial;)Ljava/lang/Enum;", "toString", "()Ljava/lang/String;", "Lbristol/beachfront;", "saneness", "(Ljava/lang/String;)Lbristol/beachfront;", "attabal", "[Ljava/lang/Enum;", "Lbristol/beachfront;", "overriddenDescriptor", "dern", "Lpatroclinal/taiyuan;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class restrictive<T extends Enum<T>> implements asosan.wireman<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final T[] values;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan descriptor;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public bristol.beachfront overriddenDescriptor;

    public restrictive(final String serialName, T[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = values;
        this.descriptor = p002kotlin.saneness.saneness(new Function0() { // from class: vinyl.supplicat
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return restrictive.dern(this.f39497kowloon, serialName);
            }
        });
    }

    public static final bristol.beachfront dern(restrictive restrictiveVar, String str) {
        bristol.beachfront beachfrontVar = restrictiveVar.overriddenDescriptor;
        return beachfrontVar == null ? restrictiveVar.saneness(str) : beachfrontVar;
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return (bristol.beachfront) this.descriptor.getValue();
    }

    @Override // asosan.impassible
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public void serialize(fastidiously.beachfront encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int iPermissivist = p002kotlin.collections.polloi.permissivist(this.values, value);
        if (iPermissivist != -1) {
            encoder.impromptu(getDescriptor(), iPermissivist);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().getSerialName());
        sb.append(", must be one of ");
        String string = Arrays.toString(this.values);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb.append(string);
        throw new SerializationException(sb.toString());
    }

    public final bristol.beachfront saneness(String serialName) {
        kattegat kattegatVar = new kattegat(serialName, this.values.length);
        for (T t : this.values) {
            vesuvio.arytenoidectomy(kattegatVar, t.name(), false, 2, null);
        }
        return kattegatVar;
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + '>';
    }

    @Override // asosan.dern
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public T deserialize(fastidiously.marial decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int iTaiyuan = decoder.taiyuan(getDescriptor());
        if (iTaiyuan >= 0) {
            T[] tArr = this.values;
            if (iTaiyuan < tArr.length) {
                return tArr[iTaiyuan];
            }
        }
        throw new SerializationException(iTaiyuan + " is not among valid " + getDescriptor().getSerialName() + " enum values, values size is " + this.values.length);
    }
}

package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.SerializationException;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ObjectSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lvinyl/palmyra;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/wireman;", "", "serialName", "objectInstance", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Ljava/lang/Object;)V", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Ljava/lang/Object;", "attabal", "Ljava/lang/Object;", "", "", "saneness", "Ljava/util/List;", "_annotations", "Lbristol/beachfront;", "dern", "Lpatroclinal/taiyuan;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class palmyra<T> implements asosan.wireman<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final T objectInstance;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan descriptor;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public List<? extends Annotation> _annotations;

    public palmyra(final String serialName, T objectInstance) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.objectInstance = objectInstance;
        this._annotations = p002kotlin.collections.adultoid.formularize();
        this.descriptor = p002kotlin.saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: vinyl.gusty
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return palmyra.dern(serialName, this);
            }
        });
    }

    public static final bristol.beachfront dern(String str, final palmyra palmyraVar) {
        return bristol.formularize.wireman(str, bristol.triweekly.wireman.f15182attabal, new bristol.beachfront[0], new Function1() { // from class: vinyl.picketboat
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return palmyra.wireman(this.f39461kowloon, (bristol.attabal) obj);
            }
        });
    }

    public static final Unit wireman(palmyra palmyraVar, bristol.attabal buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.impromptu(palmyraVar._annotations);
        return Unit.f29295attabal;
    }

    @Override // asosan.dern
    public T deserialize(fastidiously.marial decoder) {
        int iImpassible;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        bristol.beachfront descriptor = getDescriptor();
        fastidiously.dern dernVarSaneness = decoder.saneness(descriptor);
        if (dernVarSaneness.triweekly() || (iImpassible = dernVarSaneness.impassible(getDescriptor())) == -1) {
            Unit unit = Unit.f29295attabal;
            dernVarSaneness.dern(descriptor);
            return this.objectInstance;
        }
        throw new SerializationException("Unexpected index " + iImpassible);
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return (bristol.beachfront) this.descriptor.getValue();
    }

    @Override // asosan.impassible
    public void serialize(fastidiously.beachfront encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.saneness(getDescriptor()).dern(getDescriptor());
    }
}

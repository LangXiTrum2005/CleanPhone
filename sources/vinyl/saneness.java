package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import kotlinx.serialization.SerializationException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: AbstractPolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lvinyl/saneness;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/wireman;", "<init>", "()V", "Lfastidiously/beachfront;", "encoder", "value", "", "serialize", "(Lfastidiously/beachfront;Ljava/lang/Object;)V", "Lfastidiously/marial;", "decoder", "deserialize", "(Lfastidiously/marial;)Ljava/lang/Object;", "Lfastidiously/dern;", "", "klassName", "Lasosan/dern;", "dern", "(Lfastidiously/dern;Ljava/lang/String;)Lasosan/dern;", "Lasosan/impassible;", "wireman", "(Lfastidiously/beachfront;Ljava/lang/Object;)Lasosan/impassible;", "compositeDecoder", "saneness", "(Lfastidiously/dern;)Ljava/lang/Object;", "Lkurbash/wireman;", "marial", "()Lkurbash/wireman;", "baseClass", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class saneness<T> implements asosan.wireman<T> {
    public asosan.dern<T> dern(fastidiously.dern decoder, String klassName) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.attabal().marial(marial(), klassName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // asosan.dern
    public final T deserialize(fastidiously.marial decoder) {
        T t;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        bristol.beachfront descriptor = getDescriptor();
        fastidiously.dern dernVarSaneness = decoder.saneness(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (dernVarSaneness.triweekly()) {
            t = (T) saneness(dernVarSaneness);
        } else {
            Object objDern = null;
            while (true) {
                int iImpassible = dernVarSaneness.impassible(getDescriptor());
                if (iImpassible == -1) {
                    if (objDern != null) {
                        Intrinsics.competently(objDern, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                        t = (T) objDern;
                        break;
                    }
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.element)).toString());
                }
                if (iImpassible == 0) {
                    ref$ObjectRef.element = (T) dernVarSaneness.formularize(getDescriptor(), iImpassible);
                } else {
                    if (iImpassible != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) ref$ObjectRef.element;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(iImpassible);
                        throw new SerializationException(sb.toString());
                    }
                    T t2 = ref$ObjectRef.element;
                    if (t2 == 0) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    ref$ObjectRef.element = t2;
                    objDern = fastidiously.dern.attabal.dern(dernVarSaneness, getDescriptor(), iImpassible, asosan.taiyuan.attabal(this, dernVarSaneness, (String) t2), null, 8, null);
                }
            }
        }
        dernVarSaneness.dern(descriptor);
        return t;
    }

    public abstract kurbash.wireman<T> marial();

    public final T saneness(fastidiously.dern compositeDecoder) {
        return (T) fastidiously.dern.attabal.dern(compositeDecoder, getDescriptor(), 1, asosan.taiyuan.attabal(this, compositeDecoder, compositeDecoder.formularize(getDescriptor(), 0)), null, 8, null);
    }

    @Override // asosan.impassible
    public final void serialize(fastidiously.beachfront encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        asosan.impassible<? super T> impassibleVarSaneness = asosan.taiyuan.saneness(this, encoder, value);
        bristol.beachfront descriptor = getDescriptor();
        fastidiously.wireman wiremanVarSaneness = encoder.saneness(descriptor);
        wiremanVarSaneness.stratoscope(getDescriptor(), 0, impassibleVarSaneness.getDescriptor().getSerialName());
        bristol.beachfront descriptor2 = getDescriptor();
        Intrinsics.competently(impassibleVarSaneness, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        wiremanVarSaneness.sealless(descriptor2, 1, impassibleVarSaneness, value);
        wiremanVarSaneness.dern(descriptor);
    }

    public asosan.impassible<T> wireman(fastidiously.beachfront encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return encoder.attabal().beachfront(marial(), value);
    }
}

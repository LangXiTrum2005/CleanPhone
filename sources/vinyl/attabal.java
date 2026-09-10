package vinyl;

import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007*\u00028\u0001H$¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n*\u00028\u0001H$¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00028\u0002H$¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0007*\u00028\u0002H$¢\u0006\u0004\b\u000f\u0010\tJ\u0013\u0010\u0010\u001a\u00028\u0001*\u00028\u0002H$¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00028\u0002*\u00028\u0001H$¢\u0006\u0004\b\u0012\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u0014*\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u0007H$¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010#\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00028\u00022\b\b\u0002\u0010\"\u001a\u00020!H$¢\u0006\u0004\b#\u0010$J/\u0010&\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00022\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H$¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u0002H\u0002¢\u0006\u0004\b(\u0010)\u0082\u0001\u0002*+¨\u0006,"}, d2 = {"Lvinyl/attabal;", "Element", "Collection", "Builder", "Lasosan/wireman;", "<init>", "()V", "", "marial", "(Ljava/lang/Object;)I", "", "wireman", "(Ljava/lang/Object;)Ljava/util/Iterator;", "attabal", "()Ljava/lang/Object;", "saneness", "formularize", "(Ljava/lang/Object;)Ljava/lang/Object;", "apical", "size", "", "dern", "(Ljava/lang/Object;I)V", "Lfastidiously/marial;", "decoder", "previous", "beachfront", "(Lfastidiously/marial;Ljava/lang/Object;)Ljava/lang/Object;", "deserialize", "(Lfastidiously/marial;)Ljava/lang/Object;", "Lfastidiously/dern;", "index", "builder", "", "checkIndex", "impromptu", "(Lfastidiously/dern;ILjava/lang/Object;Z)V", "startIndex", "competently", "(Lfastidiously/dern;Ljava/lang/Object;II)V", "cutely", "(Lfastidiously/dern;Ljava/lang/Object;)I", "Lvinyl/gintrap;", "Lvinyl/sayid;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class attabal<Element, Collection, Builder> implements asosan.wireman<Collection> {
    public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void taiyuan(attabal attabalVar, fastidiously.dern dernVar, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        attabalVar.impromptu(dernVar, i, obj, z);
    }

    public abstract Builder apical(Collection collection2);

    public abstract Builder attabal();

    public final Collection beachfront(fastidiously.marial decoder, Collection previous) {
        Builder builderAttabal;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (previous == null || (builderAttabal = apical(previous)) == null) {
            builderAttabal = attabal();
        }
        Builder builder = builderAttabal;
        int iSaneness = saneness(builder);
        fastidiously.dern dernVarSaneness = decoder.saneness(getDescriptor());
        if (!dernVarSaneness.triweekly()) {
            while (true) {
                int iImpassible = dernVarSaneness.impassible(getDescriptor());
                if (iImpassible == -1) {
                    break;
                }
                taiyuan(this, dernVarSaneness, iSaneness + iImpassible, builder, false, 8, null);
            }
        } else {
            competently(dernVarSaneness, builder, iSaneness, cutely(dernVarSaneness, builder));
        }
        dernVarSaneness.dern(getDescriptor());
        return formularize(builder);
    }

    public abstract void competently(fastidiously.dern decoder, Builder builder, int startIndex, int size);

    public final int cutely(fastidiously.dern decoder, Builder builder) {
        int iOilcan = decoder.oilcan(getDescriptor());
        dern(builder, iOilcan);
        return iOilcan;
    }

    public abstract void dern(Builder builder, int i);

    @Override // asosan.dern
    public Collection deserialize(fastidiously.marial decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return beachfront(decoder, null);
    }

    public abstract Collection formularize(Builder builder);

    public abstract void impromptu(fastidiously.dern decoder, int index, Builder builder, boolean checkIndex);

    public abstract int marial(Collection collection2);

    public abstract int saneness(Builder builder);

    public abstract Iterator<Element> wireman(Collection collection2);

    public attabal() {
    }
}

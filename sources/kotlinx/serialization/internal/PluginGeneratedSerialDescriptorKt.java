package kotlinx.serialization.internal;

import com.p004ironsource.x4;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialKind;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0002H\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0007H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\r*\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"equalsImpl", "", "SD", "Lkotlinx/serialization/descriptors/SerialDescriptor;", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "typeParamsAreEqual", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "otherDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "hashCodeImpl", "", "typeParams", "", "(Lkotlinx/serialization/descriptors/SerialDescriptor;[Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PluginGeneratedSerialDescriptorKt {
    public static final <SD extends SerialDescriptor> boolean equalsImpl(SD sd, Object obj, Function1<? super SD, Boolean> typeParamsAreEqual) {
        Intrinsics.f(sd, "<this>");
        Intrinsics.f(typeParamsAreEqual, "typeParamsAreEqual");
        if (sd == obj) {
            return true;
        }
        Intrinsics.l();
        throw null;
    }

    public static final int hashCodeImpl(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        Intrinsics.f(serialDescriptor, "<this>");
        Intrinsics.f(typeParams, "typeParams");
        int iHashCode = (serialDescriptor.getSerialName().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<SerialDescriptor> elementDescriptors = SerialDescriptorKt.getElementDescriptors(serialDescriptor);
        Iterator<SerialDescriptor> it = elementDescriptors.iterator();
        int iHashCode2 = 1;
        int i2 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i3 = i2 * 31;
            String serialName = it.next().getSerialName();
            if (serialName != null) {
                iHashCode3 = serialName.hashCode();
            }
            i2 = i3 + iHashCode3;
        }
        Iterator<SerialDescriptor> it2 = elementDescriptors.iterator();
        while (it2.hasNext()) {
            int i4 = iHashCode2 * 31;
            SerialKind kind = it2.next().getKind();
            iHashCode2 = i4 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i2) * 31) + iHashCode2;
    }
}

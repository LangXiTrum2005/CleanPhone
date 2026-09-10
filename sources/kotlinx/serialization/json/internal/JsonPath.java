package kotlinx.serialization.json.internal;

import com.p004ironsource.d9;
import com.p004ironsource.ne;
import com.thinkup.core.common.n.mo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\nJ\u0010\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\fJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0016R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPath;", "", "<init>", "()V", "currentObjectPath", "", "[Ljava/lang/Object;", "indicies", "", "currentDepth", "", "pushDescriptor", "", ne.x0, "Lkotlinx/serialization/descriptors/SerialDescriptor;", "updateDescriptorIndex", "index", "updateCurrentMapKey", "key", "resetCurrentMapKey", "popDescriptor", "getPath", "", "prettyString", "it", "resize", "toString", "Tombstone", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonPath {
    private int currentDepth;
    private Object[] currentObjectPath = new Object[8];
    private int[] indicies;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPath$Tombstone;", "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Tombstone {
        public static final Tombstone INSTANCE = new Tombstone();

        private Tombstone() {
        }
    }

    public JsonPath() {
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = -1;
        }
        this.indicies = iArr;
        this.currentDepth = -1;
    }

    private final String prettyString(Object it) {
        String serialName;
        SerialDescriptor serialDescriptor = it instanceof SerialDescriptor ? (SerialDescriptor) it : null;
        return (serialDescriptor == null || (serialName = serialDescriptor.getSerialName()) == null) ? String.valueOf(it) : serialName;
    }

    private final void resize() {
        int i2 = this.currentDepth * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.currentObjectPath, i2);
        Intrinsics.e(objArrCopyOf, "copyOf(...)");
        this.currentObjectPath = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.indicies, i2);
        Intrinsics.e(iArrCopyOf, "copyOf(...)");
        this.indicies = iArrCopyOf;
    }

    public final String getPath() {
        StringBuilder sb = new StringBuilder("$");
        int i2 = this.currentDepth + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = this.currentObjectPath[i3];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!Intrinsics.a(serialDescriptor.getKind(), StructureKind.LIST.INSTANCE)) {
                    int i4 = this.indicies[i3];
                    if (i4 >= 0) {
                        sb.append(mo.ono);
                        sb.append(serialDescriptor.getElementName(i4));
                    }
                } else if (this.indicies[i3] != -1) {
                    sb.append(d9.i.d);
                    sb.append(this.indicies[i3]);
                    sb.append(d9.i.f24752e);
                }
            } else if (obj != Tombstone.INSTANCE) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public final void popDescriptor() {
        int i2 = this.currentDepth;
        int[] iArr = this.indicies;
        if (iArr[i2] == -2) {
            iArr[i2] = -1;
            this.currentDepth = i2 - 1;
        }
        int i3 = this.currentDepth;
        if (i3 != -1) {
            this.currentDepth = i3 - 1;
        }
    }

    public final void pushDescriptor(SerialDescriptor sd) {
        Intrinsics.f(sd, "sd");
        int i2 = this.currentDepth + 1;
        this.currentDepth = i2;
        if (i2 == this.currentObjectPath.length) {
            resize();
        }
        this.currentObjectPath[i2] = sd;
    }

    public final void resetCurrentMapKey() {
        int[] iArr = this.indicies;
        int i2 = this.currentDepth;
        if (iArr[i2] == -2) {
            this.currentObjectPath[i2] = Tombstone.INSTANCE;
        }
    }

    public String toString() {
        return getPath();
    }

    public final void updateCurrentMapKey(Object key) {
        int[] iArr = this.indicies;
        int i2 = this.currentDepth;
        if (iArr[i2] != -2) {
            int i3 = i2 + 1;
            this.currentDepth = i3;
            if (i3 == this.currentObjectPath.length) {
                resize();
            }
        }
        Object[] objArr = this.currentObjectPath;
        int i4 = this.currentDepth;
        objArr[i4] = key;
        this.indicies[i4] = -2;
    }

    public final void updateDescriptorIndex(int index) {
        this.indicies[this.currentDepth] = index;
    }
}

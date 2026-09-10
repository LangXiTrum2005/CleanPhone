package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.FieldSet$FieldDescriptorLite;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Q70 extends Z70 {
    public Q70(int i) {
        super(i, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Z70
    public void makeImmutable() {
        if (!isImmutable()) {
            for (int i = 0; i < getNumArrayEntries(); i++) {
                Map.Entry<Comparable<Object>, Object> arrayEntryAt = getArrayEntryAt(i);
                if (((FieldSet$FieldDescriptorLite) arrayEntryAt.getKey()).isRepeated()) {
                    arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                }
            }
            for (Map.Entry<Comparable<Object>, Object> entry : getOverflowEntries()) {
                if (((FieldSet$FieldDescriptorLite) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.makeImmutable();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Z70, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((Comparable<Object>) obj, obj2);
    }
}

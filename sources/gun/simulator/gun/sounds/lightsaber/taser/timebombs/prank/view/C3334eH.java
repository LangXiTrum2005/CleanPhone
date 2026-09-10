package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.LazyField;
import com.google.protobuf.MessageLite;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3334eH implements Map.Entry {
    private Map.Entry<Object, LazyField> entry;

    public LazyField getField() {
        return this.entry.getValue();
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.entry.getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        LazyField value = this.entry.getValue();
        if (value == null) {
            return null;
        }
        return value.getValue();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (obj instanceof MessageLite) {
            return this.entry.getValue().setValue((MessageLite) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    private C3334eH(Map.Entry<Object, LazyField> entry) {
        this.entry = entry;
    }
}

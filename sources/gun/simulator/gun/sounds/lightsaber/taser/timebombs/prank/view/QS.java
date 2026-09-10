package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class QS {
    private final Field caseField;
    private final int id;
    private final Field valueField;

    public QS(int i, Field field, Field field2) {
        this.id = i;
        this.caseField = field;
        this.valueField = field2;
    }

    public Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.id;
    }

    public Field getValueField() {
        return this.valueField;
    }
}

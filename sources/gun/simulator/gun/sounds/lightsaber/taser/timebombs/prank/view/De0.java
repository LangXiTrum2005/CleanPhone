package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class De0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "dimension":
                return TypedValues.Custom.TYPE_DIMENSION;
            case "string":
                return TypedValues.Custom.TYPE_STRING;
            case "refrence":
                return TypedValues.Custom.TYPE_REFERENCE;
            case "boolean":
                return TypedValues.Custom.TYPE_BOOLEAN;
            case "color":
                return TypedValues.Custom.TYPE_COLOR;
            case "float":
                return TypedValues.Custom.TYPE_FLOAT;
            case "integer":
                return TypedValues.Custom.TYPE_INT;
            default:
                return -1;
        }
    }
}

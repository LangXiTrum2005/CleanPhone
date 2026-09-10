package p002kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.types.merc;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class marial extends impassible<Character> {
    public marial(char c) {
        super(Character.valueOf(c));
    }

    public final String dern(char c) {
        if (c == '\b') {
            return "\\b";
        }
        if (c == '\t') {
            return "\\t";
        }
        if (c == '\n') {
            return "\\n";
        }
        if (c == '\f') {
            return "\\f";
        }
        if (c == '\r') {
            return "\\r";
        }
        return marial(c) ? String.valueOf(c) : "?";
    }

    public final boolean marial(char c) {
        byte type = (byte) Character.getType(c);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
    public String toString() {
        String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(saneness().charValue()), dern(saneness().charValue())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public merc attabal(trm module) {
        Intrinsics.checkNotNullParameter(module, "module");
        merc mercVarAdultoid = module.apical().adultoid();
        Intrinsics.checkNotNullExpressionValue(mercVarAdultoid, "getCharType(...)");
        return mercVarAdultoid;
    }
}

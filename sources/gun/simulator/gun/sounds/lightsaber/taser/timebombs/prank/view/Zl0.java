package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.CodedInputStream;
import java.io.IOException;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LOOSE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Zl0 {
    private static final /* synthetic */ Zl0[] $VALUES = $values();
    public static final Zl0 LAZY;
    public static final Zl0 LOOSE;
    public static final Zl0 STRICT;

    private static /* synthetic */ Zl0[] $values() {
        return new Zl0[]{LOOSE, STRICT, LAZY};
    }

    static {
        final String str = "LOOSE";
        final int i = 0;
        LOOSE = new Zl0(str, i) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wl0
            {
                com.google.protobuf.X0 x0 = null;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zl0
            public Object readString(CodedInputStream codedInputStream) throws IOException {
                return codedInputStream.readString();
            }
        };
        final String str2 = "STRICT";
        final int i2 = 1;
        STRICT = new Zl0(str2, i2) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xl0
            {
                com.google.protobuf.X0 x0 = null;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zl0
            public Object readString(CodedInputStream codedInputStream) throws IOException {
                return codedInputStream.readStringRequireUtf8();
            }
        };
        final String str3 = "LAZY";
        final int i3 = 2;
        LAZY = new Zl0(str3, i3) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yl0
            {
                com.google.protobuf.X0 x0 = null;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zl0
            public Object readString(CodedInputStream codedInputStream) throws IOException {
                return codedInputStream.readBytes();
            }
        };
    }

    private Zl0(String str, int i) {
        super(str, i);
    }

    public static Zl0 valueOf(String str) {
        return (Zl0) Enum.valueOf(Zl0.class, str);
    }

    public static Zl0[] values() {
        return (Zl0[]) $VALUES.clone();
    }

    public abstract Object readString(CodedInputStream codedInputStream) throws IOException;

    public /* synthetic */ Zl0(String str, int i, com.google.protobuf.X0 x0) {
        this(str, i);
    }
}

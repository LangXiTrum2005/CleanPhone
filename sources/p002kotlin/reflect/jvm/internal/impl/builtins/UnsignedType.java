package p002kotlin.reflect.jvm.internal.impl.builtins;

import byname.marial;
import byname.saneness;
import p002kotlin.jvm.internal.Intrinsics;
import pussyfooter.attabal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: UnsignedType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class UnsignedType {
    public static final UnsignedType UBYTE;
    public static final UnsignedType UINT;
    public static final UnsignedType ULONG;
    public static final UnsignedType USHORT;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final /* synthetic */ attabal f29643arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final /* synthetic */ UnsignedType[] f29644kowloon;
    private final saneness arrayClassId;
    private final saneness classId;
    private final marial typeName;

    static {
        saneness sanenessVarMarial = saneness.marial("kotlin/UByte");
        Intrinsics.checkNotNullExpressionValue(sanenessVarMarial, "fromString(...)");
        UBYTE = new UnsignedType("UBYTE", 0, sanenessVarMarial);
        saneness sanenessVarMarial2 = saneness.marial("kotlin/UShort");
        Intrinsics.checkNotNullExpressionValue(sanenessVarMarial2, "fromString(...)");
        USHORT = new UnsignedType("USHORT", 1, sanenessVarMarial2);
        saneness sanenessVarMarial3 = saneness.marial("kotlin/UInt");
        Intrinsics.checkNotNullExpressionValue(sanenessVarMarial3, "fromString(...)");
        UINT = new UnsignedType("UINT", 2, sanenessVarMarial3);
        saneness sanenessVarMarial4 = saneness.marial("kotlin/ULong");
        Intrinsics.checkNotNullExpressionValue(sanenessVarMarial4, "fromString(...)");
        ULONG = new UnsignedType("ULONG", 3, sanenessVarMarial4);
        UnsignedType[] unsignedTypeArrAttabal = attabal();
        f29644kowloon = unsignedTypeArrAttabal;
        f29643arytenoidectomy = p002kotlin.enums.attabal.attabal(unsignedTypeArrAttabal);
    }

    public UnsignedType(String str, int i, saneness sanenessVar) {
        super(str, i);
        this.classId = sanenessVar;
        marial marialVarCutely = sanenessVar.cutely();
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "getShortClassName(...)");
        this.typeName = marialVarCutely;
        this.arrayClassId = new saneness(sanenessVar.impromptu(), marial.cutely(marialVarCutely.dern() + "Array"));
    }

    public static final /* synthetic */ UnsignedType[] attabal() {
        return new UnsignedType[]{UBYTE, USHORT, UINT, ULONG};
    }

    public static UnsignedType valueOf(String str) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, str);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) f29644kowloon.clone();
    }

    public final saneness getArrayClassId() {
        return this.arrayClassId;
    }

    public final saneness getClassId() {
        return this.classId;
    }

    public final marial getTypeName() {
        return this.typeName;
    }
}

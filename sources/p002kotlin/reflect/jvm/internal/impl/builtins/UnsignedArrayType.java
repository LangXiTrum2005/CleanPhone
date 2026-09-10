package p002kotlin.reflect.jvm.internal.impl.builtins;

import byname.marial;
import byname.saneness;
import p002kotlin.jvm.internal.Intrinsics;
import pussyfooter.attabal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTEARRAY' uses external variables
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
public final class UnsignedArrayType {
    public static final UnsignedArrayType UBYTEARRAY;
    public static final UnsignedArrayType UINTARRAY;
    public static final UnsignedArrayType ULONGARRAY;
    public static final UnsignedArrayType USHORTARRAY;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final /* synthetic */ attabal f29641arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final /* synthetic */ UnsignedArrayType[] f29642kowloon;
    private final saneness classId;
    private final marial typeName;

    static {
        saneness sanenessVarMarial = saneness.marial("kotlin/UByteArray");
        Intrinsics.checkNotNullExpressionValue(sanenessVarMarial, "fromString(...)");
        UBYTEARRAY = new UnsignedArrayType("UBYTEARRAY", 0, sanenessVarMarial);
        saneness sanenessVarMarial2 = saneness.marial("kotlin/UShortArray");
        Intrinsics.checkNotNullExpressionValue(sanenessVarMarial2, "fromString(...)");
        USHORTARRAY = new UnsignedArrayType("USHORTARRAY", 1, sanenessVarMarial2);
        saneness sanenessVarMarial3 = saneness.marial("kotlin/UIntArray");
        Intrinsics.checkNotNullExpressionValue(sanenessVarMarial3, "fromString(...)");
        UINTARRAY = new UnsignedArrayType("UINTARRAY", 2, sanenessVarMarial3);
        saneness sanenessVarMarial4 = saneness.marial("kotlin/ULongArray");
        Intrinsics.checkNotNullExpressionValue(sanenessVarMarial4, "fromString(...)");
        ULONGARRAY = new UnsignedArrayType("ULONGARRAY", 3, sanenessVarMarial4);
        UnsignedArrayType[] unsignedArrayTypeArrAttabal = attabal();
        f29642kowloon = unsignedArrayTypeArrAttabal;
        f29641arytenoidectomy = p002kotlin.enums.attabal.attabal(unsignedArrayTypeArrAttabal);
    }

    public UnsignedArrayType(String str, int i, saneness sanenessVar) {
        super(str, i);
        this.classId = sanenessVar;
        marial marialVarCutely = sanenessVar.cutely();
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "getShortClassName(...)");
        this.typeName = marialVarCutely;
    }

    public static final /* synthetic */ UnsignedArrayType[] attabal() {
        return new UnsignedArrayType[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    public static UnsignedArrayType valueOf(String str) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, str);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) f29642kowloon.clone();
    }

    public final marial getTypeName() {
        return this.typeName;
    }
}

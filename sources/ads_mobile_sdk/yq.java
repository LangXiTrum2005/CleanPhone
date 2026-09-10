package ads_mobile_sdk;

import com.google.common.collect.ImmutableList;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hardhattism;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class yq {
    public static final hardhattism b;
    public static final yq c;
    public static final yq d;
    public static final yq e;
    public static final yq f;
    public static final yq g;
    public static final yq h;
    public static final yq i;
    public static final /* synthetic */ yq[] j;
    public final ImmutableList a;

    static {
        ImmutableList immutableListOf = ImmutableList.of(10, 9);
        Intrinsics.checkNotNullExpressionValue(immutableListOf, "of(...)");
        yq yqVar = new yq("TOP_LEFT", 0, immutableListOf);
        c = yqVar;
        ImmutableList immutableListOf2 = ImmutableList.of(10, 14);
        Intrinsics.checkNotNullExpressionValue(immutableListOf2, "of(...)");
        yq yqVar2 = new yq("TOP_CENTER", 1, immutableListOf2);
        d = yqVar2;
        ImmutableList immutableListOf3 = ImmutableList.of(10, 11);
        Intrinsics.checkNotNullExpressionValue(immutableListOf3, "of(...)");
        yq yqVar3 = new yq("TOP_RIGHT", 2, immutableListOf3);
        e = yqVar3;
        ImmutableList immutableListOf4 = ImmutableList.of(13);
        Intrinsics.checkNotNullExpressionValue(immutableListOf4, "of(...)");
        yq yqVar4 = new yq("CENTER", 3, immutableListOf4);
        f = yqVar4;
        ImmutableList immutableListOf5 = ImmutableList.of(12, 9);
        Intrinsics.checkNotNullExpressionValue(immutableListOf5, "of(...)");
        yq yqVar5 = new yq("BOTTOM_LEFT", 4, immutableListOf5);
        g = yqVar5;
        ImmutableList immutableListOf6 = ImmutableList.of(12, 14);
        Intrinsics.checkNotNullExpressionValue(immutableListOf6, "of(...)");
        yq yqVar6 = new yq("BOTTOM_CENTER", 5, immutableListOf6);
        h = yqVar6;
        ImmutableList immutableListOf7 = ImmutableList.of(12, 11);
        Intrinsics.checkNotNullExpressionValue(immutableListOf7, "of(...)");
        yq yqVar7 = new yq("BOTTOM_RIGHT", 6, immutableListOf7);
        i = yqVar7;
        yq[] yqVarArr = {yqVar, yqVar2, yqVar3, yqVar4, yqVar5, yqVar6, yqVar7};
        j = yqVarArr;
        p002kotlin.enums.attabal.attabal(yqVarArr);
        b = new hardhattism();
    }

    public yq(String str, int i2, ImmutableList immutableList) {
        super(str, i2);
        this.a = immutableList;
    }

    public static yq[] values() {
        return (yq[]) j.clone();
    }
}

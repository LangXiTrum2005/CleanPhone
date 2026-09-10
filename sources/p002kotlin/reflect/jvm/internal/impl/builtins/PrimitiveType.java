package p002kotlin.reflect.jvm.internal.impl.builtins;

import byname.dern;
import byname.marial;
import java.util.Set;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, still in use, count: 1, list:
  (r4v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) from 0x0074: FILLED_NEW_ARRAY 
  (r4v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r5v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r6v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r7v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r8v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r9v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r10v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
 A[WRAPPED] (LINE:117) elemType: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: PrimitiveType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    private final taiyuan arrayTypeFqName$delegate;
    private final marial arrayTypeName;
    private final taiyuan typeFqName$delegate;
    private final marial typeName;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final /* synthetic */ pussyfooter.attabal f29626arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());
    public static final attabal Companion = new attabal(null);
    public static final Set<PrimitiveType> NUMBER_TYPES = creditor.impromptu(new PrimitiveType("Char"), new PrimitiveType("Byte"), new PrimitiveType("Short"), new PrimitiveType("Int"), new PrimitiveType("Float"), new PrimitiveType("Long"), new PrimitiveType("Double"));

    /* JADX INFO: compiled from: PrimitiveType.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public attabal() {
        }
    }

    static {
    }

    public PrimitiveType(String str) {
        super(str, i);
        marial marialVarCutely = marial.cutely(str);
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
        this.typeName = marialVarCutely;
        marial marialVarCutely2 = marial.cutely(str + "Array");
        Intrinsics.checkNotNullExpressionValue(marialVarCutely2, "identifier(...)");
        this.arrayTypeName = marialVarCutely2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.typeFqName$delegate = saneness.attabal(lazyThreadSafetyMode, new Function0<dern>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$typeFqName$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final dern invoke() {
                dern dernVarDern = competently.f29682preprohormone.dern(this.this$0.getTypeName());
                Intrinsics.checkNotNullExpressionValue(dernVarDern, "child(...)");
                return dernVarDern;
            }
        });
        this.arrayTypeFqName$delegate = saneness.attabal(lazyThreadSafetyMode, new Function0<dern>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$arrayTypeFqName$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final dern invoke() {
                dern dernVarDern = competently.f29682preprohormone.dern(this.this$0.getArrayTypeName());
                Intrinsics.checkNotNullExpressionValue(dernVarDern, "child(...)");
                return dernVarDern;
            }
        });
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) f29627kowloon.clone();
    }

    public final dern getArrayTypeFqName() {
        return (dern) this.arrayTypeFqName$delegate.getValue();
    }

    public final marial getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final dern getTypeFqName() {
        return (dern) this.typeFqName$delegate.getValue();
    }

    public final marial getTypeName() {
        return this.typeName;
    }
}

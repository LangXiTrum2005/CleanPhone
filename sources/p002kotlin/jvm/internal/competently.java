package p002kotlin.jvm.internal;

import com.ironsource.C3414a2;
import gibeonite.attabal;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kurbash.wireman;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.text.StringsKt;
import patroclinal.beachfront;
import tetrahedral.apical;
import tetrahedral.arytenoidectomy;
import tetrahedral.cutely;
import tetrahedral.dern;
import tetrahedral.formularize;
import tetrahedral.graveside;
import tetrahedral.impassible;
import tetrahedral.impromptu;
import tetrahedral.kowloon;
import tetrahedral.marial;
import tetrahedral.molybdenite;
import tetrahedral.monoploid;
import tetrahedral.polloi;
import tetrahedral.saneness;
import tetrahedral.taiyuan;
import tetrahedral.triweekly;

/* JADX INFO: compiled from: ClassReference.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001dB\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001e"}, d2 = {"Lkotlin/jvm/internal/competently;", "Lkurbash/wireman;", "", "Lkotlin/jvm/internal/beachfront;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "value", "", "beachfront", "(Ljava/lang/Object;)Z", C3414a2.d, "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "kowloon", "Ljava/lang/Class;", "competently", "()Ljava/lang/Class;", "taiyuan", "simpleName", "impromptu", "qualifiedName", "arytenoidectomy", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class competently implements wireman<Object>, beachfront {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final Map<Class<? extends beachfront<?>>, Integer> f29378monoploid;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Class<?> jClass;

    /* JADX INFO: renamed from: kotlin.jvm.internal.competently$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ClassReference.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\bJ#\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010R,\u0010\u0015\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00130\u0004\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlin/jvm/internal/competently$attabal;", "", "<init>", "()V", "Ljava/lang/Class;", "jClass", "", "dern", "(Ljava/lang/Class;)Ljava/lang/String;", "saneness", "value", "", "wireman", "(Ljava/lang/Object;Ljava/lang/Class;)Z", "type", "attabal", "(Ljava/lang/String;)Ljava/lang/String;", "marial", "", "Lpatroclinal/beachfront;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to clean up code after switch over string restore
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0017: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0140
 case -1811142715: goto B:113:0x0133
 case -1811142714: goto B:108:0x0126
 case -1811142713: goto B:103:0x0119
 case -1811142712: goto B:98:0x010c
 case -1811142711: goto B:93:0x00ff
 case -1811142710: goto B:88:0x00f2
 case -1811142709: goto B:83:0x00e5
 case -1811142708: goto B:78:0x00d8
 case -1811142707: goto B:73:0x00cb
 default: goto B:5:0x001a A[RegionRef:SW:4] (LINE:24)
  (r0v0 int) from 0x001a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00be
 case -1811142684: goto B:63:0x00b1
 case -1811142683: goto B:58:0x00a4
 default: goto B:6:0x001d A[RegionRef:SW:5] (LINE:27)
  (r0v0 int) from 0x001d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0097
 case 80123372: goto B:48:0x008a
 case 80123373: goto B:43:0x007d
 case 80123374: goto B:38:0x0070
 case 80123375: goto B:33:0x0063
 case 80123376: goto B:28:0x0056
 case 80123377: goto B:23:0x0049
 case 80123378: goto B:18:0x003c
 case 80123379: goto B:13:0x002f
 case 80123380: goto B:8:0x0022
 default: goto B:323:? A[RegionRef:SW:6] (LINE:30)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final String attabal(String type) {
            switch (type) {
                case "kotlin.jvm.internal.DoubleCompanionObject":
                    return "kotlin.Double.Companion";
                case "java.lang.Integer":
                    return "kotlin.Int";
                case "java.lang.Cloneable":
                    return "kotlin.Cloneable";
                case "java.lang.annotation.Annotation":
                    return "kotlin.Annotation";
                case "java.lang.Comparable":
                    return "kotlin.Comparable";
                case "java.util.Map":
                    return "kotlin.collections.Map";
                case "java.util.Set":
                    return "kotlin.collections.Set";
                case "double":
                    return "kotlin.Double";
                case "kotlin.jvm.internal.ByteCompanionObject":
                    return "kotlin.Byte.Companion";
                case "java.lang.CharSequence":
                    return "kotlin.CharSequence";
                case "java.util.Collection":
                    return "kotlin.collections.Collection";
                case "java.lang.Float":
                    return "kotlin.Float";
                case "java.lang.Short":
                    return "kotlin.Short";
                case "kotlin.jvm.internal.CharCompanionObject":
                    return "kotlin.Char.Companion";
                case "kotlin.jvm.internal.LongCompanionObject":
                    return "kotlin.Long.Companion";
                case "java.util.Map$Entry":
                    return "kotlin.collections.Map.Entry";
                case "int":
                    return "kotlin.Int";
                case "byte":
                    return "kotlin.Byte";
                case "char":
                    return "kotlin.Char";
                case "long":
                    return "kotlin.Long";
                case "boolean":
                    return "kotlin.Boolean";
                case "java.util.List":
                    return "kotlin.collections.List";
                case "kotlin.jvm.internal.ShortCompanionObject":
                    return "kotlin.Short.Companion";
                case "float":
                    return "kotlin.Float";
                case "short":
                    return "kotlin.Short";
                case "java.lang.Character":
                    return "kotlin.Char";
                case "kotlin.jvm.internal.EnumCompanionObject":
                    return "kotlin.Enum.Companion";
                case "java.lang.Boolean":
                    return "kotlin.Boolean";
                case "java.lang.Byte":
                    return "kotlin.Byte";
                case "java.lang.Enum":
                    return "kotlin.Enum";
                case "java.lang.Long":
                    return "kotlin.Long";
                case "kotlin.jvm.internal.FloatCompanionObject":
                    return "kotlin.Float.Companion";
                case "java.util.Iterator":
                    return "kotlin.collections.Iterator";
                case "java.util.ListIterator":
                    return "kotlin.collections.ListIterator";
                case "kotlin.jvm.internal.StringCompanionObject":
                    return "kotlin.String.Companion";
                case "java.lang.Double":
                    return "kotlin.Double";
                case "java.lang.Number":
                    return "kotlin.Number";
                case "java.lang.Object":
                    return "kotlin.Any";
                case "java.lang.String":
                    return "kotlin.String";
                case "java.lang.Iterable":
                    return "kotlin.collections.Iterable";
                case "kotlin.jvm.internal.BooleanCompanionObject":
                    return "kotlin.Boolean.Companion";
                case "java.lang.Throwable":
                    return "kotlin.Throwable";
                case "kotlin.jvm.internal.IntCompanionObject":
                    return "kotlin.Int.Companion";
                default:
                    switch (type) {
                        case -1811142716:
                            if (type.equals("kotlin.jvm.functions.Function10")) {
                                return "kotlin.Function10";
                            }
                            return null;
                        case -1811142715:
                            if (type.equals("kotlin.jvm.functions.Function11")) {
                                return "kotlin.Function11";
                            }
                            return null;
                        case -1811142714:
                            if (type.equals("kotlin.jvm.functions.Function12")) {
                                return "kotlin.Function12";
                            }
                            return null;
                        case -1811142713:
                            if (type.equals("kotlin.jvm.functions.Function13")) {
                                return "kotlin.Function13";
                            }
                            return null;
                        case -1811142712:
                            if (type.equals("kotlin.jvm.functions.Function14")) {
                                return "kotlin.Function14";
                            }
                            return null;
                        case -1811142711:
                            if (type.equals("kotlin.jvm.functions.Function15")) {
                                return "kotlin.Function15";
                            }
                            return null;
                        case -1811142710:
                            if (type.equals("kotlin.jvm.functions.Function16")) {
                                return "kotlin.Function16";
                            }
                            return null;
                        case -1811142709:
                            if (type.equals("kotlin.jvm.functions.Function17")) {
                                return "kotlin.Function17";
                            }
                            return null;
                        case -1811142708:
                            if (type.equals("kotlin.jvm.functions.Function18")) {
                                return "kotlin.Function18";
                            }
                            return null;
                        case -1811142707:
                            if (type.equals("kotlin.jvm.functions.Function19")) {
                                return "kotlin.Function19";
                            }
                            return null;
                        default:
                            switch (type) {
                                case -1811142685:
                                    if (type.equals("kotlin.jvm.functions.Function20")) {
                                        return "kotlin.Function20";
                                    }
                                    return null;
                                case -1811142684:
                                    if (type.equals("kotlin.jvm.functions.Function21")) {
                                        return "kotlin.Function21";
                                    }
                                    return null;
                                case -1811142683:
                                    if (type.equals("kotlin.jvm.functions.Function22")) {
                                        return "kotlin.Function22";
                                    }
                                    return null;
                                default:
                                    switch (type) {
                                        case 80123371:
                                            if (type.equals("kotlin.jvm.functions.Function0")) {
                                                return "kotlin.Function0";
                                            }
                                            return null;
                                        case 80123372:
                                            if (type.equals("kotlin.jvm.functions.Function1")) {
                                                return "kotlin.Function1";
                                            }
                                            return null;
                                        case 80123373:
                                            if (type.equals("kotlin.jvm.functions.Function2")) {
                                                return "kotlin.Function2";
                                            }
                                            return null;
                                        case 80123374:
                                            if (type.equals("kotlin.jvm.functions.Function3")) {
                                                return "kotlin.Function3";
                                            }
                                            return null;
                                        case 80123375:
                                            if (type.equals("kotlin.jvm.functions.Function4")) {
                                                return "kotlin.Function4";
                                            }
                                            return null;
                                        case 80123376:
                                            if (type.equals("kotlin.jvm.functions.Function5")) {
                                                return "kotlin.Function5";
                                            }
                                            return null;
                                        case 80123377:
                                            if (type.equals("kotlin.jvm.functions.Function6")) {
                                                return "kotlin.Function6";
                                            }
                                            return null;
                                        case 80123378:
                                            if (type.equals("kotlin.jvm.functions.Function7")) {
                                                return "kotlin.Function7";
                                            }
                                            return null;
                                        case 80123379:
                                            if (type.equals("kotlin.jvm.functions.Function8")) {
                                                return "kotlin.Function8";
                                            }
                                            return null;
                                        case 80123380:
                                            if (type.equals("kotlin.jvm.functions.Function9")) {
                                                return "kotlin.Function9";
                                            }
                                            return null;
                                        default:
                                            return null;
                                    }
                            }
                    }
            }
        }

        public final String dern(Class<?> jClass) {
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            String str = null;
            if (jClass.isAnonymousClass()) {
                return null;
            }
            if (!jClass.isLocalClass()) {
                if (!jClass.isArray()) {
                    String name = jClass.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    String strMarial = marial(name);
                    return strMarial == null ? jClass.getSimpleName() : strMarial;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive()) {
                    String name2 = componentType.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    String strMarial2 = marial(name2);
                    if (strMarial2 != null) {
                        str = strMarial2 + "Array";
                    }
                }
                return str == null ? "Array" : str;
            }
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                Intrinsics.beachfront(simpleName);
                String strPrefect = StringsKt.prefect(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (strPrefect != null) {
                    return strPrefect;
                }
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                Intrinsics.beachfront(simpleName);
                return StringsKt.tectonization(simpleName, '$', null, 2, null);
            }
            Intrinsics.beachfront(simpleName);
            return StringsKt.prefect(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        /* JADX WARN: Failed to clean up code after switch over string restore
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0019: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0142
 case -1811142715: goto B:113:0x0135
 case -1811142714: goto B:108:0x0128
 case -1811142713: goto B:103:0x011b
 case -1811142712: goto B:98:0x010e
 case -1811142711: goto B:93:0x0101
 case -1811142710: goto B:88:0x00f4
 case -1811142709: goto B:83:0x00e7
 case -1811142708: goto B:78:0x00da
 case -1811142707: goto B:73:0x00cd
 default: goto B:5:0x001c A[RegionRef:SW:4] (LINE:26)
  (r0v0 int) from 0x001c: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00c0
 case -1811142684: goto B:63:0x00b3
 case -1811142683: goto B:58:0x00a6
 default: goto B:6:0x001f A[RegionRef:SW:5] (LINE:29)
  (r0v0 int) from 0x001f: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0099
 case 80123372: goto B:48:0x008c
 case 80123373: goto B:43:0x007f
 case 80123374: goto B:38:0x0072
 case 80123375: goto B:33:0x0065
 case 80123376: goto B:28:0x0058
 case 80123377: goto B:23:0x004b
 case 80123378: goto B:18:0x003e
 case 80123379: goto B:13:0x0031
 case 80123380: goto B:8:0x0024
 default: goto B:313:? A[RegionRef:SW:6] (LINE:32)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final String marial(String type) {
            switch (type) {
                case "kotlin.jvm.internal.DoubleCompanionObject":
                    return "Companion";
                case "java.lang.Integer":
                    return "Int";
                case "java.lang.Cloneable":
                    return "Cloneable";
                case "java.lang.annotation.Annotation":
                    return "Annotation";
                case "java.lang.Comparable":
                    return "Comparable";
                case "java.util.Map":
                    return "Map";
                case "java.util.Set":
                    return "Set";
                case "double":
                    return "Double";
                case "kotlin.jvm.internal.ByteCompanionObject":
                    return "Companion";
                case "java.lang.CharSequence":
                    return "CharSequence";
                case "java.util.Collection":
                    return "Collection";
                case "java.lang.Float":
                    return "Float";
                case "java.lang.Short":
                    return "Short";
                case "kotlin.jvm.internal.CharCompanionObject":
                    return "Companion";
                case "kotlin.jvm.internal.LongCompanionObject":
                    return "Companion";
                case "java.util.Map$Entry":
                    return "Entry";
                case "int":
                    return "Int";
                case "byte":
                    return "Byte";
                case "char":
                    return "Char";
                case "long":
                    return "Long";
                case "boolean":
                    return "Boolean";
                case "java.util.List":
                    return "List";
                case "kotlin.jvm.internal.ShortCompanionObject":
                    return "Companion";
                case "float":
                    return "Float";
                case "short":
                    return "Short";
                case "java.lang.Character":
                    return "Char";
                case "kotlin.jvm.internal.EnumCompanionObject":
                    return "Companion";
                case "java.lang.Boolean":
                    return "Boolean";
                case "java.lang.Byte":
                    return "Byte";
                case "java.lang.Enum":
                    return "Enum";
                case "java.lang.Long":
                    return "Long";
                case "kotlin.jvm.internal.FloatCompanionObject":
                    return "Companion";
                case "java.util.Iterator":
                    return "Iterator";
                case "java.util.ListIterator":
                    return "ListIterator";
                case "kotlin.jvm.internal.StringCompanionObject":
                    return "Companion";
                case "java.lang.Double":
                    return "Double";
                case "java.lang.Number":
                    return "Number";
                case "java.lang.Object":
                    return "Any";
                case "java.lang.String":
                    return "String";
                case "java.lang.Iterable":
                    return "Iterable";
                case "kotlin.jvm.internal.BooleanCompanionObject":
                    return "Companion";
                case "java.lang.Throwable":
                    return "Throwable";
                case "kotlin.jvm.internal.IntCompanionObject":
                    return "Companion";
                default:
                    switch (type) {
                        case -1811142716:
                            if (type.equals("kotlin.jvm.functions.Function10")) {
                                return "Function10";
                            }
                            return null;
                        case -1811142715:
                            if (type.equals("kotlin.jvm.functions.Function11")) {
                                return "Function11";
                            }
                            return null;
                        case -1811142714:
                            if (type.equals("kotlin.jvm.functions.Function12")) {
                                return "Function12";
                            }
                            return null;
                        case -1811142713:
                            if (type.equals("kotlin.jvm.functions.Function13")) {
                                return "Function13";
                            }
                            return null;
                        case -1811142712:
                            if (type.equals("kotlin.jvm.functions.Function14")) {
                                return "Function14";
                            }
                            return null;
                        case -1811142711:
                            if (type.equals("kotlin.jvm.functions.Function15")) {
                                return "Function15";
                            }
                            return null;
                        case -1811142710:
                            if (type.equals("kotlin.jvm.functions.Function16")) {
                                return "Function16";
                            }
                            return null;
                        case -1811142709:
                            if (type.equals("kotlin.jvm.functions.Function17")) {
                                return "Function17";
                            }
                            return null;
                        case -1811142708:
                            if (type.equals("kotlin.jvm.functions.Function18")) {
                                return "Function18";
                            }
                            return null;
                        case -1811142707:
                            if (type.equals("kotlin.jvm.functions.Function19")) {
                                return "Function19";
                            }
                            return null;
                        default:
                            switch (type) {
                                case -1811142685:
                                    if (type.equals("kotlin.jvm.functions.Function20")) {
                                        return "Function20";
                                    }
                                    return null;
                                case -1811142684:
                                    if (type.equals("kotlin.jvm.functions.Function21")) {
                                        return "Function21";
                                    }
                                    return null;
                                case -1811142683:
                                    if (type.equals("kotlin.jvm.functions.Function22")) {
                                        return "Function22";
                                    }
                                    return null;
                                default:
                                    switch (type) {
                                        case 80123371:
                                            if (type.equals("kotlin.jvm.functions.Function0")) {
                                                return "Function0";
                                            }
                                            return null;
                                        case 80123372:
                                            if (type.equals("kotlin.jvm.functions.Function1")) {
                                                return "Function1";
                                            }
                                            return null;
                                        case 80123373:
                                            if (type.equals("kotlin.jvm.functions.Function2")) {
                                                return "Function2";
                                            }
                                            return null;
                                        case 80123374:
                                            if (type.equals("kotlin.jvm.functions.Function3")) {
                                                return "Function3";
                                            }
                                            return null;
                                        case 80123375:
                                            if (type.equals("kotlin.jvm.functions.Function4")) {
                                                return "Function4";
                                            }
                                            return null;
                                        case 80123376:
                                            if (type.equals("kotlin.jvm.functions.Function5")) {
                                                return "Function5";
                                            }
                                            return null;
                                        case 80123377:
                                            if (type.equals("kotlin.jvm.functions.Function6")) {
                                                return "Function6";
                                            }
                                            return null;
                                        case 80123378:
                                            if (type.equals("kotlin.jvm.functions.Function7")) {
                                                return "Function7";
                                            }
                                            return null;
                                        case 80123379:
                                            if (type.equals("kotlin.jvm.functions.Function8")) {
                                                return "Function8";
                                            }
                                            return null;
                                        case 80123380:
                                            if (type.equals("kotlin.jvm.functions.Function9")) {
                                                return "Function9";
                                            }
                                            return null;
                                        default:
                                            return null;
                                    }
                            }
                    }
            }
        }

        public final String saneness(Class<?> jClass) {
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            String str = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String name = jClass.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                String strAttabal = attabal(name);
                return strAttabal == null ? jClass.getCanonicalName() : strAttabal;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive()) {
                String name2 = componentType.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                String strAttabal2 = attabal(name2);
                if (strAttabal2 != null) {
                    str = strAttabal2 + "Array";
                }
            }
            return str == null ? "kotlin.Array" : str;
        }

        public final boolean wireman(Object value, Class<?> jClass) {
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            Map map = competently.f29378monoploid;
            Intrinsics.competently(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return rotuma.impassible(value, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = attabal.dern(attabal.marial(jClass));
            }
            return jClass.isInstance(value);
        }

        public Companion() {
        }
    }

    static {
        List listKowloon = adultoid.kowloon(Function0.class, Function1.class, Function2.class, triweekly.class, kowloon.class, arytenoidectomy.class, monoploid.class, polloi.class, molybdenite.class, graveside.class, tetrahedral.attabal.class, saneness.class, dern.class, tetrahedral.wireman.class, marial.class, tetrahedral.beachfront.class, tetrahedral.competently.class, impromptu.class, taiyuan.class, cutely.class, apical.class, formularize.class, impassible.class);
        ArrayList arrayList = new ArrayList(dovishness.gintrap(listKowloon, 10));
        int i = 0;
        for (Object obj : listKowloon) {
            int i2 = i + 1;
            if (i < 0) {
                adultoid.dovishness();
            }
            arrayList.add(patroclinal.formularize.attabal((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f29378monoploid = seminary.dovishness(arrayList);
    }

    public competently(Class<?> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.jClass = jClass;
    }

    @Override // kurbash.wireman
    public boolean beachfront(Object value) {
        return INSTANCE.wireman(value, competently());
    }

    @Override // p002kotlin.jvm.internal.beachfront
    public Class<?> competently() {
        return this.jClass;
    }

    public boolean equals(Object other) {
        return (other instanceof competently) && Intrinsics.wireman(attabal.dern(this), attabal.dern((wireman) other));
    }

    @Override // kurbash.wireman
    public int hashCode() {
        return attabal.dern(this).hashCode();
    }

    @Override // kurbash.wireman
    public String impromptu() {
        return INSTANCE.saneness(competently());
    }

    @Override // kurbash.wireman
    public String taiyuan() {
        return INSTANCE.dern(competently());
    }

    public String toString() {
        return competently().toString() + " (Kotlin reflection is not available)";
    }
}

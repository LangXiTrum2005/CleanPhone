package androidx.compose.runtime;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C3700q2;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\"\b\b\u0000\u0010\u0014*\u00020\u0013\"\b\b\u0001\u0010\u0015*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001d\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\u001f\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010\u001e\u001a3\u0010$\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b$\u0010%\u001a+\u0010(\u001a\u0004\u0018\u00010\u001b*\b\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0002¢\u0006\u0004\b(\u0010)\u001a#\u0010*\u001a\u0004\u0018\u00010\u001b*\b\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0004\b*\u0010+\u001a)\u0010,\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u001b0 2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010.\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b.\u0010/\u001a\u0013\u00100\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b0\u00101\u001a#\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001a*\u0002022\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106\u001a#\u0010:\u001a\u00020\u0003*\u0002072\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0003H\u0002¢\u0006\u0004\b:\u0010;\u001a+\u0010?\u001a\u00020\u0003*\u0002072\u0006\u0010<\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u0003H\u0002¢\u0006\u0004\b?\u0010@\u001a\u0017\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020\u0007H\u0000¢\u0006\u0004\bC\u0010D\u001a\u0017\u0010E\u001a\u00020\t2\u0006\u0010A\u001a\u00020\u0007H\u0000¢\u0006\u0004\bE\u0010F\u001a5\u0010O\u001a\u00020N2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\u000e2\f\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010LH\u0000¢\u0006\u0004\bO\u0010P\"\"\u0010V\u001a\u00020\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010\u0002\"\u0004\bT\u0010U\" \u0010\\\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bW\u0010X\u0012\u0004\b[\u0010\r\u001a\u0004\bY\u0010Z\" \u0010`\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b]\u0010X\u0012\u0004\b_\u0010\r\u001a\u0004\b^\u0010Z\" \u0010d\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\ba\u0010X\u0012\u0004\bc\u0010\r\u001a\u0004\bb\u0010Z\" \u0010h\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\be\u0010X\u0012\u0004\bg\u0010\r\u001a\u0004\bf\u0010Z\" \u0010l\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bi\u0010X\u0012\u0004\bk\u0010\r\u001a\u0004\bj\u0010Z\" \u0010J\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bm\u0010X\u0012\u0004\bo\u0010\r\u001a\u0004\bn\u0010Z\"$\u0010t\u001a\u0012\u0012\u0004\u0012\u00020\u001b0pj\b\u0012\u0004\u0012\u00020\u001b`q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010s\"\u0018\u0010w\u001a\u00020\u0003*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010v\"\u0018\u0010z\u001a\u00020\u0000*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y\"\u0018\u0010z\u001a\u00020\u0000*\u0002078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|\"\u0019\u0010\u0080\u0001\u001a\u00020\u0013*\u00020}8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007f¨\u0006\u0081\u0001"}, d2 = {"", "grimness", "()Z", "", X3.i.W, "dirty1", "dirty2", "", "info", "", "mathsort", "(IIILjava/lang/String;)V", "peridotite", "()V", "Landroidx/compose/runtime/cig;", "Landroidx/compose/runtime/immediately;", "rememberManager", "creditor", "(Landroidx/compose/runtime/cig;Landroidx/compose/runtime/immediately;)V", "", "K", "V", "initialCapacity", "Landroidx/compose/runtime/collection/saneness;", "saran", "(I)Landroidx/collection/grimness;", "", "Landroidx/compose/runtime/clubfoot;", "location", "cord", "(Ljava/util/List;I)I", "preprohormone", "", "Landroidx/compose/runtime/technofreak;", "scope", C3700q2.p, "merc", "(Ljava/util/List;ILandroidx/compose/runtime/technofreak;Ljava/lang/Object;)V", "start", TtmlNode.END, "cuirassed", "(Ljava/util/List;II)Landroidx/compose/runtime/clubfoot;", "hydrovane", "(Ljava/util/List;I)Landroidx/compose/runtime/clubfoot;", "walach", "(Ljava/util/List;II)V", "polloi", "(Z)I", "monoploid", "(I)Z", "Landroidx/compose/runtime/cosy;", "Landroidx/compose/runtime/saneness;", "anchor", "molybdenite", "(Landroidx/compose/runtime/cosy;Landroidx/compose/runtime/saneness;)Ljava/util/List;", "Landroidx/compose/runtime/fastrack;", "index", "root", "gintrap", "(Landroidx/compose/runtime/fastrack;II)I", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "common", "privatdozent", "(Landroidx/compose/runtime/fastrack;III)I", PglCryptUtils.KEY_MESSAGE, "", "dovishness", "(Ljava/lang/String;)Ljava/lang/Void;", "adultoid", "(Ljava/lang/String;)V", "Landroidx/compose/runtime/supplicat;", "composition", "Landroidx/compose/runtime/nosophobia;", "reference", "slots", "Landroidx/compose/runtime/wireman;", "applier", "Landroidx/compose/runtime/lerp;", "rotuma", "(Landroidx/compose/runtime/supplicat;Landroidx/compose/runtime/nosophobia;Landroidx/compose/runtime/cig;Landroidx/compose/runtime/wireman;)Landroidx/compose/runtime/lerp;", "attabal", "Z", "stratoscope", "setComposeStackTraceEnabled", "(Z)V", "composeStackTraceEnabled", "saneness", "Ljava/lang/Object;", "oilcan", "()Ljava/lang/Object;", "getInvocation$annotations", "invocation", "dern", "kattegat", "getProvider$annotations", IronSourceConstants.EVENTS_PROVIDER, "wireman", "trm", "getCompositionLocalMap$annotations", "compositionLocalMap", "marial", "getProviderValues", "getProviderValues$annotations", "providerValues", "beachfront", "supplicat", "getProviderMaps$annotations", "providerMaps", "competently", "restrictive", "getReference$annotations", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "impromptu", "Ljava/util/Comparator;", "InvalidationLocationAscending", "sealless", "(Landroidx/compose/runtime/cig;)I", "nextGroup", "seminary", "(Landroidx/compose/runtime/cig;)Z", "isAfterFirstChild", "polder", "(Landroidx/compose/runtime/fastrack;)Z", "Landroidx/compose/runtime/permissivist;", "yemenite", "(Landroidx/compose/runtime/permissivist;)Ljava/lang/Object;", "joinedKey", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static boolean f6122attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Object f6128saneness = new OpaqueKey(IronSourceConstants.EVENTS_PROVIDER);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Object f6125dern = new OpaqueKey(IronSourceConstants.EVENTS_PROVIDER);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Object f6129wireman = new OpaqueKey("compositionLocalMap");

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Object f6127marial = new OpaqueKey("providerValues");

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final Object f6123beachfront = new OpaqueKey("providers");

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Object f6124competently = new OpaqueKey("reference");

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final Comparator<clubfoot> f6126impromptu = new Comparator() { // from class: androidx.compose.runtime.arytenoidectomy
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return polloi.dern((clubfoot) obj, (clubfoot) obj2);
        }
    };

    public static final void adultoid(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final int cord(List<clubfoot> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iTaiyuan = Intrinsics.taiyuan(list.get(i3).getLocation(), i);
            if (iTaiyuan < 0) {
                i2 = i3 + 1;
            } else {
                if (iTaiyuan <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void creditor(SlotWriter slotWriter, final immediately immediatelyVar) {
        slotWriter.splinterproof(slotWriter.getCurrentGroup(), new Function2() { // from class: androidx.compose.runtime.monoploid
            @Override // p002kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return polloi.starveling(immediatelyVar, ((Integer) obj).intValue(), obj2);
            }
        });
        slotWriter.lampshade();
    }

    public static final clubfoot cuirassed(List<clubfoot> list, int i, int i2) {
        int iPreprohormone = preprohormone(list, i);
        if (iPreprohormone >= list.size()) {
            return null;
        }
        clubfoot clubfootVar = list.get(iPreprohormone);
        if (clubfootVar.getLocation() < i2) {
            return clubfootVar;
        }
        return null;
    }

    public static final int dern(clubfoot clubfootVar, clubfoot clubfootVar2) {
        return Intrinsics.taiyuan(clubfootVar.getLocation(), clubfootVar2.getLocation());
    }

    public static final Void dovishness(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final int gintrap(SlotReader fastrackVar, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = fastrackVar.creditor(i);
            i3++;
        }
        return i3;
    }

    public static final void graveside(SlotReader fastrackVar, List<Object> list, int i) {
        if (fastrackVar.merc(i)) {
            list.add(fastrackVar.seminary(i));
            return;
        }
        int iYemenite = i + 1;
        int iYemenite2 = i + fastrackVar.yemenite(i);
        while (iYemenite < iYemenite2) {
            graveside(fastrackVar, list, iYemenite);
            iYemenite += fastrackVar.yemenite(iYemenite);
        }
    }

    public static final boolean grimness() {
        return false;
    }

    public static final clubfoot hydrovane(List<clubfoot> list, int i) {
        int iCord = cord(list, i);
        if (iCord >= 0) {
            return list.remove(iCord);
        }
        return null;
    }

    public static final Object kattegat() {
        return f6125dern;
    }

    public static final void merc(List<clubfoot> list, int i, technofreak technofreakVar, Object obj) {
        int iCord = cord(list, i);
        if (iCord < 0) {
            int i2 = -(iCord + 1);
            if (!(obj instanceof polder)) {
                obj = null;
            }
            list.add(i2, new clubfoot(technofreakVar, i, obj));
            return;
        }
        clubfoot clubfootVar = list.get(iCord);
        if (!(obj instanceof polder)) {
            clubfootVar.marial(null);
            return;
        }
        Object objAttabal = clubfootVar.getCom.ironsource.mediationsdk.d.k java.lang.String();
        if (objAttabal == null) {
            clubfootVar.marial(obj);
        } else if (objAttabal instanceof androidx.collection.saran) {
            ((androidx.collection.saran) objAttabal).impromptu(obj);
        } else {
            clubfootVar.marial(androidx.collection.mathsort.saneness(objAttabal, obj));
        }
    }

    public static final List<Object> molybdenite(cosy cosyVar, saneness sanenessVar) {
        ArrayList arrayList = new ArrayList();
        SlotReader fastrackVarDovishness = cosyVar.dovishness();
        try {
            graveside(fastrackVarDovishness, arrayList, cosyVar.wireman(sanenessVar));
            Unit unit = Unit.f29295attabal;
            return arrayList;
        } finally {
            fastrackVarDovishness.wireman();
        }
    }

    public static final boolean monoploid(int i) {
        return i != 0;
    }

    public static final Object oilcan() {
        return f6128saneness;
    }

    public static final boolean polder(SlotReader fastrackVar) {
        return fastrackVar.getCurrent() > fastrackVar.getParent() + 1;
    }

    public static final int preprohormone(List<clubfoot> list, int i) {
        int iCord = cord(list, i);
        return iCord < 0 ? -(iCord + 1) : iCord;
    }

    public static final int privatdozent(SlotReader fastrackVar, int i, int i2, int i3) {
        if (i != i2) {
            if (i == i3 || i2 == i3) {
                return i3;
            }
            if (fastrackVar.creditor(i) == i2) {
                return i2;
            }
            if (fastrackVar.creditor(i2) != i) {
                if (fastrackVar.creditor(i) == fastrackVar.creditor(i2)) {
                    return fastrackVar.creditor(i);
                }
                int iGintrap = gintrap(fastrackVar, i, i3);
                int iGintrap2 = gintrap(fastrackVar, i2, i3);
                int i4 = iGintrap - iGintrap2;
                for (int i5 = 0; i5 < i4; i5++) {
                    i = fastrackVar.creditor(i);
                }
                int i6 = iGintrap2 - iGintrap;
                for (int i7 = 0; i7 < i6; i7++) {
                    i2 = fastrackVar.creditor(i2);
                }
                while (i != i2) {
                    i = fastrackVar.creditor(i);
                    i2 = fastrackVar.creditor(i2);
                }
                return i;
            }
        }
        return i;
    }

    public static final Object restrictive() {
        return f6124competently;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final lerp rotuma(supplicat supplicatVar, nosophobia nosophobiaVar, SlotWriter slotWriter, wireman<?> wiremanVar) {
        cosy cosyVar = new cosy();
        if (slotWriter.permissivist()) {
            cosyVar.impromptu();
        }
        if (slotWriter.dent()) {
            cosyVar.competently();
        }
        int currentGroup = slotWriter.getCurrentGroup();
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        byte b = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        boolean z3 = true;
        boolean z4 = true;
        int i5 = 1;
        if (wiremanVar != null && slotWriter.herdbook(currentGroup) > 0) {
            int parent = slotWriter.getParent();
            while (parent > 0 && !slotWriter.igbo(parent)) {
                parent = slotWriter.outmarry(parent);
            }
            if (parent >= 0 && slotWriter.igbo(parent)) {
                Object objHardpan = slotWriter.hardpan(parent);
                int i6 = parent + 1;
                int iLotta = parent + slotWriter.lotta(parent);
                int iHerdbook = i;
                while (i6 < iLotta) {
                    int iLotta2 = slotWriter.lotta(i6) + i6;
                    if (iLotta2 > currentGroup) {
                        break;
                    }
                    iHerdbook += slotWriter.igbo(i6) ? i3 : slotWriter.herdbook(i6);
                    i6 = iLotta2;
                }
                int iHerdbook2 = slotWriter.igbo(currentGroup) ? i4 : slotWriter.herdbook(currentGroup);
                wiremanVar.beachfront(objHardpan);
                wiremanVar.attabal(iHerdbook, iHerdbook2);
                wiremanVar.impromptu();
            }
        }
        SlotWriter slotWriterGintrap = cosyVar.gintrap();
        try {
            slotWriterGintrap.sealless();
            slotWriterGintrap.libya(126665345, nosophobiaVar.dern());
            SlotWriter.picketboat(slotWriterGintrap, b == true ? 1 : 0, i2, null);
            slotWriterGintrap.twybill(nosophobiaVar.getCom.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD java.lang.String());
            List<saneness> listClaque = slotWriter.claque(nosophobiaVar.getAnchor(), i5, slotWriterGintrap);
            slotWriterGintrap.licking();
            slotWriterGintrap.starveling();
            slotWriterGintrap.hydrovane();
            slotWriterGintrap.restrictive(z4);
            lerp lerpVar = new lerp(cosyVar);
            technofreak.Companion companion = technofreak.INSTANCE;
            if (!companion.saneness(cosyVar, listClaque)) {
                return lerpVar;
            }
            attabal attabalVar = new attabal(supplicatVar, nosophobiaVar);
            SlotWriter slotWriterGintrap2 = cosyVar.gintrap();
            try {
                companion.attabal(slotWriterGintrap2, listClaque, attabalVar);
                Unit unit = Unit.f29295attabal;
                return lerpVar;
            } finally {
                slotWriterGintrap2.restrictive(z2);
            }
        } catch (Throwable th) {
            slotWriterGintrap.restrictive(z);
            throw th;
        }
    }

    public static final <K, V> androidx.collection.grimness<Object, Object> saran(int i) {
        return androidx.compose.runtime.collection.saneness.wireman(new androidx.collection.grimness(i));
    }

    public static final int sealless(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() + slotWriter.lotta(slotWriter.getCurrentGroup());
    }

    public static final boolean seminary(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() > slotWriter.getParent() + 1;
    }

    public static final Unit starveling(immediately immediatelyVar, int i, Object obj) {
        if (obj instanceof competently) {
            immediatelyVar.attabal((competently) obj);
        }
        if (obj instanceof tectonization) {
            immediatelyVar.wireman((tectonization) obj);
        }
        if (obj instanceof technofreak) {
            ((technofreak) obj).cord();
        }
        return Unit.f29295attabal;
    }

    public static final boolean stratoscope() {
        return f6122attabal;
    }

    public static final Object supplicat() {
        return f6123beachfront;
    }

    public static final Object trm() {
        return f6129wireman;
    }

    public static final void walach(List<clubfoot> list, int i, int i2) {
        int iPreprohormone = preprohormone(list, i);
        while (iPreprohormone < list.size() && list.get(iPreprohormone).getLocation() < i2) {
            list.remove(iPreprohormone);
        }
    }

    public static final Object yemenite(permissivist permissivistVar) {
        return permissivistVar.getObjectKey() != null ? new JoinedKey(Integer.valueOf(permissivistVar.getCom.ironsource.X3.i.W java.lang.String()), permissivistVar.getObjectKey()) : Integer.valueOf(permissivistVar.getCom.ironsource.X3.i.W java.lang.String());
    }

    public static final void peridotite() {
    }

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/compose/runtime/polloi$attabal", "Landroidx/compose/runtime/dhss;", "Landroidx/compose/runtime/technofreak;", "scope", "", C3700q2.p, "Landroidx/compose/runtime/InvalidationResult;", "impassible", "(Landroidx/compose/runtime/technofreak;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "", "dern", "(Landroidx/compose/runtime/technofreak;)V", "value", "saneness", "(Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements dhss {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ nosophobia f6130arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ supplicat f6131kowloon;

        public attabal(supplicat supplicatVar, nosophobia nosophobiaVar) {
            this.f6131kowloon = supplicatVar;
            this.f6130arytenoidectomy = nosophobiaVar;
        }

        @Override // androidx.compose.runtime.dhss
        public InvalidationResult impassible(technofreak scope, Object instance) {
            InvalidationResult invalidationResultImpassible;
            supplicat supplicatVar = this.f6131kowloon;
            dhss dhssVar = supplicatVar instanceof dhss ? (dhss) supplicatVar : null;
            if (dhssVar == null || (invalidationResultImpassible = dhssVar.impassible(scope, instance)) == null) {
                invalidationResultImpassible = InvalidationResult.IGNORED;
            }
            if (invalidationResultImpassible != InvalidationResult.IGNORED) {
                return invalidationResultImpassible;
            }
            nosophobia nosophobiaVar = this.f6130arytenoidectomy;
            nosophobiaVar.taiyuan(CollectionsKt.claque(nosophobiaVar.wireman(), patroclinal.formularize.attabal(scope, instance)));
            return InvalidationResult.SCHEDULED;
        }

        @Override // androidx.compose.runtime.dhss
        public void dern(technofreak scope) {
        }

        @Override // androidx.compose.runtime.dhss
        public void saneness(Object value) {
        }
    }

    public static final int polloi(boolean z) {
        return z ? 1 : 0;
    }

    public static final void mathsort(int i, int i2, int i3, String str) {
    }
}

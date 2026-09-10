package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import com.ironsource.C3700q2;
import com.ironsource.X3;
import com.ironsource.mediationsdk.d;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecomposeScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b/\b\u0001\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0001\u001eB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u00072\u0018\u0010\n\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J)\u0010\u001e\u001a\u00020\u00102\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0010¢\u0006\u0004\b#\u0010\u0018J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\t¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u00102\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b*\u0010&J\r\u0010+\u001a\u00020\u0010¢\u0006\u0004\b+\u0010\u0018J#\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0010\u0018\u00010,2\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b.\u0010/R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0006R\u0016\u00106\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R$\u0010=\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010>R\u0016\u0010?\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00105R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010AR*\u0010E\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010J\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010M\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\bK\u0010G\"\u0004\bL\u0010IR\u0011\u0010O\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bN\u0010GR\u0011\u0010Q\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bP\u0010GR$\u0010T\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010G\"\u0004\bS\u0010IR$\u0010W\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010G\"\u0004\bV\u0010IR$\u0010Z\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010G\"\u0004\bY\u0010IR$\u0010]\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010G\"\u0004\b\\\u0010IR$\u0010`\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010G\"\u0004\b_\u0010IR$\u0010c\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010G\"\u0004\bb\u0010IR$\u0010f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010G\"\u0004\be\u0010IR$\u0010i\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010G\"\u0004\bh\u0010IR$\u0010l\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010G\"\u0004\bk\u0010IR\u0011\u0010n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bm\u0010G¨\u0006o"}, d2 = {"Landroidx/compose/runtime/technofreak;", "Landroidx/compose/runtime/licking;", "Landroidx/compose/runtime/hardpan;", "Landroidx/compose/runtime/dhss;", "owner", "<init>", "(Landroidx/compose/runtime/dhss;)V", "Landroidx/compose/runtime/polder;", "Landroidx/collection/grimness;", "", "dependencies", "", "wireman", "(Landroidx/compose/runtime/polder;Landroidx/collection/grimness;)Z", "Landroidx/compose/runtime/taiyuan;", "composer", "", "marial", "(Landroidx/compose/runtime/taiyuan;)V", "value", "Landroidx/compose/runtime/InvalidationResult;", "adultoid", "(Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "cord", "()V", "dern", "invalidate", "Lkotlin/Function2;", "", "block", "attabal", "(Lkotlin/jvm/functions/Function2;)V", "token", "saran", "(I)V", "stratoscope", C3700q2.p, "preprohormone", "(Ljava/lang/Object;)Z", "rotuma", "(Landroidx/compose/runtime/polder;Ljava/lang/Object;)V", d.k, "gintrap", "cuirassed", "Lkotlin/Function1;", "Landroidx/compose/runtime/molybdenite;", "beachfront", "(I)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/dhss;", "getOwner$runtime", "()Landroidx/compose/runtime/dhss;", "setOwner$runtime", "saneness", "I", "flags", "Landroidx/compose/runtime/saneness;", "Landroidx/compose/runtime/saneness;", "impromptu", "()Landroidx/compose/runtime/saneness;", "trm", "(Landroidx/compose/runtime/saneness;)V", "anchor", "Lkotlin/jvm/functions/Function2;", "currentToken", "Landroidx/collection/polder;", "Landroidx/collection/polder;", "trackedInstances", "competently", "Landroidx/collection/grimness;", "trackedDependencies", "triweekly", "()Z", "supplicat", "(Z)V", "rereading", "polloi", "seminary", "skipped", "graveside", "valid", "taiyuan", "canRecompose", "molybdenite", "grimness", "used", "monoploid", "polder", "reusing", "kowloon", "restrictive", "resetReusing", "formularize", "sealless", X3.i.e0, "arytenoidectomy", "merc", "resuming", "cutely", "setDefaultsInScope", "defaultsInScope", "getDefaultsInvalid", "oilcan", "defaultsInvalid", "impassible", "kattegat", "requiresRecompose", "apical", "yemenite", "forcedRecompose", "dovishness", "isConditional", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class technofreak implements licking, hardpan {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final int f6310taiyuan = 8;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public dhss owner;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.polder<Object> trackedInstances;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.grimness<polder<?>, Object> trackedDependencies;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public saneness anchor;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public int currentToken;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int flags;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public Function2<? super taiyuan, ? super Integer, Unit> block;

    /* JADX INFO: renamed from: androidx.compose.runtime.technofreak$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: RecomposeScopeImpl.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/technofreak$attabal;", "", "<init>", "()V", "Landroidx/compose/runtime/cig;", "slots", "", "Landroidx/compose/runtime/saneness;", "anchors", "Landroidx/compose/runtime/dhss;", "newOwner", "", "attabal", "(Landroidx/compose/runtime/cig;Ljava/util/List;Landroidx/compose/runtime/dhss;)V", "Landroidx/compose/runtime/cosy;", "", "saneness", "(Landroidx/compose/runtime/cosy;Ljava/util/List;)Z", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void attabal(SlotWriter slots, List<saneness> anchors, dhss newOwner) {
            List<saneness> list = anchors;
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object objCosy = slots.cosy(anchors.get(i), 0);
                technofreak technofreakVar = objCosy instanceof technofreak ? (technofreak) objCosy : null;
                if (technofreakVar != null) {
                    technofreakVar.dern(newOwner);
                }
            }
        }

        public final boolean saneness(cosy slots, List<saneness> anchors) {
            List<saneness> list = anchors;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    saneness sanenessVar = anchors.get(i);
                    if (slots.rotuma(sanenessVar) && (slots.cord(slots.wireman(sanenessVar), 0) instanceof technofreak)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public Companion() {
        }
    }

    public technofreak(dhss dhssVar) {
        this.owner = dhssVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0087 A[LOOP:0: B:11:0x0020->B:35:0x0087, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x008a A[EDGE_INSN: B:39:0x008a->B:36:0x008a BREAK  A[LOOP:0: B:11:0x0020->B:35:0x0087], SYNTHETIC] */
    public static final Unit competently(technofreak technofreakVar, int i, androidx.collection.polder polderVar, molybdenite molybdeniteVar) {
        int i2;
        if (technofreakVar.currentToken == i && Intrinsics.wireman(polderVar, technofreakVar.trackedInstances) && (molybdeniteVar instanceof gintrap)) {
            long[] jArr = polderVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((255 & j) < 128) {
                                int i7 = (i3 << 3) + i6;
                                Object obj = polderVar.keys[i7];
                                boolean z = polderVar.values[i7] != i;
                                if (z) {
                                    gintrap gintrapVar = (gintrap) molybdeniteVar;
                                    gintrapVar.saran(obj, technofreakVar);
                                    i2 = i4;
                                    if (obj instanceof polder) {
                                        gintrapVar.grimness((polder) obj);
                                        androidx.collection.grimness<polder<?>, Object> grimnessVar = technofreakVar.trackedDependencies;
                                        if (grimnessVar != null) {
                                            grimnessVar.monoploid((polder<?>) obj);
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                if (z) {
                                    polderVar.polloi(i7);
                                }
                            } else {
                                i2 = i4;
                            }
                            j >>= i2;
                            i6++;
                            i4 = i2;
                        }
                        if (i5 != i4) {
                            break;
                        }
                        if (i3 != length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return Unit.f29295attabal;
    }

    public final InvalidationResult adultoid(Object value) {
        InvalidationResult invalidationResultImpassible;
        dhss dhssVar = this.owner;
        return (dhssVar == null || (invalidationResultImpassible = dhssVar.impassible(this, value)) == null) ? InvalidationResult.IGNORED : invalidationResultImpassible;
    }

    public final boolean apical() {
        return (this.flags & 64) != 0;
    }

    public final boolean arytenoidectomy() {
        return (this.flags & 512) != 0;
    }

    @Override // androidx.compose.runtime.licking
    public void attabal(Function2<? super taiyuan, ? super Integer, Unit> block) {
        this.block = block;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0058 A[LOOP:0: B:9:0x001c->B:22:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[SYNTHETIC] */
    public final Function1<molybdenite, Unit> beachfront(final int token) {
        final androidx.collection.polder<Object> polderVar = this.trackedInstances;
        if (polderVar != null && !polloi()) {
            Object[] objArr = polderVar.keys;
            int[] iArr = polderVar.values;
            long[] jArr = polderVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                if (iArr[i4] != token) {
                                    return new Function1() { // from class: androidx.compose.runtime.herdbook
                                        @Override // p002kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return technofreak.competently(this.f5979kowloon, token, polderVar, (molybdenite) obj2);
                                        }
                                    };
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
        }
        return null;
    }

    public final void cord() {
        dhss dhssVar = this.owner;
        if (dhssVar != null) {
            dhssVar.dern(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
        this.block = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[LOOP:0: B:10:0x001b->B:23:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[EDGE_INSN: B:32:0x0058->B:24:0x0058 BREAK  A[LOOP:0: B:10:0x001b->B:23:0x0055], SYNTHETIC] */
    public final void cuirassed() {
        androidx.collection.polder<Object> polderVar;
        dhss dhssVar = this.owner;
        if (dhssVar == null || (polderVar = this.trackedInstances) == null) {
            return;
        }
        supplicat(true);
        try {
            Object[] objArr = polderVar.keys;
            int[] iArr = polderVar.values;
            long[] jArr = polderVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                int i5 = iArr[i4];
                                dhssVar.saneness(obj);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        } finally {
            supplicat(false);
        }
    }

    public final boolean cutely() {
        return (this.flags & 2) != 0;
    }

    public final void dern(dhss owner) {
        this.owner = owner;
    }

    public final boolean dovishness() {
        return this.trackedDependencies != null;
    }

    public final boolean formularize() {
        return (this.flags & 256) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x006e A[LOOP:0: B:19:0x002f->B:33:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[EDGE_INSN: B:36:0x0071->B:34:0x0071 BREAK  A[LOOP:0: B:19:0x002f->B:33:0x006e], SYNTHETIC] */
    public final boolean gintrap(Object instances) {
        androidx.collection.grimness<polder<?>, Object> grimnessVar;
        if (instances == null || (grimnessVar = this.trackedDependencies) == null) {
            return true;
        }
        if (instances instanceof polder) {
            return wireman((polder) instances, grimnessVar);
        }
        if (!(instances instanceof ScatterSet)) {
            return true;
        }
        ScatterSet scatterSet = (ScatterSet) instances;
        if (scatterSet.marial()) {
            Object[] objArr = scatterSet.elements;
            long[] jArr = scatterSet.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (!(obj instanceof polder) || wireman((polder) obj, grimnessVar)) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i != length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return false;
    }

    public final boolean graveside() {
        if (this.owner != null) {
            saneness sanenessVar = this.anchor;
            if (sanenessVar != null ? sanenessVar.saneness() : false) {
                return true;
            }
        }
        return false;
    }

    public final void grimness(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 1 : i & (-2);
    }

    public final boolean impassible() {
        return (this.flags & 8) != 0;
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final saneness getAnchor() {
        return this.anchor;
    }

    @Override // androidx.compose.runtime.hardpan
    public void invalidate() {
        dhss dhssVar = this.owner;
        if (dhssVar != null) {
            dhssVar.impassible(this, null);
        }
    }

    public final void kattegat(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 8 : i & (-9);
    }

    public final boolean kowloon() {
        return (this.flags & 1024) != 0;
    }

    public final void marial(taiyuan composer) {
        Function2<? super taiyuan, ? super Integer, Unit> function2 = this.block;
        if (function2 == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
        function2.invoke(composer, 1);
    }

    public final void merc(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 512 : i & (-513);
    }

    public final boolean molybdenite() {
        return (this.flags & 1) != 0;
    }

    public final boolean monoploid() {
        return (this.flags & 128) != 0;
    }

    public final void oilcan(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 4 : i & (-5);
    }

    public final void polder(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 128 : i & (-129);
    }

    public final boolean polloi() {
        return (this.flags & 16) != 0;
    }

    public final boolean preprohormone(Object instance) {
        int i = 0;
        if (triweekly()) {
            return false;
        }
        androidx.collection.polder<Object> polderVar = this.trackedInstances;
        int i2 = 1;
        if (polderVar == null) {
            polderVar = new androidx.collection.polder<>(i, i2, null);
            this.trackedInstances = polderVar;
        }
        return polderVar.monoploid(instance, this.currentToken, -1) == this.currentToken;
    }

    public final void restrictive(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 1024 : i & (-1025);
    }

    public final void rotuma(polder<?> instance, Object value) {
        androidx.collection.grimness<polder<?>, Object> grimnessVar = this.trackedDependencies;
        if (grimnessVar == null) {
            grimnessVar = new androidx.collection.grimness<>(0, 1, null);
            this.trackedDependencies = grimnessVar;
        }
        grimnessVar.graveside(instance, value);
    }

    public final void saran(int token) {
        this.currentToken = token;
        seminary(false);
    }

    public final void sealless(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 256 : i & (-257);
    }

    public final void seminary(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 16 : i & (-17);
    }

    public final void stratoscope() {
        if (monoploid()) {
            return;
        }
        seminary(true);
    }

    public final void supplicat(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 32 : i & (-33);
    }

    public final boolean taiyuan() {
        return this.block != null;
    }

    public final boolean triweekly() {
        return (this.flags & 32) != 0;
    }

    public final void trm(saneness sanenessVar) {
        this.anchor = sanenessVar;
    }

    public final boolean wireman(polder<?> polderVar, androidx.collection.grimness<polder<?>, Object> grimnessVar) {
        Intrinsics.competently(polderVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        tailoring<?> tailoringVarAttabal = polderVar.attabal();
        if (tailoringVarAttabal == null) {
            tailoringVarAttabal = liable.competently();
        }
        return !tailoringVarAttabal.saneness(polderVar.molybdenite().attabal(), grimnessVar.dern(polderVar));
    }

    public final void yemenite(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 64 : i & (-65);
    }
}

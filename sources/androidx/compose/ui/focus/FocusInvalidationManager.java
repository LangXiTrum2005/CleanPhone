package androidx.compose.ui.focus;

import androidx.collection.mathsort;
import androidx.collection.saran;
import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FocusInvalidationManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001f¨\u0006$"}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestApplyChangesListener", "invalidateOwnerFocusState", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/focus/FocusTargetNode;", "node", "competently", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/wireman;", "marial", "(Landroidx/compose/ui/focus/wireman;)V", "Landroidx/compose/ui/focus/impassible;", "beachfront", "(Landroidx/compose/ui/focus/impassible;)V", "", "saneness", "()Z", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/collection/saran;", "wireman", "(Landroidx/collection/saran;Ljava/lang/Object;)V", "dern", "()V", "attabal", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Landroidx/collection/saran;", "focusTargetNodes", "focusEventNodes", "focusPropertiesNodes", "focusTargetsWithInvalidatedFocusEvents", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusInvalidationManager {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function1<Function0<Unit>, Unit> onRequestApplyChangesListener;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Function0<Unit> invalidateOwnerFocusState;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final saran<FocusTargetNode> focusTargetNodes = mathsort.attabal();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final saran<wireman> focusEventNodes = mathsort.attabal();

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final saran<impassible> focusPropertiesNodes = mathsort.attabal();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final saran<FocusTargetNode> focusTargetsWithInvalidatedFocusEvents = mathsort.attabal();

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(Function1<? super Function0<Unit>, Unit> function1, Function0<Unit> function0) {
        this.onRequestApplyChangesListener = function1;
        this.invalidateOwnerFocusState = function0;
    }

    public final void beachfront(impassible node) {
        wireman(this.focusPropertiesNodes, node);
    }

    public final void competently(FocusTargetNode node) {
        wireman(this.focusTargetNodes, node);
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0190  */
    public final void dern() {
        char c;
        long j;
        long j2;
        int i;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        long j3;
        int i2;
        molybdenite molybdeniteVarLightstruck;
        int i3;
        androidx.compose.runtime.collection.dern dernVar;
        Object[] objArr3;
        long j4;
        long j5;
        long[] jArr3;
        long[] jArr4;
        int i4;
        long[] jArr5;
        int i5;
        saran<impassible> saranVar = this.focusPropertiesNodes;
        Object[] objArr4 = saranVar.elements;
        long[] jArr6 = saranVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr6.length - 2;
        char c2 = 7;
        int i6 = 16;
        int i7 = 8;
        int i8 = 1;
        int i9 = 0;
        if (length >= 0) {
            int i10 = 0;
            j = 255;
            while (true) {
                long j6 = jArr6[i10];
                j2 = -9187201950435737472L;
                if ((((~j6) << c2) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = i9;
                    while (i12 < i11) {
                        if ((j6 & 255) < 128) {
                            impassible impassibleVar = (impassible) objArr4[(i10 << 3) + i12];
                            if (impassibleVar.getNode().getIsAttached()) {
                                int iAttabal = androidx.compose.ui.node.saran.attabal(1024);
                                androidx.compose.ui.attabal.dern node = impassibleVar.getNode();
                                androidx.compose.runtime.collection.dern dernVar2 = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        this.focusTargetNodes.impromptu((FocusTargetNode) node);
                                    } else if ((node.getKindSet() & iAttabal) != 0 && (node instanceof androidx.compose.ui.node.competently)) {
                                        androidx.compose.ui.attabal.dern delegate = ((androidx.compose.ui.node.competently) node).getDelegate();
                                        i5 = i7;
                                        int i13 = i9;
                                        while (delegate != null) {
                                            if ((delegate.getKindSet() & iAttabal) != 0) {
                                                i13++;
                                                if (i13 == i8) {
                                                    jArr6 = jArr6;
                                                    node = delegate;
                                                } else {
                                                    androidx.compose.runtime.collection.dern dernVar3 = dernVar2 == null ? new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[i6], i9) : dernVar2;
                                                    if (node != null) {
                                                        dernVar3.saneness(node);
                                                        node = null;
                                                    }
                                                    dernVar3.saneness(delegate);
                                                    dernVar2 = dernVar3;
                                                }
                                            } else {
                                                jArr6 = jArr6;
                                            }
                                            delegate = delegate.getChild();
                                            jArr6 = jArr6;
                                            i8 = 1;
                                        }
                                        jArr5 = jArr6;
                                        int i14 = i8;
                                        if (i13 == i14) {
                                            i8 = i14;
                                            i7 = i5;
                                            jArr6 = jArr5;
                                        } else {
                                            node = androidx.compose.ui.node.beachfront.beachfront(dernVar2);
                                            i7 = i5;
                                            jArr6 = jArr5;
                                            i8 = 1;
                                        }
                                    }
                                    jArr5 = jArr6;
                                    i5 = i7;
                                    node = androidx.compose.ui.node.beachfront.beachfront(dernVar2);
                                    i7 = i5;
                                    jArr6 = jArr5;
                                    i8 = 1;
                                }
                                jArr4 = jArr6;
                                i4 = i7;
                                if (!impassibleVar.getNode().getIsAttached()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                androidx.compose.runtime.collection.dern dernVar4 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[i6], i9);
                                androidx.compose.ui.attabal.dern child = impassibleVar.getNode().getChild();
                                if (child == null) {
                                    androidx.compose.ui.node.beachfront.dern(dernVar4, impassibleVar.getNode());
                                } else {
                                    dernVar4.saneness(child);
                                }
                                while (dernVar4.kowloon()) {
                                    androidx.compose.ui.attabal.dern dernVarBeachfront = (androidx.compose.ui.attabal.dern) dernVar4.molybdenite(dernVar4.getSize() - 1);
                                    if ((dernVarBeachfront.getAggregateChildKindSet() & iAttabal) == 0) {
                                        androidx.compose.ui.node.beachfront.dern(dernVar4, dernVarBeachfront);
                                    } else {
                                        while (dernVarBeachfront != null) {
                                            if ((dernVarBeachfront.getKindSet() & iAttabal) != 0) {
                                                androidx.compose.runtime.collection.dern dernVar5 = null;
                                                while (dernVarBeachfront != null) {
                                                    if (dernVarBeachfront instanceof FocusTargetNode) {
                                                        this.focusTargetNodes.impromptu((FocusTargetNode) dernVarBeachfront);
                                                    } else {
                                                        if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                                            androidx.compose.ui.attabal.dern delegate2 = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate();
                                                            int i15 = i9;
                                                            while (delegate2 != null) {
                                                                if ((delegate2.getKindSet() & iAttabal) != 0) {
                                                                    i15++;
                                                                    if (i15 == 1) {
                                                                        dernVarBeachfront = delegate2;
                                                                    } else {
                                                                        if (dernVar5 == null) {
                                                                            dernVar5 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[i6], 0);
                                                                        }
                                                                        if (dernVarBeachfront != null) {
                                                                            dernVar5.saneness(dernVarBeachfront);
                                                                            dernVarBeachfront = null;
                                                                        }
                                                                        dernVar5.saneness(delegate2);
                                                                    }
                                                                }
                                                                delegate2 = delegate2.getChild();
                                                                i6 = 16;
                                                            }
                                                            if (i15 == 1) {
                                                            }
                                                        }
                                                        i9 = 0;
                                                        i6 = 16;
                                                    }
                                                    dernVarBeachfront = androidx.compose.ui.node.beachfront.beachfront(dernVar5);
                                                    i9 = 0;
                                                    i6 = 16;
                                                }
                                                break;
                                            }
                                            dernVarBeachfront = dernVarBeachfront.getChild();
                                            i9 = 0;
                                            i6 = 16;
                                        }
                                    }
                                }
                            } else {
                                jArr4 = jArr6;
                                i4 = i7;
                            }
                        } else {
                            jArr4 = jArr6;
                            i4 = i7;
                        }
                        j6 >>= i4;
                        i12++;
                        c2 = c2;
                        i7 = i4;
                        jArr6 = jArr4;
                        i8 = 1;
                        i9 = 0;
                        i6 = 16;
                    }
                    jArr3 = jArr6;
                    c = c2;
                    if (i11 != i7) {
                        break;
                    }
                } else {
                    jArr3 = jArr6;
                    c = c2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c2 = c;
                jArr6 = jArr3;
                i8 = 1;
                i9 = 0;
                i6 = 16;
                i7 = 8;
            }
        } else {
            c = 7;
            j = 255;
            j2 = -9187201950435737472L;
        }
        this.focusPropertiesNodes.impassible();
        saran<wireman> saranVar2 = this.focusEventNodes;
        Object[] objArr5 = saranVar2.elements;
        long[] jArr7 = saranVar2.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length2 = jArr7.length - 2;
        if (length2 >= 0) {
            int i16 = 0;
            while (true) {
                long j7 = jArr7[i16];
                if ((((~j7) << c) & j7 & j2) != j2) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j7 & j) < 128) {
                            wireman wiremanVar = (wireman) objArr5[(i16 << 3) + i18];
                            if (wiremanVar.getNode().getIsAttached()) {
                                int iAttabal2 = androidx.compose.ui.node.saran.attabal(1024);
                                androidx.compose.ui.attabal.dern node2 = wiremanVar.getNode();
                                boolean z = false;
                                boolean z2 = true;
                                FocusTargetNode focusTargetNode = null;
                                androidx.compose.runtime.collection.dern dernVar6 = null;
                                while (node2 != null) {
                                    long[] jArr8 = jArr7;
                                    if (node2 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node2;
                                        if (focusTargetNode != null) {
                                            z = true;
                                        }
                                        if (this.focusTargetNodes.attabal(focusTargetNode2)) {
                                            this.focusTargetsWithInvalidatedFocusEvents.impromptu(focusTargetNode2);
                                            z2 = false;
                                        }
                                        objArr3 = objArr5;
                                        j4 = j7;
                                        focusTargetNode = focusTargetNode2;
                                    } else if ((node2.getKindSet() & iAttabal2) == 0 || !(node2 instanceof androidx.compose.ui.node.competently)) {
                                        objArr3 = objArr5;
                                        j4 = j7;
                                    } else {
                                        androidx.compose.ui.attabal.dern delegate3 = ((androidx.compose.ui.node.competently) node2).getDelegate();
                                        objArr3 = objArr5;
                                        int i19 = 0;
                                        while (delegate3 != null) {
                                            if ((delegate3.getKindSet() & iAttabal2) != 0) {
                                                i19++;
                                                j5 = j7;
                                                if (i19 == 1) {
                                                    node2 = delegate3;
                                                } else {
                                                    androidx.compose.runtime.collection.dern dernVar7 = dernVar6 == null ? new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0) : dernVar6;
                                                    if (node2 != null) {
                                                        dernVar7.saneness(node2);
                                                        node2 = null;
                                                    }
                                                    dernVar7.saneness(delegate3);
                                                    dernVar6 = dernVar7;
                                                    i19 = i19;
                                                }
                                            } else {
                                                j5 = j7;
                                            }
                                            delegate3 = delegate3.getChild();
                                            j7 = j5;
                                        }
                                        j4 = j7;
                                        if (i19 == 1) {
                                        }
                                        jArr7 = jArr8;
                                        objArr5 = objArr3;
                                        j7 = j4;
                                    }
                                    node2 = androidx.compose.ui.node.beachfront.beachfront(dernVar6);
                                    jArr7 = jArr8;
                                    objArr5 = objArr3;
                                    j7 = j4;
                                }
                                jArr2 = jArr7;
                                objArr2 = objArr5;
                                j3 = j7;
                                if (!wiremanVar.getNode().getIsAttached()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                androidx.compose.runtime.collection.dern dernVar8 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                androidx.compose.ui.attabal.dern child2 = wiremanVar.getNode().getChild();
                                if (child2 == null) {
                                    androidx.compose.ui.node.beachfront.dern(dernVar8, wiremanVar.getNode());
                                } else {
                                    dernVar8.saneness(child2);
                                }
                                while (dernVar8.kowloon()) {
                                    androidx.compose.ui.attabal.dern dernVarBeachfront2 = (androidx.compose.ui.attabal.dern) dernVar8.molybdenite(dernVar8.getSize() - 1);
                                    if ((dernVarBeachfront2.getAggregateChildKindSet() & iAttabal2) == 0) {
                                        androidx.compose.ui.node.beachfront.dern(dernVar8, dernVarBeachfront2);
                                    } else {
                                        while (true) {
                                            if (dernVarBeachfront2 != null) {
                                                if ((dernVarBeachfront2.getKindSet() & iAttabal2) != 0) {
                                                    androidx.compose.runtime.collection.dern dernVar9 = null;
                                                    while (dernVarBeachfront2 != null) {
                                                        if (dernVarBeachfront2 instanceof FocusTargetNode) {
                                                            FocusTargetNode focusTargetNode3 = (FocusTargetNode) dernVarBeachfront2;
                                                            if (focusTargetNode != null) {
                                                                z = true;
                                                            }
                                                            if (this.focusTargetNodes.attabal(focusTargetNode3)) {
                                                                this.focusTargetsWithInvalidatedFocusEvents.impromptu(focusTargetNode3);
                                                                z2 = false;
                                                            }
                                                            focusTargetNode = focusTargetNode3;
                                                        } else {
                                                            if ((dernVarBeachfront2.getKindSet() & iAttabal2) != 0 && (dernVarBeachfront2 instanceof androidx.compose.ui.node.competently)) {
                                                                androidx.compose.ui.attabal.dern delegate4 = ((androidx.compose.ui.node.competently) dernVarBeachfront2).getDelegate();
                                                                int i20 = 0;
                                                                while (delegate4 != null) {
                                                                    if ((delegate4.getKindSet() & iAttabal2) != 0) {
                                                                        i20++;
                                                                        dernVar = dernVar8;
                                                                        if (i20 == 1) {
                                                                            dernVarBeachfront2 = delegate4;
                                                                        } else {
                                                                            if (dernVar9 == null) {
                                                                                dernVar9 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                                                            }
                                                                            if (dernVarBeachfront2 != null) {
                                                                                dernVar9.saneness(dernVarBeachfront2);
                                                                                dernVarBeachfront2 = null;
                                                                            }
                                                                            dernVar9.saneness(delegate4);
                                                                        }
                                                                        delegate4 = delegate4.getChild();
                                                                        dernVar8 = dernVar;
                                                                        i18 = i18;
                                                                    } else {
                                                                        dernVar = dernVar8;
                                                                    }
                                                                    i18 = i18;
                                                                    delegate4 = delegate4.getChild();
                                                                    dernVar8 = dernVar;
                                                                    i18 = i18;
                                                                }
                                                                dernVar8 = dernVar8;
                                                                i3 = i18;
                                                                if (i20 != 1) {
                                                                    dernVarBeachfront2 = androidx.compose.ui.node.beachfront.beachfront(dernVar9);
                                                                }
                                                            }
                                                            dernVar8 = dernVar8;
                                                            i18 = i3;
                                                        }
                                                        i3 = i18;
                                                        dernVarBeachfront2 = androidx.compose.ui.node.beachfront.beachfront(dernVar9);
                                                        dernVar8 = dernVar8;
                                                        i18 = i3;
                                                    }
                                                } else {
                                                    dernVarBeachfront2 = dernVarBeachfront2.getChild();
                                                    dernVar8 = dernVar8;
                                                }
                                            }
                                        }
                                    }
                                    dernVar8 = dernVar8;
                                    i18 = i18;
                                }
                                i2 = i18;
                                if (z2) {
                                    if (z) {
                                        molybdeniteVarLightstruck = marial.attabal(wiremanVar);
                                    } else if (focusTargetNode == null || (molybdeniteVarLightstruck = focusTargetNode.lightstruck()) == null) {
                                        molybdeniteVarLightstruck = FocusStateImpl.Inactive;
                                    }
                                    wiremanVar.taiyuan(molybdeniteVarLightstruck);
                                }
                            } else {
                                wiremanVar.taiyuan(FocusStateImpl.Inactive);
                                jArr2 = jArr7;
                                objArr2 = objArr5;
                                j3 = j7;
                                i2 = i18;
                            }
                        } else {
                            jArr2 = jArr7;
                            objArr2 = objArr5;
                            j3 = j7;
                            i2 = i18;
                        }
                        i18 = i2 + 1;
                        j7 = j3 >> 8;
                        jArr7 = jArr2;
                        objArr5 = objArr2;
                    }
                    jArr = jArr7;
                    objArr = objArr5;
                    i = 0;
                    if (i17 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr7;
                    objArr = objArr5;
                    i = 0;
                }
                if (i16 == length2) {
                    break;
                }
                i16++;
                jArr7 = jArr;
                objArr5 = objArr;
            }
        } else {
            i = 0;
        }
        this.focusEventNodes.impassible();
        saran<FocusTargetNode> saranVar3 = this.focusTargetNodes;
        Object[] objArr6 = saranVar3.elements;
        long[] jArr9 = saranVar3.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length3 = jArr9.length - 2;
        if (length3 >= 0) {
            int i21 = i;
            while (true) {
                long j8 = jArr9[i21];
                if ((((~j8) << c) & j8 & j2) != j2) {
                    int i22 = 8 - ((~(i21 - length3)) >>> 31);
                    for (int i23 = i; i23 < i22; i23++) {
                        if ((j8 & j) < 128) {
                            FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr6[(i21 << 3) + i23];
                            if (focusTargetNode4.getIsAttached()) {
                                FocusStateImpl focusStateImplLightstruck = focusTargetNode4.lightstruck();
                                focusTargetNode4.claque();
                                if (focusStateImplLightstruck != focusTargetNode4.lightstruck() || this.focusTargetsWithInvalidatedFocusEvents.attabal(focusTargetNode4)) {
                                    marial.dern(focusTargetNode4);
                                }
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i22 != 8) {
                        break;
                    }
                }
                if (i21 == length3) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        this.focusTargetNodes.impassible();
        this.focusTargetsWithInvalidatedFocusEvents.impassible();
        this.invalidateOwnerFocusState.invoke();
        if (!this.focusPropertiesNodes.wireman()) {
            peridotite.attabal.saneness("Unprocessed FocusProperties nodes");
        }
        if (!this.focusEventNodes.wireman()) {
            peridotite.attabal.saneness("Unprocessed FocusEvent nodes");
        }
        if (this.focusTargetNodes.wireman()) {
            return;
        }
        peridotite.attabal.saneness("Unprocessed FocusTarget nodes");
    }

    public final void marial(wireman node) {
        wireman(this.focusEventNodes, node);
    }

    public final boolean saneness() {
        return this.focusTargetNodes.marial() || this.focusPropertiesNodes.marial() || this.focusEventNodes.marial();
    }

    public final <T> void wireman(saran<T> saranVar, T t) {
        if (saranVar.impromptu(t) && this.focusTargetNodes.get_size() + this.focusEventNodes.get_size() + this.focusPropertiesNodes.get_size() == 1) {
            this.onRequestApplyChangesListener.invoke(new FocusInvalidationManager$scheduleInvalidation$1(this));
        }
    }
}

package androidx.compose.ui.modifier;

import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.peridotite;
import com.ironsource.X3;
import java.util.HashSet;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: ModifierLocalManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u0010\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u0011\u0010\u000fJ1\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00122\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u001e\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "Landroidx/compose/ui/node/peridotite;", "owner", "<init>", "(Landroidx/compose/ui/node/peridotite;)V", "", "saneness", "()V", "marial", "Landroidx/compose/ui/node/BackwardsCompatNode;", "node", "Landroidx/compose/ui/modifier/dern;", X3.i.W, "beachfront", "(Landroidx/compose/ui/node/BackwardsCompatNode;Landroidx/compose/ui/modifier/dern;)V", "attabal", "wireman", "Landroidx/compose/ui/attabal$dern;", "", "set", "dern", "(Landroidx/compose/ui/attabal$dern;Landroidx/compose/ui/modifier/dern;Ljava/util/Set;)V", "Landroidx/compose/ui/node/peridotite;", "getOwner", "()Landroidx/compose/ui/node/peridotite;", "Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/runtime/collection/dern;", "inserted", "insertedLocal", "Landroidx/compose/ui/node/LayoutNode;", "removed", "removedLocal", "", "Z", "invalidated", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ModifierLocalManager {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final peridotite owner;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public boolean invalidated;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<BackwardsCompatNode> inserted = new androidx.compose.runtime.collection.dern<>(new BackwardsCompatNode[16], 0);

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<dern<?>> insertedLocal = new androidx.compose.runtime.collection.dern<>(new dern[16], 0);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<LayoutNode> removed = new androidx.compose.runtime.collection.dern<>(new LayoutNode[16], 0);

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<dern<?>> removedLocal = new androidx.compose.runtime.collection.dern<>(new dern[16], 0);

    public ModifierLocalManager(peridotite peridotiteVar) {
        this.owner = peridotiteVar;
    }

    public final void attabal(BackwardsCompatNode node, dern<?> key) {
        this.inserted.saneness(node);
        this.insertedLocal.saneness(key);
        saneness();
    }

    public final void beachfront(BackwardsCompatNode node, dern<?> key) {
        this.inserted.saneness(node);
        this.insertedLocal.saneness(key);
        saneness();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final void dern(androidx.compose.ui.attabal.dern r13, androidx.compose.ui.modifier.dern<?> r14, java.util.Set<androidx.compose.ui.node.BackwardsCompatNode> r15) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.modifier.ModifierLocalManager.dern(androidx.compose.ui.attabal$dern, androidx.compose.ui.modifier.dern, java.util.Set):void");
    }

    public final void marial() {
        int i = 0;
        this.invalidated = false;
        HashSet hashSet = new HashSet();
        androidx.compose.runtime.collection.dern<LayoutNode> dernVar = this.removed;
        int size = dernVar.getSize();
        if (size > 0) {
            LayoutNode[] layoutNodeArrApical = dernVar.apical();
            int i2 = 0;
            do {
                LayoutNode layoutNode = layoutNodeArrApical[i2];
                dern<?> dernVar2 = this.removedLocal.apical()[i2];
                if (layoutNode.getNodes().getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String().getIsAttached()) {
                    dern(layoutNode.getNodes().getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String(), dernVar2, hashSet);
                }
                i2++;
            } while (i2 < size);
        }
        this.removed.impromptu();
        this.removedLocal.impromptu();
        androidx.compose.runtime.collection.dern<BackwardsCompatNode> dernVar3 = this.inserted;
        int size2 = dernVar3.getSize();
        if (size2 > 0) {
            BackwardsCompatNode[] backwardsCompatNodeArrApical = dernVar3.apical();
            do {
                BackwardsCompatNode backwardsCompatNode = backwardsCompatNodeArrApical[i];
                dern<?> dernVar4 = this.insertedLocal.apical()[i];
                if (backwardsCompatNode.getIsAttached()) {
                    dern(backwardsCompatNode, dernVar4, hashSet);
                }
                i++;
            } while (i < size2);
        }
        this.inserted.impromptu();
        this.insertedLocal.impromptu();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((BackwardsCompatNode) it.next()).monroe();
        }
    }

    public final void saneness() {
        if (this.invalidated) {
            return;
        }
        this.invalidated = true;
        this.owner.adultoid(new Function0<Unit>() { // from class: androidx.compose.ui.modifier.ModifierLocalManager$invalidate$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.marial();
            }
        });
    }

    public final void wireman(BackwardsCompatNode node, dern<?> key) {
        this.removed.saneness(androidx.compose.ui.node.beachfront.impromptu(node));
        this.removedLocal.saneness(key);
        saneness();
    }
}

package androidx.compose.ui.platform;

import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.p001lifecycle.Lifecycle;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Landroidx/compose/runtime/molybdenite;", "Landroidx/lifecycle/impassible;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "original", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/molybdenite;)V", "Lkotlin/Function0;", "", "content", "competently", "(Lkotlin/jvm/functions/Function2;)V", "attabal", "()V", "Landroidx/lifecycle/arytenoidectomy;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "onStateChanged", "(Landroidx/lifecycle/arytenoidectomy;Landroidx/lifecycle/Lifecycle$Event;)V", "kowloon", "Landroidx/compose/ui/platform/AndroidComposeView;", "stratoscope", "()Landroidx/compose/ui/platform/AndroidComposeView;", "arytenoidectomy", "Landroidx/compose/runtime/molybdenite;", "cuirassed", "()Landroidx/compose/runtime/molybdenite;", "", "monoploid", "Z", "disposed", "Landroidx/lifecycle/Lifecycle;", "polloi", "Landroidx/lifecycle/Lifecycle;", "addedToLifecycle", "molybdenite", "Lkotlin/jvm/functions/Function2;", "lastContent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WrappedComposition implements androidx.compose.runtime.molybdenite, androidx.p001lifecycle.impassible {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.molybdenite original;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final AndroidComposeView owner;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public Function2<? super androidx.compose.runtime.taiyuan, ? super Integer, Unit> lastContent = ComposableSingletons$Wrapper_androidKt.f7277attabal.attabal();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean disposed;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public Lifecycle addedToLifecycle;

    public WrappedComposition(AndroidComposeView androidComposeView, androidx.compose.runtime.molybdenite molybdeniteVar) {
        this.owner = androidComposeView;
        this.original = molybdeniteVar;
    }

    @Override // androidx.compose.runtime.molybdenite
    public void attabal() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(yemenite.wireman.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.wireman(this);
            }
        }
        this.original.attabal();
    }

    @Override // androidx.compose.runtime.molybdenite
    public void competently(final Function2<? super androidx.compose.runtime.taiyuan, ? super Integer, Unit> content) {
        this.owner.setOnViewTreeOwnersAvailable(new Function1<AndroidComposeView.saneness, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AndroidComposeView.saneness sanenessVar) {
                invoke2(sanenessVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AndroidComposeView.saneness sanenessVar) {
                if (this.this$0.disposed) {
                    return;
                }
                Lifecycle lifecycle = sanenessVar.getLifecycleOwner().getLifecycle();
                this.this$0.lastContent = content;
                if (this.this$0.addedToLifecycle == null) {
                    this.this$0.addedToLifecycle = lifecycle;
                    lifecycle.attabal(this.this$0);
                } else if (lifecycle.getState().isAtLeast(Lifecycle.State.CREATED)) {
                    androidx.compose.runtime.molybdenite original = this.this$0.getOriginal();
                    final WrappedComposition wrappedComposition = this.this$0;
                    final Function2<androidx.compose.runtime.taiyuan, Integer, Unit> function2 = content;
                    original.competently(cuirassed.wireman.saneness(-2000640158, true, new Function2<androidx.compose.runtime.taiyuan, Integer, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // p002kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.taiyuan taiyuanVar, Integer num) {
                            invoke(taiyuanVar, num.intValue());
                            return Unit.f29295attabal;
                        }

                        public final void invoke(androidx.compose.runtime.taiyuan taiyuanVar, int i) {
                            if ((i & 3) == 2 && taiyuanVar.saneness()) {
                                taiyuanVar.kowloon();
                                return;
                            }
                            if (androidx.compose.runtime.polloi.grimness()) {
                                androidx.compose.runtime.polloi.mathsort(-2000640158, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:134)");
                            }
                            Object tag = wrappedComposition.getOwner().getTag(yemenite.wireman.inspection_slot_table_set);
                            Set<oilcan.marial> set = p002kotlin.jvm.internal.rotuma.arytenoidectomy(tag) ? (Set) tag : null;
                            if (set == null) {
                                Object parent = wrappedComposition.getOwner().getParent();
                                View view = parent instanceof View ? (View) parent : null;
                                Object tag2 = view != null ? view.getTag(yemenite.wireman.inspection_slot_table_set) : null;
                                set = p002kotlin.jvm.internal.rotuma.arytenoidectomy(tag2) ? (Set) tag2 : null;
                            }
                            if (set != null) {
                                set.add(taiyuanVar.formularize());
                                taiyuanVar.taiyuan();
                            }
                            AndroidComposeView owner = wrappedComposition.getOwner();
                            boolean zImpassible = taiyuanVar.impassible(wrappedComposition);
                            WrappedComposition wrappedComposition2 = wrappedComposition;
                            Object objApical = taiyuanVar.apical();
                            if (zImpassible || objApical == androidx.compose.runtime.taiyuan.INSTANCE.attabal()) {
                                objApical = new WrappedComposition$setContent$1$1$1$1(wrappedComposition2, null);
                                taiyuanVar.competently(objApical);
                            }
                            androidx.compose.runtime.hydrovane.saneness(owner, (Function2) objApical, taiyuanVar, 0);
                            AndroidComposeView owner2 = wrappedComposition.getOwner();
                            boolean zImpassible2 = taiyuanVar.impassible(wrappedComposition);
                            WrappedComposition wrappedComposition3 = wrappedComposition;
                            Object objApical2 = taiyuanVar.apical();
                            if (zImpassible2 || objApical2 == androidx.compose.runtime.taiyuan.INSTANCE.attabal()) {
                                objApical2 = new WrappedComposition$setContent$1$1$2$1(wrappedComposition3, null);
                                taiyuanVar.competently(objApical2);
                            }
                            androidx.compose.runtime.hydrovane.saneness(owner2, (Function2) objApical2, taiyuanVar, 0);
                            androidx.compose.runtime.claque<Set<oilcan.marial>> claqueVarWireman = oilcan.kowloon.dern().wireman(set);
                            final WrappedComposition wrappedComposition4 = wrappedComposition;
                            final Function2<androidx.compose.runtime.taiyuan, Integer, Unit> function3 = function2;
                            androidx.compose.runtime.stratoscope.dern(claqueVarWireman, cuirassed.wireman.wireman(-1193460702, true, new Function2<androidx.compose.runtime.taiyuan, Integer, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // p002kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.taiyuan taiyuanVar2, Integer num) {
                                    invoke(taiyuanVar2, num.intValue());
                                    return Unit.f29295attabal;
                                }

                                public final void invoke(androidx.compose.runtime.taiyuan taiyuanVar2, int i2) {
                                    if ((i2 & 3) == 2 && taiyuanVar2.saneness()) {
                                        taiyuanVar2.kowloon();
                                        return;
                                    }
                                    if (androidx.compose.runtime.polloi.grimness()) {
                                        androidx.compose.runtime.polloi.mathsort(-1193460702, i2, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:154)");
                                    }
                                    AndroidCompositionLocals_androidKt.attabal(wrappedComposition4.getOwner(), function3, taiyuanVar2, 0);
                                    if (androidx.compose.runtime.polloi.grimness()) {
                                        androidx.compose.runtime.polloi.peridotite();
                                    }
                                }
                            }, taiyuanVar, 54), taiyuanVar, androidx.compose.runtime.claque.f5860taiyuan | 48);
                            if (androidx.compose.runtime.polloi.grimness()) {
                                androidx.compose.runtime.polloi.peridotite();
                            }
                        }
                    }));
                }
            }
        });
    }

    /* JADX INFO: renamed from: cuirassed, reason: from getter */
    public final androidx.compose.runtime.molybdenite getOriginal() {
        return this.original;
    }

    @Override // androidx.p001lifecycle.impassible
    public void onStateChanged(androidx.p001lifecycle.arytenoidectomy source, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            attabal();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.disposed) {
                return;
            }
            competently(this.lastContent);
        }
    }

    /* JADX INFO: renamed from: stratoscope, reason: from getter */
    public final AndroidComposeView getOwner() {
        return this.owner;
    }
}

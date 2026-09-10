package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import com.charging.screenshow.battery.animations.themes.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController;", "", "Companion", "FragmentStateManagerOperation", "Operation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SpecialEffectsController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f5186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5188c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5189e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Companion;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static SpecialEffectsController a(ViewGroup container, SpecialEffectsControllerFactory factory) {
            Intrinsics.f(container, "container");
            Intrinsics.f(factory, "factory");
            Object tag = container.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            DefaultSpecialEffectsController defaultSpecialEffectsControllerA = factory.a(container);
            container.setTag(R.id.special_effects_controller_view_tag, defaultSpecialEffectsControllerA);
            return defaultSpecialEffectsControllerA;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FragmentStateManagerOperation extends Operation {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final FragmentStateManager f5190h;

        /* JADX WARN: Illegal instructions before constructor call */
        public FragmentStateManagerOperation(Operation.State state, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager, CancellationSignal cancellationSignal) {
            Fragment fragment = fragmentStateManager.f5150c;
            Intrinsics.e(fragment, "fragmentStateManager.fragment");
            super(state, lifecycleImpact, fragment, cancellationSignal);
            this.f5190h = fragmentStateManager;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void b() {
            super.b();
            this.f5190h.k();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void d() {
            Operation.LifecycleImpact lifecycleImpact = this.f5192b;
            Operation.LifecycleImpact lifecycleImpact2 = Operation.LifecycleImpact.f5195Y;
            FragmentStateManager fragmentStateManager = this.f5190h;
            if (lifecycleImpact != lifecycleImpact2) {
                if (lifecycleImpact == Operation.LifecycleImpact.Z) {
                    Fragment fragment = fragmentStateManager.f5150c;
                    Intrinsics.e(fragment, "fragmentStateManager.fragment");
                    View viewRequireView = fragment.requireView();
                    Intrinsics.e(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.I(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragment);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = fragmentStateManager.f5150c;
            Intrinsics.e(fragment2, "fragmentStateManager.fragment");
            View viewFindFocus = fragment2.mView.findFocus();
            if (viewFindFocus != null) {
                fragment2.setFocusedView(viewFindFocus);
                if (FragmentManager.I(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment2);
                }
            }
            View viewRequireView2 = this.f5193c.requireView();
            Intrinsics.e(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                fragmentStateManager.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation;", "", "LifecycleImpact", "State", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Operation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public State f5191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LifecycleImpact f5192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Fragment f5193c;
        public final ArrayList d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final LinkedHashSet f5194e;
        public boolean f;
        public boolean g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class LifecycleImpact {
            public static final LifecycleImpact X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public static final LifecycleImpact f5195Y;
            public static final LifecycleImpact Z;
            public static final /* synthetic */ LifecycleImpact[] e0;

            static {
                LifecycleImpact lifecycleImpact = new LifecycleImpact("NONE", 0);
                X = lifecycleImpact;
                LifecycleImpact lifecycleImpact2 = new LifecycleImpact("ADDING", 1);
                f5195Y = lifecycleImpact2;
                LifecycleImpact lifecycleImpact3 = new LifecycleImpact("REMOVING", 2);
                Z = lifecycleImpact3;
                e0 = new LifecycleImpact[]{lifecycleImpact, lifecycleImpact2, lifecycleImpact3};
            }

            public static LifecycleImpact valueOf(String str) {
                return (LifecycleImpact) Enum.valueOf(LifecycleImpact.class, str);
            }

            public static LifecycleImpact[] values() {
                return (LifecycleImpact[]) e0.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "", "Companion", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class State {
            public static final State X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public static final State f5196Y;
            public static final State Z;
            public static final State e0;
            public static final /* synthetic */ State[] f0;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public static State a(View view) {
                    Intrinsics.f(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? State.e0 : b(view.getVisibility());
                }

                public static State b(int i2) {
                    if (i2 == 0) {
                        return State.f5196Y;
                    }
                    if (i2 == 4) {
                        return State.e0;
                    }
                    if (i2 == 8) {
                        return State.Z;
                    }
                    throw new IllegalArgumentException(android.support.v4.media.a.h(i2, "Unknown visibility "));
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[2] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[3] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                }
            }

            static {
                State state = new State("REMOVED", 0);
                X = state;
                State state2 = new State("VISIBLE", 1);
                f5196Y = state2;
                State state3 = new State("GONE", 2);
                Z = state3;
                State state4 = new State("INVISIBLE", 3);
                e0 = state4;
                f0 = new State[]{state, state2, state3, state4};
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) f0.clone();
            }

            public final void a(View view) {
                Intrinsics.f(view, "view");
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.I(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    if (FragmentManager.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (iOrdinal == 2) {
                    if (FragmentManager.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (iOrdinal != 3) {
                    return;
                }
                if (FragmentManager.I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[0] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment, CancellationSignal cancellationSignal) {
            Intrinsics.f(fragment, "fragment");
            this.f5191a = state;
            this.f5192b = lifecycleImpact;
            this.f5193c = fragment;
            this.d = new ArrayList();
            this.f5194e = new LinkedHashSet();
            cancellationSignal.b(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.k
                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    SpecialEffectsController.Operation this$0 = this.X;
                    Intrinsics.f(this$0, "this$0");
                    this$0.a();
                }
            });
        }

        public final void a() {
            if (this.f) {
                return;
            }
            this.f = true;
            LinkedHashSet linkedHashSet = this.f5194e;
            if (linkedHashSet.isEmpty()) {
                b();
                return;
            }
            Iterator it = CollectionsKt.k0(linkedHashSet).iterator();
            while (it.hasNext()) {
                ((CancellationSignal) it.next()).a();
            }
        }

        public void b() {
            if (this.g) {
                return;
            }
            if (FragmentManager.I(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(State state, LifecycleImpact lifecycleImpact) {
            int iOrdinal = lifecycleImpact.ordinal();
            State state2 = State.X;
            Fragment fragment = this.f5193c;
            if (iOrdinal == 0) {
                if (this.f5191a != state2) {
                    if (FragmentManager.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f5191a + " -> " + state + '.');
                    }
                    this.f5191a = state;
                    return;
                }
                return;
            }
            if (iOrdinal == 1) {
                if (this.f5191a == state2) {
                    if (FragmentManager.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f5192b + " to ADDING.");
                    }
                    this.f5191a = State.f5196Y;
                    this.f5192b = LifecycleImpact.f5195Y;
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            if (FragmentManager.I(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f5191a + " -> REMOVED. mLifecycleImpact  = " + this.f5192b + " to REMOVING.");
            }
            this.f5191a = state2;
            this.f5192b = LifecycleImpact.Z;
        }

        public void d() {
        }

        public final String toString() {
            StringBuilder sbY = android.support.v4.media.a.y("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            sbY.append(this.f5191a);
            sbY.append(" lifecycleImpact = ");
            sbY.append(this.f5192b);
            sbY.append(" fragment = ");
            sbY.append(this.f5193c);
            sbY.append(AbstractJsonLexerKt.END_OBJ);
            return sbY.toString();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5197a;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5197a = iArr;
        }
    }

    public SpecialEffectsController(ViewGroup container) {
        Intrinsics.f(container, "container");
        this.f5186a = container;
        this.f5187b = new ArrayList();
        this.f5188c = new ArrayList();
    }

    public static final SpecialEffectsController f(ViewGroup container, FragmentManager fragmentManager) {
        Intrinsics.f(container, "container");
        Intrinsics.f(fragmentManager, "fragmentManager");
        SpecialEffectsControllerFactory specialEffectsControllerFactoryG = fragmentManager.G();
        Intrinsics.e(specialEffectsControllerFactoryG, "fragmentManager.specialEffectsControllerFactory");
        return Companion.a(container, specialEffectsControllerFactoryG);
    }

    public final void a(Operation.State state, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
        synchronized (this.f5187b) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            Fragment fragment = fragmentStateManager.f5150c;
            Intrinsics.e(fragment, "fragmentStateManager.fragment");
            Operation operationD = d(fragment);
            if (operationD != null) {
                operationD.c(state, lifecycleImpact);
                return;
            }
            final FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(state, lifecycleImpact, fragmentStateManager, cancellationSignal);
            this.f5187b.add(fragmentStateManagerOperation);
            final int i2 = 0;
            fragmentStateManagerOperation.d.add(new Runnable(this) { // from class: androidx.fragment.app.j

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public final /* synthetic */ SpecialEffectsController f5208Y;

                {
                    this.f5208Y = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            SpecialEffectsController this$0 = this.f5208Y;
                            Intrinsics.f(this$0, "this$0");
                            SpecialEffectsController.FragmentStateManagerOperation fragmentStateManagerOperation2 = fragmentStateManagerOperation;
                            if (this$0.f5187b.contains(fragmentStateManagerOperation2)) {
                                SpecialEffectsController.Operation.State state2 = fragmentStateManagerOperation2.f5191a;
                                View view = fragmentStateManagerOperation2.f5193c.mView;
                                Intrinsics.e(view, "operation.fragment.mView");
                                state2.a(view);
                            }
                            break;
                        default:
                            SpecialEffectsController this$1 = this.f5208Y;
                            Intrinsics.f(this$1, "this$0");
                            SpecialEffectsController.FragmentStateManagerOperation fragmentStateManagerOperation3 = fragmentStateManagerOperation;
                            this$1.f5187b.remove(fragmentStateManagerOperation3);
                            this$1.f5188c.remove(fragmentStateManagerOperation3);
                            break;
                    }
                }
            });
            final int i3 = 1;
            fragmentStateManagerOperation.d.add(new Runnable(this) { // from class: androidx.fragment.app.j

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public final /* synthetic */ SpecialEffectsController f5208Y;

                {
                    this.f5208Y = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            SpecialEffectsController this$0 = this.f5208Y;
                            Intrinsics.f(this$0, "this$0");
                            SpecialEffectsController.FragmentStateManagerOperation fragmentStateManagerOperation2 = fragmentStateManagerOperation;
                            if (this$0.f5187b.contains(fragmentStateManagerOperation2)) {
                                SpecialEffectsController.Operation.State state2 = fragmentStateManagerOperation2.f5191a;
                                View view = fragmentStateManagerOperation2.f5193c.mView;
                                Intrinsics.e(view, "operation.fragment.mView");
                                state2.a(view);
                            }
                            break;
                        default:
                            SpecialEffectsController this$1 = this.f5208Y;
                            Intrinsics.f(this$1, "this$0");
                            SpecialEffectsController.FragmentStateManagerOperation fragmentStateManagerOperation3 = fragmentStateManagerOperation;
                            this$1.f5187b.remove(fragmentStateManagerOperation3);
                            this$1.f5188c.remove(fragmentStateManagerOperation3);
                            break;
                    }
                }
            });
        }
    }

    public abstract void b(ArrayList arrayList, boolean z2);

    public final void c() {
        if (this.f5189e) {
            return;
        }
        ViewGroup viewGroup = this.f5186a;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.f5187b) {
            try {
                if (!this.f5187b.isEmpty()) {
                    ArrayList<Operation> arrayListJ0 = CollectionsKt.j0(this.f5188c);
                    this.f5188c.clear();
                    for (Operation operation : arrayListJ0) {
                        if (FragmentManager.I(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                        }
                        operation.a();
                        if (!operation.g) {
                            this.f5188c.add(operation);
                        }
                    }
                    h();
                    ArrayList arrayListJ1 = CollectionsKt.j0(this.f5187b);
                    this.f5187b.clear();
                    this.f5188c.addAll(arrayListJ1);
                    if (FragmentManager.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = arrayListJ1.iterator();
                    while (it.hasNext()) {
                        ((Operation) it.next()).d();
                    }
                    b(arrayListJ1, this.d);
                    this.d = false;
                    if (FragmentManager.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Operation d(Fragment fragment) {
        Object next;
        Iterator it = this.f5187b.iterator();
        while (it.hasNext()) {
            next = it.next();
            Operation operation = (Operation) next;
            if (Intrinsics.a(operation.f5193c, fragment) && !operation.f) {
                return (Operation) next;
            }
        }
        next = null;
        return (Operation) next;
    }

    public final void e() {
        if (FragmentManager.I(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f5186a;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f5187b) {
            try {
                h();
                Iterator it = this.f5187b.iterator();
                while (it.hasNext()) {
                    ((Operation) it.next()).d();
                }
                for (Operation operation : CollectionsKt.j0(this.f5188c)) {
                    if (FragmentManager.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f5186a + " is not attached to window. ") + "Cancelling running operation " + operation);
                    }
                    operation.a();
                }
                for (Operation operation2 : CollectionsKt.j0(this.f5187b)) {
                    if (FragmentManager.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f5186a + " is not attached to window. ") + "Cancelling pending operation " + operation2);
                    }
                    operation2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        Object objPrevious;
        synchronized (this.f5187b) {
            try {
                h();
                ArrayList arrayList = this.f5187b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    Operation operation = (Operation) objPrevious;
                    View view = operation.f5193c.mView;
                    Intrinsics.e(view, "operation.fragment.mView");
                    Operation.State stateA = Operation.State.Companion.a(view);
                    Operation.State state = operation.f5191a;
                    Operation.State state2 = Operation.State.f5196Y;
                    if (state == state2 && stateA != state2) {
                        break;
                    }
                }
                Operation operation2 = (Operation) objPrevious;
                Fragment fragment = operation2 != null ? operation2.f5193c : null;
                this.f5189e = fragment != null ? fragment.isPostponed() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        for (Operation operation : this.f5187b) {
            if (operation.f5192b == Operation.LifecycleImpact.f5195Y) {
                View viewRequireView = operation.f5193c.requireView();
                Intrinsics.e(viewRequireView, "fragment.requireView()");
                operation.c(Operation.State.Companion.b(viewRequireView.getVisibility()), Operation.LifecycleImpact.X);
            }
        }
    }
}

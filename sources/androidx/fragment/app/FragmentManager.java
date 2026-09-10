package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.charging.screenshow.battery.animations.themes.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager implements FragmentResultOwner {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ActivityResultLauncher f5113A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ActivityResultLauncher f5114B;
    public ActivityResultLauncher C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f5115E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f5116F;
    public boolean G;
    public boolean H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f5117I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ArrayList f5118J;
    public ArrayList K;
    public ArrayList L;
    public FragmentManagerViewModel M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5121b;
    public ArrayList d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f5123e;
    public OnBackPressedDispatcher g;
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f5128p;
    public final i q;
    public final i r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public FragmentHostCallback f5129u;
    public FragmentContainer v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Fragment f5130w;
    public Fragment x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5120a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FragmentStore f5122c = new FragmentStore();
    public final FragmentLayoutInflaterFactory f = new FragmentLayoutInflaterFactory(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final OnBackPressedCallback f5124h = new OnBackPressedCallback() { // from class: androidx.fragment.app.FragmentManager.1
        @Override // androidx.activity.OnBackPressedCallback
        public final void handleOnBackPressed() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.y(true);
            if (fragmentManager.f5124h.getIsEnabled()) {
                fragmentManager.P();
            } else {
                fragmentManager.g.c();
            }
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f5125i = new AtomicInteger();
    public final Map j = androidx.datastore.preferences.protobuf.a.r();
    public final Map k = androidx.datastore.preferences.protobuf.a.r();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f5126l = androidx.datastore.preferences.protobuf.a.r();
    public final FragmentLifecycleCallbacksDispatcher m = new FragmentLifecycleCallbacksDispatcher(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f5127n = new CopyOnWriteArrayList();
    public final MenuProvider s = new MenuProvider() { // from class: androidx.fragment.app.FragmentManager.2
        @Override // androidx.core.view.MenuProvider
        public final void a(Menu menu) {
            FragmentManager.this.q(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public final void b(Menu menu) {
            FragmentManager.this.t(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public final boolean c(MenuItem menuItem) {
            return FragmentManager.this.p(menuItem);
        }

        @Override // androidx.core.view.MenuProvider
        public final void d(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.k(menu, menuInflater);
        }
    };
    public int t = -1;
    public final FragmentFactory y = new FragmentFactory() { // from class: androidx.fragment.app.FragmentManager.3
        @Override // androidx.fragment.app.FragmentFactory
        public final Fragment a(ClassLoader classLoader, String str) {
            return Fragment.instantiate(FragmentManager.this.f5129u.f5109Y, str, null);
        }
    };

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AnonymousClass4 f5131z = new AnonymousClass4();
    public ArrayDeque D = new ArrayDeque();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Runnable f5119N = new Runnable() { // from class: androidx.fragment.app.FragmentManager.5
        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.y(true);
        }
    };

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$4, reason: invalid class name */
    public class AnonymousClass4 implements SpecialEffectsControllerFactory {
        @Override // androidx.fragment.app.SpecialEffectsControllerFactory
        public final DefaultSpecialEffectsController a(ViewGroup container) {
            Intrinsics.f(container, "container");
            return new DefaultSpecialEffectsController(container);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$6, reason: invalid class name */
    class AnonymousClass6 implements LifecycleEventObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START || event == Lifecycle.Event.ON_DESTROY) {
                throw null;
            }
        }
    }

    public interface BackStackEntry {
    }

    public class ClearBackStackState implements OpGenerator {
        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            throw null;
        }
    }

    public static class FragmentIntentSenderContract extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent a(Context context, Object obj) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequestA = (IntentSenderRequest) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequestA.f3264Y;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSenderRequest.Builder builder = new IntentSenderRequest.Builder(intentSenderRequestA.X);
                    builder.f3266b = null;
                    builder.d = intentSenderRequestA.e0;
                    builder.f3267c = intentSenderRequestA.Z;
                    intentSenderRequestA = builder.a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequestA);
            if (FragmentManager.I(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object c(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }
    }

    public static abstract class FragmentLifecycleCallbacks {
    }

    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new AnonymousClass1();
        public String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f5138Y;

        /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                LaunchedFragmentInfo launchedFragmentInfo = new LaunchedFragmentInfo();
                launchedFragmentInfo.X = parcel.readString();
                launchedFragmentInfo.f5138Y = parcel.readInt();
                return launchedFragmentInfo;
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo[] newArray(int i2) {
                return new LaunchedFragmentInfo[i2];
            }
        }

        public LaunchedFragmentInfo(String str, int i2) {
            this.X = str;
            this.f5138Y = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.X);
            parcel.writeInt(this.f5138Y);
        }
    }

    public static class LifecycleAwareResultListener implements FragmentResultListener {
    }

    public interface OnBackStackChangedListener {
    }

    public interface OpGenerator {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    public class PopBackStackState implements OpGenerator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5139a;

        public PopBackStackState(int i2) {
            this.f5139a = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            FragmentManager fragmentManager = FragmentManager.this;
            Fragment fragment = fragmentManager.x;
            int i2 = this.f5139a;
            if (fragment == null || i2 >= 0 || !fragment.getChildFragmentManager().Q(-1, 0)) {
                return fragmentManager.R(arrayList, arrayList2, i2, 1);
            }
            return false;
        }
    }

    public class RestoreBackStackState implements OpGenerator {
        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            throw null;
        }
    }

    public class SaveBackStackState implements OpGenerator {
        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.fragment.app.i] */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.fragment.app.i] */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.i] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.i] */
    public FragmentManager() {
        final int i2 = 0;
        this.o = new Consumer(this) { // from class: androidx.fragment.app.i

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f5207Y;

            {
                this.f5207Y = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f5207Y;
                        if (fragmentManager.K()) {
                            fragmentManager.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f5207Y;
                        if (fragmentManager2.K() && num.intValue() == 80) {
                            fragmentManager2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        FragmentManager fragmentManager3 = this.f5207Y;
                        if (fragmentManager3.K()) {
                            fragmentManager3.n(multiWindowModeChangedInfo.f4188a, false);
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        FragmentManager fragmentManager4 = this.f5207Y;
                        if (fragmentManager4.K()) {
                            fragmentManager4.s(pictureInPictureModeChangedInfo.f4241a, false);
                        }
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f5128p = new Consumer(this) { // from class: androidx.fragment.app.i

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f5207Y;

            {
                this.f5207Y = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f5207Y;
                        if (fragmentManager.K()) {
                            fragmentManager.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f5207Y;
                        if (fragmentManager2.K() && num.intValue() == 80) {
                            fragmentManager2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        FragmentManager fragmentManager3 = this.f5207Y;
                        if (fragmentManager3.K()) {
                            fragmentManager3.n(multiWindowModeChangedInfo.f4188a, false);
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        FragmentManager fragmentManager4 = this.f5207Y;
                        if (fragmentManager4.K()) {
                            fragmentManager4.s(pictureInPictureModeChangedInfo.f4241a, false);
                        }
                        break;
                }
            }
        };
        final int i4 = 2;
        this.q = new Consumer(this) { // from class: androidx.fragment.app.i

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f5207Y;

            {
                this.f5207Y = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f5207Y;
                        if (fragmentManager.K()) {
                            fragmentManager.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f5207Y;
                        if (fragmentManager2.K() && num.intValue() == 80) {
                            fragmentManager2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        FragmentManager fragmentManager3 = this.f5207Y;
                        if (fragmentManager3.K()) {
                            fragmentManager3.n(multiWindowModeChangedInfo.f4188a, false);
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        FragmentManager fragmentManager4 = this.f5207Y;
                        if (fragmentManager4.K()) {
                            fragmentManager4.s(pictureInPictureModeChangedInfo.f4241a, false);
                        }
                        break;
                }
            }
        };
        final int i5 = 3;
        this.r = new Consumer(this) { // from class: androidx.fragment.app.i

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f5207Y;

            {
                this.f5207Y = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f5207Y;
                        if (fragmentManager.K()) {
                            fragmentManager.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f5207Y;
                        if (fragmentManager2.K() && num.intValue() == 80) {
                            fragmentManager2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        FragmentManager fragmentManager3 = this.f5207Y;
                        if (fragmentManager3.K()) {
                            fragmentManager3.n(multiWindowModeChangedInfo.f4188a, false);
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        FragmentManager fragmentManager4 = this.f5207Y;
                        if (fragmentManager4.K()) {
                            fragmentManager4.s(pictureInPictureModeChangedInfo.f4241a, false);
                        }
                        break;
                }
            }
        };
    }

    public static boolean I(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public static boolean J(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        boolean zJ = false;
        for (Fragment fragment2 : fragment.mChildFragmentManager.f5122c.e()) {
            if (fragment2 != null) {
                zJ = J(fragment2);
            }
            if (zJ) {
                return true;
            }
        }
        return false;
    }

    public static boolean L(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.x) && L(fragmentManager.f5130w);
    }

    public static void b0(Fragment fragment) {
        if (I(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0226 A[PHI: r13
  0x0226: PHI (r13v9 int) = (r13v8 int), (r13v10 int) binds: [B:102:0x0216, B:107:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0178  */
    public final void A(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        ViewGroup viewGroup;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        boolean z5;
        int i7;
        boolean z6 = ((BackStackRecord) arrayList.get(i2)).o;
        ArrayList arrayList3 = this.L;
        if (arrayList3 == null) {
            this.L = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.L;
        FragmentStore fragmentStore = this.f5122c;
        arrayList4.addAll(fragmentStore.f());
        Fragment fragment = this.x;
        int i8 = i2;
        boolean z7 = false;
        while (true) {
            int i9 = 1;
            if (i8 >= i3) {
                boolean z8 = z6;
                this.L.clear();
                if (!z8 && this.t >= 1) {
                    for (int i10 = i2; i10 < i3; i10++) {
                        Iterator it = ((BackStackRecord) arrayList.get(i10)).f5157a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = ((FragmentTransaction.Op) it.next()).f5166b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                fragmentStore.g(g(fragment2));
                            }
                        }
                    }
                }
                for (int i11 = i2; i11 < i3; i11++) {
                    BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i11);
                    if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                        backStackRecord.l(-1);
                        ArrayList arrayList5 = backStackRecord.f5157a;
                        boolean z9 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            FragmentTransaction.Op op = (FragmentTransaction.Op) arrayList5.get(size);
                            Fragment fragment3 = op.f5166b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = backStackRecord.s;
                                fragment3.setPopDirection(z9);
                                int i12 = backStackRecord.f;
                                int i13 = 8194;
                                int i14 = 4097;
                                if (i12 != 4097) {
                                    if (i12 != 8194) {
                                        i13 = 4100;
                                        i14 = 8197;
                                        if (i12 != 8197) {
                                            if (i12 == 4099) {
                                                i13 = 4099;
                                            } else if (i12 != 4100) {
                                                i13 = 0;
                                            } else {
                                                i13 = i14;
                                            }
                                        }
                                    } else {
                                        i13 = i14;
                                    }
                                }
                                fragment3.setNextTransition(i13);
                                fragment3.setSharedElementNames(backStackRecord.f5164n, backStackRecord.m);
                            }
                            int i15 = op.f5165a;
                            FragmentManager fragmentManager = backStackRecord.f5076p;
                            switch (i15) {
                                case 1:
                                    fragment3.setAnimations(op.d, op.f5168e, op.f, op.g);
                                    z9 = true;
                                    fragmentManager.X(fragment3, true);
                                    fragmentManager.S(fragment3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + op.f5165a);
                                case 3:
                                    fragment3.setAnimations(op.d, op.f5168e, op.f, op.g);
                                    fragmentManager.a(fragment3);
                                    z9 = true;
                                    break;
                                case 4:
                                    fragment3.setAnimations(op.d, op.f5168e, op.f, op.g);
                                    fragmentManager.getClass();
                                    b0(fragment3);
                                    z9 = true;
                                    break;
                                case 5:
                                    fragment3.setAnimations(op.d, op.f5168e, op.f, op.g);
                                    fragmentManager.X(fragment3, true);
                                    fragmentManager.H(fragment3);
                                    z9 = true;
                                    break;
                                case 6:
                                    fragment3.setAnimations(op.d, op.f5168e, op.f, op.g);
                                    fragmentManager.c(fragment3);
                                    z9 = true;
                                    break;
                                case 7:
                                    fragment3.setAnimations(op.d, op.f5168e, op.f, op.g);
                                    fragmentManager.X(fragment3, true);
                                    fragmentManager.h(fragment3);
                                    z9 = true;
                                    break;
                                case 8:
                                    fragmentManager.Z(null);
                                    z9 = true;
                                    break;
                                case 9:
                                    fragmentManager.Z(fragment3);
                                    z9 = true;
                                    break;
                                case 10:
                                    fragmentManager.Y(fragment3, op.f5169h);
                                    z9 = true;
                                    break;
                            }
                        }
                    } else {
                        backStackRecord.l(1);
                        ArrayList arrayList6 = backStackRecord.f5157a;
                        int size2 = arrayList6.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            FragmentTransaction.Op op2 = (FragmentTransaction.Op) arrayList6.get(i16);
                            Fragment fragment4 = op2.f5166b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = backStackRecord.s;
                                fragment4.setPopDirection(false);
                                fragment4.setNextTransition(backStackRecord.f);
                                fragment4.setSharedElementNames(backStackRecord.m, backStackRecord.f5164n);
                            }
                            int i17 = op2.f5165a;
                            FragmentManager fragmentManager2 = backStackRecord.f5076p;
                            switch (i17) {
                                case 1:
                                    fragment4.setAnimations(op2.d, op2.f5168e, op2.f, op2.g);
                                    fragmentManager2.X(fragment4, false);
                                    fragmentManager2.a(fragment4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + op2.f5165a);
                                case 3:
                                    fragment4.setAnimations(op2.d, op2.f5168e, op2.f, op2.g);
                                    fragmentManager2.S(fragment4);
                                    break;
                                case 4:
                                    fragment4.setAnimations(op2.d, op2.f5168e, op2.f, op2.g);
                                    fragmentManager2.H(fragment4);
                                    break;
                                case 5:
                                    fragment4.setAnimations(op2.d, op2.f5168e, op2.f, op2.g);
                                    fragmentManager2.X(fragment4, false);
                                    b0(fragment4);
                                    break;
                                case 6:
                                    fragment4.setAnimations(op2.d, op2.f5168e, op2.f, op2.g);
                                    fragmentManager2.h(fragment4);
                                    break;
                                case 7:
                                    fragment4.setAnimations(op2.d, op2.f5168e, op2.f, op2.g);
                                    fragmentManager2.X(fragment4, false);
                                    fragmentManager2.c(fragment4);
                                    break;
                                case 8:
                                    fragmentManager2.Z(fragment4);
                                    break;
                                case 9:
                                    fragmentManager2.Z(null);
                                    break;
                                case 10:
                                    fragmentManager2.Y(fragment4, op2.f5170i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i3 - 1)).booleanValue();
                for (int i18 = i2; i18 < i3; i18++) {
                    BackStackRecord backStackRecord2 = (BackStackRecord) arrayList.get(i18);
                    if (zBooleanValue) {
                        for (int size3 = backStackRecord2.f5157a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment5 = ((FragmentTransaction.Op) backStackRecord2.f5157a.get(size3)).f5166b;
                            if (fragment5 != null) {
                                g(fragment5).k();
                            }
                        }
                    } else {
                        Iterator it2 = backStackRecord2.f5157a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment6 = ((FragmentTransaction.Op) it2.next()).f5166b;
                            if (fragment6 != null) {
                                g(fragment6).k();
                            }
                        }
                    }
                }
                N(this.t, true);
                HashSet<SpecialEffectsController> hashSet = new HashSet();
                for (int i19 = i2; i19 < i3; i19++) {
                    Iterator it3 = ((BackStackRecord) arrayList.get(i19)).f5157a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment7 = ((FragmentTransaction.Op) it3.next()).f5166b;
                        if (fragment7 != null && (viewGroup = fragment7.mContainer) != null) {
                            hashSet.add(SpecialEffectsController.f(viewGroup, this));
                        }
                    }
                }
                for (SpecialEffectsController specialEffectsController : hashSet) {
                    specialEffectsController.d = zBooleanValue;
                    specialEffectsController.g();
                    specialEffectsController.c();
                }
                for (int i20 = i2; i20 < i3; i20++) {
                    BackStackRecord backStackRecord3 = (BackStackRecord) arrayList.get(i20);
                    if (((Boolean) arrayList2.get(i20)).booleanValue() && backStackRecord3.r >= 0) {
                        backStackRecord3.r = -1;
                    }
                    backStackRecord3.getClass();
                }
                return;
            }
            BackStackRecord backStackRecord4 = (BackStackRecord) arrayList.get(i8);
            if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                z2 = z6;
                i4 = i8;
                z3 = z7;
                int i21 = 1;
                ArrayList arrayList7 = this.L;
                ArrayList arrayList8 = backStackRecord4.f5157a;
                int size4 = arrayList8.size() - 1;
                while (size4 >= 0) {
                    FragmentTransaction.Op op3 = (FragmentTransaction.Op) arrayList8.get(size4);
                    int i22 = op3.f5165a;
                    if (i22 != i21) {
                        if (i22 != 3) {
                            switch (i22) {
                                case 6:
                                    arrayList7.add(op3.f5166b);
                                    break;
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = op3.f5166b;
                                    break;
                                case 10:
                                    op3.f5170i = op3.f5169h;
                                    break;
                            }
                        } else {
                            arrayList7.add(op3.f5166b);
                        }
                        size4--;
                        i21 = 1;
                    }
                    arrayList7.remove(op3.f5166b);
                    size4--;
                    i21 = 1;
                }
            } else {
                ArrayList arrayList9 = this.L;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList10 = backStackRecord4.f5157a;
                    if (i23 < arrayList10.size()) {
                        FragmentTransaction.Op op4 = (FragmentTransaction.Op) arrayList10.get(i23);
                        int i24 = op4.f5165a;
                        if (i24 != i9) {
                            z4 = z6;
                            if (i24 != 2) {
                                if (i24 == 3 || i24 == 6) {
                                    arrayList9.remove(op4.f5166b);
                                    Fragment fragment8 = op4.f5166b;
                                    if (fragment8 == fragment) {
                                        arrayList10.add(i23, new FragmentTransaction.Op(fragment8, 9));
                                        i23++;
                                        i6 = i8;
                                        z5 = z7;
                                        i5 = 1;
                                        fragment = null;
                                    }
                                } else if (i24 == 7) {
                                    i5 = 1;
                                } else if (i24 == 8) {
                                    arrayList10.add(i23, new FragmentTransaction.Op(fragment, 9, 0));
                                    op4.f5167c = true;
                                    i23++;
                                    fragment = op4.f5166b;
                                }
                                i6 = i8;
                                z5 = z7;
                                i5 = 1;
                            } else {
                                Fragment fragment9 = op4.f5166b;
                                int i25 = fragment9.mContainerId;
                                int size5 = arrayList9.size() - 1;
                                boolean z10 = false;
                                while (size5 >= 0) {
                                    int i26 = size5;
                                    Fragment fragment10 = (Fragment) arrayList9.get(size5);
                                    int i27 = i8;
                                    if (fragment10.mContainerId != i25) {
                                        z7 = z7;
                                    } else if (fragment10 == fragment9) {
                                        z7 = z7;
                                        z10 = true;
                                    } else {
                                        if (fragment10 == fragment) {
                                            i7 = 0;
                                            arrayList10.add(i23, new FragmentTransaction.Op(fragment10, 9, 0));
                                            i23++;
                                            fragment = null;
                                        } else {
                                            i7 = 0;
                                        }
                                        FragmentTransaction.Op op5 = new FragmentTransaction.Op(fragment10, 3, i7);
                                        op5.d = op4.d;
                                        op5.f = op4.f;
                                        op5.f5168e = op4.f5168e;
                                        op5.g = op4.g;
                                        arrayList10.add(i23, op5);
                                        arrayList9.remove(fragment10);
                                        i23++;
                                        fragment = fragment;
                                    }
                                    size5 = i26 - 1;
                                    z7 = z7;
                                    i8 = i27;
                                }
                                i6 = i8;
                                z5 = z7;
                                i5 = 1;
                                if (z10) {
                                    arrayList10.remove(i23);
                                    i23--;
                                } else {
                                    op4.f5165a = 1;
                                    op4.f5167c = true;
                                    arrayList9.add(fragment9);
                                }
                            }
                            i23 += i5;
                            i9 = i5;
                            z6 = z4;
                            z7 = z5;
                            i8 = i6;
                        } else {
                            z4 = z6;
                            i5 = i9;
                        }
                        i6 = i8;
                        z5 = z7;
                        arrayList9.add(op4.f5166b);
                        i23 += i5;
                        i9 = i5;
                        z6 = z4;
                        z7 = z5;
                        i8 = i6;
                    } else {
                        z2 = z6;
                        i4 = i8;
                        z3 = z7;
                    }
                }
            }
            z7 = z3 || backStackRecord4.g;
            i8 = i4 + 1;
            z6 = z2;
        }
    }

    public final Fragment B(int i2) {
        FragmentStore fragmentStore = this.f5122c;
        ArrayList arrayList = fragmentStore.f5154a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        for (FragmentStateManager fragmentStateManager : fragmentStore.f5155b.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment2 = fragmentStateManager.f5150c;
                if (fragment2.mFragmentId == i2) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment C(String str) {
        FragmentStore fragmentStore = this.f5122c;
        if (str != null) {
            ArrayList arrayList = fragmentStore.f5154a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            fragmentStore.getClass();
            return null;
        }
        for (FragmentStateManager fragmentStateManager : fragmentStore.f5155b.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment2 = fragmentStateManager.f5150c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final ViewGroup D(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.v.c()) {
            return null;
        }
        View viewB = this.v.b(fragment.mContainerId);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    public final FragmentFactory E() {
        Fragment fragment = this.f5130w;
        return fragment != null ? fragment.mFragmentManager.E() : this.y;
    }

    public final List F() {
        return this.f5122c.f();
    }

    public final SpecialEffectsControllerFactory G() {
        Fragment fragment = this.f5130w;
        return fragment != null ? fragment.mFragmentManager.G() : this.f5131z;
    }

    public final void H(Fragment fragment) {
        if (I(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        a0(fragment);
    }

    public final boolean K() {
        Fragment fragment = this.f5130w;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f5130w.getParentFragmentManager().K();
    }

    public final boolean M() {
        return this.f5116F || this.G;
    }

    public final void N(int i2, boolean z2) {
        HashMap map;
        FragmentHostCallback fragmentHostCallback;
        if (this.f5129u == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i2 != this.t) {
            this.t = i2;
            FragmentStore fragmentStore = this.f5122c;
            Iterator it = fragmentStore.f5154a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = fragmentStore.f5155b;
                if (!zHasNext) {
                    break;
                }
                FragmentStateManager fragmentStateManager = (FragmentStateManager) map.get(((Fragment) it.next()).mWho);
                if (fragmentStateManager != null) {
                    fragmentStateManager.k();
                }
            }
            for (FragmentStateManager fragmentStateManager2 : map.values()) {
                if (fragmentStateManager2 != null) {
                    fragmentStateManager2.k();
                    Fragment fragment = fragmentStateManager2.f5150c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !fragmentStore.f5156c.containsKey(fragment.mWho)) {
                            fragmentStore.i(fragmentStateManager2.n(), fragment.mWho);
                        }
                        fragmentStore.h(fragmentStateManager2);
                    }
                }
            }
            for (FragmentStateManager fragmentStateManager3 : fragmentStore.d()) {
                Fragment fragment2 = fragmentStateManager3.f5150c;
                if (fragment2.mDeferStart) {
                    if (this.f5121b) {
                        this.f5117I = true;
                    } else {
                        fragment2.mDeferStart = false;
                        fragmentStateManager3.k();
                    }
                }
            }
            if (this.f5115E && (fragmentHostCallback = this.f5129u) != null && this.t == 7) {
                fragmentHostCallback.h();
                this.f5115E = false;
            }
        }
    }

    public final void O() {
        if (this.f5129u == null) {
            return;
        }
        this.f5116F = false;
        this.G = false;
        this.M.f5144i = false;
        for (Fragment fragment : this.f5122c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean P() {
        return Q(-1, 0);
    }

    public final boolean Q(int i2, int i3) {
        y(false);
        x(true);
        Fragment fragment = this.x;
        if (fragment != null && i2 < 0 && fragment.getChildFragmentManager().P()) {
            return true;
        }
        boolean zR = R(this.f5118J, this.K, i2, i3);
        if (zR) {
            this.f5121b = true;
            try {
                T(this.f5118J, this.K);
                e();
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
        d0();
        boolean z2 = this.f5117I;
        FragmentStore fragmentStore = this.f5122c;
        if (z2) {
            this.f5117I = false;
            for (FragmentStateManager fragmentStateManager : fragmentStore.d()) {
                Fragment fragment2 = fragmentStateManager.f5150c;
                if (fragment2.mDeferStart) {
                    if (this.f5121b) {
                        this.f5117I = true;
                    } else {
                        fragment2.mDeferStart = false;
                        fragmentStateManager.k();
                    }
                }
            }
        }
        fragmentStore.f5155b.values().removeAll(Collections.singleton(null));
        return zR;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    public final boolean R(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        int size;
        boolean z2 = (i3 & 1) != 0;
        ArrayList arrayList3 = this.d;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            size = -1;
        } else if (i2 < 0) {
            size = z2 ? 0 : this.d.size() - 1;
        } else {
            int size2 = this.d.size() - 1;
            while (size2 >= 0) {
                BackStackRecord backStackRecord = (BackStackRecord) this.d.get(size2);
                if (i2 >= 0 && i2 == backStackRecord.r) {
                    break;
                }
                size2--;
            }
            if (size2 < 0) {
                size = size2;
            } else if (z2) {
                while (size2 > 0) {
                    BackStackRecord backStackRecord2 = (BackStackRecord) this.d.get(size2 - 1);
                    if (i2 < 0 || i2 != backStackRecord2.r) {
                        break;
                    }
                    size2--;
                }
                size = size2;
            } else if (size2 == this.d.size() - 1) {
                size = -1;
            } else {
                size = size2 + 1;
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((BackStackRecord) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(Fragment fragment) {
        if (I(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        FragmentStore fragmentStore = this.f5122c;
        synchronized (fragmentStore.f5154a) {
            fragmentStore.f5154a.remove(fragment);
        }
        fragment.mAdded = false;
        if (J(fragment)) {
            this.f5115E = true;
        }
        fragment.mRemoving = true;
        a0(fragment);
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!((BackStackRecord) arrayList.get(i2)).o) {
                if (i3 != i2) {
                    A(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                    while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((BackStackRecord) arrayList.get(i3)).o) {
                        i3++;
                    }
                }
                A(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            A(arrayList, arrayList2, i3, size);
        }
    }

    public final void U(Bundle bundle) {
        int i2;
        FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher;
        int i3;
        FragmentStateManager fragmentStateManager;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f5129u.f5109Y.getClassLoader());
                this.k.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f5129u.f5109Y.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        FragmentStore fragmentStore = this.f5122c;
        HashMap map2 = fragmentStore.f5156c;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        HashMap map3 = fragmentStore.f5155b;
        map3.clear();
        Iterator it = fragmentManagerState.X.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i2 = 2;
            fragmentLifecycleCallbacksDispatcher = this.m;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = fragmentStore.i(null, (String) it.next());
            if (bundleI != null) {
                Fragment fragment = (Fragment) this.M.d.get(((FragmentState) bundleI.getParcelable("state")).f5147Y);
                if (fragment != null) {
                    if (I(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    fragmentStateManager = new FragmentStateManager(fragmentLifecycleCallbacksDispatcher, fragmentStore, fragment, bundleI);
                } else {
                    fragmentStateManager = new FragmentStateManager(this.m, this.f5122c, this.f5129u.f5109Y.getClassLoader(), E(), bundleI);
                }
                Fragment fragment2 = fragmentStateManager.f5150c;
                fragment2.mSavedFragmentState = bundleI;
                fragment2.mFragmentManager = this;
                if (I(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                fragmentStateManager.l(this.f5129u.f5109Y.getClassLoader());
                fragmentStore.g(fragmentStateManager);
                fragmentStateManager.f5151e = this.t;
            }
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.M;
        fragmentManagerViewModel.getClass();
        for (Fragment fragment3 : new ArrayList(fragmentManagerViewModel.d.values())) {
            if (map3.get(fragment3.mWho) == null) {
                if (I(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.X);
                }
                this.M.g(fragment3);
                fragment3.mFragmentManager = this;
                FragmentStateManager fragmentStateManager2 = new FragmentStateManager(fragmentLifecycleCallbacksDispatcher, fragmentStore, fragment3);
                fragmentStateManager2.f5151e = 1;
                fragmentStateManager2.k();
                fragment3.mRemoving = true;
                fragmentStateManager2.k();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f5141Y;
        fragmentStore.f5154a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentB = fragmentStore.b(str3);
                if (fragmentB == null) {
                    throw new IllegalStateException(android.support.v4.media.a.n("No instantiated fragment for (", str3, ")"));
                }
                if (I(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentB);
                }
                fragmentStore.a(fragmentB);
            }
        }
        if (fragmentManagerState.Z != null) {
            this.d = new ArrayList(fragmentManagerState.Z.length);
            int i4 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.Z;
                if (i4 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i4];
                backStackRecordState.getClass();
                BackStackRecord backStackRecord = new BackStackRecord(this);
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int[] iArr = backStackRecordState.X;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    FragmentTransaction.Op op = new FragmentTransaction.Op();
                    int i7 = i5 + 1;
                    int i8 = i2;
                    op.f5165a = iArr[i5];
                    if (I(i8)) {
                        Log.v("FragmentManager", "Instantiate " + backStackRecord + " op #" + i6 + " base fragment #" + iArr[i7]);
                    }
                    op.f5169h = Lifecycle.State.values()[backStackRecordState.Z[i6]];
                    op.f5170i = Lifecycle.State.values()[backStackRecordState.e0[i6]];
                    int i9 = i5 + 2;
                    op.f5167c = iArr[i7] != 0;
                    int i10 = iArr[i9];
                    op.d = i10;
                    int i11 = iArr[i5 + 3];
                    op.f5168e = i11;
                    int i12 = i5 + 5;
                    int i13 = iArr[i5 + 4];
                    op.f = i13;
                    i5 += 6;
                    int i14 = iArr[i12];
                    op.g = i14;
                    backStackRecord.f5158b = i10;
                    backStackRecord.f5159c = i11;
                    backStackRecord.d = i13;
                    backStackRecord.f5160e = i14;
                    backStackRecord.b(op);
                    i6++;
                    i2 = i8;
                }
                int i15 = i2;
                backStackRecord.f = backStackRecordState.f0;
                backStackRecord.f5161h = backStackRecordState.g0;
                backStackRecord.g = true;
                backStackRecord.f5162i = backStackRecordState.i0;
                backStackRecord.j = backStackRecordState.j0;
                backStackRecord.k = backStackRecordState.k0;
                backStackRecord.f5163l = backStackRecordState.l0;
                backStackRecord.m = backStackRecordState.m0;
                backStackRecord.f5164n = backStackRecordState.n0;
                backStackRecord.o = backStackRecordState.o0;
                backStackRecord.r = backStackRecordState.h0;
                int i16 = 0;
                while (true) {
                    ArrayList arrayList2 = backStackRecordState.f5077Y;
                    if (i16 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i16);
                    if (str4 != null) {
                        ((FragmentTransaction.Op) backStackRecord.f5157a.get(i16)).f5166b = fragmentStore.b(str4);
                    }
                    i16++;
                }
                backStackRecord.l(1);
                if (I(i15)) {
                    StringBuilder sbU = android.support.v4.media.a.u(i4, "restoreAllState: back stack #", " (index ");
                    sbU.append(backStackRecord.r);
                    sbU.append("): ");
                    sbU.append(backStackRecord);
                    Log.v("FragmentManager", sbU.toString());
                    PrintWriter printWriter = new PrintWriter(new LogWriter());
                    backStackRecord.n("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(backStackRecord);
                i4++;
                i2 = i15;
            }
            i3 = 0;
        } else {
            i3 = 0;
            this.d = null;
        }
        this.f5125i.set(fragmentManagerState.e0);
        String str5 = fragmentManagerState.f0;
        if (str5 != null) {
            Fragment fragmentB2 = fragmentStore.b(str5);
            this.x = fragmentB2;
            r(fragmentB2);
        }
        ArrayList arrayList3 = fragmentManagerState.g0;
        if (arrayList3 != null) {
            for (int i17 = i3; i17 < arrayList3.size(); i17++) {
                this.j.put((String) arrayList3.get(i17), (BackStackState) fragmentManagerState.h0.get(i17));
            }
        }
        this.D = new ArrayDeque(fragmentManagerState.i0);
    }

    public final Bundle V() {
        int i2;
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = f().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SpecialEffectsController specialEffectsController = (SpecialEffectsController) it.next();
            if (specialEffectsController.f5189e) {
                if (I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                specialEffectsController.f5189e = false;
                specialEffectsController.c();
            }
        }
        Iterator it2 = f().iterator();
        while (it2.hasNext()) {
            ((SpecialEffectsController) it2.next()).e();
        }
        y(true);
        this.f5116F = true;
        this.M.f5144i = true;
        FragmentStore fragmentStore = this.f5122c;
        fragmentStore.getClass();
        HashMap map = fragmentStore.f5155b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (FragmentStateManager fragmentStateManager : map.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment = fragmentStateManager.f5150c;
                fragmentStore.i(fragmentStateManager.n(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (I(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.f5122c.f5156c;
        if (!map2.isEmpty()) {
            FragmentStore fragmentStore2 = this.f5122c;
            synchronized (fragmentStore2.f5154a) {
                try {
                    if (fragmentStore2.f5154a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(fragmentStore2.f5154a.size());
                        for (Fragment fragment2 : fragmentStore2.f5154a) {
                            arrayList.add(fragment2.mWho);
                            if (I(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList3 = this.d;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (i2 = 0; i2 < size; i2++) {
                    backStackRecordStateArr[i2] = new BackStackRecordState((BackStackRecord) this.d.get(i2));
                    if (I(2)) {
                        StringBuilder sbU = android.support.v4.media.a.u(i2, "saveAllState: adding back stack #", ": ");
                        sbU.append(this.d.get(i2));
                        Log.v("FragmentManager", sbU.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f0 = null;
            ArrayList arrayList4 = new ArrayList();
            fragmentManagerState.g0 = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            fragmentManagerState.h0 = arrayList5;
            fragmentManagerState.X = arrayList2;
            fragmentManagerState.f5141Y = arrayList;
            fragmentManagerState.Z = backStackRecordStateArr;
            fragmentManagerState.e0 = this.f5125i.get();
            Fragment fragment3 = this.x;
            if (fragment3 != null) {
                fragmentManagerState.f0 = fragment3.mWho;
            }
            arrayList4.addAll(this.j.keySet());
            arrayList5.addAll(this.j.values());
            fragmentManagerState.i0 = new ArrayList(this.D);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.k.keySet()) {
                bundle.putBundle(android.support.v4.media.a.C("result_", str), (Bundle) this.k.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(android.support.v4.media.a.C("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (I(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void W() {
        synchronized (this.f5120a) {
            try {
                if (this.f5120a.size() == 1) {
                    this.f5129u.Z.removeCallbacks(this.f5119N);
                    this.f5129u.Z.post(this.f5119N);
                    d0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void X(Fragment fragment, boolean z2) {
        ViewGroup viewGroupD = D(fragment);
        if (viewGroupD == null || !(viewGroupD instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupD).setDrawDisappearingViewsLast(!z2);
    }

    public final void Y(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(this.f5122c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void Z(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f5122c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.x;
        this.x = fragment;
        r(fragment2);
        r(this.x);
    }

    public final FragmentStateManager a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.c(fragment, str);
        }
        if (I(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        FragmentStateManager fragmentStateManagerG = g(fragment);
        fragment.mFragmentManager = this;
        FragmentStore fragmentStore = this.f5122c;
        fragmentStore.g(fragmentStateManagerG);
        if (!fragment.mDetached) {
            fragmentStore.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (J(fragment)) {
                this.f5115E = true;
            }
        }
        return fragmentStateManagerG;
    }

    public final void a0(Fragment fragment) {
        ViewGroup viewGroupD = D(fragment);
        if (viewGroupD != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupD.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupD.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupD.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(FragmentHostCallback fragmentHostCallback, FragmentContainer fragmentContainer, final Fragment fragment) {
        LifecycleOwner lifecycleOwner;
        if (this.f5129u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f5129u = fragmentHostCallback;
        this.v = fragmentContainer;
        this.f5130w = fragment;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5127n;
        if (fragment != null) {
            copyOnWriteArrayList.add(new FragmentOnAttachListener() { // from class: androidx.fragment.app.FragmentManager.7
                @Override // androidx.fragment.app.FragmentOnAttachListener
                public final void a(Fragment fragment2) {
                    fragment.onAttachFragment(fragment2);
                }
            });
        } else if (fragmentHostCallback instanceof FragmentOnAttachListener) {
            copyOnWriteArrayList.add((FragmentOnAttachListener) fragmentHostCallback);
        }
        if (this.f5130w != null) {
            d0();
        }
        if (fragmentHostCallback instanceof OnBackPressedDispatcherOwner) {
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) fragmentHostCallback;
            OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getZ();
            this.g = onBackPressedDispatcher;
            if (fragment != null) {
                lifecycleOwner = onBackPressedDispatcherOwner;
                lifecycleOwner = fragment;
            }
            lifecycleOwner = onBackPressedDispatcherOwner;
            onBackPressedDispatcher.a(lifecycleOwner, this.f5124h);
        }
        if (fragment != null) {
            FragmentManagerViewModel fragmentManagerViewModel = fragment.mFragmentManager.M;
            HashMap map = fragmentManagerViewModel.f5142e;
            FragmentManagerViewModel fragmentManagerViewModel2 = (FragmentManagerViewModel) map.get(fragment.mWho);
            if (fragmentManagerViewModel2 == null) {
                fragmentManagerViewModel2 = new FragmentManagerViewModel(fragmentManagerViewModel.g);
                map.put(fragment.mWho, fragmentManagerViewModel2);
            }
            this.M = fragmentManagerViewModel2;
        } else if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            this.M = (FragmentManagerViewModel) new ViewModelProvider(((ViewModelStoreOwner) fragmentHostCallback).getViewModelStore(), FragmentManagerViewModel.j).a(FragmentManagerViewModel.class);
        } else {
            this.M = new FragmentManagerViewModel(false);
        }
        this.M.f5144i = M();
        this.f5122c.d = this.M;
        Object obj = this.f5129u;
        if ((obj instanceof SavedStateRegistryOwner) && fragment == null) {
            SavedStateRegistry savedStateRegistry = ((SavedStateRegistryOwner) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new f(this, 1));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                U(bundleA);
            }
        }
        Object obj2 = this.f5129u;
        if (obj2 instanceof ActivityResultRegistryOwner) {
            ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) obj2).getActivityResultRegistry();
            String strC = android.support.v4.media.a.C("FragmentManager:", fragment != null ? android.support.v4.media.a.r(new StringBuilder(), fragment.mWho, ":") : "");
            this.f5113A = activityResultRegistry.d(android.support.v4.media.a.m(strC, "StartActivityForResult"), new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.8
                @Override // androidx.activity.result.ActivityResultCallback
                public final void a(Object obj3) {
                    ActivityResult activityResult = (ActivityResult) obj3;
                    FragmentManager fragmentManager = FragmentManager.this;
                    LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) fragmentManager.D.pollLast();
                    if (launchedFragmentInfo == null) {
                        Log.w("FragmentManager", "No Activities were started for result for " + this);
                        return;
                    }
                    FragmentStore fragmentStore = fragmentManager.f5122c;
                    String str = launchedFragmentInfo.X;
                    Fragment fragmentC = fragmentStore.c(str);
                    if (fragmentC == null) {
                        androidx.datastore.preferences.protobuf.a.x("Activity result delivered for unknown Fragment ", str, "FragmentManager");
                    } else {
                        fragmentC.onActivityResult(launchedFragmentInfo.f5138Y, activityResult.X, activityResult.f3248Y);
                    }
                }
            });
            this.f5114B = activityResultRegistry.d(android.support.v4.media.a.m(strC, "StartIntentSenderForResult"), new FragmentIntentSenderContract(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.9
                @Override // androidx.activity.result.ActivityResultCallback
                public final void a(Object obj3) {
                    ActivityResult activityResult = (ActivityResult) obj3;
                    FragmentManager fragmentManager = FragmentManager.this;
                    LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) fragmentManager.D.pollFirst();
                    if (launchedFragmentInfo == null) {
                        Log.w("FragmentManager", "No IntentSenders were started for " + this);
                        return;
                    }
                    FragmentStore fragmentStore = fragmentManager.f5122c;
                    String str = launchedFragmentInfo.X;
                    Fragment fragmentC = fragmentStore.c(str);
                    if (fragmentC == null) {
                        androidx.datastore.preferences.protobuf.a.x("Intent Sender result delivered for unknown Fragment ", str, "FragmentManager");
                    } else {
                        fragmentC.onActivityResult(launchedFragmentInfo.f5138Y, activityResult.X, activityResult.f3248Y);
                    }
                }
            });
            this.C = activityResultRegistry.d(android.support.v4.media.a.m(strC, "RequestPermissions"), new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback<Map<String, Boolean>>() { // from class: androidx.fragment.app.FragmentManager.10
                @Override // androidx.activity.result.ActivityResultCallback
                public final void a(Object obj3) {
                    Map map2 = (Map) obj3;
                    String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
                    ArrayList arrayList = new ArrayList(map2.values());
                    int[] iArr = new int[arrayList.size()];
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                    }
                    FragmentManager fragmentManager = FragmentManager.this;
                    LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) fragmentManager.D.pollFirst();
                    if (launchedFragmentInfo == null) {
                        Log.w("FragmentManager", "No permissions were requested for " + this);
                        return;
                    }
                    FragmentStore fragmentStore = fragmentManager.f5122c;
                    String str = launchedFragmentInfo.X;
                    Fragment fragmentC = fragmentStore.c(str);
                    if (fragmentC == null) {
                        androidx.datastore.preferences.protobuf.a.x("Permission request result delivered for unknown Fragment ", str, "FragmentManager");
                    } else {
                        fragmentC.onRequestPermissionsResult(launchedFragmentInfo.f5138Y, strArr, iArr);
                    }
                }
            });
        }
        Object obj3 = this.f5129u;
        if (obj3 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj3).addOnConfigurationChangedListener(this.o);
        }
        Object obj4 = this.f5129u;
        if (obj4 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj4).addOnTrimMemoryListener(this.f5128p);
        }
        Object obj5 = this.f5129u;
        if (obj5 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj5).addOnMultiWindowModeChangedListener(this.q);
        }
        Object obj6 = this.f5129u;
        if (obj6 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj6).addOnPictureInPictureModeChangedListener(this.r);
        }
        Object obj7 = this.f5129u;
        if ((obj7 instanceof MenuHost) && fragment == null) {
            ((MenuHost) obj7).addMenuProvider(this.s);
        }
    }

    public final void c(Fragment fragment) {
        if (I(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f5122c.a(fragment);
            if (I(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (J(fragment)) {
                this.f5115E = true;
            }
        }
    }

    public final void c0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new LogWriter());
        FragmentHostCallback fragmentHostCallback = this.f5129u;
        if (fragmentHostCallback != null) {
            try {
                fragmentHostCallback.d(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            v("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    public final FragmentTransaction d() {
        return new BackStackRecord(this);
    }

    public final void d0() {
        synchronized (this.f5120a) {
            try {
                if (!this.f5120a.isEmpty()) {
                    this.f5124h.setEnabled(true);
                    return;
                }
                OnBackPressedCallback onBackPressedCallback = this.f5124h;
                ArrayList arrayList = this.d;
                onBackPressedCallback.setEnabled((arrayList != null ? arrayList.size() : 0) > 0 && L(this.f5130w));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        this.f5121b = false;
        this.K.clear();
        this.f5118J.clear();
    }

    public final HashSet f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f5122c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((FragmentStateManager) it.next()).f5150c.mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.Companion.a(viewGroup, G()));
            }
        }
        return hashSet;
    }

    public final FragmentStateManager g(Fragment fragment) {
        String str = fragment.mWho;
        FragmentStore fragmentStore = this.f5122c;
        FragmentStateManager fragmentStateManager = (FragmentStateManager) fragmentStore.f5155b.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager;
        }
        FragmentStateManager fragmentStateManager2 = new FragmentStateManager(this.m, fragmentStore, fragment);
        fragmentStateManager2.l(this.f5129u.f5109Y.getClassLoader());
        fragmentStateManager2.f5151e = this.t;
        return fragmentStateManager2;
    }

    public final void h(Fragment fragment) {
        if (I(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (I(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            FragmentStore fragmentStore = this.f5122c;
            synchronized (fragmentStore.f5154a) {
                fragmentStore.f5154a.remove(fragment);
            }
            fragment.mAdded = false;
            if (J(fragment)) {
                this.f5115E = true;
            }
            a0(fragment);
        }
    }

    public final void i(boolean z2, Configuration configuration) {
        if (z2 && (this.f5129u instanceof OnConfigurationChangedProvider)) {
            c0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f5122c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z2) {
                    fragment.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.t < 1) {
            return false;
        }
        for (Fragment fragment : this.f5122c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.t < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (Fragment fragment : this.f5122c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.f5123e != null) {
            for (int i2 = 0; i2 < this.f5123e.size(); i2++) {
                Fragment fragment2 = (Fragment) this.f5123e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f5123e = arrayList;
        return z2;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.H = true;
        y(true);
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).e();
        }
        FragmentHostCallback fragmentHostCallback = this.f5129u;
        boolean z2 = fragmentHostCallback instanceof ViewModelStoreOwner;
        FragmentStore fragmentStore = this.f5122c;
        if (z2) {
            zIsChangingConfigurations = fragmentStore.d.f5143h;
        } else {
            FragmentActivity fragmentActivity = fragmentHostCallback.f5109Y;
            if (fragmentActivity != null) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((BackStackState) it2.next()).X) {
                    FragmentManagerViewModel fragmentManagerViewModel = fragmentStore.d;
                    fragmentManagerViewModel.getClass();
                    if (I(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    fragmentManagerViewModel.f(str);
                }
            }
        }
        u(-1);
        Object obj = this.f5129u;
        if (obj instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj).removeOnTrimMemoryListener(this.f5128p);
        }
        Object obj2 = this.f5129u;
        if (obj2 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj2).removeOnConfigurationChangedListener(this.o);
        }
        Object obj3 = this.f5129u;
        if (obj3 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj3).removeOnMultiWindowModeChangedListener(this.q);
        }
        Object obj4 = this.f5129u;
        if (obj4 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj4).removeOnPictureInPictureModeChangedListener(this.r);
        }
        Object obj5 = this.f5129u;
        if ((obj5 instanceof MenuHost) && this.f5130w == null) {
            ((MenuHost) obj5).removeMenuProvider(this.s);
        }
        this.f5129u = null;
        this.v = null;
        this.f5130w = null;
        if (this.g != null) {
            this.f5124h.remove();
            this.g = null;
        }
        ActivityResultLauncher activityResultLauncher = this.f5113A;
        if (activityResultLauncher != null) {
            activityResultLauncher.b();
            this.f5114B.b();
            this.C.b();
        }
    }

    public final void m(boolean z2) {
        if (z2 && (this.f5129u instanceof OnTrimMemoryProvider)) {
            c0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f5122c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z2) {
                    fragment.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void n(boolean z2, boolean z3) {
        if (z3 && (this.f5129u instanceof OnMultiWindowModeChangedProvider)) {
            c0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f5122c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z2);
                if (z3) {
                    fragment.mChildFragmentManager.n(z2, true);
                }
            }
        }
    }

    public final void o() {
        for (Fragment fragment : this.f5122c.e()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.t < 1) {
            return false;
        }
        for (Fragment fragment : this.f5122c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.t < 1) {
            return;
        }
        for (Fragment fragment : this.f5122c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f5122c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z2, boolean z3) {
        if (z3 && (this.f5129u instanceof OnPictureInPictureModeChangedProvider)) {
            c0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f5122c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z2);
                if (z3) {
                    fragment.mChildFragmentManager.s(z2, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z2 = false;
        if (this.t < 1) {
            return false;
        }
        for (Fragment fragment : this.f5122c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f5130w;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f5130w)));
            sb.append("}");
        } else {
            FragmentHostCallback fragmentHostCallback = this.f5129u;
            if (fragmentHostCallback != null) {
                sb.append(fragmentHostCallback.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f5129u)));
                sb.append("}");
            } else {
                sb.append(AbstractJsonLexerKt.NULL);
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i2) {
        try {
            this.f5121b = true;
            for (FragmentStateManager fragmentStateManager : this.f5122c.f5155b.values()) {
                if (fragmentStateManager != null) {
                    fragmentStateManager.f5151e = i2;
                }
            }
            N(i2, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).e();
            }
            this.f5121b = false;
            y(true);
        } catch (Throwable th) {
            this.f5121b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strM = android.support.v4.media.a.m(str, "    ");
        FragmentStore fragmentStore = this.f5122c;
        fragmentStore.getClass();
        String str2 = str + "    ";
        HashMap map = fragmentStore.f5155b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (FragmentStateManager fragmentStateManager : map.values()) {
                printWriter.print(str);
                if (fragmentStateManager != null) {
                    Fragment fragment = fragmentStateManager.f5150c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(AbstractJsonLexerKt.NULL);
                }
            }
        }
        ArrayList arrayList = fragmentStore.f5154a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                Fragment fragment2 = (Fragment) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.f5123e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                Fragment fragment3 = (Fragment) this.f5123e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                BackStackRecord backStackRecord = (BackStackRecord) this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(backStackRecord.toString());
                backStackRecord.n(strM, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f5125i.get());
        synchronized (this.f5120a) {
            try {
                int size4 = this.f5120a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj = (OpGenerator) this.f5120a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f5129u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.v);
        if (this.f5130w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f5130w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f5116F);
        printWriter.print(" mStopped=");
        printWriter.print(this.G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.H);
        if (this.f5115E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f5115E);
        }
    }

    public final void w(OpGenerator opGenerator, boolean z2) {
        if (!z2) {
            if (this.f5129u == null) {
                if (!this.H) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (M()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f5120a) {
            try {
                if (this.f5129u == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f5120a.add(opGenerator);
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z2) {
        if (this.f5121b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f5129u == null) {
            if (!this.H) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f5129u.Z.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && M()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f5118J == null) {
            this.f5118J = new ArrayList();
            this.K = new ArrayList();
        }
    }

    public final boolean y(boolean z2) {
        boolean zA;
        x(z2);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f5118J;
            ArrayList arrayList2 = this.K;
            synchronized (this.f5120a) {
                if (this.f5120a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f5120a.size();
                        zA = false;
                        for (int i2 = 0; i2 < size; i2++) {
                            zA |= ((OpGenerator) this.f5120a.get(i2)).a(arrayList, arrayList2);
                        }
                        this.f5120a.clear();
                        this.f5129u.Z.removeCallbacks(this.f5119N);
                    } catch (Throwable th) {
                        this.f5120a.clear();
                        this.f5129u.Z.removeCallbacks(this.f5119N);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.f5121b = true;
            try {
                T(this.f5118J, this.K);
                e();
                z3 = true;
            } catch (Throwable th2) {
                e();
                throw th2;
            }
        }
        d0();
        if (this.f5117I) {
            this.f5117I = false;
            for (FragmentStateManager fragmentStateManager : this.f5122c.d()) {
                Fragment fragment = fragmentStateManager.f5150c;
                if (fragment.mDeferStart) {
                    if (this.f5121b) {
                        this.f5117I = true;
                    } else {
                        fragment.mDeferStart = false;
                        fragmentStateManager.k();
                    }
                }
            }
        }
        this.f5122c.f5155b.values().removeAll(Collections.singleton(null));
        return z3;
    }

    public final void z(BackStackRecord backStackRecord, boolean z2) {
        if (z2 && (this.f5129u == null || this.H)) {
            return;
        }
        x(z2);
        backStackRecord.a(this.f5118J, this.K);
        this.f5121b = true;
        try {
            T(this.f5118J, this.K);
            e();
            d0();
            boolean z3 = this.f5117I;
            FragmentStore fragmentStore = this.f5122c;
            if (z3) {
                this.f5117I = false;
                for (FragmentStateManager fragmentStateManager : fragmentStore.d()) {
                    Fragment fragment = fragmentStateManager.f5150c;
                    if (fragment.mDeferStart) {
                        if (this.f5121b) {
                            this.f5117I = true;
                        } else {
                            fragment.mDeferStart = false;
                            fragmentStateManager.k();
                        }
                    }
                }
            }
            fragmentStore.f5155b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            e();
            throw th;
        }
    }
}

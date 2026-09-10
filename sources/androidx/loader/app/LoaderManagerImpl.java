package androidx.loader.app;

import android.os.Looper;
import androidx.collection.SparseArrayCompat;
import androidx.core.util.DebugUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
class LoaderManagerImpl extends LoaderManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoaderViewModel f5301b;

    public static class LoaderInfo<D> extends MutableLiveData<D> implements Loader.OnLoadCompleteListener<D> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Loader f5302l;
        public Object m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public LoaderObserver f5303n;

        public LoaderInfo(Loader loader) {
            this.f5302l = loader;
            loader.registerListener(0, this);
        }

        @Override // androidx.loader.content.Loader.OnLoadCompleteListener
        public final void a(Object obj) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                super.j(obj);
            } else {
                k(obj);
            }
        }

        @Override // androidx.lifecycle.LiveData
        public final void g() {
            this.f5302l.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        public final void h() {
            this.f5302l.stopLoading();
        }

        @Override // androidx.lifecycle.LiveData
        public final void i(Observer observer) {
            super.i(observer);
            this.m = null;
            this.f5303n = null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
        public final void l() {
            ?? r0 = this.m;
            LoaderObserver loaderObserver = this.f5303n;
            if (r0 == 0 || loaderObserver == null) {
                return;
            }
            super.i(loaderObserver);
            e(r0, loaderObserver);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            DebugUtils.a(this.f5302l, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    public static class LoaderObserver<D> implements Observer<D> {
        public final Loader X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final LoaderManager.LoaderCallbacks f5304Y;
        public boolean Z = false;

        public LoaderObserver(Loader loader, LoaderManager.LoaderCallbacks loaderCallbacks) {
            this.X = loader;
            this.f5304Y = loaderCallbacks;
        }

        @Override // androidx.lifecycle.Observer
        public final void a(Object obj) {
            this.f5304Y.onLoadFinished(this.X, obj);
            this.Z = true;
        }

        public final String toString() {
            return this.f5304Y.toString();
        }
    }

    public static class LoaderViewModel extends ViewModel {
        public static final ViewModelProvider.Factory f = new AnonymousClass1();
        public final SparseArrayCompat d = new SparseArrayCompat();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f5305e = false;

        /* JADX INFO: renamed from: androidx.loader.app.LoaderManagerImpl$LoaderViewModel$1, reason: invalid class name */
        public static class AnonymousClass1 implements ViewModelProvider.Factory {
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final ViewModel b(Class cls) {
                return new LoaderViewModel();
            }
        }

        @Override // androidx.lifecycle.ViewModel
        public final void b() {
            SparseArrayCompat sparseArrayCompat = this.d;
            int i2 = sparseArrayCompat.Z;
            for (int i3 = 0; i3 < i2; i3++) {
                LoaderInfo loaderInfo = (LoaderInfo) sparseArrayCompat.f(i3);
                Loader loader = loaderInfo.f5302l;
                loader.cancelLoad();
                loader.abandon();
                LoaderObserver loaderObserver = loaderInfo.f5303n;
                if (loaderObserver != null) {
                    loaderInfo.i(loaderObserver);
                    if (loaderObserver.Z) {
                        loaderObserver.f5304Y.onLoaderReset(loaderObserver.X);
                    }
                }
                loader.unregisterListener(loaderInfo);
                if (loaderObserver != null) {
                    boolean z2 = loaderObserver.Z;
                }
                loader.reset();
            }
            int i4 = sparseArrayCompat.Z;
            Object[] objArr = sparseArrayCompat.f3772Y;
            for (int i5 = 0; i5 < i4; i5++) {
                objArr[i5] = null;
            }
            sparseArrayCompat.Z = 0;
        }
    }

    public LoaderManagerImpl(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.f5300a = lifecycleOwner;
        this.f5301b = (LoaderViewModel) new ViewModelProvider(viewModelStore, LoaderViewModel.f).a(LoaderViewModel.class);
    }

    @Override // androidx.loader.app.LoaderManager
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        SparseArrayCompat sparseArrayCompat = this.f5301b.d;
        if (sparseArrayCompat.Z > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < sparseArrayCompat.Z; i2++) {
                LoaderInfo loaderInfo = (LoaderInfo) sparseArrayCompat.f(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(sparseArrayCompat.X[i2]);
                printWriter.print(": ");
                printWriter.println(loaderInfo.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                Loader loader = loaderInfo.f5302l;
                printWriter.println(loader);
                loader.dump(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (loaderInfo.f5303n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(loaderInfo.f5303n);
                    LoaderObserver loaderObserver = loaderInfo.f5303n;
                    loaderObserver.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(loaderObserver.Z);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                Object obj = loaderInfo.f5248e;
                printWriter.println(loader.dataToString(obj != LiveData.k ? obj : null));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(loaderInfo.f5247c > 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
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
    @Override // androidx.loader.app.LoaderManager
    public final Loader c(LoaderManager.LoaderCallbacks loaderCallbacks) {
        LoaderViewModel loaderViewModel = this.f5301b;
        if (loaderViewModel.f5305e) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        LoaderInfo loaderInfo = (LoaderInfo) loaderViewModel.d.d(0);
        ?? r3 = this.f5300a;
        if (loaderInfo != 0) {
            Loader loader = loaderInfo.f5302l;
            LoaderObserver loaderObserver = new LoaderObserver(loader, loaderCallbacks);
            loaderInfo.e(r3, loaderObserver);
            LoaderObserver loaderObserver2 = loaderInfo.f5303n;
            if (loaderObserver2 != null) {
                loaderInfo.i(loaderObserver2);
            }
            loaderInfo.m = r3;
            loaderInfo.f5303n = loaderObserver;
            return loader;
        }
        try {
            loaderViewModel.f5305e = true;
            Loader loaderOnCreateLoader = loaderCallbacks.onCreateLoader(0, null);
            if (loaderOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (loaderOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(loaderOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + loaderOnCreateLoader);
            }
            LoaderInfo loaderInfo2 = new LoaderInfo(loaderOnCreateLoader);
            loaderViewModel.d.e(0, loaderInfo2);
            loaderViewModel.f5305e = false;
            Loader loader2 = loaderInfo2.f5302l;
            LoaderObserver loaderObserver3 = new LoaderObserver(loader2, loaderCallbacks);
            loaderInfo2.e(r3, loaderObserver3);
            LoaderObserver loaderObserver4 = loaderInfo2.f5303n;
            if (loaderObserver4 != null) {
                loaderInfo2.i(loaderObserver4);
            }
            loaderInfo2.m = r3;
            loaderInfo2.f5303n = loaderObserver3;
            return loader2;
        } catch (Throwable th) {
            loaderViewModel.f5305e = false;
            throw th;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public final void d() {
        SparseArrayCompat sparseArrayCompat = this.f5301b.d;
        int i2 = sparseArrayCompat.Z;
        for (int i3 = 0; i3 < i2; i3++) {
            ((LoaderInfo) sparseArrayCompat.f(i3)).l();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        DebugUtils.a(this.f5300a, sb);
        sb.append("}}");
        return sb.toString();
    }
}

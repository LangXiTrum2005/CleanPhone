package androidx.lifecycle;

import android.app.Application;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/ViewModelProvider;", "", "AndroidViewModelFactory", "Factory", "NewInstanceFactory", "OnRequeryFactory", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ViewModelProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewModelStore f5283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Factory f5284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreationExtras f5285c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class AndroidViewModelFactory extends NewInstanceFactory {
        public static AndroidViewModelFactory d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final CreationExtras.Key f5286e = Companion.ApplicationKeyImpl.f5288a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Application f5287c;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;", "", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "APPLICATION_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "DEFAULT_KEY", "Ljava/lang/String;", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "sInstance", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "ApplicationKeyImpl", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class ApplicationKeyImpl implements CreationExtras.Key<Application> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final ApplicationKeyImpl f5288a = new ApplicationKeyImpl();
            }
        }

        public AndroidViewModelFactory(Application application) {
            this.f5287c = application;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel a(Class cls, MutableCreationExtras mutableCreationExtras) {
            if (this.f5287c != null) {
                return b(cls);
            }
            Application application = (Application) mutableCreationExtras.f5294a.get(Companion.ApplicationKeyImpl.f5288a);
            if (application != null) {
                return c(cls, application);
            }
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.b(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel b(Class cls) {
            Application application = this.f5287c;
            if (application != null) {
                return c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public final ViewModel c(Class cls, Application application) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return super.b(cls);
            }
            try {
                ViewModel viewModel = (ViewModel) cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.e(viewModel, "{\n                try {\n…          }\n            }");
                return viewModel;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(androidx.datastore.preferences.protobuf.a.j(cls, "Cannot create an instance of "), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(androidx.datastore.preferences.protobuf.a.j(cls, "Cannot create an instance of "), e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(androidx.datastore.preferences.protobuf.a.j(cls, "Cannot create an instance of "), e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException(androidx.datastore.preferences.protobuf.a.j(cls, "Cannot create an instance of "), e5);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory$Companion;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }

        default ViewModel a(Class cls, MutableCreationExtras mutableCreationExtras) {
            return b(cls);
        }

        default ViewModel b(Class cls) {
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class NewInstanceFactory implements Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static NewInstanceFactory f5289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CreationExtras.Key f5290b = null;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion;", "", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "sInstance", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "ViewModelKeyImpl", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class ViewModelKeyImpl implements CreationExtras.Key<String> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final ViewModelKeyImpl f5291a = new ViewModelKeyImpl();
            }
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel b(Class cls) throws InvocationTargetException {
            try {
                Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                Intrinsics.e(objNewInstance, "{\n                modelC…wInstance()\n            }");
                return (ViewModel) objNewInstance;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(androidx.datastore.preferences.protobuf.a.j(cls, "Cannot create an instance of "), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(androidx.datastore.preferences.protobuf.a.j(cls, "Cannot create an instance of "), e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(androidx.datastore.preferences.protobuf.a.j(cls, "Cannot create an instance of "), e4);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class OnRequeryFactory {
        public void c(ViewModel viewModel) {
        }
    }

    public ViewModelProvider(ViewModelStore store, Factory factory, CreationExtras defaultCreationExtras) {
        Intrinsics.f(store, "store");
        Intrinsics.f(factory, "factory");
        Intrinsics.f(defaultCreationExtras, "defaultCreationExtras");
        this.f5283a = store;
        this.f5284b = factory;
        this.f5285c = defaultCreationExtras;
    }

    public final ViewModel a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final ViewModel b(Class cls, String key) {
        ViewModel viewModel;
        Intrinsics.f(key, "key");
        ViewModelStore viewModelStore = this.f5283a;
        viewModelStore.getClass();
        LinkedHashMap linkedHashMap = viewModelStore.f5292a;
        ViewModel viewModel2 = (ViewModel) linkedHashMap.get(key);
        boolean zIsInstance = cls.isInstance(viewModel2);
        Factory factory = this.f5284b;
        if (zIsInstance) {
            OnRequeryFactory onRequeryFactory = factory instanceof OnRequeryFactory ? (OnRequeryFactory) factory : null;
            if (onRequeryFactory != null) {
                Intrinsics.c(viewModel2);
                onRequeryFactory.c(viewModel2);
            }
            Intrinsics.d(viewModel2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return viewModel2;
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.f5285c);
        NewInstanceFactory newInstanceFactory = NewInstanceFactory.f5289a;
        mutableCreationExtras.f5294a.put(NewInstanceFactory.Companion.ViewModelKeyImpl.f5291a, key);
        try {
            viewModel = factory.a(cls, mutableCreationExtras);
        } catch (AbstractMethodError unused) {
            viewModel = factory.b(cls);
        }
        Intrinsics.f(viewModel, "viewModel");
        ViewModel viewModel3 = (ViewModel) linkedHashMap.put(key, viewModel);
        if (viewModel3 != null) {
            viewModel3.b();
        }
        return viewModel;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore store, Factory factory) {
        this(store, factory, CreationExtras.Empty.f5295b);
        Intrinsics.f(store, "store");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner, Factory factory) {
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.f(factory, "factory");
        ViewModelStore viewModelStore = viewModelStoreOwner.getViewModelStore();
        if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.f5295b;
        }
        this(viewModelStore, factory, defaultViewModelCreationExtras);
    }
}

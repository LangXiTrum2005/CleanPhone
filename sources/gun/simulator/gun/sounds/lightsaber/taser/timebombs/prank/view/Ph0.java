package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class Ph0 {
    static {
        ViewModelProvider.Factory.Companion companion = ViewModelProvider.Factory.Companion;
    }

    public static ViewModel a(ViewModelProvider.Factory factory, Class cls) {
        AbstractC2995aW.q(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static ViewModel b(ViewModelProvider.Factory factory, Class cls, CreationExtras creationExtras) {
        AbstractC2995aW.q(cls, "modelClass");
        AbstractC2995aW.q(creationExtras, "extras");
        return factory.create(cls);
    }

    public static ViewModelProvider.Factory c(ViewModelInitializer... viewModelInitializerArr) {
        return ViewModelProvider.Factory.Companion.from(viewModelInitializerArr);
    }
}

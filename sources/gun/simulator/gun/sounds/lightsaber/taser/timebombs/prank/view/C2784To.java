package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.To, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2784To implements ModelLoaderFactory, InterfaceC2836Vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3795a;
    public final Context b;

    public /* synthetic */ C2784To(Context context, int i) {
        this.f3795a = i;
        this.b = context;
    }

    public static void d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (IllegalAccessException e) {
                e(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                e(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                e(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                e(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void e(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2836Vo
    public final Class a() {
        return Drawable.class;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2836Vo
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2836Vo
    public final Object c(Resources resources, int i, Resources.Theme theme) {
        Context context = this.b;
        return BF.k(context, context, i, theme);
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public final FP z(C3166cQ c3166cQ) {
        int i = this.f3795a;
        Context context = this.b;
        switch (i) {
            case 0:
                return new C2862Wo(context, this);
            case 1:
                return new QO(context, 0);
            case 2:
                return new C2862Wo(context, c3166cQ.c(Integer.class, AssetFileDescriptor.class));
            default:
                return new QO(context, 2);
        }
    }
}

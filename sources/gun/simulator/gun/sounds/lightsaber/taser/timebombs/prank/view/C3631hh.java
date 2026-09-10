package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3631hh implements AW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4463a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C3631hh(Object obj, int i) {
        this.f4463a = i;
        this.b = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AW
    public final Object get() {
        int i = this.f4463a;
        Object obj = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new C3419fE("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e) {
                    throw new C3419fE(DM.B("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new C3419fE(DM.B("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new C3419fE(AbstractC3888ke0.i("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new C3419fE(AbstractC3888ke0.i("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                Object obj2 = C4617su.m;
                return new C3329eC((C4266ou) obj);
        }
    }
}

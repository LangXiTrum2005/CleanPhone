package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3263dY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3351eY f4274a;

    static {
        C3351eY c3351eY = null;
        try {
            c3351eY = (C3351eY) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c3351eY == null) {
            c3351eY = new C3351eY();
        }
        f4274a = c3351eY;
    }

    public static C3186cf a(Class cls) {
        f4274a.getClass();
        return new C3186cf(cls);
    }

    public static Be0 b(Be0 be0) {
        f4274a.getClass();
        int i = be0.d | 2;
        return new Be0(be0.f2882a, be0.b, be0.c, i);
    }

    public static Be0 c(C4387qG c4387qG, C4387qG c4387qG2) {
        C3186cf c3186cfA = a(Map.class);
        List listAsList = Arrays.asList(c4387qG, c4387qG2);
        f4274a.getClass();
        return C3351eY.b(c3186cfA, listAsList);
    }

    public static Be0 d(Class cls) {
        C3186cf c3186cfA = a(cls);
        List listEmptyList = Collections.emptyList();
        f4274a.getClass();
        return C3351eY.b(c3186cfA, listEmptyList);
    }
}

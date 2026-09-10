package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4121nE implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4121nE f4735a;
    public static final /* synthetic */ EnumC4121nE[] b;

    static {
        EnumC4121nE enumC4121nE = new EnumC4121nE("INSTANCE", 0);
        f4735a = enumC4121nE;
        b = new EnumC4121nE[]{enumC4121nE};
    }

    public static EnumC4121nE valueOf(String str) {
        return (EnumC4121nE) Enum.valueOf(EnumC4121nE.class, str);
    }

    public static EnumC4121nE[] values() {
        return (EnumC4121nE[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}

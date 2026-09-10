package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4460r6 implements InterfaceC3551gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4915a;
    public Object b;
    public final Comparable c;
    public final Object d;

    public /* synthetic */ AbstractC4460r6(Object obj, Comparable comparable, int i) {
        this.f4915a = i;
        this.d = obj;
        this.c = comparable;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void b() {
        switch (this.f4915a) {
            case 0:
                Object obj = this.b;
                if (obj != null) {
                    try {
                        d(obj);
                    } catch (IOException unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                Object obj2 = this.b;
                if (obj2 != null) {
                    try {
                        d(obj2);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void c(IV iv, InterfaceC3463fl interfaceC3463fl) {
        int i = this.f4915a;
        Object obj = this.d;
        Comparable comparable = this.c;
        switch (i) {
            case 0:
                try {
                    Closeable closeableF = f((AssetManager) obj, (String) comparable);
                    this.b = closeableF;
                    interfaceC3463fl.k(closeableF);
                } catch (IOException e) {
                    interfaceC3463fl.d(e);
                }
                break;
            default:
                try {
                    Object objG = g((ContentResolver) obj, (Uri) comparable);
                    this.b = objG;
                    interfaceC3463fl.k(objG);
                } catch (FileNotFoundException e2) {
                    interfaceC3463fl.d(e2);
                    return;
                }
                break;
        }
    }

    public abstract void d(Object obj);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final EnumC4516rl e() {
        return EnumC4516rl.f4942a;
    }

    public abstract Closeable f(AssetManager assetManager, String str);

    public abstract Object g(ContentResolver contentResolver, Uri uri);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void cancel() {
    }
}

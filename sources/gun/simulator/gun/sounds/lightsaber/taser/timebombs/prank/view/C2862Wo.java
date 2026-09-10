package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2862Wo implements FP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3941a = 2;
    public final Object b;
    public final Object c;

    public C2862Wo(Resources resources, FP fp) {
        this.c = resources;
        this.b = fp;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final boolean a(Object obj) {
        switch (this.f3941a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                Uri uri = (Uri) obj;
                return "android.resource".equals(uri.getScheme()) && ((Context) this.b).getPackageName().equals(uri.getAuthority());
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final EP b(Object obj, int i, int i2, YS ys) {
        switch (this.f3941a) {
            case 0:
                return c((Integer) obj, i, i2, ys);
            case 1:
                return c((Integer) obj, i, i2, ys);
            default:
                Uri uri = (Uri) obj;
                List<String> pathSegments = uri.getPathSegments();
                int size = pathSegments.size();
                Object obj2 = this.c;
                EP epB = null;
                if (size == 1) {
                    try {
                        int i3 = Integer.parseInt(uri.getPathSegments().get(0));
                        if (i3 != 0) {
                            epB = ((FP) obj2).b(Integer.valueOf(i3), i, i2, ys);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            uri.toString();
                        }
                        return epB;
                    } catch (NumberFormatException unused) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return epB;
                        }
                        Objects.toString(uri);
                        return epB;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    uri.toString();
                    return null;
                }
                List<String> pathSegments2 = uri.getPathSegments();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.b;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return ((FP) obj2).b(Integer.valueOf(identifier), i, i2, ys);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                uri.toString();
                return null;
        }
    }

    public final EP c(Integer num, int i, int i2, YS ys) {
        Uri uri;
        int i3 = this.f3941a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                Resources.Theme theme = (Resources.Theme) ys.c(C4142nZ.b);
                return new EP(new C3697iS(num), new C2810Uo(theme, theme != null ? theme.getResources() : ((Context) obj).getResources(), (InterfaceC2836Vo) obj2, num.intValue()));
            default:
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) obj2).getResourcePackageName(num.intValue()) + '/' + ((Resources) obj2).getResourceTypeName(num.intValue()) + '/' + ((Resources) obj2).getResourceEntryName(num.intValue()));
                    break;
                } catch (Resources.NotFoundException unused) {
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((FP) obj).b(uri, i, i2, ys);
        }
    }

    public C2862Wo(Context context, InterfaceC2836Vo interfaceC2836Vo) {
        this.b = context.getApplicationContext();
        this.c = interfaceC2836Vo;
    }

    public C2862Wo(Context context, FP fp) {
        this.b = context.getApplicationContext();
        this.c = fp;
    }
}

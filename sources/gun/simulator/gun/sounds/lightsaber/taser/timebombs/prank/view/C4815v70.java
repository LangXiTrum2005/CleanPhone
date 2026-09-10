package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.TreeMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.v70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4815v70 implements InterfaceC4742uK {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F4 f5120a = new F4(2);
    public final C3692iN b = new C3692iN(8);
    public final HashMap c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String d(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4742uK
    public final void a(Bitmap bitmap) {
        int iC = Tg0.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        F4 f4 = this.f5120a;
        InterfaceC4226oV interfaceC4226oVI = (InterfaceC4226oV) ((Queue) f4.b).poll();
        if (interfaceC4226oVI == null) {
            interfaceC4226oVI = f4.i();
        }
        C4727u70 c4727u70 = (C4727u70) interfaceC4226oVI;
        c4727u70.b = iC;
        c4727u70.c = config;
        this.b.J(c4727u70, bitmap);
        NavigableMap navigableMapE = e(bitmap.getConfig());
        Integer num = (Integer) navigableMapE.get(Integer.valueOf(c4727u70.b));
        navigableMapE.put(Integer.valueOf(c4727u70.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4742uK
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = Tg0.d(config) * i * i2;
        F4 f4 = this.f5120a;
        InterfaceC4226oV interfaceC4226oVI = (InterfaceC4226oV) ((Queue) f4.b).poll();
        if (interfaceC4226oVI == null) {
            interfaceC4226oVI = f4.i();
        }
        C4727u70 c4727u70 = (C4727u70) interfaceC4226oVI;
        c4727u70.b = iD;
        c4727u70.c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i3 = AbstractC4639t70.f5018a[config.ordinal()];
            if (i3 == 1) {
                configArr = d;
            } else if (i3 == 2) {
                configArr = f;
            } else if (i3 != 3) {
                configArr = i3 != 4 ? new Bitmap.Config[]{config} : h;
            } else {
                configArr = g;
            }
        } else {
            configArr = e;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) e(config2).ceilingKey(Integer.valueOf(iD));
            if (num != null && num.intValue() <= iD * 8) {
                if (num.intValue() == iD && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                f4.h(c4727u70);
                int iIntValue = num.intValue();
                InterfaceC4226oV interfaceC4226oVI2 = (InterfaceC4226oV) ((Queue) f4.b).poll();
                if (interfaceC4226oVI2 == null) {
                    interfaceC4226oVI2 = f4.i();
                }
                c4727u70 = (C4727u70) interfaceC4226oVI2;
                c4727u70.b = iIntValue;
                c4727u70.c = config2;
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.b.y(c4727u70);
        if (bitmap != null) {
            c(Integer.valueOf(c4727u70.b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final void c(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapE = e(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapE.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapE.remove(num);
                return;
            } else {
                navigableMapE.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + d(Tg0.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final NavigableMap e(Bitmap.Config config) {
        HashMap map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4742uK
    public final String h(Bitmap bitmap) {
        return d(Tg0.c(bitmap), bitmap.getConfig());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4742uK
    public final String i(int i, int i2, Bitmap.Config config) {
        return d(Tg0.d(config) * i * i2, config);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4742uK
    public final int l(Bitmap bitmap) {
        return Tg0.c(bitmap);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4742uK
    public final Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.b.M();
        if (bitmap != null) {
            c(Integer.valueOf(Tg0.c(bitmap)), bitmap);
        }
        return bitmap;
    }

    public final String toString() {
        StringBuilder sbO = DM.o("SizeConfigStrategy{groupedMap=");
        sbO.append(this.b);
        sbO.append(", sortedSizes=(");
        HashMap map = this.c;
        for (Map.Entry entry : map.entrySet()) {
            sbO.append(entry.getKey());
            sbO.append('[');
            sbO.append(entry.getValue());
            sbO.append("], ");
        }
        if (!map.isEmpty()) {
            sbO.replace(sbO.length() - 2, sbO.length(), "");
        }
        sbO.append(")}");
        return sbO.toString();
    }
}
